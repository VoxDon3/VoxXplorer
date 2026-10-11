.class public Lax/f1/B;
.super Lax/V0/h;
.source "SourceFile"


# instance fields
.field public final c0:Ljava/lang/String;

.field public final d0:I

.field public final q:Lax/f1/D;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lax/f1/D;)V
    .registers 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Decoder failed: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez p2, :cond_f

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    goto :goto_11

    .line 16
    :cond_f
    iget-object v2, p2, Lax/f1/D;->a:Ljava/lang/String;

    .line 17
    .line 18
    :goto_11
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p0, v0, p1}, Lax/V0/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lax/f1/B;->q:Lax/f1/D;

    .line 29
    .line 30
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 31
    .line 32
    if-eqz p2, :cond_28

    .line 33
    .line 34
    move-object p2, p1

    .line 35
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_28
    iput-object v1, p0, Lax/f1/B;->c0:Ljava/lang/String;

    .line 42
    .line 43
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v0, 0x17

    .line 46
    .line 47
    if-lt p2, v0, :cond_35

    .line 48
    .line 49
    invoke-static {p1}, Lax/f1/B;->a(Ljava/lang/Throwable;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_39

    .line 54
    :cond_35
    invoke-static {v1}, Lax/S0/d0;->c0(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    :goto_39
    iput p1, p0, Lax/f1/B;->d0:I

    .line 59
    .line 60
    return-void
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

.method private static a(Ljava/lang/Throwable;)I
    .registers 2

    .line 1
    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    check-cast p0, Landroid/media/MediaCodec$CodecException;

    .line 6
    .line 7
    invoke-static {p0}, Lax/f1/A;->a(Landroid/media/MediaCodec$CodecException;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_b
    const/4 p0, 0x0

    .line 13
    return p0
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
