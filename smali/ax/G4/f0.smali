.class public Lax/G4/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/G4/f0$b;,
        Lax/G4/f0$a;
    }
.end annotation


# instance fields
.field protected final a:Ljava/lang/String;

.field protected final b:J

.field protected final c:Lax/G4/g0;

.field protected final d:Lax/G4/w;

.field protected final e:Z

.field protected final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/G4/r;",
            ">;"
        }
    .end annotation
.end field

.field protected final h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 11

    .line 23
    sget-object v5, Lax/G4/w;->q:Lax/G4/w;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x64

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lax/G4/f0;-><init>(Ljava/lang/String;JLax/G4/g0;Lax/G4/w;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLax/G4/g0;Lax/G4/w;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lax/G4/g0;",
            "Lax/G4/w;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lax/G4/r;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_16

    .line 2
    const-string v0, "(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)"

    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_16

    .line 3
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "String \'path\' does not match pattern"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_16
    :goto_16
    iput-object p1, p0, Lax/G4/f0;->a:Ljava/lang/String;

    const-wide/16 v0, 0x1

    cmp-long p1, p2, v0

    if-ltz p1, :cond_a0

    const-wide/16 v0, 0x3e8

    cmp-long p1, p2, v0

    if-gtz p1, :cond_98

    .line 5
    iput-wide p2, p0, Lax/G4/f0;->b:J

    .line 6
    iput-object p4, p0, Lax/G4/f0;->c:Lax/G4/g0;

    if-eqz p5, :cond_90

    .line 7
    iput-object p5, p0, Lax/G4/f0;->d:Lax/G4/w;

    .line 8
    iput-boolean p6, p0, Lax/G4/f0;->e:Z

    if-eqz p7, :cond_4b

    .line 9
    invoke-interface {p7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_34
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_43

    goto :goto_34

    .line 10
    :cond_43
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "An item in list \'fileExtensions\' is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_4b
    iput-object p7, p0, Lax/G4/f0;->f:Ljava/util/List;

    if-eqz p8, :cond_6a

    .line 12
    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_53
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lax/G4/r;

    if-eqz p2, :cond_62

    goto :goto_53

    .line 13
    :cond_62
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "An item in list \'fileCategories\' is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_6a
    iput-object p8, p0, Lax/G4/f0;->g:Ljava/util/List;

    if-eqz p9, :cond_8d

    .line 15
    invoke-virtual {p9}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0x28

    if-lt p1, p2, :cond_85

    .line 16
    invoke-virtual {p9}, Ljava/lang/String;->length()I

    move-result p1

    if-gt p1, p2, :cond_7d

    goto :goto_8d

    .line 17
    :cond_7d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "String \'accountId\' is longer than 40"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_85
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "String \'accountId\' is shorter than 40"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_8d
    :goto_8d
    iput-object p9, p0, Lax/G4/f0;->h:Ljava/lang/String;

    return-void

    .line 20
    :cond_90
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value for \'fileStatus\' is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_98
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Number \'maxResults\' is larger than 1000L"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_a0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Number \'maxResults\' is smaller than 1L"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a()Lax/G4/f0$a;
    .registers 1

    .line 1
    new-instance v0, Lax/G4/f0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/f0$a;-><init>()V

    .line 4
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


# virtual methods
.method public b()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/f0$b;->b:Lax/G4/f0$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_79

    .line 22
    .line 23
    check-cast p1, Lax/G4/f0;

    .line 24
    .line 25
    iget-object v2, p0, Lax/G4/f0;->a:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lax/G4/f0;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-eq v2, v3, :cond_26

    .line 30
    .line 31
    if-eqz v2, :cond_79

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_79

    .line 38
    .line 39
    :cond_26
    iget-wide v2, p0, Lax/G4/f0;->b:J

    .line 40
    .line 41
    iget-wide v4, p1, Lax/G4/f0;->b:J

    .line 42
    .line 43
    cmp-long v6, v2, v4

    .line 44
    .line 45
    if-nez v6, :cond_79

    .line 46
    .line 47
    iget-object v2, p0, Lax/G4/f0;->c:Lax/G4/g0;

    .line 48
    .line 49
    iget-object v3, p1, Lax/G4/f0;->c:Lax/G4/g0;

    .line 50
    .line 51
    if-eq v2, v3, :cond_3c

    .line 52
    .line 53
    if-eqz v2, :cond_79

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_79

    .line 60
    .line 61
    :cond_3c
    iget-object v2, p0, Lax/G4/f0;->d:Lax/G4/w;

    .line 62
    .line 63
    iget-object v3, p1, Lax/G4/f0;->d:Lax/G4/w;

    .line 64
    .line 65
    if-eq v2, v3, :cond_48

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_79

    .line 72
    .line 73
    :cond_48
    iget-boolean v2, p0, Lax/G4/f0;->e:Z

    .line 74
    .line 75
    iget-boolean v3, p1, Lax/G4/f0;->e:Z

    .line 76
    .line 77
    if-ne v2, v3, :cond_79

    .line 78
    .line 79
    iget-object v2, p0, Lax/G4/f0;->f:Ljava/util/List;

    .line 80
    .line 81
    iget-object v3, p1, Lax/G4/f0;->f:Ljava/util/List;

    .line 82
    .line 83
    if-eq v2, v3, :cond_5c

    .line 84
    .line 85
    if-eqz v2, :cond_79

    .line 86
    .line 87
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_79

    .line 92
    .line 93
    :cond_5c
    iget-object v2, p0, Lax/G4/f0;->g:Ljava/util/List;

    .line 94
    .line 95
    iget-object v3, p1, Lax/G4/f0;->g:Ljava/util/List;

    .line 96
    .line 97
    if-eq v2, v3, :cond_6a

    .line 98
    .line 99
    if-eqz v2, :cond_79

    .line 100
    .line 101
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_79

    .line 106
    .line 107
    :cond_6a
    iget-object v2, p0, Lax/G4/f0;->h:Ljava/lang/String;

    .line 108
    .line 109
    iget-object p1, p1, Lax/G4/f0;->h:Ljava/lang/String;

    .line 110
    .line 111
    if-eq v2, p1, :cond_78

    .line 112
    .line 113
    if-eqz v2, :cond_79

    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_79

    .line 120
    .line 121
    :cond_78
    return v0

    .line 122
    :cond_79
    return v1
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
    .registers 11

    .line 1
    iget-object v0, p0, Lax/G4/f0;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lax/G4/f0;->b:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lax/G4/f0;->c:Lax/G4/g0;

    .line 10
    .line 11
    iget-object v3, p0, Lax/G4/f0;->d:Lax/G4/w;

    .line 12
    .line 13
    iget-boolean v4, p0, Lax/G4/f0;->e:Z

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, Lax/G4/f0;->f:Ljava/util/List;

    .line 20
    .line 21
    iget-object v6, p0, Lax/G4/f0;->g:Ljava/util/List;

    .line 22
    .line 23
    iget-object v7, p0, Lax/G4/f0;->h:Ljava/lang/String;

    .line 24
    .line 25
    const/16 v8, 0x8

    .line 26
    .line 27
    new-array v8, v8, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    aput-object v0, v8, v9

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    aput-object v1, v8, v0

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    aput-object v2, v8, v0

    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    aput-object v3, v8, v0

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    aput-object v4, v8, v0

    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    aput-object v5, v8, v0

    .line 46
    .line 47
    const/4 v0, 0x6

    .line 48
    aput-object v6, v8, v0

    .line 49
    .line 50
    const/4 v0, 0x7

    .line 51
    aput-object v7, v8, v0

    .line 52
    .line 53
    invoke-static {v8}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    return v0
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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/f0$b;->b:Lax/G4/f0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
