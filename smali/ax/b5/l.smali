.class public Lax/b5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final l:[C


# instance fields
.field private final a:Lax/b5/a;

.field private b:[C

.field private c:I

.field private d:I

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "[C>;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:I

.field private h:[C

.field private i:I

.field private j:Ljava/lang/String;

.field private k:[C


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    sput-object v0, Lax/b5/l;->l:[C

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

.method public constructor <init>(Lax/b5/a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/b5/l;->a:Lax/b5/a;

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
    .line 22
.end method

.method private b(I)[C
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b5/l;->a:Lax/b5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->d(II)[C

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_a
    const/16 v0, 0x1f4

    .line 12
    .line 13
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-array p1, p1, [C

    .line 18
    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method

.method private c(I)[C
    .registers 2

    .line 1
    new-array p1, p1, [C

    .line 2
    .line 3
    return-object p1
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

.method private d()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/b5/l;->f:Z

    .line 3
    .line 4
    iget-object v1, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iput v0, p0, Lax/b5/l;->g:I

    .line 10
    .line 11
    iput v0, p0, Lax/b5/l;->i:I

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private j()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lax/b5/l;->f:Z

    .line 16
    .line 17
    iget-object v1, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lax/b5/l;->g:I

    .line 23
    .line 24
    array-length v2, v0

    .line 25
    add-int/2addr v1, v2

    .line 26
    iput v1, p0, Lax/b5/l;->g:I

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput v1, p0, Lax/b5/l;->i:I

    .line 30
    .line 31
    array-length v0, v0

    .line 32
    shr-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    add-int/2addr v0, v1

    .line 35
    const/16 v1, 0x1f4

    .line 36
    .line 37
    if-ge v0, v1, :cond_29

    .line 38
    .line 39
    const/16 v0, 0x1f4

    .line 40
    .line 41
    goto :goto_2f

    .line 42
    :cond_29
    const/high16 v1, 0x10000

    .line 43
    .line 44
    if-le v0, v1, :cond_2f

    .line 45
    .line 46
    const/high16 v0, 0x10000

    .line 47
    .line 48
    :cond_2f
    :goto_2f
    invoke-direct {p0, v0}, Lax/b5/l;->c(I)[C

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 53
    .line 54
    return-void
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

.method private u()[C
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget v0, p0, Lax/b5/l;->c:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-ltz v0, :cond_2b

    .line 14
    .line 15
    iget v0, p0, Lax/b5/l;->d:I

    .line 16
    .line 17
    if-ge v0, v1, :cond_15

    .line 18
    .line 19
    sget-object v0, Lax/b5/l;->l:[C

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_15
    invoke-virtual {p0, v0}, Lax/b5/l;->A(I)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lax/b5/l;->c:I

    .line 26
    .line 27
    if-nez v1, :cond_23

    .line 28
    .line 29
    iget-object v1, p0, Lax/b5/l;->b:[C

    .line 30
    .line 31
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_23
    iget-object v2, p0, Lax/b5/l;->b:[C

    .line 37
    .line 38
    add-int/2addr v0, v1

    .line 39
    invoke-static {v2, v1, v0}, Ljava/util/Arrays;->copyOfRange([CII)[C

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :cond_2b
    invoke-virtual {p0}, Lax/b5/l;->x()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ge v0, v1, :cond_34

    .line 49
    .line 50
    sget-object v0, Lax/b5/l;->l:[C

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_34
    invoke-virtual {p0, v0}, Lax/b5/l;->A(I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v0}, Lax/b5/l;->c(I)[C

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    if-eqz v1, :cond_58

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    :goto_46
    if-ge v3, v1, :cond_59

    .line 72
    .line 73
    iget-object v5, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, [C

    .line 80
    .line 81
    array-length v6, v5

    .line 82
    invoke-static {v5, v2, v0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    .line 84
    .line 85
    add-int/2addr v4, v6

    .line 86
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_46

    .line 89
    :cond_58
    const/4 v4, 0x0

    .line 90
    :cond_59
    iget-object v1, p0, Lax/b5/l;->h:[C

    .line 91
    .line 92
    iget v3, p0, Lax/b5/l;->i:I

    .line 93
    .line 94
    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    return-object v0
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

.method private y(I)V
    .registers 7

    .line 1
    iget v0, p0, Lax/b5/l;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lax/b5/l;->d:I

    .line 5
    .line 6
    iget-object v2, p0, Lax/b5/l;->b:[C

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    iput-object v3, p0, Lax/b5/l;->b:[C

    .line 10
    .line 11
    iget v3, p0, Lax/b5/l;->c:I

    .line 12
    .line 13
    const/4 v4, -0x1

    .line 14
    iput v4, p0, Lax/b5/l;->c:I

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    iget-object v4, p0, Lax/b5/l;->h:[C

    .line 18
    .line 19
    if-eqz v4, :cond_17

    .line 20
    .line 21
    array-length v4, v4

    .line 22
    if-le p1, v4, :cond_1d

    .line 23
    .line 24
    :cond_17
    invoke-direct {p0, p1}, Lax/b5/l;->b(I)[C

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lax/b5/l;->h:[C

    .line 29
    .line 30
    :cond_1d
    if-lez v0, :cond_24

    .line 31
    .line 32
    iget-object p1, p0, Lax/b5/l;->h:[C

    .line 33
    .line 34
    invoke-static {v2, v3, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    :cond_24
    iput v1, p0, Lax/b5/l;->g:I

    .line 38
    .line 39
    iput v0, p0, Lax/b5/l;->i:I

    .line 40
    .line 41
    return-void
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

.method private z(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/b5/l;->g:I

    .line 2
    .line 3
    iget v1, p0, Lax/b5/l;->i:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    add-int/2addr v0, p1

    .line 7
    if-gez v0, :cond_b

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    :cond_b
    invoke-virtual {p0, v0}, Lax/b5/l;->A(I)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method protected A(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p0, 0x0

    throw p0
.end method

.method public a([CII)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_7

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lax/b5/l;->y(I)V

    .line 6
    .line 7
    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 12
    .line 13
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    iget v2, p0, Lax/b5/l;->i:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    if-lt v1, p3, :cond_1d

    .line 20
    .line 21
    invoke-static {p1, p2, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lax/b5/l;->i:I

    .line 25
    .line 26
    add-int/2addr p1, p3

    .line 27
    iput p1, p0, Lax/b5/l;->i:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-direct {p0, p3}, Lax/b5/l;->z(I)V

    .line 31
    .line 32
    .line 33
    if-lez v1, :cond_29

    .line 34
    .line 35
    iget v2, p0, Lax/b5/l;->i:I

    .line 36
    .line 37
    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    add-int/2addr p2, v1

    .line 41
    sub-int/2addr p3, v1

    .line 42
    :cond_29
    invoke-direct {p0}, Lax/b5/l;->j()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 46
    .line 47
    array-length v0, v0

    .line 48
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v1, p0, Lax/b5/l;->h:[C

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lax/b5/l;->i:I

    .line 59
    .line 60
    add-int/2addr v1, v0

    .line 61
    iput v1, p0, Lax/b5/l;->i:I

    .line 62
    .line 63
    add-int/2addr p2, v0

    .line 64
    sub-int/2addr p3, v0

    .line 65
    if-gtz p3, :cond_29

    .line 66
    .line 67
    return-void
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

.method public e()[C
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/l;->k:[C

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-direct {p0}, Lax/b5/l;->u()[C

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 10
    .line 11
    :cond_a
    return-object v0
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

.method public f(Z)I
    .registers 5

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ltz v0, :cond_1c

    .line 5
    .line 6
    iget-object v2, p0, Lax/b5/l;->b:[C

    .line 7
    .line 8
    if-eqz v2, :cond_1c

    .line 9
    .line 10
    if-eqz p1, :cond_15

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    iget p1, p0, Lax/b5/l;->d:I

    .line 14
    .line 15
    sub-int/2addr p1, v1

    .line 16
    invoke-static {v2, v0, p1}, Lax/W4/i;->g([CII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    neg-int p1, p1

    .line 21
    return p1

    .line 22
    :cond_15
    iget p1, p0, Lax/b5/l;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, p1}, Lax/W4/i;->g([CII)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1c
    if-eqz p1, :cond_29

    .line 30
    .line 31
    iget-object p1, p0, Lax/b5/l;->h:[C

    .line 32
    .line 33
    iget v0, p0, Lax/b5/l;->i:I

    .line 34
    .line 35
    sub-int/2addr v0, v1

    .line 36
    invoke-static {p1, v1, v0}, Lax/W4/i;->g([CII)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    neg-int p1, p1

    .line 41
    return p1

    .line 42
    :cond_29
    iget-object p1, p0, Lax/b5/l;->h:[C

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    iget v1, p0, Lax/b5/l;->i:I

    .line 46
    .line 47
    invoke-static {p1, v0, v1}, Lax/W4/i;->g([CII)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
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

.method public g(Z)J
    .registers 5

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ltz v0, :cond_1c

    .line 5
    .line 6
    iget-object v2, p0, Lax/b5/l;->b:[C

    .line 7
    .line 8
    if-eqz v2, :cond_1c

    .line 9
    .line 10
    if-eqz p1, :cond_15

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    iget p1, p0, Lax/b5/l;->d:I

    .line 14
    .line 15
    sub-int/2addr p1, v1

    .line 16
    invoke-static {v2, v0, p1}, Lax/W4/i;->h([CII)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    neg-long v0, v0

    .line 21
    return-wide v0

    .line 22
    :cond_15
    iget p1, p0, Lax/b5/l;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, p1}, Lax/W4/i;->h([CII)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0

    .line 29
    :cond_1c
    if-eqz p1, :cond_29

    .line 30
    .line 31
    iget-object p1, p0, Lax/b5/l;->h:[C

    .line 32
    .line 33
    iget v0, p0, Lax/b5/l;->i:I

    .line 34
    .line 35
    sub-int/2addr v0, v1

    .line 36
    invoke-static {p1, v1, v0}, Lax/W4/i;->h([CII)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    neg-long v0, v0

    .line 41
    return-wide v0

    .line 42
    :cond_29
    iget-object p1, p0, Lax/b5/l;->h:[C

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    iget v1, p0, Lax/b5/l;->i:I

    .line 46
    .line 47
    invoke-static {p1, v0, v1}, Lax/W4/i;->h([CII)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0
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

.method public h()Ljava/lang/String;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_78

    .line 4
    .line 5
    iget-object v0, p0, Lax/b5/l;->k:[C

    .line 6
    .line 7
    if-eqz v0, :cond_10

    .line 8
    .line 9
    new-instance v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_78

    .line 17
    :cond_10
    iget v0, p0, Lax/b5/l;->c:I

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    if-ltz v0, :cond_2f

    .line 22
    .line 23
    iget v0, p0, Lax/b5/l;->d:I

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-ge v0, v2, :cond_1e

    .line 27
    .line 28
    iput-object v1, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1e
    invoke-virtual {p0, v0}, Lax/b5/l;->A(I)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p0, Lax/b5/l;->b:[C

    .line 37
    .line 38
    iget v2, p0, Lax/b5/l;->c:I

    .line 39
    .line 40
    iget v3, p0, Lax/b5/l;->d:I

    .line 41
    .line 42
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_78

    .line 48
    :cond_2f
    iget v0, p0, Lax/b5/l;->g:I

    .line 49
    .line 50
    iget v2, p0, Lax/b5/l;->i:I

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    if-nez v0, :cond_48

    .line 54
    .line 55
    if-nez v2, :cond_3b

    .line 56
    .line 57
    iput-object v1, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_78

    .line 60
    :cond_3b
    invoke-virtual {p0, v2}, Lax/b5/l;->A(I)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v1, p0, Lax/b5/l;->h:[C

    .line 66
    .line 67
    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 71
    .line 72
    goto :goto_78

    .line 73
    :cond_48
    add-int/2addr v0, v2

    .line 74
    invoke-virtual {p0, v0}, Lax/b5/l;->A(I)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 83
    .line 84
    if-eqz v0, :cond_6b

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v2, 0x0

    .line 91
    :goto_5a
    if-ge v2, v0, :cond_6b

    .line 92
    .line 93
    iget-object v4, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, [C

    .line 100
    .line 101
    array-length v5, v4

    .line 102
    invoke-virtual {v1, v4, v3, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_5a

    .line 108
    :cond_6b
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 109
    .line 110
    iget v2, p0, Lax/b5/l;->i:I

    .line 111
    .line 112
    invoke-virtual {v1, v0, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 120
    .line 121
    :cond_78
    :goto_78
    iget-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 122
    .line 123
    return-object v0
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

.method public i()[C
    .registers 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/b5/l;->c:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/b5/l;->i:I

    .line 6
    .line 7
    iput v0, p0, Lax/b5/l;->d:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lax/b5/l;->b:[C

    .line 11
    .line 12
    iput-object v1, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v1, p0, Lax/b5/l;->k:[C

    .line 15
    .line 16
    iget-boolean v1, p0, Lax/b5/l;->f:Z

    .line 17
    .line 18
    if-eqz v1, :cond_16

    .line 19
    .line 20
    invoke-direct {p0}, Lax/b5/l;->d()V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget-object v1, p0, Lax/b5/l;->h:[C

    .line 24
    .line 25
    if-nez v1, :cond_21

    .line 26
    .line 27
    invoke-direct {p0, v0}, Lax/b5/l;->b(I)[C

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_21
    return-object v1
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

.method public k()[C
    .registers 5

    .line 1
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    shr-int/lit8 v2, v1, 0x1

    .line 5
    .line 6
    add-int/2addr v2, v1

    .line 7
    const/high16 v3, 0x10000

    .line 8
    .line 9
    if-le v2, v3, :cond_d

    .line 10
    .line 11
    shr-int/lit8 v2, v1, 0x2

    .line 12
    .line 13
    add-int/2addr v2, v1

    .line 14
    :cond_d
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 19
    .line 20
    return-object v0
    .line 21
.end method

.method public l()[C
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_b
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lax/b5/l;->f:Z

    .line 14
    .line 15
    iget-object v0, p0, Lax/b5/l;->e:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v1, p0, Lax/b5/l;->h:[C

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 23
    .line 24
    array-length v0, v0

    .line 25
    iget v1, p0, Lax/b5/l;->g:I

    .line 26
    .line 27
    add-int/2addr v1, v0

    .line 28
    iput v1, p0, Lax/b5/l;->g:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    iput v2, p0, Lax/b5/l;->i:I

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lax/b5/l;->A(I)V

    .line 34
    .line 35
    .line 36
    shr-int/lit8 v1, v0, 0x1

    .line 37
    .line 38
    add-int/2addr v0, v1

    .line 39
    const/16 v1, 0x1f4

    .line 40
    .line 41
    if-ge v0, v1, :cond_2d

    .line 42
    .line 43
    const/16 v0, 0x1f4

    .line 44
    .line 45
    goto :goto_33

    .line 46
    :cond_2d
    const/high16 v1, 0x10000

    .line 47
    .line 48
    if-le v0, v1, :cond_33

    .line 49
    .line 50
    const/high16 v0, 0x10000

    .line 51
    .line 52
    :cond_33
    :goto_33
    invoke-direct {p0, v0}, Lax/b5/l;->c(I)[C

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 57
    .line 58
    return-object v0
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

.method public m()[C
    .registers 3

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_9

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p0, v0}, Lax/b5/l;->y(I)V

    .line 7
    .line 8
    .line 9
    goto :goto_1d

    .line 10
    :cond_9
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 11
    .line 12
    if-nez v0, :cond_15

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0}, Lax/b5/l;->b(I)[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 20
    .line 21
    goto :goto_1d

    .line 22
    :cond_15
    iget v1, p0, Lax/b5/l;->i:I

    .line 23
    .line 24
    array-length v0, v0

    .line 25
    if-lt v1, v0, :cond_1d

    .line 26
    .line 27
    invoke-direct {p0}, Lax/b5/l;->j()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    :goto_1d
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 31
    .line 32
    return-object v0
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

.method public n()I
    .registers 2

    .line 1
    iget v0, p0, Lax/b5/l;->i:I

    .line 2
    .line 3
    return v0
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

.method public o()[C
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lax/b5/l;->b:[C

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/b5/l;->k:[C

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    iget-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_17
    iget-boolean v0, p0, Lax/b5/l;->f:Z

    .line 25
    .line 26
    if-nez v0, :cond_22

    .line 27
    .line 28
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 29
    .line 30
    if-nez v0, :cond_21

    .line 31
    .line 32
    sget-object v0, Lax/b5/l;->l:[C

    .line 33
    .line 34
    :cond_21
    return-object v0

    .line 35
    :cond_22
    invoke-virtual {p0}, Lax/b5/l;->e()[C

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
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

.method public p()I
    .registers 2

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_5

    .line 4
    .line 5
    return v0

    .line 6
    :cond_5
    const/4 v0, 0x0

    .line 7
    return v0
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

.method public q()V
    .registers 4

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/b5/l;->c:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/b5/l;->i:I

    .line 6
    .line 7
    iput v0, p0, Lax/b5/l;->d:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lax/b5/l;->b:[C

    .line 11
    .line 12
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 13
    .line 14
    iget-boolean v1, p0, Lax/b5/l;->f:Z

    .line 15
    .line 16
    if-eqz v1, :cond_14

    .line 17
    .line 18
    invoke-direct {p0}, Lax/b5/l;->d()V

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-object v1, p0, Lax/b5/l;->a:Lax/b5/a;

    .line 22
    .line 23
    if-eqz v1, :cond_22

    .line 24
    .line 25
    iget-object v2, p0, Lax/b5/l;->h:[C

    .line 26
    .line 27
    if-eqz v2, :cond_22

    .line 28
    .line 29
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-virtual {v1, v0, v2}, Lax/b5/a;->j(I[C)V

    .line 33
    .line 34
    .line 35
    :cond_22
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public r([CII)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/b5/l;->b:[C

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lax/b5/l;->c:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lax/b5/l;->d:I

    .line 9
    .line 10
    iput-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 13
    .line 14
    iget-boolean v0, p0, Lax/b5/l;->f:Z

    .line 15
    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-direct {p0}, Lax/b5/l;->d()V

    .line 19
    .line 20
    .line 21
    goto :goto_1f

    .line 22
    :cond_15
    iget-object v0, p0, Lax/b5/l;->h:[C

    .line 23
    .line 24
    if-nez v0, :cond_1f

    .line 25
    .line 26
    invoke-direct {p0, p3}, Lax/b5/l;->b(I)[C

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lax/b5/l;->h:[C

    .line 31
    .line 32
    :cond_1f
    :goto_1f
    iput v1, p0, Lax/b5/l;->g:I

    .line 33
    .line 34
    iput v1, p0, Lax/b5/l;->i:I

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, p3}, Lax/b5/l;->a([CII)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public s([CII)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 3
    .line 4
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 5
    .line 6
    iput-object p1, p0, Lax/b5/l;->b:[C

    .line 7
    .line 8
    iput p2, p0, Lax/b5/l;->c:I

    .line 9
    .line 10
    iput p3, p0, Lax/b5/l;->d:I

    .line 11
    .line 12
    iget-boolean p1, p0, Lax/b5/l;->f:Z

    .line 13
    .line 14
    if-eqz p1, :cond_12

    .line 15
    .line 16
    invoke-direct {p0}, Lax/b5/l;->d()V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
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

.method public t(Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/b5/l;->b:[C

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lax/b5/l;->c:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lax/b5/l;->d:I

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0, v2}, Lax/b5/l;->A(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v0, p0, Lax/b5/l;->k:[C

    .line 20
    .line 21
    iget-boolean p1, p0, Lax/b5/l;->f:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1b

    .line 24
    .line 25
    invoke-direct {p0}, Lax/b5/l;->d()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iput v1, p0, Lax/b5/l;->i:I

    .line 29
    .line 30
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lax/b5/l;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_4} :catch_5

    .line 5
    return-object v0

    .line 6
    :catch_5
    const-string v0, "TextBuffer: Exception when reading contents"

    .line 7
    .line 8
    return-object v0
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

.method public v(I)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iput p1, p0, Lax/b5/l;->i:I

    .line 2
    .line 3
    iget v0, p0, Lax/b5/l;->g:I

    .line 4
    .line 5
    if-lez v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/b5/l;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    invoke-virtual {p0, p1}, Lax/b5/l;->A(I)V

    .line 13
    .line 14
    .line 15
    if-nez p1, :cond_13

    .line 16
    .line 17
    const-string p1, ""

    .line 18
    .line 19
    goto :goto_1c

    .line 20
    :cond_13
    new-instance v0, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Lax/b5/l;->h:[C

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :goto_1c
    iput-object p1, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 30
    .line 31
    return-object p1
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
.end method

.method public w(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/b5/l;->i:I

    .line 2
    .line 3
    return-void
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

.method public x()I
    .registers 3

    .line 1
    iget v0, p0, Lax/b5/l;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_7

    .line 4
    .line 5
    iget v0, p0, Lax/b5/l;->d:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/b5/l;->k:[C

    .line 9
    .line 10
    if-eqz v0, :cond_d

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    return v0

    .line 14
    :cond_d
    iget-object v0, p0, Lax/b5/l;->j:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_16
    iget v0, p0, Lax/b5/l;->g:I

    .line 24
    .line 25
    iget v1, p0, Lax/b5/l;->i:I

    .line 26
    .line 27
    add-int/2addr v0, v1

    .line 28
    return v0
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
