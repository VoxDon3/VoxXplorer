.class Lcom/voxdon/xplorer/file/L$h;
.super Lax/u3/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/t<",
        "Lcom/jcraft/jsch/ChannelSftp;",
        ">;"
    }
.end annotation


# instance fields
.field b:Lcom/jcraft/jsch/Session;


# direct methods
.method public constructor <init>(Lcom/jcraft/jsch/Session;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/u3/t;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L$h;->b:Lcom/jcraft/jsch/Session;

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


# virtual methods
.method protected bridge synthetic c(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lcom/jcraft/jsch/ChannelSftp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/L$h;->g(Lcom/jcraft/jsch/ChannelSftp;)V

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

.method protected bridge synthetic d()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/K;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/L$h;->h()Lcom/jcraft/jsch/ChannelSftp;

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

.method public f()Lcom/jcraft/jsch/ChannelSftp;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/K;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Lax/u3/t;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/jcraft/jsch/ChannelSftp;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jcraft/jsch/Channel;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_13

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/L$h;->h()Lcom/jcraft/jsch/ChannelSftp;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_13

    .line 18
    :catch_11
    move-exception v0

    .line 19
    goto :goto_1d

    .line 20
    :cond_13
    :goto_13
    invoke-virtual {v0}, Lcom/jcraft/jsch/Channel;->s()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1c

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/jcraft/jsch/Channel;->c()V
    :try_end_1c
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_0 .. :try_end_1c} :catch_11

    .line 27
    .line 28
    .line 29
    :cond_1c
    return-object v0

    .line 30
    :goto_1d
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "SFTP CHANNEL OPEN ERROR 1"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lax/b3/K;

    .line 55
    .line 56
    const-string v2, "Could not acquire channel"

    .line 57
    .line 58
    invoke-direct {v1, v2, v0}, Lax/b3/K;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw v1
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected g(Lcom/jcraft/jsch/ChannelSftp;)V
    .registers 2

    .line 1
    invoke-virtual {p1}, Lcom/jcraft/jsch/ChannelSftp;->f()V

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

.method protected h()Lcom/jcraft/jsch/ChannelSftp;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/K;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$h;->b:Lcom/jcraft/jsch/Session;

    .line 2
    .line 3
    const-string v1, "sftp"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/jcraft/jsch/Session;->K(Ljava/lang/String;)Lcom/jcraft/jsch/Channel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/jcraft/jsch/ChannelSftp;
    :try_end_a
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_0 .. :try_end_a} :catch_b

    .line 10
    .line 11
    return-object v0

    .line 12
    :catch_b
    move-exception v0

    .line 13
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "SFTP CHANNEL OPEN ERROR 2"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lax/b3/K;

    .line 35
    .line 36
    const-string v2, "Could not open channel"

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Lax/b3/K;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v1
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

.method public i(Lcom/jcraft/jsch/ChannelSftp;)V
    .registers 3

    .line 1
    if-nez p1, :cond_c

    .line 2
    .line 3
    invoke-static {}, Lcom/voxdon/xplorer/file/L;->m0()Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "Null channel object error"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    invoke-virtual {p1}, Lcom/jcraft/jsch/Channel;->s()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    invoke-super {p0, p1}, Lax/u3/t;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
.end method
