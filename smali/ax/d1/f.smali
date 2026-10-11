.class public final Lax/d1/f;
.super Lax/d1/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d1/f$d;,
        Lax/d1/f$f;,
        Lax/d1/f$h;,
        Lax/d1/f$b;,
        Lax/d1/f$c;,
        Lax/d1/f$e;,
        Lax/d1/f$g;
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:J

.field public final f:Z

.field public final g:Z

.field public final h:J

.field public final i:Z

.field public final j:I

.field public final k:J

.field public final l:I

.field public final m:J

.field public final n:J

.field public final o:Z

.field public final p:Z

.field public final q:Lax/P0/o;

.field public final r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/d1/f$f;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/d1/f$d;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Lax/d1/f$e;",
            ">;"
        }
    .end annotation
.end field

.field public final u:J

.field public final v:Lax/d1/f$h;

.field public final w:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/d1/f$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLax/P0/o;Ljava/util/List;Ljava/util/List;Lax/d1/f$h;Ljava/util/Map;Ljava/util/List;)V
    .registers 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;JZJZIJIJJZZZ",
            "Lax/P0/o;",
            "Ljava/util/List<",
            "Lax/d1/f$f;",
            ">;",
            "Ljava/util/List<",
            "Lax/d1/f$d;",
            ">;",
            "Lax/d1/f$h;",
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Lax/d1/f$e;",
            ">;",
            "Ljava/util/List<",
            "Lax/d1/f$c;",
            ">;)V"
        }
    .end annotation

    move/from16 v0, p18

    .line 1
    invoke-direct {p0, p2, p3, v0}, Lax/d1/j;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 2
    iput p1, p0, Lax/d1/f;->d:I

    .line 3
    iput-wide p7, p0, Lax/d1/f;->h:J

    .line 4
    iput-boolean p6, p0, Lax/d1/f;->g:Z

    .line 5
    iput-boolean p9, p0, Lax/d1/f;->i:Z

    .line 6
    iput p10, p0, Lax/d1/f;->j:I

    move-wide p1, p11

    .line 7
    iput-wide p1, p0, Lax/d1/f;->k:J

    move/from16 p1, p13

    .line 8
    iput p1, p0, Lax/d1/f;->l:I

    move-wide/from16 p1, p14

    .line 9
    iput-wide p1, p0, Lax/d1/f;->m:J

    move-wide/from16 p1, p16

    .line 10
    iput-wide p1, p0, Lax/d1/f;->n:J

    move/from16 p1, p19

    .line 11
    iput-boolean p1, p0, Lax/d1/f;->o:Z

    move/from16 p1, p20

    .line 12
    iput-boolean p1, p0, Lax/d1/f;->p:Z

    move-object/from16 p1, p21

    .line 13
    iput-object p1, p0, Lax/d1/f;->q:Lax/P0/o;

    .line 14
    invoke-static/range {p22 .. p22}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    move-result-object p1

    iput-object p1, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 15
    invoke-static/range {p23 .. p23}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    move-result-object p1

    iput-object p1, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 16
    invoke-static/range {p25 .. p25}, Lax/r7/A;->c(Ljava/util/Map;)Lax/r7/A;

    move-result-object p1

    iput-object p1, p0, Lax/d1/f;->t:Ljava/util/Map;

    .line 17
    invoke-static/range {p26 .. p26}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    move-result-object p1

    iput-object p1, p0, Lax/d1/f;->w:Lax/r7/z;

    .line 18
    invoke-interface/range {p23 .. p23}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const-wide/16 p2, 0x0

    if-nez p1, :cond_58

    .line 19
    invoke-static/range {p23 .. p23}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/d1/f$d;

    .line 20
    iget-wide v0, p1, Lax/d1/f$g;->f0:J

    iget-wide v2, p1, Lax/d1/f$g;->d0:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lax/d1/f;->u:J

    goto :goto_6e

    .line 21
    :cond_58
    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6c

    .line 22
    invoke-static/range {p22 .. p22}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/d1/f$f;

    .line 23
    iget-wide v0, p1, Lax/d1/f$g;->f0:J

    iget-wide v2, p1, Lax/d1/f$g;->d0:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lax/d1/f;->u:J

    goto :goto_6e

    .line 24
    :cond_6c
    iput-wide p2, p0, Lax/d1/f;->u:J

    :goto_6e
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p4, v0

    if-nez p1, :cond_78

    goto :goto_8a

    :cond_78
    cmp-long p1, p4, p2

    if-ltz p1, :cond_83

    .line 25
    iget-wide v0, p0, Lax/d1/f;->u:J

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    goto :goto_8a

    .line 26
    :cond_83
    iget-wide v0, p0, Lax/d1/f;->u:J

    add-long/2addr v0, p4

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_8a
    iput-wide v0, p0, Lax/d1/f;->e:J

    cmp-long p1, p4, p2

    if-ltz p1, :cond_92

    const/4 p1, 0x1

    goto :goto_93

    :cond_92
    const/4 p1, 0x0

    .line 27
    :goto_93
    iput-boolean p1, p0, Lax/d1/f;->f:Z

    move-object/from16 p1, p24

    .line 28
    iput-object p1, p0, Lax/d1/f;->v:Lax/d1/f$h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/d1/f;->b(Ljava/util/List;)Lax/d1/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public b(Ljava/util/List;)Lax/d1/f;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/P0/L;",
            ">;)",
            "Lax/d1/f;"
        }
    .end annotation

    .line 1
    return-object p0
    .line 2
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

