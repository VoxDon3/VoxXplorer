.class public final Lax/N1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/t;


# instance fields
.field private final c0:Lax/N1/t$a;

.field private final d0:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lax/N1/w;",
            ">;"
        }
    .end annotation
.end field

.field private e0:Z

.field private final q:Lax/q1/t;


# direct methods
.method public constructor <init>(Lax/q1/t;Lax/N1/t$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/N1/u;->q:Lax/q1/t;

    .line 5
    .line 6
    iput-object p2, p0, Lax/N1/u;->c0:Lax/N1/t$a;

    .line 7
    .line 8
    new-instance p1, Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/N1/u;->d0:Landroid/util/SparseArray;

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public h(Lax/q1/N;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/N1/u;->q:Lax/q1/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/q1/t;->h(Lax/q1/N;)V

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

.method public o()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/N1/u;->q:Lax/q1/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/q1/t;->o()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/N1/u;->e0:Z

    .line 7
    .line 8
    if-eqz v0, :cond_21

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_a
    iget-object v1, p0, Lax/N1/u;->d0:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge v0, v1, :cond_21

    .line 18
    .line 19
    iget-object v1, p0, Lax/N1/u;->d0:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lax/N1/w;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {v1, v2}, Lax/N1/w;->k(Z)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_a

    .line 34
    :cond_21
    return-void
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

.method public u(II)Lax/q1/U;
    .registers 5

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p2, v0, :cond_d

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/N1/u;->e0:Z

    .line 6
    .line 7
    iget-object v0, p0, Lax/N1/u;->q:Lax/q1/t;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    iget-object v0, p0, Lax/N1/u;->d0:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lax/N1/w;

    .line 21
    .line 22
    if-eqz v0, :cond_18

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_18
    new-instance v0, Lax/N1/w;

    .line 26
    .line 27
    iget-object v1, p0, Lax/N1/u;->q:Lax/q1/t;

    .line 28
    .line 29
    invoke-interface {v1, p1, p2}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object v1, p0, Lax/N1/u;->c0:Lax/N1/t$a;

    .line 34
    .line 35
    invoke-direct {v0, p2, v1}, Lax/N1/w;-><init>(Lax/q1/U;Lax/N1/t$a;)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p0, Lax/N1/u;->d0:Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v0
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
.end method
