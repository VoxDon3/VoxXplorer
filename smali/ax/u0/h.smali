.class public abstract Lax/u0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/u0/c$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/u0/h$r;,
        Lax/u0/h$p;,
        Lax/u0/h$q;,
        Lax/u0/h$o;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lax/u0/h<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lax/u0/c$c;"
    }
.end annotation


# static fields
.field public static final A:Lax/u0/h$r;

.field public static final n:Lax/u0/h$r;

.field public static final o:Lax/u0/h$r;

.field public static final p:Lax/u0/h$r;

.field public static final q:Lax/u0/h$r;

.field public static final r:Lax/u0/h$r;

.field public static final s:Lax/u0/h$r;

.field public static final t:Lax/u0/h$r;

.field public static final u:Lax/u0/h$r;

.field public static final v:Lax/u0/h$r;

.field public static final w:Lax/u0/h$r;

.field public static final x:Lax/u0/h$r;

.field public static final y:Lax/u0/h$r;

.field public static final z:Lax/u0/h$r;


# instance fields
.field a:F

.field b:F

.field c:Z

.field final d:Ljava/lang/Object;

.field final e:Lax/u0/i;

.field f:Z

.field g:F

.field h:F

.field private i:J

.field private j:F

.field private final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/u0/h$p;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/u0/h$q;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lax/u0/c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/u0/h$f;

    .line 2
    .line 3
    const-string v1, "translationX"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lax/u0/h$f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/u0/h;->n:Lax/u0/h$r;

    .line 9
    .line 10
    new-instance v0, Lax/u0/h$g;

    .line 11
    .line 12
    const-string v1, "translationY"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lax/u0/h$g;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lax/u0/h;->o:Lax/u0/h$r;

    .line 18
    .line 19
    new-instance v0, Lax/u0/h$h;

    .line 20
    .line 21
    const-string v1, "translationZ"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lax/u0/h$h;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lax/u0/h;->p:Lax/u0/h$r;

    .line 27
    .line 28
    new-instance v0, Lax/u0/h$i;

    .line 29
    .line 30
    const-string v1, "scaleX"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lax/u0/h$i;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lax/u0/h;->q:Lax/u0/h$r;

    .line 36
    .line 37
    new-instance v0, Lax/u0/h$j;

    .line 38
    .line 39
    const-string v1, "scaleY"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lax/u0/h$j;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lax/u0/h;->r:Lax/u0/h$r;

    .line 45
    .line 46
    new-instance v0, Lax/u0/h$k;

    .line 47
    .line 48
    const-string v1, "rotation"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lax/u0/h$k;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lax/u0/h;->s:Lax/u0/h$r;

    .line 54
    .line 55
    new-instance v0, Lax/u0/h$l;

    .line 56
    .line 57
    const-string v1, "rotationX"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lax/u0/h$l;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lax/u0/h;->t:Lax/u0/h$r;

    .line 63
    .line 64
    new-instance v0, Lax/u0/h$m;

    .line 65
    .line 66
    const-string v1, "rotationY"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lax/u0/h$m;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lax/u0/h;->u:Lax/u0/h$r;

    .line 72
    .line 73
    new-instance v0, Lax/u0/h$n;

    .line 74
    .line 75
    const-string v1, "x"

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lax/u0/h$n;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lax/u0/h;->v:Lax/u0/h$r;

    .line 81
    .line 82
    new-instance v0, Lax/u0/h$a;

    .line 83
    .line 84
    const-string v1, "y"

    .line 85
    .line 86
    invoke-direct {v0, v1}, Lax/u0/h$a;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lax/u0/h;->w:Lax/u0/h$r;

    .line 90
    .line 91
    new-instance v0, Lax/u0/h$b;

    .line 92
    .line 93
    const-string v1, "z"

    .line 94
    .line 95
    invoke-direct {v0, v1}, Lax/u0/h$b;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    sput-object v0, Lax/u0/h;->x:Lax/u0/h$r;

    .line 99
    .line 100
    new-instance v0, Lax/u0/h$c;

    .line 101
    .line 102
    const-string v1, "alpha"

    .line 103
    .line 104
    invoke-direct {v0, v1}, Lax/u0/h$c;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lax/u0/h;->y:Lax/u0/h$r;

    .line 108
    .line 109
    new-instance v0, Lax/u0/h$d;

    .line 110
    .line 111
    const-string v1, "scrollX"

    .line 112
    .line 113
    invoke-direct {v0, v1}, Lax/u0/h$d;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sput-object v0, Lax/u0/h;->z:Lax/u0/h$r;

    .line 117
    .line 118
    new-instance v0, Lax/u0/h$e;

    .line 119
    .line 120
    const-string v1, "scrollY"

    .line 121
    .line 122
    invoke-direct {v0, v1}, Lax/u0/h$e;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lax/u0/h;->A:Lax/u0/h$r;

    .line 126
    .line 127
    return-void
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

