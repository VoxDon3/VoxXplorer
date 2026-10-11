.class final Lax/i2/N;
.super Lax/i2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i2/N$c;,
        Lax/i2/N$b;
    }
.end annotation


# instance fields
.field private final a:F

.field private final b:Lax/i2/N$c;

.field private final c:Ljava/lang/Runnable;

.field private d:Landroid/graphics/Point;

.field private e:Landroid/graphics/Point;

.field private f:Z


# direct methods
.method constructor <init>(Lax/i2/N$c;)V
    .registers 3

    const/high16 v0, 0x3e000000    # 0.125f

    .line 1
    invoke-direct {p0, p1, v0}, Lax/i2/N;-><init>(Lax/i2/N$c;F)V

    return-void
.end method

.method constructor <init>(Lax/i2/N$c;F)V
    .registers 4

    .line 2
    invoke-direct {p0}, Lax/i2/a;-><init>()V

    if-eqz p1, :cond_7

    const/4 v0, 0x1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    .line 3
    :goto_8
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 4
    iput-object p1, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 5
    iput p2, p0, Lax/i2/N;->a:F

    .line 6
    new-instance p1, Lax/i2/N$a;

    invoke-direct {p1, p0}, Lax/i2/N$a;-><init>(Lax/i2/N;)V

    iput-object p1, p0, Lax/i2/N;->c:Ljava/lang/Runnable;

    return-void
.end method

.method private c(Landroid/graphics/Point;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i2/N$c;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    iget v1, p0, Lax/i2/N;->a:F

    .line 9
    .line 10
    mul-float v0, v0, v1

    .line 11
    .line 12
    const/high16 v2, 0x40000000    # 2.0f

    .line 13
    .line 14
    mul-float v1, v1, v2

    .line 15
    .line 16
    mul-float v0, v0, v1

    .line 17
    .line 18
    float-to-int v0, v0

    .line 19
    iget-object v1, p0, Lax/i2/N;->d:Landroid/graphics/Point;

    .line 20
    .line 21
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 22
    .line 23
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    sub-int/2addr v1, p1

    .line 26
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-lt p1, v0, :cond_21

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_21
    const/4 p1, 0x0

    .line 35
    return p1
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

.method static e(Landroidx/recyclerview/widget/RecyclerView;)Lax/i2/N$c;
    .registers 2

    .line 1
    new-instance v0, Lax/i2/N$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/i2/N$b;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method private g(F)F
    .registers 6

    .line 1
    float-to-double v0, p1

    .line 2
    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    .line 3
    .line 4
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-float p1, v0

    .line 9
    return p1
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


# virtual methods
.method public a()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i2/N;->c:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/i2/N$c;->b(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/i2/N;->d:Landroid/graphics/Point;

    .line 10
    .line 11
    iput-object v0, p0, Lax/i2/N;->e:Landroid/graphics/Point;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lax/i2/N;->f:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(Landroid/graphics/Point;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/i2/N;->e:Landroid/graphics/Point;

    .line 2
    .line 3
    iget-object v0, p0, Lax/i2/N;->d:Landroid/graphics/Point;

    .line 4
    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    iput-object p1, p0, Lax/i2/N;->d:Landroid/graphics/Point;

    .line 8
    .line 9
    :cond_8
    iget-object p1, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 10
    .line 11
    iget-object v0, p0, Lax/i2/N;->c:Ljava/lang/Runnable;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lax/i2/N$c;->c(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method d(I)I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i2/N$c;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    iget v1, p0, Lax/i2/N;->a:F

    .line 9
    .line 10
    mul-float v0, v0, v1

    .line 11
    .line 12
    float-to-int v0, v0

    .line 13
    int-to-float v1, p1

    .line 14
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    float-to-int v1, v1

    .line 19
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-float p1, p1

    .line 24
    int-to-float v0, v0

    .line 25
    div-float/2addr p1, v0

    .line 26
    const/high16 v0, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    mul-int/lit8 v0, v1, 0x46

    .line 33
    .line 34
    int-to-float v0, v0

    .line 35
    invoke-direct {p0, p1}, Lax/i2/N;->g(F)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    mul-float v0, v0, p1

    .line 40
    .line 41
    float-to-int p1, v0

    .line 42
    if-eqz p1, :cond_2c

    .line 43
    .line 44
    return p1

    .line 45
    :cond_2c
    return v1
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

.method f()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i2/N$c;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    iget v1, p0, Lax/i2/N;->a:F

    .line 9
    .line 10
    mul-float v0, v0, v1

    .line 11
    .line 12
    float-to-int v0, v0

    .line 13
    iget-object v1, p0, Lax/i2/N;->e:Landroid/graphics/Point;

    .line 14
    .line 15
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 16
    .line 17
    if-gt v1, v0, :cond_14

    .line 18
    .line 19
    sub-int/2addr v1, v0

    .line 20
    goto :goto_2b

    .line 21
    :cond_14
    iget-object v2, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 22
    .line 23
    invoke-virtual {v2}, Lax/i2/N$c;->a()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-int/2addr v2, v0

    .line 28
    if-lt v1, v2, :cond_2a

    .line 29
    .line 30
    iget-object v1, p0, Lax/i2/N;->e:Landroid/graphics/Point;

    .line 31
    .line 32
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 33
    .line 34
    iget-object v2, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 35
    .line 36
    invoke-virtual {v2}, Lax/i2/N$c;->a()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int/2addr v1, v2

    .line 41
    add-int/2addr v1, v0

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    const/4 v1, 0x0

    .line 44
    :goto_2b
    if-nez v1, :cond_2e

    .line 45
    .line 46
    goto :goto_3a

    .line 47
    :cond_2e
    iget-boolean v2, p0, Lax/i2/N;->f:Z

    .line 48
    .line 49
    if-nez v2, :cond_3b

    .line 50
    .line 51
    iget-object v2, p0, Lax/i2/N;->e:Landroid/graphics/Point;

    .line 52
    .line 53
    invoke-direct {p0, v2}, Lax/i2/N;->c(Landroid/graphics/Point;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3b

    .line 58
    .line 59
    :goto_3a
    return-void

    .line 60
    :cond_3b
    const/4 v2, 0x1

    .line 61
    iput-boolean v2, p0, Lax/i2/N;->f:Z

    .line 62
    .line 63
    if-le v1, v0, :cond_41

    .line 64
    .line 65
    goto :goto_42

    .line 66
    :cond_41
    move v0, v1

    .line 67
    :goto_42
    invoke-virtual {p0, v0}, Lax/i2/N;->d(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v1, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lax/i2/N$c;->d(I)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 77
    .line 78
    iget-object v1, p0, Lax/i2/N;->c:Ljava/lang/Runnable;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lax/i2/N$c;->b(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lax/i2/N;->b:Lax/i2/N$c;

    .line 84
    .line 85
    iget-object v1, p0, Lax/i2/N;->c:Ljava/lang/Runnable;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lax/i2/N$c;->c(Ljava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    return-void
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
