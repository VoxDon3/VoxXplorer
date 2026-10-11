.class Lax/X4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(DDD)D
    .registers 6

    .line 1
    mul-double p0, p0, p2

    .line 2
    .line 3
    add-double/2addr p0, p4

    .line 4
    return-wide p0
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

.method protected static b(C)Z
    .registers 2

    .line 1
    add-int/lit8 p0, p0, -0x30

    .line 2
    .line 3
    int-to-char p0, p0

    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    if-ge p0, v0, :cond_9

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_9
    const/4 p0, 0x0

    .line 11
    return p0
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

.method public static c(Ljava/lang/CharSequence;I)Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    const/16 v2, 0x8

    .line 4
    .line 5
    if-ge v1, v2, :cond_14

    .line 6
    .line 7
    add-int v2, v1, p1

    .line 8
    .line 9
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Lax/X4/i;->b(C)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    and-int/2addr v0, v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_14
    return v0
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

.method public static d(Ljava/lang/CharSequence;I)Z
    .registers 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    :goto_4
    const/16 v4, 0x8

    .line 6
    .line 7
    if-ge v2, v4, :cond_19

    .line 8
    .line 9
    add-int v4, v2, p1

    .line 10
    .line 11
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/16 v5, 0x30

    .line 16
    .line 17
    if-ne v5, v4, :cond_14

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 v4, 0x0

    .line 22
    :goto_15
    and-int/2addr v3, v4

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_19
    return v3
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

