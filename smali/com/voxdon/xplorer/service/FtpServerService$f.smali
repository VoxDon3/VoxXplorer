.class Lcom/voxdon/xplorer/service/FtpServerService$f;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/service/FtpServerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/service/FtpServerService;


# direct methods
.method private constructor <init>(Lcom/voxdon/xplorer/service/FtpServerService;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/FtpServerService$f;->q:Lcom/voxdon/xplorer/service/FtpServerService;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/voxdon/xplorer/service/FtpServerService;Lcom/voxdon/xplorer/service/FtpServerService$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/service/FtpServerService$f;-><init>(Lcom/voxdon/xplorer/service/FtpServerService;)V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 8

    .line 1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$f;->q:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->q(Lcom/voxdon/xplorer/service/FtpServerService;)Ljava/net/ServerSocket;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v1, Lcom/voxdon/xplorer/service/FtpServerService$b;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/voxdon/xplorer/service/FtpServerService$f;->q:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 14
    .line 15
    invoke-static {v2}, Lcom/voxdon/xplorer/service/FtpServerService;->c(Lcom/voxdon/xplorer/service/FtpServerService;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$f;->q:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->d(Lcom/voxdon/xplorer/service/FtpServerService;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$f;->q:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->e(Lcom/voxdon/xplorer/service/FtpServerService;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/16 v6, 0x1e

    .line 36
    .line 37
    if-lt v0, v6, :cond_29

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    const/4 v6, 0x1

    .line 41
    goto :goto_2b

    .line 42
    :cond_29
    const/4 v0, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    :goto_2b
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/service/FtpServerService$b;-><init>(Lcom/voxdon/xplorer/service/FtpServerService;Ljava/net/Socket;ZLjava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$f;->q:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/service/FtpServerService;->f(Lcom/voxdon/xplorer/service/FtpServerService;Lcom/voxdon/xplorer/service/FtpServerService$b;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_36
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_36} :catch_37

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_37
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
