.class Lcom/voxdon/xplorer/provider/MyFileProvider$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/provider/MyFileProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/voxdon/xplorer/file/n;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lcom/voxdon/xplorer/provider/MyFileProvider$c;

.field i:Ljava/util/concurrent/CountDownLatch;

.field j:Lcom/voxdon/xplorer/file/n;

.field k:Z


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/provider/MyFileProvider$c;Ljava/util/concurrent/CountDownLatch;)V
    .registers 4

    .line 1
    sget-object v0, Lax/u3/q$e;->d0:Lax/u3/q$e;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lax/u3/B;->H()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput-boolean v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->k:Z

    .line 11
    .line 12
    iput-object p1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->h:Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->i:Ljava/util/concurrent/CountDownLatch;

    .line 15
    .line 16
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->w([Ljava/lang/Void;)Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected o()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->i:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

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
.end method

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->y(Lcom/voxdon/xplorer/file/n;)V

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

.method protected varargs w([Ljava/lang/Void;)Lcom/voxdon/xplorer/file/n;
    .registers 7

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->h:Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->e()Lax/c3/K;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_a
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_35

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->k:Z

    .line 23
    .line 24
    if-nez v1, :cond_20

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    invoke-virtual {v0, v3, v4}, Lcom/voxdon/xplorer/file/o;->i(J)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_32

    .line 33
    :cond_20
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
    const-string v3, "PROXY FILE OPERATOR NOT CONNECTED"

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lax/Ha/b;->h()V
    :try_end_31
    .catch Lax/b3/j; {:try_start_1 .. :try_end_31} :catch_49

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_32
    if-nez v1, :cond_35

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_35
    :try_start_35
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->h:Lcom/voxdon/xplorer/provider/MyFileProvider$c;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/voxdon/xplorer/provider/MyFileProvider$c;->d:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_40
    .catchall {:try_start_35 .. :try_end_40} :catchall_44

    .line 65
    :try_start_40
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :catchall_44
    move-exception v1

    .line 70
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 71
    .line 72
    .line 73
    throw v1
    :try_end_49
    .catch Lax/b3/j; {:try_start_40 .. :try_end_49} :catch_49

    .line 74
    :catch_49
    return-object p1
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

.method x()Lcom/voxdon/xplorer/file/n;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->j:Lcom/voxdon/xplorer/file/n;

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

.method protected y(Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->j:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/provider/MyFileProvider$b;->i:Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 6
    .line 7
    .line 8
    return-void
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