.method public static e([BI)I
    .registers 4

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    shl-int/lit8 v0, v0, 0x18

    .line 6
    .line 7
    add-int/lit8 v1, p1, 0x1

    .line 8
    .line 9
    aget-byte v1, p0, v1

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    shl-int/lit8 v1, v1, 0x10

    .line 14
    .line 15
    or-int/2addr v0, v1

    .line 16
    add-int/lit8 v1, p1, 0x2

    .line 17
    .line 18
    aget-byte v1, p0, v1

    .line 19
    .line 20
    and-int/lit16 v1, v1, 0xff

    .line 21
    .line 22
    shl-int/lit8 v1, v1, 0x8

    .line 23
    .line 24
    or-int/2addr v0, v1

    .line 25
    add-int/lit8 p1, p1, 0x3

    .line 26
    .line 27
    aget-byte p0, p0, p1

    .line 28
    .line 29
    and-int/lit16 p0, p0, 0xff

    .line 30
    .line 31
    or-int/2addr p0, v0

    .line 32
    return p0
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

.method public static f(Ljava/lang/CharSequence;I)I
    .registers 11

    .line 1
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-long v2, v2

    .line 13
    const/16 v4, 0x10

    .line 14
    .line 15
    shl-long/2addr v2, v4

    .line 16
    or-long/2addr v0, v2

    .line 17
    add-int/lit8 v2, p1, 0x2

    .line 18
    .line 19
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-long v2, v2

    .line 24
    const/16 v5, 0x20

    .line 25
    .line 26
    shl-long/2addr v2, v5

    .line 27
    or-long/2addr v0, v2

    .line 28
    add-int/lit8 v2, p1, 0x3

    .line 29
    .line 30
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    int-to-long v2, v2

    .line 35
    const/16 v6, 0x30

    .line 36
    .line 37
    shl-long/2addr v2, v6

    .line 38
    or-long/2addr v0, v2

    .line 39
    add-int/lit8 v2, p1, 0x4

    .line 40
    .line 41
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    int-to-long v2, v2

    .line 46
    add-int/lit8 v7, p1, 0x5

    .line 47
    .line 48
    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    int-to-long v7, v7

    .line 53
    shl-long/2addr v7, v4

    .line 54
    or-long/2addr v2, v7

    .line 55
    add-int/lit8 v4, p1, 0x6

    .line 56
    .line 57
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    int-to-long v7, v4

    .line 62
    shl-long v4, v7, v5

    .line 63
    .line 64
    or-long/2addr v2, v4

    .line 65
    add-int/lit8 p1, p1, 0x7

    .line 66
    .line 67
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    int-to-long p0, p0

    .line 72
    shl-long/2addr p0, v6

    .line 73
    or-long/2addr p0, v2

    .line 74
    invoke-static {v0, v1, p0, p1}, Lax/X4/i;->g(JJ)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0
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

.method public static g(JJ)I
    .registers 10

    .line 1
    const-wide v0, 0x30003000300030L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    sub-long v2, p0, v0

    .line 7
    .line 8
    sub-long v0, p2, v0

    .line 9
    .line 10
    const-wide v4, 0x46004600460046L    # 2.447700077935472E-307

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    add-long/2addr p0, v4

    .line 16
    or-long/2addr p0, v2

    .line 17
    add-long/2addr p2, v4

    .line 18
    or-long/2addr p2, v0

    .line 19
    or-long/2addr p0, p2

    .line 20
    const-wide p2, -0x7f007f007f0080L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr p0, p2

    .line 26
    const-wide/16 p2, 0x0

    .line 27
    .line 28
    cmp-long v4, p0, p2

    .line 29
    .line 30
    if-eqz v4, :cond_21

    .line 31
    .line 32
    const/4 p0, -0x1

    .line 33
    return p0

    .line 34
    :cond_21
    const-wide p0, 0x3e80064000a0001L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-long v0, v0, p0

    .line 40
    .line 41
    const/16 p2, 0x30

    .line 42
    .line 43
    ushr-long/2addr v0, p2

    .line 44
    long-to-int p3, v0

    .line 45
    mul-long v2, v2, p0

    .line 46
    .line 47
    ushr-long p0, v2, p2

    .line 48
    .line 49
    long-to-int p1, p0

    .line 50
    mul-int/lit16 p1, p1, 0x2710

    .line 51
    .line 52
    add-int/2addr p3, p1

    .line 53
    return p3
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

.method public static h(Ljava/lang/CharSequence;I)J
    .registers 11

    .line 1
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    const/16 v2, 0x30

    .line 7
    .line 8
    shl-long/2addr v0, v2

    .line 9
    add-int/lit8 v3, p1, 0x1

    .line 10
    .line 11
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    int-to-long v3, v3

    .line 16
    const/16 v5, 0x20

    .line 17
    .line 18
    shl-long/2addr v3, v5

    .line 19
    or-long/2addr v0, v3

    .line 20
    add-int/lit8 v3, p1, 0x2

    .line 21
    .line 22
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    int-to-long v3, v3

    .line 27
    const/16 v6, 0x10

    .line 28
    .line 29
    shl-long/2addr v3, v6

    .line 30
    or-long/2addr v0, v3

    .line 31
    add-int/lit8 v3, p1, 0x3

    .line 32
    .line 33
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    int-to-long v3, v3

    .line 38
    or-long/2addr v0, v3

    .line 39
    add-int/lit8 v3, p1, 0x4

    .line 40
    .line 41
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    int-to-long v3, v3

    .line 46
    shl-long v2, v3, v2

    .line 47
    .line 48
    add-int/lit8 v4, p1, 0x5

    .line 49
    .line 50
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    int-to-long v7, v4

    .line 55
    shl-long v4, v7, v5

    .line 56
    .line 57
    or-long/2addr v2, v4

    .line 58
    add-int/lit8 v4, p1, 0x6

    .line 59
    .line 60
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    int-to-long v4, v4

    .line 65
    shl-long/2addr v4, v6

    .line 66
    or-long/2addr v2, v4

    .line 67
    add-int/lit8 p1, p1, 0x7

    .line 68
    .line 69
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    int-to-long p0, p0

    .line 74
    or-long/2addr p0, v2

    .line 75
    invoke-static {v0, v1, p0, p1}, Lax/X4/i;->i(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    return-wide p0
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

.method public static i(JJ)J
    .registers 5

    .line 1
    invoke-static {p0, p1}, Lax/X4/i;->l(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p2, p3}, Lax/X4/i;->l(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    shl-long/2addr p0, v0

    .line 12
    or-long/2addr p0, p2

    .line 13
    return-wide p0
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

.method public static j(Ljava/lang/CharSequence;I)I
    .registers 7

    .line 1
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-long v2, v2

    .line 13
    const/16 v4, 0x10

    .line 14
    .line 15
    shl-long/2addr v2, v4

    .line 16
    or-long/2addr v0, v2

    .line 17
    add-int/lit8 v2, p1, 0x2

    .line 18
    .line 19
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-long v2, v2

    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    shl-long/2addr v2, v4

    .line 27
    or-long/2addr v0, v2

    .line 28
    add-int/lit8 p1, p1, 0x3

    .line 29
    .line 30
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-long p0, p0

    .line 35
    const/16 v2, 0x30

    .line 36
    .line 37
    shl-long/2addr p0, v2

    .line 38
    or-long/2addr p0, v0

    .line 39
    invoke-static {p0, p1}, Lax/X4/i;->k(J)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
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
.end method

.method public static k(J)I
    .registers 7

    .line 1
    const-wide v0, 0x30003000300030L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    sub-long v0, p0, v0

    .line 7
    .line 8
    const-wide v2, 0x46004600460046L    # 2.447700077935472E-307

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    add-long/2addr p0, v2

    .line 14
    or-long/2addr p0, v0

    .line 15
    const-wide v2, -0x7f007f007f0080L

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr p0, v2

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v4, p0, v2

    .line 24
    .line 25
    if-eqz v4, :cond_1c

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    return p0

    .line 29
    :cond_1c
    const-wide p0, 0x3e80064000a0001L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-long v0, v0, p0

    .line 35
    .line 36
    const/16 p0, 0x30

    .line 37
    .line 38
    ushr-long p0, v0, p0

    .line 39
    .line 40
    long-to-int p1, p0

    .line 41
    return p1
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

.method public static l(J)J
    .registers 10

    .line 1
    const-wide v0, 0x30003000300030L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    sub-long v0, p0, v0

    .line 7
    .line 8
    const-wide v2, -0x7fc67fc67fc67fc6L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    sub-long v2, p0, v2

    .line 14
    .line 15
    const-wide v4, -0x7fff7fff7fff8000L    # -6.9534619092435E-310

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, v4

    .line 21
    const-wide v6, -0x7f9f7f9f7f9f7f9fL    # -7.34339901537283E-307

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    sub-long/2addr p0, v6

    .line 27
    and-long/2addr p0, v4

    .line 28
    const-wide v4, 0x7fff7fff7fff7fffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    xor-long/2addr v4, v0

    .line 34
    const-wide v6, 0x37003700370037L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    add-long/2addr v4, v6

    .line 40
    and-long/2addr p0, v4

    .line 41
    cmp-long v4, v2, p0

    .line 42
    .line 43
    if-eqz v4, :cond_2f

    .line 44
    .line 45
    const-wide/16 p0, -0x1

    .line 46
    .line 47
    return-wide p0

    .line 48
    :cond_2f
    const/16 p0, 0xf

    .line 49
    .line 50
    ushr-long p0, v2, p0

    .line 51
    .line 52
    const-wide/32 v2, 0xffff

    .line 53
    .line 54
    .line 55
    mul-long p0, p0, v2

    .line 56
    .line 57
    not-long v4, p0

    .line 58
    and-long/2addr v4, v0

    .line 59
    const-wide v6, 0x27002700270027L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr p0, v6

    .line 65
    sub-long/2addr v0, p0

    .line 66
    or-long p0, v4, v0

    .line 67
    .line 68
    const/16 v0, 0xc

    .line 69
    .line 70
    ushr-long v0, p0, v0

    .line 71
    .line 72
    or-long/2addr p0, v0

    .line 73
    const/16 v0, 0x18

    .line 74
    .line 75
    ushr-long v0, p0, v0

    .line 76
    .line 77
    or-long/2addr p0, v0

    .line 78
    and-long/2addr p0, v2

    .line 79
    return-wide p0
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
.end method

.method public static m(Ljava/lang/CharSequence;II)I
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :goto_2
    if-ge p1, p2, :cond_15

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {v2}, Lax/X4/i;->b(C)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    and-int/2addr v1, v3

    .line 14
    mul-int/lit8 v0, v0, 0xa

    .line 15
    .line 16
    add-int/2addr v0, v2

    .line 17
    add-int/lit8 v0, v0, -0x30

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_15
    if-eqz v1, :cond_18

    .line 23
    .line 24
    return v0

    .line 25
    :cond_18
    const/4 p0, -0x1

    .line 26
    return p0
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

.method public static n([BII)V
    .registers 5

    .line 1
    ushr-int/lit8 v0, p2, 0x18

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    aput-byte v0, p0, p1

    .line 5
    .line 6
    add-int/lit8 v0, p1, 0x1

    .line 7
    .line 8
    ushr-int/lit8 v1, p2, 0x10

    .line 9
    .line 10
    int-to-byte v1, v1

    .line 11
    aput-byte v1, p0, v0

    .line 12
    .line 13
    add-int/lit8 v0, p1, 0x2

    .line 14
    .line 15
    ushr-int/lit8 v1, p2, 0x8

    .line 16
    .line 17
    int-to-byte v1, v1

    .line 18
    aput-byte v1, p0, v0

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x3

    .line 21
    .line 22
    int-to-byte p2, p2

    .line 23
    aput-byte p2, p0, p1

    .line 24
    .line 25
    return-void
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
