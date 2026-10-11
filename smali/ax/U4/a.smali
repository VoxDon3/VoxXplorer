.class public abstract Lax/U4/a;
.super Lax/T4/g;
.source "SourceFile"


# static fields
.field protected static final k0:I


# instance fields
.field protected f0:Lax/T4/n;

.field protected g0:I

.field protected h0:Z

.field protected i0:Lax/Z4/f;

.field protected j0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    sget-object v0, Lax/T4/g$a;->j0:Lax/T4/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/T4/g$a;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lax/T4/g$a;->i0:Lax/T4/g$a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/T4/g$a;->l()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    or-int/2addr v0, v1

    .line 14
    sget-object v1, Lax/T4/g$a;->l0:Lax/T4/g$a;

    .line 15
    .line 16
    invoke-virtual {v1}, Lax/T4/g$a;->l()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    or-int/2addr v0, v1

    .line 21
    sput v0, Lax/U4/a;->k0:I

    .line 22
    .line 23
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

.method protected constructor <init>(ILax/T4/n;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/T4/g;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lax/U4/a;->g0:I

    .line 5
    .line 6
    iput-object p2, p0, Lax/U4/a;->f0:Lax/T4/n;

    .line 7
    .line 8
    sget-object p2, Lax/T4/g$a;->l0:Lax/T4/g$a;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lax/T4/g$a;->j(I)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_14

    .line 15
    .line 16
    invoke-static {p0}, Lax/Z4/b;->e(Lax/T4/g;)Lax/Z4/b;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 p2, 0x0

    .line 22
    :goto_15
    invoke-static {p2}, Lax/Z4/f;->m(Lax/Z4/b;)Lax/Z4/f;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 27
    .line 28
    sget-object p2, Lax/T4/g$a;->j0:Lax/T4/g$a;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lax/T4/g$a;->j(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, Lax/U4/a;->h0:Z

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method protected A0([CII)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_7

    .line 2
    .line 3
    const-string v0, "Invalid `char[]` argument: `null`"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    array-length p1, p1

    .line 9
    add-int v0, p2, p3

    .line 10
    .line 11
    or-int v1, p2, p3

    .line 12
    .line 13
    or-int/2addr v1, v0

    .line 14
    sub-int v0, p1, v0

    .line 15
    .line 16
    or-int/2addr v0, v1

    .line 17
    if-gez v0, :cond_33

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x3

    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    aput-object p2, v0, v1

    .line 36
    .line 37
    const/4 p2, 0x1

    .line 38
    aput-object p3, v0, p2

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    aput-object p1, v0, p2

    .line 42
    .line 43
    const-string p1, "Invalid \'offset\' (%d) and/or \'len\' (%d) arguments for `char[]` of length %d"

    .line 44
    .line 45
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    return-void
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

.method protected C0(Ljava/lang/String;II)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_7

    .line 2
    .line 3
    const-string v0, "Invalid `String` argument: `null`"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    add-int v0, p2, p3

    .line 13
    .line 14
    or-int v1, p2, p3

    .line 15
    .line 16
    or-int/2addr v1, v0

    .line 17
    sub-int v0, p1, v0

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    if-gez v0, :cond_36

    .line 21
    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v0, 0x3

    .line 35
    new-array v0, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    aput-object p2, v0, v1

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    aput-object p3, v0, p2

    .line 42
    .line 43
    const/4 p2, 0x2

    .line 44
    aput-object p1, v0, p2

    .line 45
    .line 46
    const-string p1, "Invalid \'offset\' (%d) and/or \'len\' (%d) arguments for `String` of length %d"

    .line 47
    .line 48
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
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

.method protected D0()Lax/T4/o;
    .registers 2

    .line 1
    new-instance v0, Lax/b5/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/b5/e;-><init>()V

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

.method protected final F0(II)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const v0, 0xdc00

    .line 2
    .line 3
    .line 4
    if-lt p2, v0, :cond_a

    .line 5
    .line 6
    const v1, 0xdfff

    .line 7
    .line 8
    .line 9
    if-le p2, v1, :cond_24

    .line 10
    .line 11
    :cond_a
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x2

    .line 20
    new-array v3, v3, [Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    aput-object v1, v3, v4

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    aput-object v2, v3, v1

    .line 27
    .line 28
    const-string v1, "Incomplete surrogate pair: first char 0x%04X, second 0x%04X"

    .line 29
    .line 30
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0, v1}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    const v1, 0xd800

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v1

    .line 41
    shl-int/lit8 p1, p1, 0xa

    .line 42
    .line 43
    const/high16 v1, 0x10000

    .line 44
    .line 45
    add-int/2addr p1, v1

    .line 46
    sub-int/2addr p2, v0

    .line 47
    add-int/2addr p1, p2

    .line 48
    return p1
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

.method public G0()Lax/T4/l;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

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

.method public final L0(Lax/T4/g$a;)Z
    .registers 3

    .line 1
    iget v0, p0, Lax/U4/a;->g0:I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/T4/g$a;->l()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    and-int/2addr p1, v0

    .line 8
    if-eqz p1, :cond_b

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    return p1
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

.method public close()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/U4/a;->j0:Z

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

.method public f()Lax/T4/g;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/T4/g;->c()Lax/T4/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/U4/a;->D0()Lax/T4/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lax/T4/g;->e(Lax/T4/o;)Lax/T4/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
