.class Lax/l1/n$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/l1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field private final a:Landroid/media/Spatializer;

.field private final b:Z

.field private final c:Landroid/os/Handler;

.field private final d:Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/l1/n;Ljava/lang/Boolean;)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_8

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    goto :goto_c

    .line 9
    :cond_8
    invoke-static {p1}, Lax/Q0/m;->c(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_c
    const/4 v1, 0x0

    .line 14
    if-eqz p1, :cond_4b

    .line 15
    .line 16
    if-eqz p3, :cond_18

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_18

    .line 23
    .line 24
    goto :goto_4b

    .line 25
    :cond_18
    invoke-static {p1}, Lax/l1/s;->a(Landroid/media/AudioManager;)Landroid/media/Spatializer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lax/l1/n$h;->a:Landroid/media/Spatializer;

    .line 30
    .line 31
    invoke-static {p1}, Lax/l1/t;->a(Landroid/media/Spatializer;)I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_25

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    :cond_25
    iput-boolean v1, p0, Lax/l1/n$h;->b:Z

    .line 39
    .line 40
    new-instance p3, Lax/l1/n$h$a;

    .line 41
    .line 42
    invoke-direct {p3, p0, p2}, Lax/l1/n$h$a;-><init>(Lax/l1/n$h;Lax/l1/n;)V

    .line 43
    .line 44
    .line 45
    iput-object p3, p0, Lax/l1/n$h;->d:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 46
    .line 47
    new-instance p2, Landroid/os/Handler;

    .line 48
    .line 49
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/os/Looper;

    .line 58
    .line 59
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 60
    .line 61
    .line 62
    iput-object p2, p0, Lax/l1/n$h;->c:Landroid/os/Handler;

    .line 63
    .line 64
    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    new-instance v0, Lax/v0/a;

    .line 68
    .line 69
    invoke-direct {v0, p2}, Lax/v0/a;-><init>(Landroid/os/Handler;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v0, p3}, Lax/l1/u;->a(Landroid/media/Spatializer;Ljava/util/concurrent/Executor;Landroid/media/Spatializer$OnSpatializerStateChangedListener;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4b
    :goto_4b
    iput-object v0, p0, Lax/l1/n$h;->a:Landroid/media/Spatializer;

    .line 77
    .line 78
    iput-boolean v1, p0, Lax/l1/n$h;->b:Z

    .line 79
    .line 80
    iput-object v0, p0, Lax/l1/n$h;->c:Landroid/os/Handler;

    .line 81
    .line 82
    iput-object v0, p0, Lax/l1/n$h;->d:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public a(Lax/P0/c;Lax/P0/v;)Z
    .registers 7

    .line 1
    iget-object v0, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eqz v0, :cond_14

    .line 11
    .line 12
    iget v0, p2, Lax/P0/v;->G:I

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-ne v0, v2, :cond_3d

    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    goto :goto_3d

    .line 21
    :cond_14
    iget-object v0, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "audio/iamf"

    .line 24
    .line 25
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_24

    .line 30
    .line 31
    iget v0, p2, Lax/P0/v;->G:I

    .line 32
    .line 33
    if-ne v0, v1, :cond_3d

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    goto :goto_3d

    .line 37
    :cond_24
    iget-object v0, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 38
    .line 39
    const-string v2, "audio/ac4"

    .line 40
    .line 41
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3b

    .line 46
    .line 47
    iget v0, p2, Lax/P0/v;->G:I

    .line 48
    .line 49
    const/16 v2, 0x12

    .line 50
    .line 51
    if-eq v0, v2, :cond_38

    .line 52
    .line 53
    const/16 v2, 0x15

    .line 54
    .line 55
    if-ne v0, v2, :cond_3d

    .line 56
    .line 57
    :cond_38
    const/16 v0, 0x18

    .line 58
    .line 59
    goto :goto_3d

    .line 60
    :cond_3b
    iget v0, p2, Lax/P0/v;->G:I

    .line 61
    .line 62
    :cond_3d
    :goto_3d
    invoke-static {v0}, Lax/S0/d0;->M(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_45

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    return p1

    .line 70
    :cond_45
    new-instance v2, Landroid/media/AudioFormat$Builder;

    .line 71
    .line 72
    invoke-direct {v2}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    invoke-virtual {v2, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2, v0}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget p2, p2, Lax/P0/v;->H:I

    .line 85
    .line 86
    if-eq p2, v1, :cond_5a

    .line 87
    .line 88
    invoke-virtual {v0, p2}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 89
    .line 90
    .line 91
    :cond_5a
    iget-object p2, p0, Lax/l1/n$h;->a:Landroid/media/Spatializer;

    .line 92
    .line 93
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {p2}, Lax/l1/w;->a(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p1}, Lax/P0/c;->a()Lax/P0/c$d;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, Lax/P0/c$d;->a:Landroid/media/AudioAttributes;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {p2, p1, v0}, Lax/l1/z;->a(Landroid/media/Spatializer;Landroid/media/AudioAttributes;Landroid/media/AudioFormat;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    return p1
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

.method public b()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/l1/n$h;->a:Landroid/media/Spatializer;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lax/l1/w;->a(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/l1/x;->a(Landroid/media/Spatializer;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/l1/n$h;->a:Landroid/media/Spatializer;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lax/l1/w;->a(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/l1/y;->a(Landroid/media/Spatializer;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/l1/n$h;->b:Z

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

.method public e()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/l1/n$h;->a:Landroid/media/Spatializer;

    .line 2
    .line 3
    if-eqz v0, :cond_16

    .line 4
    .line 5
    iget-object v1, p0, Lax/l1/n$h;->d:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 6
    .line 7
    if-eqz v1, :cond_16

    .line 8
    .line 9
    iget-object v2, p0, Lax/l1/n$h;->c:Landroid/os/Handler;

    .line 10
    .line 11
    if-nez v2, :cond_d

    .line 12
    .line 13
    goto :goto_16

    .line 14
    :cond_d
    invoke-static {v0, v1}, Lax/l1/v;->a(Landroid/media/Spatializer;Landroid/media/Spatializer$OnSpatializerStateChangedListener;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/l1/n$h;->c:Landroid/os/Handler;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    :goto_16
    return-void
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
.end method
