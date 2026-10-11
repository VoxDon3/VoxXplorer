.class Lax/O4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/Reader;

.field private final b:[C

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/StringBuilder;

.field private j:I


# direct methods
.method constructor <init>(Ljava/io/Reader;)V
    .registers 3

    const/16 v0, 0x400

    .line 2
    invoke-direct {p0, p1, v0}, Lax/O4/e;-><init>(Ljava/io/Reader;I)V

    return-void
.end method

.method constructor <init>(Ljava/io/Reader;I)V
    .registers 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lax/O4/e;->a:Ljava/io/Reader;

    .line 5
    new-array p1, p2, [C

    iput-object p1, p0, Lax/O4/e;->b:[C

    const/4 p1, 0x1

    .line 6
    iput p1, p0, Lax/O4/e;->f:I

    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lax/O4/e;->j:I

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .registers 4

    .line 1
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x400

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/16 v1, 0xa

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {p0, v0, p1}, Lax/O4/e;-><init>(Ljava/io/Reader;I)V

    return-void
.end method

.method private A()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    invoke-direct {p0}, Lax/O4/e;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_a
    return-void
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

.method private B()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    :cond_b
    iget v0, p0, Lax/O4/e;->d:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    iput v0, p0, Lax/O4/e;->j:I

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method private a()Ljava/lang/String;
    .registers 6

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_8

    .line 5
    .line 6
    iget v0, p0, Lax/O4/e;->d:I

    .line 7
    .line 8
    goto :goto_c

    .line 9
    :cond_8
    iget v0, p0, Lax/O4/e;->d:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_c
    iget-object v2, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lez v2, :cond_2b

    .line 20
    .line 21
    iget-object v2, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 22
    .line 23
    iget-object v3, p0, Lax/O4/e;->b:[C

    .line 24
    .line 25
    iget v4, p0, Lax/O4/e;->j:I

    .line 26
    .line 27
    sub-int/2addr v0, v4

    .line 28
    invoke-virtual {v2, v3, v4, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v2, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_36

    .line 44
    :cond_2b
    new-instance v2, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p0, Lax/O4/e;->b:[C

    .line 47
    .line 48
    iget v4, p0, Lax/O4/e;->j:I

    .line 49
    .line 50
    sub-int/2addr v0, v4

    .line 51
    invoke-direct {v2, v3, v4, v0}, Ljava/lang/String;-><init>([CII)V

    .line 52
    .line 53
    .line 54
    move-object v0, v2

    .line 55
    :goto_36
    iput v1, p0, Lax/O4/e;->j:I

    .line 56
    .line 57
    return-object v0
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

.method private b(Ljava/lang/String;)Lax/O4/i;
    .registers 6

    .line 1
    iget v0, p0, Lax/O4/e;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/O4/e;->d:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iget v1, p0, Lax/O4/e;->g:I

    .line 7
    .line 8
    sub-int v1, v0, v1

    .line 9
    .line 10
    invoke-direct {p0}, Lax/O4/e;->e()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_10

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    :goto_12
    new-instance v2, Lax/O4/i;

    .line 20
    .line 21
    iget v3, p0, Lax/O4/e;->f:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    invoke-direct {v2, p1, v0, v3, v1}, Lax/O4/i;-><init>(Ljava/lang/String;III)V

    .line 26
    .line 27
    .line 28
    return-object v2
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
.end method

.method private c(Ljava/lang/String;)Lax/O4/i;
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/O4/e;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    const-string p1, "Unexpected end of input"

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lax/O4/e;->b(Ljava/lang/String;)Lax/O4/i;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "Expected "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Lax/O4/e;->b(Ljava/lang/String;)Lax/O4/i;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
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

.method private d()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    if-lt v0, v1, :cond_c

    .line 6
    .line 7
    const/16 v1, 0x39

    .line 8
    .line 9
    if-gt v0, v1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private e()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_7
    const/4 v0, 0x0

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

.method private f()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    if-lt v0, v1, :cond_a

    .line 6
    .line 7
    const/16 v1, 0x39

    .line 8
    .line 9
    if-le v0, v1, :cond_1a

    .line 10
    .line 11
    :cond_a
    const/16 v1, 0x61

    .line 12
    .line 13
    if-lt v0, v1, :cond_12

    .line 14
    .line 15
    const/16 v1, 0x66

    .line 16
    .line 17
    if-le v0, v1, :cond_1a

    .line 18
    .line 19
    :cond_12
    const/16 v1, 0x41

    .line 20
    .line 21
    if-lt v0, v1, :cond_1c

    .line 22
    .line 23
    const/16 v1, 0x46

    .line 24
    .line 25
    if-gt v0, v1, :cond_1c

    .line 26
    .line 27
    :cond_1a
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_1c
    const/4 v0, 0x0

    .line 30
    return v0
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

.method private g()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    if-eq v0, v1, :cond_15

    .line 6
    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    if-eq v0, v1, :cond_15

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    if-eq v0, v1, :cond_15

    .line 14
    .line 15
    const/16 v1, 0xd

    .line 16
    .line 17
    if-ne v0, v1, :cond_13

    .line 18
    .line 19
    goto :goto_15

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_15
    :goto_15
    const/4 v0, 0x1

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

.method private i()V
    .registers 6

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_8

    .line 5
    .line 6
    iget v0, p0, Lax/O4/e;->d:I

    .line 7
    .line 8
    goto :goto_c

    .line 9
    :cond_8
    iget v0, p0, Lax/O4/e;->d:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_c
    iget-object v2, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 14
    .line 15
    iget-object v3, p0, Lax/O4/e;->b:[C

    .line 16
    .line 17
    iget v4, p0, Lax/O4/e;->j:I

    .line 18
    .line 19
    sub-int/2addr v0, v4

    .line 20
    invoke-virtual {v2, v3, v4, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iput v1, p0, Lax/O4/e;->j:I

    .line 24
    .line 25
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

.method private j()V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_55

    .line 6
    .line 7
    iget v0, p0, Lax/O4/e;->d:I

    .line 8
    .line 9
    iget v1, p0, Lax/O4/e;->e:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_35

    .line 12
    .line 13
    iget v0, p0, Lax/O4/e;->j:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, -0x1

    .line 17
    if-eq v0, v3, :cond_1c

    .line 18
    .line 19
    iget-object v4, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 20
    .line 21
    iget-object v5, p0, Lax/O4/e;->b:[C

    .line 22
    .line 23
    sub-int/2addr v1, v0

    .line 24
    invoke-virtual {v4, v5, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iput v2, p0, Lax/O4/e;->j:I

    .line 28
    .line 29
    :cond_1c
    iget v0, p0, Lax/O4/e;->c:I

    .line 30
    .line 31
    iget v1, p0, Lax/O4/e;->e:I

    .line 32
    .line 33
    add-int/2addr v0, v1

    .line 34
    iput v0, p0, Lax/O4/e;->c:I

    .line 35
    .line 36
    iget-object v0, p0, Lax/O4/e;->a:Ljava/io/Reader;

    .line 37
    .line 38
    iget-object v1, p0, Lax/O4/e;->b:[C

    .line 39
    .line 40
    array-length v4, v1

    .line 41
    invoke-virtual {v0, v1, v2, v4}, Ljava/io/Reader;->read([CII)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput v0, p0, Lax/O4/e;->e:I

    .line 46
    .line 47
    iput v2, p0, Lax/O4/e;->d:I

    .line 48
    .line 49
    if-ne v0, v3, :cond_35

    .line 50
    .line 51
    iput v3, p0, Lax/O4/e;->h:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    iget v0, p0, Lax/O4/e;->h:I

    .line 55
    .line 56
    const/16 v1, 0xa

    .line 57
    .line 58
    if-ne v0, v1, :cond_48

    .line 59
    .line 60
    iget v0, p0, Lax/O4/e;->f:I

    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    iput v0, p0, Lax/O4/e;->f:I

    .line 65
    .line 66
    iget v0, p0, Lax/O4/e;->c:I

    .line 67
    .line 68
    iget v1, p0, Lax/O4/e;->d:I

    .line 69
    .line 70
    add-int/2addr v0, v1

    .line 71
    iput v0, p0, Lax/O4/e;->g:I

    .line 72
    .line 73
    :cond_48
    iget-object v0, p0, Lax/O4/e;->b:[C

    .line 74
    .line 75
    iget v1, p0, Lax/O4/e;->d:I

    .line 76
    .line 77
    add-int/lit8 v2, v1, 0x1

    .line 78
    .line 79
    iput v2, p0, Lax/O4/e;->d:I

    .line 80
    .line 81
    aget-char v0, v0, v1

    .line 82
    .line 83
    iput v0, p0, Lax/O4/e;->h:I

    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    const-string v0, "Unexpected end of input"

    .line 87
    .line 88
    invoke-direct {p0, v0}, Lax/O4/e;->b(Ljava/lang/String;)Lax/O4/i;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    throw v0
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

.method private k()Lax/O4/a;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/O4/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/O4/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x5d

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lax/O4/e;->l(C)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_14

    .line 19
    .line 20
    goto :goto_2f

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lax/O4/e;->z()Lax/O4/g;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Lax/O4/a;->B(Lax/O4/g;)Lax/O4/a;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 32
    .line 33
    .line 34
    const/16 v2, 0x2c

    .line 35
    .line 36
    invoke-direct {p0, v2}, Lax/O4/e;->l(C)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_14

    .line 41
    .line 42
    invoke-direct {p0, v1}, Lax/O4/e;->l(C)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_30

    .line 47
    .line 48
    :goto_2f
    return-object v0

    .line 49
    :cond_30
    const-string v0, "\',\' or \']\'"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    throw v0
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

.method private l(C)Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_6
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

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

.method private m()Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->d()Z

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
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private n()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lax/O4/e;->h:I

    .line 5
    .line 6
    const/16 v1, 0x22

    .line 7
    .line 8
    if-eq v0, v1, :cond_87

    .line 9
    .line 10
    const/16 v1, 0x2f

    .line 11
    .line 12
    if-eq v0, v1, :cond_87

    .line 13
    .line 14
    const/16 v1, 0x5c

    .line 15
    .line 16
    if-eq v0, v1, :cond_87

    .line 17
    .line 18
    const/16 v1, 0x62

    .line 19
    .line 20
    if-eq v0, v1, :cond_7f

    .line 21
    .line 22
    const/16 v1, 0x66

    .line 23
    .line 24
    if-eq v0, v1, :cond_77

    .line 25
    .line 26
    const/16 v1, 0x6e

    .line 27
    .line 28
    if-eq v0, v1, :cond_6f

    .line 29
    .line 30
    const/16 v1, 0x72

    .line 31
    .line 32
    if-eq v0, v1, :cond_67

    .line 33
    .line 34
    const/16 v1, 0x74

    .line 35
    .line 36
    if-eq v0, v1, :cond_5f

    .line 37
    .line 38
    const/16 v1, 0x75

    .line 39
    .line 40
    if-ne v0, v1, :cond_58

    .line 41
    .line 42
    const/4 v0, 0x4

    .line 43
    new-array v1, v0, [C

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    :goto_2d
    if-ge v2, v0, :cond_47

    .line 47
    .line 48
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lax/O4/e;->f()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_40

    .line 56
    .line 57
    iget v3, p0, Lax/O4/e;->h:I

    .line 58
    .line 59
    int-to-char v3, v3

    .line 60
    aput-char v3, v1, v2

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_2d

    .line 65
    :cond_40
    const-string v0, "hexadecimal digit"

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    throw v0

    .line 72
    :cond_47
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/16 v2, 0x10

    .line 79
    .line 80
    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    int-to-char v1, v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_8d

    .line 89
    :cond_58
    const-string v0, "valid escape sequence"

    .line 90
    .line 91
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    throw v0

    .line 96
    :cond_5f
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const/16 v1, 0x9

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    goto :goto_8d

    .line 104
    :cond_67
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const/16 v1, 0xd

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    goto :goto_8d

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const/16 v1, 0xa

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    goto :goto_8d

    .line 120
    :cond_77
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const/16 v1, 0xc

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    goto :goto_8d

    .line 128
    :cond_7f
    iget-object v0, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const/16 v1, 0x8

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    goto :goto_8d

    .line 136
    :cond_87
    iget-object v1, p0, Lax/O4/e;->i:Ljava/lang/StringBuilder;

    .line 137
    .line 138
    int-to-char v0, v0

    .line 139
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    :goto_8d
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 143
    .line 144
    .line 145
    return-void
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

.method private o()Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x65

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/O4/e;->l(C)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_12

    .line 8
    .line 9
    const/16 v0, 0x45

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lax/O4/e;->l(C)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_12
    const/16 v0, 0x2b

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lax/O4/e;->l(C)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1f

    .line 26
    .line 27
    const/16 v0, 0x2d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lax/O4/e;->l(C)Z

    .line 30
    .line 31
    .line 32
    :cond_1f
    invoke-direct {p0}, Lax/O4/e;->m()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2e

    .line 37
    .line 38
    :goto_25
    invoke-direct {p0}, Lax/O4/e;->m()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2c

    .line 43
    .line 44
    goto :goto_25

    .line 45
    :cond_2c
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :cond_2e
    const-string v0, "digit"

    .line 48
    .line 49
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    throw v0
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

.method private p()Lax/O4/g;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x61

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 7
    .line 8
    .line 9
    const/16 v0, 0x6c

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x73

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x65

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lax/O4/g;->c0:Lax/O4/g;

    .line 25
    .line 26
    return-object v0
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

.method private q()Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/O4/e;->l(C)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_a
    invoke-direct {p0}, Lax/O4/e;->m()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_19

    .line 16
    .line 17
    :goto_10
    invoke-direct {p0}, Lax/O4/e;->m()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_17

    .line 22
    .line 23
    goto :goto_10

    .line 24
    :cond_17
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_19
    const-string v0, "digit"

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    throw v0
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

.method private r()Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_b

    .line 6
    .line 7
    invoke-direct {p0}, Lax/O4/e;->x()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_b
    const-string v0, "name"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
.end method

.method private s()Lax/O4/g;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x75

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 7
    .line 8
    .line 9
    const/16 v0, 0x6c

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lax/O4/g;->d0:Lax/O4/g;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method private t()Lax/O4/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->B()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2d

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/O4/e;->l(C)Z

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lax/O4/e;->h:I

    .line 10
    .line 11
    invoke-direct {p0}, Lax/O4/e;->m()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2b

    .line 16
    .line 17
    const/16 v1, 0x30

    .line 18
    .line 19
    if-eq v0, v1, :cond_1b

    .line 20
    .line 21
    :goto_14
    invoke-direct {p0}, Lax/O4/e;->m()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    goto :goto_14

    .line 28
    :cond_1b
    invoke-direct {p0}, Lax/O4/e;->q()Z

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lax/O4/e;->o()Z

    .line 32
    .line 33
    .line 34
    new-instance v0, Lax/O4/c;

    .line 35
    .line 36
    invoke-direct {p0}, Lax/O4/e;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {v0, v1}, Lax/O4/c;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2b
    const-string v0, "digit"

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    throw v0
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

.method private u()Lax/O4/d;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/O4/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/O4/d;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x7d

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lax/O4/e;->l(C)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_14

    .line 19
    .line 20
    goto :goto_41

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lax/O4/e;->r()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 29
    .line 30
    .line 31
    const/16 v3, 0x3a

    .line 32
    .line 33
    invoke-direct {p0, v3}, Lax/O4/e;->l(C)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_49

    .line 38
    .line 39
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lax/O4/e;->z()Lax/O4/g;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v2, v3}, Lax/O4/d;->B(Ljava/lang/String;Lax/O4/g;)Lax/O4/d;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 50
    .line 51
    .line 52
    const/16 v2, 0x2c

    .line 53
    .line 54
    invoke-direct {p0, v2}, Lax/O4/e;->l(C)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_14

    .line 59
    .line 60
    invoke-direct {p0, v1}, Lax/O4/e;->l(C)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_42

    .line 65
    .line 66
    :goto_41
    return-object v0

    .line 67
    :cond_42
    const-string v0, "\',\' or \'}\'"

    .line 68
    .line 69
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    throw v0

    .line 74
    :cond_49
    const-string v0, "\':\'"

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    throw v0
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

.method private v(C)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/O4/e;->l(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "\'"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    throw p1
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

.method private w()Lax/O4/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/O4/f;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/O4/e;->x()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lax/O4/f;-><init>(Ljava/lang/String;)V

    .line 8
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
.end method

.method private x()Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/O4/e;->B()V

    .line 5
    .line 6
    .line 7
    :goto_6
    iget v0, p0, Lax/O4/e;->h:I

    .line 8
    .line 9
    const/16 v1, 0x22

    .line 10
    .line 11
    if-eq v0, v1, :cond_29

    .line 12
    .line 13
    const/16 v1, 0x5c

    .line 14
    .line 15
    if-ne v0, v1, :cond_1a

    .line 16
    .line 17
    invoke-direct {p0}, Lax/O4/e;->i()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lax/O4/e;->n()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lax/O4/e;->B()V

    .line 24
    .line 25
    .line 26
    goto :goto_6

    .line 27
    :cond_1a
    const/16 v1, 0x20

    .line 28
    .line 29
    if-lt v0, v1, :cond_22

    .line 30
    .line 31
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 32
    .line 33
    .line 34
    goto :goto_6

    .line 35
    :cond_22
    const-string v0, "valid string character"

    .line 36
    .line 37
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    throw v0

    .line 42
    :cond_29
    invoke-direct {p0}, Lax/O4/e;->a()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p0}, Lax/O4/e;->j()V

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
.end method

.method private y()Lax/O4/g;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x72

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 7
    .line 8
    .line 9
    const/16 v0, 0x75

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x65

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lax/O4/e;->v(C)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lax/O4/g;->q:Lax/O4/g;

    .line 20
    .line 21
    return-object v0
.end method

.method private z()Lax/O4/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/O4/e;->h:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_46

    .line 6
    .line 7
    const/16 v1, 0x2d

    .line 8
    .line 9
    if-eq v0, v1, :cond_41

    .line 10
    .line 11
    const/16 v1, 0x5b

    .line 12
    .line 13
    if-eq v0, v1, :cond_3c

    .line 14
    .line 15
    const/16 v1, 0x66

    .line 16
    .line 17
    if-eq v0, v1, :cond_37

    .line 18
    .line 19
    const/16 v1, 0x6e

    .line 20
    .line 21
    if-eq v0, v1, :cond_32

    .line 22
    .line 23
    const/16 v1, 0x74

    .line 24
    .line 25
    if-eq v0, v1, :cond_2d

    .line 26
    .line 27
    const/16 v1, 0x7b

    .line 28
    .line 29
    if-eq v0, v1, :cond_28

    .line 30
    .line 31
    packed-switch v0, :pswitch_data_4c

    .line 32
    .line 33
    .line 34
    const-string v0, "value"

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lax/O4/e;->c(Ljava/lang/String;)Lax/O4/i;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    throw v0

    .line 41
    :cond_28
    invoke-direct {p0}, Lax/O4/e;->u()Lax/O4/d;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_2d
    invoke-direct {p0}, Lax/O4/e;->y()Lax/O4/g;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_32
    invoke-direct {p0}, Lax/O4/e;->s()Lax/O4/g;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_37
    invoke-direct {p0}, Lax/O4/e;->p()Lax/O4/g;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :cond_3c
    invoke-direct {p0}, Lax/O4/e;->k()Lax/O4/a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :cond_41
    :pswitch_41
    invoke-direct {p0}, Lax/O4/e;->t()Lax/O4/g;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_46
    invoke-direct {p0}, Lax/O4/e;->w()Lax/O4/g;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_4c
    .packed-switch 0x30
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
        :pswitch_41
    .end packed-switch
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


# virtual methods
.method h()Lax/O4/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/O4/e;->j()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lax/O4/e;->z()Lax/O4/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0}, Lax/O4/e;->A()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/O4/e;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_14

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_14
    const-string v0, "Unexpected character"

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lax/O4/e;->b(Ljava/lang/String;)Lax/O4/i;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    throw v0
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
