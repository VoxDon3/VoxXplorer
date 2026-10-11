.class public Lcom/voxdon/xplorer/activity/MainActivity;
.super Lcom/voxdon/xplorer/activity/b;
.source "SourceFile"

# interfaces
.implements Lax/g3/e;
.implements Lax/d3/l0$o;
.implements Lax/a3/U$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/activity/MainActivity$K;,
        Lcom/voxdon/xplorer/activity/MainActivity$H;,
        Lcom/voxdon/xplorer/activity/MainActivity$G;,
        Lcom/voxdon/xplorer/activity/MainActivity$I;,
        Lcom/voxdon/xplorer/activity/MainActivity$J;
    }
.end annotation


# static fields
.field private static final E0:Ljava/util/logging/Logger;


# instance fields
.field private A:Landroid/view/View;

.field A0:Lax/a3/h$c;

.field private B:Lcom/google/android/material/tabs/TabLayout;

.field B0:Lax/g3/k;

.field private C:Landroid/widget/FrameLayout;

.field C0:Lax/g3/b;

.field private D:Landroid/view/View;

.field D0:Lax/S2/b$d;

.field private E:Landroid/view/View;

.field private F:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private G:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private H:Landroid/view/View;

.field private I:Lax/x3/A;

.field private J:Landroid/view/ViewGroup;

.field private K:Landroidx/appcompat/widget/Toolbar;

.field private L:Landroid/widget/ListView;

.field private M:Lax/V2/f;

.field private N:Lax/Z2/l;

.field private O:Lax/V2/d;

.field private P:Landroid/view/View;

.field private Q:Landroid/widget/Button;

.field private R:Landroid/view/ViewGroup;

.field private S:Landroid/view/ViewGroup;

.field private T:Lax/x3/h;

.field private U:Lax/d3/n;

.field private V:Lcom/voxdon/xplorer/bookmark/Bookmark;

.field private W:Lax/Z2/f;

.field private X:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/activity/MainActivity$J;",
            ">;"
        }
    .end annotation
.end field

.field private Y:I

.field private Z:Z

.field private a0:Ljava/lang/Runnable;

.field private b0:Lcom/voxdon/xplorer/bookmark/Bookmark;

.field private c0:Ljava/lang/Runnable;

.field private d0:Lcom/voxdon/xplorer/bookmark/Bookmark;

.field private e0:J

.field private f0:Landroid/widget/Toast;

.field private g0:Lax/S2/b$b;

.field private h0:J

.field private i0:J

.field private j0:Landroid/view/View;

.field private k0:Z

.field private l0:Ljava/lang/Object;

.field private m0:Lcom/voxdon/xplorer/activity/MainActivity$K;

.field private n0:Landroid/content/BroadcastReceiver;

.field private o0:Landroid/content/BroadcastReceiver;

.field private p0:Ljava/lang/Boolean;

.field private q0:Ljava/util/concurrent/CountDownLatch;

.field private r0:Lax/d3/e0;

.field private s0:Z

.field private t0:Landroid/os/Handler;

.field private u0:Z

.field private v0:Lax/g3/c;

.field w0:Ljava/lang/Runnable;

.field x0:Lax/i/r;

.field private final y:Ljava/lang/Object;

.field private y0:Ljava/lang/Runnable;

.field private z:Landroidx/drawerlayout/widget/DrawerLayout;

.field z0:Lax/g3/k;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/activity/MainActivity;->E0:Ljava/util/logging/Logger;

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
    .registers 5

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->y:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->X:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Z:Z

    .line 20
    .line 21
    sget-object v0, Lax/S2/b$b;->q:Lax/S2/b$b;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->g0:Lax/S2/b$b;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->q0:Ljava/util/concurrent/CountDownLatch;

    .line 32
    .line 33
    new-instance v0, Landroid/os/Handler;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->t0:Landroid/os/Handler;

    .line 39
    .line 40
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$D;

    .line 41
    .line 42
    const-wide/16 v2, 0x64

    .line 43
    .line 44
    invoke-direct {v0, p0, v2, v3}, Lcom/voxdon/xplorer/activity/MainActivity$D;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;J)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->v0:Lax/g3/c;

    .line 48
    .line 49
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$E;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$E;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->w0:Ljava/lang/Runnable;

    .line 55
    .line 56
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$d;

    .line 57
    .line 58
    invoke-direct {v0, p0, v1}, Lcom/voxdon/xplorer/activity/MainActivity$d;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Z)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->x0:Lax/i/r;

    .line 62
    .line 63
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$e;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$e;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->y0:Ljava/lang/Runnable;

    .line 69
    .line 70
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$f;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$f;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z0:Lax/g3/k;

    .line 76
    .line 77
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$g;

    .line 78
    .line 79
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$g;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A0:Lax/a3/h$c;

    .line 83
    .line 84
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$h;

    .line 85
    .line 86
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$h;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B0:Lax/g3/k;

    .line 90
    .line 91
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$i;

    .line 92
    .line 93
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$i;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->C0:Lax/g3/b;

    .line 97
    .line 98
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$y;

    .line 99
    .line 100
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$y;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->D0:Lax/S2/b$d;

    .line 104
    .line 105
    return-void
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

