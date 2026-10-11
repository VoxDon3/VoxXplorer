.class public Lcom/voxdon/xplorer/viewer/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/viewer/a$b;,
        Lcom/voxdon/xplorer/viewer/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:F

.field private final c:Landroid/os/Handler;

.field private final d:Lcom/voxdon/xplorer/viewer/a$b;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Landroid/view/MotionEvent;

.field private i:Landroid/view/MotionEvent;

.field private j:Landroid/view/MotionEvent;

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:I

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;FLcom/voxdon/xplorer/viewer/a$b;)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, p3, v0, v1}, Lcom/voxdon/xplorer/viewer/a;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/viewer/a$b;Landroid/os/Handler;I)V

    .line 2
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p2

    float-to-int p1, p1

    iput p1, p0, Lcom/voxdon/xplorer/viewer/a;->o:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/viewer/a$b;Landroid/os/Handler;I)V
    .registers 5

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_d

    .line 4
    new-instance p4, Lcom/voxdon/xplorer/viewer/a$a;

    invoke-direct {p4, p0, p3}, Lcom/voxdon/xplorer/viewer/a$a;-><init>(Lcom/voxdon/xplorer/viewer/a;Landroid/os/Handler;)V

    iput-object p4, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    goto :goto_14

    .line 5
    :cond_d
    new-instance p3, Lcom/voxdon/xplorer/viewer/a$a;

    invoke-direct {p3, p0}, Lcom/voxdon/xplorer/viewer/a$a;-><init>(Lcom/voxdon/xplorer/viewer/a;)V

    iput-object p3, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 6
    :goto_14
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/a;->d:Lcom/voxdon/xplorer/viewer/a$b;

    .line 7
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/a;->f(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/voxdon/xplorer/viewer/a;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->d()V

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
    .line 22
.end method

.method private b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->e:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->g:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private c()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->g:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 11
    .line 12
    return-void
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

.method private d()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/a;->d:Lcom/voxdon/xplorer/viewer/a$b;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/a;->h:Landroid/view/MotionEvent;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/voxdon/xplorer/viewer/a$b;->a(Landroid/view/MotionEvent;)V

    .line 9
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
.end method

.method private e()I
    .registers 2

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/a;->o:I

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

.method private f(Landroid/content/Context;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/a;->d:Lcom/voxdon/xplorer/viewer/a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_30

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->p:Z

    .line 7
    .line 8
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1e

    .line 19
    .line 20
    if-lt v1, v2, :cond_1c

    .line 21
    .line 22
    invoke-static {p1}, Lax/w3/b;->a(Landroid/view/ViewConfiguration;)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lcom/voxdon/xplorer/viewer/a;->b:F

    .line 27
    .line 28
    goto :goto_2b

    .line 29
    :cond_1c
    const/16 p1, 0x1d

    .line 30
    .line 31
    if-lt v1, p1, :cond_27

    .line 32
    .line 33
    invoke-static {}, Lax/w3/c;->a()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lcom/voxdon/xplorer/viewer/a;->b:F

    .line 38
    .line 39
    goto :goto_2b

    .line 40
    :cond_27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    iput p1, p0, Lcom/voxdon/xplorer/viewer/a;->b:F

    .line 43
    .line 44
    :goto_2b
    mul-int v0, v0, v0

    .line 45
    .line 46
    iput v0, p0, Lcom/voxdon/xplorer/viewer/a;->a:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    const-string v0, "OnGestureListener must not be null"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public g(Landroid/view/MotionEvent;)Z
    .registers 14

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/a;->i:Landroid/view/MotionEvent;

    .line 6
    .line 7
    if-eqz v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 10
    .line 11
    .line 12
    :cond_b
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/a;->i:Landroid/view/MotionEvent;

    .line 17
    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-ne v0, v1, :cond_1a

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v4, 0x0

    .line 28
    :goto_1b
    if-eqz v4, :cond_22

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    goto :goto_23

    .line 35
    :cond_22
    const/4 v5, -0x1

    .line 36
    :goto_23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    :goto_2a
    if-ge v9, v6, :cond_3c

    .line 44
    .line 45
    if-ne v5, v9, :cond_2f

    .line 46
    .line 47
    goto :goto_39

    .line 48
    :cond_2f
    invoke-virtual {p1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    add-float/2addr v7, v10

    .line 53
    invoke-virtual {p1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    add-float/2addr v8, v10

    .line 58
    :goto_39
    add-int/lit8 v9, v9, 0x1

    .line 59
    .line 60
    goto :goto_2a

    .line 61
    :cond_3c
    if-eqz v4, :cond_41

    .line 62
    .line 63
    add-int/lit8 v4, v6, -0x1

    .line 64
    .line 65
    goto :goto_42

    .line 66
    :cond_41
    move v4, v6

    .line 67
    :goto_42
    int-to-float v4, v4

    .line 68
    div-float/2addr v7, v4

    .line 69
    div-float/2addr v8, v4

    .line 70
    if-eqz v0, :cond_124

    .line 71
    .line 72
    const/4 v4, 0x2

    .line 73
    if-eq v0, v2, :cond_109

    .line 74
    .line 75
    if-eq v0, v4, :cond_a1

    .line 76
    .line 77
    const/4 p1, 0x3

    .line 78
    if-eq v0, p1, :cond_9d

    .line 79
    .line 80
    const/4 p1, 0x5

    .line 81
    if-eq v0, p1, :cond_64

    .line 82
    .line 83
    if-eq v0, v1, :cond_56

    .line 84
    .line 85
    goto/16 :goto_108

    .line 86
    .line 87
    :cond_56
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->k:F

    .line 88
    .line 89
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->m:F

    .line 90
    .line 91
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->l:F

    .line 92
    .line 93
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->n:F

    .line 94
    .line 95
    if-ne v6, v4, :cond_108

    .line 96
    .line 97
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->c()V

    .line 98
    .line 99
    .line 100
    return v3

    .line 101
    :cond_64
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->k:F

    .line 102
    .line 103
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->m:F

    .line 104
    .line 105
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->l:F

    .line 106
    .line 107
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->n:F

    .line 108
    .line 109
    if-ne v6, v4, :cond_99

    .line 110
    .line 111
    iget-boolean p1, p0, Lcom/voxdon/xplorer/viewer/a;->p:Z

    .line 112
    .line 113
    if-eqz p1, :cond_108

    .line 114
    .line 115
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 116
    .line 117
    invoke-virtual {p1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->h:Landroid/view/MotionEvent;

    .line 121
    .line 122
    if-eqz p1, :cond_86

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->e()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    :goto_83
    int-to-long v5, p1

    .line 133
    add-long/2addr v0, v5

    .line 134
    goto :goto_8f

    .line 135
    :cond_86
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->e()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    goto :goto_83

    .line 144
    :goto_8f
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 145
    .line 146
    invoke-virtual {p1, v4, v3, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 151
    .line 152
    .line 153
    return v3

    .line 154
    :cond_99
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->c()V

    .line 155
    .line 156
    .line 157
    return v3

    .line 158
    :cond_9d
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->b()V

    .line 159
    .line 160
    .line 161
    return v3

    .line 162
    :cond_a1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 163
    .line 164
    if-eqz v0, :cond_a6

    .line 165
    .line 166
    goto :goto_108

    .line 167
    :cond_a6
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->g:Z

    .line 168
    .line 169
    if-eqz v0, :cond_108

    .line 170
    .line 171
    iget v0, p0, Lcom/voxdon/xplorer/viewer/a;->m:F

    .line 172
    .line 173
    sub-float v0, v7, v0

    .line 174
    .line 175
    float-to-int v0, v0

    .line 176
    iget v1, p0, Lcom/voxdon/xplorer/viewer/a;->n:F

    .line 177
    .line 178
    sub-float v1, v8, v1

    .line 179
    .line 180
    float-to-int v1, v1

    .line 181
    mul-int v0, v0, v0

    .line 182
    .line 183
    mul-int v1, v1, v1

    .line 184
    .line 185
    add-int/2addr v0, v1

    .line 186
    iget v1, p0, Lcom/voxdon/xplorer/viewer/a;->a:I

    .line 187
    .line 188
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 189
    .line 190
    const/16 v6, 0x1d

    .line 191
    .line 192
    if-lt v5, v6, :cond_fb

    .line 193
    .line 194
    invoke-static {p1}, Lax/w3/a;->a(Landroid/view/MotionEvent;)I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    iget-object v6, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 199
    .line 200
    invoke-virtual {v6, v4}, Landroid/os/Handler;->hasMessages(I)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-ne v5, v2, :cond_ce

    .line 205
    .line 206
    goto :goto_cf

    .line 207
    :cond_ce
    const/4 v2, 0x0

    .line 208
    :goto_cf
    if-eqz v6, :cond_fb

    .line 209
    .line 210
    if-eqz v2, :cond_fb

    .line 211
    .line 212
    if-le v0, v1, :cond_f3

    .line 213
    .line 214
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/a;->e()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    int-to-long v5, v2

    .line 224
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 225
    .line 226
    invoke-virtual {v2, v4, v3, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 231
    .line 232
    .line 233
    move-result-wide v10

    .line 234
    long-to-float p1, v5

    .line 235
    iget v5, p0, Lcom/voxdon/xplorer/viewer/a;->b:F

    .line 236
    .line 237
    mul-float p1, p1, v5

    .line 238
    .line 239
    float-to-long v5, p1

    .line 240
    add-long/2addr v10, v5

    .line 241
    invoke-virtual {v2, v9, v10, v11}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 242
    .line 243
    .line 244
    :cond_f3
    int-to-float p1, v1

    .line 245
    iget v1, p0, Lcom/voxdon/xplorer/viewer/a;->b:F

    .line 246
    .line 247
    mul-float v1, v1, v1

    .line 248
    .line 249
    mul-float p1, p1, v1

    .line 250
    .line 251
    float-to-int v1, p1

    .line 252
    :cond_fb
    if-le v0, v1, :cond_108

    .line 253
    .line 254
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->k:F

    .line 255
    .line 256
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->l:F

    .line 257
    .line 258
    iput-boolean v3, p0, Lcom/voxdon/xplorer/viewer/a;->g:Z

    .line 259
    .line 260
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 261
    .line 262
    invoke-virtual {p1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 263
    .line 264
    .line 265
    :cond_108
    :goto_108
    return v3

    .line 266
    :cond_109
    iput-boolean v3, p0, Lcom/voxdon/xplorer/viewer/a;->e:Z

    .line 267
    .line 268
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 273
    .line 274
    if-eqz v0, :cond_115

    .line 275
    .line 276
    iput-boolean v3, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 277
    .line 278
    :cond_115
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/a;->j:Landroid/view/MotionEvent;

    .line 279
    .line 280
    if-eqz v0, :cond_11c

    .line 281
    .line 282
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 283
    .line 284
    .line 285
    :cond_11c
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->j:Landroid/view/MotionEvent;

    .line 286
    .line 287
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->c:Landroid/os/Handler;

    .line 288
    .line 289
    invoke-virtual {p1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 290
    .line 291
    .line 292
    return v3

    .line 293
    :cond_124
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->k:F

    .line 294
    .line 295
    iput v7, p0, Lcom/voxdon/xplorer/viewer/a;->m:F

    .line 296
    .line 297
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->l:F

    .line 298
    .line 299
    iput v8, p0, Lcom/voxdon/xplorer/viewer/a;->n:F

    .line 300
    .line 301
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/a;->h:Landroid/view/MotionEvent;

    .line 302
    .line 303
    if-eqz v0, :cond_133

    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 306
    .line 307
    .line 308
    :cond_133
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/a;->h:Landroid/view/MotionEvent;

    .line 313
    .line 314
    iput-boolean v2, p0, Lcom/voxdon/xplorer/viewer/a;->g:Z

    .line 315
    .line 316
    iput-boolean v2, p0, Lcom/voxdon/xplorer/viewer/a;->e:Z

    .line 317
    .line 318
    iput-boolean v3, p0, Lcom/voxdon/xplorer/viewer/a;->f:Z

    .line 319
    .line 320
    return v3
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
