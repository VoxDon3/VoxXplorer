.class Lcom/voxdon/xplorer/file/b$a;
.super Lax/c3/H;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c0:Lcom/voxdon/xplorer/file/b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/b;Ljava/io/InputStream;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/b$a;->c0:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lax/c3/H;-><init>(Ljava/io/InputStream;)V

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


# virtual methods
.method public close()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$a;->c0:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->l0(Lcom/voxdon/xplorer/file/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_7
    invoke-super {p0}, Lax/c3/H;->close()V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_c
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_7 .. :try_end_e} :catchall_c

    .line 15
    throw v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public read()I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$a;->c0:Lcom/voxdon/xplorer/file/b;

    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->l0(Lcom/voxdon/xplorer/file/b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_7
    invoke-super {p0}, Lax/c3/H;->read()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_d
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_7 .. :try_end_f} :catchall_d

    throw v1
.end method

.method public read([B)I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$a;->c0:Lcom/voxdon/xplorer/file/b;

    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->l0(Lcom/voxdon/xplorer/file/b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 5
    :try_start_7
    invoke-super {p0, p1}, Lax/c3/H;->read([B)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_d
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_7 .. :try_end_f} :catchall_d

    throw p1
.end method

.method public read([BII)I
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$a;->c0:Lcom/voxdon/xplorer/file/b;

    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->l0(Lcom/voxdon/xplorer/file/b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 8
    :try_start_7
    invoke-super {p0, p1, p2, p3}, Lax/c3/H;->read([BII)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_d
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_7 .. :try_end_f} :catchall_d

    throw p1
.end method

.method public declared-synchronized reset()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$a;->c0:Lcom/voxdon/xplorer/file/b;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->l0(Lcom/voxdon/xplorer/file/b;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    monitor-enter v0
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_11

    .line 9
    :try_start_8
    invoke-super {p0}, Lax/c3/H;->reset()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_8 .. :try_end_c} :catchall_e

    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_e
    move-exception v1

    .line 16
    :try_start_f
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_f .. :try_end_10} :catchall_e

    .line 17
    :try_start_10
    throw v1

    .line 18
    :catchall_11
    move-exception v0

    .line 19
    monitor-exit p0
    :try_end_13
    .catchall {:try_start_10 .. :try_end_13} :catchall_11

    .line 20
    throw v0
    .line 21
.end method

.method public skip(J)J
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gtz v2, :cond_7

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    const/16 v2, 0x800

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    long-to-int v3, v2

    .line 16
    new-array v2, v3, [B

    .line 17
    .line 18
    move-wide v4, p1

    .line 19
    :goto_12
    cmp-long v6, v4, v0

    .line 20
    .line 21
    if-lez v6, :cond_33

    .line 22
    .line 23
    int-to-long v6, v3

    .line 24
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    long-to-int v7, v6

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-virtual {p0, v2, v6, v7}, Lcom/voxdon/xplorer/file/b$a;->read([BII)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-gez v6, :cond_24

    .line 35
    .line 36
    goto :goto_33

    .line 37
    :cond_24
    if-nez v6, :cond_31

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/b$a;->read()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-gez v6, :cond_2d

    .line 44
    .line 45
    goto :goto_33

    .line 46
    :cond_2d
    const-wide/16 v6, 0x1

    .line 47
    .line 48
    :goto_2f
    sub-long/2addr v4, v6

    .line 49
    goto :goto_12

    .line 50
    :cond_31
    int-to-long v6, v6

    .line 51
    goto :goto_2f

    .line 52
    :cond_33
    :goto_33
    sub-long/2addr p1, v4

    .line 53
    return-wide p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
