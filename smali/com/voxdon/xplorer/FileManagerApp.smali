.class public Lcom/voxdon/xplorer/FileManagerApp;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Landroidx/work/a$c;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    invoke-static {}, Lcom/voxdon/xplorer/VoxCrashHook;->install()V

    const-string v0, "APP_CONSTRUCTOR"

    invoke-static {v0}, Lcom/voxdon/xplorer/VoxCrashHook;->mark(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lcom/voxdon/xplorer/ApplicationReporter;->init(Landroid/content/Context;)V

    .line 6
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

.method public static b(Ljava/lang/String;)V
    .registers 2

    .line 1
    const-string v0, "FileManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

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
.end method


# virtual methods
.method public a()Landroidx/work/a;
    .registers 4

    .line 1
    new-instance v0, Landroidx/work/a$b;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/work/a$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x1388

    .line 7
    .line 8
    const/16 v2, 0x1b58

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroidx/work/a$b;->c(II)Landroidx/work/a$b;

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/voxdon/xplorer/FileManagerApp$a;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/FileManagerApp$a;-><init>(Lcom/voxdon/xplorer/FileManagerApp;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/work/a$b;->b(Lax/b0/a;)Landroidx/work/a$b;

    .line 19
    .line 20
    .line 21
    new-instance v1, Lcom/voxdon/xplorer/FileManagerApp$b;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/FileManagerApp$b;-><init>(Lcom/voxdon/xplorer/FileManagerApp;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroidx/work/a$b;->d(Lax/b0/a;)Landroidx/work/a$b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/work/a$b;->a()Landroidx/work/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
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

.method protected attachBaseContext(Landroid/content/Context;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lax/s3/v;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    const-string v0, "ATTACH_BASE"

    invoke-static {v0}, Lcom/voxdon/xplorer/VoxCrashHook;->mark(Ljava/lang/String;)V

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
    .line 22
.end method

.method public onCreate()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    const-string v0, "APP_ONCREATE"

    invoke-static {v0}, Lcom/voxdon/xplorer/VoxCrashHook;->mark(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lax/Q2/b;->k(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lax/Q2/b;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1e

    .line 12
    .line 13
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "ApplicationHolder Alrady Initialized"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 24
    .line 25
    .line 26
    :cond_1e
    invoke-static {}, Lax/Q2/c;->a()Z

    .line 27
    .line 28
    .line 29
    return-void
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
