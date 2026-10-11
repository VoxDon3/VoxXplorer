.class final Lax/o1/s$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o1/S;
.implements Lax/o1/s$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o1/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private c:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lax/P0/v;

.field private e:I

.field private f:J

.field private g:J

.field private h:Lax/o1/S$a;

.field private i:Ljava/util/concurrent/Executor;

.field private j:Z

.field private k:Z

.field final synthetic l:Lax/o1/s;


# direct methods
.method public constructor <init>(Lax/o1/s;Landroid/content/Context;I)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p3, p0, Lax/o1/s$d;->b:I

    .line 7
    .line 8
    invoke-static {p2}, Lax/S0/d0;->g0(Landroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lax/o1/s$d;->a:I

    .line 13
    .line 14
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lax/o1/s$d;->c:Lax/r7/z;

    .line 19
    .line 20
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide p1, p0, Lax/o1/s$d;->g:J

    .line 26
    .line 27
    sget-object p1, Lax/o1/S$a;->a:Lax/o1/S$a;

    .line 28
    .line 29
    iput-object p1, p0, Lax/o1/s$d;->h:Lax/o1/S$a;

    .line 30
    .line 31
    invoke-static {}, Lax/o1/s;->y()Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lax/o1/s$d;->i:Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    return-void
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

.method public static synthetic B(Lax/o1/S$a;Lax/P0/a0;)V
    .registers 2

    .line 1
    invoke-interface {p0, p1}, Lax/o1/S$a;->a(Lax/P0/a0;)V

    .line 2
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

.method private C(Lax/P0/v;)V
    .registers 9

    .line 1
    invoke-virtual {p1}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 6
    .line 7
    iget-object p1, p1, Lax/P0/v;->E:Lax/P0/j;

    .line 8
    .line 9
    invoke-static {v1, p1}, Lax/o1/s;->v(Lax/o1/s;Lax/P0/j;)Lax/P0/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Lax/P0/v$b;->V(Lax/P0/j;)Lax/P0/v$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget p1, p0, Lax/o1/s$d;->e:I

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    if-ne p1, v0, :cond_1b

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    const/4 v0, 0x2

    .line 29
    const/4 v2, 0x2

    .line 30
    :goto_1d
    iget-object p1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 31
    .line 32
    invoke-static {p1}, Lax/o1/s;->x(Lax/o1/s;)Lax/P0/Z;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move-object v0, p1

    .line 41
    check-cast v0, Lax/P0/Z;

    .line 42
    .line 43
    iget v1, p0, Lax/o1/s$d;->b:I

    .line 44
    .line 45
    iget-object v4, p0, Lax/o1/s$d;->c:Lax/r7/z;

    .line 46
    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    invoke-interface/range {v0 .. v6}, Lax/P0/Z;->p(IILax/P0/v;Ljava/util/List;J)V

    .line 50
    .line 51
    .line 52
    return-void
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
.method public A()V
    .registers 11

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-static {v0}, Lax/o1/s;->m(Lax/o1/s;)Lax/S0/L;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/S0/L;->l()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 14
    .line 15
    invoke-static {v0}, Lax/o1/s;->o(Lax/o1/s;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    new-instance v0, Lax/S0/L;

    .line 20
    .line 21
    invoke-direct {v0}, Lax/S0/L;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    const/4 v2, 0x1

    .line 26
    :goto_19
    iget-object v3, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 27
    .line 28
    invoke-static {v3}, Lax/o1/s;->m(Lax/o1/s;)Lax/S0/L;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lax/S0/L;->l()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-lez v3, :cond_58

    .line 37
    .line 38
    iget-object v3, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 39
    .line 40
    invoke-static {v3}, Lax/o1/s;->m(Lax/o1/s;)Lax/S0/L;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Lax/S0/L;->i()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lax/o1/s$h;

    .line 49
    .line 50
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lax/o1/s$h;

    .line 55
    .line 56
    if-eqz v2, :cond_52

    .line 57
    .line 58
    iget v2, v3, Lax/o1/s$h;->b:I

    .line 59
    .line 60
    if-eqz v2, :cond_46

    .line 61
    .line 62
    if-ne v2, v1, :cond_40

    .line 63
    .line 64
    goto :goto_46

    .line 65
    :cond_40
    iget-object v2, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 66
    .line 67
    invoke-static {v2}, Lax/o1/s;->o(Lax/o1/s;)V

    .line 68
    .line 69
    .line 70
    goto :goto_51

    .line 71
    :cond_46
    :goto_46
    new-instance v4, Lax/o1/s$h;

    .line 72
    .line 73
    iget-wide v5, v3, Lax/o1/s$h;->a:J

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    iget-wide v8, v3, Lax/o1/s$h;->c:J

    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, Lax/o1/s$h;-><init>(JIJ)V

    .line 79
    .line 80
    .line 81
    move-object v3, v4

    .line 82
    :goto_51
    const/4 v2, 0x0

    .line 83
    :cond_52
    iget-wide v4, v3, Lax/o1/s$h;->c:J

    .line 84
    .line 85
    invoke-virtual {v0, v4, v5, v3}, Lax/S0/L;->a(JLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_19

    .line 89
    :cond_58
    iget-object v1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 90
    .line 91
    invoke-static {v1, v0}, Lax/o1/s;->n(Lax/o1/s;Lax/S0/L;)Lax/S0/L;

    .line 92
    .line 93
    .line 94
    return-void
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

.method public a(Lax/P0/a0;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->h:Lax/o1/S$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o1/s$d;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v2, Lax/o1/v;

    .line 6
    .line 7
    invoke-direct {v2, v0, p1}, Lax/o1/v;-><init>(Lax/o1/S$a;Lax/P0/a0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
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
    .line 22
.end method

.method public b()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/o1/s$d;->k:Z

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

.method public c()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 8
    .line 9
    invoke-static {v0}, Lax/o1/s;->k(Lax/o1/s;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_10

    .line 14
    .line 15
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

.method public d()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/s;->N()V

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

.method public e()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->h:Lax/o1/S$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o1/s$d;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lax/o1/u;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Lax/o1/u;-><init>(Lax/o1/S$a;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->h:Lax/o1/S$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o1/s$d;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lax/o1/t;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Lax/o1/t;-><init>(Lax/o1/S$a;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public g(F)V
    .registers 3

    .line 1
    iget v0, p0, Lax/o1/s$d;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lax/o1/s;->q(Lax/o1/s;F)V

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
    .line 22
.end method

.method public h()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_2e

    .line 8
    :cond_7
    iget-boolean v0, p0, Lax/o1/s$d;->j:Z

    .line 9
    .line 10
    iget-object v1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 11
    .line 12
    invoke-static {v1}, Lax/o1/s;->d(Lax/o1/s;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-object v3, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v3, v4}, Lax/o1/s;->f(Lax/o1/s;Z)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 23
    .line 24
    invoke-static {v3}, Lax/o1/s;->x(Lax/o1/s;)Lax/P0/Z;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lax/P0/Z;

    .line 33
    .line 34
    invoke-interface {v3}, Lax/P0/Z;->h()V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 38
    .line 39
    invoke-static {v3, v1, v2}, Lax/o1/s;->e(Lax/o1/s;J)J

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_2e

    .line 43
    .line 44
    invoke-virtual {p0}, Lax/o1/s$d;->q()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    :goto_2e
    return-void
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

.method public i(JJ)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    iget-wide v1, p0, Lax/o1/s$d;->f:J

    .line 4
    .line 5
    add-long/2addr p1, v1

    .line 6
    invoke-static {v0, p1, p2, p3, p4}, Lax/o1/s;->t(Lax/o1/s;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public j()Landroid/view/Surface;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 9
    .line 10
    invoke-static {v0}, Lax/o1/s;->x(Lax/o1/s;)Lax/P0/Z;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lax/P0/Z;

    .line 19
    .line 20
    iget v1, p0, Lax/o1/s$d;->b:I

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lax/P0/Z;->m(I)Landroid/view/Surface;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
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

.method public k(JLax/o1/S$b;)Z
    .registers 7

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 9
    .line 10
    invoke-static {v0}, Lax/o1/s;->s(Lax/o1/s;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 19
    .line 20
    invoke-static {v0}, Lax/o1/s;->x(Lax/o1/s;)Lax/P0/Z;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lax/P0/Z;

    .line 29
    .line 30
    iget v2, p0, Lax/o1/s$d;->b:I

    .line 31
    .line 32
    invoke-interface {v0, v2}, Lax/P0/Z;->j(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, Lax/o1/s$d;->a:I

    .line 37
    .line 38
    if-lt v0, v2, :cond_28

    .line 39
    .line 40
    return v1

    .line 41
    :cond_28
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 42
    .line 43
    invoke-static {v0}, Lax/o1/s;->x(Lax/o1/s;)Lax/P0/Z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lax/P0/Z;

    .line 52
    .line 53
    iget v2, p0, Lax/o1/s$d;->b:I

    .line 54
    .line 55
    invoke-interface {v0, v2}, Lax/P0/Z;->i(I)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3d

    .line 60
    .line 61
    return v1

    .line 62
    :cond_3d
    iget-wide v0, p0, Lax/o1/s$d;->f:J

    .line 63
    .line 64
    add-long/2addr p1, v0

    .line 65
    iput-wide p1, p0, Lax/o1/s$d;->g:J

    .line 66
    .line 67
    const-wide/16 v0, 0x3e8

    .line 68
    .line 69
    mul-long p1, p1, v0

    .line 70
    .line 71
    invoke-interface {p3, p1, p2}, Lax/o1/S$b;->a(J)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1
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

.method public l()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-static {v0}, Lax/o1/s;->z(Lax/o1/s;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/o1/s;->X()V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public m(Lax/o1/S$a;Ljava/util/concurrent/Executor;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/o1/s$d;->h:Lax/o1/S$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/o1/s$d;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
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

.method public n()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-static {v0}, Lax/o1/s;->z(Lax/o1/s;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/o1/s;->W()V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public o(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/o1/s$d;->f:J

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

.method public p(Lax/o1/z;)V
    .registers 3

    .line 1
    iget v0, p0, Lax/o1/s$d;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lax/o1/s;->p(Lax/o1/s;Lax/o1/z;)V

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
    .line 22
.end method

.method public q()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    iget-wide v1, p0, Lax/o1/s$d;->g:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lax/o1/s;->i(Lax/o1/s;J)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 9
    .line 10
    invoke-static {v0}, Lax/o1/s;->d(Lax/o1/s;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 15
    .line 16
    invoke-static {v2}, Lax/o1/s;->h(Lax/o1/s;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    cmp-long v4, v0, v2

    .line 21
    .line 22
    if-ltz v4, :cond_1c

    .line 23
    .line 24
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 25
    .line 26
    invoke-static {v0}, Lax/o1/s;->j(Lax/o1/s;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    return-void
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

.method public r(ILax/P0/v;JILjava/util/List;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lax/P0/v;",
            "JI",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p6}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 9
    .line 10
    .line 11
    move-result-object p6

    .line 12
    iput-object p6, p0, Lax/o1/s$d;->c:Lax/r7/z;

    .line 13
    .line 14
    iput p1, p0, Lax/o1/s$d;->e:I

    .line 15
    .line 16
    iput-object p2, p0, Lax/o1/s$d;->d:Lax/P0/v;

    .line 17
    .line 18
    iget-object p1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Lax/o1/s;->i(Lax/o1/s;J)J

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 29
    .line 30
    const/4 p6, 0x0

    .line 31
    invoke-static {p1, p6}, Lax/o1/s;->l(Lax/o1/s;Z)Z

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p2}, Lax/o1/s$d;->C(Lax/P0/v;)V

    .line 35
    .line 36
    .line 37
    iget-wide p1, p0, Lax/o1/s$d;->g:J

    .line 38
    .line 39
    cmp-long v2, p1, v0

    .line 40
    .line 41
    if-nez v2, :cond_2b

    .line 42
    .line 43
    const/4 p6, 0x1

    .line 44
    :cond_2b
    iget-object p1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 45
    .line 46
    invoke-static {p1}, Lax/o1/s;->z(Lax/o1/s;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_3b

    .line 51
    .line 52
    iget p1, p0, Lax/o1/s$d;->b:I

    .line 53
    .line 54
    if-nez p1, :cond_3a

    .line 55
    .line 56
    if-eqz p6, :cond_3a

    .line 57
    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    return-void

    .line 60
    :cond_3b
    :goto_3b
    if-eqz p6, :cond_41

    .line 61
    .line 62
    const-wide/high16 p1, -0x4000000000000000L    # -2.0

    .line 63
    .line 64
    :goto_3f
    move-wide v4, p1

    .line 65
    goto :goto_47

    .line 66
    :cond_41
    iget-wide p1, p0, Lax/o1/s$d;->g:J

    .line 67
    .line 68
    const-wide/16 v0, 0x1

    .line 69
    .line 70
    add-long/2addr p1, v0

    .line 71
    goto :goto_3f

    .line 72
    :goto_47
    iget-object p1, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 73
    .line 74
    invoke-static {p1}, Lax/o1/s;->m(Lax/o1/s;)Lax/S0/L;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, Lax/o1/s$h;

    .line 79
    .line 80
    iget-wide v1, p0, Lax/o1/s$d;->f:J

    .line 81
    .line 82
    add-long/2addr v1, p3

    .line 83
    move v3, p5

    .line 84
    invoke-direct/range {v0 .. v5}, Lax/o1/s$h;-><init>(JIJ)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v4, v5, v0}, Lax/S0/L;->a(JLjava/lang/Object;)V

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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
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
.end method

.method public s(I)V
    .registers 3

    .line 1
    iget v0, p0, Lax/o1/s$d;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lax/o1/s;->r(Lax/o1/s;I)V

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
    .line 22
.end method

.method public t(Landroid/view/Surface;Lax/S0/I;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/o1/s;->Q(Landroid/view/Surface;Lax/S0/I;)V

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

.method public u()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/s;->C()V

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

.method public v(Z)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_15

    .line 6
    .line 7
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 8
    .line 9
    invoke-static {v0}, Lax/o1/s;->x(Lax/o1/s;)Lax/P0/Z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lax/P0/Z;

    .line 18
    .line 19
    invoke-interface {v0}, Lax/P0/Z;->flush()V

    .line 20
    .line 21
    .line 22
    :cond_15
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iput-wide v0, p0, Lax/o1/s$d;->g:J

    .line 28
    .line 29
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 30
    .line 31
    invoke-static {v0, p1}, Lax/o1/s;->f(Lax/o1/s;Z)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lax/o1/s$d;->j:Z

    .line 36
    .line 37
    return-void
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

.method public w(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->c:Lax/r7/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/r7/z;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_16

    .line 10
    :cond_9
    invoke-static {p1}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lax/o1/s$d;->c:Lax/r7/z;

    .line 15
    .line 16
    iget-object p1, p0, Lax/o1/s$d;->d:Lax/P0/v;

    .line 17
    .line 18
    if-eqz p1, :cond_16

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lax/o1/s$d;->C(Lax/P0/v;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    :goto_16
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

.method public x(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    invoke-static {v0}, Lax/o1/s;->z(Lax/o1/s;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lax/o1/s;->u(Lax/o1/s;Z)V

    .line 12
    .line 13
    .line 14
    :cond_d
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

.method public y(Z)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 2
    .line 3
    if-eqz p1, :cond_c

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    :goto_d
    invoke-static {v0, p1}, Lax/o1/s;->g(Lax/o1/s;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public z(Lax/P0/v;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/o1/s$d;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/o1/s$d;->l:Lax/o1/s;

    .line 11
    .line 12
    iget v1, p0, Lax/o1/s$d;->b:I

    .line 13
    .line 14
    invoke-static {v0, p1, v1}, Lax/o1/s;->c(Lax/o1/s;Lax/P0/v;I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput-boolean p1, p0, Lax/o1/s$d;->k:Z

    .line 19
    .line 20
    return p1
    .line 21
    .line 22
.end method
