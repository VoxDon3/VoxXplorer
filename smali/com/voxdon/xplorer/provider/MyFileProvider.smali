.class public Lcom/voxdon/xplorer/provider/MyFileProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/provider/MyFileProvider$c;,
        Lcom/voxdon/xplorer/provider/MyFileProvider$b;
    }
.end annotation


# static fields
.field private static final d:Ljava/util/logging/Logger;

.field private static final e:[Ljava/lang/String;

.field private static final f:[Ljava/lang/String;

.field private static g:Z

.field private static h:Lcom/voxdon/xplorer/provider/MyFileProvider;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Lcom/voxdon/xplorer/provider/a;

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/net/Uri;",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-string v0, "FileManager.MyFileProvider"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/provider/MyFileProvider;->d:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const-string v0, "_data"

    .line 10
    .line 11
    const-string v1, "_display_name"

    .line 12
    .line 13
    const-string v2, "_size"

    .line 14
    .line 15
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/voxdon/xplorer/provider/MyFileProvider;->e:[Ljava/lang/String;

    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/voxdon/xplorer/provider/MyFileProvider;->f:[Ljava/lang/String;

    .line 26
    .line 27
    return-void
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

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->a:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    return-void
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
.end method

.method public static A(Landroid/net/Uri;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.voxdon.xplorer.fileprovider"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_e
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->i()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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
.end method

.method public static B(Landroid/net/Uri;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.voxdon.xplorer.fileprovider"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_e
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->k()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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
.end method

.method public static C(Landroid/net/Uri;)Z
    .registers 2

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->D(Landroid/net/Uri;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_16

    .line 6
    .line 7
    const-string v0, "motion_photo"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "1"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_16

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_16
    const/4 p0, 0x0

    .line 24
    return p0
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

.method public static D(Landroid/net/Uri;)Z
    .registers 2

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_4
    const-string v0, "com.voxdon.xplorer.fileprovider"

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static E(Landroid/net/Uri;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.voxdon.xplorer.fileprovider"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_e
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->l()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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
.end method

.method private static F(Ljava/lang/String;)I
    .registers 4

    .line 1
    const-string v0, "r"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    const/high16 p0, 0x10000000

    .line 10
    .line 11
    return p0

    .line 12
    :cond_b
    const-string v0, "w"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_54

    .line 19
    .line 20
    const-string v0, "wt"

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1c

    .line 27
    .line 28
    goto :goto_54

    .line 29
    :cond_1c
    const-string v0, "wa"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_27

    .line 36
    .line 37
    const/high16 p0, 0x2a000000

    .line 38
    .line 39
    return p0

    .line 40
    :cond_27
    const-string v0, "rw"

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_32

    .line 47
    .line 48
    const/high16 p0, 0x38000000

    .line 49
    .line 50
    return p0

    .line 51
    :cond_32
    const-string v0, "rwt"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3d

    .line 58
    .line 59
    const/high16 p0, 0x3c000000    # 0.0078125f

    .line 60
    .line 61
    return p0

    .line 62
    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v2, "Invalid mode: "

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_54
    :goto_54
    const/high16 p0, 0x2c000000

    .line 86
    .line 87
    return p0
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

.method private G(Ljava/io/File;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->F(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    :try_start_4
    invoke-static {}, Lax/o3/b;->j()Lax/o3/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/o3/b;->k()Lax/o3/b$d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1}, Lax/o3/b$d;->b(Ljava/io/File;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->a:Landroid/os/Handler;

    .line 17
    .line 18
    new-instance v2, Lcom/voxdon/xplorer/provider/MyFileProvider$a;

    .line 19
    .line 20
    invoke-direct {v2, p0, v0, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$a;-><init>(Lcom/voxdon/xplorer/provider/MyFileProvider;Lax/o3/b$d;Ljava/io/File;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2, v1, v2}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;ILandroid/os/Handler;Landroid/os/ParcelFileDescriptor$OnCloseListener;)Landroid/os/ParcelFileDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_1a} :catch_1b

    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception p1

    .line 29
    new-instance p2, Ljava/io/FileNotFoundException;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p2
    .line 39
    .line 40
    .line 41
.end method

.method private H(Lcom/voxdon/xplorer/provider/MyFileProvider$c;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->F(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d()Lax/Z2/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_21

    .line 10
    .line 11
    :try_start_a
    invoke-direct {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->q()Lcom/voxdon/xplorer/provider/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/voxdon/xplorer/provider/a;->b(Lax/Z2/k;I)Landroid/os/ParcelFileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_12} :catch_13

    .line 19
    return-object p1

    .line 20
    :catch_13
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    new-instance p2, Ljava/io/FileNotFoundException;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p2

    .line 34
    :cond_21
    const-string p1, "location uri is not valid"

    .line 35
    .line 36
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, Ljava/io/FileNotFoundException;

    .line 40
    .line 41
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p2
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
.end method

.method private b([Ljava/lang/String;)Landroid/database/MatrixCursor;
    .registers 4

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    sget-object p1, Lcom/voxdon/xplorer/provider/MyFileProvider;->f:[Ljava/lang/String;

    .line 4
    .line 5
    :cond_4
    new-instance v0, Landroid/database/MatrixCursor;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p1, v1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method private c([Ljava/lang/String;Lcom/voxdon/xplorer/file/n;)Landroid/database/MatrixCursor;
    .registers 11

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    sget-object p1, Lcom/voxdon/xplorer/provider/MyFileProvider;->f:[Ljava/lang/String;

    .line 4
    .line 5
    :cond_4
    array-length v0, p1

    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    array-length v1, p1

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    array-length v2, p1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_d
    if-ge v3, v2, :cond_62

    .line 15
    .line 16
    aget-object v5, p1, v3

    .line 17
    .line 18
    const-string v6, "_display_name"

    .line 19
    .line 20
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-eqz v7, :cond_25

    .line 25
    .line 26
    aput-object v6, v0, v4

    .line 27
    .line 28
    add-int/lit8 v5, v4, 0x1

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    aput-object v6, v1, v4

    .line 35
    .line 36
    :goto_23
    move v4, v5

    .line 37
    goto :goto_5f

    .line 38
    :cond_25
    const-string v6, "_size"

    .line 39
    .line 40
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_3c

    .line 45
    .line 46
    aput-object v6, v0, v4

    .line 47
    .line 48
    add-int/lit8 v5, v4, 0x1

    .line 49
    .line 50
    invoke-interface {p2}, Lax/c3/b;->p()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    aput-object v6, v1, v4

    .line 59
    .line 60
    goto :goto_23

    .line 61
    :cond_3c
    const-string v6, "mime_type"

    .line 62
    .line 63
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_4f

    .line 68
    .line 69
    aput-object v6, v0, v4

    .line 70
    .line 71
    add-int/lit8 v5, v4, 0x1

    .line 72
    .line 73
    invoke-interface {p2}, Lax/c3/b;->s()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    aput-object v6, v1, v4

    .line 78
    .line 79
    goto :goto_23

    .line 80
    :cond_4f
    const-string v6, "_data"

    .line 81
    .line 82
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_5f

    .line 87
    .line 88
    aput-object v6, v0, v4

    .line 89
    .line 90
    add-int/lit8 v5, v4, 0x1

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    aput-object v6, v1, v4

    .line 94
    .line 95
    goto :goto_23

    .line 96
    :cond_5f
    :goto_5f
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_d

    .line 99
    :cond_62
    invoke-static {v0, v4}, Lcom/voxdon/xplorer/provider/MyFileProvider;->g([Ljava/lang/String;I)[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v1, v4}, Lcom/voxdon/xplorer/provider/MyFileProvider;->f([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    new-instance v0, Landroid/database/MatrixCursor;

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    invoke-direct {v0, p1, v1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object v0
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

.method private d(Landroid/net/Uri;[Ljava/lang/String;)Landroid/database/MatrixCursor;
    .registers 15

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    sget-object p2, Lcom/voxdon/xplorer/provider/MyFileProvider;->f:[Ljava/lang/String;

    .line 4
    .line 5
    :cond_4
    array-length v0, p2

    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    array-length v1, p2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "length"

    .line 16
    .line 17
    invoke-static {p1, v3}, Lcom/voxdon/xplorer/provider/MyFileProvider;->o(Landroid/net/Uri;Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    array-length v5, p2

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_17
    if-ge v6, v5, :cond_80

    .line 25
    .line 26
    aget-object v8, p2, v6

    .line 27
    .line 28
    const-string v9, "_display_name"

    .line 29
    .line 30
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_47

    .line 35
    .line 36
    aput-object v9, v0, v7

    .line 37
    .line 38
    add-int/lit8 v8, v7, 0x1

    .line 39
    .line 40
    new-instance v9, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v10, Ljava/io/File;

    .line 46
    .line 47
    iget-object v11, v2, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v10, ".mp4"

    .line 60
    .line 61
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    aput-object v9, v1, v7

    .line 69
    .line 70
    :goto_45
    move v7, v8

    .line 71
    goto :goto_7d

    .line 72
    :cond_47
    const-string v9, "_size"

    .line 73
    .line 74
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v10, :cond_5a

    .line 79
    .line 80
    aput-object v9, v0, v7

    .line 81
    .line 82
    add-int/lit8 v8, v7, 0x1

    .line 83
    .line 84
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    aput-object v9, v1, v7

    .line 89
    .line 90
    goto :goto_45

    .line 91
    :cond_5a
    const-string v9, "mime_type"

    .line 92
    .line 93
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_6d

    .line 98
    .line 99
    aput-object v9, v0, v7

    .line 100
    .line 101
    add-int/lit8 v8, v7, 0x1

    .line 102
    .line 103
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->n(Landroid/net/Uri;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    aput-object v9, v1, v7

    .line 108
    .line 109
    goto :goto_45

    .line 110
    :cond_6d
    const-string v9, "_data"

    .line 111
    .line 112
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_7d

    .line 117
    .line 118
    aput-object v9, v0, v7

    .line 119
    .line 120
    add-int/lit8 v8, v7, 0x1

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    aput-object v9, v1, v7

    .line 124
    .line 125
    goto :goto_45

    .line 126
    :cond_7d
    :goto_7d
    add-int/lit8 v6, v6, 0x1

    .line 127
    .line 128
    goto :goto_17

    .line 129
    :cond_80
    new-instance p1, Landroid/database/MatrixCursor;

    .line 130
    .line 131
    invoke-static {v0, v7}, Lcom/voxdon/xplorer/provider/MyFileProvider;->g([Ljava/lang/String;I)[Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    const/4 v0, 0x1

    .line 136
    invoke-direct {p1, p2, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1, v7}, Lcom/voxdon/xplorer/provider/MyFileProvider;->f([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p1, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object p1
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

.method public static e(Landroid/net/Uri;)Lax/Z2/k;
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.voxdon.xplorer.fileprovider"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_e
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d()Lax/Z2/k;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method

.method private static f([Ljava/lang/Object;I)[Ljava/lang/Object;
    .registers 4

    .line 1
    new-array v0, p1, [Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    .line 6
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

.method private static g([Ljava/lang/String;I)[Ljava/lang/String;
    .registers 4

    .line 1
    new-array v0, p1, [Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    .line 6
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

.method private h(Lcom/voxdon/xplorer/provider/MyFileProvider$c;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->e()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2e

    .line 6
    .line 7
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_26

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    :try_start_11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_1d
    .catchall {:try_start_11 .. :try_end_1d} :catchall_21

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_21
    move-exception p1

    .line 35
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_26
    new-instance p1, Lax/b3/j;

    .line 40
    .line 41
    const-string v0, "Not connected"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2e
    new-instance p1, Lax/b3/j;

    .line 48
    .line 49
    const-string v0, "Bad Uri"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static i(Landroid/net/Uri;)Landroid/net/Uri;
    .registers 2

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 10
    .line 11
    .line 12
    const-string v0, "external_files"

    .line 13
    .line 14
    iget-object p0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
.end method

.method private j(Lcom/voxdon/xplorer/provider/MyFileProvider$c;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->e()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_79

    .line 6
    .line 7
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_5a

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lax/Q2/f;->e0(Lax/Q2/f;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const-string v2, "Not connected"

    .line 26
    .line 27
    if-nez v1, :cond_49

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Lax/Q2/f;->o0(Lax/Q2/f;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_27

    .line 38
    .line 39
    goto :goto_49

    .line 40
    :cond_27
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string p2, "not document location?"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Lax/b3/h;

    .line 69
    .line 70
    invoke-direct {p1, v2}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_49
    :goto_49
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->h(Lcom/voxdon/xplorer/file/c$a;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_54

    .line 83
    .line 84
    goto :goto_5a

    .line 85
    :cond_54
    new-instance p1, Lax/b3/h;

    .line 86
    .line 87
    invoke-direct {p1, v2}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_5a
    :goto_5a
    const/4 v1, 0x0

    .line 92
    :try_start_5b
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 93
    .line 94
    .line 95
    iget-object p1, p1, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {v2, p1, p2}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 110
    .line 111
    .line 112
    move-result-object p1
    :try_end_70
    .catchall {:try_start_5b .. :try_end_70} :catchall_74

    .line 113
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :catchall_74
    move-exception p1

    .line 118
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_79
    new-instance p1, Lax/b3/j;

    .line 123
    .line 124
    const-string p2, "Bad Uri"

    .line 125
    .line 126
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1
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

.method private static k(Lcom/voxdon/xplorer/provider/MyFileProvider$c;)Lcom/voxdon/xplorer/file/n;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_27

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_27

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ":"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->e()Lax/c3/K;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_52

    .line 45
    .line 46
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4a

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    :try_start_38
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_41
    .catchall {:try_start_38 .. :try_end_41} :catchall_45

    .line 66
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :catchall_45
    move-exception p0

    .line 71
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_4a
    new-instance p0, Lax/b3/j;

    .line 76
    .line 77
    const-string v0, "Not connected"

    .line 78
    .line 79
    invoke-direct {p0, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_52
    new-instance p0, Lax/b3/j;

    .line 84
    .line 85
    const-string v0, "Bad Uri"

    .line 86
    .line 87
    invoke-direct {p0, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0
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

.method public static l()Lcom/voxdon/xplorer/provider/MyFileProvider;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/provider/MyFileProvider;->h:Lcom/voxdon/xplorer/provider/MyFileProvider;

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

.method public static m(Landroid/net/Uri;)Ljava/io/File;
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

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

.method private static n(Landroid/net/Uri;)Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "mimetype"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_d
    const-string p0, "video/mp4"

    .line 15
    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static o(Landroid/net/Uri;Ljava/lang/String;)J
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    if-nez p0, :cond_9

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_9
    :try_start_9
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0
    :try_end_d
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_d} :catch_e

    .line 14
    return-wide p0

    .line 15
    :catch_e
    return-wide v0
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

.method public static p(Lcom/voxdon/xplorer/file/n;JJLjava/lang/String;)Landroid/net/Uri;
    .registers 9

    .line 1
    invoke-static {p0}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4a

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v2, p1, v0

    .line 10
    .line 11
    if-ltz v2, :cond_4a

    .line 12
    .line 13
    cmp-long v2, p3, v0

    .line 14
    .line 15
    if-lez v2, :cond_4a

    .line 16
    .line 17
    instance-of v0, p0, Lcom/voxdon/xplorer/file/y;

    .line 18
    .line 19
    if-eqz v0, :cond_1b

    .line 20
    .line 21
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 22
    .line 23
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->t(Lcom/voxdon/xplorer/file/y;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_1f

    .line 28
    :cond_1b
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->g(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_1f
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v0, "motion_photo"

    .line 37
    .line 38
    const-string v1, "1"

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "offset"

    .line 45
    .line 46
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, v0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "length"

    .line 55
    .line 56
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "mimetype"

    .line 65
    .line 66
    invoke-virtual {p0, p1, p5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_4a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string p1, "Invalid Motion Photo video range"

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0
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

.method private q()Lcom/voxdon/xplorer/provider/a;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->b:Lcom/voxdon/xplorer/provider/a;

    .line 5
    .line 6
    return-object v0
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

.method public static r(Lcom/voxdon/xplorer/file/i;)Landroid/net/Uri;
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->g(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

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

.method public static s(Ljava/io/File;)Landroid/net/Uri;
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "root"

    .line 6
    .line 7
    invoke-static {v0, p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public static t(Lcom/voxdon/xplorer/file/y;)Landroid/net/Uri;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->s(Ljava/io/File;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

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

.method private static u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "/"

    .line 14
    .line 15
    invoke-static {p1, p0}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Landroid/net/Uri$Builder;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/net/Uri$Builder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v0, "content"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "com.voxdon.xplorer.fileprovider"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, p0}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
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

.method public static v(Lcom/voxdon/xplorer/file/y;)Landroid/net/Uri;
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->h(Lcom/voxdon/xplorer/file/y;)Landroid/net/Uri;

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

.method public static w(Lcom/voxdon/xplorer/file/y;)Landroid/net/Uri;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->s(Ljava/io/File;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

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

.method public static x(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;
    .registers 3

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->g(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/voxdon/xplorer/provider/MyFileProvider;->h:Lcom/voxdon/xplorer/provider/MyFileProvider;

    .line 6
    .line 7
    if-eqz v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {v1, v0, p0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->a(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    return-object v0
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

.method public static y(Landroid/content/Context;)V
    .registers 4

    .line 1
    if-eqz p0, :cond_16

    .line 2
    .line 3
    sget-boolean v0, Lcom/voxdon/xplorer/provider/MyFileProvider;->g:Z

    .line 4
    .line 5
    if-nez v0, :cond_16

    .line 6
    .line 7
    :try_start_6
    const-string v0, "content://com.voxdon.xplorer.fileprovider/"

    .line 8
    .line 9
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "com.android.systemui"

    .line 14
    .line 15
    const/16 v2, 0x81

    .line 16
    .line 17
    invoke-virtual {p0, v1, v0, v2}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    sput-boolean p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->g:Z
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_16} :catch_16

    .line 22
    .line 23
    :catch_16
    :cond_16
    return-void
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
.end method


# virtual methods
.method a(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    .line 5
    .line 6
    if-nez p1, :cond_14

    .line 7
    .line 8
    iget-boolean p1, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    .line 9
    .line 10
    if-eqz p1, :cond_c

    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    new-instance p1, Ljava/lang/SecurityException;

    .line 14
    .line 15
    const-string p2, "Provider must grant uri permissions"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_14
    new-instance p1, Ljava/lang/SecurityException;

    .line 22
    .line 23
    const-string p2, "Provider must not be exported"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .registers 4

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->k()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_13

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_13
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->l()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 p3, 0x0

    .line 25
    if-eqz p2, :cond_30

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "PROXY FILE DELETE REQUESTED"

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 46
    .line 47
    .line 48
    return p3

    .line 49
    :cond_30
    :try_start_30
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->h(Lcom/voxdon/xplorer/provider/MyFileProvider$c;)V
    :try_end_33
    .catch Lax/b3/j; {:try_start_30 .. :try_end_33} :catch_35

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :catch_35
    return p3
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

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->C(Landroid/net/Uri;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->n(Landroid/net/Uri;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->f()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .registers 3

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "No external inserts"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
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
.end method

.method public onCreate()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/b;->k(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    sput-object p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->h:Lcom/voxdon/xplorer/provider/MyFileProvider;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0
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

.method public openAssetFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->C(Landroid/net/Uri;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->openAssetFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    const-string v0, "r"

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_76

    .line 19
    .line 20
    const-string p2, "offset"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->o(Landroid/net/Uri;Ljava/lang/String;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    const-string p2, "length"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->o(Landroid/net/Uri;Ljava/lang/String;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    cmp-long p2, v3, v1

    .line 35
    .line 36
    if-ltz p2, :cond_6e

    .line 37
    .line 38
    cmp-long p2, v5, v1

    .line 39
    .line 40
    if-lez p2, :cond_6e

    .line 41
    .line 42
    const-wide v7, 0x7fffffffffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    sub-long/2addr v7, v5

    .line 48
    cmp-long p2, v3, v7

    .line 49
    .line 50
    if-gtz p2, :cond_6e

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_66

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    cmp-long p2, v7, v1

    .line 75
    .line 76
    if-ltz p2, :cond_5f

    .line 77
    .line 78
    add-long v0, v3, v5

    .line 79
    .line 80
    cmp-long p2, v0, v7

    .line 81
    .line 82
    if-gtz p2, :cond_54

    .line 83
    .line 84
    goto :goto_5f

    .line 85
    :cond_54
    :try_start_54
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_57
    .catch Ljava/io/IOException; {:try_start_54 .. :try_end_57} :catch_57

    .line 86
    .line 87
    .line 88
    :catch_57
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 89
    .line 90
    const-string p2, "Motion Photo video range exceeds file size"

    .line 91
    .line 92
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_5f
    :goto_5f
    new-instance v1, Landroid/content/res/AssetFileDescriptor;

    .line 97
    .line 98
    move-object v2, p1

    .line 99
    invoke-direct/range {v1 .. v6}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_66
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 104
    .line 105
    const-string p2, "Unable to open Motion Photo"

    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_6e
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 112
    .line 113
    const-string p2, "Invalid Motion Photo video range"

    .line 114
    .line 115
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :cond_76
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 120
    .line 121
    const-string p2, "Motion Photo is read-only"

    .line 122
    .line 123
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
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

.method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Lax/Q2/b;->f(Landroid/content/Context;Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->C(Landroid/net/Uri;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_131

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_24

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->G(Ljava/io/File;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->k()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz v0, :cond_93

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :try_start_33
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/voxdon/xplorer/file/y;
    :try_end_3d
    .catch Lax/b3/j; {:try_start_33 .. :try_end_3d} :catch_52
    .catch Ljava/lang/SecurityException; {:try_start_33 .. :try_end_3d} :catch_84

    .line 61
    .line 62
    if-eqz v0, :cond_54

    .line 63
    .line 64
    :try_start_3f
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_54

    .line 69
    .line 70
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/shizuku/c;->w(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :catch_52
    move-exception p1

    .line 84
    goto :goto_8a

    .line 85
    :cond_54
    if-eqz v0, :cond_7a

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_7a

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_7a

    .line 98
    .line 99
    invoke-static {v0}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2, v0, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v0, :cond_79

    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->dup()Landroid/os/ParcelFileDescriptor;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_79
    return-object v1

    .line 123
    :cond_7a
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->G(Ljava/io/File;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 124
    .line 125
    .line 126
    move-result-object p1
    :try_end_7e
    .catch Lax/b3/r; {:try_start_3f .. :try_end_7e} :catch_7f
    .catch Ljava/io/IOException; {:try_start_3f .. :try_end_7e} :catch_7f
    .catch Lax/b3/j; {:try_start_3f .. :try_end_7e} :catch_52
    .catch Ljava/lang/SecurityException; {:try_start_3f .. :try_end_7e} :catch_84

    .line 127
    return-object p1

    .line 128
    :catch_7f
    :try_start_7f
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->G(Ljava/io/File;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_83
    .catch Lax/b3/j; {:try_start_7f .. :try_end_83} :catch_52
    .catch Ljava/lang/SecurityException; {:try_start_7f .. :try_end_83} :catch_84

    .line 132
    return-object p1

    .line 133
    :catch_84
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/io/FileNotFoundException;-><init>()V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :goto_8a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 143
    .line 144
    invoke-direct {p1}, Ljava/io/FileNotFoundException;-><init>()V

    .line 145
    .line 146
    .line 147
    throw p1

    .line 148
    :cond_93
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->l()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_af

    .line 153
    .line 154
    invoke-static {}, Lax/X2/Q;->t1()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_a4

    .line 159
    .line 160
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->H(Lcom/voxdon/xplorer/provider/MyFileProvider$c;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_a4
    const-string p1, "API VERSION NOT SUPPORTED"

    .line 166
    .line 167
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance p2, Ljava/io/FileNotFoundException;

    .line 171
    .line 172
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p2

    .line 176
    :cond_af
    :try_start_af
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->j(Lcom/voxdon/xplorer/provider/MyFileProvider$c;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-eqz v0, :cond_be

    .line 181
    .line 182
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->dup()Landroid/os/ParcelFileDescriptor;

    .line 183
    .line 184
    .line 185
    move-result-object p1
    :try_end_b9
    .catch Lax/b3/j; {:try_start_af .. :try_end_b9} :catch_bc
    .catch Ljava/io/IOException; {:try_start_af .. :try_end_b9} :catch_ba

    .line 186
    return-object p1

    .line 187
    :catch_ba
    move-exception p1

    .line 188
    goto :goto_bf

    .line 189
    :catch_bc
    move-exception v0

    .line 190
    goto :goto_c9

    .line 191
    :cond_be
    return-object v1

    .line 192
    :goto_bf
    new-instance p2, Ljava/io/FileNotFoundException;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p2

    .line 202
    :goto_c9
    instance-of v1, v0, Lax/b3/t;

    .line 203
    .line 204
    if-nez v1, :cond_118

    .line 205
    .line 206
    instance-of v1, v0, Lax/b3/h;

    .line 207
    .line 208
    if-eqz v1, :cond_d2

    .line 209
    .line 210
    goto :goto_118

    .line 211
    :cond_d2
    instance-of v1, v0, Lax/b3/r;

    .line 212
    .line 213
    if-eqz v1, :cond_103

    .line 214
    .line 215
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v2, "MyFileProvider error 1"

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v3, "uri:"

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-object v3, p1, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v1, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 257
    .line 258
    .line 259
    goto :goto_118

    .line 260
    :cond_103
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const-string v2, "MyFileProvider error 2"

    .line 269
    .line 270
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 279
    .line 280
    .line 281
    :cond_118
    :goto_118
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->j()Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_127

    .line 286
    .line 287
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c()Ljava/io/File;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->G(Ljava/io/File;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    return-object p1

    .line 296
    :cond_127
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw p1

    .line 306
    :cond_131
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 307
    .line 308
    const-string p2, "Motion Photo must be opened as an asset file"

    .line 309
    .line 310
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p1
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

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .registers 13

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/4 p4, 0x0

    .line 6
    invoke-static {p3, p4}, Lax/Q2/b;->f(Landroid/content/Context;Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->C(Landroid/net/Uri;)Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-eqz p3, :cond_13

    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->d(Landroid/net/Uri;[Ljava/lang/String;)Landroid/database/MatrixCursor;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_13
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->b(Landroid/net/Uri;)Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-virtual {p3}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->k()Z

    .line 25
    .line 26
    .line 27
    move-result p5

    .line 28
    const/4 v0, 0x1

    .line 29
    if-eqz p5, :cond_b3

    .line 30
    .line 31
    invoke-virtual {p3}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->c()Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 36
    .line 37
    .line 38
    move-result-object p5

    .line 39
    :try_start_26
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p5, v1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 44
    .line 45
    .line 46
    move-result-object p5

    .line 47
    check-cast p5, Lcom/voxdon/xplorer/file/y;

    .line 48
    .line 49
    invoke-virtual {p5}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 50
    .line 51
    .line 52
    move-result p5
    :try_end_34
    .catch Lax/b3/j; {:try_start_26 .. :try_end_34} :catch_36

    .line 53
    xor-int/2addr p5, v0

    .line 54
    goto :goto_38

    .line 55
    :catch_36
    nop

    .line 56
    const/4 p5, 0x1

    .line 57
    :goto_38
    if-nez p2, :cond_41

    .line 58
    .line 59
    if-eqz p5, :cond_3f

    .line 60
    .line 61
    sget-object p2, Lcom/voxdon/xplorer/provider/MyFileProvider;->e:[Ljava/lang/String;

    .line 62
    .line 63
    goto :goto_41

    .line 64
    :cond_3f
    sget-object p2, Lcom/voxdon/xplorer/provider/MyFileProvider;->f:[Ljava/lang/String;

    .line 65
    .line 66
    :cond_41
    :goto_41
    array-length p5, p2

    .line 67
    new-array p5, p5, [Ljava/lang/String;

    .line 68
    .line 69
    array-length v1, p2

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    .line 71
    .line 72
    array-length v2, p2

    .line 73
    const/4 v3, 0x0

    .line 74
    :goto_49
    if-ge p4, v2, :cond_a2

    .line 75
    .line 76
    aget-object v4, p2, p4

    .line 77
    .line 78
    const-string v5, "_display_name"

    .line 79
    .line 80
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_61

    .line 85
    .line 86
    aput-object v5, p5, v3

    .line 87
    .line 88
    add-int/lit8 v4, v3, 0x1

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    aput-object v5, v1, v3

    .line 95
    .line 96
    :goto_5f
    move v3, v4

    .line 97
    goto :goto_9f

    .line 98
    :cond_61
    const-string v5, "_size"

    .line 99
    .line 100
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_78

    .line 105
    .line 106
    aput-object v5, p5, v3

    .line 107
    .line 108
    add-int/lit8 v4, v3, 0x1

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    aput-object v5, v1, v3

    .line 119
    .line 120
    goto :goto_5f

    .line 121
    :cond_78
    const-string v5, "_data"

    .line 122
    .line 123
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_8c

    .line 128
    .line 129
    aput-object v5, p5, v3

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    add-int/lit8 v5, v3, 0x1

    .line 136
    .line 137
    aput-object v4, v1, v3

    .line 138
    .line 139
    move v3, v5

    .line 140
    goto :goto_9f

    .line 141
    :cond_8c
    const-string v5, "mime_type"

    .line 142
    .line 143
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_9f

    .line 148
    .line 149
    aput-object v5, p5, v3

    .line 150
    .line 151
    add-int/lit8 v4, v3, 0x1

    .line 152
    .line 153
    invoke-virtual {p3}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->f()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    aput-object v5, v1, v3

    .line 158
    .line 159
    goto :goto_5f

    .line 160
    :cond_9f
    :goto_9f
    add-int/lit8 p4, p4, 0x1

    .line 161
    .line 162
    goto :goto_49

    .line 163
    :cond_a2
    invoke-static {p5, v3}, Lcom/voxdon/xplorer/provider/MyFileProvider;->g([Ljava/lang/String;I)[Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {v1, v3}, Lcom/voxdon/xplorer/provider/MyFileProvider;->f([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    new-instance p3, Landroid/database/MatrixCursor;

    .line 172
    .line 173
    invoke-direct {p3, p1, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p3, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p3

    .line 180
    :cond_b3
    invoke-virtual {p3}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->l()Z

    .line 181
    .line 182
    .line 183
    move-result p5

    .line 184
    if-eqz p5, :cond_ec

    .line 185
    .line 186
    iget-object p5, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->c:Ljava/util/HashMap;

    .line 187
    .line 188
    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 193
    .line 194
    if-eqz p1, :cond_c8

    .line 195
    .line 196
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->c([Ljava/lang/String;Lcom/voxdon/xplorer/file/n;)Landroid/database/MatrixCursor;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    return-object p1

    .line 201
    :cond_c8
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 204
    .line 205
    .line 206
    new-instance p5, Lcom/voxdon/xplorer/provider/MyFileProvider$b;

    .line 207
    .line 208
    invoke-direct {p5, p3, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$b;-><init>(Lcom/voxdon/xplorer/provider/MyFileProvider$c;Ljava/util/concurrent/CountDownLatch;)V

    .line 209
    .line 210
    .line 211
    new-array p3, p4, [Ljava/lang/Void;

    .line 212
    .line 213
    invoke-virtual {p5, p3}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 214
    .line 215
    .line 216
    :try_start_d7
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_da
    .catch Ljava/lang/InterruptedException; {:try_start_d7 .. :try_end_da} :catch_db

    .line 217
    .line 218
    .line 219
    goto :goto_dc

    .line 220
    :catch_db
    nop

    .line 221
    :goto_dc
    invoke-virtual {p5}, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->x()Lcom/voxdon/xplorer/file/n;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-eqz p1, :cond_e7

    .line 226
    .line 227
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->c([Ljava/lang/String;Lcom/voxdon/xplorer/file/n;)Landroid/database/MatrixCursor;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    return-object p1

    .line 232
    :cond_e7
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/provider/MyFileProvider;->b([Ljava/lang/String;)Landroid/database/MatrixCursor;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    return-object p1

    .line 237
    :cond_ec
    :try_start_ec
    invoke-static {p3}, Lcom/voxdon/xplorer/provider/MyFileProvider;->k(Lcom/voxdon/xplorer/provider/MyFileProvider$c;)Lcom/voxdon/xplorer/file/n;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->c([Ljava/lang/String;Lcom/voxdon/xplorer/file/n;)Landroid/database/MatrixCursor;

    .line 242
    .line 243
    .line 244
    move-result-object p1
    :try_end_f4
    .catch Lax/b3/j; {:try_start_ec .. :try_end_f4} :catch_f5

    .line 245
    return-object p1

    .line 246
    :catch_f5
    move-exception p1

    .line 247
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 248
    .line 249
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    throw p2
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
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .registers 5

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "No external updates"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
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

.method public declared-synchronized z()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->b:Lcom/voxdon/xplorer/provider/a;

    .line 3
    .line 4
    if-nez v0, :cond_13

    .line 5
    .line 6
    new-instance v0, Lcom/voxdon/xplorer/provider/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lcom/voxdon/xplorer/provider/a;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider;->b:Lcom/voxdon/xplorer/provider/a;
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :catchall_11
    move-exception v0

    .line 19
    goto :goto_15

    .line 20
    :cond_13
    :goto_13
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :goto_15
    :try_start_15
    monitor-exit p0
    :try_end_16
    .catchall {:try_start_15 .. :try_end_16} :catchall_11

    .line 23
    throw v0
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
.end method
