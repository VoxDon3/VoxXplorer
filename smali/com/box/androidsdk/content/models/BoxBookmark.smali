.class public Lcom/box/androidsdk/content/models/BoxBookmark;
.super Lcom/box/androidsdk/content/models/BoxItem;
.source "SourceFile"


# static fields
.field public static final d0:[Ljava/lang/String;

.field private static final serialVersionUID:J = 0x247baa1c966857f2L


# direct methods
.method static constructor <clinit>()V
    .registers 21

    .line 1
    const-string v19, "permissions"

    .line 2
    .line 3
    const-string v20, "comment_count"

    .line 4
    .line 5
    const-string v1, "type"

    .line 6
    .line 7
    const-string v2, "id"

    .line 8
    .line 9
    const-string v3, "sequence_id"

    .line 10
    .line 11
    const-string v4, "etag"

    .line 12
    .line 13
    const-string v5, "name"

    .line 14
    .line 15
    const-string v6, "url"

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
    const-string v10, "path_collection"

    .line 24
    .line 25
    const-string v11, "created_by"

    .line 26
    .line 27
    const-string v12, "modified_by"

    .line 28
    .line 29
    const-string v13, "trashed_at"

    .line 30
    .line 31
    const-string v14, "purged_at"

    .line 32
    .line 33
    const-string v15, "owned_by"

    .line 34
    .line 35
    const-string v16, "shared_link"

    .line 36
    .line 37
    const-string v17, "parent"

    .line 38
    .line 39
    const-string v18, "item_status"

    .line 40
    .line 41
    filled-new-array/range {v1 .. v20}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/box/androidsdk/content/models/BoxBookmark;->d0:[Ljava/lang/String;

    .line 46
    .line 47
    return-void
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

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxItem;-><init>()V

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
.method public Q()Ljava/lang/Long;
    .registers 2

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method
