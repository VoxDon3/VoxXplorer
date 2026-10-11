.class public Lcom/voxdon/xplorer/file/B;
.super Lcom/voxdon/xplorer/file/u;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/u;-><init>()V

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
.end method


# virtual methods
.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_61

    .line 6
    .line 7
    :try_start_6
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p2, v0}, Lcom/voxdon/xplorer/file/w;->C(Landroid/content/Context;Lcom/voxdon/xplorer/file/w$d;)Lcom/voxdon/xplorer/file/w;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_21

    .line 17
    .line 18
    invoke-virtual {p2}, Lax/u3/q;->l()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2, p1}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :catch_1d
    move-exception p1

    .line 31
    goto :goto_29

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    goto :goto_45

    .line 34
    :cond_21
    new-instance p1, Lax/b3/j;

    .line 35
    .line 36
    const-string p2, "New files exception : scanTask"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
    :try_end_29
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_29} :catch_1f
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_29} :catch_1d

    .line 42
    :goto_29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string v0, "NF2L"

    .line 50
    .line 51
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 60
    .line 61
    .line 62
    new-instance p1, Lax/b3/j;

    .line 63
    .line 64
    const-string p2, "New files exception 2"

    .line 65
    .line 66
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :goto_45
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    const-string v0, "NF1L"

    .line 78
    .line 79
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lax/b3/j;

    .line 91
    .line 92
    const-string p2, "New files exception 1"

    .line 93
    .line 94
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_61
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    const-string v0, "NF3L:"

    .line 103
    .line 104
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 117
    .line 118
    .line 119
    new-instance p1, Lax/b3/j;

    .line 120
    .line 121
    const-string p2, "New files not reachable"

    .line 122
    .line 123
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
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

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 2

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_4
    invoke-static {p1}, Lax/c3/B;->W(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/file/u;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/file/u;->V1(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method protected T1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 4

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/C;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v0, p0, v1, p1}, Lcom/voxdon/xplorer/file/C;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lax/c3/K;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public z0(Ljava/io/File;Lax/c3/K;Z)Lcom/voxdon/xplorer/file/y;
    .registers 4

    .line 1
    new-instance p3, Lcom/voxdon/xplorer/file/C;

    .line 2
    .line 3
    invoke-direct {p3, p0, p1, p2}, Lcom/voxdon/xplorer/file/C;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lax/c3/K;)V

    .line 4
    .line 5
    .line 6
    return-object p3
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
