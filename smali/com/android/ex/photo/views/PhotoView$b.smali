.class Lcom/android/ex/photo/views/PhotoView$b;
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
    name = "b"
.end annotation


# instance fields
.field private c0:F

.field private d0:F

.field private e0:F

.field private f0:J

.field private g0:Z

.field private h0:Z

.field private final q:Lcom/android/ex/photo/views/PhotoView;


# direct methods
.method public constructor <init>(Lcom/android/ex/photo/views/PhotoView;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->q:Lcom/android/ex/photo/views/PhotoView;

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


# virtual methods
.method public a(F)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->g0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->c0:F

    .line 7
    .line 8
    const/high16 v0, 0x43fa0000    # 500.0f

    .line 9
    .line 10
    div-float/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->e0:F

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->d0:F

    .line 15
    .line 16
    const-wide/16 v0, -0x1

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->f0:J

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->h0:Z

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->g0:Z

    .line 25
    .line 26
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView$b;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method public b()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->g0:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->h0:Z

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
    .registers 8

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->h0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_57

    .line 6
    :cond_5
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->d0:F

    .line 7
    .line 8
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$b;->c0:F

    .line 9
    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-eqz v0, :cond_53

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-wide v2, p0, Lcom/android/ex/photo/views/PhotoView$b;->f0:J

    .line 19
    .line 20
    const-wide/16 v4, -0x1

    .line 21
    .line 22
    cmp-long v6, v2, v4

    .line 23
    .line 24
    if-eqz v6, :cond_1c

    .line 25
    .line 26
    sub-long v2, v0, v2

    .line 27
    .line 28
    goto :goto_1e

    .line 29
    :cond_1c
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    :goto_1e
    iget v4, p0, Lcom/android/ex/photo/views/PhotoView$b;->e0:F

    .line 32
    .line 33
    long-to-float v2, v2

    .line 34
    mul-float v4, v4, v2

    .line 35
    .line 36
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView$b;->d0:F

    .line 37
    .line 38
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$b;->c0:F

    .line 39
    .line 40
    cmpg-float v5, v2, v3

    .line 41
    .line 42
    if-gez v5, :cond_31

    .line 43
    .line 44
    add-float v5, v2, v4

    .line 45
    .line 46
    cmpl-float v5, v5, v3

    .line 47
    .line 48
    if-gtz v5, :cond_3b

    .line 49
    .line 50
    :cond_31
    cmpl-float v5, v2, v3

    .line 51
    .line 52
    if-lez v5, :cond_3d

    .line 53
    .line 54
    add-float v5, v2, v4

    .line 55
    .line 56
    cmpg-float v5, v5, v3

    .line 57
    .line 58
    if-gez v5, :cond_3d

    .line 59
    .line 60
    :cond_3b
    sub-float v4, v3, v2

    .line 61
    .line 62
    :cond_3d
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView$b;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-static {v2, v4, v3}, Lcom/android/ex/photo/views/PhotoView;->d(Lcom/android/ex/photo/views/PhotoView;FZ)V

    .line 66
    .line 67
    .line 68
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView$b;->d0:F

    .line 69
    .line 70
    add-float/2addr v2, v4

    .line 71
    iput v2, p0, Lcom/android/ex/photo/views/PhotoView$b;->d0:F

    .line 72
    .line 73
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$b;->c0:F

    .line 74
    .line 75
    cmpl-float v2, v2, v3

    .line 76
    .line 77
    if-nez v2, :cond_51

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/android/ex/photo/views/PhotoView$b;->b()V

    .line 80
    .line 81
    .line 82
    :cond_51
    iput-wide v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->f0:J

    .line 83
    .line 84
    :cond_53
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->h0:Z

    .line 85
    .line 86
    if-eqz v0, :cond_58

    .line 87
    .line 88
    :goto_57
    return-void

    .line 89
    :cond_58
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView$b;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 92
    .line 93
    .line 94
    return-void
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