.method public c(JI)Lax/d1/f;
    .registers 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lax/d1/f;

    .line 4
    .line 5
    iget v2, v0, Lax/d1/f;->d:I

    .line 6
    .line 7
    iget-object v3, v0, Lax/d1/j;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lax/d1/j;->b:Ljava/util/List;

    .line 10
    .line 11
    iget-wide v5, v0, Lax/d1/f;->e:J

    .line 12
    .line 13
    iget-boolean v7, v0, Lax/d1/f;->g:Z

    .line 14
    .line 15
    iget-wide v12, v0, Lax/d1/f;->k:J

    .line 16
    .line 17
    iget v14, v0, Lax/d1/f;->l:I

    .line 18
    .line 19
    iget-wide v8, v0, Lax/d1/f;->m:J

    .line 20
    .line 21
    iget-wide v10, v0, Lax/d1/f;->n:J

    .line 22
    .line 23
    iget-boolean v15, v0, Lax/d1/j;->c:Z

    .line 24
    .line 25
    move-object/from16 v16, v1

    .line 26
    .line 27
    iget-boolean v1, v0, Lax/d1/f;->o:Z

    .line 28
    .line 29
    move/from16 v20, v1

    .line 30
    .line 31
    iget-boolean v1, v0, Lax/d1/f;->p:Z

    .line 32
    .line 33
    move/from16 v21, v1

    .line 34
    .line 35
    iget-object v1, v0, Lax/d1/f;->q:Lax/P0/o;

    .line 36
    .line 37
    move-object/from16 v22, v1

    .line 38
    .line 39
    iget-object v1, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 40
    .line 41
    move-object/from16 v23, v1

    .line 42
    .line 43
    iget-object v1, v0, Lax/d1/f;->s:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v24, v1

    .line 46
    .line 47
    iget-object v1, v0, Lax/d1/f;->v:Lax/d1/f$h;

    .line 48
    .line 49
    move-object/from16 v25, v1

    .line 50
    .line 51
    iget-object v1, v0, Lax/d1/f;->t:Ljava/util/Map;

    .line 52
    .line 53
    move-object/from16 v26, v1

    .line 54
    .line 55
    iget-object v1, v0, Lax/d1/f;->w:Lax/r7/z;

    .line 56
    .line 57
    move-wide/from16 v17, v10

    .line 58
    .line 59
    const/4 v10, 0x1

    .line 60
    move/from16 v11, p3

    .line 61
    .line 62
    move-object/from16 v27, v1

    .line 63
    .line 64
    move/from16 v19, v15

    .line 65
    .line 66
    move-object/from16 v1, v16

    .line 67
    .line 68
    move-wide v15, v8

    .line 69
    move-wide/from16 v8, p1

    .line 70
    .line 71
    invoke-direct/range {v1 .. v27}, Lax/d1/f;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLax/P0/o;Ljava/util/List;Ljava/util/List;Lax/d1/f$h;Ljava/util/Map;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    move-object/from16 v16, v1

    .line 75
    .line 76
    return-object v16
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