.method constructor <init>(Ljava/lang/Object;Lax/u0/i;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lax/u0/i<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/u0/h;->a:F

    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v0, p0, Lax/u0/h;->b:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lax/u0/h;->c:Z

    .line 14
    .line 15
    iput-boolean v1, p0, Lax/u0/h;->f:Z

    .line 16
    .line 17
    iput v0, p0, Lax/u0/h;->g:F

    .line 18
    .line 19
    neg-float v0, v0

    .line 20
    iput v0, p0, Lax/u0/h;->h:F

    .line 21
    .line 22
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    iput-wide v0, p0, Lax/u0/h;->i:J

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lax/u0/h;->k:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lax/u0/h;->l:Ljava/util/ArrayList;

    .line 39
    .line 40
    iput-object p1, p0, Lax/u0/h;->d:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p2, p0, Lax/u0/h;->e:Lax/u0/i;

    .line 43
    .line 44
    sget-object p1, Lax/u0/h;->s:Lax/u0/h$r;

    .line 45
    .line 46
    if-eq p2, p1, :cond_55

    .line 47
    .line 48
    sget-object p1, Lax/u0/h;->t:Lax/u0/h$r;

    .line 49
    .line 50
    if-eq p2, p1, :cond_55

    .line 51
    .line 52
    sget-object p1, Lax/u0/h;->u:Lax/u0/h$r;

    .line 53
    .line 54
    if-ne p2, p1, :cond_38

    .line 55
    .line 56
    goto :goto_55

    .line 57
    :cond_38
    sget-object p1, Lax/u0/h;->y:Lax/u0/h$r;

    .line 58
    .line 59
    if-ne p2, p1, :cond_41

    .line 60
    .line 61
    const/high16 p1, 0x3b800000    # 0.00390625f

    .line 62
    .line 63
    iput p1, p0, Lax/u0/h;->j:F

    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    sget-object p1, Lax/u0/h;->q:Lax/u0/h$r;

    .line 67
    .line 68
    if-eq p2, p1, :cond_4f

    .line 69
    .line 70
    sget-object p1, Lax/u0/h;->r:Lax/u0/h$r;

    .line 71
    .line 72
    if-ne p2, p1, :cond_4a

    .line 73
    .line 74
    goto :goto_4f

    .line 75
    :cond_4a
    const/high16 p1, 0x3f800000    # 1.0f

    .line 76
    .line 77
    iput p1, p0, Lax/u0/h;->j:F

    .line 78
    .line 79
    return-void

    .line 80
    :cond_4f
    :goto_4f
    const p1, 0x3b03126f    # 0.002f

    .line 81
    .line 82
    .line 83
    iput p1, p0, Lax/u0/h;->j:F

    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    :goto_55
    const p1, 0x3dcccccd    # 0.1f

    .line 87
    .line 88
    .line 89
    iput p1, p0, Lax/u0/h;->j:F

    .line 90
    .line 91
    return-void
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

.method private b(Z)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/u0/h;->f:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lax/u0/h;->c()Lax/u0/c;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, p0}, Lax/u0/c;->k(Lax/u0/c$c;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lax/u0/h;->i:J

    .line 14
    .line 15
    iput-boolean v0, p0, Lax/u0/h;->c:Z

    .line 16
    .line 17
    :goto_10
    iget-object v1, p0, Lax/u0/h;->k:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ge v0, v1, :cond_32

    .line 24
    .line 25
    iget-object v1, p0, Lax/u0/h;->k:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_2f

    .line 32
    .line 33
    iget-object v1, p0, Lax/u0/h;->k:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lax/u0/h$p;

    .line 40
    .line 41
    iget v2, p0, Lax/u0/h;->b:F

    .line 42
    .line 43
    iget v3, p0, Lax/u0/h;->a:F

    .line 44
    .line 45
    invoke-interface {v1, p0, p1, v2, v3}, Lax/u0/h$p;->a(Lax/u0/h;ZFF)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_10

    .line 51
    :cond_32
    iget-object p1, p0, Lax/u0/h;->k:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {p1}, Lax/u0/h;->g(Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private d()F
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u0/h;->e:Lax/u0/i;

    .line 2
    .line 3
    iget-object v1, p0, Lax/u0/h;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/u0/i;->a(Ljava/lang/Object;)F

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

.method private static g(Ljava/util/ArrayList;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/ArrayList<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_6
    if-ltz v0, :cond_14

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_11

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_11
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    goto :goto_6

    .line 21
    :cond_14
    return-void
    .line 22
.end method

.method private k()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/u0/h;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_31

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/u0/h;->f:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Lax/u0/h;->c:Z

    .line 9
    .line 10
    if-nez v0, :cond_11

    .line 11
    .line 12
    invoke-direct {p0}, Lax/u0/h;->d()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lax/u0/h;->b:F

    .line 17
    .line 18
    :cond_11
    iget v0, p0, Lax/u0/h;->b:F

    .line 19
    .line 20
    iget v1, p0, Lax/u0/h;->g:F

    .line 21
    .line 22
    cmpl-float v1, v0, v1

    .line 23
    .line 24
    if-gtz v1, :cond_29

    .line 25
    .line 26
    iget v1, p0, Lax/u0/h;->h:F

    .line 27
    .line 28
    cmpg-float v0, v0, v1

    .line 29
    .line 30
    if-ltz v0, :cond_29

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/u0/h;->c()Lax/u0/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    invoke-virtual {v0, p0, v1, v2}, Lax/u0/c;->d(Lax/u0/c$c;J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v1, "Starting value need to be in between min value and max value"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_31
    return-void
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


# virtual methods
.method public a(J)Z
    .registers 9

    .line 1
    iget-wide v0, p0, Lax/u0/h;->i:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    cmp-long v5, v0, v2

    .line 7
    .line 8
    if-nez v5, :cond_11

    .line 9
    .line 10
    iput-wide p1, p0, Lax/u0/h;->i:J

    .line 11
    .line 12
    iget p1, p0, Lax/u0/h;->b:F

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lax/u0/h;->h(F)V

    .line 15
    .line 16
    .line 17
    return v4

    .line 18
    :cond_11
    sub-long v0, p1, v0

    .line 19
    .line 20
    iput-wide p1, p0, Lax/u0/h;->i:J

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/u0/h;->c()Lax/u0/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lax/u0/c;->g()F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 p2, 0x0

    .line 31
    cmpl-float p2, p1, p2

    .line 32
    .line 33
    if-nez p2, :cond_26

    .line 34
    .line 35
    const-wide/32 p1, 0x7fffffff

    .line 36
    .line 37
    .line 38
    goto :goto_29

    .line 39
    :cond_26
    long-to-float p2, v0

    .line 40
    div-float/2addr p2, p1

    .line 41
    float-to-long p1, p2

    .line 42
    :goto_29
    invoke-virtual {p0, p1, p2}, Lax/u0/h;->l(J)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget p2, p0, Lax/u0/h;->b:F

    .line 47
    .line 48
    iget v0, p0, Lax/u0/h;->g:F

    .line 49
    .line 50
    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iput p2, p0, Lax/u0/h;->b:F

    .line 55
    .line 56
    iget v0, p0, Lax/u0/h;->h:F

    .line 57
    .line 58
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Lax/u0/h;->b:F

    .line 63
    .line 64
    invoke-virtual {p0, p2}, Lax/u0/h;->h(F)V

    .line 65
    .line 66
    .line 67
    if-eqz p1, :cond_47

    .line 68
    .line 69
    invoke-direct {p0, v4}, Lax/u0/h;->b(Z)V

    .line 70
    .line 71
    .line 72
    :cond_47
    return p1
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

.method public c()Lax/u0/c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u0/h;->m:Lax/u0/c;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    invoke-static {}, Lax/u0/c;->h()Lax/u0/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method e()F
    .registers 3

    .line 1
    iget v0, p0, Lax/u0/h;->j:F

    .line 2
    .line 3
    const/high16 v1, 0x3f400000    # 0.75f

    .line 4
    .line 5
    mul-float v0, v0, v1

    .line 6
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

.method public f()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/u0/h;->f:Z

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

.method h(F)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/u0/h;->e:Lax/u0/i;

    .line 2
    .line 3
    iget-object v1, p0, Lax/u0/h;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lax/u0/i;->b(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_8
    iget-object v0, p0, Lax/u0/h;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ge p1, v0, :cond_2a

    .line 16
    .line 17
    iget-object v0, p0, Lax/u0/h;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_27

    .line 24
    .line 25
    iget-object v0, p0, Lax/u0/h;->l:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/u0/h$q;

    .line 32
    .line 33
    iget v1, p0, Lax/u0/h;->b:F

    .line 34
    .line 35
    iget v2, p0, Lax/u0/h;->a:F

    .line 36
    .line 37
    invoke-interface {v0, p0, v1, v2}, Lax/u0/h$q;->a(Lax/u0/h;FF)V

    .line 38
    .line 39
    .line 40
    :cond_27
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    goto :goto_8

    .line 43
    :cond_2a
    iget-object p1, p0, Lax/u0/h;->l:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-static {p1}, Lax/u0/h;->g(Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public i(F)Lax/u0/h;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    .line 1
    iput p1, p0, Lax/u0/h;->b:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lax/u0/h;->c:Z

    .line 5
    .line 6
    return-object p0
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

.method public j()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/u0/h;->c()Lax/u0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/u0/c;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_12

    .line 10
    .line 11
    iget-boolean v0, p0, Lax/u0/h;->f:Z

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    invoke-direct {p0}, Lax/u0/h;->k()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void

    .line 19
    :cond_12
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 20
    .line 21
    const-string v1, "Animations may only be started on the same thread as the animation handler"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
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

.method abstract l(J)Z
.end method
