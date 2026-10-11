.class public final Lax/T0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/T0/k$b;,
        Lax/T0/k$a;
    }
.end annotation


# instance fields
.field private final a:Lax/T0/k$b;

.field private final b:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/S0/G;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/T0/k$a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Lax/T0/k$a;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Lax/T0/k$a;


# direct methods
.method public constructor <init>(Lax/T0/k$b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/T0/k;->a:Lax/T0/k$b;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lax/T0/k;->b:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lax/T0/k;->c:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    new-instance p1, Ljava/util/PriorityQueue;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 26
    .line 27
    const/4 p1, -0x1

    .line 28
    iput p1, p0, Lax/T0/k;->e:I

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

.method private c(Lax/S0/G;)Lax/S0/G;
    .registers 7

    .line 1
    iget-object v0, p0, Lax/T0/k;->b:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    new-instance v0, Lax/S0/G;

    .line 10
    .line 11
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 12
    .line 13
    .line 14
    goto :goto_16

    .line 15
    :cond_e
    iget-object v0, p0, Lax/T0/k;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/S0/G;

    .line 22
    .line 23
    :goto_16
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Lax/S0/G;->X(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static {v1, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    return-object v0
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

.method private e(I)V
    .registers 8

    .line 1
    :goto_0
    iget-object v0, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-le v0, p1, :cond_58

    .line 8
    .line 9
    iget-object v0, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/T0/k$a;

    .line 16
    .line 17
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/T0/k$a;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_17
    iget-object v2, v0, Lax/T0/k$a;->q:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ge v1, v2, :cond_3e

    .line 31
    .line 32
    iget-object v2, p0, Lax/T0/k;->a:Lax/T0/k$b;

    .line 33
    .line 34
    iget-wide v3, v0, Lax/T0/k$a;->c0:J

    .line 35
    .line 36
    iget-object v5, v0, Lax/T0/k$a;->q:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lax/S0/G;

    .line 43
    .line 44
    invoke-interface {v2, v3, v4, v5}, Lax/T0/k$b;->a(JLax/S0/G;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lax/T0/k;->b:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    iget-object v3, v0, Lax/T0/k$a;->q:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lax/S0/G;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_17

    .line 63
    :cond_3e
    iget-object v1, v0, Lax/T0/k$a;->q:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lax/T0/k;->f:Lax/T0/k$a;

    .line 69
    .line 70
    if-eqz v1, :cond_52

    .line 71
    .line 72
    iget-wide v1, v1, Lax/T0/k$a;->c0:J

    .line 73
    .line 74
    iget-wide v3, v0, Lax/T0/k$a;->c0:J

    .line 75
    .line 76
    cmp-long v5, v1, v3

    .line 77
    .line 78
    if-nez v5, :cond_52

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    iput-object v1, p0, Lax/T0/k;->f:Lax/T0/k$a;

    .line 82
    .line 83
    :cond_52
    iget-object v1, p0, Lax/T0/k;->c:Ljava/util/ArrayDeque;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_58
    return-void
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


# virtual methods
.method public a(JLax/S0/G;)V
    .registers 9

    .line 1
    iget v0, p0, Lax/T0/k;->e:I

    .line 2
    .line 3
    if-eqz v0, :cond_62

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_26

    .line 7
    .line 8
    iget-object v0, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v2, p0, Lax/T0/k;->e:I

    .line 15
    .line 16
    if-lt v0, v2, :cond_26

    .line 17
    .line 18
    iget-object v0, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lax/T0/k$a;

    .line 25
    .line 26
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lax/T0/k$a;

    .line 31
    .line 32
    iget-wide v2, v0, Lax/T0/k$a;->c0:J

    .line 33
    .line 34
    cmp-long v0, p1, v2

    .line 35
    .line 36
    if-gez v0, :cond_26

    .line 37
    .line 38
    goto :goto_62

    .line 39
    :cond_26
    invoke-direct {p0, p3}, Lax/T0/k;->c(Lax/S0/G;)Lax/S0/G;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iget-object v0, p0, Lax/T0/k;->f:Lax/T0/k$a;

    .line 44
    .line 45
    if-eqz v0, :cond_3a

    .line 46
    .line 47
    iget-wide v2, v0, Lax/T0/k$a;->c0:J

    .line 48
    .line 49
    cmp-long v4, p1, v2

    .line 50
    .line 51
    if-nez v4, :cond_3a

    .line 52
    .line 53
    iget-object p1, v0, Lax/T0/k$a;->q:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object v0, p0, Lax/T0/k;->c:Ljava/util/ArrayDeque;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_48

    .line 66
    .line 67
    new-instance v0, Lax/T0/k$a;

    .line 68
    .line 69
    invoke-direct {v0}, Lax/T0/k$a;-><init>()V

    .line 70
    .line 71
    .line 72
    goto :goto_50

    .line 73
    :cond_48
    iget-object v0, p0, Lax/T0/k;->c:Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lax/T0/k$a;

    .line 80
    .line 81
    :goto_50
    invoke-virtual {v0, p1, p2, p3}, Lax/T0/k$a;->h(JLax/S0/G;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lax/T0/k;->f:Lax/T0/k$a;

    .line 90
    .line 91
    iget p1, p0, Lax/T0/k;->e:I

    .line 92
    .line 93
    if-eq p1, v1, :cond_61

    .line 94
    .line 95
    invoke-direct {p0, p1}, Lax/T0/k;->e(I)V

    .line 96
    .line 97
    .line 98
    :cond_61
    return-void

    .line 99
    :cond_62
    :goto_62
    iget-object v0, p0, Lax/T0/k;->a:Lax/T0/k$b;

    .line 100
    .line 101
    invoke-interface {v0, p1, p2, p3}, Lax/T0/k$b;->a(JLax/S0/G;)V

    .line 102
    .line 103
    .line 104
    return-void
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

.method public b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T0/k;->d:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

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

.method public d()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/T0/k;->e(I)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public f()I
    .registers 2

    .line 1
    iget v0, p0, Lax/T0/k;->e:I

    .line 2
    .line 3
    return v0
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

.method public g(I)V
    .registers 3

    .line 1
    if-ltz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lax/T0/k;->e:I

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lax/T0/k;->e(I)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
