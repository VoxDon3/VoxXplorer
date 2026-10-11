.class public Lax/i2/e;
.super Lax/i2/I;
.source "SourceFile"

# interfaces
.implements Lax/i2/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i2/e$b;,
        Lax/i2/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lax/i2/I<",
        "TK;>;",
        "Lax/i2/C;"
    }
.end annotation


# instance fields
.field private final a:Lax/i2/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/D<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/i2/I$b<",
            "TK;>;>;"
        }
    .end annotation
.end field

.field private final c:Lax/i2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/p<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final d:Lax/i2/I$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/I$c<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final e:Lax/i2/J;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/J<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final f:Lax/i2/e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/e<",
            "TK;>.b;"
        }
    .end annotation
.end field

.field private final g:Lax/i2/e$a;

.field private final h:Z

.field private final i:Ljava/lang/String;

.field private j:Lax/i2/A;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lax/i2/p;Lax/i2/I$c;Lax/i2/J;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lax/i2/p<",
            "TK;>;",
            "Lax/i2/I$c<",
            "TK;>;",
            "Lax/i2/J<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/i2/I;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/i2/D;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/i2/D;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p1, :cond_17

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v2, 0x0

    .line 25
    :goto_18
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    xor-int/2addr v2, v1

    .line 37
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_2b

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v2, 0x0

    .line 45
    :goto_2c
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 46
    .line 47
    .line 48
    if-eqz p3, :cond_33

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    goto :goto_34

    .line 52
    :cond_33
    const/4 v2, 0x0

    .line 53
    :goto_34
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 54
    .line 55
    .line 56
    if-eqz p4, :cond_3a

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    :cond_3a
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lax/i2/e;->i:Ljava/lang/String;

    .line 63
    .line 64
    iput-object p2, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 65
    .line 66
    iput-object p3, p0, Lax/i2/e;->d:Lax/i2/I$c;

    .line 67
    .line 68
    iput-object p4, p0, Lax/i2/e;->e:Lax/i2/J;

    .line 69
    .line 70
    new-instance p1, Lax/i2/e$b;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Lax/i2/e$b;-><init>(Lax/i2/e;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lax/i2/e;->f:Lax/i2/e$b;

    .line 76
    .line 77
    invoke-virtual {p3}, Lax/i2/I$c;->a()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    xor-int/2addr p1, v1

    .line 82
    iput-boolean p1, p0, Lax/i2/e;->h:Z

    .line 83
    .line 84
    new-instance p1, Lax/i2/e$a;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Lax/i2/e$a;-><init>(Lax/i2/e;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lax/i2/e;->g:Lax/i2/e$a;

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
.end method

.method private A()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_8
    if-ltz v0, :cond_18

    .line 10
    .line 11
    iget-object v1, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/i2/I$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/i2/I$b;->b()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_8

    .line 25
    :cond_18
    return-void
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

.method private B()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_16

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/i2/I$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/i2/I$b;->c()V

    .line 20
    .line 21
    .line 22
    goto :goto_6

    .line 23
    :cond_16
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private C(Lax/i2/D;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/D<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/i2/D;->q:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_15

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {p0, v1, v2}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_6

    .line 22
    :cond_15
    iget-object p1, p1, Lax/i2/D;->c0:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_1b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_29

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p0, v0, v2}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 39
    .line 40
    .line 41
    goto :goto_1b

    .line 42
    :cond_29
    return-void
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

.method private D()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_8
    if-ltz v0, :cond_18

    .line 10
    .line 11
    iget-object v1, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/i2/I$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/i2/I$b;->d()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_8

    .line 25
    :cond_18
    return-void
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

.method private F(Ljava/lang/Iterable;Z)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TK;>;Z)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_39

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz p2, :cond_24

    .line 19
    .line 20
    invoke-direct {p0, v2, v3}, Lax/i2/e;->s(Ljava/lang/Object;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_22

    .line 25
    .line 26
    iget-object v4, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 27
    .line 28
    invoke-virtual {v4, v2}, Lax/i2/D;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_22

    .line 33
    .line 34
    goto :goto_32

    .line 35
    :cond_22
    const/4 v3, 0x0

    .line 36
    goto :goto_32

    .line 37
    :cond_24
    invoke-direct {p0, v2, v0}, Lax/i2/e;->s(Ljava/lang/Object;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_22

    .line 42
    .line 43
    iget-object v4, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Lax/i2/D;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_22

    .line 50
    .line 51
    :goto_32
    if-eqz v3, :cond_37

    .line 52
    .line 53
    invoke-direct {p0, v2, p2}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 54
    .line 55
    .line 56
    :cond_37
    or-int/2addr v1, v3

    .line 57
    goto :goto_6

    .line 58
    :cond_39
    return v1
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

.method private s(Ljava/lang/Object;Z)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/e;->d:Lax/i2/I$c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/i2/I$c;->c(Ljava/lang/Object;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method private t()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/i2/e;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-direct {p0}, Lax/i2/e;->v()Lax/i2/D;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, Lax/i2/e;->C(Lax/i2/D;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method private v()Lax/i2/D;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/i2/D<",
            "TK;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/i2/e;->j:Lax/i2/A;

    .line 3
    .line 4
    new-instance v0, Lax/i2/t;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/i2/t;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lax/i2/e;->k()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_16

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lax/i2/e;->w(Lax/i2/t;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 19
    .line 20
    invoke-virtual {v1}, Lax/i2/D;->clear()V

    .line 21
    .line 22
    .line 23
    :cond_16
    return-object v0
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

.method private y(II)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/i2/e;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "DefaultSelectionTracker"

    .line 6
    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    const-string p1, "Ignoring attempt to extend unestablished range. Ignoring."

    .line 10
    .line 11
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    const/4 v0, -0x1

    .line 16
    if-ne p1, v0, :cond_26

    .line 17
    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "Ignoring attempt to extend range to invalid position: "

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iget-object v0, p0, Lax/i2/e;->j:Lax/i2/A;

    .line 40
    .line 41
    invoke-virtual {v0, p1, p2}, Lax/i2/A;->b(II)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 45
    .line 46
    .line 47
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

.method private z(Ljava/lang/Object;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_6

    .line 6
    :cond_5
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v1, v0

    .line 17
    :goto_10
    if-ltz v1, :cond_20

    .line 18
    .line 19
    iget-object v0, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lax/i2/I$b;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lax/i2/I$b;->a(Ljava/lang/Object;Z)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    goto :goto_10

    .line 33
    :cond_20
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method E()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i2/D;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_10

    .line 8
    .line 9
    const-string v0, "DefaultSelectionTracker"

    .line 10
    .line 11
    const-string v1, "Ignoring onDataSetChange. No active selection."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/i2/D;->e()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lax/i2/e;->D()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/i2/D;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    :cond_1f
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_5c

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v3, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Lax/i2/p;->b(Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, -0x1

    .line 49
    if-eq v3, v4, :cond_51

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    invoke-direct {p0, v2, v3}, Lax/i2/e;->s(Ljava/lang/Object;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_3a

    .line 57
    .line 58
    goto :goto_51

    .line 59
    :cond_3a
    iget-object v4, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    sub-int/2addr v4, v3

    .line 66
    :goto_41
    if-ltz v4, :cond_1f

    .line 67
    .line 68
    iget-object v5, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lax/i2/I$b;

    .line 75
    .line 76
    invoke-virtual {v5, v2, v3}, Lax/i2/I$b;->a(Ljava/lang/Object;Z)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v4, v4, -0x1

    .line 80
    .line 81
    goto :goto_41

    .line 82
    :cond_51
    :goto_51
    if-nez v1, :cond_58

    .line 83
    .line 84
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    :cond_58
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1f

    .line 93
    :cond_5c
    if-eqz v1, :cond_6f

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/4 v2, 0x0

    .line 100
    :goto_63
    if-ge v2, v0, :cond_6f

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    invoke-virtual {p0, v3}, Lax/i2/e;->f(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_63

    .line 112
    :cond_6f
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 113
    .line 114
    .line 115
    return-void
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

.method G(IIZ)V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p2, p1, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_6

    .line 6
    :cond_5
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 8
    .line 9
    .line 10
    :goto_9
    if-gt p1, p2, :cond_3b

    .line 11
    .line 12
    iget-object v1, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lax/i2/p;->a(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_14

    .line 19
    .line 20
    goto :goto_38

    .line 21
    :cond_14
    if-eqz p3, :cond_2e

    .line 22
    .line 23
    invoke-direct {p0, v1, v0}, Lax/i2/e;->s(Ljava/lang/Object;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_38

    .line 28
    .line 29
    iget-object v2, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 30
    .line 31
    iget-object v2, v2, Lax/i2/D;->q:Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_38

    .line 38
    .line 39
    iget-object v2, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 40
    .line 41
    iget-object v2, v2, Lax/i2/D;->c0:Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_35

    .line 47
    :cond_2e
    iget-object v2, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 48
    .line 49
    iget-object v2, v2, Lax/i2/D;->c0:Ljava/util/Set;

    .line 50
    .line 51
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :goto_35
    invoke-direct {p0, v1, p3}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 55
    .line 56
    .line 57
    :cond_38
    :goto_38
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    goto :goto_9

    .line 60
    :cond_3b
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 61
    .line 62
    .line 63
    return-void
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

.method H(IIZ)V
    .registers 5

    .line 1
    if-lt p2, p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 7
    .line 8
    .line 9
    :goto_8
    if-gt p1, p2, :cond_1f

    .line 10
    .line 11
    iget-object v0, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/i2/p;->a(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    goto :goto_1c

    .line 20
    :cond_13
    if-eqz p3, :cond_19

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lax/i2/e;->o(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_1c

    .line 26
    :cond_19
    invoke-virtual {p0, v0}, Lax/i2/e;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :goto_1c
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    goto :goto_8

    .line 32
    :cond_1f
    return-void
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

.method public a()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/i2/e;->e()Z

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/i2/e;->j:Lax/i2/A;

    .line 6
    .line 7
    return-void
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

.method public b(Lax/i2/I$b;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/I$b<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/i2/e;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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

.method public c(I)V
    .registers 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_5

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    goto :goto_6

    .line 6
    :cond_5
    const/4 v0, 0x0

    .line 7
    :goto_6
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 11
    .line 12
    iget-object v1, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lax/i2/p;->a(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lax/i2/D;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lax/i2/A;

    .line 26
    .line 27
    iget-object v1, p0, Lax/i2/e;->f:Lax/i2/e$b;

    .line 28
    .line 29
    invoke-direct {v0, p1, v1}, Lax/i2/A;-><init>(ILax/i2/A$a;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lax/i2/e;->j:Lax/i2/A;

    .line 33
    .line 34
    return-void
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

.method public d()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/i2/e;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/i2/e;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_f
    :goto_f
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/i2/e;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Lax/i2/e;->u()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lax/i2/e;->t()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lax/i2/e;->B()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public f(Ljava/lang/Object;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v2, 0x0

    .line 8
    :goto_7
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lax/i2/D;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_36

    .line 18
    .line 19
    invoke-direct {p0, p1, v1}, Lax/i2/e;->s(Ljava/lang/Object;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    iget-object v2, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lax/i2/D;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, v1}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 38
    .line 39
    invoke-virtual {p1}, Lax/i2/D;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_35

    .line 44
    .line 45
    invoke-virtual {p0}, Lax/i2/e;->l()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_35

    .line 50
    .line 51
    invoke-virtual {p0}, Lax/i2/e;->x()V

    .line 52
    .line 53
    .line 54
    :cond_35
    return v0

    .line 55
    :cond_36
    return v1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public g(I)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/i2/e;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lax/i2/e;->y(II)V

    .line 8
    .line 9
    .line 10
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

.method public h(I)V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lax/i2/e;->y(II)V

    .line 3
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
.end method

.method protected i()Landroidx/recyclerview/widget/RecyclerView$j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/e;->g:Lax/i2/e$a;

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

.method public j()Lax/i2/D;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/i2/D<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

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

.method public k()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i2/D;->isEmpty()Z

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

.method public l()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/e;->j:Lax/i2/A;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public m(Ljava/lang/Object;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/i2/D;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public n()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i2/D;->i()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/i2/e;->A()V

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
.end method

.method public o(Ljava/lang/Object;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v2, 0x0

    .line 8
    :goto_7
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lax/i2/D;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_13

    .line 18
    .line 19
    return v0

    .line 20
    :cond_13
    invoke-direct {p0, p1, v1}, Lax/i2/e;->s(Ljava/lang/Object;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1a

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1a
    iget-boolean v0, p0, Lax/i2/e;->h:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2b

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/i2/e;->k()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2b

    .line 36
    .line 37
    invoke-direct {p0}, Lax/i2/e;->v()Lax/i2/D;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0, v0}, Lax/i2/e;->C(Lax/i2/D;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lax/i2/D;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, v1}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 53
    .line 54
    .line 55
    return v1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public p(Ljava/lang/Iterable;Z)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TK;>;Z)Z"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/i2/e;->F(Ljava/lang/Iterable;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 6
    .line 7
    .line 8
    return p1
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

.method public q(Ljava/util/Set;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/i2/e;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lax/i2/D;->k(Ljava/util/Set;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_31

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-direct {p0, v1, v0}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_13

    .line 50
    :cond_31
    invoke-direct {p0}, Lax/i2/e;->A()V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public r(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lax/i2/p;->a(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lax/i2/D;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1c

    .line 14
    .line 15
    iget-object v0, p0, Lax/i2/e;->c:Lax/i2/p;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lax/i2/p;->a(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Lax/i2/e;->o(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    return-void

    .line 29
    :cond_1c
    :goto_1c
    invoke-virtual {p0, p1}, Lax/i2/e;->c(I)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public u()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    iget-object v0, v0, Lax/i2/D;->c0:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_17

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {p0, v1, v2}, Lax/i2/e;->z(Ljava/lang/Object;Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_8

    .line 24
    :cond_17
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/i2/D;->e()V

    .line 27
    .line 28
    .line 29
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

.method public w(Lax/i2/t;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/t<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/e;->a:Lax/i2/D;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/i2/t;->g(Lax/i2/D;)V

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

.method public x()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/i2/e;->j:Lax/i2/A;

    .line 3
    .line 4
    invoke-virtual {p0}, Lax/i2/e;->u()V

    .line 5
    .line 6
    .line 7
    return-void
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
