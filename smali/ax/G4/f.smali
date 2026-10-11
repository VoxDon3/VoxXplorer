.class public Lax/G4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/x4/d;


# direct methods
.method public constructor <init>(Lax/x4/d;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/G4/f;->a:Lax/x4/d;

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


# virtual methods
.method public A()Lax/G4/M0;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/I0;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/I0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->B(Lax/G4/I0;)Lax/G4/M0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

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
.end method

.method B(Lax/G4/I0;)Lax/G4/M0;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v4, 0x0

    .line 12
    sget-object v5, Lax/G4/I0$a;->b:Lax/G4/I0$a;

    .line 13
    .line 14
    const-string v2, "2/files/upload_session/start"

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lax/x4/d;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;)Lax/s4/a$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lax/G4/M0;

    .line 22
    .line 23
    iget-object v1, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/x4/d;->i()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, p1, v1}, Lax/G4/M0;-><init>(Lax/s4/a$c;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
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

.method a(Lax/G4/V;)Lax/G4/Z;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/X;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/copy_v2"

    .line 12
    .line 13
    sget-object v5, Lax/G4/V$a;->b:Lax/G4/V$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/Z$a;->b:Lax/G4/Z$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/W$b;->b:Lax/G4/W$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/Z;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/X;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/W;

    .line 45
    .line 46
    const-string v3, "2/files/copy_v2"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/X;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/W;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public b(Ljava/lang/String;Ljava/lang/String;)Lax/G4/Z;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/X;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/V;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/G4/V;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->a(Lax/G4/V;)Lax/G4/Z;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method c(Lax/G4/b;)Lax/G4/e;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/d;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/create_folder_v2"

    .line 12
    .line 13
    sget-object v5, Lax/G4/b$a;->b:Lax/G4/b$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/e$a;->b:Lax/G4/e$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/c$b;->b:Lax/G4/c$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/e;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/d;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/c;

    .line 45
    .line 46
    const-string v3, "2/files/create_folder_v2"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/c;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public d(Ljava/lang/String;Z)Lax/G4/e;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/d;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/G4/b;-><init>(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->c(Lax/G4/b;)Lax/G4/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method e(Lax/G4/g;)Lax/G4/j;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/i;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/delete_v2"

    .line 12
    .line 13
    sget-object v5, Lax/G4/g$a;->b:Lax/G4/g$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/j$a;->b:Lax/G4/j$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/h$b;->b:Lax/G4/h$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/j;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/i;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/h;

    .line 45
    .line 46
    const-string v3, "2/files/delete_v2"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/h;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public f(Ljava/lang/String;)Lax/G4/j;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/i;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/G4/g;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->e(Lax/G4/g;)Lax/G4/j;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method g(Lax/G4/m;Ljava/util/List;)Lax/p4/i;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/G4/m;",
            "Ljava/util/List<",
            "Lax/s4/a$a;",
            ">;)",
            "Lax/p4/i<",
            "Lax/G4/t;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/p;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/download"

    .line 12
    .line 13
    sget-object v6, Lax/G4/m$a;->b:Lax/G4/m$a;

    .line 14
    .line 15
    sget-object v7, Lax/G4/t$a;->b:Lax/G4/t$a;

    .line 16
    .line 17
    sget-object v8, Lax/G4/o$b;->b:Lax/G4/o$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    move-object v5, p2

    .line 22
    invoke-virtual/range {v0 .. v8}, Lax/x4/d;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/util/List;Lax/v4/c;Lax/v4/c;Lax/v4/c;)Lax/p4/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_19
    .catch Lax/p4/p; {:try_start_0 .. :try_end_19} :catch_1a

    .line 26
    return-object p1

    .line 27
    :catch_1a
    move-exception v0

    .line 28
    move-object p1, v0

    .line 29
    new-instance p2, Lax/G4/p;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lax/G4/o;

    .line 44
    .line 45
    const-string v2, "2/files/download"

    .line 46
    .line 47
    invoke-direct {p2, v2, v0, v1, p1}, Lax/G4/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/o;)V

    .line 48
    .line 49
    .line 50
    throw p2
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
.end method

