.class Lcom/android/ex/photo/views/PhotoView$d;
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
    name = "d"
.end annotation


# instance fields
.field private c0:F

.field private d0:F

.field private e0:J

.field private f0:Z

.field private g0:Z

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
    iput-wide v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->e0:J

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView$d;->q:Lcom/android/ex/photo/views/PhotoView;

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


# virtual methods
.method public a(FF)Z
    .registers 7

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->f0:Z

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
    iput-wide v2, p0, Lcom/android/ex/photo/views/PhotoView$d;->e0:J

    .line 10
    .line 11
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 12
    .line 13
    iput p2, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView$d;->g0:Z

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView$d;->f0:Z

    .line 19
    .line 20
    iget-object p2, p0, Lcom/android/ex/photo/views/PhotoView$d;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 21
    .line 22
    const-wide/16 v0, 0xfa

    .line 23
    .line 24
    invoke-virtual {p2, p0, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 25
    .line 26
    .line 27
    return p1
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

.method public b()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->f0:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->g0:Z

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
    .registers 11

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->g0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    goto/16 :goto_86

    .line 6
    .line 7
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lcom/android/ex/photo/views/PhotoView$d;->e0:J

    .line 12
    .line 13
    const-wide/16 v4, -0x1

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    cmp-long v7, v2, v4

    .line 17
    .line 18
    if-eqz v7, :cond_17

    .line 19
    .line 20
    sub-long v7, v0, v2

    .line 21
    .line 22
    long-to-float v7, v7

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v7, 0x0

    .line 25
    :goto_18
    cmp-long v8, v2, v4

    .line 26
    .line 27
    if-nez v8, :cond_1e

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->e0:J

    .line 30
    .line 31
    :cond_1e
    const/high16 v0, 0x42c80000    # 100.0f

    .line 32
    .line 33
    cmpl-float v1, v7, v0

    .line 34
    .line 35
    if-ltz v1, :cond_29

    .line 36
    .line 37
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 38
    .line 39
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 40
    .line 41
    goto :goto_68

    .line 42
    :cond_29
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 43
    .line 44
    sub-float/2addr v0, v7

    .line 45
    div-float/2addr v1, v0

    .line 46
    const/high16 v2, 0x41200000    # 10.0f

    .line 47
    .line 48
    mul-float v1, v1, v2

    .line 49
    .line 50
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 51
    .line 52
    div-float/2addr v3, v0

    .line 53
    mul-float v0, v3, v2

    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    cmpl-float v2, v2, v3

    .line 66
    .line 67
    if-gtz v2, :cond_4a

    .line 68
    .line 69
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4c

    .line 74
    .line 75
    :cond_4a
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 76
    .line 77
    :cond_4c
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    cmpl-float v2, v2, v3

    .line 88
    .line 89
    if-gtz v2, :cond_65

    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_61

    .line 96
    .line 97
    goto :goto_65

    .line 98
    :cond_61
    :goto_61
    move v9, v1

    .line 99
    move v1, v0

    .line 100
    move v0, v9

    .line 101
    goto :goto_68

    .line 102
    :cond_65
    :goto_65
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 103
    .line 104
    goto :goto_61

    .line 105
    :goto_68
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView$d;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 106
    .line 107
    invoke-static {v2, v0, v1}, Lcom/android/ex/photo/views/PhotoView;->b(Lcom/android/ex/photo/views/PhotoView;FF)I

    .line 108
    .line 109
    .line 110
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 111
    .line 112
    sub-float/2addr v2, v0

    .line 113
    iput v2, p0, Lcom/android/ex/photo/views/PhotoView$d;->c0:F

    .line 114
    .line 115
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 116
    .line 117
    sub-float/2addr v0, v1

    .line 118
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->d0:F

    .line 119
    .line 120
    cmpl-float v1, v2, v6

    .line 121
    .line 122
    if-nez v1, :cond_82

    .line 123
    .line 124
    cmpl-float v0, v0, v6

    .line 125
    .line 126
    if-nez v0, :cond_82

    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/android/ex/photo/views/PhotoView$d;->b()V

    .line 129
    .line 130
    .line 131
    :cond_82
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->g0:Z

    .line 132
    .line 133
    if-eqz v0, :cond_87

    .line 134
    .line 135
    :goto_86
    return-void

    .line 136
    :cond_87
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView$d;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 137
    .line 138
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 139
    .line 140
    .line 141
    return-void
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
.end method
