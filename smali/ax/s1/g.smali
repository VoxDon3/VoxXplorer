.class final Lax/s1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/s1/a;


# instance fields
.field public final a:Lax/P0/v;


# direct methods
.method public constructor <init>(Lax/P0/v;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/s1/g;->a:Lax/P0/v;

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

.method private static b(I)Ljava/lang/String;
    .registers 1

    .line 1
    sparse-switch p0, :sswitch_data_14

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :sswitch_5
    const-string p0, "video/mjpeg"

    .line 7
    .line 8
    return-object p0

    .line 9
    :sswitch_8
    const-string p0, "video/mp43"

    .line 10
    .line 11
    return-object p0

    .line 12
    :sswitch_b
    const-string p0, "video/mp42"

    .line 13
    .line 14
    return-object p0

    .line 15
    :sswitch_e
    const-string p0, "video/avc"

    .line 16
    .line 17
    return-object p0

    .line 18
    :sswitch_11
    const-string p0, "video/mp4v-es"

    .line 19
    .line 20
    return-object p0

    .line 21
    :sswitch_data_14
    .sparse-switch
        0x30355844 -> :sswitch_11
        0x31435641 -> :sswitch_e
        0x31637661 -> :sswitch_e
        0x3234504d -> :sswitch_b
        0x3334504d -> :sswitch_8
        0x34363248 -> :sswitch_e
        0x34504d46 -> :sswitch_11
        0x44495633 -> :sswitch_11
        0x44495658 -> :sswitch_11
        0x47504a4d -> :sswitch_5
        0x58564944 -> :sswitch_11
        0x64697678 -> :sswitch_11
        0x67706a6d -> :sswitch_5
        0x78766964 -> :sswitch_11
    .end sparse-switch
    .line 22
.end method

.method private static c(I)Ljava/lang/String;
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_21

    .line 3
    .line 4
    const/16 v0, 0x55

    .line 5
    .line 6
    if-eq p0, v0, :cond_1e

    .line 7
    .line 8
    const/16 v0, 0xff

    .line 9
    .line 10
    if-eq p0, v0, :cond_1b

    .line 11
    .line 12
    const/16 v0, 0x2000

    .line 13
    .line 14
    if-eq p0, v0, :cond_18

    .line 15
    .line 16
    const/16 v0, 0x2001

    .line 17
    .line 18
    if-eq p0, v0, :cond_15

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_15
    const-string p0, "audio/vnd.dts"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_18
    const-string p0, "audio/ac3"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1b
    const-string p0, "audio/mp4a-latm"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1e
    const-string p0, "audio/mpeg"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_21
    const-string p0, "audio/raw"

    .line 35
    .line 36
    return-object p0
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

.method private static d(Lax/S0/G;)Lax/s1/a;
    .registers 4

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Lax/s1/g;->b(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_31

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "Ignoring track with unsupported compression "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "StreamFormatChunk"

    .line 44
    .line 45
    invoke-static {v0, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_31
    new-instance p0, Lax/P0/v$b;

    .line 51
    .line 52
    invoke-direct {p0}, Lax/P0/v$b;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, v2}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, v0}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 64
    .line 65
    .line 66
    new-instance v0, Lax/s1/g;

    .line 67
    .line 68
    invoke-virtual {p0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Lax/s1/g;-><init>(Lax/P0/v;)V

    .line 73
    .line 74
    .line 75
    return-object v0
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

.method public static e(ILax/S0/G;)Lax/s1/a;
    .registers 3

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p0, v0, :cond_8

    .line 3
    .line 4
    invoke-static {p1}, Lax/s1/g;->d(Lax/S0/G;)Lax/s1/a;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_8
    const/4 v0, 0x1

    .line 10
    if-ne p0, v0, :cond_10

    .line 11
    .line 12
    invoke-static {p1}, Lax/s1/g;->f(Lax/S0/G;)Lax/s1/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v0, "Ignoring strf box for unsupported track type: "

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lax/S0/d0;->v0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "StreamFormatChunk"

    .line 39
    .line 40
    invoke-static {p1, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0
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

.method private static f(Lax/S0/G;)Lax/s1/a;
    .registers 9

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->E()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/s1/g;->c(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_22

    .line 10
    .line 11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "Ignoring track with unsupported format tag "

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "StreamFormatChunk"

    .line 29
    .line 30
    invoke-static {v0, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_22
    invoke-virtual {p0}, Lax/S0/G;->E()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p0}, Lax/S0/G;->z()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x6

    .line 44
    invoke-virtual {p0, v3}, Lax/S0/G;->c0(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lax/S0/G;->E()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-static {v3}, Lax/S0/d0;->j0(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {p0}, Lax/S0/G;->a()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x0

    .line 60
    if-lez v4, :cond_42

    .line 61
    .line 62
    invoke-virtual {p0}, Lax/S0/G;->E()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    goto :goto_43

    .line 67
    :cond_42
    const/4 v4, 0x0

    .line 68
    :goto_43
    new-instance v6, Lax/P0/v$b;

    .line 69
    .line 70
    invoke-direct {v6}, Lax/P0/v$b;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7, v0}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, v2}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    .line 82
    .line 83
    .line 84
    const-string v0, "audio/raw"

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_60

    .line 91
    .line 92
    if-eqz v3, :cond_60

    .line 93
    .line 94
    invoke-virtual {v6, v3}, Lax/P0/v$b;->s0(I)Lax/P0/v$b;

    .line 95
    .line 96
    .line 97
    :cond_60
    const-string v0, "audio/mp4a-latm"

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_76

    .line 104
    .line 105
    if-lez v4, :cond_76

    .line 106
    .line 107
    new-array v0, v4, [B

    .line 108
    .line 109
    invoke-virtual {p0, v0, v5, v4}, Lax/S0/G;->q([BII)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v6, p0}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 117
    .line 118
    .line 119
    :cond_76
    new-instance p0, Lax/s1/g;

    .line 120
    .line 121
    invoke-virtual {v6}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {p0, v0}, Lax/s1/g;-><init>(Lax/P0/v;)V

    .line 126
    .line 127
    .line 128
    return-object p0
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
.method public a()I
    .registers 2

    .line 1
    const v0, 0x66727473

    .line 2
    .line 3
    .line 4
    return v0
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
