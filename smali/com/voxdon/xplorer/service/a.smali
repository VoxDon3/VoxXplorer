.class public Lcom/voxdon/xplorer/service/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DefaultLocale",
        "SimpleDateFormat"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/service/a$a;
    }
.end annotation


# static fields
.field private static final E:Ljava/util/logging/Logger;

.field private static final F:[Ljava/lang/String;

.field private static final G:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljavax/net/ssl/SSLContext;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:J

.field private B:Z

.field private C:Z

.field private D:Ljavax/net/ssl/SSLContext;

.field private a:Landroid/content/Context;

.field private b:Ljava/net/Socket;

.field private c:Ljava/io/BufferedOutputStream;

.field private d:Lcom/voxdon/xplorer/file/n;

.field private e:Lcom/voxdon/xplorer/file/n;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Ljava/net/ServerSocket;

.field private i:Ljava/net/InetAddress;

.field private j:I

.field private k:Z

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/voxdon/xplorer/file/n;

.field private q:Ljava/text/SimpleDateFormat;

.field private r:Ljava/text/SimpleDateFormat;

.field private s:Ljava/text/SimpleDateFormat;

.field private t:Ljava/text/SimpleDateFormat;

.field private u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lax/c3/K;",
            "Lcom/voxdon/xplorer/file/o;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lax/c3/K;",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/c3/K;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lax/c3/K;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .registers 28

    .line 1
    const-class v0, Lcom/voxdon/xplorer/service/a;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/service/a;->E:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const-string v26, "PBSZ"

    .line 10
    .line 11
    const-string v27, "PROT"

    .line 12
    .line 13
    const-string v1, "CWD"

    .line 14
    .line 15
    const-string v2, "CDUP"

    .line 16
    .line 17
    const-string v3, "SMNT"

    .line 18
    .line 19
    const-string v4, "PORT"

    .line 20
    .line 21
    const-string v5, "PASV"

    .line 22
    .line 23
    const-string v6, "MODE"

    .line 24
    .line 25
    const-string v7, "TYPE"

    .line 26
    .line 27
    const-string v8, "STRU"

    .line 28
    .line 29
    const-string v9, "ALL0"

    .line 30
    .line 31
    const-string v10, "REST"

    .line 32
    .line 33
    const-string v11, "STOR"

    .line 34
    .line 35
    const-string v12, "STOU"

    .line 36
    .line 37
    const-string v13, "RETR"

    .line 38
    .line 39
    const-string v14, "LIST"

    .line 40
    .line 41
    const-string v15, "NLST"

    .line 42
    .line 43
    const-string v16, "APPE"

    .line 44
    .line 45
    const-string v17, "RNFR"

    .line 46
    .line 47
    const-string v18, "RNT0"

    .line 48
    .line 49
    const-string v19, "DELE"

    .line 50
    .line 51
    const-string v20, "RMD"

    .line 52
    .line 53
    const-string v21, "MKD"

    .line 54
    .line 55
    const-string v22, "STAT"

    .line 56
    .line 57
    const-string v23, "SITE"

    .line 58
    .line 59
    const-string v24, "MLST"

    .line 60
    .line 61
    const-string v25, "MLST"

    .line 62
    .line 63
    filled-new-array/range {v1 .. v27}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lcom/voxdon/xplorer/service/a;->F:[Ljava/lang/String;

    .line 68
    .line 69
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/voxdon/xplorer/service/a;->G:Ljava/util/Map;

    .line 75
    .line 76
    return-void
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

.method public constructor <init>(Landroid/content/Context;Ljava/net/Socket;Ljava/io/BufferedOutputStream;ZLjava/lang/String;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/a;->g:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->o:Ljava/util/HashSet;

    .line 13
    .line 14
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 15
    .line 16
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 17
    .line 18
    const-string v2, " MMM dd HH:mm "

    .line 19
    .line 20
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->q:Ljava/text/SimpleDateFormat;

    .line 24
    .line 25
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 26
    .line 27
    const-string v2, " MMM dd  yyyy "

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->r:Ljava/text/SimpleDateFormat;

    .line 33
    .line 34
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 35
    .line 36
    const-string v2, "yyyyMMddHHmmss.SSS"

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->s:Ljava/text/SimpleDateFormat;

    .line 42
    .line 43
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->u:Ljava/util/Map;

    .line 49
    .line 50
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->v:Ljava/util/Map;

    .line 56
    .line 57
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->w:Ljava/util/List;

    .line 63
    .line 64
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->x:Ljava/util/Map;

    .line 70
    .line 71
    iput-object p1, p0, Lcom/voxdon/xplorer/service/a;->a:Landroid/content/Context;

    .line 72
    .line 73
    iput-object p2, p0, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    .line 74
    .line 75
    iput-boolean p4, p0, Lcom/voxdon/xplorer/service/a;->z:Z

    .line 76
    .line 77
    iput-object p3, p0, Lcom/voxdon/xplorer/service/a;->c:Ljava/io/BufferedOutputStream;

    .line 78
    .line 79
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->s:Ljava/text/SimpleDateFormat;

    .line 80
    .line 81
    const-string p2, "GMT"

    .line 82
    .line 83
    invoke-static {p2}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 88
    .line 89
    .line 90
    iput-object p5, p0, Lcom/voxdon/xplorer/service/a;->m:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_64

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    iput-boolean p1, p0, Lcom/voxdon/xplorer/service/a;->k:Z

    .line 100
    .line 101
    :cond_64
    return-void
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

.method private static A(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    const-string p0, "127.0.0.1"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_9
    const/16 v0, 0x25

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ltz v0, :cond_16

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_16
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

.method private B()Ljava/net/Socket;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->h:Ljava/net/ServerSocket;

    .line 2
    .line 3
    if-nez v0, :cond_1f

    .line 4
    .line 5
    :try_start_4
    new-instance v0, Ljava/net/Socket;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/service/a;->i:Ljava/net/InetAddress;

    .line 8
    .line 9
    iget v2, p0, Lcom/voxdon/xplorer/service/a;->j:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x7530

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/service/a;->E(Ljava/net/Socket;)Ljava/net/Socket;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_16} :catch_17

    .line 23
    return-object v0

    .line 24
    :catch_17
    move-exception v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->d()V

    .line 29
    .line 30
    .line 31
    goto :goto_2f

    .line 32
    :cond_1f
    :try_start_1f
    invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->d()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/service/a;->E(Ljava/net/Socket;)Ljava/net/Socket;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_2a} :catch_2b

    .line 43
    return-object v0

    .line 44
    :catch_2b
    move-exception v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    :goto_2f
    const/4 v0, 0x0

    .line 49
    return-object v0
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

.method private D(Ljava/lang/String;Lcom/voxdon/xplorer/service/a$a;)V
    .registers 7

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "TLS"

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1c

    .line 14
    .line 15
    const-string v0, "SSL"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1c

    .line 22
    .line 23
    const-string p1, "504 Unsupported AUTH type\r\n"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iget-boolean p1, p0, Lcom/voxdon/xplorer/service/a;->B:Z

    .line 30
    .line 31
    if-eqz p1, :cond_26

    .line 32
    .line 33
    const-string p1, "503 Control connection is already protected\r\n"

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->a:Landroid/content/Context;

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->r()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/service/a;->s(Landroid/content/Context;Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/voxdon/xplorer/service/a;->D:Ljavax/net/ssl/SSLContext;

    .line 50
    .line 51
    if-nez p1, :cond_3a

    .line 52
    .line 53
    const-string p1, "431 TLS is not available\r\n"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    const-string p1, "234 AUTH TLS OK\r\n"

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :try_start_3f
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->D:Ljavax/net/ssl/SSLContext;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, p0, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/net/Socket;->getPort()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v0, v1, v2, v3}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 92
    .line 93
    invoke-virtual {p1, v3}, Ljavax/net/ssl/SSLSocket;->setUseClientMode(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v3}, Ljavax/net/ssl/SSLSocket;->setNeedClientAuth(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    .line 103
    .line 104
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {v0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->c:Ljava/io/BufferedOutputStream;

    .line 114
    .line 115
    const/4 p1, 0x1

    .line 116
    iput-boolean p1, p0, Lcom/voxdon/xplorer/service/a;->B:Z

    .line 117
    .line 118
    iput-boolean p1, p2, Lcom/voxdon/xplorer/service/a$a;->c:Z
    :try_end_77
    .catch Ljava/io/IOException; {:try_start_3f .. :try_end_77} :catch_78

    .line 119
    .line 120
    return-void

    .line 121
    :catch_78
    move-exception p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 123
    .line 124
    .line 125
    return-void
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

.method private E(Ljava/net/Socket;)Ljava/net/Socket;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/a;->C:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_5
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->D:Ljavax/net/ssl/SSLContext;

    .line 7
    .line 8
    if-nez v0, :cond_e

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_e
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Ljava/net/Socket;->getPort()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v0, p1, v1, v2, v3}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Ljavax/net/ssl/SSLSocket;->setUseClientMode(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v3}, Ljavax/net/ssl/SSLSocket;->setNeedClientAuth(Z)V

    .line 42
    .line 43
    .line 44
    return-object p1
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

.method private F(Lcom/voxdon/xplorer/file/n;ZJ)V
    .registers 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->B()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_11

    .line 8
    .line 9
    const-string p1, "425 Error opening data socket\r\n"

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    const-string v5, "451 File IO error\r\n"

    .line 21
    .line 22
    cmp-long v6, p3, v3

    .line 23
    .line 24
    if-lez v6, :cond_25

    .line 25
    .line 26
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    cmp-long v7, v3, p3

    .line 31
    .line 32
    if-gez v7, :cond_25

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 39
    .line 40
    iget-boolean v4, p0, Lcom/voxdon/xplorer/service/a;->g:Z

    .line 41
    .line 42
    if-eqz v4, :cond_2e

    .line 43
    .line 44
    const-string v4, "BINARY"

    .line 45
    .line 46
    goto :goto_30

    .line 47
    :cond_2e
    const-string v4, "ASCII"

    .line 48
    .line 49
    :goto_30
    new-array v7, v1, [Ljava/lang/Object;

    .line 50
    .line 51
    aput-object v4, v7, v0

    .line 52
    .line 53
    const-string v4, "150 Opening %s mode data connection for writing\r\n"

    .line 54
    .line 55
    invoke-static {v3, v4, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {p0, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/service/a;->N(Ljava/net/Socket;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_4c

    .line 67
    .line 68
    const-string p1, "426 Data socket or network error\r\n"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    const/4 v3, 0x0

    .line 78
    :try_start_4d
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Lcom/voxdon/xplorer/file/e;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 89
    .line 90
    .line 91
    move-result-object v2
    :try_end_5b
    .catch Ljava/io/FileNotFoundException; {:try_start_4d .. :try_end_5b} :catch_bd
    .catch Ljava/io/IOException; {:try_start_4d .. :try_end_5b} :catch_ba
    .catchall {:try_start_4d .. :try_end_5b} :catchall_b7

    .line 92
    if-lez v6, :cond_7b

    .line 93
    .line 94
    :try_start_5d
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {v4, p2, p3, p4}, Lcom/voxdon/xplorer/file/e;->l0(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {v4, p1, v1}, Lax/c3/X;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_6c
    move-object v3, p1

    .line 110
    goto :goto_84

    .line 111
    :catchall_6e
    move-exception p1

    .line 112
    move-object p2, v3

    .line 113
    move-object v3, v2

    .line 114
    goto/16 :goto_ea

    .line 115
    .line 116
    :catch_73
    move-exception p1

    .line 117
    move-object p2, v3

    .line 118
    move-object v3, v2

    .line 119
    goto :goto_bf

    .line 120
    :catch_77
    move-object p1, v3

    .line 121
    move-object v3, v2

    .line 122
    goto/16 :goto_d4

    .line 123
    .line 124
    :cond_7b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {v4, p1, p2}, Lax/c3/X;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    goto :goto_6c

    .line 133
    :goto_84
    if-eqz v3, :cond_a5

    .line 134
    .line 135
    const/high16 p1, 0x10000

    .line 136
    .line 137
    new-array p1, p1, [B

    .line 138
    .line 139
    :catch_8a
    :goto_8a
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    .line 140
    .line 141
    .line 142
    move-result p2
    :try_end_8e
    .catch Ljava/io/FileNotFoundException; {:try_start_5d .. :try_end_8e} :catch_77
    .catch Ljava/io/IOException; {:try_start_5d .. :try_end_8e} :catch_73
    .catchall {:try_start_5d .. :try_end_8e} :catchall_6e

    .line 143
    if-ltz p2, :cond_9c

    .line 144
    .line 145
    if-nez p2, :cond_98

    .line 146
    .line 147
    const-wide/16 p2, 0x5

    .line 148
    .line 149
    :try_start_94
    invoke-static {p2, p3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_97
    .catch Ljava/lang/InterruptedException; {:try_start_94 .. :try_end_97} :catch_8a
    .catch Ljava/io/FileNotFoundException; {:try_start_94 .. :try_end_97} :catch_77
    .catch Ljava/io/IOException; {:try_start_94 .. :try_end_97} :catch_73
    .catchall {:try_start_94 .. :try_end_97} :catchall_6e

    .line 150
    .line 151
    .line 152
    goto :goto_8a

    .line 153
    :cond_98
    :try_start_98
    invoke-virtual {v3, p1, v0, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 154
    .line 155
    .line 156
    goto :goto_8a

    .line 157
    :cond_9c
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 158
    .line 159
    .line 160
    const-string p1, "226 Data transmission for writing succeeded\r\n"

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_aa

    .line 166
    :cond_a5
    const-string p1, "451 Permission denied\r\n"

    .line 167
    .line 168
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_aa
    .catch Ljava/io/FileNotFoundException; {:try_start_98 .. :try_end_aa} :catch_77
    .catch Ljava/io/IOException; {:try_start_98 .. :try_end_aa} :catch_73
    .catchall {:try_start_98 .. :try_end_aa} :catchall_6e

    .line 169
    .line 170
    .line 171
    :goto_aa
    if-eqz v2, :cond_b1

    .line 172
    .line 173
    :try_start_ac
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_af
    .catch Ljava/io/IOException; {:try_start_ac .. :try_end_af} :catch_b0

    .line 174
    .line 175
    .line 176
    goto :goto_b1

    .line 177
    :catch_b0
    nop

    .line 178
    :cond_b1
    :goto_b1
    if-eqz v3, :cond_e5

    .line 179
    .line 180
    :try_start_b3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_b6
    .catch Ljava/io/IOException; {:try_start_b3 .. :try_end_b6} :catch_e5

    .line 181
    .line 182
    .line 183
    goto :goto_e5

    .line 184
    :catchall_b7
    move-exception p1

    .line 185
    move-object p2, v3

    .line 186
    goto :goto_ea

    .line 187
    :catch_ba
    move-exception p1

    .line 188
    move-object p2, v3

    .line 189
    goto :goto_bf

    .line 190
    :catch_bd
    move-object p1, v3

    .line 191
    goto :goto_d4

    .line 192
    :goto_bf
    :try_start_bf
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_c5
    .catchall {:try_start_bf .. :try_end_c5} :catchall_d2

    .line 196
    .line 197
    .line 198
    if-eqz v3, :cond_cc

    .line 199
    .line 200
    :try_start_c7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_ca
    .catch Ljava/io/IOException; {:try_start_c7 .. :try_end_ca} :catch_cb

    .line 201
    .line 202
    .line 203
    goto :goto_cc

    .line 204
    :catch_cb
    nop

    .line 205
    :cond_cc
    :goto_cc
    if-eqz p2, :cond_e5

    .line 206
    .line 207
    :try_start_ce
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_d1
    .catch Ljava/io/IOException; {:try_start_ce .. :try_end_d1} :catch_e5

    .line 208
    .line 209
    .line 210
    goto :goto_e5

    .line 211
    :catchall_d2
    move-exception p1

    .line 212
    goto :goto_ea

    .line 213
    :goto_d4
    :try_start_d4
    const-string p2, "550 No such file or directory.\r\n"

    .line 214
    .line 215
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_d9
    .catchall {:try_start_d4 .. :try_end_d9} :catchall_e6

    .line 216
    .line 217
    .line 218
    if-eqz v3, :cond_e0

    .line 219
    .line 220
    :try_start_db
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_de
    .catch Ljava/io/IOException; {:try_start_db .. :try_end_de} :catch_df

    .line 221
    .line 222
    .line 223
    goto :goto_e0

    .line 224
    :catch_df
    nop

    .line 225
    :cond_e0
    :goto_e0
    if-eqz p1, :cond_e5

    .line 226
    .line 227
    :try_start_e2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_e5
    .catch Ljava/io/IOException; {:try_start_e2 .. :try_end_e5} :catch_e5

    .line 228
    .line 229
    .line 230
    :catch_e5
    :cond_e5
    :goto_e5
    return-void

    .line 231
    :catchall_e6
    move-exception p2

    .line 232
    move-object v8, p2

    .line 233
    move-object p2, p1

    .line 234
    move-object p1, v8

    .line 235
    :goto_ea
    if-eqz v3, :cond_f1

    .line 236
    .line 237
    :try_start_ec
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_ef
    .catch Ljava/io/IOException; {:try_start_ec .. :try_end_ef} :catch_f0

    .line 238
    .line 239
    .line 240
    goto :goto_f1

    .line 241
    :catch_f0
    nop

    .line 242
    :cond_f1
    :goto_f1
    if-eqz p2, :cond_f6

    .line 243
    .line 244
    :try_start_f3
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_f6
    .catch Ljava/io/IOException; {:try_start_f3 .. :try_end_f6} :catch_f6

    .line 245
    .line 246
    .line 247
    :catch_f6
    :cond_f6
    throw p1
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

.method private static G(Landroid/content/Context;Ljava/lang/String;Ljava/security/KeyStore;)V
    .registers 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "filemanager"

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p2, v0, v1}, Ljava/security/KeyStore;->store(Ljava/io/OutputStream;[C)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {p2, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p0, p1, p2}, Lax/o3/h;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_1b
    move-exception p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method private H(Ljava/net/Socket;[B)Z
    .registers 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v1, v0}, Lcom/voxdon/xplorer/service/a;->I(Ljava/net/Socket;[BII)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method private I(Ljava/net/Socket;[BII)Z
    .registers 5

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2, p3, p4}, Ljava/io/OutputStream;->write([BII)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_7} :catch_9

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :catch_9
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1
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

.method private J(Lcom/voxdon/xplorer/file/n;J)V
    .registers 8

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->B()Ljava/net/Socket;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_13

    .line 10
    .line 11
    const-string p1, "425 Error opening data socket\r\n"

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    const-string v2, "150 Sending file\r\n"

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/service/a;->N(Ljava/net/Socket;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "426 Data socket or network error\r\n"

    .line 30
    .line 31
    if-nez v2, :cond_27

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    const/4 v2, 0x0

    .line 41
    :try_start_28
    invoke-virtual {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/high16 p1, 0x10000

    .line 46
    .line 47
    new-array p1, p1, [B

    .line 48
    .line 49
    :cond_30
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-ltz p2, :cond_43

    .line 54
    .line 55
    const/4 p3, 0x0

    .line 56
    invoke-direct {p0, v1, p1, p3, p2}, Lcom/voxdon/xplorer/service/a;->I(Ljava/net/Socket;[BII)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_30

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_48

    .line 66
    :catchall_41
    move-exception p1

    .line 67
    goto :goto_5e

    .line 68
    :cond_43
    const-string p1, "226 File transmission succeeded\r\n"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_48
    .catch Ljava/io/FileNotFoundException; {:try_start_28 .. :try_end_48} :catch_52
    .catch Lax/b3/j; {:try_start_28 .. :try_end_48} :catch_52
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_48} :catch_4c
    .catchall {:try_start_28 .. :try_end_48} :catchall_41

    .line 71
    .line 72
    .line 73
    :goto_48
    :try_start_48
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4b
    .catch Ljava/io/IOException; {:try_start_48 .. :try_end_4b} :catch_5a

    .line 74
    .line 75
    .line 76
    goto :goto_5a

    .line 77
    :catch_4c
    :try_start_4c
    invoke-virtual {p0, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    if-eqz v2, :cond_5a

    .line 81
    .line 82
    goto :goto_48

    .line 83
    :catch_52
    const-string p1, "550 Operation on invalid file\r\n"

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_57
    .catchall {:try_start_4c .. :try_end_57} :catchall_41

    .line 86
    .line 87
    .line 88
    if-eqz v2, :cond_5a

    .line 89
    .line 90
    goto :goto_48

    .line 91
    :catch_5a
    :cond_5a
    :goto_5a
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :goto_5e
    if-eqz v2, :cond_63

    .line 96
    .line 97
    :try_start_60
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_63
    .catch Ljava/io/IOException; {:try_start_60 .. :try_end_63} :catch_63

    .line 98
    .line 99
    .line 100
    :catch_63
    :cond_63
    throw p1
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

.method private K(Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->B()Ljava/net/Socket;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    const-string p1, "425 Error opening data socket\r\n"

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 17
    .line 18
    iget-boolean v2, p0, Lcom/voxdon/xplorer/service/a;->g:Z

    .line 19
    .line 20
    if-eqz v2, :cond_18

    .line 21
    .line 22
    const-string v2, "BINARY"

    .line 23
    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    const-string v2, "ASCII"

    .line 26
    .line 27
    :goto_1a
    const/4 v3, 0x2

    .line 28
    new-array v3, v3, [Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v2, v3, v4

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    aput-object p1, v3, v2

    .line 35
    .line 36
    const-string p1, "150 Opening %s mode data connection for %s\r\n"

    .line 37
    .line 38
    invoke-static {v1, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/service/a;->N(Ljava/net/Socket;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const-string v1, "426 Data socket or network error\r\n"

    .line 50
    .line 51
    if-nez p1, :cond_3b

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/service/a;->H(Ljava/net/Socket;[B)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4b

    .line 69
    .line 70
    const-string p1, "226 Data transmission succeeded\r\n"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_4e

    .line 76
    :cond_4b
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_4e
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 80
    .line 81
    .line 82
    return-void
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

.method private L()I
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->d()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_4
    new-instance v1, Ljava/net/ServerSocket;

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    invoke-direct {v1, v0, v2}, Ljava/net/ServerSocket;-><init>(II)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/voxdon/xplorer/service/a;->h:Ljava/net/ServerSocket;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/net/ServerSocket;->getLocalPort()I

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_10} :catch_11

    .line 17
    return v0

    .line 18
    :catch_11
    move-exception v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    return v0
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
.end method

.method private M(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/a;->e:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    .line 4
    .line 5
    return-void
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

.method private N(Ljava/net/Socket;)Z
    .registers 4

    .line 1
    instance-of v0, p1, Ljavax/net/ssl/SSLSocket;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    :try_start_6
    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_b} :catch_c

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :catch_c
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private a(Ljava/lang/StringBuilder;ZLcom/voxdon/xplorer/file/n;Ljava/lang/String;)V
    .registers 8

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    const-string p2, " "

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-interface {p3}, Lax/c3/b;->isDirectory()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_37

    .line 13
    .line 14
    const-string p2, "Type=dir;Modify="

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lcom/voxdon/xplorer/service/a;->s:Ljava/text/SimpleDateFormat;

    .line 20
    .line 21
    new-instance v0, Ljava/util/Date;

    .line 22
    .line 23
    invoke-interface {p3}, Lax/c3/b;->q()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p2, ";Perm=el; "

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    if-nez p4, :cond_33

    .line 43
    .line 44
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_8d

    .line 52
    :cond_33
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_8d

    .line 56
    :cond_37
    const-string p2, "Type=file;Size="

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-interface {p3}, Lax/c3/b;->p()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p2, ";Modify="

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, Lcom/voxdon/xplorer/service/a;->s:Ljava/text/SimpleDateFormat;

    .line 74
    .line 75
    new-instance v0, Ljava/util/Date;

    .line 76
    .line 77
    invoke-interface {p3}, Lax/c3/b;->q()J

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p2, ";Perm="

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p2, "r"

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    sget-object v0, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 106
    .line 107
    const-string v1, "w"

    .line 108
    .line 109
    if-ne p2, v0, :cond_72

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    goto :goto_7b

    .line 115
    :cond_72
    invoke-interface {p3}, Lax/c3/b;->j()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_7b

    .line 120
    .line 121
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    :cond_7b
    :goto_7b
    const-string p2, "; "

    .line 125
    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    if-nez p4, :cond_8a

    .line 130
    .line 131
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    goto :goto_8d

    .line 139
    :cond_8a
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    :goto_8d
    const-string p2, "\r\n"

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
.end method

.method private b(Lax/c3/K;Ljava/lang/String;)V
    .registers 6

    .line 1
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->Y(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_10

    .line 10
    .line 11
    const-string p1, "Not local file location in FTP!"

    .line 12
    .line 13
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_25

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->h(Lcom/voxdon/xplorer/file/c$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_25

    .line 36
    .line 37
    goto :goto_49

    .line 38
    :cond_25
    :try_start_25
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, p0, Lcom/voxdon/xplorer/service/a;->u:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/voxdon/xplorer/service/a;->v:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/voxdon/xplorer/service/a;->x:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, Lcom/voxdon/xplorer/service/a;->w:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_44
    .catch Lax/b3/j; {:try_start_25 .. :try_end_44} :catch_45

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catch_45
    const/4 p1, 0x0

    .line 71
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 72
    .line 73
    .line 74
    :goto_49
    return-void
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

.method private c(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_12

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->n:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->m:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_23

    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->m:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_23

    .line 34
    .line 35
    return v1

    .line 36
    :cond_23
    const/4 p1, 0x1

    .line 37
    return p1
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private d()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->h:Ljava/net/ServerSocket;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_7} :catch_8

    .line 6
    .line 7
    .line 8
    goto :goto_c

    .line 9
    :catch_8
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    :goto_c
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/voxdon/xplorer/service/a;->h:Ljava/net/ServerSocket;

    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private f(Ljava/net/Socket;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_17

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/net/Socket;->isClosed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_17

    .line 8
    .line 9
    :try_start_8
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_12} :catch_13

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_13
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void
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

.method private g(Lcom/voxdon/xplorer/file/n;ZZ)Ljava/lang/String;
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "*"

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_87

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_87

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->q(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz p2, :cond_28

    .line 36
    .line 37
    invoke-direct {p0, v1, v0, p1, v2}, Lcom/voxdon/xplorer/service/a;->a(Ljava/lang/StringBuilder;ZLcom/voxdon/xplorer/file/n;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_82

    .line 41
    :cond_28
    if-nez p3, :cond_7a

    .line 42
    .line 43
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_36

    .line 48
    .line 49
    const-string p2, "drwxr-xr-x 1 owner group"

    .line 50
    .line 51
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    goto :goto_3b

    .line 55
    :cond_36
    const-string p2, "-rw-r--r-- 1 owner group"

    .line 56
    .line 57
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :goto_3b
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    const/4 v3, 0x1

    .line 71
    new-array v3, v3, [Ljava/lang/Object;

    .line 72
    .line 73
    aput-object p3, v3, v0

    .line 74
    .line 75
    const-string p3, "%13d"

    .line 76
    .line 77
    invoke-static {p2, p3, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 85
    .line 86
    .line 87
    move-result-wide p2

    .line 88
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    sub-long/2addr p2, v3

    .line 93
    const-wide v3, 0x39ef8b000L

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    cmp-long v0, p2, v3

    .line 99
    .line 100
    if-lez v0, :cond_68

    .line 101
    .line 102
    iget-object p2, p0, Lcom/voxdon/xplorer/service/a;->r:Ljava/text/SimpleDateFormat;

    .line 103
    .line 104
    goto :goto_6a

    .line 105
    :cond_68
    iget-object p2, p0, Lcom/voxdon/xplorer/service/a;->q:Ljava/text/SimpleDateFormat;

    .line 106
    .line 107
    :goto_6a
    new-instance p3, Ljava/util/Date;

    .line 108
    .line 109
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    invoke-direct {p3, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :cond_7a
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p1, "\r\n"

    .line 127
    .line 128
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    :goto_82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :cond_87
    const/4 p1, 0x0

    .line 137
    return-object p1
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

.method private static h(Ljava/lang/String;Ljava/security/KeyPair;)Ljava/security/cert/X509Certificate;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v5, Ljava/util/Date;

    .line 6
    .line 7
    const-wide/32 v2, 0x5265c00

    .line 8
    .line 9
    .line 10
    sub-long v2, v0, v2

    .line 11
    .line 12
    invoke-direct {v5, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 13
    .line 14
    .line 15
    new-instance v6, Ljava/util/Date;

    .line 16
    .line 17
    const-wide v2, 0x496cebb800L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lax/pd/c;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "CN="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, "Cx File Explorer"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, " FTPS Server"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v3, v0}, Lax/pd/c;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Ljava/math/BigInteger;

    .line 56
    .line 57
    new-instance v0, Ljava/security/SecureRandom;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 60
    .line 61
    .line 62
    const/16 v1, 0xa0

    .line 63
    .line 64
    invoke-direct {v4, v1, v0}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lax/ud/d;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    move-object v7, v3

    .line 74
    invoke-direct/range {v2 .. v8}, Lax/ud/d;-><init>(Lax/pd/c;Ljava/math/BigInteger;Ljava/util/Date;Ljava/util/Date;Lax/pd/c;Ljava/security/PublicKey;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lax/rd/e;->k0:Lax/Wc/v;

    .line 78
    .line 79
    new-instance v3, Lax/rd/b;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-direct {v3, v4}, Lax/rd/b;-><init>(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    invoke-virtual {v2, v0, v5, v3}, Lax/td/c;->a(Lax/Wc/v;ZLax/Wc/g;)Lax/td/c;

    .line 87
    .line 88
    .line 89
    sget-object v0, Lax/rd/e;->g0:Lax/Wc/v;

    .line 90
    .line 91
    new-instance v3, Lax/rd/k;

    .line 92
    .line 93
    invoke-direct {v3, v1}, Lax/rd/k;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v0, v5, v3}, Lax/td/c;->a(Lax/Wc/v;ZLax/Wc/g;)Lax/td/c;

    .line 97
    .line 98
    .line 99
    sget-object v0, Lax/rd/e;->y0:Lax/Wc/v;

    .line 100
    .line 101
    new-instance v1, Lax/rd/d;

    .line 102
    .line 103
    sget-object v3, Lax/rd/j;->e0:Lax/rd/j;

    .line 104
    .line 105
    invoke-direct {v1, v3}, Lax/rd/d;-><init>(Lax/rd/j;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v0, v4, v1}, Lax/td/c;->a(Lax/Wc/v;ZLax/Wc/g;)Lax/td/c;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lax/rd/e;->i0:Lax/Wc/v;

    .line 112
    .line 113
    invoke-static {p0}, Lcom/voxdon/xplorer/service/a;->k(Ljava/lang/String;)Lax/rd/i;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v2, v0, v4, p0}, Lax/td/c;->a(Lax/Wc/v;ZLax/Wc/g;)Lax/td/c;

    .line 118
    .line 119
    .line 120
    new-instance p0, Lax/Md/a;

    .line 121
    .line 122
    const-string v0, "SHA256withRSA"

    .line 123
    .line 124
    invoke-direct {p0, v0}, Lax/Md/a;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p0, p1}, Lax/Md/a;->b(Ljava/security/PrivateKey;)Lax/Ld/a;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    new-instance p1, Lax/ud/c;

    .line 136
    .line 137
    invoke-direct {p1}, Lax/ud/c;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, p0}, Lax/td/c;->b(Lax/Ld/a;)Lax/td/b;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p1, p0}, Lax/ud/c;->a(Lax/td/b;)Ljava/security/cert/X509Certificate;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
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

.method private static i(Ljava/lang/String;)Ljava/security/KeyStore;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const-string v0, "RSA"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x800

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p0, v0}, Lcom/voxdon/xplorer/service/a;->h(Ljava/lang/String;Ljava/security/KeyPair;)Ljava/security/cert/X509Certificate;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v1, v2, v2}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v2, "filemanager"

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x1

    .line 43
    new-array v3, v3, [Ljava/security/cert/Certificate;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    aput-object p0, v3, v4

    .line 47
    .line 48
    const-string p0, "ftp_server"

    .line 49
    .line 50
    invoke-virtual {v1, p0, v0, v2, v3}, Ljava/security/KeyStore;->setKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V

    .line 51
    .line 52
    .line 53
    return-object v1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static j(Landroid/content/Context;Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/service/a;->x(Landroid/content/Context;Ljava/lang/String;)Ljava/security/KeyStore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_d

    .line 6
    .line 7
    invoke-static {p1}, Lcom/voxdon/xplorer/service/a;->i(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/service/a;->G(Landroid/content/Context;Ljava/lang/String;Ljava/security/KeyStore;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    invoke-static {}, Ljavax/net/ssl/KeyManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ljavax/net/ssl/KeyManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "filemanager"

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, v0, p1}, Ljavax/net/ssl/KeyManagerFactory;->init(Ljava/security/KeyStore;[C)V

    .line 29
    .line 30
    .line 31
    const-string p1, "TLSv1.2"

    .line 32
    .line 33
    invoke-static {p1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0}, Ljavax/net/ssl/KeyManagerFactory;->getKeyManagers()[Ljavax/net/ssl/KeyManager;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Ljava/security/SecureRandom;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {p1, p0, v1, v0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 48
    .line 49
    .line 50
    return-object p1
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

.method private static k(Ljava/lang/String;)Lax/rd/i;
    .registers 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1c

    .line 11
    .line 12
    const-string v1, "127.0.0.1"

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1c

    .line 19
    .line 20
    new-instance v1, Lax/rd/h;

    .line 21
    .line 22
    const/4 v2, 0x7

    .line 23
    invoke-direct {v1, v2, p0}, Lax/rd/h;-><init>(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1c
    new-instance p0, Lax/rd/i;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    new-array v1, v1, [Lax/rd/h;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, [Lax/rd/h;

    .line 42
    .line 43
    invoke-direct {p0, v0}, Lax/rd/i;-><init>([Lax/rd/h;)V

    .line 44
    .line 45
    .line 46
    return-object p0
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

.method private l(Ljava/lang/String;)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_30

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_f

    .line 12
    .line 13
    const-string p1, "/"

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_f
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_22

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_22
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_29

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_29
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_30
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    const-string v0, "Paramater is empty"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->d:Lcom/voxdon/xplorer/file/n;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_9
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->x:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_13
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_8c

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lax/c3/K;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p0, Lcom/voxdon/xplorer/service/a;->v:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 51
    .line 52
    if-nez v3, :cond_60

    .line 53
    .line 54
    new-instance p1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, ":"

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lax/Z2/j;->T()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lax/Z2/j;->t0()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_13

    .line 97
    :cond_60
    invoke-static {v1, p1}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_6c

    .line 102
    .line 103
    invoke-static {v1, p1}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_13

    .line 108
    .line 109
    :cond_6c
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v3, "/"

    .line 114
    .line 115
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_87

    .line 120
    .line 121
    const-string v0, ""

    .line 122
    .line 123
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_85

    .line 132
    .line 133
    goto :goto_8e

    .line 134
    :cond_85
    move-object v3, v0

    .line 135
    goto :goto_8e

    .line 136
    :cond_87
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    goto :goto_8e

    .line 141
    :cond_8c
    const/4 v2, 0x0

    .line 142
    move-object v3, v2

    .line 143
    :goto_8e
    if-eqz v3, :cond_ba

    .line 144
    .line 145
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->u:Ljava/util/Map;

    .line 146
    .line 147
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Lcom/voxdon/xplorer/file/o;

    .line 152
    .line 153
    if-eqz p1, :cond_9f

    .line 154
    .line 155
    invoke-virtual {p1, v3}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    return-object p1

    .line 160
    :cond_9f
    new-instance p1, Lax/b3/j;

    .line 161
    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v1, "No file operator available : "

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Lax/c3/K;->k()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_ba
    new-instance v0, Lax/b3/t;

    .line 188
    .line 189
    new-instance v1, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v2, "File not exist : "

    .line 195
    .line 196
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {v0, p1}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0
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

.method private p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->u:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/voxdon/xplorer/file/o;

    .line 12
    .line 13
    return-object p1
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

.method private q(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_23

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->x:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_19

    .line 20
    .line 21
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_19
    const-string v0, "root path is not available"

    .line 27
    .line 28
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_23
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
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

.method private r()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/voxdon/xplorer/service/a;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_11
    const-string v0, "127.0.0.1"

    .line 19
    .line 20
    return-object v0
    .line 21
.end method

.method private static s(Landroid/content/Context;Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    .registers 5

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/service/a;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/voxdon/xplorer/service/a;->G:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljavax/net/ssl/SSLContext;

    .line 12
    .line 13
    if-eqz v1, :cond_f

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_f
    const-class v1, Lcom/voxdon/xplorer/service/a;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_12
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljavax/net/ssl/SSLContext;
    :try_end_18
    .catchall {:try_start_12 .. :try_end_18} :catchall_22

    .line 24
    .line 25
    if-nez v2, :cond_2b

    .line 26
    .line 27
    :try_start_1a
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/service/a;->j(Landroid/content/Context;Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_21} :catch_24
    .catchall {:try_start_1a .. :try_end_21} :catchall_22

    .line 32
    .line 33
    .line 34
    goto :goto_2b

    .line 35
    :catchall_22
    move-exception p0

    .line 36
    goto :goto_2d

    .line 37
    :catch_24
    move-exception p0

    .line 38
    :try_start_25
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 39
    .line 40
    .line 41
    monitor-exit v1

    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_2b
    :goto_2b
    monitor-exit v1

    .line 45
    return-object v2

    .line 46
    :goto_2d
    monitor-exit v1
    :try_end_2e
    .catchall {:try_start_25 .. :try_end_2e} :catchall_22

    .line 47
    throw p0
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
.end method

.method private u(Lcom/voxdon/xplorer/file/n;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/c3/K;->h:Lax/c3/K;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v1, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_f

    .line 12
    :cond_b
    invoke-interface {p1}, Lax/c3/b;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_f
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1e

    .line 21
    .line 22
    if-eqz v0, :cond_1e

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1e

    .line 29
    .line 30
    return v2

    .line 31
    :cond_1e
    const/4 p1, 0x0

    .line 32
    return p1
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

.method private v(Ljava/lang/String;)Z
    .registers 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method private w(Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_21

    .line 18
    .line 19
    const-string v0, "/"

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1f

    .line 30
    .line 31
    goto :goto_21

    .line 32
    :cond_1f
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :cond_21
    :goto_21
    const/4 p1, 0x1

    .line 35
    return p1
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

.method private static x(Landroid/content/Context;Ljava/lang/String;)Ljava/security/KeyStore;
    .registers 6

    .line 1
    invoke-static {p0, p1}, Lax/o3/h;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_c

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_c
    const/4 v1, 0x2

    .line 14
    :try_start_d
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 29
    .line 30
    .line 31
    const-string v0, "filemanager"

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v1, v3, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 38
    .line 39
    .line 40
    const-string v0, "ftp_server"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_35

    .line 47
    .line 48
    invoke-static {p0, p1}, Lax/o3/h;->e(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_32} :catch_33

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :catch_33
    move-exception v0

    .line 53
    goto :goto_36

    .line 54
    :cond_35
    return-object v1

    .line 55
    :goto_36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, Lax/o3/h;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2
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

.method private y(Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    const-string v1, "550 %s: No such file or directory.\r\n"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object p1, v2, v3

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private z(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->o:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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


# virtual methods
.method public C(Ljava/lang/String;Lcom/voxdon/xplorer/service/a$a;Z)V
    .registers 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 1
    const-string v3, "550 Failed to list files\r\n"

    const-string v4, "426 Data socket or network error\r\n"

    const-string v5, "APPE"

    const-string v6, "->"

    const-string v7, "550 Rename failed\r\n"

    const-string v8, "200 CDUP OK\r\n"

    const-string v9, "550 Appropriate parent directory does not exist\r\n"

    const-string v12, "MLSD"

    const-string v13, "550 MDTM request on an invalid file\r\n"

    const-string v14, "550 MFMT failed to set time\r\n"

    const-string v15, " "

    const/16 v16, 0x0

    const/4 v10, 0x2

    invoke-virtual {v0, v15, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_b6f

    const/16 v18, 0x2

    .line 2
    array-length v10, v11

    if-nez v10, :cond_2c

    goto/16 :goto_b6f

    .line 3
    :cond_2c
    sget-object v10, Lcom/voxdon/xplorer/service/a;->E:Ljava/util/logging/Logger;

    move-object/from16 v19, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v4

    const-string v4, "FTP INPUT : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 4
    aget-object v3, v11, v16

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 5
    array-length v4, v11

    const-string v10, ""

    move-object/from16 v21, v10

    const/4 v10, 0x1

    if-le v4, v10, :cond_5f

    .line 6
    aget-object v4, v11, v10

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    goto :goto_61

    :cond_5f
    move-object/from16 v4, v21

    .line 7
    :goto_61
    :try_start_61
    iget-boolean v10, v1, Lcom/voxdon/xplorer/service/a;->k:Z
    :try_end_63
    .catchall {:try_start_61 .. :try_end_63} :catchall_b39

    const-string v11, "530 Login incorrect\r\n"

    if-nez v10, :cond_79

    :try_start_67
    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->z(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_79

    .line 8
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_70
    .catchall {:try_start_67 .. :try_end_70} :catchall_75

    const-wide/16 v2, 0x0

    .line 9
    iput-wide v2, v1, Lcom/voxdon/xplorer/service/a;->A:J

    return-void

    :catchall_75
    move-exception v0

    :goto_76
    const/4 v10, 0x0

    goto/16 :goto_b68

    .line 10
    :cond_79
    :try_start_79
    const-string v10, "NOOP"

    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_7f
    .catchall {:try_start_79 .. :try_end_7f} :catchall_b39

    move/from16 v24, v10

    if-eqz v24, :cond_8c

    .line 11
    :try_start_83
    const-string v0, "200 NOOP OK\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_88
    .catchall {:try_start_83 .. :try_end_88} :catchall_75

    :goto_88
    const/4 v6, 0x0

    :goto_89
    const/4 v7, 0x0

    goto/16 :goto_b2a

    .line 12
    :cond_8c
    :try_start_8c
    const-string v10, "AUTH"

    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_92
    .catchall {:try_start_8c .. :try_end_92} :catchall_b39

    if-eqz v10, :cond_98

    .line 13
    :try_start_94
    invoke-direct {v1, v4, v2}, Lcom/voxdon/xplorer/service/a;->D(Ljava/lang/String;Lcom/voxdon/xplorer/service/a$a;)V
    :try_end_97
    .catchall {:try_start_94 .. :try_end_97} :catchall_75

    goto :goto_88

    .line 14
    :cond_98
    :try_start_98
    const-string v10, "PBSZ"

    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_9e
    .catchall {:try_start_98 .. :try_end_9e} :catchall_b39

    move/from16 v25, v10

    const-string v10, "503 TLS is required\r\n"

    if-eqz v25, :cond_b2

    .line 15
    :try_start_a4
    iget-boolean v0, v1, Lcom/voxdon/xplorer/service/a;->B:Z

    if-eqz v0, :cond_ae

    .line 16
    const-string v0, "200 PBSZ=0\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_88

    .line 17
    :cond_ae
    invoke-virtual {v1, v10}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_b1
    .catchall {:try_start_a4 .. :try_end_b1} :catchall_75

    goto :goto_88

    :cond_b2
    move-object/from16 v25, v5

    .line 18
    :try_start_b4
    const-string v5, "PROT"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_ba
    .catchall {:try_start_b4 .. :try_end_ba} :catchall_b39

    if-eqz v5, :cond_f6

    .line 19
    :try_start_bc
    iget-boolean v0, v1, Lcom/voxdon/xplorer/service/a;->B:Z

    if-nez v0, :cond_c4

    .line 20
    invoke-virtual {v1, v10}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_88

    .line 21
    :cond_c4
    const-string v0, "P"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_db

    const/4 v10, 0x1

    .line 22
    iput-boolean v10, v1, Lcom/voxdon/xplorer/service/a;->C:Z

    .line 23
    const-string v0, "200 Protection set to Private\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_88

    .line 24
    :cond_db
    const-string v0, "C"

    invoke-virtual {v4, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f0

    const/4 v3, 0x0

    .line 25
    iput-boolean v3, v1, Lcom/voxdon/xplorer/service/a;->C:Z

    .line 26
    const-string v0, "200 Protection set to Clear\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_88

    .line 27
    :cond_f0
    const-string v0, "536 Unsupported PROT level\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_f5
    .catchall {:try_start_bc .. :try_end_f5} :catchall_75

    goto :goto_88

    .line 28
    :cond_f6
    :try_start_f6
    const-string v5, "OPTS"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_fc
    .catchall {:try_start_f6 .. :try_end_fc} :catchall_b39

    const-string v10, "MLST"

    if-eqz v5, :cond_147

    .line 29
    :try_start_100
    const-string v3, "UTF8 ON"

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_140

    const-string v3, "UTF-8 ON"

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_119

    goto :goto_140

    .line 30
    :cond_119
    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3
    :try_end_11d
    .catchall {:try_start_100 .. :try_end_11d} :catchall_75

    const-string v4, "501 Unsupported Options\r\n"

    if-eqz v3, :cond_126

    .line 31
    :try_start_121
    invoke-virtual {v1, v4}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 32
    :cond_126
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object v3

    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object v3

    const-string v5, "UNSUPPORTED FTP OPTIONS"

    invoke-virtual {v3, v5}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object v0

    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 33
    invoke-virtual {v1, v4}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 34
    :cond_140
    :goto_140
    const-string v0, "200 UTF8 OK\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_145
    .catchall {:try_start_121 .. :try_end_145} :catchall_75

    goto/16 :goto_88

    .line 35
    :cond_147
    :try_start_147
    const-string v0, "USER"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_14d
    .catchall {:try_start_147 .. :try_end_14d} :catchall_b39

    const-string v5, "230 Access granted\r\n"

    if-eqz v0, :cond_163

    .line 36
    :try_start_151
    iget-boolean v0, v1, Lcom/voxdon/xplorer/service/a;->k:Z

    if-eqz v0, :cond_15a

    .line 37
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 38
    :cond_15a
    iput-object v4, v1, Lcom/voxdon/xplorer/service/a;->l:Ljava/lang/String;

    .line 39
    const-string v0, "331 Password required\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_161
    .catchall {:try_start_151 .. :try_end_161} :catchall_75

    goto/16 :goto_88

    .line 40
    :cond_163
    :try_start_163
    const-string v0, "PASS"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_169
    .catchall {:try_start_163 .. :try_end_169} :catchall_b39

    if-eqz v0, :cond_18c

    if-eqz p3, :cond_174

    .line 41
    :try_start_16d
    const-string v0, "530 Maximum number of login attempts exceeded\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 42
    :cond_174
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->l:Ljava/lang/String;

    invoke-direct {v1, v0, v4}, Lcom/voxdon/xplorer/service/a;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_184

    .line 43
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    const/4 v10, 0x1

    .line 44
    iput-boolean v10, v1, Lcom/voxdon/xplorer/service/a;->k:Z

    goto/16 :goto_88

    :cond_184
    const/4 v10, 0x1

    .line 45
    iput-boolean v10, v2, Lcom/voxdon/xplorer/service/a$a;->b:Z

    .line 46
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_18a
    .catchall {:try_start_16d .. :try_end_18a} :catchall_75

    goto/16 :goto_88

    .line 47
    :cond_18c
    :try_start_18c
    const-string v0, "SYST"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_192
    .catchall {:try_start_18c .. :try_end_192} :catchall_b39

    if-eqz v0, :cond_19b

    .line 48
    :try_start_194
    const-string v0, "215 UNIX Type: L8\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_199
    .catchall {:try_start_194 .. :try_end_199} :catchall_75

    goto/16 :goto_88

    .line 49
    :cond_19b
    :try_start_19b
    const-string v0, "PWD"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1a1
    .catchall {:try_start_19b .. :try_end_1a1} :catchall_b39

    if-eqz v0, :cond_1b9

    .line 50
    :try_start_1a3
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "257 \"%s\"\r\n"

    iget-object v4, v1, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    const/4 v10, 0x1

    new-array v5, v10, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v4, v5, v16

    invoke-static {v0, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_1b7
    .catchall {:try_start_1a3 .. :try_end_1b7} :catchall_75

    goto/16 :goto_88

    .line 51
    :cond_1b9
    :try_start_1b9
    const-string v0, "TYPE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1bf
    .catchall {:try_start_1b9 .. :try_end_1bf} :catchall_b39

    if-eqz v0, :cond_1fe

    .line 52
    :try_start_1c1
    const-string v0, "I"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d1

    const-string v0, "L 8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d3

    :cond_1d1
    const/4 v10, 0x1

    goto :goto_1f5

    .line 53
    :cond_1d3
    const-string v0, "A"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e3

    const-string v0, "A N"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e5

    :cond_1e3
    const/4 v3, 0x0

    goto :goto_1ec

    .line 54
    :cond_1e5
    const-string v0, "503 Unknown TYPE command\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 55
    :goto_1ec
    iput-boolean v3, v1, Lcom/voxdon/xplorer/service/a;->g:Z

    .line 56
    const-string v0, "200 ASCII type set\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 57
    :goto_1f5
    iput-boolean v10, v1, Lcom/voxdon/xplorer/service/a;->g:Z

    .line 58
    const-string v0, "200 Binary type set\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_1fc
    .catchall {:try_start_1c1 .. :try_end_1fc} :catchall_75

    goto/16 :goto_88

    .line 59
    :cond_1fe
    :try_start_1fe
    const-string v0, "PASV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_204
    .catchall {:try_start_1fe .. :try_end_204} :catchall_b39

    if-eqz v0, :cond_24e

    .line 60
    :try_start_206
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v0

    if-eqz v0, :cond_247

    .line 61
    invoke-direct {v1}, Lcom/voxdon/xplorer/service/a;->L()I

    move-result v3

    if-gtz v3, :cond_215

    goto :goto_247

    .line 62
    :cond_215
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "227 Entering Passive Mode (%s,%d,%d).\r\n"

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0x2e

    const/16 v7, 0x2c

    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    div-int/lit16 v6, v3, 0x100

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    rem-int/lit16 v3, v3, 0x100

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v0, v7, v16

    const/16 v17, 0x1

    aput-object v6, v7, v17

    aput-object v3, v7, v18

    invoke-static {v4, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 63
    :cond_247
    :goto_247
    const-string v0, "502 Cannot open a port\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_24c
    .catchall {:try_start_206 .. :try_end_24c} :catchall_75

    goto/16 :goto_88

    .line 64
    :cond_24e
    :try_start_24e
    const-string v0, "PORT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_254
    .catchall {:try_start_24e .. :try_end_254} :catchall_b39

    if-eqz v0, :cond_2bb

    .line 65
    :try_start_256
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_25c
    .catchall {:try_start_256 .. :try_end_25c} :catchall_75

    .line 66
    const-string v3, "550 Invalid PORT arguments\r\n"

    if-eqz v0, :cond_2b6

    :try_start_260
    array-length v4, v0

    const/4 v5, 0x6

    if-eq v4, v5, :cond_265

    goto :goto_2b6

    :cond_265
    const/4 v4, 0x4

    .line 67
    new-array v5, v4, [B
    :try_end_268
    .catchall {:try_start_260 .. :try_end_268} :catchall_75

    const/4 v6, 0x0

    :goto_269
    if-ge v6, v4, :cond_281

    .line 68
    :try_start_26b
    aget-object v7, v0, v6

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/16 v8, 0x80

    if-lt v7, v8, :cond_277

    add-int/lit16 v7, v7, -0x100

    :cond_277
    int-to-byte v7, v7

    .line 69
    aput-byte v7, v5, v6

    const/16 v17, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_269

    :catch_27f
    move-exception v0

    goto :goto_2ae

    .line 70
    :cond_281
    aget-object v4, v0, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    mul-int/lit16 v4, v4, 0x100

    const/4 v6, 0x5

    aget-object v0, v0, v6

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v4, v0

    iput v4, v1, Lcom/voxdon/xplorer/service/a;->j:I
    :try_end_293
    .catch Ljava/lang/Exception; {:try_start_26b .. :try_end_293} :catch_27f
    .catchall {:try_start_26b .. :try_end_293} :catchall_75

    .line 71
    :try_start_293
    invoke-static {v5}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, v1, Lcom/voxdon/xplorer/service/a;->i:Ljava/net/InetAddress;

    .line 72
    const-string v0, "200 PORT OK\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 73
    invoke-direct {v1}, Lcom/voxdon/xplorer/service/a;->d()V
    :try_end_2a1
    .catch Ljava/net/UnknownHostException; {:try_start_293 .. :try_end_2a1} :catch_2a3
    .catchall {:try_start_293 .. :try_end_2a1} :catchall_75

    goto/16 :goto_88

    :catch_2a3
    move-exception v0

    .line 74
    :try_start_2a4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    const-string v0, "550 Unknown host\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 76
    :goto_2ae
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 77
    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 78
    :cond_2b6
    :goto_2b6
    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_2b9
    .catchall {:try_start_2a4 .. :try_end_2b9} :catchall_75

    goto/16 :goto_88

    .line 79
    :cond_2bb
    :try_start_2bb
    const-string v0, "SIZE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_2c1
    .catchall {:try_start_2bb .. :try_end_2c1} :catchall_b39

    const-string v5, "550 Unknown error.\r\n"

    const-string v11, "501 Syntax error\r\n"

    if-eqz v0, :cond_31f

    .line 80
    :try_start_2c7
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    if-eqz v0, :cond_2e0

    .line 81
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v3

    if-nez v3, :cond_2e0

    .line 82
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    :cond_2e0
    if-eqz v0, :cond_305

    .line 83
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2e9

    goto :goto_305

    .line 84
    :cond_2e9
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "213 %d\r\n"

    invoke-interface {v0}, Lax/c3/b;->p()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v10, 0x1

    new-array v7, v10, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v0, v7, v16

    invoke-static {v3, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 85
    :cond_305
    :goto_305
    const-string v0, "550 SIZE request on an invalid file\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_30a
    .catch Lax/b3/t; {:try_start_2c7 .. :try_end_30a} :catch_316
    .catch Lax/b3/j; {:try_start_2c7 .. :try_end_30a} :catch_311
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2c7 .. :try_end_30a} :catch_30c
    .catchall {:try_start_2c7 .. :try_end_30a} :catchall_75

    goto/16 :goto_88

    .line 86
    :catch_30c
    :try_start_30c
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 87
    :catch_311
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 88
    :catch_316
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_31d
    .catchall {:try_start_30c .. :try_end_31d} :catchall_75

    goto/16 :goto_88

    .line 89
    :cond_31f
    :try_start_31f
    const-string v0, "MDTM"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_325
    .catchall {:try_start_31f .. :try_end_325} :catchall_b39

    if-eqz v0, :cond_384

    .line 90
    :try_start_327
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    if-eqz v0, :cond_340

    .line 91
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v3

    if-nez v3, :cond_340

    .line 92
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    :cond_340
    if-eqz v0, :cond_36c

    .line 93
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_349

    goto :goto_36c

    .line 94
    :cond_349
    invoke-interface {v0}, Lax/c3/b;->q()J

    move-result-wide v5

    .line 95
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->s:Ljava/text/SimpleDateFormat;

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 96
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "213 %s\r\n"

    const/4 v10, 0x1

    new-array v6, v10, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v0, v6, v16

    invoke-static {v3, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 97
    :cond_36c
    :goto_36c
    invoke-virtual {v1, v13}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_36f
    .catch Lax/b3/t; {:try_start_327 .. :try_end_36f} :catch_37b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_327 .. :try_end_36f} :catch_376
    .catch Lax/b3/j; {:try_start_327 .. :try_end_36f} :catch_371
    .catchall {:try_start_327 .. :try_end_36f} :catchall_75

    goto/16 :goto_88

    .line 98
    :catch_371
    :try_start_371
    invoke-virtual {v1, v13}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 99
    :catch_376
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 100
    :catch_37b
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_382
    .catchall {:try_start_371 .. :try_end_382} :catchall_75

    goto/16 :goto_88

    .line 101
    :cond_384
    :try_start_384
    const-string v0, "MFMT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_38a
    .catchall {:try_start_384 .. :try_end_38a} :catchall_b39

    if-eqz v0, :cond_442

    const/4 v0, 0x2

    .line 102
    :try_start_38d
    invoke-virtual {v4, v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 103
    array-length v5, v3

    if-ge v5, v0, :cond_399

    .line 104
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    :cond_399
    const/16 v16, 0x0

    .line 105
    aget-object v0, v3, v16

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const/16 v17, 0x1

    .line 106
    aget-object v3, v3, v17

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3
    :try_end_3a9
    .catchall {:try_start_38d .. :try_end_3a9} :catchall_75

    .line 107
    :try_start_3a9
    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v5

    if-eqz v5, :cond_3c2

    .line 108
    invoke-interface {v5}, Lax/c3/b;->n()Z

    move-result v6

    if-nez v6, :cond_3c2

    .line 109
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    :cond_3c2
    if-nez v5, :cond_3c9

    .line 110
    invoke-virtual {v1, v14}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 111
    :cond_3c9
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v6

    .line 112
    invoke-static {v5}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    move-result v7

    if-eqz v7, :cond_42a

    .line 113
    iget-object v7, v1, Lcom/voxdon/xplorer/service/a;->t:Ljava/text/SimpleDateFormat;

    if-nez v7, :cond_3eb

    .line 114
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v8, "yyyyMMddHHmmss"

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v7, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v7, v1, Lcom/voxdon/xplorer/service/a;->t:Ljava/text/SimpleDateFormat;

    .line 115
    const-string v8, "UTC"

    invoke-static {v8}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 116
    :cond_3eb
    iget-object v7, v1, Lcom/voxdon/xplorer/service/a;->t:Ljava/text/SimpleDateFormat;

    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 117
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    move-result-object v6

    .line 118
    instance-of v8, v6, Lcom/voxdon/xplorer/file/x;

    if-eqz v8, :cond_422

    .line 119
    check-cast v6, Lcom/voxdon/xplorer/file/x;

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-virtual {v6, v5, v7, v8}, Lcom/voxdon/xplorer/file/x;->d(Lcom/voxdon/xplorer/file/n;J)Z

    move-result v5

    if-eqz v5, :cond_41d

    .line 120
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "213 Modify=%s; %s\r\n"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v0, v7, v16

    const/16 v17, 0x1

    aput-object v3, v7, v17

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 121
    :cond_41d
    invoke-virtual {v1, v14}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 122
    :cond_422
    invoke-static {}, Lax/u3/b;->f()V

    .line 123
    invoke-virtual {v1, v14}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 124
    :cond_42a
    invoke-virtual {v1, v14}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_42d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3a9 .. :try_end_42d} :catch_43d
    .catch Ljava/text/ParseException; {:try_start_3a9 .. :try_end_42d} :catch_43d
    .catch Lax/b3/t; {:try_start_3a9 .. :try_end_42d} :catch_434
    .catch Lax/b3/j; {:try_start_3a9 .. :try_end_42d} :catch_42f
    .catchall {:try_start_3a9 .. :try_end_42d} :catchall_75

    goto/16 :goto_88

    .line 125
    :catch_42f
    :try_start_42f
    invoke-virtual {v1, v14}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 126
    :catch_434
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 127
    :catch_43d
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_440
    .catchall {:try_start_42f .. :try_end_440} :catchall_75

    goto/16 :goto_88

    .line 128
    :cond_442
    :try_start_442
    const-string v0, "CWD"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_448
    .catchall {:try_start_442 .. :try_end_448} :catchall_b39

    if-eqz v0, :cond_489

    .line 129
    :try_start_44a
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v3

    .line 131
    invoke-interface {v3}, Lax/c3/b;->n()Z

    move-result v6

    if-nez v6, :cond_45f

    .line 132
    const-string v0, "550 No such file or directory.\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 133
    :cond_45f
    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->u(Lcom/voxdon/xplorer/file/n;)Z

    move-result v6

    if-nez v6, :cond_46c

    .line 134
    const-string v0, "550 CWD to the invalid path\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 135
    :cond_46c
    invoke-direct {v1, v3, v0}, Lcom/voxdon/xplorer/service/a;->M(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)V

    .line 136
    const-string v0, "250 CWD OK\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_474
    .catch Ljava/lang/IllegalArgumentException; {:try_start_44a .. :try_end_474} :catch_484
    .catch Lax/b3/t; {:try_start_44a .. :try_end_474} :catch_47b
    .catch Lax/b3/j; {:try_start_44a .. :try_end_474} :catch_476
    .catchall {:try_start_44a .. :try_end_474} :catchall_75

    goto/16 :goto_88

    .line 137
    :catch_476
    :try_start_476
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 138
    :catch_47b
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 139
    :catch_484
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_487
    .catchall {:try_start_476 .. :try_end_487} :catchall_75

    goto/16 :goto_88

    .line 140
    :cond_489
    :try_start_489
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_48d
    .catchall {:try_start_489 .. :try_end_48d} :catchall_b39

    if-eqz v0, :cond_4f7

    .line 141
    :try_start_48f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4a2

    .line 143
    iget-object v3, v1, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    .line 144
    const-string v6, "250- Listing .\r\n"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4bf

    .line 145
    :cond_4a2
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 146
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "250- Listing "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\r\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    :goto_4bf
    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v6

    .line 148
    invoke-interface {v6}, Lax/c3/b;->n()Z

    move-result v7

    if-nez v7, :cond_4d2

    .line 149
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    :cond_4d2
    const/4 v10, 0x1

    .line 150
    invoke-direct {v1, v0, v10, v6, v3}, Lcom/voxdon/xplorer/service/a;->a(Ljava/lang/StringBuilder;ZLcom/voxdon/xplorer/file/n;Ljava/lang/String;)V

    .line 151
    const-string v3, "250 End\r\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_4e2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_48f .. :try_end_4e2} :catch_4f2
    .catch Lax/b3/t; {:try_start_48f .. :try_end_4e2} :catch_4e9
    .catch Lax/b3/j; {:try_start_48f .. :try_end_4e2} :catch_4e4
    .catchall {:try_start_48f .. :try_end_4e2} :catchall_75

    goto/16 :goto_88

    .line 153
    :catch_4e4
    :try_start_4e4
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 154
    :catch_4e9
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 155
    :catch_4f2
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_4f5
    .catchall {:try_start_4e4 .. :try_end_4f5} :catchall_75

    goto/16 :goto_88

    .line 156
    :cond_4f7
    :try_start_4f7
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_4fb
    .catchall {:try_start_4f7 .. :try_end_4fb} :catchall_b39

    const-string v10, "NLST"

    if-nez v0, :cond_99e

    :try_start_4ff
    const-string v0, "LIST"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_99e

    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_50f

    goto/16 :goto_99e

    .line 157
    :cond_50f
    const-string v0, "QUIT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_51e

    .line 158
    const-string v0, "221 Goodbye\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 159
    :cond_51e
    const-string v0, "CDUP"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_579

    .line 160
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_533

    .line 161
    invoke-virtual {v1, v9}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 162
    :cond_533
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_54b

    .line 163
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->d:Lcom/voxdon/xplorer/file/n;

    const-string v3, "/"

    invoke-direct {v1, v0, v3}, Lcom/voxdon/xplorer/service/a;->M(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)V

    .line 164
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_549
    .catchall {:try_start_4ff .. :try_end_549} :catchall_75

    goto/16 :goto_88

    .line 165
    :cond_54b
    :try_start_54b
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v3

    if-eqz v3, :cond_566

    .line 167
    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->u(Lcom/voxdon/xplorer/file/n;)Z

    move-result v6

    if-nez v6, :cond_55e

    goto :goto_566

    .line 168
    :cond_55e
    invoke-direct {v1, v3, v0}, Lcom/voxdon/xplorer/service/a;->M(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)V

    .line 169
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 170
    :cond_566
    :goto_566
    invoke-virtual {v1, v9}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_569
    .catch Lax/b3/t; {:try_start_54b .. :try_end_569} :catch_570
    .catch Lax/b3/j; {:try_start_54b .. :try_end_569} :catch_56b
    .catchall {:try_start_54b .. :try_end_569} :catchall_75

    goto/16 :goto_88

    .line 171
    :catch_56b
    :try_start_56b
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 172
    :catch_570
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 173
    :cond_579
    const-string v0, "FEAT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_588

    .line 174
    const-string v0, "211- Extensions supported:\r\n AUTH TLS\r\n PBSZ\r\n PROT\r\n UTF8\r\n MLST\r\n MLSD\r\n MFMT\r\n REST STREAM\r\n211 End.\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 175
    :cond_588
    const-string v0, "DELE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_58e
    .catchall {:try_start_56b .. :try_end_58e} :catchall_75

    const-string v8, "550 Operation on invalid file\r\n"

    if-eqz v0, :cond_5fc

    .line 176
    :try_start_592
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5e1

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5a7

    goto :goto_5e1

    .line 178
    :cond_5a7
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    .line 179
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v3

    .line 180
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v6

    if-nez v6, :cond_5bd

    .line 181
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_5e4

    .line 182
    :cond_5bd
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_5dd

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v6
    :try_end_5c7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_592 .. :try_end_5c7} :catch_5f7
    .catch Lax/b3/t; {:try_start_592 .. :try_end_5c7} :catch_5ee
    .catch Lax/b3/j; {:try_start_592 .. :try_end_5c7} :catch_5e9
    .catchall {:try_start_592 .. :try_end_5c7} :catchall_75

    if-nez v6, :cond_5ca

    goto :goto_5dd

    .line 183
    :cond_5ca
    :try_start_5ca
    invoke-virtual {v3, v0}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 184
    const-string v3, "250 File successfully deleted\r\n"

    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v10
    :try_end_5d6
    .catch Lax/b3/j; {:try_start_5ca .. :try_end_5d6} :catch_5d7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5ca .. :try_end_5d6} :catch_5f7
    .catchall {:try_start_5ca .. :try_end_5d6} :catchall_75

    goto :goto_5e5

    .line 186
    :catch_5d7
    :try_start_5d7
    const-string v0, "450 Error deleting file\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_5e4

    .line 187
    :cond_5dd
    :goto_5dd
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_5e4

    .line 188
    :cond_5e1
    :goto_5e1
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_5e4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5d7 .. :try_end_5e4} :catch_5f7
    .catch Lax/b3/t; {:try_start_5d7 .. :try_end_5e4} :catch_5ee
    .catch Lax/b3/j; {:try_start_5d7 .. :try_end_5e4} :catch_5e9
    .catchall {:try_start_5d7 .. :try_end_5e4} :catchall_75

    :goto_5e4
    const/4 v10, 0x0

    :goto_5e5
    const/16 v16, 0x0

    goto/16 :goto_b2d

    .line 189
    :catch_5e9
    :try_start_5e9
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 190
    :catch_5ee
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 191
    :catch_5f7
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 192
    :cond_5fc
    const-string v0, "MKD"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_602
    .catchall {:try_start_5e9 .. :try_end_602} :catchall_75

    if-eqz v0, :cond_665

    .line 193
    :try_start_604
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 194
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_64e

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_619

    goto :goto_64e

    .line 195
    :cond_619
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    .line 196
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v3

    .line 197
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v6

    if-nez v6, :cond_62b

    .line 198
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_5e4

    .line 199
    :cond_62b
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v6

    if-eqz v6, :cond_637

    .line 200
    const-string v0, "550 Already exists\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_5e4

    :cond_637
    const/4 v6, 0x0

    .line 201
    invoke-virtual {v3, v0, v6}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    move-result v3

    if-nez v3, :cond_644

    .line 202
    const-string v0, "550 MKD denied\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_5e4

    .line 203
    :cond_644
    const-string v3, "250 Directory created\r\n"

    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v10

    goto :goto_5e5

    .line 205
    :cond_64e
    :goto_64e
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_651
    .catch Ljava/lang/IllegalArgumentException; {:try_start_604 .. :try_end_651} :catch_660
    .catch Lax/b3/t; {:try_start_604 .. :try_end_651} :catch_657
    .catch Lax/b3/j; {:try_start_604 .. :try_end_651} :catch_652
    .catchall {:try_start_604 .. :try_end_651} :catchall_75

    goto :goto_5e4

    .line 206
    :catch_652
    :try_start_652
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 207
    :catch_657
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 208
    :catch_660
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 209
    :cond_665
    const-string v0, "RMD"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_66b
    .catchall {:try_start_652 .. :try_end_66b} :catchall_75

    if-eqz v0, :cond_6df

    .line 210
    :try_start_66d
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 211
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6c7

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_682

    goto :goto_6c7

    .line 212
    :cond_682
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    .line 213
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v3

    .line 214
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v6

    if-nez v6, :cond_699

    .line 215
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 216
    :cond_699
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_6c2

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v6
    :try_end_6a3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_66d .. :try_end_6a3} :catch_6da
    .catch Lax/b3/t; {:try_start_66d .. :try_end_6a3} :catch_6d1
    .catch Lax/b3/j; {:try_start_66d .. :try_end_6a3} :catch_6cc
    .catchall {:try_start_66d .. :try_end_6a3} :catchall_75

    if-nez v6, :cond_6a6

    goto :goto_6c2

    .line 217
    :cond_6a6
    :try_start_6a6
    invoke-virtual {v3, v0}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 218
    const-string v3, "250 Directory removed\r\n"

    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v10
    :try_end_6b2
    .catch Lax/b3/k; {:try_start_6a6 .. :try_end_6b2} :catch_6bb
    .catch Lax/b3/j; {:try_start_6a6 .. :try_end_6b2} :catch_6b4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6a6 .. :try_end_6b2} :catch_6da
    .catchall {:try_start_6a6 .. :try_end_6b2} :catchall_75

    goto/16 :goto_5e5

    .line 220
    :catch_6b4
    :try_start_6b4
    const-string v0, "550 RMD failed\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 221
    :catch_6bb
    const-string v0, "550 Directory not empty\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 222
    :cond_6c2
    :goto_6c2
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 223
    :cond_6c7
    :goto_6c7
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_6ca
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6b4 .. :try_end_6ca} :catch_6da
    .catch Lax/b3/t; {:try_start_6b4 .. :try_end_6ca} :catch_6d1
    .catch Lax/b3/j; {:try_start_6b4 .. :try_end_6ca} :catch_6cc
    .catchall {:try_start_6b4 .. :try_end_6ca} :catchall_75

    goto/16 :goto_5e4

    .line 224
    :catch_6cc
    :try_start_6cc
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 225
    :catch_6d1
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 226
    :catch_6da
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 227
    :cond_6df
    const-string v0, "RNFR"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_6e5
    .catchall {:try_start_6cc .. :try_end_6e5} :catchall_75

    if-eqz v0, :cond_73b

    .line 228
    :try_start_6e7
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_723

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6fc

    goto :goto_723

    .line 230
    :cond_6fc
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    .line 231
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v3

    if-nez v3, :cond_70b

    .line 232
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 233
    :cond_70b
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v3

    if-nez v3, :cond_71a

    .line 234
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 235
    :cond_71a
    iput-object v0, v1, Lcom/voxdon/xplorer/service/a;->p:Lcom/voxdon/xplorer/file/n;

    .line 236
    const-string v0, "350 Waiting for RNTO\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 237
    :cond_723
    :goto_723
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_726
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6e7 .. :try_end_726} :catch_736
    .catch Lax/b3/t; {:try_start_6e7 .. :try_end_726} :catch_72d
    .catch Lax/b3/j; {:try_start_6e7 .. :try_end_726} :catch_728
    .catchall {:try_start_6e7 .. :try_end_726} :catchall_75

    goto/16 :goto_88

    .line 238
    :catch_728
    :try_start_728
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 239
    :catch_72d
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 240
    :catch_736
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 241
    :cond_73b
    const-string v0, "RNTO"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_741
    .catchall {:try_start_728 .. :try_end_741} :catchall_75

    if-eqz v0, :cond_86a

    .line 242
    :try_start_743
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_852

    .line 243
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_852

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_75b

    goto/16 :goto_852

    .line 244
    :cond_75b
    iget-object v3, v1, Lcom/voxdon/xplorer/service/a;->p:Lcom/voxdon/xplorer/file/n;

    if-nez v3, :cond_766

    .line 245
    const-string v0, "550 RNFR was not processed\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 246
    :cond_766
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    .line 247
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v3

    .line 248
    iget-object v9, v1, Lcom/voxdon/xplorer/service/a;->p:Lcom/voxdon/xplorer/file/n;

    .line 249
    invoke-direct {v1, v9}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v25

    .line 250
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v10

    .line 251
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v12

    if-nez v12, :cond_787

    .line 252
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 253
    :cond_787
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v8

    if-eqz v8, :cond_792

    .line 254
    invoke-virtual {v1, v7}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 255
    :cond_792
    invoke-interface {v10}, Lax/c3/b;->n()Z

    move-result v8

    if-nez v8, :cond_79f

    .line 256
    const-string v0, "553 File name not allowed\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 257
    :cond_79f
    invoke-interface {v9}, Lax/c3/b;->isDirectory()Z

    move-result v8
    :try_end_7a3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_743 .. :try_end_7a3} :catch_865
    .catch Lax/b3/t; {:try_start_743 .. :try_end_7a3} :catch_85c
    .catch Lax/b3/j; {:try_start_743 .. :try_end_7a3} :catch_857
    .catchall {:try_start_743 .. :try_end_7a3} :catchall_75

    if-nez v8, :cond_7b5

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v29, 0x1

    move-object/from16 v28, v0

    move-object/from16 v27, v3

    move-object/from16 v26, v9

    .line 258
    :try_start_7b1
    invoke-virtual/range {v25 .. v31}, Lcom/voxdon/xplorer/file/o;->h0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;ZLax/u3/c;Lax/g3/i;)V
    :try_end_7b4
    .catch Lax/b3/j; {:try_start_7b1 .. :try_end_7b4} :catch_84d
    .catch Lax/b3/a; {:try_start_7b1 .. :try_end_7b4} :catch_84d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7b1 .. :try_end_7b4} :catch_865
    .catchall {:try_start_7b1 .. :try_end_7b4} :catchall_75

    goto :goto_80f

    :cond_7b5
    move-object v3, v9

    move-object/from16 v8, v25

    .line 259
    :try_start_7b8
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    move-result-object v9

    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    move-result-object v10

    if-ne v9, v10, :cond_81a

    .line 260
    invoke-virtual {v8, v3}, Lcom/voxdon/xplorer/file/o;->B(Lcom/voxdon/xplorer/file/n;)Z

    move-result v9

    if-nez v9, :cond_7d6

    .line 261
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7d8

    :cond_7d6
    const/4 v6, 0x0

    goto :goto_80c

    .line 262
    :cond_7d8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object v8

    const-string v9, "FTP MOVE 1"

    invoke-virtual {v8, v9}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    move-result-object v3

    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    move-result-object v0

    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object v0

    invoke-virtual {v0}, Lax/Ha/b;->h()V
    :try_end_80b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7b8 .. :try_end_80b} :catch_865
    .catch Lax/b3/t; {:try_start_7b8 .. :try_end_80b} :catch_85c
    .catch Lax/b3/j; {:try_start_7b8 .. :try_end_80b} :catch_857
    .catchall {:try_start_7b8 .. :try_end_80b} :catchall_75

    goto :goto_84d

    .line 263
    :goto_80c
    :try_start_80c
    invoke-virtual {v8, v3, v0, v6, v6}, Lcom/voxdon/xplorer/file/o;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    :try_end_80f
    .catch Lax/b3/j; {:try_start_80c .. :try_end_80f} :catch_84d
    .catch Lax/b3/a; {:try_start_80c .. :try_end_80f} :catch_84d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_80c .. :try_end_80f} :catch_865
    .catchall {:try_start_80c .. :try_end_80f} :catchall_75

    .line 264
    :goto_80f
    :try_start_80f
    const-string v3, "250 Rename succeeded\r\n"

    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 265
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_5e5

    .line 266
    :cond_81a
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object v8

    const-string v9, "FTP MOVE 2"

    invoke-virtual {v8, v9}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    move-result-object v3

    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    move-result-object v0

    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object v0

    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 267
    :catch_84d
    :goto_84d
    invoke-virtual {v1, v7}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_5e4

    .line 268
    :cond_852
    :goto_852
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_855
    .catch Ljava/lang/IllegalArgumentException; {:try_start_80f .. :try_end_855} :catch_865
    .catch Lax/b3/t; {:try_start_80f .. :try_end_855} :catch_85c
    .catch Lax/b3/j; {:try_start_80f .. :try_end_855} :catch_857
    .catchall {:try_start_80f .. :try_end_855} :catchall_75

    goto/16 :goto_5e4

    .line 269
    :catch_857
    :try_start_857
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 270
    :catch_85c
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 271
    :catch_865
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 272
    :cond_86a
    const-string v0, "RETR"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_870
    .catchall {:try_start_857 .. :try_end_870} :catchall_75

    if-eqz v0, :cond_8d1

    .line 273
    :try_start_872
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 274
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8b9

    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_887

    goto :goto_8b9

    .line 275
    :cond_887
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v0

    .line 276
    invoke-interface {v0}, Lax/c3/b;->n()Z

    move-result v3

    if-nez v3, :cond_89a

    .line 277
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 278
    :cond_89a
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_8b4

    invoke-interface {v0}, Lax/c3/b;->d()Z

    move-result v3

    if-eqz v3, :cond_8b4

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v3

    if-nez v3, :cond_8ad

    goto :goto_8b4

    .line 279
    :cond_8ad
    iget-wide v6, v1, Lcom/voxdon/xplorer/service/a;->A:J

    invoke-direct {v1, v0, v6, v7}, Lcom/voxdon/xplorer/service/a;->J(Lcom/voxdon/xplorer/file/n;J)V

    goto/16 :goto_88

    .line 280
    :cond_8b4
    :goto_8b4
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 281
    :cond_8b9
    :goto_8b9
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_8bc
    .catch Ljava/lang/IllegalArgumentException; {:try_start_872 .. :try_end_8bc} :catch_8cc
    .catch Lax/b3/t; {:try_start_872 .. :try_end_8bc} :catch_8c3
    .catch Lax/b3/j; {:try_start_872 .. :try_end_8bc} :catch_8be
    .catchall {:try_start_872 .. :try_end_8bc} :catchall_75

    goto/16 :goto_88

    .line 282
    :catch_8be
    :try_start_8be
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 283
    :catch_8c3
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 284
    :catch_8cc
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 285
    :cond_8d1
    const-string v0, "REST"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_8d7
    .catchall {:try_start_8be .. :try_end_8d7} :catchall_75

    if-eqz v0, :cond_901

    .line 286
    :try_start_8d9
    invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v1, Lcom/voxdon/xplorer/service/a;->A:J
    :try_end_8e3
    .catch Ljava/lang/NumberFormatException; {:try_start_8d9 .. :try_end_8e3} :catch_8f3
    .catchall {:try_start_8d9 .. :try_end_8e3} :catchall_75

    .line 287
    :try_start_8e3
    const-string v0, "350 REST set\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_8e8
    .catch Ljava/lang/NumberFormatException; {:try_start_8e3 .. :try_end_8e8} :catch_8f1
    .catchall {:try_start_8e3 .. :try_end_8e8} :catchall_8ed

    const/4 v10, 0x0

    const/16 v16, 0x1

    goto/16 :goto_b2d

    :catchall_8ed
    move-exception v0

    const/4 v10, 0x1

    goto/16 :goto_b68

    :catch_8f1
    const/4 v10, 0x1

    goto :goto_8f4

    :catch_8f3
    const/4 v10, 0x0

    .line 288
    :goto_8f4
    :try_start_8f4
    const-string v0, "501 Invalid REST option\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_8f9
    .catchall {:try_start_8f4 .. :try_end_8f9} :catchall_8fe

    move/from16 v16, v10

    const/4 v10, 0x0

    goto/16 :goto_b2d

    :catchall_8fe
    move-exception v0

    goto/16 :goto_b68

    .line 289
    :cond_901
    :try_start_901
    const-string v0, "STOR"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_919

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_912

    goto :goto_91b

    .line 290
    :cond_912
    const-string v0, "550 Unsupported command\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_917
    .catchall {:try_start_901 .. :try_end_917} :catchall_75

    goto/16 :goto_88

    :cond_919
    move-object/from16 v0, v25

    .line 291
    :goto_91b
    :try_start_91b
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 292
    invoke-direct {v1, v6}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_986

    invoke-static {v6}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, v7}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_930

    goto :goto_986

    .line 293
    :cond_930
    invoke-direct {v1, v6}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v6

    .line 294
    invoke-interface {v6}, Lax/c3/b;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_981

    invoke-direct {v1, v6}, Lcom/voxdon/xplorer/service/a;->w(Lcom/voxdon/xplorer/file/n;)Z

    move-result v7

    if-nez v7, :cond_941

    goto :goto_981

    .line 295
    :cond_941
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 296
    invoke-direct {v1, v6}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v3

    .line 297
    iget-wide v9, v1, Lcom/voxdon/xplorer/service/a;->A:J

    const-wide/16 v22, 0x0

    cmp-long v7, v9, v22

    if-lez v7, :cond_968

    if-nez v0, :cond_968

    .line 298
    invoke-interface {v6}, Lax/c3/b;->p()J

    move-result-wide v9

    iget-wide v12, v1, Lcom/voxdon/xplorer/service/a;->A:J

    cmp-long v0, v9, v12

    if-gez v0, :cond_962

    .line 299
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    :cond_962
    const/4 v3, 0x0

    .line 300
    invoke-direct {v1, v6, v3, v12, v13}, Lcom/voxdon/xplorer/service/a;->F(Lcom/voxdon/xplorer/file/n;ZJ)V
    :try_end_966
    .catch Ljava/lang/IllegalArgumentException; {:try_start_91b .. :try_end_966} :catch_999
    .catch Lax/b3/t; {:try_start_91b .. :try_end_966} :catch_990
    .catch Lax/b3/j; {:try_start_91b .. :try_end_966} :catch_98b
    .catchall {:try_start_91b .. :try_end_966} :catchall_75

    goto/16 :goto_88

    .line 301
    :cond_968
    :try_start_968
    invoke-interface {v6}, Lax/c3/b;->n()Z

    move-result v7

    if-eqz v7, :cond_973

    if-nez v0, :cond_973

    .line 302
    invoke-virtual {v3, v6}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    :cond_973
    const-wide/16 v7, 0x0

    .line 303
    invoke-direct {v1, v6, v0, v7, v8}, Lcom/voxdon/xplorer/service/a;->F(Lcom/voxdon/xplorer/file/n;ZJ)V
    :try_end_978
    .catch Lax/b3/j; {:try_start_968 .. :try_end_978} :catch_97a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_968 .. :try_end_978} :catch_999
    .catchall {:try_start_968 .. :try_end_978} :catchall_75

    goto/16 :goto_88

    .line 304
    :catch_97a
    :try_start_97a
    const-string v0, "451 Cannot overwrite the file\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 305
    :cond_981
    :goto_981
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 306
    :cond_986
    :goto_986
    invoke-virtual {v1, v8}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_989
    .catch Ljava/lang/IllegalArgumentException; {:try_start_97a .. :try_end_989} :catch_999
    .catch Lax/b3/t; {:try_start_97a .. :try_end_989} :catch_990
    .catch Lax/b3/j; {:try_start_97a .. :try_end_989} :catch_98b
    .catchall {:try_start_97a .. :try_end_989} :catchall_75

    goto/16 :goto_88

    .line 307
    :catch_98b
    :try_start_98b
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 308
    :catch_990
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_88

    .line 309
    :catch_999
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_99c
    .catchall {:try_start_98b .. :try_end_99c} :catchall_75

    goto/16 :goto_88

    .line 310
    :cond_99e
    :goto_99e
    :try_start_99e
    const-string v0, "-"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_9a4
    .catchall {:try_start_99e .. :try_end_9a4} :catchall_b39

    if-eqz v0, :cond_9b8

    const/4 v0, 0x2

    .line 311
    :try_start_9a7
    invoke-virtual {v4, v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_9b6

    .line 312
    array-length v6, v4

    if-ge v6, v0, :cond_9b1

    goto :goto_9b6

    :cond_9b1
    const/16 v17, 0x1

    .line 313
    aget-object v4, v4, v17
    :try_end_9b5
    .catchall {:try_start_9a7 .. :try_end_9b5} :catchall_75

    goto :goto_99e

    :cond_9b6
    :goto_9b6
    move-object/from16 v4, v21

    .line 314
    :cond_9b8
    :try_start_9b8
    const-string v0, "*"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_9be
    .catchall {:try_start_9b8 .. :try_end_9be} :catchall_b39

    if-eqz v0, :cond_9ca

    .line 315
    :try_start_9c0
    const-string v0, "550 LIST/NLST does not support wildcards\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_9c5
    .catchall {:try_start_9c0 .. :try_end_9c5} :catchall_75

    const-wide/16 v2, 0x0

    .line 316
    iput-wide v2, v1, Lcom/voxdon/xplorer/service/a;->A:J

    return-void

    .line 317
    :cond_9ca
    :try_start_9ca
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_9ce
    .catchall {:try_start_9ca .. :try_end_9ce} :catchall_b39

    if-nez v0, :cond_9d9

    .line 318
    :try_start_9d0
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->f:Ljava/lang/String;

    .line 319
    iget-object v5, v1, Lcom/voxdon/xplorer/service/a;->e:Lcom/voxdon/xplorer/file/n;

    .line 320
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v6
    :try_end_9d8
    .catchall {:try_start_9d0 .. :try_end_9d8} :catchall_75

    goto :goto_9ea

    .line 321
    :cond_9d9
    :try_start_9d9
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_9dd
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9d9 .. :try_end_9dd} :catch_b5f
    .catch Lax/b3/t; {:try_start_9d9 .. :try_end_9dd} :catch_b53
    .catch Lax/b3/j; {:try_start_9d9 .. :try_end_9dd} :catch_b3d
    .catchall {:try_start_9d9 .. :try_end_9dd} :catchall_b39

    .line 322
    :try_start_9dd
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    move-result-object v6

    .line 323
    invoke-direct {v1, v6}, Lcom/voxdon/xplorer/service/a;->p(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/o;

    move-result-object v5
    :try_end_9e5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9dd .. :try_end_9e5} :catch_b43
    .catch Lax/b3/t; {:try_start_9dd .. :try_end_9e5} :catch_b3f
    .catch Lax/b3/j; {:try_start_9dd .. :try_end_9e5} :catch_b3d
    .catchall {:try_start_9dd .. :try_end_9e5} :catchall_b39

    move-object/from16 v32, v6

    move-object v6, v5

    move-object/from16 v5, v32

    .line 324
    :goto_9ea
    :try_start_9ea
    invoke-interface {v5}, Lax/c3/b;->n()Z

    move-result v7
    :try_end_9ee
    .catchall {:try_start_9ea .. :try_end_9ee} :catchall_b39

    if-nez v7, :cond_9fc

    .line 325
    :try_start_9f0
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_9f7
    .catchall {:try_start_9f0 .. :try_end_9f7} :catchall_75

    const-wide/16 v2, 0x0

    .line 326
    iput-wide v2, v1, Lcom/voxdon/xplorer/service/a;->A:J

    return-void

    .line 327
    :cond_9fc
    :try_start_9fc
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 328
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 329
    invoke-interface {v5}, Lax/c3/b;->isDirectory()Z

    move-result v8
    :try_end_a08
    .catchall {:try_start_9fc .. :try_end_a08} :catchall_b39

    if-eqz v8, :cond_b0d

    .line 330
    :try_start_a0a
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/service/a;->v(Ljava/lang/String;)Z

    move-result v0
    :try_end_a0e
    .catch Lax/b3/e; {:try_start_a0a .. :try_end_a0e} :catch_a6e
    .catch Lax/b3/j; {:try_start_a0a .. :try_end_a0e} :catch_a6c
    .catchall {:try_start_a0a .. :try_end_a0e} :catchall_75

    if-eqz v0, :cond_a4c

    .line 331
    :try_start_a10
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
    :try_end_a15
    .catch Lax/b3/e; {:try_start_a10 .. :try_end_a15} :catch_a47
    .catch Lax/b3/j; {:try_start_a10 .. :try_end_a15} :catch_a42
    .catchall {:try_start_a10 .. :try_end_a15} :catchall_75

    .line 332
    :try_start_a15
    iget-object v0, v1, Lcom/voxdon/xplorer/service/a;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a1b
    :goto_a1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a3f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lax/c3/K;

    .line 333
    iget-object v8, v1, Lcom/voxdon/xplorer/service/a;->v:Ljava/util/Map;

    invoke-interface {v8, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/voxdon/xplorer/file/n;

    if-eqz v5, :cond_a1b

    .line 334
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_a34
    .catch Lax/b3/e; {:try_start_a15 .. :try_end_a34} :catch_a3a
    .catch Lax/b3/j; {:try_start_a15 .. :try_end_a34} :catch_a35
    .catchall {:try_start_a15 .. :try_end_a34} :catchall_75

    goto :goto_a1b

    :catch_a35
    nop

    move-object/from16 v24, v6

    const/4 v6, 0x0

    goto :goto_a70

    :catch_a3a
    nop

    move-object/from16 v24, v6

    const/4 v6, 0x0

    goto :goto_a73

    :cond_a3f
    move-object v0, v6

    const/4 v6, 0x0

    goto :goto_a62

    :catch_a42
    nop

    const/4 v6, 0x0

    const/16 v24, 0x0

    goto :goto_a70

    :catch_a47
    nop

    const/4 v6, 0x0

    const/16 v24, 0x0

    goto :goto_a73

    .line 335
    :cond_a4c
    :try_start_a4c
    invoke-virtual {v6, v5}, Lcom/voxdon/xplorer/file/o;->f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    move-result-object v0

    .line 336
    iget-boolean v5, v1, Lcom/voxdon/xplorer/service/a;->z:Z
    :try_end_a52
    .catch Lax/b3/e; {:try_start_a4c .. :try_end_a52} :catch_a6e
    .catch Lax/b3/j; {:try_start_a4c .. :try_end_a52} :catch_a6c
    .catchall {:try_start_a4c .. :try_end_a52} :catchall_75

    const/4 v6, 0x0

    const/4 v10, 0x1

    :try_start_a54
    invoke-static {v0, v6, v5, v10}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    .line 337
    const-string v5, "NameUp"

    invoke-static {v5}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    move-result-object v5

    invoke-static {v0, v5}, Lax/c3/q;->g(Ljava/util/List;Lax/c3/q;)Ljava/util/List;

    move-result-object v0
    :try_end_a62
    .catch Lax/b3/e; {:try_start_a54 .. :try_end_a62} :catch_a68
    .catch Lax/b3/j; {:try_start_a54 .. :try_end_a62} :catch_a64
    .catchall {:try_start_a54 .. :try_end_a62} :catchall_75

    :goto_a62
    const/4 v10, 0x0

    goto :goto_a76

    :catch_a64
    :goto_a64
    nop

    move-object/from16 v24, v6

    goto :goto_a70

    :catch_a68
    :goto_a68
    nop

    move-object/from16 v24, v6

    goto :goto_a73

    :catch_a6c
    const/4 v6, 0x0

    goto :goto_a64

    :catch_a6e
    const/4 v6, 0x0

    goto :goto_a68

    :goto_a70
    move-object/from16 v0, v24

    goto :goto_a62

    :goto_a73
    move-object/from16 v0, v24

    const/4 v10, 0x1

    :goto_a76
    if-eqz v0, :cond_afd

    .line 338
    :try_start_a78
    invoke-direct {v1}, Lcom/voxdon/xplorer/service/a;->B()Ljava/net/Socket;

    move-result-object v5

    if-nez v5, :cond_a8c

    .line 339
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 340
    const-string v0, "425 Error opening data socket\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_a86
    .catchall {:try_start_a78 .. :try_end_a86} :catchall_75

    const-wide/16 v2, 0x0

    .line 341
    :goto_a88
    iput-wide v2, v1, Lcom/voxdon/xplorer/service/a;->A:J

    goto/16 :goto_b67

    .line 342
    :cond_a8c
    :try_start_a8c
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "150 Opening %s mode data connection for %s\r\n"

    iget-boolean v10, v1, Lcom/voxdon/xplorer/service/a;->g:Z

    if-eqz v10, :cond_a9d

    const-string v10, "BINARY"

    :goto_a96
    const/4 v11, 0x2

    goto :goto_aa0

    :catchall_a98
    move-exception v0

    goto :goto_af9

    :catch_a9a
    move-object/from16 v3, v20

    goto :goto_af5

    :cond_a9d
    const-string v10, "ASCII"

    goto :goto_a96

    :goto_aa0
    new-array v11, v11, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v10, v11, v16

    const/16 v17, 0x1

    aput-object v3, v11, v17

    invoke-static {v8, v9, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    .line 343
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->N(Ljava/net/Socket;)Z

    move-result v3
    :try_end_ab5
    .catch Ljava/io/IOException; {:try_start_a8c .. :try_end_ab5} :catch_a9a
    .catchall {:try_start_a8c .. :try_end_ab5} :catchall_a98

    if-nez v3, :cond_ac2

    move-object/from16 v3, v20

    .line 344
    :try_start_ab9
    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_abc
    .catch Ljava/io/IOException; {:try_start_ab9 .. :try_end_abc} :catch_af5
    .catchall {:try_start_ab9 .. :try_end_abc} :catchall_a98

    .line 345
    :goto_abc
    :try_start_abc
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V
    :try_end_abf
    .catchall {:try_start_abc .. :try_end_abf} :catchall_75

    const-wide/16 v2, 0x0

    goto :goto_a88

    :cond_ac2
    move-object/from16 v3, v20

    .line 346
    :try_start_ac4
    invoke-virtual {v5}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v8

    .line 347
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_acc
    :goto_acc
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_ae8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/voxdon/xplorer/file/n;

    .line 348
    invoke-direct {v1, v9, v7, v4}, Lcom/voxdon/xplorer/service/a;->g(Lcom/voxdon/xplorer/file/n;ZZ)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_acc

    .line 349
    invoke-virtual {v9}, Ljava/lang/String;->getBytes()[B

    move-result-object v9

    .line 350
    array-length v10, v9

    const/4 v11, 0x0

    invoke-virtual {v8, v9, v11, v10}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_acc

    .line 351
    :cond_ae8
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V

    .line 352
    const-string v0, "226 Data transmission succeeded\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_af0
    .catch Ljava/io/IOException; {:try_start_ac4 .. :try_end_af0} :catch_af5
    .catchall {:try_start_ac4 .. :try_end_af0} :catchall_a98

    .line 353
    :try_start_af0
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V
    :try_end_af3
    .catchall {:try_start_af0 .. :try_end_af3} :catchall_75

    goto/16 :goto_89

    .line 354
    :catch_af5
    :goto_af5
    :try_start_af5
    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_af8
    .catchall {:try_start_af5 .. :try_end_af8} :catchall_a98

    goto :goto_abc

    .line 355
    :goto_af9
    :try_start_af9
    invoke-direct {v1, v5}, Lcom/voxdon/xplorer/service/a;->f(Ljava/net/Socket;)V

    .line 356
    throw v0

    :cond_afd
    if-eqz v10, :cond_b06

    .line 357
    const-string v0, "550 Permission denied\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_89

    :cond_b06
    move-object/from16 v0, v19

    .line 358
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_89

    :cond_b0d
    move-object/from16 v0, v19

    const/4 v6, 0x0

    if-eqz v7, :cond_b1c

    .line 359
    const-string v0, "501 Not a directory\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_b17
    .catchall {:try_start_af9 .. :try_end_b17} :catchall_75

    const-wide/16 v2, 0x0

    .line 360
    iput-wide v2, v1, Lcom/voxdon/xplorer/service/a;->A:J

    return-void

    :cond_b1c
    const/4 v7, 0x0

    .line 361
    :try_start_b1d
    invoke-direct {v1, v5, v7, v4}, Lcom/voxdon/xplorer/service/a;->g(Lcom/voxdon/xplorer/file/n;ZZ)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b27

    .line 362
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto :goto_b2a

    .line 363
    :cond_b27
    invoke-direct {v1, v3, v4}, Lcom/voxdon/xplorer/service/a;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b2a
    .catchall {:try_start_b1d .. :try_end_b2a} :catchall_75

    :goto_b2a
    move-object v10, v6

    goto/16 :goto_5e5

    .line 364
    :goto_b2d
    :try_start_b2d
    iput-object v10, v2, Lcom/voxdon/xplorer/service/a$a;->a:Ljava/lang/String;
    :try_end_b2f
    .catchall {:try_start_b2d .. :try_end_b2f} :catchall_b35

    if-nez v16, :cond_b67

    const-wide/16 v2, 0x0

    goto/16 :goto_a88

    :catchall_b35
    move-exception v0

    move/from16 v10, v16

    goto :goto_b68

    :catchall_b39
    move-exception v0

    const/4 v7, 0x0

    goto/16 :goto_76

    :catch_b3d
    const/4 v7, 0x0

    goto :goto_b47

    :catch_b3f
    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    goto :goto_b56

    :catch_b43
    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    goto :goto_b62

    .line 365
    :goto_b47
    :try_start_b47
    invoke-virtual {v1, v5}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_b4a
    .catchall {:try_start_b47 .. :try_end_b4a} :catchall_b4e

    const-wide/16 v2, 0x0

    goto/16 :goto_a88

    :catchall_b4e
    move-exception v0

    const-wide/16 v2, 0x0

    goto/16 :goto_76

    :catch_b53
    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    .line 366
    :goto_b56
    :try_start_b56
    invoke-direct {v1, v4}, Lcom/voxdon/xplorer/service/a;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    goto/16 :goto_a88

    :catch_b5f
    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    .line 367
    :goto_b62
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V
    :try_end_b65
    .catchall {:try_start_b56 .. :try_end_b65} :catchall_75

    goto/16 :goto_a88

    :cond_b67
    :goto_b67
    return-void

    :goto_b68
    if-nez v10, :cond_b6e

    const-wide/16 v2, 0x0

    .line 368
    iput-wide v2, v1, Lcom/voxdon/xplorer/service/a;->A:J

    .line 369
    :cond_b6e
    throw v0

    .line 370
    :cond_b6f
    :goto_b6f
    const-string v0, "502 Command not recognized\r\n"

    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/service/a;->O(Ljava/lang/String;)V

    return-void
.end method

.method public O(Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/a;->P([B)V

    .line 6
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
.end method

.method public P([B)V
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->c:Ljava/io/BufferedOutputStream;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/voxdon/xplorer/service/a;->c:Ljava/io/BufferedOutputStream;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_a} :catch_b

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_b
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/a;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->u:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2e

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/voxdon/xplorer/file/o;

    .line 25
    .line 26
    invoke-static {}, Lax/X2/Q;->X1()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_29

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->Y()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_29

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/file/o;->n(Lax/g3/i;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_d

    .line 47
    :cond_2e
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->u:Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->x:Ljava/util/Map;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->v:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->w:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 65
    .line 66
    .line 67
    return-void
    .line 68
.end method

.method m()Ljava/io/InputStream;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method n()Ljava/io/BufferedOutputStream;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->c:Ljava/io/BufferedOutputStream;

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

.method public t()V
    .registers 15

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/a;->o:Ljava/util/HashSet;

    .line 2
    .line 3
    sget-object v1, Lcom/voxdon/xplorer/service/a;->F:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lax/Z2/j;->K0()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lax/c3/K;->e:Lax/c3/K;

    .line 20
    .line 21
    const-string v1, "/device"

    .line 22
    .line 23
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/service/a;->b(Lax/c3/K;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v5, Lax/c3/K;->h:Lax/c3/K;

    .line 27
    .line 28
    invoke-static {v5}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v2, Lcom/voxdon/xplorer/file/y;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v3, v0

    .line 39
    check-cast v3, Lcom/voxdon/xplorer/file/x;

    .line 40
    .line 41
    new-instance v4, Ljava/io/File;

    .line 42
    .line 43
    const-string v0, "/"

    .line 44
    .line 45
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-wide/16 v10, 0x0

    .line 49
    .line 50
    const-wide/16 v12, 0x0

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x1

    .line 55
    const/4 v9, 0x0

    .line 56
    invoke-direct/range {v2 .. v13}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;ZZZZJJ)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, Lcom/voxdon/xplorer/service/a;->d:Lcom/voxdon/xplorer/file/n;

    .line 60
    .line 61
    invoke-direct {p0, v2, v0}, Lcom/voxdon/xplorer/service/a;->M(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lax/Z2/j;->t0()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput-boolean v1, p0, Lcom/voxdon/xplorer/service/a;->y:Z

    .line 73
    .line 74
    const-string v2, "/sdcard"

    .line 75
    .line 76
    if-eqz v1, :cond_52

    .line 77
    .line 78
    sget-object v1, Lax/c3/K;->f:Lax/c3/K;

    .line 79
    .line 80
    invoke-direct {p0, v1, v2}, Lcom/voxdon/xplorer/service/a;->b(Lax/c3/K;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_52
    iget-boolean v1, p0, Lcom/voxdon/xplorer/service/a;->z:Z

    .line 84
    .line 85
    if-eqz v1, :cond_63

    .line 86
    .line 87
    iget-object v1, p0, Lcom/voxdon/xplorer/service/a;->a:Landroid/content/Context;

    .line 88
    .line 89
    invoke-static {v1}, Lax/t3/j;->B(Landroid/content/Context;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_63

    .line 94
    .line 95
    const-string v1, "/system"

    .line 96
    .line 97
    invoke-direct {p0, v5, v1}, Lcom/voxdon/xplorer/service/a;->b(Lax/c3/K;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_63
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, Lax/Z2/j;->A()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const/4 v3, 0x2

    .line 109
    if-eqz v1, :cond_a0

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const/4 v4, 0x2

    .line 116
    :goto_73
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_a0

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Lax/c3/K;

    .line 127
    .line 128
    invoke-virtual {v5}, Lax/c3/K;->d()Lax/Q2/f;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v6}, Lax/Q2/f;->j0(Lax/Q2/f;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-nez v6, :cond_8a

    .line 137
    .line 138
    goto :goto_73

    .line 139
    :cond_8a
    new-instance v6, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    add-int/lit8 v7, v4, 0x1

    .line 148
    .line 149
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-direct {p0, v5, v4}, Lcom/voxdon/xplorer/service/a;->b(Lax/c3/K;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    move v4, v7

    .line 160
    goto :goto_73

    .line 161
    :cond_a0
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1}, Lax/Z2/j;->B()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v2, Ljava/util/HashSet;

    .line 170
    .line 171
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 172
    .line 173
    .line 174
    if-eqz v1, :cond_106

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    :goto_b3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_106

    .line 185
    .line 186
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Lax/c3/K;

    .line 191
    .line 192
    invoke-virtual {v4}, Lax/c3/K;->d()Lax/Q2/f;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-static {v5}, Lax/Q2/f;->Y(Lax/Q2/f;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-nez v5, :cond_ca

    .line 201
    .line 202
    goto :goto_b3

    .line 203
    :cond_ca
    iget-object v5, p0, Lcom/voxdon/xplorer/service/a;->a:Landroid/content/Context;

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    move-object v6, v5

    .line 210
    const/4 v7, 0x2

    .line 211
    :goto_d2
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_f0

    .line 216
    .line 217
    new-instance v6, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v8, " "

    .line 226
    .line 227
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    add-int/lit8 v8, v7, 0x1

    .line 231
    .line 232
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    move v7, v8

    .line 240
    goto :goto_d2

    .line 241
    :cond_f0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-direct {p0, v4, v5}, Lcom/voxdon/xplorer/service/a;->b(Lax/c3/K;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_b3

    .line 263
    :cond_106
    return-void
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
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
