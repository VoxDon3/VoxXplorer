.class Lax/W2/y$c;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field h:Z

.field i:Lax/W2/j$f;

.field final synthetic j:Lax/W2/y;


# direct methods
.method public constructor <init>(Lax/W2/y;ZLax/W2/j$f;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p2, p0, Lax/W2/y$c;->h:Z

    .line 9
    .line 10
    iput-object p3, p0, Lax/W2/y$c;->i:Lax/W2/j$f;

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


# virtual methods
.method A(Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;)I
    .registers 7

    .line 1
    iget-object v0, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/W2/y;->z0(Lax/W2/y;Lcom/voxdon/xplorer/file/K;)Lcom/voxdon/xplorer/file/K;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lax/W2/y;->A0(Lax/W2/y;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/W2/y;->B0(Lax/W2/y;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    :try_start_11
    iget-object v2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 19
    .line 20
    invoke-static {v2}, Lax/W2/y;->C0(Lax/W2/y;)Lcom/voxdon/xplorer/file/o;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2, p1, p2, p0}, Lcom/voxdon/xplorer/file/J;->s2(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;Lax/u3/c;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 28
    .line 29
    invoke-virtual {p2}, Lax/W2/j;->w()Lax/W2/v;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/K;->p()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-virtual {p2, v2, v3}, Lax/W2/v;->d(J)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 41
    .line 42
    invoke-virtual {p2}, Lax/W2/j;->w()Lax/W2/v;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    sget-object v2, Lax/W2/v$b;->q:Lax/W2/v$b;

    .line 47
    .line 48
    invoke-virtual {p2, v2, v0}, Lax/W2/v;->c(Lax/W2/v$b;I)V
    :try_end_32
    .catch Lax/b3/f; {:try_start_11 .. :try_end_32} :catch_33
    .catch Lax/b3/j; {:try_start_11 .. :try_end_32} :catch_35
    .catch Lax/b3/a; {:try_start_11 .. :try_end_32} :catch_35

    .line 49
    .line 50
    .line 51
    goto :goto_4d

    .line 52
    :catch_33
    move-exception p2

    .line 53
    goto :goto_54

    .line 54
    :catch_35
    iget-object p2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 55
    .line 56
    invoke-virtual {p2}, Lax/W2/j;->w()Lax/W2/v;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget-object v1, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 61
    .line 62
    invoke-virtual {p2, v1, v0}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 66
    .line 67
    invoke-virtual {p2}, Lax/W2/j;->w()Lax/W2/v;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p2, p1}, Lax/W2/v;->b(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :goto_4d
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lax/W2/j;->l0(Z)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    return p1

    .line 85
    :goto_54
    invoke-virtual {p2}, Lax/b3/f;->a()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_5c

    .line 90
    .line 91
    const/4 p1, 0x2

    .line 92
    return p1

    .line 93
    :cond_5c
    :try_start_5c
    iget-object p2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 94
    .line 95
    invoke-static {p2}, Lax/W2/y;->C0(Lax/W2/y;)Lcom/voxdon/xplorer/file/o;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/K;->A1()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v2, v3}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {p2, v2}, Lax/W2/y;->A0(Lax/W2/y;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 108
    .line 109
    .line 110
    iget-object p2, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 111
    .line 112
    invoke-static {p2}, Lax/W2/y;->C0(Lax/W2/y;)Lcom/voxdon/xplorer/file/o;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/K;->B1()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v2, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p2, p1}, Lax/W2/y;->B0(Lax/W2/y;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    :try_end_7e
    .catch Lax/b3/j; {:try_start_5c .. :try_end_7e} :catch_7f

    .line 125
    .line 126
    .line 127
    goto :goto_89

    .line 128
    :catch_7f
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 129
    .line 130
    invoke-static {p1, v1}, Lax/W2/y;->A0(Lax/W2/y;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 134
    .line 135
    invoke-static {p1, v1}, Lax/W2/y;->B0(Lax/W2/y;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 136
    .line 137
    .line 138
    :goto_89
    return v0
    .line 139
.end method

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/y$c;->w([Ljava/lang/Void;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/y$c;->x(Ljava/lang/Integer;)V

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
    .line 22
.end method

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/y$c;->y(Ljava/lang/Integer;)V

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
    .line 22
.end method

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Integer;
    .registers 4

    .line 1
    iget-boolean p1, p0, Lax/W2/y$c;->h:Z

    .line 2
    .line 3
    if-eqz p1, :cond_27

    .line 4
    .line 5
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 6
    .line 7
    invoke-static {p1}, Lax/W2/y;->y0(Lax/W2/y;)Lcom/voxdon/xplorer/file/K;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lax/W2/y$c;->i:Lax/W2/j$f;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lax/W2/y$c;->z(Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_27

    .line 18
    .line 19
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "PROCCED OVERWRITE RECYCLE BIN ERROR"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 38
    .line 39
    .line 40
    :cond_27
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 41
    .line 42
    invoke-static {p1}, Lax/W2/y;->D0(Lax/W2/y;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x0

    .line 51
    if-nez p1, :cond_58

    .line 52
    .line 53
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_3f

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3f
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 65
    .line 66
    invoke-static {p1}, Lax/W2/y;->D0(Lax/W2/y;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lcom/voxdon/xplorer/file/K;

    .line 75
    .line 76
    sget-object v0, Lax/W2/j$f;->q:Lax/W2/j$f;

    .line 77
    .line 78
    invoke-virtual {p0, p1, v0}, Lax/W2/y$c;->A(Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_27

    .line 83
    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
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

.method protected x(Ljava/lang/Integer;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->g0()V

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
    .line 22
.end method

.method protected y(Ljava/lang/Integer;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/W2/j;->o()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-object v0, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 14
    .line 15
    invoke-static {v0}, Lax/W2/y;->y0(Lax/W2/y;)Lcom/voxdon/xplorer/file/K;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/K;->isDirectory()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {v0, v1, p1}, Lax/W2/y;->E0(Lax/W2/y;ZI)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method z(Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;)I
    .registers 5

    .line 1
    sget-object v0, Lax/W2/y$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p2, v0, :cond_3a

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p2, v1, :cond_33

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eq p2, p1, :cond_27

    .line 18
    .line 19
    const/4 p1, 0x4

    .line 20
    if-eq p2, p1, :cond_16

    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/W2/j;->i()V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lax/W2/v$b;->d0:Lax/W2/v$b;

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_27
    iget-object p1, p0, Lax/W2/y$c;->j:Lax/W2/y;

    .line 41
    .line 42
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p2, Lax/W2/v$b;->d0:Lax/W2/v$b;

    .line 47
    .line 48
    invoke-virtual {p1, p2, v0}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 49
    .line 50
    .line 51
    return v1

    .line 52
    :cond_33
    sget-object p2, Lax/W2/j$f;->d0:Lax/W2/j$f;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Lax/W2/y$c;->A(Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1

    .line 59
    :cond_3a
    sget-object p2, Lax/W2/j$f;->e0:Lax/W2/j$f;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lax/W2/y$c;->A(Lcom/voxdon/xplorer/file/K;Lax/W2/j$f;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1
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
