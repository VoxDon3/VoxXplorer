.class public final Lax/G4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/G4/h$b;,
        Lax/G4/h$c;
    }
.end annotation


# static fields
.field public static final d:Lax/G4/h;

.field public static final e:Lax/G4/h;

.field public static final f:Lax/G4/h;


# instance fields
.field private a:Lax/G4/h$c;

.field private b:Lax/G4/M;

.field private c:Lax/G4/S0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/G4/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/G4/h$c;->d0:Lax/G4/h$c;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lax/G4/h;->j(Lax/G4/h$c;)Lax/G4/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lax/G4/h;->d:Lax/G4/h;

    .line 13
    .line 14
    new-instance v0, Lax/G4/h;

    .line 15
    .line 16
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lax/G4/h$c;->e0:Lax/G4/h$c;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lax/G4/h;->j(Lax/G4/h$c;)Lax/G4/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lax/G4/h;->e:Lax/G4/h;

    .line 26
    .line 27
    new-instance v0, Lax/G4/h;

    .line 28
    .line 29
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v1, Lax/G4/h$c;->f0:Lax/G4/h$c;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lax/G4/h;->j(Lax/G4/h$c;)Lax/G4/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lax/G4/h;->f:Lax/G4/h;

    .line 39
    .line 40
    return-void
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

.method static synthetic a(Lax/G4/h;)Lax/G4/M;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/G4/h;->b:Lax/G4/M;

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

.method static synthetic b(Lax/G4/h;)Lax/G4/S0;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/G4/h;->c:Lax/G4/S0;

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

.method public static g(Lax/G4/M;)Lax/G4/h;
    .registers 3

    .line 1
    if-eqz p0, :cond_e

    .line 2
    .line 3
    new-instance v0, Lax/G4/h;

    .line 4
    .line 5
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lax/G4/h$c;->q:Lax/G4/h$c;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lax/G4/h;->k(Lax/G4/h$c;Lax/G4/M;)Lax/G4/h;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "Value is null"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method

.method public static h(Lax/G4/S0;)Lax/G4/h;
    .registers 3

    .line 1
    if-eqz p0, :cond_e

    .line 2
    .line 3
    new-instance v0, Lax/G4/h;

    .line 4
    .line 5
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lax/G4/h$c;->c0:Lax/G4/h$c;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lax/G4/h;->l(Lax/G4/h$c;Lax/G4/S0;)Lax/G4/h;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "Value is null"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method

.method private j(Lax/G4/h$c;)Lax/G4/h;
    .registers 3

    .line 1
    new-instance v0, Lax/G4/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/G4/h;->a:Lax/G4/h$c;

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

.method private k(Lax/G4/h$c;Lax/G4/M;)Lax/G4/h;
    .registers 4

    .line 1
    new-instance v0, Lax/G4/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 7
    .line 8
    iput-object p2, v0, Lax/G4/h;->b:Lax/G4/M;

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

.method private l(Lax/G4/h$c;Lax/G4/S0;)Lax/G4/h;
    .registers 4

    .line 1
    new-instance v0, Lax/G4/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 7
    .line 8
    iput-object p2, v0, Lax/G4/h;->c:Lax/G4/S0;

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
.method public c()Lax/G4/M;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 2
    .line 3
    sget-object v1, Lax/G4/h$c;->q:Lax/G4/h$c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_9

    .line 6
    .line 7
    iget-object v0, p0, Lax/G4/h;->b:Lax/G4/M;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Invalid tag: required Tag.PATH_LOOKUP, but was Tag."

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
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

.method public d()Lax/G4/S0;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 2
    .line 3
    sget-object v1, Lax/G4/h$c;->c0:Lax/G4/h$c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_9

    .line 6
    .line 7
    iget-object v0, p0, Lax/G4/h;->c:Lax/G4/S0;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Invalid tag: required Tag.PATH_WRITE, but was Tag."

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
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

.method public e()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 2
    .line 3
    sget-object v1, Lax/G4/h$c;->q:Lax/G4/h$c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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
    instance-of v2, p1, Lax/G4/h;

    .line 10
    .line 11
    if-eqz v2, :cond_4b

    .line 12
    .line 13
    check-cast p1, Lax/G4/h;

    .line 14
    .line 15
    iget-object v2, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 16
    .line 17
    iget-object v3, p1, Lax/G4/h;->a:Lax/G4/h$c;

    .line 18
    .line 19
    if-eq v2, v3, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    sget-object v3, Lax/G4/h$a;->a:[I

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
    if-eq v2, v0, :cond_3c

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    if-eq v2, v3, :cond_2d

    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    if-eq v2, p1, :cond_2c

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    if-eq v2, p1, :cond_2c

    .line 40
    .line 41
    const/4 p1, 0x5

    .line 42
    if-eq v2, p1, :cond_2c

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2c
    return v0

    .line 46
    :cond_2d
    iget-object v2, p0, Lax/G4/h;->c:Lax/G4/S0;

    .line 47
    .line 48
    iget-object p1, p1, Lax/G4/h;->c:Lax/G4/S0;

    .line 49
    .line 50
    if-eq v2, p1, :cond_3b

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Lax/G4/S0;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3a

    .line 57
    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    return v1

    .line 60
    :cond_3b
    :goto_3b
    return v0

    .line 61
    :cond_3c
    iget-object v2, p0, Lax/G4/h;->b:Lax/G4/M;

    .line 62
    .line 63
    iget-object p1, p1, Lax/G4/h;->b:Lax/G4/M;

    .line 64
    .line 65
    if-eq v2, p1, :cond_4a

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Lax/G4/M;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_49

    .line 72
    .line 73
    goto :goto_4a

    .line 74
    :cond_49
    return v1

    .line 75
    :cond_4a
    :goto_4a
    return v0

    .line 76
    :cond_4b
    return v1
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

.method public f()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 2
    .line 3
    sget-object v1, Lax/G4/h$c;->c0:Lax/G4/h$c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public hashCode()I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/G4/h;->a:Lax/G4/h$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/h;->b:Lax/G4/M;

    .line 4
    .line 5
    iget-object v2, p0, Lax/G4/h;->c:Lax/G4/S0;

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

.method public i()Lax/G4/h$c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/G4/h;->a:Lax/G4/h$c;

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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/h$b;->b:Lax/G4/h$b;

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
