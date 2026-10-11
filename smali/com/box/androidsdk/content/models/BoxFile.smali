.class public Lcom/box/androidsdk/content/models/BoxFile;
.super Lcom/box/androidsdk/content/models/BoxCollaborationItem;
.source "SourceFile"


# static fields
.field public static final d0:[Ljava/lang/String;

.field private static final serialVersionUID:J = -0x41ae1a0be9cd65ffL


# direct methods
.method static constructor <clinit>()V
    .registers 35

    .line 1
    const-string v33, "allowed_invitee_roles"

    .line 2
    .line 3
    const-string v34, "classification"

    .line 4
    .line 5
    const-string v1, "type"

    .line 6
    .line 7
    const-string v2, "id"

    .line 8
    .line 9
    const-string v3, "file_version"

    .line 10
    .line 11
    const-string v4, "sequence_id"

    .line 12
    .line 13
    const-string v5, "etag"

    .line 14
    .line 15
    const-string v6, "sha1"

    .line 16
    .line 17
    const-string v7, "name"

    .line 18
    .line 19
    const-string v8, "created_at"

    .line 20
    .line 21
    const-string v9, "modified_at"

    .line 22
    .line 23
    const-string v10, "description"

    .line 24
    .line 25
    const-string v11, "size"

    .line 26
    .line 27
    const-string v12, "path_collection"

    .line 28
    .line 29
    const-string v13, "uploader_display_name"

    .line 30
    .line 31
    const-string v14, "created_by"

    .line 32
    .line 33
    const-string v15, "modified_by"

    .line 34
    .line 35
    const-string v16, "trashed_at"

    .line 36
    .line 37
    const-string v17, "purged_at"

    .line 38
    .line 39
    const-string v18, "content_created_at"

    .line 40
    .line 41
    const-string v19, "content_modified_at"

    .line 42
    .line 43
    const-string v20, "owned_by"

    .line 44
    .line 45
    const-string v21, "shared_link"

    .line 46
    .line 47
    const-string v22, "parent"

    .line 48
    .line 49
    const-string v23, "item_status"

    .line 50
    .line 51
    const-string v24, "version_number"

    .line 52
    .line 53
    const-string v25, "comment_count"

    .line 54
    .line 55
    const-string v26, "permissions"

    .line 56
    .line 57
    const-string v27, "extension"

    .line 58
    .line 59
    const-string v28, "is_package"

    .line 60
    .line 61
    const-string v29, "collections"

    .line 62
    .line 63
    const-string v30, "has_collaborations"

    .line 64
    .line 65
    const-string v31, "can_non_owners_invite"

    .line 66
    .line 67
    const-string v32, "is_externally_owned"

    .line 68
    .line 69
    filled-new-array/range {v1 .. v34}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lcom/box/androidsdk/content/models/BoxFile;->d0:[Ljava/lang/String;

    .line 74
    .line 75
    return-void
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

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxCollaborationItem;-><init>()V

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
.end method


# virtual methods
.method public I()Ljava/util/Date;
    .registers 2

    .line 1
    invoke-super {p0}, Lcom/box/androidsdk/content/models/BoxItem;->I()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public Q()Ljava/lang/Long;
    .registers 2

    .line 1
    invoke-super {p0}, Lcom/box/androidsdk/content/models/BoxItem;->Q()Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
