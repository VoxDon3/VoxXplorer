.class public Lcom/voxdon/xplorer/file/x;
.super Lcom/voxdon/xplorer/file/e;
.source "SourceFile"

# interfaces
.implements Lax/c3/i0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/x$d;,
        Lcom/voxdon/xplorer/file/x$e;,
        Lcom/voxdon/xplorer/file/x$c;,
        Lcom/voxdon/xplorer/file/x$g;,
        Lcom/voxdon/xplorer/file/x$f;
    }
.end annotation


# static fields
.field private static final r:Ljava/util/logging/Logger;

.field private static s:I

.field private static final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final y:[Ljava/lang/String;


# instance fields
.field private h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/o3/f;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lax/o3/f;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/voxdon/xplorer/file/g;

.field private final m:Ljava/lang/Object;

.field private n:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/lang/Boolean;

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .registers 21

    .line 1
    const-string v0, "FileManager.LocalFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/x;->r:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const/high16 v0, 0x50000

    .line 10
    .line 11
    sput v0, Lcom/voxdon/xplorer/file/x;->s:I

    .line 12
    .line 13
    const-string v19, "system"

    .line 14
    .line 15
    const-string v20, "vendor"

    .line 16
    .line 17
    const-string v1, "acct"

    .line 18
    .line 19
    const-string v2, "cache"

    .line 20
    .line 21
    const-string v3, "charger"

    .line 22
    .line 23
    const-string v4, "config"

    .line 24
    .line 25
    const-string v5, "d"

    .line 26
    .line 27
    const-string v6, "data"

    .line 28
    .line 29
    const-string v7, "debug_ramdisk"

    .line 30
    .line 31
    const-string v8, "dev"

    .line 32
    .line 33
    const-string v9, "etc"

    .line 34
    .line 35
    const-string v10, "mnt"

    .line 36
    .line 37
    const-string v11, "oem"

    .line 38
    .line 39
    const-string v12, "proc"

    .line 40
    .line 41
    const-string v13, "property_contexts"

    .line 42
    .line 43
    const-string v14, "root"

    .line 44
    .line 45
    const-string v15, "sbin"

    .line 46
    .line 47
    const-string v16, "sdcard"

    .line 48
    .line 49
    const-string v17, "storage"

    .line 50
    .line 51
    const-string v18, "sys"

    .line 52
    .line 53
    filled-new-array/range {v1 .. v20}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/voxdon/xplorer/file/x;->t:Ljava/util/List;

    .line 62
    .line 63
    const-string v0, "95"

    .line 64
    .line 65
    const-string v1, "96"

    .line 66
    .line 67
    const-string v2, "0"

    .line 68
    .line 69
    const-string v3, "999"

    .line 70
    .line 71
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lcom/voxdon/xplorer/file/x;->u:Ljava/util/List;

    .line 80
    .line 81
    const-string v0, "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images"

    .line 82
    .line 83
    const-string v1, "/DCIM/Camera"

    .line 84
    .line 85
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lcom/voxdon/xplorer/file/x;->v:Ljava/util/List;

    .line 94
    .line 95
    filled-new-array {v1}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lcom/voxdon/xplorer/file/x;->w:Ljava/util/List;

    .line 104
    .line 105
    const-string v0, "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Voice Notes"

    .line 106
    .line 107
    const-string v1, "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses"

    .line 108
    .line 109
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sput-object v0, Lcom/voxdon/xplorer/file/x;->x:Ljava/util/List;

    .line 118
    .line 119
    const-string v6, "date_added"

    .line 120
    .line 121
    const-string v7, "datetaken"

    .line 122
    .line 123
    const-string v1, "_id"

    .line 124
    .line 125
    const-string v2, "_data"

    .line 126
    .line 127
    const-string v3, "date_modified"

    .line 128
    .line 129
    const-string v4, "_size"

    .line 130
    .line 131
    const-string v5, "mime_type"

    .line 132
    .line 133
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sput-object v0, Lcom/voxdon/xplorer/file/x;->y:[Ljava/lang/String;

    .line 138
    .line 139
    return-void
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

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/file/x;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/x;->j:Z

    .line 20
    .line 21
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/voxdon/xplorer/file/x;->m:Ljava/lang/Object;

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/x;->q:Z

    .line 36
    .line 37
    return-void
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

.method private A1(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;Lax/u3/c;Lax/g3/i;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->x0(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;Lax/u3/c;Lax/g3/i;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->C0(Lcom/voxdon/xplorer/file/n;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->z1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

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

.method private B0(Lax/c3/K;Landroid/database/Cursor;Lax/X2/L;)Lcom/voxdon/xplorer/file/A;
    .registers 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    const-wide/16 v7, 0x3e8

    .line 16
    .line 17
    mul-long v5, v5, v7

    .line 18
    .line 19
    const/4 v7, 0x3

    .line 20
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    const/4 v10, 0x4

    .line 25
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    move-object/from16 v13, p0

    .line 30
    .line 31
    invoke-direct {v13, v10}, Lcom/voxdon/xplorer/file/x;->k1(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    invoke-interface {v0, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_32

    .line 40
    .line 41
    if-nez v10, :cond_31

    .line 42
    .line 43
    invoke-interface {v0, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_31

    .line 48
    .line 49
    goto :goto_32

    .line 50
    :cond_31
    const/4 v2, 0x0

    .line 51
    :cond_32
    :goto_32
    const/4 v3, 0x5

    .line 52
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    if-nez v10, :cond_45

    .line 57
    .line 58
    const-wide/16 v14, 0x0

    .line 59
    .line 60
    cmp-long v3, v5, v14

    .line 61
    .line 62
    if-eqz v3, :cond_45

    .line 63
    .line 64
    if-eqz v2, :cond_42

    .line 65
    .line 66
    goto :goto_45

    .line 67
    :cond_42
    :goto_42
    move-wide v6, v5

    .line 68
    move v5, v10

    .line 69
    goto :goto_70

    .line 70
    :cond_45
    :goto_45
    :try_start_45
    invoke-static {v4, v1}, Lax/X2/v;->l(Ljava/lang/String;Lax/X2/L;)Lax/X2/L;

    .line 71
    .line 72
    .line 73
    iget-wide v5, v1, Lax/X2/L;->c:J

    .line 74
    .line 75
    iget-boolean v10, v1, Lax/X2/L;->b:Z

    .line 76
    .line 77
    if-nez v10, :cond_42

    .line 78
    .line 79
    iget-wide v8, v1, Lax/X2/L;->a:J
    :try_end_50
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_50} :catch_51

    .line 80
    .line 81
    goto :goto_42

    .line 82
    :catch_51
    nop

    .line 83
    new-instance v1, Ljava/io/File;

    .line 84
    .line 85
    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    invoke-static {v4}, Lax/c3/d0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_42

    .line 101
    .line 102
    invoke-static {v2}, Lax/c3/A;->g(Ljava/lang/String;)Lax/c3/z;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-eqz v2, :cond_42

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    goto :goto_42

    .line 113
    :goto_70
    const/4 v1, 0x6

    .line 114
    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/4 v3, 0x0

    .line 119
    if-eqz v2, :cond_79

    .line 120
    .line 121
    goto :goto_81

    .line 122
    :cond_79
    :try_start_79
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object v3
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_79 .. :try_end_81} :catch_81

    .line 130
    :catch_81
    :goto_81
    new-instance v0, Lcom/voxdon/xplorer/file/A;

    .line 131
    .line 132
    move-wide/from16 v16, v11

    .line 133
    .line 134
    move-wide v11, v8

    .line 135
    move-wide/from16 v9, v16

    .line 136
    .line 137
    move-object v8, v3

    .line 138
    move-object v3, v0

    .line 139
    invoke-direct/range {v3 .. v12}, Lcom/voxdon/xplorer/file/A;-><init>(Ljava/lang/String;ZJLjava/lang/Long;JJ)V

    .line 140
    .line 141
    .line 142
    return-object v3
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

.method private B1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/X2/J;->x(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_12

    .line 10
    .line 11
    invoke-static {p1}, Lax/c3/B;->M(Lcom/voxdon/xplorer/file/n;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method public static C1(Landroid/content/Context;Lax/c3/K;Lcom/voxdon/xplorer/file/y;)Z
    .registers 4

    .line 1
    if-eqz p2, :cond_16

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->o0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_14

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_14

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->f1()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_16

    .line 20
    .line 21
    :cond_14
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_16
    if-nez p2, :cond_1a

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    goto :goto_1e

    .line 27
    :cond_1a
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :goto_1e
    invoke-static {p0, p1, p2}, Lcom/voxdon/xplorer/file/x;->D1(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
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

.method private D0(Lcom/voxdon/xplorer/file/n;Z)Z
    .registers 7

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->m1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    move-object v0, p1

    .line 17
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 28
    .line 29
    if-ne v2, v3, :cond_1f

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1f
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "/Android"

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_38

    .line 43
    .line 44
    invoke-static {p1}, Lcom/voxdon/xplorer/file/x;->h1(Lcom/voxdon/xplorer/file/n;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_37

    .line 49
    .line 50
    invoke-static {p1}, Lcom/voxdon/xplorer/file/x;->i1(Lcom/voxdon/xplorer/file/n;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_38

    .line 55
    .line 56
    :cond_37
    return v1

    .line 57
    :cond_38
    invoke-static {}, Lax/X2/Q;->A0()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_4b

    .line 62
    .line 63
    if-nez p2, :cond_4b

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p2}, Lax/c3/A;->L(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_4b

    .line 74
    .line 75
    return v1

    .line 76
    :cond_4b
    const-string p2, "tmp"

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_58

    .line 87
    .line 88
    return v1

    .line 89
    :cond_58
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string p2, ".$recycle_bin$"

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_65

    .line 100
    .line 101
    return v1

    .line 102
    :cond_65
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_7d

    .line 107
    .line 108
    const-string p2, "/.localcache"

    .line 109
    .line 110
    invoke-static {p2, p1}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_74

    .line 115
    .line 116
    return v1

    .line 117
    :cond_74
    const-string p2, "/Android/media/com.voxdon.xplorer/.localcache"

    .line 118
    .line 119
    invoke-static {p2, p1}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_8c

    .line 124
    .line 125
    return v1

    .line 126
    :cond_7d
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_8c

    .line 131
    .line 132
    const-string p2, "/localcache"

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_8c

    .line 139
    .line 140
    return v1

    .line 141
    :cond_8c
    const/4 p1, 0x0

    .line 142
    return p1
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
.end method

.method public static D1(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z
    .registers 7

    .line 1
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-static {p1}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_29

    .line 16
    .line 17
    if-eqz p2, :cond_18

    .line 18
    .line 19
    invoke-static {p0, p1, p2}, Lcom/voxdon/xplorer/file/g;->C(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    xor-int/2addr p0, v3

    .line 24
    return p0

    .line 25
    :cond_18
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, p1}, Lax/Z2/j;->j0(Lax/c3/K;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_23

    .line 34
    .line 35
    return v1

    .line 36
    :cond_23
    invoke-static {p0, p1, v2}, Lcom/voxdon/xplorer/file/g;->C(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    xor-int/2addr p0, v3

    .line 41
    return p0

    .line 42
    :cond_29
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p2}, Lax/Q2/f;->i0(Lax/Q2/f;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_34

    .line 51
    .line 52
    return v1

    .line 53
    :cond_34
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2, p1}, Lax/Z2/j;->k0(Lax/c3/K;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_3f

    .line 62
    .line 63
    return v1

    .line 64
    :cond_3f
    invoke-static {p0, p1, v2}, Lcom/voxdon/xplorer/file/g;->C(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_50

    .line 69
    .line 70
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, p1}, Lax/Z2/j;->j0(Lax/c3/K;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_50

    .line 79
    .line 80
    return v3

    .line 81
    :cond_50
    return v1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static E1(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z
    .registers 5

    .line 1
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->o0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_18

    .line 23
    .line 24
    return v1

    .line 25
    :cond_18
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->f1()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1f
    if-eqz p2, :cond_36

    .line 33
    .line 34
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p2, v0}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_36

    .line 47
    .line 48
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/file/x;->t0(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_36

    .line 53
    .line 54
    return v1

    .line 55
    :cond_36
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {p0, p2, p1}, Lcom/voxdon/xplorer/file/x;->C1(Landroid/content/Context;Lax/c3/K;Lcom/voxdon/xplorer/file/y;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0
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

.method private F0(Ljava/util/ArrayList;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/o3/f;",
            ">;)V"
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
    const/16 v1, 0x1388

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0x1388

    .line 11
    .line 12
    :cond_b
    if-eqz v3, :cond_16

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/16 v4, 0x1388

    .line 22
    .line 23
    :cond_16
    :try_start_16
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    :cond_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_42

    .line 32
    .line 33
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Lax/o3/f;

    .line 38
    .line 39
    if-eqz v6, :cond_33

    .line 40
    .line 41
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, Lax/o3/f;->a()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v4, v6

    .line 49
    goto :goto_33

    .line 50
    :catch_31
    move-exception v5

    .line 51
    goto :goto_4c

    .line 52
    :cond_33
    :goto_33
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 53
    .line 54
    .line 55
    sget v6, Lcom/voxdon/xplorer/file/x;->s:I

    .line 56
    .line 57
    if-lt v4, v6, :cond_1a

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-direct {p0, v0, v5, v4}, Lcom/voxdon/xplorer/file/x;->P1(Ljava/util/ArrayList;ZI)V

    .line 64
    .line 65
    .line 66
    goto :goto_68

    .line 67
    :cond_42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-lez v5, :cond_66

    .line 72
    .line 73
    invoke-direct {p0, v0, v2, v4}, Lcom/voxdon/xplorer/file/x;->P1(Ljava/util/ArrayList;ZI)V
    :try_end_4b
    .catch Ljava/lang/RuntimeException; {:try_start_16 .. :try_end_4b} :catch_31

    .line 74
    .line 75
    .line 76
    goto :goto_68

    .line 77
    :goto_4c
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    instance-of v6, v6, Landroid/os/TransactionTooLargeException;

    .line 82
    .line 83
    if-eqz v6, :cond_61

    .line 84
    .line 85
    sget v6, Lcom/voxdon/xplorer/file/x;->s:I

    .line 86
    .line 87
    const/high16 v7, 0x50000

    .line 88
    .line 89
    if-ne v6, v7, :cond_61

    .line 90
    .line 91
    const v3, 0x28000

    .line 92
    .line 93
    .line 94
    sput v3, Lcom/voxdon/xplorer/file/x;->s:I

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    goto :goto_66

    .line 98
    :cond_61
    const-string v6, "executePendingScan"

    .line 99
    .line 100
    invoke-static {v6, v5}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :cond_66
    :goto_66
    if-nez v3, :cond_b

    .line 104
    .line 105
    :goto_68
    return-void
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

.method private F1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Ljava/lang/Throwable;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_23

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_13

    .line 13
    .line 14
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_23

    .line 19
    .line 20
    :cond_13
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {v0, v2, p2, v1}, Lcom/voxdon/xplorer/file/z;->P(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :cond_23
    if-nez v1, :cond_57

    .line 37
    .line 38
    move-object p2, p1

    .line 39
    check-cast p2, Lcom/voxdon/xplorer/file/y;

    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 42
    .line 43
    .line 44
    if-nez p3, :cond_43

    .line 45
    .line 46
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3b

    .line 51
    .line 52
    new-instance p1, Lax/b3/j;

    .line 53
    .line 54
    const-string p2, "File.renameTo failed"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3b
    new-instance p1, Lax/b3/t;

    .line 61
    .line 62
    const-string p2, "move source not exist"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_43
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_51

    .line 73
    .line 74
    new-instance p1, Lax/b3/j;

    .line 75
    .line 76
    const-string p2, "Files.move failed"

    .line 77
    .line 78
    invoke-direct {p1, p2, p3}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_51
    new-instance p1, Lax/b3/t;

    .line 83
    .line 84
    invoke-direct {p1, p3}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_57
    return-void
.end method

.method private G1(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;
    .registers 14

    .line 1
    const/4 v1, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v1

    .line 5
    :cond_4
    :try_start_4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v7, 0x0

    .line 14
    move-object v3, p1

    .line 15
    move-object v4, p2

    .line 16
    move-object v5, p3

    .line 17
    move-object v6, p4

    .line 18
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_15
    .catchall {:try_start_4 .. :try_end_15} :catchall_2f

    .line 22
    if-eqz p1, :cond_29

    .line 23
    .line 24
    :try_start_17
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_29

    .line 29
    .line 30
    invoke-interface {p1, p5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2
    :try_end_21
    .catchall {:try_start_17 .. :try_end_21} :catchall_25

    .line 34
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    :catchall_25
    move-exception v0

    .line 39
    move-object p2, v0

    .line 40
    move-object v1, p1

    .line 41
    goto :goto_31

    .line 42
    :cond_29
    if-eqz p1, :cond_2e

    .line 43
    .line 44
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    return-object v1

    .line 48
    :catchall_2f
    move-exception v0

    .line 49
    move-object p2, v0

    .line 50
    :goto_31
    if-eqz v1, :cond_36

    .line 51
    .line 52
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 53
    .line 54
    .line 55
    :cond_36
    throw p2
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
.end method

.method private H0(Ljava/util/ArrayList;ILax/g3/i;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/o3/f;",
            ">;I",
            "Lax/g3/i;",
            ")V"
        }
    .end annotation

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_24

    .line 6
    .line 7
    if-eqz p3, :cond_13

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sub-int v0, p2, v0

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    int-to-long v2, p2

    .line 17
    invoke-interface {p3, v0, v1, v2, v3}, Lax/g3/i;->a(JJ)V

    .line 18
    .line 19
    .line 20
    :cond_13
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->F0(Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    const-wide/16 v0, 0x1f4

    .line 30
    .line 31
    :try_start_1e
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_21} :catch_22

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_22
    nop

    .line 36
    goto :goto_0

    .line 37
    :cond_24
    if-eqz p3, :cond_31

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    sub-int p1, p2, p1

    .line 44
    .line 45
    int-to-long v0, p1

    .line 46
    int-to-long p1, p2

    .line 47
    invoke-interface {p3, v0, v1, p1, p2}, Lax/g3/i;->a(JJ)V

    .line 48
    .line 49
    .line 50
    :cond_31
    return-void
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

.method public static J0(Ljava/util/List;)Lcom/voxdon/xplorer/file/n;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)",
            "Lcom/voxdon/xplorer/file/n;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1d

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ".hidden"

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1d
    const/4 p0, 0x0

    .line 31
    return-object p0
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

.method private static K1(J)J
    .registers 16

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    move-wide v2, v0

    .line 4
    move-wide v4, v2

    .line 5
    :cond_4
    :goto_4
    mul-long v6, v2, v4

    .line 6
    .line 7
    cmp-long v8, v6, p0

    .line 8
    .line 9
    if-gez v8, :cond_2b

    .line 10
    .line 11
    sub-long v9, p0, v6

    .line 12
    .line 13
    const-wide/16 v11, 0x2

    .line 14
    .line 15
    div-long v11, v6, v11

    .line 16
    .line 17
    cmp-long v13, v9, v11

    .line 18
    .line 19
    if-lez v13, :cond_2b

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    shl-long/2addr v2, v6

    .line 23
    const-wide/16 v6, 0x200

    .line 24
    .line 25
    cmp-long v8, v2, v6

    .line 26
    .line 27
    if-lez v8, :cond_4

    .line 28
    .line 29
    invoke-static {}, Lax/X2/Q;->b2()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_28

    .line 34
    .line 35
    const-wide/16 v2, 0x3e8

    .line 36
    .line 37
    :goto_24
    mul-long v4, v4, v2

    .line 38
    .line 39
    move-wide v2, v0

    .line 40
    goto :goto_4

    .line 41
    :cond_28
    const-wide/16 v2, 0x400

    .line 42
    .line 43
    goto :goto_24

    .line 44
    :cond_2b
    if-lez v8, :cond_2e

    .line 45
    .line 46
    return-wide v6

    .line 47
    :cond_2e
    return-wide p0
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

.method private L1(Lcom/voxdon/xplorer/file/n;ZZ)V
    .registers 13

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/x;->D0(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 v6, 0x0

    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move-object v2, p1

    .line 14
    move v4, p2

    .line 15
    move v7, p3

    .line 16
    invoke-direct/range {v1 .. v8}, Lcom/voxdon/xplorer/file/x;->r0(Lcom/voxdon/xplorer/file/n;ZZZZZZ)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method private M0(Lcom/voxdon/xplorer/file/y;Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 6

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->T0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_c

    .line 7
    .line 8
    :try_start_7
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->V0(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/y;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_b
    .catch Lax/b3/j; {:try_start_7 .. :try_end_b} :catch_64

    .line 12
    return-object p1

    .line 13
    :cond_c
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lax/c3/I;->b(Lax/c3/K;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_2b

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p2}, Lax/c3/I;->c(Lax/c3/K;Ljava/lang/String;)Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_64

    .line 33
    .line 34
    new-instance v0, Lcom/voxdon/xplorer/file/y;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p0, p2, p1, v2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lax/c3/I;->a(Lax/c3/K;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4f

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4f

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0, p2}, Lax/c3/I;->c(Lax/c3/K;Ljava/lang/String;)Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_64

    .line 69
    .line 70
    new-instance v0, Lcom/voxdon/xplorer/file/y;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {v0, p0, p2, p1, v2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_4f
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lcom/voxdon/xplorer/shizuku/c;->l()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_64

    .line 89
    .line 90
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1, p0, v1, p2}, Lcom/voxdon/xplorer/shizuku/c;->r(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_64

    .line 99
    .line 100
    return-object p1

    .line 101
    :catch_64
    :cond_64
    return-object v1
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

.method private M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V
    .registers 15

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/x;->D0(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->q0(Lcom/voxdon/xplorer/file/n;ZZZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move-object v2, p1

    .line 26
    move v5, p2

    .line 27
    move v6, p3

    .line 28
    move v7, p4

    .line 29
    move v8, p5

    .line 30
    invoke-direct/range {v1 .. v8}, Lcom/voxdon/xplorer/file/x;->r0(Lcom/voxdon/xplorer/file/n;ZZZZZZ)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method private N1(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 25

    .line 1
    if-eqz p6, :cond_b

    .line 2
    .line 3
    invoke-interface/range {p6 .. p6}, Lax/u3/c;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    goto :goto_6b

    .line 12
    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    move/from16 v7, p4

    .line 21
    .line 22
    invoke-static {v0, v1, v4, v7}, Lax/c3/N;->d(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    const-string v0, ""

    .line 40
    .line 41
    :goto_28
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_88

    .line 46
    .line 47
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    move-object v10, v3

    .line 52
    check-cast v10, Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v10}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_6e

    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v12

    .line 68
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-lez v0, :cond_61

    .line 73
    .line 74
    sub-long v14, v12, v5

    .line 75
    .line 76
    const-wide/16 v16, 0x64

    .line 77
    .line 78
    cmp-long v0, v14, v16

    .line 79
    .line 80
    if-lez v0, :cond_61

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    move-object/from16 v0, p0

    .line 84
    .line 85
    move/from16 v5, p3

    .line 86
    .line 87
    move-object/from16 v6, p5

    .line 88
    .line 89
    invoke-virtual/range {v0 .. v6}, Lcom/voxdon/xplorer/file/x;->I0(Lcom/voxdon/xplorer/file/n;Ljava/util/List;ZLjava/lang/String;ZLax/g3/h;)V

    .line 90
    .line 91
    .line 92
    move-object v1, v0

    .line 93
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 94
    .line 95
    .line 96
    move-wide v5, v12

    .line 97
    goto :goto_63

    .line 98
    :cond_61
    move-object/from16 v1, p0

    .line 99
    .line 100
    :goto_63
    if-eqz p6, :cond_6c

    .line 101
    .line 102
    invoke-interface/range {p6 .. p6}, Lax/u3/c;->isCancelled()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6c

    .line 107
    .line 108
    :goto_6b
    return-void

    .line 109
    :cond_6c
    move-object v0, v11

    .line 110
    goto :goto_70

    .line 111
    :cond_6e
    move-object/from16 v1, p0

    .line 112
    .line 113
    :goto_70
    invoke-virtual {v1, v10}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v3}, Lax/c3/b;->n()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_83

    .line 122
    .line 123
    invoke-static {v3}, Lcom/voxdon/xplorer/file/J;->j2(Lcom/voxdon/xplorer/file/n;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_83

    .line 128
    .line 129
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    :cond_83
    move-object/from16 v1, p1

    .line 133
    .line 134
    move-object/from16 v4, p2

    .line 135
    .line 136
    goto :goto_28

    .line 137
    :cond_88
    move-object/from16 v1, p0

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-lez v0, :cond_a1

    .line 144
    .line 145
    const/4 v3, 0x1

    .line 146
    move-object/from16 v4, p2

    .line 147
    .line 148
    move/from16 v5, p3

    .line 149
    .line 150
    move-object/from16 v6, p5

    .line 151
    .line 152
    move-object v0, v1

    .line 153
    move-object/from16 v1, p1

    .line 154
    .line 155
    invoke-virtual/range {v0 .. v6}, Lcom/voxdon/xplorer/file/x;->I0(Lcom/voxdon/xplorer/file/n;Ljava/util/List;ZLjava/lang/String;ZLax/g3/h;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 159
    .line 160
    .line 161
    goto :goto_a2

    .line 162
    :cond_a1
    move-object v0, v1

    .line 163
    :goto_a2
    new-instance v5, Lcom/voxdon/xplorer/file/x$a;

    .line 164
    .line 165
    move-object/from16 v6, p5

    .line 166
    .line 167
    invoke-direct {v5, v0, v8, v6}, Lcom/voxdon/xplorer/file/x$a;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/util/List;Lax/g3/h;)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v1, p1

    .line 171
    .line 172
    move-object/from16 v2, p2

    .line 173
    .line 174
    move/from16 v3, p3

    .line 175
    .line 176
    move-object/from16 v6, p6

    .line 177
    .line 178
    move v4, v7

    .line 179
    invoke-virtual/range {v0 .. v6}, Lcom/voxdon/xplorer/file/m;->o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V

    .line 180
    .line 181
    .line 182
    return-void
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

.method public static O0(Ljava/io/File;)Lcom/voxdon/xplorer/file/y;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/voxdon/xplorer/file/y;
    :try_end_e
    .catch Lax/b3/j; {:try_start_4 .. :try_end_e} :catch_f

    .line 14
    .line 15
    return-object p0

    .line 16
    :catch_f
    invoke-static {}, Lax/u3/b;->f()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
    .line 21
    .line 22
.end method

.method public static O1(Landroid/content/Context;Ljava/util/ArrayList;ZI)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lax/o3/f;",
            ">;ZI)V"
        }
    .end annotation

    .line 1
    new-instance p3, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v0, Lcom/voxdon/xplorer/service/ScanService;

    .line 4
    .line 5
    invoke-direct {p3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Lax/o3/f;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Landroid/os/Parcelable;

    .line 16
    .line 17
    const-string v0, "PENDING_SCAN_ARRAY"

    .line 18
    .line 19
    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string p1, "HAS_FOLLOWING_LIST"

    .line 23
    .line 24
    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    :try_start_1b
    invoke-static {p0, p3, p1, p1}, Lax/u3/B;->f0(Landroid/content/Context;Landroid/content/Intent;ZZ)V
    :try_end_1e
    .catch Ljava/lang/IllegalStateException; {:try_start_1b .. :try_end_1e} :catch_1f

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    invoke-static {p0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p2, "START SCAN SERVICE FOREGROUND"

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 52
    .line 53
    .line 54
    return-void
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

.method private P0(Lcom/voxdon/xplorer/file/y;J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    cmp-long p1, p2, v1

    .line 13
    .line 14
    if-eqz p1, :cond_12

    .line 15
    .line 16
    invoke-virtual {v0, p2, p3}, Ljava/io/FileInputStream;->skip(J)J

    .line 17
    .line 18
    .line 19
    :cond_12
    return-object v0
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

.method private P1(Ljava/util/ArrayList;ZI)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/o3/f;",
            ">;ZI)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/x;->O1(Landroid/content/Context;Ljava/util/ArrayList;ZI)V

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

.method private Q0(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 14

    .line 1
    invoke-static {}, Lax/X2/Q;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    if-eqz p2, :cond_12

    .line 10
    .line 11
    sget-object p2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 12
    .line 13
    sget-object v0, Landroid/provider/MediaStore$Video$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 14
    .line 15
    const-string v2, "video_id"

    .line 16
    .line 17
    :goto_10
    move-object v4, p2

    .line 18
    goto :goto_19

    .line 19
    :cond_12
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 20
    .line 21
    sget-object v0, Landroid/provider/MediaStore$Images$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 22
    .line 23
    const-string v2, "image_id"

    .line 24
    .line 25
    goto :goto_10

    .line 26
    :goto_19
    const-string p2, "_id"

    .line 27
    .line 28
    const-string v9, "_data"

    .line 29
    .line 30
    filled-new-array {p2, v9}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    filled-new-array {p1}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    const/4 v8, 0x0

    .line 39
    const-string v6, "_data = ?"

    .line 40
    .line 41
    move-object v3, p0

    .line 42
    invoke-direct/range {v3 .. v8}, Lcom/voxdon/xplorer/file/x;->G1(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-eqz v4, :cond_51

    .line 47
    .line 48
    filled-new-array {p2, v9}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    new-instance p2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, " = ?"

    .line 61
    .line 62
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    filled-new-array {v4}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    const/4 v10, 0x1

    .line 74
    move-object v5, p0

    .line 75
    move-object v6, v0

    .line 76
    invoke-direct/range {v5 .. v10}, Lcom/voxdon/xplorer/file/x;->G1(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    move-object v3, v5

    .line 81
    goto :goto_53

    .line 82
    :cond_51
    move-object v3, p0

    .line 83
    move-object p2, v1

    .line 84
    :goto_53
    if-eqz p2, :cond_84

    .line 85
    .line 86
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v0}, Lax/c3/b;->n()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_61

    .line 95
    .line 96
    :goto_5f
    move-object p2, v1

    .line 97
    goto :goto_84

    .line 98
    :cond_61
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_84

    .line 107
    .line 108
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    invoke-interface {v0}, Lax/c3/b;->q()J

    .line 113
    .line 114
    .line 115
    move-result-wide v6

    .line 116
    cmp-long v0, v4, v6

    .line 117
    .line 118
    if-lez v0, :cond_84

    .line 119
    .line 120
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    cmp-long p1, v4, v6

    .line 129
    .line 130
    if-gez p1, :cond_84

    .line 131
    .line 132
    goto :goto_5f

    .line 133
    :cond_84
    :goto_84
    if-eqz p2, :cond_8e

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_8d

    .line 140
    .line 141
    goto :goto_8e

    .line 142
    :cond_8d
    return-object p2

    .line 143
    :cond_8e
    :goto_8e
    return-object v1
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
.end method

.method public static R0(Landroid/content/Context;Ljava/util/List;)Lcom/voxdon/xplorer/file/j;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)",
            "Lcom/voxdon/xplorer/file/j;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    move-object v1, v0

    .line 7
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_5d

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 18
    .line 19
    invoke-static {v2}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_19

    .line 24
    .line 25
    goto :goto_6

    .line 26
    :cond_19
    instance-of v3, v2, Lcom/voxdon/xplorer/file/K;

    .line 27
    .line 28
    if-eqz v3, :cond_32

    .line 29
    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Lcom/voxdon/xplorer/file/K;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/K;->C1()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_32

    .line 38
    .line 39
    :try_start_26
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, Lcom/voxdon/xplorer/file/y;->I0(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y;

    .line 44
    .line 45
    .line 46
    move-result-object v2
    :try_end_2e
    .catch Lax/b3/j; {:try_start_26 .. :try_end_2e} :catch_2f

    .line 47
    goto :goto_34

    .line 48
    :catch_2f
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 49
    .line 50
    goto :goto_34

    .line 51
    :cond_32
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 52
    .line 53
    :goto_34
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3, v1}, Lax/c3/K;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_3f

    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_3f
    invoke-static {p0, v3, v2}, Lcom/voxdon/xplorer/file/x;->C1(Landroid/content/Context;Lax/c3/K;Lcom/voxdon/xplorer/file/y;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_5b

    .line 69
    .line 70
    invoke-static {v3}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_55

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_55

    .line 81
    .line 82
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :cond_55
    new-instance p0, Lcom/voxdon/xplorer/file/j;

    .line 87
    .line 88
    invoke-direct {p0, v3, v0}, Lcom/voxdon/xplorer/file/j;-><init>(Lax/c3/K;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_5b
    move-object v1, v3

    .line 93
    goto :goto_6

    .line 94
    :cond_5d
    return-object v0
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

.method private R1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 8

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 2
    .line 3
    check-cast p2, Lcom/voxdon/xplorer/file/y;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_1b

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lax/c3/K;->f:Lax/c3/K;

    .line 17
    .line 18
    if-ne v2, v3, :cond_1a

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->T0()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1a

    .line 25
    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    return v1

    .line 28
    :cond_1b
    :goto_1b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Lax/c3/K;->e:Lax/c3/K;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v2, v3, :cond_2e

    .line 36
    .line 37
    if-eqz v0, :cond_2d

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2d

    .line 44
    .line 45
    return v4

    .line 46
    :cond_2d
    return v1

    .line 47
    :cond_2e
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v2, Lax/c3/K;->f:Lax/c3/K;

    .line 52
    .line 53
    if-ne p1, v2, :cond_40

    .line 54
    .line 55
    if-nez v0, :cond_40

    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3f

    .line 62
    .line 63
    goto :goto_40

    .line 64
    :cond_3f
    return v1

    .line 65
    :cond_40
    :goto_40
    return v4
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

.method private static declared-synchronized S0(Landroid/os/ParcelFileDescriptor;II)Landroid/graphics/Bitmap;
    .registers 7

    .line 1
    const-class v0, Lcom/voxdon/xplorer/file/x;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_4
    new-instance v2, Landroid/graphics/pdf/PdfRenderer;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Landroid/graphics/pdf/PdfRenderer;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_9} :catch_34
    .catchall {:try_start_4 .. :try_end_9} :catchall_31

    .line 8
    .line 9
    .line 10
    :try_start_9
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 11
    .line 12
    invoke-static {p1, p2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 p2, -0x1

    .line 17
    invoke-virtual {p1, p2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {v2, p2}, Landroid/graphics/pdf/PdfRenderer;->openPage(I)Landroid/graphics/pdf/PdfRenderer$Page;

    .line 22
    .line 23
    .line 24
    move-result-object p2
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_18} :catch_2e
    .catchall {:try_start_9 .. :try_end_18} :catchall_2b

    .line 25
    const/4 v3, 0x1

    .line 26
    :try_start_19
    invoke-virtual {p2, p1, v1, v1, v3}, Landroid/graphics/pdf/PdfRenderer$Page;->render(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Matrix;I)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_1c} :catch_29
    .catchall {:try_start_19 .. :try_end_1c} :catchall_26

    .line 27
    .line 28
    .line 29
    :try_start_1c
    invoke-static {p2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V
    :try_end_22
    .catchall {:try_start_1c .. :try_end_22} :catchall_24

    .line 33
    .line 34
    .line 35
    monitor-exit v0

    .line 36
    return-object p1

    .line 37
    :catchall_24
    move-exception p0

    .line 38
    goto :goto_53

    .line 39
    :catchall_26
    move-exception p1

    .line 40
    :goto_27
    move-object v1, v2

    .line 41
    goto :goto_38

    .line 42
    :catch_29
    nop

    .line 43
    goto :goto_45

    .line 44
    :catchall_2b
    move-exception p1

    .line 45
    move-object p2, v1

    .line 46
    goto :goto_27

    .line 47
    :catch_2e
    nop

    .line 48
    move-object p2, v1

    .line 49
    goto :goto_45

    .line 50
    :catchall_31
    move-exception p1

    .line 51
    move-object p2, v1

    .line 52
    goto :goto_38

    .line 53
    :catch_34
    nop

    .line 54
    move-object p2, v1

    .line 55
    move-object v2, p2

    .line 56
    goto :goto_45

    .line 57
    :goto_38
    if-eqz v1, :cond_41

    .line 58
    .line 59
    :try_start_3a
    invoke-static {p2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 63
    .line 64
    .line 65
    goto :goto_44

    .line 66
    :cond_41
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 67
    .line 68
    .line 69
    :goto_44
    throw p1

    .line 70
    :goto_45
    if-eqz v2, :cond_4e

    .line 71
    .line 72
    invoke-static {p2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 76
    .line 77
    .line 78
    goto :goto_51

    .line 79
    :cond_4e
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V
    :try_end_51
    .catchall {:try_start_3a .. :try_end_51} :catchall_24

    .line 80
    .line 81
    .line 82
    :goto_51
    monitor-exit v0

    .line 83
    return-object v1

    .line 84
    :goto_53
    :try_start_53
    monitor-exit v0
    :try_end_54
    .catchall {:try_start_53 .. :try_end_54} :catchall_24

    .line 85
    throw p0
    .line 86
    .line 87
    .line 88
.end method

.method private S1()Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/x;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_18

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 10
    .line 11
    if-ne v0, v1, :cond_18

    .line 12
    .line 13
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/Z2/j;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_18

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_18
    const/4 v0, 0x0

    .line 26
    return v0
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

.method private V0(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/y;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1, v3, v0}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/4 p1, 0x0

    .line 30
    :try_start_1d
    sget-object v7, Lax/c3/l;->g:[Ljava/lang/String;

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 36
    .line 37
    .line 38
    move-result-object v6
    :try_end_26
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1d .. :try_end_26} :catch_59
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_26} :catch_56
    .catchall {:try_start_1d .. :try_end_26} :catchall_53

    .line 39
    if-eqz v6, :cond_4b

    .line 40
    .line 41
    :try_start_28
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_45

    .line 46
    .line 47
    new-instance v1, Lcom/voxdon/xplorer/file/y;

    .line 48
    .line 49
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    move-object v2, p0

    .line 54
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Landroid/net/Uri;Lax/c3/K;Ljava/lang/String;Landroid/database/Cursor;)V
    :try_end_38
    .catch Ljava/lang/IllegalArgumentException; {:try_start_28 .. :try_end_38} :catch_42
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_38} :catch_3f
    .catchall {:try_start_28 .. :try_end_38} :catchall_3c

    .line 55
    .line 56
    .line 57
    invoke-static {v6}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :catchall_3c
    move-exception v0

    .line 62
    :goto_3d
    move-object p1, v0

    .line 63
    goto :goto_8c

    .line 64
    :catch_3f
    move-exception v0

    .line 65
    :goto_40
    move-object p1, v0

    .line 66
    goto :goto_5c

    .line 67
    :catch_42
    move-exception v0

    .line 68
    :goto_43
    move-object p1, v0

    .line 69
    goto :goto_86

    .line 70
    :cond_45
    :try_start_45
    new-instance p1, Lax/b3/t;

    .line 71
    .line 72
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_4b
    new-instance p1, Lax/b3/j;

    .line 77
    .line 78
    const-string v0, "query return null"

    .line 79
    .line 80
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
    :try_end_53
    .catch Ljava/lang/IllegalArgumentException; {:try_start_45 .. :try_end_53} :catch_42
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_53} :catch_3f
    .catchall {:try_start_45 .. :try_end_53} :catchall_3c

    .line 84
    :catchall_53
    move-exception v0

    .line 85
    move-object v6, p1

    .line 86
    goto :goto_3d

    .line 87
    :catch_56
    move-exception v0

    .line 88
    move-object v6, p1

    .line 89
    goto :goto_40

    .line 90
    :catch_59
    move-exception v0

    .line 91
    move-object v6, p1

    .line 92
    goto :goto_43

    .line 93
    :goto_5c
    :try_start_5c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v1, "getFileInfo : "

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ":"

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0, p1}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    throw p1

    .line 135
    :goto_86
    new-instance v0, Lax/b3/j;

    .line 136
    .line 137
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw v0
    :try_end_8c
    .catchall {:try_start_5c .. :try_end_8c} :catchall_3c

    .line 141
    :goto_8c
    invoke-static {v6}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 142
    .line 143
    .line 144
    throw p1
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
.end method

.method private W0(Ljava/lang/String;J)Lax/c3/k0;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Lax/X2/v;->o(Ljava/lang/String;)Lax/X2/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    cmp-long v3, p2, v1

    .line 8
    .line 9
    if-lez v3, :cond_c

    .line 10
    .line 11
    :goto_a
    move-wide v1, p2

    .line 12
    goto :goto_13

    .line 13
    :cond_c
    iget-wide p2, v0, Lax/X2/M;->b:J

    .line 14
    .line 15
    iget-wide v0, v0, Lax/X2/M;->a:J

    .line 16
    .line 17
    mul-long p2, p2, v0

    .line 18
    .line 19
    goto :goto_a

    .line 20
    :goto_13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string p3, "storage"

    .line 25
    .line 26
    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Landroid/os/storage/StorageManager;

    .line 31
    .line 32
    new-instance p3, Ljava/io/File;

    .line 33
    .line 34
    invoke-direct {p3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, p3}, Lax/T2/a;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Ljava/util/UUID;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p2, p1}, Lax/c3/J;->a(Landroid/os/storage/StorageManager;Ljava/util/UUID;)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    sub-long v3, v1, p1

    .line 46
    .line 47
    new-instance v0, Lax/c3/k0;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct/range {v0 .. v5}, Lax/c3/k0;-><init>(JJI)V
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_34} :catch_35

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catch_35
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    new-instance p2, Lax/b3/j;

    .line 57
    .line 58
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw p2
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

.method private X0()Lax/c3/k0;
    .registers 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_ea

    .line 20
    .line 21
    invoke-interface {v2}, Lax/c3/b;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-wide/16 v4, 0x0

    .line 26
    .line 27
    if-nez v3, :cond_76

    .line 28
    .line 29
    sget-object v3, Lax/Q2/f;->q0:Lax/Q2/f;

    .line 30
    .line 31
    if-ne v1, v3, :cond_39

    .line 32
    .line 33
    invoke-interface {v2}, Lax/c3/b;->p()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    cmp-long v1, v6, v4

    .line 38
    .line 39
    if-nez v1, :cond_6e

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "Download root path file size 0 deleted"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 55
    .line 56
    .line 57
    goto :goto_6e

    .line 58
    :cond_39
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v4, "RootPath is File"

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ":"

    .line 89
    .line 90
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-interface {v2}, Lax/c3/b;->p()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v3, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 109
    .line 110
    .line 111
    :cond_6e
    :goto_6e
    new-instance v1, Lax/b3/j;

    .line 112
    .line 113
    const-string v2, "Root path is file"

    .line 114
    .line 115
    invoke-direct {v1, v2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v1

    .line 119
    :cond_76
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1, v2}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-nez v1, :cond_84

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    :cond_84
    instance-of v3, v2, Lcom/voxdon/xplorer/file/C;

    .line 134
    .line 135
    if-eqz v3, :cond_8f

    .line 136
    .line 137
    check-cast v2, Lcom/voxdon/xplorer/file/C;

    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/v;->C1()Lcom/voxdon/xplorer/file/u$a;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    goto :goto_90

    .line 144
    :cond_8f
    const/4 v2, 0x0

    .line 145
    :goto_90
    const/4 v3, 0x0

    .line 146
    if-eqz v1, :cond_c3

    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    move-wide v8, v4

    .line 158
    const/4 v7, 0x0

    .line 159
    :cond_9e
    :goto_9e
    if-ge v7, v1, :cond_bf

    .line 160
    .line 161
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    add-int/lit8 v7, v7, 0x1

    .line 166
    .line 167
    check-cast v10, Lcom/voxdon/xplorer/file/n;

    .line 168
    .line 169
    check-cast v10, Lcom/voxdon/xplorer/file/y;

    .line 170
    .line 171
    invoke-virtual {v10}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    if-eqz v11, :cond_9e

    .line 180
    .line 181
    invoke-static {v10, v2}, Lax/c3/B;->v(Ljava/io/File;Ljava/io/FilenameFilter;)I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    add-int/2addr v3, v11

    .line 186
    invoke-static {v10, v2}, Lax/c3/B;->p(Ljava/io/File;Ljava/io/FilenameFilter;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v10

    .line 190
    add-long/2addr v8, v10

    .line 191
    goto :goto_9e

    .line 192
    :cond_bf
    move/from16 v17, v3

    .line 193
    .line 194
    move-wide v11, v8

    .line 195
    goto :goto_c6

    .line 196
    :cond_c3
    move-wide v11, v4

    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    :goto_c6
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_e2

    .line 208
    .line 209
    const-string v1, "/"

    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-nez v1, :cond_e2

    .line 220
    .line 221
    invoke-direct {v0}, Lcom/voxdon/xplorer/file/x;->Y0()Lax/c3/k0;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iget-wide v4, v1, Lax/c3/k0;->d:J

    .line 226
    .line 227
    :cond_e2
    move-wide v15, v4

    .line 228
    new-instance v10, Lax/c3/k0;

    .line 229
    .line 230
    move-wide v13, v11

    .line 231
    invoke-direct/range {v10 .. v17}, Lax/c3/k0;-><init>(JJJI)V

    .line 232
    .line 233
    .line 234
    return-object v10

    .line 235
    :cond_ea
    new-instance v1, Lax/b3/t;

    .line 236
    .line 237
    const-string v2, "StorageSpaceIteration root file not found"

    .line 238
    .line 239
    invoke-direct {v1, v2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v1
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

.method private Y0()Lax/c3/k0;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

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
    if-nez v1, :cond_a8

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 16
    .line 17
    if-ne v1, v2, :cond_4c

    .line 18
    .line 19
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lax/Z2/j;->o0()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_4c

    .line 28
    .line 29
    const-string v1, "/storage/emulated/0"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_4c

    .line 36
    .line 37
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/io/File;->getTotalSpace()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/io/File;->getTotalSpace()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    const-wide v5, 0xe8d4a51000L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    cmp-long v7, v1, v5

    .line 59
    .line 60
    if-lez v7, :cond_42

    .line 61
    .line 62
    invoke-static {v3, v4}, Lcom/voxdon/xplorer/file/x;->K1(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    goto :goto_47

    .line 67
    :cond_42
    add-long/2addr v3, v1

    .line 68
    invoke-static {v3, v4}, Lcom/voxdon/xplorer/file/x;->K1(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    :goto_47
    invoke-direct {p0, v0, v1, v2}, Lcom/voxdon/xplorer/file/x;->Z0(Ljava/lang/String;J)Lax/c3/k0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :cond_4c
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v2, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    if-eq v1, v2, :cond_6e

    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object v2, Lax/Q2/f;->v0:Lax/Q2/f;

    .line 92
    .line 93
    if-eq v1, v2, :cond_6e

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v2, Lax/Q2/f;->x0:Lax/Q2/f;

    .line 100
    .line 101
    if-eq v1, v2, :cond_6e

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v2, Lax/Q2/f;->w0:Lax/Q2/f;

    .line 108
    .line 109
    if-ne v1, v2, :cond_a3

    .line 110
    .line 111
    :cond_6e
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->j1()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_a3

    .line 116
    .line 117
    invoke-static {}, Lax/Q2/e;->I()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_9e

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/4 v5, 0x0

    .line 132
    invoke-static {v1, v2, v5}, Lcom/voxdon/xplorer/file/g;->x(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_9e

    .line 141
    .line 142
    :try_start_8d
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-static {v2, p0, v5, v1}, Lcom/voxdon/xplorer/file/g;->k(Landroid/content/Context;Lcom/voxdon/xplorer/file/m;Lax/c3/K;Landroid/net/Uri;)Lax/c3/k0;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_9d
    .catch Lax/b3/j; {:try_start_8d .. :try_end_9d} :catch_9e

    .line 158
    return-object v0

    .line 159
    :catch_9e
    :cond_9e
    invoke-direct {p0, v0, v3, v4}, Lcom/voxdon/xplorer/file/x;->Z0(Ljava/lang/String;J)Lax/c3/k0;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    return-object v0

    .line 164
    :cond_a3
    invoke-direct {p0, v0, v3, v4}, Lcom/voxdon/xplorer/file/x;->Z0(Ljava/lang/String;J)Lax/c3/k0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0

    .line 169
    :cond_a8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const-string v1, "LOCAL STORAGE SPACE"

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    new-instance v1, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v2, " "

    .line 200
    .line 201
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v2, " ("

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-static {}, Lax/Q2/e;->z()Lax/Z2/r;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v2, ")"

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 237
    .line 238
    .line 239
    new-instance v0, Lax/b3/j;

    .line 240
    .line 241
    const-string v1, "no root path"

    .line 242
    .line 243
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v0
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

.method private Z0(Ljava/lang/String;J)Lax/c3/k0;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/x;->b1(Ljava/lang/String;J)Lax/c3/k0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/x;->a1(Ljava/lang/String;J)Lax/c3/k0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method private a1(Ljava/lang/String;J)Lax/c3/k0;
    .registers 11

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    cmp-long p1, p2, v1

    .line 9
    .line 10
    if-lez p1, :cond_d

    .line 11
    .line 12
    :goto_b
    move-wide v2, p2

    .line 13
    goto :goto_12

    .line 14
    :cond_d
    invoke-virtual {v0}, Ljava/io/File;->getTotalSpace()J

    .line 15
    .line 16
    .line 17
    move-result-wide p2

    .line 18
    goto :goto_b

    .line 19
    :goto_12
    invoke-virtual {v0}, Ljava/io/File;->getUsableSpace()J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    sub-long v4, v2, p1

    .line 24
    .line 25
    new-instance v1, Lax/c3/k0;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-direct/range {v1 .. v6}, Lax/c3/k0;-><init>(JJI)V

    .line 29
    .line 30
    .line 31
    return-object v1
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

.method private b1(Ljava/lang/String;J)Lax/c3/k0;
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    :try_start_2
    invoke-static/range {p1 .. p1}, Lax/X2/v;->o(Ljava/lang/String;)Lax/X2/M;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    cmp-long v5, v0, v3

    .line 10
    .line 11
    if-lez v5, :cond_e

    .line 12
    .line 13
    move-wide v8, v0

    .line 14
    goto :goto_15

    .line 15
    :cond_e
    iget-wide v5, v2, Lax/X2/M;->b:J

    .line 16
    .line 17
    iget-wide v7, v2, Lax/X2/M;->a:J

    .line 18
    .line 19
    mul-long v5, v5, v7

    .line 20
    .line 21
    move-wide v8, v5

    .line 22
    :goto_15
    iget-wide v5, v2, Lax/X2/M;->c:J

    .line 23
    .line 24
    iget-wide v10, v2, Lax/X2/M;->a:J
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_19} :catch_5f

    .line 25
    .line 26
    invoke-static {v5, v6}, Ljava/lang/Long;->signum(J)I

    .line 27
    .line 28
    .line 29
    mul-long v5, v5, v10

    .line 30
    .line 31
    sub-long v10, v8, v5

    .line 32
    .line 33
    :try_start_20
    invoke-static {}, Lax/X2/J;->F()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_b0

    .line 38
    .line 39
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v6, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 44
    .line 45
    if-ne v5, v6, :cond_b0

    .line 46
    .line 47
    const-wide v5, 0xe8d4a51000L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v7, v8, v5

    .line 53
    .line 54
    if-lez v7, :cond_b0

    .line 55
    .line 56
    const-wide/16 v5, 0x64

    .line 57
    .line 58
    mul-long v12, v10, v5

    .line 59
    .line 60
    div-long/2addr v12, v8

    .line 61
    const-wide/16 v14, 0x5f

    .line 62
    .line 63
    cmp-long v7, v12, v14

    .line 64
    .line 65
    if-ltz v7, :cond_b0

    .line 66
    .line 67
    iget-wide v12, v2, Lax/X2/M;->d:J

    .line 68
    .line 69
    move-wide/from16 v16, v3

    .line 70
    .line 71
    iget-wide v3, v2, Lax/X2/M;->a:J

    .line 72
    .line 73
    mul-long v12, v12, v3

    .line 74
    .line 75
    sub-long v2, v8, v12

    .line 76
    .line 77
    cmp-long v4, v2, v16

    .line 78
    .line 79
    if-lez v4, :cond_63

    .line 80
    .line 81
    mul-long v12, v2, v5

    .line 82
    .line 83
    div-long/2addr v12, v8

    .line 84
    cmp-long v4, v12, v14

    .line 85
    .line 86
    if-gez v4, :cond_63

    .line 87
    .line 88
    new-instance v7, Lax/c3/k0;

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    move-wide v10, v2

    .line 92
    invoke-direct/range {v7 .. v12}, Lax/c3/k0;-><init>(JJI)V

    .line 93
    .line 94
    .line 95
    return-object v7

    .line 96
    :catch_5f
    move-exception v0

    .line 97
    move-object/from16 v3, p0

    .line 98
    .line 99
    goto :goto_b9

    .line 100
    :cond_63
    invoke-static {}, Lax/X2/Q;->S0()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_81

    .line 105
    .line 106
    invoke-direct/range {p0 .. p3}, Lcom/voxdon/xplorer/file/x;->W0(Ljava/lang/String;J)Lax/c3/k0;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-wide v3, v2, Lax/c3/k0;->b:J

    .line 111
    .line 112
    cmp-long v7, v3, v16

    .line 113
    .line 114
    if-eqz v7, :cond_81

    .line 115
    .line 116
    iget-wide v12, v2, Lax/c3/k0;->a:J

    .line 117
    .line 118
    cmp-long v7, v12, v16

    .line 119
    .line 120
    if-lez v7, :cond_81

    .line 121
    .line 122
    mul-long v12, v12, v5

    .line 123
    .line 124
    div-long/2addr v12, v3

    .line 125
    cmp-long v3, v12, v14

    .line 126
    .line 127
    if-gez v3, :cond_81

    .line 128
    .line 129
    return-object v2

    .line 130
    :cond_81
    const-string v2, "DCIM"

    .line 131
    .line 132
    move-object/from16 v3, p1

    .line 133
    .line 134
    invoke-static {v3, v2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    new-instance v3, Ljava/io/File;

    .line 139
    .line 140
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 144
    .line 145
    .line 146
    move-result v3
    :try_end_92
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_92} :catch_5f

    .line 147
    if-eqz v3, :cond_b0

    .line 148
    .line 149
    move-object/from16 v3, p0

    .line 150
    .line 151
    :try_start_96
    invoke-direct {v3, v2, v0, v1}, Lcom/voxdon/xplorer/file/x;->a1(Ljava/lang/String;J)Lax/c3/k0;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-wide v1, v0, Lax/c3/k0;->b:J

    .line 156
    .line 157
    cmp-long v4, v1, v16

    .line 158
    .line 159
    if-eqz v4, :cond_b2

    .line 160
    .line 161
    iget-wide v12, v0, Lax/c3/k0;->a:J

    .line 162
    .line 163
    cmp-long v4, v12, v16

    .line 164
    .line 165
    if-lez v4, :cond_b2

    .line 166
    .line 167
    mul-long v12, v12, v5

    .line 168
    .line 169
    div-long/2addr v12, v1

    .line 170
    cmp-long v1, v12, v14

    .line 171
    .line 172
    if-gez v1, :cond_b2

    .line 173
    .line 174
    return-object v0

    .line 175
    :catch_ae
    move-exception v0

    .line 176
    goto :goto_b9

    .line 177
    :cond_b0
    move-object/from16 v3, p0

    .line 178
    .line 179
    :cond_b2
    new-instance v7, Lax/c3/k0;

    .line 180
    .line 181
    const/4 v12, 0x0

    .line 182
    invoke-direct/range {v7 .. v12}, Lax/c3/k0;-><init>(JJI)V
    :try_end_b8
    .catch Ljava/lang/Exception; {:try_start_96 .. :try_end_b8} :catch_ae

    .line 183
    .line 184
    .line 185
    return-object v7

    .line 186
    :goto_b9
    new-instance v1, Lax/b3/j;

    .line 187
    .line 188
    invoke-direct {v1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw v1
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

.method private e1(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-nez v4, :cond_14

    .line 15
    .line 16
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_14
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 28
    .line 29
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 33
    .line 34
    if-lez v1, :cond_2d

    .line 35
    .line 36
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 37
    .line 38
    if-gtz v0, :cond_28

    .line 39
    .line 40
    goto :goto_2d

    .line 41
    :cond_28
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->x1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2d
    :goto_2d
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 47
    .line 48
    .line 49
    move-result-object p1

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
.end method

.method private f1(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/x;->Q0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_6f

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->k0()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/16 v3, 0x200

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_49

    .line 22
    .line 23
    :try_start_16
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/y;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_1a
    .catch Lax/b3/j; {:try_start_16 .. :try_end_1a} :catch_33
    .catchall {:try_start_16 .. :try_end_1a} :catchall_31

    .line 27
    :try_start_1a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v1, v4, v2, v4, v3}, Lax/u3/B;->g(Landroid/content/Context;Ljava/lang/String;Ljava/io/FileDescriptor;Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_26
    .catch Lax/b3/j; {:try_start_1a .. :try_end_26} :catch_2f
    .catchall {:try_start_1a .. :try_end_26} :catchall_2c

    .line 39
    :goto_26
    :try_start_26
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_29} :catch_2a

    .line 40
    .line 41
    .line 42
    goto :goto_51

    .line 43
    :catch_2a
    nop

    .line 44
    goto :goto_51

    .line 45
    :catchall_2c
    move-exception p1

    .line 46
    move-object v4, v0

    .line 47
    goto :goto_43

    .line 48
    :catch_2f
    move-exception v1

    .line 49
    goto :goto_35

    .line 50
    :catchall_31
    move-exception p1

    .line 51
    goto :goto_43

    .line 52
    :catch_33
    move-exception v1

    .line 53
    move-object v0, v4

    .line 54
    :goto_35
    :try_start_35
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, p1, v4, v4, v3}, Lax/u3/B;->g(Landroid/content/Context;Ljava/lang/String;Ljava/io/FileDescriptor;Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_40
    .catchall {:try_start_35 .. :try_end_40} :catchall_2c

    .line 65
    if-eqz v0, :cond_51

    .line 66
    .line 67
    goto :goto_26

    .line 68
    :goto_43
    if-eqz v4, :cond_48

    .line 69
    .line 70
    :try_start_45
    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_48
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_48} :catch_48

    .line 71
    .line 72
    .line 73
    :catch_48
    :cond_48
    throw p1

    .line 74
    :cond_49
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0, p1, v4, v4, v3}, Lax/u3/B;->g(Landroid/content/Context;Ljava/lang/String;Ljava/io/FileDescriptor;Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :cond_51
    :goto_51
    if-nez p1, :cond_57

    .line 83
    .line 84
    invoke-static {}, Lax/s3/a;->b()Landroid/graphics/Bitmap;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_57
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 89
    .line 90
    const v1, 0x8000

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 100
    .line 101
    .line 102
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_6f
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/x;->x1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1
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

.method static h1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    :try_start_f
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, Lax/c3/K;->e:Lax/c3/K;

    .line 23
    .line 24
    if-eq v0, v2, :cond_25

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v2, Lax/c3/K;->f:Lax/c3/K;

    .line 31
    .line 32
    if-ne v0, v2, :cond_22

    .line 33
    .line 34
    goto :goto_25

    .line 35
    :cond_22
    return v1

    .line 36
    :catch_23
    move-exception p0

    .line 37
    goto :goto_31

    .line 38
    :cond_25
    :goto_25
    const-string v0, "/Android/data"

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-static {v0, p0, v2}, Lax/c3/d0;->J(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result p0
    :try_end_30
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f .. :try_end_30} :catch_23

    .line 49
    return p0

    .line 50
    :goto_31
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v2, "SUBDIRECTORY ERROR"

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 69
    .line 70
    .line 71
    return v1
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

.method static i1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    :try_start_8
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v2, Lax/c3/K;->e:Lax/c3/K;

    .line 16
    .line 17
    if-eq v0, v2, :cond_24

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, Lax/c3/K;->f:Lax/c3/K;

    .line 24
    .line 25
    if-ne v0, v2, :cond_23

    .line 26
    .line 27
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_23

    .line 32
    .line 33
    goto :goto_24

    .line 34
    :catch_21
    move-exception p0

    .line 35
    goto :goto_30

    .line 36
    :cond_23
    return v1

    .line 37
    :cond_24
    :goto_24
    const-string v0, "/Android/obb"

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-static {v0, p0, v2}, Lax/c3/d0;->J(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p0
    :try_end_2f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_2f} :catch_21

    .line 48
    return p0

    .line 49
    :goto_30
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v2, "SUBDIRECTORY ERROR"

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 68
    .line 69
    .line 70
    return v1
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

.method private j1()Z
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Lax/Z2/j;->j0(Lax/c3/K;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    xor-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    return v0
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

.method private k1(Ljava/lang/String;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    const-string v0, "vnd.android.document/directory"

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_d
    :goto_d
    const/4 p1, 0x1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private l1(Ljava/lang/Exception;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "AccessDeniedException"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "DirectoryNotEmptyException"

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_23

    .line 34
    .line 35
    return v1

    .line 36
    :cond_23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_36

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "Operation not permitted"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_36

    .line 53
    .line 54
    return v1

    .line 55
    :cond_36
    const/4 p1, 0x0

    .line 56
    return p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic m0(Lcom/voxdon/xplorer/file/x;Ljava/util/ArrayList;ILax/g3/i;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/x;->H0(Ljava/util/ArrayList;ILax/g3/i;)V

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

.method private m1()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->p:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/Q2/f;->s0(Lax/Q2/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/voxdon/xplorer/file/x;->p:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->p:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
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

.method static synthetic n0(Lcom/voxdon/xplorer/file/x;Lcom/voxdon/xplorer/file/n;ZZZZ)V
    .registers 6

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V

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

.method private n1(Lcom/voxdon/xplorer/file/y;)Z
    .registers 4

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->k0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    return v1

    .line 20
    :cond_13
    invoke-static {p1}, Lcom/voxdon/xplorer/file/J;->j2(Lcom/voxdon/xplorer/file/n;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1a

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, ".tmp"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_27

    .line 38
    .line 39
    return v1

    .line 40
    :cond_27
    const/4 p1, 0x1

    .line 41
    return p1
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

.method private o0(Lcom/voxdon/xplorer/file/y;Lax/c3/K;[Ljava/io/File;Ljava/util/List;Z)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/y;",
            "Lax/c3/K;",
            "[",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->V0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p3

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_6
    if-ge v2, v1, :cond_72

    .line 8
    .line 9
    aget-object v6, p3, v2

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v3}, Lax/c3/d0;->C(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_17

    .line 20
    .line 21
    move-object v7, p2

    .line 22
    move v8, p5

    .line 23
    goto :goto_6d

    .line 24
    :cond_17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    sget-object v5, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 29
    .line 30
    if-ne v4, v5, :cond_36

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_36

    .line 37
    .line 38
    new-instance v3, Lcom/voxdon/xplorer/file/y;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v4, p0

    .line 46
    move v8, p5

    .line 47
    invoke-direct/range {v3 .. v8}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Ljava/io/File;Lax/c3/K;Z)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :goto_34
    move-object v7, p2

    .line 54
    goto :goto_6d

    .line 55
    :cond_36
    move-object v4, p0

    .line 56
    move v8, p5

    .line 57
    if-eqz v0, :cond_60

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 60
    .line 61
    .line 62
    move-result-object p5

    .line 63
    invoke-static {p5}, Lax/c3/I;->a(Lax/c3/K;)Z

    .line 64
    .line 65
    .line 66
    move-result p5

    .line 67
    if-eqz p5, :cond_60

    .line 68
    .line 69
    const-string p5, "data"

    .line 70
    .line 71
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p5

    .line 75
    if-nez p5, :cond_54

    .line 76
    .line 77
    const-string p5, "obb"

    .line 78
    .line 79
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p5

    .line 83
    if-eqz p5, :cond_60

    .line 84
    .line 85
    :cond_54
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    invoke-virtual {p0, p5}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 90
    .line 91
    .line 92
    move-result-object p5

    .line 93
    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_34

    .line 97
    :cond_60
    new-instance v3, Lcom/voxdon/xplorer/file/y;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    move-object v7, p2

    .line 104
    invoke-direct/range {v3 .. v8}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Ljava/io/File;Lax/c3/K;Z)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :goto_6d
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    move-object p2, v7

    .line 113
    move p5, v8

    .line 114
    goto :goto_6

    .line 115
    :cond_72
    return-void
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

.method public static o1(Landroid/content/Context;Lax/c3/K;Landroid/net/Uri;)Z
    .registers 6

    .line 1
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_1d

    .line 7
    .line 8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string p1, "DOCUMENT TREE URI ERROR 1"

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :cond_1d
    const-string v1, "/"

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-gez v2, :cond_3b

    .line 37
    .line 38
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "DOCUMENT TREE URI ERROR 2"

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 57
    .line 58
    .line 59
    return v0

    .line 60
    :cond_3b
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-virtual {p0, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_62

    .line 96
    .line 97
    const/4 p0, 0x1

    .line 98
    return p0

    .line 99
    :cond_62
    return v0
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
.end method

.method private p0(Lcom/voxdon/xplorer/file/n;ZZ)V
    .registers 13

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/x;->D0(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    move v7, p2

    .line 16
    move v8, p3

    .line 17
    invoke-direct/range {v1 .. v8}, Lcom/voxdon/xplorer/file/x;->r0(Lcom/voxdon/xplorer/file/n;ZZZZZZ)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method private p1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 8
    .line 9
    if-eq v0, v1, :cond_17

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p1, v1, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_17
    :goto_17
    const/4 p1, 0x1

    .line 25
    return p1
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

.method private q0(Lcom/voxdon/xplorer/file/n;ZZZ)V
    .registers 23

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p1

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_a
    :goto_a
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_57

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    move/from16 v6, p2

    .line 30
    .line 31
    move/from16 v7, p3

    .line 32
    .line 33
    move/from16 v8, p4

    .line 34
    .line 35
    invoke-direct/range {v2 .. v9}, Lcom/voxdon/xplorer/file/x;->r0(Lcom/voxdon/xplorer/file/n;ZZZZZZ)V

    .line 36
    .line 37
    .line 38
    :try_start_25
    invoke-virtual {v2, v3}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_a

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v11, v3

    .line 57
    check-cast v11, Lcom/voxdon/xplorer/file/n;

    .line 58
    .line 59
    invoke-interface {v11}, Lax/c3/b;->isDirectory()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_46

    .line 64
    .line 65
    invoke-virtual {v0, v11}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_54

    .line 69
    :catch_44
    nop

    .line 70
    goto :goto_a

    .line 71
    :cond_46
    const/4 v13, 0x0

    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    move/from16 v14, p2

    .line 76
    .line 77
    move/from16 v15, p3

    .line 78
    .line 79
    move/from16 v16, p4

    .line 80
    .line 81
    move-object v10, v2

    .line 82
    invoke-direct/range {v10 .. v17}, Lcom/voxdon/xplorer/file/x;->r0(Lcom/voxdon/xplorer/file/n;ZZZZZZ)V
    :try_end_54
    .catch Lax/b3/j; {:try_start_25 .. :try_end_54} :catch_44

    .line 83
    .line 84
    .line 85
    :goto_54
    move-object/from16 v2, p0

    .line 86
    .line 87
    goto :goto_2d

    .line 88
    :cond_57
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

.method private r0(Lcom/voxdon/xplorer/file/n;ZZZZZZ)V
    .registers 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p2

    .line 4
    .line 5
    iget-object v14, v1, Lcom/voxdon/xplorer/file/x;->m:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v14

    .line 8
    :try_start_7
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget-object v0, v1, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v15, 0x1

    .line 19
    if-eqz v0, :cond_36

    .line 20
    .line 21
    iget-object v0, v1, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lax/o3/f;

    .line 28
    .line 29
    if-eqz v0, :cond_36

    .line 30
    .line 31
    iget-object v2, v1, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object v2, v1, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-boolean v2, v0, Lax/o3/f;->q:Z

    .line 42
    .line 43
    if-nez v2, :cond_36

    .line 44
    .line 45
    if-ne v8, v15, :cond_36

    .line 46
    .line 47
    iget-boolean v0, v0, Lax/o3/f;->i0:Z

    .line 48
    .line 49
    if-eqz v0, :cond_36

    .line 50
    .line 51
    monitor-exit v14

    .line 52
    return-void

    .line 53
    :catchall_34
    move-exception v0

    .line 54
    goto :goto_a2

    .line 55
    :cond_36
    if-eqz p3, :cond_5f

    .line 56
    .line 57
    if-eqz v8, :cond_5f

    .line 58
    .line 59
    iget-object v0, v1, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_40
    :goto_40
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5f

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lax/o3/f;

    .line 76
    .line 77
    iget-object v4, v2, Lax/o3/f;->c0:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v3, v4, v15}, Lax/c3/d0;->J(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_40

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 86
    .line 87
    .line 88
    iget-object v4, v1, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 89
    .line 90
    iget-object v2, v2, Lax/o3/f;->c0:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v4, v2}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_40

    .line 96
    :cond_5f
    new-instance v2, Lax/o3/f;

    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lax/Q2/f;->K()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->L()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->q()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    move/from16 v9, p3

    .line 115
    .line 116
    move/from16 v10, p4

    .line 117
    .line 118
    move/from16 v11, p5

    .line 119
    .line 120
    move/from16 v12, p6

    .line 121
    .line 122
    move/from16 v13, p7

    .line 123
    .line 124
    invoke-direct/range {v2 .. v13}, Lax/o3/f;-><init>(Ljava/lang/String;Ljava/lang/String;IJZZZZZZ)V

    .line 125
    .line 126
    .line 127
    iget-object v0, v1, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    invoke-virtual {v0, v3, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    iget-object v0, v1, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lax/X2/Q;->X1()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_a0

    .line 142
    .line 143
    iget-object v0, v1, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 144
    .line 145
    if-eqz v0, :cond_a0

    .line 146
    .line 147
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_a0

    .line 156
    .line 157
    iput-boolean v15, v2, Lax/o3/f;->n0:Z

    .line 158
    .line 159
    iput-boolean v15, v1, Lcom/voxdon/xplorer/file/x;->j:Z

    .line 160
    .line 161
    :cond_a0
    monitor-exit v14

    .line 162
    return-void

    .line 163
    :goto_a2
    monitor-exit v14
    :try_end_a3
    .catchall {:try_start_7 .. :try_end_a3} :catchall_34

    .line 164
    throw v0
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

.method private r1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
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
    move-object v2, p1

    .line 2
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 3
    .line 4
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    new-instance v5, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_24

    .line 18
    .line 19
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, p0, v3, v1}, Lcom/voxdon/xplorer/shizuku/c;->E(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_68

    .line 32
    .line 33
    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    return-object v5

    .line 37
    :cond_24
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->S1()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_68

    .line 42
    .line 43
    :try_start_2a
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_32
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2a .. :try_end_32} :catch_37
    .catch Ljava/lang/ArrayStoreException; {:try_start_2a .. :try_end_32} :catch_34

    .line 51
    :goto_32
    move-object v4, v0

    .line 52
    goto :goto_6a

    .line 53
    :catch_34
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    goto :goto_3a

    .line 56
    :catch_37
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    goto :goto_51

    .line 59
    :goto_3a
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "LLISTCH2 ArrayStoreException"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lax/b3/j;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :goto_51
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "LLISTCH2 OutOfMemoryError"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 97
    .line 98
    .line 99
    new-instance v0, Lax/b3/j;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_68
    const/4 v0, 0x0

    .line 106
    goto :goto_32

    .line 107
    :goto_6a
    if-eqz v4, :cond_74

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->f1()Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    move-object v1, p0

    .line 114
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->o0(Lcom/voxdon/xplorer/file/y;Lax/c3/K;[Ljava/io/File;Ljava/util/List;Z)V

    .line 115
    .line 116
    .line 117
    :cond_74
    const/4 v0, 0x1

    .line 118
    if-eqz v4, :cond_7d

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_ac

    .line 125
    .line 126
    :cond_7d
    invoke-static {v3}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_ac

    .line 131
    .line 132
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_ac

    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1}, Lax/c3/I;->b(Lax/c3/K;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_ae

    .line 147
    .line 148
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-static {v1, v6}, Lax/c3/I;->c(Lax/c3/K;Ljava/lang/String;)Ljava/io/File;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-eqz v1, :cond_ac

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    if-eqz v4, :cond_ac

    .line 167
    .line 168
    const/4 v6, 0x1

    .line 169
    move-object v1, p0

    .line 170
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->o0(Lcom/voxdon/xplorer/file/y;Lax/c3/K;[Ljava/io/File;Ljava/util/List;Z)V

    .line 171
    .line 172
    .line 173
    :cond_ac
    move-object v1, p0

    .line 174
    goto :goto_f8

    .line 175
    :cond_ae
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1}, Lax/c3/I;->a(Lax/c3/K;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_d8

    .line 184
    .line 185
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_d8

    .line 190
    .line 191
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-static {v1, v6}, Lax/c3/I;->c(Lax/c3/K;Ljava/lang/String;)Ljava/io/File;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-eqz v1, :cond_ac

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    if-eqz v4, :cond_ac

    .line 210
    .line 211
    const/4 v6, 0x1

    .line 212
    move-object v1, p0

    .line 213
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->o0(Lcom/voxdon/xplorer/file/y;Lax/c3/K;[Ljava/io/File;Ljava/util/List;Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_f8

    .line 217
    :cond_d8
    move-object v1, p0

    .line 218
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v6}, Lcom/voxdon/xplorer/shizuku/c;->l()Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_f8

    .line 227
    .line 228
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v6, p0, v3, v7}, Lcom/voxdon/xplorer/shizuku/c;->E(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    if-eqz v6, :cond_f8

    .line 241
    .line 242
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/y;->l1(Z)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 246
    .line 247
    .line 248
    return-object v5

    .line 249
    :cond_f8
    :goto_f8
    if-eqz v4, :cond_10a

    .line 250
    .line 251
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-nez v4, :cond_1cb

    .line 256
    .line 257
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v4}, Ljava/io/File;->canRead()Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-nez v4, :cond_1cb

    .line 266
    .line 267
    :cond_10a
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_171

    .line 272
    .line 273
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_136

    .line 278
    .line 279
    invoke-static {}, Lax/X2/Q;->a2()Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-nez v4, :cond_122

    .line 284
    .line 285
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-nez v4, :cond_136

    .line 290
    .line 291
    :cond_122
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-virtual {v4, p0, v3, v6}, Lcom/voxdon/xplorer/file/z;->O(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    if-eqz v4, :cond_136

    .line 304
    .line 305
    iput-boolean v0, v1, Lcom/voxdon/xplorer/file/x;->q:Z

    .line 306
    .line 307
    invoke-interface {v5, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 308
    .line 309
    .line 310
    return-object v5

    .line 311
    :cond_136
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 312
    .line 313
    const/16 v4, 0x18

    .line 314
    .line 315
    if-lt v0, v4, :cond_171

    .line 316
    .line 317
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_171

    .line 322
    .line 323
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    const-string v4, "/"

    .line 328
    .line 329
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_152

    .line 334
    .line 335
    invoke-virtual {p0, v5, v3}, Lcom/voxdon/xplorer/file/x;->u1(Ljava/util/List;Lax/c3/K;)V

    .line 336
    .line 337
    .line 338
    goto :goto_171

    .line 339
    :cond_152
    const-string v0, "/storage/emulated"

    .line 340
    .line 341
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_162

    .line 350
    .line 351
    invoke-direct {p0, v5, v3}, Lcom/voxdon/xplorer/file/x;->w1(Ljava/util/List;Lax/c3/K;)V

    .line 352
    .line 353
    .line 354
    goto :goto_171

    .line 355
    :cond_162
    const-string v0, "/storage"

    .line 356
    .line 357
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_171

    .line 366
    .line 367
    invoke-direct {p0, v5, v3}, Lcom/voxdon/xplorer/file/x;->v1(Ljava/util/List;Lax/c3/K;)V

    .line 368
    .line 369
    .line 370
    :cond_171
    :goto_171
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v0, v4}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-eqz v0, :cond_19e

    .line 383
    .line 384
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_19e

    .line 393
    .line 394
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_19e

    .line 399
    .line 400
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Lcom/voxdon/xplorer/shizuku/c;->C()Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_19a

    .line 409
    .line 410
    goto :goto_19e

    .line 411
    :cond_19a
    invoke-direct {p0, p1, v5, v3}, Lcom/voxdon/xplorer/file/x;->t1(Lcom/voxdon/xplorer/file/n;Ljava/util/List;Lax/c3/K;)V

    .line 412
    .line 413
    .line 414
    return-object v5

    .line 415
    :cond_19e
    :goto_19e
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 416
    .line 417
    .line 418
    move-result p1

    .line 419
    if-nez p1, :cond_1cb

    .line 420
    .line 421
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 425
    .line 426
    .line 427
    move-result p1

    .line 428
    if-nez p1, :cond_1c5

    .line 429
    .line 430
    invoke-static {}, Lax/X2/Q;->j()Z

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    if-eqz p1, :cond_1bf

    .line 435
    .line 436
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->Z0()Z

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    if-eqz p1, :cond_1bf

    .line 441
    .line 442
    new-instance p1, Lax/b3/e;

    .line 443
    .line 444
    invoke-direct {p1}, Lax/b3/e;-><init>()V

    .line 445
    .line 446
    .line 447
    throw p1

    .line 448
    :cond_1bf
    new-instance p1, Lax/b3/t;

    .line 449
    .line 450
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 451
    .line 452
    .line 453
    throw p1

    .line 454
    :cond_1c5
    new-instance p1, Lax/b3/e;

    .line 455
    .line 456
    invoke-direct {p1}, Lax/b3/e;-><init>()V

    .line 457
    .line 458
    .line 459
    throw p1

    .line 460
    :cond_1cb
    return-object v5
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
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
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private s1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
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
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v1, "external"

    .line 29
    .line 30
    invoke-static {v1}, Lax/c3/n0;->c(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    sget-object v6, Lcom/voxdon/xplorer/file/x;->y:[Ljava/lang/String;

    .line 35
    .line 36
    const-string v7, "bucket_id=? AND bucket_display_name=?"

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const-string v9, "_data asc"

    .line 47
    .line 48
    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-nez v1, :cond_36

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_36
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-gtz v2, :cond_40

    .line 60
    .line 61
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_40
    new-instance v2, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v3, Lax/X2/L;

    .line 77
    .line 78
    invoke-direct {v3}, Lax/X2/L;-><init>()V

    .line 79
    .line 80
    .line 81
    const-wide/16 v4, 0x0

    .line 82
    .line 83
    move-object v6, v0

    .line 84
    :cond_53
    :goto_53
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_80

    .line 89
    .line 90
    invoke-direct {p0, p1, v1, v3}, Lcom/voxdon/xplorer/file/x;->B0(Lax/c3/K;Landroid/database/Cursor;Lax/X2/L;)Lcom/voxdon/xplorer/file/A;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {p0, p1, v7}, Lcom/voxdon/xplorer/file/x;->A0(Lax/c3/K;Lcom/voxdon/xplorer/file/A;)Lcom/voxdon/xplorer/file/y;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    iget-wide v9, v7, Lcom/voxdon/xplorer/file/A;->e:J

    .line 99
    .line 100
    if-eqz v6, :cond_7a

    .line 101
    .line 102
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v8}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    invoke-virtual {v7, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_7a

    .line 115
    .line 116
    cmp-long v7, v9, v4

    .line 117
    .line 118
    if-lez v7, :cond_53

    .line 119
    .line 120
    invoke-interface {v2, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_7a
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-object v6, v8

    .line 127
    move-wide v4, v9

    .line 128
    goto :goto_53

    .line 129
    :cond_80
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_83
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_83} :catch_84

    .line 130
    .line 131
    .line 132
    return-object v2

    .line 133
    :catch_84
    return-object v0
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

.method public static t0(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Z
    .registers 7

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_54

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v0, :cond_53

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    goto :goto_53

    .line 22
    :cond_15
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lax/W2/c;->p()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_54

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ne v3, v2, :cond_54

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 43
    .line 44
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_54

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "."

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_54

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v3, v0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/file/g;->C(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_54

    .line 83
    .line 84
    :cond_53
    :goto_53
    return v2

    .line 85
    :cond_54
    return v1
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

.method private t1(Lcom/voxdon/xplorer/file/n;Ljava/util/List;Lax/c3/K;)V
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lax/c3/K;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-static/range {p3 .. p3}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_a

    .line 8
    .line 9
    goto/16 :goto_9e

    .line 10
    .line 11
    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/U2/d;->B()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1a
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_9e

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lax/U2/f;

    .line 38
    .line 39
    invoke-virtual {v2}, Lax/U2/f;->r()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_31

    .line 48
    .line 49
    goto :goto_1a

    .line 50
    :cond_31
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2}, Lax/U2/f;->r()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v3, v4}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v6, Ljava/io/File;

    .line 63
    .line 64
    invoke-direct {v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_55

    .line 72
    .line 73
    new-instance v2, Lcom/voxdon/xplorer/file/y;

    .line 74
    .line 75
    move-object/from16 v5, p0

    .line 76
    .line 77
    move-object/from16 v7, p3

    .line 78
    .line 79
    invoke-direct {v2, v5, v6, v7}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1a

    .line 86
    :cond_55
    move-object/from16 v5, p0

    .line 87
    .line 88
    move-object/from16 v7, p3

    .line 89
    .line 90
    invoke-static {}, Lax/X2/Q;->j()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_1a

    .line 95
    .line 96
    invoke-virtual {v2}, Lax/U2/f;->B()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_1a

    .line 101
    .line 102
    new-instance v4, Lcom/voxdon/xplorer/file/y;

    .line 103
    .line 104
    const-wide/16 v12, 0x0

    .line 105
    .line 106
    const-wide/16 v14, 0x0

    .line 107
    .line 108
    const/4 v8, 0x1

    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v10, 0x1

    .line 111
    const/4 v11, 0x0

    .line 112
    invoke-direct/range {v4 .. v15}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;ZZZZJJ)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/y;->T0()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_95

    .line 120
    .line 121
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_85

    .line 129
    .line 130
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1a

    .line 134
    :cond_85
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v2}, Lax/Z2/n;->b(Landroid/content/Context;)Lax/Z2/n;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v2, v3}, Lax/Z2/n;->e(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1a

    .line 150
    :cond_95
    const/4 v2, 0x1

    .line 151
    invoke-virtual {v4, v2}, Lcom/voxdon/xplorer/file/y;->j1(Z)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto/16 :goto_1a

    .line 158
    .line 159
    :cond_9e
    :goto_9e
    return-void
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

.method private u0()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Z2/j;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method private v0(Lcom/voxdon/xplorer/file/n;)V
    .registers 5
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
    move-result v0

    .line 5
    if-eqz v0, :cond_42

    .line 6
    .line 7
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "LLISTCH1"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ":"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lax/b3/j;

    .line 60
    .line 61
    const-string v0, "file is not directory"

    .line 62
    .line 63
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_42
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "LLISTCH0"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v1, "Location = "

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 115
    .line 116
    .line 117
    new-instance p1, Lax/b3/t;

    .line 118
    .line 119
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 120
    .line 121
    .line 122
    throw p1
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

.method private v1(Ljava/util/List;Lax/c3/K;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lax/c3/K;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "/storage/emulated"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_15

    .line 13
    .line 14
    new-instance v1, Lcom/voxdon/xplorer/file/y;

    .line 15
    .line 16
    invoke-direct {v1, p0, v0, p2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
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

.method private w0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/x;->j:Z

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private w1(Ljava/util/List;Lax/c3/K;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lax/c3/K;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/x;->u:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_6
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_28

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    const-string v3, "/storage/emulated/"

    .line 22
    .line 23
    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    new-instance v1, Lcom/voxdon/xplorer/file/y;

    .line 33
    .line 34
    invoke-direct {v1, p0, v2, p2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_6

    .line 41
    :cond_28
    return-void
.end method

.method private x1(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 6

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1, v2}, Lcom/voxdon/xplorer/file/x;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x8000

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lax/ca/a;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->p()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    long-to-int p1, v2

    .line 28
    invoke-direct {v1, v0, p1}, Lax/ca/a;-><init>(Ljava/io/InputStream;I)V
    :try_end_1e
    .catch Lax/b3/j; {:try_start_0 .. :try_end_1e} :catch_1f

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :catch_1f
    const/4 p1, 0x0

    .line 33
    return-object p1
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

.method private y0(Lcom/voxdon/xplorer/file/y;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/file/g;->d(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_16

    .line 7
    .line 8
    const-string v2, ".$recycle_bin$"

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_15

    .line 19
    .line 20
    sput-object v1, Lcom/voxdon/xplorer/file/J;->A:Landroid/net/Uri;

    .line 21
    .line 22
    :cond_15
    return v0

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    return p1
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

.method private y1(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/x;->B1(Lcom/voxdon/xplorer/file/n;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v2, 0x1

    .line 26
    if-eqz v0, :cond_5a

    .line 27
    .line 28
    move-object v0, p2

    .line 29
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 30
    .line 31
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v3, v4}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_3b

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->Z0()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_33

    .line 50
    .line 51
    goto :goto_3b

    .line 52
    :cond_33
    new-instance p1, Lax/b3/e;

    .line 53
    .line 54
    const-string p2, "/Android/data package folders cannot be renamed from Android 13"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3b
    :goto_3b
    invoke-static {p1, p2, p3, p4, p5}, Lcom/voxdon/xplorer/file/g;->M(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lax/X2/Q;->d0()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_58

    .line 68
    .line 69
    invoke-direct {p0, p2, v1, v2}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const/4 v6, 0x1

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v4, 0x1

    .line 83
    move-object v2, p0

    .line 84
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V

    .line 85
    .line 86
    .line 87
    move-object v0, v2

    .line 88
    return-void

    .line 89
    :cond_58
    move-object v2, p0

    .line 90
    goto :goto_84

    .line 91
    :cond_5a
    move-object v0, p0

    .line 92
    invoke-static {}, Lax/X2/Q;->I0()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_85

    .line 97
    .line 98
    invoke-virtual {p0, p2, p3}, Lcom/voxdon/xplorer/file/x;->Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_85

    .line 103
    .line 104
    invoke-static {p1, p2, p3, p4, p5}, Lcom/voxdon/xplorer/file/g;->K(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lax/X2/Q;->d0()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_83

    .line 112
    .line 113
    invoke-direct {p0, p2, v1, v2}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const/4 v6, 0x1

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v4, 0x1

    .line 127
    move-object v2, v0

    .line 128
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_83
    move-object v2, v0

    .line 133
    :goto_84
    return-void

    .line 134
    :cond_85
    move-object v2, v0

    .line 135
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_e3

    .line 140
    .line 141
    check-cast p2, Lcom/voxdon/xplorer/file/y;

    .line 142
    .line 143
    check-cast p3, Lcom/voxdon/xplorer/file/y;

    .line 144
    .line 145
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_a1

    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->P0()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/y;->P0()I

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    if-eq p1, p4, :cond_a1

    .line 160
    .line 161
    goto :goto_db

    .line 162
    :cond_a1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string p4, "location:"

    .line 168
    .line 169
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p2, ","

    .line 180
    .line 181
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    const-string p3, "MOVE ERROR"

    .line 204
    .line 205
    invoke-virtual {p2, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-virtual {p2}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 218
    .line 219
    .line 220
    :goto_db
    new-instance p1, Lax/b3/j;

    .line 221
    .line 222
    const-string p2, "treespace problem : doesSupportMoveFileToDifferentParent() == false"

    .line 223
    .line 224
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p1

    .line 228
    :cond_e3
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/voxdon/xplorer/file/x;->z1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 229
    .line 230
    .line 231
    return-void
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

.method private z1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 8
    .line 9
    .line 10
    :try_start_9
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    :try_end_c
    .catch Lax/b3/a; {:try_start_9 .. :try_end_c} :catch_1e
    .catch Lax/b3/j; {:try_start_9 .. :try_end_c} :catch_19

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 18
    .line 19
    .line 20
    if-eqz p4, :cond_18

    .line 21
    .line 22
    invoke-interface {p4, p2, p3, p2, p3}, Lax/g3/i;->a(JJ)V

    .line 23
    .line 24
    .line 25
    :cond_18
    return-void

    .line 26
    :catch_19
    move-exception p1

    .line 27
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :catch_1e
    move-exception p1

    .line 32
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 33
    .line 34
    .line 35
    throw p1
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


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 4

    .line 1
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->s()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p3, p1, p2}, Lcom/voxdon/xplorer/file/x;->d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object p1

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

.method public A0(Lax/c3/K;Lcom/voxdon/xplorer/file/A;)Lcom/voxdon/xplorer/file/y;
    .registers 15

    .line 1
    new-instance v2, Ljava/io/File;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/voxdon/xplorer/file/A;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/voxdon/xplorer/file/y;

    .line 9
    .line 10
    iget-boolean v4, p2, Lcom/voxdon/xplorer/file/A;->b:Z

    .line 11
    .line 12
    iget-wide v8, p2, Lcom/voxdon/xplorer/file/A;->d:J

    .line 13
    .line 14
    iget-wide v10, p2, Lcom/voxdon/xplorer/file/A;->c:J

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x1

    .line 19
    move-object v1, p0

    .line 20
    move-object v3, p1

    .line 21
    invoke-direct/range {v0 .. v11}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;ZZZZJJ)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p2, Lcom/voxdon/xplorer/file/A;->f:Ljava/lang/Long;

    .line 25
    .line 26
    if-eqz p1, :cond_22

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/voxdon/xplorer/file/y;->i1(J)V

    .line 33
    .line 34
    .line 35
    :cond_22
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public B(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_7

    .line 3
    .line 4
    invoke-static {}, Lax/u3/b;->f()V

    .line 5
    .line 6
    .line 7
    return v0

    .line 8
    :cond_7
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_18

    .line 15
    .line 16
    invoke-static {}, Lax/X2/Q;->I0()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_16

    .line 21
    .line 22
    return v0

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_18
    return v0
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

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 6
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
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->v0(Lcom/voxdon/xplorer/file/n;)V

    .line 2
    .line 3
    .line 4
    move-object v0, p1

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->m0()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_6f

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->o1()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_6f

    .line 18
    .line 19
    :try_start_12
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/file/g;->J(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_16
    .catch Lax/b3/j; {:try_start_12 .. :try_end_16} :catch_2e
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_16} :catch_17

    .line 23
    return-object p1

    .line 24
    :catch_17
    move-exception p2

    .line 25
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "listchildren local document runtime"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, p2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->r1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_6e

    .line 47
    :catch_2e
    move-exception p2

    .line 48
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_67

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->Z0()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_67

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Lax/Z2/n;->b(Landroid/content/Context;)Lax/Z2/n;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v1, v2, v0}, Lax/Z2/n;->c(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_67

    .line 85
    .line 86
    :try_start_55
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Lax/Z2/n;->b(Landroid/content/Context;)Lax/Z2/n;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1, v2}, Lax/Z2/n;->e(Landroid/content/Context;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->x1()Landroid/net/Uri;
    :try_end_67
    .catch Lax/b3/r; {:try_start_55 .. :try_end_67} :catch_67

    .line 102
    .line 103
    .line 104
    :catch_67
    :cond_67
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->r1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_6e
    return-object p1

    .line 112
    :cond_6f
    invoke-static {}, Lax/X2/Q;->h1()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_9f

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_9f

    .line 127
    .line 128
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 129
    .line 130
    if-eqz v0, :cond_8e

    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8e

    .line 141
    .line 142
    goto :goto_92

    .line 143
    :cond_8e
    sget-object v0, Lcom/voxdon/xplorer/file/m$f;->c0:Lcom/voxdon/xplorer/file/m$f;

    .line 144
    .line 145
    if-ne p2, v0, :cond_9f

    .line 146
    .line 147
    :goto_92
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->s1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-eqz p2, :cond_9f

    .line 152
    .line 153
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_9f

    .line 158
    .line 159
    return-object p2

    .line 160
    :cond_9f
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->r1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1
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

.method public C0(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_22

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1e

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/x;->C0(Lcom/voxdon/xplorer/file/n;)V

    .line 28
    .line 29
    .line 30
    goto :goto_e

    .line 31
    :cond_1e
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 31
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v8, p7

    .line 8
    .line 9
    invoke-interface {v7}, Lax/c3/b;->n()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v2, "location:"

    .line 14
    .line 15
    if-nez v0, :cond_32e

    .line 16
    .line 17
    move-object v0, v7

    .line 18
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->J1(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/n;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lcom/voxdon/xplorer/file/y;

    .line 25
    .line 26
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v9, 0x0

    .line 31
    if-eqz v5, :cond_31

    .line 32
    .line 33
    new-instance v0, Lax/b3/f;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-interface {v7}, Lax/c3/b;->isDirectory()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eq v2, v3, :cond_2d

    .line 44
    .line 45
    const/4 v9, 0x1

    .line 46
    :cond_2d
    invoke-direct {v0, v9}, Lax/b3/f;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_31
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const-string v5, "null inputstream"

    .line 55
    .line 56
    const/16 v10, 0x2000

    .line 57
    .line 58
    const-wide/16 v11, 0x0

    .line 59
    .line 60
    const/4 v13, 0x0

    .line 61
    if-eqz v4, :cond_102

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_102

    .line 68
    .line 69
    invoke-virtual {v3}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    if-eqz v14, :cond_fc

    .line 74
    .line 75
    :try_start_4a
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v2, v3, v9}, Lcom/voxdon/xplorer/shizuku/c;->v(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    new-instance v15, Ljava/io/BufferedOutputStream;

    .line 88
    .line 89
    invoke-direct {v15, v2, v10}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_5b
    .catch Ljava/io/IOException; {:try_start_4a .. :try_end_5b} :catch_80
    .catchall {:try_start_4a .. :try_end_5b} :catchall_7c

    .line 90
    .line 91
    .line 92
    move-wide/from16 v16, p4

    .line 93
    .line 94
    move-object/from16 v18, p9

    .line 95
    .line 96
    move-object/from16 v19, p10

    .line 97
    .line 98
    :try_start_61
    invoke-static/range {v14 .. v19}, Lax/c3/F;->c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J

    .line 99
    .line 100
    .line 101
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_67
    .catch Ljava/io/IOException; {:try_start_61 .. :try_end_67} :catch_d3
    .catchall {:try_start_61 .. :try_end_67} :catchall_cf

    .line 102
    .line 103
    .line 104
    if-eqz p6, :cond_82

    .line 105
    .line 106
    :try_start_69
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    cmp-long v4, v2, v11

    .line 111
    .line 112
    if-ltz v4, :cond_82

    .line 113
    .line 114
    move-object v2, v7

    .line 115
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 116
    .line 117
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    invoke-virtual {v1, v2, v3, v4}, Lcom/voxdon/xplorer/file/x;->d(Lcom/voxdon/xplorer/file/n;J)Z

    .line 122
    .line 123
    .line 124
    goto :goto_82

    .line 125
    :catchall_7c
    move-exception v0

    .line 126
    :goto_7d
    move-object v2, v0

    .line 127
    goto/16 :goto_ee

    .line 128
    .line 129
    :catch_80
    move-exception v0

    .line 130
    goto :goto_d5

    .line 131
    :cond_82
    :goto_82
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/x;->n1(Lcom/voxdon/xplorer/file/y;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_c4

    .line 136
    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v3, "what case is this? : "

    .line 143
    .line 144
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 166
    .line 167
    .line 168
    move-result-object v0
    :try_end_a8
    .catch Ljava/io/IOException; {:try_start_69 .. :try_end_a8} :catch_80
    .catchall {:try_start_69 .. :try_end_a8} :catchall_7c

    .line 169
    const/4 v2, 0x0

    .line 170
    const/4 v3, 0x1

    .line 171
    const/4 v4, 0x0

    .line 172
    const/4 v5, 0x0

    .line 173
    move-object/from16 p3, v0

    .line 174
    .line 175
    move-object/from16 p2, v1

    .line 176
    .line 177
    const/16 p4, 0x0

    .line 178
    .line 179
    const/16 p5, 0x0

    .line 180
    .line 181
    const/16 p6, 0x0

    .line 182
    .line 183
    const/16 p7, 0x1

    .line 184
    .line 185
    :try_start_b8
    invoke-direct/range {p2 .. p7}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V
    :try_end_bb
    .catch Ljava/io/IOException; {:try_start_b8 .. :try_end_bb} :catch_c0
    .catchall {:try_start_b8 .. :try_end_bb} :catchall_bc

    .line 186
    .line 187
    .line 188
    goto :goto_c4

    .line 189
    :catchall_bc
    move-exception v0

    .line 190
    move-object/from16 v1, p2

    .line 191
    .line 192
    goto :goto_7d

    .line 193
    :catch_c0
    move-exception v0

    .line 194
    move-object/from16 v1, p2

    .line 195
    .line 196
    goto :goto_d5

    .line 197
    :cond_c4
    :goto_c4
    :try_start_c4
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_c7
    .catch Ljava/io/IOException; {:try_start_c4 .. :try_end_c7} :catch_c9

    .line 198
    .line 199
    .line 200
    goto/16 :goto_32d

    .line 201
    .line 202
    :catch_c9
    move-exception v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_32d

    .line 207
    .line 208
    :catchall_cf
    move-exception v0

    .line 209
    move-object v2, v0

    .line 210
    move-object v13, v15

    .line 211
    goto :goto_ee

    .line 212
    :catch_d3
    move-exception v0

    .line 213
    move-object v13, v15

    .line 214
    :goto_d5
    :try_start_d5
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v2}, Lax/c3/d0;->M(Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-nez v2, :cond_e7

    .line 223
    .line 224
    new-instance v2, Lax/b3/n;

    .line 225
    .line 226
    const-string v3, "shizuku write file error 1"

    .line 227
    .line 228
    invoke-direct {v2, v3, v0}, Lax/b3/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    throw v2

    .line 232
    :cond_e7
    const-string v2, "shizuku write file error 2"

    .line 233
    .line 234
    invoke-static {v2, v0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    throw v0
    :try_end_ee
    .catchall {:try_start_d5 .. :try_end_ee} :catchall_7c

    .line 239
    :goto_ee
    if-eqz v13, :cond_f3

    .line 240
    .line 241
    :try_start_f0
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V
    :try_end_f3
    .catch Ljava/io/IOException; {:try_start_f0 .. :try_end_f3} :catch_f3

    .line 242
    .line 243
    .line 244
    :catch_f3
    :cond_f3
    :try_start_f3
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_f6
    .catch Ljava/io/IOException; {:try_start_f3 .. :try_end_f6} :catch_f7

    .line 245
    .line 246
    .line 247
    goto :goto_fb

    .line 248
    :catch_f7
    move-exception v0

    .line 249
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 250
    .line 251
    .line 252
    :goto_fb
    throw v2

    .line 253
    :cond_fc
    new-instance v0, Lax/b3/j;

    .line 254
    .line 255
    invoke-direct {v0, v5}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :cond_102
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_289

    .line 264
    .line 265
    invoke-virtual {v3}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    if-nez v14, :cond_163

    .line 270
    .line 271
    instance-of v0, v3, Lcom/voxdon/xplorer/file/m$e;

    .line 272
    .line 273
    const-string v4, "NULL INPUTSTREAM"

    .line 274
    .line 275
    if-eqz v0, :cond_142

    .line 276
    .line 277
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    new-instance v4, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    move-object v2, v3

    .line 298
    check-cast v2, Lcom/voxdon/xplorer/file/m$e;

    .line 299
    .line 300
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/m$e;->e()Lax/c3/K;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v2}, Lax/c3/K;->k()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-virtual {v0, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 320
    .line 321
    .line 322
    goto :goto_15d

    .line 323
    :cond_142
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v0, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 348
    .line 349
    .line 350
    :goto_15d
    new-instance v0, Lax/b3/j;

    .line 351
    .line 352
    invoke-direct {v0, v5}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v0

    .line 356
    :cond_163
    :try_start_163
    new-instance v2, Ljava/io/FileOutputStream;

    .line 357
    .line 358
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 363
    .line 364
    .line 365
    new-instance v15, Ljava/io/BufferedOutputStream;

    .line 366
    .line 367
    invoke-direct {v15, v2, v10}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_171
    .catch Ljava/io/FileNotFoundException; {:try_start_163 .. :try_end_171} :catch_1c5
    .catch Ljava/io/IOException; {:try_start_163 .. :try_end_171} :catch_1c3
    .catchall {:try_start_163 .. :try_end_171} :catchall_1bf

    .line 368
    .line 369
    .line 370
    move-wide/from16 v16, p4

    .line 371
    .line 372
    move-object/from16 v18, p9

    .line 373
    .line 374
    move-object/from16 v19, p10

    .line 375
    .line 376
    :try_start_177
    invoke-static/range {v14 .. v19}, Lax/c3/F;->c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J

    .line 377
    .line 378
    .line 379
    if-eqz p8, :cond_194

    .line 380
    .line 381
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/e;->k0()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_194

    .line 386
    .line 387
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v2}, Ljava/io/FileDescriptor;->sync()V

    .line 392
    .line 393
    .line 394
    goto :goto_194

    .line 395
    :catchall_18a
    move-exception v0

    .line 396
    move-object v1, v0

    .line 397
    move-object v13, v15

    .line 398
    goto/16 :goto_27b

    .line 399
    .line 400
    :catch_18f
    move-exception v0

    .line 401
    move-object v13, v15

    .line 402
    goto :goto_1f7

    .line 403
    :catch_192
    move-exception v0

    .line 404
    goto :goto_1fe

    .line 405
    :cond_194
    :goto_194
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_197
    .catch Ljava/io/FileNotFoundException; {:try_start_177 .. :try_end_197} :catch_192
    .catch Ljava/io/IOException; {:try_start_177 .. :try_end_197} :catch_18f
    .catchall {:try_start_177 .. :try_end_197} :catchall_18a

    .line 406
    .line 407
    .line 408
    :try_start_197
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    sget-object v3, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 413
    .line 414
    if-ne v2, v3, :cond_1c8

    .line 415
    .line 416
    if-eqz p8, :cond_1c8

    .line 417
    .line 418
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->J1(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/n;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 423
    .line 424
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-nez v0, :cond_1cf

    .line 429
    .line 430
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    const-string v2, "written file not found 1"

    .line 439
    .line 440
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 445
    .line 446
    .line 447
    goto :goto_1cf

    .line 448
    :catchall_1bf
    move-exception v0

    .line 449
    move-object v1, v0

    .line 450
    goto/16 :goto_27b

    .line 451
    .line 452
    :catch_1c3
    move-exception v0

    .line 453
    goto :goto_1f7

    .line 454
    :catch_1c5
    move-exception v0

    .line 455
    move-object v15, v13

    .line 456
    goto :goto_1fe

    .line 457
    :cond_1c8
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-static {v0}, Lax/Q2/f;->z0(Lax/Q2/f;)Z

    .line 462
    .line 463
    .line 464
    :cond_1cf
    :goto_1cf
    if-eqz p6, :cond_1e3

    .line 465
    .line 466
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 467
    .line 468
    .line 469
    move-result-wide v2

    .line 470
    cmp-long v0, v2, v11

    .line 471
    .line 472
    if-ltz v0, :cond_1e3

    .line 473
    .line 474
    move-object v0, v7

    .line 475
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 476
    .line 477
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 478
    .line 479
    .line 480
    move-result-wide v2

    .line 481
    invoke-virtual {v1, v0, v2, v3}, Lcom/voxdon/xplorer/file/x;->d(Lcom/voxdon/xplorer/file/n;J)Z

    .line 482
    .line 483
    .line 484
    :cond_1e3
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/4 v5, 0x0

    .line 493
    const/4 v6, 0x1

    .line 494
    const/4 v3, 0x0

    .line 495
    const/4 v4, 0x0

    .line 496
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V
    :try_end_1f2
    .catch Ljava/io/FileNotFoundException; {:try_start_197 .. :try_end_1f2} :catch_1c5
    .catch Ljava/io/IOException; {:try_start_197 .. :try_end_1f2} :catch_1c3
    .catchall {:try_start_197 .. :try_end_1f2} :catchall_1bf

    .line 497
    .line 498
    .line 499
    :try_start_1f2
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_1f5
    .catch Ljava/io/IOException; {:try_start_1f2 .. :try_end_1f5} :catch_251

    .line 500
    .line 501
    .line 502
    goto/16 :goto_32d

    .line 503
    .line 504
    :goto_1f7
    :try_start_1f7
    const-string v1, "write file error 3"

    .line 505
    .line 506
    invoke-static {v1, v0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    throw v0
    :try_end_1fe
    .catchall {:try_start_1f7 .. :try_end_1fe} :catchall_1bf

    .line 511
    :goto_1fe
    :try_start_1fe
    invoke-direct/range {p0 .. p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-eqz v1, :cond_260

    .line 516
    .line 517
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 518
    .line 519
    .line 520
    move-result v1
    :try_end_208
    .catchall {:try_start_1fe .. :try_end_208} :catchall_25d

    .line 521
    if-eqz v1, :cond_260

    .line 522
    .line 523
    :try_start_20a
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-virtual {v1, v7, v9}, Lcom/voxdon/xplorer/file/z;->D(Lcom/voxdon/xplorer/file/n;Z)Ljava/io/FileOutputStream;

    .line 528
    .line 529
    .line 530
    move-result-object v1
    :try_end_212
    .catch Ljava/io/IOException; {:try_start_20a .. :try_end_212} :catch_260
    .catchall {:try_start_20a .. :try_end_212} :catchall_25d

    .line 531
    if-eqz v1, :cond_260

    .line 532
    .line 533
    move-object v2, v15

    .line 534
    :try_start_215
    new-instance v15, Ljava/io/BufferedOutputStream;

    .line 535
    .line 536
    invoke-direct {v15, v1, v10}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_21a
    .catch Ljava/io/IOException; {:try_start_215 .. :try_end_21a} :catch_261
    .catchall {:try_start_215 .. :try_end_21a} :catchall_259

    .line 537
    .line 538
    .line 539
    move-wide/from16 v16, p4

    .line 540
    .line 541
    move-object/from16 v18, p9

    .line 542
    .line 543
    move-object/from16 v19, p10

    .line 544
    .line 545
    :try_start_220
    invoke-static/range {v14 .. v19}, Lax/c3/F;->c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J

    .line 546
    .line 547
    .line 548
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_226
    .catch Ljava/io/IOException; {:try_start_220 .. :try_end_226} :catch_257
    .catchall {:try_start_220 .. :try_end_226} :catchall_18a

    .line 549
    .line 550
    .line 551
    if-eqz p6, :cond_23f

    .line 552
    .line 553
    :try_start_228
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 554
    .line 555
    .line 556
    move-result-wide v1

    .line 557
    cmp-long v3, v1, v11

    .line 558
    .line 559
    if-ltz v3, :cond_23f

    .line 560
    .line 561
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 570
    .line 571
    .line 572
    move-result-wide v3

    .line 573
    invoke-virtual {v1, v2, v3, v4}, Lcom/voxdon/xplorer/file/z;->U(Ljava/lang/String;J)V

    .line 574
    .line 575
    .line 576
    :cond_23f
    if-eqz v8, :cond_24c

    .line 577
    .line 578
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    invoke-virtual {v1, v2, v8}, Lcom/voxdon/xplorer/file/z;->V(Ljava/lang/String;Lcom/voxdon/xplorer/file/p;)V
    :try_end_24c
    .catch Ljava/io/IOException; {:try_start_228 .. :try_end_24c} :catch_262
    .catchall {:try_start_228 .. :try_end_24c} :catchall_1bf

    .line 587
    .line 588
    .line 589
    :cond_24c
    :try_start_24c
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_24f
    .catch Ljava/io/IOException; {:try_start_24c .. :try_end_24f} :catch_251

    .line 590
    .line 591
    .line 592
    goto/16 :goto_32d

    .line 593
    .line 594
    :catch_251
    move-exception v0

    .line 595
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 596
    .line 597
    .line 598
    goto/16 :goto_32d

    .line 599
    .line 600
    :catch_257
    move-object v13, v15

    .line 601
    goto :goto_262

    .line 602
    :catchall_259
    move-exception v0

    .line 603
    :goto_25a
    move-object v1, v0

    .line 604
    move-object v13, v2

    .line 605
    goto :goto_27b

    .line 606
    :catchall_25d
    move-exception v0

    .line 607
    move-object v2, v15

    .line 608
    goto :goto_25a

    .line 609
    :catch_260
    :cond_260
    move-object v2, v15

    .line 610
    :catch_261
    move-object v13, v2

    .line 611
    :catch_262
    :goto_262
    :try_start_262
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-static {v1}, Lax/c3/d0;->M(Ljava/lang/String;)Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    if-nez v1, :cond_274

    .line 620
    .line 621
    new-instance v1, Lax/b3/n;

    .line 622
    .line 623
    const-string v2, "write file error 1"

    .line 624
    .line 625
    invoke-direct {v1, v2, v0}, Lax/b3/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 626
    .line 627
    .line 628
    throw v1

    .line 629
    :cond_274
    const-string v1, "write file error 2"

    .line 630
    .line 631
    invoke-static {v1, v0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    throw v0
    :try_end_27b
    .catchall {:try_start_262 .. :try_end_27b} :catchall_1bf

    .line 636
    :goto_27b
    if-eqz v13, :cond_280

    .line 637
    .line 638
    :try_start_27d
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V
    :try_end_280
    .catch Ljava/io/IOException; {:try_start_27d .. :try_end_280} :catch_280

    .line 639
    .line 640
    .line 641
    :catch_280
    :cond_280
    :try_start_280
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_283
    .catch Ljava/io/IOException; {:try_start_280 .. :try_end_283} :catch_284

    .line 642
    .line 643
    .line 644
    goto :goto_288

    .line 645
    :catch_284
    move-exception v0

    .line 646
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 647
    .line 648
    .line 649
    :goto_288
    throw v1

    .line 650
    :cond_289
    move-wide/from16 v4, p4

    .line 651
    .line 652
    move-object/from16 v6, p6

    .line 653
    .line 654
    move-object/from16 v8, p9

    .line 655
    .line 656
    move-object/from16 v9, p10

    .line 657
    .line 658
    move-object v2, v7

    .line 659
    move/from16 v7, p8

    .line 660
    .line 661
    invoke-static/range {v1 .. v9}, Lcom/voxdon/xplorer/file/g;->Q(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    sget-object v3, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 669
    .line 670
    if-ne v2, v3, :cond_2fb

    .line 671
    .line 672
    if-eqz p8, :cond_2fb

    .line 673
    .line 674
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->J1(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/n;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 679
    .line 680
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    if-nez v2, :cond_2fb

    .line 685
    .line 686
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    invoke-static {v2}, Lax/c3/d0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    invoke-static {v3, v2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    invoke-virtual {v1, v2, v3}, Lcom/voxdon/xplorer/file/x;->L0(Ljava/lang/String;Lax/c3/K;)Lcom/voxdon/xplorer/file/n;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 711
    .line 712
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    if-nez v3, :cond_2fb

    .line 717
    .line 718
    new-instance v3, Ljava/lang/StringBuilder;

    .line 719
    .line 720
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 721
    .line 722
    .line 723
    const-string v4, "validfat:"

    .line 724
    .line 725
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    invoke-static {v2}, Lax/c3/d0;->M(Ljava/lang/String;)Z

    .line 733
    .line 734
    .line 735
    move-result v2

    .line 736
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    const-string v4, "written file not found 2"

    .line 752
    .line 753
    invoke-virtual {v3, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    invoke-virtual {v3, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-virtual {v2}, Lax/Ha/b;->h()V

    .line 762
    .line 763
    .line 764
    :cond_2fb
    if-eqz p6, :cond_30c

    .line 765
    .line 766
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 767
    .line 768
    .line 769
    move-result-wide v2

    .line 770
    cmp-long v4, v2, v11

    .line 771
    .line 772
    if-ltz v4, :cond_30c

    .line 773
    .line 774
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 775
    .line 776
    .line 777
    move-result-wide v2

    .line 778
    invoke-virtual {v1, v0, v2, v3}, Lcom/voxdon/xplorer/file/x;->d(Lcom/voxdon/xplorer/file/n;J)Z

    .line 779
    .line 780
    .line 781
    :cond_30c
    invoke-static {}, Lax/X2/J;->n()Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-eqz v0, :cond_32d

    .line 786
    .line 787
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    const/4 v2, 0x0

    .line 796
    const/4 v3, 0x1

    .line 797
    const/4 v4, 0x0

    .line 798
    const/4 v5, 0x0

    .line 799
    move-object/from16 p2, v0

    .line 800
    .line 801
    move-object/from16 p1, v1

    .line 802
    .line 803
    const/16 p3, 0x0

    .line 804
    .line 805
    const/16 p4, 0x0

    .line 806
    .line 807
    const/16 p5, 0x0

    .line 808
    .line 809
    const/16 p6, 0x1

    .line 810
    .line 811
    invoke-direct/range {p1 .. p6}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V

    .line 812
    .line 813
    .line 814
    :cond_32d
    :goto_32d
    return-void

    .line 815
    :cond_32e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    const-string v1, "!! WRITE FILE ALREADY EXISTS !!"

    .line 824
    .line 825
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    new-instance v1, Ljava/lang/StringBuilder;

    .line 834
    .line 835
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 861
    .line 862
    .line 863
    new-instance v0, Lax/b3/j;

    .line 864
    .line 865
    const-string v1, "WriteFile file already exists"

    .line 866
    .line 867
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    throw v0
.end method

.method public E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move-object/from16 v6, p4

    .line 8
    .line 9
    invoke-interface {v4}, Lax/c3/b;->n()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 14
    .line 15
    .line 16
    move-object v0, v3

    .line 17
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 18
    .line 19
    move-object v2, v4

    .line 20
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    if-eqz v5, :cond_62

    .line 29
    .line 30
    invoke-interface {v3}, Lax/c3/b;->p()J

    .line 31
    .line 32
    .line 33
    move-result-wide v9

    .line 34
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v12

    .line 46
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v13

    .line 50
    invoke-virtual {v11, v12, v13}, Lcom/voxdon/xplorer/shizuku/c;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-nez v11, :cond_3a

    .line 55
    .line 56
    invoke-direct {v1, v3, v4, v8}, Lcom/voxdon/xplorer/file/x;->F1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    if-eqz v6, :cond_3f

    .line 60
    .line 61
    invoke-interface {v6, v9, v10, v9, v10}, Lax/g3/i;->a(JJ)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/x;->n1(Lcom/voxdon/xplorer/file/y;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_48

    .line 69
    .line 70
    invoke-direct {v1, v3, v5, v7}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 71
    .line 72
    .line 73
    :cond_48
    invoke-direct {v1, v2}, Lcom/voxdon/xplorer/file/x;->n1(Lcom/voxdon/xplorer/file/y;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_193

    .line 78
    .line 79
    move-object v5, v4

    .line 80
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/x;->B1(Lcom/voxdon/xplorer/file/n;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/4 v5, 0x1

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_62
    move-object v5, v4

    .line 100
    invoke-direct/range {p0 .. p2}, Lcom/voxdon/xplorer/file/x;->R1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_194

    .line 105
    .line 106
    invoke-interface {v3}, Lax/c3/b;->p()J

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    move-object v11, v3

    .line 115
    check-cast v11, Lcom/voxdon/xplorer/file/y;

    .line 116
    .line 117
    invoke-static {}, Lax/X2/Q;->P0()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_169

    .line 122
    .line 123
    const/4 v12, 0x0

    .line 124
    :try_start_7b
    invoke-virtual {v11}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-array v13, v12, [Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v0, v13}, Lj$/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Lj$/nio/file/Path;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    new-array v14, v12, [Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v13, v14}, Lj$/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Lj$/nio/file/Path;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    if-eqz v0, :cond_a8

    .line 145
    .line 146
    if-eqz v13, :cond_a8

    .line 147
    .line 148
    invoke-interface {v0}, Lj$/nio/file/Path;->getFileSystem()Lj$/nio/file/FileSystem;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-interface {v13}, Lj$/nio/file/Path;->getFileSystem()Lj$/nio/file/FileSystem;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    if-nez v14, :cond_a8

    .line 161
    .line 162
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_a4
    .catch Ljava/lang/RuntimeException; {:try_start_7b .. :try_end_a4} :catch_a5

    .line 163
    .line 164
    .line 165
    goto :goto_a8

    .line 166
    :catch_a5
    move-exception v0

    .line 167
    goto/16 :goto_12b

    .line 168
    .line 169
    :cond_a8
    :goto_a8
    :try_start_a8
    new-array v14, v12, [Lj$/nio/file/CopyOption;

    .line 170
    .line 171
    invoke-static {v0, v13, v14}, Lj$/nio/file/Files;->move(Lj$/nio/file/Path;Lj$/nio/file/Path;[Lj$/nio/file/CopyOption;)Lj$/nio/file/Path;
    :try_end_ad
    .catch Ljava/io/IOException; {:try_start_a8 .. :try_end_ad} :catch_b1
    .catch Ljava/lang/SecurityException; {:try_start_a8 .. :try_end_ad} :catch_af
    .catch Ljava/lang/RuntimeException; {:try_start_a8 .. :try_end_ad} :catch_a5

    .line 172
    .line 173
    .line 174
    goto/16 :goto_17a

    .line 175
    .line 176
    :catch_af
    move-exception v0

    .line 177
    goto :goto_b2

    .line 178
    :catch_b1
    move-exception v0

    .line 179
    :goto_b2
    :try_start_b2
    invoke-static {}, Lax/X2/Q;->e()Z

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    if-eqz v13, :cond_cb

    .line 184
    .line 185
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/x;->l1(Ljava/lang/Exception;)Z

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    if-eqz v13, :cond_cb

    .line 190
    .line 191
    invoke-static {v5}, Lcom/voxdon/xplorer/file/x;->i1(Lcom/voxdon/xplorer/file/n;)Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-nez v13, :cond_102

    .line 196
    .line 197
    invoke-static {v3}, Lcom/voxdon/xplorer/file/x;->i1(Lcom/voxdon/xplorer/file/n;)Z

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    if-eqz v13, :cond_cb

    .line 202
    .line 203
    goto :goto_102

    .line 204
    :cond_cb
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_e4

    .line 209
    .line 210
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/x;->l1(Ljava/lang/Exception;)Z

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    if-eqz v13, :cond_e4

    .line 215
    .line 216
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    if-nez v13, :cond_102

    .line 221
    .line 222
    invoke-virtual {v11}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    if-eqz v13, :cond_e4

    .line 227
    .line 228
    goto :goto_102

    .line 229
    :cond_e4
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-eqz v13, :cond_116

    .line 234
    .line 235
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/x;->l1(Ljava/lang/Exception;)Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-eqz v13, :cond_116

    .line 240
    .line 241
    invoke-static {v3}, Lcom/voxdon/xplorer/file/x;->h1(Lcom/voxdon/xplorer/file/n;)Z

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    if-nez v13, :cond_fc

    .line 246
    .line 247
    invoke-static {v5}, Lcom/voxdon/xplorer/file/x;->h1(Lcom/voxdon/xplorer/file/n;)Z

    .line 248
    .line 249
    .line 250
    move-result v13

    .line 251
    if-eqz v13, :cond_116

    .line 252
    .line 253
    :cond_fc
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    if-eqz v13, :cond_116

    .line 258
    .line 259
    :cond_102
    :goto_102
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_10f

    .line 264
    .line 265
    move-object/from16 v13, p3

    .line 266
    .line 267
    invoke-direct {v1, v11, v2, v13, v6}, Lcom/voxdon/xplorer/file/x;->A1(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;Lax/u3/c;Lax/g3/i;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_193

    .line 271
    .line 272
    :cond_10f
    move-object/from16 v13, p3

    .line 273
    .line 274
    invoke-direct/range {p0 .. p4}, Lcom/voxdon/xplorer/file/x;->z1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_193

    .line 278
    .line 279
    :cond_116
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-virtual {v13, v14}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 291
    .line 292
    .line 293
    move-result v13

    .line 294
    if-nez v13, :cond_17a

    .line 295
    .line 296
    invoke-direct {v1, v3, v5, v0}, Lcom/voxdon/xplorer/file/x;->F1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Ljava/lang/Throwable;)V
    :try_end_12a
    .catch Ljava/lang/RuntimeException; {:try_start_b2 .. :try_end_12a} :catch_a5

    .line 297
    .line 298
    .line 299
    goto :goto_17a

    .line 300
    :goto_12b
    invoke-virtual {v11}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    invoke-virtual {v11, v13}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    if-nez v11, :cond_13d

    .line 313
    .line 314
    invoke-direct {v1, v3, v5, v8}, Lcom/voxdon/xplorer/file/x;->F1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    goto :goto_13e

    .line 318
    :cond_13d
    const/4 v12, 0x1

    .line 319
    :goto_13e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    invoke-virtual {v5}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    const-string v8, "moveFile InvalidPath"

    .line 328
    .line 329
    invoke-virtual {v5, v8}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-virtual {v5, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    new-instance v5, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const-string v8, "retry success="

    .line 343
    .line 344
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    invoke-virtual {v0, v5}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 359
    .line 360
    .line 361
    goto :goto_17a

    .line 362
    :cond_169
    invoke-virtual {v11}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 367
    .line 368
    .line 369
    move-result-object v11

    .line 370
    invoke-virtual {v0, v11}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-nez v0, :cond_17a

    .line 375
    .line 376
    invoke-direct {v1, v3, v5, v8}, Lcom/voxdon/xplorer/file/x;->F1(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    :cond_17a
    :goto_17a
    if-eqz v6, :cond_17f

    .line 380
    .line 381
    invoke-interface {v6, v9, v10, v9, v10}, Lax/g3/i;->a(JJ)V

    .line 382
    .line 383
    .line 384
    :cond_17f
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/x;->B1(Lcom/voxdon/xplorer/file/n;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    invoke-direct {v1, v3, v4, v7}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/file/x;->J1(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/n;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 396
    .line 397
    const/4 v5, 0x1

    .line 398
    const/4 v6, 0x0

    .line 399
    const/4 v3, 0x0

    .line 400
    move v4, v0

    .line 401
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V

    .line 402
    .line 403
    .line 404
    :cond_193
    :goto_193
    return-void

    .line 405
    :cond_194
    move-object/from16 v13, p3

    .line 406
    .line 407
    move-object/from16 v2, p0

    .line 408
    .line 409
    move-object/from16 v1, p0

    .line 410
    .line 411
    move-object v4, v5

    .line 412
    move-object v5, v13

    .line 413
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->y1(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 414
    .line 415
    .line 416
    return-void
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
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
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method public E0(Lax/g3/i;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_f

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_d
    move-exception p1

    .line 15
    goto :goto_31

    .line 16
    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->w0()V

    .line 24
    .line 25
    .line 26
    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_3 .. :try_end_1a} :catchall_d

    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2, v1, p1}, Lax/c3/M;->b(Landroid/content/Context;Ljava/util/List;Lax/g3/i;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-static {v2, v1, v3, p1}, Lax/c3/M;->c(Landroid/content/Context;Ljava/util/List;ZLax/g3/i;)I

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v1, v0, p1}, Lcom/voxdon/xplorer/file/x;->H0(Ljava/util/ArrayList;ILax/g3/i;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_31
    :try_start_31
    monitor-exit v0
    :try_end_32
    .catchall {:try_start_31 .. :try_end_32} :catchall_d

    .line 51
    throw p1
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

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->s(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const/4 v8, 0x0

    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p2

    .line 28
    move-object v9, p3

    .line 29
    move-object v10, p4

    .line 30
    invoke-virtual/range {v0 .. v10}, Lcom/voxdon/xplorer/file/x;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public G(Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    .line 1
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->s()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/x;->c1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

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
.end method

.method public G0()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_f

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_d
    move-exception v1

    .line 15
    goto :goto_4b

    .line 16
    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->w0()V

    .line 24
    .line 25
    .line 26
    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_3 .. :try_end_1a} :catchall_d

    .line 27
    invoke-static {}, Lax/X2/Q;->U()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_26

    .line 32
    .line 33
    invoke-static {}, Lax/X2/Q;->T()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_34

    .line 38
    .line 39
    :cond_26
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, v1}, Lax/c3/M;->f(Landroid/content/Context;Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_34

    .line 51
    .line 52
    goto :goto_4a

    .line 53
    :cond_34
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/x;->F0(Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lez v0, :cond_4a

    .line 61
    .line 62
    new-instance v0, Lcom/voxdon/xplorer/file/x$d;

    .line 63
    .line 64
    const-wide/16 v2, 0x1f4

    .line 65
    .line 66
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/voxdon/xplorer/file/x$d;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/util/ArrayList;J)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    new-array v1, v1, [Ljava/lang/Long;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 73
    .line 74
    .line 75
    :cond_4a
    :goto_4a
    return-void

    .line 76
    :goto_4b
    :try_start_4b
    monitor-exit v0
    :try_end_4c
    .catchall {:try_start_4b .. :try_end_4c} :catchall_d

    .line 77
    throw v1
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

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 10
    .line 11
    if-ne v1, v2, :cond_1b

    .line 12
    .line 13
    invoke-interface {p1}, Lax/c3/b;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1b

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lax/c3/z;->f0:Lax/c3/z;

    .line 24
    .line 25
    if-eq v2, v1, :cond_1b

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1b
    invoke-static {p1}, Lax/c3/B;->Y(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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

.method public H1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
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
    const/4 v1, 0x0

    .line 7
    :try_start_6
    new-instance v2, Ljava/io/BufferedReader;

    .line 8
    .line 9
    new-instance v3, Ljava/io/InputStreamReader;

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    invoke-virtual {p0, p1, v4, v5}, Lcom/voxdon/xplorer/file/x;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_16} :catch_36
    .catch Lax/b3/j; {:try_start_6 .. :try_end_16} :catch_33
    .catchall {:try_start_6 .. :try_end_16} :catchall_31

    .line 21
    .line 22
    .line 23
    :cond_16
    :goto_16
    :try_start_16
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_2d

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_16

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_25} :catch_2b
    .catch Lax/b3/j; {:try_start_16 .. :try_end_25} :catch_29
    .catchall {:try_start_16 .. :try_end_25} :catchall_26

    .line 36
    .line 37
    .line 38
    goto :goto_16

    .line 39
    :catchall_26
    move-exception p1

    .line 40
    move-object v1, v2

    .line 41
    goto :goto_53

    .line 42
    :catch_29
    move-exception p1

    .line 43
    goto :goto_38

    .line 44
    :catch_2b
    move-exception p1

    .line 45
    goto :goto_38

    .line 46
    :cond_2d
    :try_start_2d
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_30
    .catch Ljava/io/IOException; {:try_start_2d .. :try_end_30} :catch_30

    .line 47
    .line 48
    .line 49
    :catch_30
    return-object v0

    .line 50
    :catchall_31
    move-exception p1

    .line 51
    goto :goto_53

    .line 52
    :catch_33
    move-exception p1

    .line 53
    :goto_34
    move-object v2, v1

    .line 54
    goto :goto_38

    .line 55
    :catch_36
    move-exception p1

    .line 56
    goto :goto_34

    .line 57
    :goto_38
    :try_start_38
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v3, "DOT_HIDDEN READ ERROR"

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_4d
    .catchall {:try_start_38 .. :try_end_4d} :catchall_26

    .line 76
    .line 77
    .line 78
    if-eqz v2, :cond_52

    .line 79
    .line 80
    :try_start_4f
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_52
    .catch Ljava/io/IOException; {:try_start_4f .. :try_end_52} :catch_52

    .line 81
    .line 82
    .line 83
    :catch_52
    :cond_52
    return-object v1

    .line 84
    :goto_53
    if-eqz v1, :cond_58

    .line 85
    .line 86
    :try_start_55
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_58
    .catch Ljava/io/IOException; {:try_start_55 .. :try_end_58} :catch_58

    .line 87
    .line 88
    .line 89
    :catch_58
    :cond_58
    throw p1
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

.method public I(Lcom/voxdon/xplorer/file/n;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string p1, "not support delete file recursively"

    .line 2
    .line 3
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

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

.method protected I0(Lcom/voxdon/xplorer/file/n;Ljava/util/List;ZLjava/lang/String;ZLax/g3/h;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z",
            "Ljava/lang/String;",
            "Z",
            "Lax/g3/h;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-static {p2, p4, p5, p1}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-interface {p6, p1, p3}, Lax/g3/h;->Y(Ljava/util/List;Z)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public I1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 9

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ".hidden"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v2, :cond_16

    .line 21
    .line 22
    return v3

    .line 23
    :cond_16
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/x;->H1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_1d

    .line 28
    .line 29
    return v3

    .line 30
    :cond_1d
    const/4 v2, 0x0

    .line 31
    :try_start_1e
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 32
    .line 33
    invoke-virtual {p0, v0, v3}, Lcom/voxdon/xplorer/file/x;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v4, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_27} :catch_5e
    .catchall {:try_start_1e .. :try_end_27} :catchall_5c

    .line 38
    .line 39
    .line 40
    :try_start_27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x1

    .line 45
    const/4 v2, 0x1

    .line 46
    :cond_2d
    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_58

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/String;

    .line 57
    .line 58
    if-nez v2, :cond_47

    .line 59
    .line 60
    const-string v6, "\n"

    .line 61
    .line 62
    invoke-virtual {v4, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_47

    .line 66
    :catchall_41
    move-exception p1

    .line 67
    move-object v2, v4

    .line 68
    goto :goto_68

    .line 69
    :catch_44
    move-exception p1

    .line 70
    move-object v2, v4

    .line 71
    goto :goto_5f

    .line 72
    :cond_47
    :goto_47
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_2d

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_54
    .catch Ljava/io/IOException; {:try_start_27 .. :try_end_54} :catch_44
    .catchall {:try_start_27 .. :try_end_54} :catchall_41

    .line 83
    .line 84
    .line 85
    if-eqz v2, :cond_2d

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    goto :goto_2d

    .line 89
    :cond_58
    :try_start_58
    invoke-virtual {v4}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_5b
    .catch Ljava/io/IOException; {:try_start_58 .. :try_end_5b} :catch_5b

    .line 90
    .line 91
    .line 92
    :catch_5b
    return v1

    .line 93
    :catchall_5c
    move-exception p1

    .line 94
    goto :goto_68

    .line 95
    :catch_5e
    move-exception p1

    .line 96
    :goto_5f
    :try_start_5f
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_62
    .catchall {:try_start_5f .. :try_end_62} :catchall_5c

    .line 97
    .line 98
    .line 99
    if-eqz v2, :cond_67

    .line 100
    .line 101
    :try_start_64
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_67
    .catch Ljava/io/IOException; {:try_start_64 .. :try_end_67} :catch_67

    .line 102
    .line 103
    .line 104
    :catch_67
    :cond_67
    return v3

    .line 105
    :goto_68
    if-eqz v2, :cond_6d

    .line 106
    .line 107
    :try_start_6a
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_6d
    .catch Ljava/io/IOException; {:try_start_6a .. :try_end_6d} :catch_6d

    .line 108
    .line 109
    .line 110
    :catch_6d
    :cond_6d
    throw p1
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

.method public J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 3
    .line 4
    :try_start_3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->m0()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_7} :catch_2b
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_7} :catch_22

    .line 8
    if-eqz v1, :cond_38

    .line 9
    .line 10
    :try_start_9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1, p1, p2, p3}, Lcom/voxdon/xplorer/file/g;->t(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_30

    .line 23
    .line 24
    new-instance v2, Lcom/voxdon/xplorer/file/x$e;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->p()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4
    :try_end_1d
    .catch Lax/b3/j; {:try_start_9 .. :try_end_1d} :catch_2e
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_1d} :catch_2b
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_1d} :catch_22

    .line 30
    move-wide v6, p2

    .line 31
    :try_start_1e
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/x$e;-><init>(Ljava/io/InputStream;JJ)V
    :try_end_21
    .catch Lax/b3/j; {:try_start_1e .. :try_end_21} :catch_29
    .catch Ljava/io/FileNotFoundException; {:try_start_1e .. :try_end_21} :catch_25
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_21} :catch_22

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :catch_22
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_63

    .line 38
    :catch_25
    move-exception v0

    .line 39
    move-wide v4, v6

    .line 40
    :goto_27
    move-object p2, v0

    .line 41
    goto :goto_69

    .line 42
    :catch_29
    move-wide v4, v6

    .line 43
    goto :goto_31

    .line 44
    :catch_2b
    move-exception v0

    .line 45
    move-wide v4, p2

    .line 46
    goto :goto_27

    .line 47
    :catch_2e
    move-wide v4, p2

    .line 48
    goto :goto_31

    .line 49
    :cond_30
    return-object v3

    .line 50
    :goto_31
    :try_start_31
    invoke-direct {p0, v0, v4, v5}, Lcom/voxdon/xplorer/file/x;->P0(Lcom/voxdon/xplorer/file/y;J)Ljava/io/InputStream;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :catch_36
    move-exception v0

    .line 56
    goto :goto_27

    .line 57
    :cond_38
    move-wide v4, p2

    .line 58
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_5d

    .line 63
    .line 64
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p2, p3, v4, v5}, Lcom/voxdon/xplorer/shizuku/c;->s(Ljava/lang/String;J)Ljava/io/InputStream;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_5c

    .line 81
    .line 82
    move-object p2, v0

    .line 83
    new-instance v0, Lcom/voxdon/xplorer/file/x$e;

    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->p()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-direct/range {v0 .. v5}, Lcom/voxdon/xplorer/file/x$e;-><init>(Ljava/io/InputStream;JJ)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_5c
    return-object v1

    .line 94
    :cond_5d
    move-object p2, v0

    .line 95
    invoke-direct {p0, p2, v4, v5}, Lcom/voxdon/xplorer/file/x;->P0(Lcom/voxdon/xplorer/file/y;J)Ljava/io/InputStream;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_62
    .catch Ljava/io/FileNotFoundException; {:try_start_31 .. :try_end_62} :catch_36
    .catch Ljava/io/IOException; {:try_start_31 .. :try_end_62} :catch_22

    .line 99
    return-object p1

    .line 100
    :goto_63
    new-instance p2, Lax/b3/j;

    .line 101
    .line 102
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw p2

    .line 106
    :goto_69
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-virtual {p3}, Lax/Z2/j;->q0()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_9f

    .line 115
    .line 116
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p3, v0}, Lcom/voxdon/xplorer/file/z;->m(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-eqz p3, :cond_9f

    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    invoke-static {p3}, Lax/t3/j;->k(Landroid/content/Context;)Z

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    if-eqz p3, :cond_94

    .line 139
    .line 140
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-virtual {p3, p1, v4, v5}, Lcom/voxdon/xplorer/file/z;->w(Lcom/voxdon/xplorer/file/n;J)Ljava/io/FileInputStream;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    goto :goto_9c

    .line 149
    :cond_94
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-virtual {p3, p1, v4, v5}, Lcom/voxdon/xplorer/file/z;->z(Lcom/voxdon/xplorer/file/n;J)Ljava/io/FileInputStream;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_9c
    if-eqz p1, :cond_9f

    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_9f
    const-string p1, "getInputStream"

    .line 161
    .line 162
    const/4 p3, 0x0

    .line 163
    invoke-static {p1, p2, p3}, Lax/b3/d;->c(Ljava/lang/String;Ljava/lang/Exception;Z)Lax/b3/j;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_a9

    .line 168
    .line 169
    throw p1

    .line 170
    :cond_a9
    new-instance p1, Lax/b3/t;

    .line 171
    .line 172
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    throw p1
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

.method protected J1(Lcom/voxdon/xplorer/file/y;)Lcom/voxdon/xplorer/file/n;
    .registers 6

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->f1()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {p0, v1, v2, v3}, Lcom/voxdon/xplorer/file/x;->z0(Ljava/io/File;Lax/c3/K;Z)Lcom/voxdon/xplorer/file/y;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p1}, Lcom/voxdon/xplorer/file/y;->t0(Lcom/voxdon/xplorer/file/y;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2b

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2b

    .line 36
    .line 37
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/x;->M0(Lcom/voxdon/xplorer/file/y;Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_2b

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2b
    return-object v1
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

.method public K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 4

    .line 1
    invoke-interface {p3}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-interface {p3, p1, p2}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method protected K0(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 10

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, v1}, Lax/u3/B;->k(Landroid/content/Context;Ljava/lang/String;Ljava/io/FileDescriptor;)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_11

    .line 11
    .line 12
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    sget-object v3, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 19
    .line 20
    const-string v0, "album_id"

    .line 21
    .line 22
    const-string v2, "_data"

    .line 23
    .line 24
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    filled-new-array {p1}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const/4 v7, 0x0

    .line 33
    const-string v5, "_data = ?"

    .line 34
    .line 35
    move-object v2, p0

    .line 36
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/x;->G1(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_40

    .line 41
    .line 42
    sget-object v3, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 43
    .line 44
    const-string v0, "album_art"

    .line 45
    .line 46
    const-string v2, "album"

    .line 47
    .line 48
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    filled-new-array {p1}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    const/4 v7, 0x0

    .line 57
    const-string v5, "_id = ? AND album_art IS NOT NULL"

    .line 58
    .line 59
    move-object v2, p0

    .line 60
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/x;->G1(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    goto :goto_42

    .line 65
    :cond_40
    move-object v2, p0

    .line 66
    move-object p1, v1

    .line 67
    :goto_42
    if-eqz p1, :cond_5b

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_5b

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5b

    .line 86
    .line 87
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->x1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_5b
    return-object v1
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

.method public L()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected L0(Ljava/lang/String;Lax/c3/K;)Lcom/voxdon/xplorer/file/n;
    .registers 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, v0, p2, p1}, Lcom/voxdon/xplorer/file/x;->z0(Ljava/io/File;Lax/c3/K;Z)Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public M(Lcom/voxdon/xplorer/file/n;)Z
    .registers 5

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    move-object v0, p1

    .line 10
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1e

    .line 17
    .line 18
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/shizuku/c;->o(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1e
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_4e

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_32

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {p0, p1, v1, v2}, Lcom/voxdon/xplorer/file/x;->p0(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 49
    .line 50
    .line 51
    :cond_32
    if-nez v0, :cond_4d

    .line 52
    .line 53
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4d

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4d

    .line 64
    .line 65
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/z;->i(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :cond_4d
    return v0

    .line 79
    :cond_4e
    :try_start_4e
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 80
    .line 81
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->y0(Lcom/voxdon/xplorer/file/y;)Z

    .line 82
    .line 83
    .line 84
    move-result p1
    :try_end_54
    .catch Lax/b3/j; {:try_start_4e .. :try_end_54} :catch_55

    .line 85
    return p1

    .line 86
    :catch_55
    return v1
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
    .registers 10

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v7, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v7

    .line 9
    :cond_8
    move-object v0, p1

    .line 10
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1e

    .line 17
    .line 18
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/shizuku/c;->p(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0

    .line 31
    :cond_1e
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_62

    .line 36
    .line 37
    :try_start_24
    move-object v0, p1

    .line 38
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_44

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x1

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    move-object v1, p0

    .line 63
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V
    :try_end_41
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_41} :catch_42

    .line 64
    .line 65
    .line 66
    return v0

    .line 67
    :catch_42
    move-exception v0

    .line 68
    goto :goto_45

    .line 69
    :cond_44
    return v0

    .line 70
    :goto_45
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_5e

    .line 75
    .line 76
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5e

    .line 81
    .line 82
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/z;->h(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    return v0

    .line 95
    :cond_5e
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    return v7

    .line 99
    :cond_62
    :try_start_62
    invoke-static {p0, p1, v7}, Lcom/voxdon/xplorer/file/g;->d(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_7a

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x1

    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    move-object v1, p0

    .line 118
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/x;->M1(Lcom/voxdon/xplorer/file/n;ZZZZ)V
    :try_end_78
    .catch Lax/b3/j; {:try_start_62 .. :try_end_78} :catch_7a

    .line 119
    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    return v0

    .line 123
    :catch_7a
    :cond_7a
    return v7
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

.method protected N0(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/x;->Q0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_13

    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->h:Ljava/util/HashMap;

    .line 9
    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->x1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_13
    iget-object v1, p0, Lcom/voxdon/xplorer/file/x;->h:Ljava/util/HashMap;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/x;->x1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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

.method public O()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_3f

    .line 10
    .line 11
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v3, v4}, Lcom/voxdon/xplorer/shizuku/c;->q(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_35

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2d

    .line 37
    .line 38
    new-instance p1, Lax/b3/t;

    .line 39
    .line 40
    const-string v0, "Shizuku.delete failed : not exist"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2d
    new-instance p1, Lax/b3/j;

    .line 47
    .line 48
    const-string v0, "Shizuku.delete failed."

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_35
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/x;->n1(Lcom/voxdon/xplorer/file/y;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_140

    .line 59
    .line 60
    invoke-direct {p0, p1, v1, v2}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3f
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_130

    .line 69
    .line 70
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_61

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_61

    .line 85
    .line 86
    array-length v3, v3

    .line 87
    if-gtz v3, :cond_59

    .line 88
    .line 89
    goto :goto_61

    .line 90
    :cond_59
    new-instance p1, Lax/b3/k;

    .line 91
    .line 92
    const-string v0, "File.delete directory that has children"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Lax/b3/k;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_61
    :goto_61
    invoke-static {}, Lax/X2/Q;->P0()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const/4 v4, 0x0

    .line 103
    if-eqz v3, :cond_7e

    .line 104
    .line 105
    :try_start_68
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    new-array v5, v2, [Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v3, v5}, Lj$/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Lj$/nio/file/Path;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Lj$/nio/file/Files;->delete(Lj$/nio/file/Path;)V
    :try_end_75
    .catch Ljava/io/IOException; {:try_start_68 .. :try_end_75} :catch_7a
    .catch Ljava/lang/RuntimeException; {:try_start_68 .. :try_end_75} :catch_77

    .line 116
    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    goto :goto_86

    .line 120
    :catch_77
    move-exception v3

    .line 121
    :goto_78
    move-object v4, v3

    .line 122
    goto :goto_7c

    .line 123
    :catch_7a
    move-exception v3

    .line 124
    goto :goto_78

    .line 125
    :goto_7c
    const/4 v3, 0x0

    .line 126
    goto :goto_86

    .line 127
    :cond_7e
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    :goto_86
    invoke-static {}, Lax/X2/J;->f()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_a5

    .line 140
    .line 141
    if-eqz v3, :cond_a5

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_a5

    .line 152
    .line 153
    invoke-static {v5}, Lax/c3/B;->u(Ljava/io/File;)Ljava/io/File;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v5, v6}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_a5

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 164
    .line 165
    .line 166
    :cond_a5
    if-nez v3, :cond_12c

    .line 167
    .line 168
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_c3

    .line 173
    .line 174
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_c3

    .line 179
    .line 180
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v2, v3}, Lcom/voxdon/xplorer/file/z;->j(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_c3

    .line 193
    .line 194
    goto/16 :goto_140

    .line 195
    .line 196
    :cond_c3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_124

    .line 204
    .line 205
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v2, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 210
    .line 211
    if-ne v0, v2, :cond_e3

    .line 212
    .line 213
    invoke-interface {p1}, Lax/c3/b;->j()Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_db

    .line 218
    .line 219
    goto :goto_e3

    .line 220
    :cond_db
    new-instance p1, Lax/b3/w;

    .line 221
    .line 222
    const-string v0, "Read only system file.delete failed"

    .line 223
    .line 224
    invoke-direct {p1, v0}, Lax/b3/w;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p1

    .line 228
    :cond_e3
    :goto_e3
    if-eqz v4, :cond_108

    .line 229
    .line 230
    new-instance p1, Lax/b3/j;

    .line 231
    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v2, "File.delete failed dir=:"

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v1, ":"

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-direct {p1, v0, v4}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    throw p1

    .line 265
    :cond_108
    new-instance p1, Lax/b3/j;

    .line 266
    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v2, "File.delete failed dir="

    .line 273
    .line 274
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v1, ",exists=true"

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw p1

    .line 293
    :cond_124
    new-instance p1, Lax/b3/t;

    .line 294
    .line 295
    const-string v0, "File.delete failed : File not exist"

    .line 296
    .line 297
    invoke-direct {p1, v0}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw p1

    .line 301
    :cond_12c
    invoke-direct {p0, p1, v1, v2}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 302
    .line 303
    .line 304
    goto :goto_140

    .line 305
    :cond_130
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/file/g;->g(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 306
    .line 307
    .line 308
    invoke-static {}, Lax/X2/Q;->G0()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-nez v0, :cond_140

    .line 313
    .line 314
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-direct {p0, p1, v0, v2}, Lcom/voxdon/xplorer/file/x;->L1(Lcom/voxdon/xplorer/file/n;ZZ)V

    .line 319
    .line 320
    .line 321
    :cond_140
    :goto_140
    return-void
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

.method public Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_16

    .line 6
    .line 7
    invoke-static {p2}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_16

    .line 14
    :cond_d
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 15
    .line 16
    check-cast p2, Lcom/voxdon/xplorer/file/y;

    .line 17
    .line 18
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/file/y;->c1(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_16
    :goto_16
    invoke-static {}, Lax/u3/b;->f()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-ne p1, p2, :cond_25

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_25
    const/4 p1, 0x0

    .line 39
    return p1
    .line 40
    .line 41
.end method

.method public Q1(Lcom/voxdon/xplorer/file/n;)V
    .registers 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/o3/f;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Lax/Q2/f;->K()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->L()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x1

    .line 34
    invoke-direct/range {v1 .. v12}, Lax/o3/f;-><init>(Ljava/lang/String;Ljava/lang/String;IJZZZZZZ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    const/16 v1, 0x2710

    .line 42
    .line 43
    invoke-direct {p0, v0, p1, v1}, Lcom/voxdon/xplorer/file/x;->P1(Ljava/util/ArrayList;ZI)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method protected T0(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 6

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/high16 v1, 0x43000000    # 128.0f

    .line 10
    .line 11
    mul-float v0, v0, v1

    .line 12
    .line 13
    float-to-int v0, v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_e
    new-instance v2, Ljava/io/File;

    .line 16
    .line 17
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/high16 p1, 0x10000000

    .line 21
    .line 22
    invoke-static {v2, p1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_1c

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1c
    invoke-static {p1, v0, v0}, Lcom/voxdon/xplorer/file/x;->S0(Landroid/os/ParcelFileDescriptor;II)Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_23

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_23
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 37
    .line 38
    const v2, 0x8000

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {p1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 51
    .line 52
    .line 53
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_3d
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_3d} :catch_3e

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :catch_3e
    return-object v1
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

.method public U0(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1b

    .line 12
    .line 13
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/shizuku/c;->x(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :catch_19
    move-exception p1

    .line 27
    goto :goto_35

    .line 28
    :cond_1b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2c

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/high16 v0, 0x30000000

    .line 39
    .line 40
    invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_2c
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/g;->w(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Landroid/os/ParcelFileDescriptor;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_34
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_34} :catch_19

    .line 53
    return-object p1

    .line 54
    :goto_35
    new-instance v0, Lax/b3/j;

    .line 55
    .line 56
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0
    .line 60
    .line 61
.end method

.method public W(Landroid/content/Context;Lax/c3/K;)V
    .registers 6

    .line 1
    invoke-super {p0, p1, p2}, Lcom/voxdon/xplorer/file/m;->W(Landroid/content/Context;Lax/c3/K;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    new-instance v0, Lcom/voxdon/xplorer/file/g;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/voxdon/xplorer/file/g;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/voxdon/xplorer/file/x;->l:Lcom/voxdon/xplorer/file/g;

    .line 16
    .line 17
    :cond_10
    sget-object p1, Lax/c3/K;->e:Lax/c3/K;

    .line 18
    .line 19
    if-eq p2, p1, :cond_1e

    .line 20
    .line 21
    invoke-virtual {p2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_70

    .line 30
    .line 31
    :cond_1e
    new-instance p1, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 37
    .line 38
    sget-object p1, Lcom/voxdon/xplorer/file/x;->v:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_2b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_47

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 57
    .line 58
    sget-object v2, Lax/c3/K;->e:Lax/c3/K;

    .line 59
    .line 60
    invoke-virtual {v2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2, v0}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_2b

    .line 72
    :cond_47
    new-instance p1, Ljava/util/HashSet;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/voxdon/xplorer/file/x;->o:Ljava/util/HashSet;

    .line 78
    .line 79
    sget-object p1, Lcom/voxdon/xplorer/file/x;->x:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_54
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_70

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, p0, Lcom/voxdon/xplorer/file/x;->o:Ljava/util/HashSet;

    .line 98
    .line 99
    sget-object v2, Lax/c3/K;->e:Lax/c3/K;

    .line 100
    .line 101
    invoke-virtual {v2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2, v0}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_54

    .line 113
    :cond_70
    sget-object p1, Lax/c3/K;->f:Lax/c3/K;

    .line 114
    .line 115
    if-eq p2, p1, :cond_7e

    .line 116
    .line 117
    invoke-virtual {p2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {p2}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_bf

    .line 126
    .line 127
    :cond_7e
    iget-object p2, p0, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 128
    .line 129
    if-nez p2, :cond_89

    .line 130
    .line 131
    new-instance p2, Ljava/util/HashSet;

    .line 132
    .line 133
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p2, p0, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 137
    .line 138
    :cond_89
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p2}, Lax/Z2/j;->t0()Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_bf

    .line 147
    .line 148
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-nez p1, :cond_bf

    .line 157
    .line 158
    sget-object p1, Lcom/voxdon/xplorer/file/x;->w:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_a3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_bf

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    check-cast p2, Ljava/lang/String;

    .line 175
    .line 176
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->n:Ljava/util/HashSet;

    .line 177
    .line 178
    sget-object v1, Lax/c3/K;->f:Lax/c3/K;

    .line 179
    .line 180
    invoke-virtual {v1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v1, p2}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_a3

    .line 192
    :cond_bf
    return-void
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

.method public Y()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public a()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .registers 1

    .line 1
    return-void
.end method

.method public c(Ljava/lang/String;Z)Ljava/io/OutputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1b

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1b

    .line 18
    .line 19
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1, p2}, Lcom/voxdon/xplorer/shizuku/c;->v(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1b
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2d

    .line 33
    .line 34
    :try_start_21
    invoke-static {p0, v0, p2}, Lcom/voxdon/xplorer/file/g;->u(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Ljava/io/OutputStream;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_25
    .catch Lax/b3/j; {:try_start_21 .. :try_end_25} :catch_26

    .line 38
    return-object p1

    .line 39
    :catch_26
    move-exception p1

    .line 40
    new-instance p2, Ljava/io/IOException;

    .line 41
    .line 42
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    throw p2

    .line 46
    :cond_2d
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->u0()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_59

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/x;->p1(Lcom/voxdon/xplorer/file/n;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_59

    .line 57
    .line 58
    :try_start_39
    new-instance p1, Lcom/voxdon/xplorer/file/x$c;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    xor-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    invoke-direct {p1, p0, v0, p2, v1}, Lcom/voxdon/xplorer/file/x$c;-><init>(Lcom/voxdon/xplorer/file/x;Lcom/voxdon/xplorer/file/y;ZZ)V
    :try_end_44
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_44} :catch_45

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :catch_45
    nop

    .line 71
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v0, p2}, Lcom/voxdon/xplorer/file/z;->D(Lcom/voxdon/xplorer/file/n;Z)Ljava/io/FileOutputStream;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_51

    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_51
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 83
    .line 84
    const-string p2, "failed to open outputstream using root"

    .line 85
    .line 86
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_59
    new-instance p1, Lcom/voxdon/xplorer/file/x$c;

    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    xor-int/lit8 v1, v1, 0x1

    .line 97
    .line 98
    invoke-direct {p1, p0, v0, p2, v1}, Lcom/voxdon/xplorer/file/x$c;-><init>(Lcom/voxdon/xplorer/file/x;Lcom/voxdon/xplorer/file/y;ZZ)V

    .line 99
    .line 100
    .line 101
    return-object p1
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

.method protected c1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    .line 1
    :try_start_0
    const-string p1, "image"

    .line 2
    .line 3
    invoke-virtual {p3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_26

    .line 8
    .line 9
    iget-object p1, p0, Lcom/voxdon/xplorer/file/x;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    if-eqz p1, :cond_26

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p3, 0x1

    .line 24
    if-ne p1, p3, :cond_26

    .line 25
    .line 26
    new-instance p1, Lax/y0/a;

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lax/y0/a;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p2, "Orientation"

    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    invoke-virtual {p1, p2, p3}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result p1
    :try_end_25
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_25} :catch_26
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_25} :catch_26

    .line 38
    return p1

    .line 39
    :catch_26
    :cond_26
    const/4 p1, -0x1

    .line 40
    return p1
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

.method public d(Lcom/voxdon/xplorer/file/n;J)Z
    .registers 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    cmp-long v3, p2, v0

    .line 5
    .line 6
    if-gez v3, :cond_8

    .line 7
    .line 8
    return v2

    .line 9
    :cond_8
    instance-of v0, p1, Lcom/voxdon/xplorer/file/y;

    .line 10
    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    return v2

    .line 14
    :cond_d
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_27

    .line 21
    .line 22
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1, p2, p3}, Lcom/voxdon/xplorer/shizuku/c;->I(Ljava/lang/String;J)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_26

    .line 35
    .line 36
    invoke-virtual {p1, p2, p3}, Lcom/voxdon/xplorer/file/y;->m1(J)V

    .line 37
    .line 38
    .line 39
    :cond_26
    return v0

    .line 40
    :cond_27
    :try_start_27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p2, p3}, Ljava/io/File;->setLastModified(J)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_37

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->r0()V
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_34} :catch_35

    .line 51
    .line 52
    .line 53
    return p2

    .line 54
    :catch_35
    move-exception p2

    .line 55
    goto :goto_38

    .line 56
    :cond_37
    return p2

    .line 57
    :goto_38
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    const-string v0, "set last modified"

    .line 66
    .line 67
    invoke-virtual {p3, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-virtual {p3, p2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    new-instance p3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v0, "base:"

    .line 81
    .line 82
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lax/c3/K;->k()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 105
    .line 106
    .line 107
    return v2
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

.method protected d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 6

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 p2, 0x0

    .line 9
    :goto_8
    invoke-static {p2}, Lax/c3/A;->g(Ljava/lang/String;)Lax/c3/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lax/c3/z;->c0:Lax/c3/z;

    .line 14
    .line 15
    if-eq v1, v0, :cond_a2

    .line 16
    .line 17
    const-string v1, "audio"

    .line 18
    .line 19
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1a

    .line 24
    .line 25
    goto/16 :goto_a2

    .line 26
    .line 27
    :cond_1a
    sget-object v1, Lax/c3/z;->e0:Lax/c3/z;

    .line 28
    .line 29
    if-eq v1, v0, :cond_9d

    .line 30
    .line 31
    const-string v1, "video"

    .line 32
    .line 33
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_28

    .line 38
    .line 39
    goto/16 :goto_9d

    .line 40
    .line 41
    :cond_28
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 42
    .line 43
    if-eq v1, v0, :cond_76

    .line 44
    .line 45
    const-string v1, "image"

    .line 46
    .line 47
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_35

    .line 52
    .line 53
    goto :goto_76

    .line 54
    :cond_35
    sget-object v1, Lax/c3/z;->s0:Lax/c3/z;

    .line 55
    .line 56
    if-eq v1, v0, :cond_6d

    .line 57
    .line 58
    const-string v1, "application/vnd.android.package-archive"

    .line 59
    .line 60
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-eqz p3, :cond_42

    .line 65
    .line 66
    goto :goto_6d

    .line 67
    :cond_42
    sget-object p3, Lax/c3/z;->n0:Lax/c3/z;

    .line 68
    .line 69
    if-ne p3, v0, :cond_51

    .line 70
    .line 71
    invoke-static {}, Lax/X2/Q;->r1()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_51

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->T0(Ljava/lang/String;)Ljava/io/InputStream;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    goto :goto_a6

    .line 82
    :cond_51
    const-string p3, "epub"

    .line 83
    .line 84
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_68

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {p2, p1}, Lax/r3/c;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-nez p1, :cond_a6

    .line 99
    .line 100
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_a6

    .line 105
    :cond_68
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->e1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_a6

    .line 110
    :cond_6d
    :goto_6d
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2, p1}, Lax/U2/d;->r(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    goto :goto_a6

    .line 119
    :cond_76
    :goto_76
    invoke-static {p2}, Lax/c3/A;->S(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_98

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p2}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    const/high16 p3, 0x43000000    # 128.0f

    .line 134
    .line 135
    mul-float p2, p2, p3

    .line 136
    .line 137
    float-to-int p2, p2

    .line 138
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->N0(Ljava/lang/String;)Ljava/io/InputStream;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p1, p2}, Lax/r3/c;->e(Ljava/io/InputStream;I)Ljava/io/InputStream;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-nez p1, :cond_a6

    .line 147
    .line 148
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    goto :goto_a6

    .line 153
    :cond_98
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->N0(Ljava/lang/String;)Ljava/io/InputStream;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    goto :goto_a6

    .line 158
    :cond_9d
    :goto_9d
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/x;->f1(Ljava/lang/String;)Ljava/io/InputStream;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    goto :goto_a6

    .line 163
    :cond_a2
    :goto_a2
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->K0(Ljava/lang/String;)Ljava/io/InputStream;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    :cond_a6
    :goto_a6
    if-nez p1, :cond_ac

    .line 168
    .line 169
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :cond_ac
    return-object p1
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

.method public g1()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/x;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/x;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_d

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v1, 0x0

    .line 15
    :goto_e
    monitor-exit v0

    .line 16
    return v1

    .line 17
    :catchall_10
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_3 .. :try_end_12} :catchall_10

    .line 19
    throw v1
    .line 20
    .line 21
.end method

.method public l0(Ljava/lang/String;J)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1f

    .line 12
    .line 13
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 14
    .line 15
    const-string v1, "rw"

    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :try_start_13
    invoke-virtual {v0, p2, p3}, Ljava/io/RandomAccessFile;->setLength(J)V
    :try_end_16
    .catchall {:try_start_13 .. :try_end_16} :catchall_1a

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_1a
    move-exception p1

    .line 28
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1f
    :try_start_1f
    invoke-static {p0, v0, p2, p3}, Lcom/voxdon/xplorer/file/g;->P(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;J)V
    :try_end_22
    .catch Lax/b3/j; {:try_start_1f .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_23
    move-exception p1

    .line 37
    new-instance p2, Ljava/io/IOException;

    .line 38
    .line 39
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p2
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
.end method

.method m(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 7

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/voxdon/xplorer/file/x;->N1(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V

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

.method public q()J
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/x$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

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
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_6e

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "freespace not reachable : "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lcom/voxdon/xplorer/file/x;->r:Ljava/util/logging/Logger;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "INVALID GETFREESPACE CALL FOR LOCATOIN : "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lax/b3/j;

    .line 73
    .line 74
    invoke-direct {v0}, Lax/b3/j;-><init>()V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :pswitch_4d
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_6a

    .line 87
    .line 88
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->Y0()Lax/c3/k0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_6a

    .line 93
    .line 94
    iget-wide v3, v0, Lax/c3/k0;->b:J

    .line 95
    .line 96
    cmp-long v5, v3, v1

    .line 97
    .line 98
    if-eqz v5, :cond_6a

    .line 99
    .line 100
    iget-wide v3, v0, Lax/c3/k0;->d:J

    .line 101
    .line 102
    cmp-long v0, v3, v1

    .line 103
    .line 104
    if-ltz v0, :cond_6a

    .line 105
    .line 106
    return-wide v3

    .line 107
    :cond_6a
    const-wide/16 v0, -0x1

    .line 108
    .line 109
    return-wide v0

    .line 110
    :pswitch_6d
    return-wide v1

    .line 111
    :pswitch_data_6e
    .packed-switch 0x1
        :pswitch_6d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
        :pswitch_4d
    .end packed-switch
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

.method public q1(Lcom/voxdon/xplorer/file/n;ZJJ)Ljava/util/List;
    .registers 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "ZJJ)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/A;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p5

    .line 4
    .line 5
    const-string v3, "_size"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    :try_start_7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v7, "_data LIKE \'"

    .line 18
    .line 19
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v7, "/"

    .line 30
    .line 31
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v7, "%\'"

    .line 35
    .line 36
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    cmp-long v9, v1, v7

    .line 46
    .line 47
    if-lez v9, :cond_59

    .line 48
    .line 49
    new-instance v10, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v6, " AND ("

    .line 58
    .line 59
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v6, " > "

    .line 66
    .line 67
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v6, " OR "

    .line 74
    .line 75
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v3, " IS NULL)"

    .line 82
    .line 83
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    :cond_59
    move-object v13, v6

    .line 91
    goto :goto_5f

    .line 92
    :catch_5b
    move-object/from16 v16, v4

    .line 93
    .line 94
    goto/16 :goto_122

    .line 95
    .line 96
    :goto_5f
    const-string v3, "external"

    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-static {v3}, Lax/c3/n0;->c(Ljava/lang/String;)Landroid/net/Uri;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    sget-object v12, Lcom/voxdon/xplorer/file/x;->y:[Ljava/lang/String;

    .line 107
    .line 108
    const-string v15, "_data asc"

    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    invoke-virtual/range {v10 .. v15}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-nez v3, :cond_75

    .line 116
    .line 117
    return-object v4

    .line 118
    :cond_75
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-gtz v5, :cond_7f

    .line 123
    .line 124
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 125
    .line 126
    .line 127
    return-object v4

    .line 128
    :cond_7f
    new-instance v5, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    move-object/from16 v6, p1

    .line 134
    .line 135
    check-cast v6, Lcom/voxdon/xplorer/file/y;

    .line 136
    .line 137
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    new-instance v10, Lax/X2/L;

    .line 142
    .line 143
    invoke-direct {v10}, Lax/X2/L;-><init>()V

    .line 144
    .line 145
    .line 146
    const-wide/16 v11, 0x3e8

    .line 147
    .line 148
    div-long v11, p3, v11
    :try_end_95
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_95} :catch_5b

    .line 149
    .line 150
    move-object v13, v4

    .line 151
    move-object/from16 v16, v13

    .line 152
    .line 153
    move-wide v14, v7

    .line 154
    :goto_99
    :try_start_99
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 155
    .line 156
    .line 157
    move-result v17

    .line 158
    if-eqz v17, :cond_11e

    .line 159
    .line 160
    cmp-long v17, v11, v7

    .line 161
    .line 162
    if-lez v17, :cond_b3

    .line 163
    .line 164
    move-wide/from16 v17, v7

    .line 165
    .line 166
    const/4 v7, 0x2

    .line 167
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 168
    .line 169
    .line 170
    move-result-wide v7

    .line 171
    cmp-long v19, v7, v17

    .line 172
    .line 173
    if-eqz v19, :cond_b5

    .line 174
    .line 175
    cmp-long v19, v7, v11

    .line 176
    .line 177
    if-gez v19, :cond_b5

    .line 178
    .line 179
    goto :goto_d1

    .line 180
    :cond_b3
    move-wide/from16 v17, v7

    .line 181
    .line 182
    :cond_b5
    invoke-direct {v0, v6, v3, v10}, Lcom/voxdon/xplorer/file/x;->B0(Lax/c3/K;Landroid/database/Cursor;Lax/X2/L;)Lcom/voxdon/xplorer/file/A;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    iget-wide v1, v7, Lcom/voxdon/xplorer/file/A;->e:J

    .line 187
    .line 188
    iget-object v8, v7, Lcom/voxdon/xplorer/file/A;->a:Ljava/lang/String;

    .line 189
    .line 190
    if-eqz v13, :cond_d6

    .line 191
    .line 192
    move-wide/from16 v20, v1

    .line 193
    .line 194
    iget-object v1, v13, Lcom/voxdon/xplorer/file/A;->a:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_d8

    .line 201
    .line 202
    cmp-long v1, v20, v14

    .line 203
    .line 204
    if-lez v1, :cond_d1

    .line 205
    .line 206
    invoke-interface {v5, v13}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_d8

    .line 210
    :cond_d1
    :goto_d1
    move-wide/from16 v1, p5

    .line 211
    .line 212
    move-wide/from16 v7, v17

    .line 213
    .line 214
    goto :goto_99

    .line 215
    :cond_d6
    move-wide/from16 v20, v1

    .line 216
    .line 217
    :cond_d8
    :goto_d8
    const/4 v1, 0x1

    .line 218
    if-eqz v4, :cond_e3

    .line 219
    .line 220
    invoke-static {v4, v8}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_e3

    .line 225
    .line 226
    const/4 v2, 0x1

    .line 227
    goto :goto_f4

    .line 228
    :cond_e3
    iget-object v2, v0, Lcom/voxdon/xplorer/file/x;->o:Ljava/util/HashSet;

    .line 229
    .line 230
    const/4 v4, 0x0

    .line 231
    if-eqz v2, :cond_f1

    .line 232
    .line 233
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_f1

    .line 238
    .line 239
    move-object v4, v8

    .line 240
    :goto_ef
    const/4 v2, 0x0

    .line 241
    goto :goto_f4

    .line 242
    :cond_f1
    move-object/from16 v4, v16

    .line 243
    .line 244
    goto :goto_ef

    .line 245
    :goto_f4
    cmp-long v8, p3, v17

    .line 246
    .line 247
    if-lez v8, :cond_ff

    .line 248
    .line 249
    iget-wide v13, v7, Lcom/voxdon/xplorer/file/A;->c:J

    .line 250
    .line 251
    cmp-long v8, v13, p3

    .line 252
    .line 253
    if-gez v8, :cond_ff

    .line 254
    .line 255
    const/4 v2, 0x1

    .line 256
    :cond_ff
    if-lez v9, :cond_108

    .line 257
    .line 258
    iget-wide v13, v7, Lcom/voxdon/xplorer/file/A;->d:J

    .line 259
    .line 260
    cmp-long v8, v13, p5

    .line 261
    .line 262
    if-gez v8, :cond_108

    .line 263
    .line 264
    const/4 v2, 0x1

    .line 265
    :cond_108
    if-nez p2, :cond_10f

    .line 266
    .line 267
    iget-boolean v8, v7, Lcom/voxdon/xplorer/file/A;->b:Z

    .line 268
    .line 269
    if-eqz v8, :cond_10f

    .line 270
    .line 271
    goto :goto_110

    .line 272
    :cond_10f
    move v1, v2

    .line 273
    :goto_110
    if-nez v1, :cond_115

    .line 274
    .line 275
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    :cond_115
    move-wide/from16 v1, p5

    .line 279
    .line 280
    move-object v13, v7

    .line 281
    move-wide/from16 v7, v17

    .line 282
    .line 283
    move-wide/from16 v14, v20

    .line 284
    .line 285
    goto/16 :goto_99

    .line 286
    .line 287
    :cond_11e
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_121
    .catch Ljava/lang/Exception; {:try_start_99 .. :try_end_121} :catch_122

    .line 288
    .line 289
    .line 290
    return-object v5

    .line 291
    :catch_122
    :goto_122
    return-object v16
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
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
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method public s0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 8

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ".hidden"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :try_start_13
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-virtual {p0, v0, v5}, Lcom/voxdon/xplorer/file/x;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {v4, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_1d} :catch_37
    .catchall {:try_start_13 .. :try_end_1d} :catchall_35

    .line 28
    .line 29
    .line 30
    if-eqz v2, :cond_2a

    .line 31
    .line 32
    :try_start_1f
    const-string v0, "\n"

    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2a

    .line 38
    :catchall_25
    move-exception p1

    .line 39
    move-object v3, v4

    .line 40
    goto :goto_5d

    .line 41
    :catch_28
    move-object v3, v4

    .line 42
    goto :goto_37

    .line 43
    :cond_2a
    :goto_2a
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v4, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_31
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_31} :catch_28
    .catchall {:try_start_1f .. :try_end_31} :catchall_25

    .line 48
    .line 49
    .line 50
    :try_start_31
    invoke-virtual {v4}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_34
    .catch Ljava/io/IOException; {:try_start_31 .. :try_end_34} :catch_34

    .line 51
    .line 52
    .line 53
    :catch_34
    return v5

    .line 54
    :catchall_35
    move-exception p1

    .line 55
    goto :goto_5d

    .line 56
    :catch_37
    :goto_37
    :try_start_37
    invoke-interface {v1}, Lax/c3/b;->isDirectory()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_56

    .line 61
    .line 62
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v0, ".hidden foder exists"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_56
    .catchall {:try_start_37 .. :try_end_56} :catchall_35

    .line 85
    .line 86
    .line 87
    :cond_56
    if-eqz v3, :cond_5b

    .line 88
    .line 89
    :try_start_58
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_5b
    .catch Ljava/io/IOException; {:try_start_58 .. :try_end_5b} :catch_5b

    .line 90
    .line 91
    .line 92
    :catch_5b
    :cond_5b
    const/4 p1, 0x0

    .line 93
    return p1

    .line 94
    :goto_5d
    if-eqz v3, :cond_62

    .line 95
    .line 96
    :try_start_5f
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_62
    .catch Ljava/io/IOException; {:try_start_5f .. :try_end_62} :catch_62

    .line 97
    .line 98
    .line 99
    :catch_62
    :cond_62
    throw p1
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

.method u1(Ljava/util/List;Lax/c3/K;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lax/c3/K;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/x;->t:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_6
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_28

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    const-string v3, "/"

    .line 22
    .line 23
    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    new-instance v1, Lcom/voxdon/xplorer/file/y;

    .line 33
    .line 34
    invoke-direct {v1, p0, v2, p2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_6

    .line 41
    :cond_28
    return-void
.end method

.method public x0(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;Lax/u3/c;Lax/g3/i;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_70

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_42

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "com.voxdon.xplorer"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3f

    .line 24
    .line 25
    const-string v0, "/Android/data/com.voxdon.xplorer"

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3f

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lax/Q2/e;->q(Landroid/content/Context;)Ljava/io/File;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Lcom/voxdon/xplorer/file/y;

    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_42

    .line 59
    .line 60
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->M(Lcom/voxdon/xplorer/file/n;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_42

    .line 64
    :cond_3f
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/x;->M(Lcom/voxdon/xplorer/file/n;)Z

    .line 65
    .line 66
    .line 67
    :cond_42
    :goto_42
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_4a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6f

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 86
    .line 87
    move-object v1, v0

    .line 88
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v2, v0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 107
    .line 108
    invoke-virtual {p0, v1, v0, p3, p4}, Lcom/voxdon/xplorer/file/x;->x0(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;Lax/u3/c;Lax/g3/i;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4a

    .line 112
    :cond_6f
    return-void

    .line 113
    :cond_70
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 114
    .line 115
    .line 116
    return-void
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

.method public y()Lax/c3/k0;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/x$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

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
    packed-switch v0, :pswitch_data_56

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "not reachable storage space : "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lcom/voxdon/xplorer/file/x;->r:Ljava/util/logging/Logger;

    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v2, "INVALID GETSTORAGESPACE CALL FOR LOCATOIN : "

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lax/b3/j;

    .line 71
    .line 72
    invoke-direct {v0}, Lax/b3/j;-><init>()V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :pswitch_4b
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->Y0()Lax/c3/k0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_50
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;->X0()Lax/c3/k0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_56
    .packed-switch 0x1
        :pswitch_50
        :pswitch_4b
        :pswitch_4b
        :pswitch_4b
        :pswitch_4b
        :pswitch_4b
        :pswitch_4b
        :pswitch_4b
        :pswitch_4b
        :pswitch_50
        :pswitch_50
    .end packed-switch
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

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 5

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/y;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, p0, v1, v2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1e

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1e

    .line 23
    .line 24
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/x;->M0(Lcom/voxdon/xplorer/file/y;Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1e

    .line 29
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

.method public z0(Ljava/io/File;Lax/c3/K;Z)Lcom/voxdon/xplorer/file/y;
    .registers 5

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/y;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
