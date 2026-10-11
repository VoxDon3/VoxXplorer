.class public Lcom/box/androidsdk/content/models/BoxFolder;
.super Lcom/box/androidsdk/content/models/BoxCollaborationItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/models/BoxFolder$SyncState;
    }
.end annotation


# static fields
.field public static final d0:[Ljava/lang/String;

.field private static final serialVersionUID:J = 0x6f4d06761d67ca4eL


# direct methods
.method static constructor <clinit>()V
    .registers 32

    .line 1
    const-string v30, "collections"

    .line 2
    .line 3
    const-string v31, "classification"

    .line 4
    .line 5
    const-string v1, "type"

    .line 6
    .line 7
    const-string v2, "sha1"

    .line 8
    .line 9
    const-string v3, "id"

    .line 10
    .line 11
    const-string v4, "sequence_id"

    .line 12
    .line 13
    const-string v5, "etag"

    .line 14
    .line 15
    const-string v6, "name"

    .line 16
    .line 17
    const-string v7, "created_at"

    .line 18
    .line 19
    const-string v8, "modified_at"

    .line 20
    .line 21
    const-string v9, "description"

    .line 22
    .line 23
    const-string v10, "size"

    .line 24
    .line 25
    const-string v11, "path_collection"

    .line 26
    .line 27
    const-string v12, "created_by"

    .line 28
    .line 29
    const-string v13, "modified_by"

    .line 30
    .line 31
    const-string v14, "trashed_at"

    .line 32
    .line 33
    const-string v15, "purged_at"

    .line 34
    .line 35
    const-string v16, "content_created_at"

    .line 36
    .line 37
    const-string v17, "content_modified_at"

    .line 38
    .line 39
    const-string v18, "owned_by"

    .line 40
    .line 41
    const-string v19, "shared_link"

    .line 42
    .line 43
    const-string v20, "folder_upload_email"

    .line 44
    .line 45
    const-string v21, "parent"

    .line 46
    .line 47
    const-string v22, "item_status"

    .line 48
    .line 49
    const-string v23, "item_collection"

    .line 50
    .line 51
    const-string v24, "sync_state"

    .line 52
    .line 53
    const-string v25, "has_collaborations"

    .line 54
    .line 55
    const-string v26, "permissions"

    .line 56
    .line 57
    const-string v27, "can_non_owners_invite"

    .line 58
    .line 59
    const-string v28, "is_externally_owned"

    .line 60
    .line 61
    const-string v29, "allowed_invitee_roles"

    .line 62
    .line 63
    filled-new-array/range {v1 .. v31}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lcom/box/androidsdk/content/models/BoxFolder;->d0:[Ljava/lang/String;

    .line 68
    .line 69
    return-void
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
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxCollaborationItem;-><init>()V

    return-void
.end method

.method public constructor <init>(Lax/O4/d;)V
    .registers 2

    .line 2
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/models/BoxCollaborationItem;-><init>(Lax/O4/d;)V

    return-void
.end method

.method public static S(Ljava/lang/String;)Lcom/box/androidsdk/content/models/BoxFolder;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/box/androidsdk/content/models/BoxFolder;->T(Ljava/lang/String;Ljava/lang/String;)Lcom/box/androidsdk/content/models/BoxFolder;

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
.end method

.method public static T(Ljava/lang/String;Ljava/lang/String;)Lcom/box/androidsdk/content/models/BoxFolder;
    .registers 4

    .line 1
    new-instance v0, Lax/O4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/O4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p0}, Lax/O4/d;->C(Ljava/lang/String;Ljava/lang/String;)Lax/O4/d;

    .line 9
    .line 10
    .line 11
    const-string p0, "type"

    .line 12
    .line 13
    const-string v1, "folder"

    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Lax/O4/d;->C(Ljava/lang/String;Ljava/lang/String;)Lax/O4/d;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_1c

    .line 23
    .line 24
    const-string p0, "name"

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, Lax/O4/d;->C(Ljava/lang/String;Ljava/lang/String;)Lax/O4/d;

    .line 27
    .line 28
    .line 29
    :cond_1c
    new-instance p0, Lcom/box/androidsdk/content/models/BoxFolder;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/models/BoxFolder;-><init>(Lax/O4/d;)V

    .line 32
    .line 33
    .line 34
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
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
