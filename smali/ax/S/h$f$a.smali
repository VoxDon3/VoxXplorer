.class Lax/S/h$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/S/h$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Ljava/lang/reflect/Method;

.field private static c:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/S/h$f$a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
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

.method static a(Landroid/content/res/Resources$Theme;)V
    .registers 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/S/h$f$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-boolean v1, Lax/S/h$f$a;->c:Z
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_17

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_23

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_9
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    const-string v4, "rebase"

    .line 13
    .line 14
    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sput-object v3, Lax/S/h$f$a;->b:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_16
    .catch Ljava/lang/NoSuchMethodException; {:try_start_9 .. :try_end_16} :catch_19
    .catchall {:try_start_9 .. :try_end_16} :catchall_17

    .line 21
    .line 22
    .line 23
    goto :goto_21

    .line 24
    :catchall_17
    move-exception p0

    .line 25
    goto :goto_39

    .line 26
    :catch_19
    move-exception v3

    .line 27
    :try_start_1a
    const-string v4, "ResourcesCompat"

    .line 28
    .line 29
    const-string v5, "Failed to retrieve rebase() method"

    .line 30
    .line 31
    invoke-static {v4, v5, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    :goto_21
    sput-boolean v1, Lax/S/h$f$a;->c:Z

    .line 35
    .line 36
    :cond_23
    sget-object v1, Lax/S/h$f$a;->b:Ljava/lang/reflect/Method;
    :try_end_25
    .catchall {:try_start_1a .. :try_end_25} :catchall_17

    .line 37
    .line 38
    if-eqz v1, :cond_37

    .line 39
    .line 40
    :try_start_27
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2a
    .catch Ljava/lang/IllegalAccessException; {:try_start_27 .. :try_end_2a} :catch_2d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_27 .. :try_end_2a} :catch_2b
    .catchall {:try_start_27 .. :try_end_2a} :catchall_17

    .line 41
    .line 42
    .line 43
    goto :goto_37

    .line 44
    :catch_2b
    move-exception p0

    .line 45
    goto :goto_2e

    .line 46
    :catch_2d
    move-exception p0

    .line 47
    :goto_2e
    :try_start_2e
    const-string v1, "ResourcesCompat"

    .line 48
    .line 49
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 50
    .line 51
    invoke-static {v1, v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    sput-object v2, Lax/S/h$f$a;->b:Ljava/lang/reflect/Method;

    .line 55
    .line 56
    :cond_37
    :goto_37
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_39
    monitor-exit v0
    :try_end_3a
    .catchall {:try_start_2e .. :try_end_3a} :catchall_17

    .line 59
    throw p0
    .line 60
    .line 61
.end method
