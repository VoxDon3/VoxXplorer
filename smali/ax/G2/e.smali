.class public final Lax/G2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/G2/d;
.implements Lax/H2/c$a;


# instance fields
.field private final a:Lax/G2/c;

.field private final b:[Lax/H2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lax/H2/c<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lax/G2/c;[Lax/H2/c;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/G2/c;",
            "[",
            "Lax/H2/c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "constraintControllers"

    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/G2/e;->a:Lax/G2/c;

    .line 3
    iput-object p2, p0, Lax/G2/e;->b:[Lax/H2/c;

    .line 4
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/G2/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lax/I2/o;Lax/G2/c;)V
    .registers 11

    const-string v0, "trackers"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lax/H2/a;

    invoke-virtual {p1}, Lax/I2/o;->a()Lax/I2/h;

    move-result-object v1

    invoke-direct {v0, v1}, Lax/H2/a;-><init>(Lax/I2/h;)V

    .line 6
    new-instance v1, Lax/H2/b;

    invoke-virtual {p1}, Lax/I2/o;->b()Lax/I2/c;

    move-result-object v2

    invoke-direct {v1, v2}, Lax/H2/b;-><init>(Lax/I2/c;)V

    .line 7
    new-instance v2, Lax/H2/h;

    invoke-virtual {p1}, Lax/I2/o;->d()Lax/I2/h;

    move-result-object v3

    invoke-direct {v2, v3}, Lax/H2/h;-><init>(Lax/I2/h;)V

    .line 8
    new-instance v3, Lax/H2/d;

    invoke-virtual {p1}, Lax/I2/o;->c()Lax/I2/h;

    move-result-object v4

    invoke-direct {v3, v4}, Lax/H2/d;-><init>(Lax/I2/h;)V

    .line 9
    new-instance v4, Lax/H2/g;

    invoke-virtual {p1}, Lax/I2/o;->c()Lax/I2/h;

    move-result-object v5

    invoke-direct {v4, v5}, Lax/H2/g;-><init>(Lax/I2/h;)V

    .line 10
    new-instance v5, Lax/H2/f;

    invoke-virtual {p1}, Lax/I2/o;->c()Lax/I2/h;

    move-result-object v6

    invoke-direct {v5, v6}, Lax/H2/f;-><init>(Lax/I2/h;)V

    .line 11
    new-instance v6, Lax/H2/e;

    invoke-virtual {p1}, Lax/I2/o;->c()Lax/I2/h;

    move-result-object p1

    invoke-direct {v6, p1}, Lax/H2/e;-><init>(Lax/I2/h;)V

    const/4 p1, 0x7

    new-array p1, p1, [Lax/H2/c;

    const/4 v7, 0x0

    aput-object v0, p1, v7

    const/4 v0, 0x1

    aput-object v1, p1, v0

    const/4 v0, 0x2

    aput-object v2, p1, v0

    const/4 v0, 0x3

    aput-object v3, p1, v0

    const/4 v0, 0x4

    aput-object v4, p1, v0

    const/4 v0, 0x5

    aput-object v5, p1, v0

    const/4 v0, 0x6

    aput-object v6, p1, v0

    .line 12
    invoke-direct {p0, p2, p1}, Lax/G2/e;-><init>(Lax/G2/c;[Lax/H2/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/G2/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/G2/e;->b:[Lax/H2/c;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_7
    if-ge v3, v2, :cond_13

    .line 9
    .line 10
    aget-object v4, v1, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Lax/H2/c;->f()V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_7

    .line 18
    :catchall_11
    move-exception v1

    .line 19
    goto :goto_17

    .line 20
    :cond_13
    sget-object v1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_15
    .catchall {:try_start_3 .. :try_end_15} :catchall_11

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_17
    monitor-exit v0

    .line 25
    throw v1
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

.method public b(Ljava/lang/Iterable;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lax/K2/v;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "workSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/G2/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_8
    iget-object v1, p0, Lax/G2/e;->b:[Lax/H2/c;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_d
    if-ge v4, v2, :cond_1a

    .line 15
    .line 16
    aget-object v5, v1, v4

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-virtual {v5, v6}, Lax/H2/c;->g(Lax/H2/c$a;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_d

    .line 25
    :catchall_18
    move-exception p1

    .line 26
    goto :goto_39

    .line 27
    :cond_1a
    iget-object v1, p0, Lax/G2/e;->b:[Lax/H2/c;

    .line 28
    .line 29
    array-length v2, v1

    .line 30
    const/4 v4, 0x0

    .line 31
    :goto_1e
    if-ge v4, v2, :cond_28

    .line 32
    .line 33
    aget-object v5, v1, v4

    .line 34
    .line 35
    invoke-virtual {v5, p1}, Lax/H2/c;->e(Ljava/lang/Iterable;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_1e

    .line 41
    :cond_28
    iget-object p1, p0, Lax/G2/e;->b:[Lax/H2/c;

    .line 42
    .line 43
    array-length v1, p1

    .line 44
    :goto_2b
    if-ge v3, v1, :cond_35

    .line 45
    .line 46
    aget-object v2, p1, v3

    .line 47
    .line 48
    invoke-virtual {v2, p0}, Lax/H2/c;->g(Lax/H2/c$a;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_2b

    .line 54
    :cond_35
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_37
    .catchall {:try_start_8 .. :try_end_37} :catchall_18

    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_39
    monitor-exit v0

    .line 59
    throw p1
    .line 60
    .line 61
.end method

.method public c(Ljava/util/List;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/K2/v;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "workSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/G2/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_8
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_13
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2e

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Lax/K2/v;

    .line 32
    .line 33
    iget-object v3, v3, Lax/K2/v;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Lax/G2/e;->e(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_13

    .line 40
    .line 41
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_13

    .line 45
    :catchall_2c
    move-exception p1

    .line 46
    goto :goto_65

    .line 47
    :cond_2e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v2, 0x0

    .line 52
    :goto_33
    if-ge v2, p1, :cond_5a

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    check-cast v3, Lax/K2/v;

    .line 61
    .line 62
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {}, Lax/G2/f;->a()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v6, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v7, "Constraints met for "

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v4, v5, v3}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_33

    .line 91
    :cond_5a
    iget-object p1, p0, Lax/G2/e;->a:Lax/G2/c;

    .line 92
    .line 93
    if-eqz p1, :cond_63

    .line 94
    .line 95
    invoke-interface {p1, v1}, Lax/G2/c;->f(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_63
    .catchall {:try_start_8 .. :try_end_63} :catchall_2c

    .line 99
    .line 100
    :cond_63
    monitor-exit v0

    .line 101
    return-void

    .line 102
    :goto_65
    monitor-exit v0

    .line 103
    throw p1
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

.method public d(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/K2/v;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "workSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/G2/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_8
    iget-object v1, p0, Lax/G2/e;->a:Lax/G2/c;

    .line 10
    .line 11
    if-eqz v1, :cond_14

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lax/G2/c;->b(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_11
    .catchall {:try_start_8 .. :try_end_11} :catchall_12

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    goto :goto_16

    .line 21
    :cond_14
    :goto_14
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_16
    monitor-exit v0

    .line 24
    throw p1
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

.method public final e(Ljava/lang/String;)Z
    .registers 9

    .line 1
    const-string v0, "workSpecId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/G2/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_8
    iget-object v1, p0, Lax/G2/e;->b:[Lax/H2/c;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_d
    if-ge v4, v2, :cond_1d

    .line 15
    .line 16
    aget-object v5, v1, v4

    .line 17
    .line 18
    invoke-virtual {v5, p1}, Lax/H2/c;->d(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-eqz v6, :cond_18

    .line 23
    .line 24
    goto :goto_1e

    .line 25
    :cond_18
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_d

    .line 28
    :catchall_1b
    move-exception p1

    .line 29
    goto :goto_51

    .line 30
    :cond_1d
    const/4 v5, 0x0

    .line 31
    :goto_1e
    if-eqz v5, :cond_4c

    .line 32
    .line 33
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {}, Lax/G2/f;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v6, "Work "

    .line 47
    .line 48
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " constrained by "

    .line 55
    .line 56
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v1, v2, p1}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4c
    .catchall {:try_start_8 .. :try_end_4c} :catchall_1b

    .line 75
    .line 76
    .line 77
    :cond_4c
    if-nez v5, :cond_4f

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    :cond_4f
    monitor-exit v0

    .line 81
    return v3

    .line 82
    :goto_51
    monitor-exit v0

    .line 83
    throw p1
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
