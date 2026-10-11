.class Lax/d3/v$n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/v$n;->j(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/v$n;


# direct methods
.method constructor <init>(Lax/d3/v$n;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/v$n$b;->a:Lax/d3/v$n;

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
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 2
    .line 3
    iget-object p1, p1, Lax/d3/v$n;->h:Lax/d3/v;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 p4, 0x0

    .line 10
    if-nez p1, :cond_c

    .line 11
    .line 12
    return p4

    .line 13
    :cond_c
    new-instance p1, Lax/s/c;

    .line 14
    .line 15
    iget-object p5, p0, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 16
    .line 17
    iget-object p5, p5, Lax/d3/v$n;->h:Lax/d3/v;

    .line 18
    .line 19
    invoke-virtual {p5}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p5

    .line 23
    const v0, 0x7f14012f

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p5, v0}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    new-instance p5, Lax/x3/v;

    .line 30
    .line 31
    invoke-direct {p5, p1}, Lax/x3/v;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 35
    .line 36
    iget-object p1, p1, Lax/d3/v$n;->h:Lax/d3/v;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const v0, 0x7f0f000c

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, p5}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 53
    .line 54
    iget-object p1, p1, Lax/d3/v$n;->g:Lax/x3/j;

    .line 55
    .line 56
    invoke-virtual {p1, p3}, Lax/x3/j;->b(I)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_64

    .line 61
    .line 62
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p2, "Desktop2LastVisited context bookmark null"

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string p5, "position:"

    .line 82
    .line 83
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 98
    .line 99
    .line 100
    return p4

    .line 101
    :cond_64
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->v()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    invoke-virtual {p5, p3}, Lax/x3/v;->g0(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    const p3, 0x7f0a02e3

    .line 109
    .line 110
    .line 111
    invoke-virtual {p5, p3}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    new-instance v0, Lax/d3/v$n$b$a;

    .line 116
    .line 117
    invoke-direct {v0, p0, p1}, Lax/d3/v$n$b$a;-><init>(Lax/d3/v$n$b;Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p3, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p5}, Landroidx/appcompat/view/menu/e;->hasVisibleItems()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_93

    .line 128
    .line 129
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    div-int/lit8 p1, p1, 0x2

    .line 134
    .line 135
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    mul-int/lit8 p3, p3, -0x1

    .line 140
    .line 141
    div-int/lit8 p3, p3, 0x2

    .line 142
    .line 143
    invoke-virtual {p5, p2, p1, p3}, Lax/x3/v;->h0(Landroid/view/View;II)V

    .line 144
    .line 145
    .line 146
    const/4 p1, 0x1

    .line 147
    return p1

    .line 148
    :cond_93
    return p4
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
