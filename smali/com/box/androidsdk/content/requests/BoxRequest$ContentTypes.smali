.class public final enum Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/requests/BoxRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ContentTypes"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

.field public static final enum d0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

.field public static final enum e0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

.field private static final synthetic f0:[Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

.field public static final enum q:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;


# instance fields
.field private mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "application/json"

    .line 5
    .line 6
    const-string v3, "JSON"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->q:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 12
    .line 13
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "application/x-www-form-urlencoded"

    .line 17
    .line 18
    const-string v3, "URL_ENCODED"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->c0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 24
    .line 25
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "application/json-patch+json"

    .line 29
    .line 30
    const-string v3, "JSON_PATCH"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->d0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 36
    .line 37
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "application/octet-stream"

    .line 41
    .line 42
    const-string v3, "APPLICATION_OCTET_STREAM"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->e0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 48
    .line 49
    invoke-static {}, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->d()[Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->f0:[Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 54
    .line 55
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->mName:Ljava/lang/String;

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

.method private static synthetic d()[Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;
    .registers 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 3
    .line 4
    sget-object v1, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->q:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->c0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->d0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->e0:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
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

.method public static valueOf(Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;
    .registers 2

    .line 1
    const-class v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;
    .registers 1

    .line 1
    sget-object v0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->f0:[Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 8
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


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;->mName:Ljava/lang/String;

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
