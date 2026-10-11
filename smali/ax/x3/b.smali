.class public Lax/x3/b;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$MultiChoiceModeListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lax/c3/K;

.field private c:Landroid/widget/ListView;

.field private d:Landroid/widget/GridView;

.field private e:Landroid/widget/AbsListView;

.field private f:Lax/x3/a;

.field private g:Lax/x3/a;

.field private h:Lax/x3/a;

.field private i:Lax/g3/a;

.field private j:Landroid/view/ActionMode;

.field k:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/c3/K;Lax/g3/a;)V
    .registers 7

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/x3/b$c;

    .line 5
    .line 6
    const-wide/16 v1, 0xc8

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, Lax/x3/b$c;-><init>(Lax/x3/b;J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/x3/b;->k:Landroid/widget/AdapterView$OnItemClickListener;

    .line 12
    .line 13
    iput-object p1, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 16
    .line 17
    invoke-direct {p0}, Lax/x3/b;->g()V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, Lax/x3/b;->i:Lax/g3/a;

    .line 21
    .line 22
    return-void
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

.method static synthetic a(Lax/x3/b;)Lax/x3/a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/x3/b;->f:Lax/x3/a;

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

.method static synthetic b(Lax/x3/b;)Landroid/widget/AbsListView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

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

.method static synthetic c(Lax/x3/b;Lax/U2/f;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/x3/b;->n(Lax/U2/f;)V

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
.end method

.method static synthetic d(Lax/x3/b;)Lax/g3/a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/x3/b;->i:Lax/g3/a;

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

.method private f(I)Z
    .registers 5

    .line 1
    const v0, 0x7f0a02ec

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eq p1, v0, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/x3/b;->getCheckedItems()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 17
    .line 18
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne p1, v0, :cond_1c

    .line 24
    .line 25
    invoke-virtual {p0}, Lax/x3/b;->e()V

    .line 26
    .line 27
    .line 28
    return v2

    .line 29
    :cond_1c
    const/4 p1, 0x0

    .line 30
    :goto_1d
    iget-object v0, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 31
    .line 32
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-ge p1, v0, :cond_2d

    .line 37
    .line 38
    iget-object v0, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 39
    .line 40
    invoke-virtual {v0, p1, v2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_1d

    .line 46
    :cond_2d
    return v1
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

.method private g()V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f0d002b

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    const v1, 0x7f0a0294

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/widget/ListView;

    .line 32
    .line 33
    iput-object v1, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 34
    .line 35
    const v1, 0x7f0a022e

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/widget/GridView;

    .line 43
    .line 44
    iput-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 45
    .line 46
    new-instance v5, Lax/x3/b$a;

    .line 47
    .line 48
    invoke-direct {v5, p0}, Lax/x3/b$a;-><init>(Lax/x3/b;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lax/x3/b;->getManageSpaceButtonClickListener()Landroid/view/View$OnClickListener;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    new-instance v1, Lax/x3/a;

    .line 56
    .line 57
    iget-object v2, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 58
    .line 59
    invoke-direct {p0}, Lax/x3/b;->o()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x1

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-direct/range {v1 .. v7}, Lax/x3/a;-><init>(Landroid/content/Context;ILandroid/view/View$OnClickListener;Lax/x3/z;ZZ)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lax/x3/b;->g:Lax/x3/a;

    .line 69
    .line 70
    new-instance v1, Lax/x3/a;

    .line 71
    .line 72
    iget-object v2, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v3, 0x2

    .line 77
    invoke-direct/range {v1 .. v7}, Lax/x3/a;-><init>(Landroid/content/Context;ILandroid/view/View$OnClickListener;Lax/x3/z;ZZ)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lax/x3/b;->h:Lax/x3/a;

    .line 81
    .line 82
    iget-object v0, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 83
    .line 84
    iget-object v1, p0, Lax/x3/b;->g:Lax/x3/a;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 101
    .line 102
    iget-object v2, p0, Lax/x3/b;->k:Landroid/widget/AdapterView$OnItemClickListener;

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lax/x3/b;->g:Lax/x3/a;

    .line 108
    .line 109
    iget-object v2, p0, Lax/x3/b;->k:Landroid/widget/AdapterView$OnItemClickListener;

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Lax/x3/a;->r(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 115
    .line 116
    iget-object v2, p0, Lax/x3/b;->h:Lax/x3/a;

    .line 117
    .line 118
    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 132
    .line 133
    iget-object v1, p0, Lax/x3/b;->k:Landroid/widget/AdapterView$OnItemClickListener;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lax/x3/b;->h:Lax/x3/a;

    .line 139
    .line 140
    iget-object v1, p0, Lax/x3/b;->k:Landroid/widget/AdapterView$OnItemClickListener;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lax/x3/a;->r(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {p0}, Lax/x3/b;->getViewType()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-direct {p0}, Lax/x3/b;->getIconSizeType()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-direct {p0, v0, v1}, Lax/x3/b;->p(II)V

    .line 154
    .line 155
    .line 156
    return-void
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

.method private getIconSizeType()I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/Q2/f;->P()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_21

    .line 12
    .line 13
    iget-object v0, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v1, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 16
    .line 17
    invoke-virtual {v1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 22
    .line 23
    invoke-virtual {v2}, Lax/c3/K;->b()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->d(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :cond_21
    const/4 v0, 0x2

    .line 35
    return v0
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
.end method

.method private getViewType()I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/Q2/f;->P()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_21

    .line 13
    .line 14
    iget-object v0, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v2, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 17
    .line 18
    invoke-virtual {v2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 23
    .line 24
    invoke-virtual {v3}, Lax/c3/K;->b()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v0, v2, v3, v4, v1}, Lax/t3/e;->k(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :cond_21
    return v1
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
.end method

.method private m(II)V
    .registers 4

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_28

    .line 3
    .line 4
    const/4 p1, 0x4

    .line 5
    if-ne p2, p1, :cond_12

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const p2, 0x7f0700dc

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    goto :goto_1d

    .line 19
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const p2, 0x7f0700dd

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    :goto_1d
    iget-object p2, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroid/widget/GridView;->setColumnWidth(I)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 36
    .line 37
    const/4 p2, -0x1

    .line 38
    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 39
    .line 40
    .line 41
    :cond_28
    return-void
.end method

.method private n(Lax/U2/f;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/b;->i:Lax/g3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lax/g3/a;->s(Lax/U2/f;)V

    .line 6
    .line 7
    .line 8
    :cond_7
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
.end method

.method private o()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/b;->b:Lax/c3/K;

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/Q2/f;->J()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lax/Q2/f;->i1:Lax/Q2/f;

    .line 14
    .line 15
    if-ne v0, v1, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    invoke-static {}, Lax/t3/k;->I()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
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
.end method

.method private p(II)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    if-eqz p1, :cond_1c

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne p1, v2, :cond_9

    .line 8
    .line 9
    goto :goto_1c

    .line 10
    :cond_9
    iget-object v2, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 21
    .line 22
    iput-object v0, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 23
    .line 24
    iget-object v0, p0, Lax/x3/b;->h:Lax/x3/a;

    .line 25
    .line 26
    iput-object v0, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 27
    .line 28
    goto :goto_31

    .line 29
    :cond_1c
    :goto_1c
    iget-object v2, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 40
    .line 41
    iput-object v0, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 42
    .line 43
    iget-object v0, p0, Lax/x3/b;->g:Lax/x3/a;

    .line 44
    .line 45
    iput-object v0, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lax/x3/a;->q(I)V

    .line 48
    .line 49
    .line 50
    :goto_31
    invoke-direct {p0, p1, p2}, Lax/x3/b;->m(II)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lax/x3/a;->p(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 64
    .line 65
    iget-object p2, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

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
.end method


# virtual methods
.method public e()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/b;->j:Landroid/view/ActionMode;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public getCheckedItems()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 2
    .line 3
    iget-object v1, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Lax/x3/u;->a(Landroid/widget/AbsListView;Landroid/widget/ListAdapter;Z)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public getGridView()Landroid/widget/GridView;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/b;->d:Landroid/widget/GridView;

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

.method public getListView()Landroid/widget/ListView;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/b;->c:Landroid/widget/ListView;

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

.method getManageSpaceButtonClickListener()Landroid/view/View$OnClickListener;
    .registers 2

    .line 1
    new-instance v0, Lax/x3/b$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/x3/b$b;-><init>(Lax/x3/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public h()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/b;->j:Landroid/view/ActionMode;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x1

    .line 8
    return v0
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

.method public i(Lax/T/b;Z)V
    .registers 8

    .line 1
    if-nez p2, :cond_3b

    .line 2
    .line 3
    iget-object p2, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lax/x3/b;->c:Landroid/widget/ListView;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget v4, p1, Lax/T/b;->d:I

    .line 28
    .line 29
    invoke-virtual {p2, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v2, p0, Lax/x3/b;->d:Landroid/widget/GridView;

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget p1, p1, Lax/T/b;->d:I

    .line 56
    .line 57
    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    return-void
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

.method public j()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/x3/b;->getViewType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lax/x3/b;->getIconSizeType()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {p0, v0, v1}, Lax/x3/b;->p(II)V

    .line 10
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

.method public k(Ljava/lang/String;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/x3/a;->getFilter()Landroid/widget/Filter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_b
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
    .line 22
.end method

.method public l(Ljava/util/List;Ljava/util/Map;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lax/U2/d$e;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/x3/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    instance-of v1, v0, Lax/n/c;

    .line 4
    .line 5
    if-eqz v1, :cond_b

    .line 6
    .line 7
    check-cast v0, Lax/n/c;

    .line 8
    .line 9
    invoke-static {v0}, Lax/u3/z;->c(Lax/n/c;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/x3/b;->g:Lax/x3/a;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lax/x3/a;->o(Ljava/util/List;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/x3/b;->h:Lax/x3/a;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lax/x3/a;->o(Ljava/util/List;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p1}, Lax/x3/b;->f(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
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
    .registers 4

    .line 1
    iput-object p1, p0, Lax/x3/b;->j:Landroid/view/ActionMode;

    .line 2
    .line 3
    iget-object v0, p0, Lax/x3/b;->i:Lax/g3/a;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lax/g3/a;->j(Landroid/view/ActionMode;Landroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    :cond_9
    iget-object p1, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-virtual {p1, p2}, Lax/x3/a;->n(Z)V

    .line 14
    .line 15
    .line 16
    return p2
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

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .registers 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lax/x3/b;->j:Landroid/view/ActionMode;

    .line 3
    .line 4
    iget-object p1, p0, Lax/x3/b;->i:Lax/g3/a;

    .line 5
    .line 6
    if-eqz p1, :cond_a

    .line 7
    .line 8
    invoke-interface {p1}, Lax/g3/a;->Q()V

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object p1, p0, Lax/x3/b;->f:Lax/x3/a;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lax/x3/a;->n(Z)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onItemCheckedStateChanged(Landroid/view/ActionMode;IJZ)V
    .registers 6

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p3, "/"

    .line 16
    .line 17
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lax/x3/b;->e:Landroid/widget/AbsListView;

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/widget/AdapterView;->getCount()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p1, p2}, Landroid/view/ActionMode;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lax/x3/b;->i:Lax/g3/a;

    .line 2
    .line 3
    if-eqz p1, :cond_b

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/x3/b;->getCheckedItems()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p1, p2}, Lax/g3/a;->D(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    return p1
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
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/b;->g:Lax/x3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/a;->s()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/x3/b;->h:Lax/x3/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/x3/a;->s()V

    .line 9
    .line 10
    .line 11
    return-void
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
