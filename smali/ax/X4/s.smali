.class Lax/X4/s;
.super Lax/X4/f;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/X4/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private d(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;
    .registers 13

    .line 1
    sub-int v0, p3, p2

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    if-le v0, v1, :cond_b

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lax/X4/s;->f(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    and-int/lit8 v0, v0, 0x7

    .line 13
    .line 14
    add-int/2addr v0, p2

    .line 15
    invoke-static {p1, p2, v0}, Lax/X4/i;->m(Ljava/lang/CharSequence;II)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    int-to-long v1, p2

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    cmp-long v6, v1, v3

    .line 25
    .line 26
    if-ltz v6, :cond_1d

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 v3, 0x0

    .line 31
    :goto_1e
    if-ge v0, p3, :cond_34

    .line 32
    .line 33
    invoke-static {p1, v0}, Lax/X4/i;->f(Ljava/lang/CharSequence;I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ltz v4, :cond_28

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    goto :goto_29

    .line 41
    :cond_28
    const/4 v6, 0x0

    .line 42
    :goto_29
    and-int/2addr v3, v6

    .line 43
    const-wide/32 v6, 0x5f5e100

    .line 44
    .line 45
    .line 46
    mul-long v1, v1, v6

    .line 47
    .line 48
    int-to-long v6, v4

    .line 49
    add-long/2addr v1, v6

    .line 50
    add-int/lit8 v0, v0, 0x8

    .line 51
    .line 52
    goto :goto_1e

    .line 53
    :cond_34
    if-eqz v3, :cond_3e

    .line 54
    .line 55
    if-eqz p4, :cond_39

    .line 56
    .line 57
    neg-long v1, v1

    .line 58
    :cond_39
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_3e
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 64
    .line 65
    const-string p2, "illegal syntax"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
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

.method private e(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;
    .registers 16

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/X4/s;->g(Ljava/lang/CharSequence;II)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    sub-int v0, p3, p2

    .line 6
    .line 7
    if-gtz v0, :cond_b

    .line 8
    .line 9
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_b
    const/high16 v1, 0x20000000

    .line 13
    .line 14
    if-gt v0, v1, :cond_90

    .line 15
    .line 16
    add-int/lit8 v1, v0, 0x1

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    shr-int/2addr v1, v2

    .line 20
    add-int/2addr v1, v2

    .line 21
    new-array v1, v1, [B

    .line 22
    .line 23
    and-int/2addr v0, v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v0, :cond_31

    .line 26
    .line 27
    add-int/lit8 v0, p2, 0x1

    .line 28
    .line 29
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p2}, Lax/X4/f;->b(C)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    int-to-byte v4, p2

    .line 38
    aput-byte v4, v1, v2

    .line 39
    .line 40
    if-gez p2, :cond_2b

    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 p2, 0x0

    .line 45
    :goto_2c
    const/4 v4, 0x2

    .line 46
    move v10, v0

    .line 47
    move v0, p2

    .line 48
    move p2, v10

    .line 49
    goto :goto_33

    .line 50
    :cond_31
    const/4 v0, 0x0

    .line 51
    const/4 v4, 0x1

    .line 52
    :goto_33
    sub-int v5, p3, p2

    .line 53
    .line 54
    and-int/lit8 v5, v5, 0x7

    .line 55
    .line 56
    add-int/2addr v5, p2

    .line 57
    :goto_38
    if-ge p2, v5, :cond_61

    .line 58
    .line 59
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    add-int/lit8 v7, p2, 0x1

    .line 64
    .line 65
    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {v6}, Lax/X4/f;->b(C)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-static {v7}, Lax/X4/f;->b(C)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    add-int/lit8 v8, v4, 0x1

    .line 78
    .line 79
    shl-int/lit8 v9, v6, 0x4

    .line 80
    .line 81
    or-int/2addr v9, v7

    .line 82
    int-to-byte v9, v9

    .line 83
    aput-byte v9, v1, v4

    .line 84
    .line 85
    if-ltz v7, :cond_5b

    .line 86
    .line 87
    if-gez v6, :cond_59

    .line 88
    .line 89
    goto :goto_5b

    .line 90
    :cond_59
    const/4 v4, 0x0

    .line 91
    goto :goto_5c

    .line 92
    :cond_5b
    :goto_5b
    const/4 v4, 0x1

    .line 93
    :goto_5c
    or-int/2addr v0, v4

    .line 94
    add-int/lit8 p2, p2, 0x2

    .line 95
    .line 96
    move v4, v8

    .line 97
    goto :goto_38

    .line 98
    :cond_61
    :goto_61
    if-ge p2, p3, :cond_7a

    .line 99
    .line 100
    invoke-static {p1, p2}, Lax/X4/i;->h(Ljava/lang/CharSequence;I)J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    long-to-int v7, v5

    .line 105
    invoke-static {v1, v4, v7}, Lax/X4/i;->n([BII)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v7, 0x0

    .line 109
    .line 110
    cmp-long v9, v5, v7

    .line 111
    .line 112
    if-gez v9, :cond_73

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    goto :goto_74

    .line 116
    :cond_73
    const/4 v5, 0x0

    .line 117
    :goto_74
    or-int/2addr v0, v5

    .line 118
    add-int/lit8 p2, p2, 0x8

    .line 119
    .line 120
    add-int/lit8 v4, v4, 0x4

    .line 121
    .line 122
    goto :goto_61

    .line 123
    :cond_7a
    if-nez v0, :cond_88

    .line 124
    .line 125
    new-instance p1, Ljava/math/BigInteger;

    .line 126
    .line 127
    invoke-direct {p1, v1}, Ljava/math/BigInteger;-><init>([B)V

    .line 128
    .line 129
    .line 130
    if-eqz p4, :cond_87

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    :cond_87
    return-object p1

    .line 137
    :cond_88
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 138
    .line 139
    const-string p2, "illegal syntax"

    .line 140
    .line 141
    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_90
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 146
    .line 147
    const-string p2, "value exceeds limits"

    .line 148
    .line 149
    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
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

.method private f(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;
    .registers 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/X4/s;->g(Ljava/lang/CharSequence;II)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    sub-int v0, p3, p2

    .line 6
    .line 7
    const v1, 0x268826a1

    .line 8
    .line 9
    .line 10
    if-gt v0, v1, :cond_1a

    .line 11
    .line 12
    invoke-static {p2, p3}, Lax/X4/k;->e(II)Ljava/util/NavigableMap;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, p2, p3, v0}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p4, :cond_19

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_19
    return-object p1

    .line 27
    :cond_1a
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 28
    .line 29
    const-string p2, "value exceeds limits"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
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

.method private g(Ljava/lang/CharSequence;II)I
    .registers 6

    .line 1
    :goto_0
    if-ge p2, p3, :cond_d

    .line 2
    .line 3
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x30

    .line 8
    .line 9
    if-ne v0, v1, :cond_d

    .line 10
    .line 11
    add-int/lit8 p2, p2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_d
    return p2
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
.method public c(Ljava/lang/CharSequence;III)Ljava/math/BigInteger;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 1
    add-int v0, p2, p3

    .line 2
    .line 3
    if-ltz p2, :cond_57

    .line 4
    .line 5
    if-lt v0, p2, :cond_57

    .line 6
    .line 7
    :try_start_6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gt v0, v1, :cond_57

    .line 12
    .line 13
    const v1, 0x4d0e4c1e    # 1.49209568E8f

    .line 14
    .line 15
    .line 16
    if-gt p3, v1, :cond_57

    .line 17
    .line 18
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x2d

    .line 23
    .line 24
    if-ne v1, v2, :cond_1b

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v2, 0x0

    .line 29
    :goto_1c
    if-nez v2, :cond_25

    .line 30
    .line 31
    const/16 v3, 0x2b

    .line 32
    .line 33
    if-ne v1, v3, :cond_23

    .line 34
    .line 35
    goto :goto_25

    .line 36
    :cond_23
    move v1, p2

    .line 37
    goto :goto_2d

    .line 38
    :cond_25
    :goto_25
    add-int/lit8 v1, p2, 0x1

    .line 39
    .line 40
    invoke-static {p1, v1, v0}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_4f

    .line 45
    .line 46
    :goto_2d
    const/16 v3, 0xa

    .line 47
    .line 48
    if-eq p4, v3, :cond_4a

    .line 49
    .line 50
    const/16 v3, 0x10

    .line 51
    .line 52
    if-eq p4, v3, :cond_45

    .line 53
    .line 54
    new-instance v0, Ljava/math/BigInteger;

    .line 55
    .line 56
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v0, p1, p4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :catch_43
    move-exception p1

    .line 69
    goto :goto_5f

    .line 70
    :cond_45
    invoke-direct {p0, p1, v1, v0, v2}, Lax/X4/s;->e(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_4a
    invoke-direct {p0, p1, v1, v0, v2}, Lax/X4/s;->d(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_4f
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 81
    .line 82
    const-string p2, "illegal syntax"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_57
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    const-string p2, "offset < 0 or length > str.length"

    .line 91
    .line 92
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1
    :try_end_5f
    .catch Ljava/lang/ArithmeticException; {:try_start_6 .. :try_end_5f} :catch_43

    .line 96
    :goto_5f
    new-instance p2, Ljava/lang/NumberFormatException;

    .line 97
    .line 98
    const-string p3, "value exceeds limits"

    .line 99
    .line 100
    invoke-direct {p2, p3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    throw p2
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
