.class final Lax/P3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Transcode:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/U3/m$a<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/M3/h;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lax/J3/e;

.field private d:Ljava/lang/Object;

.field private e:I

.field private f:I

.field private g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private h:Lax/P3/f$e;

.field private i:Lax/M3/j;

.field private j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscode;>;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:Z

.field private n:Lax/M3/h;

.field private o:Lax/J3/g;

.field private p:Lax/P3/h;

.field private q:Z

.field private r:Z


# direct methods
.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/P3/e;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method a()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 3
    .line 4
    iput-object v0, p0, Lax/P3/e;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lax/P3/e;->n:Lax/M3/h;

    .line 7
    .line 8
    iput-object v0, p0, Lax/P3/e;->g:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object v0, p0, Lax/P3/e;->k:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object v0, p0, Lax/P3/e;->i:Lax/M3/j;

    .line 13
    .line 14
    iput-object v0, p0, Lax/P3/e;->o:Lax/J3/g;

    .line 15
    .line 16
    iput-object v0, p0, Lax/P3/e;->j:Ljava/util/Map;

    .line 17
    .line 18
    iput-object v0, p0, Lax/P3/e;->p:Lax/P3/h;

    .line 19
    .line 20
    iget-object v0, p0, Lax/P3/e;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lax/P3/e;->l:Z

    .line 27
    .line 28
    iget-object v1, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    iput-boolean v0, p0, Lax/P3/e;->m:Z

    .line 34
    .line 35
    return-void
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

.method b()Ljava/util/List;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/M3/h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/P3/e;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_57

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/P3/e;->m:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lax/P3/e;->f()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_16
    if-ge v3, v1, :cond_57

    .line 24
    .line 25
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lax/U3/m$a;

    .line 30
    .line 31
    iget-object v5, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 32
    .line 33
    iget-object v6, v4, Lax/U3/m$a;->a:Lax/M3/h;

    .line 34
    .line 35
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2f

    .line 40
    .line 41
    iget-object v5, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 42
    .line 43
    iget-object v6, v4, Lax/U3/m$a;->a:Lax/M3/h;

    .line 44
    .line 45
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2f
    const/4 v5, 0x0

    .line 49
    :goto_30
    iget-object v6, v4, Lax/U3/m$a;->b:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-ge v5, v6, :cond_54

    .line 56
    .line 57
    iget-object v6, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 58
    .line 59
    iget-object v7, v4, Lax/U3/m$a;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_51

    .line 70
    .line 71
    iget-object v6, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 72
    .line 73
    iget-object v7, v4, Lax/U3/m$a;->b:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_51
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_30

    .line 85
    :cond_54
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_16

    .line 88
    :cond_57
    iget-object v0, p0, Lax/P3/e;->b:Ljava/util/List;

    .line 89
    .line 90
    return-object v0
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

.method c()Lax/R3/a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/e;->h:Lax/P3/f$e;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/P3/f$e;->a()Lax/R3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method d()Lax/P3/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/e;->p:Lax/P3/h;

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

.method e()I
    .registers 2

    .line 1
    iget v0, p0, Lax/P3/e;->f:I

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

