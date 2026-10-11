.class public Lax/o4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o4/g$w;,
        Lax/o4/g$x;,
        Lax/o4/g$C;,
        Lax/o4/g$s;,
        Lax/o4/g$f0;,
        Lax/o4/g$o;,
        Lax/o4/g$y;,
        Lax/o4/g$e;,
        Lax/o4/g$Q;,
        Lax/o4/g$M;,
        Lax/o4/g$D;,
        Lax/o4/g$j;,
        Lax/o4/g$r;,
        Lax/o4/g$T;,
        Lax/o4/g$S;,
        Lax/o4/g$Z;,
        Lax/o4/g$U;,
        Lax/o4/g$c0;,
        Lax/o4/g$V;,
        Lax/o4/g$W;,
        Lax/o4/g$a0;,
        Lax/o4/g$Y;,
        Lax/o4/g$X;,
        Lax/o4/g$b0;,
        Lax/o4/g$A;,
        Lax/o4/g$z;,
        Lax/o4/g$q;,
        Lax/o4/g$i;,
        Lax/o4/g$d;,
        Lax/o4/g$B;,
        Lax/o4/g$v;,
        Lax/o4/g$e0;,
        Lax/o4/g$l;,
        Lax/o4/g$h;,
        Lax/o4/g$t;,
        Lax/o4/g$m;,
        Lax/o4/g$F;,
        Lax/o4/g$R;,
        Lax/o4/g$P;,
        Lax/o4/g$n;,
        Lax/o4/g$H;,
        Lax/o4/g$J;,
        Lax/o4/g$I;,
        Lax/o4/g$G;,
        Lax/o4/g$K;,
        Lax/o4/g$L;,
        Lax/o4/g$N;,
        Lax/o4/g$c;,
        Lax/o4/g$p;,
        Lax/o4/g$u;,
        Lax/o4/g$g;,
        Lax/o4/g$f;,
        Lax/o4/g$O;,
        Lax/o4/g$E;,
        Lax/o4/g$b;,
        Lax/o4/g$k;,
        Lax/o4/g$d0;
    }
.end annotation


# static fields
.field private static g:Z = true


# instance fields
.field private a:Lax/o4/g$F;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:F

.field private e:Lax/o4/b$r;

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lax/o4/g$L;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
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
.end method

.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lax/o4/g;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lax/o4/g;->c:Ljava/lang/String;

    .line 12
    .line 13
    const/high16 v0, 0x42c00000    # 96.0f

    .line 14
    .line 15
    iput v0, p0, Lax/o4/g;->d:F

    .line 16
    .line 17
    new-instance v0, Lax/o4/b$r;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/o4/b$r;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lax/o4/g;->e:Lax/o4/b$r;

    .line 23
    .line 24
    new-instance v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lax/o4/g;->f:Ljava/util/Map;

    .line 30
    .line 31
    return-void
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

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 1
    const-string v0, "\""

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1f

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1f

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v1, v2

    .line 21
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "\\\""

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_3c

    .line 32
    :cond_1f
    const-string v0, "\'"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3c

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3c

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    sub-int/2addr v1, v2

    .line 51
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v1, "\\\'"

    .line 56
    .line 57
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_3c
    :goto_3c
    const-string v0, "\\\n"

    .line 62
    .line 63
    const-string v1, ""

    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "\\A"

    .line 70
    .line 71
    const-string v1, "\n"

    .line 72
    .line 73
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
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

