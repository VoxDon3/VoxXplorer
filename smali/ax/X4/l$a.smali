.class final Lax/X4/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/X4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:[D

.field private final b:I

.field private final c:I


# direct methods
.method constructor <init>(I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    shl-int/lit8 v0, p1, 0x1

    .line 2
    new-array v0, v0, [D

    iput-object v0, p0, Lax/X4/l$a;->a:[D

    .line 3
    iput p1, p0, Lax/X4/l$a;->b:I

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lax/X4/l$a;->c:I

    return-void
.end method

.method constructor <init>(Lax/X4/l$a;II)V
    .registers 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sub-int/2addr p3, p2

    .line 6
    iput p3, p0, Lax/X4/l$a;->b:I

    .line 7
    iget-object p1, p1, Lax/X4/l$a;->a:[D

    iput-object p1, p0, Lax/X4/l$a;->a:[D

    shl-int/lit8 p1, p2, 0x1

    .line 8
    iput p1, p0, Lax/X4/l$a;->c:I

    return-void
.end method

.method static synthetic a(Lax/X4/l$a;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/X4/l$a;->b:I

    .line 2
    .line 3
    return p0
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

.method private j(I)I
    .registers 3

    .line 1
    shl-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget v0, p0, Lax/X4/l$a;->c:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    add-int/lit8 p1, p1, 0x1

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
.end method

.method private u(I)I
    .registers 3

    .line 1
    shl-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget v0, p0, Lax/X4/l$a;->c:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    return p1
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


# virtual methods
.method b(ILax/X4/l$b;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v2, v0, v1

    .line 8
    .line 9
    iget-wide v4, p2, Lax/X4/l$b;->a:D

    .line 10
    .line 11
    add-double/2addr v2, v4

    .line 12
    aput-wide v2, v0, v1

    .line 13
    .line 14
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget-wide v1, v0, p1

    .line 21
    .line 22
    iget-wide v3, p2, Lax/X4/l$b;->b:D

    .line 23
    .line 24
    add-double/2addr v1, v3

    .line 25
    aput-wide v1, v0, p1

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
.end method

.method c(ILax/X4/l$a;ILax/X4/l$b;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v1, v0, v1

    .line 8
    .line 9
    invoke-virtual {p2, p3}, Lax/X4/l$a;->s(I)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    add-double/2addr v1, v3

    .line 14
    iput-wide v1, p4, Lax/X4/l$b;->a:D

    .line 15
    .line 16
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    aget-wide v1, v0, p1

    .line 23
    .line 24
    invoke-virtual {p2, p3}, Lax/X4/l$a;->h(I)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    add-double/2addr v1, p1

    .line 29
    iput-wide v1, p4, Lax/X4/l$b;->b:D

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

.method d(ILax/X4/l$a;ILax/X4/l$b;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v1, v0, v1

    .line 8
    .line 9
    invoke-virtual {p2, p3}, Lax/X4/l$a;->h(I)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    sub-double/2addr v1, v3

    .line 14
    iput-wide v1, p4, Lax/X4/l$b;->a:D

    .line 15
    .line 16
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    aget-wide v1, v0, p1

    .line 23
    .line 24
    invoke-virtual {p2, p3}, Lax/X4/l$a;->s(I)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    add-double/2addr v1, p1

    .line 29
    iput-wide v1, p4, Lax/X4/l$b;->b:D

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

.method e(Lax/X4/l$a;)V
    .registers 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    iget v3, v1, Lax/X4/l$a;->c:I

    .line 8
    .line 9
    iget-object v1, v1, Lax/X4/l$a;->a:[D

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_b
    iget v5, v0, Lax/X4/l$a;->b:I

    .line 13
    .line 14
    if-ge v4, v5, :cond_3d

    .line 15
    .line 16
    iget-object v5, v0, Lax/X4/l$a;->a:[D

    .line 17
    .line 18
    aget-wide v6, v5, v2

    .line 19
    .line 20
    add-int/lit8 v12, v2, 0x1

    .line 21
    .line 22
    aget-wide v13, v5, v12

    .line 23
    .line 24
    aget-wide v8, v1, v3

    .line 25
    .line 26
    add-int/lit8 v15, v3, 0x1

    .line 27
    .line 28
    aget-wide v10, v1, v15

    .line 29
    .line 30
    mul-double v10, v10, v13

    .line 31
    .line 32
    invoke-static/range {v6 .. v11}, Lax/X4/i;->a(DDD)D

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    aput-wide v8, v5, v2

    .line 37
    .line 38
    iget-object v5, v0, Lax/X4/l$a;->a:[D

    .line 39
    .line 40
    neg-double v6, v6

    .line 41
    aget-wide v18, v1, v15

    .line 42
    .line 43
    aget-wide v8, v1, v3

    .line 44
    .line 45
    mul-double v20, v13, v8

    .line 46
    .line 47
    move-wide/from16 v16, v6

    .line 48
    .line 49
    invoke-static/range {v16 .. v21}, Lax/X4/i;->a(DDD)D

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    aput-wide v6, v5, v12

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x2

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x2

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_b

    .line 62
    :cond_3d
    return-void
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
.end method

.method f(Lax/X4/l$a;)V
    .registers 11

    .line 1
    iget v0, p1, Lax/X4/l$a;->c:I

    .line 2
    .line 3
    iget-object p1, p1, Lax/X4/l$a;->a:[D

    .line 4
    .line 5
    iget v1, p0, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    iget v2, p0, Lax/X4/l$a;->b:I

    .line 8
    .line 9
    add-int/2addr v2, v1

    .line 10
    shl-int/lit8 v2, v2, 0x1

    .line 11
    .line 12
    :goto_b
    if-ge v1, v2, :cond_26

    .line 13
    .line 14
    iget-object v3, p0, Lax/X4/l$a;->a:[D

    .line 15
    .line 16
    aget-wide v4, v3, v1

    .line 17
    .line 18
    aget-wide v6, p1, v0

    .line 19
    .line 20
    mul-double v6, v6, v4

    .line 21
    .line 22
    aput-wide v6, v3, v1

    .line 23
    .line 24
    add-int/lit8 v6, v1, 0x1

    .line 25
    .line 26
    add-int/lit8 v7, v0, 0x1

    .line 27
    .line 28
    aget-wide v7, p1, v7

    .line 29
    .line 30
    mul-double v4, v4, v7

    .line 31
    .line 32
    aput-wide v4, v3, v6

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x2

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    goto :goto_b

    .line 39
    :cond_26
    return-void
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

.method g(ILax/X4/l$b;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v1, v0, v1

    .line 8
    .line 9
    iput-wide v1, p2, Lax/X4/l$b;->a:D

    .line 10
    .line 11
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    aget-wide v1, v0, p1

    .line 18
    .line 19
    iput-wide v1, p2, Lax/X4/l$b;->b:D

    .line 20
    .line 21
    return-void
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

.method h(I)D
    .registers 5

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget v1, p0, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    aget-wide v1, v0, p1

    .line 11
    .line 12
    return-wide v1
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

.method i(ID)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget v1, p0, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    aput-wide p2, v0, p1

    .line 11
    .line 12
    return-void
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

.method k(ILax/X4/l$b;)V
    .registers 15

    .line 1
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lax/X4/l$a;->a:[D

    .line 10
    .line 11
    aget-wide v2, v1, v0

    .line 12
    .line 13
    aget-wide v8, v1, p1

    .line 14
    .line 15
    iget-wide v4, p2, Lax/X4/l$b;->a:D

    .line 16
    .line 17
    neg-double v6, v8

    .line 18
    iget-wide v10, p2, Lax/X4/l$b;->b:D

    .line 19
    .line 20
    mul-double v6, v6, v10

    .line 21
    .line 22
    invoke-static/range {v2 .. v7}, Lax/X4/i;->a(DDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    aput-wide v4, v1, v0

    .line 27
    .line 28
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 29
    .line 30
    iget-wide v4, p2, Lax/X4/l$b;->b:D

    .line 31
    .line 32
    iget-wide v6, p2, Lax/X4/l$b;->a:D

    .line 33
    .line 34
    mul-double v6, v6, v8

    .line 35
    .line 36
    invoke-static/range {v2 .. v7}, Lax/X4/i;->a(DDD)D

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    aput-wide v1, v0, p1

    .line 41
    .line 42
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

.method l(ILax/X4/l$b;)V
    .registers 15

    .line 1
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lax/X4/l$a;->a:[D

    .line 10
    .line 11
    aget-wide v2, v1, v0

    .line 12
    .line 13
    aget-wide v4, v1, p1

    .line 14
    .line 15
    neg-double v6, v2

    .line 16
    iget-wide v8, p2, Lax/X4/l$b;->b:D

    .line 17
    .line 18
    neg-double v4, v4

    .line 19
    iget-wide v10, p2, Lax/X4/l$b;->a:D

    .line 20
    .line 21
    mul-double v10, v10, v4

    .line 22
    .line 23
    invoke-static/range {v6 .. v11}, Lax/X4/i;->a(DDD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v6

    .line 27
    aput-wide v6, v1, v0

    .line 28
    .line 29
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 30
    .line 31
    move-wide v6, v4

    .line 32
    iget-wide v4, p2, Lax/X4/l$b;->a:D

    .line 33
    .line 34
    iget-wide v8, p2, Lax/X4/l$b;->b:D

    .line 35
    .line 36
    mul-double v6, v6, v8

    .line 37
    .line 38
    invoke-static/range {v2 .. v7}, Lax/X4/i;->a(DDD)D

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    aput-wide v1, v0, p1

    .line 43
    .line 44
    return-void
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
.end method

.method m(ILax/X4/l$b;)V
    .registers 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lax/X4/l$a;->u(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct/range {p0 .. p1}, Lax/X4/l$a;->j(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object v4, v0, Lax/X4/l$a;->a:[D

    .line 14
    .line 15
    aget-wide v5, v4, v2

    .line 16
    .line 17
    aget-wide v11, v4, v3

    .line 18
    .line 19
    iget-wide v7, v1, Lax/X4/l$b;->a:D

    .line 20
    .line 21
    iget-wide v9, v1, Lax/X4/l$b;->b:D

    .line 22
    .line 23
    mul-double v9, v9, v11

    .line 24
    .line 25
    invoke-static/range {v5 .. v10}, Lax/X4/i;->a(DDD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    aput-wide v7, v4, v2

    .line 30
    .line 31
    iget-object v2, v0, Lax/X4/l$a;->a:[D

    .line 32
    .line 33
    neg-double v13, v5

    .line 34
    iget-wide v4, v1, Lax/X4/l$b;->b:D

    .line 35
    .line 36
    iget-wide v6, v1, Lax/X4/l$b;->a:D

    .line 37
    .line 38
    mul-double v17, v11, v6

    .line 39
    .line 40
    move-wide v15, v4

    .line 41
    invoke-static/range {v13 .. v18}, Lax/X4/i;->a(DDD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    aput-wide v4, v2, v3

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

.method n(ILax/X4/l$b;Lax/X4/l$b;)V
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lax/X4/l$a;->a:[D

    .line 8
    .line 9
    invoke-direct/range {p0 .. p1}, Lax/X4/l$a;->u(I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    aget-wide v5, v3, v4

    .line 14
    .line 15
    iget-object v3, v0, Lax/X4/l$a;->a:[D

    .line 16
    .line 17
    invoke-direct/range {p0 .. p1}, Lax/X4/l$a;->j(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    aget-wide v11, v3, v4

    .line 22
    .line 23
    iget-wide v7, v1, Lax/X4/l$b;->a:D

    .line 24
    .line 25
    iget-wide v3, v1, Lax/X4/l$b;->b:D

    .line 26
    .line 27
    mul-double v9, v11, v3

    .line 28
    .line 29
    invoke-static/range {v5 .. v10}, Lax/X4/i;->a(DDD)D

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iput-wide v3, v2, Lax/X4/l$b;->a:D

    .line 34
    .line 35
    neg-double v13, v5

    .line 36
    iget-wide v3, v1, Lax/X4/l$b;->b:D

    .line 37
    .line 38
    iget-wide v5, v1, Lax/X4/l$b;->a:D

    .line 39
    .line 40
    mul-double v17, v11, v5

    .line 41
    .line 42
    move-wide v15, v3

    .line 43
    invoke-static/range {v13 .. v18}, Lax/X4/i;->a(DDD)D

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    iput-wide v3, v2, Lax/X4/l$b;->b:D

    .line 48
    .line 49
    return-void
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

.method o(ILax/X4/l$b;)V
    .registers 15

    .line 1
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lax/X4/l$a;->a:[D

    .line 10
    .line 11
    aget-wide v2, v1, v0

    .line 12
    .line 13
    aget-wide v4, v1, p1

    .line 14
    .line 15
    neg-double v6, v2

    .line 16
    iget-wide v8, p2, Lax/X4/l$b;->b:D

    .line 17
    .line 18
    iget-wide v2, p2, Lax/X4/l$b;->a:D

    .line 19
    .line 20
    mul-double v10, v4, v2

    .line 21
    .line 22
    invoke-static/range {v6 .. v11}, Lax/X4/i;->a(DDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    aput-wide v2, v1, v0

    .line 27
    .line 28
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 29
    .line 30
    iget-wide v8, p2, Lax/X4/l$b;->a:D

    .line 31
    .line 32
    neg-double v1, v4

    .line 33
    iget-wide v3, p2, Lax/X4/l$b;->b:D

    .line 34
    .line 35
    mul-double v10, v1, v3

    .line 36
    .line 37
    invoke-static/range {v6 .. v11}, Lax/X4/i;->a(DDD)D

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    aput-wide v1, v0, p1

    .line 42
    .line 43
    return-void
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
.end method

.method p(ILax/X4/l$b;Lax/X4/l$b;)V
    .registers 14

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v2, v0, v1

    .line 8
    .line 9
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    aget-wide v8, v0, p1

    .line 16
    .line 17
    iget-wide v4, p2, Lax/X4/l$b;->a:D

    .line 18
    .line 19
    neg-double v0, v8

    .line 20
    iget-wide v6, p2, Lax/X4/l$b;->b:D

    .line 21
    .line 22
    mul-double v6, v6, v0

    .line 23
    .line 24
    invoke-static/range {v2 .. v7}, Lax/X4/i;->a(DDD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iput-wide v0, p3, Lax/X4/l$b;->a:D

    .line 29
    .line 30
    iget-wide v4, p2, Lax/X4/l$b;->b:D

    .line 31
    .line 32
    iget-wide p1, p2, Lax/X4/l$b;->a:D

    .line 33
    .line 34
    mul-double v6, v8, p1

    .line 35
    .line 36
    invoke-static/range {v2 .. v7}, Lax/X4/i;->a(DDD)D

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    iput-wide p1, p3, Lax/X4/l$b;->b:D

    .line 41
    .line 42
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

.method q(Lax/X4/l$a;)V
    .registers 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    iget-object v1, v1, Lax/X4/l$a;->a:[D

    .line 8
    .line 9
    iget v3, v0, Lax/X4/l$a;->c:I

    .line 10
    .line 11
    iget v4, v0, Lax/X4/l$a;->b:I

    .line 12
    .line 13
    add-int/2addr v4, v3

    .line 14
    shl-int/lit8 v4, v4, 0x1

    .line 15
    .line 16
    :goto_f
    if-ge v3, v4, :cond_38

    .line 17
    .line 18
    iget-object v5, v0, Lax/X4/l$a;->a:[D

    .line 19
    .line 20
    aget-wide v6, v5, v3

    .line 21
    .line 22
    add-int/lit8 v12, v3, 0x1

    .line 23
    .line 24
    aget-wide v13, v5, v12

    .line 25
    .line 26
    aget-wide v8, v1, v2

    .line 27
    .line 28
    add-int/lit8 v10, v2, 0x1

    .line 29
    .line 30
    aget-wide v15, v1, v10

    .line 31
    .line 32
    neg-double v10, v13

    .line 33
    mul-double v10, v10, v15

    .line 34
    .line 35
    invoke-static/range {v6 .. v11}, Lax/X4/i;->a(DDD)D

    .line 36
    .line 37
    .line 38
    move-result-wide v10

    .line 39
    aput-wide v10, v5, v3

    .line 40
    .line 41
    iget-object v5, v0, Lax/X4/l$a;->a:[D

    .line 42
    .line 43
    mul-double v10, v13, v8

    .line 44
    .line 45
    move-wide v8, v15

    .line 46
    invoke-static/range {v6 .. v11}, Lax/X4/i;->a(DDD)D

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    aput-wide v6, v5, v12

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x2

    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x2

    .line 55
    .line 56
    goto :goto_f

    .line 57
    :cond_38
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method r(II)D
    .registers 4

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    add-int/2addr p1, p2

    .line 6
    aget-wide p1, v0, p1

    .line 7
    .line 8
    return-wide p1
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

.method s(I)D
    .registers 5

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget v1, p0, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    aget-wide v1, v0, p1

    .line 9
    .line 10
    return-wide v1
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

.method t(ID)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget v1, p0, Lax/X4/l$a;->c:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    aput-wide p2, v0, p1

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

.method v(IDD)V
    .registers 7

    .line 1
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 6
    .line 7
    aput-wide p2, v0, p1

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aput-wide p4, v0, p1

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

.method w()V
    .registers 13

    .line 1
    iget v0, p0, Lax/X4/l$a;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/X4/l$a;->b:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    shl-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    :goto_7
    if-ge v0, v1, :cond_28

    .line 9
    .line 10
    iget-object v2, p0, Lax/X4/l$a;->a:[D

    .line 11
    .line 12
    aget-wide v3, v2, v0

    .line 13
    .line 14
    add-int/lit8 v9, v0, 0x1

    .line 15
    .line 16
    aget-wide v10, v2, v9

    .line 17
    .line 18
    neg-double v5, v10

    .line 19
    mul-double v7, v5, v10

    .line 20
    .line 21
    move-wide v5, v3

    .line 22
    invoke-static/range {v3 .. v8}, Lax/X4/i;->a(DDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    aput-wide v5, v2, v0

    .line 27
    .line 28
    iget-object v2, p0, Lax/X4/l$a;->a:[D

    .line 29
    .line 30
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 31
    .line 32
    mul-double v3, v3, v5

    .line 33
    .line 34
    mul-double v3, v3, v10

    .line 35
    .line 36
    aput-wide v3, v2, v9

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    goto :goto_7

    .line 41
    :cond_28
    return-void
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

.method x(ILax/X4/l$a;ILax/X4/l$b;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v1, v0, v1

    .line 8
    .line 9
    invoke-virtual {p2, p3}, Lax/X4/l$a;->s(I)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    sub-double/2addr v1, v3

    .line 14
    iput-wide v1, p4, Lax/X4/l$b;->a:D

    .line 15
    .line 16
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    aget-wide v1, v0, p1

    .line 23
    .line 24
    invoke-virtual {p2, p3}, Lax/X4/l$a;->h(I)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    sub-double/2addr v1, p1

    .line 29
    iput-wide v1, p4, Lax/X4/l$b;->b:D

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

.method y(ILax/X4/l$a;ILax/X4/l$b;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-wide v1, v0, v1

    .line 8
    .line 9
    invoke-virtual {p2, p3}, Lax/X4/l$a;->h(I)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    add-double/2addr v1, v3

    .line 14
    iput-wide v1, p4, Lax/X4/l$b;->a:D

    .line 15
    .line 16
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    aget-wide v1, v0, p1

    .line 23
    .line 24
    invoke-virtual {p2, p3}, Lax/X4/l$a;->s(I)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    sub-double/2addr v1, p1

    .line 29
    iput-wide v1, p4, Lax/X4/l$b;->b:D

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

.method z(II)V
    .registers 9

    .line 1
    invoke-direct {p0, p1}, Lax/X4/l$a;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1}, Lax/X4/l$a;->j(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lax/X4/l$a;->a:[D

    .line 10
    .line 11
    aget-wide v2, v1, v0

    .line 12
    .line 13
    aget-wide v4, v1, p1

    .line 14
    .line 15
    invoke-static {v2, v3, p2}, Ljava/lang/Math;->scalb(DI)D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    aput-wide v2, v1, v0

    .line 20
    .line 21
    iget-object v0, p0, Lax/X4/l$a;->a:[D

    .line 22
    .line 23
    invoke-static {v4, v5, p2}, Ljava/lang/Math;->scalb(DI)D

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    aput-wide v1, v0, p1

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
.end method
