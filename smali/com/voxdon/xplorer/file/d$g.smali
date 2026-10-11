.class public Lcom/voxdon/xplorer/file/d$g;
.super Lax/d5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "g"
.end annotation


# instance fields
.field j0:Ljava/lang/Throwable;


# direct methods
.method protected constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d5/a;-><init>(I)V

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


# virtual methods
.method public m(Ljava/lang/Throwable;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/d$g;->j0:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-void
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

.method public declared-synchronized read()I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/d$g;->j0:Ljava/lang/Throwable;

    .line 3
    .line 4
    if-nez v0, :cond_1b

    .line 5
    .line 6
    invoke-super {p0}, Lax/d5/a;->read()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/voxdon/xplorer/file/d$g;->j0:Ljava/lang/Throwable;
    :try_end_b
    .catchall {:try_start_1 .. :try_end_b} :catchall_19

    .line 11
    .line 12
    if-nez v1, :cond_f

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return v0

    .line 16
    :cond_f
    :try_start_f
    new-instance v0, Ljava/io/IOException;

    .line 17
    .line 18
    const-string v1, "Error raised"

    .line 19
    .line 20
    iget-object v2, p0, Lcom/voxdon/xplorer/file/d$g;->j0:Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catchall_19
    move-exception v0

    .line 27
    goto :goto_25

    .line 28
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    .line 29
    .line 30
    const-string v1, "Error raised"

    .line 31
    .line 32
    iget-object v2, p0, Lcom/voxdon/xplorer/file/d$g;->j0:Ljava/lang/Throwable;

    .line 33
    .line 34
    invoke-direct {v0, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :goto_25
    monitor-exit p0
    :try_end_26
    .catchall {:try_start_f .. :try_end_26} :catchall_19

    .line 39
    throw v0
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
