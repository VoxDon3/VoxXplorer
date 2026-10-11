.class Lcom/box/androidsdk/content/requests/c;
.super Lcom/box/androidsdk/content/requests/a;
.source "SourceFile"


# static fields
.field private static final j:Ljava/util/logging/Logger;


# instance fields
.field private final c:Ljava/lang/StringBuilder;

.field private d:Ljava/io/OutputStream;

.field private e:Ljava/io/InputStream;

.field private f:Ljava/lang/String;

.field private g:J

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lcom/box/androidsdk/content/requests/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/box/androidsdk/content/requests/c;->j:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Ljava/net/URL;Lcom/box/androidsdk/content/requests/BoxRequest$Methods;Lax/F3/b;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/box/androidsdk/content/requests/a;-><init>(Ljava/net/URL;Lcom/box/androidsdk/content/requests/BoxRequest$Methods;Lax/F3/b;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/c;->c:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance p1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/c;->h:Ljava/util/Map;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lcom/box/androidsdk/content/requests/c;->i:Z

    .line 20
    .line 21
    const-string p1, "Content-Type"

    .line 22
    .line 23
    const-string p2, "multipart/form-data; boundary=da39a3ee5e6b4b0d3255bfef95601890afd80709"

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/box/androidsdk/content/requests/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/box/androidsdk/content/requests/a;

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

.method private i()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/box/androidsdk/content/requests/c;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    const-string v0, "\r\n"

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/box/androidsdk/content/requests/c;->i:Z

    .line 12
    .line 13
    const-string v0, "--"

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "da39a3ee5e6b4b0d3255bfef95601890afd80709"

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private j(Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->d:Ljava/io/OutputStream;

    .line 2
    .line 3
    const-string v1, "UTF-8"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/box/androidsdk/content/requests/c;->j:Ljava/util/logging/Logger;

    .line 17
    .line 18
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1e

    .line 25
    .line 26
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->c:Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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

.method private k([[Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/box/androidsdk/content/requests/c;->l([[Ljava/lang/String;Ljava/lang/String;)V

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

.method private l([[Ljava/lang/String;Ljava/lang/String;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/requests/c;->i()V

    .line 2
    .line 3
    .line 4
    const-string v0, "\r\n"

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Content-Disposition: form-data"

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_f
    array-length v2, p1

    .line 17
    if-ge v1, v2, :cond_33

    .line 18
    .line 19
    const-string v2, "; "

    .line 20
    .line 21
    invoke-direct {p0, v2}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    aget-object v2, p1, v1

    .line 25
    .line 26
    aget-object v2, v2, v0

    .line 27
    .line 28
    invoke-direct {p0, v2}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "=\""

    .line 32
    .line 33
    invoke-direct {p0, v2}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    aget-object v2, p1, v1

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    aget-object v2, v2, v3

    .line 40
    .line 41
    invoke-direct {p0, v2}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v2, "\""

    .line 45
    .line 46
    invoke-direct {p0, v2}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_f

    .line 52
    :cond_33
    if-eqz p2, :cond_3d

    .line 53
    .line 54
    const-string p1, "\r\nContent-Type: "

    .line 55
    .line 56
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, p2}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    const-string p1, "\r\n\r\n"

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
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


# virtual methods
.method public c(Ljava/io/InputStream;)Lcom/box/androidsdk/content/requests/a;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
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

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public e(Ljava/lang/String;Ljava/util/Date;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p2}, Lax/H3/a;->a(Ljava/util/Date;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
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

.method public f(Ljava/io/InputStream;Ljava/lang/String;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/c;->e:Ljava/io/InputStream;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/box/androidsdk/content/requests/c;->f:Ljava/lang/String;

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

.method public g(Ljava/io/InputStream;Ljava/lang/String;J)V
    .registers 5

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/box/androidsdk/content/requests/c;->f(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lcom/box/androidsdk/content/requests/c;->g:J

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

.method protected h(Ljava/net/HttpURLConnection;Lax/F3/b;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "filename"

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/c;->d:Ljava/io/OutputStream;

    .line 19
    .line 20
    iget-object p1, p0, Lcom/box/androidsdk/content/requests/c;->h:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_1d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_21} :catch_4b
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_21} :catch_49
    .catchall {:try_start_4 .. :try_end_21} :catchall_46

    .line 34
    const-string v4, "name"

    .line 35
    .line 36
    if-eqz v3, :cond_4d

    .line 37
    .line 38
    :try_start_25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    .line 50
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    new-array v5, v0, [[Ljava/lang/String;

    .line 55
    .line 56
    aput-object v4, v5, v1

    .line 57
    .line 58
    invoke-direct {p0, v5}, Lcom/box/androidsdk/content/requests/c;->k([[Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {p0, v3}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1d

    .line 71
    :catchall_46
    move-exception p1

    .line 72
    goto/16 :goto_c8

    .line 73
    .line 74
    :catch_49
    move-exception p1

    .line 75
    goto :goto_b8

    .line 76
    :catch_4b
    move-exception p1

    .line 77
    goto :goto_c0

    .line 78
    :cond_4d
    filled-new-array {v4, v2}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v3, p0, Lcom/box/androidsdk/content/requests/c;->f:Ljava/lang/String;

    .line 83
    .line 84
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/4 v3, 0x2

    .line 89
    new-array v3, v3, [[Ljava/lang/String;

    .line 90
    .line 91
    aput-object p1, v3, v1

    .line 92
    .line 93
    aput-object v2, v3, v0

    .line 94
    .line 95
    const-string p1, "application/octet-stream"

    .line 96
    .line 97
    invoke-direct {p0, v3, p1}, Lcom/box/androidsdk/content/requests/c;->l([[Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/box/androidsdk/content/requests/c;->d:Ljava/io/OutputStream;

    .line 101
    .line 102
    if-eqz p2, :cond_70

    .line 103
    .line 104
    new-instance p1, Lax/H3/f;

    .line 105
    .line 106
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->d:Ljava/io/OutputStream;

    .line 107
    .line 108
    iget-wide v2, p0, Lcom/box/androidsdk/content/requests/c;->g:J

    .line 109
    .line 110
    invoke-direct {p1, v0, p2, v2, v3}, Lax/H3/f;-><init>(Ljava/io/OutputStream;Lax/F3/b;J)V

    .line 111
    .line 112
    .line 113
    :cond_70
    const/16 p2, 0x2000

    .line 114
    .line 115
    new-array p2, p2, [B

    .line 116
    .line 117
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->e:Ljava/io/InputStream;

    .line 118
    .line 119
    invoke-virtual {v0, p2}, Ljava/io/InputStream;->read([B)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    :goto_7a
    const/4 v2, -0x1

    .line 124
    if-eq v0, v2, :cond_97

    .line 125
    .line 126
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_91

    .line 135
    .line 136
    invoke-virtual {p1, p2, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/c;->e:Ljava/io/InputStream;

    .line 140
    .line 141
    invoke-virtual {v0, p2}, Ljava/io/InputStream;->read([B)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    goto :goto_7a

    .line 146
    :cond_91
    new-instance p1, Ljava/lang/InterruptedException;

    .line 147
    .line 148
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_97
    sget-object p1, Lcom/box/androidsdk/content/requests/c;->j:Ljava/util/logging/Logger;

    .line 153
    .line 154
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_a8

    .line 161
    .line 162
    iget-object p1, p0, Lcom/box/androidsdk/content/requests/c;->c:Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string p2, "<File Contents Omitted>"

    .line 165
    .line 166
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    :cond_a8
    invoke-direct {p0}, Lcom/box/androidsdk/content/requests/c;->i()V

    .line 170
    .line 171
    .line 172
    const-string p1, "--"

    .line 173
    .line 174
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/requests/c;->j(Ljava/lang/String;)V
    :try_end_b0
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_b0} :catch_4b
    .catch Ljava/lang/InterruptedException; {:try_start_25 .. :try_end_b0} :catch_49
    .catchall {:try_start_25 .. :try_end_b0} :catchall_46

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lcom/box/androidsdk/content/requests/c;->d:Ljava/io/OutputStream;

    .line 178
    .line 179
    if-eqz p1, :cond_b7

    .line 180
    .line 181
    :try_start_b4
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_b7
    .catch Ljava/lang/Exception; {:try_start_b4 .. :try_end_b7} :catch_b7

    .line 182
    .line 183
    .line 184
    :catch_b7
    :cond_b7
    return-void

    .line 185
    :goto_b8
    :try_start_b8
    new-instance p2, Lcom/box/androidsdk/content/BoxException;

    .line 186
    .line 187
    const-string v0, "Thread has been interrupted"

    .line 188
    .line 189
    invoke-direct {p2, v0, p1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    throw p2

    .line 193
    :goto_c0
    new-instance p2, Lcom/box/androidsdk/content/BoxException;

    .line 194
    .line 195
    const-string v0, "Couldn\'t connect to the Box API due to a network error."

    .line 196
    .line 197
    invoke-direct {p2, v0, p1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    throw p2
    :try_end_c8
    .catchall {:try_start_b8 .. :try_end_c8} :catchall_46

    .line 201
    :goto_c8
    iget-object p2, p0, Lcom/box/androidsdk/content/requests/c;->d:Ljava/io/OutputStream;

    .line 202
    .line 203
    if-eqz p2, :cond_cf

    .line 204
    .line 205
    :try_start_cc
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_cf
    .catch Ljava/lang/Exception; {:try_start_cc .. :try_end_cf} :catch_cf

    .line 206
    .line 207
    .line 208
    :catch_cf
    :cond_cf
    throw p1
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
