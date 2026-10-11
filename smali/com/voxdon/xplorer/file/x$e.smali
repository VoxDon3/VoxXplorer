.class Lcom/voxdon/xplorer/file/x$e;
.super Lax/c3/H;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field c0:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;JJ)V
    .registers 6

    .line 1
    invoke-direct {p0, p1}, Lax/c3/H;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    sub-long/2addr p2, p4

    .line 5
    iput-wide p2, p0, Lcom/voxdon/xplorer/file/x$e;->c0:J

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


# virtual methods
.method public read()I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lax/c3/H;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    .line 2
    iget-wide v1, p0, Lcom/voxdon/xplorer/file/x$e;->c0:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/voxdon/xplorer/file/x$e;->c0:J

    :cond_e
    return v0
.end method

.method public read([B)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/voxdon/xplorer/file/x$e;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, -0x1

    .line 4
    :try_start_1
    invoke-super {p0, p1, p2, p3}, Lax/c3/H;->read([BII)I

    move-result p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_5} :catch_6

    goto :goto_25

    :catch_6
    move-exception p3

    .line 5
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 6
    const-string v2, "io utils error :"

    if-eqz v1, :cond_4d

    const-string v3, "ENOENT"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4d

    .line 7
    invoke-virtual {p0}, Lax/c3/H;->available()I

    move-result v3

    if-lez v3, :cond_2e

    .line 8
    invoke-virtual {p0}, Lax/c3/H;->available()I

    move-result p3

    invoke-super {p0, p1, p2, p3}, Lax/c3/H;->read([BII)I

    move-result p1

    :goto_25
    if-eq p1, v0, :cond_2d

    .line 9
    iget-wide p2, p0, Lcom/voxdon/xplorer/file/x$e;->c0:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lcom/voxdon/xplorer/file/x$e;->c0:J

    :cond_2d
    return p1

    :cond_2e
    if-nez v3, :cond_3a

    .line 10
    iget-wide p1, p0, Lcom/voxdon/xplorer/file/x$e;->c0:J

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_39

    return v0

    .line 11
    :cond_39
    throw p3

    .line 12
    :cond_3a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 13
    throw p3

    .line 14
    :cond_4d
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 15
    throw p3
.end method
