.class final Lax/f1/n;
.super Lax/V0/i;
.source "SourceFile"


# instance fields
.field private k0:J

.field private l0:I

.field private m0:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/V0/i;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    iput v0, p0, Lax/f1/n;->m0:I

    .line 8
    .line 9
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
.end method

.method private I(Lax/V0/i;)Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/f1/n;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget v0, p0, Lax/f1/n;->l0:I

    .line 10
    .line 11
    iget v2, p0, Lax/f1/n;->m0:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-lt v0, v2, :cond_10

    .line 15
    .line 16
    return v3

    .line 17
    :cond_10
    iget-object p1, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz p1, :cond_27

    .line 20
    .line 21
    iget-object v0, p0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    if-eqz v0, :cond_27

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    add-int/2addr v0, p1

    .line 34
    const p1, 0x2ee000

    .line 35
    .line 36
    .line 37
    if-le v0, p1, :cond_27

    .line 38
    .line 39
    return v3

    .line 40
    :cond_27
    return v1
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


# virtual methods
.method public H(Lax/V0/i;)Z
    .registers 6

    .line 1
    invoke-virtual {p1}, Lax/V0/i;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lax/V0/a;->r()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/2addr v0, v1

    .line 15
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lax/V0/a;->s()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    xor-int/2addr v0, v1

    .line 23
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1}, Lax/f1/n;->I(Lax/V0/i;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_21

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :cond_21
    iget v0, p0, Lax/f1/n;->l0:I

    .line 35
    .line 36
    add-int/lit8 v2, v0, 0x1

    .line 37
    .line 38
    iput v2, p0, Lax/f1/n;->l0:I

    .line 39
    .line 40
    if-nez v0, :cond_36

    .line 41
    .line 42
    iget-wide v2, p1, Lax/V0/i;->g0:J

    .line 43
    .line 44
    iput-wide v2, p0, Lax/V0/i;->g0:J

    .line 45
    .line 46
    invoke-virtual {p1}, Lax/V0/a;->u()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_36

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lax/V0/a;->A(I)V

    .line 53
    .line 54
    .line 55
    :cond_36
    iget-object v0, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    if-eqz v0, :cond_46

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p0, v2}, Lax/V0/i;->C(I)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    :cond_46
    iget-wide v2, p1, Lax/V0/i;->g0:J

    .line 72
    .line 73
    iput-wide v2, p0, Lax/f1/n;->k0:J

    .line 74
    .line 75
    return v1
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

.method public J()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/V0/i;->g0:J

    .line 2
    .line 3
    return-wide v0
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

.method public K()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/f1/n;->k0:J

    .line 2
    .line 3
    return-wide v0
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

.method public L()I
    .registers 2

    .line 1
    iget v0, p0, Lax/f1/n;->l0:I

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

.method public M()Z
    .registers 2

    .line 1
    iget v0, p0, Lax/f1/n;->l0:I

    .line 2
    .line 3
    if-lez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public N(I)V
    .registers 3

    .line 1
    if-lez p1, :cond_4

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
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lax/f1/n;->m0:I

    .line 10
    .line 11
    return-void
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

.method public p()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/V0/i;->p()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/f1/n;->l0:I

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
