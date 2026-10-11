.class public Lax/c3/T;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Lcom/microsoft/graph/extensions/DriveItem;

.field private l0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Lcom/microsoft/graph/extensions/DriveItem;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 2
    iput-object p2, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 3
    iput-object p3, p0, Lax/c3/T;->l0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper;Ljava/lang/String;)V
    .registers 3

    .line 4
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 6
    iput-object p2, p0, Lax/c3/T;->l0:Ljava/lang/String;

    return-void
.end method

.method private h0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_45

    .line 5
    .line 6
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->P:Lcom/microsoft/graph/extensions/ThumbnailSetCollectionPage;

    .line 7
    .line 8
    if-eqz v0, :cond_45

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/microsoft/graph/http/BaseCollectionPage;->b()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_45

    .line 15
    .line 16
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->P:Lcom/microsoft/graph/extensions/ThumbnailSetCollectionPage;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/microsoft/graph/http/BaseCollectionPage;->b()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_45

    .line 29
    .line 30
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->P:Lcom/microsoft/graph/extensions/ThumbnailSetCollectionPage;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/microsoft/graph/http/BaseCollectionPage;->b()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/microsoft/graph/extensions/ThumbnailSet;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseThumbnailSet;->h:Lcom/microsoft/graph/extensions/Thumbnail;

    .line 45
    .line 46
    if-eqz v0, :cond_45

    .line 47
    .line 48
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->P:Lcom/microsoft/graph/extensions/ThumbnailSetCollectionPage;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/microsoft/graph/http/BaseCollectionPage;->b()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/microsoft/graph/extensions/ThumbnailSet;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseThumbnailSet;->h:Lcom/microsoft/graph/extensions/Thumbnail;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseThumbnail;->e:Ljava/lang/String;

    .line 65
    .line 66
    if-eqz v0, :cond_45

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    return v0

    .line 70
    :cond_45
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
.method public C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseBaseItem;->l:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/c3/T;->l0:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->l0:Ljava/lang/String;

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

.method public U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->l0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/c3/T;->e0(Lcom/voxdon/xplorer/file/n;)I

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

.method public d()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public e0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 4
    .line 5
    check-cast p1, Lax/c3/T;

    .line 6
    .line 7
    iget-object p1, p1, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_e
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_e} :catch_f

    .line 15
    return p1

    .line 16
    :catch_f
    const/4 p1, -0x1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public f0()Lcom/microsoft/graph/extensions/DriveItem;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

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

.method public g0()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/c3/T;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->P:Lcom/microsoft/graph/extensions/ThumbnailSetCollectionPage;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/microsoft/graph/http/BaseCollectionPage;->b()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/microsoft/graph/extensions/ThumbnailSet;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseThumbnailSet;->h:Lcom/microsoft/graph/extensions/Thumbnail;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseThumbnail;->e:Ljava/lang/String;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1a
    const/4 v0, 0x0

    .line 28
    return-object v0
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

.method public h()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public hashCode()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/T;->l0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public isDirectory()Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v2, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->x:Lcom/microsoft/graph/extensions/Folder;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v2, :cond_23

    .line 11
    .line 12
    iget-object v2, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->J:Lcom/microsoft/graph/extensions/SpecialFolder;

    .line 13
    .line 14
    if-eqz v2, :cond_10

    .line 15
    .line 16
    goto :goto_23

    .line 17
    :cond_10
    iget-object v2, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->v:Lcom/microsoft/graph/extensions/File;

    .line 18
    .line 19
    if-eqz v2, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 23
    .line 24
    if-eqz v0, :cond_22

    .line 25
    .line 26
    iget-object v2, v0, Lcom/microsoft/graph/generated/BaseRemoteItem;->g:Lcom/microsoft/graph/extensions/Folder;

    .line 27
    .line 28
    if-nez v2, :cond_21

    .line 29
    .line 30
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseRemoteItem;->q:Lcom/microsoft/graph/extensions/SpecialFolder;

    .line 31
    .line 32
    if-eqz v0, :cond_22

    .line 33
    .line 34
    :cond_21
    return v3

    .line 35
    :cond_22
    return v1

    .line 36
    :cond_23
    :goto_23
    return v3
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

