.class public Lcom/voxdon/xplorer/file/a;
.super Lcom/voxdon/xplorer/file/x;
.source "SourceFile"


# instance fields
.field A:Lax/T2/h;

.field z:Lax/c3/K;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;-><init>()V

    .line 2
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

.method public static U1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->L()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/T2/h;->q(I)Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, p0, v1}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lax/U2/d;->Q(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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
.end method


# virtual methods
.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5b

    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/T2/h;->m0()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1f

    .line 14
    .line 15
    :try_start_e
    iget-object p1, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p1, v0, p2, p2}, Lax/T2/h;->f(ZLax/T2/h$g;Lax/u3/c;)V
    :try_end_15
    .catch Lax/b3/a; {:try_start_e .. :try_end_15} :catch_16

    .line 20
    .line 21
    .line 22
    goto :goto_1f

    .line 23
    :catch_16
    move-exception p1

    .line 24
    new-instance p2, Lax/b3/j;

    .line 25
    .line 26
    const-string v0, "Cancelled"

    .line 27
    .line 28
    invoke-direct {p2, v0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p2

    .line 32
    :cond_1f
    :goto_1f
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object p2, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 35
    .line 36
    invoke-virtual {p2}, Lax/T2/h;->N()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    new-instance p2, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x0

    .line 53
    :cond_34
    :goto_34
    if-ge v1, v0, :cond_5a

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    check-cast v2, Lax/T2/h$h;

    .line 62
    .line 63
    invoke-virtual {v2}, Lax/T2/h$h;->b()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    cmp-long v7, v3, v5

    .line 70
    .line 71
    if-eqz v7, :cond_34

    .line 72
    .line 73
    iget-object v3, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 74
    .line 75
    invoke-virtual {v2}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v3, v2}, Lax/T2/h;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/file/x;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_34

    .line 91
    :cond_5a
    return-object p2

    .line 92
    :cond_5b
    invoke-super {p0, p1, p2}, Lcom/voxdon/xplorer/file/x;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
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

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 3

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_4
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_17

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/a;->T1(Lcom/voxdon/xplorer/file/n;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    iget-object v0, p0, Lcom/voxdon/xplorer/file/a;->z:Lax/c3/K;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lax/c3/B;->S(Lax/c3/K;Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_17
    invoke-static {p1}, Lax/c3/B;->W(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 6
    .line 7
    invoke-virtual {v1}, Lax/T2/h;->N()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_12

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/a;->T1(Lcom/voxdon/xplorer/file/n;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    :goto_13
    if-eqz v0, :cond_48

    .line 21
    .line 22
    iget-object v3, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 23
    .line 24
    invoke-virtual {v3}, Lax/T2/h;->m0()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_48

    .line 29
    .line 30
    if-eqz v1, :cond_48

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :goto_20
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ge v3, v4, :cond_48

    .line 38
    .line 39
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lax/T2/h$h;

    .line 44
    .line 45
    iget-object v5, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 46
    .line 47
    invoke-virtual {v4}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v5, v6}, Lax/T2/h;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_45

    .line 64
    .line 65
    invoke-virtual {v4}, Lax/T2/h$h;->b()J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    goto :goto_4a

    .line 70
    :cond_45
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_20

    .line 73
    :cond_48
    const-wide/16 v3, 0x0

    .line 74
    .line 75
    :goto_4a
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 76
    .line 77
    .line 78
    if-eqz v0, :cond_85

    .line 79
    .line 80
    iget-object v0, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 81
    .line 82
    invoke-virtual {v0}, Lax/T2/h;->m0()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_85

    .line 87
    .line 88
    if-eqz v1, :cond_85

    .line 89
    .line 90
    :goto_59
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ge v2, v0, :cond_85

    .line 95
    .line 96
    iget-object v0, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 97
    .line 98
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Lax/T2/h$h;

    .line 103
    .line 104
    invoke-virtual {v5}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v0, v5}, Lax/T2/h;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_82

    .line 121
    .line 122
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 126
    .line 127
    invoke-virtual {p1, v3, v4}, Lax/T2/h;->N0(J)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_82
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_59

    .line 134
    :cond_85
    return-void
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

.method T1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/a;->z:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lax/U2/d;->Q(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public W(Landroid/content/Context;Lax/c3/K;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lcom/voxdon/xplorer/file/x;->W(Landroid/content/Context;Lax/c3/K;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p1}, Lax/T2/h;->q(I)Lax/c3/K;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/voxdon/xplorer/file/a;->z:Lax/c3/K;

    .line 13
    .line 14
    invoke-static {p1}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/voxdon/xplorer/file/a;->A:Lax/T2/h;

    .line 19
    .line 20
    return-void
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
