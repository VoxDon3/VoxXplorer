.class public Lcom/voxdon/xplorer/file/OneDriveFileHelper;
.super Lcom/voxdon/xplorer/file/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;,
        Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItem;,
        Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;,
        Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItemUploadableProperties;
    }
.end annotation


# static fields
.field private static final l:Ljava/util/logging/Logger;

.field static m:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

.field static n:I

.field static o:I


# instance fields
.field private final h:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lax/N9/e0;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/microsoft/graph/extensions/Drive;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.OneDriveFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->l:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const/high16 v0, 0x100000

    .line 10
    .line 11
    sput v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->n:I

    .line 12
    .line 13
    const/high16 v0, 0x500000

    .line 14
    .line 15
    sput v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->o:I

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->j:Ljava/util/Map;

    .line 24
    .line 25
    const-string v0, "/"

    .line 26
    .line 27
    const-string v1, "/drive/root"

    .line 28
    .line 29
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->s0(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method private A0(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/M9/d;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->M0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/drive/root"

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    move-object v0, v1

    .line 10
    goto :goto_e

    .line 11
    :cond_a
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_e
    if-nez v0, :cond_1e

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->P0(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_19

    .line 22
    .line 23
    if-eqz p2, :cond_19

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_19
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1e
    return-object v0
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

.method private B0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_d
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private C0(Ljava/lang/String;)Lcom/microsoft/graph/extensions/ItemReference;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/microsoft/graph/extensions/ItemReference;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/microsoft/graph/extensions/ItemReference;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->A0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "/drive/root"

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_4c

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->I0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "/drives/"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "/root:"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "/"

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_42

    .line 64
    .line 65
    const-string p1, ""

    .line 66
    .line 67
    :cond_42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, v0, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4c
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object v2, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->O0(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ":"

    .line 96
    .line 97
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, v0, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 108
    .line 109
    return-object v0
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

.method private D0(Lax/c3/T;ZZ)Lax/N9/U;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/c3/T;->f0()Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1c

    .line 6
    .line 7
    if-nez p2, :cond_14

    .line 8
    .line 9
    :try_start_8
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->E0(Ljava/lang/String;Z)Lax/N9/U;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :catch_12
    move-exception p1

    .line 20
    goto :goto_4c

    .line 21
    :cond_14
    new-instance p1, Lax/b3/t;

    .line 22
    .line 23
    const-string p2, "item not exist"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1c
    iget-object p1, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 30
    .line 31
    if-eqz p1, :cond_39

    .line 32
    .line 33
    if-eqz p3, :cond_39

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z0()Lax/N9/e0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p2, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 40
    .line 41
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseRemoteItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 42
    .line 43
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {p1, p2}, Lax/O9/F;->e(Ljava/lang/String;)Lax/N9/b0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p2, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 50
    .line 51
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseRemoteItem;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {p1, p2}, Lax/O9/E;->n(Ljava/lang/String;)Lax/N9/U;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_39
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z0()Lax/N9/e0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p2, v0, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 63
    .line 64
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {p1, p2}, Lax/O9/F;->e(Ljava/lang/String;)Lax/N9/b0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p2, v0, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {p1, p2}, Lax/O9/E;->n(Ljava/lang/String;)Lax/N9/U;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_4b
    .catch Ljava/lang/NullPointerException; {:try_start_8 .. :try_end_4b} :catch_12

    .line 76
    return-object p1

    .line 77
    :goto_4c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    const-string p3, "Item request builder"

    .line 86
    .line 87
    invoke-virtual {p2, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 96
    .line 97
    .line 98
    new-instance p2, Lax/b3/j;

    .line 99
    .line 100
    const-string p3, "no onedrive item"

    .line 101
    .line 102
    invoke-direct {p2, p3, p1}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw p2
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

.method private E0(Ljava/lang/String;Z)Lax/N9/U;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->A0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "/drive/root"

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->L0()Lax/N9/U;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_29

    .line 18
    :cond_11
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->x0(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z0()Lax/N9/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1, v0}, Lax/O9/F;->e(Ljava/lang/String;)Lax/N9/b0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, p2}, Lax/O9/E;->n(Ljava/lang/String;)Lax/N9/U;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->O0(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_29
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_4b

    .line 47
    .line 48
    const-string v0, "/"

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_4b

    .line 55
    .line 56
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_42

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_42
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p2, p1}, Lax/N9/U;->h(Ljava/lang/String;)Lax/N9/U;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_4b
    return-object p2
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

.method private F0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->j:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_d
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static G0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->m:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->m:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 15
    .line 16
    :cond_f
    sget-object p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->m:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private K0()Lax/N9/b0;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z0()Lax/N9/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->I0()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lax/O9/F;->e(Ljava/lang/String;)Lax/N9/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private L0()Lax/N9/U;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->K0()Lax/N9/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lax/O9/E;->g()Lax/N9/U;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method private M0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 6
    .line 7
    .line 8
    const-string v0, "/"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    array-length v0, p1

    .line 15
    const/4 v1, 0x2

    .line 16
    if-ge v0, v1, :cond_13

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_13
    const/4 v0, 0x1

    .line 21
    aget-object p1, p1, v0

    .line 22
    .line 23
    return-object p1
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

.method private O0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 6
    .line 7
    .line 8
    const-string v0, "/"

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gez v0, :cond_13

    .line 16
    .line 17
    const-string p1, ""

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_13
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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

.method private P0(Ljava/lang/String;)Z
    .registers 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    array-length p1, p1

    .line 8
    const/4 v0, 0x2

    .line 9
    if-ne p1, v0, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private Q0(Lcom/microsoft/graph/extensions/DriveItem;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_2a

    .line 5
    .line 6
    iget-object v0, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "root"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_29

    .line 15
    .line 16
    iget-object v0, p1, Lcom/microsoft/graph/generated/BaseDriveItem;->E:Lcom/microsoft/graph/extensions/Root;

    .line 17
    .line 18
    if-nez v0, :cond_29

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "no parent not root? : "

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    return v1

    .line 43
    :cond_2a
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v0, :cond_3b

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->I0()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1

    .line 60
    :cond_3b
    const-string v2, "/drive/root:"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_44

    .line 67
    .line 68
    return v1

    .line 69
    :cond_44
    iget-object v0, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 72
    .line 73
    const-string v2, "/drives/"

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5d

    .line 80
    .line 81
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 82
    .line 83
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 84
    .line 85
    const-string v0, "/root:"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5d

    .line 92
    .line 93
    return v1

    .line 94
    :cond_5d
    const/4 p1, 0x0

    .line 95
    return p1
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

.method private R0(Lax/c3/T;)Ljava/util/List;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c3/T;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    :try_start_a
    invoke-direct {p0, p1, v2, v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v3}, Lax/O9/y;->b()Lax/N9/N;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Lax/O9/s;->a()Lax/N9/M;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "thumbnails"

    .line 24
    .line 25
    invoke-interface {v3, v4}, Lax/O9/r;->f(Ljava/lang/String;)Lax/N9/M;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3}, Lax/O9/r;->get()Lcom/microsoft/graph/extensions/IDriveItemCollectionPage;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_23

    .line 34
    .line 35
    goto :goto_24

    .line 36
    :cond_23
    const/4 v2, 0x0

    .line 37
    :goto_24
    invoke-static {v2}, Lax/u3/b;->c(Z)V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-interface {v3}, Lcom/microsoft/graph/http/IBaseCollectionPage;->b()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :cond_2f
    :goto_2f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_5a

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lcom/microsoft/graph/extensions/DriveItem;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iget-object v6, v4, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v5, v6}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v6, Lax/c3/T;

    .line 71
    .line 72
    invoke-direct {v6, p0, v4, v5}, Lax/c3/T;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lcom/microsoft/graph/extensions/DriveItem;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    if-eqz v1, :cond_2f

    .line 79
    .line 80
    invoke-direct {p0, v4}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->t0(Lcom/microsoft/graph/extensions/DriveItem;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    goto :goto_2f

    .line 84
    :catch_53
    move-exception p1

    .line 85
    goto :goto_75

    .line 86
    :catch_55
    move-exception v0

    .line 87
    goto :goto_ac

    .line 88
    :catch_57
    move-exception p1

    .line 89
    goto/16 :goto_e0

    .line 90
    .line 91
    :cond_5a
    invoke-interface {v3}, Lcom/microsoft/graph/http/IBaseCollectionPage;->a()Lax/P9/p;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-eqz v2, :cond_70

    .line 96
    .line 97
    invoke-interface {v3}, Lcom/microsoft/graph/http/IBaseCollectionPage;->a()Lax/P9/p;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lax/N9/N;

    .line 102
    .line 103
    invoke-interface {v2}, Lax/O9/s;->a()Lax/N9/M;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v2}, Lax/O9/r;->get()Lcom/microsoft/graph/extensions/IDriveItemCollectionPage;

    .line 108
    .line 109
    .line 110
    move-result-object v2
    :try_end_6e
    .catch Lax/M9/d; {:try_start_a .. :try_end_6e} :catch_57
    .catch Ljava/lang/NullPointerException; {:try_start_a .. :try_end_6e} :catch_55
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_6e} :catch_53

    .line 111
    :goto_6e
    move-object v3, v2

    .line 112
    goto :goto_72

    .line 113
    :cond_70
    const/4 v2, 0x0

    .line 114
    goto :goto_6e

    .line 115
    :goto_72
    if-nez v3, :cond_27

    .line 116
    .line 117
    return-object v0

    .line 118
    :goto_75
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v2, "!! OneDrive listChildren OOM"

    .line 134
    .line 135
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v3, "children:"

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 165
    .line 166
    .line 167
    new-instance v0, Lax/b3/j;

    .line 168
    .line 169
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :goto_ac
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-string v2, "!! OneDrive listChildren NullPointError"

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    new-instance v2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v3, "path:"

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {v1, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 217
    .line 218
    .line 219
    new-instance p1, Lax/b3/j;

    .line 220
    .line 221
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :goto_e0
    const-string v0, "listchildren"

    .line 226
    .line 227
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    throw p1
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

.method private S0()V
    .registers 9

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "OneDrivePrefs"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lax/c3/c0;

    .line 13
    .line 14
    sget-object v3, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 15
    .line 16
    invoke-direct {v1, v3}, Lax/c3/c0;-><init>(Lax/Q2/f;)V

    .line 17
    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v5, "version_"

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/4 v5, 0x0

    .line 45
    const-string v6, "refresh_token_"

    .line 46
    .line 47
    if-nez v4, :cond_48

    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_6b

    .line 73
    :cond_48
    invoke-static {}, Lax/Y2/a;->a()Lax/Y2/a;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7, v3}, Lax/Y2/a;->b(Lax/Q2/f;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    new-instance v7, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v4, v3, v0}, Lax/c3/c0;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_6b
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v3, "com.microsoft.live"

    .line 113
    .line 114
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v2, "refresh_token"

    .line 123
    .line 124
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 129
    .line 130
    .line 131
    return-void
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

.method private static declared-synchronized T0(Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;Lax/L9/c;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Lax/L9/c<",
            "Lax/N9/e0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-class v1, Lcom/voxdon/xplorer/file/OneDriveFileHelper;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    invoke-static {v5}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->v0(Landroid/content/Context;)Lax/N9/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-interface {v4}, Lax/M9/f;->c()Lax/K9/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lax/K9/b;

    .line 17
    .line 18
    new-instance v2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$h;

    .line 19
    .line 20
    move-object v6, p1

    .line 21
    move-object v7, p2

    .line 22
    move-object v3, p3

    .line 23
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$h;-><init>(Lax/L9/c;Lax/N9/e0;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lax/K9/b;->j(Lax/L9/c;)V
    :try_end_1c
    .catchall {:try_start_3 .. :try_end_1c} :catchall_1e

    .line 27
    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return-void

    .line 31
    :catchall_1e
    move-exception v0

    .line 32
    move-object p0, v0

    .line 33
    :try_start_20
    monitor-exit v1
    :try_end_21
    .catchall {:try_start_20 .. :try_end_21} :catchall_1e

    .line 34
    throw p0
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

.method private U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z0()Lax/N9/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lax/O9/F;->e(Ljava/lang/String;)Lax/N9/b0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1, p2}, Lax/O9/E;->n(Ljava/lang/String;)Lax/N9/U;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lax/O9/y;->a()Lax/N9/T;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Lax/O9/x;->get()Lcom/microsoft/graph/extensions/DriveItem;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

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

.method private V0(Lax/N9/e0;Lax/d3/a0;)V
    .registers 4

    .line 1
    invoke-interface {p1}, Lax/O9/F;->d()Lax/N9/E0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lax/O9/H;->a()Lax/N9/D0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$a;

    .line 10
    .line 11
    invoke-direct {v0, p0, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$a;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lax/d3/a0;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Lax/O9/G;->c(Lax/L9/c;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method private W0(Ljava/lang/String;)V
    .registers 4

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_6
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->j:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p1, :cond_18

    .line 16
    .line 17
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catchall_16
    move-exception p1

    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    :goto_18
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1a
    monitor-exit v0
    :try_end_1b
    .catchall {:try_start_6 .. :try_end_1b} :catchall_16

    .line 28
    throw p1
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

.method private static X0(Landroid/content/Context;)V
    .registers 3

    .line 1
    const-string v0, "com.microsoft.live"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "refresh_token"

    .line 13
    .line 14
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    const-string v1, "cookies"

    .line 18
    .line 19
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 23
    .line 24
    .line 25
    :try_start_18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/webkit/CookieSyncManager;->sync()V
    :try_end_2b
    .catch Landroid/util/AndroidRuntimeException; {:try_start_18 .. :try_end_2b} :catch_2b
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_18 .. :try_end_2b} :catch_2b

    .line 42
    .line 43
    .line 44
    :catch_2b
    return-void
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

.method private Y0(Lax/N9/e0;)V
    .registers 8

    .line 1
    invoke-interface {p1}, Lax/M9/f;->c()Lax/K9/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/K9/b;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/K9/b;->f()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-instance v1, Lax/c3/c0;

    .line 16
    .line 17
    sget-object v2, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 18
    .line 19
    invoke-direct {v1, v2}, Lax/c3/c0;-><init>(Lax/Q2/f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "OneDrivePrefs"

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v5, "version_"

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const/4 v5, 0x3

    .line 55
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v5, "refresh_token_"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {}, Lax/Y2/a;->a()Lax/Y2/a;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4, v2}, Lax/Y2/a;->b(Lax/Q2/f;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2, p1}, Lax/c3/c0;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {v3, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 93
    .line 94
    .line 95
    return-void
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

.method private Z0(Lax/c3/T;J)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :catch_2
    :goto_2
    const/4 v2, 0x1

    .line 4
    :try_start_3
    new-instance v3, Lcom/microsoft/graph/extensions/DriveItem;

    .line 5
    .line 6
    invoke-direct {v3}, Lcom/microsoft/graph/extensions/DriveItem;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v4, Lcom/microsoft/graph/extensions/FileSystemInfo;

    .line 10
    .line 11
    invoke-direct {v4}, Lcom/microsoft/graph/extensions/FileSystemInfo;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {v5, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 19
    .line 20
    .line 21
    iput-object v5, v4, Lcom/microsoft/graph/generated/BaseFileSystemInfo;->e:Ljava/util/Calendar;

    .line 22
    .line 23
    iput-object v4, v3, Lcom/microsoft/graph/generated/BaseDriveItem;->w:Lcom/microsoft/graph/extensions/FileSystemInfo;

    .line 24
    .line 25
    invoke-direct {p0, p1, v0, v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v4}, Lax/O9/y;->a()Lax/N9/T;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v4, v3}, Lax/O9/x;->j(Lcom/microsoft/graph/extensions/DriveItem;)Lcom/microsoft/graph/extensions/DriveItem;
    :try_end_23
    .catch Lax/M9/d; {:try_start_3 .. :try_end_23} :catch_24

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_24
    move-exception v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-eqz v4, :cond_44

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "409 :"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_44

    .line 55
    .line 56
    add-int/2addr v1, v2

    .line 57
    const/4 v2, 0x3

    .line 58
    if-ge v1, v2, :cond_44

    .line 59
    .line 60
    const-wide/16 v2, 0x1f4

    .line 61
    .line 62
    int-to-long v4, v1

    .line 63
    mul-long v4, v4, v2

    .line 64
    .line 65
    :try_start_40
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_43} :catch_2

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_44
    const-string p1, "setLastModified"

    .line 70
    .line 71
    invoke-direct {p0, p1, v3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    throw p1
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

.method private a1(Ljava/lang/String;)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/M9/d;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->M0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_c

    .line 6
    .line 7
    invoke-static {}, Lax/u3/b;->f()V

    .line 8
    .line 9
    .line 10
    const-string p1, "/drive/root"

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_c
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->L0()Lax/N9/U;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p1}, Lax/N9/U;->h(Ljava/lang/String;)Lax/N9/U;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Lax/O9/y;->a()Lax/N9/T;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Lax/O9/x;->get()Lcom/microsoft/graph/extensions/DriveItem;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->t0(Lcom/microsoft/graph/extensions/DriveItem;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
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

.method private b1(Lax/N9/U;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItemUploadableProperties;

    .line 9
    .line 10
    invoke-direct {v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItemUploadableProperties;-><init>()V

    .line 11
    .line 12
    .line 13
    if-eqz p6, :cond_13

    .line 14
    .line 15
    const-string v3, "replace"

    .line 16
    .line 17
    iput-object v3, v2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItemUploadableProperties;->h:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_17

    .line 20
    :cond_13
    const-string v3, "fail"

    .line 21
    .line 22
    iput-object v3, v2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItemUploadableProperties;->h:Ljava/lang/String;

    .line 23
    .line 24
    :goto_17
    if-eqz p5, :cond_2d

    .line 25
    .line 26
    new-instance v3, Lcom/microsoft/graph/extensions/FileSystemInfo;

    .line 27
    .line 28
    invoke-direct {v3}, Lcom/microsoft/graph/extensions/FileSystemInfo;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    invoke-virtual {v4, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 40
    .line 41
    .line 42
    iput-object v4, v3, Lcom/microsoft/graph/generated/BaseFileSystemInfo;->e:Ljava/util/Calendar;

    .line 43
    .line 44
    iput-object v3, v2, Lcom/microsoft/graph/generated/BaseDriveItemUploadableProperties;->d:Lcom/microsoft/graph/extensions/FileSystemInfo;

    .line 45
    .line 46
    :cond_2d
    :try_start_2d
    invoke-interface {p1, v2}, Lax/O9/y;->m(Lcom/microsoft/graph/extensions/DriveItemUploadableProperties;)Lax/N9/S;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1}, Lax/O9/w;->a()Lax/N9/Q;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lax/O9/v;->e()Lcom/microsoft/graph/extensions/UploadSession;

    .line 55
    .line 56
    .line 57
    move-result-object v3
    :try_end_39
    .catch Lax/M9/d; {:try_start_2d .. :try_end_39} :catch_8b

    .line 58
    new-instance v2, Lcom/voxdon/xplorer/file/E;

    .line 59
    .line 60
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z0()Lax/N9/e0;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-class v8, Lcom/microsoft/graph/extensions/DriveItem;

    .line 65
    .line 66
    move-object v5, p2

    .line 67
    move-wide v6, p3

    .line 68
    invoke-direct/range {v2 .. v8}, Lcom/voxdon/xplorer/file/E;-><init>(Lcom/microsoft/graph/extensions/UploadSession;Lax/N9/e0;Lax/c3/G;JLjava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    :try_start_4b
    new-instance p2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$f;

    .line 77
    .line 78
    move-object/from16 p3, p8

    .line 79
    .line 80
    invoke-direct {p2, p0, p3, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$f;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lax/g3/i;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 81
    .line 82
    .line 83
    sget p3, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->o:I

    .line 84
    .line 85
    filled-new-array {p3}, [I

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {v2, p1, v0, p2, p3}, Lcom/voxdon/xplorer/file/E;->a(Ljava/util/List;Lax/u3/c;Lax/L9/e;[I)V

    .line 90
    .line 91
    .line 92
    if-eqz v0, :cond_6d

    .line 93
    .line 94
    invoke-interface {v0}, Lax/u3/c;->isCancelled()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_64

    .line 99
    .line 100
    goto :goto_6d

    .line 101
    :cond_64
    new-instance p1, Lax/b3/a;

    .line 102
    .line 103
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :catch_6a
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    goto :goto_81

    .line 110
    :cond_6d
    :goto_6d
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_74

    .line 115
    .line 116
    return-void

    .line 117
    :cond_74
    const-string p1, "onedrive uploadFile 2"

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, Lax/M9/d;

    .line 124
    .line 125
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    throw p1
    :try_end_81
    .catch Ljava/io/IOException; {:try_start_4b .. :try_end_81} :catch_6a

    .line 130
    :goto_81
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 131
    .line 132
    .line 133
    const-string p2, "onedrive chunked upload"

    .line 134
    .line 135
    invoke-static {p2, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    throw p1

    .line 140
    :catch_8b
    move-exception v0

    .line 141
    move-object p1, v0

    .line 142
    const-string p2, "uploadChunk"

    .line 143
    .line 144
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    throw p1
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
.end method

.method private c1(Lax/N9/Y;Lax/c3/G;JZLax/u3/c;Lax/g3/i;)V
    .registers 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p6

    .line 2
    .line 3
    const-string v2, "Onedrive close"

    .line 4
    .line 5
    new-instance v6, Lax/L9/f;

    .line 6
    .line 7
    invoke-direct {v6}, Lax/L9/f;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-direct {v8}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v7, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    const-string v9, "replace"

    .line 22
    .line 23
    const-string v10, "@microsoft.graph.conflictBehavior"

    .line 24
    .line 25
    if-eqz p5, :cond_25

    .line 26
    .line 27
    new-instance v3, Lax/S9/d;

    .line 28
    .line 29
    invoke-direct {v3, v10, v9}, Lax/S9/d;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :goto_23
    move-object v15, v3

    .line 37
    goto :goto_31

    .line 38
    :cond_25
    new-instance v3, Lax/S9/d;

    .line 39
    .line 40
    const-string v4, "fail"

    .line 41
    .line 42
    invoke-direct {v3, v10, v4}, Lax/S9/d;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    goto :goto_23

    .line 50
    :goto_31
    :try_start_31
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 51
    .line 52
    .line 53
    move-result-object v11
    :try_end_35
    .catchall {:try_start_31 .. :try_end_35} :catchall_121

    .line 54
    :try_start_35
    new-instance v3, Lcom/voxdon/xplorer/file/OneDriveFileHelper$d;
    :try_end_37
    .catchall {:try_start_35 .. :try_end_37} :catchall_11d

    .line 55
    .line 56
    move-object/from16 v4, p0

    .line 57
    .line 58
    move-object/from16 v5, p7

    .line 59
    .line 60
    :try_start_3b
    invoke-direct/range {v3 .. v8}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$d;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lax/g3/i;Lax/L9/f;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V
    :try_end_3e
    .catchall {:try_start_3b .. :try_end_3e} :catchall_118

    .line 61
    .line 62
    .line 63
    move-object v4, v11

    .line 64
    :try_start_3f
    new-instance v11, Lcom/voxdon/xplorer/file/OneDriveFileHelper$e;

    .line 65
    .line 66
    invoke-interface/range {p1 .. p1}, Lax/P9/p;->d()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    invoke-interface/range {p1 .. p1}, Lax/P9/p;->i()Lax/M9/f;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    const-class v16, Lcom/microsoft/graph/extensions/DriveItem;
    :try_end_4b
    .catchall {:try_start_3f .. :try_end_4b} :catchall_80

    .line 75
    .line 76
    move-object/from16 v12, p0

    .line 77
    .line 78
    :try_start_4d
    invoke-direct/range {v11 .. v16}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$e;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Ljava/lang/String;Lax/M9/f;Ljava/util/List;Ljava/lang/Class;)V
    :try_end_50
    .catchall {:try_start_4d .. :try_end_50} :catchall_cb

    .line 79
    .line 80
    .line 81
    :try_start_50
    sget-object v5, Lax/P9/k;->f0:Lax/P9/k;

    .line 82
    .line 83
    invoke-virtual {v11, v5}, Lax/P9/b;->t(Lax/P9/k;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v11}, Lax/P9/b;->m()Lax/M9/f;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-interface {v5}, Lax/M9/f;->b()Lax/P9/n;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v11}, Lax/P9/b;->q()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    new-instance v13, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;

    .line 99
    .line 100
    move-object/from16 p5, v6

    .line 101
    .line 102
    move-object v14, v7

    .line 103
    move-wide/from16 v6, p3

    .line 104
    .line 105
    invoke-direct {v13, v4, v6, v7, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;-><init>(Ljava/io/InputStream;JLax/u3/c;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v5, v11, v3, v12, v13}, Lax/P9/n;->b(Lax/P9/o;Lax/L9/c;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {p5 .. p5}, Lax/L9/f;->b()V

    .line 112
    .line 113
    .line 114
    if-eqz v1, :cond_87

    .line 115
    .line 116
    invoke-interface {v1}, Lax/u3/c;->isCancelled()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_7a

    .line 121
    .line 122
    goto :goto_87

    .line 123
    :cond_7a
    new-instance v0, Lax/b3/a;

    .line 124
    .line 125
    invoke-direct {v0}, Lax/b3/a;-><init>()V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :catchall_80
    move-exception v0

    .line 130
    move-object/from16 v12, p0

    .line 131
    .line 132
    :goto_83
    move-object v1, v0

    .line 133
    move-object v11, v4

    .line 134
    goto/16 :goto_126

    .line 135
    .line 136
    :cond_87
    :goto_87
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_d5

    .line 141
    .line 142
    const/4 v3, 0x3

    .line 143
    if-ge v0, v3, :cond_b6

    .line 144
    .line 145
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->a()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_b6

    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    instance-of v3, v3, Lax/P9/j;
    :try_end_9c
    .catchall {:try_start_50 .. :try_end_9c} :catchall_80

    .line 156
    .line 157
    if-nez v3, :cond_b6

    .line 158
    .line 159
    add-int/lit8 v0, v0, 0x1

    .line 160
    .line 161
    mul-int/lit16 v3, v0, 0x7d0

    .line 162
    .line 163
    mul-int v3, v3, v0

    .line 164
    .line 165
    int-to-long v11, v3

    .line 166
    :try_start_a5
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a8
    .catch Ljava/lang/InterruptedException; {:try_start_a5 .. :try_end_a8} :catch_a8
    .catchall {:try_start_a5 .. :try_end_a8} :catchall_80

    .line 167
    .line 168
    .line 169
    :catch_a8
    :try_start_a8
    new-instance v3, Lax/S9/d;

    .line 170
    .line 171
    invoke-direct {v3, v10, v9}, Lax/S9/d;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    move-object/from16 v12, p0

    .line 179
    .line 180
    move-object v15, v3

    .line 181
    :cond_b4
    move v3, v0

    .line 182
    goto :goto_f8

    .line 183
    :cond_b6
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0
    :try_end_ba
    .catchall {:try_start_a8 .. :try_end_ba} :catchall_80

    .line 187
    const-string v1, "onedrive uploadFile"

    .line 188
    .line 189
    if-eqz v0, :cond_cd

    .line 190
    .line 191
    :try_start_be
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Lax/M9/d;
    :try_end_c4
    .catchall {:try_start_be .. :try_end_c4} :catchall_80

    .line 196
    .line 197
    move-object/from16 v12, p0

    .line 198
    .line 199
    :try_start_c6
    invoke-direct {v12, v1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    throw v0

    .line 204
    :catchall_cb
    move-exception v0

    .line 205
    goto :goto_83

    .line 206
    :cond_cd
    move-object/from16 v12, p0

    .line 207
    .line 208
    new-instance v0, Lax/b3/j;

    .line 209
    .line 210
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v0

    .line 214
    :cond_d5
    move-object/from16 v12, p0

    .line 215
    .line 216
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 217
    .line 218
    .line 219
    move-result v3
    :try_end_db
    .catchall {:try_start_c6 .. :try_end_db} :catchall_cb

    .line 220
    if-eqz v3, :cond_b4

    .line 221
    .line 222
    if-eqz v4, :cond_f7

    .line 223
    .line 224
    :try_start_df
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_e2
    .catch Ljava/io/IOException; {:try_start_df .. :try_end_e2} :catch_f7
    .catch Ljava/lang/IllegalStateException; {:try_start_df .. :try_end_e2} :catch_e3

    .line 225
    .line 226
    .line 227
    goto :goto_f7

    .line 228
    :catch_e3
    move-exception v0

    .line 229
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 246
    .line 247
    .line 248
    :catch_f7
    :cond_f7
    :goto_f7
    return-void

    .line 249
    :goto_f8
    if-eqz v4, :cond_112

    .line 250
    .line 251
    :try_start_fa
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_fd
    .catch Ljava/io/IOException; {:try_start_fa .. :try_end_fd} :catch_112
    .catch Ljava/lang/IllegalStateException; {:try_start_fa .. :try_end_fd} :catch_fe

    .line 252
    .line 253
    .line 254
    goto :goto_112

    .line 255
    :catch_fe
    move-exception v0

    .line 256
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-virtual {v4, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-virtual {v4, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 273
    .line 274
    .line 275
    :catch_112
    :cond_112
    :goto_112
    move-object/from16 v6, p5

    .line 276
    .line 277
    move v0, v3

    .line 278
    move-object v7, v14

    .line 279
    goto/16 :goto_31

    .line 280
    .line 281
    :catchall_118
    move-exception v0

    .line 282
    move-object v12, v4

    .line 283
    :goto_11a
    move-object v4, v11

    .line 284
    :goto_11b
    move-object v1, v0

    .line 285
    goto :goto_126

    .line 286
    :catchall_11d
    move-exception v0

    .line 287
    move-object/from16 v12, p0

    .line 288
    .line 289
    goto :goto_11a

    .line 290
    :catchall_121
    move-exception v0

    .line 291
    move-object/from16 v12, p0

    .line 292
    .line 293
    const/4 v11, 0x0

    .line 294
    goto :goto_11b

    .line 295
    :goto_126
    if-eqz v11, :cond_140

    .line 296
    .line 297
    :try_start_128
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_12b
    .catch Ljava/io/IOException; {:try_start_128 .. :try_end_12b} :catch_140
    .catch Ljava/lang/IllegalStateException; {:try_start_128 .. :try_end_12b} :catch_12c

    .line 298
    .line 299
    .line 300
    goto :goto_140

    .line 301
    :catch_12c
    move-exception v0

    .line 302
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v3, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v2, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 319
    .line 320
    .line 321
    :catch_140
    :cond_140
    :goto_140
    throw v1
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
.end method

.method private d1(Ljava/lang/String;JLax/g3/i;)V
    .registers 11

    .line 1
    :goto_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_b} :catch_2f
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_b} :catch_2d
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_b} :catch_2b
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_b} :catch_29

    .line 11
    .line 12
    :try_start_b
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0x100

    .line 17
    .line 18
    invoke-static {v1, v2}, Lax/c3/F;->i(Ljava/io/InputStream;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lax/r8/n;->d(Ljava/lang/String;)Lax/r8/i;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lax/r8/i;->h()Lax/r8/l;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "percentageComplete"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lax/r8/l;->w(Ljava/lang/String;)Lax/r8/o;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_23
    .catchall {:try_start_b .. :try_end_23} :catchall_41

    .line 36
    if-nez v1, :cond_31

    .line 37
    .line 38
    :try_start_25
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_28} :catch_2f
    .catch Ljava/lang/NumberFormatException; {:try_start_25 .. :try_end_28} :catch_2d
    .catch Ljava/lang/IllegalStateException; {:try_start_25 .. :try_end_28} :catch_2b
    .catch Ljava/lang/NullPointerException; {:try_start_25 .. :try_end_28} :catch_29

    .line 39
    .line 40
    .line 41
    goto :goto_5f

    .line 42
    :catch_29
    move-exception p1

    .line 43
    goto :goto_5c

    .line 44
    :catch_2b
    move-exception p1

    .line 45
    goto :goto_5c

    .line 46
    :catch_2d
    move-exception p1

    .line 47
    goto :goto_5c

    .line 48
    :catch_2f
    move-exception p1

    .line 49
    goto :goto_5c

    .line 50
    :cond_31
    :try_start_31
    invoke-virtual {v1}, Lax/r8/o;->s()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz p4, :cond_43

    .line 55
    .line 56
    int-to-long v2, v1

    .line 57
    mul-long v2, v2, p2

    .line 58
    .line 59
    const-wide/16 v4, 0x64

    .line 60
    .line 61
    div-long/2addr v2, v4

    .line 62
    invoke-interface {p4, v2, v3, p2, p3}, Lax/g3/i;->a(JJ)V
    :try_end_40
    .catchall {:try_start_31 .. :try_end_40} :catchall_41

    .line 63
    .line 64
    .line 65
    goto :goto_43

    .line 66
    :catchall_41
    move-exception p1

    .line 67
    goto :goto_58

    .line 68
    :cond_43
    :goto_43
    const/16 v2, 0x64

    .line 69
    .line 70
    if-lt v1, v2, :cond_4b

    .line 71
    .line 72
    :try_start_47
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4a
    .catch Ljava/io/IOException; {:try_start_47 .. :try_end_4a} :catch_2f
    .catch Ljava/lang/NumberFormatException; {:try_start_47 .. :try_end_4a} :catch_2d
    .catch Ljava/lang/IllegalStateException; {:try_start_47 .. :try_end_4a} :catch_2b
    .catch Ljava/lang/NullPointerException; {:try_start_47 .. :try_end_4a} :catch_29

    .line 73
    .line 74
    .line 75
    goto :goto_6b

    .line 76
    :cond_4b
    const/16 v2, 0x32

    .line 77
    .line 78
    if-ge v1, v2, :cond_54

    .line 79
    .line 80
    const-wide/16 v1, 0xfa

    .line 81
    .line 82
    :try_start_51
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_51 .. :try_end_54} :catch_54
    .catchall {:try_start_51 .. :try_end_54} :catchall_41

    .line 83
    .line 84
    .line 85
    :catch_54
    :cond_54
    :try_start_54
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :goto_58
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 90
    .line 91
    .line 92
    throw p1
    :try_end_5c
    .catch Ljava/io/IOException; {:try_start_54 .. :try_end_5c} :catch_2f
    .catch Ljava/lang/NumberFormatException; {:try_start_54 .. :try_end_5c} :catch_2d
    .catch Ljava/lang/IllegalStateException; {:try_start_54 .. :try_end_5c} :catch_2b
    .catch Ljava/lang/NullPointerException; {:try_start_54 .. :try_end_5c} :catch_29

    .line 93
    :goto_5c
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 94
    .line 95
    .line 96
    :goto_5f
    const-wide/16 v0, 0x4e2

    .line 97
    .line 98
    :try_start_61
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_64
    .catch Ljava/lang/InterruptedException; {:try_start_61 .. :try_end_64} :catch_65

    .line 99
    .line 100
    .line 101
    goto :goto_66

    .line 102
    :catch_65
    nop

    .line 103
    :goto_66
    if-eqz p4, :cond_6b

    .line 104
    .line 105
    invoke-interface {p4, p2, p3, p2, p3}, Lax/g3/i;->a(JJ)V

    .line 106
    .line 107
    .line 108
    :cond_6b
    :goto_6b
    return-void
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

.method private e1(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZZLax/u3/c;Lax/g3/i;)V
    .registers 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {p0, v2, v3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k0(Ljava/lang/String;Z)Lax/c3/T;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Lax/c3/T;->n()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_eb

    .line 15
    .line 16
    move-object v9, p1

    .line 17
    check-cast v9, Lax/c3/T;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {p0, v9, v3, v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 21
    .line 22
    .line 23
    move-result-object v2
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_17} :catch_9e
    .catch Lax/M9/d; {:try_start_0 .. :try_end_17} :catch_9c
    .catchall {:try_start_0 .. :try_end_17} :catchall_9a

    .line 24
    const-wide/16 v3, -0x1

    .line 25
    .line 26
    cmp-long v5, p4, v3

    .line 27
    .line 28
    if-nez v5, :cond_b7

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    :try_start_1e
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object v5
    :try_end_22
    .catchall {:try_start_1e .. :try_end_22} :catchall_a6

    .line 35
    :try_start_22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v6, p1}, Lax/Z2/a;->l(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-instance v7, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v11

    .line 59
    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, ".tmp"

    .line 63
    .line 64
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v11, Ljava/io/File;

    .line 72
    .line 73
    invoke-direct {v11, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_4b
    .catchall {:try_start_22 .. :try_end_4b} :catchall_a3

    .line 74
    .line 75
    .line 76
    move-object/from16 v7, p9

    .line 77
    .line 78
    :try_start_4d
    invoke-static {v5, v11, v3, v4, v7}, Lax/c3/F;->f(Ljava/io/InputStream;Ljava/io/File;JLax/u3/c;)V
    :try_end_50
    .catchall {:try_start_4d .. :try_end_50} :catchall_a0

    .line 79
    .line 80
    .line 81
    :try_start_50
    invoke-static {v11}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0, v3}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-interface {v3}, Lax/c3/b;->p()J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    invoke-virtual {v0, v3}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-wide/16 v12, 0x0

    .line 102
    .line 103
    cmp-long v0, v4, v12

    .line 104
    .line 105
    if-nez v0, :cond_82

    .line 106
    .line 107
    invoke-interface {v2}, Lax/O9/y;->k()Lax/N9/Y;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    move-object v1, p0

    .line 112
    move/from16 v6, p8

    .line 113
    .line 114
    move-object/from16 v8, p10

    .line 115
    .line 116
    invoke-direct/range {v1 .. v8}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->c1(Lax/N9/Y;Lax/c3/G;JZLax/u3/c;Lax/g3/i;)V

    .line 117
    .line 118
    .line 119
    if-eqz p6, :cond_8d

    .line 120
    .line 121
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    invoke-direct {p0, v9, v2, v3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->Z0(Lax/c3/T;J)V

    .line 126
    .line 127
    .line 128
    goto :goto_8d

    .line 129
    :catchall_80
    move-exception v0

    .line 130
    goto :goto_a8

    .line 131
    :cond_82
    move-object v1, p0

    .line 132
    move-object/from16 v6, p6

    .line 133
    .line 134
    move-object/from16 v9, p10

    .line 135
    .line 136
    move-object v8, v7

    .line 137
    move/from16 v7, p8

    .line 138
    .line 139
    invoke-direct/range {v1 .. v9}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->b1(Lax/N9/U;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V
    :try_end_8d
    .catchall {:try_start_50 .. :try_end_8d} :catchall_80

    .line 140
    .line 141
    .line 142
    :cond_8d
    :goto_8d
    :try_start_8d
    invoke-static {v10}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_d9

    .line 150
    .line 151
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :catchall_9a
    move-exception v0

    .line 156
    goto :goto_f3

    .line 157
    :catch_9c
    move-exception v0

    .line 158
    goto :goto_f4

    .line 159
    :catch_9e
    move-exception v0

    .line 160
    goto :goto_fb

    .line 161
    :catchall_a0
    move-exception v0

    .line 162
    :goto_a1
    move-object v10, v5

    .line 163
    goto :goto_a8

    .line 164
    :catchall_a3
    move-exception v0

    .line 165
    move-object v11, v10

    .line 166
    goto :goto_a1

    .line 167
    :catchall_a6
    move-exception v0

    .line 168
    move-object v11, v10

    .line 169
    :goto_a8
    invoke-static {v10}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 170
    .line 171
    .line 172
    if-eqz v11, :cond_b6

    .line 173
    .line 174
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_b6

    .line 179
    .line 180
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 181
    .line 182
    .line 183
    :cond_b6
    throw v0

    .line 184
    :cond_b7
    sget v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->n:I

    .line 185
    .line 186
    int-to-long v0, v0

    .line 187
    cmp-long v3, p4, v0

    .line 188
    .line 189
    if-gez v3, :cond_da

    .line 190
    .line 191
    invoke-interface {v2}, Lax/O9/y;->k()Lax/N9/Y;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    move-object v1, p0

    .line 196
    move-object/from16 v3, p2

    .line 197
    .line 198
    move-wide/from16 v4, p4

    .line 199
    .line 200
    move/from16 v6, p8

    .line 201
    .line 202
    move-object/from16 v7, p9

    .line 203
    .line 204
    move-object/from16 v8, p10

    .line 205
    .line 206
    invoke-direct/range {v1 .. v8}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->c1(Lax/N9/Y;Lax/c3/G;JZLax/u3/c;Lax/g3/i;)V

    .line 207
    .line 208
    .line 209
    if-eqz p6, :cond_d9

    .line 210
    .line 211
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 212
    .line 213
    .line 214
    move-result-wide v2

    .line 215
    invoke-direct {p0, v9, v2, v3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->Z0(Lax/c3/T;J)V

    .line 216
    .line 217
    .line 218
    :cond_d9
    return-void

    .line 219
    :cond_da
    move-object v1, p0

    .line 220
    move-object/from16 v3, p2

    .line 221
    .line 222
    move-wide/from16 v4, p4

    .line 223
    .line 224
    move-object/from16 v6, p6

    .line 225
    .line 226
    move/from16 v7, p8

    .line 227
    .line 228
    move-object/from16 v8, p9

    .line 229
    .line 230
    move-object/from16 v9, p10

    .line 231
    .line 232
    invoke-direct/range {v1 .. v9}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->b1(Lax/N9/U;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_eb
    new-instance v0, Lax/b3/j;

    .line 237
    .line 238
    const-string v2, "parentPath doesn\'t exist"

    .line 239
    .line 240
    invoke-direct {v0, v2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0
    :try_end_f3
    .catch Ljava/io/IOException; {:try_start_8d .. :try_end_f3} :catch_9e
    .catch Lax/M9/d; {:try_start_8d .. :try_end_f3} :catch_9c
    .catchall {:try_start_8d .. :try_end_f3} :catchall_9a

    .line 244
    :goto_f3
    throw v0

    .line 245
    :goto_f4
    const-string v2, "writeFileInternal"

    .line 246
    .line 247
    invoke-direct {p0, v2, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    throw v0

    .line 252
    :goto_fb
    const-string v2, "onedrive upload"

    .line 253
    .line 254
    invoke-static {v2, v0}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    throw v0
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
.end method

.method private k0(Ljava/lang/String;Z)Lax/c3/T;
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
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->E0(Ljava/lang/String;Z)Lax/N9/U;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-interface {v0}, Lax/O9/y;->a()Lax/N9/T;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz p2, :cond_14

    .line 11
    .line 12
    const-string p2, "thumbnails"

    .line 13
    .line 14
    invoke-interface {v0, p2}, Lax/O9/x;->f(Ljava/lang/String;)Lax/O9/x;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_14

    .line 19
    :catch_12
    move-exception p2

    .line 20
    goto :goto_1e

    .line 21
    :cond_14
    :goto_14
    invoke-interface {v0}, Lax/O9/x;->get()Lcom/microsoft/graph/extensions/DriveItem;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance v0, Lax/c3/T;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2, p1}, Lax/c3/T;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lcom/microsoft/graph/extensions/DriveItem;Ljava/lang/String;)V
    :try_end_1d
    .catch Lax/M9/d; {:try_start_1 .. :try_end_1d} :catch_12

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :goto_1e
    sget-object v0, Lax/M9/e;->k0:Lax/M9/e;

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lax/M9/d;->a(Lax/M9/e;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_63

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_39

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "404 :"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_39

    .line 56
    .line 57
    goto :goto_63

    .line 58
    :cond_39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "onedrive getfileinfo"

    .line 63
    .line 64
    if-eqz v0, :cond_5b

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v2, "400 :"

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5b

    .line 77
    .line 78
    const-string v0, "."

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5b

    .line 85
    .line 86
    new-instance p1, Lax/b3/o;

    .line 87
    .line 88
    invoke-direct {p1, v1, p2}, Lax/b3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_5b
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v1, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    throw p1

    .line 100
    :cond_63
    :goto_63
    new-instance p2, Lax/c3/T;

    .line 101
    .line 102
    invoke-direct {p2, p0, p1}, Lax/c3/T;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object p2
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

.method static synthetic l0(Lcom/voxdon/xplorer/file/OneDriveFileHelper;)Ljava/util/concurrent/atomic/AtomicReference;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic m0(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lax/N9/e0;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->Y0(Lax/N9/e0;)V

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
.end method

.method static synthetic n0(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lcom/microsoft/graph/extensions/Drive;)Lcom/microsoft/graph/extensions/Drive;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k:Lcom/microsoft/graph/extensions/Drive;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic o0(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lax/N9/e0;Lax/d3/a0;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->V0(Lax/N9/e0;Lax/d3/a0;)V

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

.method static synthetic p0(Landroid/content/Context;)V
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->X0(Landroid/content/Context;)V

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
.end method

.method static synthetic q0(Landroid/content/Context;)Lax/N9/e0;
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->v0(Landroid/content/Context;)Lax/N9/e0;

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

.method static synthetic r0(Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;Lax/L9/c;)V
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->T0(Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;Lax/L9/c;)V

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

.method private s0(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->j:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->i:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_f

    .line 18
    throw p1
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

.method private t0(Lcom/microsoft/graph/extensions/DriveItem;)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p1, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 2
    .line 3
    if-eqz v0, :cond_28

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "/drives/"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/microsoft/graph/generated/BaseRemoteItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "/items/"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p1, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/microsoft/graph/generated/BaseRemoteItem;->h:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_2a

    .line 41
    :cond_28
    const-string v0, "/drive/root"

    .line 42
    .line 43
    :goto_2a
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->s0(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0
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

.method private u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;
    .registers 6

    .line 1
    sget-object v0, Lax/M9/e;->k0:Lax/M9/e;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lax/M9/d;->a(Lax/M9/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    new-instance p1, Lax/b3/t;

    .line 10
    .line 11
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_e
    sget-object v0, Lax/M9/e;->q:Lax/M9/e;

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Lax/M9/d;->a(Lax/M9/e;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1c

    .line 22
    .line 23
    new-instance v0, Lax/b3/e;

    .line 24
    .line 25
    invoke-direct {v0, p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1c
    sget-object v0, Lax/M9/e;->p0:Lax/M9/e;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Lax/M9/d;->a(Lax/M9/e;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2a

    .line 36
    .line 37
    new-instance v0, Lax/b3/s;

    .line 38
    .line 39
    invoke-direct {v0, p1, p2}, Lax/b3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2a
    sget-object v0, Lax/M9/e;->m0:Lax/M9/e;

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Lax/M9/d;->a(Lax/M9/e;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_39

    .line 51
    .line 52
    new-instance p1, Lax/b3/f;

    .line 53
    .line 54
    invoke-direct {p1, v1, p2}, Lax/b3/f;-><init>(ZLjava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_51

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v2, "404 :"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_51

    .line 75
    .line 76
    new-instance p1, Lax/b3/t;

    .line 77
    .line 78
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_51
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_69

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v2, "507 :"

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_69

    .line 99
    .line 100
    new-instance v0, Lax/b3/s;

    .line 101
    .line 102
    invoke-direct {v0, p1, p2}, Lax/b3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_69
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_81

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v2, "409 :"

    .line 117
    .line 118
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_81

    .line 123
    .line 124
    new-instance p1, Lax/b3/f;

    .line 125
    .line 126
    invoke-direct {p1, v1, p2}, Lax/b3/f;-><init>(ZLjava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_81
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_99

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-string v1, "403 : Forbidden"

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_99

    .line 147
    .line 148
    new-instance v0, Lax/b3/e;

    .line 149
    .line 150
    invoke-direct {v0, p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_99
    invoke-static {p1, p2}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1
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

.method private static v0(Landroid/content/Context;)Lax/N9/e0;
    .registers 3

    .line 1
    invoke-static {p0}, Lax/c3/g;->c(Landroid/content/Context;)Lax/c3/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lax/c3/g;->a(Lax/Q2/f;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/voxdon/xplorer/file/OneDriveFileHelper$g;

    .line 12
    .line 13
    invoke-direct {v1, p0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1}, Lax/c3/S;->f(Landroid/content/Context;Lax/K9/a;)Lax/M9/g;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v0, Lax/N9/A$a;

    .line 21
    .line 22
    invoke-direct {v0}, Lax/N9/A$a;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lax/N9/A$a;->d(Lax/M9/g;)Lax/N9/A$a;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lax/N9/A$a;->b()Lax/N9/e0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
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

.method private y0()Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "OneDrivePrefs"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "email_"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
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

.method private z0()Lax/N9/e0;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/h;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/N9/e0;

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    new-instance v0, Lax/b3/h;

    .line 13
    .line 14
    const-string v1, "OneDrive client is null"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
    .line 20
    .line 21
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 5

    .line 1
    const/4 p1, 0x0

    .line 2
    if-eqz p3, :cond_1a

    .line 3
    .line 4
    :try_start_3
    const-string v0, "url="

    .line 5
    .line 6
    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    goto :goto_1a

    .line 13
    :cond_c
    const/4 p2, 0x4

    .line 14
    invoke-virtual {p3, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    goto :goto_2b

    .line 23
    :catch_16
    move-exception p2

    .line 24
    goto :goto_35

    .line 25
    :catch_18
    move-exception p2

    .line 26
    goto :goto_35

    .line 27
    :cond_1a
    :goto_1a
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Lax/c3/T;

    .line 32
    .line 33
    invoke-virtual {p2}, Lax/c3/T;->g0()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    if-nez p3, :cond_27

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_27
    invoke-virtual {p2}, Lax/c3/T;->g0()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :goto_2b
    new-instance p3, Ljava/net/URL;

    .line 45
    .line 46
    invoke-direct {p3, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_34
    .catch Lax/b3/j; {:try_start_3 .. :try_end_34} :catch_18
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_34} :catch_16

    .line 53
    return-object p1

    .line 54
    :goto_35
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    return-object p1
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

.method public B(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_20

    .line 6
    .line 7
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p2}, Lax/u3/b;->c(Z)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Lax/c3/T;

    .line 15
    .line 16
    invoke-virtual {p1}, Lax/c3/T;->f0()Lcom/microsoft/graph/extensions/DriveItem;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p2, :cond_17

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 p2, 0x0

    .line 25
    :goto_18
    invoke-static {p2}, Lax/u3/b;->c(Z)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->R0(Lax/c3/T;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_20
    new-instance p1, Lax/b3/t;

    .line 34
    .line 35
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1
    .line 39
    .line 40
    .line 41
.end method

.method public D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-wide/from16 v5, p4

    .line 14
    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    move/from16 v8, p8

    .line 18
    .line 19
    move-object/from16 v10, p9

    .line 20
    .line 21
    move-object/from16 v11, p10

    .line 22
    .line 23
    invoke-direct/range {v1 .. v11}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->e1(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZZLax/u3/c;Lax/g3/i;)V

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
.end method

.method public E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_7d

    .line 13
    .line 14
    if-eqz p3, :cond_1e

    .line 15
    .line 16
    invoke-interface {p3}, Lax/u3/c;->isCancelled()Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-nez p3, :cond_16

    .line 21
    .line 22
    goto :goto_1e

    .line 23
    :cond_16
    new-instance p1, Lax/b3/j;

    .line 24
    .line 25
    const-string p2, "Operation cancelled"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1e
    :goto_1e
    :try_start_1e
    new-instance p3, Lcom/microsoft/graph/extensions/DriveItem;

    .line 32
    .line 33
    invoke-direct {p3}, Lcom/microsoft/graph/extensions/DriveItem;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, 0x0

    .line 49
    if-eqz v0, :cond_3b

    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iput-object p2, p3, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 56
    .line 57
    goto :goto_55

    .line 58
    :catch_39
    move-exception p1

    .line 59
    goto :goto_76

    .line 60
    :cond_3b
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k0(Ljava/lang/String;Z)Lax/c3/T;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_6e

    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iput-object p2, p3, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->C0(Ljava/lang/String;)Lcom/microsoft/graph/extensions/ItemReference;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iput-object p2, p3, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 85
    .line 86
    :goto_55
    move-object p2, p1

    .line 87
    check-cast p2, Lax/c3/T;

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    invoke-direct {p0, p2, v0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-interface {p2}, Lax/O9/y;->a()Lax/N9/T;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-interface {p2, p3}, Lax/O9/x;->j(Lcom/microsoft/graph/extensions/DriveItem;)Lcom/microsoft/graph/extensions/DriveItem;

    .line 99
    .line 100
    .line 101
    if-eqz p4, :cond_6d

    .line 102
    .line 103
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 104
    .line 105
    .line 106
    move-result-wide p1

    .line 107
    invoke-interface {p4, p1, p2, p1, p2}, Lax/g3/i;->a(JJ)V

    .line 108
    .line 109
    .line 110
    :cond_6d
    return-void

    .line 111
    :cond_6e
    new-instance p1, Lax/b3/j;

    .line 112
    .line 113
    const-string p2, "Target parent does not exist"

    .line 114
    .line 115
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1
    :try_end_76
    .catch Lax/M9/d; {:try_start_1e .. :try_end_76} :catch_39

    .line 119
    :goto_76
    const-string p2, "move"

    .line 120
    .line 121
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    throw p1

    .line 126
    :cond_7d
    new-instance p1, Lax/b3/t;

    .line 127
    .line 128
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 129
    .line 130
    .line 131
    throw p1
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

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_68

    .line 13
    .line 14
    if-eqz p3, :cond_1c

    .line 15
    .line 16
    invoke-interface {p3}, Lax/u3/c;->isCancelled()Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-nez p3, :cond_16

    .line 21
    .line 22
    goto :goto_1c

    .line 23
    :cond_16
    new-instance p1, Lax/b3/a;

    .line 24
    .line 25
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1c
    :goto_1c
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-direct {p0, p3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->C0(Ljava/lang/String;)Lcom/microsoft/graph/extensions/ItemReference;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    :try_start_28
    check-cast p1, Lax/c3/T;

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-direct {p0, p1, v2, v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {p1, p2, p3}, Lax/O9/y;->j(Ljava/lang/String;Lcom/microsoft/graph/extensions/ItemReference;)Lax/N9/P;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Lax/O9/u;->a()Lax/N9/O;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Lax/O9/t;->e()Lcom/microsoft/graph/extensions/DriveItem;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_54

    .line 65
    .line 66
    iget-object p2, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz p2, :cond_46

    .line 69
    .line 70
    goto :goto_54

    .line 71
    :cond_46
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseBaseItem;->n:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz p1, :cond_50

    .line 74
    .line 75
    invoke-direct {p0, p1, v0, v1, p4}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->d1(Ljava/lang/String;JLax/g3/i;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catch_4e
    move-exception p1

    .line 80
    goto :goto_61

    .line 81
    :cond_50
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_53
    .catch Lax/M9/d; {:try_start_28 .. :try_end_53} :catch_4e

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_54
    :goto_54
    const-wide/16 p1, 0x4e2

    .line 86
    .line 87
    :try_start_56
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_59
    .catch Ljava/lang/InterruptedException; {:try_start_56 .. :try_end_59} :catch_5a
    .catch Lax/M9/d; {:try_start_56 .. :try_end_59} :catch_4e

    .line 88
    .line 89
    .line 90
    goto :goto_5b

    .line 91
    :catch_5a
    nop

    .line 92
    :goto_5b
    if-eqz p4, :cond_60

    .line 93
    .line 94
    :try_start_5d
    invoke-interface {p4, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V
    :try_end_60
    .catch Lax/M9/d; {:try_start_5d .. :try_end_60} :catch_4e

    .line 95
    .line 96
    .line 97
    :cond_60
    return-void

    .line 98
    :goto_61
    const-string p2, "copy"

    .line 99
    .line 100
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    throw p1

    .line 105
    :cond_68
    new-instance p1, Lax/b3/t;

    .line 106
    .line 107
    const-string p2, "not existing source file"

    .line 108
    .line 109
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1
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

.method public G(Ljava/lang/String;Ljava/lang/String;)I
    .registers 3

    .line 1
    const/4 p1, -0x1

    return p1
.end method

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 5

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lax/c3/T;

    .line 3
    .line 4
    invoke-virtual {v0}, Lax/c3/T;->g0()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_b

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return-object p1

    .line 12
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "url="

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lax/c3/T;->g0()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, v0}, Lax/c3/B;->a0(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
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

.method H0()Lcom/microsoft/graph/extensions/Drive;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/h;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k:Lcom/microsoft/graph/extensions/Drive;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    invoke-static {}, Lax/u3/b;->f()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lax/b3/h;

    .line 10
    .line 11
    const-string v1, "MyDrive is null"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public I(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    check-cast p1, Lax/c3/T;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, p1, v0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lax/O9/y;->a()Lax/N9/T;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lax/O9/x;->delete()V
    :try_end_f
    .catch Lax/M9/d; {:try_start_0 .. :try_end_f} :catch_10

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_10
    move-exception p1

    .line 18
    const-string v0, "deleteRecursively"

    .line 19
    .line 20
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    throw p1
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

.method I0()Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/h;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->H0()Lcom/microsoft/graph/extensions/Drive;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 6
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

.method public J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    check-cast p1, Lax/c3/T;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, p1, v0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lax/O9/y;->k()Lax/N9/Y;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Lax/O9/C;->a()Lax/N9/X;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v2, p2, v0

    .line 19
    .line 20
    if-eqz v2, :cond_33

    .line 21
    .line 22
    const-string v0, "Range"

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "bytes="

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p2, "-"

    .line 38
    .line 39
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-interface {p1, v0, p2}, Lax/P9/o;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_33

    .line 50
    :catch_31
    move-exception p1

    .line 51
    goto :goto_38

    .line 52
    :cond_33
    :goto_33
    invoke-interface {p1}, Lax/O9/B;->get()Ljava/io/InputStream;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_37
    .catch Lax/M9/d; {:try_start_0 .. :try_end_37} :catch_31

    .line 56
    return-object p1

    .line 57
    :goto_38
    const-string p2, "getInputStream"

    .line 58
    .line 59
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1
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

.method J0(Ljava/lang/String;)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/J;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->B0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_4
    .catch Lax/b3/j; {:try_start_0 .. :try_end_4} :catch_59

    .line 5
    const-string v1, "/"

    .line 6
    .line 7
    if-nez v0, :cond_42

    .line 8
    .line 9
    :try_start_8
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->B0(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_16

    .line 21
    .line 22
    goto :goto_42

    .line 23
    :cond_16
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v1, "ONEDRIVE LOCAL PATH NULL"

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "remoteDrivePath : "

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lax/b3/J;

    .line 62
    .line 63
    invoke-direct {p1}, Lax/b3/J;-><init>()V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_42
    :goto_42
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_49

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_58
    .catch Lax/b3/j; {:try_start_8 .. :try_end_58} :catch_59

    .line 89
    return-object p1

    .line 90
    :catch_59
    new-instance p1, Lax/b3/J;

    .line 91
    .line 92
    invoke-direct {p1}, Lax/b3/J;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p1
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

.method public K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 12

    .line 1
    if-eqz p3, :cond_5

    .line 2
    .line 3
    invoke-interface {p3}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 4
    .line 5
    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->S0()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->y0()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v5, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-direct {v6, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    new-instance v1, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;

    .line 29
    .line 30
    move-object v2, p0

    .line 31
    move-object v3, p2

    .line 32
    move-object v4, p3

    .line 33
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v7, p1, v0, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->T0(Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;Lax/L9/c;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public L()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public M(Lcom/voxdon/xplorer/file/n;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k0(Ljava/lang/String;Z)Lax/c3/T;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_10

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItem;

    .line 22
    .line 23
    invoke-direct {v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItem;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, v2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 27
    .line 28
    new-instance p1, Lcom/microsoft/graph/extensions/Folder;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/microsoft/graph/extensions/Folder;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, v2, Lcom/microsoft/graph/generated/BaseDriveItem;->x:Lcom/microsoft/graph/extensions/Folder;

    .line 34
    .line 35
    const-string p1, "fail"

    .line 36
    .line 37
    iput-object p1, v2, Lcom/voxdon/xplorer/file/OneDriveFileHelper$MyDriveItem;->U:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->E0(Ljava/lang/String;Z)Lax/N9/U;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Lax/O9/y;->b()Lax/N9/N;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Lax/O9/s;->a()Lax/N9/M;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1, v2}, Lax/O9/r;->b(Lcom/microsoft/graph/extensions/DriveItem;)Lcom/microsoft/graph/extensions/DriveItem;
    :try_end_35
    .catch Lax/M9/d; {:try_start_1 .. :try_end_35} :catch_39
    .catch Lax/b3/j; {:try_start_1 .. :try_end_35} :catch_37

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :catch_37
    move-exception p1

    .line 57
    goto :goto_3a

    .line 58
    :catch_39
    move-exception p1

    .line 59
    :goto_3a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    .line 61
    .line 62
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public N(Lcom/voxdon/xplorer/file/n;)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v2, Lax/S9/d;

    .line 11
    .line 12
    const-string v3, "@microsoft.graph.conflictBehavior"

    .line 13
    .line 14
    const-string v4, "fail"

    .line 15
    .line 16
    invoke-direct {v2, v3, v4}, Lax/S9/d;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->E0(Ljava/lang/String;Z)Lax/N9/U;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Lax/O9/y;->b()Lax/N9/N;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v1, p1}, Lax/O9/s;->e(Ljava/lang/String;)Lax/N9/U;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Lax/O9/y;->k()Lax/N9/Y;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p1, v1}, Lax/O9/C;->c(Ljava/util/List;)Lax/N9/X;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {p1, v1}, Lax/O9/B;->i([B)Lcom/microsoft/graph/extensions/DriveItem;
    :try_end_32
    .catch Lax/M9/d; {:try_start_1 .. :try_end_32} :catch_36
    .catch Lax/b3/j; {:try_start_1 .. :try_end_32} :catch_34

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :catch_34
    move-exception p1

    .line 54
    goto :goto_37

    .line 55
    :catch_36
    move-exception p1

    .line 56
    :goto_37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    return v0
    .line 60
    .line 61
.end method

.method N0(Ljava/util/HashMap;Lcom/microsoft/graph/extensions/DriveItem;)Ljava/lang/String;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/microsoft/graph/extensions/DriveItem;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/J;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->e:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_15

    .line 10
    .line 11
    :cond_a
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "root"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_15
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 23
    .line 24
    const-string v2, "this case is not implemented yet"

    .line 25
    .line 26
    if-eqz v0, :cond_122

    .line 27
    .line 28
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->Q0(Lcom/microsoft/graph/extensions/DriveItem;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_8a

    .line 33
    .line 34
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 35
    .line 36
    iget-object v3, v0, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v3, :cond_4e

    .line 39
    .line 40
    if-eqz p1, :cond_46

    .line 41
    .line 42
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v3, v0

    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    if-nez v3, :cond_4e

    .line 52
    .line 53
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p2, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {p0, v0, v3}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 64
    .line 65
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->e:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_4e

    .line 71
    :cond_46
    iget-object p1, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_4e
    :goto_4e
    if-nez v3, :cond_65

    .line 80
    .line 81
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_65
    const-string p1, "/root:"

    .line 103
    .line 104
    invoke-virtual {v3, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    add-int/lit8 p1, p1, 0x6

    .line 109
    .line 110
    invoke-virtual {v3, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object p1, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :cond_8a
    iget-object p1, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 140
    .line 141
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 142
    .line 143
    if-eqz p1, :cond_d1

    .line 144
    .line 145
    const-string v0, "/drives"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_d1

    .line 152
    .line 153
    iget-object p1, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 154
    .line 155
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 156
    .line 157
    const-string v0, ":"

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 164
    .line 165
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->J0(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v2, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 177
    .line 178
    iget-object v2, v2, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 179
    .line 180
    add-int/lit8 p1, p1, 0x1

    .line 181
    .line 182
    invoke-virtual {v2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    new-instance v2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    iget-object p1, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    return-object p1

    .line 210
    :cond_d1
    iget-object p1, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 211
    .line 212
    iget-object v0, p1, Lcom/microsoft/graph/generated/BaseItemReference;->g:Ljava/lang/String;

    .line 213
    .line 214
    if-nez v0, :cond_10d

    .line 215
    .line 216
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseItemReference;->e:Ljava/lang/String;

    .line 217
    .line 218
    if-nez p1, :cond_10d

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->I0()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 225
    .line 226
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-nez p1, :cond_10d

    .line 233
    .line 234
    new-instance p1, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    .line 239
    const-string v0, "/drives/"

    .line 240
    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    iget-object v0, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->m:Lcom/microsoft/graph/extensions/ItemReference;

    .line 245
    .line 246
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseItemReference;->c:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v0, "/items/"

    .line 252
    .line 253
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->J0(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    return-object p1

    .line 270
    :cond_10d
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    new-instance p1, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    return-object p1

    .line 291
    :cond_122
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    new-instance p1, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    iget-object p2, p2, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    return-object p1
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

.method public O()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->I(Lcom/voxdon/xplorer/file/n;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->P0(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_18

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->M0(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->W0(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    return-void
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

.method public Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 6

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_26

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eq v0, v1, :cond_10

    .line 15
    .line 16
    goto :goto_26

    .line 17
    :cond_10
    :try_start_10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1, v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->A0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p0, p2, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->A0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1
    :try_end_25
    .catch Lax/b3/j; {:try_start_10 .. :try_end_25} :catch_26
    .catch Lax/M9/d; {:try_start_10 .. :try_end_25} :catch_26

    .line 38
    return p1

    .line 39
    :catch_26
    :cond_26
    :goto_26
    return v2
    .line 40
    .line 41
.end method

.method public Y()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public a()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k:Lcom/microsoft/graph/extensions/Drive;

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_3d

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/N9/e0;

    .line 16
    .line 17
    invoke-interface {v0}, Lax/M9/f;->c()Lax/K9/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/K9/b;

    .line 22
    .line 23
    :try_start_16
    new-instance v1, Lcom/voxdon/xplorer/file/OneDriveFileHelper$c;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$c;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lax/K9/b;->l(Lax/L9/c;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k:Lcom/microsoft/graph/extensions/Drive;
    :try_end_26
    .catch Landroid/util/AndroidRuntimeException; {:try_start_16 .. :try_end_26} :catch_27

    .line 38
    .line 39
    return-void

    .line 40
    :catch_27
    move-exception v0

    .line 41
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "ONEDRIVE DISCONNECT"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 60
    .line 61
    .line 62
    :cond_3d
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public g0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public h0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public j0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const/4 v8, 0x1

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    move/from16 v7, p8

    .line 10
    .line 11
    move-object/from16 v9, p9

    .line 12
    .line 13
    move-object/from16 v10, p10

    .line 14
    .line 15
    invoke-direct/range {v0 .. v10}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->e1(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZZLax/u3/c;Lax/g3/i;)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method m(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    if-nez p4, :cond_7

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/voxdon/xplorer/file/m;->o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V

    .line 4
    .line 5
    .line 6
    move-object p1, p0

    .line 7
    return-void

    .line 8
    :cond_7
    move-object p3, p2

    .line 9
    move-object p2, p1

    .line 10
    move-object p1, p0

    .line 11
    :try_start_a
    check-cast p2, Lax/c3/T;

    .line 12
    .line 13
    const/4 p4, 0x1

    .line 14
    invoke-direct {p0, p2, p4, p4}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->D0(Lax/c3/T;ZZ)Lax/N9/U;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2, p3}, Lax/O9/y;->f(Ljava/lang/String;)Lax/N9/W;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, Lax/O9/A;->a()Lax/N9/V;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-interface {p2}, Lax/O9/z;->get()Lcom/microsoft/graph/extensions/IDriveItemSearchCollectionPage;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance p3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p6, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-interface {p2}, Lcom/microsoft/graph/http/IBaseCollectionPage;->b()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :catch_2f
    :goto_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4b

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/microsoft/graph/extensions/DriveItem;
    :try_end_3b
    .catch Lax/M9/d; {:try_start_a .. :try_end_3b} :catch_48

    .line 59
    .line 60
    :try_start_3b
    new-instance v2, Lax/c3/T;

    .line 61
    .line 62
    invoke-virtual {p0, p6, v1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->N0(Ljava/util/HashMap;Lcom/microsoft/graph/extensions/DriveItem;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-direct {v2, p0, v1, v3}, Lax/c3/T;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lcom/microsoft/graph/extensions/DriveItem;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_47
    .catch Lax/b3/J; {:try_start_3b .. :try_end_47} :catch_2f
    .catch Lax/M9/d; {:try_start_3b .. :try_end_47} :catch_48

    .line 70
    .line 71
    .line 72
    goto :goto_2f

    .line 73
    :catch_48
    move-exception v0

    .line 74
    move-object p2, v0

    .line 75
    goto :goto_67

    .line 76
    :cond_4b
    :try_start_4b
    invoke-interface {p2}, Lcom/microsoft/graph/http/IBaseCollectionPage;->a()Lax/P9/p;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_60

    .line 81
    .line 82
    invoke-interface {p2}, Lcom/microsoft/graph/http/IBaseCollectionPage;->a()Lax/P9/p;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Lax/N9/W;

    .line 87
    .line 88
    invoke-interface {p2}, Lax/O9/A;->a()Lax/N9/V;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-interface {p2}, Lax/O9/z;->get()Lcom/microsoft/graph/extensions/IDriveItemSearchCollectionPage;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    goto :goto_61

    .line 97
    :cond_60
    const/4 p2, 0x0

    .line 98
    :goto_61
    if-nez p2, :cond_27

    .line 99
    .line 100
    invoke-interface {p5, p3, p4}, Lax/g3/h;->Y(Ljava/util/List;Z)V
    :try_end_66
    .catch Lax/M9/d; {:try_start_4b .. :try_end_66} :catch_48

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_67
    const-string p3, "search"

    .line 105
    .line 106
    invoke-direct {p0, p3, p2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    throw p2
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
.end method

.method public w0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    const-string v0, "/drives/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "/"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
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

.method public x0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    const-string v0, "/items/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gez v0, :cond_1f

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "invalid path:"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p1, ""

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1f
    add-int/lit8 v0, v0, 0x7

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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

.method public y()Lax/c3/k0;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->K0()Lax/N9/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lax/O9/E;->a()Lax/N9/a0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lax/O9/D;->get()Lcom/microsoft/graph/extensions/Drive;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_3a

    .line 15
    .line 16
    iget-object v2, v0, Lcom/microsoft/graph/generated/BaseDrive;->u:Lcom/microsoft/graph/extensions/Quota;

    .line 17
    .line 18
    if-nez v2, :cond_14

    .line 19
    .line 20
    goto :goto_3a

    .line 21
    :cond_14
    iget-object v3, v2, Lcom/microsoft/graph/generated/BaseQuota;->f:Ljava/lang/Long;

    .line 22
    .line 23
    if-eqz v3, :cond_3a

    .line 24
    .line 25
    iget-object v2, v2, Lcom/microsoft/graph/generated/BaseQuota;->d:Ljava/lang/Long;

    .line 26
    .line 27
    if-nez v2, :cond_1d

    .line 28
    .line 29
    goto :goto_3a

    .line 30
    :cond_1d
    new-instance v1, Lax/c3/k0;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    iget-object v4, v0, Lcom/microsoft/graph/generated/BaseDrive;->u:Lcom/microsoft/graph/extensions/Quota;

    .line 37
    .line 38
    iget-object v4, v4, Lcom/microsoft/graph/generated/BaseQuota;->f:Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDrive;->u:Lcom/microsoft/graph/extensions/Quota;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseQuota;->d:Ljava/lang/Long;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    sub-long/2addr v4, v6

    .line 53
    invoke-direct {v1, v2, v3, v4, v5}, Lax/c3/k0;-><init>(JJ)V
    :try_end_37
    .catch Lax/M9/d; {:try_start_0 .. :try_end_37} :catch_38

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :catch_38
    move-exception v0

    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    :goto_3a
    return-object v1

    .line 60
    :goto_3b
    const-string v1, "getStorageSpace"

    .line 61
    .line 62
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->u0(Ljava/lang/String;Lax/M9/d;)Lax/b3/j;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    throw v0
    .line 67
    .line 68
.end method

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper;->k0(Ljava/lang/String;Z)Lax/c3/T;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
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
