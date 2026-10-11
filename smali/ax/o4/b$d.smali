.class Lax/o4/b$d;
.super Lax/o4/k$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o4/b$d$a;
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .registers 4

    .line 1
    const-string v0, "(?s)/\\*.*?\\*/"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method static synthetic B(Lax/o4/b$d;)Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/o4/b$d;->L()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private C(I)I
    .registers 4

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-lt p1, v0, :cond_a

    .line 4
    .line 5
    const/16 v1, 0x39

    .line 6
    .line 7
    if-gt p1, v1, :cond_a

    .line 8
    .line 9
    sub-int/2addr p1, v0

    .line 10
    return p1

    .line 11
    :cond_a
    const/16 v0, 0x41

    .line 12
    .line 13
    if-lt p1, v0, :cond_15

    .line 14
    .line 15
    const/16 v0, 0x46

    .line 16
    .line 17
    if-gt p1, v0, :cond_15

    .line 18
    .line 19
    add-int/lit8 p1, p1, -0x37

    .line 20
    .line 21
    return p1

    .line 22
    :cond_15
    const/16 v0, 0x61

    .line 23
    .line 24
    if-lt p1, v0, :cond_20

    .line 25
    .line 26
    const/16 v0, 0x66

    .line 27
    .line 28
    if-gt p1, v0, :cond_20

    .line 29
    .line 30
    add-int/lit8 p1, p1, -0x57

    .line 31
    .line 32
    return p1

    .line 33
    :cond_20
    const/4 p1, -0x1

    .line 34
    return p1
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

.method private D()Lax/o4/b$d$a;
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 10
    .line 11
    const/16 v2, 0x28

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_13

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_13
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 21
    .line 22
    .line 23
    const-string v2, "odd"

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x2

    .line 30
    const/4 v4, 0x1

    .line 31
    if-eqz v2, :cond_27

    .line 32
    .line 33
    new-instance v2, Lax/o4/b$d$a;

    .line 34
    .line 35
    invoke-direct {v2, v3, v4}, Lax/o4/b$d$a;-><init>(II)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_c9

    .line 39
    .line 40
    :cond_27
    const-string v2, "even"

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz v2, :cond_37

    .line 48
    .line 49
    new-instance v2, Lax/o4/b$d$a;

    .line 50
    .line 51
    invoke-direct {v2, v3, v5}, Lax/o4/b$d$a;-><init>(II)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_c9

    .line 55
    .line 56
    :cond_37
    const/16 v2, 0x2b

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v6, -0x1

    .line 63
    const/16 v7, 0x2d

    .line 64
    .line 65
    if-eqz v3, :cond_43

    .line 66
    .line 67
    goto :goto_4b

    .line 68
    :cond_43
    invoke-virtual {p0, v7}, Lax/o4/k$i;->f(C)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4b

    .line 73
    .line 74
    const/4 v3, -0x1

    .line 75
    goto :goto_4c

    .line 76
    :cond_4b
    :goto_4b
    const/4 v3, 0x1

    .line 77
    :goto_4c
    iget-object v8, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget v9, p0, Lax/o4/k$i;->b:I

    .line 80
    .line 81
    iget v10, p0, Lax/o4/k$i;->c:I

    .line 82
    .line 83
    invoke-static {v8, v9, v10, v5}, Lax/o4/c;->c(Ljava/lang/String;IIZ)Lax/o4/c;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    if-eqz v8, :cond_5e

    .line 88
    .line 89
    invoke-virtual {v8}, Lax/o4/c;->a()I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    iput v9, p0, Lax/o4/k$i;->b:I

    .line 94
    .line 95
    :cond_5e
    const/16 v9, 0x6e

    .line 96
    .line 97
    invoke-virtual {p0, v9}, Lax/o4/k$i;->f(C)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_72

    .line 102
    .line 103
    const/16 v9, 0x4e

    .line 104
    .line 105
    invoke-virtual {p0, v9}, Lax/o4/k$i;->f(C)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_6f

    .line 110
    .line 111
    goto :goto_72

    .line 112
    :cond_6f
    move-object v2, v8

    .line 113
    move-object v8, v1

    .line 114
    goto :goto_b0

    .line 115
    :cond_72
    :goto_72
    if-eqz v8, :cond_75

    .line 116
    .line 117
    goto :goto_7e

    .line 118
    :cond_75
    new-instance v8, Lax/o4/c;

    .line 119
    .line 120
    const-wide/16 v9, 0x1

    .line 121
    .line 122
    iget v11, p0, Lax/o4/k$i;->b:I

    .line 123
    .line 124
    invoke-direct {v8, v9, v10, v11}, Lax/o4/c;-><init>(JI)V

    .line 125
    .line 126
    .line 127
    :goto_7e
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_8e

    .line 135
    .line 136
    invoke-virtual {p0, v7}, Lax/o4/k$i;->f(C)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_8e

    .line 141
    .line 142
    const/4 v4, -0x1

    .line 143
    :cond_8e
    if-eqz v2, :cond_ac

    .line 144
    .line 145
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 146
    .line 147
    .line 148
    iget-object v2, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 149
    .line 150
    iget v6, p0, Lax/o4/k$i;->b:I

    .line 151
    .line 152
    iget v7, p0, Lax/o4/k$i;->c:I

    .line 153
    .line 154
    invoke-static {v2, v6, v7, v5}, Lax/o4/c;->c(Ljava/lang/String;IIZ)Lax/o4/c;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_a9

    .line 159
    .line 160
    invoke-virtual {v2}, Lax/o4/c;->a()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    iput v6, p0, Lax/o4/k$i;->b:I

    .line 165
    .line 166
    move v12, v4

    .line 167
    move v4, v3

    .line 168
    move v3, v12

    .line 169
    goto :goto_b0

    .line 170
    :cond_a9
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 171
    .line 172
    return-object v1

    .line 173
    :cond_ac
    move v2, v4

    .line 174
    move v4, v3

    .line 175
    move v3, v2

    .line 176
    move-object v2, v1

    .line 177
    :goto_b0
    new-instance v6, Lax/o4/b$d$a;

    .line 178
    .line 179
    if-nez v8, :cond_b6

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    goto :goto_bc

    .line 183
    :cond_b6
    invoke-virtual {v8}, Lax/o4/c;->d()I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    mul-int v4, v4, v7

    .line 188
    .line 189
    :goto_bc
    if-nez v2, :cond_bf

    .line 190
    .line 191
    goto :goto_c5

    .line 192
    :cond_bf
    invoke-virtual {v2}, Lax/o4/c;->d()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    mul-int v5, v3, v2

    .line 197
    .line 198
    :goto_c5
    invoke-direct {v6, v4, v5}, Lax/o4/b$d$a;-><init>(II)V

    .line 199
    .line 200
    .line 201
    move-object v2, v6

    .line 202
    :goto_c9
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 203
    .line 204
    .line 205
    const/16 v3, 0x29

    .line 206
    .line 207
    invoke-virtual {p0, v3}, Lax/o4/k$i;->f(C)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_d5

    .line 212
    .line 213
    return-object v2

    .line 214
    :cond_d5
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 215
    .line 216
    return-object v1
    .line 217
    .line 218
    .line 219
