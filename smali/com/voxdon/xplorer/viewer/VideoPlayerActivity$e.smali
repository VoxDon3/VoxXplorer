.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:F

.field b:F

.field c:F

.field d:F

.field final synthetic e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

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


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .registers 10

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_4a

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    goto :goto_4a

    .line 19
    :cond_12
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1b
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->c:F

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sub-float v6, v0, v1

    .line 35
    .line 36
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->d:F

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-float v7, v0, v1

    .line 43
    .line 44
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static/range {v2 .. v7}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;FFFFF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->c:F

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->d:F

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_4a
    :goto_4a
    return v1
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

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_47

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    goto :goto_47

    .line 19
    :cond_12
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 20
    .line 21
    invoke-static {v0}, Lax/t3/l;->v(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1b
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->a:F

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->b:F

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->c:F

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->d:F

    .line 51
    .line 52
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_46

    .line 65
    .line 66
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 69
    .line 70
    .line 71
    :cond_46
    return v0

    .line 72
    :cond_47
    :goto_47
    return v1
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

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_20

    .line 8
    .line 9
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_11

    .line 16
    .line 17
    goto :goto_20

    .line 18
    :cond_11
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->e:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->a:F

    .line 26
    .line 27
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->b:F

    .line 28
    .line 29
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->c:F

    .line 30
    .line 31
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;->d:F

    .line 32
    .line 33
    :cond_20
    :goto_20
    return-void
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
