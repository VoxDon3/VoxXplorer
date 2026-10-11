.class public final Lax/S0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/S0/n$a;
    }
.end annotation


# static fields
.field private static final h0:[I


# instance fields
.field private final c0:[I

.field private d0:Landroid/opengl/EGLDisplay;

.field private e0:Landroid/opengl/EGLContext;

.field private f0:Landroid/opengl/EGLSurface;

.field private g0:Landroid/graphics/SurfaceTexture;

.field private final q:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_a

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/S0/n;->h0:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_a
    .array-data 4
        0x3040
        0x4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3027
        0x3038
        0x3033
        0x4
        0x3038
    .end array-data
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

.method public constructor <init>(Landroid/os/Handler;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lax/S0/n;-><init>(Landroid/os/Handler;Lax/S0/n$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lax/S0/n$a;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/S0/n;->q:Landroid/os/Handler;

    const/4 p1, 0x1

    .line 4
    new-array p1, p1, [I

    iput-object p1, p0, Lax/S0/n;->c0:[I

    return-void
.end method

.method private static a(Landroid/opengl/EGLDisplay;)Landroid/opengl/EGLConfig;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v4, v0, [Landroid/opengl/EGLConfig;

    .line 3
    .line 4
    new-array v7, v0, [I

    .line 5
    .line 6
    sget-object v2, Lax/S0/n;->h0:[I

    .line 7
    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p0

    .line 13
    invoke-static/range {v1 .. v8}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p0, :cond_1d

    .line 19
    .line 20
    aget v2, v7, v1

    .line 21
    .line 22
    if-lez v2, :cond_1d

    .line 23
    .line 24
    aget-object v2, v4, v1

    .line 25
    .line 26
    if-eqz v2, :cond_1d

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 v2, 0x0

    .line 31
    :goto_1e
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    aget v3, v7, v1

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    aget-object v5, v4, v1

    .line 42
    .line 43
    const/4 v6, 0x3

    .line 44
    new-array v6, v6, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object p0, v6, v1

    .line 47
    .line 48
    aput-object v3, v6, v0

    .line 49
    .line 50
    const/4 p0, 0x2

    .line 51
    aput-object v5, v6, p0

    .line 52
    .line 53
    const-string p0, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"

    .line 54
    .line 55
    invoke-static {p0, v6}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {v2, p0}, Lax/S0/p;->c(ZLjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    aget-object p0, v4, v1

    .line 63
    .line 64
    return-object p0
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
.end method

.method private static b(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;I)Landroid/opengl/EGLContext;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    const/16 v0, 0x3038

    .line 2
    .line 3
    const/16 v1, 0x3098

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    if-nez p2, :cond_13

    .line 10
    .line 11
    new-array p2, v2, [I

    .line 12
    .line 13
    aput v1, p2, v5

    .line 14
    .line 15
    aput v3, p2, v4

    .line 16
    .line 17
    aput v0, p2, v3

    .line 18
    .line 19
    goto :goto_23

    .line 20
    :cond_13
    const/4 p2, 0x5

    .line 21
    new-array p2, p2, [I

    .line 22
    .line 23
    aput v1, p2, v5

    .line 24
    .line 25
    aput v3, p2, v4

    .line 26
    .line 27
    const/16 v1, 0x32c0

    .line 28
    .line 29
    aput v1, p2, v3

    .line 30
    .line 31
    aput v4, p2, v2

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    aput v0, p2, v1

    .line 35
    .line 36
    :goto_23
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 37
    .line 38
    invoke-static {p0, p1, v0, p2, v5}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_2c

    .line 43
    .line 44
    goto :goto_2d

    .line 45
    :cond_2c
    const/4 v4, 0x0

    .line 46
    :goto_2d
    const-string p1, "eglCreateContext failed"

    .line 47
    .line 48
    invoke-static {v4, p1}, Lax/S0/p;->c(ZLjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p0
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

.method private static c(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;I)Landroid/opengl/EGLSurface;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p3, v0, :cond_6

    .line 3
    .line 4
    sget-object p1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 5
    .line 6
    goto :goto_41

    .line 7
    :cond_6
    const/16 v1, 0x3038

    .line 8
    .line 9
    const/4 v2, 0x5

    .line 10
    const/4 v3, 0x4

    .line 11
    const/4 v4, 0x3

    .line 12
    const/16 v5, 0x3056

    .line 13
    .line 14
    const/16 v6, 0x3057

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x0

    .line 18
    if-ne p3, v7, :cond_28

    .line 19
    .line 20
    const/4 p3, 0x7

    .line 21
    new-array p3, p3, [I

    .line 22
    .line 23
    aput v6, p3, v8

    .line 24
    .line 25
    aput v0, p3, v0

    .line 26
    .line 27
    aput v5, p3, v7

    .line 28
    .line 29
    aput v0, p3, v4

    .line 30
    .line 31
    const/16 v4, 0x32c0

    .line 32
    .line 33
    aput v4, p3, v3

    .line 34
    .line 35
    aput v0, p3, v2

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    aput v1, p3, v2

    .line 39
    .line 40
    goto :goto_34

    .line 41
    :cond_28
    new-array p3, v2, [I

    .line 42
    .line 43
    aput v6, p3, v8

    .line 44
    .line 45
    aput v0, p3, v0

    .line 46
    .line 47
    aput v5, p3, v7

    .line 48
    .line 49
    aput v0, p3, v4

    .line 50
    .line 51
    aput v1, p3, v3

    .line 52
    .line 53
    :goto_34
    invoke-static {p0, p1, p3, v8}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3b

    .line 58
    .line 59
    goto :goto_3c

    .line 60
    :cond_3b
    const/4 v0, 0x0

    .line 61
    :goto_3c
    const-string p3, "eglCreatePbufferSurface failed"

    .line 62
    .line 63
    invoke-static {v0, p3}, Lax/S0/p;->c(ZLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_41
    invoke-static {p0, p1, p1, p2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    const-string p2, "eglMakeCurrent failed"

    .line 71
    .line 72
    invoke-static {p0, p2}, Lax/S0/p;->c(ZLjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object p1
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

.method private d()V
    .registers 1

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
.end method

.method private static e([I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v0, p0, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lax/S0/p;->b()V

    .line 7
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
    .line 22
.end method

.method private static f()Landroid/opengl/EGLDisplay;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_a

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v3, 0x0

    .line 12
    :goto_b
    const-string v4, "eglGetDisplay failed"

    .line 13
    .line 14
    invoke-static {v3, v4}, Lax/S0/p;->c(ZLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    new-array v3, v3, [I

    .line 19
    .line 20
    invoke-static {v1, v3, v0, v3, v2}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const-string v2, "eglInitialize failed"

    .line 25
    .line 26
    invoke-static {v0, v2}, Lax/S0/p;->c(ZLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1
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


# virtual methods
.method public g()Landroid/graphics/SurfaceTexture;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/S0/n;->g0:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/SurfaceTexture;

    .line 8
    .line 9
    return-object v0
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

.method public h(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/S0/n;->f()Landroid/opengl/EGLDisplay;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 6
    .line 7
    invoke-static {v0}, Lax/S0/n;->a(Landroid/opengl/EGLDisplay;)Landroid/opengl/EGLConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 12
    .line 13
    invoke-static {v1, v0, p1}, Lax/S0/n;->b(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;I)Landroid/opengl/EGLContext;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lax/S0/n;->e0:Landroid/opengl/EGLContext;

    .line 18
    .line 19
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 20
    .line 21
    invoke-static {v2, v0, v1, p1}, Lax/S0/n;->c(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;I)Landroid/opengl/EGLSurface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 26
    .line 27
    iget-object p1, p0, Lax/S0/n;->c0:[I

    .line 28
    .line 29
    invoke-static {p1}, Lax/S0/n;->e([I)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/graphics/SurfaceTexture;

    .line 33
    .line 34
    iget-object v0, p0, Lax/S0/n;->c0:[I

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    aget v0, v0, v1

    .line 38
    .line 39
    invoke-direct {p1, v0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lax/S0/n;->g0:Landroid/graphics/SurfaceTexture;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public i()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/S0/n;->q:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_6
    iget-object v1, p0, Lax/S0/n;->g0:Landroid/graphics/SurfaceTexture;

    .line 8
    .line 9
    if-eqz v1, :cond_17

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lax/S0/n;->c0:[I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v3, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V
    :try_end_14
    .catchall {:try_start_6 .. :try_end_14} :catchall_15

    .line 19
    .line 20
    .line 21
    goto :goto_17

    .line 22
    :catchall_15
    move-exception v1

    .line 23
    goto :goto_65

    .line 24
    :cond_17
    :goto_17
    iget-object v1, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 25
    .line 26
    if-eqz v1, :cond_2c

    .line 27
    .line 28
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2c

    .line 35
    .line 36
    iget-object v1, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 37
    .line 38
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 39
    .line 40
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 41
    .line 42
    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 43
    .line 44
    .line 45
    :cond_2c
    iget-object v1, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 46
    .line 47
    if-eqz v1, :cond_3f

    .line 48
    .line 49
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_3f

    .line 56
    .line 57
    iget-object v1, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 58
    .line 59
    iget-object v2, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 60
    .line 61
    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 62
    .line 63
    .line 64
    :cond_3f
    iget-object v1, p0, Lax/S0/n;->e0:Landroid/opengl/EGLContext;

    .line 65
    .line 66
    if-eqz v1, :cond_48

    .line 67
    .line 68
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 69
    .line 70
    invoke-static {v2, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 71
    .line 72
    .line 73
    :cond_48
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 77
    .line 78
    if-eqz v1, :cond_5c

    .line 79
    .line 80
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_5c

    .line 87
    .line 88
    iget-object v1, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 89
    .line 90
    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 91
    .line 92
    .line 93
    :cond_5c
    iput-object v0, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 94
    .line 95
    iput-object v0, p0, Lax/S0/n;->e0:Landroid/opengl/EGLContext;

    .line 96
    .line 97
    iput-object v0, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 98
    .line 99
    iput-object v0, p0, Lax/S0/n;->g0:Landroid/graphics/SurfaceTexture;

    .line 100
    .line 101
    return-void

    .line 102
    :goto_65
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 103
    .line 104
    if-eqz v2, :cond_7a

    .line 105
    .line 106
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_7a

    .line 113
    .line 114
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 115
    .line 116
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 117
    .line 118
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 119
    .line 120
    invoke-static {v2, v3, v3, v4}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 121
    .line 122
    .line 123
    :cond_7a
    iget-object v2, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 124
    .line 125
    if-eqz v2, :cond_8d

    .line 126
    .line 127
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_8d

    .line 134
    .line 135
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 136
    .line 137
    iget-object v3, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 138
    .line 139
    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 140
    .line 141
    .line 142
    :cond_8d
    iget-object v2, p0, Lax/S0/n;->e0:Landroid/opengl/EGLContext;

    .line 143
    .line 144
    if-eqz v2, :cond_96

    .line 145
    .line 146
    iget-object v3, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 147
    .line 148
    invoke-static {v3, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 149
    .line 150
    .line 151
    :cond_96
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 152
    .line 153
    .line 154
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 155
    .line 156
    if-eqz v2, :cond_aa

    .line 157
    .line 158
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 159
    .line 160
    invoke-virtual {v2, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_aa

    .line 165
    .line 166
    iget-object v2, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 167
    .line 168
    invoke-static {v2}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 169
    .line 170
    .line 171
    :cond_aa
    iput-object v0, p0, Lax/S0/n;->d0:Landroid/opengl/EGLDisplay;

    .line 172
    .line 173
    iput-object v0, p0, Lax/S0/n;->e0:Landroid/opengl/EGLContext;

    .line 174
    .line 175
    iput-object v0, p0, Lax/S0/n;->f0:Landroid/opengl/EGLSurface;

    .line 176
    .line 177
    iput-object v0, p0, Lax/S0/n;->g0:Landroid/graphics/SurfaceTexture;

    .line 178
    .line 179
    throw v1
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
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/S0/n;->q:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 4
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

.method public run()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/S0/n;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/S0/n;->g0:Landroid/graphics/SurfaceTexture;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    :try_start_7
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_a} :catch_a

    .line 9
    .line 10
    .line 11
    :catch_a
    :cond_a
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
.end method
