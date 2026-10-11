.class public Lax/N1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/N1/o$b;
    }
.end annotation


# instance fields
.field private final a:Lax/N1/t;

.field private final b:Lax/N1/d;

.field private final c:Lax/P0/v;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/N1/o$b;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lax/S0/G;

.field private f:[B

.field private g:Lax/q1/U;

.field private h:I

.field private i:I

.field private j:[J

.field private k:J


# direct methods
.method public constructor <init>(Lax/N1/t;Lax/P0/v;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/N1/o;->a:Lax/N1/t;

    .line 5
    .line 6
    new-instance v0, Lax/N1/d;

    .line 7
    .line 8
    invoke-direct {v0}, Lax/N1/d;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/N1/o;->b:Lax/N1/d;

    .line 12
    .line 13
    sget-object v0, Lax/S0/d0;->f:[B

    .line 14
    .line 15
    iput-object v0, p0, Lax/N1/o;->f:[B

    .line 16
    .line 17
    new-instance v0, Lax/S0/G;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lax/N1/o;->e:Lax/S0/G;

    .line 23
    .line 24
    if-eqz p2, :cond_36

    .line 25
    .line 26
    invoke-virtual {p2}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "application/x-media3-cues"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object p2, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, p2}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-interface {p1}, Lax/N1/t;->d()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p2, p1}, Lax/P0/v$b;->Y(I)Lax/P0/v$b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_37

    .line 55
    :cond_36
    const/4 p1, 0x0

    .line 56
    :goto_37
    iput-object p1, p0, Lax/N1/o;->c:Lax/P0/v;

    .line 57
    .line 58
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    iput p1, p0, Lax/N1/o;->i:I

    .line 67
    .line 68
    sget-object p1, Lax/S0/d0;->g:[J

    .line 69
    .line 70
    iput-object p1, p0, Lax/N1/o;->j:[J

    .line 71
    .line 72
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    iput-wide p1, p0, Lax/N1/o;->k:J

    .line 78
    .line 79
    return-void
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

.method public static synthetic g(Lax/N1/o;Lax/N1/e;)V
    .registers 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/N1/o$b;

    .line 5
    .line 6
    iget-wide v1, p1, Lax/N1/e;->b:J

    .line 7
    .line 8
    iget-object v3, p0, Lax/N1/o;->b:Lax/N1/d;

    .line 9
    .line 10
    iget-object v4, p1, Lax/N1/e;->a:Lax/r7/z;

    .line 11
    .line 12
    iget-wide v5, p1, Lax/N1/e;->c:J

    .line 13
    .line 14
    invoke-virtual {v3, v4, v5, v6}, Lax/N1/d;->a(Ljava/util/List;J)[B

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, v1, v2, v3, v4}, Lax/N1/o$b;-><init>(J[BLax/N1/o$a;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-wide v1, p0, Lax/N1/o;->k:J

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v5, v1, v3

    .line 35
    .line 36
    if-eqz v5, :cond_2d

    .line 37
    .line 38
    iget-wide v3, p1, Lax/N1/e;->d:J

    .line 39
    .line 40
    cmp-long p1, v3, v1

    .line 41
    .line 42
    if-ltz p1, :cond_2c

    .line 43
    .line 44
    goto :goto_2d

    .line 45
    :cond_2c
    return-void

    .line 46
    :cond_2d
    :goto_2d
    invoke-direct {p0, v0}, Lax/N1/o;->m(Lax/N1/o$b;)V

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

.method private h()V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-wide v0, p0, Lax/N1/o;->k:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_13

    .line 11
    .line 12
    invoke-static {v0, v1}, Lax/N1/t$b;->c(J)Lax/N1/t$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_f
    move-object v5, v0

    .line 17
    goto :goto_18

    .line 18
    :catch_11
    move-exception v0

    .line 19
    goto :goto_57

    .line 20
    :cond_13
    invoke-static {}, Lax/N1/t$b;->b()Lax/N1/t$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_f

    .line 25
    :goto_18
    iget-object v1, p0, Lax/N1/o;->a:Lax/N1/t;

    .line 26
    .line 27
    iget-object v2, p0, Lax/N1/o;->f:[B

    .line 28
    .line 29
    iget v4, p0, Lax/N1/o;->h:I

    .line 30
    .line 31
    new-instance v6, Lax/N1/n;

    .line 32
    .line 33
    invoke-direct {v6, p0}, Lax/N1/n;-><init>(Lax/N1/o;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-interface/range {v1 .. v6}, Lax/N1/t;->c([BIILax/N1/t$b;Lax/S0/l;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    new-array v0, v0, [J

    .line 52
    .line 53
    iput-object v0, p0, Lax/N1/o;->j:[J

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_37
    iget-object v1, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v0, v1, :cond_52

    .line 63
    .line 64
    iget-object v1, p0, Lax/N1/o;->j:[J

    .line 65
    .line 66
    iget-object v2, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lax/N1/o$b;

    .line 73
    .line 74
    invoke-static {v2}, Lax/N1/o$b;->d(Lax/N1/o$b;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    aput-wide v2, v1, v0

    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_37

    .line 83
    :cond_52
    sget-object v0, Lax/S0/d0;->f:[B

    .line 84
    .line 85
    iput-object v0, p0, Lax/N1/o;->f:[B
    :try_end_56
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_56} :catch_11

    .line 86
    .line 87
    return-void

    .line 88
    :goto_57
    const-string v1, "SubtitleParser failed."

    .line 89
    .line 90
    invoke-static {v1, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    throw v0
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

.method private i(Lax/q1/s;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/N1/o;->f:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, Lax/N1/o;->h:I

    .line 5
    .line 6
    if-ne v1, v2, :cond_10

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    add-int/lit16 v1, v1, 0x400

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/N1/o;->f:[B

    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/N1/o;->f:[B

    .line 18
    .line 19
    iget v1, p0, Lax/N1/o;->h:I

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    sub-int/2addr v2, v1

    .line 23
    invoke-interface {p1, v0, v1, v2}, Lax/q1/s;->c([BII)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_22

    .line 29
    .line 30
    iget v2, p0, Lax/N1/o;->h:I

    .line 31
    .line 32
    add-int/2addr v2, v0

    .line 33
    iput v2, p0, Lax/N1/o;->h:I

    .line 34
    .line 35
    :cond_22
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    const-wide/16 v4, -0x1

    .line 40
    .line 41
    cmp-long p1, v2, v4

    .line 42
    .line 43
    if-eqz p1, :cond_33

    .line 44
    .line 45
    iget p1, p0, Lax/N1/o;->h:I

    .line 46
    .line 47
    int-to-long v4, p1

    .line 48
    cmp-long p1, v4, v2

    .line 49
    .line 50
    if-eqz p1, :cond_35

    .line 51
    .line 52
    :cond_33
    if-ne v0, v1, :cond_37

    .line 53
    .line 54
    :cond_35
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_37
    const/4 p1, 0x0

    .line 57
    return p1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private j(Lax/q1/s;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-eqz v4, :cond_13

    .line 10
    .line 11
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Lax/u7/f;->e(J)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_15

    .line 20
    :cond_13
    const/16 v0, 0x400

    .line 21
    .line 22
    :goto_15
    invoke-interface {p1, v0}, Lax/q1/s;->a(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, -0x1

    .line 27
    if-ne p1, v0, :cond_1e

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1e
    const/4 p1, 0x0

    .line 32
    return p1
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

.method private l()V
    .registers 6

    .line 1
    iget-wide v0, p0, Lax/N1/o;->k:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-nez v4, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_14

    .line 14
    :cond_d
    iget-object v2, p0, Lax/N1/o;->j:[J

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-static {v2, v0, v1, v3, v3}, Lax/S0/d0;->h([JJZZ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_14
    iget-object v1, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_2a

    .line 28
    .line 29
    iget-object v1, p0, Lax/N1/o;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lax/N1/o$b;

    .line 36
    .line 37
    invoke-direct {p0, v1}, Lax/N1/o;->m(Lax/N1/o$b;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_14

    .line 43
    :cond_2a
    return-void
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

.method private m(Lax/N1/o$b;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/N1/o;->g:Lax/q1/U;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lax/N1/o$b;->h(Lax/N1/o$b;)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v5, v0

    .line 11
    iget-object v0, p0, Lax/N1/o;->e:Lax/S0/G;

    .line 12
    .line 13
    invoke-static {p1}, Lax/N1/o$b;->h(Lax/N1/o$b;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lax/S0/G;->Y([B)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/N1/o;->g:Lax/q1/U;

    .line 21
    .line 22
    iget-object v1, p0, Lax/N1/o;->e:Lax/S0/G;

    .line 23
    .line 24
    invoke-interface {v0, v1, v5}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lax/N1/o;->g:Lax/q1/U;

    .line 28
    .line 29
    invoke-static {p1}, Lax/N1/o$b;->d(Lax/N1/o$b;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

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
.end method


# virtual methods
.method public a(Lax/q1/t;)V
    .registers 9

    .line 1
    iget v0, p0, Lax/N1/o;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    :goto_9
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-interface {p1, v1, v0}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lax/N1/o;->g:Lax/q1/U;

    .line 19
    .line 20
    iget-object v3, p0, Lax/N1/o;->c:Lax/P0/v;

    .line 21
    .line 22
    if-eqz v3, :cond_34

    .line 23
    .line 24
    invoke-interface {v0, v3}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lax/q1/t;->o()V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lax/q1/I;

    .line 31
    .line 32
    const-wide/16 v3, 0x0

    .line 33
    .line 34
    new-array v5, v2, [J

    .line 35
    .line 36
    aput-wide v3, v5, v1

    .line 37
    .line 38
    new-array v6, v2, [J

    .line 39
    .line 40
    aput-wide v3, v6, v1

    .line 41
    .line 42
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v5, v6, v3, v4}, Lax/q1/I;-><init>([J[JJ)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 51
    .line 52
    .line 53
    :cond_34
    iput v2, p0, Lax/N1/o;->i:I

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public b(JJ)V
    .registers 6

    .line 1
    iget p1, p0, Lax/N1/o;->i:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-eqz p1, :cond_a

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    if-eq p1, v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 p1, 0x0

    .line 12
    :goto_b
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p3, p0, Lax/N1/o;->k:J

    .line 16
    .line 17
    iget p1, p0, Lax/N1/o;->i:I

    .line 18
    .line 19
    const/4 p3, 0x2

    .line 20
    if-ne p1, p3, :cond_17

    .line 21
    .line 22
    iput p2, p0, Lax/N1/o;->i:I

    .line 23
    .line 24
    :cond_17
    iget p1, p0, Lax/N1/o;->i:I

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    if-ne p1, p2, :cond_1f

    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    iput p1, p0, Lax/N1/o;->i:I

    .line 31
    .line 32
    :cond_1f
    return-void
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

.method public c(Lax/q1/s;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
    .line 22
.end method

.method public d()V
    .registers 3

    .line 1
    iget v0, p0, Lax/N1/o;->i:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_6

    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    iget-object v0, p0, Lax/N1/o;->a:Lax/N1/t;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/N1/t;->a()V

    .line 10
    .line 11
    .line 12
    iput v1, p0, Lax/N1/o;->i:I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget p2, p0, Lax/N1/o;->i:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p2, :cond_b

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    if-eq p2, v2, :cond_b

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 p2, 0x0

    .line 13
    :goto_c
    invoke-static {p2}, Lax/S0/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lax/N1/o;->i:I

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-ne p2, v0, :cond_36

    .line 20
    .line 21
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide/16 v5, -0x1

    .line 26
    .line 27
    cmp-long p2, v3, v5

    .line 28
    .line 29
    if-eqz p2, :cond_27

    .line 30
    .line 31
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-static {v3, v4}, Lax/u7/f;->e(J)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    goto :goto_29

    .line 40
    :cond_27
    const/16 p2, 0x400

    .line 41
    .line 42
    :goto_29
    iget-object v0, p0, Lax/N1/o;->f:[B

    .line 43
    .line 44
    array-length v0, v0

    .line 45
    if-le p2, v0, :cond_32

    .line 46
    .line 47
    new-array p2, p2, [B

    .line 48
    .line 49
    iput-object p2, p0, Lax/N1/o;->f:[B

    .line 50
    .line 51
    :cond_32
    iput v1, p0, Lax/N1/o;->h:I

    .line 52
    .line 53
    iput v2, p0, Lax/N1/o;->i:I

    .line 54
    .line 55
    :cond_36
    iget p2, p0, Lax/N1/o;->i:I

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-ne p2, v2, :cond_46

    .line 59
    .line 60
    invoke-direct {p0, p1}, Lax/N1/o;->i(Lax/q1/s;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_46

    .line 65
    .line 66
    invoke-direct {p0}, Lax/N1/o;->h()V

    .line 67
    .line 68
    .line 69
    iput v0, p0, Lax/N1/o;->i:I

    .line 70
    .line 71
    :cond_46
    iget p2, p0, Lax/N1/o;->i:I

    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    if-ne p2, v2, :cond_56

    .line 75
    .line 76
    invoke-direct {p0, p1}, Lax/N1/o;->j(Lax/q1/s;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_56

    .line 81
    .line 82
    invoke-direct {p0}, Lax/N1/o;->l()V

    .line 83
    .line 84
    .line 85
    iput v0, p0, Lax/N1/o;->i:I

    .line 86
    .line 87
    :cond_56
    iget p1, p0, Lax/N1/o;->i:I

    .line 88
    .line 89
    if-ne p1, v0, :cond_5c

    .line 90
    .line 91
    const/4 p1, -0x1

    .line 92
    return p1

    .line 93
    :cond_5c
    return v1
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

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
