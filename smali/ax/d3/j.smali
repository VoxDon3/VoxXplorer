.class public Lax/d3/j;
.super Lax/d3/n;
.source "SourceFile"

# interfaces
.implements Lax/g3/g;
.implements Landroidx/viewpager/widget/ViewPager$j;
.implements Lax/g3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d3/j$s;
    }
.end annotation


# instance fields
.field private C0:Lax/Q2/f;

.field private D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field private E0:Z

.field private F0:Lcom/voxdon/xplorer/widget/MyViewPager;

.field private G0:Lcom/google/android/material/tabs/TabLayout;

.field protected H0:Lcom/voxdon/xplorer/widget/PathBar;

.field private I0:Lax/x3/c;

.field private J0:Lax/d3/j$s;

.field private K0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private L0:Landroid/widget/EditText;

.field private M0:Landroid/view/MenuItem;

.field private N0:Z

.field private O0:Lax/x3/d;

.field private P0:Lax/u3/m;

.field private Q0:Landroidx/recyclerview/widget/RecyclerView;

.field private R0:Landroid/view/View;

.field private S0:Lax/t3/i;

.field private T0:Landroid/os/Handler;

.field private U0:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/n;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/d3/j;->E0:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

    .line 13
    .line 14
    new-instance v0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/d3/j;->T0:Landroid/os/Handler;

    .line 20
    .line 21
    return-void
.end method

