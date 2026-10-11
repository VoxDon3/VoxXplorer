.class public final Lax/P0/y$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private d:Lax/P0/y$d$a;

.field private e:Lax/P0/y$f$a;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/L;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/P0/y$k;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/Object;

.field private j:J

.field private k:Lax/P0/A;

.field private l:Lax/P0/y$g$a;

.field private m:Lax/P0/y$i;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lax/P0/y$d$a;

    invoke-direct {v0}, Lax/P0/y$d$a;-><init>()V

    iput-object v0, p0, Lax/P0/y$c;->d:Lax/P0/y$d$a;

    .line 4
    new-instance v0, Lax/P0/y$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lax/P0/y$f$a;-><init>(Lax/P0/y$a;)V

    iput-object v0, p0, Lax/P0/y$c;->e:Lax/P0/y$f$a;

    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lax/P0/y$c;->f:Ljava/util/List;

    .line 6
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$c;->h:Lax/r7/z;

    .line 7
    new-instance v0, Lax/P0/y$g$a;

    invoke-direct {v0}, Lax/P0/y$g$a;-><init>()V

    iput-object v0, p0, Lax/P0/y$c;->l:Lax/P0/y$g$a;

    .line 8
    sget-object v0, Lax/P0/y$i;->d:Lax/P0/y$i;

    iput-object v0, p0, Lax/P0/y$c;->m:Lax/P0/y$i;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide v0, p0, Lax/P0/y$c;->j:J

    return-void
.end method

.method private constructor <init>(Lax/P0/y;)V
    .registers 4

    .line 10
    invoke-direct {p0}, Lax/P0/y$c;-><init>()V

    .line 11
    iget-object v0, p1, Lax/P0/y;->f:Lax/P0/y$d;

    invoke-virtual {v0}, Lax/P0/y$d;->a()Lax/P0/y$d$a;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$c;->d:Lax/P0/y$d$a;

    .line 12
    iget-object v0, p1, Lax/P0/y;->a:Ljava/lang/String;

    iput-object v0, p0, Lax/P0/y$c;->a:Ljava/lang/String;

    .line 13
    iget-object v0, p1, Lax/P0/y;->e:Lax/P0/A;

    iput-object v0, p0, Lax/P0/y$c;->k:Lax/P0/A;

    .line 14
    iget-object v0, p1, Lax/P0/y;->d:Lax/P0/y$g;

    invoke-virtual {v0}, Lax/P0/y$g;->a()Lax/P0/y$g$a;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$c;->l:Lax/P0/y$g$a;

    .line 15
    iget-object v0, p1, Lax/P0/y;->h:Lax/P0/y$i;

    iput-object v0, p0, Lax/P0/y$c;->m:Lax/P0/y$i;

    .line 16
    iget-object p1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    if-eqz p1, :cond_50

    .line 17
    iget-object v0, p1, Lax/P0/y$h;->e:Ljava/lang/String;

    iput-object v0, p0, Lax/P0/y$c;->g:Ljava/lang/String;

    .line 18
    iget-object v0, p1, Lax/P0/y$h;->b:Ljava/lang/String;

    iput-object v0, p0, Lax/P0/y$c;->c:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Lax/P0/y$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Lax/P0/y$c;->b:Landroid/net/Uri;

    .line 20
    iget-object v0, p1, Lax/P0/y$h;->d:Ljava/util/List;

    iput-object v0, p0, Lax/P0/y$c;->f:Ljava/util/List;

    .line 21
    iget-object v0, p1, Lax/P0/y$h;->f:Lax/r7/z;

    iput-object v0, p0, Lax/P0/y$c;->h:Lax/r7/z;

    .line 22
    iget-object v0, p1, Lax/P0/y$h;->h:Ljava/lang/Object;

    iput-object v0, p0, Lax/P0/y$c;->i:Ljava/lang/Object;

    .line 23
    iget-object v0, p1, Lax/P0/y$h;->c:Lax/P0/y$f;

    if-eqz v0, :cond_44

    .line 24
    invoke-virtual {v0}, Lax/P0/y$f;->b()Lax/P0/y$f$a;

    move-result-object v0

    goto :goto_4a

    .line 25
    :cond_44
    new-instance v0, Lax/P0/y$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lax/P0/y$f$a;-><init>(Lax/P0/y$a;)V

    :goto_4a
    iput-object v0, p0, Lax/P0/y$c;->e:Lax/P0/y$f$a;

    .line 26
    iget-wide v0, p1, Lax/P0/y$h;->i:J

    iput-wide v0, p0, Lax/P0/y$c;->j:J

    :cond_50
    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$c;-><init>(Lax/P0/y;)V

    return-void
.end method


