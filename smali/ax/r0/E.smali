.class public Lax/r0/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Lax/r0/p;


# instance fields
.field private a:Lax/r0/h;

.field private b:Lax/r0/p;

.field protected volatile c:Lax/r0/S;

.field private volatile d:Lax/r0/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    invoke-static {}, Lax/r0/p;->b()Lax/r0/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lax/r0/E;->e:Lax/r0/p;

    .line 6
    .line 7
    return-void
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

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method protected a(Lax/r0/S;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_35

    .line 6
    :cond_5
    monitor-enter p0

    .line 7
    :try_start_6
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_6 .. :try_end_b} :catchall_c

    .line 12
    return-void

    .line 13
    :catchall_c
    move-exception p1

    .line 14
    goto :goto_36

    .line 15
    :cond_e
    :try_start_e
    iget-object v0, p0, Lax/r0/E;->a:Lax/r0/h;

    .line 16
    .line 17
    if-eqz v0, :cond_27

    .line 18
    .line 19
    invoke-interface {p1}, Lax/r0/S;->k()Lax/r0/a0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lax/r0/E;->a:Lax/r0/h;

    .line 24
    .line 25
    iget-object v2, p0, Lax/r0/E;->b:Lax/r0/p;

    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Lax/r0/a0;->b(Lax/r0/h;Lax/r0/p;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/r0/S;

    .line 32
    .line 33
    iput-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 34
    .line 35
    iget-object v0, p0, Lax/r0/E;->a:Lax/r0/h;

    .line 36
    .line 37
    iput-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 38
    .line 39
    goto :goto_34

    .line 40
    :cond_27
    iput-object p1, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 41
    .line 42
    sget-object v0, Lax/r0/h;->c0:Lax/r0/h;

    .line 43
    .line 44
    iput-object v0, p0, Lax/r0/E;->d:Lax/r0/h;
    :try_end_2d
    .catch Lax/r0/B; {:try_start_e .. :try_end_2d} :catch_2e
    .catchall {:try_start_e .. :try_end_2d} :catchall_c

    .line 45
    .line 46
    goto :goto_34

    .line 47
    :catch_2e
    :try_start_2e
    iput-object p1, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 48
    .line 49
    sget-object p1, Lax/r0/h;->c0:Lax/r0/h;

    .line 50
    .line 51
    iput-object p1, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 52
    .line 53
    :goto_34
    monitor-exit p0

    .line 54
    :goto_35
    return-void

    .line 55
    :goto_36
    monitor-exit p0
    :try_end_37
    .catchall {:try_start_2e .. :try_end_37} :catchall_c

    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public b()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/h;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_b
    iget-object v0, p0, Lax/r0/E;->a:Lax/r0/h;

    .line 13
    .line 14
    if-eqz v0, :cond_14

    .line 15
    .line 16
    invoke-virtual {v0}, Lax/r0/h;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_14
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 22
    .line 23
    if-eqz v0, :cond_1f

    .line 24
    .line 25
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/r0/S;->i()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0

    .line 32
    :cond_1f
    const/4 v0, 0x0

    .line 33
    return v0
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

.method public c(Lax/r0/S;)Lax/r0/S;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/r0/E;->a(Lax/r0/S;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 5
    .line 6
    return-object p1
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

.method public d(Lax/r0/S;)Lax/r0/S;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lax/r0/E;->a:Lax/r0/h;

    .line 5
    .line 6
    iput-object v1, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 7
    .line 8
    iput-object p1, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 9
    .line 10
    return-object v0
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

.method public e()Lax/r0/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/r0/E;->a:Lax/r0/h;

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    monitor-enter p0

    .line 14
    :try_start_d
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 15
    .line 16
    if-eqz v0, :cond_17

    .line 17
    .line 18
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_15
    move-exception v0

    .line 23
    goto :goto_2c

    .line 24
    :cond_17
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 25
    .line 26
    if-nez v0, :cond_20

    .line 27
    .line 28
    sget-object v0, Lax/r0/h;->c0:Lax/r0/h;

    .line 29
    .line 30
    iput-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 31
    .line 32
    goto :goto_28

    .line 33
    :cond_20
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 34
    .line 35
    invoke-interface {v0}, Lax/r0/S;->h()Lax/r0/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 40
    .line 41
    :goto_28
    iget-object v0, p0, Lax/r0/E;->d:Lax/r0/h;

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-object v0

    .line 45
    :goto_2c
    monitor-exit p0
    :try_end_2d
    .catchall {:try_start_d .. :try_end_2d} :catchall_15

    .line 46
    throw v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    .line 1
    if-ne p0, p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_4
    instance-of v0, p1, Lax/r0/E;

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_a
    check-cast p1, Lax/r0/E;

    .line 12
    .line 13
    iget-object v0, p0, Lax/r0/E;->c:Lax/r0/S;

    .line 14
    .line 15
    iget-object v1, p1, Lax/r0/E;->c:Lax/r0/S;

    .line 16
    .line 17
    if-nez v0, :cond_21

    .line 18
    .line 19
    if-nez v1, :cond_21

    .line 20
    .line 21
    invoke-virtual {p0}, Lax/r0/E;->e()Lax/r0/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lax/r0/E;->e()Lax/r0/h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Lax/r0/h;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_21
    if-eqz v0, :cond_2a

    .line 35
    .line 36
    if-eqz v1, :cond_2a

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1

    .line 43
    :cond_2a
    if-eqz v0, :cond_39

    .line 44
    .line 45
    invoke-interface {v0}, Lax/r0/T;->c()Lax/r0/S;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p1, v1}, Lax/r0/E;->c(Lax/r0/S;)Lax/r0/S;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_39
    invoke-interface {v1}, Lax/r0/T;->c()Lax/r0/S;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lax/r0/E;->c(Lax/r0/S;)Lax/r0/S;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1
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

.method public hashCode()I
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
