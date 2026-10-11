.class Lax/b1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/b1/g$e;,
        Lax/b1/g$a;,
        Lax/b1/g$b;,
        Lax/b1/g$c;,
        Lax/b1/g$d;,
        Lax/b1/g$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/o$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lax/b1/E;

.field private final c:Lax/b1/g$a;

.field private final d:Lax/b1/g$b;

.field private final e:I

.field private final f:Z

.field private final g:Z

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lax/S0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/S0/m<",
            "Lax/b1/u$a;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lax/m1/m;

.field private final k:Lax/Z0/I1;

.field private final l:Lax/b1/S;

.field private final m:Ljava/util/UUID;

.field private final n:Landroid/os/Looper;

.field private final o:Lax/b1/g$e;

.field private p:I

.field private q:I

.field private r:Landroid/os/HandlerThread;

.field private s:Lax/b1/g$c;

.field private t:Lax/V0/b;

.field private u:Lax/b1/n$a;

.field private v:[B

.field private w:[B

.field private x:Lax/b1/E$a;

.field private y:Lax/b1/E$d;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lax/b1/E;Lax/b1/g$a;Lax/b1/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lax/b1/S;Landroid/os/Looper;Lax/m1/m;Lax/Z0/I1;)V
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lax/b1/E;",
            "Lax/b1/g$a;",
            "Lax/b1/g$b;",
            "Ljava/util/List<",
            "Lax/P0/o$b;",
            ">;IZZ[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lax/b1/S;",
            "Landroid/os/Looper;",
            "Lax/m1/m;",
            "Lax/Z0/I1;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p6, v0, :cond_9

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-ne p6, v0, :cond_c

    .line 9
    .line 10
    :cond_9
    invoke-static {p9}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_c
    iput-object p1, p0, Lax/b1/g;->m:Ljava/util/UUID;

    .line 14
    .line 15
    iput-object p3, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 16
    .line 17
    iput-object p4, p0, Lax/b1/g;->d:Lax/b1/g$b;

    .line 18
    .line 19
    iput-object p2, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 20
    .line 21
    iput p6, p0, Lax/b1/g;->e:I

    .line 22
    .line 23
    iput-boolean p7, p0, Lax/b1/g;->f:Z

    .line 24
    .line 25
    iput-boolean p8, p0, Lax/b1/g;->g:Z

    .line 26
    .line 27
    if-eqz p9, :cond_22

    .line 28
    .line 29
    iput-object p9, p0, Lax/b1/g;->w:[B

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lax/b1/g;->a:Ljava/util/List;

    .line 33
    .line 34
    goto :goto_2e

    .line 35
    :cond_22
    invoke-static {p5}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lax/b1/g;->a:Ljava/util/List;

    .line 46
    .line 47
    :goto_2e
    iput-object p10, p0, Lax/b1/g;->h:Ljava/util/HashMap;

    .line 48
    .line 49
    iput-object p11, p0, Lax/b1/g;->l:Lax/b1/S;

    .line 50
    .line 51
    new-instance p1, Lax/S0/m;

    .line 52
    .line 53
    invoke-direct {p1}, Lax/S0/m;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lax/b1/g;->i:Lax/S0/m;

    .line 57
    .line 58
    iput-object p13, p0, Lax/b1/g;->j:Lax/m1/m;

    .line 59
    .line 60
    iput-object p14, p0, Lax/b1/g;->k:Lax/Z0/I1;

    .line 61
    .line 62
    const/4 p1, 0x2

    .line 63
    iput p1, p0, Lax/b1/g;->p:I

    .line 64
    .line 65
    iput-object p12, p0, Lax/b1/g;->n:Landroid/os/Looper;

    .line 66
    .line 67
    new-instance p1, Lax/b1/g$e;

    .line 68
    .line 69
    invoke-direct {p1, p0, p12}, Lax/b1/g$e;-><init>(Lax/b1/g;Landroid/os/Looper;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lax/b1/g;->o:Lax/b1/g$e;

    .line 73
    .line 74
    return-void
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
.end method

.method private C(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/g;->y:Lax/b1/E$d;

    .line 2
    .line 3
    if-ne p1, v0, :cond_34

    .line 4
    .line 5
    iget p1, p0, Lax/b1/g;->p:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p1, v0, :cond_10

    .line 9
    .line 10
    invoke-direct {p0}, Lax/b1/g;->u()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_10

    .line 15
    .line 16
    goto :goto_34

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lax/b1/g;->y:Lax/b1/E$d;

    .line 19
    .line 20
    instance-of p1, p2, Ljava/lang/Exception;

    .line 21
    .line 22
    if-eqz p1, :cond_20

    .line 23
    .line 24
    iget-object p1, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Exception;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-interface {p1, p2, v0}, Lax/b1/g$a;->a(Ljava/lang/Exception;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    :try_start_20
    iget-object p1, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 34
    .line 35
    check-cast p2, [B

    .line 36
    .line 37
    invoke-interface {p1, p2}, Lax/b1/E;->l([B)V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_27} :catch_2d

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 41
    .line 42
    invoke-interface {p1}, Lax/b1/g$a;->c()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_2d
    move-exception p1

    .line 47
    iget-object p2, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-interface {p2, p1, v0}, Lax/b1/g$a;->a(Ljava/lang/Exception;Z)V

    .line 51
    .line 52
    .line 53
    :cond_34
    :goto_34
    return-void
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

.method private D()Z
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/b1/g;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    :try_start_8
    iget-object v0, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/b1/E;->e()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/b1/g;->v:[B

    .line 16
    .line 17
    iget-object v2, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 18
    .line 19
    iget-object v3, p0, Lax/b1/g;->k:Lax/Z0/I1;

    .line 20
    .line 21
    invoke-interface {v2, v0, v3}, Lax/b1/E;->i([BLax/Z0/I1;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 25
    .line 26
    iget-object v2, p0, Lax/b1/g;->v:[B

    .line 27
    .line 28
    invoke-interface {v0, v2}, Lax/b1/E;->c([B)Lax/V0/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lax/b1/g;->t:Lax/V0/b;

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    iput v0, p0, Lax/b1/g;->p:I

    .line 36
    .line 37
    new-instance v2, Lax/b1/b;

    .line 38
    .line 39
    invoke-direct {v2, v0}, Lax/b1/b;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v2}, Lax/b1/g;->q(Lax/S0/l;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 46
    .line 47
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_31
    .catch Landroid/media/NotProvisionedException; {:try_start_8 .. :try_end_31} :catch_45
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_31} :catch_34
    .catch Ljava/lang/NoSuchMethodError; {:try_start_8 .. :try_end_31} :catch_32

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :catch_32
    move-exception v0

    .line 52
    goto :goto_35

    .line 53
    :catch_34
    move-exception v0

    .line 54
    :goto_35
    invoke-static {v0}, Lax/b1/A;->d(Ljava/lang/Throwable;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_41

    .line 59
    .line 60
    iget-object v0, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 61
    .line 62
    invoke-interface {v0, p0}, Lax/b1/g$a;->b(Lax/b1/g;)V

    .line 63
    .line 64
    .line 65
    goto :goto_4a

    .line 66
    :cond_41
    invoke-direct {p0, v0, v1}, Lax/b1/g;->v(Ljava/lang/Throwable;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_4a

    .line 70
    :catch_45
    iget-object v0, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 71
    .line 72
    invoke-interface {v0, p0}, Lax/b1/g$a;->b(Lax/b1/g;)V

    .line 73
    .line 74
    .line 75
    :goto_4a
    const/4 v0, 0x0

    .line 76
    return v0
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

.method private E([BIZ)V
    .registers 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 2
    .line 3
    iget-object v1, p0, Lax/b1/g;->a:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lax/b1/g;->h:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-interface {v0, p1, v1, p2, v2}, Lax/b1/E;->m([BLjava/util/List;ILjava/util/HashMap;)Lax/b1/E$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lax/b1/g;->x:Lax/b1/E$a;

    .line 12
    .line 13
    iget-object p1, p0, Lax/b1/g;->s:Lax/b1/g$c;

    .line 14
    .line 15
    invoke-static {p1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lax/b1/g$c;

    .line 20
    .line 21
    iget-object p2, p0, Lax/b1/g;->x:Lax/b1/E$a;

    .line 22
    .line 23
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-virtual {p1, v0, p2, p3}, Lax/b1/g$c;->b(ILjava/lang/Object;Z)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_1e} :catch_21
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_1e} :catch_1f

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    goto :goto_22

    .line 34
    :catch_21
    move-exception p1

    .line 35
    :goto_22
    const/4 p2, 0x1

    .line 36
    invoke-direct {p0, p1, p2}, Lax/b1/g;->x(Ljava/lang/Throwable;Z)V

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

.method private G()Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_1
    iget-object v1, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 3
    .line 4
    iget-object v2, p0, Lax/b1/g;->v:[B

    .line 5
    .line 6
    iget-object v3, p0, Lax/b1/g;->w:[B

    .line 7
    .line 8
    invoke-interface {v1, v2, v3}, Lax/b1/E;->g([B[B)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_a} :catch_d
    .catch Ljava/lang/NoSuchMethodError; {:try_start_1 .. :try_end_a} :catch_b

    .line 9
    .line 10
    .line 11
    return v0

    .line 12
    :catch_b
    move-exception v1

    .line 13
    goto :goto_e

    .line 14
    :catch_d
    move-exception v1

    .line 15
    :goto_e
    invoke-direct {p0, v1, v0}, Lax/b1/g;->v(Ljava/lang/Throwable;I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method private H()V
    .registers 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/b1/g;->n:Landroid/os/Looper;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_41

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "\nExpected thread: "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lax/b1/g;->n:Landroid/os/Looper;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v2, "DefaultDrmSession"

    .line 62
    .line 63
    invoke-static {v2, v0, v1}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :cond_41
    return-void
    .line 67
    .line 68
.end method

.method public static synthetic i(Ljava/lang/Throwable;Lax/b1/u$a;)V
    .registers 2

    .line 1
    check-cast p0, Ljava/lang/Exception;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lax/b1/u$a;->l(Ljava/lang/Exception;)V

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

.method public static synthetic j(ILax/b1/u$a;)V
    .registers 2

    .line 1
    invoke-virtual {p1, p0}, Lax/b1/u$a;->k(I)V

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

.method static synthetic k(Lax/b1/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/b1/g;->C(Ljava/lang/Object;Ljava/lang/Object;)V

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

.method static synthetic l(Lax/b1/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/b1/g;->w(Ljava/lang/Object;Ljava/lang/Object;)V

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

.method static synthetic m(Lax/b1/g;)Ljava/util/UUID;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/g;->m:Ljava/util/UUID;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic n(Lax/b1/g;)Lax/b1/S;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/g;->l:Lax/b1/S;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic o(Lax/b1/g;)Lax/m1/m;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/g;->j:Lax/m1/m;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic p(Lax/b1/g;)Lax/b1/g$e;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/g;->o:Lax/b1/g$e;

    .line 2
    .line 3
    return-object p0
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

.method private q(Lax/S0/l;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/l<",
            "Lax/b1/u$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b1/g;->i:Lax/S0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/m;->H()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1a

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lax/b1/u$a;

    .line 22
    .line 23
    invoke-interface {p1, v1}, Lax/S0/l;->accept(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_a

    .line 27
    :cond_1a
    return-void
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

.method private r(Z)V
    .registers 10

    .line 1
    iget-boolean v0, p0, Lax/b1/g;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_4d

    .line 6
    :cond_5
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 7
    .line 8
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    iget v1, p0, Lax/b1/g;->e:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x2

    .line 18
    if-eqz v1, :cond_39

    .line 19
    .line 20
    if-eq v1, v2, :cond_39

    .line 21
    .line 22
    if-eq v1, v3, :cond_2b

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq v1, v0, :cond_1b

    .line 26
    .line 27
    goto :goto_4d

    .line 28
    :cond_1b
    iget-object v1, p0, Lax/b1/g;->w:[B

    .line 29
    .line 30
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lax/b1/g;->v:[B

    .line 34
    .line 35
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lax/b1/g;->w:[B

    .line 39
    .line 40
    invoke-direct {p0, v1, v0, p1}, Lax/b1/g;->E([BIZ)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    iget-object v1, p0, Lax/b1/g;->w:[B

    .line 45
    .line 46
    if-eqz v1, :cond_35

    .line 47
    .line 48
    invoke-direct {p0}, Lax/b1/g;->G()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4d

    .line 53
    .line 54
    :cond_35
    invoke-direct {p0, v0, v3, p1}, Lax/b1/g;->E([BIZ)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_39
    iget-object v1, p0, Lax/b1/g;->w:[B

    .line 59
    .line 60
    if-nez v1, :cond_41

    .line 61
    .line 62
    invoke-direct {p0, v0, v2, p1}, Lax/b1/g;->E([BIZ)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    iget v1, p0, Lax/b1/g;->p:I

    .line 67
    .line 68
    const/4 v2, 0x4

    .line 69
    if-eq v1, v2, :cond_4e

    .line 70
    .line 71
    invoke-direct {p0}, Lax/b1/g;->G()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4d

    .line 76
    .line 77
    goto :goto_4e

    .line 78
    :cond_4d
    :goto_4d
    return-void

    .line 79
    :cond_4e
    :goto_4e
    invoke-direct {p0}, Lax/b1/g;->s()J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    iget v1, p0, Lax/b1/g;->e:I

    .line 84
    .line 85
    if-nez v1, :cond_76

    .line 86
    .line 87
    const-wide/16 v6, 0x3c

    .line 88
    .line 89
    cmp-long v1, v4, v6

    .line 90
    .line 91
    if-gtz v1, :cond_76

    .line 92
    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v2, "Offline license has expired or will expire soon. Remaining seconds: "

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-string v2, "DefaultDrmSession"

    .line 111
    .line 112
    invoke-static {v2, v1}, Lax/S0/u;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, v0, v3, p1}, Lax/b1/g;->E([BIZ)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_76
    const-wide/16 v0, 0x0

    .line 120
    .line 121
    cmp-long p1, v4, v0

    .line 122
    .line 123
    if-gtz p1, :cond_85

    .line 124
    .line 125
    new-instance p1, Lax/b1/Q;

    .line 126
    .line 127
    invoke-direct {p1}, Lax/b1/Q;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, p1, v3}, Lax/b1/g;->v(Ljava/lang/Throwable;I)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_85
    iput v2, p0, Lax/b1/g;->p:I

    .line 135
    .line 136
    new-instance p1, Lax/b1/f;

    .line 137
    .line 138
    invoke-direct {p1}, Lax/b1/f;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0, p1}, Lax/b1/g;->q(Lax/S0/l;)V

    .line 142
    .line 143
    .line 144
    return-void
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

.method private s()J
    .registers 6

    .line 1
    sget-object v0, Lax/P0/i;->d:Ljava/util/UUID;

    .line 2
    .line 3
    iget-object v1, p0, Lax/b1/g;->m:Ljava/util/UUID;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_10

    .line 10
    .line 11
    const-wide v0, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_10
    invoke-static {p0}, Lax/b1/V;->b(Lax/b1/n;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/util/Pair;

    .line 26
    .line 27
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0
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

.method private u()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/b1/g;->p:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_b

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_b
    :goto_b
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private v(Ljava/lang/Throwable;I)V
    .registers 4

    .line 1
    new-instance v0, Lax/b1/n$a;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lax/b1/A;->b(Ljava/lang/Throwable;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-direct {v0, p1, p2}, Lax/b1/n$a;-><init>(Ljava/lang/Throwable;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/b1/g;->u:Lax/b1/n$a;

    .line 11
    .line 12
    const-string p2, "DefaultDrmSession"

    .line 13
    .line 14
    const-string v0, "DRM session error"

    .line 15
    .line 16
    invoke-static {p2, v0, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    instance-of p2, p1, Ljava/lang/Exception;

    .line 20
    .line 21
    if-eqz p2, :cond_1f

    .line 22
    .line 23
    new-instance p2, Lax/b1/e;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Lax/b1/e;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p2}, Lax/b1/g;->q(Lax/S0/l;)V

    .line 29
    .line 30
    .line 31
    goto :goto_33

    .line 32
    :cond_1f
    instance-of p2, p1, Ljava/lang/Error;

    .line 33
    .line 34
    if-eqz p2, :cond_3c

    .line 35
    .line 36
    invoke-static {p1}, Lax/b1/A;->e(Ljava/lang/Throwable;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_33

    .line 41
    .line 42
    invoke-static {p1}, Lax/b1/A;->d(Ljava/lang/Throwable;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_30

    .line 47
    .line 48
    goto :goto_33

    .line 49
    :cond_30
    check-cast p1, Ljava/lang/Error;

    .line 50
    .line 51
    throw p1

    .line 52
    :cond_33
    :goto_33
    iget p1, p0, Lax/b1/g;->p:I

    .line 53
    .line 54
    const/4 p2, 0x4

    .line 55
    if-eq p1, p2, :cond_3b

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    iput p1, p0, Lax/b1/g;->p:I

    .line 59
    .line 60
    :cond_3b
    return-void

    .line 61
    :cond_3c
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "Unexpected Throwable subclass"

    .line 64
    .line 65
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p2
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

.method private w(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/g;->x:Lax/b1/E$a;

    .line 2
    .line 3
    if-ne p1, v0, :cond_69

    .line 4
    .line 5
    invoke-direct {p0}, Lax/b1/g;->u()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_b

    .line 10
    .line 11
    goto :goto_69

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lax/b1/g;->x:Lax/b1/E$a;

    .line 14
    .line 15
    instance-of p1, p2, Ljava/lang/Exception;

    .line 16
    .line 17
    if-nez p1, :cond_63

    .line 18
    .line 19
    instance-of p1, p2, Ljava/lang/NoSuchMethodError;

    .line 20
    .line 21
    if-eqz p1, :cond_17

    .line 22
    .line 23
    goto :goto_63

    .line 24
    :cond_17
    :try_start_17
    check-cast p2, [B

    .line 25
    .line 26
    iget p1, p0, Lax/b1/g;->e:I

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    if-ne p1, v0, :cond_38

    .line 30
    .line 31
    iget-object p1, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 32
    .line 33
    iget-object v0, p0, Lax/b1/g;->w:[B

    .line 34
    .line 35
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    invoke-interface {p1, v0, p2}, Lax/b1/E;->j([B[B)[B

    .line 42
    .line 43
    .line 44
    new-instance p1, Lax/b1/c;

    .line 45
    .line 46
    invoke-direct {p1}, Lax/b1/c;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1}, Lax/b1/g;->q(Lax/S0/l;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catch_34
    move-exception p1

    .line 54
    goto :goto_5e

    .line 55
    :catch_36
    move-exception p1

    .line 56
    goto :goto_5e

    .line 57
    :cond_38
    iget-object p1, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 58
    .line 59
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 60
    .line 61
    invoke-interface {p1, v0, p2}, Lax/b1/E;->j([B[B)[B

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget p2, p0, Lax/b1/g;->e:I

    .line 66
    .line 67
    const/4 v0, 0x2

    .line 68
    if-eq p2, v0, :cond_4b

    .line 69
    .line 70
    if-nez p2, :cond_52

    .line 71
    .line 72
    iget-object p2, p0, Lax/b1/g;->w:[B

    .line 73
    .line 74
    if-eqz p2, :cond_52

    .line 75
    .line 76
    :cond_4b
    if-eqz p1, :cond_52

    .line 77
    .line 78
    array-length p2, p1

    .line 79
    if-eqz p2, :cond_52

    .line 80
    .line 81
    iput-object p1, p0, Lax/b1/g;->w:[B

    .line 82
    .line 83
    :cond_52
    const/4 p1, 0x4

    .line 84
    iput p1, p0, Lax/b1/g;->p:I

    .line 85
    .line 86
    new-instance p1, Lax/b1/d;

    .line 87
    .line 88
    invoke-direct {p1}, Lax/b1/d;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, p1}, Lax/b1/g;->q(Lax/S0/l;)V
    :try_end_5d
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_5d} :catch_36
    .catch Ljava/lang/NoSuchMethodError; {:try_start_17 .. :try_end_5d} :catch_34

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :goto_5e
    const/4 p2, 0x1

    .line 96
    invoke-direct {p0, p1, p2}, Lax/b1/g;->x(Ljava/lang/Throwable;Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_69

    .line 100
    :cond_63
    :goto_63
    check-cast p2, Ljava/lang/Throwable;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    invoke-direct {p0, p2, p1}, Lax/b1/g;->x(Ljava/lang/Throwable;Z)V

    .line 104
    .line 105
    .line 106
    :cond_69
    :goto_69
    return-void
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

.method private x(Ljava/lang/Throwable;Z)V
    .registers 4

    .line 1
    instance-of v0, p1, Landroid/media/NotProvisionedException;

    .line 2
    .line 3
    if-nez v0, :cond_14

    .line 4
    .line 5
    invoke-static {p1}, Lax/b1/A;->d(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_14

    .line 12
    :cond_b
    if-eqz p2, :cond_f

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 p2, 0x2

    .line 17
    :goto_10
    invoke-direct {p0, p1, p2}, Lax/b1/g;->v(Ljava/lang/Throwable;I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    :goto_14
    iget-object p1, p0, Lax/b1/g;->c:Lax/b1/g$a;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Lax/b1/g$a;->b(Lax/b1/g;)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method private y()V
    .registers 3

    .line 1
    iget v0, p0, Lax/b1/g;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    iget v0, p0, Lax/b1/g;->p:I

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    if-ne v0, v1, :cond_12

    .line 9
    .line 10
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 11
    .line 12
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lax/b1/g;->r(Z)V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method A()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/b1/g;->D()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, v0}, Lax/b1/g;->r(Z)V

    .line 9
    .line 10
    .line 11
    :cond_a
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

.method B(Ljava/lang/Exception;Z)V
    .registers 3

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 p2, 0x3

    .line 6
    :goto_5
    invoke-direct {p0, p1, p2}, Lax/b1/g;->v(Ljava/lang/Throwable;I)V

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

.method F()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b1/E;->b()Lax/b1/E$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lax/b1/g;->y:Lax/b1/E$d;

    .line 8
    .line 9
    iget-object v0, p0, Lax/b1/g;->s:Lax/b1/g$c;

    .line 10
    .line 11
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/b1/g$c;

    .line 16
    .line 17
    iget-object v1, p0, Lax/b1/g;->y:Lax/b1/E$d;

    .line 18
    .line 19
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v0, v2, v1, v2}, Lax/b1/g$c;->b(ILjava/lang/Object;Z)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public a(Lax/b1/u$a;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lax/b1/g;->q:I

    .line 5
    .line 6
    if-gtz v0, :cond_f

    .line 7
    .line 8
    const-string p1, "DefaultDrmSession"

    .line 9
    .line 10
    const-string v0, "release() called on a session that\'s already fully released."

    .line 11
    .line 12
    invoke-static {p1, v0}, Lax/S0/u;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, Lax/b1/g;->q:I

    .line 19
    .line 20
    if-nez v0, :cond_51

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lax/b1/g;->p:I

    .line 24
    .line 25
    iget-object v0, p0, Lax/b1/g;->o:Lax/b1/g$e;

    .line 26
    .line 27
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/b1/g$e;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lax/b1/g;->s:Lax/b1/g$c;

    .line 38
    .line 39
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lax/b1/g$c;

    .line 44
    .line 45
    invoke-virtual {v0}, Lax/b1/g$c;->c()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lax/b1/g;->s:Lax/b1/g$c;

    .line 49
    .line 50
    iget-object v0, p0, Lax/b1/g;->r:Landroid/os/HandlerThread;

    .line 51
    .line 52
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/os/HandlerThread;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lax/b1/g;->r:Landroid/os/HandlerThread;

    .line 62
    .line 63
    iput-object v1, p0, Lax/b1/g;->t:Lax/V0/b;

    .line 64
    .line 65
    iput-object v1, p0, Lax/b1/g;->u:Lax/b1/n$a;

    .line 66
    .line 67
    iput-object v1, p0, Lax/b1/g;->x:Lax/b1/E$a;

    .line 68
    .line 69
    iput-object v1, p0, Lax/b1/g;->y:Lax/b1/E$d;

    .line 70
    .line 71
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 72
    .line 73
    if-eqz v0, :cond_51

    .line 74
    .line 75
    iget-object v2, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 76
    .line 77
    invoke-interface {v2, v0}, Lax/b1/E;->h([B)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lax/b1/g;->v:[B

    .line 81
    .line 82
    :cond_51
    if-eqz p1, :cond_63

    .line 83
    .line 84
    iget-object v0, p0, Lax/b1/g;->i:Lax/S0/m;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Lax/S0/m;->h(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lax/b1/g;->i:Lax/S0/m;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Lax/S0/m;->g(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_63

    .line 96
    .line 97
    invoke-virtual {p1}, Lax/b1/u$a;->m()V

    .line 98
    .line 99
    .line 100
    :cond_63
    iget-object p1, p0, Lax/b1/g;->d:Lax/b1/g$b;

    .line 101
    .line 102
    iget v0, p0, Lax/b1/g;->q:I

    .line 103
    .line 104
    invoke-interface {p1, p0, v0}, Lax/b1/g$b;->b(Lax/b1/g;I)V

    .line 105
    .line 106
    .line 107
    return-void
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

.method public final b()Ljava/util/UUID;
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/b1/g;->m:Ljava/util/UUID;

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
.end method

.method public c(Lax/b1/u$a;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lax/b1/g;->q:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-gez v0, :cond_22

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Session reference count less than zero: "

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lax/b1/g;->q:I

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, "DefaultDrmSession"

    .line 29
    .line 30
    invoke-static {v2, v0}, Lax/S0/u;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput v1, p0, Lax/b1/g;->q:I

    .line 34
    .line 35
    :cond_22
    if-eqz p1, :cond_29

    .line 36
    .line 37
    iget-object v0, p0, Lax/b1/g;->i:Lax/S0/m;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lax/S0/m;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    iget v0, p0, Lax/b1/g;->q:I

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    add-int/2addr v0, v2

    .line 46
    iput v0, p0, Lax/b1/g;->q:I

    .line 47
    .line 48
    if-ne v0, v2, :cond_5d

    .line 49
    .line 50
    iget p1, p0, Lax/b1/g;->p:I

    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    if-ne p1, v0, :cond_37

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    :cond_37
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Landroid/os/HandlerThread;

    .line 60
    .line 61
    const-string v0, "ExoPlayer:DrmRequestHandler"

    .line 62
    .line 63
    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lax/b1/g;->r:Landroid/os/HandlerThread;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lax/b1/g$c;

    .line 72
    .line 73
    iget-object v0, p0, Lax/b1/g;->r:Landroid/os/HandlerThread;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p1, p0, v0}, Lax/b1/g$c;-><init>(Lax/b1/g;Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lax/b1/g;->s:Lax/b1/g$c;

    .line 83
    .line 84
    invoke-direct {p0}, Lax/b1/g;->D()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_72

    .line 89
    .line 90
    invoke-direct {p0, v2}, Lax/b1/g;->r(Z)V

    .line 91
    .line 92
    .line 93
    goto :goto_72

    .line 94
    :cond_5d
    if-eqz p1, :cond_72

    .line 95
    .line 96
    invoke-direct {p0}, Lax/b1/g;->u()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_72

    .line 101
    .line 102
    iget-object v0, p0, Lax/b1/g;->i:Lax/S0/m;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Lax/S0/m;->g(Ljava/lang/Object;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-ne v0, v2, :cond_72

    .line 109
    .line 110
    iget v0, p0, Lax/b1/g;->p:I

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lax/b1/u$a;->k(I)V

    .line 113
    .line 114
    .line 115
    :cond_72
    :goto_72
    iget-object p1, p0, Lax/b1/g;->d:Lax/b1/g$b;

    .line 116
    .line 117
    iget v0, p0, Lax/b1/g;->q:I

    .line 118
    .line 119
    invoke-interface {p1, p0, v0}, Lax/b1/g$b;->a(Lax/b1/g;I)V

    .line 120
    .line 121
    .line 122
    return-void
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

.method public d()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lax/b1/g;->f:Z

    .line 5
    .line 6
    return v0
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

.method public e()Ljava/util/Map;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 5
    .line 6
    if-nez v0, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v1, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Lax/b1/E;->a([B)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f(Ljava/lang/String;)Z
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/b1/g;->b:Lax/b1/E;

    .line 5
    .line 6
    iget-object v1, p0, Lax/b1/g;->v:[B

    .line 7
    .line 8
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, [B

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Lax/b1/E;->f([BLjava/lang/String;)Z

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

.method public final g()Lax/b1/n$a;
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lax/b1/g;->p:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne v0, v1, :cond_b

    .line 8
    .line 9
    iget-object v0, p0, Lax/b1/g;->u:Lax/b1/n$a;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getState()I
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lax/b1/g;->p:I

    .line 5
    .line 6
    return v0
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

.method public final h()Lax/V0/b;
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/b1/g;->t:Lax/V0/b;

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
.end method

.method public t([B)Z
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/b1/g;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/b1/g;->v:[B

    .line 5
    .line 6
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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

.method z(I)V
    .registers 3

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_4

    .line 3
    .line 4
    return-void

    .line 5
    :cond_4
    invoke-direct {p0}, Lax/b1/g;->y()V

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
.end method
