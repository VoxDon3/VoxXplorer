.class public final Lax/q1/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/S0/G;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/S0/G;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lax/S0/G;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/q1/H;->a:Lax/S0/G;

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
.end method


# virtual methods
.method public a(Lax/q1/s;Lax/E1/h$a;)Lax/P0/C;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_3
    :try_start_3
    iget-object v3, p0, Lax/q1/H;->a:Lax/S0/G;

    .line 5
    .line 6
    invoke-virtual {v3}, Lax/S0/G;->f()[B

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/16 v4, 0xa

    .line 11
    .line 12
    invoke-interface {p1, v3, v0, v4}, Lax/q1/s;->p([BII)V
    :try_end_e
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_e} :catch_4c

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, Lax/q1/H;->a:Lax/S0/G;

    .line 16
    .line 17
    invoke-virtual {v3, v0}, Lax/S0/G;->b0(I)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lax/q1/H;->a:Lax/S0/G;

    .line 21
    .line 22
    invoke-virtual {v3}, Lax/S0/G;->P()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const v5, 0x494433

    .line 27
    .line 28
    .line 29
    if-eq v3, v5, :cond_1f

    .line 30
    .line 31
    goto :goto_4c

    .line 32
    :cond_1f
    iget-object v3, p0, Lax/q1/H;->a:Lax/S0/G;

    .line 33
    .line 34
    const/4 v5, 0x3

    .line 35
    invoke-virtual {v3, v5}, Lax/S0/G;->c0(I)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lax/q1/H;->a:Lax/S0/G;

    .line 39
    .line 40
    invoke-virtual {v3}, Lax/S0/G;->L()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    add-int/lit8 v5, v3, 0xa

    .line 45
    .line 46
    if-nez v1, :cond_47

    .line 47
    .line 48
    new-array v1, v5, [B

    .line 49
    .line 50
    iget-object v6, p0, Lax/q1/H;->a:Lax/S0/G;

    .line 51
    .line 52
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-static {v6, v0, v1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v1, v4, v3}, Lax/q1/s;->p([BII)V

    .line 60
    .line 61
    .line 62
    new-instance v3, Lax/E1/h;

    .line 63
    .line 64
    invoke-direct {v3, p2}, Lax/E1/h;-><init>(Lax/E1/h$a;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v1, v5}, Lax/E1/h;->e([BI)Lax/P0/C;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_4a

    .line 72
    :cond_47
    invoke-interface {p1, v3}, Lax/q1/s;->j(I)V

    .line 73
    .line 74
    .line 75
    :goto_4a
    add-int/2addr v2, v5

    .line 76
    goto :goto_3

    .line 77
    :catch_4c
    :goto_4c
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v2}, Lax/q1/s;->j(I)V

    .line 81
    .line 82
    .line 83
    return-object v1
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
