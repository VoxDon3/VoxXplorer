.class public Lcom/box/androidsdk/content/requests/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Ljava/net/HttpURLConnection;

.field protected b:I

.field protected c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/io/InputStream;

.field private g:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/net/HttpURLConnection;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;

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
    .line 22
.end method

.method private static h(I)Z
    .registers 2

    .line 1
    const/16 v0, 0x190

    if-lt p0, v0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method private j(Ljava/io/InputStream;)Ljava/lang/String;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_4
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->e:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_16

    .line 8
    .line 9
    const-string v1, "gzip"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_16

    .line 16
    .line 17
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 20
    .line 21
    .line 22
    move-object p1, v0

    .line 23
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x2000

    .line 29
    .line 30
    new-array v2, v1, [C

    .line 31
    .line 32
    :try_start_1f
    new-instance v3, Ljava/io/InputStreamReader;

    .line 33
    .line 34
    const-string v4, "UTF-8"

    .line 35
    .line 36
    invoke-direct {v3, p1, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-virtual {v3, v2, p1, v1}, Ljava/io/InputStreamReader;->read([CII)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    :goto_2b
    const/4 v5, -0x1

    .line 45
    if-eq v4, v5, :cond_38

    .line 46
    .line 47
    invoke-virtual {v0, v2, p1, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2, p1, v1}, Ljava/io/InputStreamReader;->read([CII)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    goto :goto_2b

    .line 55
    :catch_36
    move-exception p1

    .line 56
    goto :goto_40

    .line 57
    :cond_38
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_3b
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_3b} :catch_36

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :goto_40
    new-instance v0, Lcom/box/androidsdk/content/BoxException;

    .line 66
    .line 67
    const-string v1, "Unable to read stream"

    .line 68
    .line 69
    invoke-direct {v0, v1, p1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw v0
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


# virtual methods
.method public a()Ljava/io/InputStream;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/requests/b;->b(Lax/F3/b;)Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    move-result-object v0

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
.end method

.method public b(Lax/F3/b;)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;

    .line 2
    .line 3
    if-nez v0, :cond_4c

    .line 4
    .line 5
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :try_start_a
    iget-object v1, p0, Lcom/box/androidsdk/content/requests/b;->f:Ljava/io/InputStream;

    .line 12
    .line 13
    if-nez v1, :cond_19

    .line 14
    .line 15
    iget-object v1, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lcom/box/androidsdk/content/requests/b;->f:Ljava/io/InputStream;

    .line 22
    .line 23
    goto :goto_19

    .line 24
    :catch_17
    move-exception p1

    .line 25
    goto :goto_44

    .line 26
    :cond_19
    :goto_19
    if-nez p1, :cond_20

    .line 27
    .line 28
    iget-object p1, p0, Lcom/box/androidsdk/content/requests/b;->f:Ljava/io/InputStream;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;

    .line 31
    .line 32
    goto :goto_2e

    .line 33
    :cond_20
    new-instance v1, Lax/H3/e;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/box/androidsdk/content/requests/b;->f:Ljava/io/InputStream;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/b;->c()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    int-to-long v3, v3

    .line 42
    invoke-direct {v1, v2, p1, v3, v4}, Lax/H3/e;-><init>(Ljava/io/InputStream;Lax/F3/b;J)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;

    .line 46
    .line 47
    :goto_2e
    if-eqz v0, :cond_41

    .line 48
    .line 49
    const-string p1, "gzip"

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_41

    .line 56
    .line 57
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    .line 58
    .line 59
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;

    .line 65
    .line 66
    :cond_41
    iget-object p1, p0, Lcom/box/androidsdk/content/requests/b;->g:Ljava/io/InputStream;
    :try_end_43
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_43} :catch_17

    .line 67
    .line 68
    return-object p1

    .line 69
    :goto_44
    new-instance v0, Lcom/box/androidsdk/content/BoxException;

    .line 70
    .line 71
    const-string v1, "Couldn\'t connect to the Box API due to a network error."

    .line 72
    .line 73
    invoke-direct {v0, v1, p1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_4c
    return-object v0
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

.method public c()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

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

.method public d()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->c:Ljava/lang/String;

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

.method public e()Ljava/net/HttpURLConnection;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

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

.method public f()I
    .registers 2

    .line 1
    iget v0, p0, Lcom/box/androidsdk/content/requests/b;->b:I

    .line 2
    .line 3
    return v0
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

.method public g()Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    :try_start_5
    iget v0, p0, Lcom/box/androidsdk/content/requests/b;->b:I

    .line 7
    .line 8
    invoke-static {v0}, Lcom/box/androidsdk/content/requests/b;->h(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_16

    .line 13
    .line 14
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_1c

    .line 21
    :catch_14
    move-exception v0

    .line 22
    goto :goto_23

    .line 23
    :cond_16
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_1c
    invoke-direct {p0, v0}, Lcom/box/androidsdk/content/requests/b;->j(Ljava/io/InputStream;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/box/androidsdk/content/requests/b;->d:Ljava/lang/String;
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_22} :catch_14

    .line 34
    .line 35
    return-object v0

    .line 36
    :goto_23
    new-instance v1, Lcom/box/androidsdk/content/BoxException;

    .line 37
    .line 38
    const-string v2, "Unable to get string body"

    .line 39
    .line 40
    invoke-direct {v1, v2, v0}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v1
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

.method public i()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/box/androidsdk/content/requests/b;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lcom/box/androidsdk/content/requests/b;->b:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/b;->a:Ljava/net/HttpURLConnection;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/box/androidsdk/content/requests/b;->e:Ljava/lang/String;

    .line 29
    .line 30
    return-void
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
