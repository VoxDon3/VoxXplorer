.class Lax/O3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final f:Lax/O3/a;


# instance fields
.field private final a:Lax/O3/a;

.field private final b:Lax/O3/d;

.field private final c:Lax/Q3/b;

.field private final d:Landroid/content/ContentResolver;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/M3/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/O3/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/O3/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/O3/e;->f:Lax/O3/a;

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

.method public constructor <init>(Ljava/util/List;Lax/O3/a;Lax/O3/d;Lax/Q3/b;Landroid/content/ContentResolver;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/M3/f;",
            ">;",
            "Lax/O3/a;",
            "Lax/O3/d;",
            "Lax/Q3/b;",
            "Landroid/content/ContentResolver;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lax/O3/e;->a:Lax/O3/a;

    .line 4
    iput-object p3, p0, Lax/O3/e;->b:Lax/O3/d;

    .line 5
    iput-object p4, p0, Lax/O3/e;->c:Lax/Q3/b;

    .line 6
    iput-object p5, p0, Lax/O3/e;->d:Landroid/content/ContentResolver;

    .line 7
    iput-object p1, p0, Lax/O3/e;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lax/O3/d;Lax/Q3/b;Landroid/content/ContentResolver;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/M3/f;",
            ">;",
            "Lax/O3/d;",
            "Lax/Q3/b;",
            "Landroid/content/ContentResolver;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v2, Lax/O3/e;->f:Lax/O3/a;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lax/O3/e;-><init>(Ljava/util/List;Lax/O3/a;Lax/O3/d;Lax/Q3/b;Landroid/content/ContentResolver;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)I
    .registers 7

    .line 1
    const-string v0, "ThumbStreamOpener"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_3
    iget-object v2, p0, Lax/O3/e;->d:Landroid/content/ContentResolver;

    .line 5
    .line 6
    invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lax/O3/e;->e:Ljava/util/List;

    .line 11
    .line 12
    iget-object v3, p0, Lax/O3/e;->c:Lax/Q3/b;

    .line 13
    .line 14
    invoke-static {v2, v1, v3}, Lax/M3/g;->a(Ljava/util/List;Ljava/io/InputStream;Lax/Q3/b;)I

    .line 15
    .line 16
    .line 17
    move-result p1
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_11} :catch_1b
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_11} :catch_19
    .catchall {:try_start_3 .. :try_end_11} :catchall_17

    .line 18
    if-eqz v1, :cond_16

    .line 19
    .line 20
    :try_start_13
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_16} :catch_16

    .line 21
    .line 22
    .line 23
    :catch_16
    :cond_16
    return p1

    .line 24
    :catchall_17
    move-exception p1

    .line 25
    goto :goto_3e

    .line 26
    :catch_19
    move-exception v2

    .line 27
    goto :goto_1c

    .line 28
    :catch_1b
    move-exception v2

    .line 29
    :goto_1c
    const/4 v3, 0x3

    .line 30
    :try_start_1d
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_37

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v4, "Failed to open uri: "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v0, p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_37
    .catchall {:try_start_1d .. :try_end_37} :catchall_17

    .line 54
    .line 55
    .line 56
    :cond_37
    if-eqz v1, :cond_3c

    .line 57
    .line 58
    :try_start_39
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3c
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_3c} :catch_3c

    .line 59
    .line 60
    .line 61
    :catch_3c
    :cond_3c
    const/4 p1, -0x1

    .line 62
    return p1

    .line 63
    :goto_3e
    if-eqz v1, :cond_43

    .line 64
    .line 65
    :try_start_40
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_43
    .catch Ljava/io/IOException; {:try_start_40 .. :try_end_43} :catch_43

    .line 66
    .line 67
    .line 68
    :catch_43
    :cond_43
    throw p1
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

.method public b(Landroid/net/Uri;)Ljava/io/InputStream;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/O3/e;->b:Lax/O3/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/O3/d;->a(Landroid/net/Uri;)Landroid/database/Cursor;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_70

    .line 9
    .line 10
    :try_start_9
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_10

    .line 15
    .line 16
    goto :goto_70

    .line 17
    :cond_10
    const/4 v1, 0x0

    .line 18
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2
    :try_end_19
    .catchall {:try_start_9 .. :try_end_19} :catchall_3e

    .line 26
    if-eqz v2, :cond_1f

    .line 27
    .line 28
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1f
    :try_start_1f
    iget-object v2, p0, Lax/O3/e;->a:Lax/O3/a;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Lax/O3/a;->b(Ljava/lang/String;)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lax/O3/e;->a:Lax/O3/a;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lax/O3/a;->a(Ljava/io/File;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_40

    .line 45
    .line 46
    iget-object v2, p0, Lax/O3/e;->a:Lax/O3/a;

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Lax/O3/a;->c(Ljava/io/File;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long v6, v2, v4

    .line 55
    .line 56
    if-lez v6, :cond_40

    .line 57
    .line 58
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v1
    :try_end_3d
    .catchall {:try_start_1f .. :try_end_3d} :catchall_3e

    .line 62
    goto :goto_41

    .line 63
    :catchall_3e
    move-exception v0

    .line 64
    goto :goto_6c

    .line 65
    :cond_40
    move-object v1, v0

    .line 66
    :goto_41
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 67
    .line 68
    .line 69
    if-eqz v1, :cond_6b

    .line 70
    .line 71
    :try_start_46
    iget-object p1, p0, Lax/O3/e;->d:Landroid/content/ContentResolver;

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_4c
    .catch Ljava/lang/NullPointerException; {:try_start_46 .. :try_end_4c} :catch_4d

    .line 77
    return-object p1

    .line 78
    :catch_4d
    move-exception p1

    .line 79
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v3, "NPE opening uri: "

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Ljava/io/FileNotFoundException;

    .line 106
    .line 107
    throw p1

    .line 108
    :cond_6b
    return-object v0

    .line 109
    :goto_6c
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_70
    :goto_70
    if-eqz p1, :cond_75

    .line 114
    .line 115
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 116
    .line 117
    .line 118
    :cond_75
    return-object v0
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
