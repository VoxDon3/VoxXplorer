.class Lax/K3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field private final c0:Ljava/nio/charset/Charset;

.field private d0:[B

.field private e0:I

.field private f0:I

.field private final q:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;ILjava/nio/charset/Charset;)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2a

    if-eqz p3, :cond_2a

    if-ltz p2, :cond_22

    .line 3
    sget-object v0, Lax/K3/c;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p3, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 4
    iput-object p1, p0, Lax/K3/b;->q:Ljava/io/InputStream;

    .line 5
    iput-object p3, p0, Lax/K3/b;->c0:Ljava/nio/charset/Charset;

    .line 6
    new-array p1, p2, [B

    iput-object p1, p0, Lax/K3/b;->d0:[B

    return-void

    .line 7
    :cond_1a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported encoding"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_22
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "capacity <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    const/4 p1, 0x0

    .line 9
    throw p1
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .registers 4

    const/16 v0, 0x2000

    .line 1
    invoke-direct {p0, p1, v0, p2}, Lax/K3/b;-><init>(Ljava/io/InputStream;ILjava/nio/charset/Charset;)V

    return-void
.end method

.method static synthetic a(Lax/K3/b;)Ljava/nio/charset/Charset;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/K3/b;->c0:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method private b()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/b;->q:Ljava/io/InputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lax/K3/b;->d0:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_12

    .line 13
    .line 14
    iput v3, p0, Lax/K3/b;->e0:I

    .line 15
    .line 16
    iput v0, p0, Lax/K3/b;->f0:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    new-instance v0, Ljava/io/EOFException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0
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


# virtual methods
.method public c()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/K3/b;->f0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    return v0
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

.method public close()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/b;->q:Ljava/io/InputStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/K3/b;->d0:[B

    .line 5
    .line 6
    if-eqz v1, :cond_12

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lax/K3/b;->d0:[B

    .line 10
    .line 11
    iget-object v1, p0, Lax/K3/b;->q:Ljava/io/InputStream;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 14
    .line 15
    .line 16
    goto :goto_12

    .line 17
    :catchall_10
    move-exception v1

    .line 18
    goto :goto_14

    .line 19
    :cond_12
    :goto_12
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_14
    monitor-exit v0
    :try_end_15
    .catchall {:try_start_3 .. :try_end_15} :catchall_10

    .line 22
    throw v1
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
.end method

.method public d()Ljava/lang/String;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/b;->q:Ljava/io/InputStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/K3/b;->d0:[B

    .line 5
    .line 6
    if-eqz v1, :cond_83

    .line 7
    .line 8
    iget v1, p0, Lax/K3/b;->e0:I

    .line 9
    .line 10
    iget v2, p0, Lax/K3/b;->f0:I

    .line 11
    .line 12
    if-lt v1, v2, :cond_14

    .line 13
    .line 14
    invoke-direct {p0}, Lax/K3/b;->b()V

    .line 15
    .line 16
    .line 17
    goto :goto_14

    .line 18
    :catchall_11
    move-exception v1

    .line 19
    goto/16 :goto_8b

    .line 20
    .line 21
    :cond_14
    :goto_14
    iget v1, p0, Lax/K3/b;->e0:I

    .line 22
    .line 23
    :goto_16
    iget v2, p0, Lax/K3/b;->f0:I

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    if-eq v1, v2, :cond_45

    .line 28
    .line 29
    iget-object v2, p0, Lax/K3/b;->d0:[B

    .line 30
    .line 31
    aget-byte v4, v2, v1

    .line 32
    .line 33
    if-ne v4, v3, :cond_42

    .line 34
    .line 35
    iget v3, p0, Lax/K3/b;->e0:I

    .line 36
    .line 37
    if-eq v1, v3, :cond_2f

    .line 38
    .line 39
    add-int/lit8 v4, v1, -0x1

    .line 40
    .line 41
    aget-byte v5, v2, v4

    .line 42
    .line 43
    const/16 v6, 0xd

    .line 44
    .line 45
    if-ne v5, v6, :cond_2f

    .line 46
    .line 47
    goto :goto_30

    .line 48
    :cond_2f
    move v4, v1

    .line 49
    :goto_30
    new-instance v5, Ljava/lang/String;

    .line 50
    .line 51
    sub-int/2addr v4, v3

    .line 52
    iget-object v6, p0, Lax/K3/b;->c0:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    iput v1, p0, Lax/K3/b;->e0:I

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-object v5

    .line 67
    :cond_42
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_16

    .line 70
    :cond_45
    new-instance v1, Lax/K3/b$a;

    .line 71
    .line 72
    iget v2, p0, Lax/K3/b;->f0:I

    .line 73
    .line 74
    iget v4, p0, Lax/K3/b;->e0:I

    .line 75
    .line 76
    sub-int/2addr v2, v4

    .line 77
    add-int/lit8 v2, v2, 0x50

    .line 78
    .line 79
    invoke-direct {v1, p0, v2}, Lax/K3/b$a;-><init>(Lax/K3/b;I)V

    .line 80
    .line 81
    .line 82
    :cond_51
    iget-object v2, p0, Lax/K3/b;->d0:[B

    .line 83
    .line 84
    iget v4, p0, Lax/K3/b;->e0:I

    .line 85
    .line 86
    iget v5, p0, Lax/K3/b;->f0:I

    .line 87
    .line 88
    sub-int/2addr v5, v4

    .line 89
    invoke-virtual {v1, v2, v4, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 90
    .line 91
    .line 92
    const/4 v2, -0x1

    .line 93
    iput v2, p0, Lax/K3/b;->f0:I

    .line 94
    .line 95
    invoke-direct {p0}, Lax/K3/b;->b()V

    .line 96
    .line 97
    .line 98
    iget v2, p0, Lax/K3/b;->e0:I

    .line 99
    .line 100
    :goto_63
    iget v4, p0, Lax/K3/b;->f0:I

    .line 101
    .line 102
    if-eq v2, v4, :cond_51

    .line 103
    .line 104
    iget-object v4, p0, Lax/K3/b;->d0:[B

    .line 105
    .line 106
    aget-byte v5, v4, v2

    .line 107
    .line 108
    if-ne v5, v3, :cond_80

    .line 109
    .line 110
    iget v3, p0, Lax/K3/b;->e0:I

    .line 111
    .line 112
    if-eq v2, v3, :cond_76

    .line 113
    .line 114
    sub-int v5, v2, v3

    .line 115
    .line 116
    invoke-virtual {v1, v4, v3, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 117
    .line 118
    .line 119
    :cond_76
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    iput v2, p0, Lax/K3/b;->e0:I

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    monitor-exit v0

    .line 128
    return-object v1

    .line 129
    :cond_80
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_63

    .line 132
    :cond_83
    new-instance v1, Ljava/io/IOException;

    .line 133
    .line 134
    const-string v2, "LineReader is closed"

    .line 135
    .line 136
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v1

    .line 140
    :goto_8b
    monitor-exit v0
    :try_end_8c
    .catchall {:try_start_3 .. :try_end_8c} :catchall_11

    .line 141
    throw v1
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method
