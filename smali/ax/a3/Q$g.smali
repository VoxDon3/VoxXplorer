.class Lax/a3/Q$g;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/Z2/h$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Landroid/content/pm/PackageManager;

.field private d:Lax/Z2/h;

.field private e:Z

.field final synthetic f:Lax/a3/Q;


# direct methods
.method constructor <init>(Lax/a3/Q;Landroid/content/Context;Lax/Z2/h;Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/Z2/h;",
            "Ljava/util/List<",
            "Lax/Z2/h$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/a3/Q$g;->b:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lax/a3/Q$g;->c:Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    iput-object p4, p0, Lax/a3/Q$g;->a:Ljava/util/List;

    .line 15
    .line 16
    iput-object p3, p0, Lax/a3/Q$g;->d:Lax/Z2/h;

    .line 17
    .line 18
    return-void
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


# virtual methods
.method public a(I)Lax/Z2/h$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a3/Q$g;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/Z2/h$a;

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

.method public b(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/a3/Q$g;->e:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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

.method public getCount()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a3/Q$g;->a:Ljava/util/List;

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
    invoke-virtual {p0, p1}, Lax/a3/Q$g;->a(I)Lax/Z2/h$a;

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
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_a

    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, Lax/a3/Q$i;

    .line 9
    .line 10
    goto :goto_25

    .line 11
    :cond_a
    iget-object p2, p0, Lax/a3/Q$g;->b:Landroid/content/Context;

    .line 12
    .line 13
    const-string v1, "layout_inflater"

    .line 14
    .line 15
    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Landroid/view/LayoutInflater;

    .line 20
    .line 21
    const v1, 0x7f0d00af

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance p3, Lax/a3/Q$i;

    .line 29
    .line 30
    iget-object v1, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 31
    .line 32
    invoke-direct {p3, v1, p2}, Lax/a3/Q$i;-><init>(Lax/a3/Q;Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_25
    iput p1, p3, Lax/a3/Q$i;->a:I

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lax/a3/Q$g;->a(I)Lax/Z2/h$a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lax/Z2/h$a;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v2, 0x8

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-eqz v1, :cond_61

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lax/Z2/h$a;->d(I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v1, "title_resource"

    .line 58
    .line 59
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_47

    .line 64
    .line 65
    iget-object v4, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 66
    .line 67
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_49

    .line 72
    :cond_47
    const-string v1, ""

    .line 73
    .line 74
    :goto_49
    iput-object v3, p3, Lax/a3/Q$i;->b:Landroid/content/pm/ResolveInfo;

    .line 75
    .line 76
    iget-object v3, p3, Lax/a3/Q$i;->d:Landroid/widget/TextView;

    .line 77
    .line 78
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p3, Lax/a3/Q$i;->c:Landroid/widget/ImageView;

    .line 82
    .line 83
    const-string v3, "icon_resource"

    .line 84
    .line 85
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p3, Lax/a3/Q$i;->e:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_61
    invoke-virtual {p1, v0}, Lax/Z2/h$a;->f(I)Landroid/content/pm/ResolveInfo;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, p3, Lax/a3/Q$i;->b:Landroid/content/pm/ResolveInfo;

    .line 103
    .line 104
    iget-object v4, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 105
    .line 106
    invoke-static {v4}, Lax/a3/Q;->q3(Lax/a3/Q;)Ljava/util/HashMap;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Ljava/lang/CharSequence;

    .line 115
    .line 116
    if-nez v4, :cond_84

    .line 117
    .line 118
    iget-object v4, p0, Lax/a3/Q$g;->c:Landroid/content/pm/PackageManager;

    .line 119
    .line 120
    invoke-virtual {p1, v4}, Lax/Z2/h$a;->e(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iget-object v5, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 125
    .line 126
    invoke-static {v5}, Lax/a3/Q;->q3(Lax/a3/Q;)Ljava/util/HashMap;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_84
    iget-object v5, p3, Lax/a3/Q$i;->d:Landroid/widget/TextView;

    .line 134
    .line 135
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iget-object v4, p3, Lax/a3/Q$i;->h:Lax/a3/Q$e;

    .line 139
    .line 140
    if-eqz v4, :cond_92

    .line 141
    .line 142
    invoke-virtual {v4}, Lax/u3/q;->e()Z

    .line 143
    .line 144
    .line 145
    iput-object v3, p3, Lax/a3/Q$i;->h:Lax/a3/Q$e;

    .line 146
    .line 147
    :cond_92
    iget-object v4, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 148
    .line 149
    invoke-static {v4}, Lax/a3/Q;->r3(Lax/a3/Q;)Landroid/util/LruCache;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, Landroid/graphics/drawable/Drawable;

    .line 158
    .line 159
    if-eqz v4, :cond_a6

    .line 160
    .line 161
    iget-object v1, p3, Lax/a3/Q$i;->c:Landroid/widget/ImageView;

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 164
    .line 165
    .line 166
    goto :goto_bf

    .line 167
    :cond_a6
    iget-object v4, p3, Lax/a3/Q$i;->c:Landroid/widget/ImageView;

    .line 168
    .line 169
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 170
    .line 171
    .line 172
    new-instance v4, Lax/a3/Q$e;

    .line 173
    .line 174
    iget-object v5, p0, Lax/a3/Q$g;->d:Lax/Z2/h;

    .line 175
    .line 176
    iget-object v6, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 177
    .line 178
    invoke-static {v6}, Lax/a3/Q;->r3(Lax/a3/Q;)Landroid/util/LruCache;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-direct {v4, v5, p3, v6, v1}, Lax/a3/Q$e;-><init>(Lax/Z2/h;Lax/a3/Q$i;Landroid/util/LruCache;Landroid/content/pm/ResolveInfo;)V

    .line 183
    .line 184
    .line 185
    iput-object v4, p3, Lax/a3/Q$i;->h:Lax/a3/Q$e;

    .line 186
    .line 187
    new-array v1, v0, [Ljava/lang/Void;

    .line 188
    .line 189
    invoke-virtual {v4, v1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 190
    .line 191
    .line 192
    :goto_bf
    iget-object v1, p0, Lax/a3/Q$g;->f:Lax/a3/Q;

    .line 193
    .line 194
    iget-boolean v4, v1, Lax/a3/Q;->u0:Z

    .line 195
    .line 196
    if-eqz v4, :cond_e6

    .line 197
    .line 198
    iget-object v1, v1, Lax/a3/Q;->C0:Lax/a3/Q$h;

    .line 199
    .line 200
    sget-object v4, Lax/a3/Q$h;->q:Lax/a3/Q$h;

    .line 201
    .line 202
    if-ne v1, v4, :cond_e6

    .line 203
    .line 204
    iget-boolean v1, p0, Lax/a3/Q$g;->e:Z

    .line 205
    .line 206
    if-nez v1, :cond_e6

    .line 207
    .line 208
    invoke-static {p1}, Lax/Z2/h;->g(Lax/Z2/h$a;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_d6

    .line 213
    .line 214
    goto :goto_e0

    .line 215
    :cond_d6
    iget-object v1, p0, Lax/a3/Q$g;->b:Landroid/content/Context;

    .line 216
    .line 217
    iget-object v4, p1, Lax/Z2/h$a;->a:Landroid/content/ComponentName;

    .line 218
    .line 219
    invoke-static {v1, v4}, Lax/Z2/h;->j(Landroid/content/Context;Landroid/content/ComponentName;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_e6

    .line 224
    .line 225
    :goto_e0
    iget-object v1, p3, Lax/a3/Q$i;->e:Landroid/view/View;

    .line 226
    .line 227
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    goto :goto_eb

    .line 231
    :cond_e6
    iget-object v1, p3, Lax/a3/Q$i;->e:Landroid/view/View;

    .line 232
    .line 233
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 234
    .line 235
    .line 236
    :goto_eb
    invoke-virtual {p1}, Lax/Z2/h$a;->g()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_111

    .line 241
    .line 242
    invoke-virtual {p1}, Lax/Z2/h$a;->c()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    const/4 v4, 0x1

    .line 247
    if-le v1, v4, :cond_111

    .line 248
    .line 249
    iget-object v1, p3, Lax/a3/Q$i;->g:Landroid/widget/CheckBox;

    .line 250
    .line 251
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    iget-object v0, p3, Lax/a3/Q$i;->g:Landroid/widget/CheckBox;

    .line 255
    .line 256
    invoke-virtual {p1}, Lax/Z2/h$a;->j()Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 261
    .line 262
    .line 263
    iget-object p3, p3, Lax/a3/Q$i;->g:Landroid/widget/CheckBox;

    .line 264
    .line 265
    new-instance v0, Lax/a3/Q$g$a;

    .line 266
    .line 267
    invoke-direct {v0, p0, p1}, Lax/a3/Q$g$a;-><init>(Lax/a3/Q$g;Lax/Z2/h$a;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p3, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 271
    .line 272
    .line 273
    return-object p2

    .line 274
    :cond_111
    iget-object p1, p3, Lax/a3/Q$i;->g:Landroid/widget/CheckBox;

    .line 275
    .line 276
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 277
    .line 278
    .line 279
    iget-object p1, p3, Lax/a3/Q$i;->g:Landroid/widget/CheckBox;

    .line 280
    .line 281
    invoke-virtual {p1, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 282
    .line 283
    .line 284
    return-object p2
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method
