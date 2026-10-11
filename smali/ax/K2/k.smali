.class public final Lax/K2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/K2/j;


# instance fields
.field private final a:Lax/k2/u;

.field private final b:Lax/k2/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/k2/i<",
            "Lax/K2/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/k2/A;

.field private final d:Lax/k2/A;


# direct methods
.method public constructor <init>(Lax/k2/u;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 5
    .line 6
    new-instance v0, Lax/K2/k$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lax/K2/k$a;-><init>(Lax/K2/k;Lax/k2/u;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/K2/k;->b:Lax/k2/i;

    .line 12
    .line 13
    new-instance v0, Lax/K2/k$b;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lax/K2/k$b;-><init>(Lax/K2/k;Lax/k2/u;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lax/K2/k;->c:Lax/k2/A;

    .line 19
    .line 20
    new-instance v0, Lax/K2/k$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lax/K2/k$c;-><init>(Lax/K2/k;Lax/k2/u;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lax/K2/k;->d:Lax/k2/A;

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

.method public static h()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

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


# virtual methods
.method public a()Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lax/k2/x;->c(Ljava/lang/String;I)Lax/k2/x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 9
    .line 10
    invoke-virtual {v2}, Lax/k2/u;->d()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v2, v0, v1, v3}, Lax/m2/b;->b(Lax/k2/u;Lax/o2/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :try_start_13
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    :goto_1c
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_34

    .line 34
    .line 35
    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2a

    .line 40
    .line 41
    move-object v5, v3

    .line 42
    goto :goto_2e

    .line 43
    :cond_2a
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    :goto_2e
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_31
    .catchall {:try_start_13 .. :try_end_31} :catchall_32

    .line 48
    .line 49
    .line 50
    goto :goto_1c

    .line 51
    :catchall_32
    move-exception v1

    .line 52
    goto :goto_3b

    .line 53
    :cond_34
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lax/k2/x;->f()V

    .line 57
    .line 58
    .line 59
    return-object v4

    .line 60
    :goto_3b
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lax/k2/x;->f()V

    .line 64
    .line 65
    .line 66
    throw v1
    .line 67
    .line 68
.end method

.method public b(Lax/K2/i;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/u;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/k2/u;->e()V

    .line 9
    .line 10
    .line 11
    :try_start_a
    iget-object v0, p0, Lax/K2/k;->b:Lax/k2/i;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/k2/i;->j(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 17
    .line 18
    invoke-virtual {p1}, Lax/k2/u;->A()V
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1a

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 22
    .line 23
    invoke-virtual {p1}, Lax/k2/u;->i()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_1a
    move-exception p1

    .line 28
    iget-object v0, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/k2/u;->i()V

    .line 31
    .line 32
    .line 33
    throw p1
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

.method public c(Lax/K2/m;)Lax/K2/i;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/K2/j$a;->a(Lax/K2/j;Lax/K2/m;)Lax/K2/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public d(Ljava/lang/String;I)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/u;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/K2/k;->c:Lax/k2/A;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/k2/A;->b()Lax/o2/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p1, :cond_12

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lax/o2/i;->t0(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_15

    .line 19
    :cond_12
    invoke-interface {v0, v1, p1}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_15
    const/4 p1, 0x2

    .line 23
    int-to-long v1, p2

    .line 24
    invoke-interface {v0, p1, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/k2/u;->e()V

    .line 30
    .line 31
    .line 32
    :try_start_1f
    invoke-interface {v0}, Lax/o2/k;->I()I

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/k2/u;->A()V
    :try_end_27
    .catchall {:try_start_1f .. :try_end_27} :catchall_32

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 41
    .line 42
    invoke-virtual {p1}, Lax/k2/u;->i()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lax/K2/k;->c:Lax/k2/A;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lax/k2/A;->h(Lax/o2/k;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_32
    move-exception p1

    .line 52
    iget-object p2, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 53
    .line 54
    invoke-virtual {p2}, Lax/k2/u;->i()V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lax/K2/k;->c:Lax/k2/A;

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Lax/k2/A;->h(Lax/o2/k;)V

    .line 60
    .line 61
    .line 62
    throw p1
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

.method public e(Lax/K2/m;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/K2/j$a;->b(Lax/K2/j;Lax/K2/m;)V

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
    .line 22
.end method

.method public f(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/u;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/K2/k;->d:Lax/k2/A;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/k2/A;->b()Lax/o2/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p1, :cond_12

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lax/o2/i;->t0(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_15

    .line 19
    :cond_12
    invoke-interface {v0, v1, p1}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_15
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 23
    .line 24
    invoke-virtual {p1}, Lax/k2/u;->e()V

    .line 25
    .line 26
    .line 27
    :try_start_1a
    invoke-interface {v0}, Lax/o2/k;->I()I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/k2/u;->A()V
    :try_end_22
    .catchall {:try_start_1a .. :try_end_22} :catchall_2d

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/k2/u;->i()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lax/K2/k;->d:Lax/k2/A;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lax/k2/A;->h(Lax/o2/k;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_2d
    move-exception p1

    .line 47
    iget-object v1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 48
    .line 49
    invoke-virtual {v1}, Lax/k2/u;->i()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lax/K2/k;->d:Lax/k2/A;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lax/k2/A;->h(Lax/o2/k;)V

    .line 55
    .line 56
    .line 57
    throw p1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public g(Ljava/lang/String;I)Lax/K2/i;
    .registers 8

    .line 1
    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Lax/k2/x;->c(Ljava/lang/String;I)Lax/k2/x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez p1, :cond_e

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Lax/k2/x;->t0(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_11

    .line 15
    :cond_e
    invoke-virtual {v0, v2, p1}, Lax/k2/x;->D(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :goto_11
    int-to-long p1, p2

    .line 19
    invoke-virtual {v0, v1, p1, p2}, Lax/k2/x;->X(IJ)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 23
    .line 24
    invoke-virtual {p1}, Lax/k2/u;->d()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/K2/k;->a:Lax/k2/u;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {p1, v0, p2, v1}, Lax/m2/b;->b(Lax/k2/u;Lax/o2/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :try_start_22
    const-string p2, "work_spec_id"

    .line 36
    .line 37
    invoke-static {p1, p2}, Lax/m2/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const-string v2, "generation"

    .line 42
    .line 43
    invoke-static {p1, v2}, Lax/m2/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-string v3, "system_id"

    .line 48
    .line 49
    invoke-static {p1, v3}, Lax/m2/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_56

    .line 58
    .line 59
    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_41

    .line 64
    .line 65
    goto :goto_45

    .line 66
    :cond_41
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_45
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    new-instance v3, Lax/K2/i;

    .line 79
    .line 80
    invoke-direct {v3, v1, p2, v2}, Lax/K2/i;-><init>(Ljava/lang/String;II)V
    :try_end_52
    .catchall {:try_start_22 .. :try_end_52} :catchall_54

    .line 81
    .line 82
    .line 83
    move-object v1, v3

    .line 84
    goto :goto_56

    .line 85
    :catchall_54
    move-exception p2

    .line 86
    goto :goto_5d

    .line 87
    :cond_56
    :goto_56
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lax/k2/x;->f()V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :goto_5d
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lax/k2/x;->f()V

    .line 98
    .line 99
    .line 100
    throw p2
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
