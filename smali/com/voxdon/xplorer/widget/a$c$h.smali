.class Lcom/voxdon/xplorer/widget/a$c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/a$c;->E(Landroid/view/View;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/widget/a$c;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/a$c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$h;->a:Lcom/voxdon/xplorer/widget/a$c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_1c

    .line 7
    .line 8
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$h;->a:Lcom/voxdon/xplorer/widget/a$c;

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    float-to-int v1, v1

    .line 15
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/widget/a$c;->r(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$h;->a:Lcom/voxdon/xplorer/widget/a$c;

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    float-to-int p2, p2

    .line 25
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/widget/a$c;->b(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 26
    .line 27
    .line 28
    goto :goto_2d

    .line 29
    :cond_1c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, 0x1

    .line 34
    if-ne p1, p2, :cond_2d

    .line 35
    .line 36
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$h;->a:Lcom/voxdon/xplorer/widget/a$c;

    .line 37
    .line 38
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/widget/a$c;->r(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$h;->a:Lcom/voxdon/xplorer/widget/a$c;

    .line 42
    .line 43
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/widget/a$c;->b(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 44
    .line 45
    .line 46
    :cond_2d
    :goto_2d
    return v0
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
