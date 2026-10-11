.class public final Lax/X1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# static fields
.field public static final m:Lax/q1/x;


# instance fields
.field private final a:I

.field private final b:Lax/X1/i;

.field private final c:Lax/S0/G;

.field private final d:Lax/S0/G;

.field private final e:Lax/S0/F;

.field private f:Lax/q1/t;

.field private g:J

.field private h:J

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/X1/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/X1/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/X1/h;->m:Lax/q1/x;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lax/X1/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_9

    or-int/lit8 p1, p1, 0x1

    .line 3
    :cond_9
    iput p1, p0, Lax/X1/h;->a:I

    .line 4
    new-instance p1, Lax/X1/i;

    const-string v0, "audio/mp4a-latm"

    const/4 v1, 0x1

    invoke-direct {p1, v1, v0}, Lax/X1/i;-><init>(ZLjava/lang/String;)V

    iput-object p1, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 5
    new-instance p1, Lax/S0/G;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/X1/h;->c:Lax/S0/G;

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lax/X1/h;->i:I

    const-wide/16 v0, -0x1

    .line 7
    iput-wide v0, p0, Lax/X1/h;->h:J

    .line 8
    new-instance p1, Lax/S0/G;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 9
    new-instance v0, Lax/S0/F;

    invoke-virtual {p1}, Lax/S0/G;->f()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lax/S0/F;-><init>([B)V

    iput-object v0, p0, Lax/X1/h;->e:Lax/S0/F;

    return-void
.end method

.method public static synthetic g()[Lax/q1/r;
    .registers 3

    .line 1
    new-instance v0, Lax/X1/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/X1/h;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lax/q1/r;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    return-object v1
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

.method private h(Lax/q1/s;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/X1/h;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lax/X1/h;->i:I

    .line 8
    .line 9
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v5, v1, v3

    .line 19
    .line 20
    if-nez v5, :cond_18

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lax/X1/h;->m(Lax/q1/s;)I

    .line 23
    .line 24
    .line 25
    :cond_18
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    :cond_1a
    const/4 v5, 0x1

    .line 28
    :try_start_1b
    iget-object v6, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 29
    .line 30
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, 0x2

    .line 35
    invoke-interface {p1, v6, v1, v7, v5}, Lax/q1/s;->h([BIIZ)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_78

    .line 40
    .line 41
    iget-object v6, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 42
    .line 43
    invoke-virtual {v6, v1}, Lax/S0/G;->b0(I)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 47
    .line 48
    invoke-virtual {v6}, Lax/S0/G;->U()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-static {v6}, Lax/X1/i;->m(I)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_3a

    .line 57
    .line 58
    goto :goto_79

    .line 59
    :cond_3a
    iget-object v6, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 60
    .line 61
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/4 v7, 0x4

    .line 66
    invoke-interface {p1, v6, v1, v7, v5}, Lax/q1/s;->h([BIIZ)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_48

    .line 71
    .line 72
    goto :goto_78

    .line 73
    :cond_48
    iget-object v6, p0, Lax/X1/h;->e:Lax/S0/F;

    .line 74
    .line 75
    const/16 v7, 0xe

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Lax/S0/F;->p(I)V

    .line 78
    .line 79
    .line 80
    iget-object v6, p0, Lax/X1/h;->e:Lax/S0/F;

    .line 81
    .line 82
    const/16 v7, 0xd

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Lax/S0/F;->h(I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    const/4 v7, 0x6

    .line 89
    if-le v6, v7, :cond_6e

    .line 90
    .line 91
    int-to-long v7, v6

    .line 92
    add-long/2addr v3, v7

    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    const/16 v7, 0x3e8

    .line 96
    .line 97
    if-ne v2, v7, :cond_63

    .line 98
    .line 99
    goto :goto_6b

    .line 100
    :cond_63
    add-int/lit8 v6, v6, -0x6

    .line 101
    .line 102
    invoke-interface {p1, v6, v5}, Lax/q1/s;->o(IZ)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-nez v6, :cond_1a

    .line 107
    .line 108
    :goto_6b
    goto :goto_78

    .line 109
    :catch_6c
    nop

    .line 110
    goto :goto_78

    .line 111
    :cond_6e
    iput-boolean v5, p0, Lax/X1/h;->j:Z

    .line 112
    .line 113
    const-string v1, "Malformed ADTS stream"

    .line 114
    .line 115
    const/4 v6, 0x0

    .line 116
    invoke-static {v1, v6}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    throw v1
    :try_end_78
    .catch Ljava/io/EOFException; {:try_start_1b .. :try_end_78} :catch_6c

    .line 121
    :cond_78
    :goto_78
    move v1, v2

    .line 122
    :goto_79
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 123
    .line 124
    .line 125
    if-lez v1, :cond_84

    .line 126
    .line 127
    int-to-long v0, v1

    .line 128
    div-long/2addr v3, v0

    .line 129
    long-to-int p1, v3

    .line 130
    iput p1, p0, Lax/X1/h;->i:I

    .line 131
    .line 132
    goto :goto_86

    .line 133
    :cond_84
    iput v0, p0, Lax/X1/h;->i:I

    .line 134
    .line 135
    :goto_86
    iput-boolean v5, p0, Lax/X1/h;->j:Z

    .line 136
    .line 137
    return-void
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private static i(IJ)I
    .registers 7

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide/32 v2, 0x7a1200

    .line 3
    .line 4
    .line 5
    mul-long v0, v0, v2

    .line 6
    .line 7
    div-long/2addr v0, p1

    .line 8
    long-to-int p0, v0

    .line 9
    return p0
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

.method private j(JZ)Lax/q1/N;
    .registers 15

    .line 1
    iget v0, p0, Lax/X1/h;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 4
    .line 5
    invoke-virtual {v1}, Lax/X1/i;->k()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v0, v1, v2}, Lax/X1/h;->i(IJ)I

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    new-instance v3, Lax/q1/j;

    .line 14
    .line 15
    iget-wide v6, p0, Lax/X1/h;->h:J

    .line 16
    .line 17
    iget v9, p0, Lax/X1/h;->i:I

    .line 18
    .line 19
    move-wide v4, p1

    .line 20
    move v10, p3

    .line 21
    invoke-direct/range {v3 .. v10}, Lax/q1/j;-><init>(JJIIZ)V

    .line 22
    .line 23
    .line 24
    return-object v3
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

.method private l(JZ)V
    .registers 12

    .line 1
    iget-boolean v0, p0, Lax/X1/h;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_26

    .line 6
    :cond_5
    iget v0, p0, Lax/X1/h;->a:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    and-int/2addr v0, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_12

    .line 12
    .line 13
    iget v0, p0, Lax/X1/h;->i:I

    .line 14
    .line 15
    if-lez v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    :goto_13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    if-eqz v0, :cond_27

    .line 26
    .line 27
    iget-object v5, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 28
    .line 29
    invoke-virtual {v5}, Lax/X1/i;->k()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v7, v5, v3

    .line 34
    .line 35
    if-nez v7, :cond_27

    .line 36
    .line 37
    if-nez p3, :cond_27

    .line 38
    .line 39
    :goto_26
    return-void

    .line 40
    :cond_27
    if-eqz v0, :cond_44

    .line 41
    .line 42
    iget-object p3, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 43
    .line 44
    invoke-virtual {p3}, Lax/X1/i;->k()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    cmp-long p3, v5, v3

    .line 49
    .line 50
    if-eqz p3, :cond_44

    .line 51
    .line 52
    iget-object p3, p0, Lax/X1/h;->f:Lax/q1/t;

    .line 53
    .line 54
    iget v0, p0, Lax/X1/h;->a:I

    .line 55
    .line 56
    and-int/lit8 v0, v0, 0x2

    .line 57
    .line 58
    if-eqz v0, :cond_3c

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    :cond_3c
    invoke-direct {p0, p1, p2, v2}, Lax/X1/h;->j(JZ)Lax/q1/N;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {p3, p1}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 66
    .line 67
    .line 68
    goto :goto_4e

    .line 69
    :cond_44
    iget-object p1, p0, Lax/X1/h;->f:Lax/q1/t;

    .line 70
    .line 71
    new-instance p2, Lax/q1/N$b;

    .line 72
    .line 73
    invoke-direct {p2, v3, v4}, Lax/q1/N$b;-><init>(J)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 77
    .line 78
    .line 79
    :goto_4e
    iput-boolean v1, p0, Lax/X1/h;->l:Z

    .line 80
    .line 81
    return-void
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

.method private m(Lax/q1/s;)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    iget-object v2, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 4
    .line 5
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v3, 0xa

    .line 10
    .line 11
    invoke-interface {p1, v2, v0, v3}, Lax/q1/s;->p([BII)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lax/S0/G;->b0(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 20
    .line 21
    invoke-virtual {v2}, Lax/S0/G;->P()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const v3, 0x494433

    .line 26
    .line 27
    .line 28
    if-eq v2, v3, :cond_2f

    .line 29
    .line 30
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v1}, Lax/q1/s;->j(I)V

    .line 34
    .line 35
    .line 36
    iget-wide v2, p0, Lax/X1/h;->h:J

    .line 37
    .line 38
    const-wide/16 v4, -0x1

    .line 39
    .line 40
    cmp-long p1, v2, v4

    .line 41
    .line 42
    if-nez p1, :cond_2e

    .line 43
    .line 44
    int-to-long v2, v1

    .line 45
    iput-wide v2, p0, Lax/X1/h;->h:J

    .line 46
    .line 47
    :cond_2e
    return v1

    .line 48
    :cond_2f
    iget-object v2, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 49
    .line 50
    const/4 v3, 0x3

    .line 51
    invoke-virtual {v2, v3}, Lax/S0/G;->c0(I)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 55
    .line 56
    invoke-virtual {v2}, Lax/S0/G;->L()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/lit8 v3, v2, 0xa

    .line 61
    .line 62
    add-int/2addr v1, v3

    .line 63
    invoke-interface {p1, v2}, Lax/q1/s;->j(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_2
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


# virtual methods
.method public a(Lax/q1/t;)V
    .registers 6

    .line 1
    iput-object p1, p0, Lax/X1/h;->f:Lax/q1/t;

    .line 2
    .line 3
    iget-object v0, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 4
    .line 5
    new-instance v1, Lax/X1/L$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-direct {v1, v2, v3}, Lax/X1/L$d;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lax/X1/i;->d(Lax/q1/t;Lax/X1/L$d;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lax/q1/t;->o()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(JJ)V
    .registers 5

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lax/X1/h;->k:Z

    .line 3
    .line 4
    iget-object p1, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 5
    .line 6
    invoke-virtual {p1}, Lax/X1/i;->b()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lax/X1/h;->g:J

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

.method public c(Lax/q1/s;)Z
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/X1/h;->m(Lax/q1/s;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v3, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    :cond_8
    iget-object v5, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 10
    .line 11
    invoke-virtual {v5}, Lax/S0/G;->f()[B

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v6, 0x2

    .line 16
    invoke-interface {p1, v5, v1, v6}, Lax/q1/s;->p([BII)V

    .line 17
    .line 18
    .line 19
    iget-object v5, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 20
    .line 21
    invoke-virtual {v5, v1}, Lax/S0/G;->b0(I)V

    .line 22
    .line 23
    .line 24
    iget-object v5, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 25
    .line 26
    invoke-virtual {v5}, Lax/S0/G;->U()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {v5}, Lax/X1/i;->m(I)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_2e

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v3}, Lax/q1/s;->j(I)V

    .line 42
    .line 43
    .line 44
    :goto_2b
    const/4 v2, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    goto :goto_62

    .line 47
    :cond_2e
    const/4 v5, 0x1

    .line 48
    add-int/2addr v2, v5

    .line 49
    const/4 v6, 0x4

    .line 50
    if-lt v2, v6, :cond_38

    .line 51
    .line 52
    const/16 v7, 0xbc

    .line 53
    .line 54
    if-le v4, v7, :cond_38

    .line 55
    .line 56
    return v5

    .line 57
    :cond_38
    iget-object v5, p0, Lax/X1/h;->d:Lax/S0/G;

    .line 58
    .line 59
    invoke-virtual {v5}, Lax/S0/G;->f()[B

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-interface {p1, v5, v1, v6}, Lax/q1/s;->p([BII)V

    .line 64
    .line 65
    .line 66
    iget-object v5, p0, Lax/X1/h;->e:Lax/S0/F;

    .line 67
    .line 68
    const/16 v6, 0xe

    .line 69
    .line 70
    invoke-virtual {v5, v6}, Lax/S0/F;->p(I)V

    .line 71
    .line 72
    .line 73
    iget-object v5, p0, Lax/X1/h;->e:Lax/S0/F;

    .line 74
    .line 75
    const/16 v6, 0xd

    .line 76
    .line 77
    invoke-virtual {v5, v6}, Lax/S0/F;->h(I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v6, 0x6

    .line 82
    if-gt v5, v6, :cond_5c

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v3}, Lax/q1/s;->j(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_2b

    .line 93
    :cond_5c
    add-int/lit8 v6, v5, -0x6

    .line 94
    .line 95
    invoke-interface {p1, v6}, Lax/q1/s;->j(I)V

    .line 96
    .line 97
    .line 98
    add-int/2addr v4, v5

    .line 99
    :goto_62
    sub-int v5, v3, v0

    .line 100
    .line 101
    const/16 v6, 0x2000

    .line 102
    .line 103
    if-lt v5, v6, :cond_8

    .line 104
    .line 105
    return v1
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

.method public d()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lax/X1/h;->f:Lax/q1/t;

    .line 2
    .line 3
    invoke-static {p2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget p2, p0, Lax/X1/h;->a:I

    .line 11
    .line 12
    and-int/lit8 v2, p2, 0x2

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v2, :cond_19

    .line 16
    .line 17
    and-int/2addr p2, v3

    .line 18
    if-eqz p2, :cond_1c

    .line 19
    .line 20
    const-wide/16 v4, -0x1

    .line 21
    .line 22
    cmp-long p2, v0, v4

    .line 23
    .line 24
    if-eqz p2, :cond_1c

    .line 25
    .line 26
    :cond_19
    invoke-direct {p0, p1}, Lax/X1/h;->h(Lax/q1/s;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    iget-object p2, p0, Lax/X1/h;->c:Lax/S0/G;

    .line 30
    .line 31
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const/16 v2, 0x800

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-interface {p1, p2, v4, v2}, Lax/q1/s;->c([BII)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 p2, -0x1

    .line 43
    if-ne p1, p2, :cond_2e

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    goto :goto_2f

    .line 47
    :cond_2e
    const/4 v2, 0x0

    .line 48
    :goto_2f
    invoke-direct {p0, v0, v1, v2}, Lax/X1/h;->l(JZ)V

    .line 49
    .line 50
    .line 51
    if-eqz v2, :cond_35

    .line 52
    .line 53
    return p2

    .line 54
    :cond_35
    iget-object p2, p0, Lax/X1/h;->c:Lax/S0/G;

    .line 55
    .line 56
    invoke-virtual {p2, v4}, Lax/S0/G;->b0(I)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lax/X1/h;->c:Lax/S0/G;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Lax/S0/G;->a0(I)V

    .line 62
    .line 63
    .line 64
    iget-boolean p1, p0, Lax/X1/h;->k:Z

    .line 65
    .line 66
    if-nez p1, :cond_4d

    .line 67
    .line 68
    iget-object p1, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 69
    .line 70
    iget-wide v0, p0, Lax/X1/h;->g:J

    .line 71
    .line 72
    const/4 p2, 0x4

    .line 73
    invoke-virtual {p1, v0, v1, p2}, Lax/X1/i;->f(JI)V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, Lax/X1/h;->k:Z

    .line 77
    .line 78
    :cond_4d
    iget-object p1, p0, Lax/X1/h;->b:Lax/X1/i;

    .line 79
    .line 80
    iget-object p2, p0, Lax/X1/h;->c:Lax/S0/G;

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lax/X1/i;->c(Lax/S0/G;)V

    .line 83
    .line 84
    .line 85
    return v4
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

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
