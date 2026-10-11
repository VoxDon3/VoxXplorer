.class final Lax/o1/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o1/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final k:[F

.field private static final l:[F

.field private static final m:[F

.field private static final n:[Ljava/lang/String;

.field private static final o:Ljava/nio/FloatBuffer;


# instance fields
.field private final a:Landroid/opengl/GLSurfaceView;

.field private final b:[I

.field private final c:[I

.field private final d:[I

.field private final e:[I

.field private final f:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/media3/decoder/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:[Ljava/nio/FloatBuffer;

.field private h:Lax/S0/o;

.field private i:I

.field private j:Landroidx/media3/decoder/b;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_32

    .line 6
    .line 7
    .line 8
    sput-object v1, Lax/o1/x$a;->k:[F

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    fill-array-data v1, :array_48

    .line 13
    .line 14
    .line 15
    sput-object v1, Lax/o1/x$a;->l:[F

    .line 16
    .line 17
    new-array v0, v0, [F

    .line 18
    .line 19
    fill-array-data v0, :array_5e

    .line 20
    .line 21
    .line 22
    sput-object v0, Lax/o1/x$a;->m:[F

    .line 23
    .line 24
    const-string v0, "u_tex"

    .line 25
    .line 26
    const-string v1, "v_tex"

    .line 27
    .line 28
    const-string v2, "y_tex"

    .line 29
    .line 30
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lax/o1/x$a;->n:[Ljava/lang/String;

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    new-array v0, v0, [F

    .line 39
    .line 40
    fill-array-data v0, :array_74

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lax/S0/p;->e([F)Ljava/nio/FloatBuffer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lax/o1/x$a;->o:Ljava/nio/FloatBuffer;

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_32
    .array-data 4
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x0
        -0x41374bc7    # -0.392f
        0x40011687    # 2.017f
        0x3fcc49ba    # 1.596f
        -0x40afdf3b    # -0.813f
        0x0
    .end array-data

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
    :array_48
    .array-data 4
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x0
        -0x41a5e354    # -0.213f
        0x40072b02    # 2.112f
        0x3fe58106    # 1.793f
        -0x40f78d50    # -0.533f
        0x0
    .end array-data

    :array_5e
    .array-data 4
        0x3f958106    # 1.168f
        0x3f958106    # 1.168f
        0x3f958106    # 1.168f
        0x0
        -0x41bf7cee    # -0.188f
        0x400978d5    # 2.148f
        0x3fd76c8b    # 1.683f
        -0x40d91687    # -0.652f
        0x0
    .end array-data

    :array_74
    .array-data 4
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/opengl/GLSurfaceView;)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/o1/x$a;->a:Landroid/opengl/GLSurfaceView;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    new-array v0, p1, [I

    .line 8
    .line 9
    iput-object v0, p0, Lax/o1/x$a;->b:[I

    .line 10
    .line 11
    new-array v0, p1, [I

    .line 12
    .line 13
    iput-object v0, p0, Lax/o1/x$a;->c:[I

    .line 14
    .line 15
    new-array v0, p1, [I

    .line 16
    .line 17
    iput-object v0, p0, Lax/o1/x$a;->d:[I

    .line 18
    .line 19
    new-array v0, p1, [I

    .line 20
    .line 21
    iput-object v0, p0, Lax/o1/x$a;->e:[I

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lax/o1/x$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    new-array v0, p1, [Ljava/nio/FloatBuffer;

    .line 31
    .line 32
    iput-object v0, p0, Lax/o1/x$a;->g:[Ljava/nio/FloatBuffer;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    :goto_22
    if-ge v0, p1, :cond_30

    .line 36
    .line 37
    iget-object v1, p0, Lax/o1/x$a;->d:[I

    .line 38
    .line 39
    iget-object v2, p0, Lax/o1/x$a;->e:[I

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    aput v3, v2, v0

    .line 43
    .line 44
    aput v3, v1, v0

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_22

    .line 49
    :cond_30
    return-void
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

.method private b()V
    .registers 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/o1/x$a;->b:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 6
    .line 7
    .line 8
    :goto_7
    if-ge v1, v2, :cond_2d

    .line 9
    .line 10
    iget-object v0, p0, Lax/o1/x$a;->h:Lax/S0/o;

    .line 11
    .line 12
    sget-object v3, Lax/o1/x$a;->n:[Ljava/lang/String;

    .line 13
    .line 14
    aget-object v3, v3, v1

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Lax/S0/o;->j(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 21
    .line 22
    .line 23
    const v0, 0x84c0

    .line 24
    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lax/o1/x$a;->b:[I

    .line 31
    .line 32
    aget v0, v0, v1

    .line 33
    .line 34
    const/16 v3, 0x2601

    .line 35
    .line 36
    const/16 v4, 0xde1

    .line 37
    .line 38
    invoke-static {v4, v0, v3}, Lax/S0/p;->a(III)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_7

    .line 44
    :catch_2b
    move-exception v0

    .line 45
    goto :goto_31

    .line 46
    :cond_2d
    invoke-static {}, Lax/S0/p;->b()V
    :try_end_30
    .catch Lax/S0/p$a; {:try_start_0 .. :try_end_30} :catch_2b

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_31
    const-string v1, "VideoDecoderGLSV"

    .line 51
    .line 52
    const-string v2, "Failed to set up the textures"

    .line 53
    .line 54
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    return-void
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
.method public a(Landroidx/media3/decoder/b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/x$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/media3/decoder/b;

    .line 8
    .line 9
    if-eqz p1, :cond_d

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/decoder/b;->B()V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-object p1, p0, Lax/o1/x$a;->a:Landroid/opengl/GLSurfaceView;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .registers 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x1

    .line 12
    iget-object v9, v1, Lax/o1/x$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v9

    .line 19
    check-cast v9, Landroidx/media3/decoder/b;

    .line 20
    .line 21
    if-nez v9, :cond_1c

    .line 22
    .line 23
    iget-object v10, v1, Lax/o1/x$a;->j:Landroidx/media3/decoder/b;

    .line 24
    .line 25
    if-nez v10, :cond_1c

    .line 26
    .line 27
    goto/16 :goto_108

    .line 28
    .line 29
    :cond_1c
    if-eqz v9, :cond_27

    .line 30
    .line 31
    iget-object v10, v1, Lax/o1/x$a;->j:Landroidx/media3/decoder/b;

    .line 32
    .line 33
    if-eqz v10, :cond_25

    .line 34
    .line 35
    invoke-virtual {v10}, Landroidx/media3/decoder/b;->B()V

    .line 36
    .line 37
    .line 38
    :cond_25
    iput-object v9, v1, Lax/o1/x$a;->j:Landroidx/media3/decoder/b;

    .line 39
    .line 40
    :cond_27
    iget-object v9, v1, Lax/o1/x$a;->j:Landroidx/media3/decoder/b;

    .line 41
    .line 42
    invoke-static {v9}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    check-cast v9, Landroidx/media3/decoder/b;

    .line 47
    .line 48
    sget-object v10, Lax/o1/x$a;->l:[F

    .line 49
    .line 50
    iget v11, v9, Landroidx/media3/decoder/b;->j0:I

    .line 51
    .line 52
    if-eq v11, v8, :cond_3b

    .line 53
    .line 54
    if-eq v11, v6, :cond_38

    .line 55
    .line 56
    goto :goto_3d

    .line 57
    :cond_38
    sget-object v10, Lax/o1/x$a;->m:[F

    .line 58
    .line 59
    goto :goto_3d

    .line 60
    :cond_3b
    sget-object v10, Lax/o1/x$a;->k:[F

    .line 61
    .line 62
    :goto_3d
    iget v11, v1, Lax/o1/x$a;->i:I

    .line 63
    .line 64
    invoke-static {v11, v8, v5, v10, v5}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 65
    .line 66
    .line 67
    iget-object v10, v9, Landroidx/media3/decoder/b;->i0:[I

    .line 68
    .line 69
    invoke-static {v10}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    check-cast v10, [I

    .line 74
    .line 75
    iget-object v11, v9, Landroidx/media3/decoder/b;->h0:[Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    invoke-static {v11}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    check-cast v11, [Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    :goto_53
    if-ge v12, v6, :cond_86

    .line 85
    .line 86
    iget v13, v9, Landroidx/media3/decoder/b;->g0:I

    .line 87
    .line 88
    if-nez v12, :cond_5c

    .line 89
    .line 90
    :goto_59
    move/from16 v18, v13

    .line 91
    .line 92
    goto :goto_5f

    .line 93
    :cond_5c
    add-int/2addr v13, v8

    .line 94
    div-int/2addr v13, v4

    .line 95
    goto :goto_59

    .line 96
    :goto_5f
    const v13, 0x84c0

    .line 97
    .line 98
    .line 99
    add-int/2addr v13, v12

    .line 100
    invoke-static {v13}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 101
    .line 102
    .line 103
    iget-object v13, v1, Lax/o1/x$a;->b:[I

    .line 104
    .line 105
    aget v13, v13, v12

    .line 106
    .line 107
    const/16 v14, 0xde1

    .line 108
    .line 109
    invoke-static {v14, v13}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 110
    .line 111
    .line 112
    const/16 v13, 0xcf5

    .line 113
    .line 114
    invoke-static {v13, v8}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    .line 115
    .line 116
    .line 117
    aget v17, v10, v12

    .line 118
    .line 119
    const/16 v21, 0x1401

    .line 120
    .line 121
    aget-object v22, v11, v12

    .line 122
    .line 123
    const/4 v15, 0x0

    .line 124
    const/16 v16, 0x1909

    .line 125
    .line 126
    const/16 v19, 0x0

    .line 127
    .line 128
    const/16 v20, 0x1909

    .line 129
    .line 130
    invoke-static/range {v14 .. v22}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 131
    .line 132
    .line 133
    add-int/2addr v12, v8

    .line 134
    goto :goto_53

    .line 135
    :cond_86
    new-array v11, v6, [I

    .line 136
    .line 137
    iget v9, v9, Landroidx/media3/decoder/b;->f0:I

    .line 138
    .line 139
    aput v9, v11, v5

    .line 140
    .line 141
    add-int/2addr v9, v8

    .line 142
    div-int/2addr v9, v4

    .line 143
    aput v9, v11, v4

    .line 144
    .line 145
    aput v9, v11, v8

    .line 146
    .line 147
    const/4 v9, 0x0

    .line 148
    :goto_93
    if-ge v9, v6, :cond_f4

    .line 149
    .line 150
    iget-object v12, v1, Lax/o1/x$a;->d:[I

    .line 151
    .line 152
    aget v12, v12, v9

    .line 153
    .line 154
    aget v13, v11, v9

    .line 155
    .line 156
    if-ne v12, v13, :cond_a5

    .line 157
    .line 158
    iget-object v12, v1, Lax/o1/x$a;->e:[I

    .line 159
    .line 160
    aget v12, v12, v9

    .line 161
    .line 162
    aget v13, v10, v9

    .line 163
    .line 164
    if-eq v12, v13, :cond_f2

    .line 165
    .line 166
    :cond_a5
    aget v12, v10, v9

    .line 167
    .line 168
    if-eqz v12, :cond_ab

    .line 169
    .line 170
    const/4 v12, 0x1

    .line 171
    goto :goto_ac

    .line 172
    :cond_ab
    const/4 v12, 0x0

    .line 173
    :goto_ac
    invoke-static {v12}, Lax/S0/a;->g(Z)V

    .line 174
    .line 175
    .line 176
    aget v12, v11, v9

    .line 177
    .line 178
    int-to-float v12, v12

    .line 179
    aget v13, v10, v9

    .line 180
    .line 181
    int-to-float v13, v13

    .line 182
    div-float/2addr v12, v13

    .line 183
    iget-object v13, v1, Lax/o1/x$a;->g:[Ljava/nio/FloatBuffer;

    .line 184
    .line 185
    const/16 v14, 0x8

    .line 186
    .line 187
    new-array v14, v14, [F

    .line 188
    .line 189
    aput v7, v14, v5

    .line 190
    .line 191
    aput v7, v14, v8

    .line 192
    .line 193
    aput v7, v14, v4

    .line 194
    .line 195
    aput v3, v14, v6

    .line 196
    .line 197
    aput v12, v14, v2

    .line 198
    .line 199
    aput v7, v14, v0

    .line 200
    .line 201
    const/4 v15, 0x6

    .line 202
    aput v12, v14, v15

    .line 203
    .line 204
    const/4 v12, 0x7

    .line 205
    aput v3, v14, v12

    .line 206
    .line 207
    invoke-static {v14}, Lax/S0/p;->e([F)Ljava/nio/FloatBuffer;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    aput-object v12, v13, v9

    .line 212
    .line 213
    iget-object v12, v1, Lax/o1/x$a;->c:[I

    .line 214
    .line 215
    aget v13, v12, v9

    .line 216
    .line 217
    iget-object v12, v1, Lax/o1/x$a;->g:[Ljava/nio/FloatBuffer;

    .line 218
    .line 219
    aget-object v18, v12, v9

    .line 220
    .line 221
    const/4 v14, 0x2

    .line 222
    const/16 v15, 0x1406

    .line 223
    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    invoke-static/range {v13 .. v18}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 229
    .line 230
    .line 231
    iget-object v12, v1, Lax/o1/x$a;->d:[I

    .line 232
    .line 233
    aget v13, v11, v9

    .line 234
    .line 235
    aput v13, v12, v9

    .line 236
    .line 237
    iget-object v12, v1, Lax/o1/x$a;->e:[I

    .line 238
    .line 239
    aget v13, v10, v9

    .line 240
    .line 241
    aput v13, v12, v9

    .line 242
    .line 243
    :cond_f2
    add-int/2addr v9, v8

    .line 244
    goto :goto_93

    .line 245
    :cond_f4
    const/16 v3, 0x4000

    .line 246
    .line 247
    invoke-static {v3}, Landroid/opengl/GLES20;->glClear(I)V

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v5, v2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 251
    .line 252
    .line 253
    :try_start_fc
    invoke-static {}, Lax/S0/p;->b()V
    :try_end_ff
    .catch Lax/S0/p$a; {:try_start_fc .. :try_end_ff} :catch_100

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :catch_100
    move-exception v0

    .line 258
    const-string v2, "VideoDecoderGLSV"

    .line 259
    .line 260
    const-string v3, "Failed to draw a frame"

    .line 261
    .line 262
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 263
    .line 264
    .line 265
    :goto_108
    return-void
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
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .registers 4

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .registers 9

    .line 1
    :try_start_0
    new-instance p1, Lax/S0/o;

    .line 2
    .line 3
    const-string p2, "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n"

    .line 4
    .line 5
    const-string v0, "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n"

    .line 6
    .line 7
    invoke-direct {p1, p2, v0}, Lax/S0/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lax/o1/x$a;->h:Lax/S0/o;

    .line 11
    .line 12
    const-string p2, "in_pos"

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lax/S0/o;->e(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sget-object v5, Lax/o1/x$a;->o:Ljava/nio/FloatBuffer;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    const/16 v2, 0x1406

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lax/o1/x$a;->c:[I

    .line 29
    .line 30
    iget-object p2, p0, Lax/o1/x$a;->h:Lax/S0/o;

    .line 31
    .line 32
    const-string v0, "in_tc_y"

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Lax/S0/o;->e(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/4 v0, 0x0

    .line 39
    aput p2, p1, v0

    .line 40
    .line 41
    iget-object p1, p0, Lax/o1/x$a;->c:[I

    .line 42
    .line 43
    iget-object p2, p0, Lax/o1/x$a;->h:Lax/S0/o;

    .line 44
    .line 45
    const-string v0, "in_tc_u"

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Lax/S0/o;->e(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    const/4 v0, 0x1

    .line 52
    aput p2, p1, v0

    .line 53
    .line 54
    iget-object p1, p0, Lax/o1/x$a;->c:[I

    .line 55
    .line 56
    iget-object p2, p0, Lax/o1/x$a;->h:Lax/S0/o;

    .line 57
    .line 58
    const-string v0, "in_tc_v"

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Lax/S0/o;->e(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    const/4 v0, 0x2

    .line 65
    aput p2, p1, v0

    .line 66
    .line 67
    iget-object p1, p0, Lax/o1/x$a;->h:Lax/S0/o;

    .line 68
    .line 69
    const-string p2, "mColorConversion"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lax/S0/o;->j(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iput p1, p0, Lax/o1/x$a;->i:I

    .line 76
    .line 77
    invoke-static {}, Lax/S0/p;->b()V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0}, Lax/o1/x$a;->b()V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lax/S0/p;->b()V
    :try_end_55
    .catch Lax/S0/p$a; {:try_start_0 .. :try_end_55} :catch_56

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catch_56
    move-exception v0

    .line 88
    move-object p1, v0

    .line 89
    const-string p2, "VideoDecoderGLSV"

    .line 90
    .line 91
    const-string v0, "Failed to set up the textures and program"

    .line 92
    .line 93
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 94
    .line 95
    .line 96
    return-void
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
