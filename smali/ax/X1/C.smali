.class public final Lax/X1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X1/C$a;
    }
.end annotation


# static fields
.field public static final l:Lax/q1/x;


# instance fields
.field private final a:Lax/S0/M;

.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lax/X1/C$a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/S0/G;

.field private final d:Lax/X1/A;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:J

.field private i:Lax/X1/z;

.field private j:Lax/q1/t;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/X1/B;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/X1/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/X1/C;->l:Lax/q1/x;

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
    .registers 4

    .line 1
    new-instance v0, Lax/S0/M;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lax/S0/M;-><init>(J)V

    invoke-direct {p0, v0}, Lax/X1/C;-><init>(Lax/S0/M;)V

    return-void
.end method

.method public constructor <init>(Lax/S0/M;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/X1/C;->a:Lax/S0/M;

    .line 4
    new-instance p1, Lax/S0/G;

    const/16 v0, 0x1000

    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 5
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lax/X1/C;->b:Landroid/util/SparseArray;

    .line 6
    new-instance p1, Lax/X1/A;

    invoke-direct {p1}, Lax/X1/A;-><init>()V

    iput-object p1, p0, Lax/X1/C;->d:Lax/X1/A;

    return-void
.end method

.method public static synthetic g()[Lax/q1/r;
    .registers 3

    .line 1
    new-instance v0, Lax/X1/C;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/X1/C;-><init>()V

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

.method private h(J)V
    .registers 14

    .line 1
    iget-boolean v0, p0, Lax/X1/C;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_44

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/X1/C;->k:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/X1/C;->d:Lax/X1/A;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/X1/A;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v4, v0, v2

    .line 20
    .line 21
    if-eqz v4, :cond_34

    .line 22
    .line 23
    new-instance v5, Lax/X1/z;

    .line 24
    .line 25
    iget-object v0, p0, Lax/X1/C;->d:Lax/X1/A;

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/X1/A;->d()Lax/S0/M;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v0, p0, Lax/X1/C;->d:Lax/X1/A;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/X1/A;->c()J

    .line 34
    .line 35
    .line 36
    move-result-wide v7

    .line 37
    move-wide v9, p1

    .line 38
    invoke-direct/range {v5 .. v10}, Lax/X1/z;-><init>(Lax/S0/M;JJ)V

    .line 39
    .line 40
    .line 41
    iput-object v5, p0, Lax/X1/C;->i:Lax/X1/z;

    .line 42
    .line 43
    iget-object p1, p0, Lax/X1/C;->j:Lax/q1/t;

    .line 44
    .line 45
    invoke-virtual {v5}, Lax/q1/e;->b()Lax/q1/N;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    iget-object p1, p0, Lax/X1/C;->j:Lax/q1/t;

    .line 54
    .line 55
    new-instance p2, Lax/q1/N$b;

    .line 56
    .line 57
    iget-object v0, p0, Lax/X1/C;->d:Lax/X1/A;

    .line 58
    .line 59
    invoke-virtual {v0}, Lax/X1/A;->c()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-direct {p2, v0, v1}, Lax/q1/N$b;-><init>(J)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 67
    .line 68
    .line 69
    :cond_44
    return-void
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
    .registers 2

    .line 1
    iput-object p1, p0, Lax/X1/C;->j:Lax/q1/t;

    .line 2
    .line 3
    return-void
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

.method public b(JJ)V
    .registers 10

    .line 1
    iget-object p1, p0, Lax/X1/C;->a:Lax/S0/M;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/S0/M;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v4, p1, v2

    .line 15
    .line 16
    if-nez v4, :cond_13

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 p1, 0x0

    .line 21
    :goto_14
    if-nez p1, :cond_2d

    .line 22
    .line 23
    iget-object p1, p0, Lax/X1/C;->a:Lax/S0/M;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/S0/M;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long v4, p1, v2

    .line 30
    .line 31
    if-eqz v4, :cond_2b

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    cmp-long v4, p1, v2

    .line 36
    .line 37
    if-eqz v4, :cond_2b

    .line 38
    .line 39
    cmp-long v2, p1, p3

    .line 40
    .line 41
    if-eqz v2, :cond_2b

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v1, 0x0

    .line 45
    :goto_2c
    move p1, v1

    .line 46
    :cond_2d
    if-eqz p1, :cond_34

    .line 47
    .line 48
    iget-object p1, p0, Lax/X1/C;->a:Lax/S0/M;

    .line 49
    .line 50
    invoke-virtual {p1, p3, p4}, Lax/S0/M;->i(J)V

    .line 51
    .line 52
    .line 53
    :cond_34
    iget-object p1, p0, Lax/X1/C;->i:Lax/X1/z;

    .line 54
    .line 55
    if-eqz p1, :cond_3b

    .line 56
    .line 57
    invoke-virtual {p1, p3, p4}, Lax/q1/e;->h(J)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    :goto_3b
    iget-object p1, p0, Lax/X1/C;->b:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-ge v0, p1, :cond_51

    .line 67
    .line 68
    iget-object p1, p0, Lax/X1/C;->b:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lax/X1/C$a;

    .line 75
    .line 76
    invoke-virtual {p1}, Lax/X1/C$a;->d()V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_3b

    .line 82
    :cond_51
    return-void
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

.method public c(Lax/q1/s;)Z
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p1, v1, v2, v0}, Lax/q1/s;->p([BII)V

    .line 7
    .line 8
    .line 9
    aget-byte v0, v1, v2

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    shl-int/lit8 v0, v0, 0x18

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget-byte v4, v1, v3

    .line 17
    .line 18
    and-int/lit16 v4, v4, 0xff

    .line 19
    .line 20
    shl-int/lit8 v4, v4, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v4

    .line 23
    const/4 v4, 0x2

    .line 24
    aget-byte v5, v1, v4

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    shl-int/2addr v5, v6

    .line 31
    or-int/2addr v0, v5

    .line 32
    const/4 v5, 0x3

    .line 33
    aget-byte v7, v1, v5

    .line 34
    .line 35
    and-int/lit16 v7, v7, 0xff

    .line 36
    .line 37
    or-int/2addr v0, v7

    .line 38
    const/16 v7, 0x1ba

    .line 39
    .line 40
    if-eq v7, v0, :cond_2a

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2a
    const/4 v0, 0x4

    .line 44
    aget-byte v7, v1, v0

    .line 45
    .line 46
    and-int/lit16 v7, v7, 0xc4

    .line 47
    .line 48
    const/16 v8, 0x44

    .line 49
    .line 50
    if-eq v7, v8, :cond_34

    .line 51
    .line 52
    return v2

    .line 53
    :cond_34
    const/4 v7, 0x6

    .line 54
    aget-byte v7, v1, v7

    .line 55
    .line 56
    and-int/2addr v7, v0

    .line 57
    if-eq v7, v0, :cond_3b

    .line 58
    .line 59
    return v2

    .line 60
    :cond_3b
    aget-byte v7, v1, v6

    .line 61
    .line 62
    and-int/2addr v7, v0

    .line 63
    if-eq v7, v0, :cond_41

    .line 64
    .line 65
    return v2

    .line 66
    :cond_41
    const/16 v0, 0x9

    .line 67
    .line 68
    aget-byte v0, v1, v0

    .line 69
    .line 70
    and-int/2addr v0, v3

    .line 71
    if-eq v0, v3, :cond_49

    .line 72
    .line 73
    return v2

    .line 74
    :cond_49
    const/16 v0, 0xc

    .line 75
    .line 76
    aget-byte v0, v1, v0

    .line 77
    .line 78
    and-int/2addr v0, v5

    .line 79
    if-eq v0, v5, :cond_51

    .line 80
    .line 81
    return v2

    .line 82
    :cond_51
    const/16 v0, 0xd

    .line 83
    .line 84
    aget-byte v0, v1, v0

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x7

    .line 87
    .line 88
    invoke-interface {p1, v0}, Lax/q1/s;->j(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v1, v2, v5}, Lax/q1/s;->p([BII)V

    .line 92
    .line 93
    .line 94
    aget-byte p1, v1, v2

    .line 95
    .line 96
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    shl-int/lit8 p1, p1, 0x10

    .line 99
    .line 100
    aget-byte v0, v1, v3

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    shl-int/2addr v0, v6

    .line 105
    or-int/2addr p1, v0

    .line 106
    aget-byte v0, v1, v4

    .line 107
    .line 108
    and-int/lit16 v0, v0, 0xff

    .line 109
    .line 110
    or-int/2addr p1, v0

    .line 111
    if-ne v3, p1, :cond_71

    .line 112
    .line 113
    return v3

    .line 114
    :cond_71
    return v2
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
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X1/C;->j:Lax/q1/t;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-eqz v4, :cond_1e

    .line 15
    .line 16
    iget-object v5, p0, Lax/X1/C;->d:Lax/X1/A;

    .line 17
    .line 18
    invoke-virtual {v5}, Lax/X1/A;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_1e

    .line 23
    .line 24
    iget-object v0, p0, Lax/X1/C;->d:Lax/X1/A;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lax/X1/A;->g(Lax/q1/s;Lax/q1/M;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1e
    invoke-direct {p0, v0, v1}, Lax/X1/C;->h(J)V

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, Lax/X1/C;->i:Lax/X1/z;

    .line 35
    .line 36
    if-eqz v5, :cond_32

    .line 37
    .line 38
    invoke-virtual {v5}, Lax/q1/e;->d()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_32

    .line 43
    .line 44
    iget-object v0, p0, Lax/X1/C;->i:Lax/X1/z;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, Lax/q1/e;->c(Lax/q1/s;Lax/q1/M;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_32
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 52
    .line 53
    .line 54
    if-eqz v4, :cond_3d

    .line 55
    .line 56
    invoke-interface {p1}, Lax/q1/s;->i()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    sub-long/2addr v0, v4

    .line 61
    goto :goto_3e

    .line 62
    :cond_3d
    move-wide v0, v2

    .line 63
    :goto_3e
    const/4 p2, -0x1

    .line 64
    cmp-long v4, v0, v2

    .line 65
    .line 66
    if-eqz v4, :cond_4a

    .line 67
    .line 68
    const-wide/16 v2, 0x4

    .line 69
    .line 70
    cmp-long v4, v0, v2

    .line 71
    .line 72
    if-gez v4, :cond_4a

    .line 73
    .line 74
    return p2

    .line 75
    :cond_4a
    iget-object v0, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 76
    .line 77
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v1, 0x4

    .line 82
    const/4 v2, 0x0

    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-interface {p1, v0, v2, v1, v3}, Lax/q1/s;->h([BIIZ)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5a

    .line 89
    .line 90
    return p2

    .line 91
    :cond_5a
    iget-object v0, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lax/S0/G;->b0(I)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 97
    .line 98
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const/16 v1, 0x1b9

    .line 103
    .line 104
    if-ne v0, v1, :cond_6a

    .line 105
    .line 106
    return p2

    .line 107
    :cond_6a
    const/16 p2, 0x1ba

    .line 108
    .line 109
    if-ne v0, p2, :cond_8e

    .line 110
    .line 111
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 112
    .line 113
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const/16 v0, 0xa

    .line 118
    .line 119
    invoke-interface {p1, p2, v2, v0}, Lax/q1/s;->p([BII)V

    .line 120
    .line 121
    .line 122
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 123
    .line 124
    const/16 v0, 0x9

    .line 125
    .line 126
    invoke-virtual {p2, v0}, Lax/S0/G;->b0(I)V

    .line 127
    .line 128
    .line 129
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 130
    .line 131
    invoke-virtual {p2}, Lax/S0/G;->M()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    and-int/lit8 p2, p2, 0x7

    .line 136
    .line 137
    add-int/lit8 p2, p2, 0xe

    .line 138
    .line 139
    invoke-interface {p1, p2}, Lax/q1/s;->n(I)V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_8e
    const/16 p2, 0x1bb

    .line 144
    .line 145
    const/4 v1, 0x2

    .line 146
    const/4 v4, 0x6

    .line 147
    if-ne v0, p2, :cond_ad

    .line 148
    .line 149
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 150
    .line 151
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-interface {p1, p2, v2, v1}, Lax/q1/s;->p([BII)V

    .line 156
    .line 157
    .line 158
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 159
    .line 160
    invoke-virtual {p2, v2}, Lax/S0/G;->b0(I)V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 164
    .line 165
    invoke-virtual {p2}, Lax/S0/G;->U()I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    add-int/2addr p2, v4

    .line 170
    invoke-interface {p1, p2}, Lax/q1/s;->n(I)V

    .line 171
    .line 172
    .line 173
    return v2

    .line 174
    :cond_ad
    and-int/lit16 p2, v0, -0x100

    .line 175
    .line 176
    shr-int/lit8 p2, p2, 0x8

    .line 177
    .line 178
    if-eq p2, v3, :cond_b7

    .line 179
    .line 180
    invoke-interface {p1, v3}, Lax/q1/s;->n(I)V

    .line 181
    .line 182
    .line 183
    return v2

    .line 184
    :cond_b7
    and-int/lit16 p2, v0, 0xff

    .line 185
    .line 186
    iget-object v5, p0, Lax/X1/C;->b:Landroid/util/SparseArray;

    .line 187
    .line 188
    invoke-virtual {v5, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lax/X1/C$a;

    .line 193
    .line 194
    iget-boolean v6, p0, Lax/X1/C;->e:Z

    .line 195
    .line 196
    if-nez v6, :cond_13e

    .line 197
    .line 198
    if-nez v5, :cond_11e

    .line 199
    .line 200
    const/16 v6, 0xbd

    .line 201
    .line 202
    const-string v7, "video/mp2p"

    .line 203
    .line 204
    if-ne p2, v6, :cond_db

    .line 205
    .line 206
    new-instance v0, Lax/X1/c;

    .line 207
    .line 208
    invoke-direct {v0, v7}, Lax/X1/c;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iput-boolean v3, p0, Lax/X1/C;->f:Z

    .line 212
    .line 213
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 214
    .line 215
    .line 216
    move-result-wide v6

    .line 217
    iput-wide v6, p0, Lax/X1/C;->h:J

    .line 218
    .line 219
    goto :goto_104

    .line 220
    :cond_db
    and-int/lit16 v6, v0, 0xe0

    .line 221
    .line 222
    const/16 v8, 0xc0

    .line 223
    .line 224
    if-ne v6, v8, :cond_ef

    .line 225
    .line 226
    new-instance v0, Lax/X1/t;

    .line 227
    .line 228
    invoke-direct {v0, v7}, Lax/X1/t;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    iput-boolean v3, p0, Lax/X1/C;->f:Z

    .line 232
    .line 233
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    iput-wide v6, p0, Lax/X1/C;->h:J

    .line 238
    .line 239
    goto :goto_104

    .line 240
    :cond_ef
    and-int/lit16 v0, v0, 0xf0

    .line 241
    .line 242
    const/16 v6, 0xe0

    .line 243
    .line 244
    if-ne v0, v6, :cond_103

    .line 245
    .line 246
    new-instance v0, Lax/X1/n;

    .line 247
    .line 248
    invoke-direct {v0, v7}, Lax/X1/n;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iput-boolean v3, p0, Lax/X1/C;->g:Z

    .line 252
    .line 253
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    iput-wide v6, p0, Lax/X1/C;->h:J

    .line 258
    .line 259
    goto :goto_104

    .line 260
    :cond_103
    const/4 v0, 0x0

    .line 261
    :goto_104
    if-eqz v0, :cond_11e

    .line 262
    .line 263
    new-instance v5, Lax/X1/L$d;

    .line 264
    .line 265
    const/16 v6, 0x100

    .line 266
    .line 267
    invoke-direct {v5, p2, v6}, Lax/X1/L$d;-><init>(II)V

    .line 268
    .line 269
    .line 270
    iget-object v6, p0, Lax/X1/C;->j:Lax/q1/t;

    .line 271
    .line 272
    invoke-interface {v0, v6, v5}, Lax/X1/m;->d(Lax/q1/t;Lax/X1/L$d;)V

    .line 273
    .line 274
    .line 275
    new-instance v5, Lax/X1/C$a;

    .line 276
    .line 277
    iget-object v6, p0, Lax/X1/C;->a:Lax/S0/M;

    .line 278
    .line 279
    invoke-direct {v5, v0, v6}, Lax/X1/C$a;-><init>(Lax/X1/m;Lax/S0/M;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, p0, Lax/X1/C;->b:Landroid/util/SparseArray;

    .line 283
    .line 284
    invoke-virtual {v0, p2, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    :cond_11e
    iget-boolean p2, p0, Lax/X1/C;->f:Z

    .line 288
    .line 289
    if-eqz p2, :cond_12c

    .line 290
    .line 291
    iget-boolean p2, p0, Lax/X1/C;->g:Z

    .line 292
    .line 293
    if-eqz p2, :cond_12c

    .line 294
    .line 295
    iget-wide v6, p0, Lax/X1/C;->h:J

    .line 296
    .line 297
    const-wide/16 v8, 0x2000

    .line 298
    .line 299
    add-long/2addr v6, v8

    .line 300
    goto :goto_12f

    .line 301
    :cond_12c
    const-wide/32 v6, 0x100000

    .line 302
    .line 303
    .line 304
    :goto_12f
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 305
    .line 306
    .line 307
    move-result-wide v8

    .line 308
    cmp-long p2, v8, v6

    .line 309
    .line 310
    if-lez p2, :cond_13e

    .line 311
    .line 312
    iput-boolean v3, p0, Lax/X1/C;->e:Z

    .line 313
    .line 314
    iget-object p2, p0, Lax/X1/C;->j:Lax/q1/t;

    .line 315
    .line 316
    invoke-interface {p2}, Lax/q1/t;->o()V

    .line 317
    .line 318
    .line 319
    :cond_13e
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 320
    .line 321
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-interface {p1, p2, v2, v1}, Lax/q1/s;->p([BII)V

    .line 326
    .line 327
    .line 328
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 329
    .line 330
    invoke-virtual {p2, v2}, Lax/S0/G;->b0(I)V

    .line 331
    .line 332
    .line 333
    iget-object p2, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 334
    .line 335
    invoke-virtual {p2}, Lax/S0/G;->U()I

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    add-int/2addr p2, v4

    .line 340
    if-nez v5, :cond_159

    .line 341
    .line 342
    invoke-interface {p1, p2}, Lax/q1/s;->n(I)V

    .line 343
    .line 344
    .line 345
    goto :goto_17a

    .line 346
    :cond_159
    iget-object v0, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 347
    .line 348
    invoke-virtual {v0, p2}, Lax/S0/G;->X(I)V

    .line 349
    .line 350
    .line 351
    iget-object v0, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 352
    .line 353
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-interface {p1, v0, v2, p2}, Lax/q1/s;->readFully([BII)V

    .line 358
    .line 359
    .line 360
    iget-object p1, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 361
    .line 362
    invoke-virtual {p1, v4}, Lax/S0/G;->b0(I)V

    .line 363
    .line 364
    .line 365
    iget-object p1, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 366
    .line 367
    invoke-virtual {v5, p1}, Lax/X1/C$a;->a(Lax/S0/G;)V

    .line 368
    .line 369
    .line 370
    iget-object p1, p0, Lax/X1/C;->c:Lax/S0/G;

    .line 371
    .line 372
    invoke-virtual {p1}, Lax/S0/G;->b()I

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    invoke-virtual {p1, p2}, Lax/S0/G;->a0(I)V

    .line 377
    .line 378
    .line 379
    :goto_17a
    return v2
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
