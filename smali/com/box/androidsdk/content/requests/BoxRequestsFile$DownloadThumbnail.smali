.class public Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;
.super Lcom/box/androidsdk/content/requests/BoxRequestDownload;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/box/androidsdk/content/requests/BoxRequestDownload<",
        "Lcom/box/androidsdk/content/models/BoxDownload;",
        "Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;",
        ">;"
    }
.end annotation


# static fields
.field public static e0:I = 0x20

.field public static f0:I = 0x40

.field public static g0:I = 0x5e

.field public static h0:I = 0x80

.field public static i0:I = 0xa0

.field public static j0:I = 0x100

.field private static final serialVersionUID:J = 0x70be1f2741234d03L


# instance fields
.field protected mFormat:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V
    .registers 11

    .line 1
    const-class v2, Lcom/box/androidsdk/content/models/BoxDownload;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/box/androidsdk/content/requests/BoxRequestDownload;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/io/OutputStream;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->mFormat:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

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


# virtual methods
.method public I()Ljava/lang/Integer;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "max_height"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1b

    .line 10
    .line 11
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    return-object v0
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

.method public J()Ljava/lang/Integer;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "max_width"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1b

    .line 10
    .line 11
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    return-object v0
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

.method public K()Ljava/lang/Integer;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "min_height"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1b

    .line 10
    .line 11
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    return-object v0
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

.method public L()Ljava/lang/Integer;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "min_width"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1b

    .line 10
    .line 11
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    return-object v0
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

.method protected M()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->mFormat:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->L()Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_14

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->L()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_36

    .line 21
    :cond_14
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->K()Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1f

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->K()Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_36

    .line 32
    :cond_1f
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->J()Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2a

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->J()Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    goto :goto_36

    .line 43
    :cond_2a
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->I()Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_35

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->I()Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_36

    .line 54
    :cond_35
    const/4 v0, 0x0

    .line 55
    :goto_36
    if-nez v0, :cond_3f

    .line 56
    .line 57
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->q:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_3f
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sget v1, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->e0:I

    .line 69
    .line 70
    if-gt v0, v1, :cond_4e

    .line 71
    .line 72
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->c0:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :cond_4e
    sget v1, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->f0:I

    .line 80
    .line 81
    if-gt v0, v1, :cond_59

    .line 82
    .line 83
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->c0:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0

    .line 90
    :cond_59
    sget v1, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->g0:I

    .line 91
    .line 92
    if-gt v0, v1, :cond_64

    .line 93
    .line 94
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->q:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    :cond_64
    sget v1, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->h0:I

    .line 102
    .line 103
    if-gt v0, v1, :cond_6f

    .line 104
    .line 105
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->c0:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :cond_6f
    sget v1, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->i0:I

    .line 113
    .line 114
    if-gt v0, v1, :cond_7a

    .line 115
    .line 116
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->q:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_7a
    sget v1, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->j0:I

    .line 124
    .line 125
    if-gt v0, v1, :cond_85

    .line 126
    .line 127
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->c0:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :cond_85
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->q:Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;

    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail$Format;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0
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

.method public N(I)Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "min_height"

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
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
.end method

.method public O(I)Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->P(I)Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->N(I)Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;

    .line 5
    .line 6
    .line 7
    return-object p0
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

.method public P(I)Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "min_width"

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
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
.end method

.method protected d()Ljava/net/URL;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/requests/BoxRequest;->j(Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestUrlString:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestsFile$DownloadThumbnail;->M()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/4 v4, 0x2

    .line 16
    new-array v5, v4, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    aput-object v2, v5, v6

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    aput-object v3, v5, v2

    .line 23
    .line 24
    const-string v3, "%s%s"

    .line 25
    .line 26
    invoke-static {v1, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_29

    .line 35
    .line 36
    new-instance v0, Ljava/net/URL;

    .line 37
    .line 38
    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_29
    new-instance v5, Ljava/net/URL;

    .line 43
    .line 44
    const-string v7, "%s?%s"

    .line 45
    .line 46
    new-array v4, v4, [Ljava/lang/Object;

    .line 47
    .line 48
    aput-object v3, v4, v6

    .line 49
    .line 50
    aput-object v0, v4, v2

    .line 51
    .line 52
    invoke-static {v1, v7, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v5, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v5
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
