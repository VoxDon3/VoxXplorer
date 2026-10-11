.class Lax/X1/K$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/X1/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Lax/S0/F;

.field final synthetic b:Lax/X1/K;


# direct methods
.method public constructor <init>(Lax/X1/K;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lax/S0/F;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    invoke-direct {p1, v0}, Lax/S0/F;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lax/X1/K$a;->a:Lax/S0/F;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a(Lax/S0/M;Lax/q1/t;Lax/X1/L$d;)V
    .registers 4

    .line 1
    return-void
    .line 2
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

.method public c(Lax/S0/G;)V
    .registers 11

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    goto/16 :goto_7d

    .line 8
    .line 9
    :cond_8
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_7d

    .line 18
    :cond_11
    const/4 v0, 0x6

    .line 19
    invoke-virtual {p1, v0}, Lax/S0/G;->c0(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x4

    .line 27
    div-int/2addr v0, v1

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_1d
    if-ge v3, v0, :cond_6b

    .line 31
    .line 32
    iget-object v4, p0, Lax/X1/K$a;->a:Lax/S0/F;

    .line 33
    .line 34
    invoke-virtual {p1, v4, v1}, Lax/S0/G;->p(Lax/S0/F;I)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lax/X1/K$a;->a:Lax/S0/F;

    .line 38
    .line 39
    const/16 v5, 0x10

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Lax/S0/F;->h(I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    iget-object v5, p0, Lax/X1/K$a;->a:Lax/S0/F;

    .line 46
    .line 47
    const/4 v6, 0x3

    .line 48
    invoke-virtual {v5, v6}, Lax/S0/F;->r(I)V

    .line 49
    .line 50
    .line 51
    const/16 v5, 0xd

    .line 52
    .line 53
    if-nez v4, :cond_3c

    .line 54
    .line 55
    iget-object v4, p0, Lax/X1/K$a;->a:Lax/S0/F;

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Lax/S0/F;->r(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_68

    .line 61
    :cond_3c
    iget-object v4, p0, Lax/X1/K$a;->a:Lax/S0/F;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Lax/S0/F;->h(I)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget-object v5, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 68
    .line 69
    invoke-static {v5}, Lax/X1/K;->h(Lax/X1/K;)Landroid/util/SparseArray;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    if-nez v5, :cond_68

    .line 78
    .line 79
    iget-object v5, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 80
    .line 81
    invoke-static {v5}, Lax/X1/K;->h(Lax/X1/K;)Landroid/util/SparseArray;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    new-instance v6, Lax/X1/E;

    .line 86
    .line 87
    new-instance v7, Lax/X1/K$b;

    .line 88
    .line 89
    iget-object v8, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 90
    .line 91
    invoke-direct {v7, v8, v4}, Lax/X1/K$b;-><init>(Lax/X1/K;I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v6, v7}, Lax/X1/E;-><init>(Lax/X1/D;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v4, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 101
    .line 102
    invoke-static {v4}, Lax/X1/K;->n(Lax/X1/K;)I

    .line 103
    .line 104
    .line 105
    :cond_68
    :goto_68
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_1d

    .line 108
    :cond_6b
    iget-object p1, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 109
    .line 110
    invoke-static {p1}, Lax/X1/K;->o(Lax/X1/K;)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    const/4 v0, 0x2

    .line 115
    if-eq p1, v0, :cond_7d

    .line 116
    .line 117
    iget-object p1, p0, Lax/X1/K$a;->b:Lax/X1/K;

    .line 118
    .line 119
    invoke-static {p1}, Lax/X1/K;->h(Lax/X1/K;)Landroid/util/SparseArray;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 124
    .line 125
    .line 126
    :cond_7d
    :goto_7d
    return-void
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
