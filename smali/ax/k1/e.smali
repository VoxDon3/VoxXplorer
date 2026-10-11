.class final Lax/k1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/k1/a;


# static fields
.field private static final b:Lax/r7/T;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/T<",
            "Lax/N1/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/N1/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    invoke-static {}, Lax/r7/T;->d()Lax/r7/T;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lax/k1/c;

    .line 6
    .line 7
    invoke-direct {v1}, Lax/k1/c;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lax/r7/T;->f(Lax/q7/f;)Lax/r7/T;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lax/r7/T;->d()Lax/r7/T;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lax/r7/T;->g()Lax/r7/T;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lax/k1/d;

    .line 23
    .line 24
    invoke-direct {v2}, Lax/k1/d;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lax/r7/T;->f(Lax/q7/f;)Lax/r7/T;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lax/r7/T;->a(Ljava/util/Comparator;)Lax/r7/T;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lax/k1/e;->b:Lax/r7/T;

    .line 36
    .line 37
    return-void
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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

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
.end method

.method public static synthetic f(Lax/N1/e;)Ljava/lang/Long;
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/N1/e;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static synthetic g(Lax/N1/e;)Ljava/lang/Long;
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/N1/e;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.method public a(J)J
    .registers 13

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move-wide v3, v0

    .line 8
    :goto_7
    iget-object v5, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-ge v2, v5, :cond_44

    .line 15
    .line 16
    iget-object v5, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lax/N1/e;

    .line 23
    .line 24
    iget-wide v5, v5, Lax/N1/e;->b:J

    .line 25
    .line 26
    iget-object v7, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    check-cast v7, Lax/N1/e;

    .line 33
    .line 34
    iget-wide v7, v7, Lax/N1/e;->d:J

    .line 35
    .line 36
    cmp-long v9, p1, v5

    .line 37
    .line 38
    if-gez v9, :cond_33

    .line 39
    .line 40
    cmp-long p1, v3, v0

    .line 41
    .line 42
    if-nez p1, :cond_2d

    .line 43
    .line 44
    move-wide v3, v5

    .line 45
    goto :goto_44

    .line 46
    :cond_2d
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    move-wide v3, p1

    .line 51
    goto :goto_44

    .line 52
    :cond_33
    cmp-long v5, p1, v7

    .line 53
    .line 54
    if-gez v5, :cond_41

    .line 55
    .line 56
    cmp-long v5, v3, v0

    .line 57
    .line 58
    if-nez v5, :cond_3d

    .line 59
    .line 60
    move-wide v3, v7

    .line 61
    goto :goto_41

    .line 62
    :cond_3d
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    :cond_41
    :goto_41
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_7

    .line 69
    :cond_44
    :goto_44
    cmp-long p1, v3, v0

    .line 70
    .line 71
    if-eqz p1, :cond_49

    .line 72
    .line 73
    return-wide v3

    .line 74
    :cond_49
    const-wide/high16 p1, -0x8000000000000000L

    .line 75
    .line 76
    return-wide p1
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