.method f()Ljava/util/List;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U3/m$a<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/P3/e;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_3b

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/P3/e;->l:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/P3/e;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lax/P3/e;->d:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lax/J3/h;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_1d
    if-ge v2, v1, :cond_3b

    .line 31
    .line 32
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lax/U3/m;

    .line 37
    .line 38
    iget-object v4, p0, Lax/P3/e;->d:Ljava/lang/Object;

    .line 39
    .line 40
    iget v5, p0, Lax/P3/e;->e:I

    .line 41
    .line 42
    iget v6, p0, Lax/P3/e;->f:I

    .line 43
    .line 44
    iget-object v7, p0, Lax/P3/e;->i:Lax/M3/j;

    .line 45
    .line 46
    invoke-interface {v3, v4, v5, v6, v7}, Lax/U3/m;->a(Ljava/lang/Object;IILax/M3/j;)Lax/U3/m$a;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_38

    .line 51
    .line 52
    iget-object v4, p0, Lax/P3/e;->a:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_38
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_1d

    .line 60
    :cond_3b
    iget-object v0, p0, Lax/P3/e;->a:Ljava/util/List;

    .line 61
    .line 62
    return-object v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method g(Ljava/lang/Class;)Lax/P3/q;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;)",
            "Lax/P3/q<",
            "TData;*TTranscode;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/P3/e;->g:Ljava/lang/Class;

    .line 8
    .line 9
    iget-object v2, p0, Lax/P3/e;->k:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v0, p1, v1, v2}, Lax/J3/h;->e(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lax/P3/q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method h(Ljava/io/File;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Lax/U3/m<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/J3/h$c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/J3/h;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method i()Lax/M3/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/e;->i:Lax/M3/j;

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

.method j()Lax/J3/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/e;->o:Lax/J3/g;

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

.method k()Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/P3/e;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/P3/e;->g:Ljava/lang/Class;

    .line 14
    .line 15
    iget-object v3, p0, Lax/P3/e;->k:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lax/J3/h;->g(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method l(Lax/P3/s;)Lax/M3/l;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/P3/s<",
            "TZ;>;)",
            "Lax/M3/l<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/J3/h;->h(Lax/P3/s;)Lax/M3/l;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method m()Lax/M3/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/e;->n:Lax/M3/h;

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

.method n(Ljava/lang/Object;)Lax/M3/d;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(TX;)",
            "Lax/M3/d<",
            "TX;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/J3/h$e;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/J3/h;->j(Ljava/lang/Object;)Lax/M3/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method o(Ljava/lang/Class;)Lax/M3/m;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TZ;>;)",
            "Lax/M3/m<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->j:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/M3/m;

    .line 8
    .line 9
    if-nez v0, :cond_38

    .line 10
    .line 11
    iget-object v0, p0, Lax/P3/e;->j:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_33

    .line 18
    .line 19
    iget-boolean v0, p0, Lax/P3/e;->q:Z

    .line 20
    .line 21
    if-nez v0, :cond_17

    .line 22
    .line 23
    goto :goto_33

    .line 24
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Missing transformation for "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_33
    :goto_33
    invoke-static {}, Lax/W3/b;->c()Lax/W3/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_38
    return-object v0
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method p()I
    .registers 2

    .line 1
    iget v0, p0, Lax/P3/e;->e:I

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

.method q(Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/P3/e;->g(Ljava/lang/Class;)Lax/P3/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_8
    const/4 p1, 0x0

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

.method r(Lax/J3/e;Ljava/lang/Object;Lax/M3/h;IILax/P3/h;Ljava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/M3/j;Ljava/util/Map;ZZLax/P3/f$e;)Lax/P3/e;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/J3/e;",
            "Ljava/lang/Object;",
            "Lax/M3/h;",
            "II",
            "Lax/P3/h;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lax/J3/g;",
            "Lax/M3/j;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;ZZ",
            "Lax/P3/f$e;",
            ")",
            "Lax/P3/e<",
            "TR;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    iput-object p2, p0, Lax/P3/e;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lax/P3/e;->n:Lax/M3/h;

    .line 6
    .line 7
    iput p4, p0, Lax/P3/e;->e:I

    .line 8
    .line 9
    iput p5, p0, Lax/P3/e;->f:I

    .line 10
    .line 11
    iput-object p6, p0, Lax/P3/e;->p:Lax/P3/h;

    .line 12
    .line 13
    iput-object p7, p0, Lax/P3/e;->g:Ljava/lang/Class;

    .line 14
    .line 15
    iput-object p14, p0, Lax/P3/e;->h:Lax/P3/f$e;

    .line 16
    .line 17
    iput-object p8, p0, Lax/P3/e;->k:Ljava/lang/Class;

    .line 18
    .line 19
    iput-object p9, p0, Lax/P3/e;->o:Lax/J3/g;

    .line 20
    .line 21
    iput-object p10, p0, Lax/P3/e;->i:Lax/M3/j;

    .line 22
    .line 23
    iput-object p11, p0, Lax/P3/e;->j:Ljava/util/Map;

    .line 24
    .line 25
    iput-boolean p12, p0, Lax/P3/e;->q:Z

    .line 26
    .line 27
    iput-boolean p13, p0, Lax/P3/e;->r:Z

    .line 28
    .line 29
    return-object p0
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

.method s(Lax/P3/s;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/e;->c:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/J3/h;->k(Lax/P3/s;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method t()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/P3/e;->r:Z

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

.method u(Lax/M3/h;)Z
    .registers 7

    .line 1
    invoke-virtual {p0}, Lax/P3/e;->f()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v1, :cond_1f

    .line 12
    .line 13
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lax/U3/m$a;

    .line 18
    .line 19
    iget-object v4, v4, Lax/U3/m$a;->a:Lax/M3/h;

    .line 20
    .line 21
    invoke-interface {v4, p1}, Lax/M3/h;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1c

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1c
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_a

    .line 32
    :cond_1f
    return v2
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
