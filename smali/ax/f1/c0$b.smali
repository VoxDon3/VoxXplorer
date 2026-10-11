.class public Lax/f1/c0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/f1/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/f1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Lax/f1/x$a;)Lax/f1/x;
    .registers 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/f1/c0$b;->b(Lax/f1/x$a;)Landroid/media/MediaCodec;

    .line 3
    .line 4
    .line 5
    move-result-object v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_5} :catch_42
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_5} :catch_40

    .line 6
    :try_start_5
    const-string v2, "configureCodec"

    .line 7
    .line 8
    invoke-static {v2}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, Lax/f1/x$a;->d:Landroid/view/Surface;

    .line 12
    .line 13
    if-nez v2, :cond_22

    .line 14
    .line 15
    iget-object v3, p1, Lax/f1/x$a;->a:Lax/f1/D;

    .line 16
    .line 17
    iget-boolean v3, v3, Lax/f1/D;->k:Z

    .line 18
    .line 19
    if-eqz v3, :cond_22

    .line 20
    .line 21
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v4, 0x23

    .line 24
    .line 25
    if-lt v3, v4, :cond_22

    .line 26
    .line 27
    const/16 v3, 0x8

    .line 28
    .line 29
    goto :goto_23

    .line 30
    :catch_1d
    move-exception p1

    .line 31
    :goto_1e
    move-object v0, v1

    .line 32
    goto :goto_43

    .line 33
    :catch_20
    move-exception p1

    .line 34
    goto :goto_1e

    .line 35
    :cond_22
    const/4 v3, 0x0

    .line 36
    :goto_23
    iget-object v4, p1, Lax/f1/x$a;->b:Landroid/media/MediaFormat;

    .line 37
    .line 38
    iget-object v5, p1, Lax/f1/x$a;->e:Landroid/media/MediaCrypto;

    .line 39
    .line 40
    invoke-virtual {v1, v4, v2, v5, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lax/S0/N;->b()V

    .line 44
    .line 45
    .line 46
    const-string v2, "startCodec"

    .line 47
    .line 48
    invoke-static {v2}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lax/S0/N;->b()V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lax/f1/c0;

    .line 58
    .line 59
    iget-object p1, p1, Lax/f1/x$a;->f:Lax/f1/t;

    .line 60
    .line 61
    invoke-direct {v2, v1, p1, v0}, Lax/f1/c0;-><init>(Landroid/media/MediaCodec;Lax/f1/t;Lax/f1/c0$a;)V
    :try_end_3f
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_3f} :catch_20
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_3f} :catch_1d

    .line 62
    .line 63
    .line 64
    return-object v2

    .line 65
    :catch_40
    move-exception p1

    .line 66
    goto :goto_43

    .line 67
    :catch_42
    move-exception p1

    .line 68
    :goto_43
    if-eqz v0, :cond_48

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 71
    .line 72
    .line 73
    :cond_48
    throw p1
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
.end method

.method protected b(Lax/f1/x$a;)Landroid/media/MediaCodec;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/f1/x$a;->a:Lax/f1/D;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lax/f1/x$a;->a:Lax/f1/D;

    .line 7
    .line 8
    iget-object p1, p1, Lax/f1/D;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "createCodec:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {}, Lax/S0/N;->b()V

    .line 35
    .line 36
    .line 37
    return-object p1
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
