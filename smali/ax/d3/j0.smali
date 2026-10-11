.class public Lax/d3/j0;
.super Lax/d3/H;
.source "SourceFile"

# interfaces
.implements Lax/g3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d3/j0$u;,
        Lax/d3/j0$t;
    }
.end annotation


# instance fields
.field private C0:I

.field private D0:Ljava/lang/String;

.field private E0:Lax/c3/K;

.field private F0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private G0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private H0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private I0:Lax/c3/q;

.field private J0:Ljava/lang/String;

.field private K0:Lcom/voxdon/xplorer/widget/a;

.field private L0:Ljava/lang/String;

.field private M0:I

.field private N0:I

.field private O0:Lax/d3/j0$u;

.field private P0:Lcom/voxdon/xplorer/file/o;

.field private Q0:Lax/r3/d;

.field private R0:Lcom/voxdon/xplorer/widget/FileListView;

.field private S0:Landroid/view/View;

.field private T0:Landroid/view/View;

.field private U0:Landroid/view/View;

.field private V0:Landroid/widget/TextView;

.field protected W0:Lax/x3/d;

.field private X0:Z

.field private Y0:Z

.field private Z0:Landroid/os/Handler;

.field private a1:Lax/d3/n$r;

.field private final b1:Ljava/lang/Object;

.field private c1:J

.field private d1:Z

.field private e1:Lax/Z2/p;

.field f1:Landroid/widget/AdapterView$OnItemClickListener;

.field g1:Landroid/widget/AbsListView$MultiChoiceModeListener;

.field private h1:Ljava/lang/Runnable;

