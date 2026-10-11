.class public abstract Lcom/box/androidsdk/content/requests/BoxRequestUpload;
.super Lcom/box/androidsdk/content/requests/BoxRequestItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/requests/BoxRequestUpload$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Lcom/box/androidsdk/content/models/BoxJsonObject;",
        "R:",
        "Lcom/box/androidsdk/content/requests/BoxRequest<",
        "TE;TR;>;>",
        "Lcom/box/androidsdk/content/requests/BoxRequestItem<",
        "TE;TR;>;"
    }
.end annotation


# instance fields
.field mCreatedDate:Ljava/util/Date;

.field mFile:Ljava/io/File;

.field mFileName:Ljava/lang/String;

.field mModifiedDate:Ljava/util/Date;

.field mSha1:Ljava/lang/String;

.field mStream:Ljava/io/InputStream;

.field mUploadSize:J


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/io/InputStream;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0, p3, p4}, Lcom/box/androidsdk/content/requests/BoxRequestItem;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Lcom/box/androidsdk/content/requests/BoxRequest$Methods;->c0:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestMethod:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mStream:Ljava/io/InputStream;

    .line 10
    .line 11
    const-string p1, ""

    .line 12
    .line 13
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mFileName:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mContentType:Lcom/box/androidsdk/content/requests/BoxRequest$ContentTypes;

    .line 16
    .line 17
    new-instance p1, Lcom/box/androidsdk/content/requests/BoxRequestUpload$a;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/box/androidsdk/content/requests/BoxRequestUpload$a;-><init>(Lcom/box/androidsdk/content/requests/BoxRequestUpload;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest;->C(Lcom/box/androidsdk/content/requests/BoxRequest$a;)Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 23
    .line 24
    .line 25
    return-void
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
.end method


# virtual methods
.method protected B(Lcom/box/androidsdk/content/requests/a;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest;->B(Lcom/box/androidsdk/content/requests/a;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mSha1:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_c

    .line 7
    .line 8
    const-string v1, "Content-MD5"

    .line 9
    .line 10
    invoke-virtual {p1, v1, v0}, Lcom/box/androidsdk/content/requests/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/box/androidsdk/content/requests/a;

    .line 11
    .line 12
    .line 13
    :cond_c
    return-void
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

.method protected F()Lcom/box/androidsdk/content/requests/c;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequest;->d()Ljava/net/URL;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/box/androidsdk/content/requests/c;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestMethod:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->q:Lax/F3/b;

    .line 10
    .line 11
    invoke-direct {v1, v0, v2, v3}, Lcom/box/androidsdk/content/requests/c;-><init>(Ljava/net/URL;Lcom/box/androidsdk/content/requests/BoxRequest$Methods;Lax/F3/b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->B(Lcom/box/androidsdk/content/requests/a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->G()Ljava/io/InputStream;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mFileName:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mUploadSize:J

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/box/androidsdk/content/requests/c;->g(Ljava/io/InputStream;Ljava/lang/String;J)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mCreatedDate:Ljava/util/Date;

    .line 29
    .line 30
    if-eqz v0, :cond_24

    .line 31
    .line 32
    const-string v2, "content_created_at"

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, Lcom/box/androidsdk/content/requests/c;->e(Ljava/lang/String;Ljava/util/Date;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mModifiedDate:Ljava/util/Date;

    .line 38
    .line 39
    if-eqz v0, :cond_2d

    .line 40
    .line 41
    const-string v2, "content_modified_at"

    .line 42
    .line 43
    invoke-virtual {v1, v2, v0}, Lcom/box/androidsdk/content/requests/c;->e(Ljava/lang/String;Ljava/util/Date;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    return-object v1
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

.method protected G()Ljava/io/InputStream;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mStream:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    new-instance v0, Ljava/io/FileInputStream;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mFile:Ljava/io/File;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public H(Ljava/util/Date;)Lcom/box/androidsdk/content/requests/BoxRequest;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")TR;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->mModifiedDate:Ljava/util/Date;

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

.method public I(Lax/F3/b;)Lcom/box/androidsdk/content/requests/BoxRequest;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/F3/b;",
            ")TR;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->q:Lax/F3/b;

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

.method protected i()Lcom/box/androidsdk/content/requests/a;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequestUpload;->F()Lcom/box/androidsdk/content/requests/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method protected y(Lcom/box/androidsdk/content/requests/a;Ljava/net/HttpURLConnection;)Lcom/box/androidsdk/content/requests/b;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/box/androidsdk/content/requests/c;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/box/androidsdk/content/requests/c;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->q:Lax/F3/b;

    .line 9
    .line 10
    invoke-virtual {v0, p2, v1}, Lcom/box/androidsdk/content/requests/c;->h(Ljava/net/HttpURLConnection;Lax/F3/b;)V

    .line 11
    .line 12
    .line 13
    :cond_c
    invoke-super {p0, p1, p2}, Lcom/box/androidsdk/content/requests/BoxRequest;->y(Lcom/box/androidsdk/content/requests/a;Ljava/net/HttpURLConnection;)Lcom/box/androidsdk/content/requests/b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
