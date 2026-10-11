.class public Lax/u3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/u3/r$b;,
        Lax/u3/r$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field static final b:[Ljava/lang/String;

.field static c:Lax/u3/r$b;

.field static d:Lax/u3/r$b;


# direct methods
.method static constructor <clinit>()V
    .registers 14

    .line 1
    const-class v0, Lax/u3/r;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/u3/r;->a:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const-string v12, "/data/bin/"

    .line 10
    .line 11
    const-string v13, "/apex/com.android.runtime/bin/"

    .line 12
    .line 13
    const-string v1, "/debug_ramdisk/"

    .line 14
    .line 15
    const-string v2, "/system/bin/"

    .line 16
    .line 17
    const-string v3, "/system/xbin/"

    .line 18
    .line 19
    const-string v4, "/system/sbin/"

    .line 20
    .line 21
    const-string v5, "/sbin/"

    .line 22
    .line 23
    const-string v6, "/su/bin/"

    .line 24
    .line 25
    const-string v7, "/data/local/xbin/"

    .line 26
    .line 27
    const-string v8, "/data/local/bin/"

    .line 28
    .line 29
    const-string v9, "/system/sd/xbin/"

    .line 30
    .line 31
    const-string v10, "/system/bin/failsafe/"

    .line 32
    .line 33
    const-string v11, "/data/local/"

    .line 34
    .line 35
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lax/u3/r;->b:[Ljava/lang/String;

    .line 40
    .line 41
    return-void
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

.method static synthetic a()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lax/u3/r;->a:Ljava/util/logging/Logger;

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

.method static synthetic b(Ljava/lang/String;)Z
    .registers 1

    .line 1
    invoke-static {p0}, Lax/u3/r;->c(Ljava/lang/String;)Z

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

.method private static c(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "[+]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

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

.method public static declared-synchronized d(Ljava/lang/String;J)Ljava/util/ArrayList;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p1, Lax/u3/r;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_3
    invoke-static {}, Lax/u3/r;->e()Lax/u3/r$b;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p0}, Lax/u3/r$b;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_b
    .catch Lax/u3/r$a; {:try_start_3 .. :try_end_b} :catch_10
    .catchall {:try_start_3 .. :try_end_b} :catchall_d

    .line 12
    monitor-exit p1

    .line 13
    return-object p0

    .line 14
    :catchall_d
    move-exception p0

    .line 15
    :try_start_e
    monitor-exit p1
    :try_end_f
    .catchall {:try_start_e .. :try_end_f} :catchall_d

    .line 16
    throw p0

    .line 17
    :catch_10
    monitor-exit p1

    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
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

.method public static e()Lax/u3/r$b;
    .registers 2

    .line 1
    sget-object v0, Lax/u3/r;->c:Lax/u3/r$b;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Lax/u3/r$b;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lax/u3/r$b;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lax/u3/r;->c:Lax/u3/r$b;

    .line 12
    .line 13
    :cond_c
    sget-object v0, Lax/u3/r;->c:Lax/u3/r$b;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static f()Lax/u3/r$b;
    .registers 2

    .line 1
    sget-object v0, Lax/u3/r;->d:Lax/u3/r$b;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Lax/u3/r$b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lax/u3/r$b;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lax/u3/r;->d:Lax/u3/r$b;

    .line 12
    .line 13
    :cond_c
    sget-object v0, Lax/u3/r;->d:Lax/u3/r$b;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static g()Z
    .registers 7

    .line 1
    sget-object v0, Lax/u3/r;->b:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_5
    if-ge v3, v1, :cond_2a

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    new-instance v5, Ljava/io/File;

    .line 11
    .line 12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v4, "su"

    .line 21
    .line 22
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_27

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_27
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_5

    .line 43
    :cond_2a
    return v2
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

.method public static declared-synchronized h(Ljava/lang/String;J)Ljava/util/ArrayList;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p1, Lax/u3/r;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_3
    invoke-static {}, Lax/u3/r;->f()Lax/u3/r$b;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p0}, Lax/u3/r$b;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_b
    .catch Lax/u3/r$a; {:try_start_3 .. :try_end_b} :catch_10
    .catchall {:try_start_3 .. :try_end_b} :catchall_d

    .line 12
    monitor-exit p1

    .line 13
    return-object p0

    .line 14
    :catchall_d
    move-exception p0

    .line 15
    :try_start_e
    monitor-exit p1
    :try_end_f
    .catchall {:try_start_e .. :try_end_f} :catchall_d

    .line 16
    throw p0

    .line 17
    :catch_10
    monitor-exit p1

    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
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
