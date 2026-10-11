.class final Lax/i2/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i2/A$a;
    }
.end annotation


# instance fields
.field private final a:Lax/i2/A$a;

.field private final b:I

.field private c:I


# direct methods
.method constructor <init>(ILax/i2/A$a;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lax/i2/A;->c:I

    .line 6
    .line 7
    iput p1, p0, Lax/i2/A;->b:I

    .line 8
    .line 9
    iput-object p2, p0, Lax/i2/A;->a:Lax/i2/A$a;

    .line 10
    .line 11
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

.method private a(II)V
    .registers 6

    .line 1
    iget v0, p0, Lax/i2/A;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    :goto_9
    const-string v1, "End has already been set."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lax/b0/g;->b(ZLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput p1, p0, Lax/i2/A;->c:I

    .line 16
    .line 17
    iget v0, p0, Lax/i2/A;->b:I

    .line 18
    .line 19
    if-le p1, v0, :cond_19

    .line 20
    .line 21
    add-int/2addr v0, v2

    .line 22
    invoke-direct {p0, v0, p1, v2, p2}, Lax/i2/A;->f(IIZI)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    if-ge p1, v0, :cond_1f

    .line 27
    .line 28
    sub-int/2addr v0, v2

    .line 29
    invoke-direct {p0, p1, v0, v2, p2}, Lax/i2/A;->f(IIZI)V

    .line 30
    .line 31
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
.end method

.method private c(II)V
    .registers 7

    .line 1
    iget v0, p0, Lax/i2/A;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge p1, v0, :cond_1a

    .line 5
    .line 6
    iget v2, p0, Lax/i2/A;->b:I

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-ge p1, v2, :cond_15

    .line 10
    .line 11
    add-int/2addr v2, v1

    .line 12
    invoke-direct {p0, v2, v0, v3, p2}, Lax/i2/A;->f(IIZI)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lax/i2/A;->b:I

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    invoke-direct {p0, p1, v0, v1, p2}, Lax/i2/A;->f(IIZI)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    add-int/2addr p1, v1

    .line 23
    invoke-direct {p0, p1, v0, v3, p2}, Lax/i2/A;->f(IIZI)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    if-le p1, v0, :cond_20

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
    invoke-direct {p0, v0, p1, v1, p2}, Lax/i2/A;->f(IIZI)V

    .line 31
    .line 32
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

.method private d(II)V
    .registers 7

    .line 1
    iget v0, p0, Lax/i2/A;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-le p1, v0, :cond_1a

    .line 5
    .line 6
    iget v2, p0, Lax/i2/A;->b:I

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-le p1, v2, :cond_15

    .line 10
    .line 11
    sub-int/2addr v2, v1

    .line 12
    invoke-direct {p0, v0, v2, v3, p2}, Lax/i2/A;->f(IIZI)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lax/i2/A;->b:I

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    invoke-direct {p0, v0, p1, v1, p2}, Lax/i2/A;->f(IIZI)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    sub-int/2addr p1, v1

    .line 23
    invoke-direct {p0, v0, p1, v3, p2}, Lax/i2/A;->f(IIZI)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    if-ge p1, v0, :cond_20

    .line 28
    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-direct {p0, p1, v0, v1, p2}, Lax/i2/A;->f(IIZI)V

    .line 31
    .line 32
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

.method private e(II)V
    .registers 7

    .line 1
    iget v0, p0, Lax/i2/A;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    const-string v1, "End must already be set."

    .line 12
    .line 13
    invoke-static {v0, v1}, Lax/b0/g;->b(ZLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lax/i2/A;->b:I

    .line 17
    .line 18
    iget v1, p0, Lax/i2/A;->c:I

    .line 19
    .line 20
    if-eq v0, v1, :cond_16

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    :cond_16
    const-string v0, "Beging and end point to same position."

    .line 24
    .line 25
    invoke-static {v2, v0}, Lax/b0/g;->b(ZLjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lax/i2/A;->c:I

    .line 29
    .line 30
    iget v1, p0, Lax/i2/A;->b:I

    .line 31
    .line 32
    if-le v0, v1, :cond_25

    .line 33
    .line 34
    invoke-direct {p0, p1, p2}, Lax/i2/A;->c(II)V

    .line 35
    .line 36
    .line 37
    goto :goto_2a

    .line 38
    :cond_25
    if-ge v0, v1, :cond_2a

    .line 39
    .line 40
    invoke-direct {p0, p1, p2}, Lax/i2/A;->d(II)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    :goto_2a
    iput p1, p0, Lax/i2/A;->c:I

    .line 44
    .line 45
    return-void
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

.method private f(IIZI)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/i2/A;->a:Lax/i2/A$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lax/i2/A$a;->a(IIZI)V

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
.end method


# virtual methods
.method b(II)V
    .registers 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_5

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
    const-string v2, "Position cannot be NO_POSITION."

    .line 8
    .line 9
    invoke-static {v1, v2}, Lax/b0/g;->b(ZLjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lax/i2/A;->c:I

    .line 13
    .line 14
    if-eq v1, v0, :cond_18

    .line 15
    .line 16
    iget v2, p0, Lax/i2/A;->b:I

    .line 17
    .line 18
    if-ne v1, v2, :cond_14

    .line 19
    .line 20
    goto :goto_18

    .line 21
    :cond_14
    invoke-direct {p0, p1, p2}, Lax/i2/A;->e(II)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    :goto_18
    iput v0, p0, Lax/i2/A;->c:I

    .line 26
    .line 27
    invoke-direct {p0, p1, p2}, Lax/i2/A;->a(II)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Range{begin="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lax/i2/A;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", end="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lax/i2/A;->c:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "}"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
