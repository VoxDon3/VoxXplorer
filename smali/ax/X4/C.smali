.class Lax/X4/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;
    .registers 9

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    new-instance v1, Lax/X4/g;

    .line 4
    .line 5
    int-to-long v2, v0

    .line 6
    invoke-static {v2, v3}, Lax/X4/k;->d(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    invoke-direct {v1, v2, v3}, Lax/X4/g;-><init>(J)V

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v0, 0x7

    .line 14
    .line 15
    add-int/2addr v0, p1

    .line 16
    invoke-static {p0, p1, v0}, Lax/X4/i;->m(Ljava/lang/CharSequence;II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ltz p1, :cond_19

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    const/4 v4, 0x0

    .line 27
    :goto_1a
    invoke-virtual {v1, p1}, Lax/X4/g;->a(I)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    if-ge v0, p2, :cond_32

    .line 31
    .line 32
    invoke-static {p0, v0}, Lax/X4/i;->f(Ljava/lang/CharSequence;I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-ltz p1, :cond_27

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 v5, 0x0

    .line 41
    :goto_28
    and-int/2addr v4, v5

    .line 42
    const v5, 0x5f5e100

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v5, p1}, Lax/X4/g;->b(II)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x8

    .line 49
    .line 50
    goto :goto_1d

    .line 51
    :cond_32
    if-eqz v4, :cond_39

    .line 52
    .line 53
    invoke-virtual {v1}, Lax/X4/g;->c()Ljava/math/BigInteger;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_39
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 59
    .line 60
    const-string p1, "illegal syntax"

    .line 61
    .line 62
    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0
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

.method static b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/16 v1, 0x190

    .line 4
    .line 5
    if-gt v0, v1, :cond_b

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lax/X4/C;->a(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_b
    invoke-static {p1, p2}, Lax/X4/k;->h(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p0, p1, v0, p3}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p0, v0, p2, p3}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sub-int/2addr p2, v0

    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/math/BigInteger;

    .line 34
    .line 35
    invoke-static {p1, p2}, Lax/X4/l;->k(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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
