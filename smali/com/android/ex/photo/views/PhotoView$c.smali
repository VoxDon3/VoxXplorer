.class Lcom/android/ex/photo/views/PhotoView$c;
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
    name = "c"
.end annotation


# instance fields
.field private c0:F

.field private d0:F

.field private e0:Z

.field private f0:F

.field private g0:F

.field private h0:F

.field private i0:J

.field private j0:Z

.field private k0:Z

.field private final q:Lcom/android/ex/photo/views/PhotoView;


# direct methods
.method public constructor <init>(Lcom/android/ex/photo/views/PhotoView;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView$c;->q:Lcom/android/ex/photo/views/PhotoView;

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

.method static synthetic a(Lcom/android/ex/photo/views/PhotoView$c;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/android/ex/photo/views/PhotoView$c;->j0:Z

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
.method public b(FFFF)Z
    .registers 7

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->j0:Z

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
    iput p3, p0, Lcom/android/ex/photo/views/PhotoView$c;->c0:F

    .line 8
    .line 9
    iput p4, p0, Lcom/android/ex/photo/views/PhotoView$c;->d0:F

    .line 10
    .line 11
    iput p2, p0, Lcom/android/ex/photo/views/PhotoView$c;->f0:F

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    iput-wide p2, p0, Lcom/android/ex/photo/views/PhotoView$c;->i0:J

    .line 18
    .line 19
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView$c;->g0:F

    .line 20
    .line 21
    iget p2, p0, Lcom/android/ex/photo/views/PhotoView$c;->f0:F

    .line 22
    .line 23
    const/4 p3, 0x1

    .line 24
    cmpl-float p4, p2, p1

    .line 25
    .line 26
    if-lez p4, :cond_1d

    .line 27
    .line 28
    const/4 p4, 0x1

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 p4, 0x0

    .line 31
    :goto_1e
    iput-boolean p4, p0, Lcom/android/ex/photo/views/PhotoView$c;->e0:Z

    .line 32
    .line 33
    sub-float/2addr p2, p1

    .line 34
    const/high16 p1, 0x43480000    # 200.0f

    .line 35
    .line 36
    div-float/2addr p2, p1

    .line 37
    iput p2, p0, Lcom/android/ex/photo/views/PhotoView$c;->h0:F

    .line 38
    .line 39
    iput-boolean p3, p0, Lcom/android/ex/photo/views/PhotoView$c;->j0:Z

    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView$c;->k0:Z

    .line 42
    .line 43
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView$c;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    return p3
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

.method public c()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->j0:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->k0:Z

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
    .registers 5

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->k0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_43

    .line 6
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, Lcom/android/ex/photo/views/PhotoView$c;->i0:J

    .line 11
    .line 12
    sub-long/2addr v0, v2

    .line 13
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView$c;->g0:F

    .line 14
    .line 15
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$c;->h0:F

    .line 16
    .line 17
    long-to-float v0, v0

    .line 18
    mul-float v3, v3, v0

    .line 19
    .line 20
    add-float/2addr v2, v3

    .line 21
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 22
    .line 23
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView$c;->c0:F

    .line 24
    .line 25
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$c;->d0:F

    .line 26
    .line 27
    invoke-static {v0, v2, v1, v3}, Lcom/android/ex/photo/views/PhotoView;->a(Lcom/android/ex/photo/views/PhotoView;FFF)V

    .line 28
    .line 29
    .line 30
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->f0:F

    .line 31
    .line 32
    cmpl-float v1, v2, v0

    .line 33
    .line 34
    if-eqz v1, :cond_2e

    .line 35
    .line 36
    iget-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView$c;->e0:Z

    .line 37
    .line 38
    cmpl-float v2, v2, v0

    .line 39
    .line 40
    if-lez v2, :cond_2b

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v2, 0x0

    .line 45
    :goto_2c
    if-ne v1, v2, :cond_3a

    .line 46
    .line 47
    :cond_2e
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView$c;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 48
    .line 49
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView$c;->c0:F

    .line 50
    .line 51
    iget v3, p0, Lcom/android/ex/photo/views/PhotoView$c;->d0:F

    .line 52
    .line 53
    invoke-static {v1, v0, v2, v3}, Lcom/android/ex/photo/views/PhotoView;->a(Lcom/android/ex/photo/views/PhotoView;FFF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/android/ex/photo/views/PhotoView$c;->c()V

    .line 57
    .line 58
    .line 59
    :cond_3a
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->k0:Z

    .line 60
    .line 61
    if-nez v0, :cond_43

    .line 62
    .line 63
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView$c;->q:Lcom/android/ex/photo/views/PhotoView;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    :cond_43
    :goto_43
    return-void
.end method