.method public j()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public l()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 4
    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public n()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->u:Lcom/microsoft/graph/extensions/Deleted;

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public p()J
    .registers 7

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_7
    iget-object v3, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->I:Ljava/lang/Long;

    .line 9
    .line 10
    if-nez v3, :cond_6e

    .line 11
    .line 12
    iget-object v3, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 13
    .line 14
    if-eqz v3, :cond_18

    .line 15
    .line 16
    iget-object v3, v3, Lcom/microsoft/graph/generated/BaseRemoteItem;->p:Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz v3, :cond_18

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0

    .line 25
    :cond_18
    invoke-virtual {v0}, Lcom/microsoft/graph/generated/BaseDriveItem;->e()Lax/r8/l;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_29

    .line 30
    .line 31
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/microsoft/graph/generated/BaseDriveItem;->e()Lax/r8/l;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lax/r8/i;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_2b

    .line 42
    :cond_29
    const-string v0, ""

    .line 43
    .line 44
    :goto_2b
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "OneDriveFileInfo size == null"

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v5, "DIR:"

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lax/c3/T;->isDirectory()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v5, ":EXIST:"

    .line 80
    .line 81
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lax/c3/T;->n()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v5, ":RAW:"

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v3, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 108
    .line 109
    .line 110
    return-wide v1

    .line 111
    :cond_6e
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    return-wide v0
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

.method public q()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    if-eqz v0, :cond_15

    .line 4
    .line 5
    iget-object v1, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->w:Lcom/microsoft/graph/extensions/FileSystemInfo;

    .line 6
    .line 7
    if-eqz v1, :cond_15

    .line 8
    .line 9
    iget-object v1, v1, Lcom/microsoft/graph/generated/BaseFileSystemInfo;->e:Ljava/util/Calendar;

    .line 10
    .line 11
    if-eqz v1, :cond_15

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0

    .line 22
    :cond_15
    if-eqz v0, :cond_24

    .line 23
    .line 24
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseBaseItem;->k:Ljava/util/Calendar;

    .line 25
    .line 26
    if-eqz v0, :cond_24

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0

    .line 37
    :cond_24
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    return-wide v0
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

.method public r(Z)I
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_b
    iget-object p1, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 13
    .line 14
    const/4 v0, -0x2

    .line 15
    if-nez p1, :cond_11

    .line 16
    .line 17
    return v0

    .line 18
    :cond_11
    iget-object v1, p1, Lcom/microsoft/graph/generated/BaseDriveItem;->x:Lcom/microsoft/graph/extensions/Folder;

    .line 19
    .line 20
    if-eqz v1, :cond_1c

    .line 21
    .line 22
    iget-object p1, v1, Lcom/microsoft/graph/generated/BaseFolder;->c:Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1c
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseDriveItem;->D:Lcom/microsoft/graph/extensions/RemoteItem;

    .line 30
    .line 31
    if-eqz p1, :cond_2b

    .line 32
    .line 33
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseRemoteItem;->g:Lcom/microsoft/graph/extensions/Folder;

    .line 34
    .line 35
    if-eqz p1, :cond_2b

    .line 36
    .line 37
    iget-object p1, p1, Lcom/microsoft/graph/generated/BaseFolder;->c:Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_2b
    return v0
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

.method public s()Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseDriveItem;->v:Lcom/microsoft/graph/extensions/File;

    .line 8
    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseFile;->d:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_e

    .line 14
    :cond_d
    move-object v0, v1

    .line 15
    :goto_e
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_19

    .line 20
    .line 21
    invoke-static {p0, v1}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_19
    const-string v1, "application/octet-stream"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_25

    .line 33
    .line 34
    invoke-static {p0, v1}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_25
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

.method public t()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/T;->k0:Lcom/microsoft/graph/extensions/DriveItem;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, v0, Lcom/microsoft/graph/generated/BaseEntity;->c:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/c3/T;->l0:Ljava/lang/String;

    .line 9
    .line 10
    return-object v0
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