.end method

.method private E()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Lax/o4/k$i;->q()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
    .line 21
.end method

.method private G()Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 10
    .line 11
    const/16 v2, 0x28

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_13

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_13
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 21
    .line 22
    .line 23
    move-object v2, v1

    .line 24
    :cond_17
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v3, :cond_20

    .line 29
    .line 30
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_20
    if-nez v2, :cond_27

    .line 34
    .line 35
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lax/o4/k$i;->z()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_17

    .line 51
    .line 52
    const/16 v3, 0x29

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Lax/o4/k$i;->f(C)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3c

    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_3c
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 62
    .line 63
    return-object v1
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private K()Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/o4/b$s;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 10
    .line 11
    const/16 v2, 0x28

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_13

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_13
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lax/o4/b$d;->L()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_1f

    .line 28
    .line 29
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1f
    const/16 v3, 0x29

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lax/o4/k$i;->f(C)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2a

    .line 39
    .line 40
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2a
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2e
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_69

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lax/o4/b$s;

    .line 58
    .line 59
    iget-object v3, v3, Lax/o4/b$s;->a:Ljava/util/List;

    .line 60
    .line 61
    if-nez v3, :cond_3f

    .line 62
    .line 63
    goto :goto_69

    .line 64
    :cond_3f
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_43
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_2e

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lax/o4/b$t;

    .line 79
    .line 80
    iget-object v4, v4, Lax/o4/b$t;->d:Ljava/util/List;

    .line 81
    .line 82
    if-nez v4, :cond_54

    .line 83
    .line 84
    goto :goto_2e

    .line 85
    :cond_54
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :cond_58
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_43

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Lax/o4/b$g;

    .line 100
    .line 101
    instance-of v5, v5, Lax/o4/b$k;

    .line 102
    .line 103
    if-eqz v5, :cond_58

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_69
    :goto_69
    return-object v2
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

