.class Lcom/voxdon/xplorer/file/L$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/file/L;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/L;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L$a;->q:Lcom/voxdon/xplorer/file/L;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$a;->q:Lcom/voxdon/xplorer/file/L;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/file/L;->k0(Lcom/voxdon/xplorer/file/L;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_7
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$a;->q:Lcom/voxdon/xplorer/file/L;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/voxdon/xplorer/file/L;->l0(Lcom/voxdon/xplorer/file/L;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_20

    .line 15
    .line 16
    invoke-static {}, Lcom/voxdon/xplorer/file/L;->m0()Ljava/util/logging/Logger;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "SFTP session idle timeout disconnect"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$a;->q:Lcom/voxdon/xplorer/file/L;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/voxdon/xplorer/file/L;->n0(Lcom/voxdon/xplorer/file/L;)V

    .line 28
    .line 29
    .line 30
    goto :goto_20

    .line 31
    :catchall_1e
    move-exception v1

    .line 32
    goto :goto_22

    .line 33
    :cond_20
    :goto_20
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_22
    monitor-exit v0
    :try_end_23
    .catchall {:try_start_7 .. :try_end_23} :catchall_1e

    .line 36
    throw v1
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