.method public b(Lax/N1/e;J)Z
    .registers 11

    .line 1
    iget-wide v0, p1, Lax/N1/e;->b:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v6, v0, v4

    .line 11
    .line 12
    if-eqz v6, :cond_f

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    :goto_10
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    iget-wide v0, p1, Lax/N1/e;->c:J

    .line 21
    .line 22
    cmp-long v6, v0, v4

    .line 23
    .line 24
    if-eqz v6, :cond_1b

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    :goto_1c
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 30
    .line 31
    .line 32
    iget-wide v0, p1, Lax/N1/e;->b:J

    .line 33
    .line 34
    cmp-long v4, v0, p2

    .line 35
    .line 36
    if-gtz v4, :cond_2d

    .line 37
    .line 38
    iget-wide v0, p1, Lax/N1/e;->d:J

    .line 39
    .line 40
    cmp-long v4, p2, v0

    .line 41
    .line 42
    if-gez v4, :cond_2d

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    const/4 p2, 0x0

    .line 47
    :goto_2e
    iget-object p3, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    sub-int/2addr p3, v3

    .line 54
    :goto_35
    if-ltz p3, :cond_51

    .line 55
    .line 56
    iget-wide v0, p1, Lax/N1/e;->b:J

    .line 57
    .line 58
    iget-object v4, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lax/N1/e;

    .line 65
    .line 66
    iget-wide v4, v4, Lax/N1/e;->b:J

    .line 67
    .line 68
    cmp-long v6, v0, v4

    .line 69
    .line 70
    if-ltz v6, :cond_4e

    .line 71
    .line 72
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 73
    .line 74
    add-int/2addr p3, v3

    .line 75
    invoke-interface {v0, p3, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return p2

    .line 79
    :cond_4e
    add-int/lit8 p3, p3, -0x1

    .line 80
    .line 81
    goto :goto_35

    .line 82
    :cond_51
    iget-object p3, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {p3, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return p2
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

.method public c(J)Lax/r7/z;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lax/r7/z<",
            "Lax/R0/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_6a

    .line 8
    .line 9
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lax/N1/e;

    .line 17
    .line 18
    iget-wide v2, v0, Lax/N1/e;->b:J

    .line 19
    .line 20
    cmp-long v0, p1, v2

    .line 21
    .line 22
    if-gez v0, :cond_18

    .line 23
    .line 24
    goto :goto_6a

    .line 25
    :cond_18
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_1e
    iget-object v3, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-ge v2, v3, :cond_47

    .line 38
    .line 39
    iget-object v3, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lax/N1/e;

    .line 46
    .line 47
    iget-wide v4, v3, Lax/N1/e;->b:J

    .line 48
    .line 49
    cmp-long v6, p1, v4

    .line 50
    .line 51
    if-ltz v6, :cond_3d

    .line 52
    .line 53
    iget-wide v4, v3, Lax/N1/e;->d:J

    .line 54
    .line 55
    cmp-long v6, p1, v4

    .line 56
    .line 57
    if-gez v6, :cond_3d

    .line 58
    .line 59
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_3d
    iget-wide v3, v3, Lax/N1/e;->b:J

    .line 63
    .line 64
    cmp-long v5, p1, v3

    .line 65
    .line 66
    if-gez v5, :cond_44

    .line 67
    .line 68
    goto :goto_47

    .line 69
    :cond_44
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1e

    .line 72
    :cond_47
    :goto_47
    sget-object p1, Lax/k1/e;->b:Lax/r7/T;

    .line 73
    .line 74
    invoke-static {p1, v0}, Lax/r7/z;->J(Ljava/util/Comparator;Ljava/lang/Iterable;)Lax/r7/z;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    :goto_51
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ge v1, v0, :cond_65

    .line 87
    .line 88
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lax/N1/e;

    .line 93
    .line 94
    iget-object v0, v0, Lax/N1/e;->a:Lax/r7/z;

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Lax/r7/z$a;->j(Ljava/lang/Iterable;)Lax/r7/z$a;

    .line 97
    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_51

    .line 102
    :cond_65
    invoke-virtual {p2}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :cond_6a
    :goto_6a
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1
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

.method public clear()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

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
.end method

.method public d(J)J
    .registers 11

    .line 1
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_53

    .line 8
    .line 9
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lax/N1/e;

    .line 17
    .line 18
    iget-wide v2, v0, Lax/N1/e;->b:J

    .line 19
    .line 20
    cmp-long v0, p1, v2

    .line 21
    .line 22
    if-gez v0, :cond_18

    .line 23
    .line 24
    goto :goto_53

    .line 25
    :cond_18
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/N1/e;

    .line 32
    .line 33
    iget-wide v2, v0, Lax/N1/e;->b:J

    .line 34
    .line 35
    :goto_22
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ge v1, v0, :cond_52

    .line 42
    .line 43
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lax/N1/e;

    .line 50
    .line 51
    iget-wide v4, v0, Lax/N1/e;->b:J

    .line 52
    .line 53
    iget-object v0, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lax/N1/e;

    .line 60
    .line 61
    iget-wide v6, v0, Lax/N1/e;->d:J

    .line 62
    .line 63
    cmp-long v0, v6, p1

    .line 64
    .line 65
    if-gtz v0, :cond_47

    .line 66
    .line 67
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    goto :goto_4f

    .line 72
    :cond_47
    cmp-long v0, v4, p1

    .line 73
    .line 74
    if-gtz v0, :cond_52

    .line 75
    .line 76
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    :goto_4f
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_22

    .line 83
    :cond_52
    return-wide v2

    .line 84
    :cond_53
    :goto_53
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    return-wide p1
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

.method public e(J)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_33

    .line 9
    .line 10
    iget-object v1, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lax/N1/e;

    .line 17
    .line 18
    iget-wide v1, v1, Lax/N1/e;->b:J

    .line 19
    .line 20
    cmp-long v3, p1, v1

    .line 21
    .line 22
    if-lez v3, :cond_2d

    .line 23
    .line 24
    iget-object v1, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lax/N1/e;

    .line 31
    .line 32
    iget-wide v1, v1, Lax/N1/e;->d:J

    .line 33
    .line 34
    cmp-long v4, p1, v1

    .line 35
    .line 36
    if-lez v4, :cond_2d

    .line 37
    .line 38
    iget-object v1, p0, Lax/k1/e;->a:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    goto :goto_30

    .line 46
    :cond_2d
    if-gez v3, :cond_30

    .line 47
    .line 48
    goto :goto_33

    .line 49
    :cond_30
    :goto_30
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_33
    :goto_33
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
.end method