.method private L()Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/o4/b$s;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lax/o4/b$s;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Lax/o4/b$s;-><init>(Lax/o4/b$a;)V

    .line 18
    .line 19
    .line 20
    :goto_13
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_2f

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lax/o4/b$d;->M(Lax/o4/b$s;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2f

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/o4/k$i;->z()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_26

    .line 37
    .line 38
    goto :goto_13

    .line 39
    :cond_26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance v2, Lax/o4/b$s;

    .line 43
    .line 44
    invoke-direct {v2, v1}, Lax/o4/b$s;-><init>(Lax/o4/b$a;)V

    .line 45
    .line 46
    .line 47
    goto :goto_13

    .line 48
    :cond_2f
    invoke-virtual {v2}, Lax/o4/b$s;->f()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_38

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_38
    return-object v0
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

.method private O(Lax/o4/b$s;Lax/o4/b$t;)V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_126

    .line 6
    .line 7
    invoke-static {v0}, Lax/o4/b$j;->d(Ljava/lang/String;)Lax/o4/b$j;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lax/o4/b$a;->b:[I

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    aget v2, v2, v3

    .line 18
    .line 19
    const-string v3, "Invalid or missing parameter section for pseudo class: "

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    packed-switch v2, :pswitch_data_12e

    .line 25
    .line 26
    .line 27
    new-instance p1, Lax/o4/a;

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "Unsupported pseudo class: "

    .line 35
    .line 36
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :pswitch_31
    new-instance v1, Lax/o4/b$l;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lax/o4/b$l;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_122

    .line 59
    .line 60
    :pswitch_3b
    invoke-direct {p0}, Lax/o4/b$d;->G()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    new-instance v1, Lax/o4/b$l;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lax/o4/b$l;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_122

    .line 72
    .line 73
    :pswitch_48
    new-instance v1, Lax/o4/b$o;

    .line 74
    .line 75
    invoke-direct {v1, v6}, Lax/o4/b$o;-><init>(Lax/o4/b$a;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_122

    .line 82
    .line 83
    :pswitch_52
    invoke-direct {p0}, Lax/o4/b$d;->K()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-eqz v1, :cond_66

    .line 88
    .line 89
    new-instance v0, Lax/o4/b$k;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Lax/o4/b$k;-><init>(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lax/o4/b$k;->b()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iput v1, p1, Lax/o4/b$s;->b:I

    .line 99
    .line 100
    :goto_63
    move-object v1, v0

    .line 101
    goto/16 :goto_122

    .line 102
    .line 103
    :cond_66
    new-instance p1, Lax/o4/a;

    .line 104
    .line 105
    new-instance p2, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :pswitch_7b
    sget-object v2, Lax/o4/b$j;->d0:Lax/o4/b$j;

    .line 125
    .line 126
    if-eq v1, v2, :cond_86

    .line 127
    .line 128
    sget-object v2, Lax/o4/b$j;->f0:Lax/o4/b$j;

    .line 129
    .line 130
    if-ne v1, v2, :cond_84

    .line 131
    .line 132
    goto :goto_86

    .line 133
    :cond_84
    const/4 v9, 0x0

    .line 134
    goto :goto_87

    .line 135
    :cond_86
    :goto_86
    const/4 v9, 0x1

    .line 136
    :goto_87
    sget-object v2, Lax/o4/b$j;->f0:Lax/o4/b$j;

    .line 137
    .line 138
    if-eq v1, v2, :cond_92

    .line 139
    .line 140
    sget-object v2, Lax/o4/b$j;->g0:Lax/o4/b$j;

    .line 141
    .line 142
    if-ne v1, v2, :cond_90

    .line 143
    .line 144
    goto :goto_92

    .line 145
    :cond_90
    const/4 v10, 0x0

    .line 146
    goto :goto_93

    .line 147
    :cond_92
    :goto_92
    const/4 v10, 0x1

    .line 148
    :goto_93
    invoke-direct {p0}, Lax/o4/b$d;->D()Lax/o4/b$d$a;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_aa

    .line 153
    .line 154
    new-instance v6, Lax/o4/b$h;

    .line 155
    .line 156
    iget v7, v1, Lax/o4/b$d$a;->a:I

    .line 157
    .line 158
    iget v8, v1, Lax/o4/b$d$a;->b:I

    .line 159
    .line 160
    iget-object v11, p2, Lax/o4/b$t;->b:Ljava/lang/String;

    .line 161
    .line 162
    invoke-direct/range {v6 .. v11}, Lax/o4/b$h;-><init>(IIZZLjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 166
    .line 167
    .line 168
    :goto_a7
    move-object v1, v6

    .line 169
    goto/16 :goto_122

    .line 170
    .line 171
    :cond_aa
    new-instance p1, Lax/o4/a;

    .line 172
    .line 173
    new-instance p2, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :pswitch_bf
    new-instance v1, Lax/o4/b$i;

    .line 193
    .line 194
    invoke-direct {v1, v6}, Lax/o4/b$i;-><init>(Lax/o4/b$a;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 198
    .line 199
    .line 200
    goto :goto_122

    .line 201
    :pswitch_c8
    new-instance v1, Lax/o4/b$n;

    .line 202
    .line 203
    invoke-direct {v1, v6}, Lax/o4/b$n;-><init>(Lax/o4/b$a;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 207
    .line 208
    .line 209
    goto :goto_122

    .line 210
    :pswitch_d1
    new-instance v1, Lax/o4/b$m;

    .line 211
    .line 212
    iget-object v0, p2, Lax/o4/b$t;->b:Ljava/lang/String;

    .line 213
    .line 214
    invoke-direct {v1, v4, v0}, Lax/o4/b$m;-><init>(ZLjava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 218
    .line 219
    .line 220
    goto :goto_122

    .line 221
    :pswitch_dc
    new-instance v5, Lax/o4/b$h;

    .line 222
    .line 223
    const/4 v9, 0x1

    .line 224
    iget-object v10, p2, Lax/o4/b$t;->b:Ljava/lang/String;

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v7, 0x1

    .line 228
    const/4 v8, 0x0

    .line 229
    invoke-direct/range {v5 .. v10}, Lax/o4/b$h;-><init>(IIZZLjava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 233
    .line 234
    .line 235
    move-object v1, v5

    .line 236
    goto :goto_122

    .line 237
    :pswitch_ec
    new-instance v6, Lax/o4/b$h;

    .line 238
    .line 239
    const/4 v10, 0x1

    .line 240
    iget-object v11, p2, Lax/o4/b$t;->b:Ljava/lang/String;

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    const/4 v8, 0x1

    .line 244
    const/4 v9, 0x1

    .line 245
    invoke-direct/range {v6 .. v11}, Lax/o4/b$h;-><init>(IIZZLjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 249
    .line 250
    .line 251
    goto :goto_a7

    .line 252
    :pswitch_fb
    new-instance v1, Lax/o4/b$m;

    .line 253
    .line 254
    invoke-direct {v1, v5, v6}, Lax/o4/b$m;-><init>(ZLjava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 258
    .line 259
    .line 260
    goto :goto_122

    .line 261
    :pswitch_104
    new-instance v7, Lax/o4/b$h;

    .line 262
    .line 263
    const/4 v11, 0x0

    .line 264
    const/4 v12, 0x0

    .line 265
    const/4 v8, 0x0

    .line 266
    const/4 v9, 0x1

    .line 267
    const/4 v10, 0x0

    .line 268
    invoke-direct/range {v7 .. v12}, Lax/o4/b$h;-><init>(IIZZLjava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 272
    .line 273
    .line 274
    move-object v1, v7

    .line 275
    goto :goto_122

    .line 276
    :pswitch_113
    new-instance v0, Lax/o4/b$h;

    .line 277
    .line 278
    const/4 v4, 0x0

    .line 279
    const/4 v5, 0x0

    .line 280
    const/4 v1, 0x0

    .line 281
    const/4 v2, 0x1

    .line 282
    const/4 v3, 0x1

    .line 283
    invoke-direct/range {v0 .. v5}, Lax/o4/b$h;-><init>(IIZZLjava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_63

    .line 290
    .line 291
    :goto_122
    invoke-virtual {p2, v1}, Lax/o4/b$t;->b(Lax/o4/b$g;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_126
    new-instance p1, Lax/o4/a;

    .line 296
    .line 297
    const-string p2, "Invalid pseudo class"

    .line 298
    .line 299
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw p1

    .line 303
    :pswitch_data_12e
    .packed-switch 0x1
        :pswitch_113
        :pswitch_104
        :pswitch_fb
        :pswitch_ec
        :pswitch_dc
        :pswitch_d1
        :pswitch_c8
        :pswitch_bf
        :pswitch_7b
        :pswitch_7b
        :pswitch_7b
        :pswitch_7b
        :pswitch_52
        :pswitch_48
        :pswitch_3b
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
    .end packed-switch
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private P()I
    .registers 10

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_9
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 11
    .line 12
    iget-object v1, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x2d

    .line 19
    .line 20
    if-ne v1, v2, :cond_19

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/o4/k$i;->a()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :cond_19
    const/16 v3, 0x5f

    .line 27
    .line 28
    const/16 v4, 0x7a

    .line 29
    .line 30
    const/16 v5, 0x61

    .line 31
    .line 32
    const/16 v6, 0x5a

    .line 33
    .line 34
    const/16 v7, 0x41

    .line 35
    .line 36
    if-lt v1, v7, :cond_27

    .line 37
    .line 38
    if-le v1, v6, :cond_2d

    .line 39
    .line 40
    :cond_27
    if-lt v1, v5, :cond_2b

    .line 41
    .line 42
    if-le v1, v4, :cond_2d

    .line 43
    .line 44
    :cond_2b
    if-ne v1, v3, :cond_4e

    .line 45
    .line 46
    :cond_2d
    invoke-virtual {p0}, Lax/o4/k$i;->a()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_31
    if-lt v1, v7, :cond_35

    .line 51
    .line 52
    if-le v1, v6, :cond_49

    .line 53
    .line 54
    :cond_35
    if-lt v1, v5, :cond_39

    .line 55
    .line 56
    if-le v1, v4, :cond_49

    .line 57
    .line 58
    :cond_39
    const/16 v8, 0x30

    .line 59
    .line 60
    if-lt v1, v8, :cond_41

    .line 61
    .line 62
    const/16 v8, 0x39

    .line 63
    .line 64
    if-le v1, v8, :cond_49

    .line 65
    .line 66
    :cond_41
    if-eq v1, v2, :cond_49

    .line 67
    .line 68
    if-ne v1, v3, :cond_46

    .line 69
    .line 70
    goto :goto_49

    .line 71
    :cond_46
    iget v1, p0, Lax/o4/k$i;->b:I

    .line 72
    .line 73
    goto :goto_4f

    .line 74
    :cond_49
    :goto_49
    invoke-virtual {p0}, Lax/o4/k$i;->a()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    goto :goto_31

    .line 79
    :cond_4e
    move v1, v0

    .line 80
    :goto_4f
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 81
    .line 82
    return v1
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


# virtual methods
.method F()Ljava/lang/String;
    .registers 9

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget-object v0, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v2, 0x27

    .line 18
    .line 19
    if-eq v0, v2, :cond_19

    .line 20
    .line 21
    const/16 v2, 0x22

    .line 22
    .line 23
    if-eq v0, v2, :cond_19

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    add-int/2addr v2, v3

    .line 35
    iput v2, p0, Lax/o4/k$i;->b:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :goto_2c
    const/4 v4, -0x1

    .line 46
    if-eq v2, v4, :cond_87

    .line 47
    .line 48
    if-eq v2, v0, :cond_87

    .line 49
    .line 50
    const/16 v5, 0x5c

    .line 51
    .line 52
    if-ne v2, v5, :cond_7a

    .line 53
    .line 54
    invoke-virtual {p0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-ne v2, v4, :cond_40

    .line 63
    .line 64
    goto :goto_2c

    .line 65
    :cond_40
    const/16 v5, 0xa

    .line 66
    .line 67
    if-eq v2, v5, :cond_71

    .line 68
    .line 69
    const/16 v5, 0xd

    .line 70
    .line 71
    if-eq v2, v5, :cond_71

    .line 72
    .line 73
    const/16 v5, 0xc

    .line 74
    .line 75
    if-ne v2, v5, :cond_4d

    .line 76
    .line 77
    goto :goto_71

    .line 78
    :cond_4d
    invoke-direct {p0, v2}, Lax/o4/b$d;->C(I)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eq v5, v4, :cond_7a

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    :goto_54
    const/4 v7, 0x5

    .line 86
    if-gt v6, v7, :cond_6c

    .line 87
    .line 88
    invoke-virtual {p0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-direct {p0, v2}, Lax/o4/b$d;->C(I)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-ne v7, v4, :cond_66

    .line 101
    .line 102
    goto :goto_6c

    .line 103
    :cond_66
    mul-int/lit8 v5, v5, 0x10

    .line 104
    .line 105
    add-int/2addr v5, v7

    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_54

    .line 109
    :cond_6c
    :goto_6c
    int-to-char v4, v5

    .line 110
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    goto :goto_2c

    .line 114
    :cond_71
    :goto_71
    invoke-virtual {p0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    goto :goto_2c

    .line 123
    :cond_7a
    int-to-char v2, v2

    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    goto :goto_2c

    .line 136
    :cond_87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0
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

.method H()Ljava/lang/String;
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/o4/b$d;->P()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lax/o4/k$i;->b:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_a
    iget-object v2, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 18
    .line 19
    return-object v1
    .line 20
    .line 21
.end method

.method I()Ljava/lang/String;
    .registers 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_5
    :goto_5
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_92

    .line 11
    .line 12
    iget-object v1, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x27

    .line 21
    .line 22
    if-eq v1, v2, :cond_92

    .line 23
    .line 24
    const/16 v2, 0x22

    .line 25
    .line 26
    if-eq v1, v2, :cond_92

    .line 27
    .line 28
    const/16 v2, 0x28

    .line 29
    .line 30
    if-eq v1, v2, :cond_92

    .line 31
    .line 32
    const/16 v2, 0x29

    .line 33
    .line 34
    if-eq v1, v2, :cond_92

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lax/o4/k$i;->k(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_92

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_30

    .line 47
    .line 48
    goto :goto_92

    .line 49
    :cond_30
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    add-int/2addr v2, v3

    .line 53
    iput v2, p0, Lax/o4/k$i;->b:I

    .line 54
    .line 55
    const/16 v2, 0x5c

    .line 56
    .line 57
    if-ne v1, v2, :cond_8c

    .line 58
    .line 59
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_41

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_41
    iget-object v1, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 69
    .line 70
    add-int/lit8 v4, v2, 0x1

    .line 71
    .line 72
    iput v4, p0, Lax/o4/k$i;->b:I

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/16 v2, 0xa

    .line 79
    .line 80
    if-eq v1, v2, :cond_5

    .line 81
    .line 82
    const/16 v2, 0xd

    .line 83
    .line 84
    if-eq v1, v2, :cond_5

    .line 85
    .line 86
    const/16 v2, 0xc

    .line 87
    .line 88
    if-ne v1, v2, :cond_5a

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5a
    invoke-direct {p0, v1}, Lax/o4/b$d;->C(I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/4 v4, -0x1

    .line 96
    if-eq v2, v4, :cond_8c

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    :goto_62
    const/4 v5, 0x5

    .line 100
    if-gt v1, v5, :cond_86

    .line 101
    .line 102
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_6c

    .line 107
    .line 108
    goto :goto_86

    .line 109
    :cond_6c
    iget-object v5, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 110
    .line 111
    iget v6, p0, Lax/o4/k$i;->b:I

    .line 112
    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-direct {p0, v5}, Lax/o4/b$d;->C(I)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-ne v5, v4, :cond_7b

    .line 122
    .line 123
    goto :goto_86

    .line 124
    :cond_7b
    iget v6, p0, Lax/o4/k$i;->b:I

    .line 125
    .line 126
    add-int/2addr v6, v3

    .line 127
    iput v6, p0, Lax/o4/k$i;->b:I

    .line 128
    .line 129
    mul-int/lit8 v2, v2, 0x10

    .line 130
    .line 131
    add-int/2addr v2, v5

    .line 132
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_62

    .line 135
    :cond_86
    :goto_86
    int-to-char v1, v2

    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    goto/16 :goto_5

    .line 140
    .line 141
    :cond_8c
    int-to-char v1, v1

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    goto/16 :goto_5

    .line 146
    .line 147
    :cond_92
    :goto_92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_9a

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    return-object v0

    .line 155
    :cond_9a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0
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

.method J()Ljava/lang/String;
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 10
    .line 11
    iget-object v2, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    move v3, v0

    .line 18
    :goto_11
    const/4 v4, -0x1

    .line 19
    if-eq v2, v4, :cond_35

    .line 20
    .line 21
    const/16 v4, 0x3b

    .line 22
    .line 23
    if-eq v2, v4, :cond_35

    .line 24
    .line 25
    const/16 v4, 0x7d

    .line 26
    .line 27
    if-eq v2, v4, :cond_35

    .line 28
    .line 29
    const/16 v4, 0x21

    .line 30
    .line 31
    if-eq v2, v4, :cond_35

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lax/o4/k$i;->j(I)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_35

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lax/o4/k$i;->k(I)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_30

    .line 44
    .line 45
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 46
    .line 47
    add-int/lit8 v3, v2, 0x1

    .line 48
    .line 49
    :cond_30
    invoke-virtual {p0}, Lax/o4/k$i;->a()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_11

    .line 54
    :cond_35
    iget v2, p0, Lax/o4/k$i;->b:I

    .line 55
    .line 56
    if-le v2, v0, :cond_40

    .line 57
    .line 58
    iget-object v1, p0, Lax/o4/k$i;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :cond_40
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 66
    .line 67
    return-object v1
    .line 68
.end method

.method M(Lax/o4/b$s;)Z
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 10
    .line 11
    invoke-virtual {p1}, Lax/o4/b$s;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_2d

    .line 17
    .line 18
    const/16 v2, 0x3e

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1f

    .line 25
    .line 26
    sget-object v2, Lax/o4/b$e;->c0:Lax/o4/b$e;

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 29
    .line 30
    .line 31
    goto :goto_2e

    .line 32
    :cond_1f
    const/16 v2, 0x2b

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lax/o4/k$i;->f(C)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2d

    .line 39
    .line 40
    sget-object v2, Lax/o4/b$e;->d0:Lax/o4/b$e;

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 43
    .line 44
    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    move-object v2, v3

    .line 47
    :goto_2e
    const/16 v4, 0x2a

    .line 48
    .line 49
    invoke-virtual {p0, v4}, Lax/o4/k$i;->f(C)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_3c

    .line 54
    .line 55
    new-instance v4, Lax/o4/b$t;

    .line 56
    .line 57
    invoke-direct {v4, v2, v3}, Lax/o4/b$t;-><init>(Lax/o4/b$e;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_4d

    .line 61
    :cond_3c
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_4c

    .line 66
    .line 67
    new-instance v5, Lax/o4/b$t;

    .line 68
    .line 69
    invoke-direct {v5, v2, v4}, Lax/o4/b$t;-><init>(Lax/o4/b$e;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lax/o4/b$s;->c()V

    .line 73
    .line 74
    .line 75
    move-object v4, v5

    .line 76
    goto :goto_4d

    .line 77
    :cond_4c
    move-object v4, v3

    .line 78
    :goto_4d
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_12c

    .line 83
    .line 84
    const/16 v5, 0x2e

    .line 85
    .line 86
    invoke-virtual {p0, v5}, Lax/o4/k$i;->f(C)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_7b

    .line 91
    .line 92
    if-nez v4, :cond_62

    .line 93
    .line 94
    new-instance v4, Lax/o4/b$t;

    .line 95
    .line 96
    invoke-direct {v4, v2, v3}, Lax/o4/b$t;-><init>(Lax/o4/b$e;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_62
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    if-eqz v5, :cond_73

    .line 104
    .line 105
    const-string v6, "class"

    .line 106
    .line 107
    sget-object v7, Lax/o4/b$c;->c0:Lax/o4/b$c;

    .line 108
    .line 109
    invoke-virtual {v4, v6, v7, v5}, Lax/o4/b$t;->a(Ljava/lang/String;Lax/o4/b$c;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 113
    .line 114
    .line 115
    goto :goto_4d

    .line 116
    :cond_73
    new-instance p1, Lax/o4/a;

    .line 117
    .line 118
    const-string v0, "Invalid \".class\" simpleSelectors"

    .line 119
    .line 120
    invoke-direct {p1, v0}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_7b
    const/16 v5, 0x23

    .line 125
    .line 126
    invoke-virtual {p0, v5}, Lax/o4/k$i;->f(C)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_a3

    .line 131
    .line 132
    if-nez v4, :cond_8a

    .line 133
    .line 134
    new-instance v4, Lax/o4/b$t;

    .line 135
    .line 136
    invoke-direct {v4, v2, v3}, Lax/o4/b$t;-><init>(Lax/o4/b$e;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_8a
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    if-eqz v5, :cond_9b

    .line 144
    .line 145
    const-string v6, "id"

    .line 146
    .line 147
    sget-object v7, Lax/o4/b$c;->c0:Lax/o4/b$c;

    .line 148
    .line 149
    invoke-virtual {v4, v6, v7, v5}, Lax/o4/b$t;->a(Ljava/lang/String;Lax/o4/b$c;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lax/o4/b$s;->d()V

    .line 153
    .line 154
    .line 155
    goto :goto_4d

    .line 156
    :cond_9b
    new-instance p1, Lax/o4/a;

    .line 157
    .line 158
    const-string v0, "Invalid \"#id\" simpleSelectors"

    .line 159
    .line 160
    invoke-direct {p1, v0}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :cond_a3
    const/16 v5, 0x5b

    .line 165
    .line 166
    invoke-virtual {p0, v5}, Lax/o4/k$i;->f(C)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_118

    .line 171
    .line 172
    if-nez v4, :cond_b2

    .line 173
    .line 174
    new-instance v4, Lax/o4/b$t;

    .line 175
    .line 176
    invoke-direct {v4, v2, v3}, Lax/o4/b$t;-><init>(Lax/o4/b$e;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_b2
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const-string v6, "Invalid attribute simpleSelectors"

    .line 187
    .line 188
    if-eqz v5, :cond_112

    .line 189
    .line 190
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 191
    .line 192
    .line 193
    const/16 v7, 0x3d

    .line 194
    .line 195
    invoke-virtual {p0, v7}, Lax/o4/k$i;->f(C)Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eqz v7, :cond_cb

    .line 200
    .line 201
    sget-object v7, Lax/o4/b$c;->c0:Lax/o4/b$c;

    .line 202
    .line 203
    goto :goto_e2

    .line 204
    :cond_cb
    const-string v7, "~="

    .line 205
    .line 206
    invoke-virtual {p0, v7}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_d6

    .line 211
    .line 212
    sget-object v7, Lax/o4/b$c;->d0:Lax/o4/b$c;

    .line 213
    .line 214
    goto :goto_e2

    .line 215
    :cond_d6
    const-string v7, "|="

    .line 216
    .line 217
    invoke-virtual {p0, v7}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-eqz v7, :cond_e1

    .line 222
    .line 223
    sget-object v7, Lax/o4/b$c;->e0:Lax/o4/b$c;

    .line 224
    .line 225
    goto :goto_e2

    .line 226
    :cond_e1
    move-object v7, v3

    .line 227
    :goto_e2
    if-eqz v7, :cond_f7

    .line 228
    .line 229
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 230
    .line 231
    .line 232
    invoke-direct {p0}, Lax/o4/b$d;->E()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    if-eqz v8, :cond_f1

    .line 237
    .line 238
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 239
    .line 240
    .line 241
    goto :goto_f8

    .line 242
    :cond_f1
    new-instance p1, Lax/o4/a;

    .line 243
    .line 244
    invoke-direct {p1, v6}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_f7
    move-object v8, v3

    .line 249
    :goto_f8
    const/16 v9, 0x5d

    .line 250
    .line 251
    invoke-virtual {p0, v9}, Lax/o4/k$i;->f(C)Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_10c

    .line 256
    .line 257
    if-nez v7, :cond_104

    .line 258
    .line 259
    sget-object v7, Lax/o4/b$c;->q:Lax/o4/b$c;

    .line 260
    .line 261
    :cond_104
    invoke-virtual {v4, v5, v7, v8}, Lax/o4/b$t;->a(Ljava/lang/String;Lax/o4/b$c;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Lax/o4/b$s;->b()V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_4d

    .line 268
    .line 269
    :cond_10c
    new-instance p1, Lax/o4/a;

    .line 270
    .line 271
    invoke-direct {p1, v6}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p1

    .line 275
    :cond_112
    new-instance p1, Lax/o4/a;

    .line 276
    .line 277
    invoke-direct {p1, v6}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw p1

    .line 281
    :cond_118
    const/16 v5, 0x3a

    .line 282
    .line 283
    invoke-virtual {p0, v5}, Lax/o4/k$i;->f(C)Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-eqz v5, :cond_12c

    .line 288
    .line 289
    if-nez v4, :cond_127

    .line 290
    .line 291
    new-instance v4, Lax/o4/b$t;

    .line 292
    .line 293
    invoke-direct {v4, v2, v3}, Lax/o4/b$t;-><init>(Lax/o4/b$e;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :cond_127
    invoke-direct {p0, p1, v4}, Lax/o4/b$d;->O(Lax/o4/b$s;Lax/o4/b$t;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_4d

    .line 300
    .line 301
    :cond_12c
    if-eqz v4, :cond_133

    .line 302
    .line 303
    invoke-virtual {p1, v4}, Lax/o4/b$s;->a(Lax/o4/b$t;)V

    .line 304
    .line 305
    .line 306
    const/4 p1, 0x1

    .line 307
    return p1

    .line 308
    :cond_133
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 309
    .line 310
    return v1
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

.method N()Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    iget v0, p0, Lax/o4/k$i;->b:I

    .line 10
    .line 11
    const-string v2, "url("

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_13

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_13
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lax/o4/b$d;->F()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_20

    .line 28
    .line 29
    invoke-virtual {p0}, Lax/o4/b$d;->I()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :cond_20
    if-nez v2, :cond_25

    .line 34
    .line 35
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_25
    invoke-virtual {p0}, Lax/o4/k$i;->A()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_3a

    .line 46
    .line 47
    const-string v3, ")"

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_37

    .line 54
    .line 55
    goto :goto_3a

    .line 56
    :cond_37
    iput v0, p0, Lax/o4/k$i;->b:I

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3a
    :goto_3a
    return-object v2
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