.field i1:Landroid/widget/AbsListView$MultiChoiceModeListener;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/H;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lax/d3/j0;->C0:I

    .line 6
    .line 7
    const-string v0, "None"

    .line 8
    .line 9
    iput-object v0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/d3/j0;->Z0:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lax/d3/n$r;

    .line 23
    .line 24
    invoke-direct {v0}, Lax/d3/n$r;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lax/d3/j0;->a1:Lax/d3/n$r;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v0, Lax/Z2/p;

    .line 37
    .line 38
    invoke-direct {v0}, Lax/Z2/p;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 42
    .line 43
    new-instance v0, Lax/d3/j0$o;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Lax/d3/j0$o;-><init>(Lax/d3/j0;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lax/d3/j0;->f1:Landroid/widget/AdapterView$OnItemClickListener;

    .line 49
    .line 50
    new-instance v0, Lax/d3/j0$r;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lax/d3/j0$r;-><init>(Lax/d3/j0;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lax/d3/j0;->g1:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 56
    .line 57
    new-instance v0, Lax/d3/j0$g;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Lax/d3/j0$g;-><init>(Lax/d3/j0;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lax/d3/j0;->h1:Ljava/lang/Runnable;

    .line 63
    .line 64
    new-instance v0, Lax/d3/j0$h;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lax/d3/j0$h;-><init>(Lax/d3/j0;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lax/d3/j0;->i1:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 70
    .line 71
    return-void
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

.method private A5()V
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    goto/16 :goto_e7

    .line 8
    .line 9
    :cond_8
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 10
    .line 11
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_14

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 v0, 0x0

    .line 22
    :goto_15
    iget-object v3, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v3

    .line 25
    :try_start_18
    iget-object v4, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 26
    .line 27
    iget-object v5, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 28
    .line 29
    invoke-static {v4, v5, v2}, Lax/x3/u;->a(Landroid/widget/AbsListView;Landroid/widget/ListAdapter;Z)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 34
    .line 35
    invoke-virtual {v5}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 36
    .line 37
    .line 38
    iget-object v5, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 39
    .line 40
    invoke-virtual {v5}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 44
    .line 45
    invoke-virtual {v5}, Lax/Z2/p;->a()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_3d

    .line 50
    .line 51
    iget-object v5, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 52
    .line 53
    iget-object v6, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Lcom/voxdon/xplorer/widget/a;->addAll(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    goto :goto_48

    .line 59
    :catchall_3a
    move-exception v0

    .line 60
    goto/16 :goto_e8

    .line 61
    .line 62
    :cond_3d
    iget-object v5, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 63
    .line 64
    iget-object v6, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 65
    .line 66
    invoke-virtual {p0, v6}, Lax/d3/j0;->I5(Ljava/util/Set;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v5, v6}, Lcom/voxdon/xplorer/widget/a;->addAll(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    :goto_48
    new-instance v5, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    :catch_51
    :goto_51
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_70

    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Lcom/voxdon/xplorer/file/n;
    :try_end_5d
    .catchall {:try_start_18 .. :try_end_5d} :catchall_3a

    .line 93
    .line 94
    :try_start_5d
    iget-object v7, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 95
    .line 96
    invoke-virtual {v7, v6}, Landroid/widget/ArrayAdapter;->getPosition(Ljava/lang/Object;)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    iget-object v7, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 101
    .line 102
    invoke-virtual {v7, v6, v1}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 103
    .line 104
    .line 105
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6f
    .catch Ljava/lang/Exception; {:try_start_5d .. :try_end_6f} :catch_51
    .catchall {:try_start_5d .. :try_end_6f} :catchall_3a

    .line 110
    .line 111
    .line 112
    goto :goto_51

    .line 113
    :cond_70
    :try_start_70
    iget-object v1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const/4 v4, 0x0

    .line 120
    :goto_77
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-ge v4, v6, :cond_a2

    .line 125
    .line 126
    invoke-virtual {v1, v4}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_9f

    .line 131
    .line 132
    invoke-virtual {v1, v4}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    iget-object v7, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 137
    .line 138
    invoke-interface {v7}, Landroid/widget/Adapter;->getCount()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-lt v6, v7, :cond_90

    .line 143
    .line 144
    goto :goto_9f

    .line 145
    :cond_90
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v7
    :try_end_98
    .catchall {:try_start_70 .. :try_end_98} :catchall_3a

    .line 153
    if-nez v7, :cond_9f

    .line 154
    .line 155
    :try_start_9a
    iget-object v7, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 156
    .line 157
    invoke-virtual {v7, v6, v2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V
    :try_end_9f
    .catch Ljava/lang/Exception; {:try_start_9a .. :try_end_9f} :catch_9f
    .catchall {:try_start_9a .. :try_end_9f} :catchall_3a

    .line 158
    .line 159
    .line 160
    :catch_9f
    :cond_9f
    :goto_9f
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_77

    .line 163
    :cond_a2
    :try_start_a2
    monitor-exit v3
    :try_end_a3
    .catchall {:try_start_a2 .. :try_end_a3} :catchall_3a

    .line 164
    iget-object v1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lax/d3/n;->k3()Landroid/view/ActionMode;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    if-eqz v1, :cond_b5

    .line 174
    .line 175
    invoke-virtual {p0}, Lax/d3/n;->k3()Landroid/view/ActionMode;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {p0, v1}, Lax/d3/j0;->e6(Landroid/view/ActionMode;)V

    .line 180
    .line 181
    .line 182
    :cond_b5
    if-eqz v0, :cond_bc

    .line 183
    .line 184
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 187
    .line 188
    .line 189
    :cond_bc
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 190
    .line 191
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    const/16 v1, 0x8

    .line 196
    .line 197
    if-nez v0, :cond_e2

    .line 198
    .line 199
    iget-object v0, p0, Lax/d3/j0;->S0:Landroid/view/View;

    .line 200
    .line 201
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 205
    .line 206
    if-eqz v0, :cond_dc

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_d6

    .line 213
    .line 214
    goto :goto_dc

    .line 215
    :cond_d6
    iget-object v0, p0, Lax/d3/j0;->T0:Landroid/view/View;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    goto :goto_e7

    .line 221
    :cond_dc
    :goto_dc
    iget-object v0, p0, Lax/d3/j0;->T0:Landroid/view/View;

    .line 222
    .line 223
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 224
    .line 225
    .line 226
    goto :goto_e7

    .line 227
    :cond_e2
    iget-object v0, p0, Lax/d3/j0;->S0:Landroid/view/View;

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 230
    .line 231
    .line 232
    :goto_e7
    return-void

    .line 233
    :goto_e8
    :try_start_e8
    monitor-exit v3
    :try_end_e9
    .catchall {:try_start_e8 .. :try_end_e9} :catchall_3a

    .line 234
    throw v0
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private B5()Ljava/lang/String;
    .registers 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "\""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lax/d3/j0;->L0:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 20
    .line 21
    const-string v3, ", \""

    .line 22
    .line 23
    if-eqz v2, :cond_29

    .line 24
    .line 25
    iget-object v2, v2, Lax/Z2/p;->j0:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_29

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 33
    .line 34
    iget-object v2, v2, Lax/Z2/p;->j0:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :cond_29
    iget-object v2, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 43
    .line 44
    if-eqz v2, :cond_3e

    .line 45
    .line 46
    iget-object v2, v2, Lax/Z2/p;->k0:Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v2, :cond_3e

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 54
    .line 55
    iget-object v2, v2, Lax/Z2/p;->k0:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_3e
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
    .line 68
.end method

.method private C5()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->D5()V

    .line 2
    .line 3
    .line 4
    const-string v0, "search_result"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/d3/n;->i3(Ljava/lang/String;)V

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

.method private D5()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j0;->O0:Lax/d3/j0$u;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/u3/q;->isCancelled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_f

    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/j0;->O0:Lax/d3/j0$u;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/d3/j0$u;->w()V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private E5(Ljava/util/Comparator;)Ljava/util/Set;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)",
            "Ljava/util/Set<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method private F5(Ljava/util/List;I)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/d3/j0;->z3()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "menu_folder"

    .line 18
    .line 19
    const-string v4, "delete"

    .line 20
    .line 21
    invoke-virtual {v2, v3, v4}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "loc"

    .line 26
    .line 27
    invoke-virtual {v2, v3, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "type"

    .line 32
    .line 33
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 41
    .line 42
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lax/Q2/f;->l(Lax/Q2/f;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v1, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 51
    .line 52
    new-instance v7, Lax/d3/j0$s;

    .line 53
    .line 54
    invoke-direct {v7, p0}, Lax/d3/j0$s;-><init>(Lax/d3/j0;)V

    .line 55
    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v6, 0x1

    .line 59
    move-object v5, p0

    .line 60
    move-object v2, p1

    .line 61
    move v3, p2

    .line 62
    invoke-static/range {v1 .. v8}, Lax/W2/o;->m(Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZLax/d3/s;ZLax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 63
    .line 64
    .line 65
    return-void
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

.method private G5()V
    .registers 14

    .line 1
    iget-object v0, p0, Lax/d3/j0;->V0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/d3/j0;->B5()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/d3/j0;->U0:Landroid/view/View;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/d3/j0;->F0:Ljava/util/List;

    .line 22
    .line 23
    iget-object v0, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/c3/q;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 33
    .line 34
    invoke-virtual {v0}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p0, v0}, Lax/d3/j0;->E5(Ljava/util/Comparator;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lax/d3/j0;->H0:Ljava/util/Map;

    .line 54
    .line 55
    iget-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 56
    .line 57
    if-eqz v0, :cond_3d

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    iget-object v0, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 63
    .line 64
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lax/d3/j0;->Q0:Lax/r3/d;

    .line 74
    .line 75
    if-nez v0, :cond_59

    .line 76
    .line 77
    new-instance v0, Lax/r3/d;

    .line 78
    .line 79
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object v3, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 84
    .line 85
    invoke-direct {v0, v2, v3}, Lax/r3/d;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/o;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lax/d3/j0;->Q0:Lax/r3/d;

    .line 89
    .line 90
    :cond_59
    new-instance v10, Lax/d3/j0$e;

    .line 91
    .line 92
    invoke-direct {v10, p0}, Lax/d3/j0$e;-><init>(Lax/d3/j0;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Lcom/voxdon/xplorer/widget/a;

    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iget-object v6, p0, Lax/d3/j0;->F0:Ljava/util/List;

    .line 102
    .line 103
    iget-object v7, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 104
    .line 105
    iget-object v8, p0, Lax/d3/j0;->Q0:Lax/r3/d;

    .line 106
    .line 107
    invoke-virtual {p0}, Lax/d3/j0;->c6()Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    const/4 v12, 0x1

    .line 112
    const/4 v9, 0x3

    .line 113
    invoke-direct/range {v4 .. v12}, Lcom/voxdon/xplorer/widget/a;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/r3/d;ILax/x3/z;ZZ)V

    .line 114
    .line 115
    .line 116
    iput-object v4, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 117
    .line 118
    iget-object v0, p0, Lax/d3/j0;->L0:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v4, v0}, Lcom/voxdon/xplorer/widget/a;->l0(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 124
    .line 125
    iget-object v2, p0, Lax/d3/j0;->f1:Landroid/widget/AdapterView$OnItemClickListener;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/widget/a;->p0(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 131
    .line 132
    iget-object v2, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 133
    .line 134
    iget-object v3, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v2, v3}, Lcom/voxdon/xplorer/widget/a;->t0(Lax/c3/K;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/a;->y0(Z)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 145
    .line 146
    iget-boolean v2, p0, Lax/d3/j0;->d1:Z

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/widget/a;->x0(Z)V

    .line 149
    .line 150
    .line 151
    invoke-direct {p0}, Lax/d3/j0;->g6()V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 155
    .line 156
    iget-object v2, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_ac

    .line 168
    .line 169
    invoke-direct {p0}, Lax/d3/j0;->C5()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_ac
    new-instance v2, Lax/d3/j0$u;

    .line 174
    .line 175
    iget-object v4, p0, Lax/d3/j0;->L0:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v5, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v6, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 180
    .line 181
    iget-object v7, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 182
    .line 183
    move-object v3, p0

    .line 184
    invoke-direct/range {v2 .. v7}, Lax/d3/j0$u;-><init>(Lax/d3/j0;Ljava/lang/String;Ljava/lang/String;Lax/c3/K;Lcom/voxdon/xplorer/file/o;)V

    .line 185
    .line 186
    .line 187
    iput-object v2, v3, Lax/d3/j0;->O0:Lax/d3/j0$u;

    .line 188
    .line 189
    new-array v0, v1, [Ljava/lang/Void;

    .line 190
    .line 191
    invoke-virtual {v2, v0}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 192
    .line 193
    .line 194
    return-void
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

.method private H5(Ljava/util/List;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, v2, p1, p2}, Lax/W2/c;->m(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/f;->supportInvalidateOptionsMenu()V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-virtual {p0, p1}, Lax/d3/n;->e4(Z)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method private J5(Z)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lax/x3/u;->a(Landroid/widget/AbsListView;Landroid/widget/ListAdapter;Z)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

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

.method private K5(Z)Ljava/util/List;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lax/x3/u;->a(Landroid/widget/AbsListView;Landroid/widget/ListAdapter;Z)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_11
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_27

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 29
    .line 30
    invoke-interface {v2}, Lax/c3/b;->isDirectory()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_11

    .line 35
    .line 36
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_11

    .line 40
    :cond_27
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    :cond_2c
    if-ge v2, v1, :cond_6a

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :cond_3a
    :goto_3a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2c

    .line 64
    .line 65
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lcom/voxdon/xplorer/file/n;

    .line 70
    .line 71
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-le v6, v7, :cond_3a

    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-static {v6, v5}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_3a

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 104
    .line 105
    .line 106
    goto :goto_3a

    .line 107
    :cond_6a
    return-object p1
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

.method private L5()Lax/B/b;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/B/b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/B/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/B/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_8
    iget-object v2, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 10
    .line 11
    if-eqz v2, :cond_54

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_54

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 28
    .line 29
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_23

    .line 34
    .line 35
    goto :goto_10

    .line 36
    :cond_23
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_50

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/16 v6, 0x8

    .line 47
    .line 48
    if-le v5, v6, :cond_50

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    :goto_37
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-ge v5, v7, :cond_4c

    .line 61
    .line 62
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    const/16 v8, 0x2e

    .line 67
    .line 68
    if-ne v7, v8, :cond_47

    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    :cond_47
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_37

    .line 75
    :catchall_4a
    move-exception v0

    .line 76
    goto :goto_56

    .line 77
    :cond_4c
    const/4 v3, 0x1

    .line 78
    if-le v6, v3, :cond_50

    .line 79
    .line 80
    goto :goto_10

    .line 81
    :cond_50
    invoke-virtual {v0, v4}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_10

    .line 85
    :cond_54
    monitor-exit v1

    .line 86
    return-object v0

    .line 87
    :goto_56
    monitor-exit v1
    :try_end_57
    .catchall {:try_start_8 .. :try_end_57} :catchall_4a

    .line 88
    throw v0
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

.method private M5(Landroid/view/View;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v2, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v0, v2, v3

    .line 16
    .line 17
    const v0, 0x7f1303b2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 29
    .line 30
    iget-object v4, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 31
    .line 32
    iget-object v5, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v4, v5}, Lax/c3/d0;->D(Lax/c3/K;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2c

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v2, v0, v4}, Lcom/voxdon/xplorer/activity/MainActivity;->z2(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_39

    .line 45
    :cond_2c
    iget-object v4, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 46
    .line 47
    iget-object v5, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-static {v4, v5, v6}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v2, v0, v4}, Lcom/voxdon/xplorer/activity/MainActivity;->z2(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_39
    const v0, 0x7f0a03a0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lax/d3/j0;->U0:Landroid/view/View;

    .line 66
    .line 67
    const v0, 0x7f0a03a3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroid/widget/TextView;

    .line 75
    .line 76
    iput-object v0, p0, Lax/d3/j0;->V0:Landroid/widget/TextView;

    .line 77
    .line 78
    new-instance v0, Lax/x3/d;

    .line 79
    .line 80
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const v4, 0x7f0a008e

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const v5, 0x7f0a0099

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-direct {v0, v2, v4, v5}, Lax/x3/d;-><init>(Lax/n/c;Landroid/view/View;Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 102
    .line 103
    invoke-virtual {p0}, Lax/d3/j0;->a6()V

    .line 104
    .line 105
    .line 106
    const v0, 0x7f0a0294

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lcom/voxdon/xplorer/widget/FileListView;

    .line 114
    .line 115
    iput-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 116
    .line 117
    const v0, 0x7f0a0182

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iput-object v0, p0, Lax/d3/j0;->S0:Landroid/view/View;

    .line 125
    .line 126
    const v0, 0x7f0a00bd

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, Lax/d3/j0;->T0:Landroid/view/View;

    .line 134
    .line 135
    new-instance v0, Lax/d3/j0$p;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Lax/d3/j0$p;-><init>(Lax/d3/j0;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lax/d3/j0;->V0:Landroid/widget/TextView;

    .line 144
    .line 145
    new-instance v0, Lax/d3/j0$q;

    .line 146
    .line 147
    invoke-direct {v0, p0}, Lax/d3/j0$q;-><init>(Lax/d3/j0;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 154
    .line 155
    const/4 v0, 0x3

    .line 156
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 160
    .line 161
    iget-object v0, p0, Lax/d3/j0;->f1:Landroid/widget/AdapterView$OnItemClickListener;

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1}, Lax/Q2/j;->g()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_bd

    .line 179
    .line 180
    iput-boolean v1, p0, Lax/d3/j0;->Y0:Z

    .line 181
    .line 182
    iget-object p1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 183
    .line 184
    iget-object v0, p0, Lax/d3/j0;->g1:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_bd
    iput-boolean v3, p0, Lax/d3/j0;->Y0:Z

    .line 191
    .line 192
    iget-object p1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 193
    .line 194
    iget-object v0, p0, Lax/d3/j0;->i1:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 197
    .line 198
    .line 199
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
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
.end method

.method private N5()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method private O5(IZZ)V
    .registers 6

    .line 1
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lax/W2/c;->v()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p2, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lax/d3/n;->X2(Z)V

    .line 13
    .line 14
    .line 15
    :cond_e
    const/4 p2, 0x1

    .line 16
    if-eqz p3, :cond_24

    .line 17
    .line 18
    iget-object p3, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 19
    .line 20
    invoke-virtual {p3}, Landroid/view/View;->hasFocus()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_24

    .line 25
    .line 26
    iget-object p3, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 27
    .line 28
    invoke-virtual {p3}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    const/4 v1, -0x1

    .line 33
    if-eq p3, v1, :cond_24

    .line 34
    .line 35
    const/4 p3, 0x1

    .line 36
    goto :goto_25

    .line 37
    :cond_24
    const/4 p3, 0x0

    .line 38
    :goto_25
    invoke-direct {p0, p3}, Lax/d3/j0;->K5(Z)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-gtz v1, :cond_5d

    .line 47
    .line 48
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string p2, "NO SELECTED ITEM"

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v0, "size:"

    .line 68
    .line 69
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5d
    sparse-switch p1, :sswitch_data_9c

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :sswitch_61
    iget-object p1, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 99
    .line 100
    invoke-virtual {p0, p1, p3}, Lax/d3/n;->t4(Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :sswitch_6a
    invoke-direct {p0, p3}, Lax/d3/j0;->X5(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :sswitch_71
    iget-object p1, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 115
    .line 116
    invoke-virtual {p0, p1, p3}, Lax/d3/n;->B4(Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :sswitch_7a
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 128
    .line 129
    invoke-direct {p0, p1}, Lax/d3/j0;->R5(Lcom/voxdon/xplorer/file/n;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :sswitch_87
    invoke-direct {p0, p3, v0}, Lax/d3/j0;->F5(Ljava/util/List;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :sswitch_8e
    invoke-direct {p0, p3, p2}, Lax/d3/j0;->H5(Ljava/util/List;Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :sswitch_95
    invoke-direct {p0, p3, v0}, Lax/d3/j0;->H5(Ljava/util/List;Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lax/d3/n;->h3()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :sswitch_data_9c
    .sparse-switch
        0x7f0a0088 -> :sswitch_95
        0x7f0a008a -> :sswitch_8e
        0x7f0a008b -> :sswitch_87
        0x7f0a0091 -> :sswitch_7a
        0x7f0a0094 -> :sswitch_71
        0x7f0a0097 -> :sswitch_6a
        0x7f0a009c -> :sswitch_61
        0x7f0a02e0 -> :sswitch_71
        0x7f0a02e4 -> :sswitch_6a
        0x7f0a02f1 -> :sswitch_61
    .end sparse-switch
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
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

.method private P5()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3f

    .line 8
    .line 9
    const v1, 0x7f0a02e4

    .line 10
    .line 11
    .line 12
    const v2, 0x7f0a0091

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v0, v4, :cond_1d

    .line 18
    .line 19
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 20
    .line 21
    invoke-virtual {v0, v2, v4}, Lax/x3/d;->o(IZ)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 27
    .line 28
    .line 29
    goto :goto_27

    .line 30
    :cond_1d
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Lax/x3/d;->o(IZ)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v3}, Lax/x3/d;->t(IZ)V

    .line 38
    .line 39
    .line 40
    :goto_27
    invoke-direct {p0, v3}, Lax/d3/j0;->K5(Z)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lax/c3/B;->B(Ljava/util/List;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const v1, 0x7f0a02f1

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_3a

    .line 52
    .line 53
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v3}, Lax/x3/d;->t(IZ)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 60
    .line 61
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method static synthetic Q4(Lax/d3/j0;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->L0:Ljava/lang/String;

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

.method private Q5(Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Lax/d3/j0;->T5(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method static synthetic R4(Lax/d3/j0;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->D0:Ljava/lang/String;

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

.method private R5(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_search"

    .line 6
    .line 7
    const-string v2, "search_open_parent"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 14
    .line 15
    invoke-virtual {v1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "loc"

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->S()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p0, v0, p1}, Lax/d3/j0;->T5(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)V

    .line 41
    .line 42
    .line 43
    return-void
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

.method static synthetic S4(Lax/d3/j0;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->N5()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private S5()V
    .registers 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 7
    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 16
    .line 17
    iget-object v3, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v2, v3}, Lcom/voxdon/xplorer/bookmark/Bookmark;->d(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v5, Lax/d3/j0$k;

    .line 24
    .line 25
    invoke-direct {v5, p0}, Lax/d3/j0$k;-><init>(Lax/d3/j0;)V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lax/d3/j0$l;

    .line 29
    .line 30
    invoke-direct {v6, p0}, Lax/d3/j0$l;-><init>(Lax/d3/j0;)V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lax/d3/j0;->C5()V

    .line 39
    .line 40
    .line 41
    return-void
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

.method static synthetic T4(Lax/d3/j0;Landroid/view/ActionMode;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j0;->e6(Landroid/view/ActionMode;)V

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

.method private T5(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)V
    .registers 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 7
    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->c(Landroid/content/Context;Landroid/net/Uri;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object p1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_22

    .line 33
    .line 34
    goto :goto_2e

    .line 35
    :cond_22
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    sub-int v3, v0, v3

    .line 46
    .line 47
    :goto_2e
    new-instance v5, Lax/d3/j0$m;

    .line 48
    .line 49
    invoke-direct {v5, p0, p2}, Lax/d3/j0$m;-><init>(Lax/d3/j0;Lcom/voxdon/xplorer/file/n;)V

    .line 50
    .line 51
    .line 52
    new-instance v6, Lax/d3/j0$n;

    .line 53
    .line 54
    invoke-direct {v6, p0, p1, v3}, Lax/d3/j0$n;-><init>(Lax/d3/j0;II)V

    .line 55
    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Lax/d3/j0;->C5()V

    .line 63
    .line 64
    .line 65
    return-void
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

.method static synthetic U4(Lax/d3/j0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->W5()V

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
.end method

.method private U5()V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ROOT"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "LOCATION"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lax/Q2/f;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "LOCATION_KEY"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v0, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "query"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lax/d3/j0;->L0:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "INCLUDE_SUBFOLDER"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput-boolean v0, p0, Lax/d3/j0;->d1:Z

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "FILTER_INFO"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lax/Z2/p;

    .line 77
    .line 78
    if-eqz v0, :cond_54

    .line 79
    .line 80
    iget-object v1, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lax/Z2/p;->f(Lax/Z2/p;)V

    .line 83
    .line 84
    .line 85
    :cond_54
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v1, "SORT_METHOD"

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v2, "INDEX"

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iput v1, p0, Lax/d3/j0;->M0:I

    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "TOP"

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iput v1, p0, Lax/d3/j0;->N0:I

    .line 118
    .line 119
    const-string v1, "None"

    .line 120
    .line 121
    if-eqz v0, :cond_7d

    .line 122
    .line 123
    iput-object v0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_9c

    .line 126
    :cond_7d
    iget-boolean v0, p0, Lax/d3/j0;->d1:Z

    .line 127
    .line 128
    if-eqz v0, :cond_84

    .line 129
    .line 130
    iput-object v1, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 131
    .line 132
    goto :goto_9c

    .line 133
    :cond_84
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v2, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 138
    .line 139
    invoke-virtual {v2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-object v4, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 144
    .line 145
    invoke-virtual {v4}, Lax/c3/K;->b()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    iget-object v5, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v0, v2, v4, v5, v3}, Lax/d3/E;->F7(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 156
    .line 157
    :goto_9c
    iget-object v0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_ad

    .line 164
    .line 165
    const-string v0, "SearchPath"

    .line 166
    .line 167
    invoke-static {v0}, Lax/c3/q;->a(Ljava/lang/String;)Lax/c3/q;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 172
    .line 173
    return-void

    .line 174
    :cond_ad
    iget-object v0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v0}, Lax/c3/q;->a(Ljava/lang/String;)Lax/c3/q;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 181
    .line 182
    return-void
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

.method static synthetic V4(Lax/d3/j0;)Ljava/lang/Object;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

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

.method private V5()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lax/d3/n;->e4(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/d3/n;->K3()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_15

    .line 10
    .line 11
    iget-object v1, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lax/x3/d;->y(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/x3/d;->A()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lax/x3/d;->y(I)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method static synthetic W4(Lax/d3/j0;)Ljava/util/Set;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->G0:Ljava/util/Set;

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

.method private W5()V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    :goto_4
    move-object v2, p0

    .line 6
    goto :goto_3f

    .line 7
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_4

    .line 14
    :cond_d
    iget-object v1, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_10
    iget-object v0, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 20
    .line 21
    .line 22
    monitor-exit v1
    :try_end_16
    .catchall {:try_start_10 .. :try_end_16} :catchall_40

    .line 23
    iget-object v0, p0, Lax/d3/j0;->H0:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lax/d3/j0$u;

    .line 34
    .line 35
    iget-object v3, p0, Lax/d3/j0;->L0:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, p0, Lax/d3/j0;->D0:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v5, p0, Lax/d3/j0;->E0:Lax/c3/K;

    .line 40
    .line 41
    iget-object v6, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 42
    .line 43
    move-object v2, p0

    .line 44
    invoke-direct/range {v1 .. v6}, Lax/d3/j0$u;-><init>(Lax/d3/j0;Ljava/lang/String;Ljava/lang/String;Lax/c3/K;Lcom/voxdon/xplorer/file/o;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, v2, Lax/d3/j0;->O0:Lax/d3/j0$u;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    new-array v0, v0, [Ljava/lang/Void;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 53
    .line 54
    .line 55
    iget-object v0, v2, Lax/d3/j0;->S0:Landroid/view/View;

    .line 56
    .line 57
    if-eqz v0, :cond_3f

    .line 58
    .line 59
    const/16 v1, 0x8

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    :goto_3f
    return-void

    .line 65
    :catchall_40
    move-exception v0

    .line 66
    move-object v2, p0

    .line 67
    :goto_42
    :try_start_42
    monitor-exit v1
    :try_end_43
    .catchall {:try_start_42 .. :try_end_43} :catchall_44

    .line 68
    throw v0

    .line 69
    :catchall_44
    move-exception v0

    .line 70
    goto :goto_42
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

.method static synthetic X4(Lax/d3/j0;)Lcom/voxdon/xplorer/file/o;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

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

.method private X5(Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lax/d3/j0;->z3()Lax/Q2/f;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "menu_folder"

    .line 25
    .line 26
    const-string v4, "rename"

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "loc"

    .line 33
    .line 34
    invoke-virtual {v2, v3, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "type"

    .line 39
    .line 40
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x1

    .line 52
    if-eq v0, v1, :cond_39

    .line 53
    .line 54
    invoke-static {}, Lax/u3/b;->f()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_39
    const/4 v0, 0x0

    .line 59
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 64
    .line 65
    iget-object v1, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v5, Lax/d3/j0$a;

    .line 72
    .line 73
    invoke-direct {v5, p0, v0}, Lax/d3/j0$a;-><init>(Lax/d3/j0;Lcom/voxdon/xplorer/file/n;)V

    .line 74
    .line 75
    .line 76
    new-instance v6, Lax/d3/j0$b;

    .line 77
    .line 78
    invoke-direct {v6, p0}, Lax/d3/j0$b;-><init>(Lax/d3/j0;)V

    .line 79
    .line 80
    .line 81
    move-object v4, p0

    .line 82
    move-object v3, p1

    .line 83
    invoke-static/range {v1 .. v6}, Lax/W2/z;->o(Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;Lax/d3/s;Lax/W2/h$a;Lax/W2/z$c;)V

    .line 84
    .line 85
    .line 86
    return-void
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

.method static synthetic Y4(Lax/d3/j0;)Lax/c3/K;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->E0:Lax/c3/K;

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

.method private Y5(Lax/c3/K;Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 1
    if-eqz p1, :cond_14

    .line 2
    .line 3
    if-eqz p2, :cond_14

    .line 4
    .line 5
    if-eqz p3, :cond_14

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1, p2, p3, v0}, Lax/Z2/b;->o(Lax/c3/K;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    return-void
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

.method static synthetic Z4(Lax/d3/j0;IZZ)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/d3/j0;->O5(IZZ)V

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

.method private Z5(Ljava/lang/String;)V
    .registers 4

    .line 1
    const-string v0, "None"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    const-string v0, "SearchPath"

    .line 10
    .line 11
    invoke-static {v0}, Lax/c3/q;->a(Ljava/lang/String;)Lax/c3/q;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 16
    .line 17
    goto :goto_17

    .line 18
    :cond_11
    invoke-static {p1}, Lax/c3/q;->a(Ljava/lang/String;)Lax/c3/q;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 23
    .line 24
    :goto_17
    iget-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 25
    .line 26
    if-nez v0, :cond_30

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "no sort method : "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    iget-object v0, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter v0

    .line 52
    :try_start_33
    iput-object p1, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p1, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 55
    .line 56
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, p1}, Lax/d3/j0;->E5(Ljava/util/Comparator;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v1, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 65
    .line 66
    invoke-interface {p1, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 70
    .line 71
    iget-object p1, p0, Lax/d3/j0;->F0:Ljava/util/List;

    .line 72
    .line 73
    iget-object v1, p0, Lax/d3/j0;->I0:Lax/c3/q;

    .line 74
    .line 75
    invoke-static {p1, v1}, Lax/c3/q;->h(Ljava/util/List;Lax/c3/q;)V

    .line 76
    .line 77
    .line 78
    monitor-exit v0
    :try_end_4e
    .catchall {:try_start_33 .. :try_end_4e} :catchall_57

    .line 79
    invoke-direct {p0}, Lax/d3/j0;->g6()V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catchall_57
    move-exception p1

    .line 89
    :try_start_58
    monitor-exit v0
    :try_end_59
    .catchall {:try_start_58 .. :try_end_59} :catchall_57

    .line 90
    throw p1
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

.method static synthetic a5(Lax/d3/j0;)Lax/d3/n$r;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->a1:Lax/d3/n$r;

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

.method static synthetic b5(Lax/d3/j0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->A5()V

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
.end method

.method private b6()V
    .registers 4

    .line 1
    invoke-static {}, Lax/a3/S;->B3()Lax/a3/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lax/d3/j0;->L5()Lax/B/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lax/a3/S;->M3(Lax/B/b;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 13
    .line 14
    new-instance v2, Lax/d3/j0$j;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lax/d3/j0$j;-><init>(Lax/d3/j0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lax/a3/S;->N3(Lax/Z2/p;Lax/a3/S$k;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "option"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {p0, v0, v1, v2}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    return-void
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

.method static synthetic c5(Lax/d3/j0;)Lax/Z2/p;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->e1:Lax/Z2/p;

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

.method static synthetic d5(Lax/d3/j0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->V5()V

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
.end method

.method private d6()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/V;->l3(Ljava/lang/String;)Lax/a3/V;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lax/d3/j0$i;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lax/d3/j0$i;-><init>(Lax/d3/j0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lax/a3/V;->m3(Lax/a3/V$b;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "option"

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p0, v0, v1, v2}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static synthetic e5(Lax/d3/j0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->P5()V

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
.end method

.method private e6(Landroid/view/ActionMode;)V
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "/"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getCount()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/view/ActionMode;->setTitle(Ljava/lang/CharSequence;)V

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

.method static synthetic f5(Lax/d3/j0;Z)Ljava/util/List;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j0;->J5(Z)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private f6(I)V
    .registers 4

    .line 1
    if-ltz p1, :cond_2f

    .line 2
    .line 3
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt p1, v0, :cond_b

    .line 10
    .line 11
    goto :goto_2f

    .line 12
    :cond_b
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->B0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2f

    .line 19
    .line 20
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->U(I)Lax/Z2/q;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_2f

    .line 27
    .line 28
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 29
    .line 30
    invoke-static {v0, p1}, Lax/Z2/q;->d(Landroid/widget/AbsListView;Lax/Z2/q;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Lax/Z2/q;->e()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v0, v1, :cond_2f

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lax/Z2/q;->f(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2f
    :goto_2f
    return-void
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

.method static synthetic g5(Lax/d3/j0;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j0;->f6(I)V

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

.method private g6()V
    .registers 4

    .line 1
    const-string v0, "DateDown"

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_39

    .line 11
    .line 12
    const-string v0, "DateUp"

    .line 13
    .line 14
    iget-object v2, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_16

    .line 21
    .line 22
    goto :goto_39

    .line 23
    :cond_16
    const-string v0, "TypeDown"

    .line 24
    .line 25
    iget-object v2, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_32

    .line 32
    .line 33
    const-string v0, "TypeUp"

    .line 34
    .line 35
    iget-object v2, p0, Lax/d3/j0;->J0:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2b

    .line 42
    .line 43
    goto :goto_32

    .line 44
    :cond_2b
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1, v1}, Lcom/voxdon/xplorer/widget/a;->r0(ZI)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_32
    :goto_32
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 52
    .line 53
    const/4 v2, 0x2

    .line 54
    invoke-virtual {v0, v1, v2}, Lcom/voxdon/xplorer/widget/a;->r0(ZI)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_39
    :goto_39
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 59
    .line 60
    invoke-virtual {v0, v1, v1}, Lcom/voxdon/xplorer/widget/a;->r0(ZI)V

    .line 61
    .line 62
    .line 63
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method static synthetic h5(Lax/d3/j0;Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j0;->z5(Ljava/util/List;)V

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

.method static synthetic i5(Lax/d3/j0;Lax/c3/K;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/d3/j0;->Y5(Lax/c3/K;Ljava/lang/String;Ljava/lang/String;)V

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

.method static synthetic j5(Lax/d3/j0;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/j0;->M0:I

    .line 2
    .line 3
    return p0
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

.method static synthetic k5(Lax/d3/j0;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/j0;->N0:I

    .line 2
    .line 3
    return p0
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

.method static synthetic l5(Lax/d3/j0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/j0;->d1:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic m5(Lax/d3/j0;Lax/d3/j0$u;)Lax/d3/j0$u;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/j0;->O0:Lax/d3/j0$u;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic n5(Lax/d3/j0;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->J0:Ljava/lang/String;

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

.method static synthetic o5(Lax/d3/j0;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->U0:Landroid/view/View;

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

.method static synthetic p5(Lax/d3/j0;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/d3/j0;->c1:J

    .line 2
    .line 3
    return-wide p1
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

.method static synthetic q5(Lax/d3/j0;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j0;->Z5(Ljava/lang/String;)V

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

.method static synthetic r5(Lax/d3/j0;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->B5()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic s5(Lax/d3/j0;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->V0:Landroid/widget/TextView;

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

.method static synthetic t5(Lax/d3/j0;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->F0:Ljava/util/List;

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

.method static synthetic u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

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

.method static synthetic v5(Lax/d3/j0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/j0;->Y0:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

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

.method static synthetic x5(Lax/d3/j0;Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j0;->Q5(Lcom/voxdon/xplorer/file/n;)V

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

.method static synthetic y5(Lax/d3/j0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->S5()V

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
.end method

.method private z5(Ljava/util/List;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_3b

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, Lax/d3/j0;->H0:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_35

    .line 37
    .line 38
    iget-object v4, p0, Lax/d3/j0;->H0:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lcom/voxdon/xplorer/file/n;

    .line 45
    .line 46
    iget-object v5, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 47
    .line 48
    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_35

    .line 52
    :catchall_33
    move-exception p1

    .line 53
    goto :goto_42

    .line 54
    :cond_35
    :goto_35
    iget-object v4, p0, Lax/d3/j0;->H0:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_7

    .line 60
    :cond_3b
    iget-object v1, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 61
    .line 62
    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_42
    monitor-exit v0
    :try_end_43
    .catchall {:try_start_3 .. :try_end_43} :catchall_33

    .line 68
    throw p1
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


# virtual methods
.method public B1(Landroid/view/MenuItem;)Z
    .registers 5

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a02d2

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v1, :cond_18

    .line 10
    .line 11
    const v1, 0x7f0a02f4

    .line 12
    .line 13
    .line 14
    if-eq v0, v1, :cond_14

    .line 15
    .line 16
    invoke-super {p0, p1}, Lax/d3/n;->B1(Landroid/view/MenuItem;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/d3/j0;->d6()V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_18
    invoke-direct {p0}, Lax/d3/j0;->b6()V

    .line 26
    .line 27
    .line 28
    return v2
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
.end method

.method public C3()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "/"

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

.method public F1(Landroid/view/Menu;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->F1(Landroid/view/Menu;)V

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
.end method

.method public H1()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/d3/n;->H1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lax/d3/j0;->X0:Z

    .line 5
    .line 6
    if-nez v0, :cond_d

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/d3/j0;->X0:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lax/d3/j0;->G5()V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method I5(Ljava/util/Set;)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_9
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_21

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 21
    .line 22
    iget-object v2, p0, Lax/d3/j0;->e1:Lax/Z2/p;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lax/Z2/p;->e(Lcom/voxdon/xplorer/file/n;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_9

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_9

    .line 34
    :cond_21
    return-object v0
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
.end method

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/n;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->x2(Z)V

    .line 6
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

.method public M4()V
    .registers 1

    .line 1
    return-void
    .line 2
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
.end method

.method public N3()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public V2()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->D5()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    return v0
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

.method protected V3()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/x3/d;->m()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    invoke-super {p0}, Lax/d3/n;->V3()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected W3(Lax/d3/n$o;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->W3(Lax/d3/n$o;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object p1, p0, Lax/d3/j0;->V0:Landroid/widget/TextView;

    .line 12
    .line 13
    const v0, 0x7f080093

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/widget/a;->g0(Z)V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method

.method protected X3(Lax/d3/n$o;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->X3(Lax/d3/n$o;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const v0, 0x7f060478

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v0, p0, Lax/d3/j0;->V0:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/widget/a;->g0(Z)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method public Y(Ljava/util/List;Z)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_23

    .line 8
    :cond_7
    if-nez p1, :cond_a

    .line 9
    .line 10
    goto :goto_23

    .line 11
    :cond_a
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_13

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lax/d3/j0;->z5(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    if-nez p2, :cond_24

    .line 25
    .line 26
    iget-wide p1, p0, Lax/d3/j0;->c1:J

    .line 27
    .line 28
    sub-long p1, v0, p1

    .line 29
    .line 30
    const-wide/16 v2, 0xfa

    .line 31
    .line 32
    cmp-long v4, p1, v2

    .line 33
    .line 34
    if-gez v4, :cond_24

    .line 35
    .line 36
    :goto_23
    return-void

    .line 37
    :cond_24
    iput-wide v0, p0, Lax/d3/j0;->c1:J

    .line 38
    .line 39
    iget-object p1, p0, Lax/d3/j0;->Z0:Landroid/os/Handler;

    .line 40
    .line 41
    iget-object p2, p0, Lax/d3/j0;->h1:Ljava/lang/Runnable;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
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

.method public Z3(Ljava/lang/String;)V
    .registers 2

    .line 1
    return-void
    .line 2
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

.method protected a6()V
    .registers 6

    .line 1
    new-instance v0, Lax/d3/j0$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/d3/j0$c;-><init>(Lax/d3/j0;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 7
    .line 8
    const v2, 0x7f13027b

    .line 9
    .line 10
    .line 11
    const v3, 0x7f08018b

    .line 12
    .line 13
    .line 14
    const v4, 0x7f0a0088

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 21
    .line 22
    const v2, 0x7f130292

    .line 23
    .line 24
    .line 25
    const v3, 0x7f0801a7

    .line 26
    .line 27
    .line 28
    const v4, 0x7f0a008a

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 35
    .line 36
    const v2, 0x7f13027f

    .line 37
    .line 38
    .line 39
    const v3, 0x7f080194

    .line 40
    .line 41
    .line 42
    const v4, 0x7f0a008b

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 49
    .line 50
    const v2, 0x7f130299

    .line 51
    .line 52
    .line 53
    const v3, 0x7f0801a9

    .line 54
    .line 55
    .line 56
    const v4, 0x7f0a0091

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 63
    .line 64
    invoke-virtual {v0}, Lax/x3/d;->e()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 68
    .line 69
    new-instance v1, Lax/d3/j0$d;

    .line 70
    .line 71
    invoke-direct {v1, p0}, Lax/d3/j0$d;-><init>(Lax/d3/j0;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lax/x3/d;->n(Lax/x3/d$f;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 78
    .line 79
    const v1, 0x7f0f0022

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lax/x3/d;->l(I)V

    .line 83
    .line 84
    .line 85
    return-void
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

.method public c4(Z)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->W5()V

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
.end method

.method protected c6()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/t3/k;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public i()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_14

    .line 8
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R0()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x1020002

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_15

    .line 20
    .line 21
    :goto_14
    return-void

    .line 22
    :cond_15
    const v1, 0x7f130141

    .line 23
    .line 24
    .line 25
    const/4 v2, -0x2

    .line 26
    invoke-static {v0, v1, v2}, Lax/u3/B;->S(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lax/d3/j0$f;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lax/d3/j0$f;-><init>(Lax/d3/j0;)V

    .line 33
    .line 34
    .line 35
    const v2, 0x104000a

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Lcom/google/android/material/snackbar/Snackbar;->q0(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->H()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const v2, 0x7f0a0421

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroid/widget/TextView;

    .line 54
    .line 55
    const/16 v2, -0x100

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lax/d3/n;->D4(Lcom/google/android/material/snackbar/Snackbar;)V

    .line 61
    .line 62
    .line 63
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public j3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

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
.end method

.method public j4()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

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
    iget-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, v1}, Lax/d3/j0;->K5(Z)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->k4(Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public k1(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->k1(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/j0;->U5()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public o()V
    .registers 1

    .line 1
    return-void
    .line 2
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
.end method

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 6

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/n;->onApplyWindowsInsets(Lax/T/b;Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2f

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/d3/n;->T3()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_10

    .line 15
    .line 16
    goto :goto_2f

    .line 17
    :cond_10
    if-nez p2, :cond_2f

    .line 18
    .line 19
    iget-object p2, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lax/d3/j0;->R0:Lcom/voxdon/xplorer/widget/FileListView;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget p1, p1, Lax/T/b;->d:I

    .line 44
    .line 45
    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    :goto_2f
    return-void
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

.method public q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 4

    .line 1
    const v0, 0x7f0f001d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lax/d3/n;->G3(Landroid/view/MenuInflater;Landroid/view/Menu;I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method protected q3()I
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f06046c

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
    .line 21
.end method

.method public r1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    .line 1
    const p2, 0x7f0d009e

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lax/d3/j0;->M5(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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

.method protected r3()I
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-ge v0, v1, :cond_1a

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x7f0604a6

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_1a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const v1, 0x7f060470

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0
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

.method public s1()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/j0;->D5()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/j0;->F0:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_1e

    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/j0;->K0:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/d3/j0;->b1:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_f
    iget-object v1, p0, Lax/d3/j0;->G0:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 19
    .line 20
    .line 21
    monitor-exit v0
    :try_end_15
    .catchall {:try_start_f .. :try_end_15} :catchall_1b

    .line 22
    iget-object v0, p0, Lax/d3/j0;->H0:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 25
    .line 26
    .line 27
    goto :goto_1e

    .line 28
    :catchall_1b
    move-exception v1

    .line 29
    :try_start_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_1c .. :try_end_1d} :catchall_1b

    .line 30
    throw v1

    .line 31
    :cond_1e
    :goto_1e
    iget-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 32
    .line 33
    if-eqz v0, :cond_29

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lax/d3/j0;->P0:Lcom/voxdon/xplorer/file/o;

    .line 41
    .line 42
    :cond_29
    invoke-super {p0}, Lax/d3/n;->s1()V

    .line 43
    .line 44
    .line 45
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

.method protected s3()Lax/x3/h$a;
    .registers 2

    .line 1
    sget-object v0, Lax/x3/h$a;->q:Lax/x3/h$a;

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

.method public x1(Z)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->x1(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_8

    .line 5
    .line 6
    invoke-direct {p0}, Lax/d3/j0;->C5()V

    .line 7
    .line 8
    .line 9
    :cond_8
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
    .line 22
.end method

.method public x3()I
    .registers 3

    .line 1
    iget v0, p0, Lax/d3/j0;->C0:I

    .line 2
    .line 3
    if-gez v0, :cond_10

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "location_key"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lax/d3/j0;->C0:I

    .line 16
    .line 17
    :cond_10
    iget v0, p0, Lax/d3/j0;->C0:I

    .line 18
    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public z3()Lax/Q2/f;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->s1:Lax/Q2/f;

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
