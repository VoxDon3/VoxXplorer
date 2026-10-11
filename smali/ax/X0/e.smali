.class public final Lax/X0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;
.implements Lax/q1/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X0/e$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/X0/j;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Lax/X0/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/S0/G;

.field private d:I

.field private e:I

.field private f:I

.field private g:J

.field private h:J

.field private i:Lax/X0/e$b;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/X0/e;->d:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Ljava/util/PriorityQueue;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 20
    .line 21
    new-instance v0, Lax/S0/G;

    .line 22
    .line 23
    const/16 v1, 0x200

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lax/S0/G;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static synthetic o(Lax/X0/e;IJ)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/X0/e;->q(IJ)V

    return-void
.end method

.method private static p(Lax/S0/G;)Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, 0x4d546864

    .line 6
    .line 7
    .line 8
    if-ne p0, v0, :cond_b

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_b
    const/4 p0, 0x0

    .line 13
    return p0
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

.method private q(IJ)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_7
    if-ge v2, v1, :cond_15

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Lax/X0/j;

    .line 17
    .line 18
    invoke-virtual {v3, p1, p2, p3}, Lax/X0/j;->d(IJ)V

    .line 19
    .line 20
    .line 21
    goto :goto_7

    .line 22
    :cond_15
    return-void
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

.method private r()V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/X0/e;->i:Lax/X0/e$b;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lax/X0/e$b;

    .line 9
    .line 10
    iget-wide v2, p0, Lax/X0/e;->g:J

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-virtual/range {v1 .. v7}, Lax/X0/e$b;->f(JIIILax/q1/U$a;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private s()I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-lt v0, v1, :cond_29

    .line 11
    .line 12
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const v1, 0x4d54726b    # 2.22766768E8f

    .line 19
    .line 20
    .line 21
    if-ne v0, v1, :cond_24

    .line 22
    .line 23
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_1f

    .line 30
    .line 31
    return v0

    .line 32
    :cond_1f
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    throw v0

    .line 37
    :cond_24
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    throw v0

    .line 42
    :cond_29
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    throw v0
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

.method private t()V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-lt v0, v1, :cond_6f

    .line 11
    .line 12
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 13
    .line 14
    invoke-static {v0}, Lax/X0/e;->p(Lax/S0/G;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_6a

    .line 19
    .line 20
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/S0/G;->I()S

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 33
    .line 34
    invoke-virtual {v1}, Lax/S0/G;->I()S

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-lez v1, :cond_65

    .line 39
    .line 40
    iget-object v3, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 41
    .line 42
    invoke-virtual {v3}, Lax/S0/G;->I()S

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    iput v3, p0, Lax/X0/e;->f:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    :goto_31
    if-ge v4, v1, :cond_64

    .line 51
    .line 52
    invoke-direct {p0}, Lax/X0/e;->s()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    new-array v6, v5, [B

    .line 57
    .line 58
    iget-object v7, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 59
    .line 60
    invoke-virtual {v7}, Lax/S0/G;->a()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-lt v7, v5, :cond_5f

    .line 65
    .line 66
    iget-object v7, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 67
    .line 68
    invoke-virtual {v7, v6, v3, v5}, Lax/S0/G;->q([BII)V

    .line 69
    .line 70
    .line 71
    new-instance v5, Lax/S0/G;

    .line 72
    .line 73
    invoke-direct {v5, v6}, Lax/S0/G;-><init>([B)V

    .line 74
    .line 75
    .line 76
    new-instance v6, Lax/X0/j;

    .line 77
    .line 78
    iget v7, p0, Lax/X0/e;->f:I

    .line 79
    .line 80
    new-instance v8, Lax/X0/d;

    .line 81
    .line 82
    invoke-direct {v8, p0}, Lax/X0/d;-><init>(Lax/X0/e;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v6, v0, v7, v5, v8}, Lax/X0/j;-><init>(IILax/S0/G;Lax/X0/j$a;)V

    .line 86
    .line 87
    .line 88
    iget-object v5, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_31

    .line 96
    :cond_5f
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    throw v0

    .line 101
    :cond_64
    return-void

    .line 102
    :cond_65
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    throw v0

    .line 107
    :cond_6a
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    throw v0

    .line 112
    :cond_6f
    invoke-static {v2, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    throw v0
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

.method private u(J)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3c

    .line 8
    .line 9
    iget-object v0, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/X0/j;

    .line 16
    .line 17
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/X0/j;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/X0/j;->p()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v5, v1, v3

    .line 33
    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    cmp-long v3, v1, p1

    .line 37
    .line 38
    if-gez v3, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lax/X0/e;->i:Lax/X0/e$b;

    .line 41
    .line 42
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lax/q1/U;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v0, v1, v2}, Lax/X0/j;->n(Lax/q1/U;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lax/X0/j;->q()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3c
    iget-object p1, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 62
    .line 63
    iget-object p2, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    return-void
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


# virtual methods
.method public a(Lax/q1/t;)V
    .registers 6

    .line 1
    iget v0, p0, Lax/X0/e;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_37

    .line 4
    .line 5
    new-instance v0, Lax/X0/e$b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-interface {p1, v1, v2}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v0, v1, v3}, Lax/X0/e$b;-><init>(Lax/q1/U;Lax/X0/e$a;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/X0/e;->i:Lax/X0/e$b;

    .line 18
    .line 19
    new-instance v1, Lax/P0/v$b;

    .line 20
    .line 21
    invoke-direct {v1}, Lax/P0/v$b;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "audio/midi"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, v3}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v3, "audio/x-exoplayer-midi"

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lax/q1/E;->e(Lax/P0/v;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lax/q1/t;->o()V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, p0}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 51
    .line 52
    .line 53
    iput v2, p0, Lax/X0/e;->d:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public b(JJ)V
    .registers 7

    .line 1
    iget p1, p0, Lax/X0/e;->d:I

    .line 2
    .line 3
    const/4 p2, 0x4

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_9

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    :goto_a
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    iput-wide p3, p0, Lax/X0/e;->h:J

    .line 15
    .line 16
    iget-object p1, p0, Lax/X0/e;->i:Lax/X0/e$b;

    .line 17
    .line 18
    if-eqz p1, :cond_16

    .line 19
    .line 20
    invoke-virtual {p1}, Lax/X0/e$b;->h()V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget p1, p0, Lax/X0/e;->d:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_22

    .line 26
    .line 27
    iget-object p1, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lax/S0/G;->b0(I)V

    .line 30
    .line 31
    .line 32
    iput v1, p0, Lax/X0/e;->e:I

    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    const/4 p1, 0x2

    .line 36
    iput p1, p0, Lax/X0/e;->d:I

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
.end method

.method public c(Lax/q1/s;)Z
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/S0/G;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lax/S0/G;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-interface {p1, v2, v3, v1}, Lax/q1/s;->p([BII)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lax/X0/e;->p(Lax/S0/G;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method

.method public d()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 12
    .line 13
    sget-object v1, Lax/S0/d0;->f:[B

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/S0/G;->Y([B)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    iput v0, p0, Lax/X0/e;->d:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget p2, p0, Lax/X0/e;->d:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eq p2, v0, :cond_a2

    .line 9
    .line 10
    if-eq p2, v2, :cond_57

    .line 11
    .line 12
    if-ne p2, v1, :cond_51

    .line 13
    .line 14
    iget-object p1, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lax/X0/j;

    .line 21
    .line 22
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lax/X0/j;

    .line 27
    .line 28
    invoke-virtual {p1}, Lax/X0/j;->p()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long p2, v0, v5

    .line 38
    .line 39
    if-eqz p2, :cond_4b

    .line 40
    .line 41
    iget-wide v2, p0, Lax/X0/e;->g:J

    .line 42
    .line 43
    const-wide/32 v5, 0x186a0

    .line 44
    .line 45
    .line 46
    add-long v7, v2, v5

    .line 47
    .line 48
    cmp-long p2, v7, v0

    .line 49
    .line 50
    if-gez p2, :cond_3a

    .line 51
    .line 52
    add-long/2addr v2, v5

    .line 53
    iput-wide v2, p0, Lax/X0/e;->g:J

    .line 54
    .line 55
    invoke-direct {p0}, Lax/X0/e;->r()V

    .line 56
    .line 57
    .line 58
    goto :goto_4a

    .line 59
    :cond_3a
    iput-wide v0, p0, Lax/X0/e;->g:J

    .line 60
    .line 61
    iget-object p2, p0, Lax/X0/e;->i:Lax/X0/e$b;

    .line 62
    .line 63
    invoke-static {p2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Lax/q1/U;

    .line 68
    .line 69
    invoke-virtual {p1, p2, v4}, Lax/X0/j;->n(Lax/q1/U;Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lax/X0/j;->q()V

    .line 73
    .line 74
    .line 75
    :goto_4a
    const/4 v3, 0x0

    .line 76
    :cond_4b
    iget-object p2, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return v3

    .line 82
    :cond_51
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_57
    iget-object p1, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    const/4 v0, 0x0

    .line 100
    :goto_63
    if-ge v0, p2, :cond_74

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    check-cast v2, Lax/X0/j;

    .line 109
    .line 110
    invoke-virtual {v2}, Lax/X0/j;->r()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Lax/X0/j;->q()V

    .line 114
    .line 115
    .line 116
    goto :goto_63

    .line 117
    :cond_74
    iget-object p1, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 118
    .line 119
    iget-object p2, p0, Lax/X0/e;->a:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 122
    .line 123
    .line 124
    iget-wide p1, p0, Lax/X0/e;->h:J

    .line 125
    .line 126
    invoke-direct {p0, p1, p2}, Lax/X0/e;->u(J)V

    .line 127
    .line 128
    .line 129
    iget-wide p1, p0, Lax/X0/e;->h:J

    .line 130
    .line 131
    iput-wide p1, p0, Lax/X0/e;->g:J

    .line 132
    .line 133
    iget-object p1, p0, Lax/X0/e;->b:Ljava/util/PriorityQueue;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Lax/X0/j;

    .line 140
    .line 141
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lax/X0/j;

    .line 146
    .line 147
    invoke-virtual {p1}, Lax/X0/j;->p()J

    .line 148
    .line 149
    .line 150
    move-result-wide p1

    .line 151
    iget-wide v2, p0, Lax/X0/e;->g:J

    .line 152
    .line 153
    cmp-long v0, p1, v2

    .line 154
    .line 155
    if-lez v0, :cond_9f

    .line 156
    .line 157
    invoke-direct {p0}, Lax/X0/e;->r()V

    .line 158
    .line 159
    .line 160
    :cond_9f
    iput v1, p0, Lax/X0/e;->d:I

    .line 161
    .line 162
    return v4

    .line 163
    :cond_a2
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 164
    .line 165
    .line 166
    move-result-wide v5

    .line 167
    invoke-static {v5, v6}, Lax/u7/f;->e(J)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 172
    .line 173
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    array-length v0, v0

    .line 178
    iget v5, p0, Lax/X0/e;->e:I

    .line 179
    .line 180
    if-ne v5, v0, :cond_c0

    .line 181
    .line 182
    iget-object v5, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 183
    .line 184
    if-eq p2, v3, :cond_ba

    .line 185
    .line 186
    move v0, p2

    .line 187
    :cond_ba
    mul-int/lit8 v0, v0, 0x3

    .line 188
    .line 189
    div-int/2addr v0, v2

    .line 190
    invoke-virtual {v5, v0}, Lax/S0/G;->d(I)V

    .line 191
    .line 192
    .line 193
    :cond_c0
    iget-object v0, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 194
    .line 195
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget v1, p0, Lax/X0/e;->e:I

    .line 200
    .line 201
    iget-object v5, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 202
    .line 203
    invoke-virtual {v5}, Lax/S0/G;->b()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    iget v6, p0, Lax/X0/e;->e:I

    .line 208
    .line 209
    sub-int/2addr v5, v6

    .line 210
    invoke-interface {p1, v0, v1, v5}, Lax/q1/s;->c([BII)I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eq p1, v3, :cond_e1

    .line 215
    .line 216
    iget v0, p0, Lax/X0/e;->e:I

    .line 217
    .line 218
    add-int/2addr v0, p1

    .line 219
    iput v0, p0, Lax/X0/e;->e:I

    .line 220
    .line 221
    if-eq p2, v3, :cond_e0

    .line 222
    .line 223
    if-eq v0, p2, :cond_e1

    .line 224
    .line 225
    :cond_e0
    return v4

    .line 226
    :cond_e1
    iget-object p1, p0, Lax/X0/e;->c:Lax/S0/G;

    .line 227
    .line 228
    iget p2, p0, Lax/X0/e;->e:I

    .line 229
    .line 230
    invoke-virtual {p1, p2}, Lax/S0/G;->a0(I)V

    .line 231
    .line 232
    .line 233
    invoke-direct {p0}, Lax/X0/e;->t()V

    .line 234
    .line 235
    .line 236
    iput v2, p0, Lax/X0/e;->d:I

    .line 237
    .line 238
    return v4
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

.method public i()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l(J)Lax/q1/N$a;
    .registers 7

    .line 1
    iget v0, p0, Lax/X0/e;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_11

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    goto :goto_11

    .line 10
    :cond_9
    new-instance p1, Lax/q1/N$a;

    .line 11
    .line 12
    sget-object p2, Lax/q1/O;->c:Lax/q1/O;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    :goto_11
    new-instance v0, Lax/q1/N$a;

    .line 19
    .line 20
    new-instance v1, Lax/q1/O;

    .line 21
    .line 22
    const-wide/16 v2, 0xe

    .line 23
    .line 24
    invoke-direct {v1, p1, p2, v2, v3}, Lax/q1/O;-><init>(JJ)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    .line 28
    .line 29
    .line 30
    return-object v0
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

.method public n()J
    .registers 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
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