.method private D2(Ljava/lang/String;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->G:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->G:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const v3, 0x7f0d0137

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const v1, 0x7f0a0308

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

    .line 28
    .line 29
    const v1, 0x7f0a02f9

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/TextView;

    .line 37
    .line 38
    const v1, 0x7f13019c

    .line 39
    .line 40
    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    aput-object p1, v2, v3

    .line 45
    .line 46
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    const p1, 0x7f01001c

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->B0()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->t0:Landroid/os/Handler;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->w0:Ljava/lang/Runnable;

    .line 71
    .line 72
    const-wide/16 v1, 0x7530

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 75
    .line 76
    .line 77
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

.method private E2(Lcom/voxdon/xplorer/bookmark/Bookmark;Lax/Z2/f;)V
    .registers 9

    .line 1
    if-eqz p2, :cond_11

    .line 2
    .line 3
    invoke-virtual {p2}, Lax/Z2/f;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    invoke-virtual {p2}, Lax/Z2/f;->a()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p2}, Lax/Z2/f;->b()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    goto :goto_28

    .line 18
    :cond_11
    const/4 p2, 0x0

    .line 19
    if-eqz p1, :cond_27

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lax/Q2/f;->J()Lax/Q2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_27

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lax/Q2/f;->J()Lax/Q2/f;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 p1, 0x0

    .line 41
    :goto_28
    if-eqz p1, :cond_46

    .line 42
    .line 43
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2}, Lax/Z2/l;->c(Lax/Q2/f;I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ltz p1, :cond_46

    .line 50
    .line 51
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lax/Z2/l;->d(I)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Lax/Z2/l;->f(I)Lax/Z2/f;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const-string v2, "show_parent"

    .line 66
    .line 67
    move-object v0, p0

    .line 68
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 69
    .line 70
    .line 71
    :cond_46
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
.end method

.method private F1(Landroid/content/Intent;)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_53

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_53

    .line 11
    :cond_a
    const-string v1, "com.voxdon.xplorer.OPEN_ANALYSIS"

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_53

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_2a

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lax/Z2/k;->a(Landroid/net/Uri;)Lax/Z2/k;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    move-object p1, v2

    .line 44
    :goto_2b
    const/4 v1, 0x1

    .line 45
    const-string v3, "notification"

    .line 46
    .line 47
    if-eqz p1, :cond_4f

    .line 48
    .line 49
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v2, "storage_full_noti_clicked"

    .line 54
    .line 55
    invoke-virtual {v0, v3, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v4, "loc"

    .line 68
    .line 69
    invoke-virtual {v0, v4, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1, v1, v3}, Lcom/voxdon/xplorer/activity/MainActivity;->K2(Lax/c3/K;ZLjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_52

    .line 80
    :cond_4f
    invoke-virtual {p0, v2, v0, v3}, Lcom/voxdon/xplorer/activity/MainActivity;->K2(Lax/c3/K;ZLjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_52
    return v1

    .line 84
    :cond_53
    :goto_53
    return v0
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

.method private G1(Landroid/content/Intent;)Z
    .registers 4

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    const-string v0, "com.filemanager.extra.HAS_PENDING_DIALOG"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_c

    .line 11
    .line 12
    goto :goto_d

    .line 13
    :cond_c
    return v1

    .line 14
    :cond_d
    :goto_d
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_16

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Lcom/voxdon/xplorer/service/CommandService;->G(Lax/R2/a;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    invoke-static {p0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/16 v0, 0x66

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lax/s3/u;->a(I)V

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

.method private H1(Landroid/content/Intent;)Z
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_31

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_31

    .line 11
    :cond_a
    const-string v1, "com.voxdon.xplorer.OPEN_FILE"

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_31

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_31

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->c(Landroid/content/Context;Landroid/net/Uri;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_27

    .line 38
    .line 39
    return v0

    .line 40
    :cond_27
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    move-object v1, p0

    .line 45
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_31
    :goto_31
    return v0
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

.method private I1(Landroid/content/Intent;)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_25

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_25

    .line 11
    :cond_a
    const-string v1, "com.voxdon.xplorer.SAVE_FILE"

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_25

    .line 22
    .line 23
    const-string p1, "save_file"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->q0(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->d0()Lax/d3/n;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x1

    .line 33
    if-eqz p1, :cond_25

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lax/d3/n;->e4(Z)V

    .line 36
    .line 37
    .line 38
    :cond_25
    :goto_25
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
.end method

.method private J1(Landroid/content/Intent;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lax/Q2/j;->m(Z)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->M1(Landroid/content/Intent;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    goto :goto_46

    .line 16
    :cond_f
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->H1(Landroid/content/Intent;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_16

    .line 21
    .line 22
    goto :goto_46

    .line 23
    :cond_16
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->F1(Landroid/content/Intent;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1d

    .line 28
    .line 29
    goto :goto_46

    .line 30
    :cond_1d
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->I1(Landroid/content/Intent;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_24

    .line 35
    .line 36
    goto :goto_46

    .line 37
    :cond_24
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->K1(Landroid/content/Intent;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2b

    .line 42
    .line 43
    goto :goto_46

    .line 44
    :cond_2b
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->P1(Landroid/content/Intent;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_32

    .line 49
    .line 50
    goto :goto_46

    .line 51
    :cond_32
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->G1(Landroid/content/Intent;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_39

    .line 56
    .line 57
    goto :goto_46

    .line 58
    :cond_39
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->L1(Landroid/content/Intent;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_40

    .line 63
    .line 64
    goto :goto_46

    .line 65
    :cond_40
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->O1(Landroid/content/Intent;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_47

    .line 70
    .line 71
    :goto_46
    return-void

    .line 72
    :cond_47
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->N1(Landroid/content/Intent;)Z

    .line 73
    .line 74
    .line 75
    return-void
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

.method private K1(Landroid/content/Intent;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_81

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_b

    .line 9
    .line 10
    goto/16 :goto_81

    .line 11
    .line 12
    :cond_b
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "android.intent.action.GET_CONTENT"

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_31

    .line 23
    .line 24
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_31

    .line 31
    .line 32
    const-string v2, "android.intent.action.PICK"

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_31

    .line 39
    .line 40
    const-string v2, "android.intent.action.CREATE_SHORTCUT"

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_30

    .line 47
    .line 48
    goto :goto_31

    .line 49
    :cond_30
    return v0

    .line 50
    :cond_31
    :goto_31
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lax/W2/c;->v()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_42

    .line 59
    .line 60
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lax/W2/c;->l()V

    .line 65
    .line 66
    .line 67
    :cond_42
    invoke-static {}, Lax/X2/Q;->l1()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4e

    .line 72
    .line 73
    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    :cond_4e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v2, "com.filemanager.plugin.extra.CALLING_PACKAGE"

    .line 84
    .line 85
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, Lax/Q2/j;->i(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1, v2}, Lax/Q2/j;->l(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const/4 v2, 0x1

    .line 108
    invoke-virtual {v1, v2}, Lax/Q2/j;->m(Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v1, v0}, Lax/Q2/j;->k(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v0, p1}, Lax/Q2/j;->j(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return v2

    .line 130
    :cond_81
    :goto_81
    return v0
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

.method private L1(Landroid/content/Intent;)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1a

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_1a

    .line 11
    :cond_a
    const-string v1, "com.filemanager.SET_PERMISSION"

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1a

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->s0:Z

    .line 25
    .line 26
    return p1

    .line 27
    :cond_1a
    :goto_1a
    return v0
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

.method private L2(Ljava/lang/String;)V
    .registers 5

    .line 1
    const-string v0, "Favorite"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x4

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    goto :goto_25

    .line 13
    :cond_c
    const-string v0, "History"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_18

    .line 20
    .line 21
    const/4 p1, 0x4

    .line 22
    const/4 v1, 0x4

    .line 23
    const/4 v2, 0x0

    .line 24
    goto :goto_25

    .line 25
    :cond_18
    const-string v0, "LastVisited"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_23

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    :goto_21
    const/4 v1, 0x4

    .line 35
    goto :goto_25

    .line 36
    :cond_23
    const/4 p1, 0x4

    .line 37
    goto :goto_21

    .line 38
    :goto_25
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->D:Landroid/view/View;

    .line 39
    .line 40
    if-eqz v0, :cond_2c

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->E:Landroid/view/View;

    .line 46
    .line 47
    if-eqz v0, :cond_33

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    :cond_33
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->P:Landroid/view/View;

    .line 53
    .line 54
    if-eqz v0, :cond_3a

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return-void
    .line 60
    .line 61
.end method

.method private M1(Landroid/content/Intent;)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_54

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_54

    .line 11
    :cond_a
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v2, "com.example.android.uamp.open_ui"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1a

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1a
    const-string v1, "PLAY_FOLDER_URI"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Landroid/content/Intent;

    .line 34
    .line 35
    const-class v3, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 36
    .line 37
    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    const/high16 v3, 0x24000000

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION"

    .line 47
    .line 48
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v1, :cond_4f

    .line 57
    .line 58
    const-string v3, "com.example.android.uamp.EXTRA_START_FULLSCREEN"

    .line 59
    .line 60
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_4a

    .line 65
    .line 66
    new-instance p1, Lcom/voxdon/xplorer/activity/MainActivity$c;

    .line 67
    .line 68
    invoke-direct {p1, p0, v2}, Lcom/voxdon/xplorer/activity/MainActivity$c;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Landroid/content/Intent;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->e2(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_52

    .line 75
    :cond_4a
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, v1, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->e2(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 77
    .line 78
    .line 79
    goto :goto_52

    .line 80
    :cond_4f
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 81
    .line 82
    .line 83
    :goto_52
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_54
    :goto_54
    return v0
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

.method static synthetic N0(Lcom/voxdon/xplorer/activity/MainActivity;)Ljava/util/concurrent/CountDownLatch;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->q0:Ljava/util/concurrent/CountDownLatch;

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

.method private N1(Landroid/content/Intent;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_37

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_37

    .line 11
    :cond_a
    const-string v1, "android.intent.action.VIEW"

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_37

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_37

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v1, "content"

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_37

    .line 44
    .line 45
    const p1, 0x7f130147

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 54
    .line 55
    .line 56
    :cond_37
    :goto_37
    return v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private N2(Lax/Q2/f;ILandroid/os/Bundle;Lax/Z2/f;)Lax/d3/n;
    .registers 8

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->p1(Lax/Q2/f;I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lax/d3/n;

    .line 14
    .line 15
    if-nez v1, :cond_28

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->b2(Lax/Q2/f;)Lax/d3/n;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez p3, :cond_1b

    .line 22
    .line 23
    new-instance p3, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    const-string v2, "location"

    .line 29
    .line 30
    invoke-virtual {p3, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 31
    .line 32
    .line 33
    const-string p1, "location_key"

    .line 34
    .line 35
    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p3}, Landroidx/fragment/app/Fragment;->v2(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    instance-of p1, v1, Lax/d3/E;

    .line 42
    .line 43
    if-eqz p1, :cond_43

    .line 44
    .line 45
    move-object p1, v1

    .line 46
    check-cast p1, Lax/d3/E;

    .line 47
    .line 48
    if-eqz p4, :cond_3f

    .line 49
    .line 50
    invoke-virtual {p4}, Lax/Z2/f;->c()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_3f

    .line 55
    .line 56
    invoke-virtual {p4}, Lax/Z2/f;->a()Lax/Q2/f;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p1, p2}, Lax/d3/E;->E9(Lax/Q2/f;)V

    .line 61
    .line 62
    .line 63
    goto :goto_43

    .line 64
    :cond_3f
    const/4 p2, 0x0

    .line 65
    invoke-virtual {p1, p2}, Lax/d3/E;->E9(Lax/Q2/f;)V

    .line 66
    .line 67
    .line 68
    :cond_43
    :goto_43
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->r2(Lax/d3/n;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1
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

.method static synthetic O0(Lcom/voxdon/xplorer/activity/MainActivity;)Landroidx/drawerlayout/widget/DrawerLayout;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

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

.method private O1(Landroid/content/Intent;)Z
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2a

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_2a

    .line 11
    :cond_a
    const-string v1, "android.intent.action.VIEW_DOWNLOADS"

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2a

    .line 22
    .line 23
    sget-object p1, Lax/c3/K;->i:Lax/c3/K;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->i(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    move-object v1, p0

    .line 38
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_2a
    :goto_2a
    return v0
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

.method private O2()V
    .registers 3

    .line 1
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->n0:Landroid/content/BroadcastReceiver;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->o0:Landroid/content/BroadcastReceiver;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->t0:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->w0:Ljava/lang/Runnable;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
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

.method static synthetic P0(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/V2/e;
    .registers 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

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

.method private P1(Landroid/content/Intent;)Z
    .registers 11

    .line 1
    const/4 v1, 0x0

    .line 2
    if-eqz p1, :cond_17e

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    if-nez v2, :cond_b

    .line 9
    .line 10
    goto/16 :goto_17e

    .line 11
    .line 12
    :cond_b
    const-string v2, "android.intent.action.VIEW"

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_17e

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_17e

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v4, "content"

    .line 43
    .line 44
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, 0x1

    .line 49
    if-eqz v5, :cond_5a

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v7, "com.android.externalstorage.documents"

    .line 60
    .line 61
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_5a

    .line 66
    .line 67
    invoke-static {v2}, Lcom/voxdon/xplorer/file/g;->r(Landroid/net/Uri;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-nez v2, :cond_49

    .line 72
    .line 73
    return v1

    .line 74
    :cond_49
    invoke-static {v2}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {p0, v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->g(Landroid/content/Context;Ljava/lang/String;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    move-object v0, p0

    .line 87
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 88
    .line 89
    .line 90
    return v6

    .line 91
    :cond_5a
    if-eqz v3, :cond_166

    .line 92
    .line 93
    const-string v0, "file"

    .line 94
    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_66

    .line 100
    .line 101
    goto/16 :goto_166

    .line 102
    .line 103
    :cond_66
    const-string v0, "smb"

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    const-string v7, "sftp"

    .line 110
    .line 111
    const-string v8, "ftp"

    .line 112
    .line 113
    if-nez v5, :cond_f4

    .line 114
    .line 115
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-nez v5, :cond_f4

    .line 120
    .line 121
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_80

    .line 126
    .line 127
    goto/16 :goto_f4

    .line 128
    .line 129
    :cond_80
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_17e

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v2, "com.android.mtp.documents"

    .line 144
    .line 145
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_17e

    .line 150
    .line 151
    invoke-static {}, Lax/X2/Q;->k1()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_17e

    .line 156
    .line 157
    :try_start_9c
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v2}, Lax/c3/L;->r0(Landroid/net/Uri;)Landroid/net/Uri;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-eqz v0, :cond_d2

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    const/4 v3, 0x0

    .line 180
    :cond_b3
    :goto_b3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_d1

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Landroid/content/UriPermission;

    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    if-eqz v5, :cond_b3

    .line 197
    .line 198
    invoke-virtual {v4}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4
    :try_end_cd
    .catch Ljava/lang/Exception; {:try_start_9c .. :try_end_cd} :catch_f3

    .line 206
    if-eqz v4, :cond_b3

    .line 207
    .line 208
    const/4 v3, 0x1

    .line 209
    goto :goto_b3

    .line 210
    :cond_d1
    move v1, v3

    .line 211
    :cond_d2
    if-nez v1, :cond_eb

    .line 212
    .line 213
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v0, v1}, Lax/Z2/j;->V0(Landroid/net/Uri;)Lax/c3/K;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    if-eqz v2, :cond_f2

    .line 226
    .line 227
    const/4 v4, 0x1

    .line 228
    const/4 v5, 0x1

    .line 229
    const/4 v1, 0x0

    .line 230
    const/4 v3, 0x0

    .line 231
    move-object v0, p0

    .line 232
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/a;->R(ILax/c3/K;Ljava/lang/String;ZZ)V

    .line 233
    .line 234
    .line 235
    goto :goto_f2

    .line 236
    :cond_eb
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Lax/Z2/j;->t()V

    .line 241
    .line 242
    .line 243
    :cond_f2
    :goto_f2
    return v6

    .line 244
    :catch_f3
    return v1

    .line 245
    :cond_f4
    :goto_f4
    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_107

    .line 254
    .line 255
    invoke-static {p0}, Lcom/voxdon/xplorer/file/Q;->t0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/Q$b;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/Q$b;->n()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    goto :goto_124

    .line 264
    :cond_107
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_116

    .line 269
    .line 270
    invoke-static {p0}, Lcom/voxdon/xplorer/file/q;->z0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/q$g;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/q$g;->p()Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    goto :goto_124

    .line 279
    :cond_116
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_165

    .line 284
    .line 285
    invoke-static {p0}, Lcom/voxdon/xplorer/file/L;->A0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/L$j;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$j;->n()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    :goto_124
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const/4 v3, 0x0

    .line 298
    :cond_129
    :goto_129
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    if-eqz v7, :cond_14a

    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    check-cast v7, Lax/Z2/s;

    .line 309
    .line 310
    invoke-virtual {v7}, Lax/Z2/s;->c()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    if-eqz v8, :cond_129

    .line 315
    .line 316
    invoke-virtual {v7}, Lax/Z2/s;->c()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    if-eqz v8, :cond_129

    .line 325
    .line 326
    invoke-virtual {v7}, Lax/Z2/s;->e()Lax/c3/K;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    goto :goto_129

    .line 331
    :cond_14a
    if-nez v3, :cond_14d

    .line 332
    .line 333
    return v1

    .line 334
    :cond_14d
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-nez v0, :cond_154

    .line 339
    .line 340
    return v1

    .line 341
    :cond_154
    invoke-static {v0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {p0, v3, v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->i(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    const/4 v4, 0x0

    .line 350
    const/4 v5, 0x0

    .line 351
    const/4 v2, 0x0

    .line 352
    const/4 v3, 0x0

    .line 353
    move-object v0, p0

    .line 354
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 355
    .line 356
    .line 357
    return v6

    .line 358
    :cond_165
    return v1

    .line 359
    :cond_166
    :goto_166
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    if-nez v2, :cond_16d

    .line 364
    .line 365
    return v1

    .line 366
    :cond_16d
    invoke-static {v2}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-static {p0, v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->g(Landroid/content/Context;Ljava/lang/String;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    const/4 v4, 0x0

    .line 375
    const/4 v5, 0x0

    .line 376
    const/4 v2, 0x0

    .line 377
    const/4 v3, 0x0

    .line 378
    move-object v0, p0

    .line 379
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 380
    .line 381
    .line 382
    return v6

    .line 383
    :cond_17e
    :goto_17e
    return v1
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

.method static synthetic Q0(Lcom/voxdon/xplorer/activity/MainActivity;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A:Landroid/view/View;

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

.method private Q1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const v0, 0x7f01001d

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$F;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$F;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 24
    .line 25
    .line 26
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

.method private Q2()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->R2()V

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

.method static synthetic R0(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/d3/e0;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->r0:Lax/d3/e0;

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

.method private R2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    if-eqz v0, :cond_18

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 10
    .line 11
    if-ne v0, v1, :cond_18

    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/x3/h;->i()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Lax/x3/h;->l(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_3b

    .line 25
    :cond_18
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1}, Lax/x3/h;->l(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 32
    .line 33
    if-eqz v0, :cond_33

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Lax/Q2/f;->s1:Lax/Q2/f;

    .line 40
    .line 41
    if-ne v0, v1, :cond_33

    .line 42
    .line 43
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 44
    .line 45
    const v1, 0x7f080185

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lax/x3/h;->m(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_3b

    .line 52
    :cond_33
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 53
    .line 54
    const v1, 0x7f08003d

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lax/x3/h;->m(I)V

    .line 58
    .line 59
    .line 60
    :goto_3b
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->k2()V

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

.method static synthetic S0(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->m1()V

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

.method private S1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->v0:Lax/g3/c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/x3/h;->n(Landroid/view/View$OnClickListener;)V

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
.end method

.method static synthetic T0(Lcom/voxdon/xplorer/activity/MainActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->u0:Z

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

.method static synthetic U0(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->p()V

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

.method static synthetic V0(Lcom/voxdon/xplorer/activity/MainActivity;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->L2(Ljava/lang/String;)V

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

.method static synthetic W0(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/Z2/l;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

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

.method static synthetic X0(Lcom/voxdon/xplorer/activity/MainActivity;Lax/Q2/f;I)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->q2(Lax/Q2/f;I)V

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

.method static synthetic Y0(Lcom/voxdon/xplorer/activity/MainActivity;)Landroid/widget/ListView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->L:Landroid/widget/ListView;

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

.method static synthetic Z0(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/c3/K;
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->y1()Lax/c3/K;

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

.method static synthetic a1(Lcom/voxdon/xplorer/activity/MainActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->z1()Ljava/lang/String;

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

.method private a2()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->k2()V

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

.method static synthetic b1(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/V2/f;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->M:Lax/V2/f;

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

.method private b2(Lax/Q2/f;)Lax/d3/n;
    .registers 4

    .line 1
    invoke-virtual {p1}, Lax/Q2/f;->A()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    :try_start_8
    invoke-virtual {p1}, Lax/Q2/f;->A()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lax/d3/n;
    :try_end_12
    .catch Ljava/lang/IllegalAccessException; {:try_start_8 .. :try_end_12} :catch_15
    .catch Ljava/lang/InstantiationException; {:try_start_8 .. :try_end_12} :catch_13

    .line 18
    .line 19
    return-object p1

    .line 20
    :catch_13
    move-exception p1

    .line 21
    goto :goto_17

    .line 22
    :catch_15
    move-exception p1

    .line 23
    goto :goto_1b

    .line 24
    :goto_17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :goto_1b
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    return-object v1
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

.method static synthetic c1(Lcom/voxdon/xplorer/activity/MainActivity;)Landroid/widget/Button;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Q:Landroid/widget/Button;

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

.method static synthetic d1(Lcom/voxdon/xplorer/activity/MainActivity;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->D2(Ljava/lang/String;)V

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

.method static synthetic e1(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->Q1()V

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

.method static synthetic f1(Lcom/voxdon/xplorer/activity/MainActivity;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

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

.method static synthetic g1(Lcom/voxdon/xplorer/activity/MainActivity;Landroid/view/View;)Landroid/view/View;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

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

.method private i1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->f0:Landroid/widget/Toast;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->t0:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->y0:Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->f0:Landroid/widget/Toast;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->f0:Landroid/widget/Toast;

    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method private k1(Landroid/os/Bundle;)V
    .registers 9

    .line 1
    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Landroid/os/Bundle;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_5f

    .line 12
    :cond_b
    check-cast p1, Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v0, "android:support:fragments"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p1, Landroid/os/Bundle;

    .line 21
    .line 22
    if-nez v0, :cond_18

    .line 23
    .line 24
    goto :goto_5f

    .line 25
    :cond_18
    check-cast p1, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_22
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_5f

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v1, :cond_22

    .line 48
    .line 49
    const-string v2, "fragment_"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_22

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    instance-of v2, v1, Landroid/os/Bundle;

    .line 62
    .line 63
    if-eqz v2, :cond_22

    .line 64
    .line 65
    check-cast v1, Landroid/os/Bundle;

    .line 66
    .line 67
    const-string v2, "state"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    instance-of v2, v1, Landroid/os/Parcelable;

    .line 74
    .line 75
    if-eqz v2, :cond_22

    .line 76
    .line 77
    move-object v2, v1

    .line 78
    check-cast v2, Landroid/os/Parcelable;

    .line 79
    .line 80
    invoke-static {v2}, Lax/u3/B;->x(Landroid/os/Parcelable;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    int-to-long v2, v2

    .line 85
    const-wide/32 v4, 0x80000

    .line 86
    .line 87
    .line 88
    cmp-long v6, v2, v4

    .line 89
    .line 90
    if-ltz v6, :cond_22

    .line 91
    .line 92
    invoke-static {v1}, Landroidx/fragment/app/q;->a(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_22

    .line 96
    :cond_5f
    :goto_5f
    return-void
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

.method private k2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    if-eqz v0, :cond_30

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/Q2/f;->n(Lax/Q2/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_30

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->T1()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_30

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->W1()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_30

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->C1()Lax/V2/d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lax/V2/d;->i()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x1

    .line 36
    if-le v0, v1, :cond_30

    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lax/x3/h;->r(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lax/x3/h;->k(Z)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {v0, v1}, Lax/x3/h;->r(Z)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lax/x3/h;->k(Z)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private l1()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->l0:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->l0:Ljava/lang/Object;

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

.method private l2()V
    .registers 4

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$B;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$B;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->n0:Landroid/content/BroadcastReceiver;

    .line 7
    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "local.intent.action.LICENSE_STATUS_CHANGED"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "local.intent.action.SETTING_CHANGED"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->n0:Landroid/content/BroadcastReceiver;

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lax/u3/g;->c(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$C;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$C;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->o0:Landroid/content/BroadcastReceiver;

    .line 38
    .line 39
    new-instance v0, Landroid/content/IntentFilter;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v1, "local.intent.action.USB_IS_EJECTING"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "local.intent.action.USB_IS_EJECTED"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->o0:Landroid/content/BroadcastReceiver;

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lax/u3/g;->c(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V

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

.method private m1()V
    .registers 9

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f13012d

    invoke-virtual {p0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    const v1, 0x7f1300a7

    invoke-virtual {p0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->f(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    new-instance v1, Lcom/voxdon/xplorer/activity/VoxExitClick;

    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/VoxExitClick;-><init>(Landroid/app/Activity;)V

    const v2, 0x7f1300a8

    invoke-virtual {p0, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/a$a;->l(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    const v1, 0x7f13008c

    invoke-virtual {p0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->h(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->create()Landroidx/appcompat/app/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/a;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_show

    const v2, 0x7f0800cf

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    :cond_show
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->show()V

    return-void
.end method

.method private n1(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->S:Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/high16 v0, 0x20000

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->S:Landroid/view/ViewGroup;

    .line 12
    .line 13
    const/high16 v0, 0x60000

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private n2(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_23

    .line 10
    .line 11
    instance-of v0, p1, Lax/d3/n;

    .line 12
    .line 13
    if-eqz v0, :cond_14

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Lax/d3/n;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/d3/n;->q4()V

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroidx/fragment/app/t;->j()I

    .line 34
    .line 35
    .line 36
    :cond_23
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

.method private o1(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->R:Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/high16 v0, 0x20000

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->R:Landroid/view/ViewGroup;

    .line 12
    .line 13
    const/high16 v0, 0x60000

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private p()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_16

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/d3/n;->z3()Lax/Q2/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 17
    .line 18
    if-ne v0, v2, :cond_16

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->u0:Z

    .line 21
    .line 22
    xor-int/2addr v1, v0

    .line 23
    :cond_16
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->x0:Lax/i/r;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lax/i/r;->j(Z)V

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

.method private p1(Lax/Q2/f;I)Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method private q1(Lcom/voxdon/xplorer/bookmark/Bookmark;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->t()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->p1(Lax/Q2/f;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method private q2(Lax/Q2/f;I)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->p1(Lax/Q2/f;I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->n2(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$j;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity$j;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Lax/Q2/f;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

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

.method private r2(Lax/d3/n;Ljava/lang/String;)V
    .registers 6

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_31

    .line 6
    :cond_5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->d0()Lax/d3/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eq v0, p1, :cond_31

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v0, :cond_1e

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/d3/n;->O3()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1e

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroidx/fragment/app/t;->p(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 29
    .line 30
    .line 31
    :cond_1e
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_28

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Landroidx/fragment/app/t;->v(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 38
    .line 39
    .line 40
    goto :goto_2e

    .line 41
    :cond_28
    const v0, 0x7f0a021b

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0, p1, p2}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    .line 45
    .line 46
    .line 47
    :goto_2e
    invoke-virtual {v1}, Landroidx/fragment/app/t;->j()I

    .line 48
    .line 49
    .line 50
    :cond_31
    :goto_31
    return-void
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

.method private u2(Lcom/voxdon/xplorer/bookmark/Bookmark;Lax/Z2/f;Lax/d3/n;)V
    .registers 5

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->f(Lcom/voxdon/xplorer/bookmark/Bookmark;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p3}, Lax/d3/n;->C3()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->G(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lax/Z2/l;->a(Lcom/voxdon/xplorer/bookmark/Bookmark;Lax/Z2/f;)I

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->W:Lax/Z2/f;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/voxdon/xplorer/activity/MainActivity;->U:Lax/d3/n;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->v2(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->p()V

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

.method private v2(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_64

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 8
    .line 9
    if-eqz v0, :cond_64

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Lax/Q2/f;->H(Landroid/content/Context;Lax/c3/K;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {p0, v1}, Lax/Q2/f;->G(Landroid/content/Context;Lax/c3/K;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 32
    .line 33
    if-ne v2, v3, :cond_2b

    .line 34
    .line 35
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lax/x3/h;->brand()V

    .line 41
    .line 42
    .line 43
    goto :goto_56

    .line 44
    :cond_2b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lax/Q2/f;->i1:Lax/Q2/f;

    .line 49
    .line 50
    if-ne v2, v3, :cond_51

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->t()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Lax/T2/h;->C0(I)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_43

    .line 61
    .line 62
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lax/x3/h;->q(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_56

    .line 68
    :cond_43
    invoke-static {p1}, Lax/T2/h;->q(I)Lax/c3/K;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 73
    .line 74
    invoke-static {p0, p1}, Lax/Q2/f;->H(Landroid/content/Context;Lax/c3/K;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, Lax/x3/h;->q(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_56

    .line 82
    :cond_51
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lax/x3/h;->q(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_56
    if-eqz v1, :cond_5e

    .line 88
    .line 89
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Lax/x3/h;->o(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_5e
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-virtual {p1, v0}, Lax/x3/h;->o(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_64
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
.end method

.method private y1()Lax/c3/K;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->d0()Lax/d3/n;

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
    return-object v0

    .line 9
    :cond_8
    invoke-virtual {v0}, Lax/d3/n;->A3()Lax/c3/K;

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

.method private z1()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->d0()Lax/d3/n;

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
    return-object v0

    .line 9
    :cond_8
    invoke-virtual {v0}, Lax/d3/n;->C3()Ljava/lang/String;

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


# virtual methods
.method public A1()Landroid/view/View;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

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

.method public A2()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-static {}, Lax/a3/i;->d3()Lax/a3/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "add_sublocation"

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public B1()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->h0:J

    .line 2
    .line 3
    return-wide v0
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

.method public B2()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance v0, Lax/a3/g;

    .line 9
    .line 10
    invoke-direct {v0}, Lax/a3/g;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "add_sublocation"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 20
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
.end method

.method public C1()Lax/V2/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->O:Lax/V2/d;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    new-instance v0, Lax/V2/d;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/V2/d;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->O:Lax/V2/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/V2/d;->o()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->O:Lax/V2/d;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public C2()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-static {}, Lax/a3/i;->e3()Lax/a3/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "add_sublocation"

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public D1()Lax/g3/k;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z0:Lax/g3/k;

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

.method public E1(Ljava/lang/String;)Lax/g3/l;
    .registers 3

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$k;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity$k;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Ljava/lang/String;)V

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
    .line 22
.end method

.method public F2(Z)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "permission_screen"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 22
    .line 23
    .line 24
    :cond_17
    invoke-static {p1}, Lax/d3/e0;->V2(Z)Lax/d3/e0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->r0:Lax/d3/e0;

    .line 29
    .line 30
    const v0, 0x7f0a03ba

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0, p1, v1}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Landroidx/fragment/app/t;->j()I

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

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
.end method

.method public G2(Ljava/lang/String;)V
    .registers 10

    .line 1
    sget-object v0, Lax/Q2/f;->p1:Lax/Q2/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->m(Landroid/content/Context;Lax/Q2/f;I)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v2, p0

    .line 12
    move-object v4, p1

    .line 13
    invoke-virtual/range {v2 .. v7}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

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

.method public H2(Lax/c3/K;Ljava/lang/String;)V
    .registers 5

    .line 1
    sget-object v0, Lax/Q2/f;->p1:Lax/Q2/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->m(Landroid/content/Context;Lax/Q2/f;I)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, p1, v1, v0, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->d2(Lax/c3/K;ZLcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;)V

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

.method public I2()V
    .registers 5

    .line 1
    const-string v0, "progress"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->m0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 4
    .line 5
    if-nez v1, :cond_c

    .line 6
    .line 7
    const-string v0, "rewarded ads null?"

    .line 8
    .line 9
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    :try_start_c
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_22

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v2}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/fragment/app/t;->j()I
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_20} :catch_21

    .line 31
    .line 32
    .line 33
    goto :goto_22

    .line 34
    :catch_21
    nop

    .line 35
    :cond_22
    :goto_22
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->m0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 36
    .line 37
    sget-object v2, Lcom/voxdon/xplorer/activity/MainActivity$K;->c0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    if-ne v1, v2, :cond_36

    .line 41
    .line 42
    sget-object v1, Lcom/voxdon/xplorer/activity/MainActivity$K;->d0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 43
    .line 44
    iput-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->m0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 45
    .line 46
    new-instance v1, Lax/a3/D;

    .line 47
    .line 48
    invoke-direct {v1}, Lax/a3/D;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1, v0, v3}, Lcom/voxdon/xplorer/activity/a;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    goto :goto_5a

    .line 55
    :cond_36
    sget-object v0, Lcom/voxdon/xplorer/activity/MainActivity$K;->g0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 56
    .line 57
    if-ne v1, v0, :cond_3e

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->h2()V

    .line 60
    .line 61
    .line 62
    goto :goto_5a

    .line 63
    :cond_3e
    sget-object v0, Lcom/voxdon/xplorer/activity/MainActivity$K;->h0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 64
    .line 65
    if-ne v1, v0, :cond_4d

    .line 66
    .line 67
    const v0, 0x7f13014c

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 75
    .line 76
    .line 77
    goto :goto_5a

    .line 78
    :cond_4d
    sget-object v0, Lcom/voxdon/xplorer/activity/MainActivity$K;->e0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 79
    .line 80
    if-ne v1, v0, :cond_5a

    .line 81
    .line 82
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->l0:Ljava/lang/Object;

    .line 83
    .line 84
    if-eqz v0, :cond_5a

    .line 85
    .line 86
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->D0:Lax/S2/b$d;

    .line 87
    .line 88
    invoke-static {p0, v0, v1}, Lax/S2/b;->m(Landroid/app/Activity;Ljava/lang/Object;Lax/S2/b$d;)V

    .line 89
    .line 90
    .line 91
    :cond_5a
    :goto_5a
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
.end method

.method public J2(ZLjava/lang/String;)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "ads"

    .line 13
    .line 14
    const-string v2, "rewarded_ads_open"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "from"

    .line 21
    .line 22
    invoke-virtual {v0, v1, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 27
    .line 28
    .line 29
    if-eqz p1, :cond_22

    .line 30
    .line 31
    const p1, 0x7f130395

    .line 32
    .line 33
    .line 34
    goto :goto_25

    .line 35
    :cond_22
    const p1, 0x7f1303a7

    .line 36
    .line 37
    .line 38
    :goto_25
    const v0, 0x7f1303a8

    .line 39
    .line 40
    .line 41
    const/high16 v1, 0x1040000

    .line 42
    .line 43
    const v2, 0x7f1303a6

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v2, v0, v1}, Lax/a3/n;->k3(IIII)Lax/a3/n;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "rewardads"

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$x;

    .line 60
    .line 61
    invoke-direct {v0, p0, p2}, Lcom/voxdon/xplorer/activity/MainActivity$x;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lax/a3/n;->n3(Lax/a3/n$c;)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public K2(Lax/c3/K;ZLjava/lang/String;)V
    .registers 10

    .line 1
    invoke-static {p1}, Lax/T2/h;->B(Lax/c3/K;)Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->n(Landroid/content/Context;Lax/c3/K;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v4, Lcom/voxdon/xplorer/activity/MainActivity$a;

    .line 10
    .line 11
    invoke-direct {v4, p0, p2}, Lcom/voxdon/xplorer/activity/MainActivity$a;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v0, p0

    .line 17
    move-object v2, p3

    .line 18
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 19
    .line 20
    .line 21
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

.method public L0()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->Q2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/n/c;->invalidateOptionsMenu()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->o1(Z)V

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

.method public M2()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_64

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$s;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$s;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 8
    .line 9
    .line 10
    const v1, 0x7f0a04af

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    iput-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

    .line 20
    .line 21
    const v1, 0x7f0a04b4

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 29
    .line 30
    iput-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->K:Landroidx/appcompat/widget/Toolbar;

    .line 31
    .line 32
    const v2, 0x7f080185

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->K:Landroidx/appcompat/widget/Toolbar;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->K:Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    const v2, 0x7f130095

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    const v0, 0x7f0a04b0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Landroid/widget/ListView;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->L:Landroid/widget/ListView;

    .line 66
    .line 67
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$t;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$t;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lax/V2/f;

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->C1()Lax/V2/d;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {v0, p0, v1}, Lax/V2/f;-><init>(Landroid/content/Context;Lax/V2/d;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->M:Lax/V2/f;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->L:Landroid/widget/ListView;

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->L:Landroid/widget/ListView;

    .line 92
    .line 93
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$u;

    .line 94
    .line 95
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$u;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 99
    .line 100
    .line 101
    :cond_64
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->K:Landroidx/appcompat/widget/Toolbar;

    .line 108
    .line 109
    const v2, 0x7f0a04b2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Landroid/widget/TextView;

    .line 117
    .line 118
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->K:Landroidx/appcompat/widget/Toolbar;

    .line 119
    .line 120
    const v3, 0x7f0a04b1

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Landroid/widget/TextView;

    .line 128
    .line 129
    iget-object v3, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 130
    .line 131
    invoke-virtual {v3}, Lax/x3/h;->h()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 139
    .line 140
    invoke-virtual {v0}, Lax/x3/h;->g()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-nez v3, :cond_9c

    .line 149
    .line 150
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    goto :goto_a1

    .line 157
    :cond_9c
    const/16 v0, 0x8

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    :goto_a1
    const v0, 0x7f010033

    .line 163
    .line 164
    .line 165
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->L:Landroid/widget/ListView;

    .line 170
    .line 171
    invoke-virtual {v2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->y1()Lax/c3/K;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->z1()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iget-object v3, p0, Lcom/voxdon/xplorer/activity/MainActivity;->M:Lax/V2/f;

    .line 183
    .line 184
    invoke-virtual {v3, v0, v2}, Lax/V2/f;->d(Lax/c3/K;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->o1(Z)V

    .line 188
    .line 189
    .line 190
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->n1(Z)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

    .line 194
    .line 195
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 196
    .line 197
    .line 198
    return-void
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

.method public P2(Lax/Q2/f;I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/Z2/l;->l(Lax/Q2/f;I)V

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

.method public R1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->o1(Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->n1(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->S:Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->k2()V

    .line 24
    .line 25
    .line 26
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

.method public T1()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/d3/n;->K3()Z

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

.method public U1()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->k0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public V1()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->s0:Z

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

.method public W1()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->O:Lax/V2/d;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

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

.method public X1()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->r0:Lax/d3/e0;

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
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public Y1()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->m0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 2
    .line 3
    sget-object v1, Lcom/voxdon/xplorer/activity/MainActivity$K;->e0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 4
    .line 5
    if-ne v0, v1, :cond_c

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->l0:Ljava/lang/Object;

    .line 8
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

.method public Z1()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->J:Landroid/view/ViewGroup;

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
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    return v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public a(Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lax/d3/Q;

    .line 6
    .line 7
    if-eqz v1, :cond_17

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/d3/n;->C3()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_17

    .line 18
    .line 19
    check-cast v0, Lax/d3/Q;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/d3/E;->j9()V

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void
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
.end method

.method public a0(Lax/Q2/f;ILjava/lang/String;)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->p1(Lax/Q2/f;I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 6
    .line 7
    if-eqz v1, :cond_17

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->q1(Lcom/voxdon/xplorer/bookmark/Bookmark;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_17

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1, p3}, Lcom/voxdon/xplorer/activity/MainActivity;->m2(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->n2(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p3, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 28
    .line 29
    invoke-virtual {p3, p1, p2}, Lax/Z2/l;->h(Lax/Q2/f;I)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public c(Lax/Q2/f;Ljava/lang/String;)V
    .registers 4

    .line 1
    sget-object v0, Lax/Q2/f;->T0:Lax/Q2/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_12

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/voxdon/xplorer/file/D;->a1(Landroid/content/Context;)Lcom/voxdon/xplorer/file/D$c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B0:Lax/g3/k;

    .line 14
    .line 15
    invoke-virtual {p1, p0, p2, v0}, Lcom/voxdon/xplorer/file/D$c;->k(Lcom/voxdon/xplorer/activity/a;Ljava/lang/String;Lax/g3/k;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    sget-object v0, Lax/Q2/f;->U0:Lax/Q2/f;

    .line 20
    .line 21
    if-ne p1, v0, :cond_24

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lcom/voxdon/xplorer/file/H;->U0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/H$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B0:Lax/g3/k;

    .line 32
    .line 33
    invoke-virtual {p1, p0, p2, v0}, Lcom/voxdon/xplorer/file/H$a;->k(Lcom/voxdon/xplorer/activity/a;Ljava/lang/String;Lax/g3/k;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    invoke-static {}, Lax/u3/b;->f()V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
.end method

.method public c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V
    .registers 11

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2b

    .line 4
    .line 5
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p3, "OPEN_BOOKMARK_AFTER_DESTORY"

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string p4, "from:"

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->t()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    sget-object v2, Lax/Q2/f;->Y0:Lax/Q2/f;

    .line 53
    .line 54
    if-ne v0, v2, :cond_3b

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->B2()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    sget-object v2, Lax/Q2/f;->Z0:Lax/Q2/f;

    .line 61
    .line 62
    if-ne v0, v2, :cond_4a

    .line 63
    .line 64
    new-instance p1, Landroid/content/Intent;

    .line 65
    .line 66
    const-class p2, Lcom/voxdon/xplorer/activity/PaymentActivity;

    .line 67
    .line 68
    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4a
    sget-object v2, Lax/Q2/f;->X0:Lax/Q2/f;

    .line 76
    .line 77
    if-ne v0, v2, :cond_5f

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p2, p1}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/4 p2, 0x0

    .line 92
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->e2(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_5f
    sget-object v2, Lax/Q2/f;->a1:Lax/Q2/f;

    .line 97
    .line 98
    if-ne v0, v2, :cond_70

    .line 99
    .line 100
    new-instance p1, Landroid/content/Intent;

    .line 101
    .line 102
    const-class p2, Lcom/voxdon/xplorer/activity/DevSettingsActivity;

    .line 103
    .line 104
    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    const/16 p2, 0x2714

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_70
    new-instance v2, Landroid/os/Bundle;

    .line 114
    .line 115
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 116
    .line 117
    .line 118
    if-eqz p3, :cond_86

    .line 119
    .line 120
    invoke-virtual {p3}, Lax/Z2/f;->c()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_86

    .line 125
    .line 126
    const-string v3, "parent_location"

    .line 127
    .line 128
    invoke-virtual {p3}, Lax/Z2/f;->a()Lax/Q2/f;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 133
    .line 134
    .line 135
    :cond_86
    if-eqz p3, :cond_8f

    .line 136
    .line 137
    iget-object v3, p3, Lax/Z2/f;->d0:Landroid/os/Bundle;

    .line 138
    .line 139
    if-eqz v3, :cond_8f

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    invoke-direct {p0, v0, v1, v2, p3}, Lcom/voxdon/xplorer/activity/MainActivity;->N2(Lax/Q2/f;ILandroid/os/Bundle;Lax/Z2/f;)Lax/d3/n;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    if-eqz p2, :cond_ce

    .line 149
    .line 150
    sget-object v2, Lcom/voxdon/xplorer/activity/MainActivity;->E0:Ljava/util/logging/Logger;

    .line 151
    .line 152
    new-instance v3, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v4, "Open location : "

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const-string v3, "navigation"

    .line 181
    .line 182
    const-string v4, "open_location"

    .line 183
    .line 184
    invoke-virtual {v2, v3, v4}, Lax/Q2/a;->n(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const-string v3, "loc"

    .line 189
    .line 190
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v2, v3, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v2, "from"

    .line 199
    .line 200
    invoke-virtual {v0, v2, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p2}, Lax/Q2/a$b;->e()V

    .line 205
    .line 206
    .line 207
    :cond_ce
    if-eqz v1, :cond_170

    .line 208
    .line 209
    if-eqz p4, :cond_d5

    .line 210
    .line 211
    invoke-interface {p4, v1}, Lcom/voxdon/xplorer/activity/MainActivity$H;->a(Lax/d3/n;)V

    .line 212
    .line 213
    .line 214
    :cond_d5
    if-eqz p5, :cond_df

    .line 215
    .line 216
    new-instance p2, Lcom/voxdon/xplorer/activity/MainActivity$n;

    .line 217
    .line 218
    invoke-direct {p2, p0, p5, v1}, Lcom/voxdon/xplorer/activity/MainActivity$n;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Lcom/voxdon/xplorer/activity/MainActivity$G;Lax/d3/n;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->y2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/Runnable;)V

    .line 222
    .line 223
    .line 224
    :cond_df
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    if-nez p2, :cond_13b

    .line 229
    .line 230
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-virtual {p2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    if-eqz p2, :cond_13b

    .line 239
    .line 240
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    sget-object p4, Lax/Q2/f;->V0:Lax/Q2/f;

    .line 245
    .line 246
    if-eq p2, p4, :cond_130

    .line 247
    .line 248
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    const-string p4, "!!INVLIAD OPEN PATH!!"

    .line 257
    .line 258
    invoke-virtual {p2, p4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-virtual {p2}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    new-instance p4, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 272
    .line 273
    .line 274
    move-result-object p5

    .line 275
    invoke-virtual {p5}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p5

    .line 279
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string p5, ","

    .line 283
    .line 284
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->z()I

    .line 288
    .line 289
    .line 290
    move-result p5

    .line 291
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p4

    .line 298
    invoke-virtual {p2, p4}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 303
    .line 304
    .line 305
    :cond_130
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    invoke-virtual {p2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->G(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_13b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->A()Z

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    if-nez p2, :cond_160

    .line 321
    .line 322
    invoke-static {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->f(Lcom/voxdon/xplorer/bookmark/Bookmark;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p4

    .line 330
    invoke-static {p4}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p4

    .line 334
    invoke-virtual {p2, p4}, Lcom/voxdon/xplorer/bookmark/Bookmark;->G(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    new-instance p4, Lcom/voxdon/xplorer/activity/MainActivity$o;

    .line 338
    .line 339
    invoke-direct {p4, p0, v1, p1}, Lcom/voxdon/xplorer/activity/MainActivity$o;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Lax/d3/n;Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, p2, p4}, Lcom/voxdon/xplorer/activity/MainActivity;->x2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/Runnable;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p2

    .line 349
    invoke-virtual {v1, p2}, Lax/d3/n;->Z3(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    goto :goto_167

    .line 353
    :cond_160
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-virtual {v1, p2}, Lax/d3/n;->Z3(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :goto_167
    invoke-virtual {v1, p3}, Lax/d3/n;->n4(Lax/Z2/f;)V

    .line 361
    .line 362
    .line 363
    invoke-direct {p0, p1, p3, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->u2(Lcom/voxdon/xplorer/bookmark/Bookmark;Lax/Z2/f;Lax/d3/n;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->M0()V

    .line 367
    .line 368
    .line 369
    :cond_170
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->Q2()V

    .line 370
    .line 371
    .line 372
    return-void
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
.end method

.method public d0()Lax/d3/n;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->U:Lax/d3/n;

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

.method public d2(Lax/c3/K;ZLcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;)V
    .registers 15

    .line 1
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    sget-object v3, Lax/Q2/f;->i1:Lax/Q2/f;

    .line 6
    .line 7
    if-ne v2, v3, :cond_1a

    .line 8
    .line 9
    new-instance v7, Lax/Z2/f;

    .line 10
    .line 11
    invoke-direct {v7, p1, p2}, Lax/Z2/f;-><init>(Lax/c3/K;Z)V

    .line 12
    .line 13
    .line 14
    new-instance v8, Lcom/voxdon/xplorer/activity/MainActivity$m;

    .line 15
    .line 16
    invoke-direct {v8, p0}, Lcom/voxdon/xplorer/activity/MainActivity$m;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 17
    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    move-object v4, p0

    .line 21
    move-object v5, p3

    .line 22
    move-object v6, p4

    .line 23
    invoke-virtual/range {v4 .. v9}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    new-instance v3, Lax/Z2/f;

    .line 28
    .line 29
    invoke-direct {v3, p1, p2}, Lax/Z2/f;-><init>(Lax/c3/K;Z)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p3

    .line 36
    move-object v2, p4

    .line 37
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

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

.method public e0()Lax/x3/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

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

.method public e2(Ljava/lang/String;Ljava/lang/Runnable;)V
    .registers 13

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lax/Q2/f;->X0:Lax/Q2/f;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lax/Z2/k;->g(Landroid/net/Uri;Lax/Q2/f;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_105

    .line 13
    .line 14
    invoke-static {p1}, Lax/Z2/k;->a(Landroid/net/Uri;)Lax/Z2/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lax/Z2/k;->d()Lax/c3/K;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_29

    .line 31
    .line 32
    invoke-virtual {v0}, Lax/Z2/k;->d()Lax/c3/K;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->P0(Lax/c3/K;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v4, v1

    .line 41
    goto :goto_36

    .line 42
    :cond_29
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/voxdon/xplorer/file/b;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->O0()Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    move-object v9, v4

    .line 53
    move-object v4, v0

    .line 54
    move-object v0, v9

    .line 55
    :goto_36
    if-nez v0, :cond_3a

    .line 56
    .line 57
    goto/16 :goto_107

    .line 58
    .line 59
    :cond_3a
    const/4 v5, 0x1

    .line 60
    :try_start_3b
    new-instance v6, Landroid/content/Intent;

    .line 61
    .line 62
    const-string v7, "android.intent.action.VIEW"

    .line 63
    .line 64
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v7, Landroid/content/ComponentName;

    .line 68
    .line 69
    const-class v8, Lcom/voxdon/xplorer/activity/ArchiveActivity;

    .line 70
    .line 71
    invoke-direct {v7, p0, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    const-string v7, "data_uri"

    .line 78
    .line 79
    invoke-virtual {v6, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    const-string v7, "open_uri"

    .line 83
    .line 84
    invoke-virtual {v6, v7, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    if-eqz v3, :cond_63

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 90
    .line 91
    .line 92
    const-string p1, "open_uri_release"

    .line 93
    .line 94
    invoke-virtual {v6, p1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    goto :goto_63

    .line 98
    :catch_61
    nop

    .line 99
    goto :goto_66

    .line 100
    :cond_63
    :goto_63
    invoke-virtual {p0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_66
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3b .. :try_end_66} :catch_61

    .line 101
    .line 102
    .line 103
    :goto_66
    if-eqz v4, :cond_a3

    .line 104
    .line 105
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/b;->N0()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-ne p1, v5, :cond_a3

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/b;->V0()Lcom/voxdon/xplorer/file/y;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_a3

    .line 116
    .line 117
    sget-object p1, Lcom/voxdon/xplorer/activity/MainActivity;->E0:Ljava/util/logging/Logger;

    .line 118
    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v3, "Open local file archive viewer : "

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/b;->V0()Lcom/voxdon/xplorer/file/y;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {p0, v0}, Lax/Z2/a;->p(Landroid/content/Context;Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_a1

    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->S()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    goto :goto_105

    .line 162
    :cond_a1
    move-object p1, v1

    .line 163
    goto :goto_105

    .line 164
    :cond_a3
    invoke-static {v0}, Lax/c3/u;->P(Landroid/net/Uri;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_c8

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p0, p1}, Lax/Z2/a;->p(Landroid/content/Context;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_a1

    .line 183
    .line 184
    invoke-static {p1}, Lax/c3/x;->g(Ljava/lang/String;)Lcom/voxdon/xplorer/file/o;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0, p1}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    goto :goto_105

    .line 201
    :cond_c8
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->B(Landroid/net/Uri;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_d4

    .line 206
    .line 207
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->A(Landroid/net/Uri;)Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-eqz p1, :cond_a1

    .line 212
    .line 213
    :cond_d4
    sget-object p1, Lcom/voxdon/xplorer/activity/MainActivity;->E0:Ljava/util/logging/Logger;

    .line 214
    .line 215
    new-instance v2, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const-string v3, "Open document file archive viewer : "

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {p1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->e(Landroid/net/Uri;)Lax/Z2/k;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-nez p1, :cond_f1

    .line 240
    .line 241
    goto :goto_107

    .line 242
    :cond_f1
    invoke-virtual {p1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {p1}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-static {v0, p1}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    :cond_105
    :goto_105
    if-nez p1, :cond_108

    .line 263
    .line 264
    :goto_107
    return-void

    .line 265
    :cond_108
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->c(Landroid/content/Context;Landroid/net/Uri;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    if-eqz v3, :cond_11f

    .line 270
    .line 271
    if-eqz p2, :cond_115

    .line 272
    .line 273
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$p;

    .line 274
    .line 275
    invoke-direct {v1, p0, p2}, Lcom/voxdon/xplorer/activity/MainActivity$p;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;Ljava/lang/Runnable;)V

    .line 276
    .line 277
    .line 278
    :cond_115
    move-object v7, v1

    .line 279
    const/4 v5, 0x0

    .line 280
    const/4 v6, 0x0

    .line 281
    const-string v4, "location_uri"

    .line 282
    .line 283
    move-object v2, p0

    .line 284
    invoke-virtual/range {v2 .. v7}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_11f
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 289
    .line 290
    new-instance v0, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v1, "Illegal location uri : "

    .line 296
    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw p2
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

.method public f2(Lax/c3/K;Landroid/os/Bundle;)V
    .registers 11

    .line 1
    sget-object v0, Lax/Q2/f;->s1:Lax/Q2/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/c3/K;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p0, v0, v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->m(Landroid/content/Context;Lax/Q2/f;I)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v5, Lax/Z2/f;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v5, p1, v0, p2}, Lax/Z2/f;-><init>(Lax/c3/K;ZLandroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const-string v4, "search"

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    invoke-virtual/range {v2 .. v7}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

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

.method public g(Lax/c3/K;)V
    .registers 9

    .line 1
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 6
    .line 7
    if-ne v0, v1, :cond_2c

    .line 8
    .line 9
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/Z2/j;->t0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2c

    .line 18
    .line 19
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lax/Z2/j;->v0()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_20

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/a;->N(Lax/c3/K;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    const p1, 0x7f1303f9

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->n(Landroid/content/Context;Lax/c3/K;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v5, Lcom/voxdon/xplorer/activity/MainActivity$r;

    .line 54
    .line 55
    invoke-direct {v5, p0}, Lcom/voxdon/xplorer/activity/MainActivity$r;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 56
    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const-string v3, "home"

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    move-object v1, p0

    .line 63
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

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

.method public g2(Lax/Z2/s;Lax/c3/K;Ljava/lang/String;)V
    .registers 10

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->o(Lax/Z2/s;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-eqz p2, :cond_b

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p2, p1, v1, p3}, Lcom/voxdon/xplorer/activity/MainActivity;->d2(Lax/c3/K;ZLcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v2, p3

    .line 17
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

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

.method public h0()Lax/x3/A;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->I:Lax/x3/A;

    .line 2
    .line 3
    if-nez v0, :cond_26

    .line 4
    .line 5
    new-instance v0, Lax/x3/A;

    .line 6
    .line 7
    const v1, 0x7f0a0373

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x7f0a0374

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v0, p0, v1, v2}, Lax/x3/A;-><init>(Lax/n/c;Landroid/view/View;Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->I:Lax/x3/A;

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/x3/A;->D()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->I:Lax/x3/A;

    .line 30
    .line 31
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$q;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$q;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lax/x3/d;->v(Lax/x3/d$h;)V

    .line 37
    .line 38
    .line 39
    :cond_26
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->I:Lax/x3/A;

    .line 40
    .line 41
    return-object v0
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

.method public h1(Lcom/voxdon/xplorer/activity/MainActivity$J;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->X:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

.method public h2()V
    .registers 3

    .line 1
    invoke-static {p0}, Lax/t3/a;->f(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/content/Intent;

    .line 5
    .line 6
    const-string v1, "local.intent.action.LICENSE_STATUS_CHANGED"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Lax/u3/g;->e(Landroid/content/Intent;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/voxdon/xplorer/activity/MainActivity$K;->q:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->m0:Lcom/voxdon/xplorer/activity/MainActivity$K;

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->l1()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public i2(Lax/Q2/f;I)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->j2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/activity/MainActivity;->P2(Lax/Q2/f;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->v2(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

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

.method public isContentClipToPadding(Z)Z
    .registers 2

    .line 1
    invoke-static {}, Lax/t3/a;->i()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_23

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->m0()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_23

    .line 12
    .line 13
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->I:Lax/x3/A;

    .line 14
    .line 15
    if-eqz p1, :cond_16

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/x3/d;->m()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_23

    .line 22
    .line 23
    :cond_16
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->H:Landroid/view/View;

    .line 24
    .line 25
    if-eqz p1, :cond_21

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_21

    .line 32
    .line 33
    goto :goto_23

    .line 34
    :cond_21
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_23
    :goto_23
    const/4 p1, 0x1

    .line 37
    return p1
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

.method public j1()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-static {v0, p0}, Lax/S2/b;->a(Ljava/lang/Object;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

    .line 10
    .line 11
    :cond_a
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

.method public j2()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->s2()V

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

.method public m2(ZLjava/lang/String;)V
    .registers 12

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->d(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->W:Lax/Z2/f;

    .line 21
    .line 22
    if-eqz v0, :cond_2b

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->q1(Lcom/voxdon/xplorer/bookmark/Bookmark;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/activity/MainActivity;->n2(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->t()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {v2, v3, v4}, Lax/Z2/l;->h(Lax/Q2/f;I)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    sget-object v2, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 45
    .line 46
    invoke-static {p0, v2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->l(Landroid/content/Context;Lax/Q2/f;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    move-object v3, p0

    .line 54
    move-object v5, p2

    .line 55
    invoke-virtual/range {v3 .. v8}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 56
    .line 57
    .line 58
    if-eqz v0, :cond_40

    .line 59
    .line 60
    if-eqz p1, :cond_40

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->E2(Lcom/voxdon/xplorer/bookmark/Bookmark;Lax/Z2/f;)V

    .line 63
    .line 64
    .line 65
    :cond_40
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

.method public o2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->r0:Lax/d3/e0;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->r0:Lax/d3/e0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/t;->j()I

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->r0:Lax/d3/e0;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
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

.method protected onActivityResult(IILandroid/content/Intent;)V
    .registers 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/voxdon/xplorer/activity/a;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p1, v0, :cond_29

    .line 6
    .line 7
    const/16 v0, 0x2714

    .line 8
    .line 9
    if-eq p1, v0, :cond_1b

    .line 10
    .line 11
    const/16 v0, 0x2716

    .line 12
    .line 13
    if-eq p1, v0, :cond_f

    .line 14
    .line 15
    goto :goto_49

    .line 16
    :cond_f
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/voxdon/xplorer/file/I;->r0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/I$d;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, p2, p3}, Lcom/voxdon/xplorer/file/I$d;->t(ILandroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    invoke-static {}, Lax/t3/k;->k()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Y:I

    .line 33
    .line 34
    if-eq p2, p1, :cond_49

    .line 35
    .line 36
    iput p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Y:I

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->Q2()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    const/4 p1, -0x1

    .line 43
    if-ne p2, p1, :cond_49

    .line 44
    .line 45
    if-eqz p3, :cond_49

    .line 46
    .line 47
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_49

    .line 52
    .line 53
    const-string p1, "authAccount"

    .line 54
    .line 55
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_49

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p2}, Lcom/voxdon/xplorer/file/r;->A0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/r$c;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iget-object p3, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B0:Lax/g3/k;

    .line 70
    .line 71
    invoke-virtual {p2, p1, p3}, Lcom/voxdon/xplorer/file/r$c;->k(Ljava/lang/String;Lax/g3/k;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    :goto_49
    return-void
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

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_b

    .line 3
    .line 4
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->C:Landroid/widget/FrameLayout;

    .line 5
    .line 6
    iget p1, p1, Lax/T/b;->d:I

    .line 7
    .line 8
    invoke-virtual {p2, v0, v0, v0, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->C:Landroid/widget/FrameLayout;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public onAttachFragment(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onAttachFragment(Landroidx/fragment/app/Fragment;)V

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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/b;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lax/u3/z;->c(Lax/n/c;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/a;->J()V

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
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 8

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/b;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0d0020

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lax/n/c;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lax/X2/Q;->N1()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1e

    .line 15
    .line 16
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1e

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/high16 v1, -0x1000000

    .line 27
    .line 28
    invoke-static {v0, v1}, Lax/X2/v;->r(Landroid/view/Window;I)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->v0()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_5b

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->v0()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_3c
    :goto_3c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_58

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 72
    .line 73
    instance-of v3, v2, Lax/d3/n;

    .line 74
    .line 75
    if-eqz v3, :cond_50

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroidx/fragment/app/t;->p(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 78
    .line 79
    .line 80
    goto :goto_3c

    .line 81
    :cond_50
    instance-of v3, v2, Lax/d3/e0;

    .line 82
    .line 83
    if-eqz v3, :cond_3c

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 86
    .line 87
    .line 88
    goto :goto_3c

    .line 89
    :cond_58
    invoke-virtual {v0}, Landroidx/fragment/app/t;->j()I

    .line 90
    .line 91
    .line 92
    :cond_5b
    const v0, 0x7f0a0170

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 100
    .line 101
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$b;

    .line 108
    .line 109
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$b;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 119
    .line 120
    .line 121
    const v0, 0x7f0a004a

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 129
    .line 130
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->F:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 131
    .line 132
    const v0, 0x7f0a0048

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 140
    .line 141
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->G:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 142
    .line 143
    const v0, 0x7f0a04a6

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Landroid/view/ViewGroup;

    .line 151
    .line 152
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->R:Landroid/view/ViewGroup;

    .line 153
    .line 154
    const v0, 0x7f0a021b

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Landroid/view/ViewGroup;

    .line 162
    .line 163
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->S:Landroid/view/ViewGroup;

    .line 164
    .line 165
    const v0, 0x7f0a0470

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A:Landroid/view/View;

    .line 173
    .line 174
    const v0, 0x7f0a046f

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    .line 182
    .line 183
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B:Lcom/google/android/material/tabs/TabLayout;

    .line 184
    .line 185
    const v0, 0x7f0a046e

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Landroid/widget/FrameLayout;

    .line 193
    .line 194
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->C:Landroid/widget/FrameLayout;

    .line 195
    .line 196
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B:Lcom/google/android/material/tabs/TabLayout;

    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->s()V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->B:Lcom/google/android/material/tabs/TabLayout;

    .line 202
    .line 203
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$l;

    .line 204
    .line 205
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$l;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->h(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Lax/x3/h;

    .line 212
    .line 213
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->R:Landroid/view/ViewGroup;

    .line 214
    .line 215
    invoke-direct {v0, p0, v1}, Lax/x3/h;-><init>(Lax/n/c;Landroid/view/ViewGroup;)V

    .line 216
    .line 217
    .line 218
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 219
    .line 220
    new-instance v1, Lcom/voxdon/xplorer/activity/MainActivity$A;

    .line 221
    .line 222
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$A;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lax/x3/h;->s(Landroid/view/View$OnClickListener;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->k0()V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Lax/t3/k;->k()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    iput v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Y:I

    .line 236
    .line 237
    new-instance v0, Lax/Z2/l;

    .line 238
    .line 239
    invoke-direct {v0, p0}, Lax/Z2/l;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 243
    .line 244
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->S1()V

    .line 245
    .line 246
    .line 247
    if-nez p1, :cond_116

    .line 248
    .line 249
    sget-object p1, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 250
    .line 251
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->l(Landroid/content/Context;Lax/Q2/f;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    const/4 v4, 0x0

    .line 256
    const/4 v5, 0x0

    .line 257
    const-string v2, "on_create"

    .line 258
    .line 259
    const/4 v3, 0x0

    .line 260
    move-object v0, p0

    .line 261
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->g0()Z

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->J1(Landroid/content/Intent;)V

    .line 276
    .line 277
    .line 278
    goto :goto_11a

    .line 279
    :cond_116
    move-object v0, p0

    .line 280
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->Q2()V

    .line 281
    .line 282
    .line 283
    :goto_11a
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    iget-object v1, v0, Lcom/voxdon/xplorer/activity/MainActivity;->x0:Lax/i/r;

    .line 288
    .line 289
    invoke-virtual {p1, p0, v1}, Landroidx/activity/OnBackPressedDispatcher;->h(Lax/G0/h;Lax/i/r;)V

    .line 290
    .line 291
    .line 292
    new-instance p1, Lcom/voxdon/xplorer/activity/MainActivity$I;

    .line 293
    .line 294
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$I;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 295
    .line 296
    .line 297
    const/4 v1, 0x0

    .line 298
    new-array v1, v1, [Ljava/lang/Long;

    .line 299
    .line 300
    invoke-virtual {p1, v1}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 301
    .line 302
    .line 303
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->l2()V

    .line 304
    .line 305
    .line 306
    return-void
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

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .registers 2

    const/4 p1, 0x1

    return p1
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .registers 4

    .line 1
    if-nez p1, :cond_c

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/x3/h;->f()Landroid/view/Menu;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eq p2, v0, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_c
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method protected onDestroy()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->Z:Z

    .line 3
    .line 4
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/b;->onDestroy()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->j1()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->O2()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->l1()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->i1()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->s1()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_20

    .line 24
    .line 25
    invoke-static {v0, p0}, Lax/S2/b;->a(Ljava/lang/Object;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->F:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 31
    .line 32
    .line 33
    :cond_20
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1, p2}, Lax/d3/n;->Y3(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    invoke-super {p0, p1, p2}, Lax/n/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
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

.method public onKeyLongPress(ILandroid/view/KeyEvent;)Z
    .registers 4

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p1, v0, :cond_10

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    const-string p1, "long_back"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->q0(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_10
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyLongPress(ILandroid/view/KeyEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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

.method protected onNewIntent(Landroid/content/Intent;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lax/u3/z;->c(Lax/n/c;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->J1(Landroid/content/Intent;)V

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
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 5

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sparse-switch v0, :sswitch_data_50

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :sswitch_d
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "menu_desktop"

    .line 19
    .line 20
    const-string v2, "general_settings"

    .line 21
    .line 22
    invoke-virtual {p1, v0, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 27
    .line 28
    .line 29
    new-instance p1, Landroid/content/Intent;

    .line 30
    .line 31
    const-class v0, Lcom/voxdon/xplorer/activity/SettingsActivity;

    .line 32
    .line 33
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 37
    .line 38
    .line 39
    :sswitch_26
    return v1

    .line 40
    :sswitch_27
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "menu_folder"

    .line 45
    .line 46
    const-string v2, "refresh"

    .line 47
    .line 48
    invoke-virtual {p1, v0, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v2, "loc"

    .line 63
    .line 64
    invoke-virtual {p1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_4f

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Lax/d3/n;->c4(Z)V

    .line 78
    .line 79
    .line 80
    :cond_4f
    :sswitch_4f
    return v1

    .line 81
    :sswitch_data_50
    .sparse-switch
        0x102002c -> :sswitch_4f
        0x7f0a02e2 -> :sswitch_27
        0x7f0a02ea -> :sswitch_26
        0x7f0a02f0 -> :sswitch_d
    .end sparse-switch
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

.method protected onPause()V
    .registers 2

    .line 1
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/a;->onPause()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-static {v0, p0}, Lax/S2/b;->c(Ljava/lang/Object;Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    :cond_a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->s1()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_13

    .line 16
    .line 17
    invoke-static {v0, p0}, Lax/S2/b;->c(Ljava/lang/Object;Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/a;->onPostCreate(Landroid/os/Bundle;)V

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

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .registers 9

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/a;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "CURRENT_BOOKMARK"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 13
    .line 14
    const-string v0, "CURRENT_EXTRAINFO"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lax/Z2/f;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->W:Lax/Z2/f;

    .line 23
    .line 24
    const-string v0, "OPEN_BOOKMARK"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    const-string v1, "OPEN_EXTRAINFOS"

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    if-eqz v0, :cond_2e

    .line 41
    .line 42
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lax/Z2/l;->i(Ljava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    if-eqz p1, :cond_35

    .line 48
    .line 49
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lax/Z2/l;->j(Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    :cond_35
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 55
    .line 56
    if-eqz v2, :cond_43

    .line 57
    .line 58
    iget-object v4, p0, Lcom/voxdon/xplorer/activity/MainActivity;->W:Lax/Z2/f;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const-string v3, "on_restore_instance"

    .line 63
    .line 64
    move-object v1, p0

    .line 65
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 66
    .line 67
    .line 68
    :cond_43
    return-void
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

.method protected onResume()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/f;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/voxdon/xplorer/file/k;->s0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/k$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/k$a;->p(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->j2()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->v(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

    .line 22
    .line 23
    if-eqz v0, :cond_1b

    .line 24
    .line 25
    invoke-static {v0, p0}, Lax/S2/b;->l(Ljava/lang/Object;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->s1()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_24

    .line 33
    .line 34
    invoke-static {v0, p0}, Lax/S2/b;->l(Ljava/lang/Object;Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    return-void
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

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 5

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/a;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "CURRENT_BOOKMARK"

    .line 5
    .line 6
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "CURRENT_EXTRAINFO"

    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->W:Lax/Z2/f;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "OPEN_BOOKMARK"

    .line 19
    .line 20
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 21
    .line 22
    invoke-virtual {v1}, Lax/Z2/l;->e()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "OPEN_EXTRAINFOS"

    .line 30
    .line 31
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 32
    .line 33
    invoke-virtual {v1}, Lax/Z2/l;->g()Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    :try_end_27
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_27} :catch_28

    .line 38
    .line 39
    .line 40
    goto :goto_3a

    .line 41
    :catch_28
    move-exception v0

    .line 42
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "MainActivity onSaveInstanceState Error"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 57
    .line 58
    .line 59
    :goto_3a
    :try_start_3a
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity;->k1(Landroid/os/Bundle;)V
    :try_end_3d
    .catch Ljava/lang/Exception; {:try_start_3a .. :try_end_3d} :catch_3d

    .line 60
    .line 61
    .line 62
    :catch_3d
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method protected onStart()V
    .registers 1

    .line 1
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/b;->onStart()V

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

.method protected onStop()V
    .registers 2

    .line 1
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/b;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->C1()Lax/V2/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lax/V2/d;->u()V

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

.method public p0()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->a2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->e0()Lax/x3/h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lax/x3/h;->b()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->o1(Z)V

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

.method public p2(Lcom/voxdon/xplorer/activity/MainActivity$J;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->X:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

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

.method public q0(Ljava/lang/String;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->z:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->d(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    sget-object v0, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->l(Landroid/content/Context;Lax/Q2/f;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v0, "/moveToHome"

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->G(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    move-object v1, p0

    .line 33
    move-object v3, p1

    .line 34
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public r0(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->p0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    invoke-static {p0}, Lax/V2/a;->b(Landroid/content/Context;)Lax/V2/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Lax/V2/a;->a(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->A()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1e

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->C1()Lax/V2/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Lax/V2/d;->a(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

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
.end method

.method public r1()Landroidx/coordinatorlayout/widget/CoordinatorLayout;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->F:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

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

.method s1()Landroid/view/View;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->F:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public s2()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->X:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_7
    if-ge v2, v1, :cond_15

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Lcom/voxdon/xplorer/activity/MainActivity$J;

    .line 17
    .line 18
    invoke-interface {v3}, Lcom/voxdon/xplorer/activity/MainActivity$J;->C()V

    .line 19
    .line 20
    .line 21
    goto :goto_7

    .line 22
    :cond_15
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
.end method

.method public t0(Lax/Q2/f;ILjava/lang/String;Z)V
    .registers 5

    .line 1
    iget-object p4, p0, Lcom/voxdon/xplorer/activity/MainActivity;->d0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    if-eqz p4, :cond_28

    .line 4
    .line 5
    invoke-virtual {p4}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    if-ne p4, p1, :cond_28

    .line 10
    .line 11
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->d0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->t()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ne p1, p2, :cond_28

    .line 18
    .line 19
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->d0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_28

    .line 30
    .line 31
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->c0:Ljava/lang/Runnable;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->c0:Ljava/lang/Runnable;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->d0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 40
    .line 41
    :cond_28
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

.method public t1()J
    .registers 6

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->i0:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-nez v4, :cond_e

    .line 8
    .line 9
    invoke-static {}, Lax/t3/a;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->i0:J

    .line 14
    .line 15
    :cond_e
    iget-wide v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->i0:J

    .line 16
    .line 17
    return-wide v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public t2(Lax/S2/b$b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->g0:Lax/S2/b$b;

    .line 5
    .line 6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_6b

    .line 7
    sget-object v0, Lax/S2/b$b;->c0:Lax/S2/b$b;

    .line 8
    .line 9
    if-ne p1, v0, :cond_6a

    .line 10
    .line 11
    invoke-static {p0}, Lax/t3/a;->h(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1f

    .line 16
    .line 17
    invoke-static {}, Lax/S2/a;->b()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1f

    .line 22
    .line 23
    invoke-static {p0}, Lax/u3/z;->u(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1f

    .line 28
    .line 29
    invoke-static {p0}, Lax/S2/a;->a(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    invoke-static {p0}, Lax/t3/a;->k(Landroid/content/Context;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_6a

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->U1()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_6a

    .line 43
    .line 44
    invoke-static {p0}, Lax/u3/z;->u(Landroid/content/Context;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_6a

    .line 49
    .line 50
    invoke-static {}, Lax/t3/a;->e()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_40

    .line 55
    .line 56
    new-instance p1, Lcom/voxdon/xplorer/activity/MainActivity$v;

    .line 57
    .line 58
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/activity/MainActivity$v;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1}, Lax/S2/b;->g(Landroid/app/Activity;Lax/S2/b$c;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_40
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lax/t3/c;->l()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/a;->s()Lax/n/c;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lax/a3/B;->l(Landroid/app/Activity;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5d

    .line 82
    .line 83
    invoke-static {p1}, Lax/a3/w;->n3(I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_5d

    .line 88
    .line 89
    invoke-static {p0}, Lax/a3/w;->m3(Landroid/content/Context;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    goto :goto_5f

    .line 94
    :cond_5d
    const/16 p1, 0x12c

    .line 95
    .line 96
    :goto_5f
    new-instance v0, Lcom/voxdon/xplorer/activity/MainActivity$w;

    .line 97
    .line 98
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/MainActivity$w;-><init>(Lcom/voxdon/xplorer/activity/MainActivity;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, p1, v0}, Lax/S2/b;->h(Landroid/app/Activity;ILax/S2/b$a;)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->j0:Landroid/view/View;

    .line 106
    .line 107
    :cond_6a
    return-void

    .line 108
    :catchall_6b
    move-exception p1

    .line 109
    :try_start_6c
    monitor-exit v0
    :try_end_6d
    .catchall {:try_start_6c .. :try_end_6d} :catchall_6b

    .line 110
    throw p1
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

.method public u1()Lax/S2/b$b;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->g0:Lax/S2/b$b;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_7
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    .line 10
    throw v1
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

.method public v1()Lax/g3/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->C0:Lax/g3/b;

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

.method public w0(Lax/Q2/f;ILjava/lang/String;Z)V
    .registers 7

    .line 1
    if-eqz p4, :cond_22

    .line 2
    .line 3
    iget-object p4, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 4
    .line 5
    invoke-virtual {p4, p1, p2}, Lax/Z2/l;->c(Lax/Q2/f;I)I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    if-ltz p4, :cond_22

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lax/Z2/l;->k(Lax/Q2/f;ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->C1()Lax/V2/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->N:Lax/Z2/l;

    .line 21
    .line 22
    invoke-virtual {v1, p4}, Lax/Z2/l;->d(I)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-virtual {v0, p4}, Lax/V2/d;->c(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->M0()V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->k2()V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object p4, p0, Lcom/voxdon/xplorer/activity/MainActivity;->b0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 36
    .line 37
    if-eqz p4, :cond_4a

    .line 38
    .line 39
    invoke-virtual {p4}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    if-ne p4, p1, :cond_4a

    .line 44
    .line 45
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->b0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->t()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-ne p1, p2, :cond_4a

    .line 52
    .line 53
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->b0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_4a

    .line 64
    .line 65
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->a0:Ljava/lang/Runnable;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->a0:Ljava/lang/Runnable;

    .line 72
    .line 73
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->b0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 74
    .line 75
    :cond_4a
    return-void
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

.method public w1()Lax/a3/h$c;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->A0:Lax/a3/h$c;

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

.method public w2(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->h0:J

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

.method public x0()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/MainActivity;->Q2()V

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

.method public x1()Lax/d3/n;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->V:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->q1(Lcom/voxdon/xplorer/bookmark/Bookmark;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lax/d3/n;

    .line 20
    .line 21
    return-object v0
.end method

.method x2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/Runnable;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->d0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->c0:Ljava/lang/Runnable;

    .line 4
    .line 5
    return-void
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

.method y2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/Runnable;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->b0:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity;->a0:Ljava/lang/Runnable;

    .line 4
    .line 5
    return-void
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

.method public z2(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 8
    .line 9
    if-eqz v0, :cond_1b

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lax/x3/h;->q(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p2, :cond_15

    .line 15
    .line 16
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lax/x3/h;->o(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity;->T:Lax/x3/h;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p1, p2}, Lax/x3/h;->o(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
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
.end method
