.class public final Lax/b5/c;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final g0:[B


# instance fields
.field private final c0:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "[B>;"
        }
    .end annotation
.end field

.field private d0:I

.field private e0:[B

.field private f0:I

.field private final q:Lax/b5/a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lax/b5/c;->g0:[B

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

.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lax/b5/c;-><init>(Lax/b5/a;)V

    return-void
.end method

.method public constructor <init>(Lax/b5/a;)V
    .registers 3

    const/16 v0, 0x1f4

    .line 2
    invoke-direct {p0, p1, v0}, Lax/b5/c;-><init>(Lax/b5/a;I)V

    return-void
.end method

.method public constructor <init>(Lax/b5/a;I)V
    .registers 4

    .line 3
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 4
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    .line 5
    iput-object p1, p0, Lax/b5/c;->q:Lax/b5/a;

    const/high16 v0, 0x20000

    if-le p2, v0, :cond_12

    const/high16 p2, 0x20000

    :cond_12
    if-nez p1, :cond_17

    .line 6
    new-array p1, p2, [B

    goto :goto_1c

    :cond_17
    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lax/b5/a;->a(I)[B

    move-result-object p1

    :goto_1c
    iput-object p1, p0, Lax/b5/c;->e0:[B

    return-void
.end method

.method private constructor <init>(Lax/b5/a;[BI)V
    .registers 4

    .line 7
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 8
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lax/b5/c;->q:Lax/b5/a;

    .line 10
    iput-object p2, p0, Lax/b5/c;->e0:[B

    .line 11
    iput p3, p0, Lax/b5/c;->f0:I

    return-void
.end method

.method private a()V
    .registers 4

    .line 1
    iget v0, p0, Lax/b5/c;->d0:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/b5/c;->e0:[B

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    add-int/2addr v0, v1

    .line 7
    if-ltz v0, :cond_27

    .line 8
    .line 9
    iput v0, p0, Lax/b5/c;->d0:I

    .line 10
    .line 11
    shr-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    const/16 v1, 0x3e8

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/high16 v1, 0x20000

    .line 20
    .line 21
    if-le v0, v1, :cond_18

    .line 22
    .line 23
    const/high16 v0, 0x20000

    .line 24
    .line 25
    :cond_18
    iget-object v1, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    .line 26
    .line 27
    iget-object v2, p0, Lax/b5/c;->e0:[B

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    new-array v0, v0, [B

    .line 33
    .line 34
    iput-object v0, p0, Lax/b5/c;->e0:[B

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lax/b5/c;->f0:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`"

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
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

.method public static g([BI)Lax/b5/c;
    .registers 4

    .line 1
    new-instance v0, Lax/b5/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lax/b5/c;-><init>(Lax/b5/a;[BI)V

    .line 5
    .line 6
    .line 7
    return-object v0
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
.method public b(I)V
    .registers 5

    .line 1
    iget v0, p0, Lax/b5/c;->f0:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/b5/c;->e0:[B

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-lt v0, v1, :cond_a

    .line 7
    .line 8
    invoke-direct {p0}, Lax/b5/c;->a()V

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/b5/c;->e0:[B

    .line 12
    .line 13
    iget v1, p0, Lax/b5/c;->f0:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Lax/b5/c;->f0:I

    .line 18
    .line 19
    int-to-byte p1, p1

    .line 20
    aput-byte p1, v0, v1

    .line 21
    .line 22
    return-void
.end method

.method public c(I)V
    .registers 7

    .line 1
    iget v0, p0, Lax/b5/c;->f0:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget-object v2, p0, Lax/b5/c;->e0:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_23

    .line 9
    .line 10
    add-int/lit8 v1, v0, 0x1

    .line 11
    .line 12
    iput v1, p0, Lax/b5/c;->f0:I

    .line 13
    .line 14
    shr-int/lit8 v3, p1, 0x10

    .line 15
    .line 16
    int-to-byte v3, v3

    .line 17
    aput-byte v3, v2, v0

    .line 18
    .line 19
    add-int/lit8 v3, v0, 0x2

    .line 20
    .line 21
    iput v3, p0, Lax/b5/c;->f0:I

    .line 22
    .line 23
    shr-int/lit8 v4, p1, 0x8

    .line 24
    .line 25
    int-to-byte v4, v4

    .line 26
    aput-byte v4, v2, v1

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x3

    .line 29
    .line 30
    iput v0, p0, Lax/b5/c;->f0:I

    .line 31
    .line 32
    int-to-byte p1, p1

    .line 33
    aput-byte p1, v2, v3

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    shr-int/lit8 v0, p1, 0x10

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lax/b5/c;->b(I)V

    .line 39
    .line 40
    .line 41
    shr-int/lit8 v0, p1, 0x8

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lax/b5/c;->b(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lax/b5/c;->b(I)V

    .line 47
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

.method public close()V
    .registers 1

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

.method public d(I)V
    .registers 6

    .line 1
    iget v0, p0, Lax/b5/c;->f0:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lax/b5/c;->e0:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_1a

    .line 9
    .line 10
    add-int/lit8 v1, v0, 0x1

    .line 11
    .line 12
    iput v1, p0, Lax/b5/c;->f0:I

    .line 13
    .line 14
    shr-int/lit8 v3, p1, 0x8

    .line 15
    .line 16
    int-to-byte v3, v3

    .line 17
    aput-byte v3, v2, v0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    iput v0, p0, Lax/b5/c;->f0:I

    .line 22
    .line 23
    int-to-byte p1, p1

    .line 24
    aput-byte p1, v2, v1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    shr-int/lit8 v0, p1, 0x8

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lax/b5/c;->b(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lax/b5/c;->b(I)V

    .line 33
    .line 34
    .line 35
    return-void
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

.method public e(I)[B
    .registers 2

    .line 1
    iput p1, p0, Lax/b5/c;->f0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/b5/c;->m()[B

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

.method public f()[B
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/b5/c;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/b5/c;->e0:[B

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
.end method

.method public flush()V
    .registers 1

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

.method public j()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/b5/c;->d0:I

    .line 3
    .line 4
    iput v0, p0, Lax/b5/c;->f0:I

    .line 5
    .line 6
    iget-object v0, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_12

    .line 13
    .line 14
    iget-object v0, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
.end method

.method public m()[B
    .registers 8

    .line 1
    iget v0, p0, Lax/b5/c;->d0:I

    .line 2
    .line 3
    iget v1, p0, Lax/b5/c;->f0:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    if-nez v0, :cond_a

    .line 7
    .line 8
    sget-object v0, Lax/b5/c;->g0:[B

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    new-array v1, v0, [B

    .line 12
    .line 13
    iget-object v2, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_26

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, [B

    .line 32
    .line 33
    array-length v6, v5

    .line 34
    invoke-static {v5, v3, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    add-int/2addr v4, v6

    .line 38
    goto :goto_14

    .line 39
    :cond_26
    iget-object v2, p0, Lax/b5/c;->e0:[B

    .line 40
    .line 41
    iget v5, p0, Lax/b5/c;->f0:I

    .line 42
    .line 43
    invoke-static {v2, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    iget v2, p0, Lax/b5/c;->f0:I

    .line 47
    .line 48
    add-int/2addr v4, v2

    .line 49
    if-ne v4, v0, :cond_3e

    .line 50
    .line 51
    iget-object v0, p0, Lax/b5/c;->c0:Ljava/util/LinkedList;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3d

    .line 58
    .line 59
    invoke-virtual {p0}, Lax/b5/c;->j()V

    .line 60
    .line 61
    .line 62
    :cond_3d
    return-object v1

    .line 63
    :cond_3e
    new-instance v1, Ljava/lang/RuntimeException;

    .line 64
    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v3, "Internal error: total len assumed to be "

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", copied "

    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, " bytes"

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v1
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

.method public write(I)V
    .registers 2

    .line 7
    invoke-virtual {p0, p1}, Lax/b5/c;->b(I)V

    return-void
.end method

.method public write([B)V
    .registers 4

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lax/b5/c;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .registers 7

    .line 2
    :goto_0
    iget-object v0, p0, Lax/b5/c;->e0:[B

    array-length v0, v0

    iget v1, p0, Lax/b5/c;->f0:I

    sub-int/2addr v0, v1

    .line 3
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-lez v0, :cond_1a

    .line 4
    iget-object v1, p0, Lax/b5/c;->e0:[B

    iget v2, p0, Lax/b5/c;->f0:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    .line 5
    iget v1, p0, Lax/b5/c;->f0:I

    add-int/2addr v1, v0

    iput v1, p0, Lax/b5/c;->f0:I

    sub-int/2addr p3, v0

    :cond_1a
    if-gtz p3, :cond_1d

    return-void

    .line 6
    :cond_1d
    invoke-direct {p0}, Lax/b5/c;->a()V

    goto :goto_0
.end method
