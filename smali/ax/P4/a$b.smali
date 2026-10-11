.class Lax/P4/a$b;
.super Lax/c5/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/c5/b<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "[",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final l0:Landroid/content/Context;

.field private final m0:Ljava/lang/String;

.field private final n0:Lax/P4/a$a;

.field private o0:Z

.field final synthetic p0:Lax/P4/a;


# direct methods
.method constructor <init>(Lax/P4/a;Landroid/content/Context;Ljava/lang/String;Lax/P4/a$a;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/c5/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/P4/a$b;->l0:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lax/P4/a$b;->n0:Lax/P4/a$a;

    .line 11
    .line 12
    return-void
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

.method private s()[Landroid/graphics/Bitmap;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 2
    .line 3
    invoke-static {v0}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_7
    iget-object v1, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 9
    .line 10
    invoke-static {v1}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_4b

    .line 25
    .line 26
    iget-object v1, p0, Lax/P4/a$b;->l0:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget v2, Lax/P4/h;->b:I

    .line 33
    .line 34
    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lax/P4/a$b;->l0:Landroid/content/Context;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget v3, Lax/P4/h;->a:I

    .line 45
    .line 46
    invoke-static {v2, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x3

    .line 51
    new-array v3, v3, [Landroid/graphics/Bitmap;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object v1, v3, v4

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    aput-object v2, v3, v1

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    aput-object v2, v3, v1

    .line 61
    .line 62
    iget-object v1, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 63
    .line 64
    iget-object v2, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v1, v2}, Lax/P4/a;->c(Lax/P4/a;Landroid/util/Pair;)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    goto :goto_4c

    .line 74
    :catchall_49
    move-exception v1

    .line 75
    goto :goto_4e

    .line 76
    :cond_4b
    const/4 v3, 0x0

    .line 77
    :goto_4c
    monitor-exit v0

    .line 78
    return-object v3

    .line 79
    :goto_4e
    monitor-exit v0
    :try_end_4f
    .catchall {:try_start_7 .. :try_end_4f} :catchall_49

    .line 80
    throw v1
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


# virtual methods
.method protected bridge synthetic f([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/P4/a$b;->r([Ljava/lang/Void;)[Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic m(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, [Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/P4/a$b;->t([Landroid/graphics/Bitmap;)V

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

.method protected r([Ljava/lang/Void;)[Landroid/graphics/Bitmap;
    .registers 11

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    iget-object v1, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 4
    .line 5
    invoke-static {v1}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    monitor-enter v1

    .line 10
    :try_start_9
    iget-object v2, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 11
    .line 12
    invoke-static {v2}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v2, :cond_23

    .line 28
    .line 29
    iput-boolean v0, p0, Lax/P4/a$b;->o0:Z

    .line 30
    .line 31
    monitor-exit v1

    .line 32
    return-object v3

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto/16 :goto_12a

    .line 35
    .line 36
    :cond_23
    iget-object v2, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 37
    .line 38
    invoke-static {v2}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v2, :cond_39

    .line 45
    .line 46
    iget-object p1, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 47
    .line 48
    invoke-static {p1}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, [Landroid/graphics/Bitmap;

    .line 55
    .line 56
    monitor-exit v1

    .line 57
    return-object p1

    .line 58
    :cond_39
    monitor-exit v1
    :try_end_3a
    .catchall {:try_start_9 .. :try_end_3a} :catchall_20

    .line 59
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 60
    .line 61
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 62
    .line 63
    .line 64
    :try_start_3f
    iget-object v2, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v2}, Lax/Q4/b;->l(Landroid/net/Uri;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_54

    .line 75
    .line 76
    iget-object v4, p0, Lax/P4/a$b;->l0:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v1, v4, v2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    goto :goto_5e

    .line 82
    :catchall_51
    move-exception p1

    .line 83
    goto/16 :goto_126

    .line 84
    .line 85
    :cond_54
    iget-object v2, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 86
    .line 87
    new-instance v4, Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2, v4}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;Ljava/util/Map;)V

    .line 93
    .line 94
    .line 95
    :goto_5e
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_118

    .line 100
    .line 101
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    .line 102
    .line 103
    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 107
    .line 108
    array-length v5, v2

    .line 109
    invoke-static {v2, p1, v5, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 110
    .line 111
    .line 112
    iput-boolean p1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 113
    .line 114
    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 115
    .line 116
    iget v6, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 117
    .line 118
    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 119
    .line 120
    invoke-static {}, Lax/P4/a;->d()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-static {v5, v6, v7, v8}, Lax/P4/a;->k(IILandroid/graphics/Bitmap$Config;I)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    iput v5, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 129
    .line 130
    iput-object v7, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 131
    .line 132
    array-length v5, v2

    .line 133
    invoke-static {v2, p1, v5, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-nez v2, :cond_92

    .line 138
    .line 139
    invoke-direct {p0}, Lax/P4/a$b;->s()[Landroid/graphics/Bitmap;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_8e
    .catch Ljava/lang/Exception; {:try_start_3f .. :try_end_8e} :catch_120
    .catchall {:try_start_3f .. :try_end_8e} :catchall_51

    .line 143
    :try_start_8e
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_91
    .catch Ljava/lang/Exception; {:try_start_8e .. :try_end_91} :catch_91
    .catch Ljava/lang/AssertionError; {:try_start_8e .. :try_end_91} :catch_91

    .line 144
    .line 145
    .line 146
    :catch_91
    return-object p1

    .line 147
    :cond_92
    :try_start_92
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    if-nez v4, :cond_a2

    .line 152
    .line 153
    invoke-virtual {v2, v7, p1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-eqz v4, :cond_a2

    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 160
    .line 161
    .line 162
    move-object v2, v4

    .line 163
    :cond_a2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-lez v4, :cond_110

    .line 168
    .line 169
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-gtz v4, :cond_af

    .line 174
    .line 175
    goto :goto_110

    .line 176
    :cond_af
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    const/16 v5, 0xc0

    .line 181
    .line 182
    if-le v4, v5, :cond_c3

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-gt v4, v5, :cond_be

    .line 189
    .line 190
    goto :goto_c3

    .line 191
    :cond_be
    invoke-static {v2, v5, v5}, Lax/P4/a;->e(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    goto :goto_c4

    .line 196
    :cond_c3
    :goto_c3
    move-object v4, v2

    .line 197
    :goto_c4
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    const/16 v6, 0x180

    .line 202
    .line 203
    if-le v5, v6, :cond_d8

    .line 204
    .line 205
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-gt v5, v6, :cond_d3

    .line 210
    .line 211
    goto :goto_d8

    .line 212
    :cond_d3
    invoke-static {v2, v6, v6}, Lax/P4/a;->e(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    goto :goto_d9

    .line 217
    :cond_d8
    :goto_d8
    move-object v5, v2

    .line 218
    :goto_d9
    iget-object v6, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 219
    .line 220
    invoke-static {v6}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    monitor-enter v6
    :try_end_e0
    .catch Ljava/lang/Exception; {:try_start_92 .. :try_end_e0} :catch_120
    .catchall {:try_start_92 .. :try_end_e0} :catchall_51

    .line 225
    :try_start_e0
    iget-object v7, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 226
    .line 227
    invoke-static {v7}, Lax/P4/a;->b(Lax/P4/a;)Landroid/util/Pair;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v7, Ljava/lang/String;

    .line 234
    .line 235
    iget-object v8, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_10a

    .line 242
    .line 243
    const/4 v3, 0x3

    .line 244
    new-array v3, v3, [Landroid/graphics/Bitmap;

    .line 245
    .line 246
    aput-object v2, v3, p1

    .line 247
    .line 248
    aput-object v4, v3, v0

    .line 249
    .line 250
    const/4 p1, 0x2

    .line 251
    aput-object v5, v3, p1

    .line 252
    .line 253
    iget-object p1, p0, Lax/P4/a$b;->p0:Lax/P4/a;

    .line 254
    .line 255
    iget-object v0, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {p1, v0}, Lax/P4/a;->c(Lax/P4/a;Landroid/util/Pair;)Landroid/util/Pair;

    .line 262
    .line 263
    .line 264
    goto :goto_10c

    .line 265
    :catchall_108
    move-exception p1

    .line 266
    goto :goto_10e

    .line 267
    :cond_10a
    iput-boolean v0, p0, Lax/P4/a$b;->o0:Z

    .line 268
    .line 269
    :goto_10c
    monitor-exit v6

    .line 270
    goto :goto_11c

    .line 271
    :goto_10e
    monitor-exit v6
    :try_end_10f
    .catchall {:try_start_e0 .. :try_end_10f} :catchall_108

    .line 272
    :try_start_10f
    throw p1

    .line 273
    :cond_110
    :goto_110
    invoke-direct {p0}, Lax/P4/a$b;->s()[Landroid/graphics/Bitmap;

    .line 274
    .line 275
    .line 276
    move-result-object p1
    :try_end_114
    .catch Ljava/lang/Exception; {:try_start_10f .. :try_end_114} :catch_120
    .catchall {:try_start_10f .. :try_end_114} :catchall_51

    .line 277
    :try_start_114
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_117
    .catch Ljava/lang/Exception; {:try_start_114 .. :try_end_117} :catch_117
    .catch Ljava/lang/AssertionError; {:try_start_114 .. :try_end_117} :catch_117

    .line 278
    .line 279
    .line 280
    :catch_117
    return-object p1

    .line 281
    :cond_118
    :try_start_118
    invoke-direct {p0}, Lax/P4/a$b;->s()[Landroid/graphics/Bitmap;

    .line 282
    .line 283
    .line 284
    move-result-object v3
    :try_end_11c
    .catch Ljava/lang/Exception; {:try_start_118 .. :try_end_11c} :catch_120
    .catchall {:try_start_118 .. :try_end_11c} :catchall_51

    .line 285
    :goto_11c
    :try_start_11c
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_11f
    .catch Ljava/lang/Exception; {:try_start_11c .. :try_end_11f} :catch_125
    .catch Ljava/lang/AssertionError; {:try_start_11c .. :try_end_11f} :catch_125

    .line 286
    .line 287
    .line 288
    goto :goto_125

    .line 289
    :catch_120
    :try_start_120
    invoke-direct {p0}, Lax/P4/a$b;->s()[Landroid/graphics/Bitmap;

    .line 290
    .line 291
    .line 292
    move-result-object v3
    :try_end_124
    .catchall {:try_start_120 .. :try_end_124} :catchall_51

    .line 293
    goto :goto_11c

    .line 294
    :catch_125
    :goto_125
    return-object v3

    .line 295
    :goto_126
    :try_start_126
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_129
    .catch Ljava/lang/Exception; {:try_start_126 .. :try_end_129} :catch_129
    .catch Ljava/lang/AssertionError; {:try_start_126 .. :try_end_129} :catch_129

    .line 296
    .line 297
    .line 298
    :catch_129
    throw p1

    .line 299
    :goto_12a
    :try_start_12a
    monitor-exit v1
    :try_end_12b
    .catchall {:try_start_12a .. :try_end_12b} :catchall_20

    .line 300
    throw p1
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

.method protected t([Landroid/graphics/Bitmap;)V
    .registers 7

    .line 1
    if-nez p1, :cond_1b

    .line 2
    .line 3
    iget-boolean p1, p0, Lax/P4/a$b;->o0:Z

    .line 4
    .line 5
    if-eqz p1, :cond_c

    .line 6
    .line 7
    iget-object p1, p0, Lax/P4/a$b;->n0:Lax/P4/a$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/P4/a$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-object p1, p0, Lax/P4/a$b;->n0:Lax/P4/a$a;

    .line 14
    .line 15
    iget-object v0, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v2, "got null bitmaps"

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lax/P4/a$a;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/P4/a$b;->n0:Lax/P4/a$a;

    .line 29
    .line 30
    iget-object v1, p0, Lax/P4/a$b;->m0:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    aget-object v2, p1, v2

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    aget-object v3, p1, v3

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    aget-object p1, p1, v4

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2, v3, p1}, Lax/P4/a$a;->c(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 42
    .line 43
    .line 44
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
