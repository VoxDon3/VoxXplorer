.class public final Lcom/voxdon/xplorer/VoxCrashHook;
.super Ljava/lang/Object;
.source "VoxCrashHook.java"


# static fields
.field private static volatile sInstalled:Z


# direct methods
.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static install()V
    .registers 2

    sget-boolean v0, Lcom/voxdon/xplorer/VoxCrashHook;->sInstalled:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    sput-boolean v0, Lcom/voxdon/xplorer/VoxCrashHook;->sInstalled:Z

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    new-instance v1, Lcom/voxdon/xplorer/VoxCrashHook$Handler;

    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/VoxCrashHook$Handler;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    const-string v0, "HOOK_INSTALLED"

    invoke-static {v0}, Lcom/voxdon/xplorer/VoxCrashHook;->mark(Ljava/lang/String;)V

    return-void
.end method

.method public static mark(Ljava/lang/String;)V
    .registers 4

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/voxdon/xplorer/VoxCrashHook;->write(Ljava/lang/String;)V
    :try_end_20
    .catchall {:try_start_0 .. :try_end_20} :catchall_20

    :catchall_20
    return-void
.end method

.method private static tryWrite(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 5

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_e
    new-instance v1, Ljava/io/FileOutputStream;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1e
    .catchall {:try_start_0 .. :try_end_1e} :catchall_20

    const/4 v0, 0x1

    return v0

    :catchall_20
    const/4 v0, 0x0

    return v0
.end method

.method public static write(Ljava/lang/String;)V
    .registers 4

    const-string v0, "/storage/emulated/0/Android/media/com.voxdon.xplorer/crash.txt"

    invoke-static {v0, p0}, Lcom/voxdon/xplorer/VoxCrashHook;->tryWrite(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v0, "/storage/emulated/0/Download/vox_crash.txt"

    invoke-static {v0, p0}, Lcom/voxdon/xplorer/VoxCrashHook;->tryWrite(Ljava/lang/String;Ljava/lang/String;)Z

    :cond_d
    return-void
.end method
