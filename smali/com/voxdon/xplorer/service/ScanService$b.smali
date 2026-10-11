.class Lcom/voxdon/xplorer/service/ScanService$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/service/ScanService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/service/ScanService$b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field h:[Lax/o3/f;

.field i:Landroid/content/Context;

.field j:I

.field final k:Ljava/util/concurrent/CountDownLatch;

.field final l:Ljava/util/concurrent/CountDownLatch;

.field m:J

.field final synthetic n:Lcom/voxdon/xplorer/service/ScanService;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/service/ScanService;Landroid/content/Context;[Lax/o3/f;I)V
    .registers 6

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->n:Lcom/voxdon/xplorer/service/ScanService;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->j0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->k:Ljava/util/concurrent/CountDownLatch;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->l:Ljava/util/concurrent/CountDownLatch;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/voxdon/xplorer/service/ScanService$b;->i:Landroid/content/Context;

    .line 24
    .line 25
    iput-object p3, p0, Lcom/voxdon/xplorer/service/ScanService$b;->h:[Lax/o3/f;

    .line 26
    .line 27
    iput p4, p0, Lcom/voxdon/xplorer/service/ScanService$b;->j:I

    .line 28
    .line 29
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/ScanService$b;->w([Ljava/lang/Void;)Ljava/lang/Void;

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/service/ScanService$b;->x(Ljava/lang/Void;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 10

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/service/ScanService$b;->h:[Lax/o3/f;

    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/service/ScanService$b;->i:Landroid/content/Context;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v0, p1, v1}, Lax/c3/M;->b(Landroid/content/Context;Ljava/util/List;Lax/g3/i;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/service/ScanService$b;->i:Landroid/content/Context;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, p1, v2, v1}, Lax/c3/M;->c(Landroid/content/Context;Ljava/util/List;ZLax/g3/i;)I

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :cond_20
    :goto_20
    if-ge v2, v3, :cond_41

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    check-cast v4, Lax/o3/f;

    .line 42
    .line 43
    iget-boolean v5, v4, Lax/o3/f;->q:Z

    .line 44
    .line 45
    if-nez v5, :cond_20

    .line 46
    .line 47
    iget-boolean v5, v4, Lax/o3/f;->m0:Z

    .line 48
    .line 49
    if-eqz v5, :cond_20

    .line 50
    .line 51
    new-instance v5, Lcom/voxdon/xplorer/service/ScanService$a;

    .line 52
    .line 53
    iget-object v6, v4, Lax/o3/f;->c0:Ljava/lang/String;

    .line 54
    .line 55
    iget-boolean v7, v4, Lax/o3/f;->d0:Z

    .line 56
    .line 57
    iget-boolean v4, v4, Lax/o3/f;->e0:Z

    .line 58
    .line 59
    invoke-direct {v5, v6, v7, v4}, Lcom/voxdon/xplorer/service/ScanService$a;-><init>(Ljava/lang/String;ZZ)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_20

    .line 66
    :cond_41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-lez p1, :cond_7d

    .line 71
    .line 72
    new-instance p1, Lcom/voxdon/xplorer/service/ScanService$b$b;

    .line 73
    .line 74
    invoke-direct {p1, p0, v0}, Lcom/voxdon/xplorer/service/ScanService$b$b;-><init>(Lcom/voxdon/xplorer/service/ScanService$b;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/media/MediaScannerConnection;

    .line 78
    .line 79
    iget-object v2, p0, Lcom/voxdon/xplorer/service/ScanService$b;->n:Lcom/voxdon/xplorer/service/ScanService;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-direct {v0, v2, p1}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p1, Lcom/voxdon/xplorer/service/ScanService$b$b;->b:Landroid/media/MediaScannerConnection;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->connect()V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    iput-wide v2, p0, Lcom/voxdon/xplorer/service/ScanService$b;->m:J

    .line 98
    .line 99
    :try_start_62
    invoke-static {}, Lax/X2/Q;->S()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_6b

    .line 104
    .line 105
    const-wide/16 v2, 0x7

    .line 106
    .line 107
    goto :goto_6d

    .line 108
    :cond_6b
    const-wide/16 v2, 0x19

    .line 109
    .line 110
    :goto_6d
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->k:Ljava/util/concurrent/CountDownLatch;

    .line 111
    .line 112
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 113
    .line 114
    invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_82

    .line 119
    .line 120
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->l:Ljava/util/concurrent/CountDownLatch;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_7c
    .catch Ljava/lang/InterruptedException; {:try_start_62 .. :try_end_7c} :catch_82

    .line 123
    .line 124
    .line 125
    goto :goto_82

    .line 126
    :cond_7d
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->l:Ljava/util/concurrent/CountDownLatch;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 129
    .line 130
    .line 131
    :catch_82
    :cond_82
    :goto_82
    :try_start_82
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->l:Ljava/util/concurrent/CountDownLatch;

    .line 132
    .line 133
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 134
    .line 135
    const-wide/16 v2, 0x12c

    .line 136
    .line 137
    invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_8b
    .catch Ljava/lang/InterruptedException; {:try_start_82 .. :try_end_8b} :catch_8b

    .line 138
    .line 139
    .line 140
    :catch_8b
    return-object v1
    .line 141
    .line 142
    .line 143
.end method

.method protected x(Ljava/lang/Void;)V
    .registers 5

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->n:Lcom/voxdon/xplorer/service/ScanService;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/service/ScanService;->a(Lcom/voxdon/xplorer/service/ScanService;)Ljava/util/HashMap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p0, Lcom/voxdon/xplorer/service/ScanService$b;->j:I

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz p1, :cond_22

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_22

    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->n:Lcom/voxdon/xplorer/service/ScanService;

    .line 28
    .line 29
    iget v0, p0, Lcom/voxdon/xplorer/service/ScanService$b;->j:I

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/app/Service;->stopSelf(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b;->n:Lcom/voxdon/xplorer/service/ScanService;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/voxdon/xplorer/service/ScanService;->b(Lcom/voxdon/xplorer/service/ScanService;)Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Lcom/voxdon/xplorer/service/ScanService$b$a;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/service/ScanService$b$a;-><init>(Lcom/voxdon/xplorer/service/ScanService$b;)V

    .line 44
    .line 45
    .line 46
    const-wide/16 v1, 0x3e8

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 49
    .line 50
    .line 51
    return-void
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