.method private D5()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lax/d3/n;->e4(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/d3/j;->K3()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_33

    .line 10
    .line 11
    iget-object v1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lax/x3/d;->y(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/MyViewPager;->U(Z)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_63

    .line 26
    .line 27
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lax/x3/b;->getListView()Landroid/widget/ListView;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lax/x3/b;->getGridView()Landroid/widget/GridView;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Lax/d3/j$f;

    .line 44
    .line 45
    invoke-direct {v2, p0, v0, v1}, Lax/d3/j$f;-><init>(Lax/d3/j;Landroid/view/View;Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    iget-object v0, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lax/x3/d;->y(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/MyViewPager;->U(Z)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_63

    .line 70
    .line 71
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lax/x3/b;->getListView()Landroid/widget/ListView;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Lax/x3/b;->getGridView()Landroid/widget/GridView;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/4 v2, -0x1

    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 98
    .line 99
    .line 100
    :cond_63
    return-void
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

.method private E5()V
    .registers 4

    .line 1
    :try_start_0
    invoke-static {}, Lax/u3/o;->b()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x3ed

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lax/c3/u;->r0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/d3/j;->P0:Lax/u3/m;

    .line 11
    .line 12
    if-nez v0, :cond_14

    .line 13
    .line 14
    new-instance v0, Lax/u3/m;

    .line 15
    .line 16
    invoke-direct {v0}, Lax/u3/m;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/d3/j;->P0:Lax/u3/m;

    .line 20
    .line 21
    :cond_14
    iget-object v0, p0, Lax/d3/j;->P0:Lax/u3/m;

    .line 22
    .line 23
    invoke-virtual {p0}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lax/d3/j$h;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lax/d3/j$h;-><init>(Lax/d3/j;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lax/u3/m;->f(Landroid/content/Context;Lax/u3/m$c;)V
    :try_end_22
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_23
    const v0, 0x7f130137

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private G5(Ljava/lang/String;Z)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lax/x3/c;->y(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1e

    .line 27
    .line 28
    invoke-direct {p0, p2}, Lax/d3/j;->N5(Z)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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

.method private H5()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->u3()Lax/Z2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/n;->u3()Lax/Z2/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v0, v0, Lax/Z2/f;->e0:Z

    .line 12
    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    iget-object v0, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 17
    .line 18
    iget-object v1, p0, Lax/d3/j;->C0:Lax/Q2/f;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/PathBar;->setParentLocation(Lax/Q2/f;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private I5()V
    .registers 6

    .line 1
    new-instance v0, Lax/d3/j$e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/d3/j$e;-><init>(Lax/d3/j;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 7
    .line 8
    const v2, 0x7f130273

    .line 9
    .line 10
    .line 11
    const v3, 0x7f080171

    .line 12
    .line 13
    .line 14
    const v4, 0x7f0a0085

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 21
    .line 22
    const v2, 0x7f1302b7

    .line 23
    .line 24
    .line 25
    const v3, 0x7f080194

    .line 26
    .line 27
    .line 28
    const v4, 0x7f0a009f

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 35
    .line 36
    const v2, 0x7f1302b0

    .line 37
    .line 38
    .line 39
    const v3, 0x7f0801f4

    .line 40
    .line 41
    .line 42
    const v4, 0x7f0a009c

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 49
    .line 50
    const v2, 0x7f130297

    .line 51
    .line 52
    .line 53
    const v3, 0x7f0801cd

    .line 54
    .line 55
    .line 56
    const v4, 0x7f0a0090

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 63
    .line 64
    const v2, 0x7f1302b4

    .line 65
    .line 66
    .line 67
    const v3, 0x7f080201

    .line 68
    .line 69
    .line 70
    const v4, 0x7f0a009e

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    return-void
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

.method private J5()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/d3/j;->H5()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/PathBar;->setLocationUnit(Lax/c3/K;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/PathBar;->setRootInfo(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 31
    .line 32
    new-instance v1, Lax/d3/j$n;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lax/d3/j$n;-><init>(Lax/d3/j;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/PathBar;->setPathBarListener(Lcom/voxdon/xplorer/widget/PathBar$h;)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method private K5(Lax/U2/f;)V
    .registers 6

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_app"

    .line 6
    .line 7
    const-string v2, "app_share"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_4c

    .line 23
    :cond_16
    invoke-virtual {p1}, Lax/U2/f;->f()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_4c

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_23

    .line 34
    .line 35
    goto :goto_4c

    .line 36
    :cond_23
    invoke-virtual {p1}, Lax/U2/f;->E()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_36

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-virtual {p0, v0, p1}, Lax/d3/j;->u5(Ljava/util/List;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1, v0}, Lax/c3/u;->u(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p1}, Lax/U2/f;->q()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v2, 0x0

    .line 72
    const-string v3, "application/vnd.android.package-archive"

    .line 73
    .line 74
    invoke-static {v1, v3, v0, p1, v2}, Lax/c3/u;->l0(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_4c
    :goto_4c
    return-void
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

.method private L5(Lax/U2/f;)V
    .registers 6

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
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, Lax/U2/d;->z(Lax/U2/f;)Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_23

    .line 21
    .line 22
    invoke-static {v0, v1}, Lax/c3/u;->u(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1}, Lax/U2/f;->q()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x0

    .line 31
    const-string v3, "application/vnd.android.package-archive"

    .line 32
    .line 33
    invoke-static {v0, v3, v1, p1, v2}, Lax/c3/u;->l0(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    :goto_23
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

.method private N5(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/j;->T0:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lax/d3/j$c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lax/d3/j$c;-><init>(Lax/d3/j;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
    .line 22
.end method

.method private P5()V
    .registers 5

    .line 1
    const v0, 0x104000a

    .line 2
    .line 3
    .line 4
    const/high16 v1, 0x1040000

    .line 5
    .line 6
    const v2, 0x7f130370

    .line 7
    .line 8
    .line 9
    const v3, 0x7f1303a3

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1}, Lax/a3/n;->k3(IIII)Lax/a3/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lax/d3/j$g;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lax/d3/j$g;-><init>(Lax/d3/j;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lax/a3/n;->n3(Lax/a3/n$c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->A0()Landroidx/fragment/app/FragmentManager;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "usage_access"

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-static {v1, v0, v2, v3}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public static synthetic Q4(Lax/d3/j;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "result_pref_changed"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/d3/j;->z5()V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void
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

.method private Q5(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_19

    .line 2
    .line 3
    iget-object p1, p0, Lax/d3/j;->R0:Landroid/view/View;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/j;->S0:Lax/t3/i;

    .line 10
    .line 11
    invoke-virtual {p1}, Lax/t3/i;->g()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/d3/j;->Q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    iget-object v0, p0, Lax/d3/j;->S0:Lax/t3/i;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/t3/i;->f()Lax/x3/D;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iget-object p1, p0, Lax/d3/j;->R0:Landroid/view/View;

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

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

.method static synthetic R4(Lax/d3/j;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/j;->E0:Z

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

.method private R5(ZLax/U2/f;)V
    .registers 7

    .line 1
    const v0, 0x7f0a0090

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_d

    .line 7
    .line 8
    iget-object v3, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 9
    .line 10
    invoke-virtual {v3, v0, v1}, Lax/x3/d;->o(IZ)V

    .line 11
    .line 12
    .line 13
    goto :goto_12

    .line 14
    :cond_d
    iget-object v3, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 15
    .line 16
    invoke-virtual {v3, v0, v2}, Lax/x3/d;->o(IZ)V

    .line 17
    .line 18
    .line 19
    :goto_12
    const v0, 0x7f0a009c

    .line 20
    .line 21
    .line 22
    const v3, 0x7f0a009e

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_33

    .line 26
    .line 27
    iget-object p1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Lax/x3/d;->o(IZ)V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_2d

    .line 33
    .line 34
    invoke-virtual {p2}, Lax/U2/f;->B()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2d

    .line 39
    .line 40
    iget-object p1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 41
    .line 42
    invoke-virtual {p1, v3, v1}, Lax/x3/d;->o(IZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    iget-object p1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 47
    .line 48
    invoke-virtual {p1, v3, v2}, Lax/x3/d;->o(IZ)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    iget-object p1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v2}, Lax/x3/d;->o(IZ)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 58
    .line 59
    invoke-virtual {p1, v3, v2}, Lax/x3/d;->o(IZ)V

    .line 60
    .line 61
    .line 62
    return-void
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

.method static synthetic S4(Lax/d3/j;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/j;->E0:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic T4(Lax/d3/j;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

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

.method static synthetic U4(Lax/d3/j;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j;->Q5(Z)V

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

.method static synthetic V4(Lax/d3/j;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j;->y5()V

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

.method static synthetic W4(Lax/d3/j;Lax/U2/f;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j;->L5(Lax/U2/f;)V

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

.method static synthetic X4(Lax/d3/j;Landroid/view/Menu;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/j;->q5(Landroid/view/Menu;Z)V

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

.method static synthetic Y4(Lax/d3/j;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/j;->N0:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic Z4(Lax/d3/j;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->T0:Landroid/os/Handler;

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

.method static synthetic a5(Lax/d3/j;)Lax/x3/b;
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j;->v5()Lax/x3/b;

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

.method static synthetic b5(Lax/d3/j;Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j;->t5(Ljava/util/List;)V

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

.method static synthetic c5(Lax/d3/j;Lax/U2/f;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j;->K5(Lax/U2/f;)V

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

.method static synthetic d5(Lax/d3/j;)Lax/x3/d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->O0:Lax/x3/d;

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

.method static synthetic e5(Lax/d3/j;)Lax/x3/c;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->I0:Lax/x3/c;

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

.method static synthetic f5(Lax/d3/j;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j;->E5()V

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

.method static synthetic g5(Lax/d3/j;Ljava/lang/String;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/j;->G5(Ljava/lang/String;Z)V

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

.method static synthetic h5(Lax/d3/j;Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j;->w5(Landroid/content/Context;)Ljava/lang/String;

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

.method static synthetic i5(Lax/d3/j;)Lcom/voxdon/xplorer/widget/MyViewPager;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

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

.method static synthetic j5(Lax/d3/j;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/j;->r5()V

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

.method static synthetic k5(Lax/d3/j;)Ljava/util/HashMap;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

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

.method static synthetic l5(Lax/d3/j;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/j;->N5(Z)V

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

.method static synthetic m5(Lax/d3/j;)Landroid/widget/EditText;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

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

.method static synthetic n5(Lax/d3/j;)Landroid/view/MenuItem;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

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

.method static synthetic o5(Lax/d3/j;)Lax/t3/i;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/j;->S0:Lax/t3/i;

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

.method private p5()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/d3/j;->N0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    iget-object v0, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_19

    .line 16
    .line 17
    iget-object v1, p0, Lax/d3/j;->S0:Lax/t3/i;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v1, v0}, Lax/t3/i;->d(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method private q5(Landroid/view/Menu;Z)V
    .registers 6

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
    goto :goto_4b

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    const v1, 0x7f0a0235

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p2, :cond_12

    .line 14
    .line 15
    invoke-interface {p1, v1, v2}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 16
    .line 17
    .line 18
    goto :goto_15

    .line 19
    :cond_12
    invoke-interface {p1, v1, v0}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 20
    .line 21
    .line 22
    :goto_15
    const p2, 0x7f0a02dd

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_4b

    .line 30
    .line 31
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_48

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {p2}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_44

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {}, Lax/u3/o;->b()Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {p2, v1}, Lax/u3/B;->K(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_40

    .line 60
    .line 61
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_40
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_44
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_48
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 74
    .line 75
    .line 76
    :cond_4b
    :goto_4b
    return-void
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

.method private r5()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/view/MenuItem;->isActionViewExpanded()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/view/MenuItem;->collapseActionView()Z

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

.method private s5(Ljava/util/List;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_22

    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    goto :goto_22

    .line 11
    :cond_a
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_22

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lax/U2/f;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/U2/f;->C()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_e

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_22
    :goto_22
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
.end method

.method private t5(Ljava/util/List;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_8b

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    goto/16 :goto_8b

    .line 10
    .line 11
    :cond_a
    invoke-direct {p0, p1}, Lax/d3/j;->s5(Ljava/util/List;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_18

    .line 17
    .line 18
    const p1, 0x7f1301eb

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v1}, Lax/d3/n;->E4(II)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v2, "menu_app"

    .line 30
    .line 31
    const-string v3, "uninstall"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-long v2, v2

    .line 42
    const-string v4, "size"

    .line 43
    .line 44
    invoke-virtual {v0, v4, v2, v3}, Lax/Q2/a$b;->b(Ljava/lang/String;J)Lax/Q2/a$b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_36
    :goto_36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_8b

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lax/U2/f;

    .line 66
    .line 67
    invoke-virtual {v0}, Lax/U2/f;->C()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_36

    .line 72
    .line 73
    new-instance v2, Landroid/content/Intent;

    .line 74
    .line 75
    invoke-virtual {v0}, Lax/U2/f;->r()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/4 v3, 0x0

    .line 80
    const-string v4, "package"

    .line 81
    .line 82
    invoke-static {v4, v0, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v3, "android.intent.action.DELETE"

    .line 87
    .line 88
    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 89
    .line 90
    .line 91
    const v0, 0x7f130137

    .line 92
    .line 93
    .line 94
    :try_start_5d
    invoke-static {p0, v2}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_60
    .catch Landroid/content/ActivityNotFoundException; {:try_start_5d .. :try_end_60} :catch_76
    .catch Ljava/lang/SecurityException; {:try_start_5d .. :try_end_60} :catch_61

    .line 95
    .line 96
    .line 97
    goto :goto_36

    .line 98
    :catch_61
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v2, "APP DELETE SECURITY EXCEPTION"

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 116
    .line 117
    .line 118
    goto :goto_36

    .line 119
    :catch_76
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v2, "APP DELETE ACTIVITY NOT FOUND"

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 137
    .line 138
    .line 139
    goto :goto_36

    .line 140
    :cond_8b
    :goto_8b
    return-void
    .line 141
    .line 142
    .line 143
.end method

.method private v5()Lax/x3/b;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lax/x3/c;->w(I)Lax/x3/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private w5(Landroid/content/Context;)Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/Q2/f;->q1:Lax/Q2/f;

    .line 6
    .line 7
    if-eq v0, v1, :cond_1c

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lax/Q2/f;->r1:Lax/Q2/f;

    .line 14
    .line 15
    if-ne v0, v1, :cond_11

    .line 16
    .line 17
    goto :goto_1c

    .line 18
    :cond_11
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {p1, v0, v2, v1, v2}, Lax/t3/e;->j(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1c
    :goto_1c
    const-string p1, "SizeDown"

    .line 30
    .line 31
    return-object p1
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

.method private y5()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/j;->J0:Lax/d3/j$s;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/u3/q;->e()Z

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    iget-object v0, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

    .line 16
    .line 17
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    const-string v2, "APPS_DOWNLOADED"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

    .line 25
    .line 26
    const-string v2, "APPS_ALL"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lax/d3/j$s;

    .line 32
    .line 33
    invoke-direct {v0, p0, p0}, Lax/d3/j$s;-><init>(Lax/d3/j;Lax/d3/j;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lax/d3/j;->J0:Lax/d3/j$s;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    new-array v1, v1, [Ljava/lang/Void;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 42
    .line 43
    .line 44
    return-void
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


# virtual methods
.method public A5(Ljava/lang/String;)V
    .registers 5

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    const v2, 0x7f130137

    .line 18
    .line 19
    .line 20
    :try_start_13
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_27

    .line 25
    .line 26
    invoke-static {p0, p1}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "success"

    .line 30
    .line 31
    goto :goto_3b

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    goto :goto_2a

    .line 34
    :catch_21
    move-exception p1

    .line 35
    goto :goto_2a

    .line 36
    :catch_23
    move-exception p1

    .line 37
    goto :goto_2a

    .line 38
    :catch_25
    move-exception p1

    .line 39
    goto :goto_33

    .line 40
    :cond_27
    const-string p1, "failure"
    :try_end_29
    .catch Landroid/content/ActivityNotFoundException; {:try_start_13 .. :try_end_29} :catch_25
    .catch Ljava/lang/SecurityException; {:try_start_13 .. :try_end_29} :catch_23
    .catch Ljava/lang/NullPointerException; {:try_start_13 .. :try_end_29} :catch_21
    .catch Landroid/util/AndroidRuntimeException; {:try_start_13 .. :try_end_29} :catch_1f

    .line 41
    .line 42
    goto :goto_3b

    .line 43
    :goto_2a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2, v1}, Lax/d3/n;->E4(II)V

    .line 47
    .line 48
    .line 49
    const-string p1, "failure3"

    .line 50
    .line 51
    goto :goto_3b

    .line 52
    :goto_33
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v2, v1}, Lax/d3/n;->E4(II)V

    .line 56
    .line 57
    .line 58
    const-string p1, "failure2"

    .line 59
    .line 60
    :goto_3b
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "menu_app"

    .line 65
    .line 66
    const-string v2, "app_open"

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "result"

    .line 73
    .line 74
    invoke-virtual {v0, v1, p1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 79
    .line 80
    .line 81
    return-void
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

.method public B1(Landroid/view/MenuItem;)Z
    .registers 5

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a02dd

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v1, :cond_35

    .line 10
    .line 11
    const v1, 0x7f0a02f7

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
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "menu_app"

    .line 26
    .line 27
    const-string v1, "view_settings"

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "loc"

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lax/d3/j;->B5()V

    .line 51
    .line 52
    .line 53
    return v2

    .line 54
    :cond_35
    invoke-direct {p0}, Lax/d3/j;->P5()V

    .line 55
    .line 56
    .line 57
    return v2
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public B5()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v0, v1}, Lax/a3/d;->i3(Lax/d3/n;Ljava/lang/String;Z)Lax/a3/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "settings"

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v0, v1, v2}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    new-instance v0, Lax/d3/i;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lax/d3/i;-><init>(Lax/d3/j;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "view_settings_request"

    .line 19
    .line 20
    invoke-static {p0, v1, v0}, Lax/d3/J;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/util/function/Consumer;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public C3()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public C5(Lax/U2/f;)V
    .registers 5

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
    goto :goto_37

    .line 8
    :cond_7
    :try_start_7
    invoke-virtual {p1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lax/c3/u;->m(Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lax/U2/f;->m()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_20

    .line 21
    .line 22
    const-string v2, "com.google.android.packageinstaller"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_20

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    :cond_20
    invoke-static {p0, v0}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_23
    .catch Landroid/content/ActivityNotFoundException; {:try_start_7 .. :try_end_23} :catch_24
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_23} :catch_24

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_24
    :try_start_24
    invoke-virtual {p1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lax/c3/u;->m(Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p0, p1}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_2f
    .catch Landroid/content/ActivityNotFoundException; {:try_start_24 .. :try_end_2f} :catch_30
    .catch Ljava/lang/NullPointerException; {:try_start_24 .. :try_end_2f} :catch_30

    .line 46
    .line 47
    .line 48
    goto :goto_37

    .line 49
    :catch_30
    const p1, 0x7f130340

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->E4(II)V

    .line 54
    .line 55
    .line 56
    :goto_37
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public D(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v0, v2, :cond_12

    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lax/U2/f;

    .line 17
    .line 18
    goto :goto_13

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    :goto_13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-ne p1, v2, :cond_1a

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    :cond_1a
    invoke-direct {p0, v1, v0}, Lax/d3/j;->R5(ZLax/U2/f;)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public F1(Landroid/view/Menu;)V
    .registers 8

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->F1(Landroid/view/Menu;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    const v0, 0x7f0a02f7

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lax/n/c;

    .line 23
    .line 24
    invoke-virtual {v1}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v0, :cond_3e

    .line 30
    .line 31
    if-eqz v1, :cond_3e

    .line 32
    .line 33
    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3e

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static {v3, v4, v2, v5, v2}, Lax/t3/e;->k(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v1}, Lax/n/a;->m()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, v3}, Lax/u3/z;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 61
    .line 62
    .line 63
    :cond_3e
    invoke-direct {p0, p1, v2}, Lax/d3/j;->q5(Landroid/view/Menu;Z)V

    .line 64
    .line 65
    .line 66
    return-void
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

.method F5(Ljava/lang/String;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/d3/j;->Q5(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 6
    .line 7
    const-string v1, "APPS_ALL"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/x3/c;->x(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gez v0, :cond_12

    .line 14
    .line 15
    invoke-static {}, Lax/u3/b;->f()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object v1, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lax/x3/c;->w(I)Lax/x3/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_21

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Lax/x3/b;->k(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
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

.method public H1()V
    .registers 1

    .line 1
    invoke-super {p0}, Lax/d3/n;->H1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/j;->y5()V

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
.end method

.method public I(Lax/U2/f;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/d3/j;->p5()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_6

    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    new-instance v0, Lax/d3/j$d;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lax/d3/j$d;-><init>(Lax/d3/j;Lax/U2/f;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lax/a3/b;->k3(Lax/U2/f;Lax/a3/b$e;)Lax/a3/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "appproperties"

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p0, p1, v0, v1}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public I1(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->I1(Landroid/os/Bundle;)V

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

.method public J(Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/j;->y5()V

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

.method public K(I)V
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

.method public K3()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    iget-object v2, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 9
    .line 10
    invoke-virtual {v2}, Lax/x3/c;->e()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v0, v2, :cond_22

    .line 15
    .line 16
    iget-object v2, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Lax/x3/c;->w(I)Lax/x3/b;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_1f

    .line 23
    .line 24
    invoke-virtual {v2}, Lax/x3/b;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1f

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_1f
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_7

    .line 35
    :cond_22
    return v1
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

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 8

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/n;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p2, 0x7f0a0064

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 12
    .line 13
    iput-object p2, p0, Lax/d3/j;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lax/d3/j;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_24

    .line 26
    .line 27
    iget-object p2, p0, Lax/d3/j;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 28
    .line 29
    new-instance v1, Lax/d3/j$j;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lax/d3/j$j;-><init>(Lax/d3/j;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    const p2, 0x7f0a0066

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 45
    .line 46
    iput-object p2, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 47
    .line 48
    const p2, 0x7f0a046f

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Lcom/google/android/material/tabs/TabLayout;

    .line 56
    .line 57
    iput-object p2, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 58
    .line 59
    const p2, 0x7f0a0378

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Lcom/voxdon/xplorer/widget/PathBar;

    .line 67
    .line 68
    iput-object p2, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 69
    .line 70
    invoke-virtual {p0}, Lax/d3/j;->x5()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    const/16 v1, 0x8

    .line 75
    .line 76
    if-eqz p2, :cond_58

    .line 77
    .line 78
    iget-object p2, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p2, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 84
    .line 85
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_65

    .line 89
    :cond_58
    iget-object p2, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 90
    .line 91
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    iget-object p2, p0, Lax/d3/j;->H0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lax/d3/j;->J5()V

    .line 100
    .line 101
    .line 102
    :goto_65
    iget-object p2, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 103
    .line 104
    iget-object v1, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 105
    .line 106
    const/4 v2, 0x1

    .line 107
    invoke-virtual {p2, v1, v2}, Lcom/google/android/material/tabs/TabLayout;->R(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 108
    .line 109
    .line 110
    iget-object p2, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 111
    .line 112
    invoke-virtual {p2, p0}, Landroidx/viewpager/widget/ViewPager;->c(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 113
    .line 114
    .line 115
    new-instance p2, Lax/x3/c;

    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-direct {p2, v1, v3, p0}, Lax/x3/c;-><init>(Landroid/app/Activity;Lax/c3/K;Lax/g3/a;)V

    .line 126
    .line 127
    .line 128
    iput-object p2, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 129
    .line 130
    iget-object v1, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 131
    .line 132
    invoke-virtual {v1, p2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 133
    .line 134
    .line 135
    iget-object p2, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 136
    .line 137
    new-instance v1, Lax/d3/j$k;

    .line 138
    .line 139
    invoke-direct {v1, p0}, Lax/d3/j$k;-><init>(Lax/d3/j;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v1}, Lcom/google/android/material/tabs/TabLayout;->h(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 143
    .line 144
    .line 145
    iget-object p2, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 146
    .line 147
    new-instance v1, Lcom/google/android/material/tabs/TabLayout$h;

    .line 148
    .line 149
    iget-object v3, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 150
    .line 151
    invoke-direct {v1, v3}, Lcom/google/android/material/tabs/TabLayout$h;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v1}, Landroidx/viewpager/widget/ViewPager;->c(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 155
    .line 156
    .line 157
    const p2, 0x7f0a0249

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 165
    .line 166
    iput-object p2, p0, Lax/d3/j;->Q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 167
    .line 168
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 169
    .line 170
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-direct {v1, v3, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 178
    .line 179
    .line 180
    const p2, 0x7f0a0248

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    iput-object p2, p0, Lax/d3/j;->R0:Landroid/view/View;

    .line 188
    .line 189
    new-instance v0, Lax/d3/j$l;

    .line 190
    .line 191
    invoke-direct {v0, p0}, Lax/d3/j$l;-><init>(Lax/d3/j;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    .line 196
    .line 197
    new-instance p2, Lax/t3/i;

    .line 198
    .line 199
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const-string v1, "app"

    .line 204
    .line 205
    invoke-direct {p2, v0, v1}, Lax/t3/i;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    iput-object p2, p0, Lax/d3/j;->S0:Lax/t3/i;

    .line 209
    .line 210
    new-instance v0, Lax/d3/j$m;

    .line 211
    .line 212
    const-wide/16 v3, 0x190

    .line 213
    .line 214
    invoke-direct {v0, p0, v3, v4}, Lax/d3/j$m;-><init>(Lax/d3/j;J)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, v0}, Lax/t3/i;->i(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 218
    .line 219
    .line 220
    const p2, 0x7f0a008e

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    new-instance v0, Lax/x3/d;

    .line 228
    .line 229
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    check-cast v1, Lax/n/c;

    .line 234
    .line 235
    const v3, 0x7f0a0099

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-direct {v0, v1, p2, p1}, Lax/x3/d;-><init>(Lax/n/c;Landroid/view/View;Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    iput-object v0, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 246
    .line 247
    invoke-direct {p0}, Lax/d3/j;->I5()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->x2(Z)V

    .line 251
    .line 252
    .line 253
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p1, p0}, Lax/Q2/b;->e(Lax/g3/g;)V

    .line 258
    .line 259
    .line 260
    return-void
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

.method public M5(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

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
    invoke-static {p1}, Lax/c3/u;->d(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x1

    .line 13
    :try_start_c
    invoke-static {p0, p1}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_f
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_f} :catch_17
    .catch Ljava/lang/NullPointerException; {:try_start_c .. :try_end_f} :catch_17
    .catch Landroid/util/AndroidRuntimeException; {:try_start_c .. :try_end_f} :catch_17
    .catch Landroid/content/ActivityNotFoundException; {:try_start_c .. :try_end_f} :catch_10

    .line 14
    .line 15
    .line 16
    goto :goto_1d

    .line 17
    :catch_10
    const p1, 0x7f130340

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->E4(II)V

    .line 21
    .line 22
    .line 23
    goto :goto_1d

    .line 24
    :catch_17
    const p1, 0x7f130137

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->E4(II)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "menu_app"

    .line 35
    .line 36
    const-string v1, "app_info"

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "by"

    .line 43
    .line 44
    invoke-virtual {p1, v0, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 49
    .line 50
    .line 51
    return-void
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

.method public O5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const p2, 0x7f130137

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    :try_start_b
    invoke-virtual {p0}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "storage"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/os/storage/StorageManager;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v1, p1, v2}, Lax/d3/e;->a(Landroid/os/storage/StorageManager;Ljava/lang/String;I)Landroid/app/PendingIntent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_3d

    .line 30
    .line 31
    invoke-static {}, Lax/X2/Q;->i0()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_39

    .line 36
    .line 37
    invoke-static {}, Lax/d3/f;->a()Landroid/app/ActivityOptions;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1, v0}, Lax/d3/g;->a(Landroid/app/ActivityOptions;I)Landroid/app/ActivityOptions;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1, v1}, Lax/d3/h;->a(Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    goto :goto_4e

    .line 52
    :catch_33
    move-exception p1

    .line 53
    goto :goto_41

    .line 54
    :catch_35
    move-exception p1

    .line 55
    goto :goto_41

    .line 56
    :catch_37
    move-exception p1

    .line 57
    goto :goto_48

    .line 58
    :cond_39
    invoke-virtual {p1}, Landroid/app/PendingIntent;->send()V

    .line 59
    .line 60
    .line 61
    goto :goto_4e

    .line 62
    :cond_3d
    invoke-virtual {p0, p2, v0}, Lax/d3/n;->E4(II)V
    :try_end_40
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_b .. :try_end_40} :catch_37
    .catch Ljava/lang/SecurityException; {:try_start_b .. :try_end_40} :catch_35
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_40} :catch_33

    .line 63
    .line 64
    .line 65
    goto :goto_4e

    .line 66
    :goto_41
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2, v0}, Lax/d3/n;->E4(II)V

    .line 70
    .line 71
    .line 72
    goto :goto_4e

    .line 73
    :goto_48
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p2, v0}, Lax/d3/n;->E4(II)V

    .line 77
    .line 78
    .line 79
    :goto_4e
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string p2, "menu_app"

    .line 84
    .line 85
    const-string v0, "app_manage_space"

    .line 86
    .line 87
    invoke-virtual {p1, p2, v0}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string p2, "by"

    .line 92
    .line 93
    invoke-virtual {p1, p2, p3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 98
    .line 99
    .line 100
    return-void
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

.method public Q()V
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
    iget-object v0, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 9
    .line 10
    if-eqz v0, :cond_f

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14
    .line 15
    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/d3/n;->r3()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0, v0}, Lax/d3/n;->r4(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 24
    .line 25
    const v1, 0x7f08008c

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lax/d3/j;->D5()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->L0()V

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

.method public V2()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/j;->K3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/d3/j;->h3()V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_b
    iget-object v0, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 13
    .line 14
    if-eqz v0, :cond_1b

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1b

    .line 21
    .line 22
    iget-object v0, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 23
    .line 24
    invoke-interface {v0}, Landroid/view/MenuItem;->collapseActionView()Z

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    return v0
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

.method protected V3()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j;->O0:Lax/x3/d;

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

.method public c4(Z)V
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

.method public e(I)V
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

.method public h(IFI)V
    .registers 4

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

.method public h1(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->h1(Landroid/os/Bundle;)V

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

.method public h3()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 3
    .line 4
    invoke-virtual {v1}, Lax/x3/c;->e()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1d

    .line 9
    .line 10
    iget-object v1, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lax/x3/c;->w(I)Lax/x3/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1a

    .line 17
    .line 18
    invoke-virtual {v1}, Lax/x3/b;->h()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1a

    .line 23
    .line 24
    invoke-virtual {v1}, Lax/x3/b;->e()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1d
    return-void
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

.method public i1(IILandroid/content/Intent;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/j;->P0:Lax/u3/m;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lax/u3/m;->d(IILandroid/content/Intent;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    const/16 p2, 0x3ed

    .line 9
    .line 10
    if-ne p1, p2, :cond_22

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_22

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_22

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {p0, p1}, Lax/d3/j;->c4(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lax/d3/n;->J3()V

    .line 33
    .line 34
    .line 35
    :cond_22
    return-void
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

.method public j(Landroid/view/ActionMode;Landroid/view/Menu;)V
    .registers 4

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
    invoke-direct {p0}, Lax/d3/j;->p5()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lax/d3/j;->D5()V

    .line 12
    .line 13
    .line 14
    const/high16 v0, 0x7f0f0000

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v0}, Lax/d3/n;->b3(Landroid/view/ActionMode;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/d3/j;->O0:Lax/x3/d;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/x3/d;->A()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 25
    .line 26
    if-eqz p1, :cond_1f

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const p2, 0x7f06047a

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Lax/d3/n;->r4(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const p2, 0x7f060478

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-object p2, p0, Lax/d3/j;->G0:Lcom/google/android/material/tabs/TabLayout;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/b;->p0()V

    .line 67
    .line 68
    .line 69
    return-void
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

.method public j1(Landroid/app/Activity;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/d3/j;->U0:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "parent_location"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lax/Q2/f;

    .line 21
    .line 22
    iput-object p1, p0, Lax/d3/j;->C0:Lax/Q2/f;

    .line 23
    .line 24
    iget-object p1, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

    .line 25
    .line 26
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    const-string v1, "APPS_DOWNLOADED"

    .line 29
    .line 30
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lax/d3/j;->K0:Ljava/util/HashMap;

    .line 34
    .line 35
    const-string v1, "APPS_ALL"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
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

.method public j3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

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

.method public o3()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j;->U0:Landroid/content/Context;

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

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 4

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
    if-eqz v0, :cond_15

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
    goto :goto_15

    .line 17
    :cond_10
    iget-object v0, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lax/x3/c;->z(Lax/T/b;Z)V

    .line 20
    .line 21
    .line 22
    :cond_15
    :goto_15
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
.end method

.method public q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 5

    .line 1
    const v0, 0x7f0f0016

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lax/d3/n;->G3(Landroid/view/MenuInflater;Landroid/view/Menu;I)V

    .line 5
    .line 6
    .line 7
    const p2, 0x7f0a02f7

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const v0, 0x7f0a02ea

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 22
    .line 23
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lax/Q2/f;->q1:Lax/Q2/f;

    .line 28
    .line 29
    if-eq v0, v1, :cond_6f

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Lax/Q2/f;->r1:Lax/Q2/f;

    .line 36
    .line 37
    if-ne v0, v1, :cond_27

    .line 38
    .line 39
    goto :goto_6f

    .line 40
    :cond_27
    iget-object p2, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 41
    .line 42
    invoke-interface {p2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const v0, 0x7f0a0178

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Landroid/widget/EditText;

    .line 54
    .line 55
    iput-object p2, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 56
    .line 57
    new-instance v0, Lax/d3/j$p;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Lax/d3/j$p;-><init>(Lax/d3/j;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 72
    .line 73
    new-instance v0, Lax/d3/j$q;

    .line 74
    .line 75
    invoke-direct {v0, p0}, Lax/d3/j$q;-><init>(Lax/d3/j;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 82
    .line 83
    new-instance v0, Lax/d3/j$r;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1}, Lax/d3/j$r;-><init>(Lax/d3/j;Landroid/view/Menu;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p2, v0}, Lax/c0/A;->h(Landroid/view/MenuItem;Lax/c0/A$c;)Landroid/view/MenuItem;

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 92
    .line 93
    new-instance p2, Lax/d3/j$a;

    .line 94
    .line 95
    invoke-direct {p2, p0}, Lax/d3/j$a;-><init>(Lax/d3/j;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lax/d3/j;->L0:Landroid/widget/EditText;

    .line 102
    .line 103
    new-instance p2, Lax/d3/j$b;

    .line 104
    .line 105
    invoke-direct {p2, p0}, Lax/d3/j$b;-><init>(Lax/d3/j;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6f
    :goto_6f
    iget-object p1, p0, Lax/d3/j;->M0:Landroid/view/MenuItem;

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 116
    .line 117
    .line 118
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 119
    .line 120
    .line 121
    return-void
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

.method public r1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    .line 1
    const p2, 0x7f0d0094

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

.method public s(Lax/U2/f;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/d3/j;->p5()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lax/U2/f;->o()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "button"

    .line 13
    .line 14
    invoke-virtual {p0, v0, p1, v1}, Lax/d3/j;->O5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method public u1()V
    .registers 2

    .line 1
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lax/Q2/b;->r(Lax/g3/g;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/j;->F0:Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/viewpager/widget/ViewPager;->J(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->u1()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method u5(Ljava/util/List;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_app"

    .line 6
    .line 7
    const-string v2, "app_backup"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lax/W2/a;->m()Lax/W2/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lax/d3/j$o;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2, p1}, Lax/d3/j$o;-><init>(Lax/d3/j;ZLjava/util/List;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, v1}, Lax/W2/a;->l(Ljava/util/List;ZLax/W2/h$a;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    :try_start_1c
    invoke-virtual {p0, v0, p1}, Lax/d3/n;->l(Lax/W2/h;Z)V
    :try_end_1f
    .catch Lax/b3/c; {:try_start_1c .. :try_end_1f} :catch_20

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_20
    const p2, 0x7f130137

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2, p1}, Lax/d3/n;->J4(II)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
.end method

.method public x3()I
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

.method protected x5()Z
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

.method public z3()Lax/Q2/f;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->V0:Lax/Q2/f;

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

.method public z5()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/j;->y5()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_4
    iget-object v1, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lax/x3/c;->e()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_18

    .line 12
    .line 13
    iget-object v1, p0, Lax/d3/j;->I0:Lax/x3/c;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lax/x3/c;->w(I)Lax/x3/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/x3/b;->j()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_4

    .line 25
    :cond_18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_25

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/f;->supportInvalidateOptionsMenu()V

    .line 36
    .line 37
    .line 38
    :cond_25
    return-void
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
