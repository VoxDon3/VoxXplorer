.class public Lax/X3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/M3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X3/o$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/M3/k<",
        "Landroid/os/ParcelFileDescriptor;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lax/M3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/M3/i<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lax/M3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/M3/i<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lax/X3/o$c;


# instance fields
.field private final a:Lax/Q3/d;

.field private final b:Lax/X3/o$c;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lax/X3/o$a;

    .line 8
    .line 9
    invoke-direct {v1}, Lax/X3/o$a;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lax/M3/i;->a(Ljava/lang/String;Ljava/lang/Object;Lax/M3/i$b;)Lax/M3/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lax/X3/o;->c:Lax/M3/i;

    .line 19
    .line 20
    new-instance v0, Lax/X3/o$b;

    .line 21
    .line 22
    invoke-direct {v0}, Lax/X3/o$b;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {v1, v2, v0}, Lax/M3/i;->a(Ljava/lang/String;Ljava/lang/Object;Lax/M3/i$b;)Lax/M3/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lax/X3/o;->d:Lax/M3/i;

    .line 33
    .line 34
    new-instance v0, Lax/X3/o$c;

    .line 35
    .line 36
    invoke-direct {v0}, Lax/X3/o$c;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lax/X3/o;->e:Lax/X3/o$c;

    .line 40
    .line 41
    return-void
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

.method public constructor <init>(Lax/Q3/d;)V
    .registers 3

    .line 1
    sget-object v0, Lax/X3/o;->e:Lax/X3/o$c;

    invoke-direct {p0, p1, v0}, Lax/X3/o;-><init>(Lax/Q3/d;Lax/X3/o$c;)V

    return-void
.end method

.method constructor <init>(Lax/Q3/d;Lax/X3/o$c;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/X3/o;->a:Lax/Q3/d;

    .line 4
    iput-object p2, p0, Lax/X3/o;->b:Lax/X3/o$c;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILax/M3/j;)Lax/P3/s;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lax/X3/o;->c(Landroid/os/ParcelFileDescriptor;IILax/M3/j;)Lax/P3/s;

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

.method public bridge synthetic b(Ljava/lang/Object;Lax/M3/j;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/X3/o;->d(Landroid/os/ParcelFileDescriptor;Lax/M3/j;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public c(Landroid/os/ParcelFileDescriptor;IILax/M3/j;)Lax/P3/s;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelFileDescriptor;",
            "II",
            "Lax/M3/j;",
            ")",
            "Lax/P3/s<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object p2, Lax/X3/o;->c:Lax/M3/i;

    .line 2
    .line 3
    invoke-virtual {p4, p2}, Lax/M3/j;->c(Lax/M3/i;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long v4, p2, v0

    .line 18
    .line 19
    if-gez v4, :cond_30

    .line 20
    .line 21
    cmp-long v0, p2, v2

    .line 22
    .line 23
    if-nez v0, :cond_19

    .line 24
    .line 25
    goto :goto_30

    .line 26
    :cond_19
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance p4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v0, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    .line 34
    .line 35
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_30
    :goto_30
    sget-object v0, Lax/X3/o;->d:Lax/M3/i;

    .line 50
    .line 51
    invoke-virtual {p4, v0}, Lax/M3/j;->c(Lax/M3/i;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    check-cast p4, Ljava/lang/Integer;

    .line 56
    .line 57
    iget-object v0, p0, Lax/X3/o;->b:Lax/X3/o$c;

    .line 58
    .line 59
    invoke-virtual {v0}, Lax/X3/o$c;->a()Landroid/media/MediaMetadataRetriever;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :try_start_3e
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 68
    .line 69
    .line 70
    cmp-long v1, p2, v2

    .line 71
    .line 72
    if-nez v1, :cond_50

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime()Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    goto :goto_5f

    .line 79
    :catchall_4e
    move-exception p1

    .line 80
    goto :goto_6c

    .line 81
    :cond_50
    if-nez p4, :cond_57

    .line 82
    .line 83
    invoke-virtual {v0, p2, p3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    goto :goto_5f

    .line 88
    :cond_57
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    invoke-virtual {v0, p2, p3, p4}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 93
    .line 94
    .line 95
    move-result-object p2
    :try_end_5f
    .catchall {:try_start_3e .. :try_end_5f} :catchall_4e

    .line 96
    :goto_5f
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lax/X3/o;->a:Lax/Q3/d;

    .line 103
    .line 104
    invoke-static {p2, p1}, Lax/X3/e;->d(Landroid/graphics/Bitmap;Lax/Q3/d;)Lax/X3/e;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :goto_6c
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 110
    .line 111
    .line 112
    throw p1
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

.method public d(Landroid/os/ParcelFileDescriptor;Lax/M3/j;)Z
    .registers 3

    .line 1
    iget-object p2, p0, Lax/X3/o;->b:Lax/X3/o$c;

    .line 2
    .line 3
    invoke-virtual {p2}, Lax/X3/o$c;->a()Landroid/media/MediaMetadataRetriever;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    :try_start_6
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p2, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_d} :catch_17
    .catchall {:try_start_6 .. :try_end_d} :catchall_12

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :catch_17
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1
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
