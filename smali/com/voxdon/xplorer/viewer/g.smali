.class public Lcom/voxdon/xplorer/viewer/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/viewer/g$h;,
        Lcom/voxdon/xplorer/viewer/g$f;,
        Lcom/voxdon/xplorer/viewer/g$c;,
        Lcom/voxdon/xplorer/viewer/g$e;,
        Lcom/voxdon/xplorer/viewer/g$b;,
        Lcom/voxdon/xplorer/viewer/g$d;,
        Lcom/voxdon/xplorer/viewer/g$g;
    }
.end annotation


# instance fields
.field private final a:Landroid/widget/PopupWindow;

.field private final b:Landroidx/recyclerview/widget/RecyclerView;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/voxdon/xplorer/viewer/g$c;

.field private final e:Lcom/voxdon/xplorer/viewer/g$e;

.field private final f:Lcom/voxdon/xplorer/viewer/g$b;

.field private final g:Lax/a2/f;

.field private final h:I

.field private i:Z

.field private j:Lcom/voxdon/xplorer/viewer/g$h;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/viewer/g$c;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/g;->c:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/g;->d:Lcom/voxdon/xplorer/viewer/g$c;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x7f0700c6

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/voxdon/xplorer/viewer/g;->h:I

    .line 20
    .line 21
    new-instance v0, Lcom/voxdon/xplorer/viewer/g$e;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p2}, Lcom/voxdon/xplorer/viewer/g$e;-><init>(Lcom/voxdon/xplorer/viewer/g;Landroid/content/Context;Lcom/voxdon/xplorer/viewer/g$c;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->e:Lcom/voxdon/xplorer/viewer/g$e;

    .line 27
    .line 28
    new-instance v0, Lcom/voxdon/xplorer/viewer/g$b;

    .line 29
    .line 30
    invoke-direct {v0, p0, p1, p2}, Lcom/voxdon/xplorer/viewer/g$b;-><init>(Lcom/voxdon/xplorer/viewer/g;Landroid/content/Context;Lcom/voxdon/xplorer/viewer/g$c;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->f:Lcom/voxdon/xplorer/viewer/g$b;

    .line 34
    .line 35
    new-instance p2, Lax/a2/f;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p2, p1}, Lax/a2/f;-><init>(Landroid/content/res/Resources;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/g;->g:Lax/a2/f;

    .line 45
    .line 46
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/g;->g()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const p2, 0x7f0d0083

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/g;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 67
    .line 68
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/g;->g()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 76
    .line 77
    .line 78
    new-instance p2, Landroid/widget/PopupWindow;

    .line 79
    .line 80
    const/4 v0, -0x2

    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-direct {p2, p1, v0, v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 83
    .line 84
    .line 85
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 86
    .line 87
    sget p1, Lax/S0/d0;->a:I

    .line 88
    .line 89
    const/16 v0, 0x17

    .line 90
    .line 91
    if-ge p1, v0, :cond_65

    .line 92
    .line 93
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 100
    .line 101
    .line 102
    :cond_65
    new-instance p1, Lcom/voxdon/xplorer/viewer/g$a;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/viewer/g$a;-><init>(Lcom/voxdon/xplorer/viewer/g;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 108
    .line 109
    .line 110
    return-void
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

.method static synthetic a(Lcom/voxdon/xplorer/viewer/g;Lax/P0/H;Lcom/voxdon/xplorer/viewer/g$f;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/viewer/g;->m(Lax/P0/H;Lcom/voxdon/xplorer/viewer/g$f;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic b(Lcom/voxdon/xplorer/viewer/g;)Landroid/widget/PopupWindow;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic c(Lcom/voxdon/xplorer/viewer/g;)Lcom/voxdon/xplorer/viewer/g$h;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/g;->j:Lcom/voxdon/xplorer/viewer/g$h;

    .line 2
    .line 3
    return-object p0
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

.method private e(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "*>;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/g;->p()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/g;->i:Z

    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/g;->i:Z

    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    neg-int v0, v0

    .line 27
    iget v1, p0, Lcom/voxdon/xplorer/viewer/g;->h:I

    .line 28
    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sub-int/2addr v0, v1

    .line 35
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 36
    .line 37
    invoke-virtual {v1, p2, p1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
.end method

.method private f(Lax/P0/V;I)Lax/r7/z;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/V;",
            "I)",
            "Lax/r7/z<",
            "Lcom/voxdon/xplorer/viewer/g$f;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/r7/z$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/r7/z$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lax/P0/V;->a()Lax/r7/z;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ge v3, v4, :cond_49

    .line 17
    .line 18
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lax/P0/V$a;

    .line 23
    .line 24
    invoke-virtual {v4}, Lax/P0/V$a;->d()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eq v5, p2, :cond_1e

    .line 29
    .line 30
    goto :goto_46

    .line 31
    :cond_1e
    const/4 v5, 0x0

    .line 32
    :goto_1f
    iget v6, v4, Lax/P0/V$a;->a:I

    .line 33
    .line 34
    if-ge v5, v6, :cond_46

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Lax/P0/V$a;->j(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_2a

    .line 41
    .line 42
    goto :goto_43

    .line 43
    :cond_2a
    invoke-virtual {v4, v5}, Lax/P0/V$a;->b(I)Lax/P0/v;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget v7, v6, Lax/P0/v;->e:I

    .line 48
    .line 49
    and-int/lit8 v7, v7, 0x2

    .line 50
    .line 51
    if-eqz v7, :cond_35

    .line 52
    .line 53
    goto :goto_43

    .line 54
    :cond_35
    iget-object v7, p0, Lcom/voxdon/xplorer/viewer/g;->g:Lax/a2/f;

    .line 55
    .line 56
    invoke-virtual {v7, v6}, Lax/a2/f;->a(Lax/P0/v;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v7, Lcom/voxdon/xplorer/viewer/g$f;

    .line 61
    .line 62
    invoke-direct {v7, p1, v3, v5, v6}, Lcom/voxdon/xplorer/viewer/g$f;-><init>(Lax/P0/V;IILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v7}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 66
    .line 67
    .line 68
    :goto_43
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1f

    .line 71
    :cond_46
    :goto_46
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_b

    .line 74
    :cond_49
    invoke-virtual {v0}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
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

.method private g()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->c:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
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
.end method

.method private j()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/g;->h()Lax/P0/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    const-string v1, "player is null when init trackselectionadapter"

    .line 8
    .line 9
    invoke-static {v1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->e:Lcom/voxdon/xplorer/viewer/g$e;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/voxdon/xplorer/viewer/g$g;->O()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->f:Lcom/voxdon/xplorer/viewer/g$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/voxdon/xplorer/viewer/g$g;->O()V

    .line 20
    .line 21
    .line 22
    if-eqz v0, :cond_40

    .line 23
    .line 24
    const/16 v1, 0x1e

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_40

    .line 31
    .line 32
    const/16 v1, 0x1d

    .line 33
    .line 34
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_28

    .line 39
    .line 40
    goto :goto_40

    .line 41
    :cond_28
    invoke-interface {v0}, Lax/P0/H;->X()Lax/P0/V;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->f:Lcom/voxdon/xplorer/viewer/g$b;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {p0, v0, v2}, Lcom/voxdon/xplorer/viewer/g;->f(Lax/P0/V;I)Lax/r7/z;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/viewer/g$b;->W(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->e:Lcom/voxdon/xplorer/viewer/g$e;

    .line 56
    .line 57
    const/4 v2, 0x3

    .line 58
    invoke-direct {p0, v0, v2}, Lcom/voxdon/xplorer/viewer/g;->f(Lax/P0/V;I)Lax/r7/z;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/viewer/g$e;->V(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    :cond_40
    :goto_40
    return-void
    .line 66
    .line 67
    .line 68
.end method

.method private m(Lax/P0/H;Lcom/voxdon/xplorer/viewer/g$f;)V
    .registers 7

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lax/P0/H;->c0(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-interface {p1}, Lax/P0/H;->k0()Lax/P0/T;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lax/P0/T;->I()Lax/P0/T$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lax/P0/Q;

    .line 19
    .line 20
    iget-object v2, p2, Lcom/voxdon/xplorer/viewer/g$f;->a:Lax/P0/V$a;

    .line 21
    .line 22
    invoke-virtual {v2}, Lax/P0/V$a;->a()Lax/P0/P;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v3, p2, Lcom/voxdon/xplorer/viewer/g$f;->b:I

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {v1, v2, v3}, Lax/P0/Q;-><init>(Lax/P0/P;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lax/P0/T$c;->N(Lax/P0/Q;)Lax/P0/T$c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object p2, p2, Lcom/voxdon/xplorer/viewer/g$f;->a:Lax/P0/V$a;

    .line 44
    .line 45
    invoke-virtual {p2}, Lax/P0/V$a;->d()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, p2, v1}, Lax/P0/T$c;->U(IZ)Lax/P0/T$c;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lax/P0/T$c;->F()Lax/P0/T;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {p1, p2}, Lax/P0/H;->w(Lax/P0/T;)V

    .line 59
    .line 60
    .line 61
    return-void
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

.method private p()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/g;->i()Landroidx/media3/ui/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2, v2}, Landroid/view/View;->measure(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget v2, p0, Lcom/voxdon/xplorer/viewer/g;->h:I

    .line 16
    .line 17
    mul-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/g;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v1, p0, Lcom/voxdon/xplorer/viewer/g;->h:I

    .line 40
    .line 41
    mul-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    sub-int/2addr v0, v1

    .line 44
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public d()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/g;->i:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->a:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/g;->i:Z

    .line 11
    .line 12
    return-void
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

.method protected h()Lax/P0/H;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->d:Lcom/voxdon/xplorer/viewer/g$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/voxdon/xplorer/viewer/g$c;->h()Lax/P0/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method protected i()Landroidx/media3/ui/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->d:Lcom/voxdon/xplorer/viewer/g$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/voxdon/xplorer/viewer/g$c;->k()Landroidx/media3/ui/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public k()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/g;->h()Lax/P0/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-interface {v0}, Lax/P0/H;->X()Lax/P0/V;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {p0, v1, v2}, Lcom/voxdon/xplorer/viewer/g;->f(Lax/P0/V;I)Lax/r7/z;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1c

    .line 22
    .line 23
    const-string v0, "no subtitle track"

    .line 24
    .line 25
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v2, v3, :cond_3b

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v3, "subtitle count : "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    const/4 v2, 0x0

    .line 61
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lcom/voxdon/xplorer/viewer/g$f;

    .line 66
    .line 67
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/g;->m(Lax/P0/H;Lcom/voxdon/xplorer/viewer/g$f;)V

    .line 68
    .line 69
    .line 70
    return-void
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

.method public l()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/g;->h()Lax/P0/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2c

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2c

    .line 14
    .line 15
    invoke-interface {v0}, Lax/P0/H;->k0()Lax/P0/T;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/P0/T;->I()Lax/P0/T$c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x3

    .line 24
    invoke-virtual {v1, v2}, Lax/P0/T$c;->G(I)Lax/P0/T$c;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v3, -0x3

    .line 29
    invoke-virtual {v1, v3}, Lax/P0/T$c;->M(I)Lax/P0/T$c;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v1, v2, v3}, Lax/P0/T$c;->U(IZ)Lax/P0/T$c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lax/P0/T$c;->F()Lax/P0/T;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Lax/P0/H;->w(Lax/P0/T;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    return-void
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
.end method

.method public n(Landroid/view/View;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->f:Lcom/voxdon/xplorer/viewer/g$b;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/viewer/g;->e(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

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

.method public o(Landroid/view/View;Lcom/voxdon/xplorer/viewer/g$h;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/g;->e:Lcom/voxdon/xplorer/viewer/g$e;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/viewer/g;->e(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/g;->j:Lcom/voxdon/xplorer/viewer/g$h;

    .line 7
    .line 8
    return-void
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
.end method

.method public q()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/g;->j()V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method
