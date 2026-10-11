.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/viewer/a;

.field final synthetic b:Landroid/view/GestureDetector;

.field final synthetic c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Lcom/voxdon/xplorer/viewer/a;Landroid/view/GestureDetector;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->a:Lcom/voxdon/xplorer/viewer/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->b:Landroid/view/GestureDetector;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
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


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->a:Lcom/voxdon/xplorer/viewer/a;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/viewer/a;->g(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->b:Landroid/view/GestureDetector;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_20

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-ne p1, v1, :cond_1f

    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    return v1

    .line 33
    :cond_20
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_34

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-ne p1, v1, :cond_33

    .line 46
    .line 47
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    return v1

    .line 53
    :cond_34
    return p1
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
.end method