.method public d()Lax/d1/f;
    .registers 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lax/d1/f;->o:Z

    .line 4
    .line 5
    if-eqz v1, :cond_7

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    new-instance v2, Lax/d1/f;

    .line 9
    .line 10
    iget v3, v0, Lax/d1/f;->d:I

    .line 11
    .line 12
    iget-object v4, v0, Lax/d1/j;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v0, Lax/d1/j;->b:Ljava/util/List;

    .line 15
    .line 16
    iget-wide v6, v0, Lax/d1/f;->e:J

    .line 17
    .line 18
    iget-boolean v8, v0, Lax/d1/f;->g:Z

    .line 19
    .line 20
    iget-wide v9, v0, Lax/d1/f;->h:J

    .line 21
    .line 22
    iget-boolean v11, v0, Lax/d1/f;->i:Z

    .line 23
    .line 24
    iget v12, v0, Lax/d1/f;->j:I

    .line 25
    .line 26
    iget-wide v13, v0, Lax/d1/f;->k:J

    .line 27
    .line 28
    iget v15, v0, Lax/d1/f;->l:I

    .line 29
    .line 30
    move-object/from16 v16, v2

    .line 31
    .line 32
    iget-wide v1, v0, Lax/d1/f;->m:J

    .line 33
    .line 34
    move-wide/from16 v17, v1

    .line 35
    .line 36
    iget-wide v1, v0, Lax/d1/f;->n:J

    .line 37
    .line 38
    move-wide/from16 v19, v1

    .line 39
    .line 40
    iget-boolean v1, v0, Lax/d1/j;->c:Z

    .line 41
    .line 42
    iget-boolean v2, v0, Lax/d1/f;->p:Z

    .line 43
    .line 44
    move/from16 v21, v1

    .line 45
    .line 46
    iget-object v1, v0, Lax/d1/f;->q:Lax/P0/o;

    .line 47
    .line 48
    move-object/from16 v23, v1

    .line 49
    .line 50
    iget-object v1, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 51
    .line 52
    move-object/from16 v24, v1

    .line 53
    .line 54
    iget-object v1, v0, Lax/d1/f;->s:Ljava/util/List;

    .line 55
    .line 56
    move-object/from16 v25, v1

    .line 57
    .line 58
    iget-object v1, v0, Lax/d1/f;->v:Lax/d1/f$h;

    .line 59
    .line 60
    move-object/from16 v26, v1

    .line 61
    .line 62
    iget-object v1, v0, Lax/d1/f;->t:Ljava/util/Map;

    .line 63
    .line 64
    move-object/from16 v27, v1

    .line 65
    .line 66
    iget-object v1, v0, Lax/d1/f;->w:Lax/r7/z;

    .line 67
    .line 68
    move/from16 v22, v2

    .line 69
    .line 70
    move-object/from16 v2, v16

    .line 71
    .line 72
    move-wide/from16 v16, v17

    .line 73
    .line 74
    move-wide/from16 v18, v19

    .line 75
    .line 76
    move/from16 v20, v21

    .line 77
    .line 78
    const/16 v21, 0x1

    .line 79
    .line 80
    move-object/from16 v28, v1

    .line 81
    .line 82
    invoke-direct/range {v2 .. v28}, Lax/d1/f;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLax/P0/o;Ljava/util/List;Ljava/util/List;Lax/d1/f$h;Ljava/util/Map;Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    return-object v2
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

.method public e()J
    .registers 5

    .line 1
    iget-wide v0, p0, Lax/d1/f;->h:J

    .line 2
    .line 3
    iget-wide v2, p0, Lax/d1/f;->u:J

    .line 4
    .line 5
    add-long/2addr v0, v2

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

.method public f(Lax/d1/f;)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_3f

    .line 3
    .line 4
    iget-wide v1, p0, Lax/d1/f;->k:J

    .line 5
    .line 6
    iget-wide v3, p1, Lax/d1/f;->k:J

    .line 7
    .line 8
    cmp-long v5, v1, v3

    .line 9
    .line 10
    if-lez v5, :cond_c

    .line 11
    .line 12
    goto :goto_3f

    .line 13
    :cond_c
    const/4 v5, 0x0

    .line 14
    cmp-long v6, v1, v3

    .line 15
    .line 16
    if-gez v6, :cond_12

    .line 17
    .line 18
    return v5

    .line 19
    :cond_12
    iget-object v1, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p1, Lax/d1/f;->r:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-int/2addr v1, v2

    .line 32
    if-eqz v1, :cond_25

    .line 33
    .line 34
    if-lez v1, :cond_24

    .line 35
    .line 36
    return v0

    .line 37
    :cond_24
    return v5

    .line 38
    :cond_25
    iget-object v1, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v2, p1, Lax/d1/f;->s:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-gt v1, v2, :cond_3f

    .line 51
    .line 52
    if-ne v1, v2, :cond_3e

    .line 53
    .line 54
    iget-boolean v1, p0, Lax/d1/f;->o:Z

    .line 55
    .line 56
    if-eqz v1, :cond_3e

    .line 57
    .line 58
    iget-boolean p1, p1, Lax/d1/f;->o:Z

    .line 59
    .line 60
    if-nez p1, :cond_3e

    .line 61
    .line 62
    goto :goto_3f

    .line 63
    :cond_3e
    return v5

    .line 64
    :cond_3f
    :goto_3f
    return v0
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method
