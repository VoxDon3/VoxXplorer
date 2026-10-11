.class public final Lax/P0/y$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Lax/P0/y$f;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/L;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;

.field public final f:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/P0/y$k;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/y$j;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final h:Ljava/lang/Object;

.field public final i:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lax/P0/y$h;->j:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lax/P0/y$h;->k:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lax/P0/y$h;->l:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lax/P0/y$h;->m:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lax/P0/y$h;->n:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, 0x5

    .line 37
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lax/P0/y$h;->o:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v0, 0x6

    .line 44
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lax/P0/y$h;->p:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v0, 0x7

    .line 51
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lax/P0/y$h;->q:Ljava/lang/String;

    .line 56
    .line 57
    return-void
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

.method private constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lax/P0/y$f;Lax/P0/y$b;Ljava/util/List;Ljava/lang/String;Lax/r7/z;Ljava/lang/Object;J)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Lax/P0/y$f;",
            "Lax/P0/y$b;",
            "Ljava/util/List<",
            "Lax/P0/L;",
            ">;",
            "Ljava/lang/String;",
            "Lax/r7/z<",
            "Lax/P0/y$k;",
            ">;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 4
    invoke-static {p2}, Lax/P0/D;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lax/P0/y$h;->c:Lax/P0/y$f;

    .line 6
    iput-object p5, p0, Lax/P0/y$h;->d:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lax/P0/y$h;->e:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lax/P0/y$h;->f:Lax/r7/z;

    .line 9
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    move-result-object p1

    const/4 p2, 0x0

    .line 10
    :goto_18
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_32

    .line 11
    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lax/P0/y$k;

    invoke-virtual {p3}, Lax/P0/y$k;->a()Lax/P0/y$k$a;

    move-result-object p3

    invoke-static {p3}, Lax/P0/y$k$a;->a(Lax/P0/y$k$a;)Lax/P0/y$j;

    move-result-object p3

    invoke-virtual {p1, p3}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    add-int/lit8 p2, p2, 0x1

    goto :goto_18

    .line 12
    :cond_32
    invoke-virtual {p1}, Lax/r7/z$a;->k()Lax/r7/z;

    move-result-object p1

    iput-object p1, p0, Lax/P0/y$h;->g:Ljava/util/List;

    .line 13
    iput-object p8, p0, Lax/P0/y$h;->h:Ljava/lang/Object;

    .line 14
    iput-wide p9, p0, Lax/P0/y$h;->i:J

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lax/P0/y$f;Lax/P0/y$b;Ljava/util/List;Ljava/lang/String;Lax/r7/z;Ljava/lang/Object;JLax/P0/y$a;)V
    .registers 12

    .line 1
    invoke-direct/range {p0 .. p10}, Lax/P0/y$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lax/P0/y$f;Lax/P0/y$b;Ljava/util/List;Ljava/lang/String;Lax/r7/z;Ljava/lang/Object;J)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/P0/y$h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v2

    .line 11
    :cond_a
    check-cast p1, Lax/P0/y$h;

    .line 12
    .line 13
    iget-object v1, p0, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v3, p1, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_5b

    .line 22
    .line 23
    iget-object v1, p0, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_5b

    .line 32
    .line 33
    iget-object v1, p0, Lax/P0/y$h;->c:Lax/P0/y$f;

    .line 34
    .line 35
    iget-object v3, p1, Lax/P0/y$h;->c:Lax/P0/y$f;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_5b

    .line 42
    .line 43
    iget-object v1, p0, Lax/P0/y$h;->d:Ljava/util/List;

    .line 44
    .line 45
    iget-object v3, p1, Lax/P0/y$h;->d:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_5b

    .line 52
    .line 53
    iget-object v1, p0, Lax/P0/y$h;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v3, p1, Lax/P0/y$h;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_5b

    .line 62
    .line 63
    iget-object v1, p0, Lax/P0/y$h;->f:Lax/r7/z;

    .line 64
    .line 65
    iget-object v3, p1, Lax/P0/y$h;->f:Lax/r7/z;

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Lax/r7/z;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_5b

    .line 72
    .line 73
    iget-object v1, p0, Lax/P0/y$h;->h:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v3, p1, Lax/P0/y$h;->h:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5b

    .line 82
    .line 83
    iget-wide v3, p0, Lax/P0/y$h;->i:J

    .line 84
    .line 85
    iget-wide v5, p1, Lax/P0/y$h;->i:J

    .line 86
    .line 87
    cmp-long p1, v3, v5

    .line 88
    .line 89
    if-nez p1, :cond_5b

    .line 90
    .line 91
    return v0

    .line 92
    :cond_5b
    return v2
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

.method public hashCode()I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_f

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    goto :goto_13

    .line 16
    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_13
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lax/P0/y$h;->c:Lax/P0/y$f;

    .line 24
    .line 25
    if-nez v1, :cond_1c

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    goto :goto_20

    .line 29
    :cond_1c
    invoke-virtual {v1}, Lax/P0/y$f;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_20
    add-int/2addr v0, v1

    .line 34
    mul-int/lit16 v0, v0, 0x3c1

    .line 35
    .line 36
    iget-object v1, p0, Lax/P0/y$h;->d:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Lax/P0/y$h;->e:Ljava/lang/String;

    .line 46
    .line 47
    if-nez v1, :cond_32

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    goto :goto_36

    .line 51
    :cond_32
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_36
    add-int/2addr v0, v1

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-object v1, p0, Lax/P0/y$h;->f:Lax/r7/z;

    .line 59
    .line 60
    invoke-virtual {v1}, Lax/r7/z;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget-object v1, p0, Lax/P0/y$h;->h:Ljava/lang/Object;

    .line 68
    .line 69
    if-nez v1, :cond_47

    .line 70
    .line 71
    goto :goto_4b

    .line 72
    :cond_47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_4b
    add-int/2addr v0, v2

    .line 77
    const-wide/16 v1, 0x1f

    .line 78
    .line 79
    int-to-long v3, v0

    .line 80
    mul-long v3, v3, v1

    .line 81
    .line 82
    iget-wide v0, p0, Lax/P0/y$h;->i:J

    .line 83
    .line 84
    add-long/2addr v3, v0

    .line 85
    long-to-int v0, v3

    .line 86
    return v0
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