.method public h(Ljava/lang/String;)Lax/G4/n;
    .registers 3

    .line 1
    new-instance v0, Lax/G4/n;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lax/G4/n;-><init>(Lax/G4/f;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method i(Lax/G4/z;)Lax/G4/P;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/B;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/get_metadata"

    .line 12
    .line 13
    sget-object v5, Lax/G4/z$a;->b:Lax/G4/z$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/P$a;->b:Lax/G4/P$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/A$b;->b:Lax/G4/A$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/P;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/B;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/A;

    .line 45
    .line 46
    const-string v3, "2/files/get_metadata"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/B;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/A;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public j(Ljava/lang/String;)Lax/G4/P;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/B;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/z;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/G4/z;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->i(Lax/G4/z;)Lax/G4/P;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method k(Lax/G4/n0;Ljava/util/List;)Lax/p4/i;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/G4/n0;",
            "Ljava/util/List<",
            "Lax/s4/a$a;",
            ">;)",
            "Lax/p4/i<",
            "Lax/G4/t;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/p0;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/get_thumbnail"

    .line 12
    .line 13
    sget-object v6, Lax/G4/n0$b;->b:Lax/G4/n0$b;

    .line 14
    .line 15
    sget-object v7, Lax/G4/t$a;->b:Lax/G4/t$a;

    .line 16
    .line 17
    sget-object v8, Lax/G4/o0$b;->b:Lax/G4/o0$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    move-object v5, p2

    .line 22
    invoke-virtual/range {v0 .. v8}, Lax/x4/d;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/util/List;Lax/v4/c;Lax/v4/c;Lax/v4/c;)Lax/p4/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_19
    .catch Lax/p4/p; {:try_start_0 .. :try_end_19} :catch_1a

    .line 26
    return-object p1

    .line 27
    :catch_1a
    move-exception v0

    .line 28
    move-object p1, v0

    .line 29
    new-instance p2, Lax/G4/p0;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lax/G4/o0;

    .line 44
    .line 45
    const-string v2, "2/files/get_thumbnail"

    .line 46
    .line 47
    invoke-direct {p2, v2, v0, v1, p1}, Lax/G4/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/o0;)V

    .line 48
    .line 49
    .line 50
    throw p2
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
.end method

.method public l(Ljava/lang/String;)Lax/G4/C;
    .registers 3

    .line 1
    invoke-static {p1}, Lax/G4/n0;->a(Ljava/lang/String;)Lax/G4/n0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lax/G4/C;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lax/G4/C;-><init>(Lax/G4/f;Lax/G4/n0$a;)V

    .line 8
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

