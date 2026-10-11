.class public Lax/d3/b;
.super Lax/d3/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d3/b$x;
    }
.end annotation


# static fields
.field private static final a1:Ljava/util/logging/Logger;


# instance fields
.field private P0:Landroid/view/View;

.field private Q0:Landroidx/cardview/widget/CardView;

.field private R0:Landroid/view/View;

.field private S0:Lax/c3/K;

.field private T0:Lax/T2/h;

.field private U0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/T2/h;",
            ">;"
        }
    .end annotation
.end field

.field private V0:Z

.field private W0:J

.field private X0:Lax/u3/m;

.field private Y0:I

.field private Z0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/d3/b;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/d3/b;->a1:Ljava/util/logging/Logger;

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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/p;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/d3/b;->U0:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lax/d3/b;->Y0:I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private A5()V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lax/d3/p;->F0:Landroid/widget/LinearLayout;

    .line 10
    .line 11
    const v2, 0x7f0d002a

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x7f0a046f

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->F()Lcom/google/android/material/tabs/TabLayout$g;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const v4, 0x7f1301f0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->u(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->t(Ljava/lang/Object;)Lcom/google/android/material/tabs/TabLayout$g;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->i(Lcom/google/android/material/tabs/TabLayout$g;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->F()Lcom/google/android/material/tabs/TabLayout$g;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const v4, 0x7f1301f1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->u(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 56
    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v2, v5}, Lcom/google/android/material/tabs/TabLayout$g;->t(Ljava/lang/Object;)Lcom/google/android/material/tabs/TabLayout$g;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->i(Lcom/google/android/material/tabs/TabLayout$g;)V

    .line 67
    .line 68
    .line 69
    new-instance v5, Lax/d3/b$r;

    .line 70
    .line 71
    invoke-direct {v5, p0}, Lax/d3/b$r;-><init>(Lax/d3/b;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v5}, Lcom/google/android/material/tabs/TabLayout;->h(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 75
    .line 76
    .line 77
    iget-object v5, p0, Lax/d3/p;->F0:Landroid/widget/LinearLayout;

    .line 78
    .line 79
    invoke-virtual {v5, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lax/d3/p;->H0:Landroidx/viewpager/widget/ViewPager;

    .line 83
    .line 84
    new-instance v5, Lcom/google/android/material/tabs/TabLayout$h;

    .line 85
    .line 86
    invoke-direct {v5, v1}, Lcom/google/android/material/tabs/TabLayout$h;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v5}, Landroidx/viewpager/widget/ViewPager;->c(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Lax/d3/b;->V5()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-ne v0, v4, :cond_65

    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$g;->m()V

    .line 99
    .line 100
    .line 101
    goto :goto_6e

    .line 102
    :cond_65
    invoke-direct {p0}, Lax/d3/b;->V5()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/4 v1, -0x1

    .line 107
    if-ne v0, v1, :cond_6e

    .line 108
    .line 109
    iput v3, p0, Lax/d3/b;->Y0:I

    .line 110
    .line 111
    :cond_6e
    :goto_6e
    invoke-virtual {p0}, Lax/d3/p;->j5()V

    .line 112
    .line 113
    .line 114
    return-void
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

.method private B5()V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lax/d3/p;->F0:Landroid/widget/LinearLayout;

    .line 10
    .line 11
    const v2, 0x7f0d002a

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x7f0a046f

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->F()Lcom/google/android/material/tabs/TabLayout$g;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const v4, 0x7f130228

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->u(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 36
    .line 37
    .line 38
    sget-object v4, Lax/c3/K;->e:Lax/c3/K;

    .line 39
    .line 40
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->t(Ljava/lang/Object;)Lcom/google/android/material/tabs/TabLayout$g;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->i(Lcom/google/android/material/tabs/TabLayout$g;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->F()Lcom/google/android/material/tabs/TabLayout$g;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const v4, 0x7f130235

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->u(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 54
    .line 55
    .line 56
    sget-object v4, Lax/c3/K;->f:Lax/c3/K;

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout$g;->t(Ljava/lang/Object;)Lcom/google/android/material/tabs/TabLayout$g;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->i(Lcom/google/android/material/tabs/TabLayout$g;)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Lax/d3/b$q;

    .line 65
    .line 66
    invoke-direct {v5, p0}, Lax/d3/b$q;-><init>(Lax/d3/b;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v5}, Lcom/google/android/material/tabs/TabLayout;->h(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 70
    .line 71
    .line 72
    iget-object v5, p0, Lax/d3/p;->F0:Landroid/widget/LinearLayout;

    .line 73
    .line 74
    invoke-virtual {v5, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lax/d3/p;->H0:Landroidx/viewpager/widget/ViewPager;

    .line 78
    .line 79
    new-instance v3, Lcom/google/android/material/tabs/TabLayout$h;

    .line 80
    .line 81
    invoke-direct {v3, v1}, Lcom/google/android/material/tabs/TabLayout$h;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3}, Landroidx/viewpager/widget/ViewPager;->c(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-ne v0, v4, :cond_5f

    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$g;->m()V

    .line 94
    .line 95
    .line 96
    :cond_5f
    invoke-virtual {p0}, Lax/d3/p;->j5()V

    .line 97
    .line 98
    .line 99
    return-void
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

.method private C5(Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance p3, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :cond_f
    :goto_f
    if-ge v2, v1, :cond_37

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    check-cast v3, Lax/T2/h$h;

    .line 25
    .line 26
    if-nez p4, :cond_25

    .line 27
    .line 28
    invoke-virtual {v3}, Lax/T2/h$h;->b()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    const-wide/16 v6, 0x0

    .line 33
    .line 34
    cmp-long v8, v4, v6

    .line 35
    .line 36
    if-lez v8, :cond_f

    .line 37
    .line 38
    :cond_25
    :try_start_25
    invoke-virtual {v3}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {p2, v3}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p1, v3}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_34} :catch_35

    .line 51
    .line 52
    .line 53
    goto :goto_f

    .line 54
    :catch_35
    nop

    .line 55
    goto :goto_f

    .line 56
    :cond_37
    return-object p3
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

.method private P5(Lax/T2/h;)V
    .registers 13

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_analysis"

    .line 6
    .line 7
    const-string v2, "delete_all_cache"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lax/d3/b;->z3()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "loc"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lax/T2/h;->X()Lax/c3/K;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lax/T2/h;->N()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {p0, v2, v0, v1, v3}, Lax/d3/b;->C5(Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_74

    .line 56
    .line 57
    invoke-virtual {p1}, Lax/T2/h;->X()Lax/c3/K;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 62
    .line 63
    if-ne v0, v1, :cond_74

    .line 64
    .line 65
    :try_start_40
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lax/Q2/e;->t(Landroid/content/Context;)Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_5b

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_5b

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5b
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_5b} :catch_5b

    .line 90
    .line 91
    .line 92
    :catch_5b
    :cond_5b
    :try_start_5b
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lax/Q2/e;->o(Landroid/content/Context;)Ljava/io/File;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_74

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_74
    .catch Ljava/lang/Exception; {:try_start_5b .. :try_end_74} :catch_74

    .line 115
    .line 116
    .line 117
    :catch_74
    :cond_74
    new-instance v9, Lax/d3/b$h;

    .line 118
    .line 119
    invoke-direct {v9, p0, p1}, Lax/d3/b$h;-><init>(Lax/d3/b;Lax/T2/h;)V

    .line 120
    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v4, 0x1

    .line 124
    const/4 v5, 0x1

    .line 125
    const/4 v6, 0x0

    .line 126
    const v7, 0x7f130091

    .line 127
    .line 128
    .line 129
    const v8, 0x7f130090

    .line 130
    .line 131
    .line 132
    move-object v1, p0

    .line 133
    invoke-static/range {v1 .. v10}, Lax/W2/o;->l(Lax/d3/s;Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZZIILax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 134
    .line 135
    .line 136
    return-void
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private Q5(Lax/T2/h;)V
    .registers 14

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_analysis"

    .line 6
    .line 7
    const-string v2, "delete_duplicate_downloads"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lax/d3/b;->z3()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "loc"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lax/T2/h;->H()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-nez v0, :cond_2b

    .line 36
    .line 37
    const p1, 0x7f130137

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Lax/d3/n;->E4(II)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-virtual {p1}, Lax/T2/h;->X()Lax/c3/K;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1}, Lax/T2/h;->H()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {p0, v3, v0, v2, v1}, Lax/d3/b;->C5(Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v10, Lax/d3/b$i;

    .line 65
    .line 66
    invoke-direct {v10, p0, p1}, Lax/d3/b$i;-><init>(Lax/d3/b;Lax/T2/h;)V

    .line 67
    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v5, 0x1

    .line 71
    const/4 v6, 0x1

    .line 72
    const/4 v7, 0x0

    .line 73
    const v8, 0x7f130278

    .line 74
    .line 75
    .line 76
    const v9, 0x7f1302ce

    .line 77
    .line 78
    .line 79
    move-object v2, p0

    .line 80
    invoke-static/range {v2 .. v11}, Lax/W2/o;->l(Lax/d3/s;Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZZIILax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 81
    .line 82
    .line 83
    return-void
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

.method private R5()V
    .registers 11

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/c3/K;->e:Lax/c3/K;

    .line 7
    .line 8
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_47

    .line 17
    .line 18
    :try_start_11
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lax/Q2/e;->t(Landroid/content/Context;)Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2c

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2c

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_2c} :catch_2c

    .line 43
    .line 44
    .line 45
    :catch_2c
    :cond_2c
    :try_start_2c
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lax/Q2/e;->o(Landroid/content/Context;)Ljava/io/File;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_47

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_45} :catch_46

    .line 68
    .line 69
    .line 70
    goto :goto_47

    .line 71
    :catch_46
    nop

    .line 72
    :cond_47
    :goto_47
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-gtz v0, :cond_51

    .line 77
    .line 78
    invoke-virtual {p0}, Lax/d3/b;->U4()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_51
    new-instance v8, Lax/d3/b$g;

    .line 83
    .line 84
    invoke-direct {v8, p0}, Lax/d3/b$g;-><init>(Lax/d3/b;)V

    .line 85
    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v3, 0x1

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x1

    .line 91
    const v6, 0x7f130091

    .line 92
    .line 93
    .line 94
    const v7, 0x7f130090

    .line 95
    .line 96
    .line 97
    move-object v0, p0

    .line 98
    invoke-static/range {v0 .. v9}, Lax/W2/o;->l(Lax/d3/s;Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZZIILax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 99
    .line 100
    .line 101
    return-void
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

.method private S5()V
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_analysis"

    .line 6
    .line 7
    const-string v2, "empty_recycle_bin"

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
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lax/d3/b$f;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lax/d3/b$f;-><init>(Lax/d3/b;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, v1}, Lax/W2/o;->n(Lax/d3/s;Lax/c3/K;Lax/W2/h$a;)V

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

.method private T5()Lax/c3/K;
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/b;->X5()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 8
    .line 9
    if-nez v0, :cond_e

    .line 10
    .line 11
    sget-object v0, Lax/c3/K;->e:Lax/c3/K;

    .line 12
    .line 13
    iput-object v0, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_11
    iget-object v0, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 19
    .line 20
    if-nez v0, :cond_1f

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/d3/p;->x3()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Lax/T2/h;->q(I)Lax/c3/K;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 31
    .line 32
    :cond_1f
    iget-object v0, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 33
    .line 34
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private U5()I
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/T2/h;->r(Lax/c3/K;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method private V5()I
    .registers 2

    .line 1
    iget v0, p0, Lax/d3/b;->Y0:I

    .line 2
    .line 3
    return v0
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

.method private X5()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/p;->x3()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method private Y5()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/d3/b;->T0:Lax/T2/h;

    .line 10
    .line 11
    iget-object v1, p0, Lax/d3/b;->U0:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1e

    .line 18
    .line 19
    iget-object v0, p0, Lax/d3/b;->T0:Lax/T2/h;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/T2/h;->J0()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/d3/b;->U0:Ljava/util/List;

    .line 25
    .line 26
    iget-object v1, p0, Lax/d3/b;->T0:Lax/T2/h;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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

.method private Z5()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/b;->X5()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/Z2/j;->t0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method private a6()V
    .registers 4

    .line 1
    :try_start_0
    invoke-static {}, Lax/u3/o;->b()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x9474

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Lax/c3/u;->r0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/b;->X0:Lax/u3/m;

    .line 12
    .line 13
    if-nez v0, :cond_15

    .line 14
    .line 15
    new-instance v0, Lax/u3/m;

    .line 16
    .line 17
    invoke-direct {v0}, Lax/u3/m;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/d3/b;->X0:Lax/u3/m;

    .line 21
    .line 22
    :cond_15
    iget-object v0, p0, Lax/d3/b;->X0:Lax/u3/m;

    .line 23
    .line 24
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lax/d3/b$u;

    .line 29
    .line 30
    invoke-direct {v2, p0}, Lax/d3/b$u;-><init>(Lax/d3/b;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lax/u3/m;->f(Landroid/content/Context;Lax/u3/m$c;)V
    :try_end_23
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_23} :catch_24

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_24
    const v0, 0x7f130137

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

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

.method private b6(Lax/c3/K;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/b;->S0:Lax/c3/K;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/d3/b;->Y5()V

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

.method private c6(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/d3/b;->Y0:I

    .line 2
    .line 3
    return-void
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

.method private d6()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_6d

    .line 8
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lax/u3/z;->u(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    goto :goto_6d

    .line 19
    :cond_12
    invoke-static {}, Lax/t3/a;->g()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_6d

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const v1, 0x7f0d0035

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lax/d3/p;->f5()Landroid/widget/LinearLayout;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroidx/cardview/widget/CardView;

    .line 46
    .line 47
    iput-object v0, p0, Lax/d3/b;->Q0:Landroidx/cardview/widget/CardView;

    .line 48
    .line 49
    const v1, 0x7f0a0053

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lax/d3/b;->R0:Landroid/view/View;

    .line 57
    .line 58
    invoke-static {}, Lax/J5/h;->o()Lax/J5/h;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lax/J5/h;->g(Landroid/content/Context;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_49

    .line 71
    .line 72
    iput-boolean v3, p0, Lax/d3/b;->V0:Z

    .line 73
    .line 74
    :cond_49
    iget-boolean v0, p0, Lax/d3/b;->V0:Z

    .line 75
    .line 76
    if-eqz v0, :cond_5a

    .line 77
    .line 78
    iget-object v0, p0, Lax/d3/b;->Q0:Landroidx/cardview/widget/CardView;

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lax/d3/b;->R0:Landroid/view/View;

    .line 84
    .line 85
    if-eqz v0, :cond_61

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    goto :goto_61

    .line 91
    :cond_5a
    iget-object v0, p0, Lax/d3/b;->Q0:Landroidx/cardview/widget/CardView;

    .line 92
    .line 93
    const/16 v1, 0x8

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    .line 97
    .line 98
    :cond_61
    :goto_61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v1, Lax/d3/b$o;

    .line 103
    .line 104
    invoke-direct {v1, p0}, Lax/d3/b$o;-><init>(Lax/d3/b;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Lax/S2/b;->d(Landroid/app/Activity;Lax/S2/b$c;)V

    .line 108
    .line 109
    .line 110
    :cond_6d
    :goto_6d
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

.method static synthetic q5(Lax/d3/b;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/b;->Z0:Z

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

.method static synthetic r5(Lax/d3/b;Lax/c3/K;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/b;->b6(Lax/c3/K;)V

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

.method static synthetic s5(Lax/d3/b;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/b;->c6(I)V

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

.method static synthetic t5(Lax/d3/b;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/b;->a6()V

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

.method static synthetic u5(Lax/d3/b;)I
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/b;->U5()I

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

.method static synthetic v5(Lax/d3/b;)Lax/c3/K;
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

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

.method static synthetic w5(Lax/d3/b;Lax/T2/h;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/b;->P5(Lax/T2/h;)V

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

.method static synthetic x5(Lax/d3/b;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/b;->S5()V

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

.method static synthetic y5(Lax/d3/b;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/d3/b;->W0:J

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

.method static synthetic z5(Lax/d3/b;Lax/T2/h;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/b;->Q5(Lax/T2/h;)V

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


# virtual methods
.method D5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;
    .registers 14

    .line 1
    invoke-static {p4}, Lax/U2/d;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-wide v5, p5

    .line 10
    invoke-virtual/range {v0 .. v6}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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
.end method

.method E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;
    .registers 8

    .line 1
    const p3, 0x7f0d0037

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2, p4}, Lax/U2/d;->x(Ljava/lang/String;)Lax/U2/f;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const p3, 0x7f0a0321

    .line 22
    .line 23
    .line 24
    const v0, 0x7f0a024f

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_37

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    check-cast p4, Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {p2}, Lax/U2/f;->l()Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-virtual {p2}, Lax/U2/f;->q()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4c

    .line 56
    :cond_37
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Landroid/widget/ImageView;

    .line 61
    .line 62
    const v0, 0x7f080258

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    :goto_4c
    invoke-virtual {p0, p5, p6}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const p3, 0x7f0a040f

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    check-cast p3, Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    return-object p1
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
.end method

.method F5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 15

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->D()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-nez v4, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_c
    const v0, 0x7f0d003b

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const v0, 0x7f0a0493

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/widget/TextView;

    .line 29
    .line 30
    const v4, 0x7f130213

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Lax/T2/h;->D()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    invoke-virtual {p0, v4, v5}, Lax/d3/p;->b5(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const v4, 0x7f0a0416

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroid/widget/TextView;

    .line 52
    .line 53
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    const v0, 0x7f0a00d3

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Landroid/widget/TextView;

    .line 64
    .line 65
    const/16 v4, 0x8

    .line 66
    .line 67
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    const v0, 0x7f0a0204

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v6, v0

    .line 78
    check-cast v6, Landroid/widget/LinearLayout;

    .line 79
    .line 80
    invoke-virtual {p3}, Lax/T2/h;->C()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_74

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-lez v4, :cond_74

    .line 91
    .line 92
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lax/U2/f;

    .line 97
    .line 98
    invoke-virtual {v1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-virtual {v1}, Lax/U2/f;->s()J

    .line 103
    .line 104
    .line 105
    move-result-wide v9

    .line 106
    move-object v4, p0

    .line 107
    move-object v5, p1

    .line 108
    move-object v7, p3

    .line 109
    invoke-virtual/range {v4 .. v10}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v6, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    goto :goto_76

    .line 117
    :cond_74
    move-object v5, p1

    .line 118
    move-object v7, p3

    .line 119
    :goto_76
    if-eqz v0, :cond_9e

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    const/4 p3, 0x1

    .line 126
    if-le p1, p3, :cond_9e

    .line 127
    .line 128
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lax/U2/f;

    .line 133
    .line 134
    invoke-virtual {p1}, Lax/U2/f;->s()J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    cmp-long p3, v0, v2

    .line 139
    .line 140
    if-lez p3, :cond_9e

    .line 141
    .line 142
    invoke-virtual {p1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {p1}, Lax/U2/f;->s()J

    .line 147
    .line 148
    .line 149
    move-result-wide v9

    .line 150
    move-object v4, p0

    .line 151
    invoke-virtual/range {v4 .. v10}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {v6, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    goto :goto_9f

    .line 159
    :cond_9e
    move-object v4, p0

    .line 160
    :goto_9f
    new-instance p1, Lax/d3/b$v;

    .line 161
    .line 162
    invoke-direct {p1, p0}, Lax/d3/b$v;-><init>(Lax/d3/b;)V

    .line 163
    .line 164
    .line 165
    const p3, 0x7f0a0305

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    invoke-virtual {p3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    .line 177
    .line 178
    return-object p2
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

.method G5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 15

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->J()J

    .line 2
    .line 3
    .line 4
    move-result-wide v6

    .line 5
    invoke-virtual {p3}, Lax/T2/h;->G()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    const/4 v9, 0x2

    .line 10
    const/4 v10, 0x0

    .line 11
    const v4, 0x7f130130

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move-object v3, p3

    .line 19
    invoke-virtual/range {v0 .. v10}, Lax/d3/p;->Y4(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;ILjava/lang/String;JLjava/util/List;IZ)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_47

    .line 24
    .line 25
    new-instance p2, Lax/d3/b$m;

    .line 26
    .line 27
    invoke-direct {p2, p0}, Lax/d3/b$m;-><init>(Lax/d3/b;)V

    .line 28
    .line 29
    .line 30
    const p3, 0x7f0a0305

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    const p2, 0x7f0a00f7

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Landroid/widget/Button;

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    const p3, 0x7f130278

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 60
    .line 61
    .line 62
    new-instance p3, Lax/d3/b$n;

    .line 63
    .line 64
    const-wide/16 v1, 0x190

    .line 65
    .line 66
    invoke-direct {p3, p0, v1, v2, v3}, Lax/d3/b$n;-><init>(Lax/d3/b;JLax/T2/h;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    return-object p1
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

.method public H1()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/d3/p;->H1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/receiver/StorageCheckReceiver;->a(Landroid/content/Context;Lax/c3/K;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method H5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 15

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->M()J

    .line 2
    .line 3
    .line 4
    move-result-wide v6

    .line 5
    invoke-virtual {p3}, Lax/T2/h;->K()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    const/4 v9, 0x2

    .line 10
    const/4 v10, 0x0

    .line 11
    const v4, 0x7f130131

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move-object v3, p3

    .line 19
    invoke-virtual/range {v0 .. v10}, Lax/d3/p;->Y4(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;ILjava/lang/String;JLjava/util/List;IZ)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_2a

    .line 24
    .line 25
    new-instance p2, Lax/d3/b$l;

    .line 26
    .line 27
    invoke-direct {p2, p0}, Lax/d3/b$l;-><init>(Lax/d3/b;)V

    .line 28
    .line 29
    .line 30
    const p3, 0x7f0a0305

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    return-object p1
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

.method I5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 16

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->O()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    invoke-virtual {p3}, Lax/T2/h;->N()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    const-wide/16 v8, 0x0

    .line 10
    .line 11
    cmp-long v3, v1, v8

    .line 12
    .line 13
    if-eqz v3, :cond_c6

    .line 14
    .line 15
    if-nez v7, :cond_12

    .line 16
    .line 17
    goto/16 :goto_c6

    .line 18
    .line 19
    :cond_12
    const v3, 0x7f0d003b

    .line 20
    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    invoke-virtual {p1, v3, p2, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v11

    .line 27
    const v3, 0x7f0a0493

    .line 28
    .line 29
    .line 30
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/widget/TextView;

    .line 35
    .line 36
    const v5, 0x7f130036

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->b5(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const v2, 0x7f0a0416

    .line 47
    .line 48
    .line 49
    invoke-virtual {v11, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    const v1, 0x7f0a00d3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Landroid/widget/TextView;

    .line 66
    .line 67
    const v2, 0x7f130037

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 71
    .line 72
    .line 73
    const v1, 0x7f0a0204

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v2, v1

    .line 81
    check-cast v2, Landroid/widget/LinearLayout;

    .line 82
    .line 83
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-lez v1, :cond_70

    .line 88
    .line 89
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lax/T2/h$h;

    .line 94
    .line 95
    invoke-virtual {v1}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v1}, Lax/T2/h$h;->b()J

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    move-object v0, p0

    .line 104
    move-object v1, p1

    .line 105
    move-object v3, p3

    .line 106
    invoke-virtual/range {v0 .. v6}, Lax/d3/b;->D5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    :cond_70
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    const/4 v1, 0x1

    .line 118
    if-le v0, v1, :cond_97

    .line 119
    .line 120
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lax/T2/h$h;

    .line 125
    .line 126
    invoke-virtual {v0}, Lax/T2/h$h;->b()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    cmp-long v1, v3, v8

    .line 131
    .line 132
    if-lez v1, :cond_97

    .line 133
    .line 134
    invoke-virtual {v0}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v0}, Lax/T2/h$h;->b()J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    move-object v0, p0

    .line 143
    move-object v1, p1

    .line 144
    move-object v3, p3

    .line 145
    invoke-virtual/range {v0 .. v6}, Lax/d3/b;->D5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    :cond_97
    const v1, 0x7f0a00f7

    .line 153
    .line 154
    .line 155
    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Landroid/widget/Button;

    .line 160
    .line 161
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    const v2, 0x7f130278

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 168
    .line 169
    .line 170
    new-instance v2, Lax/d3/b$b;

    .line 171
    .line 172
    const-wide/16 v3, 0x190

    .line 173
    .line 174
    invoke-direct {v2, p0, v3, v4, p3}, Lax/d3/b$b;-><init>(Lax/d3/b;JLax/T2/h;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lax/d3/b$c;

    .line 181
    .line 182
    invoke-direct {v1, p0}, Lax/d3/b$c;-><init>(Lax/d3/b;)V

    .line 183
    .line 184
    .line 185
    const v2, 0x7f0a0305

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v11, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    .line 197
    .line 198
    return-object v11

    .line 199
    :cond_c6
    :goto_c6
    const/4 v1, 0x0

    .line 200
    return-object v1
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

.method J5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 15

    .line 1
    const-wide/32 v1, 0xa00000

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x1

    .line 9
    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v1, v2, v3

    .line 13
    .line 14
    const v1, 0x7f13020c

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p3}, Lax/T2/h;->W()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    invoke-virtual {p3}, Lax/T2/h;->V()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const/4 v9, 0x2

    .line 30
    const/4 v10, 0x0

    .line 31
    const v4, 0x7f13020b

    .line 32
    .line 33
    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p1

    .line 36
    move-object v2, p2

    .line 37
    move-object v3, p3

    .line 38
    invoke-virtual/range {v0 .. v10}, Lax/d3/p;->Y4(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;ILjava/lang/String;JLjava/util/List;IZ)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_3d

    .line 43
    .line 44
    new-instance v2, Lax/d3/b$w;

    .line 45
    .line 46
    invoke-direct {v2, p0}, Lax/d3/b$w;-><init>(Lax/d3/b;)V

    .line 47
    .line 48
    .line 49
    const v3, 0x7f0a0305

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    return-object v1
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

.method K5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 15

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->c0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v6

    .line 5
    invoke-virtual {p3}, Lax/T2/h;->Z()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    const/4 v9, 0x2

    .line 10
    const/4 v10, 0x0

    .line 11
    const v4, 0x7f130391

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move-object v3, p3

    .line 19
    invoke-virtual/range {v0 .. v10}, Lax/d3/p;->Y4(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;ILjava/lang/String;JLjava/util/List;IZ)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_47

    .line 24
    .line 25
    const p2, 0x7f0a00f7

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Landroid/widget/Button;

    .line 33
    .line 34
    const/4 p3, 0x0

    .line 35
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    const p3, 0x7f130284

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 42
    .line 43
    .line 44
    new-instance p3, Lax/d3/b$d;

    .line 45
    .line 46
    const-wide/16 v1, 0x190

    .line 47
    .line 48
    invoke-direct {p3, p0, v1, v2}, Lax/d3/b$d;-><init>(Lax/d3/b;J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lax/d3/b$e;

    .line 55
    .line 56
    invoke-direct {p2, p0}, Lax/d3/b$e;-><init>(Lax/d3/b;)V

    .line 57
    .line 58
    .line 59
    const p3, 0x7f0a0305

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    return-object p1
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

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/p;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/b;->d6()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lax/d3/b;->Z5()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_10

    .line 12
    .line 13
    invoke-direct {p0}, Lax/d3/b;->B5()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    invoke-direct {p0}, Lax/d3/b;->A5()V

    .line 18
    .line 19
    .line 20
    return-void
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

.method L5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 16

    .line 1
    iget-wide v1, p0, Lax/d3/b;->W0:J

    .line 2
    .line 3
    const-wide/32 v3, 0x927c0

    .line 4
    .line 5
    .line 6
    add-long/2addr v1, v3

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    const/4 v5, 0x0

    .line 12
    cmp-long v6, v1, v3

    .line 13
    .line 14
    if-lez v6, :cond_10

    .line 15
    .line 16
    return-object v5

    .line 17
    :cond_10
    invoke-virtual {p3}, Lax/T2/h;->X()Lax/c3/K;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lax/c3/K;->e:Lax/c3/K;

    .line 22
    .line 23
    if-eq v1, v2, :cond_19

    .line 24
    .line 25
    return-object v5

    .line 26
    :cond_19
    invoke-static {}, Lax/X2/Q;->V0()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    if-eqz v1, :cond_30

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_30

    .line 43
    .line 44
    invoke-virtual {p3}, Lax/T2/h;->j0()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    goto :goto_31

    .line 49
    :cond_30
    move-wide v1, v7

    .line 50
    :goto_31
    const v3, 0x7f0d003b

    .line 51
    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-virtual {p1, v3, p2, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    const v3, 0x7f0a0493

    .line 59
    .line 60
    .line 61
    invoke-virtual {v10, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Landroid/widget/TextView;

    .line 66
    .line 67
    const v5, 0x7f130036

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(I)V

    .line 71
    .line 72
    .line 73
    cmp-long v3, v1, v7

    .line 74
    .line 75
    if-lez v3, :cond_51

    .line 76
    .line 77
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->b5(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    goto :goto_53

    .line 82
    :cond_51
    const-string v1, ""

    .line 83
    .line 84
    :goto_53
    const v2, 0x7f0a0416

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Landroid/widget/TextView;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    const v1, 0x7f0a00d3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Landroid/widget/TextView;

    .line 104
    .line 105
    const v2, 0x7f130037

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3}, Lax/T2/h;->P()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    const v1, 0x7f0a0204

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    move-object v2, v1

    .line 123
    check-cast v2, Landroid/widget/LinearLayout;

    .line 124
    .line 125
    if-eqz v11, :cond_a4

    .line 126
    .line 127
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-lez v1, :cond_a4

    .line 132
    .line 133
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Lax/U2/f;

    .line 138
    .line 139
    invoke-virtual {v1}, Lax/U2/f;->e()J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    cmp-long v3, v5, v7

    .line 144
    .line 145
    if-lez v3, :cond_a4

    .line 146
    .line 147
    invoke-virtual {v1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v1}, Lax/U2/f;->e()J

    .line 152
    .line 153
    .line 154
    move-result-wide v5

    .line 155
    move-object v0, p0

    .line 156
    move-object v1, p1

    .line 157
    move-object v3, p3

    .line 158
    invoke-virtual/range {v0 .. v6}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    :cond_a4
    if-eqz v11, :cond_cd

    .line 166
    .line 167
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const/4 v1, 0x1

    .line 172
    if-le v0, v1, :cond_cd

    .line 173
    .line 174
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lax/U2/f;

    .line 179
    .line 180
    invoke-virtual {v0}, Lax/U2/f;->e()J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    cmp-long v1, v3, v7

    .line 185
    .line 186
    if-lez v1, :cond_cd

    .line 187
    .line 188
    invoke-virtual {v0}, Lax/U2/f;->r()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v0}, Lax/U2/f;->e()J

    .line 193
    .line 194
    .line 195
    move-result-wide v5

    .line 196
    move-object v0, p0

    .line 197
    move-object v1, p1

    .line 198
    move-object v3, p3

    .line 199
    invoke-virtual/range {v0 .. v6}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 204
    .line 205
    .line 206
    :cond_cd
    const v1, 0x7f0a00f7

    .line 207
    .line 208
    .line 209
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    check-cast v1, Landroid/widget/Button;

    .line 214
    .line 215
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 216
    .line 217
    .line 218
    const v2, 0x7f130278

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 222
    .line 223
    .line 224
    new-instance v2, Lax/d3/b$a;

    .line 225
    .line 226
    const-wide/16 v3, 0x190

    .line 227
    .line 228
    invoke-direct {v2, p0, v3, v4}, Lax/d3/b$a;-><init>(Lax/d3/b;J)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 232
    .line 233
    .line 234
    const v1, 0x7f0a0305

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    const/16 v2, 0x8

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 244
    .line 245
    .line 246
    return-object v10
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

.method M5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 15

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->X()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0d0036

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const p2, 0x7f0a0493

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3}, Lax/T2/h;->f0()Lax/c3/k0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    if-nez p2, :cond_2b

    .line 40
    .line 41
    move-wide v5, v3

    .line 42
    move-wide v7, v5

    .line 43
    goto :goto_2f

    .line 44
    :cond_2b
    iget-wide v5, p2, Lax/c3/k0;->b:J

    .line 45
    .line 46
    iget-wide v7, p2, Lax/c3/k0;->a:J

    .line 47
    .line 48
    :goto_2f
    sub-long v9, v5, v7

    .line 49
    .line 50
    cmp-long p2, v5, v3

    .line 51
    .line 52
    if-eqz p2, :cond_3b

    .line 53
    .line 54
    const-wide/16 v1, 0x3e8

    .line 55
    .line 56
    mul-long v1, v1, v7

    .line 57
    .line 58
    div-long/2addr v1, v5

    .line 59
    long-to-int v2, v1

    .line 60
    :cond_3b
    long-to-double v3, v7

    .line 61
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 62
    .line 63
    mul-double v3, v3, v7

    .line 64
    .line 65
    long-to-double v5, v5

    .line 66
    div-double/2addr v3, v5

    .line 67
    double-to-float p2, v3

    .line 68
    invoke-static {p2}, Lax/u3/B;->P(F)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v3, Lax/c3/B$a;->q:Lax/c3/B$a;

    .line 77
    .line 78
    invoke-static {v1, v9, v10, v3}, Lax/c3/B;->l(Landroid/content/Context;JLax/c3/B$a;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const v3, 0x7f0a0416

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    const v1, 0x7f0a04cc

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Landroid/widget/ProgressBar;

    .line 102
    .line 103
    const/16 v4, 0x3e8

    .line 104
    .line 105
    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Landroid/widget/ProgressBar;

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 115
    .line 116
    .line 117
    const v1, 0x7f0a04cb

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Landroid/widget/TextView;

    .line 125
    .line 126
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    const p2, 0x7f0a0415

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Landroid/widget/TextView;

    .line 137
    .line 138
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 139
    .line 140
    invoke-virtual {p3, v1}, Lax/T2/h;->Q(Lax/c3/z;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v1

    .line 144
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    const p2, 0x7f0a0418

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    check-cast p2, Landroid/widget/TextView;

    .line 159
    .line 160
    sget-object v1, Lax/c3/z;->c0:Lax/c3/z;

    .line 161
    .line 162
    invoke-virtual {p3, v1}, Lax/T2/h;->Q(Lax/c3/z;)J

    .line 163
    .line 164
    .line 165
    move-result-wide v1

    .line 166
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    const p2, 0x7f0a041a

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    check-cast p2, Landroid/widget/TextView;

    .line 181
    .line 182
    sget-object v1, Lax/c3/z;->e0:Lax/c3/z;

    .line 183
    .line 184
    invoke-virtual {p3, v1}, Lax/T2/h;->Q(Lax/c3/z;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v1

    .line 188
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    .line 194
    .line 195
    const p2, 0x7f0a0414

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    check-cast p2, Landroid/widget/TextView;

    .line 203
    .line 204
    sget-object v1, Lax/c3/z;->v0:Lax/c3/z;

    .line 205
    .line 206
    invoke-virtual {p3, v1}, Lax/T2/h;->Q(Lax/c3/z;)J

    .line 207
    .line 208
    .line 209
    move-result-wide v1

    .line 210
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    const p2, 0x7f0a0410

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    check-cast p2, Landroid/widget/TextView;

    .line 225
    .line 226
    sget-object v1, Lax/c3/z;->r0:Lax/c3/z;

    .line 227
    .line 228
    invoke-virtual {p3, v1}, Lax/T2/h;->Q(Lax/c3/z;)J

    .line 229
    .line 230
    .line 231
    move-result-wide v1

    .line 232
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    const p2, 0x7f0a0419

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    check-cast p2, Landroid/widget/TextView;

    .line 247
    .line 248
    sget-object v1, Lax/c3/z;->u0:Lax/c3/z;

    .line 249
    .line 250
    invoke-virtual {p3, v1}, Lax/T2/h;->Q(Lax/c3/z;)J

    .line 251
    .line 252
    .line 253
    move-result-wide v1

    .line 254
    invoke-virtual {p0, v1, v2}, Lax/d3/p;->c5(J)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p3

    .line 258
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    new-instance p2, Lax/d3/b$s;

    .line 262
    .line 263
    invoke-direct {p2, p0, v0}, Lax/d3/b$s;-><init>(Lax/d3/b;Lax/c3/K;)V

    .line 264
    .line 265
    .line 266
    const p3, 0x7f0a0305

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 270
    .line 271
    .line 272
    move-result-object p3

    .line 273
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    .line 278
    .line 279
    return-object p1
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

.method N5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
    .registers 13

    .line 1
    invoke-virtual {p3}, Lax/T2/h;->o0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_8
    const v0, 0x7f0d003b

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const v0, 0x7f0a0493

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/widget/TextView;

    .line 25
    .line 26
    const v2, 0x7f13023e

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Lax/T2/h;->i0()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-virtual {p0, v2, v3}, Lax/d3/p;->b5(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v2, 0x7f0a0416

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    const v0, 0x7f0a00d3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/widget/TextView;

    .line 60
    .line 61
    const/16 v2, 0x8

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    const v0, 0x7f0a0204

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v4, v0

    .line 74
    check-cast v4, Landroid/widget/LinearLayout;

    .line 75
    .line 76
    invoke-virtual {p3}, Lax/T2/h;->h0()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_70

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-lez v2, :cond_70

    .line 87
    .line 88
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lax/U2/f;

    .line 93
    .line 94
    invoke-virtual {v1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v1}, Lax/U2/f;->s()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    move-object v2, p0

    .line 103
    move-object v3, p1

    .line 104
    move-object v5, p3

    .line 105
    invoke-virtual/range {v2 .. v8}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    goto :goto_72

    .line 113
    :cond_70
    move-object v3, p1

    .line 114
    move-object v5, p3

    .line 115
    :goto_72
    if-eqz v0, :cond_9c

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    const/4 p3, 0x1

    .line 122
    if-le p1, p3, :cond_9c

    .line 123
    .line 124
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Lax/U2/f;

    .line 129
    .line 130
    invoke-virtual {p1}, Lax/U2/f;->s()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    const-wide/16 v6, 0x0

    .line 135
    .line 136
    cmp-long p3, v0, v6

    .line 137
    .line 138
    if-lez p3, :cond_9c

    .line 139
    .line 140
    invoke-virtual {p1}, Lax/U2/f;->r()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {p1}, Lax/U2/f;->s()J

    .line 145
    .line 146
    .line 147
    move-result-wide v7

    .line 148
    move-object v2, p0

    .line 149
    invoke-virtual/range {v2 .. v8}, Lax/d3/b;->E5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;Ljava/lang/String;J)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 154
    .line 155
    .line 156
    goto :goto_9d

    .line 157
    :cond_9c
    move-object v2, p0

    .line 158
    :goto_9d
    new-instance p1, Lax/d3/b$k;

    .line 159
    .line 160
    invoke-direct {p1, p0}, Lax/d3/b$k;-><init>(Lax/d3/b;)V

    .line 161
    .line 162
    .line 163
    const p3, 0x7f0a0305

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    invoke-virtual {p3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    .line 175
    .line 176
    return-object p2
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

.method O5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;
    .registers 6

    .line 1
    const v0, 0x7f0d003e

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a0493

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 19
    .line 20
    .line 21
    const p2, 0x7f0a00d3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Landroid/widget/TextView;

    .line 29
    .line 30
    const p3, 0x7f1303a3

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 34
    .line 35
    .line 36
    const p2, 0x7f0a00bf

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Landroid/widget/Button;

    .line 44
    .line 45
    const p3, 0x7f130370

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 49
    .line 50
    .line 51
    new-instance p3, Lax/d3/b$t;

    .line 52
    .line 53
    invoke-direct {p3, p0}, Lax/d3/b$t;-><init>(Lax/d3/b;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    return-object p1
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

.method protected U4()V
    .registers 9

    .line 1
    invoke-virtual {p0}, Lax/d3/b;->e5()Lax/T2/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/T2/h;->m0()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_b

    .line 10
    .line 11
    goto :goto_11

    .line 12
    :cond_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_12

    .line 17
    .line 18
    :goto_11
    return-void

    .line 19
    :cond_12
    invoke-direct {p0}, Lax/d3/b;->V5()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Lax/d3/p;->f5()Landroid/widget/LinearLayout;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, p0, Lax/d3/p;->E0:Landroid/view/View;

    .line 39
    .line 40
    const/16 v5, 0x8

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lax/d3/p;->V4()V

    .line 46
    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, -0x1

    .line 50
    if-eqz v1, :cond_b3

    .line 51
    .line 52
    if-ne v1, v5, :cond_37

    .line 53
    .line 54
    goto/16 :goto_b3

    .line 55
    .line 56
    :cond_37
    const/4 v5, 0x1

    .line 57
    if-ne v1, v5, :cond_143

    .line 58
    .line 59
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->K5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_55

    .line 71
    .line 72
    invoke-virtual {v0}, Lax/T2/h;->l0()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_55

    .line 77
    .line 78
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->L5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    goto :goto_5c

    .line 86
    :cond_55
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->I5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    :goto_5c
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->G5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_a1

    .line 105
    .line 106
    invoke-virtual {v0}, Lax/T2/h;->X()Lax/c3/K;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sget-object v5, Lax/c3/K;->e:Lax/c3/K;

    .line 111
    .line 112
    if-ne v1, v5, :cond_a1

    .line 113
    .line 114
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_a1

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_9a

    .line 129
    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-static {}, Lax/u3/o;->b()Landroid/content/Intent;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v1, v5}, Lax/u3/B;->K(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_a1

    .line 143
    .line 144
    const v1, 0x7f13023e

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v3, v2, v1}, Lax/d3/b;->O5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    goto :goto_a1

    .line 155
    :cond_9a
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->N5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    :cond_a1
    :goto_a1
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->H5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0, v0}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 167
    .line 168
    .line 169
    iget v0, p0, Lax/d3/p;->O0:I

    .line 170
    .line 171
    if-nez v0, :cond_143

    .line 172
    .line 173
    iget-object v0, p0, Lax/d3/p;->E0:Landroid/view/View;

    .line 174
    .line 175
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_143

    .line 179
    .line 180
    :cond_b3
    :goto_b3
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->M5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, v6}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    iget-object v6, p0, Lax/d3/b;->Q0:Landroidx/cardview/widget/CardView;

    .line 191
    .line 192
    if-eqz v6, :cond_cc

    .line 193
    .line 194
    invoke-static {}, Lax/t3/a;->g()Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_cc

    .line 199
    .line 200
    iget-object v6, p0, Lax/d3/b;->Q0:Landroidx/cardview/widget/CardView;

    .line 201
    .line 202
    invoke-virtual {p0, v6}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    :cond_cc
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_10a

    .line 210
    .line 211
    invoke-virtual {v0}, Lax/T2/h;->X()Lax/c3/K;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    sget-object v7, Lax/c3/K;->e:Lax/c3/K;

    .line 216
    .line 217
    if-ne v6, v7, :cond_10a

    .line 218
    .line 219
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    if-eqz v6, :cond_10a

    .line 224
    .line 225
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-static {v6}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-nez v6, :cond_103

    .line 234
    .line 235
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-static {}, Lax/u3/o;->b()Landroid/content/Intent;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-static {v6, v7}, Lax/u3/B;->K(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_10a

    .line 248
    .line 249
    const v6, 0x7f130213

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, v3, v2, v6}, Lax/d3/b;->O5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-virtual {p0, v6}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 257
    .line 258
    .line 259
    goto :goto_10a

    .line 260
    :cond_103
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->F5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {p0, v6}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    :cond_10a
    :goto_10a
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->J5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-virtual {p0, v6}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 272
    .line 273
    .line 274
    if-ne v1, v5, :cond_143

    .line 275
    .line 276
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->K5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 281
    .line 282
    .line 283
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_12e

    .line 288
    .line 289
    invoke-virtual {v0}, Lax/T2/h;->l0()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-nez v1, :cond_12e

    .line 294
    .line 295
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->L5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 300
    .line 301
    .line 302
    goto :goto_135

    .line 303
    :cond_12e
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->I5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 308
    .line 309
    .line 310
    :goto_135
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->G5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {p0, v1}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0, v3, v2, v0}, Lax/d3/b;->H5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {p0, v0}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    :cond_143
    :goto_143
    const v0, 0x7f0d003c

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {p0, v0}, Lax/d3/p;->S4(Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    return-void
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

.method protected W2()Z
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

.method public W5()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/p;->H0:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_19

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->e()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x2

    .line 15
    if-ne v0, v2, :cond_19

    .line 16
    .line 17
    iget-object v0, p0, Lax/d3/p;->H0:Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v1}, Lax/d3/b;->c6(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    invoke-direct {p0, v1}, Lax/d3/b;->c6(I)V

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

.method protected e5()Lax/T2/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/b;->T0:Lax/T2/h;

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

.method protected h5()I
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/b;->Z5()Z

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

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

.method public i1(IILandroid/content/Intent;)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/d3/b;->X0:Lax/u3/m;

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
    const v0, 0x9471

    .line 9
    .line 10
    .line 11
    if-ne p1, v0, :cond_22

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    if-ne p2, p1, :cond_21

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    iput-wide p1, p0, Lax/d3/b;->W0:J

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/d3/b;->e5()Lax/T2/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1e

    .line 27
    .line 28
    invoke-virtual {p1}, Lax/T2/h;->o()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    invoke-direct {p0}, Lax/d3/b;->R5()V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void

    .line 35
    :cond_22
    const v1, 0x9473

    .line 36
    .line 37
    .line 38
    if-ne p1, v1, :cond_3e

    .line 39
    .line 40
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_57

    .line 45
    .line 46
    invoke-static {}, Lax/u3/o;->c()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_57

    .line 51
    .line 52
    new-instance v1, Landroid/content/Intent;

    .line 53
    .line 54
    const-string v2, "android.os.storage.action.CLEAR_APP_CACHE"

    .line 55
    .line 56
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v1, v0}, Lax/c3/u;->r0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_57

    .line 63
    :cond_3e
    const v0, 0x9474

    .line 64
    .line 65
    .line 66
    if-ne p1, v0, :cond_57

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_57

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_57

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Lax/d3/p;->c4(Z)V

    .line 86
    .line 87
    .line 88
    :cond_57
    :goto_57
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->i1(IILandroid/content/Intent;)V

    .line 89
    .line 90
    .line 91
    return-void
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

.method protected i5()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/b;->T0:Lax/T2/h;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/T2/h;->m0()Z

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
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j1(Landroid/app/Activity;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/b;->Y5()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lax/t3/c;->c()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput-boolean p1, p0, Lax/d3/b;->V0:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected k5()Lax/K0/a;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/K0/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/d3/b$x;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0}, Lax/d3/b;->T5()Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Lax/d3/b$j;

    .line 12
    .line 13
    invoke-direct {v3, p0}, Lax/d3/b$j;-><init>(Lax/d3/b;)V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lax/d3/b$p;

    .line 17
    .line 18
    invoke-direct {v4, p0}, Lax/d3/b$p;-><init>(Lax/d3/b;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v2, v3, v4}, Lax/d3/b$x;-><init>(Landroid/content/Context;Lax/c3/K;Lax/T2/h$g;Lax/u3/c;)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method public q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 4

    .line 1
    const v0, 0x7f0f001c

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

.method public s1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/b;->P0:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_15

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lax/S2/b;->a(Ljava/lang/Object;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/d3/b;->Q0:Landroidx/cardview/widget/CardView;

    .line 13
    .line 14
    iget-object v1, p0, Lax/d3/b;->P0:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lax/d3/b;->P0:Landroid/view/View;

    .line 21
    .line 22
    :cond_15
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lax/d3/b;->Z0:Z

    .line 24
    .line 25
    invoke-super {p0}, Lax/d3/n;->s1()V

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

.method public v1()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->v1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/b;->U0:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_19

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lax/T2/h;

    .line 21
    .line 22
    invoke-virtual {v1}, Lax/T2/h;->G0()V

    .line 23
    .line 24
    .line 25
    goto :goto_9

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

.method public z3()Lax/Q2/f;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->i1:Lax/Q2/f;

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
