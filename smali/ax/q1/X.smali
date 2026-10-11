.class public final Lax/q1/X;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/q1/X$c;,
        Lax/q1/X$a;,
        Lax/q1/X$b;
    }
.end annotation


# direct methods
.method public static a(I)[I
    .registers 10

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x5

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    if-eq p0, v5, :cond_2d

    .line 12
    .line 13
    if-eq p0, v4, :cond_28

    .line 14
    .line 15
    if-eq p0, v3, :cond_22

    .line 16
    .line 17
    if-eq p0, v1, :cond_1c

    .line 18
    .line 19
    if-eq p0, v0, :cond_16

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_16
    new-array p0, v0, [I

    .line 24
    .line 25
    fill-array-data p0, :array_32

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1c
    new-array p0, v1, [I

    .line 30
    .line 31
    fill-array-data p0, :array_46

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_22
    new-array p0, v3, [I

    .line 36
    .line 37
    fill-array-data p0, :array_58

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_28
    filled-new-array {v6, v7, v8, v5, v2}, [I

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2d
    filled-new-array {v6, v7, v8}, [I

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :array_32
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

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
    :array_46
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

    :array_58
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
.end method

.method public static b(I)I
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    if-lez p0, :cond_8

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    ushr-int/lit8 p0, p0, 0x1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_8
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
    .line 22
.end method

.method private static c(JJ)J
    .registers 6

    .line 1
    long-to-double p0, p0

    .line 2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 3
    .line 4
    long-to-double p2, p2

    .line 5
    div-double/2addr v0, p2

    .line 6
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    double-to-long p0, p0

    .line 15
    return-wide p0
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

.method public static d(Ljava/util/List;)Lax/P0/C;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lax/P0/C;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_68

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const-string v4, "="

    .line 21
    .line 22
    invoke-static {v3, v4}, Lax/S0/d0;->y1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    array-length v5, v4

    .line 27
    const/4 v6, 0x2

    .line 28
    const-string v7, "VorbisUtil"

    .line 29
    .line 30
    if-eq v5, v6, :cond_34

    .line 31
    .line 32
    new-instance v4, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v5, "Failed to parse Vorbis comment: "

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v7, v3}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_65

    .line 53
    :cond_34
    aget-object v3, v4, v1

    .line 54
    .line 55
    const-string v5, "METADATA_BLOCK_PICTURE"

    .line 56
    .line 57
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v5, 0x1

    .line 62
    if-eqz v3, :cond_59

    .line 63
    .line 64
    :try_start_3f
    aget-object v3, v4, v5

    .line 65
    .line 66
    invoke-static {v3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, Lax/S0/G;

    .line 71
    .line 72
    invoke-direct {v4, v3}, Lax/S0/G;-><init>([B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, Lax/C1/a;->d(Lax/S0/G;)Lax/C1/a;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_51
    .catch Ljava/lang/RuntimeException; {:try_start_3f .. :try_end_51} :catch_52

    .line 80
    .line 81
    .line 82
    goto :goto_65

    .line 83
    :catch_52
    move-exception v3

    .line 84
    const-string v4, "Failed to parse vorbis picture"

    .line 85
    .line 86
    invoke-static {v7, v4, v3}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_65

    .line 90
    :cond_59
    new-instance v3, Lax/H1/a;

    .line 91
    .line 92
    aget-object v6, v4, v1

    .line 93
    .line 94
    aget-object v4, v4, v5

    .line 95
    .line 96
    invoke-direct {v3, v6, v4}, Lax/H1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :goto_65
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_68
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_70

    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    goto :goto_75

    .line 113
    :cond_70
    new-instance p0, Lax/P0/C;

    .line 114
    .line 115
    invoke-direct {p0, v0}, Lax/P0/C;-><init>(Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    :goto_75
    return-object p0
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

.method public static e([B)Lax/r7/z;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lax/r7/z<",
            "[B>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/S0/G;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/S0/G;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_b
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/16 v5, 0xff

    .line 17
    .line 18
    if-lez v4, :cond_1f

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/S0/G;->n()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-ne v4, v5, :cond_1f

    .line 25
    .line 26
    add-int/lit16 v3, v3, 0xff

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_b

    .line 32
    :cond_1f
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v3, v4

    .line 37
    const/4 v4, 0x0

    .line 38
    :goto_25
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-lez v6, :cond_37

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/S0/G;->n()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-ne v6, v5, :cond_37

    .line 49
    .line 50
    add-int/lit16 v4, v4, 0xff

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_25

    .line 56
    :cond_37
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v4, v1

    .line 61
    new-array v1, v3, [B

    .line 62
    .line 63
    invoke-virtual {v0}, Lax/S0/G;->g()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {p0, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    add-int/2addr v0, v3

    .line 71
    add-int/2addr v0, v4

    .line 72
    array-length v3, p0

    .line 73
    sub-int/2addr v3, v0

    .line 74
    new-array v4, v3, [B

    .line 75
    .line 76
    invoke-static {p0, v0, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v4}, Lax/r7/z;->B(Ljava/lang/Object;Ljava/lang/Object;)Lax/r7/z;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
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

.method private static f(Lax/q1/W;)V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lax/q1/W;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_9
    if-ge v4, v1, :cond_aa

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-virtual {p0, v5}, Lax/q1/W;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    const/4 v7, 0x4

    .line 19
    const/16 v8, 0x8

    .line 20
    .line 21
    if-eqz v6, :cond_89

    .line 22
    .line 23
    if-ne v6, v2, :cond_72

    .line 24
    .line 25
    const/4 v5, 0x5

    .line 26
    invoke-virtual {p0, v5}, Lax/q1/W;->d(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    new-array v6, v5, [I

    .line 31
    .line 32
    const/4 v9, -0x1

    .line 33
    const/4 v10, 0x0

    .line 34
    :goto_21
    if-ge v10, v5, :cond_2f

    .line 35
    .line 36
    invoke-virtual {p0, v7}, Lax/q1/W;->d(I)I

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    aput v11, v6, v10

    .line 41
    .line 42
    if-le v11, v9, :cond_2c

    .line 43
    .line 44
    move v9, v11

    .line 45
    :cond_2c
    add-int/lit8 v10, v10, 0x1

    .line 46
    .line 47
    goto :goto_21

    .line 48
    :cond_2f
    add-int/lit8 v9, v9, 0x1

    .line 49
    .line 50
    new-array v10, v9, [I

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    :goto_34
    const/4 v12, 0x2

    .line 54
    if-ge v11, v9, :cond_56

    .line 55
    .line 56
    const/4 v13, 0x3

    .line 57
    invoke-virtual {p0, v13}, Lax/q1/W;->d(I)I

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    add-int/2addr v13, v2

    .line 62
    aput v13, v10, v11

    .line 63
    .line 64
    invoke-virtual {p0, v12}, Lax/q1/W;->d(I)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-lez v12, :cond_48

    .line 69
    .line 70
    invoke-virtual {p0, v8}, Lax/q1/W;->e(I)V

    .line 71
    .line 72
    .line 73
    :cond_48
    const/4 v13, 0x0

    .line 74
    :goto_49
    shl-int v14, v2, v12

    .line 75
    .line 76
    if-ge v13, v14, :cond_53

    .line 77
    .line 78
    invoke-virtual {p0, v8}, Lax/q1/W;->e(I)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v13, v13, 0x1

    .line 82
    .line 83
    goto :goto_49

    .line 84
    :cond_53
    add-int/lit8 v11, v11, 0x1

    .line 85
    .line 86
    goto :goto_34

    .line 87
    :cond_56
    invoke-virtual {p0, v12}, Lax/q1/W;->e(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v7}, Lax/q1/W;->d(I)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    const/4 v11, 0x0

    .line 97
    :goto_60
    if-ge v8, v5, :cond_a6

    .line 98
    .line 99
    aget v12, v6, v8

    .line 100
    .line 101
    aget v12, v10, v12

    .line 102
    .line 103
    add-int/2addr v9, v12

    .line 104
    :goto_67
    if-ge v11, v9, :cond_6f

    .line 105
    .line 106
    invoke-virtual {p0, v7}, Lax/q1/W;->e(I)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v11, v11, 0x1

    .line 110
    .line 111
    goto :goto_67

    .line 112
    :cond_6f
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    goto :goto_60

    .line 115
    :cond_72
    new-instance p0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v0, "floor type greater than 1 not decodable: "

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const/4 v0, 0x0

    .line 133
    invoke-static {p0, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    throw p0

    .line 138
    :cond_89
    invoke-virtual {p0, v8}, Lax/q1/W;->e(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lax/q1/W;->e(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v8}, Lax/q1/W;->e(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v7}, Lax/q1/W;->d(I)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    add-int/2addr v5, v2

    .line 158
    const/4 v6, 0x0

    .line 159
    :goto_9e
    if-ge v6, v5, :cond_a6

    .line 160
    .line 161
    invoke-virtual {p0, v8}, Lax/q1/W;->e(I)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    goto :goto_9e

    .line 167
    :cond_a6
    add-int/lit8 v4, v4, 0x1

    .line 168
    .line 169
    goto/16 :goto_9

    .line 170
    .line 171
    :cond_aa
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private static g(ILax/q1/W;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p1, v0}, Lax/q1/W;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_9
    if-ge v3, v0, :cond_87

    .line 11
    .line 12
    const/16 v4, 0x10

    .line 13
    .line 14
    invoke-virtual {p1, v4}, Lax/q1/W;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_2a

    .line 19
    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v6, "mapping type other than 0 not supported: "

    .line 26
    .line 27
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "VorbisUtil"

    .line 38
    .line 39
    invoke-static {v5, v4}, Lax/S0/u;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_7c

    .line 43
    :cond_2a
    invoke-virtual {p1}, Lax/q1/W;->c()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/4 v5, 0x4

    .line 48
    if-eqz v4, :cond_37

    .line 49
    .line 50
    invoke-virtual {p1, v5}, Lax/q1/W;->d(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    add-int/2addr v4, v1

    .line 55
    goto :goto_38

    .line 56
    :cond_37
    const/4 v4, 0x1

    .line 57
    :goto_38
    invoke-virtual {p1}, Lax/q1/W;->c()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    const/16 v7, 0x8

    .line 62
    .line 63
    if-eqz v6, :cond_5b

    .line 64
    .line 65
    invoke-virtual {p1, v7}, Lax/q1/W;->d(I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    add-int/2addr v6, v1

    .line 70
    const/4 v8, 0x0

    .line 71
    :goto_46
    if-ge v8, v6, :cond_5b

    .line 72
    .line 73
    add-int/lit8 v9, p0, -0x1

    .line 74
    .line 75
    invoke-static {v9}, Lax/q1/X;->b(I)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    invoke-virtual {p1, v10}, Lax/q1/W;->e(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v9}, Lax/q1/X;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-virtual {p1, v9}, Lax/q1/W;->e(I)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_46

    .line 92
    :cond_5b
    const/4 v6, 0x2

    .line 93
    invoke-virtual {p1, v6}, Lax/q1/W;->d(I)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_7f

    .line 98
    .line 99
    if-le v4, v1, :cond_6d

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    :goto_65
    if-ge v6, p0, :cond_6d

    .line 103
    .line 104
    invoke-virtual {p1, v5}, Lax/q1/W;->e(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_65

    .line 110
    :cond_6d
    const/4 v5, 0x0

    .line 111
    :goto_6e
    if-ge v5, v4, :cond_7c

    .line 112
    .line 113
    invoke-virtual {p1, v7}, Lax/q1/W;->e(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v7}, Lax/q1/W;->e(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v7}, Lax/q1/W;->e(I)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    goto :goto_6e

    .line 125
    :cond_7c
    :goto_7c
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    goto :goto_9

    .line 128
    :cond_7f
    const-string p0, "to reserved bits must be zero after mapping coupling steps"

    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-static {p0, p1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    throw p0

    .line 136
    :cond_87
    return-void
    .line 137
    .line 138
    .line 139
.end method

.method private static h(Lax/q1/W;)[Lax/q1/X$b;
    .registers 9

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lax/q1/W;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    new-array v1, v0, [Lax/q1/X$b;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_a
    if-ge v2, v0, :cond_2a

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/q1/W;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v4, 0x10

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Lax/q1/W;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {p0, v4}, Lax/q1/W;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    invoke-virtual {p0, v6}, Lax/q1/W;->d(I)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    new-instance v7, Lax/q1/X$b;

    .line 34
    .line 35
    invoke-direct {v7, v3, v5, v4, v6}, Lax/q1/X$b;-><init>(ZIII)V

    .line 36
    .line 37
    .line 38
    aput-object v7, v1, v2

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_a

    .line 43
    :cond_2a
    return-object v1
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

.method private static i(Lax/q1/W;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lax/q1/W;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_9
    if-ge v4, v1, :cond_69

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-virtual {p0, v5}, Lax/q1/W;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/4 v6, 0x2

    .line 19
    if-gt v5, v6, :cond_61

    .line 20
    .line 21
    const/16 v5, 0x18

    .line 22
    .line 23
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lax/q1/W;->d(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int/2addr v5, v2

    .line 37
    const/16 v6, 0x8

    .line 38
    .line 39
    invoke-virtual {p0, v6}, Lax/q1/W;->e(I)V

    .line 40
    .line 41
    .line 42
    new-array v7, v5, [I

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    :goto_2c
    if-ge v8, v5, :cond_48

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    invoke-virtual {p0, v9}, Lax/q1/W;->d(I)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {p0}, Lax/q1/W;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    if-eqz v10, :cond_3f

    .line 57
    .line 58
    const/4 v10, 0x5

    .line 59
    invoke-virtual {p0, v10}, Lax/q1/W;->d(I)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    goto :goto_40

    .line 64
    :cond_3f
    const/4 v10, 0x0

    .line 65
    :goto_40
    mul-int/lit8 v10, v10, 0x8

    .line 66
    .line 67
    add-int/2addr v10, v9

    .line 68
    aput v10, v7, v8

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    goto :goto_2c

    .line 73
    :cond_48
    const/4 v8, 0x0

    .line 74
    :goto_49
    if-ge v8, v5, :cond_5e

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    :goto_4c
    if-ge v9, v6, :cond_5b

    .line 78
    .line 79
    aget v10, v7, v8

    .line 80
    .line 81
    shl-int v11, v2, v9

    .line 82
    .line 83
    and-int/2addr v10, v11

    .line 84
    if-eqz v10, :cond_58

    .line 85
    .line 86
    invoke-virtual {p0, v6}, Lax/q1/W;->e(I)V

    .line 87
    .line 88
    .line 89
    :cond_58
    add-int/lit8 v9, v9, 0x1

    .line 90
    .line 91
    goto :goto_4c

    .line 92
    :cond_5b
    add-int/lit8 v8, v8, 0x1

    .line 93
    .line 94
    goto :goto_49

    .line 95
    :cond_5e
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    goto :goto_9

    .line 98
    :cond_61
    const-string p0, "residueType greater than 2 is not decodable"

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    invoke-static {p0, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    throw p0

    .line 106
    :cond_69
    return-void
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

.method public static j(Lax/S0/G;)Lax/q1/X$a;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0, v0}, Lax/q1/X;->k(Lax/S0/G;ZZ)Lax/q1/X$a;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
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

.method public static k(Lax/S0/G;ZZ)Lax/q1/X$a;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_7

    .line 3
    .line 4
    const/4 p1, 0x3

    .line 5
    invoke-static {p1, p0, v0}, Lax/q1/X;->o(ILax/S0/G;Z)Z

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/S0/G;->C()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    long-to-int p1, v1

    .line 13
    invoke-virtual {p0, p1}, Lax/S0/G;->J(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Lax/S0/G;->C()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    long-to-int v4, v2

    .line 26
    new-array v4, v4, [Ljava/lang/String;

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0xf

    .line 29
    .line 30
    :goto_1d
    int-to-long v5, v0

    .line 31
    cmp-long v7, v5, v2

    .line 32
    .line 33
    if-gez v7, :cond_37

    .line 34
    .line 35
    invoke-virtual {p0}, Lax/S0/G;->C()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    long-to-int v6, v5

    .line 40
    add-int/lit8 v1, v1, 0x4

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Lax/S0/G;->J(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    aput-object v5, v4, v0

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    add-int/2addr v1, v5

    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_1d

    .line 56
    :cond_37
    if-eqz p2, :cond_4a

    .line 57
    .line 58
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    and-int/lit8 p0, p0, 0x1

    .line 63
    .line 64
    if-eqz p0, :cond_42

    .line 65
    .line 66
    goto :goto_4a

    .line 67
    :cond_42
    const-string p0, "framing bit expected to be set"

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    invoke-static {p0, p1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    throw p0

    .line 75
    :cond_4a
    :goto_4a
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    new-instance p0, Lax/q1/X$a;

    .line 78
    .line 79
    invoke-direct {p0, p1, v4, v1}, Lax/q1/X$a;-><init>(Ljava/lang/String;[Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    return-object p0
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static l(Lax/S0/G;)Lax/q1/X$c;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v0, p0, v1}, Lax/q1/X;->o(ILax/S0/G;Z)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->D()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    invoke-virtual {p0}, Lax/S0/G;->D()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v6, -0x1

    .line 23
    if-gtz v2, :cond_19

    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    :cond_19
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-gtz v7, :cond_20

    .line 31
    .line 32
    const/4 v7, -0x1

    .line 33
    :cond_20
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-gtz v8, :cond_27

    .line 38
    .line 39
    const/4 v8, -0x1

    .line 40
    :cond_27
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    and-int/lit8 v9, v6, 0xf

    .line 45
    .line 46
    int-to-double v9, v9

    .line 47
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 48
    .line 49
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    double-to-int v9, v9

    .line 54
    and-int/lit16 v6, v6, 0xf0

    .line 55
    .line 56
    shr-int/lit8 v6, v6, 0x4

    .line 57
    .line 58
    int-to-double v13, v6

    .line 59
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    double-to-int v10, v10

    .line 64
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    and-int/2addr v6, v0

    .line 69
    if-lez v6, :cond_48

    .line 70
    .line 71
    const/4 v11, 0x1

    .line 72
    goto :goto_49

    .line 73
    :cond_48
    const/4 v11, 0x0

    .line 74
    :goto_49
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p0}, Lax/S0/G;->j()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    move v6, v2

    .line 87
    new-instance v2, Lax/q1/X$c;

    .line 88
    .line 89
    invoke-direct/range {v2 .. v12}, Lax/q1/X$c;-><init>(IIIIIIIIZ[B)V

    .line 90
    .line 91
    .line 92
    return-object v2
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

.method public static m(Lax/S0/G;I)[Lax/q1/X$b;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v0, p0, v1}, Lax/q1/X;->o(ILax/S0/G;Z)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    new-instance v2, Lax/q1/W;

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v2, v3}, Lax/q1/W;-><init>([B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    mul-int/lit8 p0, p0, 0x8

    .line 26
    .line 27
    invoke-virtual {v2, p0}, Lax/q1/W;->e(I)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    :goto_1e
    if-ge p0, v0, :cond_26

    .line 32
    .line 33
    invoke-static {v2}, Lax/q1/X;->n(Lax/q1/W;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x1

    .line 37
    .line 38
    goto :goto_1e

    .line 39
    :cond_26
    const/4 p0, 0x6

    .line 40
    invoke-virtual {v2, p0}, Lax/q1/W;->d(I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    :goto_2d
    const/4 v0, 0x0

    .line 47
    if-ge v1, p0, :cond_42

    .line 48
    .line 49
    const/16 v3, 0x10

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lax/q1/W;->d(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_3b

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_2d

    .line 60
    :cond_3b
    const-string p0, "placeholder of time domain transforms not zeroed out"

    .line 61
    .line 62
    invoke-static {p0, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    throw p0

    .line 67
    :cond_42
    invoke-static {v2}, Lax/q1/X;->f(Lax/q1/W;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lax/q1/X;->i(Lax/q1/W;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v2}, Lax/q1/X;->g(ILax/q1/W;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Lax/q1/X;->h(Lax/q1/W;)[Lax/q1/X$b;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v2}, Lax/q1/W;->c()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_56

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_56
    const-string p0, "framing bit after modes not set as expected"

    .line 88
    .line 89
    invoke-static {p0, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    throw p0
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

.method private static n(Lax/q1/W;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/q1/W;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0x564342

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne v1, v2, :cond_96

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lax/q1/W;->d(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0, v0}, Lax/q1/W;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, Lax/q1/W;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x5

    .line 29
    if-nez v2, :cond_36

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/q1/W;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_22
    if-ge v4, v0, :cond_47

    .line 36
    .line 37
    if-eqz v2, :cond_30

    .line 38
    .line 39
    invoke-virtual {p0}, Lax/q1/W;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_33

    .line 44
    .line 45
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_33

    .line 49
    :cond_30
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 50
    .line 51
    .line 52
    :cond_33
    :goto_33
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_22

    .line 55
    :cond_36
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 56
    .line 57
    .line 58
    :goto_39
    if-ge v4, v0, :cond_47

    .line 59
    .line 60
    sub-int v2, v0, v4

    .line 61
    .line 62
    invoke-static {v2}, Lax/q1/X;->b(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p0, v2}, Lax/q1/W;->d(I)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v4, v2

    .line 71
    goto :goto_39

    .line 72
    :cond_47
    const/4 v2, 0x4

    .line 73
    invoke-virtual {p0, v2}, Lax/q1/W;->d(I)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    const/4 v5, 0x2

    .line 78
    if-gt v4, v5, :cond_80

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    if-eq v4, v3, :cond_56

    .line 82
    .line 83
    if-ne v4, v5, :cond_55

    .line 84
    .line 85
    goto :goto_56

    .line 86
    :cond_55
    return-void

    .line 87
    :cond_56
    :goto_56
    const/16 v5, 0x20

    .line 88
    .line 89
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v5}, Lax/q1/W;->e(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v2}, Lax/q1/W;->d(I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    add-int/2addr v2, v3

    .line 100
    invoke-virtual {p0, v3}, Lax/q1/W;->e(I)V

    .line 101
    .line 102
    .line 103
    if-ne v4, v3, :cond_74

    .line 104
    .line 105
    if-eqz v1, :cond_71

    .line 106
    .line 107
    int-to-long v3, v0

    .line 108
    int-to-long v0, v1

    .line 109
    invoke-static {v3, v4, v0, v1}, Lax/q1/X;->c(JJ)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    goto :goto_78

    .line 114
    :cond_71
    const-wide/16 v0, 0x0

    .line 115
    .line 116
    goto :goto_78

    .line 117
    :cond_74
    int-to-long v3, v0

    .line 118
    int-to-long v0, v1

    .line 119
    mul-long v0, v0, v3

    .line 120
    .line 121
    :goto_78
    int-to-long v2, v2

    .line 122
    mul-long v0, v0, v2

    .line 123
    .line 124
    long-to-int v1, v0

    .line 125
    invoke-virtual {p0, v1}, Lax/q1/W;->e(I)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_80
    new-instance p0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v0, "lookup type greater than 2 not decodable: "

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    throw p0

    .line 151
    :cond_96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v1, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lax/q1/W;->b()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    throw p0
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public static o(ILax/S0/G;Z)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ge v0, v1, :cond_26

    .line 9
    .line 10
    if-eqz p2, :cond_c

    .line 11
    .line 12
    return v3

    .line 13
    :cond_c
    new-instance p0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string p2, "too short header: "

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0

    .line 39
    :cond_26
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eq v0, p0, :cond_49

    .line 44
    .line 45
    if-eqz p2, :cond_2f

    .line 46
    .line 47
    return v3

    .line 48
    :cond_2f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string p2, "expected header type "

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    throw p0

    .line 74
    :cond_49
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/16 v0, 0x76

    .line 79
    .line 80
    if-ne p0, v0, :cond_7c

    .line 81
    .line 82
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    const/16 v0, 0x6f

    .line 87
    .line 88
    if-ne p0, v0, :cond_7c

    .line 89
    .line 90
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    const/16 v0, 0x72

    .line 95
    .line 96
    if-ne p0, v0, :cond_7c

    .line 97
    .line 98
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const/16 v0, 0x62

    .line 103
    .line 104
    if-ne p0, v0, :cond_7c

    .line 105
    .line 106
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    const/16 v0, 0x69

    .line 111
    .line 112
    if-ne p0, v0, :cond_7c

    .line 113
    .line 114
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    const/16 p1, 0x73

    .line 119
    .line 120
    if-eq p0, p1, :cond_7a

    .line 121
    .line 122
    goto :goto_7c

    .line 123
    :cond_7a
    const/4 p0, 0x1

    .line 124
    return p0

    .line 125
    :cond_7c
    :goto_7c
    if-eqz p2, :cond_7f

    .line 126
    .line 127
    return v3

    .line 128
    :cond_7f
    const-string p0, "expected characters \'vorbis\'"

    .line 129
    .line 130
    invoke-static {p0, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    throw p0
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method
