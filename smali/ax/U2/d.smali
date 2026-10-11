.class public Lax/U2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DefaultLocale"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/U2/d$e;,
        Lax/U2/d$f;,
        Lax/U2/d$g;,
        Lax/U2/d$d;
    }
.end annotation


# static fields
.field private static final j:Ljava/util/logging/Logger;

.field private static k:Lax/U2/d;


# instance fields
.field final a:Ljava/lang/String;

.field b:Landroid/content/Context;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field d:Lax/Z2/b;

.field e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/U2/d$f;",
            ">;"
        }
    .end annotation
.end field

.field final f:Ljava/lang/Object;

.field g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/U2/d$e;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/U2/d;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/U2/d;->j:Ljava/util/logging/Logger;

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
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "\u0000"

    .line 5
    .line 6
    iput-object v0, p0, Lax/U2/d;->a:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/U2/d;->c:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/U2/d;->f:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lax/U2/d;->g:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lax/U2/d;->h:Ljava/util/HashMap;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lax/U2/d;->i:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private declared-synchronized A()Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_2f

    .line 5
    .line 6
    .line 7
    :try_start_6
    iget-object v1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_3a

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/content/pm/PackageInfo;
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_21} :catch_36
    .catchall {:try_start_6 .. :try_end_21} :catchall_2f

    .line 33
    .line 34
    :try_start_21
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 35
    .line 36
    if-nez v4, :cond_26

    .line 37
    .line 38
    goto :goto_15

    .line 39
    :cond_26
    new-instance v4, Lax/U2/f;

    .line 40
    .line 41
    invoke-direct {v4, v1, v3}, Lax/U2/f;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_2e} :catch_31
    .catchall {:try_start_21 .. :try_end_2e} :catchall_2f

    .line 45
    .line 46
    .line 47
    goto :goto_15

    .line 48
    :catchall_2f
    move-exception v0

    .line 49
    goto :goto_3c

    .line 50
    :catch_31
    move-exception v3

    .line 51
    :try_start_32
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_35} :catch_36
    .catchall {:try_start_32 .. :try_end_35} :catchall_2f

    .line 52
    .line 53
    .line 54
    goto :goto_15

    .line 55
    :catch_36
    move-exception v1

    .line 56
    :try_start_37
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3a
    .catchall {:try_start_37 .. :try_end_3a} :catchall_2f

    .line 57
    .line 58
    .line 59
    :cond_3a
    monitor-exit p0

    .line 60
    return-object v0

    .line 61
    :goto_3c
    :try_start_3c
    monitor-exit p0
    :try_end_3d
    .catchall {:try_start_3c .. :try_end_3d} :catchall_2f

    .line 62
    throw v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static E(Lax/U2/f;)Landroid/graphics/Bitmap;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/U2/f;->l()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_f
    if-eqz p0, :cond_16

    .line 17
    .line 18
    invoke-static {p0}, Lax/u3/z;->e(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_16
    const/4 p0, 0x0

    .line 24
    return-object p0
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

.method public static F(Landroid/content/Context;)Lax/U2/d;
    .registers 2

    .line 1
    sget-object v0, Lax/U2/d;->k:Lax/U2/d;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/U2/d;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/U2/d;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/U2/d;->k:Lax/U2/d;

    .line 11
    .line 12
    :cond_b
    sget-object p0, Lax/U2/d;->k:Lax/U2/d;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private H()Ljava/io/File;
    .registers 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lax/Q2/e;->q(Landroid/content/Context;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "appcache_"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0
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

.method public static K(Lax/U2/f;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/c3/B;->A(Lax/U2/f;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static L(Landroid/content/pm/PackageInfo;)J
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->q0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-static {p0}, Lax/U2/b;->a(Landroid/content/pm/PackageInfo;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_b
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 13
    .line 14
    int-to-long v0, p0

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static M(Lax/c3/k;)Lcom/voxdon/xplorer/data/ApkPlusInfo;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    const-string v1, "manifest.json"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lax/c3/F;->g(Lax/c3/k;Ljava/lang/String;)[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    new-instance v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Ljava/lang/String;-><init>([B)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/google/gson/Gson;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/gson/Gson;-><init>()V

    .line 19
    .line 20
    .line 21
    const-class v2, Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v2}, Lcom/google/gson/Gson;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/Map;

    .line 28
    .line 29
    new-instance v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;

    .line 30
    .line 31
    invoke-direct {v1}, Lcom/voxdon/xplorer/data/ApkPlusInfo;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "name"

    .line 35
    .line 36
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    instance-of v3, v2, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v3, :cond_2f

    .line 43
    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    iput-object v2, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->app_name:Ljava/lang/String;

    .line 47
    .line 48
    :cond_2f
    const-string v2, "version_name"

    .line 49
    .line 50
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    instance-of v3, v2, Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v3, :cond_3d

    .line 57
    .line 58
    check-cast v2, Ljava/lang/String;

    .line 59
    .line 60
    iput-object v2, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_name:Ljava/lang/String;

    .line 61
    .line 62
    :cond_3d
    const-string v2, "package_name"

    .line 63
    .line 64
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    instance-of v3, v2, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_4b

    .line 71
    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    iput-object v2, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->package_name:Ljava/lang/String;

    .line 75
    .line 76
    :cond_4b
    const-string v2, "version_code"

    .line 77
    .line 78
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    instance-of v3, v2, Ljava/lang/String;
    :try_end_53
    .catch Lax/b3/j; {:try_start_1 .. :try_end_53} :catch_78
    .catch Lax/r8/r; {:try_start_1 .. :try_end_53} :catch_78
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_53} :catch_78

    .line 83
    .line 84
    if-eqz v3, :cond_5d

    .line 85
    .line 86
    :try_start_55
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    iput-wide v2, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_code:J
    :try_end_5d
    .catch Ljava/lang/NumberFormatException; {:try_start_55 .. :try_end_5d} :catch_5d
    .catch Lax/b3/j; {:try_start_55 .. :try_end_5d} :catch_78
    .catch Lax/r8/r; {:try_start_55 .. :try_end_5d} :catch_78
    .catch Ljava/lang/NullPointerException; {:try_start_55 .. :try_end_5d} :catch_78

    .line 93
    .line 94
    :catch_5d
    :cond_5d
    :try_start_5d
    const-string v2, "min_sdk_version"

    .line 95
    .line 96
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    instance-of v2, p0, Ljava/lang/String;
    :try_end_65
    .catch Lax/b3/j; {:try_start_5d .. :try_end_65} :catch_78
    .catch Lax/r8/r; {:try_start_5d .. :try_end_65} :catch_78
    .catch Ljava/lang/NullPointerException; {:try_start_5d .. :try_end_65} :catch_78

    .line 101
    .line 102
    if-eqz v2, :cond_6f

    .line 103
    .line 104
    :try_start_67
    check-cast p0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    iput p0, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->min_sdk_version:I
    :try_end_6f
    .catch Ljava/lang/NumberFormatException; {:try_start_67 .. :try_end_6f} :catch_6f
    .catch Lax/b3/j; {:try_start_67 .. :try_end_6f} :catch_78
    .catch Lax/r8/r; {:try_start_67 .. :try_end_6f} :catch_78
    .catch Ljava/lang/NullPointerException; {:try_start_67 .. :try_end_6f} :catch_78

    .line 111
    .line 112
    :catch_6f
    :cond_6f
    :try_start_6f
    iget-object p0, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->app_name:Ljava/lang/String;

    .line 113
    .line 114
    if-eqz p0, :cond_78

    .line 115
    .line 116
    iget-object p0, v1, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_name:Ljava/lang/String;
    :try_end_75
    .catch Lax/b3/j; {:try_start_6f .. :try_end_75} :catch_78
    .catch Lax/r8/r; {:try_start_6f .. :try_end_75} :catch_78
    .catch Ljava/lang/NullPointerException; {:try_start_6f .. :try_end_75} :catch_78

    .line 117
    .line 118
    if-eqz p0, :cond_78

    .line 119
    .line 120
    return-object v1

    .line 121
    :catch_78
    :cond_78
    return-object v0
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

.method private static N(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "apkm"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1b

    .line 8
    .line 9
    const-string v0, "apk+"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1b

    .line 16
    .line 17
    const-string v0, "xapk"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_19

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1b
    :goto_1b
    const/4 p0, 0x1

    .line 29
    return p0
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

.method public static O(Landroid/content/Context;Lax/c3/k;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "apks-tmp"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lax/Z2/a;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {p1, v0, v2}, Lax/c3/F;->l(Lax/c3/k;Ljava/io/File;Lax/B/b;)Lax/B/b;

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/io/File;

    .line 33
    .line 34
    const-string v2, "Android/obb"

    .line 35
    .line 36
    invoke-direct {p1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_42

    .line 44
    .line 45
    :try_start_2c
    sget-object v3, Lax/c3/K;->e:Lax/c3/K;

    .line 46
    .line 47
    invoke-virtual {v3}, Lax/c3/K;->e()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3, v2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1, v2}, Lax/U2/d;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_2c .. :try_end_3d} :catch_3e

    .line 60
    .line 61
    .line 62
    goto :goto_42

    .line 63
    :catch_3e
    move-exception p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    :cond_42
    :goto_42
    new-instance p1, Ljava/io/File;

    .line 68
    .line 69
    const-string v2, "splits"

    .line 70
    .line 71
    invoke-direct {p1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_56

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_56

    .line 85
    .line 86
    move-object v0, p1

    .line 87
    :cond_56
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/4 v2, 0x0

    .line 92
    if-eqz p1, :cond_6a

    .line 93
    .line 94
    array-length v3, p1

    .line 95
    if-ne v3, v1, :cond_6a

    .line 96
    .line 97
    aget-object v3, p1, v2

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_6a

    .line 104
    .line 105
    aget-object v0, p1, v2

    .line 106
    .line 107
    :cond_6a
    new-instance p1, Lax/U2/d$b;

    .line 108
    .line 109
    invoke-direct {p1}, Lax/U2/d$b;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-nez p1, :cond_76

    .line 117
    .line 118
    return v2

    .line 119
    :cond_76
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v0, Lax/U2/d$c;

    .line 124
    .line 125
    invoke-direct {v0}, Lax/U2/d$c;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getPackageInstaller()Landroid/content/pm/PackageInstaller;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v3, Landroid/content/pm/PackageInstaller$SessionParams;

    .line 140
    .line 141
    invoke-direct {v3, v1}, Landroid/content/pm/PackageInstaller$SessionParams;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const-wide/16 v4, 0x0

    .line 145
    .line 146
    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageInstaller$SessionParams;->setSize(J)V

    .line 147
    .line 148
    .line 149
    const/4 v4, -0x1

    .line 150
    :try_start_95
    invoke-virtual {v0, v3}, Landroid/content/pm/PackageInstaller;->createSession(Landroid/content/pm/PackageInstaller$SessionParams;)I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :goto_9d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_b3

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Ljava/io/File;

    .line 169
    .line 170
    invoke-static {v0, v4, v3}, Lax/U2/d;->d0(Landroid/content/pm/PackageInstaller;ILjava/io/File;)V

    .line 171
    .line 172
    .line 173
    goto :goto_9d

    .line 174
    :catch_ad
    nop

    .line 175
    goto :goto_b7

    .line 176
    :catch_af
    move-exception p0

    .line 177
    goto :goto_bd

    .line 178
    :catch_b1
    move-exception p0

    .line 179
    goto :goto_db

    .line 180
    :cond_b3
    invoke-static {p0, v0, v4}, Lax/U2/d;->c0(Landroid/content/Context;Landroid/content/pm/PackageInstaller;I)V
    :try_end_b6
    .catch Ljava/io/IOException; {:try_start_95 .. :try_end_b6} :catch_b1
    .catch Ljava/lang/IllegalStateException; {:try_start_95 .. :try_end_b6} :catch_af
    .catch Ljava/lang/NullPointerException; {:try_start_95 .. :try_end_b6} :catch_ad

    .line 181
    .line 182
    .line 183
    return v1

    .line 184
    :goto_b7
    if-lez v4, :cond_bc

    .line 185
    .line 186
    invoke-virtual {v0, v4}, Landroid/content/pm/PackageInstaller;->abandonSession(I)V

    .line 187
    .line 188
    .line 189
    :cond_bc
    return v2

    .line 190
    :goto_bd
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 191
    .line 192
    .line 193
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    const-string v1, "APP INSTALL SESSION ERROR"

    .line 202
    .line 203
    invoke-virtual {p1, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 212
    .line 213
    .line 214
    if-lez v4, :cond_da

    .line 215
    .line 216
    invoke-virtual {v0, v4}, Landroid/content/pm/PackageInstaller;->abandonSession(I)V

    .line 217
    .line 218
    .line 219
    :cond_da
    return v2

    .line 220
    :goto_db
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 221
    .line 222
    .line 223
    if-lez v4, :cond_e3

    .line 224
    .line 225
    invoke-virtual {v0, v4}, Landroid/content/pm/PackageInstaller;->abandonSession(I)V

    .line 226
    .line 227
    .line 228
    :cond_e3
    return v2
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

.method public static P(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "apk+"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public static Q(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "/cache"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1c

    .line 8
    .line 9
    const-string v0, "/Android/data/"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1c

    .line 16
    .line 17
    const-string v0, "/"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    array-length p0, p0

    .line 24
    const/4 v0, 0x5

    .line 25
    if-ne p0, v0, :cond_1c

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1c
    const/4 p0, 0x0

    .line 30
    return p0
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

.method public static S(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "apk"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_13

    .line 8
    .line 9
    const-string v0, "apk+"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_13
    :goto_13
    const/4 p0, 0x1

    .line 21
    return p0
    .line 22
.end method

.method public static T()Z
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->z0()Z

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
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/Z2/j;->t0()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_22

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/Z2/j;->T()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_22

    .line 24
    .line 25
    sget-object v2, Lax/c3/K;->f:Lax/c3/K;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lax/Z2/j;->j0(Lax/c3/K;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_22

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_22
    return v1
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

.method public static U(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "apks"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_23

    .line 8
    .line 9
    const-string v0, "apkm"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_23

    .line 16
    .line 17
    const-string v0, "apk+"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_23

    .line 24
    .line 25
    const-string v0, "xapk"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_21

    .line 32
    .line 33
    goto :goto_23

    .line 34
    :cond_21
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_23
    :goto_23
    const/4 p0, 0x1

    .line 37
    return p0
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

.method public static V(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "xapk"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method private X(Ljava/util/List;Landroid/content/Intent;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;",
            "Landroid/content/Intent;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v1, "package:"

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v1, "android.intent.action.PACKAGE_ADDED"

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2d

    .line 24
    .line 25
    const-string v1, "android.intent.action.PACKAGE_REPLACED"

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_21

    .line 32
    .line 33
    goto :goto_2d

    .line 34
    :cond_21
    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2c

    .line 41
    .line 42
    invoke-direct {p0, p1, p2}, Lax/U2/d;->a0(Ljava/util/List;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    return-void

    .line 46
    :cond_2d
    :goto_2d
    invoke-direct {p0, p1, p2}, Lax/U2/d;->a0(Ljava/util/List;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, p2}, Lax/U2/d;->c(Ljava/util/List;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
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

.method private Y()Ljava/util/HashMap;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/U2/d$f;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/U2/d;->H()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_d

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 12
    .line 13
    .line 14
    :cond_d
    invoke-direct {p0}, Lax/U2/d;->w()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1a

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 25
    .line 26
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

.method static synthetic a()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lax/U2/d;->j:Ljava/util/logging/Logger;

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

.method private a0(Ljava/util/List;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/U2/d;->j(Ljava/util/List;Ljava/lang/String;)Lax/U2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_9

    .line 6
    .line 7
    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_9
    return-void
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
.end method

.method static synthetic b(Ljava/lang/String;)I
    .registers 1

    .line 1
    invoke-static {p0}, Lax/U2/d;->o(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method private c(Ljava/util/List;Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_7
    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-object v1, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 13
    .line 14
    if-eqz v1, :cond_1f

    .line 15
    .line 16
    new-instance v1, Lax/U2/f;

    .line 17
    .line 18
    invoke-direct {v1, v0, p2}, Lax/U2/f;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_18
    sget-object p1, Lax/U2/d;->j:Ljava/util/logging/Logger;

    .line 26
    .line 27
    const-string p2, "Adding changed packaged to cache was failed"

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-void
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

.method private static c0(Landroid/content/Context;Landroid/content/pm/PackageInstaller;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageInstaller;->openSession(I)Landroid/content/pm/PackageInstaller$Session;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_20

    .line 5
    :try_start_4
    new-instance p2, Landroid/content/Intent;

    .line 6
    .line 7
    const-class v0, Lcom/voxdon/xplorer/receiver/PackageCommitReceiver;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, v0, p2, v0}, Lax/u3/l;->b(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Landroid/content/pm/PackageInstaller$Session;->commit(Landroid/content/IntentSender;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_1a
    .catchall {:try_start_4 .. :try_end_1a} :catchall_1e

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/pm/PackageInstaller$Session;->close()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_1e
    move-exception p0

    .line 32
    goto :goto_22

    .line 33
    :catchall_20
    move-exception p0

    .line 34
    const/4 p1, 0x0

    .line 35
    :goto_22
    if-eqz p1, :cond_27

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/content/pm/PackageInstaller$Session;->close()V

    .line 38
    .line 39
    .line 40
    :cond_27
    throw p0
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

.method private d(Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lax/U2/d;->e:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2e

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lax/U2/f;

    .line 23
    .line 24
    iget-object v1, p0, Lax/U2/d;->e:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/U2/f;->r()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lax/U2/d$f;

    .line 31
    .line 32
    invoke-virtual {v0}, Lax/U2/f;->q()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v0}, Lax/U2/f;->n()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    invoke-direct {v3, v4, v5, v6}, Lax/U2/d$f;-><init>(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_b

    .line 47
    :cond_2e
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
.end method

.method private static d0(Landroid/content/pm/PackageInstaller;ILjava/io/File;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageInstaller;->openSession(I)Landroid/content/pm/PackageInstaller$Session;

    .line 3
    .line 4
    .line 5
    move-result-object v2
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_36

    .line 6
    :try_start_5
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 11
    .line 12
    .line 13
    move-result-wide v6

    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    invoke-virtual/range {v2 .. v7}, Landroid/content/pm/PackageInstaller$Session;->openWrite(Ljava/lang/String;JJ)Ljava/io/OutputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_13
    .catchall {:try_start_5 .. :try_end_13} :catchall_32

    .line 20
    :try_start_13
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_18
    .catchall {:try_start_13 .. :try_end_18} :catchall_2e

    .line 23
    .line 24
    .line 25
    :try_start_18
    invoke-static {p1, p0}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p0}, Landroid/content/pm/PackageInstaller$Session;->fsync(Ljava/io/OutputStream;)V
    :try_end_1e
    .catchall {:try_start_18 .. :try_end_1e} :catchall_2a

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_23

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 34
    .line 35
    .line 36
    :cond_23
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/content/pm/PackageInstaller$Session;->close()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_2a
    move-exception v0

    .line 44
    move-object p2, v0

    .line 45
    :goto_2c
    move-object v1, p0

    .line 46
    goto :goto_3a

    .line 47
    :catchall_2e
    move-exception v0

    .line 48
    move-object p2, v0

    .line 49
    move-object p1, v1

    .line 50
    goto :goto_2c

    .line 51
    :catchall_32
    move-exception v0

    .line 52
    move-object p2, v0

    .line 53
    move-object p1, v1

    .line 54
    goto :goto_3a

    .line 55
    :catchall_36
    move-exception v0

    .line 56
    move-object p2, v0

    .line 57
    move-object p1, v1

    .line 58
    move-object v2, p1

    .line 59
    :goto_3a
    if-eqz v1, :cond_3f

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 62
    .line 63
    .line 64
    :cond_3f
    if-eqz p1, :cond_44

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 67
    .line 68
    .line 69
    :cond_44
    if-eqz v2, :cond_49

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/content/pm/PackageInstaller$Session;->close()V

    .line 72
    .line 73
    .line 74
    :cond_49
    throw p2
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

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lax/c3/x;->g(Ljava/lang/String;)Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0}, Lax/c3/b;->isDirectory()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_44

    .line 18
    .line 19
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1c

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, p1, v1}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 27
    .line 28
    .line 29
    :cond_1c
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/o;->f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_51

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v4, v2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v3, v2}, Lax/U2/d;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_24

    .line 69
    :cond_44
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4d

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 76
    .line 77
    .line 78
    :cond_4d
    const/4 v1, 0x0

    .line 79
    invoke-virtual {v0, p0, p1, v1, v1}, Lcom/voxdon/xplorer/file/o;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 80
    .line 81
    .line 82
    :cond_51
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_54
    .catch Lax/b3/j; {:try_start_0 .. :try_end_54} :catch_55
    .catch Lax/b3/a; {:try_start_0 .. :try_end_54} :catch_55

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :catch_55
    move-exception p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    return-void
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

.method public static f0(Lax/c3/k;Ljava/io/File;)Lax/U2/d$g;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/B/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/B/b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "splits/base-master.apk"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const-string v1, "base.apk"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const-string v1, "icon.png"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1, v0}, Lax/c3/F;->l(Lax/c3/k;Ljava/io/File;Lax/B/b;)Lax/B/b;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Lax/U2/d$g;

    .line 26
    .line 27
    invoke-direct {p1}, Lax/U2/d$g;-><init>()V

    .line 28
    .line 29
    .line 30
    if-eqz p0, :cond_3b

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/B/b;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_23
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3b

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_38

    .line 53
    .line 54
    iput-object v0, p1, Lax/U2/d$g;->b:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_23

    .line 57
    :cond_38
    iput-object v0, p1, Lax/U2/d$g;->a:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_23

    .line 60
    :cond_3b
    return-object p1
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

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
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

.method private g0(Ljava/util/HashMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/U2/d$f;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
    .line 2
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
    .line 22
.end method

.method public static h(Ljava/util/List;)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;)",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_d
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_23

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lax/U2/f;

    .line 25
    .line 26
    invoke-virtual {v1}, Lax/U2/f;->F()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_d

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_d

    .line 36
    :cond_23
    return-object v0
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

.method private j(Ljava/util/List;Ljava/lang/String;)Lax/U2/f;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lax/U2/f;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1b

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/U2/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/U2/f;->r()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1b
    const/4 p1, 0x0

    .line 29
    return-object p1
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

.method private static k(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_11

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_11
    new-instance v1, Lax/U2/a;

    .line 19
    .line 20
    invoke-direct {v1}, Lax/U2/a;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 24
    .line 25
    iput-object p1, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p1, v2, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 28
    .line 29
    iget-object p1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz p1, :cond_21

    .line 32
    .line 33
    goto :goto_23

    .line 34
    :cond_21
    const-string p1, ""

    .line 35
    .line 36
    :goto_23
    iput-object p1, v1, Lax/U2/a;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iput-object p0, v1, Lax/U2/a;->a:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 49
    .line 50
    iput-object p0, v1, Lax/U2/a;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Lax/U2/d;->L(Landroid/content/pm/PackageInfo;)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    iput-wide p0, v1, Lax/U2/a;->d:J

    .line 57
    .line 58
    return-object v1
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

.method private static l(Lcom/voxdon/xplorer/data/ApkPlusInfo;)Lax/U2/a;
    .registers 4

    .line 1
    new-instance v0, Lax/U2/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/U2/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_name:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    goto :goto_c

    .line 11
    :cond_a
    const-string v1, ""

    .line 12
    .line 13
    :goto_c
    iput-object v1, v0, Lax/U2/a;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->app_name:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v1, v0, Lax/U2/a;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->package_name:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, v0, Lax/U2/a;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v1, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_code:J

    .line 24
    .line 25
    iput-wide v1, v0, Lax/U2/a;->d:J

    .line 26
    .line 27
    return-object v0
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

.method public static m(Lax/c3/k;)Lax/U2/d$e;
    .registers 5

    .line 1
    invoke-static {p0}, Lax/U2/d;->n(Lax/c3/k;)Lcom/voxdon/xplorer/data/ApkPlusInfo;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_8

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_8
    new-instance v0, Lax/U2/d$e;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->package_name:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;->version_code:J

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lax/U2/d$e;-><init>(Ljava/lang/String;J)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static n(Lax/c3/k;)Lcom/voxdon/xplorer/data/ApkPlusInfo;
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    const-string v1, "apk+.json"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lax/c3/F;->g(Lax/c3/k;Ljava/lang/String;)[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    new-instance v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Ljava/lang/String;-><init>([B)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/google/gson/Gson;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/gson/Gson;-><init>()V

    .line 19
    .line 20
    .line 21
    const-class v2, Lcom/voxdon/xplorer/data/ApkPlusInfo;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v2}, Lcom/google/gson/Gson;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/voxdon/xplorer/data/ApkPlusInfo;
    :try_end_1c
    .catch Lax/b3/j; {:try_start_1 .. :try_end_1c} :catch_1d
    .catch Lax/r8/r; {:try_start_1 .. :try_end_1c} :catch_1d
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1c} :catch_1d

    .line 28
    .line 29
    return-object p0

    .line 30
    :catch_1d
    return-object v0
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

.method private static o(Ljava/lang/String;)I
    .registers 2

    .line 1
    if-nez p0, :cond_5

    .line 2
    .line 3
    const/16 p0, 0x64

    .line 4
    .line 5
    return p0

    .line 6
    :cond_5
    const-string v0, "base.apk"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_f

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_f
    const-string v0, "split"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2c

    .line 23
    .line 24
    const-string v0, "config"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_20

    .line 31
    .line 32
    goto :goto_2c

    .line 33
    :cond_20
    const-string v0, "base"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2a

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_2a
    const/4 p0, 0x2

    .line 44
    return p0

    .line 45
    :cond_2c
    :goto_2c
    const/16 p0, 0xa

    .line 46
    .line 47
    return p0
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

.method private static p(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_d
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 15
    .line 16
    iput-object p1, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p1, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1a

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1a
    instance-of p1, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 28
    .line 29
    if-eqz p1, :cond_25

    .line 30
    .line 31
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_29

    .line 38
    :cond_25
    invoke-static {p0}, Lax/u3/z;->e(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :goto_29
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 43
    .line 44
    invoke-static {p0}, Lax/u3/z;->d(Landroid/graphics/Bitmap;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {p1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 49
    .line 50
    .line 51
    return-object p1
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

.method public static q(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;
    .registers 3

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/U2/d;->U(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    invoke-static {p0, p1}, Lax/U2/d;->s(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_f
    invoke-static {p0, p1}, Lax/U2/d;->k(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static r(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 3

    .line 1
    invoke-static {p1}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/U2/d;->U(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    invoke-static {p0, p1}, Lax/U2/d;->t(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_f
    invoke-static {p0, p1}, Lax/U2/d;->p(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method private static s(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;
    .registers 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "apks-tmp"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lax/Z2/a;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :try_start_1c
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Lax/U2/d;->P(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_38

    .line 38
    .line 39
    invoke-static {p1}, Lax/U2/d;->n(Lax/c3/k;)Lcom/voxdon/xplorer/data/ApkPlusInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_50

    .line 44
    .line 45
    invoke-static {v3}, Lax/U2/d;->l(Lcom/voxdon/xplorer/data/ApkPlusInfo;)Lax/U2/a;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_30
    .catch Lax/b3/j; {:try_start_1c .. :try_end_30} :catch_36
    .catchall {:try_start_1c .. :try_end_30} :catchall_34

    .line 49
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :catchall_34
    move-exception p0

    .line 54
    goto :goto_7d

    .line 55
    :catch_36
    move-exception p0

    .line 56
    goto :goto_76

    .line 57
    :cond_38
    :try_start_38
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lax/U2/d;->V(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_50

    .line 66
    .line 67
    invoke-static {p1}, Lax/U2/d;->M(Lax/c3/k;)Lcom/voxdon/xplorer/data/ApkPlusInfo;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-eqz v3, :cond_50

    .line 72
    .line 73
    invoke-static {v3}, Lax/U2/d;->l(Lcom/voxdon/xplorer/data/ApkPlusInfo;)Lax/U2/a;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_4c
    .catch Lax/b3/j; {:try_start_38 .. :try_end_4c} :catch_36
    .catchall {:try_start_38 .. :try_end_4c} :catchall_34

    .line 77
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_50
    :try_start_50
    invoke-static {p1, v0}, Lax/U2/d;->f0(Lax/c3/k;Ljava/io/File;)Lax/U2/d$g;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v3, p1, Lax/U2/d$g;->a:Ljava/lang/String;
    :try_end_56
    .catch Lax/b3/j; {:try_start_50 .. :try_end_56} :catch_36
    .catchall {:try_start_50 .. :try_end_56} :catchall_34

    .line 86
    .line 87
    if-nez v3, :cond_5c

    .line 88
    .line 89
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 90
    .line 91
    .line 92
    return-object v2

    .line 93
    :cond_5c
    :try_start_5c
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget-object p1, p1, Lax/U2/d$g;->a:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v3, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_66
    .catch Lax/b3/j; {:try_start_5c .. :try_end_66} :catch_36
    .catchall {:try_start_5c .. :try_end_66} :catchall_34

    .line 103
    :try_start_66
    invoke-static {p1}, Lcom/voxdon/xplorer/file/y;->I0(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p0, p1}, Lax/U2/d;->k(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;

    .line 108
    .line 109
    .line 110
    move-result-object p0
    :try_end_6e
    .catch Lax/b3/j; {:try_start_66 .. :try_end_6e} :catch_72
    .catchall {:try_start_66 .. :try_end_6e} :catchall_34

    .line 111
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :catch_72
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :goto_76
    :try_start_76
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_79
    .catchall {:try_start_76 .. :try_end_79} :catchall_34

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 123
    .line 124
    .line 125
    return-object v2

    .line 126
    :goto_7d
    invoke-static {v0, v1}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 127
    .line 128
    .line 129
    throw p0
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

.method private static t(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "apks-tmp"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lax/Z2/a;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    :try_start_15
    invoke-static {p1}, Lcom/voxdon/xplorer/file/y;->I0(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {p1}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lax/U2/d;->N(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_38

    .line 35
    .line 36
    const-string p1, "icon.png"

    .line 37
    .line 38
    invoke-static {v3, p1}, Lax/c3/F;->g(Lax/c3/k;Ljava/lang/String;)[B

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_38

    .line 43
    .line 44
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_30
    .catch Lax/b3/j; {:try_start_15 .. :try_end_30} :catch_36
    .catchall {:try_start_15 .. :try_end_30} :catchall_34

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :catchall_34
    move-exception p0

    .line 54
    goto :goto_a2

    .line 55
    :catch_36
    move-exception p0

    .line 56
    goto :goto_9b

    .line 57
    :cond_38
    :try_start_38
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 58
    .line 59
    .line 60
    invoke-static {v3, v0}, Lax/U2/d;->f0(Lax/c3/k;Ljava/io/File;)Lax/U2/d$g;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v3, p1, Lax/U2/d$g;->b:Ljava/lang/String;

    .line 65
    .line 66
    if-eqz v3, :cond_76

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget-object v4, p1, Lax/U2/d$g;->b:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v3, v4}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v4, Ljava/io/File;

    .line 79
    .line 80
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 84
    .line 85
    .line 86
    move-result v3
    :try_end_56
    .catch Lax/b3/j; {:try_start_38 .. :try_end_56} :catch_36
    .catchall {:try_start_38 .. :try_end_56} :catchall_34

    .line 87
    if-eqz v3, :cond_76

    .line 88
    .line 89
    :try_start_58
    new-instance v3, Ljava/io/FileInputStream;

    .line 90
    .line 91
    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 92
    .line 93
    .line 94
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 95
    .line 96
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v4}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 100
    .line 101
    .line 102
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-direct {v3, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_6e
    .catch Ljava/io/IOException; {:try_start_58 .. :try_end_6e} :catch_72
    .catch Lax/b3/j; {:try_start_58 .. :try_end_6e} :catch_36
    .catchall {:try_start_58 .. :try_end_6e} :catchall_34

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 112
    .line 113
    .line 114
    return-object v3

    .line 115
    :catch_72
    move-exception v3

    .line 116
    :try_start_73
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 117
    .line 118
    .line 119
    :cond_76
    iget-object v3, p1, Lax/U2/d$g;->a:Ljava/lang/String;

    .line 120
    .line 121
    if-eqz v3, :cond_97

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object p1, p1, Lax/U2/d$g;->a:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v3, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v3, Ljava/io/File;

    .line 134
    .line 135
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_97

    .line 143
    .line 144
    invoke-static {p0, p1}, Lax/U2/d;->p(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 145
    .line 146
    .line 147
    move-result-object p0
    :try_end_93
    .catch Lax/b3/j; {:try_start_73 .. :try_end_93} :catch_36
    .catchall {:try_start_73 .. :try_end_93} :catchall_34

    .line 148
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 149
    .line 150
    .line 151
    return-object p0

    .line 152
    :cond_97
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 153
    .line 154
    .line 155
    return-object v1

    .line 156
    :goto_9b
    :try_start_9b
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9e
    .catchall {:try_start_9b .. :try_end_9e} :catchall_34

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :goto_a2
    invoke-static {v0, v2}, Lax/Z2/a;->f(Ljava/io/File;Z)Z

    .line 164
    .line 165
    .line 166
    throw p0
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

.method public static u(Landroid/content/Context;)Lax/c3/K;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/t3/j;->H(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_f

    .line 6
    .line 7
    invoke-static {}, Lax/U2/d;->T()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_f

    .line 12
    .line 13
    sget-object p0, Lax/c3/K;->f:Lax/c3/K;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_f
    sget-object p0, Lax/c3/K;->e:Lax/c3/K;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private w()Ljava/io/File;
    .registers 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lax/Q2/e;->w(Landroid/content/Context;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "appcache_"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0
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


# virtual methods
.method public declared-synchronized B()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 3
    .line 4
    const-string v1, "APPS_BASE"

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lax/Z2/b;->i(Ljava/lang/String;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_3d

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_3d

    .line 17
    .line 18
    iget-object v1, p0, Lax/U2/d;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-lez v1, :cond_36

    .line 25
    .line 26
    iget-object v1, p0, Lax/U2/d;->c:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_31

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Landroid/content/Intent;

    .line 43
    .line 44
    invoke-direct {p0, v0, v2}, Lax/U2/d;->X(Ljava/util/List;Landroid/content/Intent;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1f

    .line 48
    :catchall_2f
    move-exception v0

    .line 49
    goto :goto_54

    .line 50
    :cond_31
    iget-object v1, p0, Lax/U2/d;->c:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 53
    .line 54
    .line 55
    :cond_36
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_3b
    .catchall {:try_start_1 .. :try_end_3b} :catchall_2f

    .line 58
    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return-object v1

    .line 62
    :cond_3d
    :try_start_3d
    iget-object v0, p0, Lax/U2/d;->c:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lax/U2/d;->A()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 72
    .line 73
    const-string v2, "APPS_BASE"

    .line 74
    .line 75
    invoke-virtual {v1, v2, v0}, Lax/Z2/b;->n(Ljava/lang/String;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_52
    .catchall {:try_start_3d .. :try_end_52} :catchall_2f

    .line 81
    .line 82
    .line 83
    monitor-exit p0

    .line 84
    return-object v1

    .line 85
    :goto_54
    :try_start_54
    monitor-exit p0
    :try_end_55
    .catchall {:try_start_54 .. :try_end_55} :catchall_2f

    .line 86
    throw v0
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

.method public C(Landroid/app/usage/StorageStats;)J
    .registers 4

    .line 1
    invoke-static {p1}, Lax/U2/c;->a(Landroid/app/usage/StorageStats;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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
.end method

.method public D(Ljava/lang/String;)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/Z2/b;->i(Ljava/lang/String;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_14

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_14
    invoke-virtual {p0}, Lax/U2/d;->B()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "APPS_DOWNLOADED"

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_24

    .line 32
    .line 33
    invoke-static {v0}, Lax/U2/d;->h(Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_24
    iget-object v1, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 38
    .line 39
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1, v2}, Lax/Z2/b;->n(Ljava/lang/String;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lax/U2/d;->e:Ljava/util/HashMap;

    .line 48
    .line 49
    if-nez v1, :cond_40

    .line 50
    .line 51
    iget-object v1, p0, Lax/U2/d;->f:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v1

    .line 54
    :try_start_35
    invoke-direct {p0}, Lax/U2/d;->Y()Ljava/util/HashMap;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, p0, Lax/U2/d;->e:Ljava/util/HashMap;

    .line 59
    .line 60
    monitor-exit v1

    .line 61
    goto :goto_40

    .line 62
    :catchall_3d
    move-exception p1

    .line 63
    monitor-exit v1
    :try_end_3f
    .catchall {:try_start_35 .. :try_end_3f} :catchall_3d

    .line 64
    throw p1

    .line 65
    :cond_40
    :goto_40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/4 v2, 0x0

    .line 70
    :goto_45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_62

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lax/U2/f;

    .line 81
    .line 82
    iget-object v4, p0, Lax/U2/d;->f:Ljava/lang/Object;

    .line 83
    .line 84
    monitor-enter v4

    .line 85
    :try_start_54
    iget-object v5, p0, Lax/U2/d;->e:Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-virtual {v3, v5}, Lax/U2/f;->a(Ljava/util/HashMap;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_5d

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    :cond_5d
    monitor-exit v4

    .line 95
    goto :goto_45

    .line 96
    :catchall_5f
    move-exception p1

    .line 97
    monitor-exit v4
    :try_end_61
    .catchall {:try_start_54 .. :try_end_61} :catchall_5f

    .line 98
    throw p1

    .line 99
    :cond_62
    const-string v1, "APPS_ALL"

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_7c

    .line 106
    .line 107
    if-eqz v2, :cond_7c

    .line 108
    .line 109
    iget-object v1, p0, Lax/U2/d;->f:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v1

    .line 112
    :try_start_6f
    invoke-direct {p0, v0}, Lax/U2/d;->d(Ljava/util/List;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Lax/U2/d;->e:Ljava/util/HashMap;

    .line 116
    .line 117
    invoke-direct {p0, v2}, Lax/U2/d;->g0(Ljava/util/HashMap;)V

    .line 118
    .line 119
    .line 120
    monitor-exit v1

    .line 121
    goto :goto_7c

    .line 122
    :catchall_79
    move-exception p1

    .line 123
    monitor-exit v1
    :try_end_7b
    .catchall {:try_start_6f .. :try_end_7b} :catchall_79

    .line 124
    throw p1

    .line 125
    :cond_7c
    :goto_7c
    iget-object v1, p0, Lax/U2/d;->g:Ljava/util/HashMap;

    .line 126
    .line 127
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    return-object v0
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

.method public G(Z)I
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/U2/d;->B()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_b
    invoke-static {v0}, Lax/U2/d;->h(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method public I(Z)J
    .registers 7

    .line 1
    invoke-virtual {p0}, Lax/U2/d;->B()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez p1, :cond_a

    .line 6
    .line 7
    invoke-static {v0}, Lax/U2/d;->h(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_a
    iget-object p1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {p1}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1c

    .line 18
    .line 19
    iget-object p1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {p1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p1, v0, v1}, Lax/U2/d;->i(Ljava/util/List;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    :goto_22
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_47

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lax/U2/f;

    .line 46
    .line 47
    :try_start_2e
    invoke-virtual {v2}, Lax/U2/f;->s()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2
    :try_end_32
    .catch Ljava/lang/NullPointerException; {:try_start_2e .. :try_end_32} :catch_34

    .line 51
    add-long/2addr v0, v2

    .line 52
    goto :goto_22

    .line 53
    :catch_34
    move-exception v2

    .line 54
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v4, "AHFLNULL!!:"

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3, v2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lax/Ha/b;->h()V

    .line 69
    .line 70
    .line 71
    goto :goto_22

    .line 72
    :cond_47
    return-wide v0
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

.method public J(Landroid/net/Uri;)Ljava/io/InputStream;
    .registers 4

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v1, "apk"

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_17

    .line 16
    .line 17
    iget-object p1, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lax/U2/d;->r(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_17
    const/4 p1, 0x1

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Lax/U2/d;->x(Ljava/lang/String;)Lax/U2/f;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_32

    .line 34
    .line 35
    invoke-static {p1}, Lax/U2/d;->E(Lax/U2/f;)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_32

    .line 40
    .line 41
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 42
    .line 43
    invoke-static {p1}, Lax/u3/z;->d(Landroid/graphics/Bitmap;)[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_32
    const/4 p1, 0x0

    .line 52
    return-object p1
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

.method public R(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U2/d;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public W()Z
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

.method public Z()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/U2/d;->w()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_d

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public declared-synchronized b0(Landroid/content/Intent;)V
    .registers 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/U2/d;->c:Ljava/util/List;

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->clone()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/Intent;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 14
    .line 15
    const-string v0, "APPS_BASE"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lax/Z2/b;->i(Ljava/lang/String;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/Z2/b;->b()V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_25

    .line 27
    .line 28
    iget-object v0, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 29
    .line 30
    const-string v1, "APPS_BASE"

    .line 31
    .line 32
    invoke-virtual {v0, v1, p1}, Lax/Z2/b;->n(Ljava/lang/String;Ljava/util/List;)V
    :try_end_22
    .catchall {:try_start_1 .. :try_end_22} :catchall_23

    .line 33
    .line 34
    .line 35
    goto :goto_25

    .line 36
    :catchall_23
    move-exception p1

    .line 37
    goto :goto_27

    .line 38
    :cond_25
    :goto_25
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :goto_27
    :try_start_27
    monitor-exit p0
    :try_end_28
    .catchall {:try_start_27 .. :try_end_28} :catchall_23

    .line 41
    throw p1
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

.method public e0(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lax/U2/f;->d(Ljava/lang/String;)Ljava/util/Comparator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_32

    .line 6
    .line 7
    :try_start_6
    invoke-static {p2}, Lax/U2/f;->D(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_19

    .line 12
    .line 13
    iget-object p2, p0, Lax/U2/d;->i:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p2
    :try_end_f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_f} :catch_17

    .line 16
    :try_start_f
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 17
    .line 18
    .line 19
    monitor-exit p2

    .line 20
    return-object p1

    .line 21
    :catchall_14
    move-exception v0

    .line 22
    monitor-exit p2
    :try_end_16
    .catchall {:try_start_f .. :try_end_16} :catchall_14

    .line 23
    :try_start_16
    throw v0

    .line 24
    :catch_17
    move-exception p2

    .line 25
    goto :goto_1d

    .line 26
    :cond_19
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_1c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_16 .. :try_end_1c} :catch_17

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :goto_1d
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "APPINFO SORT ERROR"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 49
    .line 50
    .line 51
    :cond_32
    return-object p1
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

.method public f()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/U2/d;->v()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_d

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i(Ljava/util/List;Z)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    goto/16 :goto_75

    .line 8
    .line 9
    :cond_8
    if-nez p1, :cond_c

    .line 10
    .line 11
    goto/16 :goto_75

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 14
    .line 15
    const-string v1, "storagestats"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lax/T2/c;->a(Ljava/lang/Object;)Landroid/app/usage/StorageStatsManager;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    goto :goto_75

    .line 28
    :cond_1b
    iget-object v1, p0, Lax/U2/d;->i:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v1

    .line 31
    :try_start_1e
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :catch_22
    :cond_22
    :goto_22
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_74

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, Lax/U2/f;

    .line 47
    .line 48
    invoke-virtual {v3}, Lax/U2/f;->C()Z

    .line 49
    .line 50
    .line 51
    move-result v2
    :try_end_33
    .catchall {:try_start_1e .. :try_end_33} :catchall_3e

    .line 52
    if-eqz v2, :cond_22

    .line 53
    .line 54
    if-nez p2, :cond_41

    .line 55
    .line 56
    :try_start_37
    invoke-virtual {v3}, Lax/U2/f;->G()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_22

    .line 61
    .line 62
    goto :goto_41

    .line 63
    :catchall_3e
    move-exception v0

    .line 64
    move-object p1, v0

    .line 65
    goto :goto_76

    .line 66
    :cond_41
    :goto_41
    invoke-static {}, Lax/T2/b;->a()Ljava/util/UUID;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3}, Lax/U2/f;->r()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v0, v2, v4, v5}, Lax/T2/d;->a(Landroid/app/usage/StorageStatsManager;Ljava/util/UUID;Ljava/lang/String;Landroid/os/UserHandle;)Landroid/app/usage/StorageStats;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {}, Lax/X2/Q;->V0()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_5f

    .line 87
    .line 88
    if-eqz v2, :cond_5f

    .line 89
    .line 90
    invoke-virtual {p0, v2}, Lax/U2/d;->C(Landroid/app/usage/StorageStats;)J

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    :goto_5d
    move-wide v10, v4

    .line 95
    goto :goto_62

    .line 96
    :cond_5f
    const-wide/16 v4, 0x0

    .line 97
    .line 98
    goto :goto_5d

    .line 99
    :goto_62
    if-eqz v2, :cond_22

    .line 100
    .line 101
    invoke-static {v2}, Lax/T2/e;->a(Landroid/app/usage/StorageStats;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    invoke-static {v2}, Lax/T2/f;->a(Landroid/app/usage/StorageStats;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    invoke-static {v2}, Lax/T2/g;->a(Landroid/app/usage/StorageStats;)J

    .line 110
    .line 111
    .line 112
    move-result-wide v8

    .line 113
    invoke-virtual/range {v3 .. v11}, Lax/U2/f;->H(JJJJ)V
    :try_end_73
    .catch Ljava/io/IOException; {:try_start_37 .. :try_end_73} :catch_22
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_37 .. :try_end_73} :catch_22
    .catch Ljava/lang/SecurityException; {:try_start_37 .. :try_end_73} :catch_22
    .catchall {:try_start_37 .. :try_end_73} :catchall_3e

    .line 114
    .line 115
    .line 116
    goto :goto_22

    .line 117
    :cond_74
    :try_start_74
    monitor-exit v1

    .line 118
    :goto_75
    return-void

    .line 119
    :goto_76
    monitor-exit v1
    :try_end_77
    .catchall {:try_start_74 .. :try_end_77} :catchall_3e

    .line 120
    throw p1
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

.method public v()Ljava/io/File;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/U2/d;->u(Landroid/content/Context;)Lax/c3/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/c3/K;->f:Lax/c3/K;

    .line 8
    .line 9
    if-ne v0, v1, :cond_13

    .line 10
    .line 11
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/Z2/j;->T()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_1b

    .line 20
    :cond_13
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lax/Z2/j;->O()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_1b
    new-instance v1, Ljava/io/File;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, "/backups/apps"

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v1
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

.method public x(Ljava/lang/String;)Lax/U2/f;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/U2/d;->d:Lax/Z2/b;

    .line 2
    .line 3
    const-string v1, "APPS_BASE"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/Z2/b;->i(Ljava/lang/String;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_33

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_33

    .line 16
    .line 17
    monitor-enter p0

    .line 18
    :try_start_11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2f

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lax/U2/f;

    .line 33
    .line 34
    invoke-virtual {v1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_15

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-object v1

    .line 46
    :catchall_2d
    move-exception p1

    .line 47
    goto :goto_31

    .line 48
    :cond_2f
    monitor-exit p0

    .line 49
    goto :goto_4a

    .line 50
    :goto_31
    monitor-exit p0
    :try_end_32
    .catchall {:try_start_11 .. :try_end_32} :catchall_2d

    .line 51
    throw p1

    .line 52
    :cond_33
    iget-object v0, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x0

    .line 59
    :try_start_3a
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_4a

    .line 64
    .line 65
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 66
    .line 67
    if-eqz v1, :cond_4a

    .line 68
    .line 69
    new-instance v1, Lax/U2/f;

    .line 70
    .line 71
    invoke-direct {v1, v0, p1}, Lax/U2/f;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V
    :try_end_49
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3a .. :try_end_49} :catch_4a

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :catch_4a
    :cond_4a
    :goto_4a
    const/4 p1, 0x0

    .line 76
    return-object p1
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

.method public y()Ljava/util/Map;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lax/U2/d$e;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/U2/d;->v()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_ac

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_17

    .line 21
    .line 22
    goto/16 :goto_ac

    .line 23
    .line 24
    :cond_17
    new-instance v2, Lax/U2/d$a;

    .line 25
    .line 26
    invoke-direct {v2, p0}, Lax/U2/d$a;-><init>(Lax/U2/d;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_24

    .line 34
    .line 35
    goto/16 :goto_ac

    .line 36
    .line 37
    :cond_24
    iget-object v2, p0, Lax/U2/d;->b:Landroid/content/Context;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    array-length v3, v1

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_2d
    if-ge v5, v3, :cond_ac

    .line 47
    .line 48
    aget-object v6, v1, v5

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-static {v7}, Lax/c3/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    new-instance v9, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v10, "-"

    .line 75
    .line 76
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    .line 80
    .line 81
    .line 82
    move-result-wide v10

    .line 83
    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    iget-object v10, p0, Lax/U2/d;->h:Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    check-cast v10, Lax/U2/d$e;

    .line 97
    .line 98
    if-nez v10, :cond_8f

    .line 99
    .line 100
    invoke-static {v7}, Lax/U2/d;->P(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_79

    .line 105
    .line 106
    invoke-static {v6}, Lcom/voxdon/xplorer/file/x;->O0(Ljava/io/File;)Lcom/voxdon/xplorer/file/y;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-static {v6}, Lax/U2/d;->m(Lax/c3/k;)Lax/U2/d$e;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    if-eqz v10, :cond_8f

    .line 115
    .line 116
    iget-object v6, p0, Lax/U2/d;->h:Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_8f

    .line 122
    :cond_79
    invoke-virtual {v2, v8, v4}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    if-eqz v6, :cond_8f

    .line 127
    .line 128
    invoke-static {v6}, Lax/U2/d;->L(Landroid/content/pm/PackageInfo;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    new-instance v10, Lax/U2/d$e;

    .line 133
    .line 134
    iget-object v6, v6, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 135
    .line 136
    invoke-direct {v10, v6, v7, v8}, Lax/U2/d$e;-><init>(Ljava/lang/String;J)V

    .line 137
    .line 138
    .line 139
    iget-object v6, p0, Lax/U2/d;->h:Ljava/util/HashMap;

    .line 140
    .line 141
    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_8f
    :goto_8f
    if-nez v10, :cond_92

    .line 145
    .line 146
    goto :goto_a9

    .line 147
    :cond_92
    iget-object v6, v10, Lax/U2/d$e;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Lax/U2/d$e;

    .line 154
    .line 155
    if-eqz v6, :cond_a4

    .line 156
    .line 157
    iget-wide v6, v6, Lax/U2/d$e;->b:J

    .line 158
    .line 159
    iget-wide v8, v10, Lax/U2/d$e;->b:J

    .line 160
    .line 161
    cmp-long v11, v6, v8

    .line 162
    .line 163
    if-gez v11, :cond_a9

    .line 164
    .line 165
    :cond_a4
    iget-object v6, v10, Lax/U2/d$e;->a:Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    :cond_a9
    :goto_a9
    add-int/lit8 v5, v5, 0x1

    .line 171
    .line 172
    goto :goto_2d

    .line 173
    :cond_ac
    :goto_ac
    return-object v0
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

.method public z(Lax/U2/f;)Ljava/io/File;
    .registers 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lax/U2/f;->q()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lax/U2/f;->x()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lax/c3/d0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Lax/U2/f;->E()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_29

    .line 38
    .line 39
    const-string p1, "apk+"

    .line 40
    .line 41
    goto :goto_35

    .line 42
    :cond_29
    invoke-virtual {p1}, Lax/U2/f;->f()Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lax/c3/d0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_35
    new-instance v1, Ljava/io/File;

    .line 55
    .line 56
    invoke-virtual {p0}, Lax/U2/d;->v()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, "."

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v1
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