.method private e(F)Lax/o4/g$b;
    .registers 9

    .line 1
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 2
    .line 3
    iget-object v1, v0, Lax/o4/g$F;->s:Lax/o4/g$p;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 6
    .line 7
    const/high16 v2, -0x40800000    # -1.0f

    .line 8
    .line 9
    if-eqz v1, :cond_56

    .line 10
    .line 11
    invoke-virtual {v1}, Lax/o4/g$p;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_56

    .line 16
    .line 17
    iget-object v3, v1, Lax/o4/g$p;->c0:Lax/o4/g$d0;

    .line 18
    .line 19
    sget-object v4, Lax/o4/g$d0;->j0:Lax/o4/g$d0;

    .line 20
    .line 21
    if-eq v3, v4, :cond_56

    .line 22
    .line 23
    sget-object v5, Lax/o4/g$d0;->c0:Lax/o4/g$d0;

    .line 24
    .line 25
    if-eq v3, v5, :cond_56

    .line 26
    .line 27
    sget-object v6, Lax/o4/g$d0;->d0:Lax/o4/g$d0;

    .line 28
    .line 29
    if-ne v3, v6, :cond_1f

    .line 30
    .line 31
    goto :goto_56

    .line 32
    :cond_1f
    invoke-virtual {v1, p1}, Lax/o4/g$p;->c(F)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v0, :cond_3f

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/o4/g$p;->k()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_39

    .line 43
    .line 44
    iget-object v3, v0, Lax/o4/g$p;->c0:Lax/o4/g$d0;

    .line 45
    .line 46
    if-eq v3, v4, :cond_39

    .line 47
    .line 48
    if-eq v3, v5, :cond_39

    .line 49
    .line 50
    if-ne v3, v6, :cond_34

    .line 51
    .line 52
    goto :goto_39

    .line 53
    :cond_34
    invoke-virtual {v0, p1}, Lax/o4/g$p;->c(F)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    goto :goto_4f

    .line 58
    :cond_39
    :goto_39
    new-instance p1, Lax/o4/g$b;

    .line 59
    .line 60
    invoke-direct {p1, v2, v2, v2, v2}, Lax/o4/g$b;-><init>(FFFF)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_3f
    iget-object p1, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 65
    .line 66
    iget-object p1, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 67
    .line 68
    if-eqz p1, :cond_4e

    .line 69
    .line 70
    iget v0, p1, Lax/o4/g$b;->d:F

    .line 71
    .line 72
    mul-float v0, v0, v1

    .line 73
    .line 74
    iget p1, p1, Lax/o4/g$b;->c:F

    .line 75
    .line 76
    div-float p1, v0, p1

    .line 77
    .line 78
    goto :goto_4f

    .line 79
    :cond_4e
    move p1, v1

    .line 80
    :goto_4f
    new-instance v0, Lax/o4/g$b;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-direct {v0, v2, v2, v1, p1}, Lax/o4/g$b;-><init>(FFFF)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_56
    :goto_56
    new-instance p1, Lax/o4/g$b;

    .line 88
    .line 89
    invoke-direct {p1, v2, v2, v2, v2}, Lax/o4/g$b;-><init>(FFFF)V

    .line 90
    .line 91
    .line 92
    return-object p1
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

.method private i(Lax/o4/g$J;Ljava/lang/String;)Lax/o4/g$L;
    .registers 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lax/o4/g$L;

    .line 3
    .line 4
    iget-object v1, v0, Lax/o4/g$L;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_c

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    invoke-interface {p1}, Lax/o4/g$J;->b()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_14
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_3e

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/o4/g$N;

    .line 32
    .line 33
    instance-of v1, v0, Lax/o4/g$L;

    .line 34
    .line 35
    if-nez v1, :cond_25

    .line 36
    .line 37
    goto :goto_14

    .line 38
    :cond_25
    move-object v1, v0

    .line 39
    check-cast v1, Lax/o4/g$L;

    .line 40
    .line 41
    iget-object v2, v1, Lax/o4/g$L;->c:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_31

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_31
    instance-of v1, v0, Lax/o4/g$J;

    .line 51
    .line 52
    if-eqz v1, :cond_14

    .line 53
    .line 54
    check-cast v0, Lax/o4/g$J;

    .line 55
    .line 56
    invoke-direct {p0, v0, p2}, Lax/o4/g;->i(Lax/o4/g$J;Ljava/lang/String;)Lax/o4/g$L;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_14

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3e
    const/4 p1, 0x0

    .line 64
    return-object p1
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

.method static k()Lax/o4/i;
    .registers 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static l(Ljava/io/InputStream;)Lax/o4/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o4/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-boolean v1, Lax/o4/g;->g:Z

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lax/o4/k;->z(Ljava/io/InputStream;Z)Lax/o4/g;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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


