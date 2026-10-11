.class public final Lax/p1/b;
.super Landroidx/media3/exoplayer/h;
.source "SourceFile"


# instance fields
.field private final t0:Lax/V0/i;

.field private final u0:Lax/S0/G;

.field private v0:Lax/p1/a;

.field private w0:J


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lax/V0/i;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lax/V0/i;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 12
    .line 13
    new-instance v0, Lax/S0/G;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lax/p1/b;->u0:Lax/S0/G;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method private i0(Ljava/nio/ByteBuffer;)[F
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    if-eq v0, v1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_a
    iget-object v0, p0, Lax/p1/b;->u0:Lax/S0/G;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v0, v1, v2}, Lax/S0/G;->Z([BI)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/p1/b;->u0:Lax/S0/G;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    add-int/lit8 p1, p1, 0x4

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lax/S0/G;->b0(I)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    new-array v0, p1, [F

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_26
    if-ge v1, p1, :cond_37

    .line 40
    .line 41
    iget-object v2, p0, Lax/p1/b;->u0:Lax/S0/G;

    .line 42
    .line 43
    invoke-virtual {v2}, Lax/S0/G;->z()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    aput v2, v0, v1

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_26

    .line 56
    :cond_37
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private j0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/p1/b;->v0:Lax/p1/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lax/p1/a;->e()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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
.method public B(ILjava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-ne p1, v0, :cond_9

    .line 4
    .line 5
    check-cast p2, Lax/p1/a;

    .line 6
    .line 7
    iput-object p2, p0, Lax/p1/b;->v0:Lax/p1/a;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/h;->B(ILjava/lang/Object;)V

    .line 11
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

.method protected U()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/p1/b;->j0()V

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

.method protected X(JZ)V
    .registers 4

    .line 1
    const-wide/high16 p1, -0x8000000000000000L

    .line 2
    .line 3
    iput-wide p1, p0, Lax/p1/b;->w0:J

    .line 4
    .line 5
    invoke-direct {p0}, Lax/p1/b;->j0()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method

.method public b(Lax/P0/v;)I
    .registers 3

    .line 1
    const-string v0, "application/x-camera-motion"

    .line 2
    .line 3
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_10

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public c()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public getName()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "CameraMotionRenderer"

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

.method public i(JJ)V
    .registers 9

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_6b

    .line 6
    .line 7
    iget-wide p3, p0, Lax/p1/b;->w0:J

    .line 8
    .line 9
    const-wide/32 v0, 0x186a0

    .line 10
    .line 11
    .line 12
    add-long/2addr v0, p1

    .line 13
    cmp-long v2, p3, v0

    .line 14
    .line 15
    if-gez v2, :cond_6b

    .line 16
    .line 17
    iget-object p3, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 18
    .line 19
    invoke-virtual {p3}, Lax/V0/i;->p()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    iget-object p4, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p3, p4, v0}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/4 p4, -0x4

    .line 34
    if-ne p3, p4, :cond_6b

    .line 35
    .line 36
    iget-object p3, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 37
    .line 38
    invoke-virtual {p3}, Lax/V0/a;->s()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2c

    .line 43
    .line 44
    goto :goto_6b

    .line 45
    :cond_2c
    iget-object p3, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 46
    .line 47
    iget-wide p3, p3, Lax/V0/i;->g0:J

    .line 48
    .line 49
    iput-wide p3, p0, Lax/p1/b;->w0:J

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    cmp-long v3, p3, v1

    .line 56
    .line 57
    if-gez v3, :cond_3b

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    :cond_3b
    iget-object p3, p0, Lax/p1/b;->v0:Lax/p1/a;

    .line 61
    .line 62
    if-eqz p3, :cond_0

    .line 63
    .line 64
    if-eqz v0, :cond_42

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_42
    iget-object p3, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 68
    .line 69
    invoke-virtual {p3}, Lax/V0/i;->D()V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, Lax/p1/b;->t0:Lax/V0/i;

    .line 73
    .line 74
    iget-object p3, p3, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    invoke-static {p3}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-direct {p0, p3}, Lax/p1/b;->i0(Ljava/nio/ByteBuffer;)[F

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-nez p3, :cond_58

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_58
    iget-object p4, p0, Lax/p1/b;->v0:Lax/p1/a;

    .line 90
    .line 91
    invoke-static {p4}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    check-cast p4, Lax/p1/a;

    .line 96
    .line 97
    iget-wide v0, p0, Lax/p1/b;->w0:J

    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->R()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    sub-long/2addr v0, v2

    .line 104
    invoke-interface {p4, v0, v1, p3}, Lax/p1/a;->b(J[F)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6b
    :goto_6b
    return-void
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

.method public isReady()Z
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
