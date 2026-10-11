.class public final Lax/Q0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Q0/o;


# instance fields
.field private final b:Z

.field private c:I

.field private d:F

.field private e:F

.field private f:Lax/Q0/o$a;

.field private g:Lax/Q0/o$a;

.field private h:Lax/Q0/o$a;

.field private i:Lax/Q0/o$a;

.field private j:Z

.field private k:Lax/Q0/r;

.field private l:Ljava/nio/ByteBuffer;

.field private m:Ljava/nio/ShortBuffer;

.field private n:Ljava/nio/ByteBuffer;

.field private o:J

.field private p:J

.field private q:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lax/Q0/s;-><init>(Z)V

    return-void
.end method

.method constructor <init>(Z)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    iput v0, p0, Lax/Q0/s;->d:F

    .line 4
    iput v0, p0, Lax/Q0/s;->e:F

    .line 5
    sget-object v0, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    iput-object v0, p0, Lax/Q0/s;->f:Lax/Q0/o$a;

    .line 6
    iput-object v0, p0, Lax/Q0/s;->g:Lax/Q0/o$a;

    .line 7
    iput-object v0, p0, Lax/Q0/s;->h:Lax/Q0/o$a;

    .line 8
    iput-object v0, p0, Lax/Q0/s;->i:Lax/Q0/o$a;

    .line 9
    sget-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 10
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Lax/Q0/s;->m:Ljava/nio/ShortBuffer;

    .line 11
    iput-object v0, p0, Lax/Q0/s;->n:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lax/Q0/s;->c:I

    .line 13
    iput-boolean p1, p0, Lax/Q0/s;->b:Z

    return-void
.end method

.method private h()Z
    .registers 4

    .line 1
    iget v0, p0, Lax/Q0/s;->d:F

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v2, 0x38d1b717    # 1.0E-4f

    .line 11
    .line 12
    .line 13
    cmpg-float v0, v0, v2

    .line 14
    .line 15
    if-gez v0, :cond_27

    .line 16
    .line 17
    iget v0, p0, Lax/Q0/s;->e:F

    .line 18
    .line 19
    sub-float/2addr v0, v1

    .line 20
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    cmpg-float v0, v0, v2

    .line 25
    .line 26
    if-gez v0, :cond_27

    .line 27
    .line 28
    iget-object v0, p0, Lax/Q0/s;->g:Lax/Q0/o$a;

    .line 29
    .line 30
    iget v0, v0, Lax/Q0/o$a;->a:I

    .line 31
    .line 32
    iget-object v1, p0, Lax/Q0/s;->f:Lax/Q0/o$a;

    .line 33
    .line 34
    iget v1, v1, Lax/Q0/o$a;->a:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_27

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_27
    const/4 v0, 0x0

    .line 41
    return v0
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


# virtual methods
.method public a()V
    .registers 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iput v0, p0, Lax/Q0/s;->d:F

    .line 4
    .line 5
    iput v0, p0, Lax/Q0/s;->e:F

    .line 6
    .line 7
    sget-object v0, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 8
    .line 9
    iput-object v0, p0, Lax/Q0/s;->f:Lax/Q0/o$a;

    .line 10
    .line 11
    iput-object v0, p0, Lax/Q0/s;->g:Lax/Q0/o$a;

    .line 12
    .line 13
    iput-object v0, p0, Lax/Q0/s;->h:Lax/Q0/o$a;

    .line 14
    .line 15
    iput-object v0, p0, Lax/Q0/s;->i:Lax/Q0/o$a;

    .line 16
    .line 17
    sget-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    iput-object v0, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Lax/Q0/s;->m:Ljava/nio/ShortBuffer;

    .line 26
    .line 27
    iput-object v0, p0, Lax/Q0/s;->n:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    iput v0, p0, Lax/Q0/s;->c:I

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lax/Q0/s;->j:Z

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    iput-wide v1, p0, Lax/Q0/s;->o:J

    .line 41
    .line 42
    iput-wide v1, p0, Lax/Q0/s;->p:J

    .line 43
    .line 44
    iput-boolean v0, p0, Lax/Q0/s;->q:Z

    .line 45
    .line 46
    return-void
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

