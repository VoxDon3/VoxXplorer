.class Lcom/android/ex/photo/views/PhotoView$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/ex/photo/views/PhotoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private c0:F

.field private d0:F

.field private e0:F

.field private f0:F

.field private g0:J

.field private h0:Z

.field private i0:Z

.field private final q:Lcom/android/ex/photo/views/PhotoView;


# direct methods
.method public constructor <init>(Lcom/android/ex/photo/views/PhotoView;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->g0:J

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView$e;->q:Lcom/android/ex/photo/views/PhotoView;

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

.method static synthetic a(Lcom/android/ex/photo/views/PhotoView$e;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/android/ex/photo/views/PhotoView$e;->h0:Z

    .line 2
    .line 3
    return p0
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


# virtual methods
.method public b(FF)Z
    .registers 9

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->h0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    iput-wide v2, p0, Lcom/android/ex/photo/views/PhotoView$e;->g0:J

    .line 10
    .line 11
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 12
    .line 13
    iput p2, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 14
    .line 15
    float-to-double v2, p2

    .line 16
    float-to-double p1, p1

    .line 17
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    double-to-float p1, p1

    .line 22
    float-to-double p1, p1

    .line 23
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    mul-double v2, v2, v4

    .line 33
    .line 34
    double-to-float v0, v2

    .line 35
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->e0:F

    .line 36
    .line 37
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    mul-double p1, p1, v4

    .line 42
    .line 43
    double-to-float p1, p1

    .line 44
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$e;->f0:F

    .line 45
    .line 46
    iput-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->i0:Z

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView$e;->h0:Z

    .line 50
    .line 51
    iget-object p2, p0, Lcom/android/ex/photo/views/PhotoView$e;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 52
    .line 53
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    return p1
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

.method public c()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->h0:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->i0:Z

    .line 6
    .line 7
    return-void
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

.method public run()V
    .registers 10

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    goto/16 :goto_9f

    .line 6
    .line 7
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lcom/android/ex/photo/views/PhotoView$e;->g0:J

    .line 12
    .line 13
    const-wide/16 v4, -0x1

    .line 14
    .line 15
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    cmp-long v8, v2, v4

    .line 19
    .line 20
    if-eqz v8, :cond_1a

    .line 21
    .line 22
    sub-long v2, v0, v2

    .line 23
    .line 24
    long-to-float v2, v2

    .line 25
    div-float/2addr v2, v6

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v2, 0x0

    .line 28
    :goto_1b
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView$e;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 29
    .line 30
    iget v4, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 31
    .line 32
    mul-float v4, v4, v2

    .line 33
    .line 34
    iget v5, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 35
    .line 36
    mul-float v5, v5, v2

    .line 37
    .line 38
    invoke-static {v3, v4, v5}, Lcom/android/ex/photo/views/PhotoView;->b(Lcom/android/ex/photo/views/PhotoView;FF)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iput-wide v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->g0:J

    .line 43
    .line 44
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->e0:F

    .line 45
    .line 46
    mul-float v0, v0, v2

    .line 47
    .line 48
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    cmpl-float v1, v1, v4

    .line 59
    .line 60
    if-lez v1, :cond_43

    .line 61
    .line 62
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 63
    .line 64
    sub-float/2addr v1, v0

    .line 65
    iput v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 66
    .line 67
    goto :goto_45

    .line 68
    :cond_43
    iput v7, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 69
    .line 70
    :goto_45
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->f0:F

    .line 71
    .line 72
    mul-float v0, v0, v2

    .line 73
    .line 74
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    cmpl-float v1, v1, v2

    .line 85
    .line 86
    if-lez v1, :cond_5d

    .line 87
    .line 88
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 89
    .line 90
    sub-float/2addr v1, v0

    .line 91
    iput v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 92
    .line 93
    goto :goto_5f

    .line 94
    :cond_5d
    iput v7, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 95
    .line 96
    :goto_5f
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 97
    .line 98
    cmpl-float v1, v0, v7

    .line 99
    .line 100
    if-nez v1, :cond_6b

    .line 101
    .line 102
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 103
    .line 104
    cmpl-float v1, v1, v7

    .line 105
    .line 106
    if-eqz v1, :cond_6d

    .line 107
    .line 108
    :cond_6b
    if-nez v3, :cond_76

    .line 109
    .line 110
    :cond_6d
    invoke-virtual {p0}, Lcom/android/ex/photo/views/PhotoView$e;->c()V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 114
    .line 115
    invoke-static {v0}, Lcom/android/ex/photo/views/PhotoView;->c(Lcom/android/ex/photo/views/PhotoView;)V

    .line 116
    .line 117
    .line 118
    goto :goto_9b

    .line 119
    :cond_76
    const/4 v1, 0x1

    .line 120
    const/high16 v2, -0x3b860000    # -1000.0f

    .line 121
    .line 122
    if-ne v3, v1, :cond_89

    .line 123
    .line 124
    cmpl-float v0, v0, v7

    .line 125
    .line 126
    if-lez v0, :cond_80

    .line 127
    .line 128
    goto :goto_82

    .line 129
    :cond_80
    const/high16 v6, -0x3b860000    # -1000.0f

    .line 130
    .line 131
    :goto_82
    iput v6, p0, Lcom/android/ex/photo/views/PhotoView$e;->e0:F

    .line 132
    .line 133
    iput v7, p0, Lcom/android/ex/photo/views/PhotoView$e;->f0:F

    .line 134
    .line 135
    iput v7, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 136
    .line 137
    goto :goto_9b

    .line 138
    :cond_89
    const/4 v0, 0x2

    .line 139
    if-ne v3, v0, :cond_9b

    .line 140
    .line 141
    iput v7, p0, Lcom/android/ex/photo/views/PhotoView$e;->e0:F

    .line 142
    .line 143
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->d0:F

    .line 144
    .line 145
    cmpl-float v0, v0, v7

    .line 146
    .line 147
    if-lez v0, :cond_95

    .line 148
    .line 149
    goto :goto_97

    .line 150
    :cond_95
    const/high16 v6, -0x3b860000    # -1000.0f

    .line 151
    .line 152
    :goto_97
    iput v6, p0, Lcom/android/ex/photo/views/PhotoView$e;->f0:F

    .line 153
    .line 154
    iput v7, p0, Lcom/android/ex/photo/views/PhotoView$e;->c0:F

    .line 155
    .line 156
    :cond_9b
    :goto_9b
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->i0:Z

    .line 157
    .line 158
    if-eqz v0, :cond_a0

    .line 159
    .line 160
    :goto_9f
    return-void

    .line 161
    :cond_a0
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView$e;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 162
    .line 163
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 164
    .line 165
    .line 166
    return-void
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
.end method
