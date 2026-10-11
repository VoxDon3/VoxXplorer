.class Lcom/voxdon/xplorer/widget/a$c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/a$c;->E(Landroid/view/View;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/voxdon/xplorer/widget/a$c;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/a$c;Landroid/view/ViewGroup;Landroid/view/View;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$g;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/a$c$g;->a:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/widget/a$c$g;->b:Landroid/view/View;

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
.method public onLongClick(Landroid/view/View;)Z
    .registers 6

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$g;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    instance-of v0, p1, Lcom/voxdon/xplorer/widget/FileListView;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    check-cast p1, Lcom/voxdon/xplorer/widget/FileListView;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/widget/FileListView;->a()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$g;->b:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$g;->b:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    const/high16 v1, 0x40000000    # 2.0f

    .line 26
    .line 27
    div-float/2addr v0, v1

    .line 28
    add-float/2addr p1, v0

    .line 29
    float-to-int p1, p1

    .line 30
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$g;->b:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/a$c$g;->b:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    div-float/2addr v2, v1

    .line 44
    add-float/2addr v0, v2

    .line 45
    float-to-int v0, v0

    .line 46
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/a$c$g;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/voxdon/xplorer/widget/a$c;->Q:Lcom/voxdon/xplorer/widget/a;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/voxdon/xplorer/widget/a;->n(Lcom/voxdon/xplorer/widget/a;)Lax/x3/z;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/a$c$g;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 55
    .line 56
    invoke-static {v2}, Lcom/voxdon/xplorer/widget/a$c;->n(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget-object v3, p0, Lcom/voxdon/xplorer/widget/a$c$g;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 61
    .line 62
    invoke-static {v3}, Lcom/voxdon/xplorer/widget/a$c;->p(Lcom/voxdon/xplorer/widget/a$c;)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v1, v2, v3, p1, v0}, Lax/x3/z;->c(ILandroid/view/View;II)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1
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
