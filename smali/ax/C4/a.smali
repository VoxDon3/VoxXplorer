.class public final Lax/C4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/C4/a$b;,
        Lax/C4/a$c;
    }
.end annotation


# static fields
.field public static final d:Lax/C4/a;

.field public static final e:Lax/C4/a;


# instance fields
.field private a:Lax/C4/a$c;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/C4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/C4/a$c;->q:Lax/C4/a$c;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lax/C4/a;->f(Lax/C4/a$c;)Lax/C4/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lax/C4/a;->d:Lax/C4/a;

    .line 13
    .line 14
    new-instance v0, Lax/C4/a;

    .line 15
    .line 16
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lax/C4/a$c;->e0:Lax/C4/a$c;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lax/C4/a;->f(Lax/C4/a$c;)Lax/C4/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lax/C4/a;->e:Lax/C4/a;

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

.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method static synthetic a(Lax/C4/a;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/C4/a;->b:Ljava/lang/String;

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

.method static synthetic b(Lax/C4/a;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/C4/a;->c:Ljava/lang/String;

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

.method public static c(Ljava/lang/String;)Lax/C4/a;
    .registers 3

    .line 1
    if-eqz p0, :cond_1e

    .line 2
    .line 3
    const-string v0, "[-_0-9a-zA-Z:]+"

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    new-instance v0, Lax/C4/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lax/C4/a$c;->d0:Lax/C4/a$c;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Lax/C4/a;->g(Lax/C4/a$c;Ljava/lang/String;)Lax/C4/a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "String does not match pattern"

    .line 26
    .line 27
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "Value is null"

    .line 34
    .line 35
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0
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

.method public static d(Ljava/lang/String;)Lax/C4/a;
    .registers 3

    .line 1
    if-eqz p0, :cond_1e

    .line 2
    .line 3
    const-string v0, "[-_0-9a-zA-Z:]+"

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    new-instance v0, Lax/C4/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lax/C4/a$c;->c0:Lax/C4/a$c;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Lax/C4/a;->h(Lax/C4/a$c;Ljava/lang/String;)Lax/C4/a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "String does not match pattern"

    .line 26
    .line 27
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "Value is null"

    .line 34
    .line 35
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0
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

.method private f(Lax/C4/a$c;)Lax/C4/a;
    .registers 3

    .line 1
    new-instance v0, Lax/C4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/C4/a;->a:Lax/C4/a$c;

    .line 7
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
    .line 22
.end method

.method private g(Lax/C4/a$c;Ljava/lang/String;)Lax/C4/a;
    .registers 4

    .line 1
    new-instance v0, Lax/C4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/C4/a;->a:Lax/C4/a$c;

    .line 7
    .line 8
    iput-object p2, v0, Lax/C4/a;->c:Ljava/lang/String;

    .line 9
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

.method private h(Lax/C4/a$c;Ljava/lang/String;)Lax/C4/a;
    .registers 4

    .line 1
    new-instance v0, Lax/C4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/C4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/C4/a;->a:Lax/C4/a$c;

    .line 7
    .line 8
    iput-object p2, v0, Lax/C4/a;->b:Ljava/lang/String;

    .line 9
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


# virtual methods
.method public e()Lax/C4/a$c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/C4/a;->a:Lax/C4/a$c;

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

.method public equals(Ljava/lang/Object;)Z
    .registers 6

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
    instance-of v2, p1, Lax/C4/a;

    .line 10
    .line 11
    if-eqz v2, :cond_48

    .line 12
    .line 13
    check-cast p1, Lax/C4/a;

    .line 14
    .line 15
    iget-object v2, p0, Lax/C4/a;->a:Lax/C4/a$c;

    .line 16
    .line 17
    iget-object v3, p1, Lax/C4/a;->a:Lax/C4/a$c;

    .line 18
    .line 19
    if-eq v2, v3, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    sget-object v3, Lax/C4/a$a;->a:[I

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    aget v2, v3, v2

    .line 29
    .line 30
    if-eq v2, v0, :cond_47

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    if-eq v2, v3, :cond_39

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    if-eq v2, v3, :cond_2a

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    if-eq v2, p1, :cond_29

    .line 40
    .line 41
    return v1

    .line 42
    :cond_29
    return v0

    .line 43
    :cond_2a
    iget-object v2, p0, Lax/C4/a;->c:Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, p1, Lax/C4/a;->c:Ljava/lang/String;

    .line 46
    .line 47
    if-eq v2, p1, :cond_38

    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_37

    .line 54
    .line 55
    goto :goto_38

    .line 56
    :cond_37
    return v1

    .line 57
    :cond_38
    :goto_38
    return v0

    .line 58
    :cond_39
    iget-object v2, p0, Lax/C4/a;->b:Ljava/lang/String;

    .line 59
    .line 60
    iget-object p1, p1, Lax/C4/a;->b:Ljava/lang/String;

    .line 61
    .line 62
    if-eq v2, p1, :cond_47

    .line 63
    .line 64
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_46

    .line 69
    .line 70
    goto :goto_47

    .line 71
    :cond_46
    return v1

    .line 72
    :cond_47
    :goto_47
    return v0

    .line 73
    :cond_48
    return v1
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

.method public hashCode()I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/C4/a;->a:Lax/C4/a$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/C4/a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/C4/a;->c:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    new-array v3, v3, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aput-object v0, v3, v4

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object v1, v3, v0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    aput-object v2, v3, v0

    .line 18
    .line 19
    invoke-static {v3}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/C4/a$b;->b:Lax/C4/a$b;

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
