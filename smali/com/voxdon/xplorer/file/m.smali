.class public abstract Lcom/voxdon/xplorer/file/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/voxdon/xplorer/file/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/m$f;,
        Lcom/voxdon/xplorer/file/m$e;,
        Lcom/voxdon/xplorer/file/m$d;
    }
.end annotation


# static fields
.field private static g:Z


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lax/c3/K;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;

.field private f:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method protected constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/file/m;->c:Ljava/util/Set;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/voxdon/xplorer/file/m;->e:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/voxdon/xplorer/file/m;->f:Ljava/util/concurrent/locks/ReentrantLock;

    .line 39
    .line 40
    return-void
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

.method private R(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 7

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->Z()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, v0}, Lax/c3/B;->G(Ljava/io/File;Lcom/voxdon/xplorer/file/n;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_18

    .line 14
    .line 15
    invoke-static {}, Lax/Z2/t;->b()Lax/Z2/t;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, v1}, Lax/Z2/t;->e(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    goto :goto_42

    .line 23
    :catch_16
    move-exception p1

    .line 24
    goto :goto_4f

    .line 25
    :cond_18
    iget-object v2, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_1d} :catch_16

    .line 28
    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    :try_start_1f
    invoke-interface {p0, v0, v2, v3}, Lcom/voxdon/xplorer/file/c;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v0}, Lax/c3/b;->p()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    new-instance v0, Lcom/voxdon/xplorer/file/m$b;

    .line 41
    .line 42
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/file/m$b;-><init>(Lcom/voxdon/xplorer/file/m;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v1, v3, v4, v0}, Lax/c3/F;->f(Ljava/io/InputStream;Ljava/io/File;JLax/u3/c;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lax/Z2/t;->b()Lax/Z2/t;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v1}, Lax/Z2/t;->c(Ljava/io/File;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lax/Z2/t;->b()Lax/Z2/t;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lax/Z2/t;->a()V
    :try_end_3d
    .catchall {:try_start_1f .. :try_end_3d} :catchall_48

    .line 60
    .line 61
    .line 62
    :try_start_3d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 63
    .line 64
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :goto_42
    new-instance p1, Ljava/io/FileInputStream;

    .line 68
    .line 69
    invoke-direct {p1, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :catchall_48
    move-exception v0

    .line 74
    iget-object v1, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 75
    .line 76
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    throw v0
    :try_end_4f
    .catch Ljava/lang/Exception; {:try_start_3d .. :try_end_4f} :catch_16

    .line 80
    :goto_4f
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    return-object p1
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

.method public static S(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/c3/B;->Y(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

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

.method private T(Landroid/media/MediaDataSource;)Ljava/io/InputStream;
    .registers 5

    .line 1
    const/16 v0, 0x200

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/u3/B;->h(Landroid/media/MediaDataSource;I)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_a
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 12
    .line 13
    const v1, 0x8000

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 32
    .line 33
    .line 34
    return-object p1
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

.method private U(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/voxdon/xplorer/file/m$a;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lcom/voxdon/xplorer/file/m$a;-><init>(Lcom/voxdon/xplorer/file/m;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lax/X2/Q;->t1()Z

    .line 16
    .line 17
    .line 18
    new-instance v2, Lax/c3/f0;

    .line 19
    .line 20
    invoke-direct {v2, p0, v0, v1}, Lax/c3/f0;-><init>(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;Lax/u3/c;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/file/m;->T(Landroid/media/MediaDataSource;)Ljava/io/InputStream;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2b

    .line 28
    .line 29
    invoke-interface {v1}, Lax/u3/c;->isCancelled()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_23

    .line 34
    .line 35
    goto :goto_2b

    .line 36
    :cond_23
    new-instance v0, Lax/b3/a;

    .line 37
    .line 38
    invoke-direct {v0}, Lax/b3/a;-><init>()V

    .line 39
    .line 40
    .line 41
    throw v0
    :try_end_29
    .catch Lax/b3/j; {:try_start_0 .. :try_end_29} :catch_37
    .catchall {:try_start_0 .. :try_end_29} :catchall_29

    .line 42
    :catchall_29
    move-exception v0

    .line 43
    goto :goto_31

    .line 44
    :cond_2b
    :goto_2b
    iget-object v1, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :goto_31
    iget-object v1, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :catch_37
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    return-object p1
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
.end method

.method public static X(Landroid/content/Context;)V
    .registers 2

    .line 1
    sget-boolean v0, Lcom/voxdon/xplorer/file/m;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_10

    .line 6
    :cond_5
    if-eqz p0, :cond_10

    .line 7
    .line 8
    invoke-static {p0}, Lax/u3/B;->g0(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_10

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    sput-boolean p0, Lcom/voxdon/xplorer/file/m;->g:Z

    .line 16
    .line 17
    :cond_10
    :goto_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic e(Lcom/voxdon/xplorer/file/m;)Ljava/util/Set;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
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

.method public static k(Ljava/util/Collection;Lcom/voxdon/xplorer/file/n;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lcom/voxdon/xplorer/file/n;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_20

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_20
    const/4 p0, 0x0

    .line 34
    return p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public V()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public W(Landroid/content/Context;Lax/c3/K;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/m;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/m;->b:Lax/c3/K;

    .line 4
    .line 5
    return-void
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

.method public Y()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected Z(Lcom/voxdon/xplorer/file/n;)Z
    .registers 6

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v1, v0, :cond_2e

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/c3/A;->O(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2d

    .line 20
    .line 21
    const-string v1, "dng"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1d

    .line 28
    .line 29
    return v3

    .line 30
    :cond_1d
    invoke-static {p1}, Lax/c3/B;->Y(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, p1}, Lax/r3/d;->l(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_2c

    .line 43
    .line 44
    return v3

    .line 45
    :cond_2c
    return v2

    .line 46
    :cond_2d
    return v3

    .line 47
    :cond_2e
    sget-object p1, Lax/c3/z;->e0:Lax/c3/z;

    .line 48
    .line 49
    if-ne p1, v0, :cond_39

    .line 50
    .line 51
    invoke-static {}, Lax/X2/Q;->r0()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_39

    .line 56
    .line 57
    return v3

    .line 58
    :cond_39
    return v2
    .line 59
    .line 60
    .line 61
.end method

.method public a0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/m$f;->q:Lcom/voxdon/xplorer/file/m$f;

    .line 2
    .line 3
    invoke-interface {p0, p1, v0}, Lcom/voxdon/xplorer/file/c;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public c0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected d0(Lcom/voxdon/xplorer/file/c$a;ZLjava/lang/Object;)V
    .registers 5

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    new-instance v0, Lcom/voxdon/xplorer/file/m$c;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/m$c;-><init>(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/c$a;ZLjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/m;->f0(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public e0(Ljava/lang/String;I)Lax/l3/a;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string p1, "Proxy file is not supported"

    .line 2
    .line 3
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lax/b3/t;

    .line 7
    .line 8
    invoke-direct {p2, p1}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p2
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

.method public f(Ljava/lang/String;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->d:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

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

.method protected f0(Ljava/lang/Runnable;)V
    .registers 2

    .line 1
    invoke-static {p1}, Lax/u3/B;->a0(Ljava/lang/Runnable;)V

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

.method public g()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

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
.end method

.method public g0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public h(Lcom/voxdon/xplorer/file/c$a;)V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, v0, p1}, Lcom/voxdon/xplorer/file/c;->K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public h0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected i()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->f:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

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
.end method

.method public i0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method protected j()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->f:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

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
.end method

.method public j0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/u3/b;->f()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lax/b3/j;

    .line 5
    .line 6
    const-string p2, "Not supported"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method protected l(Lcom/voxdon/xplorer/file/n;)Z
    .registers 15

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    :try_start_8
    new-array v0, v1, [B

    .line 10
    .line 11
    invoke-static {v0}, Lax/c3/F;->e([B)Lax/c3/G;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x0

    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x1

    .line 26
    move-object v2, p0

    .line 27
    move-object v3, p1

    .line 28
    invoke-interface/range {v2 .. v12}, Lcom/voxdon/xplorer/file/c;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_1e
    .catch Lax/b3/j; {:try_start_8 .. :try_end_1e} :catch_23
    .catch Lax/b3/a; {:try_start_8 .. :try_end_1e} :catch_20

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :catch_20
    move-exception v0

    .line 34
    :goto_21
    move-object p1, v0

    .line 35
    goto :goto_25

    .line 36
    :catch_23
    move-exception v0

    .line 37
    goto :goto_21

    .line 38
    :goto_25
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 39
    .line 40
    .line 41
    return v1
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

.method abstract m(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation
.end method

.method public n(Lcom/voxdon/xplorer/file/n;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "FILL FILE SIZE"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "Loation:"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lax/b3/j;

    .line 48
    .line 49
    const-string v0, "Not supported"

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

.method o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 12

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    :cond_8
    :goto_8
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_98

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    if-eqz p6, :cond_1e

    .line 22
    .line 23
    invoke-interface {p6}, Lax/u3/c;->isCancelled()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1e

    .line 28
    .line 29
    goto/16 :goto_98

    .line 30
    .line 31
    :cond_1e
    :try_start_1e
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1, p1}, Lax/Q2/f;->E0(Lax/Q2/f;Lcom/voxdon/xplorer/file/n;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_40

    .line 40
    .line 41
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, p1}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v1, :cond_44

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2, p1, v1}, Lax/Z2/b;->m(Lcom/voxdon/xplorer/file/n;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    goto :goto_44

    .line 63
    :catch_3e
    move-exception p1

    .line 64
    goto :goto_93

    .line 65
    :cond_40
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_44
    :goto_44
    if-nez v1, :cond_47

    .line 70
    .line 71
    goto :goto_98

    .line 72
    :cond_47
    const-string v2, "Search"

    .line 73
    .line 74
    invoke-static {v2}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v1, v2}, Lax/c3/q;->g(Ljava/util/List;Lax/c3/q;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v1, p2, p3, v2}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-eqz p4, :cond_80

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    invoke-static {v1, v4, p3, v2}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_64
    :goto_64
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_80

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 112
    .line 113
    invoke-interface {v2}, Lax/c3/b;->isDirectory()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_64

    .line 118
    .line 119
    invoke-static {p1}, Lcom/voxdon/xplorer/file/J;->j2(Lcom/voxdon/xplorer/file/n;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-nez v4, :cond_64

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    goto :goto_64

    .line 129
    :cond_80
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz v3, :cond_8c

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_8e

    .line 140
    .line 141
    :cond_8c
    if-eqz p1, :cond_8

    .line 142
    .line 143
    :cond_8e
    invoke-interface {p5, v3, p1}, Lax/g3/h;->Y(Ljava/util/List;Z)V
    :try_end_91
    .catch Lax/b3/j; {:try_start_1e .. :try_end_91} :catch_3e

    .line 144
    .line 145
    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :goto_93
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_8

    .line 152
    .line 153
    :cond_98
    :goto_98
    return-void
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
.end method

.method public p()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->a:Landroid/content/Context;

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

.method public q()J
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->y()Lax/c3/k0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1b

    .line 12
    .line 13
    iget-wide v1, v0, Lax/c3/k0;->b:J

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    cmp-long v5, v1, v3

    .line 18
    .line 19
    if-eqz v5, :cond_1b

    .line 20
    .line 21
    iget-wide v0, v0, Lax/c3/k0;->d:J

    .line 22
    .line 23
    cmp-long v2, v0, v3

    .line 24
    .line 25
    if-ltz v2, :cond_1b

    .line 26
    .line 27
    return-wide v0

    .line 28
    :cond_1b
    const-wide/16 v0, -0x1

    .line 29
    .line 30
    return-wide v0
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

.method public r()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->b:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

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
.end method

.method public s(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;
    .registers 3

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/m$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/file/m$e;-><init>(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 4
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
    .line 22
.end method

.method public t()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->b:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public u()Lax/Q2/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->b:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

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
.end method

.method public v()Lax/c3/K;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->b:Lax/c3/K;

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

.method protected w(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 6

    .line 1
    invoke-interface {p0}, Lcom/voxdon/xplorer/file/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_8
    iget-object p1, p0, Lcom/voxdon/xplorer/file/m;->c:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_11

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_11
    invoke-static {p2}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lax/c3/A;->g(Ljava/lang/String;)Lax/c3/z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :try_start_19
    sget-object v2, Lax/c3/z;->f0:Lax/c3/z;

    .line 27
    .line 28
    if-ne v1, v2, :cond_44

    .line 29
    .line 30
    invoke-static {p1}, Lax/c3/A;->S(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3f

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/high16 v1, 0x43000000    # 128.0f

    .line 45
    .line 46
    mul-float p1, p1, v1

    .line 47
    .line 48
    float-to-int p1, p1

    .line 49
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/m;->R(Ljava/lang/String;)Ljava/io/InputStream;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, p1}, Lax/r3/c;->e(Ljava/io/InputStream;I)Ljava/io/InputStream;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_6c

    .line 58
    .line 59
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_6c

    .line 64
    :cond_3f
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/m;->R(Ljava/lang/String;)Ljava/io/InputStream;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_6c

    .line 69
    :cond_44
    sget-object v2, Lax/c3/z;->e0:Lax/c3/z;

    .line 70
    .line 71
    if-ne v1, v2, :cond_55

    .line 72
    .line 73
    invoke-static {}, Lax/X2/Q;->r0()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_53

    .line 78
    .line 79
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/m;->U(Ljava/lang/String;)Ljava/io/InputStream;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_6c

    .line 84
    :cond_53
    :goto_53
    move-object p1, v0

    .line 85
    goto :goto_6c

    .line 86
    :cond_55
    const-string v1, ""

    .line 87
    .line 88
    invoke-static {p1, v1}, Lax/c3/v;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Lax/c3/A;->I(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_53

    .line 97
    .line 98
    invoke-static {p1}, Lax/c3/A;->U(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_68

    .line 103
    .line 104
    goto :goto_53

    .line 105
    :cond_68
    invoke-static {}, Lax/u3/b;->f()V

    .line 106
    .line 107
    .line 108
    goto :goto_53

    .line 109
    :cond_6c
    :goto_6c
    if-nez p1, :cond_73

    .line 110
    .line 111
    iget-object v1, p0, Lcom/voxdon/xplorer/file/m;->c:Ljava/util/Set;

    .line 112
    .line 113
    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_73
    .catch Lax/b3/a; {:try_start_19 .. :try_end_73} :catch_74

    .line 114
    .line 115
    .line 116
    :cond_73
    return-object p1

    .line 117
    :catch_74
    return-object v0
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

.method public x()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m;->b:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

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
.end method

.method public y()Lax/c3/k0;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
