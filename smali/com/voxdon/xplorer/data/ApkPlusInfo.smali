.class public Lcom/voxdon/xplorer/data/ApkPlusInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static final ICON_FILENAME:Ljava/lang/String; = "icon.png"

.field public static final INFO_FILENAME:Ljava/lang/String; = "apk+.json"


# instance fields
.field public app_name:Ljava/lang/String;

.field public min_sdk_version:I

.field public package_name:Ljava/lang/String;

.field public version_code:J

.field public version_name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public fillInfo(Lax/U2/f;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Lax/U2/f;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->app_name:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->package_name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/U2/f;->y()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_code:J

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/U2/f;->x()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_name:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/U2/f;->p()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->min_sdk_version:I

    .line 30
    .line 31
    return-void
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
