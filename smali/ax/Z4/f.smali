.class public Lax/Z4/f;
.super Lax/T4/l;
.source "SourceFile"


# instance fields
.field protected final d:Lax/Z4/f;

.field protected e:Lax/Z4/b;

.field protected f:Lax/Z4/f;

.field protected g:Ljava/lang/String;

.field protected h:Ljava/lang/Object;

.field protected i:Z


# direct methods
.method protected constructor <init>(ILax/Z4/f;Lax/Z4/b;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/T4/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lax/T4/l;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lax/Z4/f;->d:Lax/Z4/f;

    .line 7
    .line 8
    iput-object p3, p0, Lax/Z4/f;->e:Lax/Z4/b;

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lax/T4/l;->b:I

    .line 12
    .line 13
    return-void
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

.method private final i(Lax/Z4/b;Ljava/lang/String;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/T4/k;
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lax/Z4/b;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2e

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/Z4/b;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lax/T4/f;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "Duplicate field \'"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p2, "\'"

    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    instance-of v1, p1, Lax/T4/g;

    .line 36
    .line 37
    if-eqz v1, :cond_29

    .line 38
    .line 39
    check-cast p1, Lax/T4/g;

    .line 40
    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 p1, 0x0

    .line 43
    :goto_2a
    invoke-direct {v0, p2, p1}, Lax/T4/f;-><init>(Ljava/lang/String;Lax/T4/g;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_2e
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

.method public static m(Lax/Z4/b;)Lax/Z4/f;
    .registers 4

    .line 1
    new-instance v0, Lax/Z4/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, p0}, Lax/Z4/f;-><init>(ILax/Z4/f;Lax/Z4/b;)V

    .line 6
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


# virtual methods
.method public final b()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z4/f;->g:Ljava/lang/String;

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

.method public j()Lax/Z4/f;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/Z4/f;->h:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v0, p0, Lax/Z4/f;->d:Lax/Z4/f;

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

.method public k()Lax/Z4/f;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Z4/f;->f:Lax/Z4/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_17

    .line 5
    .line 6
    new-instance v0, Lax/Z4/f;

    .line 7
    .line 8
    iget-object v2, p0, Lax/Z4/f;->e:Lax/Z4/b;

    .line 9
    .line 10
    if-nez v2, :cond_d

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_11

    .line 14
    :cond_d
    invoke-virtual {v2}, Lax/Z4/b;->a()Lax/Z4/b;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_11
    invoke-direct {v0, v1, p0, v2}, Lax/Z4/f;-><init>(ILax/Z4/f;Lax/Z4/b;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/Z4/f;->f:Lax/Z4/f;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_17
    invoke-virtual {v0, v1}, Lax/Z4/f;->n(I)Lax/Z4/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public l()Lax/Z4/f;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Z4/f;->f:Lax/Z4/f;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-nez v0, :cond_17

    .line 5
    .line 6
    new-instance v0, Lax/Z4/f;

    .line 7
    .line 8
    iget-object v2, p0, Lax/Z4/f;->e:Lax/Z4/b;

    .line 9
    .line 10
    if-nez v2, :cond_d

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_11

    .line 14
    :cond_d
    invoke-virtual {v2}, Lax/Z4/b;->a()Lax/Z4/b;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_11
    invoke-direct {v0, v1, p0, v2}, Lax/Z4/f;-><init>(ILax/Z4/f;Lax/Z4/b;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/Z4/f;->f:Lax/Z4/f;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_17
    invoke-virtual {v0, v1}, Lax/Z4/f;->n(I)Lax/Z4/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public n(I)Lax/Z4/f;
    .registers 3

    .line 1
    iput p1, p0, Lax/T4/l;->a:I

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lax/T4/l;->b:I

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lax/Z4/f;->g:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lax/Z4/f;->i:Z

    .line 11
    .line 12
    iput-object p1, p0, Lax/Z4/f;->h:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p1, p0, Lax/Z4/f;->e:Lax/Z4/b;

    .line 15
    .line 16
    if-eqz p1, :cond_14

    .line 17
    .line 18
    invoke-virtual {p1}, Lax/Z4/b;->d()V

    .line 19
    .line 20
    .line 21
    :cond_14
    return-object p0
    .line 22
.end method

.method public o(Ljava/lang/String;)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/T4/k;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/T4/l;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1d

    .line 5
    .line 6
    iget-boolean v0, p0, Lax/Z4/f;->i:Z

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    goto :goto_1d

    .line 11
    :cond_a
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lax/Z4/f;->i:Z

    .line 13
    .line 14
    iput-object p1, p0, Lax/Z4/f;->g:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lax/Z4/f;->e:Lax/Z4/b;

    .line 17
    .line 18
    if-eqz v1, :cond_16

    .line 19
    .line 20
    invoke-direct {p0, v1, p1}, Lax/Z4/f;->i(Lax/Z4/b;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget p1, p0, Lax/T4/l;->b:I

    .line 24
    .line 25
    if-gez p1, :cond_1c

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1c
    return v0

    .line 30
    :cond_1d
    :goto_1d
    const/4 p1, 0x4

    .line 31
    return p1
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

.method public p()I
    .registers 5

    .line 1
    iget v0, p0, Lax/T4/l;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    if-ne v0, v3, :cond_15

    .line 7
    .line 8
    iget-boolean v0, p0, Lax/Z4/f;->i:Z

    .line 9
    .line 10
    if-nez v0, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    return v0

    .line 14
    :cond_d
    iput-boolean v1, p0, Lax/Z4/f;->i:Z

    .line 15
    .line 16
    iget v0, p0, Lax/T4/l;->b:I

    .line 17
    .line 18
    add-int/2addr v0, v2

    .line 19
    iput v0, p0, Lax/T4/l;->b:I

    .line 20
    .line 21
    return v3

    .line 22
    :cond_15
    if-ne v0, v2, :cond_21

    .line 23
    .line 24
    iget v0, p0, Lax/T4/l;->b:I

    .line 25
    .line 26
    add-int/lit8 v3, v0, 0x1

    .line 27
    .line 28
    iput v3, p0, Lax/T4/l;->b:I

    .line 29
    .line 30
    if-gez v0, :cond_20

    .line 31
    .line 32
    return v1

    .line 33
    :cond_20
    return v2

    .line 34
    :cond_21
    iget v0, p0, Lax/T4/l;->b:I

    .line 35
    .line 36
    add-int/2addr v0, v2

    .line 37
    iput v0, p0, Lax/T4/l;->b:I

    .line 38
    .line 39
    if-nez v0, :cond_29

    .line 40
    .line 41
    return v1

    .line 42
    :cond_29
    const/4 v0, 0x3

    .line 43
    return v0
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
