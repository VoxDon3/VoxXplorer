.class Lax/i5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lax/i5/g;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lax/i5/g;Ljava/lang/String;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 4
    iput-object p2, p0, Lax/i5/i;->b:Ljava/lang/String;

    return-void
.end method

.method static a(Lax/i5/i;Lax/i5/i;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/i5/i;->c()Lax/i5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lax/i5/i;->c()Lax/i5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Lax/i5/g;->h()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p0, v0, v1}, Lax/i5/g;->F(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lax/i5/g;->k()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0, v0, v1}, Lax/i5/g;->J(J)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lax/i5/g;->l()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p0, v0, v1}, Lax/i5/g;->K(J)V

    .line 28
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
.end method

.method static b(Ljava/lang/String;Lax/i5/k;)Lax/i5/i;
    .registers 3

    .line 1
    new-instance v0, Lax/i5/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/i5/i;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lax/i5/i;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lax/i5/g;->b()Lax/i5/g;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iput-object p0, v0, Lax/i5/i;->a:Lax/i5/g;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lax/i5/g;->L(Lax/i5/k;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

.method static k(Lax/i5/g;Ljava/util/List;)Lax/i5/i;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i5/g;",
            "Ljava/util/List<",
            "Lax/i5/g;",
            ">;)",
            "Lax/i5/i;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/lit8 v1, v1, 0xd

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_2f

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_17
    if-ltz v1, :cond_25

    .line 25
    .line 26
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lax/i5/g;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lax/i5/g;->g(Ljava/lang/StringBuilder;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    goto :goto_17

    .line 38
    :cond_25
    new-instance p1, Lax/i5/i;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p1, p0, v0}, Lax/i5/i;-><init>(Lax/i5/g;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2f
    new-instance p1, Lax/i5/i;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-direct {p1, p0, v0}, Lax/i5/i;-><init>(Lax/i5/g;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object p1
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


# virtual methods
.method c()Lax/i5/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    return-object v0
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

.method d()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_14

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    div-int/lit8 v1, v0, 0xd

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    rem-int/lit8 v0, v0, 0xd

    .line 14
    .line 15
    if-eqz v0, :cond_13

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_13
    return v2

    .line 21
    :cond_14
    const/4 v0, 0x1

    .line 22
    return v0
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

.method e()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/g;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method f()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method g()Ljava/lang/String;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_b

    .line 8
    .line 9
    iget-object v0, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/i5/g;->m()Lax/i5/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lax/i5/k;->b()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "."

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    array-length v3, v2

    .line 29
    const/4 v4, 0x2

    .line 30
    if-ne v3, v4, :cond_24

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    aget-object v0, v2, v0

    .line 34
    .line 35
    move-object v2, v0

    .line 36
    goto :goto_26

    .line 37
    :cond_24
    const-string v2, ""

    .line 38
    .line 39
    :goto_26
    iget-object v3, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 40
    .line 41
    invoke-virtual {v3}, Lax/i5/g;->z()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_32

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_32
    iget-object v3, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 52
    .line 53
    invoke-virtual {v3}, Lax/i5/g;->y()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3e

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_3e
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_56

    .line 68
    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_56
    return-object v0
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

.method h()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/g;->m()Lax/i5/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/i5/k;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
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

.method i()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/g;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method j()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/g;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

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

.method l(Ljava/nio/ByteBuffer;)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_37

    .line 8
    .line 9
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/i5/g;->m()Lax/i5/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/i5/k;->a()B

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Lax/i5/i;->d()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/lit8 v2, v1, -0x2

    .line 24
    .line 25
    iget-object v3, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 26
    .line 27
    mul-int/lit8 v4, v2, 0xd

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    sub-int/2addr v1, v5

    .line 31
    invoke-static {v3, v4, v0, v1, v5}, Lax/i5/g;->a(Ljava/lang/String;IBIZ)Lax/i5/g;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, p1}, Lax/i5/g;->E(Ljava/nio/ByteBuffer;)V

    .line 36
    .line 37
    .line 38
    :goto_25
    add-int/lit8 v1, v2, -0x1

    .line 39
    .line 40
    if-lez v2, :cond_37

    .line 41
    .line 42
    iget-object v3, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 43
    .line 44
    mul-int/lit8 v4, v1, 0xd

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-static {v3, v4, v0, v2, v5}, Lax/i5/g;->a(Ljava/lang/String;IBIZ)Lax/i5/g;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2, p1}, Lax/i5/g;->E(Ljava/nio/ByteBuffer;)V

    .line 52
    .line 53
    .line 54
    move v2, v1

    .line 55
    goto :goto_25

    .line 56
    :cond_37
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lax/i5/g;->E(Ljava/nio/ByteBuffer;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method m()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/g;->G()V

    .line 4
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

.method n(J)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/i5/g;->H(J)V

    .line 4
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

.method o()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lax/i5/g;->J(J)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method p()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lax/i5/g;->K(J)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method q(Ljava/lang/String;Lax/i5/k;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/i5/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lax/i5/g;->L(Lax/i5/k;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method r(J)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i5/i;->a:Lax/i5/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/i5/g;->M(J)V

    .line 4
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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[FatLfnDirectoryEntry getName()="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lax/i5/i;->g()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "]"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
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
