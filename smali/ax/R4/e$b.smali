.class Lax/R4/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P0/H$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/R4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/R4/e;


# direct methods
.method constructor <init>(Lax/R4/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method private G(Ljava/lang/String;)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_63

    .line 4
    .line 5
    iget-object v2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 6
    .line 7
    invoke-static {v2}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_81

    .line 12
    .line 13
    iget-object v2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 14
    .line 15
    invoke-static {v2}, Lax/R4/e;->B(Lax/R4/e;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_47

    .line 20
    .line 21
    invoke-static {p1}, Lax/P2/b;->d(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_47

    .line 26
    .line 27
    iget-object v2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 28
    .line 29
    invoke-static {v2}, Lax/R4/e;->o(Lax/R4/e;)Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lax/P2/a;->n(Landroid/content/Context;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lax/P2/b;->g()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_47

    .line 41
    .line 42
    invoke-static {p1}, Lax/P2/b;->c(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_47

    .line 47
    .line 48
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 49
    .line 50
    invoke-static {p1, v1}, Lax/R4/e;->C(Lax/R4/e;Z)Z

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 54
    .line 55
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lax/R4/d;->z()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 63
    .line 64
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lax/R4/d;->o()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_47
    iget-object v2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 73
    .line 74
    invoke-static {v2}, Lax/R4/e;->o(Lax/R4/e;)Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget v3, Lax/P4/i;->c:I

    .line 79
    .line 80
    new-array v4, v1, [Ljava/lang/Object;

    .line 81
    .line 82
    aput-object p1, v4, v0

    .line 83
    .line 84
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 89
    .line 90
    invoke-static {v2}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/16 v3, 0xfa5

    .line 95
    .line 96
    invoke-interface {v2, v0, v1, v3, p1}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_63
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 101
    .line 102
    invoke-static {p1}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eqz p1, :cond_81

    .line 107
    .line 108
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 109
    .line 110
    invoke-static {p1}, Lax/R4/e;->o(Lax/R4/e;)Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    sget v2, Lax/P4/i;->b:I

    .line 115
    .line 116
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object v2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 121
    .line 122
    invoke-static {v2}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const/4 v3, 0x0

    .line 127
    invoke-interface {v2, p1, v1, v0, v3}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_81
    return-void
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
.method public synthetic D(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->r(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic E(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->k(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic F(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->v(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic H(Lax/P0/V;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->E(Lax/P0/H$d;Lax/P0/V;)V

    return-void
.end method

.method public synthetic I(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->i(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic J(Lax/P0/F;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->t(Lax/P0/H$d;Lax/P0/F;)V

    return-void
.end method

.method public synthetic L(F)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->G(Lax/P0/H$d;F)V

    return-void
.end method

.method public N(Lax/P0/F;)V
    .registers 7

    .line 1
    invoke-static {}, Lax/R4/e;->m()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "Media player error: what="

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v2, p1, Lax/P0/F;->q:I

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lax/P0/F;->a()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x1

    .line 37
    new-array v3, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v1, v3, v4

    .line 41
    .line 42
    invoke-static {v0, v3}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget v0, p1, Lax/P0/F;->q:I

    .line 46
    .line 47
    const/16 v1, 0x3ec

    .line 48
    .line 49
    if-ne v0, v1, :cond_56

    .line 50
    .line 51
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 52
    .line 53
    invoke-static {v0}, Lax/R4/e;->w(Lax/R4/e;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3b

    .line 58
    .line 59
    goto :goto_7c

    .line 60
    :cond_3b
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 61
    .line 62
    invoke-static {v0}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lax/R4/d;->a()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "audio/flac"

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_56

    .line 77
    .line 78
    iget-object v1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 79
    .line 80
    invoke-static {v1, v0}, Lax/R4/e;->y(Lax/R4/e;Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_56

    .line 85
    .line 86
    goto :goto_7c

    .line 87
    :cond_56
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 88
    .line 89
    invoke-static {v0}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_7c

    .line 94
    .line 95
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 96
    .line 97
    invoke-static {v0}, Lax/R4/e;->o(Lax/R4/e;)Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget v1, Lax/P4/i;->a:I

    .line 102
    .line 103
    invoke-virtual {p1}, Lax/P0/F;->a()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-array v2, v2, [Ljava/lang/Object;

    .line 108
    .line 109
    aput-object p1, v2, v4

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 116
    .line 117
    invoke-static {v0}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const/4 v1, 0x0

    .line 122
    invoke-interface {v0, p1, v4, v4, v1}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_7c
    :goto_7c
    return-void
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

.method public O(I)V
    .registers 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x3

    .line 4
    if-ne p1, v2, :cond_e6

    .line 5
    .line 6
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 7
    .line 8
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lax/R4/d;->g()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1f

    .line 17
    .line 18
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 19
    .line 20
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lax/R4/d;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Lax/R4/e$b;->G(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 33
    .line 34
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lax/R4/d;->l()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_35

    .line 43
    .line 44
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 45
    .line 46
    invoke-static {p1}, Lax/R4/e;->D(Lax/R4/e;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_35

    .line 51
    .line 52
    goto/16 :goto_10c

    .line 53
    .line 54
    :cond_35
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 55
    .line 56
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lax/R4/d;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v3, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 65
    .line 66
    invoke-static {v3}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Lax/R4/d;->e()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    iget-object v5, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 75
    .line 76
    invoke-static {v5}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_6f

    .line 81
    .line 82
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_6f

    .line 87
    .line 88
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    cmp-long v7, v3, v5

    .line 94
    .line 95
    if-eqz v7, :cond_6f

    .line 96
    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    cmp-long v7, v3, v5

    .line 100
    .line 101
    if-lez v7, :cond_6f

    .line 102
    .line 103
    iget-object v5, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 104
    .line 105
    invoke-static {v5}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-interface {v5, p1, v3, v4}, Lax/R4/f$a;->a(Ljava/lang/String;J)V

    .line 110
    .line 111
    .line 112
    :cond_6f
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 113
    .line 114
    invoke-static {p1, v0}, Lax/R4/e;->E(Lax/R4/e;Z)Z

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 118
    .line 119
    invoke-static {p1}, Lax/R4/e;->p(Lax/R4/e;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_e0

    .line 124
    .line 125
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 126
    .line 127
    invoke-static {p1, v1}, Lax/R4/e;->q(Lax/R4/e;Z)Z

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lax/R4/e;->m()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object v3, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 135
    .line 136
    invoke-static {v3}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, Lax/R4/d;->d()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    const/4 v4, 0x2

    .line 149
    new-array v4, v4, [Ljava/lang/Object;

    .line 150
    .line 151
    const-string v5, "onSeekComplete from MediaPlayer:"

    .line 152
    .line 153
    aput-object v5, v4, v1

    .line 154
    .line 155
    aput-object v3, v4, v0

    .line 156
    .line 157
    invoke-static {p1, v4}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 161
    .line 162
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Lax/R4/d;->d()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {p1, v0}, Lax/R4/e;->r(Lax/R4/e;I)I

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 174
    .line 175
    invoke-static {p1}, Lax/R4/e;->s(Lax/R4/e;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    const/4 v0, 0x6

    .line 180
    if-ne p1, v0, :cond_c8

    .line 181
    .line 182
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 183
    .line 184
    invoke-static {p1}, Lax/R4/e;->x(Lax/R4/e;)Lax/R4/d;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Lax/R4/d;->n()V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 192
    .line 193
    invoke-static {p1, v2}, Lax/R4/e;->t(Lax/R4/e;I)I

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 197
    .line 198
    invoke-static {p1}, Lax/R4/e;->u(Lax/R4/e;)V

    .line 199
    .line 200
    .line 201
    :cond_c8
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 202
    .line 203
    invoke-static {p1}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-eqz p1, :cond_10c

    .line 208
    .line 209
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 210
    .line 211
    invoke-static {p1}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 216
    .line 217
    invoke-static {v0}, Lax/R4/e;->s(Lax/R4/e;)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-interface {p1, v0}, Lax/R4/f$a;->d(I)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_e0
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 226
    .line 227
    invoke-static {p1}, Lax/R4/e;->v(Lax/R4/e;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_e6
    const/4 v2, 0x4

    .line 232
    if-ne p1, v2, :cond_10c

    .line 233
    .line 234
    invoke-static {}, Lax/R4/e;->m()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    new-array v0, v0, [Ljava/lang/Object;

    .line 239
    .line 240
    const-string v2, "onCompletion from ExoPlayer"

    .line 241
    .line 242
    aput-object v2, v0, v1

    .line 243
    .line 244
    invoke-static {p1, v0}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 248
    .line 249
    invoke-virtual {p1, v1}, Lax/R4/e;->e(I)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 253
    .line 254
    invoke-static {p1}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    if-eqz p1, :cond_10c

    .line 259
    .line 260
    iget-object p1, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 261
    .line 262
    invoke-static {p1}, Lax/R4/e;->z(Lax/R4/e;)Lax/R4/f$a;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-interface {p1}, Lax/R4/f$a;->c()V

    .line 267
    .line 268
    .line 269
    :cond_10c
    :goto_10c
    return-void
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
.end method

.method public synthetic P(Lax/P0/N;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->C(Lax/P0/H$d;Lax/P0/N;I)V

    return-void
.end method

.method public synthetic S(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->z(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic U(Lax/P0/T;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->D(Lax/P0/H$d;Lax/P0/T;)V

    return-void
.end method

.method public synthetic W(Lax/P0/H$b;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->c(Lax/P0/H$d;Lax/P0/H$b;)V

    return-void
.end method

.method public synthetic Y(IZ)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->g(Lax/P0/H$d;IZ)V

    return-void
.end method

.method public synthetic Z(ZI)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->u(Lax/P0/H$d;ZI)V

    return-void
.end method

.method public synthetic a(Lax/P0/a0;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->F(Lax/P0/H$d;Lax/P0/a0;)V

    return-void
.end method

.method public synthetic a0(Lax/P0/y;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->l(Lax/P0/H$d;Lax/P0/y;I)V

    return-void
.end method

.method public synthetic b0()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/P0/I;->x(Lax/P0/H$d;)V

    return-void
.end method

.method public c(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/R4/e;->A(Lax/R4/e;I)V

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

.method public synthetic c0(Lax/P0/H;Lax/P0/H$c;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->h(Lax/P0/H$d;Lax/P0/H;Lax/P0/H$c;)V

    return-void
.end method

.method public synthetic e(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->A(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic i0(ZI)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->o(Lax/P0/H$d;ZI)V

    return-void
.end method

.method public synthetic j(Lax/P0/G;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->p(Lax/P0/H$d;Lax/P0/G;)V

    return-void
.end method

.method public synthetic j0(Lax/P0/A;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->m(Lax/P0/H$d;Lax/P0/A;)V

    return-void
.end method

.method public synthetic k0(Lax/P0/n;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->f(Lax/P0/H$d;Lax/P0/n;)V

    return-void
.end method

.method public synthetic o0(II)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->B(Lax/P0/H$d;II)V

    return-void
.end method

.method public p0(Lax/P0/H$e;Lax/P0/H$e;I)V
    .registers 4

    .line 1
    const/4 p1, 0x1

    .line 2
    if-ne p3, p1, :cond_8

    .line 3
    .line 4
    iget-object p2, p0, Lax/R4/e$b;->a:Lax/R4/e;

    .line 5
    .line 6
    invoke-static {p2, p1}, Lax/R4/e;->q(Lax/R4/e;Z)Z

    .line 7
    .line 8
    .line 9
    :cond_8
    return-void
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

.method public synthetic r(Lax/P0/C;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->n(Lax/P0/H$d;Lax/P0/C;)V

    return-void
.end method

.method public synthetic r0(Lax/P0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->a(Lax/P0/H$d;Lax/P0/c;)V

    return-void
.end method

.method public synthetic s(Lax/R0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->d(Lax/P0/H$d;Lax/R0/c;)V

    return-void
.end method

.method public synthetic t(Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->e(Lax/P0/H$d;Ljava/util/List;)V

    return-void
.end method

.method public synthetic t0(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->j(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic v(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->y(Lax/P0/H$d;I)V

    return-void
.end method
