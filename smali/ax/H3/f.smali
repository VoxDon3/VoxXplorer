.class public Lax/H3/f;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field private final c0:Lax/F3/b;

.field private d0:J

.field private e0:J

.field private final q:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lax/F3/b;J)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/H3/f;->q:Ljava/io/OutputStream;

    .line 5
    .line 6
    iput-object p2, p0, Lax/H3/f;->c0:Lax/F3/b;

    .line 7
    .line 8
    iput-wide p3, p0, Lax/H3/f;->d0:J

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


# virtual methods
.method public close()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/H3/f;->q:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/io/OutputStream;->close()V

    .line 7
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

.method public flush()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/H3/f;->q:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/io/OutputStream;->flush()V

    .line 7
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

.method public write(I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lax/H3/f;->q:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 10
    iget-wide v0, p0, Lax/H3/f;->e0:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lax/H3/f;->e0:J

    .line 11
    iget-object p1, p0, Lax/H3/f;->c0:Lax/F3/b;

    iget-wide v2, p0, Lax/H3/f;->d0:J

    invoke-interface {p1, v0, v1, v2, v3}, Lax/F3/b;->a(JJ)V

    return-void
.end method

.method public write([B)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/H3/f;->q:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 2
    iget-wide v0, p0, Lax/H3/f;->e0:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lax/H3/f;->e0:J

    .line 3
    iget-object p1, p0, Lax/H3/f;->c0:Lax/F3/b;

    iget-wide v2, p0, Lax/H3/f;->d0:J

    invoke-interface {p1, v0, v1, v2, v3}, Lax/F3/b;->a(JJ)V

    return-void
.end method

.method public write([BII)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lax/H3/f;->q:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 5
    array-length p2, p1

    if-ge p3, p2, :cond_f

    .line 6
    iget-wide p1, p0, Lax/H3/f;->e0:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lax/H3/f;->e0:J

    goto :goto_16

    .line 7
    :cond_f
    iget-wide p2, p0, Lax/H3/f;->e0:J

    array-length p1, p1

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lax/H3/f;->e0:J

    .line 8
    :goto_16
    iget-object p1, p0, Lax/H3/f;->c0:Lax/F3/b;

    iget-wide p2, p0, Lax/H3/f;->e0:J

    iget-wide v0, p0, Lax/H3/f;->d0:J

    invoke-interface {p1, p2, p3, v0, v1}, Lax/F3/b;->a(JJ)V

    return-void
.end method