.method m(Lax/G4/F;)Lax/G4/L;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/K;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/list_folder"

    .line 12
    .line 13
    sget-object v5, Lax/G4/F$a;->b:Lax/G4/F$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/L$a;->b:Lax/G4/L$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/J$b;->b:Lax/G4/J$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/L;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/K;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/J;

    .line 45
    .line 46
    const-string v3, "2/files/list_folder"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/K;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/J;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public n(Ljava/lang/String;)Lax/G4/L;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/K;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/F;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/G4/F;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->m(Lax/G4/F;)Lax/G4/L;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method o(Lax/G4/G;)Lax/G4/L;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/I;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/list_folder/continue"

    .line 12
    .line 13
    sget-object v5, Lax/G4/G$a;->b:Lax/G4/G$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/L$a;->b:Lax/G4/L$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/H$b;->b:Lax/G4/H$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/L;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/I;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/H;

    .line 45
    .line 46
    const-string v3, "2/files/list_folder/continue"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/I;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/H;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public p(Ljava/lang/String;)Lax/G4/L;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/I;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/G;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/G4/G;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->o(Lax/G4/G;)Lax/G4/L;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method q(Lax/G4/V;)Lax/G4/Z;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/X;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/move_v2"

    .line 12
    .line 13
    sget-object v5, Lax/G4/V$a;->b:Lax/G4/V$a;

    .line 14
    .line 15
    sget-object v6, Lax/G4/Z$a;->b:Lax/G4/Z$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/W$b;->b:Lax/G4/W$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/Z;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/X;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/W;

    .line 45
    .line 46
    const-string v3, "2/files/move_v2"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/X;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/W;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public r(Ljava/lang/String;Ljava/lang/String;)Lax/G4/Z;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/X;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/V;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/G4/V;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->q(Lax/G4/V;)Lax/G4/Z;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method s(Lax/G4/h0;)Lax/G4/j0;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/b0;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/files/search_v2"

    .line 12
    .line 13
    sget-object v5, Lax/G4/h0$b;->b:Lax/G4/h0$b;

    .line 14
    .line 15
    sget-object v6, Lax/G4/j0$a;->b:Lax/G4/j0$a;

    .line 16
    .line 17
    sget-object v7, Lax/G4/a0$b;->b:Lax/G4/a0$b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lax/G4/j0;
    :try_end_1a
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lax/G4/b0;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/G4/a0;

    .line 45
    .line 46
    const-string v3, "2/files/search_v2"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/b0;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/a0;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public t(Ljava/lang/String;)Lax/G4/i0;
    .registers 3

    .line 1
    invoke-static {p1}, Lax/G4/h0;->a(Ljava/lang/String;)Lax/G4/h0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lax/G4/i0;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lax/G4/i0;-><init>(Lax/G4/f;Lax/G4/h0$a;)V

    .line 8
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

.method u(Lax/G4/t0;)Lax/G4/O0;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v4, 0x0

    .line 12
    sget-object v5, Lax/G4/t0$b;->b:Lax/G4/t0$b;

    .line 13
    .line 14
    const-string v2, "2/files/upload"

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lax/x4/d;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;)Lax/s4/a$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lax/G4/O0;

    .line 22
    .line 23
    iget-object v1, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/x4/d;->i()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, p1, v1}, Lax/G4/O0;-><init>(Lax/s4/a$c;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
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

.method public v(Ljava/lang/String;)Lax/G4/u0;
    .registers 3

    .line 1
    invoke-static {p1}, Lax/G4/t0;->c(Ljava/lang/String;)Lax/G4/t0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lax/G4/u0;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lax/G4/u0;-><init>(Lax/G4/f;Lax/G4/t0$a;)V

    .line 8
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

.method w(Lax/G4/x0;)Lax/G4/A0;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v4, 0x0

    .line 12
    sget-object v5, Lax/G4/x0$a;->b:Lax/G4/x0$a;

    .line 13
    .line 14
    const-string v2, "2/files/upload_session/append_v2"

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lax/x4/d;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;)Lax/s4/a$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lax/G4/A0;

    .line 22
    .line 23
    iget-object v1, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/x4/d;->i()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, p1, v1}, Lax/G4/A0;-><init>(Lax/s4/a$c;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
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

.method public x(Lax/G4/B0;)Lax/G4/A0;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/x0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/G4/x0;-><init>(Lax/G4/B0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->w(Lax/G4/x0;)Lax/G4/A0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method public y(Lax/G4/B0;Lax/G4/a;)Lax/G4/F0;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/C0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/G4/C0;-><init>(Lax/G4/B0;Lax/G4/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/G4/f;->z(Lax/G4/C0;)Lax/G4/F0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method z(Lax/G4/C0;)Lax/G4/F0;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v4, 0x0

    .line 12
    sget-object v5, Lax/G4/C0$a;->b:Lax/G4/C0$a;

    .line 13
    .line 14
    const-string v2, "2/files/upload_session/finish"

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lax/x4/d;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;)Lax/s4/a$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lax/G4/F0;

    .line 22
    .line 23
    iget-object v1, p0, Lax/G4/f;->a:Lax/x4/d;

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/x4/d;->i()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, p1, v1}, Lax/G4/F0;-><init>(Lax/s4/a$c;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
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
