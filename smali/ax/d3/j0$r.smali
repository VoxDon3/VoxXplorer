.class Lax/d3/j0$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$MultiChoiceModeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field private b:Lax/Q2/j;

.field final synthetic c:Lax/d3/j0;


# direct methods
.method constructor <init>(Lax/d3/j0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

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
.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
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

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/d3/j0$r;->b:Lax/Q2/j;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/Q2/j;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, Lax/d3/j0$r;->a:Z

    .line 18
    .line 19
    iget-object v0, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, p1, p2, v1}, Lax/d3/n;->b3(Landroid/view/ActionMode;Landroid/view/Menu;I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 26
    .line 27
    sget-object p2, Lax/d3/n$o;->d0:Lax/d3/n$o;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lax/d3/j0;->X3(Lax/d3/n$o;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/b;->h0()Lax/x3/A;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lax/x3/A;->F(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/d3/n;->a3()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 30
    .line 31
    sget-object v0, Lax/d3/n$o;->d0:Lax/d3/n$o;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lax/d3/j0;->W3(Lax/d3/n$o;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public onItemCheckedStateChanged(Landroid/view/ActionMode;IJZ)V
    .registers 6

    .line 1
    iget-object p3, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 2
    .line 3
    invoke-static {p3, p1}, Lax/d3/j0;->T4(Lax/d3/j0;Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 10
    .line 11
    invoke-static {p1}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1, p2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    if-eqz p5, :cond_3d

    .line 23
    .line 24
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 25
    .line 26
    .line 27
    move-result p4

    .line 28
    if-eqz p4, :cond_27

    .line 29
    .line 30
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 31
    .line 32
    invoke-static {p1}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p2, p3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    iget-object p4, p0, Lax/d3/j0$r;->b:Lax/Q2/j;

    .line 41
    .line 42
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p4, p1}, Lax/Q2/j;->h(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_3d

    .line 51
    .line 52
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 53
    .line 54
    invoke-static {p1}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, p2, p3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3d
    iget-boolean p1, p0, Lax/d3/j0$r;->a:Z

    .line 63
    .line 64
    if-nez p1, :cond_7c

    .line 65
    .line 66
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 67
    .line 68
    invoke-static {p1}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    const/4 p4, 0x1

    .line 77
    if-le p1, p4, :cond_7c

    .line 78
    .line 79
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 80
    .line 81
    invoke-static {p1}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const/4 p4, 0x0

    .line 90
    :goto_59
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->size()I

    .line 91
    .line 92
    .line 93
    move-result p5

    .line 94
    if-ge p4, p5, :cond_7c

    .line 95
    .line 96
    invoke-virtual {p1, p4}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    if-eqz p5, :cond_79

    .line 101
    .line 102
    invoke-virtual {p1, p4}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 103
    .line 104
    .line 105
    move-result p5

    .line 106
    if-eq p2, p5, :cond_79

    .line 107
    .line 108
    iget-object p2, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 109
    .line 110
    invoke-static {p2}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p1, p4}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-virtual {p2, p1, p3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_79
    add-int/lit8 p4, p4, 0x1

    .line 123
    .line 124
    goto :goto_59

    .line 125
    :cond_7c
    return-void
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

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .registers 4

    .line 1
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Landroid/widget/Adapter;->getCount()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 p2, 0x0

    .line 12
    if-nez p1, :cond_e

    .line 13
    .line 14
    return p2

    .line 15
    :cond_e
    iget-object p1, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/b;->h0()Lax/x3/A;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 26
    .line 27
    invoke-static {v0}, Lax/d3/j0;->S4(Lax/d3/j0;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_35

    .line 32
    .line 33
    iget-object v0, p0, Lax/d3/j0$r;->c:Lax/d3/j0;

    .line 34
    .line 35
    invoke-static {v0}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-gtz v0, :cond_30

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lax/x3/A;->F(Z)V

    .line 46
    .line 47
    .line 48
    goto :goto_38

    .line 49
    :cond_30
    const/4 v0, 0x1

    .line 50
    invoke-virtual {p1, v0}, Lax/x3/A;->F(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_38

    .line 54
    :cond_35
    invoke-virtual {p1, p2}, Lax/x3/A;->F(Z)V

    .line 55
    .line 56
    .line 57
    :goto_38
    return p2
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