# virtual methods
.method public a()Lax/P0/y;
    .registers 14

    .line 1
    iget-object v0, p0, Lax/P0/y$c;->e:Lax/P0/y$f$a;

    .line 2
    .line 3
    invoke-static {v0}, Lax/P0/y$f$a;->e(Lax/P0/y$f$a;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Lax/P0/y$c;->e:Lax/P0/y$f$a;

    .line 10
    .line 11
    invoke-static {v0}, Lax/P0/y$f$a;->f(Lax/P0/y$f$a;)Ljava/util/UUID;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x1

    .line 21
    :goto_14
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lax/P0/y$c;->b:Landroid/net/Uri;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz v2, :cond_40

    .line 28
    .line 29
    new-instance v1, Lax/P0/y$h;

    .line 30
    .line 31
    iget-object v3, p0, Lax/P0/y$c;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Lax/P0/y$c;->e:Lax/P0/y$f$a;

    .line 34
    .line 35
    invoke-static {v4}, Lax/P0/y$f$a;->f(Lax/P0/y$f$a;)Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_2e

    .line 40
    .line 41
    iget-object v0, p0, Lax/P0/y$c;->e:Lax/P0/y$f$a;

    .line 42
    .line 43
    invoke-virtual {v0}, Lax/P0/y$f$a;->i()Lax/P0/y$f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2e
    move-object v4, v0

    .line 48
    iget-object v6, p0, Lax/P0/y$c;->f:Ljava/util/List;

    .line 49
    .line 50
    iget-object v7, p0, Lax/P0/y$c;->g:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v8, p0, Lax/P0/y$c;->h:Lax/r7/z;

    .line 53
    .line 54
    iget-object v9, p0, Lax/P0/y$c;->i:Ljava/lang/Object;

    .line 55
    .line 56
    iget-wide v10, p0, Lax/P0/y$c;->j:J

    .line 57
    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-direct/range {v1 .. v12}, Lax/P0/y$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lax/P0/y$f;Lax/P0/y$b;Ljava/util/List;Ljava/lang/String;Lax/r7/z;Ljava/lang/Object;JLax/P0/y$a;)V

    .line 61
    .line 62
    .line 63
    move-object v5, v1

    .line 64
    goto :goto_41

    .line 65
    :cond_40
    move-object v5, v0

    .line 66
    :goto_41
    new-instance v2, Lax/P0/y;

    .line 67
    .line 68
    iget-object v0, p0, Lax/P0/y$c;->a:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v0, :cond_49

    .line 71
    .line 72
    :goto_47
    move-object v3, v0

    .line 73
    goto :goto_4c

    .line 74
    :cond_49
    const-string v0, ""

    .line 75
    .line 76
    goto :goto_47

    .line 77
    :goto_4c
    iget-object v0, p0, Lax/P0/y$c;->d:Lax/P0/y$d$a;

    .line 78
    .line 79
    invoke-virtual {v0}, Lax/P0/y$d$a;->h()Lax/P0/y$e;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-object v0, p0, Lax/P0/y$c;->l:Lax/P0/y$g$a;

    .line 84
    .line 85
    invoke-virtual {v0}, Lax/P0/y$g$a;->f()Lax/P0/y$g;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-object v0, p0, Lax/P0/y$c;->k:Lax/P0/A;

    .line 90
    .line 91
    if-eqz v0, :cond_5e

    .line 92
    .line 93
    :goto_5c
    move-object v7, v0

    .line 94
    goto :goto_61

    .line 95
    :cond_5e
    sget-object v0, Lax/P0/A;->I:Lax/P0/A;

    .line 96
    .line 97
    goto :goto_5c

    .line 98
    :goto_61
    iget-object v8, p0, Lax/P0/y$c;->m:Lax/P0/y$i;

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    invoke-direct/range {v2 .. v9}, Lax/P0/y;-><init>(Ljava/lang/String;Lax/P0/y$e;Lax/P0/y$h;Lax/P0/y$g;Lax/P0/A;Lax/P0/y$i;Lax/P0/y$a;)V

    .line 102
    .line 103
    .line 104
    return-object v2
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

.method public b(Lax/P0/y$g;)Lax/P0/y$c;
    .registers 2

    .line 1
    invoke-virtual {p1}, Lax/P0/y$g;->a()Lax/P0/y$g$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/P0/y$c;->l:Lax/P0/y$g$a;

    .line 6
    .line 7
    return-object p0
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

.method public c(Ljava/lang/String;)Lax/P0/y$c;
    .registers 2

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lax/P0/y$c;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
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

.method public d(Ljava/util/List;)Lax/P0/y$c;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/P0/y$k;",
            ">;)",
            "Lax/P0/y$c;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/P0/y$c;->h:Lax/r7/z;

    .line 6
    .line 7
    return-object p0
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

.method public e(Ljava/lang/Object;)Lax/P0/y$c;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/P0/y$c;->i:Ljava/lang/Object;

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

.method public f(Landroid/net/Uri;)Lax/P0/y$c;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/P0/y$c;->b:Landroid/net/Uri;

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

.method public g(Ljava/lang/String;)Lax/P0/y$c;
    .registers 2

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_8

    .line 5
    :cond_4
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_8
    invoke-virtual {p0, p1}, Lax/P0/y$c;->f(Landroid/net/Uri;)Lax/P0/y$c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
