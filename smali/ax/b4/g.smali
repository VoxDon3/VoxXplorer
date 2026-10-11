.class Lax/b4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/b4/g$d;,
        Lax/b4/g$a;,
        Lax/b4/g$c;,
        Lax/b4/g$b;
    }
.end annotation


# instance fields
.field private final a:Lax/L3/a;

.field private final b:Landroid/os/Handler;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/b4/g$b;",
            ">;"
        }
    .end annotation
.end field

.field final d:Lax/J3/j;

.field private final e:Lax/Q3/d;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Lax/J3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/J3/i<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lax/b4/g$a;

.field private k:Z

.field private l:Lax/b4/g$a;

.field private m:Landroid/graphics/Bitmap;

.field private n:Lax/M3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/J3/c;Lax/L3/a;IILax/M3/m;Landroid/graphics/Bitmap;)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/J3/c;",
            "Lax/L3/a;",
            "II",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/J3/c;->f()Lax/Q3/d;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Lax/J3/c;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lax/J3/c;->r(Landroid/content/Context;)Lax/J3/j;

    move-result-object v2

    .line 3
    invoke-virtual {p1}, Lax/J3/c;->h()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lax/J3/c;->r(Landroid/content/Context;)Lax/J3/j;

    move-result-object p1

    invoke-static {p1, p3, p4}, Lax/b4/g;->j(Lax/J3/j;II)Lax/J3/i;

    move-result-object v5

    const/4 v4, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v6, p5

    move-object v7, p6

    .line 4
    invoke-direct/range {v0 .. v7}, Lax/b4/g;-><init>(Lax/Q3/d;Lax/J3/j;Lax/L3/a;Landroid/os/Handler;Lax/J3/i;Lax/M3/m;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method constructor <init>(Lax/Q3/d;Lax/J3/j;Lax/L3/a;Landroid/os/Handler;Lax/J3/i;Lax/M3/m;Landroid/graphics/Bitmap;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Q3/d;",
            "Lax/J3/j;",
            "Lax/L3/a;",
            "Landroid/os/Handler;",
            "Lax/J3/i<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lax/b4/g;->c:Ljava/util/List;

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lax/b4/g;->f:Z

    .line 8
    iput-boolean v0, p0, Lax/b4/g;->g:Z

    .line 9
    iput-boolean v0, p0, Lax/b4/g;->h:Z

    .line 10
    iput-object p2, p0, Lax/b4/g;->d:Lax/J3/j;

    if-nez p4, :cond_23

    .line 11
    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v0, Lax/b4/g$c;

    invoke-direct {v0, p0}, Lax/b4/g$c;-><init>(Lax/b4/g;)V

    invoke-direct {p4, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 12
    :cond_23
    iput-object p1, p0, Lax/b4/g;->e:Lax/Q3/d;

    .line 13
    iput-object p4, p0, Lax/b4/g;->b:Landroid/os/Handler;

    .line 14
    iput-object p5, p0, Lax/b4/g;->i:Lax/J3/i;

    .line 15
    iput-object p3, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 16
    invoke-virtual {p0, p6, p7}, Lax/b4/g;->p(Lax/M3/m;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private g()I
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/b4/g;->c()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lax/b4/g;->c()Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Lax/b4/g;->c()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v1, v2}, Lax/k4/i;->f(IILandroid/graphics/Bitmap$Config;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
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

.method private static j(Lax/J3/j;II)Lax/J3/i;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/J3/j;",
            "II)",
            "Lax/J3/i<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/J3/j;->m()Lax/J3/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lax/P3/h;->b:Lax/P3/h;

    .line 6
    .line 7
    invoke-static {v0}, Lax/g4/f;->j(Lax/P3/h;)Lax/g4/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lax/g4/f;->X(Z)Lax/g4/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1, p2}, Lax/g4/f;->Q(II)Lax/g4/f;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lax/J3/i;->b(Lax/g4/f;)Lax/J3/i;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
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

.method private m()V
    .registers 6

    .line 1
    iget-boolean v0, p0, Lax/b4/g;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_56

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/b4/g;->g:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_56

    .line 10
    :cond_9
    iget-boolean v0, p0, Lax/b4/g;->h:Z

    .line 11
    .line 12
    if-eqz v0, :cond_15

    .line 13
    .line 14
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 15
    .line 16
    invoke-interface {v0}, Lax/L3/a;->g()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lax/b4/g;->h:Z

    .line 21
    .line 22
    :cond_15
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lax/b4/g;->g:Z

    .line 24
    .line 25
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/L3/a;->f()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    int-to-long v3, v0

    .line 36
    add-long/2addr v1, v3

    .line 37
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 38
    .line 39
    invoke-interface {v0}, Lax/L3/a;->d()V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lax/b4/g$a;

    .line 43
    .line 44
    iget-object v3, p0, Lax/b4/g;->b:Landroid/os/Handler;

    .line 45
    .line 46
    iget-object v4, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 47
    .line 48
    invoke-interface {v4}, Lax/L3/a;->h()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-direct {v0, v3, v4, v1, v2}, Lax/b4/g$a;-><init>(Landroid/os/Handler;IJ)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lax/b4/g;->l:Lax/b4/g$a;

    .line 56
    .line 57
    iget-object v0, p0, Lax/b4/g;->i:Lax/J3/i;

    .line 58
    .line 59
    invoke-virtual {v0}, Lax/J3/i;->f()Lax/J3/i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Lax/b4/g$d;

    .line 64
    .line 65
    invoke-direct {v1}, Lax/b4/g$d;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Lax/g4/f;->U(Lax/M3/h;)Lax/g4/f;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Lax/J3/i;->b(Lax/g4/f;)Lax/J3/i;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lax/J3/i;->l(Ljava/lang/Object;)Lax/J3/i;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Lax/b4/g;->l:Lax/b4/g$a;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lax/J3/i;->j(Lax/h4/e;)Lax/h4/e;

    .line 85
    .line 86
    .line 87
    :cond_56
    :goto_56
    return-void
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

.method private o()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b4/g;->m:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v1, p0, Lax/b4/g;->e:Lax/Q3/d;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Lax/Q3/d;->c(Landroid/graphics/Bitmap;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lax/b4/g;->m:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    :cond_c
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

.method private q()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/b4/g;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/b4/g;->f:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lax/b4/g;->k:Z

    .line 11
    .line 12
    invoke-direct {p0}, Lax/b4/g;->m()V

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
.end method

.method private r()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/b4/g;->f:Z

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


# virtual methods
.method a()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/b4/g;->o()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lax/b4/g;->r()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/b4/g;->j:Lax/b4/g$a;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    iget-object v2, p0, Lax/b4/g;->d:Lax/J3/j;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lax/J3/j;->o(Lax/h4/e;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lax/b4/g;->j:Lax/b4/g$a;

    .line 23
    .line 24
    :cond_17
    iget-object v0, p0, Lax/b4/g;->l:Lax/b4/g$a;

    .line 25
    .line 26
    if-eqz v0, :cond_22

    .line 27
    .line 28
    iget-object v2, p0, Lax/b4/g;->d:Lax/J3/j;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Lax/J3/j;->o(Lax/h4/e;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lax/b4/g;->l:Lax/b4/g$a;

    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 36
    .line 37
    invoke-interface {v0}, Lax/L3/a;->clear()V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lax/b4/g;->k:Z

    .line 42
    .line 43
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

.method b()Ljava/nio/ByteBuffer;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/L3/a;->b()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

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

.method c()Landroid/graphics/Bitmap;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/g;->j:Lax/b4/g$a;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g$a;->h()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/b4/g;->m:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    return-object v0
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
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/g;->j:Lax/b4/g$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget v0, v0, Lax/b4/g$a;->f0:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_7
    const/4 v0, -0x1

    .line 9
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
.end method

.method e()Landroid/graphics/Bitmap;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/g;->m:Landroid/graphics/Bitmap;

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

.method f()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/L3/a;->e()I

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

.method h()I
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/b4/g;->c()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
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
.end method

.method i()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/L3/a;->j()I

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

.method k()I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b4/g;->a:Lax/L3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/L3/a;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0}, Lax/b4/g;->g()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
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

.method l()I
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/b4/g;->c()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
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
.end method

.method n(Lax/b4/g$a;)V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/b4/g;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_f

    .line 5
    .line 6
    iget-object v0, p0, Lax/b4/g;->b:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    invoke-virtual {p1}, Lax/b4/g$a;->h()Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_3f

    .line 21
    .line 22
    invoke-direct {p0}, Lax/b4/g;->o()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/b4/g;->j:Lax/b4/g$a;

    .line 26
    .line 27
    iput-object p1, p0, Lax/b4/g;->j:Lax/b4/g$a;

    .line 28
    .line 29
    iget-object p1, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    :goto_24
    if-ltz p1, :cond_34

    .line 38
    .line 39
    iget-object v2, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lax/b4/g$b;

    .line 46
    .line 47
    invoke-interface {v2}, Lax/b4/g$b;->a()V

    .line 48
    .line 49
    .line 50
    add-int/lit8 p1, p1, -0x1

    .line 51
    .line 52
    goto :goto_24

    .line 53
    :cond_34
    if-eqz v0, :cond_3f

    .line 54
    .line 55
    iget-object p1, p0, Lax/b4/g;->b:Landroid/os/Handler;

    .line 56
    .line 57
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 62
    .line 63
    .line 64
    :cond_3f
    const/4 p1, 0x0

    .line 65
    iput-boolean p1, p0, Lax/b4/g;->g:Z

    .line 66
    .line 67
    invoke-direct {p0}, Lax/b4/g;->m()V

    .line 68
    .line 69
    .line 70
    return-void
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

.method p(Lax/M3/m;Landroid/graphics/Bitmap;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/M3/m;

    .line 6
    .line 7
    iput-object v0, p0, Lax/b4/g;->n:Lax/M3/m;

    .line 8
    .line 9
    invoke-static {p2}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iput-object p2, p0, Lax/b4/g;->m:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    iget-object p2, p0, Lax/b4/g;->i:Lax/J3/i;

    .line 18
    .line 19
    new-instance v0, Lax/g4/f;

    .line 20
    .line 21
    invoke-direct {v0}, Lax/g4/f;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lax/g4/f;->Y(Lax/M3/m;)Lax/g4/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Lax/J3/i;->b(Lax/g4/f;)Lax/J3/i;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lax/b4/g;->i:Lax/J3/i;

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method s(Lax/b4/g$b;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/b4/g;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_25

    .line 4
    .line 5
    iget-object v0, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1d

    .line 18
    .line 19
    iget-object v1, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_1c

    .line 25
    .line 26
    invoke-direct {p0}, Lax/b4/g;->q()V

    .line 27
    .line 28
    .line 29
    :cond_1c
    return-void

    .line 30
    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "Cannot subscribe twice in a row"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "Cannot subscribe to a cleared frame loader"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
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

.method t(Lax/b4/g$b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/b4/g;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_10

    .line 13
    .line 14
    invoke-direct {p0}, Lax/b4/g;->r()V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
