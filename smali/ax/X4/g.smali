.class Lax/X4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:[I

.field private c:I


# direct methods
.method public constructor <init>(J)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-lez v2, :cond_23

    .line 9
    .line 10
    const-wide/32 v0, 0x7fffffff

    .line 11
    .line 12
    .line 13
    cmp-long v2, p1, v0

    .line 14
    .line 15
    if-gez v2, :cond_23

    .line 16
    .line 17
    const-wide/16 v0, 0x3f

    .line 18
    .line 19
    add-long/2addr p1, v0

    .line 20
    const/4 v0, 0x6

    .line 21
    ushr-long/2addr p1, v0

    .line 22
    long-to-int p2, p1

    .line 23
    add-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    shl-int/lit8 p1, p2, 0x1

    .line 26
    .line 27
    iput p1, p0, Lax/X4/g;->a:I

    .line 28
    .line 29
    new-array p2, p1, [I

    .line 30
    .line 31
    iput-object p2, p0, Lax/X4/g;->b:[I

    .line 32
    .line 33
    iput p1, p0, Lax/X4/g;->c:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v2, "numBits="

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
    .line 59
    .line 60
    .line 61
.end method

.method private d(I)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/X4/g;->b:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    return p1
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

.method private e(II)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/X4/g;->b:[I

    .line 2
    .line 3
    aput p2, v0, p1

    .line 4
    .line 5
    return-void
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
.method public a(I)V
    .registers 9

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    int-to-long v0, p1

    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    iget p1, p0, Lax/X4/g;->a:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    :goto_e
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v6, v0, v4

    .line 18
    .line 19
    if-eqz v6, :cond_26

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lax/X4/g;->d(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    int-to-long v4, v4

    .line 26
    and-long/2addr v4, v2

    .line 27
    add-long/2addr v4, v0

    .line 28
    long-to-int v0, v4

    .line 29
    invoke-direct {p0, p1, v0}, Lax/X4/g;->e(II)V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x20

    .line 33
    .line 34
    ushr-long v0, v4, v0

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    goto :goto_e

    .line 39
    :cond_26
    iget v0, p0, Lax/X4/g;->c:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lax/X4/g;->c:I

    .line 48
    .line 49
    return-void
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

.method public b(II)V
    .registers 10

    .line 1
    int-to-long v0, p1

    .line 2
    const-wide v2, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    int-to-long p1, p2

    .line 9
    iget v4, p0, Lax/X4/g;->a:I

    .line 10
    .line 11
    add-int/lit8 v4, v4, -0x1

    .line 12
    .line 13
    :goto_c
    iget v5, p0, Lax/X4/g;->c:I

    .line 14
    .line 15
    if-lt v4, v5, :cond_24

    .line 16
    .line 17
    invoke-direct {p0, v4}, Lax/X4/g;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    int-to-long v5, v5

    .line 22
    and-long/2addr v5, v2

    .line 23
    mul-long v5, v5, v0

    .line 24
    .line 25
    add-long/2addr v5, p1

    .line 26
    long-to-int p1, v5

    .line 27
    invoke-direct {p0, v4, p1}, Lax/X4/g;->e(II)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x20

    .line 31
    .line 32
    ushr-long p1, v5, p1

    .line 33
    .line 34
    add-int/lit8 v4, v4, -0x1

    .line 35
    .line 36
    goto :goto_c

    .line 37
    :cond_24
    const-wide/16 v0, 0x0

    .line 38
    .line 39
    cmp-long v2, p1, v0

    .line 40
    .line 41
    if-eqz v2, :cond_30

    .line 42
    .line 43
    long-to-int p2, p1

    .line 44
    invoke-direct {p0, v4, p2}, Lax/X4/g;->e(II)V

    .line 45
    .line 46
    .line 47
    iput v4, p0, Lax/X4/g;->c:I

    .line 48
    .line 49
    :cond_30
    return-void
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
.end method

.method public c()Ljava/math/BigInteger;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/X4/g;->b:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    shl-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_10
    iget-object v3, p0, Lax/X4/g;->b:[I

    .line 18
    .line 19
    array-length v4, v3

    .line 20
    if-ge v2, v4, :cond_1d

    .line 21
    .line 22
    aget v3, v3, v2

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Ljava/nio/IntBuffer;->put(II)Ljava/nio/IntBuffer;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_10

    .line 30
    :cond_1d
    new-instance v1, Ljava/math/BigInteger;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>([B)V

    .line 33
    .line 34
    .line 35
    return-object v1
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
