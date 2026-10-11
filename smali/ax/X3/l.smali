.class public Lax/X3/l;
.super Ljava/io/FilterInputStream;
.source "SourceFile"

# interfaces
.implements Lj$/io/InputStreamRetargetInterface;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X3/l$a;
    }
.end annotation


# instance fields
.field private c0:I

.field private d0:I

.field private e0:I

.field private f0:I

.field private final g0:Lax/Q3/b;

.field private volatile q:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lax/Q3/b;)V
    .registers 4

    const/high16 v0, 0x10000

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lax/X3/l;-><init>(Ljava/io/InputStream;Lax/Q3/b;I)V

    return-void
.end method

.method constructor <init>(Ljava/io/InputStream;Lax/Q3/b;I)V
    .registers 4

    .line 2
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lax/X3/l;->e0:I

    .line 4
    iput-object p2, p0, Lax/X3/l;->g0:Lax/Q3/b;

    .line 5
    const-class p1, [B

    invoke-interface {p2, p3, p1}, Lax/Q3/b;->d(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lax/X3/l;->q:[B

    return-void
.end method

.method private a(Ljava/io/InputStream;[B)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/X3/l;->e0:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eq v0, v2, :cond_57

    .line 6
    .line 7
    iget v3, p0, Lax/X3/l;->f0:I

    .line 8
    .line 9
    sub-int/2addr v3, v0

    .line 10
    iget v4, p0, Lax/X3/l;->d0:I

    .line 11
    .line 12
    if-lt v3, v4, :cond_e

    .line 13
    .line 14
    goto :goto_57

    .line 15
    :cond_e
    if-nez v0, :cond_36

    .line 16
    .line 17
    array-length v2, p2

    .line 18
    if-le v4, v2, :cond_36

    .line 19
    .line 20
    iget v2, p0, Lax/X3/l;->c0:I

    .line 21
    .line 22
    array-length v3, p2

    .line 23
    if-ne v2, v3, :cond_36

    .line 24
    .line 25
    array-length v0, p2

    .line 26
    mul-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    if-le v0, v4, :cond_1e

    .line 29
    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    move v4, v0

    .line 32
    :goto_1f
    iget-object v0, p0, Lax/X3/l;->g0:Lax/Q3/b;

    .line 33
    .line 34
    const-class v2, [B

    .line 35
    .line 36
    invoke-interface {v0, v4, v2}, Lax/Q3/b;->d(ILjava/lang/Class;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, [B

    .line 41
    .line 42
    array-length v3, p2

    .line 43
    invoke-static {p2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/X3/l;->q:[B

    .line 47
    .line 48
    iget-object v3, p0, Lax/X3/l;->g0:Lax/Q3/b;

    .line 49
    .line 50
    invoke-interface {v3, p2, v2}, Lax/Q3/b;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    move-object p2, v0

    .line 54
    goto :goto_3d

    .line 55
    :cond_36
    if-lez v0, :cond_3d

    .line 56
    .line 57
    array-length v2, p2

    .line 58
    sub-int/2addr v2, v0

    .line 59
    invoke-static {p2, v0, p2, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    :goto_3d
    iget v0, p0, Lax/X3/l;->f0:I

    .line 63
    .line 64
    iget v2, p0, Lax/X3/l;->e0:I

    .line 65
    .line 66
    sub-int/2addr v0, v2

    .line 67
    iput v0, p0, Lax/X3/l;->f0:I

    .line 68
    .line 69
    iput v1, p0, Lax/X3/l;->e0:I

    .line 70
    .line 71
    iput v1, p0, Lax/X3/l;->c0:I

    .line 72
    .line 73
    array-length v1, p2

    .line 74
    sub-int/2addr v1, v0

    .line 75
    invoke-virtual {p1, p2, v0, v1}, Ljava/io/InputStream;->read([BII)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget p2, p0, Lax/X3/l;->f0:I

    .line 80
    .line 81
    if-gtz p1, :cond_53

    .line 82
    .line 83
    goto :goto_54

    .line 84
    :cond_53
    add-int/2addr p2, p1

    .line 85
    :goto_54
    iput p2, p0, Lax/X3/l;->c0:I

    .line 86
    .line 87
    return p1

    .line 88
    :cond_57
    :goto_57
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-lez p1, :cond_63

    .line 93
    .line 94
    iput v2, p0, Lax/X3/l;->e0:I

    .line 95
    .line 96
    iput v1, p0, Lax/X3/l;->f0:I

    .line 97
    .line 98
    iput p1, p0, Lax/X3/l;->c0:I

    .line 99
    .line 100
    :cond_63
    return p1
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

.method private static d()Ljava/io/IOException;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    const-string v1, "BufferedInputStream is closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
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


# virtual methods
.method public declared-synchronized available()I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 3
    .line 4
    iget-object v1, p0, Lax/X3/l;->q:[B

    .line 5
    .line 6
    if-eqz v1, :cond_17

    .line 7
    .line 8
    if-eqz v0, :cond_17

    .line 9
    .line 10
    iget v1, p0, Lax/X3/l;->c0:I

    .line 11
    .line 12
    iget v2, p0, Lax/X3/l;->f0:I

    .line 13
    .line 14
    sub-int/2addr v1, v2

    .line 15
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_12
    .catchall {:try_start_1 .. :try_end_12} :catchall_15

    .line 19
    add-int/2addr v1, v0

    .line 20
    monitor-exit p0

    .line 21
    return v1

    .line 22
    :catchall_15
    move-exception v0

    .line 23
    goto :goto_1c

    .line 24
    :cond_17
    :try_start_17
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    throw v0

    .line 29
    :goto_1c
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_17 .. :try_end_1d} :catchall_15

    .line 30
    throw v0
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

.method public declared-synchronized b()V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/X3/l;->q:[B

    .line 3
    .line 4
    array-length v0, v0

    .line 5
    iput v0, p0, Lax/X3/l;->d0:I
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_8
    move-exception v0

    .line 10
    :try_start_9
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_9 .. :try_end_a} :catchall_8

    .line 11
    throw v0
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

.method public declared-synchronized c()V
    .registers 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/X3/l;->q:[B

    .line 3
    .line 4
    if-eqz v0, :cond_14

    .line 5
    .line 6
    iget-object v0, p0, Lax/X3/l;->g0:Lax/Q3/b;

    .line 7
    .line 8
    iget-object v1, p0, Lax/X3/l;->q:[B

    .line 9
    .line 10
    const-class v2, [B

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Lax/Q3/b;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lax/X3/l;->q:[B
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_12

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :catchall_12
    move-exception v0

    .line 20
    goto :goto_16

    .line 21
    :cond_14
    :goto_14
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :goto_16
    :try_start_16
    monitor-exit p0
    :try_end_17
    .catchall {:try_start_16 .. :try_end_17} :catchall_12

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

.method public close()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X3/l;->q:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_10

    .line 5
    .line 6
    iget-object v0, p0, Lax/X3/l;->g0:Lax/Q3/b;

    .line 7
    .line 8
    iget-object v2, p0, Lax/X3/l;->q:[B

    .line 9
    .line 10
    const-class v3, [B

    .line 11
    .line 12
    invoke-interface {v0, v2, v3}, Lax/Q3/b;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lax/X3/l;->q:[B

    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 18
    .line 19
    iput-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 20
    .line 21
    if-eqz v0, :cond_19

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 24
    .line 25
    .line 26
    :cond_19
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public declared-synchronized mark(I)V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget v0, p0, Lax/X3/l;->d0:I

    .line 3
    .line 4
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lax/X3/l;->d0:I

    .line 9
    .line 10
    iget p1, p0, Lax/X3/l;->f0:I

    .line 11
    .line 12
    iput p1, p0, Lax/X3/l;->e0:I
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_f

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    :try_start_10
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_10 .. :try_end_11} :catchall_f

    .line 18
    throw p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public markSupported()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public declared-synchronized read()I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_1
    iget-object v0, p0, Lax/X3/l;->q:[B

    .line 2
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_3b

    if-eqz v1, :cond_3b

    .line 3
    iget v2, p0, Lax/X3/l;->f0:I

    iget v3, p0, Lax/X3/l;->c0:I

    const/4 v4, -0x1

    if-lt v2, v3, :cond_1a

    invoke-direct {p0, v1, v0}, Lax/X3/l;->a(Ljava/io/InputStream;[B)I

    move-result v1
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_18

    if-ne v1, v4, :cond_1a

    .line 4
    monitor-exit p0

    return v4

    :catchall_18
    move-exception v0

    goto :goto_40

    .line 5
    :cond_1a
    :try_start_1a
    iget-object v1, p0, Lax/X3/l;->q:[B

    if-eq v0, v1, :cond_28

    .line 6
    iget-object v0, p0, Lax/X3/l;->q:[B

    if-eqz v0, :cond_23

    goto :goto_28

    .line 7
    :cond_23
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 8
    :cond_28
    :goto_28
    iget v1, p0, Lax/X3/l;->c0:I

    iget v2, p0, Lax/X3/l;->f0:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_39

    add-int/lit8 v1, v2, 0x1

    .line 9
    iput v1, p0, Lax/X3/l;->f0:I

    aget-byte v0, v0, v2
    :try_end_35
    .catchall {:try_start_1a .. :try_end_35} :catchall_18

    and-int/lit16 v0, v0, 0xff

    monitor-exit p0

    return v0

    .line 10
    :cond_39
    monitor-exit p0

    return v4

    .line 11
    :cond_3b
    :try_start_3b
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    move-result-object v0

    throw v0

    :goto_40
    monitor-exit p0
    :try_end_41
    .catchall {:try_start_3b .. :try_end_41} :catchall_18

    throw v0
.end method

.method public declared-synchronized read([BII)I
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 12
    :try_start_1
    iget-object v0, p0, Lax/X3/l;->q:[B
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_30

    if-eqz v0, :cond_8d

    if-nez p3, :cond_a

    .line 13
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    .line 14
    :cond_a
    :try_start_a
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v1, :cond_88

    .line 15
    iget v2, p0, Lax/X3/l;->f0:I

    iget v3, p0, Lax/X3/l;->c0:I

    if-ge v2, v3, :cond_34

    sub-int v4, v3, v2

    if-lt v4, p3, :cond_1a

    move v3, p3

    goto :goto_1b

    :cond_1a
    sub-int/2addr v3, v2

    .line 16
    :goto_1b
    invoke-static {v0, v2, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    iget v2, p0, Lax/X3/l;->f0:I

    add-int/2addr v2, v3

    iput v2, p0, Lax/X3/l;->f0:I

    if-eq v3, p3, :cond_32

    .line 18
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v2
    :try_end_29
    .catchall {:try_start_a .. :try_end_29} :catchall_30

    if-nez v2, :cond_2c

    goto :goto_32

    :cond_2c
    add-int/2addr p2, v3

    sub-int v2, p3, v3

    goto :goto_35

    :catchall_30
    move-exception p1

    goto :goto_92

    .line 19
    :cond_32
    :goto_32
    monitor-exit p0

    return v3

    :cond_34
    move v2, p3

    .line 20
    :goto_35
    :try_start_35
    iget v3, p0, Lax/X3/l;->e0:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_4a

    array-length v3, v0

    if-lt v2, v3, :cond_4a

    .line 21
    invoke-virtual {v1, p1, p2, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v3
    :try_end_41
    .catchall {:try_start_35 .. :try_end_41} :catchall_30

    if-ne v3, v4, :cond_78

    if-ne v2, p3, :cond_46

    goto :goto_48

    :cond_46
    sub-int v4, p3, v2

    .line 22
    :goto_48
    monitor-exit p0

    return v4

    .line 23
    :cond_4a
    :try_start_4a
    invoke-direct {p0, v1, v0}, Lax/X3/l;->a(Ljava/io/InputStream;[B)I

    move-result v3
    :try_end_4e
    .catchall {:try_start_4a .. :try_end_4e} :catchall_30

    if-ne v3, v4, :cond_57

    if-ne v2, p3, :cond_53

    goto :goto_55

    :cond_53
    sub-int v4, p3, v2

    .line 24
    :goto_55
    monitor-exit p0

    return v4

    .line 25
    :cond_57
    :try_start_57
    iget-object v3, p0, Lax/X3/l;->q:[B

    if-eq v0, v3, :cond_65

    .line 26
    iget-object v0, p0, Lax/X3/l;->q:[B

    if-eqz v0, :cond_60

    goto :goto_65

    .line 27
    :cond_60
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 28
    :cond_65
    :goto_65
    iget v3, p0, Lax/X3/l;->c0:I

    iget v4, p0, Lax/X3/l;->f0:I

    sub-int v5, v3, v4

    if-lt v5, v2, :cond_6f

    move v3, v2

    goto :goto_70

    :cond_6f
    sub-int/2addr v3, v4

    .line 29
    :goto_70
    invoke-static {v0, v4, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    iget v4, p0, Lax/X3/l;->f0:I

    add-int/2addr v4, v3

    iput v4, p0, Lax/X3/l;->f0:I
    :try_end_78
    .catchall {:try_start_57 .. :try_end_78} :catchall_30

    :cond_78
    sub-int/2addr v2, v3

    if-nez v2, :cond_7d

    .line 31
    monitor-exit p0

    return p3

    .line 32
    :cond_7d
    :try_start_7d
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v4
    :try_end_81
    .catchall {:try_start_7d .. :try_end_81} :catchall_30

    if-nez v4, :cond_86

    sub-int/2addr p3, v2

    .line 33
    monitor-exit p0

    return p3

    :cond_86
    add-int/2addr p2, v3

    goto :goto_35

    .line 34
    :cond_88
    :try_start_88
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 35
    :cond_8d
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 36
    :goto_92
    monitor-exit p0
    :try_end_93
    .catchall {:try_start_88 .. :try_end_93} :catchall_30

    throw p1
.end method

.method public declared-synchronized reset()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/X3/l;->q:[B

    .line 3
    .line 4
    if-eqz v0, :cond_33

    .line 5
    .line 6
    iget v0, p0, Lax/X3/l;->e0:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-eq v1, v0, :cond_10

    .line 10
    .line 11
    iput v0, p0, Lax/X3/l;->f0:I
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_e

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    goto :goto_3b

    .line 17
    :cond_10
    :try_start_10
    new-instance v0, Lax/X3/l$a;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Mark has been invalidated, pos: "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lax/X3/l;->f0:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, " markLimit: "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget v2, p0, Lax/X3/l;->d0:I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Lax/X3/l$a;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_33
    new-instance v0, Ljava/io/IOException;

    .line 53
    .line 54
    const-string v1, "Stream is closed"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :goto_3b
    monitor-exit p0
    :try_end_3c
    .catchall {:try_start_10 .. :try_end_3c} :catchall_e

    .line 61
    throw v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public declared-synchronized skip(J)J
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/X3/l;->q:[B

    .line 3
    .line 4
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_25

    .line 5
    .line 6
    if-eqz v0, :cond_69

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    .line 10
    cmp-long v4, p1, v2

    .line 11
    .line 12
    if-gez v4, :cond_11

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    return-wide p1

    .line 18
    :cond_11
    if-eqz v1, :cond_64

    .line 19
    .line 20
    :try_start_13
    iget v2, p0, Lax/X3/l;->c0:I

    .line 21
    .line 22
    iget v3, p0, Lax/X3/l;->f0:I

    .line 23
    .line 24
    sub-int v4, v2, v3

    .line 25
    .line 26
    int-to-long v4, v4

    .line 27
    cmp-long v6, v4, p1

    .line 28
    .line 29
    if-ltz v6, :cond_27

    .line 30
    .line 31
    int-to-long v0, v3

    .line 32
    add-long/2addr v0, p1

    .line 33
    long-to-int v1, v0

    .line 34
    iput v1, p0, Lax/X3/l;->f0:I
    :try_end_23
    .catchall {:try_start_13 .. :try_end_23} :catchall_25

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-wide p1

    .line 38
    :catchall_25
    move-exception p1

    .line 39
    goto :goto_6e

    .line 40
    :cond_27
    sub-int v3, v2, v3

    .line 41
    .line 42
    int-to-long v3, v3

    .line 43
    :try_start_2a
    iput v2, p0, Lax/X3/l;->f0:I

    .line 44
    .line 45
    iget v2, p0, Lax/X3/l;->e0:I

    .line 46
    .line 47
    const/4 v5, -0x1

    .line 48
    if-eq v2, v5, :cond_5c

    .line 49
    .line 50
    iget v2, p0, Lax/X3/l;->d0:I

    .line 51
    .line 52
    int-to-long v6, v2

    .line 53
    cmp-long v2, p1, v6

    .line 54
    .line 55
    if-gtz v2, :cond_5c

    .line 56
    .line 57
    invoke-direct {p0, v1, v0}, Lax/X3/l;->a(Ljava/io/InputStream;[B)I

    .line 58
    .line 59
    .line 60
    move-result v0
    :try_end_3c
    .catchall {:try_start_2a .. :try_end_3c} :catchall_25

    .line 61
    if-ne v0, v5, :cond_40

    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-wide v3

    .line 65
    :cond_40
    :try_start_40
    iget v0, p0, Lax/X3/l;->c0:I

    .line 66
    .line 67
    iget v1, p0, Lax/X3/l;->f0:I

    .line 68
    .line 69
    sub-int v2, v0, v1

    .line 70
    .line 71
    int-to-long v5, v2

    .line 72
    sub-long v7, p1, v3

    .line 73
    .line 74
    cmp-long v2, v5, v7

    .line 75
    .line 76
    if-ltz v2, :cond_54

    .line 77
    .line 78
    int-to-long v0, v1

    .line 79
    add-long/2addr v0, v7

    .line 80
    long-to-int v1, v0

    .line 81
    iput v1, p0, Lax/X3/l;->f0:I
    :try_end_52
    .catchall {:try_start_40 .. :try_end_52} :catchall_25

    .line 82
    .line 83
    monitor-exit p0

    .line 84
    return-wide p1

    .line 85
    :cond_54
    int-to-long p1, v0

    .line 86
    add-long/2addr v3, p1

    .line 87
    int-to-long p1, v1

    .line 88
    sub-long/2addr v3, p1

    .line 89
    :try_start_58
    iput v0, p0, Lax/X3/l;->f0:I
    :try_end_5a
    .catchall {:try_start_58 .. :try_end_5a} :catchall_25

    .line 90
    .line 91
    monitor-exit p0

    .line 92
    return-wide v3

    .line 93
    :cond_5c
    sub-long/2addr p1, v3

    .line 94
    :try_start_5d
    invoke-virtual {v1, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide p1
    :try_end_61
    .catchall {:try_start_5d .. :try_end_61} :catchall_25

    .line 98
    add-long/2addr v3, p1

    .line 99
    monitor-exit p0

    .line 100
    return-wide v3

    .line 101
    :cond_64
    :try_start_64
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    throw p1

    .line 106
    :cond_69
    invoke-static {}, Lax/X3/l;->d()Ljava/io/IOException;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    throw p1

    .line 111
    :goto_6e
    monitor-exit p0
    :try_end_6f
    .catchall {:try_start_64 .. :try_end_6f} :catchall_25

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
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .registers 4

    .line 1
    invoke-static {p0, p1}, Lj$/io/DesugarInputStream;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