.method public b()Ljava/nio/ByteBuffer;
    .registers 7

    .line 1
    iget-object v0, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 2
    .line 3
    if-eqz v0, :cond_45

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/Q0/r;->k()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_45

    .line 10
    .line 11
    iget-object v2, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v2, v1, :cond_27

    .line 18
    .line 19
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lax/Q0/s;->m:Ljava/nio/ShortBuffer;

    .line 38
    .line 39
    goto :goto_31

    .line 40
    :cond_27
    iget-object v2, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lax/Q0/s;->m:Ljava/nio/ShortBuffer;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    .line 48
    .line 49
    .line 50
    :goto_31
    iget-object v2, p0, Lax/Q0/s;->m:Ljava/nio/ShortBuffer;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lax/Q0/r;->j(Ljava/nio/ShortBuffer;)V

    .line 53
    .line 54
    .line 55
    iget-wide v2, p0, Lax/Q0/s;->p:J

    .line 56
    .line 57
    int-to-long v4, v1

    .line 58
    add-long/2addr v2, v4

    .line 59
    iput-wide v2, p0, Lax/Q0/s;->p:J

    .line 60
    .line 61
    iget-object v0, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lax/Q0/s;->l:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    iput-object v0, p0, Lax/Q0/s;->n:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    :cond_45
    iget-object v0, p0, Lax/Q0/s;->n:Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    sget-object v1, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    iput-object v1, p0, Lax/Q0/s;->n:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    return-object v0
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

.method public c()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/Q0/s;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 6
    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/Q0/r;->k()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_10

    .line 14
    .line 15
    :cond_e
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public d(Ljava/nio/ByteBuffer;)V
    .registers 9

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 9
    .line 10
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lax/Q0/r;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-wide v3, p0, Lax/Q0/s;->o:J

    .line 25
    .line 26
    int-to-long v5, v2

    .line 27
    add-long/2addr v3, v5

    .line 28
    iput-wide v3, p0, Lax/Q0/s;->o:J

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lax/Q0/r;->t(Ljava/nio/ShortBuffer;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v2

    .line 38
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 39
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

.method public e()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q0/s;->g:Lax/Q0/o$a;

    .line 2
    .line 3
    iget v0, v0, Lax/Q0/o$a;->a:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_13

    .line 7
    .line 8
    iget-boolean v0, p0, Lax/Q0/s;->b:Z

    .line 9
    .line 10
    if-nez v0, :cond_11

    .line 11
    .line 12
    invoke-direct {p0}, Lax/Q0/s;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_13

    .line 17
    .line 18
    :cond_11
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public f()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/Q0/r;->s()V

    .line 6
    .line 7
    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/Q0/s;->q:Z

    .line 10
    .line 11
    return-void
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
    .registers 10

    .line 1
    invoke-virtual {p0}, Lax/Q0/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2b

    .line 6
    .line 7
    iget-object v0, p0, Lax/Q0/s;->f:Lax/Q0/o$a;

    .line 8
    .line 9
    iput-object v0, p0, Lax/Q0/s;->h:Lax/Q0/o$a;

    .line 10
    .line 11
    iget-object v1, p0, Lax/Q0/s;->g:Lax/Q0/o$a;

    .line 12
    .line 13
    iput-object v1, p0, Lax/Q0/s;->i:Lax/Q0/o$a;

    .line 14
    .line 15
    iget-boolean v2, p0, Lax/Q0/s;->j:Z

    .line 16
    .line 17
    if-eqz v2, :cond_24

    .line 18
    .line 19
    new-instance v3, Lax/Q0/r;

    .line 20
    .line 21
    iget v4, v0, Lax/Q0/o$a;->a:I

    .line 22
    .line 23
    iget v5, v0, Lax/Q0/o$a;->b:I

    .line 24
    .line 25
    iget v6, p0, Lax/Q0/s;->d:F

    .line 26
    .line 27
    iget v7, p0, Lax/Q0/s;->e:F

    .line 28
    .line 29
    iget v8, v1, Lax/Q0/o$a;->a:I

    .line 30
    .line 31
    invoke-direct/range {v3 .. v8}, Lax/Q0/r;-><init>(IIFFI)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 35
    .line 36
    goto :goto_2b

    .line 37
    :cond_24
    iget-object v0, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 38
    .line 39
    if-eqz v0, :cond_2b

    .line 40
    .line 41
    invoke-virtual {v0}, Lax/Q0/r;->i()V

    .line 42
    .line 43
    .line 44
    :cond_2b
    :goto_2b
    sget-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iput-object v0, p0, Lax/Q0/s;->n:Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    const-wide/16 v0, 0x0

    .line 49
    .line 50
    iput-wide v0, p0, Lax/Q0/s;->o:J

    .line 51
    .line 52
    iput-wide v0, p0, Lax/Q0/s;->p:J

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Lax/Q0/s;->q:Z

    .line 56
    .line 57
    return-void
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

.method public g(Lax/Q0/o$a;)Lax/Q0/o$a;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Q0/o$b;
        }
    .end annotation

    .line 1
    iget v0, p1, Lax/Q0/o$a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1b

    .line 5
    .line 6
    iget v0, p0, Lax/Q0/s;->c:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-ne v0, v2, :cond_c

    .line 10
    .line 11
    iget v0, p1, Lax/Q0/o$a;->a:I

    .line 12
    .line 13
    :cond_c
    iput-object p1, p0, Lax/Q0/s;->f:Lax/Q0/o$a;

    .line 14
    .line 15
    new-instance v2, Lax/Q0/o$a;

    .line 16
    .line 17
    iget p1, p1, Lax/Q0/o$a;->b:I

    .line 18
    .line 19
    invoke-direct {v2, v0, p1, v1}, Lax/Q0/o$a;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lax/Q0/s;->g:Lax/Q0/o$a;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lax/Q0/s;->j:Z

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_1b
    new-instance v0, Lax/Q0/o$b;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lax/Q0/o$b;-><init>(Lax/Q0/o$a;)V

    .line 31
    .line 32
    .line 33
    throw v0
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

