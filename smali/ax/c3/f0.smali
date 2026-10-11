.class public Lax/c3/f0;
.super Landroid/media/MediaDataSource;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c3/f0$a;
    }
.end annotation


# static fields
.field private static final i0:Ljava/util/logging/Logger;


# instance fields
.field private c0:J

.field private d0:J

.field private e0:I

.field private f0:Lcom/voxdon/xplorer/file/m;

.field private g0:Lcom/voxdon/xplorer/file/n;

.field private h0:Lax/u3/c;

.field private q:Lax/c3/f0$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.RemoteMediaDataSource"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/c3/f0;->i0:Ljava/util/logging/Logger;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;Lax/u3/c;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/c3/f0;->f0:Lcom/voxdon/xplorer/file/m;

    .line 5
    .line 6
    iput-object p2, p0, Lax/c3/f0;->g0:Lcom/voxdon/xplorer/file/n;

    .line 7
    .line 8
    iput-object p3, p0, Lax/c3/f0;->h0:Lax/u3/c;

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

.method private a(J)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 10
    .line 11
    :cond_a
    iget v0, p0, Lax/c3/f0;->e0:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p0, Lax/c3/f0;->e0:I

    .line 16
    .line 17
    new-instance v0, Lax/c3/f0$a;

    .line 18
    .line 19
    iget-object v1, p0, Lax/c3/f0;->f0:Lcom/voxdon/xplorer/file/m;

    .line 20
    .line 21
    iget-object v2, p0, Lax/c3/f0;->g0:Lcom/voxdon/xplorer/file/n;

    .line 22
    .line 23
    invoke-interface {v1, v2, p1, p2}, Lcom/voxdon/xplorer/file/c;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const v2, 0x24000

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, Lax/c3/f0$a;-><init>(Ljava/io/InputStream;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->mark(I)V

    .line 36
    .line 37
    .line 38
    iput-wide p1, p0, Lax/c3/f0;->d0:J

    .line 39
    .line 40
    iput-wide p1, p0, Lax/c3/f0;->c0:J

    .line 41
    .line 42
    return-void
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

.method private b()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_1a

    .line 6
    :cond_5
    invoke-virtual {v0}, Lax/c3/f0$a;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    goto :goto_1a

    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/c3/f0$a;->b()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ltz v0, :cond_1a

    .line 20
    .line 21
    iget-wide v1, p0, Lax/c3/f0;->d0:J

    .line 22
    .line 23
    int-to-long v3, v0

    .line 24
    sub-long/2addr v1, v3

    .line 25
    iput-wide v1, p0, Lax/c3/f0;->c0:J

    .line 26
    .line 27
    :cond_1a
    :goto_1a
    return-void
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
.end method

.method private c(J)J
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    move-wide v3, v1

    .line 10
    const/4 v5, 0x0

    .line 11
    :cond_a
    iget-object v6, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 12
    .line 13
    sub-long v7, p1, v3

    .line 14
    .line 15
    invoke-virtual {v6, v7, v8}, Ljava/io/InputStream;->skip(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    cmp-long v8, v6, v1

    .line 20
    .line 21
    if-ltz v8, :cond_2d

    .line 22
    .line 23
    if-nez v8, :cond_27

    .line 24
    .line 25
    add-int/lit8 v5, v5, 0x1

    .line 26
    .line 27
    const/16 v8, 0xa

    .line 28
    .line 29
    if-gt v5, v8, :cond_1f

    .line 30
    .line 31
    goto :goto_28

    .line 32
    :cond_1f
    new-instance p1, Ljava/io/IOException;

    .line 33
    .line 34
    const-string p2, "Too many skip zero"

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_27
    const/4 v5, 0x0

    .line 41
    :goto_28
    add-long/2addr v3, v6

    .line 42
    cmp-long v6, v3, p1

    .line 43
    .line 44
    if-ltz v6, :cond_a

    .line 45
    .line 46
    :cond_2d
    iget-wide p1, p0, Lax/c3/f0;->d0:J

    .line 47
    .line 48
    add-long/2addr p1, v3

    .line 49
    iput-wide p1, p0, Lax/c3/f0;->d0:J

    .line 50
    .line 51
    return-wide v3
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


# virtual methods
.method public close()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_7} :catch_7

    .line 6
    .line 7
    .line 8
    :catch_7
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 10
    .line 11
    :cond_a
    return-void
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

.method public getSize()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/f0;->g0:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/c3/b;->p()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public readAt(J[BII)I
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/f0;->h0:Lax/u3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_1c

    .line 4
    .line 5
    invoke-interface {v0}, Lax/u3/c;->isCancelled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1c

    .line 10
    .line 11
    iget-object p1, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 12
    .line 13
    if-eqz p1, :cond_14

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 20
    .line 21
    :cond_14
    new-instance p1, Ljava/io/IOException;

    .line 22
    .line 23
    const-string p2, "cancelled"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1c
    :try_start_1c
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 30
    .line 31
    if-eqz v0, :cond_43

    .line 32
    .line 33
    iget-wide v1, p0, Lax/c3/f0;->d0:J

    .line 34
    .line 35
    cmp-long v3, p1, v1

    .line 36
    .line 37
    if-lez v3, :cond_43

    .line 38
    .line 39
    sub-long v3, p1, v1

    .line 40
    .line 41
    const-wide/32 v5, 0x24000

    .line 42
    .line 43
    .line 44
    cmp-long v7, v3, v5

    .line 45
    .line 46
    if-gez v7, :cond_43

    .line 47
    .line 48
    sub-long v1, p1, v1

    .line 49
    .line 50
    invoke-direct {p0, v1, v2}, Lax/c3/f0;->c(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    cmp-long v0, v1, v3

    .line 55
    .line 56
    if-nez v0, :cond_3f

    .line 57
    .line 58
    invoke-direct {p0}, Lax/c3/f0;->b()V

    .line 59
    .line 60
    .line 61
    goto :goto_72

    .line 62
    :catch_3d
    move-exception p1

    .line 63
    goto :goto_8f

    .line 64
    :cond_3f
    invoke-direct {p0, p1, p2}, Lax/c3/f0;->a(J)V

    .line 65
    .line 66
    .line 67
    goto :goto_72

    .line 68
    :cond_43
    if-eqz v0, :cond_65

    .line 69
    .line 70
    iget-wide v1, p0, Lax/c3/f0;->d0:J

    .line 71
    .line 72
    cmp-long v3, p1, v1

    .line 73
    .line 74
    if-gez v3, :cond_65

    .line 75
    .line 76
    iget-wide v1, p0, Lax/c3/f0;->c0:J

    .line 77
    .line 78
    cmp-long v3, p1, v1

    .line 79
    .line 80
    if-ltz v3, :cond_65

    .line 81
    .line 82
    invoke-virtual {v0}, Lax/c3/f0$a;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_65

    .line 87
    .line 88
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 91
    .line 92
    .line 93
    iget-wide v0, p0, Lax/c3/f0;->c0:J

    .line 94
    .line 95
    iput-wide v0, p0, Lax/c3/f0;->d0:J

    .line 96
    .line 97
    sub-long/2addr p1, v0

    .line 98
    invoke-direct {p0, p1, p2}, Lax/c3/f0;->c(J)J

    .line 99
    .line 100
    .line 101
    goto :goto_72

    .line 102
    :cond_65
    iget-wide v0, p0, Lax/c3/f0;->d0:J

    .line 103
    .line 104
    cmp-long v2, v0, p1

    .line 105
    .line 106
    if-nez v2, :cond_6f

    .line 107
    .line 108
    iget-object v0, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 109
    .line 110
    if-nez v0, :cond_72

    .line 111
    .line 112
    :cond_6f
    invoke-direct {p0, p1, p2}, Lax/c3/f0;->a(J)V

    .line 113
    .line 114
    .line 115
    :cond_72
    :goto_72
    const/4 p1, 0x0

    .line 116
    :cond_73
    iget-object p2, p0, Lax/c3/f0;->q:Lax/c3/f0$a;

    .line 117
    .line 118
    add-int v0, p4, p1

    .line 119
    .line 120
    sub-int v1, p5, p1

    .line 121
    .line 122
    invoke-virtual {p2, p3, v0, v1}, Ljava/io/InputStream;->read([BII)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-ltz p2, :cond_82

    .line 127
    .line 128
    add-int/2addr p1, p2

    .line 129
    if-lt p1, p5, :cond_73

    .line 130
    .line 131
    :cond_82
    if-lez p1, :cond_8e

    .line 132
    .line 133
    iget-wide p2, p0, Lax/c3/f0;->d0:J

    .line 134
    .line 135
    int-to-long p4, p1

    .line 136
    add-long/2addr p2, p4

    .line 137
    iput-wide p2, p0, Lax/c3/f0;->d0:J

    .line 138
    .line 139
    invoke-direct {p0}, Lax/c3/f0;->b()V
    :try_end_8d
    .catch Lax/b3/j; {:try_start_1c .. :try_end_8d} :catch_3d

    .line 140
    .line 141
    .line 142
    return p1

    .line 143
    :cond_8e
    return p2

    .line 144
    :goto_8f
    new-instance p2, Ljava/io/IOException;

    .line 145
    .line 146
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw p2
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
