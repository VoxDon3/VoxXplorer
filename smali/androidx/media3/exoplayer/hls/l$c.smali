.class Landroidx/media3/exoplayer/hls/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field private static final g:Lax/P0/v;

.field private static final h:Lax/P0/v;


# instance fields
.field private final a:Lax/B1/b;

.field private final b:Lax/q1/U;

.field private final c:Lax/P0/v;

.field private d:Lax/P0/v;

.field private e:[B

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/P0/v$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "application/id3"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Landroidx/media3/exoplayer/hls/l$c;->g:Lax/P0/v;

    .line 17
    .line 18
    new-instance v0, Lax/P0/v$b;

    .line 19
    .line 20
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "application/x-emsg"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Landroidx/media3/exoplayer/hls/l$c;->h:Lax/P0/v;

    .line 34
    .line 35
    return-void
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

.method public constructor <init>(Lax/q1/U;I)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/B1/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/B1/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->a:Lax/B1/b;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->b:Lax/q1/U;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    if-eq p2, p1, :cond_2e

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    if-ne p2, p1, :cond_17

    .line 18
    .line 19
    sget-object p1, Landroidx/media3/exoplayer/hls/l$c;->h:Lax/P0/v;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->c:Lax/P0/v;

    .line 22
    .line 23
    goto :goto_32

    .line 24
    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "Unknown metadataType: "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2e
    sget-object p1, Landroidx/media3/exoplayer/hls/l$c;->g:Lax/P0/v;

    .line 48
    .line 49
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->c:Lax/P0/v;

    .line 50
    .line 51
    :goto_32
    const/4 p1, 0x0

    .line 52
    new-array p2, p1, [B

    .line 53
    .line 54
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 55
    .line 56
    iput p1, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 57
    .line 58
    return-void
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

.method private h(Lax/B1/a;)Z
    .registers 3

    .line 1
    invoke-virtual {p1}, Lax/B1/a;->a()Lax/P0/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_14

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->c:Lax/P0/v;

    .line 8
    .line 9
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method private i(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge v1, p1, :cond_e

    .line 5
    .line 6
    div-int/lit8 v1, p1, 0x2

    .line 7
    .line 8
    add-int/2addr p1, v1

    .line 9
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private j(II)Lax/S0/G;
    .registers 6

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 2
    .line 3
    sub-int/2addr v0, p2

    .line 4
    sub-int p1, v0, p1

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 7
    .line 8
    invoke-static {v1, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v1, Lax/S0/G;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lax/S0/G;-><init>([B)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {p1, v0, p1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iput p2, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 24
    .line 25
    return-object v1
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
.method public synthetic a(Lax/P0/k;IZ)I
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/q1/T;->b(Lax/q1/U;Lax/P0/k;IZ)I

    move-result p1

    return p1
.end method

.method public b(Lax/S0/G;II)V
    .registers 5

    .line 1
    iget p3, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 2
    .line 3
    add-int/2addr p3, p2

    .line 4
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/hls/l$c;->i(I)V

    .line 5
    .line 6
    .line 7
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 10
    .line 11
    invoke-virtual {p1, p3, v0, p2}, Lax/S0/G;->q([BII)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 15
    .line 16
    add-int/2addr p1, p2

    .line 17
    iput p1, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 18
    .line 19
    return-void
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

.method public c(Lax/P0/k;IZI)I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget p4, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 2
    .line 3
    add-int/2addr p4, p2

    .line 4
    invoke-direct {p0, p4}, Landroidx/media3/exoplayer/hls/l$c;->i(I)V

    .line 5
    .line 6
    .line 7
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/l$c;->e:[B

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 10
    .line 11
    invoke-interface {p1, p4, v0, p2}, Lax/P0/k;->c([BII)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 p2, -0x1

    .line 16
    if-ne p1, p2, :cond_1a

    .line 17
    .line 18
    if-eqz p3, :cond_14

    .line 19
    .line 20
    return p2

    .line 21
    :cond_14
    new-instance p1, Ljava/io/EOFException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1a
    iget p2, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 28
    .line 29
    add-int/2addr p2, p1

    .line 30
    iput p2, p0, Landroidx/media3/exoplayer/hls/l$c;->f:I

    .line 31
    .line 32
    return p1
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

.method public synthetic d(J)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/q1/T;->a(Lax/q1/U;J)V

    return-void
.end method

.method public e(Lax/P0/v;)V
    .registers 3

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->d:Lax/P0/v;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->b:Lax/q1/U;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->c:Lax/P0/v;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public f(JIIILax/q1/U$a;)V
    .registers 14

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->d:Lax/P0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p4, p5}, Landroidx/media3/exoplayer/hls/l$c;->j(II)Lax/S0/G;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    iget-object p5, p0, Landroidx/media3/exoplayer/hls/l$c;->d:Lax/P0/v;

    .line 11
    .line 12
    iget-object p5, p5, Lax/P0/v;->o:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->c:Lax/P0/v;

    .line 15
    .line 16
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p5, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p5

    .line 22
    if-eqz p5, :cond_18

    .line 23
    .line 24
    goto :goto_5d

    .line 25
    :cond_18
    iget-object p5, p0, Landroidx/media3/exoplayer/hls/l$c;->d:Lax/P0/v;

    .line 26
    .line 27
    iget-object p5, p5, Lax/P0/v;->o:Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "application/x-emsg"

    .line 30
    .line 31
    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p5

    .line 35
    const-string v0, "HlsSampleStreamWrapper"

    .line 36
    .line 37
    if-eqz p5, :cond_70

    .line 38
    .line 39
    iget-object p5, p0, Landroidx/media3/exoplayer/hls/l$c;->a:Lax/B1/b;

    .line 40
    .line 41
    invoke-virtual {p5, p4}, Lax/B1/b;->c(Lax/S0/G;)Lax/B1/a;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-direct {p0, p4}, Landroidx/media3/exoplayer/hls/l$c;->h(Lax/B1/a;)Z

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    if-nez p5, :cond_4d

    .line 50
    .line 51
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l$c;->c:Lax/P0/v;

    .line 52
    .line 53
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p4}, Lax/B1/a;->a()Lax/P0/v;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const/4 p3, 0x2

    .line 60
    new-array p3, p3, [Ljava/lang/Object;

    .line 61
    .line 62
    const/4 p4, 0x0

    .line 63
    aput-object p1, p3, p4

    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    aput-object p2, p3, p1

    .line 67
    .line 68
    const-string p1, "Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s"

    .line 69
    .line 70
    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {v0, p1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    new-instance p5, Lax/S0/G;

    .line 79
    .line 80
    invoke-virtual {p4}, Lax/B1/a;->c()[B

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    invoke-static {p4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    check-cast p4, [B

    .line 89
    .line 90
    invoke-direct {p5, p4}, Lax/S0/G;-><init>([B)V

    .line 91
    .line 92
    .line 93
    move-object p4, p5

    .line 94
    :goto_5d
    invoke-virtual {p4}, Lax/S0/G;->a()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    iget-object p5, p0, Landroidx/media3/exoplayer/hls/l$c;->b:Lax/q1/U;

    .line 99
    .line 100
    invoke-interface {p5, p4, v4}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l$c;->b:Lax/q1/U;

    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    move-wide v1, p1

    .line 107
    move v3, p3

    .line 108
    move-object v6, p6

    .line 109
    invoke-interface/range {v0 .. v6}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_70
    new-instance p1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string p2, "Ignoring sample for unsupported format: "

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/l$c;->d:Lax/P0/v;

    .line 124
    .line 125
    iget-object p2, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {v0, p1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
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
.end method

.method public synthetic g(Lax/S0/G;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/q1/T;->c(Lax/q1/U;Lax/S0/G;I)V

    return-void
.end method
