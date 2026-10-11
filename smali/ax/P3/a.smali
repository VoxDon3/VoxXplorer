.class Lax/P3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P3/d;
.implements Lax/N3/b$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/P3/d;",
        "Lax/N3/b$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final c0:Lax/P3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/e<",
            "*>;"
        }
    .end annotation
.end field

.field private final d0:Lax/P3/d$a;

.field private e0:I

.field private f0:Lax/M3/h;

.field private g0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/U3/m<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation
.end field

.field private h0:I

.field private volatile i0:Lax/U3/m$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/U3/m$a<",
            "*>;"
        }
    .end annotation
.end field

.field private j0:Ljava/io/File;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/M3/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/P3/e;Lax/P3/d$a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/e<",
            "*>;",
            "Lax/P3/d$a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/P3/e;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lax/P3/a;-><init>(Ljava/util/List;Lax/P3/e;Lax/P3/d$a;)V

    return-void
.end method

.method constructor <init>(Ljava/util/List;Lax/P3/e;Lax/P3/d$a;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/M3/h;",
            ">;",
            "Lax/P3/e<",
            "*>;",
            "Lax/P3/d$a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lax/P3/a;->e0:I

    .line 4
    iput-object p1, p0, Lax/P3/a;->q:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 6
    iput-object p3, p0, Lax/P3/a;->d0:Lax/P3/d$a;

    return-void
.end method

.method private b()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/P3/a;->h0:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/P3/a;->g0:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()Z
    .registers 8

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lax/P3/a;->g0:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_64

    .line 6
    .line 7
    invoke-direct {p0}, Lax/P3/a;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_64

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 16
    .line 17
    :cond_10
    :goto_10
    if-nez v2, :cond_63

    .line 18
    .line 19
    invoke-direct {p0}, Lax/P3/a;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_63

    .line 24
    .line 25
    iget-object v0, p0, Lax/P3/a;->g0:Ljava/util/List;

    .line 26
    .line 27
    iget v3, p0, Lax/P3/a;->h0:I

    .line 28
    .line 29
    add-int/lit8 v4, v3, 0x1

    .line 30
    .line 31
    iput v4, p0, Lax/P3/a;->h0:I

    .line 32
    .line 33
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lax/U3/m;

    .line 38
    .line 39
    iget-object v3, p0, Lax/P3/a;->j0:Ljava/io/File;

    .line 40
    .line 41
    iget-object v4, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 42
    .line 43
    invoke-virtual {v4}, Lax/P3/e;->p()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v5, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 48
    .line 49
    invoke-virtual {v5}, Lax/P3/e;->e()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget-object v6, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 54
    .line 55
    invoke-virtual {v6}, Lax/P3/e;->i()Lax/M3/j;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v0, v3, v4, v5, v6}, Lax/U3/m;->a(Ljava/lang/Object;IILax/M3/j;)Lax/U3/m$a;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 64
    .line 65
    iget-object v0, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 66
    .line 67
    if-eqz v0, :cond_10

    .line 68
    .line 69
    iget-object v0, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 70
    .line 71
    iget-object v3, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 72
    .line 73
    iget-object v3, v3, Lax/U3/m$a;->c:Lax/N3/b;

    .line 74
    .line 75
    invoke-interface {v3}, Lax/N3/b;->a()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v3}, Lax/P3/e;->q(Ljava/lang/Class;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_10

    .line 84
    .line 85
    iget-object v0, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 86
    .line 87
    iget-object v0, v0, Lax/U3/m$a;->c:Lax/N3/b;

    .line 88
    .line 89
    iget-object v2, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 90
    .line 91
    invoke-virtual {v2}, Lax/P3/e;->j()Lax/J3/g;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v0, v2, p0}, Lax/N3/b;->e(Lax/J3/g;Lax/N3/b$a;)V

    .line 96
    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    goto :goto_10

    .line 100
    :cond_63
    return v2

    .line 101
    :cond_64
    :goto_64
    iget v0, p0, Lax/P3/a;->e0:I

    .line 102
    .line 103
    add-int/2addr v0, v1

    .line 104
    iput v0, p0, Lax/P3/a;->e0:I

    .line 105
    .line 106
    iget-object v1, p0, Lax/P3/a;->q:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-lt v0, v1, :cond_72

    .line 113
    .line 114
    return v2

    .line 115
    :cond_72
    iget-object v0, p0, Lax/P3/a;->q:Ljava/util/List;

    .line 116
    .line 117
    iget v1, p0, Lax/P3/a;->e0:I

    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lax/M3/h;

    .line 124
    .line 125
    new-instance v1, Lax/P3/b;

    .line 126
    .line 127
    iget-object v3, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 128
    .line 129
    invoke-virtual {v3}, Lax/P3/e;->m()Lax/M3/h;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-direct {v1, v0, v3}, Lax/P3/b;-><init>(Lax/M3/h;Lax/M3/h;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 137
    .line 138
    invoke-virtual {v3}, Lax/P3/e;->c()Lax/R3/a;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v3, v1}, Lax/R3/a;->b(Lax/M3/h;)Ljava/io/File;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, p0, Lax/P3/a;->j0:Ljava/io/File;

    .line 147
    .line 148
    if-eqz v1, :cond_0

    .line 149
    .line 150
    iput-object v0, p0, Lax/P3/a;->f0:Lax/M3/h;

    .line 151
    .line 152
    iget-object v0, p0, Lax/P3/a;->c0:Lax/P3/e;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lax/P3/e;->h(Ljava/io/File;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, p0, Lax/P3/a;->g0:Ljava/util/List;

    .line 159
    .line 160
    iput v2, p0, Lax/P3/a;->h0:I

    .line 161
    .line 162
    goto/16 :goto_0
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

.method public c(Ljava/lang/Exception;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/P3/a;->d0:Lax/P3/d$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/P3/a;->f0:Lax/M3/h;

    .line 4
    .line 5
    iget-object v2, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 6
    .line 7
    iget-object v2, v2, Lax/U3/m$a;->c:Lax/N3/b;

    .line 8
    .line 9
    sget-object v3, Lax/M3/a;->d0:Lax/M3/a;

    .line 10
    .line 11
    invoke-interface {v0, v1, p1, v2, v3}, Lax/P3/d$a;->j(Lax/M3/h;Ljava/lang/Exception;Lax/N3/b;Lax/M3/a;)V

    .line 12
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
    .line 22
.end method

.method public cancel()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v0, v0, Lax/U3/m$a;->c:Lax/N3/b;

    .line 6
    .line 7
    invoke-interface {v0}, Lax/N3/b;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_9
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

.method public f(Ljava/lang/Object;)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/P3/a;->d0:Lax/P3/d$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/P3/a;->f0:Lax/M3/h;

    .line 4
    .line 5
    iget-object v2, p0, Lax/P3/a;->i0:Lax/U3/m$a;

    .line 6
    .line 7
    iget-object v3, v2, Lax/U3/m$a;->c:Lax/N3/b;

    .line 8
    .line 9
    sget-object v4, Lax/M3/a;->d0:Lax/M3/a;

    .line 10
    .line 11
    iget-object v5, p0, Lax/P3/a;->f0:Lax/M3/h;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    invoke-interface/range {v0 .. v5}, Lax/P3/d$a;->d(Lax/M3/h;Ljava/lang/Object;Lax/N3/b;Lax/M3/a;Lax/M3/h;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
