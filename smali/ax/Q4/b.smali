.class public Lax/Q4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Q4/b$a;
    }
.end annotation


# static fields
.field private static final g:Ljava/lang/String;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/Q4/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Lax/Q4/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile e:Lax/Q4/b$a;

.field private f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/Q4/b;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/Q4/b;->g:Ljava/lang/String;

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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/Q4/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 17
    .line 18
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/Q4/b;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 24
    .line 25
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lax/Q4/b;->d:Ljava/util/Set;

    .line 35
    .line 36
    sget-object v0, Lax/Q4/b$a;->q:Lax/Q4/b$a;

    .line 37
    .line 38
    iput-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

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

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gez v1, :cond_d

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
.end method

.method public static i(Landroid/net/Uri;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "content"

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2a

    .line 16
    .line 17
    :try_start_10
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "/"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lax/Q4/b;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_29
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10 .. :try_end_29} :catch_2a

    .line 42
    return-object p0

    .line 43
    :catch_2a
    :cond_2a
    return-object v0
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

.method public static l(Landroid/net/Uri;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "file"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1b

    .line 12
    .line 13
    const-string v0, "content"

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

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

.method public static m(Ljava/lang/String;)Z
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const-string v1, "file://"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_16

    .line 12
    .line 13
    const-string v1, "content://"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_15

    .line 20
    .line 21
    goto :goto_16

    .line 22
    :cond_15
    return v0

    .line 23
    :cond_16
    :goto_16
    const/4 p0, 0x1

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


# virtual methods
.method public a(Lax/Q4/c;)V
    .registers 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 2
    .line 3
    sget-object v1, Lax/Q4/b$a;->q:Lax/Q4/b$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_3c

    .line 6
    .line 7
    sget-object v0, Lax/Q4/b$a;->c0:Lax/Q4/b$a;

    .line 8
    .line 9
    iput-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 10
    .line 11
    invoke-virtual {p1}, Lax/Q4/c;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/Q4/b;->f:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/Q4/c;->e()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_38

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 32
    .line 33
    const-string v1, "android.media.metadata.MEDIA_ID"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lax/Q4/d;

    .line 40
    .line 41
    invoke-direct {v2, v1, v0}, Lax/Q4/d;-><init>(Ljava/lang/String;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lax/Q4/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 50
    .line 51
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_14

    .line 55
    :catchall_36
    move-exception p1

    .line 56
    goto :goto_47

    .line 57
    :cond_38
    sget-object p1, Lax/Q4/b$a;->d0:Lax/Q4/b$a;

    .line 58
    .line 59
    iput-object p1, p0, Lax/Q4/b;->e:Lax/Q4/b$a;
    :try_end_3c
    .catchall {:try_start_0 .. :try_end_3c} :catchall_36

    .line 60
    .line 61
    :cond_3c
    iget-object p1, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 62
    .line 63
    sget-object v0, Lax/Q4/b$a;->d0:Lax/Q4/b$a;

    .line 64
    .line 65
    if-eq p1, v0, :cond_46

    .line 66
    .line 67
    sget-object p1, Lax/Q4/b$a;->q:Lax/Q4/b$a;

    .line 68
    .line 69
    iput-object p1, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 70
    .line 71
    :cond_46
    return-void

    .line 72
    :goto_47
    iget-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 73
    .line 74
    sget-object v1, Lax/Q4/b$a;->d0:Lax/Q4/b$a;

    .line 75
    .line 76
    if-eq v0, v1, :cond_51

    .line 77
    .line 78
    sget-object v0, Lax/Q4/b$a;->q:Lax/Q4/b$a;

    .line 79
    .line 80
    iput-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 81
    .line 82
    :cond_51
    throw p1
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

.method public declared-synchronized b(Ljava/lang/String;)V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_27

    .line 6
    if-nez v0, :cond_9

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_9
    :try_start_9
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "android.media.metadata.ALBUM_ART"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v0, v2}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 19
    .line 20
    .line 21
    const-string v0, "android.media.metadata.DISPLAY_ICON"

    .line 22
    .line 23
    invoke-virtual {v1, v0, v2}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, p1}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_29

    .line 35
    .line 36
    iput-object v0, p1, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;
    :try_end_25
    .catchall {:try_start_9 .. :try_end_25} :catchall_27

    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :catchall_27
    move-exception p1

    .line 41
    goto :goto_31

    .line 42
    :cond_29
    :try_start_29
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "Unexpected error: Inconsistent data structures in MusicProvider"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :goto_31
    monitor-exit p0
    :try_end_32
    .catchall {:try_start_29 .. :try_end_32} :catchall_27

    .line 51
    throw p1
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

