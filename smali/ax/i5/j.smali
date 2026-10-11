.class Lax/i5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static d:I = -0x1

.field private static e:I = 0x0

.field private static f:I = 0x1e4

.field private static g:I = 0x1fc

.field private static h:I = 0x1e8

.field private static i:I = 0x1ec

.field private static j:I = 0x41615252

.field private static k:I = 0x61417272

.field private static l:I = -0x55ab0000

.field private static final m:Ljava/lang/String; = "j"


# instance fields
.field private a:I

.field private b:Lax/e5/a;

.field private c:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method private constructor <init>(Lax/e5/a;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/i5/j;->b:Lax/e5/a;

    .line 5
    .line 6
    iput p2, p0, Lax/i5/j;->a:I

    .line 7
    .line 8
    const/16 v0, 0x200

    .line 9
    .line 10
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    int-to-long v0, p2

    .line 22
    iget-object p2, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-interface {p1, v0, v1, p2}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    sget p2, Lax/i5/j;->e:I

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    sget p2, Lax/i5/j;->j:I

    .line 41
    .line 42
    if-ne p1, p2, :cond_44

    .line 43
    .line 44
    iget-object p1, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    sget p2, Lax/i5/j;->f:I

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    sget p2, Lax/i5/j;->k:I

    .line 53
    .line 54
    if-ne p1, p2, :cond_44

    .line 55
    .line 56
    iget-object p1, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    sget p2, Lax/i5/j;->g:I

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    sget p2, Lax/i5/j;->l:I

    .line 65
    .line 66
    if-ne p1, p2, :cond_44

    .line 67
    .line 68
    return-void

    .line 69
    :cond_44
    new-instance p1, Lcom/github/mjdev/libaums/b;

    .line 70
    .line 71
    const-string p2, "invalid fs info structure!"

    .line 72
    .line 73
    invoke-direct {p1, p2}, Lcom/github/mjdev/libaums/b;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
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

.method static d(Lax/e5/a;I)Lax/i5/j;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/i5/j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lax/i5/j;-><init>(Lax/e5/a;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
.method a(J)V
    .registers 8

    .line 1
    invoke-virtual {p0}, Lax/i5/j;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget v2, Lax/i5/j;->d:I

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_f

    .line 11
    .line 12
    sub-long/2addr v0, p1

    .line 13
    invoke-virtual {p0, v0, v1}, Lax/i5/j;->e(J)V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method b()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    sget v1, Lax/i5/j;->h:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    return-wide v0
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

.method c()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    sget v1, Lax/i5/j;->i:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    return-wide v0
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

.method e(J)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    sget v1, Lax/i5/j;->h:I

    .line 4
    .line 5
    long-to-int p2, p1

    .line 6
    invoke-virtual {v0, v1, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

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
    .line 22
.end method

.method f(J)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    sget v1, Lax/i5/j;->i:I

    .line 4
    .line 5
    long-to-int p2, p1

    .line 6
    invoke-virtual {v0, v1, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

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
    .line 22
.end method

.method g()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/i5/j;->m:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "writing to device"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/i5/j;->b:Lax/e5/a;

    .line 9
    .line 10
    iget v1, p0, Lax/i5/j;->a:I

    .line 11
    .line 12
    int-to-long v1, v1

    .line 13
    iget-object v3, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, v3}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/i5/j;->c:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 21
    .line 22
    .line 23
    return-void
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
.end method
