.class public Lax/X2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X2/a$a;
    }
.end annotation


# static fields
.field static final a:Lax/X2/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_e

    .line 6
    .line 7
    new-instance v0, Lax/X2/o;

    .line 8
    .line 9
    invoke-direct {v0}, Lax/X2/o;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lax/X2/a;->a:Lax/X2/a$a;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    const/16 v1, 0x18

    .line 16
    .line 17
    if-lt v0, v1, :cond_1a

    .line 18
    .line 19
    new-instance v0, Lax/X2/m;

    .line 20
    .line 21
    invoke-direct {v0}, Lax/X2/m;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lax/X2/a;->a:Lax/X2/a$a;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    const/16 v1, 0x17

    .line 28
    .line 29
    if-lt v0, v1, :cond_26

    .line 30
    .line 31
    new-instance v0, Lax/X2/c;

    .line 32
    .line 33
    invoke-direct {v0}, Lax/X2/c;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lax/X2/a;->a:Lax/X2/a$a;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    new-instance v0, Lax/X2/b;

    .line 40
    .line 41
    invoke-direct {v0}, Lax/X2/b;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lax/X2/a;->a:Lax/X2/a$a;

    .line 45
    .line 46
    return-void
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

.method public static a(Landroid/os/storage/StorageManager;Ljava/io/File;)Lax/X2/N;
    .registers 3

    .line 1
    sget-object v0, Lax/X2/a;->a:Lax/X2/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Lax/X2/a$a;->b(Landroid/os/storage/StorageManager;Ljava/io/File;)Lax/X2/N;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static b(Landroid/os/storage/StorageManager;)Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/storage/StorageManager;",
            ")",
            "Ljava/util/List<",
            "Lax/X2/N;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/X2/a;->a:Lax/X2/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lax/X2/a$a;->a(Landroid/os/storage/StorageManager;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