.method public c(Ljava/lang/String;Landroid/content/res/Resources;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/res/Resources;",
            ")",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
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

.method public d()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q4/b;->f:Ljava/lang/String;

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

.method public e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q4/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Lax/Q4/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/Q4/d;

    .line 16
    .line 17
    iget-object p1, p1, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_13
    const/4 p1, 0x0

    .line 21
    return-object p1
    .line 22
.end method

.method public f()Ljava/lang/Iterable;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Landroid/support/v4/media/MediaMetadataCompat;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 2
    .line 3
    sget-object v1, Lax/Q4/b$a;->d0:Lax/Q4/b$a;

    .line 4
    .line 5
    if-eq v0, v1, :cond_9

    .line 6
    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_1b
    if-ge v3, v2, :cond_2b

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    check-cast v4, Lax/Q4/d;

    .line 37
    .line 38
    iget-object v4, v4, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_1b

    .line 44
    :cond_2b
    return-object v0
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

.method public g(Ljava/lang/String;)Lax/Q4/d;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q4/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/Q4/d;

    .line 8
    .line 9
    return-object p1
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

.method public j()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public k(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q4/b;->d:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public declared-synchronized n(Ljava/lang/String;)Z
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_2f

    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p1, :cond_a

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :cond_a
    :try_start_a
    iget-object v1, p1, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;
    :try_end_c
    .catchall {:try_start_a .. :try_end_c} :catchall_2f

    .line 12
    .line 13
    if-nez v1, :cond_10

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return v0

    .line 17
    :cond_10
    :try_start_10
    iget-boolean p1, p1, Lax/Q4/d;->c:Z
    :try_end_12
    .catchall {:try_start_10 .. :try_end_12} :catchall_2f

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz p1, :cond_17

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return v2

    .line 24
    :cond_17
    :try_start_17
    const-string p1, "android.media.metadata.DISPLAY_TITLE"

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Landroid/support/v4/media/MediaMetadataCompat;->j(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_1d
    .catchall {:try_start_17 .. :try_end_1d} :catchall_2f

    .line 30
    if-nez p1, :cond_21

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return v0

    .line 34
    :cond_21
    :try_start_21
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result p1
    :try_end_29
    .catchall {:try_start_21 .. :try_end_29} :catchall_2f

    .line 42
    if-eqz p1, :cond_2d

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return v0

    .line 46
    :cond_2d
    monitor-exit p0

    .line 47
    return v2

    .line 48
    :catchall_2f
    move-exception p1

    .line 49
    :try_start_30
    monitor-exit p0
    :try_end_31
    .catchall {:try_start_30 .. :try_end_31} :catchall_2f

    .line 50
    throw p1
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

.method public o(Lax/Q4/c;)V
    .registers 3

    .line 1
    sget-object v0, Lax/Q4/b$a;->q:Lax/Q4/b$a;

    .line 2
    .line 3
    iput-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 4
    .line 5
    iget-object v0, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/Q4/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lax/Q4/b;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/Q4/b;->d:Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lax/Q4/b;->a(Lax/Q4/c;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Iterable;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Iterable<",
            "Landroid/support/v4/media/MediaMetadataCompat;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Q4/b;->e:Lax/Q4/b$a;

    .line 2
    .line 3
    sget-object v1, Lax/Q4/b$a;->d0:Lax/Q4/b$a;

    .line 4
    .line 5
    if-eq v0, v1, :cond_9

    .line 6
    .line 7
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v1, p0, Lax/Q4/b;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :cond_1b
    :goto_1b
    if-ge v3, v2, :cond_3d

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    check-cast v4, Lax/Q4/d;

    .line 37
    .line 38
    iget-object v5, v4, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 39
    .line 40
    invoke-virtual {v5, p1}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_1b

    .line 55
    .line 56
    iget-object v4, v4, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1b

    .line 62
    :cond_3d
    return-object v0
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

.method public q(Ljava/lang/String;)Ljava/lang/Iterable;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Iterable<",
            "Landroid/support/v4/media/MediaMetadataCompat;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "android.media.metadata.TITLE"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lax/Q4/b;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Iterable;

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

.method public r(Ljava/lang/String;Z)V
    .registers 3

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    iget-object p2, p0, Lax/Q4/b;->d:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iget-object p2, p0, Lax/Q4/b;->d:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
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

.method public declared-synchronized s(Ljava/lang/String;Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_d

    .line 6
    if-nez p1, :cond_9

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_9
    :try_start_9
    iput-object p2, p1, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;
    :try_end_b
    .catchall {:try_start_9 .. :try_end_b} :catchall_d

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_d
    move-exception p1

    .line 15
    :try_start_e
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_e .. :try_end_f} :catchall_d

    .line 16
    throw p1
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

.method public t(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_39

    .line 8
    .line 9
    iget-object v2, v0, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 10
    .line 11
    if-nez v2, :cond_d

    .line 12
    .line 13
    goto :goto_39

    .line 14
    :cond_d
    iget-object v2, p0, Lax/Q4/b;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 15
    .line 16
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 24
    .line 25
    const-string v2, "android.media.metadata.DURATION"

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->f(Ljava/lang/String;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    cmp-long v4, v2, p2

    .line 32
    .line 33
    if-nez v4, :cond_26

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-object v1

    .line 37
    :catchall_24
    move-exception p1

    .line 38
    goto :goto_3b

    .line 39
    :cond_26
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 40
    .line 41
    invoke-direct {v1, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 42
    .line 43
    .line 44
    const-string p1, "android.media.metadata.DURATION"

    .line 45
    .line 46
    invoke-virtual {v1, p1, p2, p3}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, v0, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-object p1

    .line 58
    :cond_39
    :goto_39
    monitor-exit p0

    .line 59
    return-object v1

    .line 60
    :goto_3b
    monitor-exit p0
    :try_end_3c
    .catchall {:try_start_1 .. :try_end_3c} :catchall_24

    .line 61
    throw p1
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

.method public declared-synchronized u(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .registers 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_22

    .line 6
    if-nez v0, :cond_9

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_9
    :try_start_9
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_24

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_24

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_24

    .line 28
    .line 29
    const-string v0, "android.media.metadata.ALBUM_ART"

    .line 30
    .line 31
    invoke-virtual {v1, v0, p2}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 32
    .line 33
    .line 34
    goto :goto_24

    .line 35
    :catchall_22
    move-exception p1

    .line 36
    goto :goto_4d

    .line 37
    :cond_24
    :goto_24
    if-eqz p3, :cond_37

    .line 38
    .line 39
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-lez p2, :cond_37

    .line 44
    .line 45
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-lez p2, :cond_37

    .line 50
    .line 51
    const-string p2, "android.media.metadata.DISPLAY_ICON"

    .line 52
    .line 53
    invoke-virtual {v1, p2, p3}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 54
    .line 55
    .line 56
    :cond_37
    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p0, p1}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_45

    .line 65
    .line 66
    iput-object p2, p1, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;
    :try_end_43
    .catchall {:try_start_9 .. :try_end_43} :catchall_22

    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :cond_45
    :try_start_45
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "Unexpected error: Inconsistent data structures in MusicProvider"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :goto_4d
    monitor-exit p0
    :try_end_4e
    .catchall {:try_start_45 .. :try_end_4e} :catchall_22

    .line 79
    throw p1
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

.method public v(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 15

    .line 1
    invoke-virtual {p0, p2}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget-object v2, v0, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 10
    .line 11
    if-nez v2, :cond_d

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_d
    const/4 v3, 0x1

    .line 15
    iput-boolean v3, v0, Lax/Q4/d;->c:Z

    .line 16
    .line 17
    const-string v0, "__SOURCE__"

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Landroid/support/v4/media/MediaMetadataCompat;->j(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, Landroid/media/MediaMetadataRetriever;

    .line 32
    .line 33
    invoke-direct {v5}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 34
    .line 35
    .line 36
    const/16 v6, 0x2f

    .line 37
    .line 38
    :try_start_25
    invoke-static {v4}, Lax/Q4/b;->l(Landroid/net/Uri;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_32

    .line 43
    .line 44
    invoke-virtual {v5, p1, v4}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3a

    .line 48
    :catchall_2f
    move-exception p1

    .line 49
    goto/16 :goto_12c

    .line 50
    .line 51
    :cond_32
    new-instance p1, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    :goto_3a
    const/4 p1, 0x2

    .line 60
    new-array v0, p1, [Ljava/lang/String;

    .line 61
    .line 62
    new-instance v7, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 63
    .line 64
    invoke-direct {v7, v2}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    const/4 v9, 0x0

    .line 76
    if-nez v8, :cond_56

    .line 77
    .line 78
    const-string v8, "android.media.metadata.ARTIST"

    .line 79
    .line 80
    invoke-virtual {v7, v8, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 81
    .line 82
    .line 83
    aput-object p1, v0, v9

    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    goto :goto_57

    .line 87
    :cond_56
    const/4 p1, 0x0

    .line 88
    :goto_57
    invoke-virtual {v5, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_68

    .line 97
    .line 98
    const-string v10, "android.media.metadata.ALBUM"

    .line 99
    .line 100
    invoke-virtual {v7, v10, v8}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 101
    .line 102
    .line 103
    aput-object v8, v0, p1

    .line 104
    .line 105
    :cond_68
    const/16 p1, 0x9

    .line 106
    .line 107
    invoke-virtual {v5, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v8
    :try_end_72
    .catch Ljava/lang/RuntimeException; {:try_start_25 .. :try_end_72} :catch_d4
    .catchall {:try_start_25 .. :try_end_72} :catchall_2f

    .line 115
    if-nez v8, :cond_7d

    .line 116
    .line 117
    :try_start_74
    const-string v8, "android.media.metadata.DURATION"

    .line 118
    .line 119
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v10

    .line 123
    invoke-virtual {v7, v8, v10, v11}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;
    :try_end_7d
    .catch Ljava/lang/NumberFormatException; {:try_start_74 .. :try_end_7d} :catch_7d
    .catch Ljava/lang/RuntimeException; {:try_start_74 .. :try_end_7d} :catch_d4
    .catchall {:try_start_74 .. :try_end_7d} :catchall_2f

    .line 124
    .line 125
    .line 126
    :catch_7d
    :cond_7d
    const/4 p1, 0x6

    .line 127
    :try_start_7e
    invoke-virtual {v5, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-nez v8, :cond_8d

    .line 136
    .line 137
    const-string v8, "android.media.metadata.GENRE"

    .line 138
    .line 139
    invoke-virtual {v7, v8, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 140
    .line 141
    .line 142
    :cond_8d
    const/4 p1, 0x7

    .line 143
    invoke-virtual {v5, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_a3

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-nez v8, :cond_a3

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    goto :goto_b0

    .line 164
    :cond_a3
    invoke-static {v4}, Lax/Q4/b;->i(Landroid/net/Uri;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    add-int/2addr v8, v3

    .line 173
    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    :goto_b0
    const-string v8, "android.media.metadata.TITLE"

    .line 178
    .line 179
    invoke-virtual {v7, v8, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 180
    .line 181
    .line 182
    const-string v8, "android.media.metadata.DISPLAY_TITLE"

    .line 183
    .line 184
    invoke-virtual {v7, v8, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 185
    .line 186
    .line 187
    aget-object p1, v0, v9

    .line 188
    .line 189
    if-eqz p1, :cond_c3

    .line 190
    .line 191
    const-string v8, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 192
    .line 193
    invoke-virtual {v7, v8, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 194
    .line 195
    .line 196
    :cond_c3
    aget-object p1, v0, v3

    .line 197
    .line 198
    if-eqz p1, :cond_cc

    .line 199
    .line 200
    const-string v0, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 201
    .line 202
    invoke-virtual {v7, v0, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 203
    .line 204
    .line 205
    :cond_cc
    invoke-virtual {v7}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 206
    .line 207
    .line 208
    move-result-object p1
    :try_end_d0
    .catch Ljava/lang/RuntimeException; {:try_start_7e .. :try_end_d0} :catch_d4
    .catchall {:try_start_7e .. :try_end_d0} :catchall_2f

    .line 209
    :goto_d0
    :try_start_d0
    invoke-virtual {v5}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_d3
    .catch Ljava/lang/Exception; {:try_start_d0 .. :try_end_d3} :catch_f0

    .line 210
    .line 211
    .line 212
    goto :goto_f0

    .line 213
    :catch_d4
    :try_start_d4
    new-instance p1, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 214
    .line 215
    invoke-direct {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v4}, Lax/Q4/b;->i(Landroid/net/Uri;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    add-int/2addr v2, v3

    .line 227
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v2, "android.media.metadata.TITLE"

    .line 232
    .line 233
    invoke-virtual {p1, v2, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 237
    .line 238
    .line 239
    move-result-object p1
    :try_end_ef
    .catchall {:try_start_d4 .. :try_end_ef} :catchall_2f

    .line 240
    goto :goto_d0

    .line 241
    :catch_f0
    :goto_f0
    monitor-enter p0

    .line 242
    :try_start_f1
    invoke-virtual {p0, p2}, Lax/Q4/b;->g(Ljava/lang/String;)Lax/Q4/d;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-nez v0, :cond_fb

    .line 247
    .line 248
    monitor-exit p0

    .line 249
    return-object v1

    .line 250
    :catchall_f9
    move-exception p1

    .line 251
    goto :goto_12a

    .line 252
    :cond_fb
    iget-object v1, p0, Lax/Q4/b;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 253
    .line 254
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    check-cast p2, Ljava/lang/Long;

    .line 259
    .line 260
    if-eqz p2, :cond_126

    .line 261
    .line 262
    const-string v1, "android.media.metadata.DURATION"

    .line 263
    .line 264
    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaMetadataCompat;->f(Ljava/lang/String;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    cmp-long v5, v1, v3

    .line 273
    .line 274
    if-eqz v5, :cond_126

    .line 275
    .line 276
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 277
    .line 278
    invoke-direct {v1, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 279
    .line 280
    .line 281
    const-string p1, "android.media.metadata.DURATION"

    .line 282
    .line 283
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 284
    .line 285
    .line 286
    move-result-wide v2

    .line 287
    invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    :cond_126
    iput-object p1, v0, Lax/Q4/d;->a:Landroid/support/v4/media/MediaMetadataCompat;

    .line 296
    .line 297
    monitor-exit p0

    .line 298
    return-object p1

    .line 299
    :goto_12a
    monitor-exit p0
    :try_end_12b
    .catchall {:try_start_f1 .. :try_end_12b} :catchall_f9

    .line 300
    throw p1

    .line 301
    :goto_12c
    :try_start_12c
    invoke-virtual {v5}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_12f
    .catch Ljava/lang/Exception; {:try_start_12c .. :try_end_12f} :catch_12f

    .line 302
    .line 303
    .line 304
    :catch_12f
    throw p1
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