.method public i(J)J
    .registers 13

    .line 1
    iget-wide v0, p0, Lax/Q0/s;->p:J

    .line 2
    .line 3
    const-wide/16 v2, 0x400

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-ltz v4, :cond_3b

    .line 8
    .line 9
    iget-wide v0, p0, Lax/Q0/s;->o:J

    .line 10
    .line 11
    iget-object v2, p0, Lax/Q0/s;->k:Lax/Q0/r;

    .line 12
    .line 13
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lax/Q0/r;

    .line 18
    .line 19
    invoke-virtual {v2}, Lax/Q0/r;->l()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-long v2, v2

    .line 24
    sub-long v6, v0, v2

    .line 25
    .line 26
    iget-object v0, p0, Lax/Q0/s;->i:Lax/Q0/o$a;

    .line 27
    .line 28
    iget v0, v0, Lax/Q0/o$a;->a:I

    .line 29
    .line 30
    iget-object v1, p0, Lax/Q0/s;->h:Lax/Q0/o$a;

    .line 31
    .line 32
    iget v1, v1, Lax/Q0/o$a;->a:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_2b

    .line 35
    .line 36
    iget-wide v8, p0, Lax/Q0/s;->p:J

    .line 37
    .line 38
    move-wide v4, p1

    .line 39
    invoke-static/range {v4 .. v9}, Lax/S0/d0;->p1(JJJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    return-wide p1

    .line 44
    :cond_2b
    move-wide v4, p1

    .line 45
    int-to-long p1, v0

    .line 46
    mul-long v2, v6, p1

    .line 47
    .line 48
    iget-wide p1, p0, Lax/Q0/s;->p:J

    .line 49
    .line 50
    int-to-long v0, v1

    .line 51
    mul-long p1, p1, v0

    .line 52
    .line 53
    move-wide v0, v4

    .line 54
    move-wide v4, p1

    .line 55
    invoke-static/range {v0 .. v5}, Lax/S0/d0;->p1(JJJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    return-wide p1

    .line 60
    :cond_3b
    move-wide v4, p1

    .line 61
    iget p1, p0, Lax/Q0/s;->d:F

    .line 62
    .line 63
    float-to-double p1, p1

    .line 64
    long-to-double v0, v4

    .line 65
    mul-double p1, p1, v0

    .line 66
    .line 67
    double-to-long p1, p1

    .line 68
    return-wide p1
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
.end method

.method public j(F)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_8

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
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lax/Q0/s;->e:F

    .line 14
    .line 15
    cmpl-float v0, v0, p1

    .line 16
    .line 17
    if-eqz v0, :cond_16

    .line 18
    .line 19
    iput p1, p0, Lax/Q0/s;->e:F

    .line 20
    .line 21
    iput-boolean v1, p0, Lax/Q0/s;->j:Z

    .line 22
    .line 23
    :cond_16
    return-void
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
.end method

.method public k(F)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_8

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
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lax/Q0/s;->d:F

    .line 14
    .line 15
    cmpl-float v0, v0, p1

    .line 16
    .line 17
    if-eqz v0, :cond_16

    .line 18
    .line 19
    iput p1, p0, Lax/Q0/s;->d:F

    .line 20
    .line 21
    iput-boolean v1, p0, Lax/Q0/s;->j:Z

    .line 22
    .line 23
    :cond_16
    return-void
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
.end method
