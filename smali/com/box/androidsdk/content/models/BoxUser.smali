.class public Lcom/box/androidsdk/content/models/BoxUser;
.super Lcom/box/androidsdk/content/models/BoxCollaborator;
.source "SourceFile"


# static fields
.field public static final c0:[Ljava/lang/String;

.field private static final serialVersionUID:J = -0x7f581a875d6f7853L


# direct methods
.method static constructor <clinit>()V
    .registers 27

    .line 1
    const-string v25, "hostname"

    .line 2
    .line 3
    const-string v26, "my_tags"

    .line 4
    .line 5
    const-string v1, "type"

    .line 6
    .line 7
    const-string v2, "id"

    .line 8
    .line 9
    const-string v3, "name"

    .line 10
    .line 11
    const-string v4, "login"

    .line 12
    .line 13
    const-string v5, "created_at"

    .line 14
    .line 15
    const-string v6, "modified_at"

    .line 16
    .line 17
    const-string v7, "role"

    .line 18
    .line 19
    const-string v8, "language"

    .line 20
    .line 21
    const-string v9, "timezone"

    .line 22
    .line 23
    const-string v10, "space_amount"

    .line 24
    .line 25
    const-string v11, "space_used"

    .line 26
    .line 27
    const-string v12, "max_upload_size"

    .line 28
    .line 29
    const-string v13, "tracking_codes"

    .line 30
    .line 31
    const-string v14, "can_see_managed_users"

    .line 32
    .line 33
    const-string v15, "is_sync_enabled"

    .line 34
    .line 35
    const-string v16, "is_external_collab_restricted"

    .line 36
    .line 37
    const-string v17, "status"

    .line 38
    .line 39
    const-string v18, "job_title"

    .line 40
    .line 41
    const-string v19, "phone"

    .line 42
    .line 43
    const-string v20, "address"

    .line 44
    .line 45
    const-string v21, "avatar_url"

    .line 46
    .line 47
    const-string v22, "is_exempt_from_device_limits"

    .line 48
    .line 49
    const-string v23, "is_exempt_from_login_verification"

    .line 50
    .line 51
    const-string v24, "enterprise"

    .line 52
    .line 53
    filled-new-array/range {v1 .. v26}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lcom/box/androidsdk/content/models/BoxUser;->c0:[Ljava/lang/String;

    .line 58
    .line 59
    return-void
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
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxCollaborator;-><init>()V

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
.method public J()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "login"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->u(Ljava/lang/String;)Ljava/lang/String;

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

.method public K()Ljava/lang/Long;
    .registers 2

    .line 1
    const-string v0, "space_amount"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->t(Ljava/lang/String;)Ljava/lang/Long;

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

.method public M()Ljava/lang/Long;
    .registers 2

    .line 1
    const-string v0, "space_used"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->t(Ljava/lang/String;)Ljava/lang/Long;

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
