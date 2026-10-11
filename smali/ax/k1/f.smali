.class final Lax/k1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/k1/a;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/N1/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
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
    iput-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

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

.method private f(J)I
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1b

    .line 9
    .line 10
    iget-object v1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

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
    if-gez v3, :cond_18

    .line 23
    .line 24
    return v0

    .line 25
    :cond_18
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1b
    iget-object p1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
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


# virtual methods
.method public a(J)J
    .registers 13

    .line 1
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_b
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lax/N1/e;

    .line 20
    .line 21
    iget-wide v4, v0, Lax/N1/e;->b:J

    .line 22
    .line 23
    cmp-long v0, p1, v4

    .line 24
    .line 25
    if-gez v0, :cond_25

    .line 26
    .line 27
    iget-object p1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lax/N1/e;

    .line 34
    .line 35
    iget-wide p1, p1, Lax/N1/e;->b:J

    .line 36
    .line 37
    return-wide p1

    .line 38
    :cond_25
    const/4 v0, 0x1

    .line 39
    const/4 v3, 0x1

    .line 40
    :goto_27
    iget-object v4, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    if-ge v3, v4, :cond_62

    .line 52
    .line 53
    iget-object v4, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lax/N1/e;

    .line 60
    .line 61
    iget-wide v7, v4, Lax/N1/e;->b:J

    .line 62
    .line 63
    cmp-long v9, p1, v7

    .line 64
    .line 65
    if-gez v9, :cond_5f

    .line 66
    .line 67
    iget-object v1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 68
    .line 69
    sub-int/2addr v3, v0

    .line 70
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lax/N1/e;

    .line 75
    .line 76
    iget-wide v0, v0, Lax/N1/e;->d:J

    .line 77
    .line 78
    cmp-long v2, v0, v5

    .line 79
    .line 80
    if-eqz v2, :cond_5c

    .line 81
    .line 82
    cmp-long v2, v0, p1

    .line 83
    .line 84
    if-lez v2, :cond_5c

    .line 85
    .line 86
    iget-wide p1, v4, Lax/N1/e;->b:J

    .line 87
    .line 88
    cmp-long v2, v0, p1

    .line 89
    .line 90
    if-gez v2, :cond_5c

    .line 91
    .line 92
    return-wide v0

    .line 93
    :cond_5c
    iget-wide p1, v4, Lax/N1/e;->b:J

    .line 94
    .line 95
    return-wide p1

    .line 96
    :cond_5f
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_27

    .line 99
    :cond_62
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-static {v0}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lax/N1/e;

    .line 106
    .line 107
    iget-wide v3, v0, Lax/N1/e;->d:J

    .line 108
    .line 109
    cmp-long v0, v3, v5

    .line 110
    .line 111
    if-eqz v0, :cond_75

    .line 112
    .line 113
    cmp-long v0, p1, v3

    .line 114
    .line 115
    if-gez v0, :cond_75

    .line 116
    .line 117
    return-wide v3

    .line 118
    :cond_75
    return-wide v1
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
    .registers 13

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
    iget-wide v0, p1, Lax/N1/e;->b:J

    .line 21
    .line 22
    cmp-long v6, v0, p2

    .line 23
    .line 24
    if-gtz v6, :cond_25

    .line 25
    .line 26
    iget-wide v0, p1, Lax/N1/e;->d:J

    .line 27
    .line 28
    cmp-long v6, v0, v4

    .line 29
    .line 30
    if-eqz v6, :cond_23

    .line 31
    .line 32
    cmp-long v4, p2, v0

    .line 33
    .line 34
    if-gez v4, :cond_25

    .line 35
    .line 36
    :cond_23
    const/4 v0, 0x1

    .line 37
    goto :goto_26

    .line 38
    :cond_25
    const/4 v0, 0x0

    .line 39
    :goto_26
    iget-object v1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sub-int/2addr v1, v3

    .line 46
    :goto_2d
    if-ltz v1, :cond_58

    .line 47
    .line 48
    iget-wide v4, p1, Lax/N1/e;->b:J

    .line 49
    .line 50
    iget-object v6, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    check-cast v6, Lax/N1/e;

    .line 57
    .line 58
    iget-wide v6, v6, Lax/N1/e;->b:J

    .line 59
    .line 60
    cmp-long v8, v4, v6

    .line 61
    .line 62
    if-ltz v8, :cond_46

    .line 63
    .line 64
    iget-object p2, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 65
    .line 66
    add-int/2addr v1, v3

    .line 67
    invoke-virtual {p2, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return v0

    .line 71
    :cond_46
    iget-object v4, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lax/N1/e;

    .line 78
    .line 79
    iget-wide v4, v4, Lax/N1/e;->b:J

    .line 80
    .line 81
    cmp-long v6, v4, p2

    .line 82
    .line 83
    if-gtz v6, :cond_55

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    :cond_55
    add-int/lit8 v1, v1, -0x1

    .line 87
    .line 88
    goto :goto_2d

    .line 89
    :cond_58
    iget-object p2, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p2, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return v0
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
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lax/r7/z<",
            "Lax/R0/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/k1/f;->f(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_b
    iget-object v1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lax/N1/e;

    .line 21
    .line 22
    iget-wide v1, v0, Lax/N1/e;->d:J

    .line 23
    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v5, v1, v3

    .line 30
    .line 31
    if-eqz v5, :cond_2a

    .line 32
    .line 33
    cmp-long v3, p1, v1

    .line 34
    .line 35
    if-gez v3, :cond_25

    .line 36
    .line 37
    goto :goto_2a

    .line 38
    :cond_25
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2a
    :goto_2a
    iget-object p1, v0, Lax/N1/e;->a:Lax/r7/z;

    .line 44
    .line 45
    return-object p1
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

.method public clear()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

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
    .registers 10

    .line 1
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-nez v0, :cond_69

    .line 13
    .line 14
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/N1/e;

    .line 22
    .line 23
    iget-wide v3, v0, Lax/N1/e;->b:J

    .line 24
    .line 25
    cmp-long v0, p1, v3

    .line 26
    .line 27
    if-gez v0, :cond_1d

    .line 28
    .line 29
    goto :goto_69

    .line 30
    :cond_1d
    const/4 v0, 0x1

    .line 31
    const/4 v3, 0x1

    .line 32
    :goto_1f
    iget-object v4, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ge v3, v4, :cond_52

    .line 39
    .line 40
    iget-object v4, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lax/N1/e;

    .line 47
    .line 48
    iget-wide v4, v4, Lax/N1/e;->b:J

    .line 49
    .line 50
    cmp-long v6, p1, v4

    .line 51
    .line 52
    if-nez v6, :cond_36

    .line 53
    .line 54
    return-wide v4

    .line 55
    :cond_36
    if-gez v6, :cond_4f

    .line 56
    .line 57
    iget-object v4, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    sub-int/2addr v3, v0

    .line 60
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lax/N1/e;

    .line 65
    .line 66
    iget-wide v3, v0, Lax/N1/e;->d:J

    .line 67
    .line 68
    cmp-long v5, v3, v1

    .line 69
    .line 70
    if-eqz v5, :cond_4c

    .line 71
    .line 72
    cmp-long v1, v3, p1

    .line 73
    .line 74
    if-gtz v1, :cond_4c

    .line 75
    .line 76
    return-wide v3

    .line 77
    :cond_4c
    iget-wide p1, v0, Lax/N1/e;->b:J

    .line 78
    .line 79
    return-wide p1

    .line 80
    :cond_4f
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_1f

    .line 83
    :cond_52
    iget-object v0, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {v0}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lax/N1/e;

    .line 90
    .line 91
    iget-wide v3, v0, Lax/N1/e;->d:J

    .line 92
    .line 93
    cmp-long v5, v3, v1

    .line 94
    .line 95
    if-eqz v5, :cond_66

    .line 96
    .line 97
    cmp-long v1, p1, v3

    .line 98
    .line 99
    if-gez v1, :cond_65

    .line 100
    .line 101
    goto :goto_66

    .line 102
    :cond_65
    return-wide v3

    .line 103
    :cond_66
    :goto_66
    iget-wide p1, v0, Lax/N1/e;->b:J

    .line 104
    .line 105
    return-wide p1

    .line 106
    :cond_69
    :goto_69
    return-wide v1
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
    .registers 9

    .line 1
    invoke-direct {p0, p1, p2}, Lax/k1/f;->f(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    add-int/lit8 v2, v0, -0x1

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lax/N1/e;

    .line 17
    .line 18
    iget-wide v1, v1, Lax/N1/e;->d:J

    .line 19
    .line 20
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v5, v1, v3

    .line 26
    .line 27
    if-eqz v5, :cond_20

    .line 28
    .line 29
    cmp-long v3, v1, p1

    .line 30
    .line 31
    if-ltz v3, :cond_22

    .line 32
    .line 33
    :cond_20
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    :cond_22
    iget-object p1, p0, Lax/k1/f;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 43
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
.end method
