.class public Lcom/voxdon/xplorer/provider/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/os/Handler;

.field private c:Lax/l3/b;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/provider/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lax/l3/b;

    .line 7
    .line 8
    invoke-direct {p1}, Lax/l3/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/voxdon/xplorer/provider/a;->c:Lax/l3/b;

    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a;->c:Lax/l3/b;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/l3/b;->b()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/voxdon/xplorer/provider/a;->b:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
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
.end method

.method public static a(Lax/b3/j;Ljava/lang/String;)Landroid/system/ErrnoException;
    .registers 3

    .line 1
    if-nez p1, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_6
    instance-of v0, p0, Lax/b3/t;

    .line 8
    .line 9
    if-eqz v0, :cond_12

    .line 10
    .line 11
    new-instance p0, Landroid/system/ErrnoException;

    .line 12
    .line 13
    sget v0, Landroid/system/OsConstants;->ENOENT:I

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Landroid/system/ErrnoException;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_12
    instance-of p0, p0, Lax/b3/e;

    .line 20
    .line 21
    if-eqz p0, :cond_1e

    .line 22
    .line 23
    new-instance p0, Landroid/system/ErrnoException;

    .line 24
    .line 25
    sget v0, Landroid/system/OsConstants;->EACCES:I

    .line 26
    .line 27
    invoke-direct {p0, p1, v0}, Landroid/system/ErrnoException;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1e
    new-instance p0, Landroid/system/ErrnoException;

    .line 32
    .line 33
    sget v0, Landroid/system/OsConstants;->EIO:I

    .line 34
    .line 35
    invoke-direct {p0, p1, v0}, Landroid/system/ErrnoException;-><init>(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public b(Lax/Z2/k;I)Landroid/os/ParcelFileDescriptor;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_27

    .line 14
    .line 15
    invoke-static {}, Lax/u3/B;->H()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1b

    .line 20
    .line 21
    const-wide/16 v1, 0x2710

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/voxdon/xplorer/file/o;->i(J)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v1, 0x0

    .line 29
    :goto_1c
    if-eqz v1, :cond_1f

    .line 30
    .line 31
    goto :goto_27

    .line 32
    :cond_1f
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 33
    .line 34
    const-string p2, "Network location is not connected"

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_27
    :goto_27
    iget-object v1, p0, Lcom/voxdon/xplorer/provider/a;->a:Landroid/content/Context;

    .line 41
    .line 42
    const-string v2, "storage"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroid/os/storage/StorageManager;

    .line 49
    .line 50
    new-instance v2, Lcom/voxdon/xplorer/provider/a$a;

    .line 51
    .line 52
    invoke-direct {v2, p0, v0, p1, p2}, Lcom/voxdon/xplorer/provider/a$a;-><init>(Lcom/voxdon/xplorer/provider/a;Lcom/voxdon/xplorer/file/o;Lax/Z2/k;I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/voxdon/xplorer/provider/a;->b:Landroid/os/Handler;

    .line 56
    .line 57
    invoke-static {v1, p2, v2, p1}, Lax/l3/c;->a(Landroid/os/storage/StorageManager;ILandroid/os/ProxyFileDescriptorCallback;Landroid/os/Handler;)Landroid/os/ParcelFileDescriptor;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
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
.end method
