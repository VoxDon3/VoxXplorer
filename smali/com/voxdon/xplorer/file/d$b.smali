.class Lcom/voxdon/xplorer/file/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/E3/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/d;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/E3/h$b<",
        "Lcom/box/androidsdk/content/models/BoxDownload;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/d5/b;

.field final synthetic b:Lcom/voxdon/xplorer/file/d$g;

.field final synthetic c:Lcom/voxdon/xplorer/file/d;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/d;Lax/d5/b;Lcom/voxdon/xplorer/file/d$g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/d$b;->c:Lcom/voxdon/xplorer/file/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/d$b;->a:Lax/d5/b;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/file/d$b;->b:Lcom/voxdon/xplorer/file/d$g;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Lcom/box/androidsdk/content/requests/BoxResponse;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/box/androidsdk/content/requests/BoxResponse<",
            "Lcom/box/androidsdk/content/models/BoxDownload;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcom/voxdon/xplorer/file/d;->k0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "download complete :"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/box/androidsdk/content/requests/BoxResponse;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/box/androidsdk/content/requests/BoxResponse;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2a

    .line 34
    .line 35
    iget-object p1, p0, Lcom/voxdon/xplorer/file/d$b;->a:Lax/d5/b;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/d5/b;->flush()V

    .line 38
    .line 39
    .line 40
    goto :goto_33

    .line 41
    :catchall_28
    move-exception p1

    .line 42
    goto :goto_39

    .line 43
    :cond_2a
    iget-object v0, p0, Lcom/voxdon/xplorer/file/d$b;->b:Lcom/voxdon/xplorer/file/d$g;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/box/androidsdk/content/requests/BoxResponse;->a()Ljava/lang/Exception;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/d$g;->m(Ljava/lang/Throwable;)V
    :try_end_33
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_33} :catch_3f
    .catchall {:try_start_0 .. :try_end_33} :catchall_28

    .line 50
    .line 51
    .line 52
    :goto_33
    :try_start_33
    iget-object p1, p0, Lcom/voxdon/xplorer/file/d$b;->a:Lax/d5/b;

    .line 53
    .line 54
    invoke-virtual {p1}, Lax/d5/b;->close()V
    :try_end_38
    .catch Ljava/io/IOException; {:try_start_33 .. :try_end_38} :catch_44

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_39
    :try_start_39
    iget-object v0, p0, Lcom/voxdon/xplorer/file/d$b;->a:Lax/d5/b;

    .line 59
    .line 60
    invoke-virtual {v0}, Lax/d5/b;->close()V
    :try_end_3e
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_3e} :catch_3e

    .line 61
    .line 62
    .line 63
    :catch_3e
    throw p1

    .line 64
    :catch_3f
    :try_start_3f
    iget-object p1, p0, Lcom/voxdon/xplorer/file/d$b;->a:Lax/d5/b;

    .line 65
    .line 66
    invoke-virtual {p1}, Lax/d5/b;->close()V
    :try_end_44
    .catch Ljava/io/IOException; {:try_start_3f .. :try_end_44} :catch_44

    .line 67
    .line 68
    .line 69
    :catch_44
    return-void
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
