.class public Lax/W2/c;
.super Lax/W2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/W2/c$a;
    }
.end annotation


# static fields
.field private static m:Lax/W2/c;


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/voxdon/xplorer/file/n;

.field private f:Lcom/voxdon/xplorer/file/o;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/W2/g;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lax/W2/c$a;

.field private i:Z

.field private j:Lcom/voxdon/xplorer/file/n;

.field private k:Lcom/voxdon/xplorer/file/o;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/h;-><init>()V

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

.method public static q()Lax/W2/c;
    .registers 1

    .line 1
    sget-object v0, Lax/W2/c;->m:Lax/W2/c;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/W2/c;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/W2/c;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/W2/c;->m:Lax/W2/c;

    .line 11
    .line 12
    :cond_b
    sget-object v0, Lax/W2/c;->m:Lax/W2/c;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method protected b()Lax/W2/j;
    .registers 14

    .line 1
    iget-object v0, p0, Lax/W2/c;->h:Lax/W2/c$a;

    .line 2
    .line 3
    sget-object v1, Lax/W2/c$a;->d0:Lax/W2/c$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_16

    .line 6
    .line 7
    new-instance v0, Lax/W2/f;

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/W2/h;->f()Lax/W2/h$a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/W2/c;->g:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p0, Lax/W2/c;->k:Lcom/voxdon/xplorer/file/o;

    .line 16
    .line 17
    iget-object v4, p0, Lax/W2/c;->j:Lcom/voxdon/xplorer/file/n;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3, v4}, Lax/W2/f;-><init>(Lax/W2/h$a;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2e

    .line 23
    :cond_16
    new-instance v5, Lax/W2/e;

    .line 24
    .line 25
    invoke-virtual {p0}, Lax/W2/h;->f()Lax/W2/h$a;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    iget-object v7, p0, Lax/W2/c;->d:Ljava/util/List;

    .line 30
    .line 31
    iget-object v8, p0, Lax/W2/c;->f:Lcom/voxdon/xplorer/file/o;

    .line 32
    .line 33
    iget-object v9, p0, Lax/W2/c;->e:Lcom/voxdon/xplorer/file/n;

    .line 34
    .line 35
    iget-object v10, p0, Lax/W2/c;->k:Lcom/voxdon/xplorer/file/o;

    .line 36
    .line 37
    iget-object v11, p0, Lax/W2/c;->j:Lcom/voxdon/xplorer/file/n;

    .line 38
    .line 39
    invoke-virtual {p0}, Lax/W2/c;->t()Z

    .line 40
    .line 41
    .line 42
    move-result v12

    .line 43
    invoke-direct/range {v5 .. v12}, Lax/W2/e;-><init>(Lax/W2/h$a;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Z)V

    .line 44
    .line 45
    .line 46
    move-object v0, v5

    .line 47
    :goto_2e
    const/4 v1, 0x1

    .line 48
    iput-boolean v1, p0, Lax/W2/c;->l:Z

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/W2/c;->l()V

    .line 51
    .line 52
    .line 53
    return-object v0
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

.method protected c()Z
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

.method public k(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/c;->e:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-eqz v0, :cond_26

    .line 4
    .line 5
    if-eqz p1, :cond_26

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/W2/c;->t()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_26

    .line 12
    .line 13
    iget-object v0, p0, Lax/W2/c;->e:Lcom/voxdon/xplorer/file/n;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lax/c3/B;->O(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_26

    .line 20
    .line 21
    iget-object v0, p0, Lax/W2/c;->e:Lcom/voxdon/xplorer/file/n;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v0, p1}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_26

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_26
    const/4 p1, 0x1

    .line 40
    return p1
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

.method public l()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/W2/c;->g:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1c

    .line 4
    .line 5
    iget-boolean v1, p0, Lax/W2/c;->l:Z

    .line 6
    .line 7
    if-nez v1, :cond_1c

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1c

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lax/W2/g;

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/W2/g;->f()V

    .line 26
    .line 27
    .line 28
    goto :goto_c

    .line 29
    :cond_1c
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lax/W2/c;->l:Z

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iput-object v1, p0, Lax/W2/c;->g:Ljava/util/List;

    .line 34
    .line 35
    iput-object v1, p0, Lax/W2/c;->d:Ljava/util/List;

    .line 36
    .line 37
    iput-object v1, p0, Lax/W2/c;->e:Lcom/voxdon/xplorer/file/n;

    .line 38
    .line 39
    iput-object v1, p0, Lax/W2/c;->j:Lcom/voxdon/xplorer/file/n;

    .line 40
    .line 41
    iput-boolean v0, p0, Lax/W2/c;->i:Z

    .line 42
    .line 43
    iget-object v2, p0, Lax/W2/c;->f:Lcom/voxdon/xplorer/file/o;

    .line 44
    .line 45
    if-eqz v2, :cond_33

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lax/W2/c;->f:Lcom/voxdon/xplorer/file/o;

    .line 51
    .line 52
    :cond_33
    iget-object v2, p0, Lax/W2/c;->k:Lcom/voxdon/xplorer/file/o;

    .line 53
    .line 54
    if-eqz v2, :cond_3c

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lax/W2/c;->k:Lcom/voxdon/xplorer/file/o;

    .line 60
    .line 61
    :cond_3c
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public m(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/W2/c;->l()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/W2/c;->f:Lcom/voxdon/xplorer/file/o;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lax/W2/c;->e:Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    iput-object p3, p0, Lax/W2/c;->d:Ljava/util/List;

    .line 12
    .line 13
    if-eqz p4, :cond_13

    .line 14
    .line 15
    sget-object p1, Lax/W2/c$a;->c0:Lax/W2/c$a;

    .line 16
    .line 17
    iput-object p1, p0, Lax/W2/c;->h:Lax/W2/c$a;

    .line 18
    .line 19
    goto :goto_17

    .line 20
    :cond_13
    sget-object p1, Lax/W2/c$a;->q:Lax/W2/c$a;

    .line 21
    .line 22
    iput-object p1, p0, Lax/W2/c;->h:Lax/W2/c$a;

    .line 23
    .line 24
    :goto_17
    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, Lax/W2/c;->l:Z

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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public n(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/W2/g;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/W2/c;->l()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/W2/c;->g:Ljava/util/List;

    .line 5
    .line 6
    sget-object p1, Lax/W2/c$a;->d0:Lax/W2/c$a;

    .line 7
    .line 8
    iput-object p1, p0, Lax/W2/c;->h:Lax/W2/c$a;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lax/W2/c;->l:Z

    .line 12
    .line 13
    return-void
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

.method public o(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/W2/h$a;)V
    .registers 5

    .line 1
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lax/W2/c;->k:Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lax/W2/c;->j:Lcom/voxdon/xplorer/file/n;

    .line 14
    .line 15
    invoke-virtual {p0, p3}, Lax/W2/h;->i(Lax/W2/h$a;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lax/W2/c;->i:Z

    .line 20
    .line 21
    sget-object p1, Lax/W2/h$c;->c0:Lax/W2/h$c;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lax/W2/h;->j(Lax/W2/h$c;)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public p()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/W2/c;->d:Ljava/util/List;

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

.method public r(Lax/c3/z;)Z
    .registers 7

    .line 1
    invoke-virtual {p0}, Lax/W2/c;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_2d

    .line 8
    .line 9
    iget-object v0, p0, Lax/W2/c;->g:Ljava/util/List;

    .line 10
    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    return v2

    .line 14
    :cond_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2c

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lax/W2/g;

    .line 29
    .line 30
    invoke-virtual {v3}, Lax/W2/g;->h()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Lax/c3/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3, p1}, Lax/c3/A;->y(Ljava/lang/String;Lax/c3/z;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_11

    .line 43
    .line 44
    return v2

    .line 45
    :cond_2c
    return v1

    .line 46
    :cond_2d
    iget-object v0, p0, Lax/W2/c;->d:Ljava/util/List;

    .line 47
    .line 48
    if-nez v0, :cond_32

    .line 49
    .line 50
    return v2

    .line 51
    :cond_32
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_53

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 66
    .line 67
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_52

    .line 72
    .line 73
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v3, p1}, Lax/c3/A;->y(Ljava/lang/String;Lax/c3/z;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_36

    .line 82
    .line 83
    :cond_52
    return v2

    .line 84
    :cond_53
    return v1
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

.method public s()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/c;->g:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v0, p0, Lax/W2/c;->d:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public t()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/c;->h:Lax/W2/c$a;

    .line 2
    .line 3
    sget-object v1, Lax/W2/c$a;->c0:Lax/W2/c$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public u()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/c;->h:Lax/W2/c$a;

    .line 2
    .line 3
    sget-object v1, Lax/W2/c$a;->d0:Lax/W2/c$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public v()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/W2/c;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/W2/c;->i:Z

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
