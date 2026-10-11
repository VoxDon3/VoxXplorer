.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "l"
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;


# direct methods
.method private constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->x0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;F)F

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->v0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v1, 0x40800000    # 4.0f

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const v1, 0x3f19999a    # 0.6f

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->w0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;F)F

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 33
    .line 34
    const/high16 v0, 0x41600000    # 14.0f

    .line 35
    .line 36
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->v0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    mul-float v1, v1, v0

    .line 41
    .line 42
    float-to-int v0, v1

    .line 43
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->z0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_3e

    .line 53
    .line 54
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$l;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->r()V

    .line 61
    .line 62
    .line 63
    :cond_3e
    const/4 p1, 0x1

    .line 64
    return p1
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
