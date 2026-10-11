.class final Lax/W1/e$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/CharSequence;

.field public d:I

.field public e:F

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:F

.field public k:I


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lax/W1/e$e;->a:J

    .line 7
    .line 8
    iput-wide v0, p0, Lax/W1/e$e;->b:J

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    iput v0, p0, Lax/W1/e$e;->d:I

    .line 12
    .line 13
    const v0, -0x800001

    .line 14
    .line 15
    .line 16
    iput v0, p0, Lax/W1/e$e;->e:F

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput v1, p0, Lax/W1/e$e;->f:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput v1, p0, Lax/W1/e$e;->g:I

    .line 23
    .line 24
    iput v0, p0, Lax/W1/e$e;->h:F

    .line 25
    .line 26
    const/high16 v0, -0x80000000

    .line 27
    .line 28
    iput v0, p0, Lax/W1/e$e;->i:I

    .line 29
    .line 30
    const/high16 v1, 0x3f800000    # 1.0f

    .line 31
    .line 32
    iput v1, p0, Lax/W1/e$e;->j:F

    .line 33
    .line 34
    iput v0, p0, Lax/W1/e$e;->k:I

    .line 35
    .line 36
    return-void
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

.method private static b(FI)F
    .registers 6

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const v1, -0x800001

    .line 4
    .line 5
    .line 6
    cmpl-float v2, p0, v1

    .line 7
    .line 8
    if-eqz v2, :cond_15

    .line 9
    .line 10
    if-nez p1, :cond_15

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    cmpg-float v3, p0, v3

    .line 14
    .line 15
    if-ltz v3, :cond_14

    .line 16
    .line 17
    cmpl-float v3, p0, v0

    .line 18
    .line 19
    if-lez v3, :cond_15

    .line 20
    .line 21
    :cond_14
    return v0

    .line 22
    :cond_15
    if-eqz v2, :cond_18

    .line 23
    .line 24
    return p0

    .line 25
    :cond_18
    if-nez p1, :cond_1b

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1b
    return v1
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

.method private static c(I)Landroid/text/Layout$Alignment;
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_2d

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_2a

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_27

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_2d

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-eq p0, v0, :cond_27

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "Unknown textAlignment: "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "WebvttCueParser"

    .line 34
    .line 35
    invoke-static {v0, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_27
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2a
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2d
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 47
    .line 48
    return-object p0
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

.method private static d(IF)F
    .registers 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    if-eqz p0, :cond_24

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p0, v1, :cond_15

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-ne p0, v0, :cond_b

    .line 10
    .line 11
    return p1

    .line 12
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_15
    const/high16 p0, 0x3f000000    # 0.5f

    .line 23
    .line 24
    const/high16 v1, 0x40000000    # 2.0f

    .line 25
    .line 26
    cmpg-float p0, p1, p0

    .line 27
    .line 28
    if-gtz p0, :cond_20

    .line 29
    .line 30
    mul-float p1, p1, v1

    .line 31
    .line 32
    return p1

    .line 33
    :cond_20
    sub-float/2addr v0, p1

    .line 34
    mul-float v0, v0, v1

    .line 35
    .line 36
    return v0

    .line 37
    :cond_24
    sub-float/2addr v0, p1

    .line 38
    return v0
    .line 39
    .line 40
    .line 41
.end method

.method private static e(I)F
    .registers 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p0, v0, :cond_c

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-eq p0, v0, :cond_9

    .line 6
    .line 7
    const/high16 p0, 0x3f000000    # 0.5f

    .line 8
    .line 9
    return p0

    .line 10
    :cond_9
    const/high16 p0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    return p0

    .line 13
    :cond_c
    const/4 p0, 0x0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static f(I)I
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_f

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-eq p0, v1, :cond_d

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    if-eq p0, v1, :cond_f

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    if-eq p0, v1, :cond_d

    .line 12
    .line 13
    return v0

    .line 14
    :cond_d
    const/4 p0, 0x2

    .line 15
    return p0

    .line 16
    :cond_f
    const/4 p0, 0x0

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a()Lax/W1/d;
    .registers 7

    .line 1
    new-instance v0, Lax/W1/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/W1/e$e;->g()Lax/R0/a$b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/R0/a$b;->a()Lax/R0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-wide v2, p0, Lax/W1/e$e;->a:J

    .line 12
    .line 13
    iget-wide v4, p0, Lax/W1/e$e;->b:J

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lax/W1/d;-><init>(Lax/R0/a;JJ)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public g()Lax/R0/a$b;
    .registers 6

    .line 1
    iget v0, p0, Lax/W1/e$e;->h:F

    .line 2
    .line 3
    const v1, -0x800001

    .line 4
    .line 5
    .line 6
    cmpl-float v1, v0, v1

    .line 7
    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    goto :goto_10

    .line 11
    :cond_a
    iget v0, p0, Lax/W1/e$e;->d:I

    .line 12
    .line 13
    invoke-static {v0}, Lax/W1/e$e;->e(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_10
    iget v1, p0, Lax/W1/e$e;->i:I

    .line 18
    .line 19
    const/high16 v2, -0x80000000

    .line 20
    .line 21
    if-eq v1, v2, :cond_17

    .line 22
    .line 23
    goto :goto_1d

    .line 24
    :cond_17
    iget v1, p0, Lax/W1/e$e;->d:I

    .line 25
    .line 26
    invoke-static {v1}, Lax/W1/e$e;->f(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_1d
    new-instance v2, Lax/R0/a$b;

    .line 31
    .line 32
    invoke-direct {v2}, Lax/R0/a$b;-><init>()V

    .line 33
    .line 34
    .line 35
    iget v3, p0, Lax/W1/e$e;->d:I

    .line 36
    .line 37
    invoke-static {v3}, Lax/W1/e$e;->c(I)Landroid/text/Layout$Alignment;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Lax/R0/a$b;->p(Landroid/text/Layout$Alignment;)Lax/R0/a$b;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v3, p0, Lax/W1/e$e;->e:F

    .line 46
    .line 47
    iget v4, p0, Lax/W1/e$e;->f:I

    .line 48
    .line 49
    invoke-static {v3, v4}, Lax/W1/e$e;->b(FI)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget v4, p0, Lax/W1/e$e;->f:I

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Lax/R0/a$b;->h(FI)Lax/R0/a$b;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget v3, p0, Lax/W1/e$e;->g:I

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2, v0}, Lax/R0/a$b;->k(F)Lax/R0/a$b;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v1}, Lax/R0/a$b;->l(I)Lax/R0/a$b;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget v3, p0, Lax/W1/e$e;->j:F

    .line 74
    .line 75
    invoke-static {v1, v0}, Lax/W1/e$e;->d(IF)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {v2, v0}, Lax/R0/a$b;->n(F)Lax/R0/a$b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget v1, p0, Lax/W1/e$e;->k:I

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lax/R0/a$b;->r(I)Lax/R0/a$b;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p0, Lax/W1/e$e;->c:Ljava/lang/CharSequence;

    .line 94
    .line 95
    if-eqz v1, :cond_63

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lax/R0/a$b;->o(Ljava/lang/CharSequence;)Lax/R0/a$b;

    .line 98
    .line 99
    .line 100
    :cond_63
    return-object v0
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
