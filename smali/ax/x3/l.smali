.class public Lax/x3/l;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/Z2/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/x3/l;->b()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a(I)Lax/Z2/s;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/Z2/s;

    .line 8
    .line 9
    return-object p1
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

.method public b()V
    .registers 14

    .line 1
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 7
    .line 8
    iget-object v1, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/voxdon/xplorer/file/T;->e(Landroid/content/Context;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 18
    .line 19
    iget-object v1, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/voxdon/xplorer/file/T;->c(Landroid/content/Context;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 29
    .line 30
    new-instance v1, Lax/x3/l$a;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lax/x3/l$a;-><init>(Lax/x3/l;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 39
    .line 40
    const v1, 0x7f130270

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 48
    .line 49
    new-instance v2, Lax/Z2/s;

    .line 50
    .line 51
    sget-object v3, Lax/Q2/f;->Y0:Lax/Q2/f;

    .line 52
    .line 53
    const-wide/16 v9, 0x0

    .line 54
    .line 55
    const-wide/16 v11, 0x0

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const-string v6, ""

    .line 59
    .line 60
    const-string v7, ""

    .line 61
    .line 62
    const-string v8, ""

    .line 63
    .line 64
    invoke-direct/range {v2 .. v12}, Lax/Z2/s;-><init>(Lax/Q2/f;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 71
    .line 72
    new-instance v1, Lax/Z2/s;

    .line 73
    .line 74
    sget-object v2, Lax/Q2/f;->W0:Lax/Q2/f;

    .line 75
    .line 76
    iget-object v3, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Lax/Q2/f;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-wide/16 v8, 0x0

    .line 83
    .line 84
    const-wide/16 v10, 0x0

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    const-string v5, ""

    .line 88
    .line 89
    const-string v6, ""

    .line 90
    .line 91
    const-string v7, ""

    .line 92
    .line 93
    invoke-direct/range {v1 .. v11}, Lax/Z2/s;-><init>(Lax/Q2/f;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 101
    .line 102
    .line 103
    return-void
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

.method public getCount()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/x3/l;->a(I)Lax/Z2/s;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public getItemId(I)J
    .registers 4

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
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
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 7

    .line 1
    const/4 p3, 0x0

    .line 2
    if-nez p2, :cond_14

    .line 3
    .line 4
    iget-object p2, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v0, "layout_inflater"

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Landroid/view/LayoutInflater;

    .line 13
    .line 14
    const v0, 0x7f0d0054

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_14
    iget-object v0, p0, Lax/x3/l;->b:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lax/Z2/s;

    .line 28
    .line 29
    const v0, 0x7f0a024f

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/ImageView;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/Z2/s;->e()Lax/c3/K;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v2, p0, Lax/x3/l;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {v2, v1, p3}, Lax/s3/b;->e(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {v0, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    const p3, 0x7f0a0321

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    check-cast p3, Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {p1}, Lax/Z2/s;->f()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    const p1, 0x7f0a0261

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Landroid/widget/TextView;

    .line 79
    .line 80
    const/16 p3, 0x8

    .line 81
    .line 82
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    return-object p2
    .line 86
    .line 87
    .line 88
.end method
