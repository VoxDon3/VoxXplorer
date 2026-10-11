.class final Lax/Z0/w0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Z0/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I

.field private c:J

.field private d:Lax/i1/F$b;

.field private e:Z

.field private f:Z

.field final synthetic g:Lax/Z0/w0;


# direct methods
.method public constructor <init>(Lax/Z0/w0;Ljava/lang/String;ILax/i1/F$b;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/Z0/w0$a;->g:Lax/Z0/w0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/Z0/w0$a;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lax/Z0/w0$a;->b:I

    .line 9
    .line 10
    if-nez p4, :cond_e

    .line 11
    .line 12
    const-wide/16 p1, -0x1

    .line 13
    .line 14
    goto :goto_10

    .line 15
    :cond_e
    iget-wide p1, p4, Lax/i1/F$b;->d:J

    .line 16
    .line 17
    :goto_10
    iput-wide p1, p0, Lax/Z0/w0$a;->c:J

    .line 18
    .line 19
    if-eqz p4, :cond_1c

    .line 20
    .line 21
    invoke-virtual {p4}, Lax/i1/F$b;->b()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1c

    .line 26
    .line 27
    iput-object p4, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 28
    .line 29
    :cond_1c
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

.method static synthetic a(Lax/Z0/w0$a;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/Z0/w0$a;->a:Ljava/lang/String;

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

.method static synthetic b(Lax/Z0/w0$a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/Z0/w0$a;->c:J

    .line 2
    .line 3
    return-wide v0
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

.method static synthetic c(Lax/Z0/w0$a;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/Z0/w0$a;->b:I

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

.method static synthetic d(Lax/Z0/w0$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/Z0/w0$a;->e:Z

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

.method static synthetic e(Lax/Z0/w0$a;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/Z0/w0$a;->e:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic f(Lax/Z0/w0$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/Z0/w0$a;->f:Z

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

.method static synthetic g(Lax/Z0/w0$a;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/Z0/w0$a;->f:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic h(Lax/Z0/w0$a;)Lax/i1/F$b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

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

.method private l(Lax/P0/N;Lax/P0/N;I)I
    .registers 6

    .line 1
    invoke-virtual {p1}, Lax/P0/N;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-lt p3, v0, :cond_f

    .line 7
    .line 8
    invoke-virtual {p2}, Lax/P0/N;->p()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-ge p3, p1, :cond_e

    .line 13
    .line 14
    return p3

    .line 15
    :cond_e
    return v1

    .line 16
    :cond_f
    iget-object v0, p0, Lax/Z0/w0$a;->g:Lax/Z0/w0;

    .line 17
    .line 18
    invoke-static {v0}, Lax/Z0/w0;->j(Lax/Z0/w0;)Lax/P0/N$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, p3, v0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 23
    .line 24
    .line 25
    iget-object p3, p0, Lax/Z0/w0$a;->g:Lax/Z0/w0;

    .line 26
    .line 27
    invoke-static {p3}, Lax/Z0/w0;->j(Lax/Z0/w0;)Lax/P0/N$c;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iget p3, p3, Lax/P0/N$c;->n:I

    .line 32
    .line 33
    :goto_20
    iget-object v0, p0, Lax/Z0/w0$a;->g:Lax/Z0/w0;

    .line 34
    .line 35
    invoke-static {v0}, Lax/Z0/w0;->j(Lax/Z0/w0;)Lax/P0/N$c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget v0, v0, Lax/P0/N$c;->o:I

    .line 40
    .line 41
    if-gt p3, v0, :cond_44

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Lax/P0/N;->m(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eq v0, v1, :cond_41

    .line 52
    .line 53
    iget-object p1, p0, Lax/Z0/w0$a;->g:Lax/Z0/w0;

    .line 54
    .line 55
    invoke-static {p1}, Lax/Z0/w0;->k(Lax/Z0/w0;)Lax/P0/N$b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, v0, p1}, Lax/P0/N;->f(ILax/P0/N$b;)Lax/P0/N$b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget p1, p1, Lax/P0/N$b;->c:I

    .line 64
    .line 65
    return p1

    .line 66
    :cond_41
    add-int/lit8 p3, p3, 0x1

    .line 67
    .line 68
    goto :goto_20

    .line 69
    :cond_44
    return v1
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


# virtual methods
.method public i(ILax/i1/F$b;)Z
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p2, :cond_a

    .line 4
    .line 5
    iget p2, p0, Lax/Z0/w0$a;->b:I

    .line 6
    .line 7
    if-ne p1, p2, :cond_9

    .line 8
    .line 9
    return v1

    .line 10
    :cond_9
    return v0

    .line 11
    :cond_a
    iget-object p1, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 12
    .line 13
    if-nez p1, :cond_1e

    .line 14
    .line 15
    invoke-virtual {p2}, Lax/i1/F$b;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_1d

    .line 20
    .line 21
    iget-wide p1, p2, Lax/i1/F$b;->d:J

    .line 22
    .line 23
    iget-wide v2, p0, Lax/Z0/w0$a;->c:J

    .line 24
    .line 25
    cmp-long v4, p1, v2

    .line 26
    .line 27
    if-nez v4, :cond_1d

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1d
    return v0

    .line 31
    :cond_1e
    iget-wide v2, p2, Lax/i1/F$b;->d:J

    .line 32
    .line 33
    iget-wide v4, p1, Lax/i1/F$b;->d:J

    .line 34
    .line 35
    cmp-long v6, v2, v4

    .line 36
    .line 37
    if-nez v6, :cond_33

    .line 38
    .line 39
    iget v2, p2, Lax/i1/F$b;->b:I

    .line 40
    .line 41
    iget v3, p1, Lax/i1/F$b;->b:I

    .line 42
    .line 43
    if-ne v2, v3, :cond_33

    .line 44
    .line 45
    iget p2, p2, Lax/i1/F$b;->c:I

    .line 46
    .line 47
    iget p1, p1, Lax/i1/F$b;->c:I

    .line 48
    .line 49
    if-ne p2, p1, :cond_33

    .line 50
    .line 51
    return v1

    .line 52
    :cond_33
    return v0
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

.method public j(Lax/Z0/c$a;)Z
    .registers 12

    .line 1
    iget-object v0, p1, Lax/Z0/c$a;->d:Lax/i1/F$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_e

    .line 6
    .line 7
    iget v0, p0, Lax/Z0/w0$a;->b:I

    .line 8
    .line 9
    iget p1, p1, Lax/Z0/c$a;->c:I

    .line 10
    .line 11
    if-eq v0, p1, :cond_d

    .line 12
    .line 13
    return v1

    .line 14
    :cond_d
    return v2

    .line 15
    :cond_e
    iget-wide v3, p0, Lax/Z0/w0$a;->c:J

    .line 16
    .line 17
    const-wide/16 v5, -0x1

    .line 18
    .line 19
    cmp-long v7, v3, v5

    .line 20
    .line 21
    if-nez v7, :cond_17

    .line 22
    .line 23
    return v2

    .line 24
    :cond_17
    iget-wide v5, v0, Lax/i1/F$b;->d:J

    .line 25
    .line 26
    cmp-long v7, v5, v3

    .line 27
    .line 28
    if-lez v7, :cond_1e

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    iget-object v3, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 32
    .line 33
    if-nez v3, :cond_23

    .line 34
    .line 35
    return v2

    .line 36
    :cond_23
    iget-object v3, p1, Lax/Z0/c$a;->b:Lax/P0/N;

    .line 37
    .line 38
    iget-object v0, v0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v3, p1, Lax/Z0/c$a;->b:Lax/P0/N;

    .line 45
    .line 46
    iget-object v4, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 47
    .line 48
    iget-object v4, v4, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iget-object v4, p1, Lax/Z0/c$a;->d:Lax/i1/F$b;

    .line 55
    .line 56
    iget-wide v5, v4, Lax/i1/F$b;->d:J

    .line 57
    .line 58
    iget-object v7, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 59
    .line 60
    iget-wide v7, v7, Lax/i1/F$b;->d:J

    .line 61
    .line 62
    cmp-long v9, v5, v7

    .line 63
    .line 64
    if-ltz v9, :cond_72

    .line 65
    .line 66
    if-ge v0, v3, :cond_44

    .line 67
    .line 68
    goto :goto_72

    .line 69
    :cond_44
    if-le v0, v3, :cond_47

    .line 70
    .line 71
    return v1

    .line 72
    :cond_47
    invoke-virtual {v4}, Lax/i1/F$b;->b()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_62

    .line 77
    .line 78
    iget-object p1, p1, Lax/Z0/c$a;->d:Lax/i1/F$b;

    .line 79
    .line 80
    iget v0, p1, Lax/i1/F$b;->b:I

    .line 81
    .line 82
    iget p1, p1, Lax/i1/F$b;->c:I

    .line 83
    .line 84
    iget-object v3, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 85
    .line 86
    iget v4, v3, Lax/i1/F$b;->b:I

    .line 87
    .line 88
    if-gt v0, v4, :cond_61

    .line 89
    .line 90
    if-ne v0, v4, :cond_60

    .line 91
    .line 92
    iget v0, v3, Lax/i1/F$b;->c:I

    .line 93
    .line 94
    if-le p1, v0, :cond_60

    .line 95
    .line 96
    goto :goto_61

    .line 97
    :cond_60
    return v2

    .line 98
    :cond_61
    :goto_61
    return v1

    .line 99
    :cond_62
    iget-object p1, p1, Lax/Z0/c$a;->d:Lax/i1/F$b;

    .line 100
    .line 101
    iget p1, p1, Lax/i1/F$b;->e:I

    .line 102
    .line 103
    const/4 v0, -0x1

    .line 104
    if-eq p1, v0, :cond_71

    .line 105
    .line 106
    iget-object v0, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 107
    .line 108
    iget v0, v0, Lax/i1/F$b;->b:I

    .line 109
    .line 110
    if-le p1, v0, :cond_70

    .line 111
    .line 112
    goto :goto_71

    .line 113
    :cond_70
    return v2

    .line 114
    :cond_71
    :goto_71
    return v1

    .line 115
    :cond_72
    :goto_72
    return v2
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

.method public k(ILax/i1/F$b;)V
    .registers 8

    .line 1
    iget-wide v0, p0, Lax/Z0/w0$a;->c:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-nez v4, :cond_1e

    .line 8
    .line 9
    iget v0, p0, Lax/Z0/w0$a;->b:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_1e

    .line 12
    .line 13
    if-eqz p2, :cond_1e

    .line 14
    .line 15
    iget-wide v0, p2, Lax/i1/F$b;->d:J

    .line 16
    .line 17
    iget-object p1, p0, Lax/Z0/w0$a;->g:Lax/Z0/w0;

    .line 18
    .line 19
    invoke-static {p1}, Lax/Z0/w0;->i(Lax/Z0/w0;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    cmp-long p1, v0, v2

    .line 24
    .line 25
    if-ltz p1, :cond_1e

    .line 26
    .line 27
    iget-wide p1, p2, Lax/i1/F$b;->d:J

    .line 28
    .line 29
    iput-wide p1, p0, Lax/Z0/w0$a;->c:J

    .line 30
    .line 31
    :cond_1e
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
.end method

.method public m(Lax/P0/N;Lax/P0/N;)Z
    .registers 6

    .line 1
    iget v0, p0, Lax/Z0/w0$a;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0}, Lax/Z0/w0$a;->l(Lax/P0/N;Lax/P0/N;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lax/Z0/w0$a;->b:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne p1, v1, :cond_d

    .line 12
    .line 13
    return v0

    .line 14
    :cond_d
    iget-object p1, p0, Lax/Z0/w0$a;->d:Lax/i1/F$b;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez p1, :cond_13

    .line 18
    .line 19
    return v2

    .line 20
    :cond_13
    iget-object p1, p1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eq p1, v1, :cond_1c

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1c
    return v0
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
