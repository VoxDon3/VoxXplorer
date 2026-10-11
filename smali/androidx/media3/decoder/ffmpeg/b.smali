.class public final Landroidx/media3/decoder/ffmpeg/b;
.super Lax/a1/H;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/a1/H<",
        "Lax/W0/a;",
        ">;"
    }
.end annotation


# static fields
.field private static V0:I

.field public static final synthetic W0:I


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    const/4 v0, 0x0

    .line 1
    new-array v0, v0, [Lax/Q0/o;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v1, v0}, Landroidx/media3/decoder/ffmpeg/b;-><init>(Landroid/os/Handler;Lax/a1/z;[Lax/Q0/o;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lax/a1/z;Lax/a1/B;)V
    .registers 4

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lax/a1/H;-><init>(Landroid/os/Handler;Lax/a1/z;Lax/a1/B;)V

    return-void
.end method

.method public varargs constructor <init>(Landroid/os/Handler;Lax/a1/z;[Lax/Q0/o;)V
    .registers 5

    .line 2
    new-instance v0, Lax/a1/f0$g;

    invoke-direct {v0}, Lax/a1/f0$g;-><init>()V

    .line 3
    invoke-virtual {v0, p3}, Lax/a1/f0$g;->m([Lax/Q0/o;)Lax/a1/f0$g;

    move-result-object p3

    invoke-virtual {p3}, Lax/a1/f0$g;->k()Lax/a1/f0;

    move-result-object p3

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/decoder/ffmpeg/b;-><init>(Landroid/os/Handler;Lax/a1/z;Lax/a1/B;)V

    return-void
.end method

.method public static G0()I
    .registers 1

    .line 1
    sget v0, Landroidx/media3/decoder/ffmpeg/b;->V0:I

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

.method public static I0(I)V
    .registers 1

    .line 1
    sput p0, Landroidx/media3/decoder/ffmpeg/b;->V0:I

    .line 2
    .line 3
    return-void
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
.end method

.method private J0(Lax/P0/v;)Z
    .registers 7

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/media3/decoder/ffmpeg/b;->K0(Lax/P0/v;I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v1, :cond_9

    .line 8
    .line 9
    return v2

    .line 10
    :cond_9
    iget v1, p1, Lax/P0/v;->G:I

    .line 11
    .line 12
    iget v3, p1, Lax/P0/v;->H:I

    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    invoke-static {v4, v1, v3}, Lax/S0/d0;->l0(III)Lax/P0/v;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v1}, Lax/a1/H;->s0(Lax/P0/v;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eq v1, v0, :cond_1a

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1a
    const-string v0, "audio/ac3"

    .line 28
    .line 29
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    xor-int/2addr p1, v2

    .line 36
    return p1
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

.method private K0(Lax/P0/v;I)Z
    .registers 4

    .line 1
    iget v0, p1, Lax/P0/v;->G:I

    .line 2
    .line 3
    iget p1, p1, Lax/P0/v;->H:I

    .line 4
    .line 5
    invoke-static {p2, v0, p1}, Lax/S0/d0;->l0(III)Lax/P0/v;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lax/a1/H;->C0(Lax/P0/v;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method private L0(Ljava/lang/String;)Z
    .registers 4

    .line 1
    invoke-static {}, Lax/P2/b;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->e(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_b
    invoke-static {}, Lax/P2/b;->a()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_17

    .line 18
    .line 19
    invoke-static {p1}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->g(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_17
    const/4 p1, 0x0

    .line 25
    return p1
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
.end method


# virtual methods
.method public A()I
    .registers 2

    .line 1
    const/16 v0, 0x8

    return v0
.end method

.method protected D0(Lax/P0/v;)I
    .registers 5

    .line 1
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lax/P2/b;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_32

    .line 14
    .line 15
    invoke-static {v0}, Lax/P0/D;->o(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_15

    .line 20
    .line 21
    goto :goto_32

    .line 22
    :cond_15
    invoke-direct {p0, v0}, Landroidx/media3/decoder/ffmpeg/b;->L0(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_30

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-direct {p0, p1, v0}, Landroidx/media3/decoder/ffmpeg/b;->K0(Lax/P0/v;I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x4

    .line 34
    if-nez v1, :cond_2a

    .line 35
    .line 36
    invoke-direct {p0, p1, v2}, Landroidx/media3/decoder/ffmpeg/b;->K0(Lax/P0/v;I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2a

    .line 41
    .line 42
    goto :goto_30

    .line 43
    :cond_2a
    iget p1, p1, Lax/P0/v;->P:I

    .line 44
    .line 45
    if-eqz p1, :cond_2f

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2f
    return v2

    .line 49
    :cond_30
    :goto_30
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_32
    :goto_32
    const/4 p1, 0x0

    .line 52
    return p1
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

.method protected F0(Lax/P0/v;Lax/V0/b;)Lax/W0/a;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/W0/b;
        }
    .end annotation

    .line 1
    const-string p2, "createFfmpegAudioDecoder"

    .line 2
    .line 3
    invoke-static {p2}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p2, p1, Lax/P0/v;->p:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p2, v0, :cond_c

    .line 10
    .line 11
    move v4, p2

    .line 12
    goto :goto_10

    .line 13
    :cond_c
    const/16 p2, 0x1680

    .line 14
    .line 15
    const/16 v4, 0x1680

    .line 16
    .line 17
    :goto_10
    invoke-static {}, Lax/P2/b;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_25

    .line 22
    .line 23
    new-instance v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 24
    .line 25
    const/16 v3, 0x10

    .line 26
    .line 27
    invoke-direct {p0, p1}, Landroidx/media3/decoder/ffmpeg/b;->J0(Lax/P0/v;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/16 v2, 0x10

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    invoke-direct/range {v0 .. v5}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;-><init>(Lax/P0/v;IIIZ)V

    .line 35
    .line 36
    .line 37
    goto :goto_3b

    .line 38
    :cond_25
    move-object v1, p1

    .line 39
    new-instance v0, Lcom/google/android/exoplayer2/ext/ffmpeg/a;

    .line 40
    .line 41
    move-object v2, v1

    .line 42
    invoke-static {}, Lax/P2/b;->f()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {p0, v2}, Landroidx/media3/decoder/ffmpeg/b;->J0(Lax/P0/v;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    sget v7, Landroidx/media3/decoder/ffmpeg/b;->V0:I

    .line 51
    .line 52
    const/16 v3, 0x10

    .line 53
    .line 54
    move v5, v4

    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/ext/ffmpeg/a;-><init>(ZLax/P0/v;IIIZI)V

    .line 58
    .line 59
    .line 60
    :goto_3b
    invoke-static {}, Lax/S0/N;->b()V

    .line 61
    .line 62
    .line 63
    return-object v0
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

.method protected H0(Lax/W0/a;)Lax/P0/v;
    .registers 5

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lax/W0/a;->y()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/b;->G0()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_10

    .line 13
    .line 14
    if-le v0, v1, :cond_10

    .line 15
    .line 16
    move v0, v1

    .line 17
    :cond_10
    new-instance v1, Lax/P0/v$b;

    .line 18
    .line 19
    invoke-direct {v1}, Lax/P0/v$b;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "audio/raw"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, v0}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1}, Lax/W0/a;->A()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1}, Lax/W0/a;->z()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {v0, p1}, Lax/P0/v$b;->s0(I)Lax/P0/v$b;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
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

.method public getName()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "FfmpegAudioRenderer"

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

.method protected bridge synthetic m0(Lax/P0/v;Lax/V0/b;)Lax/V0/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/V0/h;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/decoder/ffmpeg/b;->F0(Lax/P0/v;Lax/V0/b;)Lax/W0/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method protected bridge synthetic r0(Lax/V0/g;)Lax/P0/v;
    .registers 2

    .line 1
    check-cast p1, Lax/W0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/decoder/ffmpeg/b;->H0(Lax/W0/a;)Lax/P0/v;

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
