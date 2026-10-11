.class Lcom/voxdon/xplorer/file/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/E3/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/d;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
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
    iput-object p1, p0, Lcom/voxdon/xplorer/file/d$a;->c:Lcom/voxdon/xplorer/file/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/d$a;->a:Lax/d5/b;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/file/d$a;->b:Lcom/voxdon/xplorer/file/d$g;

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
    .registers 3
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
    invoke-virtual {p1}, Lcom/box/androidsdk/content/requests/BoxResponse;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/file/d$a;->a:Lax/d5/b;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/d5/b;->flush()V

    .line 10
    .line 11
    .line 12
    goto :goto_17

    .line 13
    :catchall_c
    move-exception p1

    .line 14
    goto :goto_1d

    .line 15
    :cond_e
    iget-object v0, p0, Lcom/voxdon/xplorer/file/d$a;->b:Lcom/voxdon/xplorer/file/d$g;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/box/androidsdk/content/requests/BoxResponse;->a()Ljava/lang/Exception;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/d$g;->m(Ljava/lang/Throwable;)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_17} :catch_23
    .catchall {:try_start_0 .. :try_end_17} :catchall_c

    .line 22
    .line 23
    .line 24
    :goto_17
    :try_start_17
    iget-object p1, p0, Lcom/voxdon/xplorer/file/d$a;->a:Lax/d5/b;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/d5/b;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_1c} :catch_28

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1d
    :try_start_1d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/d$a;->a:Lax/d5/b;

    .line 31
    .line 32
    invoke-virtual {v0}, Lax/d5/b;->close()V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_22} :catch_22

    .line 33
    .line 34
    .line 35
    :catch_22
    throw p1

    .line 36
    :catch_23
    :try_start_23
    iget-object p1, p0, Lcom/voxdon/xplorer/file/d$a;->a:Lax/d5/b;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/d5/b;->close()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_28} :catch_28

    .line 39
    .line 40
    .line 41
    :catch_28
    return-void
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