# virtual methods
.method a(Lax/o4/b$r;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/g;->e:Lax/o4/b$r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o4/b$r;->b(Lax/o4/b$r;)V

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
.end method

.method b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/g;->e:Lax/o4/b$r;

    .line 2
    .line 3
    sget-object v1, Lax/o4/b$u;->c0:Lax/o4/b$u;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/o4/b$r;->e(Lax/o4/b$u;)V

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
.end method

.method d()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/o4/b$p;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o4/g;->e:Lax/o4/b$r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o4/b$r;->c()Ljava/util/List;

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

.method public f()F
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget v0, p0, Lax/o4/g;->d:F

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lax/o4/g;->e(F)Lax/o4/g$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Lax/o4/g$b;->d:F

    .line 12
    .line 13
    return v0

    .line 14
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "SVG document is empty"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public g()Landroid/graphics/RectF;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_a
    invoke-virtual {v0}, Lax/o4/g$b;->d()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v1, "SVG document is empty"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
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
.end method

.method public h()F
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget v0, p0, Lax/o4/g;->d:F

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lax/o4/g;->e(F)Lax/o4/g$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Lax/o4/g$b;->c:F

    .line 12
    .line 13
    return v0

    .line 14
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "SVG document is empty"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method j(Ljava/lang/String;)Lax/o4/g$L;
    .registers 4

    .line 1
    if-eqz p1, :cond_33

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_33

    .line 10
    :cond_9
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 11
    .line 12
    iget-object v0, v0, Lax/o4/g$L;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_16

    .line 19
    .line 20
    iget-object p1, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_16
    iget-object v0, p0, Lax/o4/g;->f:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_27

    .line 30
    .line 31
    iget-object v0, p0, Lax/o4/g;->f:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lax/o4/g$L;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_27
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 41
    .line 42
    invoke-direct {p0, v0, p1}, Lax/o4/g;->i(Lax/o4/g$J;Ljava/lang/String;)Lax/o4/g$L;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lax/o4/g;->f:Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_33
    :goto_33
    const/4 p1, 0x0

    .line 53
    return-object p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method m()Lax/o4/g$F;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

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

.method n()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/g;->e:Lax/o4/b$r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o4/b$r;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
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

.method public o()Landroid/graphics/Picture;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lax/o4/g;->q(Lax/o4/f;)Landroid/graphics/Picture;

    .line 3
    .line 4
    .line 5
    move-result-object v0

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

.method public p(IILax/o4/f;)Landroid/graphics/Picture;
    .registers 7

    .line 1
    new-instance v0, Landroid/graphics/Picture;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz p3, :cond_f

    .line 11
    .line 12
    iget-object v2, p3, Lax/o4/f;->f:Lax/o4/g$b;

    .line 13
    .line 14
    if-nez v2, :cond_23

    .line 15
    .line 16
    :cond_f
    if-nez p3, :cond_17

    .line 17
    .line 18
    new-instance p3, Lax/o4/f;

    .line 19
    .line 20
    invoke-direct {p3}, Lax/o4/f;-><init>()V

    .line 21
    .line 22
    .line 23
    goto :goto_1d

    .line 24
    :cond_17
    new-instance v2, Lax/o4/f;

    .line 25
    .line 26
    invoke-direct {v2, p3}, Lax/o4/f;-><init>(Lax/o4/f;)V

    .line 27
    .line 28
    .line 29
    move-object p3, v2

    .line 30
    :goto_1d
    int-to-float p1, p1

    .line 31
    int-to-float p2, p2

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p3, v2, v2, p1, p2}, Lax/o4/f;->g(FFFF)Lax/o4/f;

    .line 34
    .line 35
    .line 36
    :cond_23
    new-instance p1, Lax/o4/h;

    .line 37
    .line 38
    iget p2, p0, Lax/o4/g;->d:F

    .line 39
    .line 40
    invoke-direct {p1, v1, p2}, Lax/o4/h;-><init>(Landroid/graphics/Canvas;F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0, p3}, Lax/o4/h;->G0(Lax/o4/g;Lax/o4/f;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    .line 47
    .line 48
    .line 49
    return-object v0
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

.method public q(Lax/o4/f;)Landroid/graphics/Picture;
    .registers 7

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/o4/f;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    iget-object v0, p1, Lax/o4/f;->d:Lax/o4/g$b;

    .line 10
    .line 11
    goto :goto_f

    .line 12
    :cond_b
    iget-object v0, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 13
    .line 14
    iget-object v0, v0, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 15
    .line 16
    :goto_f
    if-eqz p1, :cond_34

    .line 17
    .line 18
    invoke-virtual {p1}, Lax/o4/f;->f()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_34

    .line 23
    .line 24
    iget-object v0, p1, Lax/o4/f;->f:Lax/o4/g$b;

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/o4/g$b;->b()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p1, Lax/o4/f;->f:Lax/o4/g$b;

    .line 31
    .line 32
    invoke-virtual {v1}, Lax/o4/g$b;->c()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    float-to-double v2, v0

    .line 37
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    double-to-int v0, v2

    .line 42
    float-to-double v1, v1

    .line 43
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    double-to-int v1, v1

    .line 48
    invoke-virtual {p0, v0, v1, p1}, Lax/o4/g;->p(IILax/o4/f;)Landroid/graphics/Picture;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_34
    iget-object v1, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 54
    .line 55
    iget-object v2, v1, Lax/o4/g$F;->s:Lax/o4/g$p;

    .line 56
    .line 57
    if-eqz v2, :cond_69

    .line 58
    .line 59
    iget-object v3, v2, Lax/o4/g$p;->c0:Lax/o4/g$d0;

    .line 60
    .line 61
    sget-object v4, Lax/o4/g$d0;->j0:Lax/o4/g$d0;

    .line 62
    .line 63
    if-eq v3, v4, :cond_69

    .line 64
    .line 65
    iget-object v3, v1, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 66
    .line 67
    if-eqz v3, :cond_69

    .line 68
    .line 69
    iget-object v3, v3, Lax/o4/g$p;->c0:Lax/o4/g$d0;

    .line 70
    .line 71
    if-eq v3, v4, :cond_69

    .line 72
    .line 73
    iget v0, p0, Lax/o4/g;->d:F

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Lax/o4/g$p;->c(F)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-object v1, p0, Lax/o4/g;->a:Lax/o4/g$F;

    .line 80
    .line 81
    iget-object v1, v1, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 82
    .line 83
    iget v2, p0, Lax/o4/g;->d:F

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Lax/o4/g$p;->c(F)F

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    float-to-double v2, v0

    .line 90
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    double-to-int v0, v2

    .line 95
    float-to-double v1, v1

    .line 96
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    double-to-int v1, v1

    .line 101
    invoke-virtual {p0, v0, v1, p1}, Lax/o4/g;->p(IILax/o4/f;)Landroid/graphics/Picture;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_69
    if-eqz v2, :cond_8b

    .line 107
    .line 108
    if-eqz v0, :cond_8b

    .line 109
    .line 110
    iget v1, p0, Lax/o4/g;->d:F

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Lax/o4/g$p;->c(F)F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iget v2, v0, Lax/o4/g$b;->d:F

    .line 117
    .line 118
    mul-float v2, v2, v1

    .line 119
    .line 120
    iget v0, v0, Lax/o4/g$b;->c:F

    .line 121
    .line 122
    div-float/2addr v2, v0

    .line 123
    float-to-double v0, v1

    .line 124
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    double-to-int v0, v0

    .line 129
    float-to-double v1, v2

    .line 130
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 131
    .line 132
    .line 133
    move-result-wide v1

    .line 134
    double-to-int v1, v1

    .line 135
    invoke-virtual {p0, v0, v1, p1}, Lax/o4/g;->p(IILax/o4/f;)Landroid/graphics/Picture;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    :cond_8b
    iget-object v1, v1, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 141
    .line 142
    if-eqz v1, :cond_af

    .line 143
    .line 144
    if-eqz v0, :cond_af

    .line 145
    .line 146
    iget v2, p0, Lax/o4/g;->d:F

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Lax/o4/g$p;->c(F)F

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iget v2, v0, Lax/o4/g$b;->c:F

    .line 153
    .line 154
    mul-float v2, v2, v1

    .line 155
    .line 156
    iget v0, v0, Lax/o4/g$b;->d:F

    .line 157
    .line 158
    div-float/2addr v2, v0

    .line 159
    float-to-double v2, v2

    .line 160
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    double-to-int v0, v2

    .line 165
    float-to-double v1, v1

    .line 166
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 167
    .line 168
    .line 169
    move-result-wide v1

    .line 170
    double-to-int v1, v1

    .line 171
    invoke-virtual {p0, v0, v1, p1}, Lax/o4/g;->p(IILax/o4/f;)Landroid/graphics/Picture;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1

    .line 176
    :cond_af
    const/16 v0, 0x200

    .line 177
    .line 178
    invoke-virtual {p0, v0, v0, p1}, Lax/o4/g;->p(IILax/o4/f;)Landroid/graphics/Picture;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    return-object p1
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

.method r(Ljava/lang/String;)Lax/o4/g$N;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    invoke-direct {p0, p1}, Lax/o4/g;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-le v1, v2, :cond_20

    .line 15
    .line 16
    const-string v1, "#"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_20

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lax/o4/g;->j(Ljava/lang/String;)Lax/o4/g$L;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_20
    return-object v0
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

.method s(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o4/g;->c:Ljava/lang/String;

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

.method t(Lax/o4/g$F;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o4/g;->a:Lax/o4/g$F;

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

.method u(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o4/g;->b:Ljava/lang/String;

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
