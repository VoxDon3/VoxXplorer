.class public Lax/X2/o;
.super Lax/X2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X2/o$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/X2/m;-><init>()V

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

.method public static d(Landroid/os/storage/StorageVolume;)Lax/X2/N;
    .registers 2

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_4
    new-instance v0, Lax/X2/o$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/X2/o$a;-><init>(Landroid/os/storage/StorageVolume;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
.method public b(Landroid/os/storage/StorageManager;Ljava/io/File;)Lax/X2/N;
    .registers 4

    .line 1
    :try_start_0
    invoke-static {p1, p2}, Lax/X2/f;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Landroid/os/storage/StorageVolume;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lax/X2/o;->c(Landroid/os/storage/StorageVolume;)Lax/X2/N;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_8} :catch_9

    .line 9
    return-object p1

    .line 10
    :catch_9
    move-exception p1

    .line 11
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v0, "GET STORAGE VOLUME ERROR"

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected c(Landroid/os/storage/StorageVolume;)Lax/X2/N;
    .registers 3

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_4
    new-instance v0, Lax/X2/o$a;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lax/X2/o$a;-><init>(Landroid/os/storage/StorageVolume;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
