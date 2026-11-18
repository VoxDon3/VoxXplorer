.class public abstract Lax/d3/E;
.super Lax/d3/H;
.source "SourceFile"

# interfaces
.implements Lcom/voxdon/xplorer/file/c$a;
.implements Lax/g3/f;
.implements Lax/a3/Q$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d3/E$q0;,
        Lax/d3/E$k0;,
        Lax/d3/E$m0;,
        Lax/d3/E$n0;,
        Lax/d3/E$r0;,
        Lax/d3/E$s0;,
        Lax/d3/E$o0;,
        Lax/d3/E$l0;,
        Lax/d3/E$p0;
    }
.end annotation


# static fields
.field private static final r2:Ljava/util/logging/Logger;


# instance fields
.field private A1:Landroid/graphics/drawable/Drawable;

.field private B1:Landroid/graphics/drawable/Drawable;

.field private C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field protected C1:Landroid/view/View$OnClickListener;

.field private D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field private D1:Z

.field private E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field private E1:Z

.field private F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field private F1:I

.field private G0:Landroidx/recyclerview/widget/RecyclerView;

.field private G1:Lax/Q2/f;

.field private H0:Landroid/view/View;

.field private H1:Z

.field private I0:Lax/t3/i;

.field private I1:Z

.field private J0:Z

.field private J1:Z

.field private K0:Landroid/widget/ListView;

.field private K1:Lax/d3/E$k0;

.field private L0:Landroid/widget/GridView;

.field private L1:Z

.field private M0:Landroid/view/View;

.field private M1:Z

.field private N0:Landroid/widget/AbsListView;

.field private N1:Z

.field private O0:I

.field private O1:I

.field private P0:Ljava/lang/String;

.field private P1:I

.field private Q0:Landroid/view/View;

.field private Q1:I

.field private R0:Landroid/widget/TextView;

.field private R1:Z

.field private S0:Landroid/widget/TextView;

.field private S1:I

.field private T0:Landroid/widget/TextView;

.field private T1:I

.field private U0:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private U1:I

.field private V0:Landroid/view/View;

.field private V1:J

.field protected W0:Lcom/voxdon/xplorer/widget/PathBar;

.field private W1:Ljava/lang/StringBuffer;

.field private X0:Landroid/widget/EditText;

.field private X1:Landroid/os/Handler;

.field private Y0:Lax/x3/d;

.field private Y1:Z

.field private Z0:Lax/u/w;

.field private Z1:Z

.field private a1:Lax/u/w;

.field private a2:Z

.field private b1:Lax/d3/n$r;

.field private b2:Ljava/lang/String;

.field protected c1:Lcom/voxdon/xplorer/widget/a;

.field private c2:Ljava/lang/String;

.field protected d1:Lcom/voxdon/xplorer/widget/a;

.field private d2:Ljava/lang/String;

.field protected e1:Lcom/voxdon/xplorer/widget/a;

.field private e2:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f1:Lax/V2/c;

.field private final f2:Landroid/content/BroadcastReceiver;

.field private g1:Lax/r3/d;

.field private g2:Landroid/support/v4/media/session/MediaControllerCompat;

.field private h1:Lcom/voxdon/xplorer/file/o;

.field h2:Landroid/widget/AbsListView$MultiChoiceModeListener;

.field private i1:Lcom/voxdon/xplorer/file/n;

.field i2:Landroid/widget/AbsListView$MultiChoiceModeListener;

.field private j1:Lcom/voxdon/xplorer/file/n;

.field j2:Landroid/widget/AdapterView$OnItemClickListener;

.field private k1:J

.field k2:Landroid/widget/AdapterView$OnItemClickListener;

.field private l1:Ljava/lang/String;

.field l2:Landroid/widget/AdapterView$OnItemClickListener;

.field private m1:J

.field private m2:Landroid/support/v4/media/session/MediaControllerCompat$a;

.field private n1:Ljava/lang/String;

.field n2:Landroid/content/BroadcastReceiver;

.field private o1:Z

.field o2:Landroid/content/BroadcastReceiver;

.field private p1:Ljava/lang/String;

.field p2:Landroid/content/BroadcastReceiver;

.field private q1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field q2:Ljava/lang/Runnable;

.field private r1:Ljava/lang/String;

.field private s1:Z

.field private t1:Lcom/voxdon/xplorer/file/n;

.field private u1:Lax/d3/E$r0;

.field private v1:Lax/d3/E$q0;

.field private w1:Lax/d3/E$n0;

.field private x1:Z

.field private y1:Landroid/view/MenuItem;

.field private z1:Landroid/view/MenuItem;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/d3/E;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/d3/E;->r2:Ljava/util/logging/Logger;

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
    invoke-direct {p0}, Lax/d3/H;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/d3/n$r;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/d3/n$r;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/d3/E;->b1:Lax/d3/n$r;

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    iput-wide v0, p0, Lax/d3/E;->k1:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lax/d3/E;->D1:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lax/d3/E;->E1:Z

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    iput v1, p0, Lax/d3/E;->F1:I

    .line 22
    .line 23
    iput-boolean v0, p0, Lax/d3/E;->H1:Z

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput-boolean v2, p0, Lax/d3/E;->I1:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lax/d3/E;->J1:Z

    .line 29
    .line 30
    sget-object v3, Lax/d3/E$k0;->q:Lax/d3/E$k0;

    .line 31
    .line 32
    iput-object v3, p0, Lax/d3/E;->K1:Lax/d3/E$k0;

    .line 33
    .line 34
    iput-boolean v0, p0, Lax/d3/E;->L1:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lax/d3/E;->M1:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Lax/d3/E;->N1:Z

    .line 39
    .line 40
    iput v1, p0, Lax/d3/E;->O1:I

    .line 41
    .line 42
    iput v1, p0, Lax/d3/E;->P1:I

    .line 43
    .line 44
    iput v1, p0, Lax/d3/E;->Q1:I

    .line 45
    .line 46
    iput v1, p0, Lax/d3/E;->S1:I

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuffer;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 54
    .line 55
    new-instance v1, Landroid/os/Handler;

    .line 56
    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Lax/d3/E;->X1:Landroid/os/Handler;

    .line 65
    .line 66
    iput-boolean v2, p0, Lax/d3/E;->Y1:Z

    .line 67
    .line 68
    iput-boolean v2, p0, Lax/d3/E;->Z1:Z

    .line 69
    .line 70
    iput-boolean v0, p0, Lax/d3/E;->a2:Z

    .line 71
    .line 72
    new-instance v0, Lax/d3/E$k;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Lax/d3/E$k;-><init>(Lax/d3/E;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lax/d3/E;->f2:Landroid/content/BroadcastReceiver;

    .line 78
    .line 79
    new-instance v0, Lax/d3/E$a;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Lax/d3/E$a;-><init>(Lax/d3/E;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lax/d3/E;->h2:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 85
    .line 86
    new-instance v0, Lax/d3/E$b;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lax/d3/E$b;-><init>(Lax/d3/E;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lax/d3/E;->i2:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 92
    .line 93
    new-instance v0, Lax/d3/E$c;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Lax/d3/E$c;-><init>(Lax/d3/E;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lax/d3/E;->j2:Landroid/widget/AdapterView$OnItemClickListener;

    .line 99
    .line 100
    new-instance v0, Lax/d3/E$d;

    .line 101
    .line 102
    const-wide/16 v1, 0x1f4

    .line 103
    .line 104
    invoke-direct {v0, p0, v1, v2}, Lax/d3/E$d;-><init>(Lax/d3/E;J)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lax/d3/E;->k2:Landroid/widget/AdapterView$OnItemClickListener;

    .line 108
    .line 109
    new-instance v0, Lax/d3/E$e;

    .line 110
    .line 111
    const-wide/16 v1, 0x190

    .line 112
    .line 113
    invoke-direct {v0, p0, v1, v2}, Lax/d3/E$e;-><init>(Lax/d3/E;J)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Lax/d3/E;->l2:Landroid/widget/AdapterView$OnItemClickListener;

    .line 117
    .line 118
    new-instance v0, Lax/d3/E$S;

    .line 119
    .line 120
    invoke-direct {v0, p0}, Lax/d3/E$S;-><init>(Lax/d3/E;)V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, Lax/d3/E;->m2:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 124
    .line 125
    new-instance v0, Lax/d3/E$a0;

    .line 126
    .line 127
    invoke-direct {v0, p0}, Lax/d3/E$a0;-><init>(Lax/d3/E;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lax/d3/E;->n2:Landroid/content/BroadcastReceiver;

    .line 131
    .line 132
    new-instance v0, Lax/d3/E$b0;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Lax/d3/E$b0;-><init>(Lax/d3/E;)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p0, Lax/d3/E;->o2:Landroid/content/BroadcastReceiver;

    .line 138
    .line 139
    new-instance v0, Lax/d3/E$d0;

    .line 140
    .line 141
    invoke-direct {v0, p0}, Lax/d3/E$d0;-><init>(Lax/d3/E;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Lax/d3/E;->p2:Landroid/content/BroadcastReceiver;

    .line 145
    .line 146
    new-instance v0, Lax/d3/E$e0;

    .line 147
    .line 148
    invoke-direct {v0, p0}, Lax/d3/E$e0;-><init>(Lax/d3/E;)V

    .line 149
    .line 150
    .line 151
    iput-object v0, p0, Lax/d3/E;->q2:Ljava/lang/Runnable;

    .line 152
    .line 153
    return-void
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

.method static synthetic A5(Lax/d3/E;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

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

.method static synthetic A6(Lax/d3/E;)Lcom/voxdon/xplorer/file/n;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

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

.method private A8(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1f

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1f

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    goto :goto_1f

    .line 20
    :cond_13
    invoke-direct {p0, p1}, Lax/d3/E;->Z6(Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {p0, v0, v1, v1, p1}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    :cond_1f
    :goto_1f
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
.end method

.method private A9(Z)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->J0:Z

    .line 2
    .line 3
    iget-object v0, p0, Lax/d3/E;->H0:Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    invoke-static {}, Lax/u3/b;->f()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-direct {p0, p1}, Lax/d3/E;->ea(Z)V

    .line 12
    .line 13
    .line 14
    xor-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lax/d3/E;->h7(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 20
    .line 21
    xor-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

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
.end method

.method static synthetic B5(Lax/d3/E;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

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

.method static synthetic B6(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->q9()V

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

.method private B8(Landroid/content/Intent;IZLjava/lang/String;)Z
    .registers 15

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1cb

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    goto/16 :goto_1cb

    .line 14
    .line 15
    :cond_e
    if-eqz p4, :cond_11

    .line 16
    .line 17
    goto :goto_6a

    .line 18
    :cond_11
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    if-eqz p4, :cond_28

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    invoke-virtual {p4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    invoke-static {p4}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    invoke-static {p4}, Lax/c3/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    goto :goto_6a

    .line 41
    :cond_28
    const-string p4, "com.filemanager.plugin.action.LAUNCH_FILE_URI"

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    const-string v0, ""

    .line 52
    .line 53
    if-eqz p4, :cond_55

    .line 54
    .line 55
    const-string p4, "com.filemanager.plugin.extra.DATA"

    .line 56
    .line 57
    invoke-virtual {p1, p4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_55

    .line 62
    .line 63
    invoke-virtual {p1, p4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    if-eqz p4, :cond_69

    .line 68
    .line 69
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    invoke-virtual {p4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    invoke-static {p4}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    invoke-static {p4}, Lax/c3/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    goto :goto_6a

    .line 86
    :cond_55
    new-instance p4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v1, "What case is this?"

    .line 92
    .line 93
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-static {p4}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_69
    move-object p4, v0

    .line 107
    :goto_6a
    invoke-static {p4}, Lax/c3/u;->R(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_113

    .line 112
    .line 113
    invoke-static {p1}, Lax/c3/u;->W(Landroid/content/Intent;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_113

    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_113

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_113

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, Lax/o3/c;->z(Ljava/lang/String;)Lax/Z2/k;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_18c

    .line 148
    .line 149
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-static {v1}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_ef

    .line 158
    .line 159
    iget-object v1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 160
    .line 161
    if-eqz v1, :cond_ef

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_ef

    .line 180
    .line 181
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/b;->h()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    iget-object v1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 194
    .line 195
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 211
    .line 212
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/service/b;->a(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    const/4 v7, 0x1

    .line 232
    const/4 v8, 0x0

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    invoke-static/range {v2 .. v8}, Lcom/voxdon/xplorer/service/HttpServerService;->q(Landroid/content/Context;Lax/Q2/f;IZZZLandroid/content/Intent;)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_18c

    .line 239
    .line 240
    :cond_ef
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v0}, Lax/Z2/k;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/service/b;->a(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v0}, Lax/Z2/k;->b()Lax/Q2/f;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-virtual {v0}, Lax/Z2/k;->c()I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    const/4 v8, 0x1

    .line 268
    const/4 v9, 0x0

    .line 269
    const/4 v6, 0x0

    .line 270
    const/4 v7, 0x0

    .line 271
    invoke-static/range {v3 .. v9}, Lcom/voxdon/xplorer/service/HttpServerService;->q(Landroid/content/Context;Lax/Q2/f;IZZZLandroid/content/Intent;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_18c

    .line 275
    .line 276
    :cond_113
    invoke-static {p1}, Lax/c3/u;->Y(Landroid/content/Intent;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_171

    .line 281
    .line 282
    invoke-static {p1}, Lax/c3/u;->W(Landroid/content/Intent;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->E(Landroid/net/Uri;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-static {v3}, Lax/Q2/f;->n0(Lax/Q2/f;)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_18c

    .line 311
    .line 312
    if-nez v0, :cond_13b

    .line 313
    .line 314
    if-eqz v1, :cond_18c

    .line 315
    .line 316
    :cond_13b
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    if-eqz v3, :cond_18c

    .line 321
    .line 322
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    if-eqz v3, :cond_18c

    .line 331
    .line 332
    invoke-static {p4}, Lax/c3/A;->g(Ljava/lang/String;)Lax/c3/z;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    sget-object v4, Lax/c3/z;->e0:Lax/c3/z;

    .line 337
    .line 338
    if-ne v3, v4, :cond_18c

    .line 339
    .line 340
    iget-object v3, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 341
    .line 342
    if-eqz v3, :cond_160

    .line 343
    .line 344
    const-string v4, "size"

    .line 345
    .line 346
    invoke-interface {v3}, Lax/c3/b;->p()J

    .line 347
    .line 348
    .line 349
    move-result-wide v5

    .line 350
    invoke-virtual {p1, v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 351
    .line 352
    .line 353
    :cond_160
    invoke-direct {p0, p1, v0, v1, v2}, Lax/d3/E;->I6(Landroid/content/Intent;ZZLjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-static {p1}, Lax/u3/B;->x(Landroid/os/Parcelable;)I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    const/high16 v1, 0x80000

    .line 361
    .line 362
    if-lt v0, v1, :cond_18c

    .line 363
    .line 364
    const-string v0, "video_list"

    .line 365
    .line 366
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto :goto_18c

    .line 370
    :cond_171
    invoke-static {p1}, Lax/c3/u;->X(Landroid/content/Intent;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_18c

    .line 375
    .line 376
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->B(Landroid/net/Uri;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_18c

    .line 385
    .line 386
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->i(Landroid/net/Uri;)Landroid/net/Uri;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 395
    .line 396
    .line 397
    :cond_18c
    :goto_18c
    invoke-direct {p0}, Lax/d3/E;->T8()V

    .line 398
    .line 399
    .line 400
    invoke-static {p0, p1, p2, p3}, Lax/c3/w;->n(Landroidx/fragment/app/Fragment;Landroid/content/Intent;IZ)Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    iput-boolean p1, p0, Lax/d3/E;->J1:Z

    .line 405
    .line 406
    if-eqz p1, :cond_19a

    .line 407
    .line 408
    const-string p1, "success"

    .line 409
    .line 410
    goto :goto_19f

    .line 411
    :cond_19a
    invoke-direct {p0}, Lax/d3/E;->V6()V

    .line 412
    .line 413
    .line 414
    const-string p1, "failure"

    .line 415
    .line 416
    :goto_19f
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    const-string p3, "command"

    .line 421
    .line 422
    const-string v0, "file_open"

    .line 423
    .line 424
    invoke-virtual {p2, p3, v0}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 429
    .line 430
    .line 431
    move-result-object p3

    .line 432
    invoke-virtual {p3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p3

    .line 436
    const-string v0, "loc"

    .line 437
    .line 438
    invoke-virtual {p2, v0, p3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 439
    .line 440
    .line 441
    move-result-object p2

    .line 442
    const-string p3, "ext"

    .line 443
    .line 444
    invoke-virtual {p2, p3, p4}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 445
    .line 446
    .line 447
    move-result-object p2

    .line 448
    const-string p3, "result"

    .line 449
    .line 450
    invoke-virtual {p2, p3, p1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 455
    .line 456
    .line 457
    iget-boolean p1, p0, Lax/d3/E;->J1:Z

    .line 458
    .line 459
    return p1

    .line 460
    :cond_1cb
    :goto_1cb
    const/4 p1, 0x0

    .line 461
    return p1
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
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method static synthetic C5(Lax/d3/E;)Landroid/widget/GridView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

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

.method static synthetic C6(Lax/d3/E;Ljava/util/List;)Ljava/util/List;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->r7(Ljava/util/List;)Ljava/util/List;

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

.method private C8(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .registers 13

    .line 1
    sget-object v1, Lax/Z2/c$a;->c0:Lax/Z2/c$a;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    move v6, p5

    .line 9
    invoke-static/range {v0 .. v6}, Lax/a3/Q;->R3(Landroidx/fragment/app/Fragment;Lax/Z2/c$a;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

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

.method private C9(Lcom/voxdon/xplorer/file/n;J)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lax/o3/e;->h(Lcom/voxdon/xplorer/file/n;J)V

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

.method static synthetic D5(Lax/d3/E;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/E;->S1:I

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

.method static synthetic D6(Lax/d3/E;)Lax/d3/n$r;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->b1:Lax/d3/n$r;

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

.method private D8(Lcom/voxdon/xplorer/file/n;)V
    .registers 7

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
    goto/16 :goto_99

    .line 8
    .line 9
    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_99

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_16

    .line 20
    .line 21
    goto/16 :goto_99

    .line 22
    .line 23
    :cond_16
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_28

    .line 29
    .line 30
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 31
    .line 32
    if-eqz v0, :cond_24

    .line 33
    .line 34
    invoke-direct {p0}, Lax/d3/E;->d9()V

    .line 35
    .line 36
    .line 37
    :cond_24
    invoke-direct {p0, p1, v1, v1}, Lax/d3/E;->t8(Lcom/voxdon/xplorer/file/n;II)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    invoke-virtual {p0}, Lax/d3/E;->K8()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_96

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_78

    .line 56
    .line 57
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "INVALID PARENT PATH"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v4, "loc:"

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v4, ",path:"

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v2, v3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Lax/Ha/b;->h()V

    .line 105
    .line 106
    .line 107
    if-eqz v0, :cond_78

    .line 108
    .line 109
    const-string v2, "/"

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_78

    .line 116
    .line 117
    invoke-static {v0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_78
    iget-object v2, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v2, v0}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_87

    .line 128
    .line 129
    invoke-direct {p0}, Lax/d3/E;->d9()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v0, v1, v1}, Lax/d3/E;->u8(Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    goto :goto_96

    .line 136
    :cond_87
    iget-boolean v2, p0, Lax/d3/E;->o1:Z

    .line 137
    .line 138
    if-nez v2, :cond_96

    .line 139
    .line 140
    iget-object v2, p0, Lax/d3/E;->u1:Lax/d3/E$r0;

    .line 141
    .line 142
    invoke-static {v2}, Lax/u3/q;->n(Lax/u3/q;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_96

    .line 147
    .line 148
    invoke-virtual {p0, v0, v1, v1}, Lax/d3/E;->u8(Ljava/lang/String;II)V

    .line 149
    .line 150
    .line 151
    :cond_96
    :goto_96
    invoke-direct {p0, p1}, Lax/d3/E;->x8(Lcom/voxdon/xplorer/file/n;)V

    .line 152
    .line 153
    .line 154
    :cond_99
    :goto_99
    return-void
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
.end method

.method private D9(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1, v2}, Lax/o3/e;->h(Lcom/voxdon/xplorer/file/n;J)V

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
.end method

.method static synthetic E5(Lax/d3/E;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/d3/E;->S1:I

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

.method private E6(Ljava/util/List;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "menu_folder"

    .line 10
    .line 11
    const-string v3, "bookmark"

    .line 12
    .line 13
    invoke-virtual {v1, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "loc"

    .line 26
    .line 27
    invoke-virtual {v1, v3, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

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
    const/4 v0, 0x0

    .line 41
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {p1}, Lax/c3/b;->t()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {v1, v2, v3, v4, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->h(Ljava/lang/String;Lax/c3/K;Ljava/lang/String;Ljava/lang/String;Z)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1, p1, v0}, Lax/V2/b;->a(Landroid/content/Context;Lcom/voxdon/xplorer/bookmark/Bookmark;Z)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_56

    .line 80
    .line 81
    const p1, 0x7f1302bc

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->E4(II)V

    .line 85
    .line 86
    .line 87
    :cond_56
    return-void
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

.method private E8(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V
    .registers 12

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    :cond_12
    move-object v2, p0

    .line 20
    goto/16 :goto_117

    .line 21
    .line 22
    :cond_15
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz v0, :cond_24

    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lax/d3/E;->D9(Lcom/voxdon/xplorer/file/n;)V

    .line 33
    .line 34
    .line 35
    :goto_22
    move-object v3, v0

    .line 36
    goto :goto_3e

    .line 37
    :cond_24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-direct {p0, p1, v2, v3}, Lax/d3/E;->C9(Lcom/voxdon/xplorer/file/n;J)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :try_start_33
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/voxdon/xplorer/file/y;
    :try_end_3d
    .catch Lax/b3/j; {:try_start_33 .. :try_end_3d} :catch_10b

    .line 61
    .line 62
    goto :goto_22

    .line 63
    :goto_3e
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lax/t3/j;->C(Landroid/content/Context;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v2, 0x0

    .line 72
    if-eqz v0, :cond_57

    .line 73
    .line 74
    invoke-static {v3, v1}, Lax/c3/A;->B(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_57

    .line 79
    .line 80
    if-nez p2, :cond_57

    .line 81
    .line 82
    invoke-direct {p0, p1}, Lax/d3/E;->Z6(Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    goto/16 :goto_ea

    .line 87
    .line 88
    :cond_57
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lax/t3/j;->F(Landroid/content/Context;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_7a

    .line 97
    .line 98
    invoke-static {v3}, Lax/c3/A;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_7a

    .line 103
    .line 104
    if-nez p2, :cond_7a

    .line 105
    .line 106
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sget-object v1, Lax/Z2/c$a;->c0:Lax/Z2/c$a;

    .line 111
    .line 112
    invoke-static {v0, v1, v3, v2}, Lax/a3/Q;->K3(Landroid/content/Context;Lax/Z2/c$a;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_7a

    .line 117
    .line 118
    invoke-direct {p0, p1}, Lax/d3/E;->R8(Lcom/voxdon/xplorer/file/n;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_e9

    .line 122
    .line 123
    :cond_7a
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Lax/t3/j;->D(Landroid/content/Context;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_9a

    .line 132
    .line 133
    invoke-static {v3}, Lax/c3/A;->C(Lcom/voxdon/xplorer/file/n;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9a

    .line 138
    .line 139
    if-nez p2, :cond_9a

    .line 140
    .line 141
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0, v3, v2}, Lax/a3/Q;->J3(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_9a

    .line 150
    .line 151
    invoke-virtual {p0, v3}, Lax/d3/E;->G8(Lcom/voxdon/xplorer/file/n;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_e9

    .line 155
    :cond_9a
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Lax/t3/j;->E(Landroid/content/Context;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_c8

    .line 164
    .line 165
    invoke-static {v3}, Lax/c3/A;->D(Lcom/voxdon/xplorer/file/n;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_ac

    .line 170
    .line 171
    if-eqz p2, :cond_ba

    .line 172
    .line 173
    :cond_ac
    sget-object v0, Lax/c3/V;->c0:Lax/c3/V;

    .line 174
    .line 175
    invoke-virtual {v0}, Lax/c3/V;->h()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_c8

    .line 184
    .line 185
    if-nez p3, :cond_c8

    .line 186
    .line 187
    :cond_ba
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-static {p2, p1, v3}, Lax/c3/w;->g(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/y;)Landroid/content/Intent;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    const/16 p3, 0x3ea

    .line 196
    .line 197
    const/4 p3, 0x0

    .line 198
    const/16 v2, 0x3ea

    .line 199
    .line 200
    goto :goto_ea

    .line 201
    :cond_c8
    invoke-static {p1}, Lax/c3/A;->p(Lcom/voxdon/xplorer/file/n;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_d8

    .line 206
    .line 207
    if-nez p2, :cond_d8

    .line 208
    .line 209
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-direct {p0, p2}, Lax/d3/E;->k7(Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    goto :goto_e9

    .line 217
    :cond_d8
    invoke-static {}, Lax/X2/Q;->H1()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_f4

    .line 222
    .line 223
    invoke-static {p1}, Lax/c3/A;->K(Lcom/voxdon/xplorer/file/n;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_f4

    .line 228
    .line 229
    if-nez p2, :cond_f4

    .line 230
    .line 231
    invoke-direct {p0, v3}, Lax/d3/E;->o8(Lax/c3/k;)V

    .line 232
    .line 233
    .line 234
    :goto_e9
    const/4 p2, 0x0

    .line 235
    :goto_ea
    if-eqz p2, :cond_12

    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-direct {p0, p2, v2, p3, p1}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_f4
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/y;->s()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    if-eqz p2, :cond_fc

    .line 250
    .line 251
    move-object v5, p2

    .line 252
    goto :goto_fd

    .line 253
    :cond_fc
    move-object v5, v4

    .line 254
    :goto_fd
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-direct {p0, p1, p2}, Lax/d3/E;->ja(Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

    .line 259
    .line 260
    .line 261
    const/4 v7, 0x1

    .line 262
    move-object v2, p0

    .line 263
    move v6, p3

    .line 264
    invoke-direct/range {v2 .. v7}, Lax/d3/E;->s8(Lax/c3/k;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :catch_10b
    move-exception v0

    .line 269
    move-object v2, p0

    .line 270
    move-object p1, v0

    .line 271
    const p2, 0x7f13013e

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p2, v1}, Lax/d3/n;->E4(II)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 278
    .line 279
    .line 280
    :goto_117
    return-void
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

.method static synthetic F5(Lax/d3/E;Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)Z
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/d3/E;->d8(Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)Z

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

.method private F6(Lcom/voxdon/xplorer/file/n;J)V
    .registers 11

    .line 1
    if-eqz p1, :cond_2a

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2a

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/d3/E;->C7()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2a

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {p1}, Lax/c3/b;->t()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    move-wide v5, p2

    .line 32
    invoke-static/range {v1 .. v6}, Lcom/voxdon/xplorer/bookmark/Bookmark;->j(Lax/c3/K;Ljava/lang/String;Ljava/lang/String;ZJ)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2, p1}, Lcom/voxdon/xplorer/activity/b;->r0(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
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

.method public static F7(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;
    .registers 5

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lax/t3/e;->j(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p4, :cond_1b

    .line 6
    .line 7
    const-string p1, "SizeUp"

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_11

    .line 14
    .line 15
    const-string p0, "RecursiveUp"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_11
    const-string p1, "SizeDown"

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1b

    .line 25
    .line 26
    const-string p0, "RecursiveDown"

    .line 27
    .line 28
    :cond_1b
    return-object p0
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

.method private F8(Lcom/voxdon/xplorer/file/n;)V
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    :cond_c
    move-object v1, p0

    .line 14
    goto :goto_40

    .line 15
    :cond_e
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    instance-of v0, p1, Lax/c3/k;

    .line 24
    .line 25
    if-eqz v0, :cond_1e

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lax/d3/E;->D9(Lcom/voxdon/xplorer/file/n;)V

    .line 28
    .line 29
    .line 30
    goto :goto_25

    .line 31
    :cond_1e
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-direct {p0, p1, v0, v1}, Lax/d3/E;->C9(Lcom/voxdon/xplorer/file/n;J)V

    .line 36
    .line 37
    .line 38
    :goto_25
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {v0, p1, v3, v1}, Lax/c3/w;->a(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3b

    .line 48
    .line 49
    invoke-direct {p0, p1, v2}, Lax/d3/E;->ja(Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    const/4 v6, 0x1

    .line 54
    move-object v4, v3

    .line 55
    move-object v1, p0

    .line 56
    invoke-direct/range {v1 .. v6}, Lax/d3/E;->y8(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    move-object v1, p0

    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-direct {p0, p1, v0}, Lax/d3/E;->ba(Lcom/voxdon/xplorer/file/n;Z)V

    .line 63
    .line 64
    .line 65
    :goto_40
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private F9()V
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
    iget-object v0, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 17
    .line 18
    iget-object v1, p0, Lax/d3/E;->G1:Lax/Q2/f;

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

.method static synthetic G5(Lax/d3/E;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/E;->T1:I

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

.method private G6(Landroid/view/Menu;Z)V
    .registers 7

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
    goto :goto_2a

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    const v1, 0x7f0a0236

    .line 10
    .line 11
    .line 12
    const v2, 0x7f0a0235

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz p2, :cond_18

    .line 17
    .line 18
    invoke-interface {p1, v2, v3}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v1, v0}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    invoke-interface {p1, v2, v0}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v1, v3}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 29
    .line 30
    .line 31
    const p2, 0x7f0a02c6

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_2a

    .line 39
    .line 40
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    :cond_2a
    :goto_2a
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

.method static synthetic H5(Lax/d3/E;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/E;->U1:I

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

.method private H9(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/u3/z;->c(Lax/n/c;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    if-eqz v0, :cond_18

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->f0()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->addAll(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 26
    .line 27
    if-eqz v0, :cond_29

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->f0()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->addAll(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    iget-object p1, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/r3/d;->f()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lax/d3/E;->R6()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lax/d3/E;->g8()V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic I5(Lax/d3/E;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->R1:Z

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

.method private I6(Landroid/content/Intent;ZZLjava/lang/String;)V
    .registers 15

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
    goto/16 :goto_90

    .line 8
    .line 9
    :cond_8
    const/4 v1, 0x0

    .line 10
    if-eqz p2, :cond_14

    .line 11
    .line 12
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lcom/voxdon/xplorer/service/b;->h()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 v2, 0x0

    .line 22
    :goto_15
    iget-object v3, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 23
    .line 24
    invoke-virtual {v3}, Lcom/voxdon/xplorer/widget/a;->N()Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    :goto_26
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-ge v6, v7, :cond_70

    .line 44
    .line 45
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Lcom/voxdon/xplorer/file/n;

    .line 50
    .line 51
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    sget-object v9, Lax/c3/z;->e0:Lax/c3/z;

    .line 56
    .line 57
    if-ne v8, v9, :cond_6d

    .line 58
    .line 59
    if-eqz p2, :cond_56

    .line 60
    .line 61
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8, v7}, Lcom/voxdon/xplorer/service/b;->c(Lcom/voxdon/xplorer/file/n;)Z

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v7}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-interface {v7}, Lax/c3/b;->p()J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_6d

    .line 87
    :cond_56
    :try_start_56
    invoke-static {v7, p3}, Lax/c3/u;->L(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    const/16 v9, 0x41

    .line 92
    .line 93
    invoke-virtual {v0, p4, v8, v9}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    invoke-interface {v7}, Lax/c3/b;->p()J

    .line 100
    .line 101
    .line 102
    move-result-wide v7

    .line 103
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6d
    .catch Ljava/lang/Exception; {:try_start_56 .. :try_end_6d} :catch_6d

    .line 108
    .line 109
    .line 110
    :catch_6d
    :cond_6d
    :goto_6d
    add-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    goto :goto_26

    .line 113
    :cond_70
    new-array p2, v1, [Landroid/net/Uri;

    .line 114
    .line 115
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, [Landroid/os/Parcelable;

    .line 120
    .line 121
    const-string p3, "video_list"

    .line 122
    .line 123
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    if-ne p2, p3, :cond_90

    .line 135
    .line 136
    const-string p2, "video_list.size"

    .line 137
    .line 138
    invoke-static {v5}, Lax/u7/h;->k(Ljava/util/Collection;)[J

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 143
    .line 144
    .line 145
    :cond_90
    :goto_90
    return-void
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

.method private I7(ILcom/voxdon/xplorer/file/n;Z)Lcom/voxdon/xplorer/viewer/e$a;
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p3, :cond_8

    .line 3
    .line 4
    invoke-static {p2, v0}, Lax/c3/u;->L(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_c

    .line 9
    :cond_8
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_c
    iget-object v2, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 14
    .line 15
    invoke-virtual {v2, p2}, Lcom/voxdon/xplorer/widget/a;->V(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-eqz p2, :cond_20

    .line 20
    .line 21
    if-eqz p3, :cond_1b

    .line 22
    .line 23
    invoke-static {p2, v0}, Lax/c3/u;->L(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_21

    .line 28
    :cond_1b
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_21

    .line 33
    :cond_20
    const/4 p1, 0x0

    .line 34
    :goto_21
    new-instance p2, Lcom/voxdon/xplorer/viewer/e$a;

    .line 35
    .line 36
    invoke-direct {p2, v1, p1}, Lcom/voxdon/xplorer/viewer/e$a;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 37
    .line 38
    .line 39
    return-object p2
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

.method private I8(Lcom/voxdon/xplorer/file/n;Z)V
    .registers 14

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_f

    .line 12
    .line 13
    :cond_c
    move-object v1, p0

    .line 14
    goto/16 :goto_b7

    .line 15
    .line 16
    :cond_f
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lax/Q2/f;->n0(Lax/Q2/f;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_29

    .line 29
    .line 30
    const-string v1, "application/octet-stream"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_29

    .line 37
    .line 38
    invoke-static {p1, v1}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_29
    move-object v3, v0

    .line 43
    const/4 v0, 0x1

    .line 44
    const/4 v1, 0x0

    .line 45
    if-nez p2, :cond_4e

    .line 46
    .line 47
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lax/t3/j;->F(Landroid/content/Context;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4e

    .line 56
    .line 57
    invoke-static {v3, v1}, Lax/c3/A;->M(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4e

    .line 62
    .line 63
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget-object v4, Lax/Z2/c$a;->c0:Lax/Z2/c$a;

    .line 68
    .line 69
    invoke-static {v2, v4, p1, v0}, Lax/a3/Q;->K3(Landroid/content/Context;Lax/Z2/c$a;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_4e

    .line 74
    .line 75
    invoke-direct {p0, p1}, Lax/d3/E;->R8(Lcom/voxdon/xplorer/file/n;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    if-nez p2, :cond_6e

    .line 80
    .line 81
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v2}, Lax/t3/j;->D(Landroid/content/Context;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_6e

    .line 90
    .line 91
    invoke-static {p1}, Lax/c3/A;->C(Lcom/voxdon/xplorer/file/n;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_6e

    .line 96
    .line 97
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v2, p1, v0}, Lax/a3/Q;->J3(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_6e

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lax/d3/E;->G8(Lcom/voxdon/xplorer/file/n;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6e
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/b;->h()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-static {v2, v3, v1, v1}, Lax/c3/u;->n(Landroid/net/Uri;Ljava/lang/String;ZZ)Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0, v10}, Lax/u3/B;->K(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_b1

    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/service/b;->c(Lcom/voxdon/xplorer/file/n;)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    const/4 v8, 0x1

    .line 165
    const/4 v9, 0x1

    .line 166
    const/4 v7, 0x0

    .line 167
    invoke-static/range {v4 .. v10}, Lcom/voxdon/xplorer/service/HttpServerService;->q(Landroid/content/Context;Lax/Q2/f;IZZZLandroid/content/Intent;)V

    .line 168
    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    move-object v4, v3

    .line 172
    move-object v1, p0

    .line 173
    move v5, p2

    .line 174
    invoke-direct/range {v1 .. v6}, Lax/d3/E;->C8(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_b1
    move-object v1, p0

    .line 179
    move v5, p2

    .line 180
    const/4 p2, 0x0

    .line 181
    invoke-direct {p0, p1, v5, p2}, Lax/d3/E;->g7(Lcom/voxdon/xplorer/file/n;ZLandroid/content/Intent;)V

    .line 182
    .line 183
    .line 184
    :goto_b7
    return-void
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

.method static synthetic J5(Lax/d3/E;)Landroid/widget/ListView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

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

.method private J6(Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;
    .registers 16

    .line 1
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_6
    invoke-static {p1}, Lax/c3/B;->e(Lcom/voxdon/xplorer/file/n;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/voxdon/xplorer/service/b;->h()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v0, :cond_1e

    .line 25
    .line 26
    invoke-static {p1, v2}, Lax/c3/u;->L(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    goto :goto_22

    .line 31
    :cond_1e
    invoke-static {v1, p1}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_22
    iget-object v4, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/voxdon/xplorer/widget/a;->N()Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :cond_2c
    :goto_2c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_51

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Lcom/voxdon/xplorer/file/n;

    .line 56
    .line 57
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-static {v7, v3}, Lax/a3/Q;->I3(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_47

    .line 66
    .line 67
    invoke-static {v6}, Lax/c3/A;->F(Lcom/voxdon/xplorer/file/n;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    goto :goto_4b

    .line 72
    :cond_47
    invoke-static {v6}, Lax/c3/A;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    :goto_4b
    if-nez v6, :cond_2c

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 79
    .line 80
    .line 81
    goto :goto_2c

    .line 82
    :cond_51
    new-instance v5, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    :goto_57
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-ge v6, v7, :cond_6d

    .line 93
    .line 94
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, Lcom/voxdon/xplorer/file/n;

    .line 99
    .line 100
    invoke-direct {p0, v1, v7, v0}, Lax/d3/E;->I7(ILcom/voxdon/xplorer/file/n;Z)Lcom/voxdon/xplorer/viewer/e$a;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_57

    .line 110
    :cond_6d
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_7a

    .line 115
    .line 116
    invoke-direct {p0, v1, p1, v0}, Lax/d3/E;->I7(ILcom/voxdon/xplorer/file/n;Z)Lcom/voxdon/xplorer/viewer/e$a;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_7a
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-static {v6, v3, v5, v1, v2}, Lax/c3/w;->j(Landroid/content/Context;Landroid/net/Uri;Ljava/util/ArrayList;ZZ)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    if-nez v0, :cond_ba

    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/service/b;->c(Lcom/voxdon/xplorer/file/n;)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-lez p1, :cond_a8

    .line 157
    .line 158
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p1}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1, v4}, Lcom/voxdon/xplorer/service/b;->b(Ljava/util/List;)V

    .line 167
    .line 168
    .line 169
    :cond_a8
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    const/4 v11, 0x1

    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v10, 0x0

    .line 184
    invoke-static/range {v7 .. v13}, Lcom/voxdon/xplorer/service/HttpServerService;->q(Landroid/content/Context;Lax/Q2/f;IZZZLandroid/content/Intent;)V

    .line 185
    .line 186
    .line 187
    :cond_ba
    return-object v13
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
.end method

.method private J8(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_folder"

    .line 6
    .line 7
    const-string v2, "open_parent"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

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
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-gtz v0, :cond_24

    .line 35
    .line 36
    goto :goto_31

    .line 37
    :cond_24
    const/4 v0, 0x0

    .line 38
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 43
    .line 44
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_32

    .line 49
    .line 50
    :goto_31
    return-void

    .line 51
    :cond_32
    instance-of v0, p1, Lcom/voxdon/xplorer/file/C;

    .line 52
    .line 53
    if-nez v0, :cond_3a

    .line 54
    .line 55
    invoke-static {}, Lax/u3/b;->f()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v0, p1}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Lax/d3/E;->P8(Landroid/net/Uri;)V

    .line 78
    .line 79
    .line 80
    return-void
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

.method static synthetic K5(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->g8()V

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

.method private K9(Lax/c3/K;Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/voxdon/xplorer/widget/a;->t0(Lax/c3/K;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lcom/voxdon/xplorer/widget/a;->t0(Lax/c3/K;Ljava/lang/String;)V

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

.method static synthetic L5(Lax/d3/E;Lax/W2/e$e;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->U7(Lax/W2/e$e;)Z

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

.method private L6()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/E;->M6()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/E;->w1:Lax/d3/E$n0;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/u3/q;->e()Z

    .line 9
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

.method private L7(Lcom/voxdon/xplorer/file/n;Z)V
    .registers 6

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/x$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lax/d3/E$t;

    .line 8
    .line 9
    invoke-direct {v2, p0, p1}, Lax/d3/E$t;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, p1, p2, v2}, Lcom/voxdon/xplorer/file/x$g;-><init>(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;ZLcom/voxdon/xplorer/file/x$f;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    new-array p1, p1, [Ljava/lang/Void;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

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
.end method

.method private L8()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->s1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    goto :goto_d

    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_d
    iget-object v1, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lax/V2/c;->c(Ljava/lang/String;)Lax/V2/c$a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_28

    .line 21
    .line 22
    invoke-direct {p0}, Lax/d3/E;->d9()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lax/V2/c$a;->a()Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v1}, Lax/V2/c$a;->b()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1}, Lax/V2/c$a;->i()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-direct {p0, v0, v2, v1}, Lax/d3/E;->t8(Lcom/voxdon/xplorer/file/n;II)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    invoke-virtual {p0, v0}, Lax/d3/E;->Z3(Ljava/lang/String;)V

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

.method static synthetic M5(Lax/d3/E;Lax/W2/e$e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->ga(Lax/W2/e$e;)V

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

.method private M6()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->u1:Lax/d3/E$r0;

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
    iget-object v0, p0, Lax/d3/E;->v1:Lax/d3/E$q0;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/u3/q;->e()Z

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
.end method

.method private M7()Z
    .registers 11

    .line 1
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/V2/c;->e()Lax/V2/c$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    if-eqz v0, :cond_75

    .line 12
    .line 13
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "navigation"

    .line 18
    .line 19
    const-string v3, "open_folder_back"

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "loc"

    .line 34
    .line 35
    invoke-virtual {v1, v3, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "by"

    .line 40
    .line 41
    const-string v3, "hw_back"

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lax/Q2/a$b;->e()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lax/V2/c$a;->j()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_48

    .line 55
    .line 56
    invoke-virtual {v0}, Lax/V2/c$a;->a()Lcom/voxdon/xplorer/file/n;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0}, Lax/V2/c$a;->b()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v0}, Lax/V2/c$a;->i()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-direct {p0, v1, v2, v0}, Lax/d3/E;->t8(Lcom/voxdon/xplorer/file/n;II)V

    .line 69
    .line 70
    .line 71
    move-object v3, p0

    .line 72
    goto :goto_73

    .line 73
    :cond_48
    invoke-virtual {v0}, Lax/V2/c$a;->f()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v0}, Lax/V2/c$a;->e()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v0}, Lax/V2/c$a;->c()Lax/Z2/p;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v0}, Lax/V2/c$a;->h()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v0}, Lax/V2/c$a;->d()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-virtual {v0}, Lax/V2/c$a;->g()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    move-object v3, p0

    .line 98
    invoke-direct/range {v3 .. v9}, Lax/d3/E;->M8(Ljava/lang/String;Ljava/lang/String;Lax/Z2/p;Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lax/V2/c$a;->a()Lcom/voxdon/xplorer/file/n;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0}, Lax/V2/c$a;->b()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {v0}, Lax/V2/c$a;->i()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-direct {p0, v1, v2, v0}, Lax/d3/E;->t8(Lcom/voxdon/xplorer/file/n;II)V

    .line 114
    .line 115
    .line 116
    :goto_73
    const/4 v0, 0x1

    .line 117
    return v0

    .line 118
    :cond_75
    move-object v3, p0

    .line 119
    const/4 v0, 0x0

    .line 120
    return v0
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

.method private M8(Ljava/lang/String;Ljava/lang/String;Lax/Z2/p;Ljava/lang/String;II)V
    .registers 9

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
    goto :goto_60

    .line 8
    :cond_7
    if-eqz p2, :cond_60

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_60

    .line 15
    .line 16
    new-instance v0, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "query"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "ROOT"

    .line 27
    .line 28
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "LOCATION"

    .line 32
    .line 33
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 38
    .line 39
    .line 40
    const-string p1, "LOCATION_KEY"

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const-string p1, "INCLUDE_SUBFOLDER"

    .line 50
    .line 51
    iget-boolean v1, p0, Lax/d3/E;->Y1:Z

    .line 52
    .line 53
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    const-string p1, "FILTER_INFO"

    .line 57
    .line 58
    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 59
    .line 60
    .line 61
    const-string p1, "SORT_METHOD"

    .line 62
    .line 63
    invoke-virtual {v0, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p1, "INDEX"

    .line 67
    .line 68
    invoke-virtual {v0, p1, p5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    const-string p1, "TOP"

    .line 72
    .line 73
    invoke-virtual {v0, p1, p6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lax/d3/E;->I0:Lax/t3/i;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lax/t3/i;->d(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 89
    .line 90
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p1, p2, v0}, Lcom/voxdon/xplorer/activity/MainActivity;->f2(Lax/c3/K;Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    return-void
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
.end method

.method private M9()V
    .registers 7

    .line 1
    const/4 v4, 0x1

    .line 2
    const/4 v5, 0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, 0x7f130139

    .line 5
    .line 6
    .line 7
    const v2, 0x104000a

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static/range {v0 .. v5}, Lax/a3/n;->l3(IIIIZZ)Lax/a3/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->A0()Landroidx/fragment/app/FragmentManager;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "confirm_access_denied"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-static {v1, v0, v2, v3}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V

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

.method static synthetic N5(Lax/d3/E;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->b2:Ljava/lang/String;

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

.method private N6(Z)V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->J1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x78

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/s3/u;->a(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_36

    .line 22
    .line 23
    iget-object v2, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v2, :cond_2a

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v2, v0}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2a

    .line 36
    .line 37
    iput-boolean v1, p0, Lax/d3/E;->J1:Z

    .line 38
    .line 39
    invoke-direct {p0}, Lax/d3/E;->V6()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 44
    .line 45
    invoke-static {v0}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_33

    .line 50
    .line 51
    goto :goto_36

    .line 52
    :cond_33
    invoke-direct {p0}, Lax/d3/E;->pa()V

    .line 53
    .line 54
    .line 55
    :cond_36
    :goto_36
    if-eqz p1, :cond_3d

    .line 56
    .line 57
    iput-boolean v1, p0, Lax/d3/E;->J1:Z

    .line 58
    .line 59
    invoke-direct {p0}, Lax/d3/E;->V6()V

    .line 60
    .line 61
    .line 62
    :cond_3d
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

.method private N7()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/d3/E;->x7()Lax/V2/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_1b

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lax/d3/E;->o1:Z

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

.method private N9(Ljava/lang/String;)V
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
    return-void

    .line 8
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0, p1}, Lax/w3/h;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p0, v2}, Lax/d3/n;->D3(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, p1}, Lax/w3/d;->w(Landroid/content/Context;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v0, :cond_2b

    .line 27
    .line 28
    invoke-static {v2, v1, v3}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lax/d3/E$T;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Lax/d3/E$T;-><init>(Lax/d3/E;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const p1, 0x7f13012b

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/snackbar/Snackbar;->q0(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 41
    .line 42
    .line 43
    goto :goto_2f

    .line 44
    :cond_2b
    invoke-static {v2, v1, v3}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_2f
    invoke-virtual {p0, v0}, Lax/d3/n;->D4(Lcom/google/android/material/snackbar/Snackbar;)V

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
.end method

.method static synthetic O5(Lax/d3/E;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->b2:Ljava/lang/String;

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

.method static synthetic P5(Lax/d3/E;)Lax/d3/E$q0;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->v1:Lax/d3/E$q0;

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

.method private P6()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->L3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_30

    .line 6
    .line 7
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "STATCHK"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "RESUMED:"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e1()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 47
    .line 48
    .line 49
    :cond_30
    return-void
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

.method private P7()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1e

    .line 11
    .line 12
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 13
    .line 14
    invoke-static {v0}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_19

    .line 20
    .line 21
    iput-boolean v1, p0, Lax/d3/E;->Y1:Z

    .line 22
    .line 23
    iput-boolean v2, p0, Lax/d3/E;->Z1:Z

    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iput-boolean v2, p0, Lax/d3/E;->Y1:Z

    .line 27
    .line 28
    iput-boolean v2, p0, Lax/d3/E;->Z1:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    iget-boolean v0, p0, Lax/d3/E;->a2:Z

    .line 32
    .line 33
    if-nez v0, :cond_28

    .line 34
    .line 35
    iput-boolean v1, p0, Lax/d3/E;->Y1:Z

    .line 36
    .line 37
    iput-boolean v1, p0, Lax/d3/E;->Z1:Z

    .line 38
    .line 39
    iput-boolean v1, p0, Lax/d3/E;->a2:Z

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
.end method

.method public static synthetic Q4(Lax/d3/E;Landroid/os/Bundle;)V
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
    invoke-virtual {p0}, Lax/d3/E;->n8()V

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

.method static synthetic Q5(Lax/d3/E;Lax/d3/E$q0;)Lax/d3/E$q0;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->v1:Lax/d3/E$q0;

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

.method private Q6()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->clear()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/r3/d;->f()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lax/d3/E;->R6()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lax/d3/E;->g8()V

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

.method private Q7(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4d

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_4d

    .line 14
    :cond_d
    instance-of v0, p1, Lax/c3/k;

    .line 15
    .line 16
    if-nez v0, :cond_15

    .line 17
    .line 18
    invoke-static {}, Lax/u3/b;->f()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lax/U2/d;->V(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_40

    .line 31
    .line 32
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/voxdon/xplorer/shizuku/c;->C()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_40

    .line 41
    .line 42
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lax/d3/E$x;

    .line 47
    .line 48
    invoke-direct {v1, p0, p1}, Lax/d3/E$x;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/shizuku/c;->m(Lax/Q2/i$a;)Z

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lcom/voxdon/xplorer/shizuku/c;->A()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_40

    .line 63
    .line 64
    goto :goto_4d

    .line 65
    :cond_40
    new-instance v0, Lax/d3/E$s0;

    .line 66
    .line 67
    check-cast p1, Lax/c3/k;

    .line 68
    .line 69
    invoke-direct {v0, p0, p1}, Lax/d3/E$s0;-><init>(Lax/d3/E;Lax/c3/k;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    new-array p1, p1, [Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 76
    .line 77
    .line 78
    :cond_4d
    :goto_4d
    return-void
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

.method private Q8(Lcom/voxdon/xplorer/file/y;)V
    .registers 6

    .line 1
    const-string v0, "com.android.documentsui"

    .line 2
    .line 3
    const-string v1, "com.google.android.documentsui"

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v2, p1}, Lcom/voxdon/xplorer/file/g;->m(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :try_start_10
    new-instance v2, Landroid/content/Intent;

    .line 18
    .line 19
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lax/X2/Q;->L0()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_2b

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3, v1}, Lax/u3/B;->L(Landroid/content/Context;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2b

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    goto :goto_38

    .line 42
    :catch_29
    move-exception p1

    .line 43
    goto :goto_4b

    .line 44
    :cond_2b
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v0}, Lax/u3/B;->L(Landroid/content/Context;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_38

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    :cond_38
    :goto_38
    const-string v0, "android.intent.action.VIEW"

    .line 58
    .line 59
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string v0, "vnd.android.document/root"

    .line 63
    .line 64
    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    const/high16 p1, 0x8000000

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v2}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_4a} :catch_29

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_4b
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 77
    .line 78
    .line 79
    return-void
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

.method public static synthetic R4(Lax/d3/E;ZLandroid/os/Bundle;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "result_selection"

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-ne p2, v1, :cond_d

    .line 12
    .line 13
    goto :goto_1b

    .line 14
    :cond_d
    if-eqz p2, :cond_34

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-eq p2, v0, :cond_2e

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    if-eq p2, v0, :cond_28

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    if-eq p2, v0, :cond_22

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    if-eq p2, v0, :cond_1c

    .line 27
    .line 28
    :goto_1b
    return-void

    .line 29
    :cond_1c
    sget-object p2, Lax/c3/V;->g0:Lax/c3/V;

    .line 30
    .line 31
    invoke-virtual {p0, p2, p1}, Lax/d3/E;->p8(Lax/c3/V;Z)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    sget-object p2, Lax/c3/V;->f0:Lax/c3/V;

    .line 36
    .line 37
    invoke-virtual {p0, p2, p1}, Lax/d3/E;->p8(Lax/c3/V;Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    sget-object p2, Lax/c3/V;->e0:Lax/c3/V;

    .line 42
    .line 43
    invoke-virtual {p0, p2, p1}, Lax/d3/E;->p8(Lax/c3/V;Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    sget-object p2, Lax/c3/V;->d0:Lax/c3/V;

    .line 48
    .line 49
    invoke-virtual {p0, p2, p1}, Lax/d3/E;->p8(Lax/c3/V;Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    sget-object p2, Lax/c3/V;->c0:Lax/c3/V;

    .line 54
    .line 55
    invoke-virtual {p0, p2, p1}, Lax/d3/E;->p8(Lax/c3/V;Z)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method static synthetic R5(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->Q6()V

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

.method private R6()V
    .registers 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/d3/E;->O1:I

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lax/d3/E;->V1:J

    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 12
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

.method private R8(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->J6(Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {p0, v0, v1, v1, p1}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

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
.end method

.method public static synthetic S4(Lax/d3/E;Landroid/os/Bundle;)V
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
    invoke-virtual {p0}, Lax/d3/n;->I3()V

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

.method static synthetic S5(Lax/d3/E;)Landroid/widget/AbsListView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

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

.method private S8(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_folder"

    .line 6
    .line 7
    const-string v2, "open_with"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

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
    const/4 v0, 0x0

    .line 31
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2b

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_35

    .line 49
    .line 50
    invoke-direct {p0, p1}, Lax/d3/E;->F8(Lcom/voxdon/xplorer/file/n;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    invoke-static {p1}, Lax/c3/B;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_41

    .line 59
    .line 60
    check-cast p1, Lcom/voxdon/xplorer/file/i;

    .line 61
    .line 62
    invoke-direct {p0, p1}, Lax/d3/E;->w8(Lcom/voxdon/xplorer/file/i;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    invoke-static {p1}, Lax/c3/A;->G(Lcom/voxdon/xplorer/file/n;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_4f

    .line 71
    .line 72
    invoke-direct {p0, p1}, Lax/d3/E;->D9(Lcom/voxdon/xplorer/file/n;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-direct {p0, p1, v0}, Lax/d3/E;->I8(Lcom/voxdon/xplorer/file/n;Z)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_4f
    new-instance v0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Lax/d3/E$K;

    .line 93
    .line 94
    invoke-direct {v2, p0, p1}, Lax/d3/E$K;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1, v0, v2}, Lax/d3/n;->f3(Lcom/voxdon/xplorer/file/o;Ljava/util/List;Lax/d3/n$p;)V

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
.end method

.method private S9(Ljava/lang/Throwable;Z)V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/d3/E;->ka(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/d3/E;->R0:Landroid/widget/TextView;

    .line 6
    .line 7
    const v1, 0x7f130149

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_23

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    sget-object v0, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 20
    .line 21
    if-ne p2, v0, :cond_23

    .line 22
    .line 23
    iget-object p2, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 24
    .line 25
    if-nez p2, :cond_23

    .line 26
    .line 27
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 28
    .line 29
    const p2, 0x7f130345

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    instance-of p2, p1, Lax/b3/e;

    .line 37
    .line 38
    const v0, 0x7f130139

    .line 39
    .line 40
    .line 41
    if-eqz p2, :cond_df

    .line 42
    .line 43
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_6b

    .line 52
    .line 53
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    const-string v1, "Debug Mode : Loading Error : Access Denied"

    .line 62
    .line 63
    invoke-virtual {p2, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 72
    .line 73
    .line 74
    iget-object p2, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, " : "

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    goto :goto_70

    .line 108
    :cond_6b
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 111
    .line 112
    .line 113
    :goto_70
    iget-object p1, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 114
    .line 115
    if-eqz p1, :cond_de

    .line 116
    .line 117
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    const/16 p2, 0x8

    .line 122
    .line 123
    if-eqz p1, :cond_d9

    .line 124
    .line 125
    iget-object p1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 126
    .line 127
    instance-of v0, p1, Lcom/voxdon/xplorer/file/y;

    .line 128
    .line 129
    if-eqz v0, :cond_d9

    .line 130
    .line 131
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_d9

    .line 138
    .line 139
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Lcom/voxdon/xplorer/shizuku/c;->C()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    const/4 v0, 0x0

    .line 148
    if-eqz p1, :cond_ad

    .line 149
    .line 150
    iget-object p1, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 156
    .line 157
    const p2, 0x7f1302ed

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 164
    .line 165
    new-instance p2, Lax/d3/E$Y;

    .line 166
    .line 167
    invoke-direct {p2, p0}, Lax/d3/E$Y;-><init>(Lax/d3/E;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_ad
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, Lax/X2/J;->D(Landroid/content/Context;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_bd

    .line 183
    .line 184
    iget-object p1, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_bd
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    sget-object p2, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 195
    .line 196
    if-eq p1, p2, :cond_de

    .line 197
    .line 198
    iget-object p1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 199
    .line 200
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 201
    .line 202
    iget-object p2, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 203
    .line 204
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    iget-object p2, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 208
    .line 209
    new-instance v0, Lax/d3/E$Z;

    .line 210
    .line 211
    invoke-direct {v0, p0, p1}, Lax/d3/E$Z;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/y;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_d9
    iget-object p1, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 219
    .line 220
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    :cond_de
    return-void

    .line 224
    :cond_df
    instance-of p2, p1, Lax/b3/t;

    .line 225
    .line 226
    if-eqz p2, :cond_f8

    .line 227
    .line 228
    invoke-static {}, Lax/X2/P;->a()Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_ef

    .line 233
    .line 234
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 235
    .line 236
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_ef
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 241
    .line 242
    const p2, 0x7f130143

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :cond_f8
    instance-of p2, p1, Lax/b3/g;

    .line 250
    .line 251
    if-eqz p2, :cond_105

    .line 252
    .line 253
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 254
    .line 255
    const p2, 0x7f1301af

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_105
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-static {p2}, Lax/Q2/f;->n0(Lax/Q2/f;)Z

    .line 267
    .line 268
    .line 269
    move-result p2

    .line 270
    const-string v0, "\n"

    .line 271
    .line 272
    if-eqz p2, :cond_17d

    .line 273
    .line 274
    const p2, 0x7f13013b

    .line 275
    .line 276
    .line 277
    if-eqz p1, :cond_177

    .line 278
    .line 279
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-static {v1}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_177

    .line 288
    .line 289
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    const-string v2, "Debug Mode : Loading Error : Check network"

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v1, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 308
    .line 309
    .line 310
    new-instance v1, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string p2, ":\n"

    .line 323
    .line 324
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-eqz v1, :cond_171

    .line 343
    .line 344
    new-instance v1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p2

    .line 370
    :cond_171
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 371
    .line 372
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    :cond_177
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 377
    .line 378
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :cond_17d
    if-eqz p1, :cond_1c4

    .line 383
    .line 384
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    invoke-static {p2}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 389
    .line 390
    .line 391
    move-result p2

    .line 392
    if-eqz p2, :cond_1c4

    .line 393
    .line 394
    new-instance p2, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    .line 398
    .line 399
    const-string v1, "Cause:"

    .line 400
    .line 401
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    if-eqz v1, :cond_1be

    .line 420
    .line 421
    new-instance v1, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p2

    .line 447
    :cond_1be
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 448
    .line 449
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :cond_1c4
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 454
    .line 455
    const-string p2, ""

    .line 456
    .line 457
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    .line 459
    .line 460
    return-void
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

.method static synthetic T4(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->L8()V

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

.method static synthetic T5(Lax/d3/E;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->ka(Z)V

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

.method private T6()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1b

    .line 9
    .line 10
    iget-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/voxdon/xplorer/widget/a$c;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/voxdon/xplorer/widget/a$c;->t()V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_1

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

.method private T8()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/d3/E;->L1:Z

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

.method static synthetic U4(Lax/d3/E;)Landroid/widget/EditText;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

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

.method static synthetic U5(Lax/d3/E;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->x1:Z

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

.method private U7(Lax/W2/e$e;)Z
    .registers 3

    .line 1
    iget-object p1, p1, Lax/W2/e$e;->c:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-eqz p1, :cond_1a

    .line 4
    .line 5
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    if-eqz v0, :cond_1a

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1a

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return p1
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

.method private U9(Ljava/lang/String;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->O(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_b

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lax/d3/E;->Z9(I)V

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

.method static synthetic V4(Lax/d3/E;)Lax/t3/i;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->I0:Lax/t3/i;

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

.method static synthetic V5(Lax/d3/E;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->R0:Landroid/widget/TextView;

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

.method private V6()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 8
    .line 9
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/o3/e;->a()V

    .line 14
    .line 15
    .line 16
    const-wide/16 v0, -0x1

    .line 17
    .line 18
    iput-wide v0, p0, Lax/d3/E;->k1:J

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_20

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FileObserverService;->b(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    :cond_20
    invoke-static {}, Lax/o3/b;->j()Lax/o3/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lax/o3/b;->n()V

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

.method private V7()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-le v0, v1, :cond_a

    .line 9
    .line 10
    return v1

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

.method static synthetic W4(Lax/d3/E;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->f7(Ljava/lang/String;)V

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

.method static synthetic W5(Lax/d3/E;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

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

.method private W6(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lax/d3/E;->X9(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "menu_folder"

    .line 21
    .line 22
    const-string v3, "compress"

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "loc"

    .line 37
    .line 38
    invoke-virtual {v1, v3, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "type"

    .line 43
    .line 44
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lax/W2/k;->n()Lax/W2/k;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lax/d3/E$A;

    .line 60
    .line 61
    invoke-direct {v2, p0}, Lax/d3/E$A;-><init>(Lax/d3/E;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, p1, v2}, Lax/W2/k;->k(Lcom/voxdon/xplorer/file/o;Ljava/util/List;Lax/W2/h$a;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lax/W2/k;->l()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lax/a3/m;->m3(Ljava/lang/String;)Lax/a3/m;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance v1, Lax/d3/E$B;

    .line 76
    .line 77
    invoke-direct {v1, p0, v0}, Lax/d3/E$B;-><init>(Lax/d3/E;Lax/W2/k;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1}, Lax/a3/m;->p3(Lax/a3/m$f;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "compressFileName"

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    invoke-virtual {p0, p1, v0, v1}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    return-void
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

.method private W7()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

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
    return v1

    .line 9
    :cond_8
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->h0()Lax/x3/A;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_16

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/x3/d;->k()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_16
    return v1
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

.method static synthetic X4(Lax/d3/E;)Lcom/voxdon/xplorer/file/n;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

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

.method static synthetic X5(Lax/d3/E;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->T0:Landroid/widget/TextView;

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

.method public static X7(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Z
    .registers 8

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    invoke-static {p0}, Lax/t3/j;->C(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    invoke-static {p1, v1}, Lax/c3/A;->B(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1a

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1a
    invoke-static {p0}, Lax/t3/j;->D(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_27

    .line 32
    .line 33
    invoke-static {p1}, Lax/c3/A;->C(Lcom/voxdon/xplorer/file/n;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_27

    .line 38
    .line 39
    return v2

    .line 40
    :cond_27
    invoke-static {p0}, Lax/t3/j;->E(Landroid/content/Context;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_34

    .line 45
    .line 46
    invoke-static {p1}, Lax/c3/A;->D(Lcom/voxdon/xplorer/file/n;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_34

    .line 51
    .line 52
    return v2

    .line 53
    :cond_34
    invoke-static {p0}, Lax/t3/j;->F(Landroid/content/Context;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_41

    .line 58
    .line 59
    invoke-static {p1}, Lax/c3/A;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_41

    .line 64
    .line 65
    return v2

    .line 66
    :cond_41
    invoke-static {p1}, Lax/c3/A;->p(Lcom/voxdon/xplorer/file/n;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_48

    .line 71
    .line 72
    return v2

    .line 73
    :cond_48
    invoke-static {}, Lax/X2/Q;->H1()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_55

    .line 78
    .line 79
    invoke-static {p1}, Lax/c3/A;->Q(Lcom/voxdon/xplorer/file/n;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_55

    .line 84
    .line 85
    return v2

    .line 86
    :cond_55
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v3, "application/octet-stream"

    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_6a

    .line 97
    .line 98
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_68

    .line 103
    .line 104
    goto :goto_6a

    .line 105
    :cond_68
    const/4 v4, 0x0

    .line 106
    goto :goto_6f

    .line 107
    :cond_6a
    :goto_6a
    invoke-static {p1, v3}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const/4 v4, 0x1

    .line 112
    :goto_6f
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_7c

    .line 117
    .line 118
    invoke-static {p0, p1}, Lax/c3/B;->C(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_7c

    .line 123
    .line 124
    return v1

    .line 125
    :cond_7c
    invoke-static {p0, p1, v0, v2}, Lax/c3/w;->a(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_83

    .line 130
    .line 131
    return v2

    .line 132
    :cond_83
    if-nez v4, :cond_98

    .line 133
    .line 134
    invoke-static {p1, v3}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v0, :cond_98

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_98

    .line 145
    .line 146
    invoke-static {p0, p1, v3, v2}, Lax/c3/w;->a(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_98

    .line 151
    .line 152
    return v2

    .line 153
    :cond_98
    return v1
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

.method private X8()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 4
    .line 5
    if-ne v0, v1, :cond_4f

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->isInTouchMode()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4f

    .line 12
    .line 13
    iget-boolean v0, p0, Lax/d3/E;->R1:Z

    .line 14
    .line 15
    if-nez v0, :cond_4f

    .line 16
    .line 17
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_19

    .line 24
    .line 25
    goto :goto_4f

    .line 26
    :cond_19
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, -0x1

    .line 33
    if-ne v0, v1, :cond_23

    .line 34
    .line 35
    goto :goto_4f

    .line 36
    :cond_23
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget-object v2, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 43
    .line 44
    sub-int v1, v0, v1

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_34

    .line 51
    .line 52
    goto :goto_4f

    .line 53
    :cond_34
    const/4 v2, 0x1

    .line 54
    iput-boolean v2, p0, Lax/d3/E;->R1:Z

    .line 55
    .line 56
    iput v0, p0, Lax/d3/E;->S1:I

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lax/d3/E;->T1:I

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lax/d3/E;->U1:I

    .line 69
    .line 70
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 71
    .line 72
    new-instance v1, Lax/d3/E$P;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lax/d3/E$P;-><init>(Lax/d3/E;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 78
    .line 79
    .line 80
    :cond_4f
    :goto_4f
    return-void
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

.method private X9(Lax/c3/K;)Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, v1}, Lcom/voxdon/xplorer/file/x;->C1(Landroid/content/Context;Lax/c3/K;Lcom/voxdon/xplorer/file/y;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_12

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-virtual {p0, v0, p1, v1, v2}, Lax/d3/E;->o9(ILax/c3/K;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    return v2
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic Y4(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

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

.method static synthetic Y5(Lax/d3/E;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/E;->H1:Z

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

.method private Y6()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

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
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_11

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/d3/E;->h9()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-virtual {p0}, Lax/d3/E;->X6()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static synthetic Z4(Lax/d3/E;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/E;->o1:Z

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

.method static synthetic Z5(Lax/d3/E;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->P0:Ljava/lang/String;

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

.method private Z6(Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;
    .registers 11

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->o1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_40

    .line 5
    .line 6
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/voxdon/xplorer/widget/a;->P()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, -0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, -0x1

    .line 17
    :goto_10
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-ge v4, v6, :cond_2e

    .line 22
    .line 23
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lcom/voxdon/xplorer/file/n;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_2b

    .line 42
    .line 43
    move v5, v4

    .line 44
    :cond_2b
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_10

    .line 47
    :cond_2e
    if-ne v5, v3, :cond_3c

    .line 48
    .line 49
    new-instance v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :goto_38
    move-object v5, v0

    .line 58
    move-object v6, v2

    .line 59
    const/4 v7, 0x0

    .line 60
    goto :goto_4d

    .line 61
    :cond_3c
    move-object v6, v2

    .line 62
    move v7, v5

    .line 63
    move-object v5, v0

    .line 64
    goto :goto_4d

    .line 65
    :cond_40
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v2, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_38

    .line 78
    :goto_4d
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const/4 v8, 0x1

    .line 87
    invoke-static/range {v3 .. v8}, Lax/c3/w;->c(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Ljava/util/List;IZ)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
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

.method private Z7(I)Z
    .registers 3

    .line 1
    const v0, 0x7f0a02ee

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_12

    .line 5
    .line 6
    const v0, 0x7f0a02ec

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_12

    .line 10
    .line 11
    const v0, 0x7f0a02ed

    .line 12
    .line 13
    .line 14
    if-ne p1, v0, :cond_10

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_12
    :goto_12
    const/4 p1, 0x1

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method private Z9(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    div-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    iget-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 10
    .line 11
    instance-of v2, v1, Landroid/widget/ListView;

    .line 12
    .line 13
    if-nez v2, :cond_25

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->isInTouchMode()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_15

    .line 20
    .line 21
    goto :goto_25

    .line 22
    :cond_15
    iget-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 28
    .line 29
    new-instance v1, Lax/d3/E$m;

    .line 30
    .line 31
    invoke-direct {v1, p0, v0}, Lax/d3/E$m;-><init>(Lax/d3/E;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    :goto_25
    iget-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 39
    .line 40
    invoke-virtual {v1, p1, v0}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

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

.method static synthetic a5(Lax/d3/E;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->o1:Z

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

.method static synthetic a6(Lax/d3/E;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->P0:Ljava/lang/String;

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

.method private a9(I)Z
    .registers 13

    .line 1
    int-to-char p1, p1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, -0x1

    .line 18
    if-ltz v3, :cond_18

    .line 19
    .line 20
    iget v5, p0, Lax/d3/E;->O1:I

    .line 21
    .line 22
    if-ne v5, v3, :cond_18

    .line 23
    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 v3, -0x1

    .line 26
    :goto_19
    iget-object v5, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->length()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x1

    .line 33
    const/4 v7, 0x0

    .line 34
    if-ne v5, v6, :cond_40

    .line 35
    .line 36
    iget-object v5, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 37
    .line 38
    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-ne v5, p1, :cond_40

    .line 43
    .line 44
    if-ltz v3, :cond_40

    .line 45
    .line 46
    iget-object v4, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 47
    .line 48
    add-int/lit8 v5, v3, 0x1

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v4, v5, v8}, Lcom/voxdon/xplorer/widget/a;->M(ILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ltz v4, :cond_40

    .line 59
    .line 60
    iget-object v5, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 61
    .line 62
    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 63
    .line 64
    .line 65
    :cond_40
    if-gez v4, :cond_89

    .line 66
    .line 67
    if-gez v3, :cond_45

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    :cond_45
    iget-wide v4, p0, Lax/d3/E;->V1:J

    .line 71
    .line 72
    const-wide/16 v8, 0xbb8

    .line 73
    .line 74
    sub-long v8, v0, v8

    .line 75
    .line 76
    cmp-long v10, v4, v8

    .line 77
    .line 78
    if-gez v10, :cond_55

    .line 79
    .line 80
    iget-object v3, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 81
    .line 82
    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 83
    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    :cond_55
    iget-object v4, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 87
    .line 88
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v4, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v4, v3, v2}, Lcom/voxdon/xplorer/widget/a;->M(ILjava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-gez v4, :cond_89

    .line 105
    .line 106
    iget-object v2, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_89

    .line 113
    .line 114
    iget-wide v2, p0, Lax/d3/E;->V1:J

    .line 115
    .line 116
    const-wide/16 v8, 0x5dc

    .line 117
    .line 118
    sub-long/2addr v0, v8

    .line 119
    cmp-long v5, v2, v0

    .line 120
    .line 121
    if-gez v5, :cond_89

    .line 122
    .line 123
    iget-object v0, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 124
    .line 125
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 129
    .line 130
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v7, v1}, Lcom/voxdon/xplorer/widget/a;->M(ILjava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    :cond_89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    iput-wide v0, p0, Lax/d3/E;->V1:J

    .line 143
    .line 144
    if-ltz v4, :cond_9c

    .line 145
    .line 146
    invoke-direct {p0, v4}, Lax/d3/E;->Z9(I)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lax/d3/E;->W1:Ljava/lang/StringBuffer;

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 152
    .line 153
    .line 154
    iput v4, p0, Lax/d3/E;->O1:I

    .line 155
    .line 156
    return v6

    .line 157
    :cond_9c
    return v7
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
.end method

.method static synthetic b5(Lax/d3/E;)Lax/x3/d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->Y0:Lax/x3/d;

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

.method static synthetic b6(Lax/d3/E;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->V7()Z

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

.method private b7(Ljava/util/List;I)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

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
    iget-boolean v1, p0, Lax/d3/E;->H1:Z

    .line 13
    .line 14
    if-eqz v1, :cond_29

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, "-analysis"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_31

    .line 42
    :cond_29
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_31
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "menu_folder"

    .line 55
    .line 56
    const-string v4, "delete"

    .line 57
    .line 58
    invoke-virtual {v2, v3, v4}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, "loc"

    .line 63
    .line 64
    invoke-virtual {v2, v3, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "type"

    .line 69
    .line 70
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, p2}, Lax/d3/E;->c7(Ljava/util/List;I)V

    .line 78
    .line 79
    .line 80
    return-void
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

.method private ba(Lcom/voxdon/xplorer/file/n;Z)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/d3/E;->t1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-static {}, Lax/a3/J;->i3()Lax/a3/J;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "open_as"

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, p1, v0, v1}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    new-instance p1, Lax/d3/B;

    .line 14
    .line 15
    invoke-direct {p1, p0, p2}, Lax/d3/B;-><init>(Lax/d3/E;Z)V

    .line 16
    .line 17
    .line 18
    const-string p2, "request_open_as"

    .line 19
    .line 20
    invoke-static {p0, p2, p1}, Lax/d3/J;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/util/function/Consumer;)V

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
.end method

.method static synthetic c5(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->g9()V

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

.method static synthetic c6()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lax/d3/E;->r2:Ljava/util/logging/Logger;

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

.method static synthetic d5(Lax/d3/E;)Lax/u/w;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->Z0:Lax/u/w;

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

.method static synthetic d6(Lax/d3/E;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->c2:Ljava/lang/String;

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

.method private d8(Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)Z
    .registers 12

    .line 1
    iget v0, p0, Lax/d3/E;->P1:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    if-ne v0, v3, :cond_16

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne v0, v3, :cond_e

    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    iput v0, p0, Lax/d3/E;->P1:I

    .line 16
    .line 17
    iput v0, p0, Lax/d3/E;->Q1:I

    .line 18
    .line 19
    invoke-virtual {p1, v0, v2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :cond_16
    iget v0, p0, Lax/d3/E;->Q1:I

    .line 24
    .line 25
    :goto_18
    add-int/2addr p2, v0

    .line 26
    if-ltz p2, :cond_58

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getCount()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-lt p2, v3, :cond_22

    .line 33
    .line 34
    goto :goto_58

    .line 35
    :cond_22
    iget v3, p0, Lax/d3/E;->P1:I

    .line 36
    .line 37
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget v4, p0, Lax/d3/E;->P1:I

    .line 42
    .line 43
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget v4, p0, Lax/d3/E;->P1:I

    .line 48
    .line 49
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    iget v5, p0, Lax/d3/E;->P1:I

    .line 54
    .line 55
    invoke-static {v5, p2}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    move v6, v3

    .line 60
    :goto_3b
    if-gt v6, v0, :cond_47

    .line 61
    .line 62
    if-lt v6, v4, :cond_41

    .line 63
    .line 64
    if-le v6, v5, :cond_44

    .line 65
    .line 66
    :cond_41
    invoke-virtual {p1, v6, v1}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 67
    .line 68
    .line 69
    :cond_44
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    goto :goto_3b

    .line 72
    :cond_47
    :goto_47
    if-gt v4, v5, :cond_53

    .line 73
    .line 74
    if-lt v4, v3, :cond_4d

    .line 75
    .line 76
    if-le v4, v0, :cond_50

    .line 77
    .line 78
    :cond_4d
    invoke-virtual {p1, v4, v2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 79
    .line 80
    .line 81
    :cond_50
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_47

    .line 84
    :cond_53
    iput p2, p0, Lax/d3/E;->Q1:I

    .line 85
    .line 86
    invoke-direct {p0, p1, p2, p3, p4}, Lax/d3/E;->e8(Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)V

    .line 87
    .line 88
    .line 89
    :cond_58
    :goto_58
    return v2
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

.method private d9()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->o1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_27

    .line 4
    .line 5
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_14

    .line 19
    .line 20
    goto :goto_20

    .line 21
    :cond_14
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-int v2, v1, v2

    .line 32
    .line 33
    :goto_20
    iget-object v1, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 34
    .line 35
    iget-object v3, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    invoke-virtual {v1, v3, v0, v2}, Lax/V2/c;->f(Lcom/voxdon/xplorer/file/n;II)V

    .line 38
    .line 39
    .line 40
    :cond_27
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

.method static synthetic e5(Lax/d3/E;)Lax/u/w;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->a1:Lax/u/w;

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

.method static synthetic e6(Lax/d3/E;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->c2:Ljava/lang/String;

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

.method private e8(Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)V
    .registers 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v1, Landroid/widget/GridView;

    .line 8
    .line 9
    if-eqz v3, :cond_75

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x0

    .line 24
    if-lt v2, v4, :cond_2c

    .line 25
    .line 26
    if-gt v2, v5, :cond_2c

    .line 27
    .line 28
    sub-int v4, v2, v4

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_55

    .line 35
    .line 36
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    goto :goto_56

    .line 45
    :cond_2c
    if-le v2, v5, :cond_55

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-lez v4, :cond_55

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/lit8 v3, v3, -0x1

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    sub-int/2addr v5, v7

    .line 80
    sub-int/2addr v5, v4

    .line 81
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    goto :goto_56

    .line 86
    :cond_55
    const/4 v4, 0x0

    .line 87
    :goto_56
    if-nez v4, :cond_66

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-lez v5, :cond_66

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    :cond_66
    iget-boolean v5, v0, Lax/d3/E;->R1:Z

    .line 104
    .line 105
    if-eqz v5, :cond_71

    .line 106
    .line 107
    iput v2, v0, Lax/d3/E;->S1:I

    .line 108
    .line 109
    iput v3, v0, Lax/d3/E;->T1:I

    .line 110
    .line 111
    iput v4, v0, Lax/d3/E;->U1:I

    .line 112
    .line 113
    return-void

    .line 114
    :cond_71
    invoke-virtual {v1, v2, v3}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_75
    new-instance v6, Landroid/view/KeyEvent;

    .line 119
    .line 120
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getDownTime()J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getEventTime()J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getAction()I

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getScanCode()I

    .line 141
    .line 142
    .line 143
    move-result v16

    .line 144
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getFlags()I

    .line 145
    .line 146
    .line 147
    move-result v17

    .line 148
    invoke-virtual/range {p4 .. p4}, Landroid/view/KeyEvent;->getSource()I

    .line 149
    .line 150
    .line 151
    move-result v18

    .line 152
    const/4 v14, 0x0

    .line 153
    move/from16 v12, p3

    .line 154
    .line 155
    invoke-direct/range {v6 .. v18}, Landroid/view/KeyEvent;-><init>(JJIIIIIIII)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v12, v6}, Landroid/widget/AbsListView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 159
    .line 160
    .line 161
    return-void
    .line 162
.end method

.method private ea(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_19

    .line 2
    .line 3
    iget-object p1, p0, Lax/d3/E;->H0:Landroid/view/View;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/E;->I0:Lax/t3/i;

    .line 10
    .line 11
    invoke-virtual {p1}, Lax/t3/i;->g()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/d3/E;->G0:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    iget-object v0, p0, Lax/d3/E;->I0:Lax/t3/i;

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
    iget-object p1, p0, Lax/d3/E;->H0:Landroid/view/View;

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

.method static synthetic f5(Lax/d3/E;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->A9(Z)V

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

.method static synthetic f6(Lax/d3/E;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->d2:Ljava/lang/String;

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

.method private f7(Ljava/lang/String;)V
    .registers 10

    .line 1
    if-eqz p1, :cond_19

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_19

    .line 8
    .line 9
    invoke-direct {p0}, Lax/d3/E;->L6()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lax/d3/E;->C3()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v6, -0x1

    .line 17
    const/4 v7, -0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v3, p1

    .line 22
    invoke-direct/range {v1 .. v7}, Lax/d3/E;->M8(Ljava/lang/String;Ljava/lang/String;Lax/Z2/p;Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    move-object v1, p0

    .line 27
    :goto_1a
    iget-object p1, v1, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 28
    .line 29
    const-string v0, ""

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v1, Lax/d3/E;->y1:Landroid/view/MenuItem;

    .line 35
    .line 36
    invoke-interface {p1}, Landroid/view/MenuItem;->collapseActionView()Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "input_method"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 50
    .line 51
    iget-object v0, v1, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-virtual {p1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private f9(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
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
    return-void

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lax/Q2/f;->Y(Lax/Q2/f;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    const v2, 0x7f130137

    .line 18
    .line 19
    .line 20
    if-nez v0, :cond_35

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v0, "Invalid quick share location:"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2, v1}, Lax/d3/n;->E4(II)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    invoke-static {}, Lcom/voxdon/xplorer/sharing/QuickShareProvider;->c()Lcom/voxdon/xplorer/sharing/QuickShareProvider;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_3f

    .line 59
    .line 60
    invoke-virtual {p0, v2, v1}, Lax/d3/n;->E4(II)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3f
    new-instance v0, Lax/d3/E$o0;

    .line 65
    .line 66
    invoke-direct {v0, p0, p1}, Lax/d3/E$o0;-><init>(Lax/d3/E;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    new-array p1, p1, [Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

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

.method static synthetic g5(Lax/d3/E;Landroid/view/Menu;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/E;->G6(Landroid/view/Menu;Z)V

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

.method static synthetic g6(Lax/d3/E;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/E;->J0:Z

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

.method private g7(Lcom/voxdon/xplorer/file/n;ZLandroid/content/Intent;)V
    .registers 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lax/d3/E$N;

    .line 14
    .line 15
    invoke-direct {v2, p0, p3, p1, p2}, Lax/d3/E$N;-><init>(Lax/d3/E;Landroid/content/Intent;Lcom/voxdon/xplorer/file/n;Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1, v0, v2}, Lax/d3/n;->f3(Lcom/voxdon/xplorer/file/o;Ljava/util/List;Lax/d3/n$p;)V

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

.method private g8()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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
.end method

.method private g9()V
    .registers 4

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
    if-eqz v1, :cond_2a

    .line 10
    .line 11
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/x3/d;->k()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_15

    .line 18
    .line 19
    invoke-direct {p0}, Lax/d3/E;->X8()V

    .line 20
    .line 21
    .line 22
    :cond_15
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lax/x3/d;->y(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 28
    .line 29
    invoke-virtual {v0}, Lax/x3/d;->A()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 33
    .line 34
    new-instance v1, Lax/d3/E$Q;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lax/d3/E$Q;-><init>(Lax/d3/E;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    invoke-direct {p0}, Lax/d3/E;->W7()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_37

    .line 48
    .line 49
    invoke-direct {p0}, Lax/d3/E;->q7()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ltz v0, :cond_37

    .line 54
    .line 55
    goto :goto_38

    .line 56
    :cond_37
    const/4 v0, -0x1

    .line 57
    :goto_38
    iget-object v1, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/voxdon/xplorer/widget/PathBar;->getParentButtonId()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 84
    .line 85
    const/16 v1, 0x8

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lax/x3/d;->y(I)V

    .line 88
    .line 89
    .line 90
    return-void
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

.method private ga(Lax/W2/e$e;)V
    .registers 6

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
    return-void

    .line 8
    :cond_7
    if-nez p1, :cond_d

    .line 9
    .line 10
    invoke-static {}, Lax/u3/b;->f()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    new-instance v0, Lax/s/c;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const v2, 0x7f14012a

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lax/x3/x;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Lax/x3/x;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1}, Lax/d3/E;->U7(Lax/W2/e$e;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_32

    .line 36
    .line 37
    new-instance v0, Lax/d3/E$V;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1}, Lax/d3/E$V;-><init>(Lax/d3/E;Lax/W2/e$e;)V

    .line 40
    .line 41
    .line 42
    const v2, 0x7f0801a9

    .line 43
    .line 44
    .line 45
    const v3, 0x7f1302a6

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2, v3, v0}, Lax/x3/x;->b(IILandroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    :cond_32
    iget-boolean v0, p1, Lax/W2/e$e;->a:Z

    .line 52
    .line 53
    if-eqz v0, :cond_4e

    .line 54
    .line 55
    iget-object v0, p1, Lax/W2/e$e;->b:Lcom/voxdon/xplorer/file/o;

    .line 56
    .line 57
    if-eqz v0, :cond_4e

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4e

    .line 64
    .line 65
    new-instance v0, Lax/d3/E$W;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Lax/d3/E$W;-><init>(Lax/d3/E;Lax/W2/e$e;)V

    .line 68
    .line 69
    .line 70
    const v2, 0x7f080179

    .line 71
    .line 72
    .line 73
    const v3, 0x7f13027c

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2, v3, v0}, Lax/x3/x;->b(IILandroid/view/View$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :cond_4e
    iget-object v0, p1, Lax/W2/e$e;->b:Lcom/voxdon/xplorer/file/o;

    .line 80
    .line 81
    if-eqz v0, :cond_55

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 84
    .line 85
    .line 86
    :cond_55
    iget-object v0, p0, Lax/d3/E;->V0:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/16 v3, 0x8

    .line 93
    .line 94
    invoke-static {v2, v3}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    neg-int v2, v2

    .line 99
    new-instance v3, Lax/d3/E$X;

    .line 100
    .line 101
    invoke-direct {v3, p0, p1}, Lax/d3/E$X;-><init>(Lax/d3/E;Lax/W2/e$e;)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    invoke-virtual {v1, v0, p1, v2, v3}, Lax/x3/x;->c(Landroid/view/View;IILandroid/widget/PopupWindow$OnDismissListener;)V

    .line 106
    .line 107
    .line 108
    return-void
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

.method static synthetic h5(Lax/d3/E;)Landroid/view/MenuItem;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->y1:Landroid/view/MenuItem;

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

.method static synthetic h6(Lax/d3/E;Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->H9(Ljava/util/List;)V

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

.method private h7(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/E;->C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/PathBar;->setActionButtonEnabled(Z)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method private ha(Lcom/voxdon/xplorer/file/n;)V
    .registers 10

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
    return-void

    .line 8
    :cond_7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    const v0, 0x7f1302da

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v2, p0, Lax/d3/E;->U0:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 26
    .line 27
    new-instance v7, Lax/d3/E$u;

    .line 28
    .line 29
    invoke-direct {v7, p0, p1}, Lax/d3/E$u;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const v5, 0x7f1302b5

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static/range {v2 .. v7}, Lax/u3/B;->O(Landroid/view/View;Ljava/lang/CharSequence;IIZLandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Lax/d3/n;->D4(Lcom/google/android/material/snackbar/Snackbar;)V

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
.end method

.method static synthetic i5(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->P7()V

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

.method static synthetic i6(Lax/d3/E;)Ljava/util/Set;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->e2:Ljava/util/Set;

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

.method private i9()V
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
    goto :goto_21

    .line 8
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->c(Landroid/app/Activity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_21

    .line 17
    .line 18
    iget-object v1, p0, Lax/d3/E;->g2:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 19
    .line 20
    if-eqz v1, :cond_1a

    .line 21
    .line 22
    if-eq v1, v0, :cond_1a

    .line 23
    .line 24
    invoke-direct {p0}, Lax/d3/E;->oa()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iput-object v0, p0, Lax/d3/E;->g2:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 28
    .line 29
    iget-object v1, p0, Lax/d3/E;->m2:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->j(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 32
    .line 33
    .line 34
    :cond_21
    :goto_21
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

.method static synthetic j5(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->ra()V

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

.method static synthetic j6(Lax/d3/E;Lax/c3/K;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/E;->K9(Lax/c3/K;Ljava/lang/String;)V

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

.method private j7(Ljava/lang/String;)V
    .registers 6

    .line 1
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1f

    .line 6
    .line 7
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Open Not Normalized Path"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1f
    iget-object v0, p0, Lax/d3/E;->w1:Lax/d3/E$n0;

    .line 33
    .line 34
    if-eqz v0, :cond_2e

    .line 35
    .line 36
    invoke-virtual {v0}, Lax/u3/q;->isCancelled()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2e

    .line 41
    .line 42
    iget-object v0, p0, Lax/d3/E;->w1:Lax/d3/E$n0;

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/u3/q;->e()Z

    .line 45
    .line 46
    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_7e

    .line 52
    .line 53
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lax/Q2/f;->D0(Lax/Q2/f;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_7e

    .line 62
    .line 63
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "!! NOT CONNECT EXECUTE OPEN TASK !!"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "location: "

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v2, ","

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e1()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lax/d3/n;->S3()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 125
    .line 126
    .line 127
    :cond_7e
    new-instance v0, Lax/d3/E$n0;

    .line 128
    .line 129
    invoke-direct {v0, p0, p1}, Lax/d3/E$n0;-><init>(Lax/d3/E;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, Lax/d3/E;->w1:Lax/d3/E$n0;

    .line 133
    .line 134
    const/4 p1, 0x0

    .line 135
    new-array p1, p1, [Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 138
    .line 139
    .line 140
    return-void
    .line 141
    .line 142
    .line 143
.end method

.method private ja(Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->n0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_17

    .line 10
    .line 11
    invoke-static {p1}, Lax/c3/A;->u(Lcom/voxdon/xplorer/file/n;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0, p1, p2}, Lcom/voxdon/xplorer/service/FileObserverService;->a(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

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
.end method

.method static synthetic k5(Lax/d3/E;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->X1:Landroid/os/Handler;

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

.method static synthetic k6(Lax/d3/E;Lax/c3/K;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/E;->z9(Lax/c3/K;Ljava/lang/String;)V

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

.method private k7(Ljava/util/List;)V
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
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_folder"

    .line 6
    .line 7
    const-string v2, "extract"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

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
    const-string v3, "loc"

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lax/a3/x;

    .line 31
    .line 32
    invoke-direct {v0}, Lax/a3/x;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v1, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lax/d3/E;->q1:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_33

    .line 47
    .line 48
    invoke-static {}, Lax/u3/b;->f()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x1

    .line 57
    const/4 v5, 0x0

    .line 58
    if-ne v3, v4, :cond_48

    .line 59
    .line 60
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object v3, p0, Lax/d3/E;->r1:Ljava/lang/String;

    .line 71
    .line 72
    goto :goto_58

    .line 73
    :cond_48
    iget-object v3, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v3, p0, Lax/d3/E;->r1:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_58

    .line 82
    .line 83
    const-string p1, "Current Path is Null"

    .line 84
    .line 85
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    :goto_58
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const-string v6, "fileName"

    .line 100
    .line 101
    invoke-virtual {v1, v6, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string v3, "numArchiveFiles"

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual {v1, v3, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_78

    .line 118
    .line 119
    const/4 p1, 0x2

    .line 120
    goto :goto_81

    .line 121
    :cond_78
    invoke-static {p1}, Lax/c3/B;->D(Ljava/util/List;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_80

    .line 126
    .line 127
    const/4 p1, 0x0

    .line 128
    goto :goto_81

    .line 129
    :cond_80
    const/4 p1, 0x1

    .line 130
    :goto_81
    const-string v3, "showOption"

    .line 131
    .line 132
    invoke-virtual {v1, v3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->v2(Landroid/os/Bundle;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p0, v5}, Landroidx/fragment/app/Fragment;->D2(Landroidx/fragment/app/Fragment;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0, v2, v4}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    return-void
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
.end method

.method private ka(Z)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    if-eqz p1, :cond_f

    .line 4
    .line 5
    iget-object p1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/d3/E;->C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    iget-object p1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/d3/E;->C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

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
.end method

.method static synthetic l5(Lax/d3/E;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/E;->Z1:Z

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

.method static synthetic l6(Lax/d3/E;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->U9(Ljava/lang/String;)V

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

.method private l9()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lax/Z2/b;->v(Lcom/voxdon/xplorer/file/n;)V

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

.method private la(I)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/d3/E;->r9()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lax/Q2/f;->l1:Lax/Q2/f;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-ne v0, v1, :cond_2b

    .line 24
    .line 25
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 26
    .line 27
    iput-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 28
    .line 29
    iget-object v0, p0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 30
    .line 31
    iput-object v0, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 32
    .line 33
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 34
    .line 35
    iput-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 36
    .line 37
    const/16 v1, 0x14

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_9e

    .line 43
    .line 44
    :cond_2b
    if-nez p1, :cond_3d

    .line 45
    .line 46
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 47
    .line 48
    iput-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 49
    .line 50
    iget-object v0, p0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 51
    .line 52
    iput-object v0, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 53
    .line 54
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 55
    .line 56
    iput-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_9e

    .line 62
    :cond_3d
    const/4 v0, 0x1

    .line 63
    if-ne p1, v0, :cond_50

    .line 64
    .line 65
    iget-object v1, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 66
    .line 67
    iput-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 68
    .line 69
    iget-object v1, p0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 70
    .line 71
    iput-object v1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 72
    .line 73
    iget-object v1, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 74
    .line 75
    iput-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_9e

    .line 81
    :cond_50
    const/16 v0, 0xa

    .line 82
    .line 83
    if-ne p1, v0, :cond_64

    .line 84
    .line 85
    iget-object v1, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 86
    .line 87
    iput-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 88
    .line 89
    iget-object v1, p0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 90
    .line 91
    iput-object v1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 92
    .line 93
    iget-object v1, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 94
    .line 95
    iput-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_9e

    .line 101
    :cond_64
    const/4 v0, 0x2

    .line 102
    if-ne p1, v0, :cond_77

    .line 103
    .line 104
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 105
    .line 106
    iput-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 107
    .line 108
    iget-object v1, p0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 109
    .line 110
    iput-object v1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 111
    .line 112
    iget-object v1, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 113
    .line 114
    iput-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 117
    .line 118
    .line 119
    goto :goto_9e

    .line 120
    :cond_77
    const/16 v0, 0xc

    .line 121
    .line 122
    if-ne p1, v0, :cond_8b

    .line 123
    .line 124
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 125
    .line 126
    iput-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 127
    .line 128
    iget-object v1, p0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 129
    .line 130
    iput-object v1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 131
    .line 132
    iget-object v1, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 133
    .line 134
    iput-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 137
    .line 138
    .line 139
    goto :goto_9e

    .line 140
    :cond_8b
    const/16 v0, 0x10

    .line 141
    .line 142
    if-ne p1, v0, :cond_9e

    .line 143
    .line 144
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 145
    .line 146
    iput-object v1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 147
    .line 148
    iget-object v1, p0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 149
    .line 150
    iput-object v1, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 151
    .line 152
    iget-object v1, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 153
    .line 154
    iput-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 157
    .line 158
    .line 159
    :cond_9e
    :goto_9e
    iget-object v0, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 165
    .line 166
    iget-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 169
    .line 170
    .line 171
    iput p1, p0, Lax/d3/E;->O0:I

    .line 172
    .line 173
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/b;->i0()Landroid/graphics/Point;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 182
    .line 183
    invoke-direct {p0, p1}, Lax/d3/E;->y9(I)V

    .line 184
    .line 185
    .line 186
    return-void
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
.end method

.method static synthetic m5(Lax/d3/E;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/E;->Y1:Z

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

.method static synthetic m6(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->D8(Lcom/voxdon/xplorer/file/n;)V

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

.method private m9(Ljava/util/List;)V
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
    goto :goto_d

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    :goto_d
    return-void

    .line 15
    :cond_e
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "menu_folder"

    .line 24
    .line 25
    const-string v3, "rename"

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "loc"

    .line 40
    .line 41
    invoke-virtual {v1, v3, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "type"

    .line 46
    .line 47
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v2, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v5, Lax/d3/E$C;

    .line 61
    .line 62
    invoke-direct {v5, p0}, Lax/d3/E$C;-><init>(Lax/d3/E;)V

    .line 63
    .line 64
    .line 65
    new-instance v6, Lax/d3/E$D;

    .line 66
    .line 67
    invoke-direct {v6, p0}, Lax/d3/E$D;-><init>(Lax/d3/E;)V

    .line 68
    .line 69
    .line 70
    move-object v4, p0

    .line 71
    move-object v3, p1

    .line 72
    invoke-static/range {v1 .. v6}, Lax/W2/z;->o(Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;Lax/d3/s;Lax/W2/h$a;Lax/W2/z$c;)V

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

.method private ma(Ljava/util/List;)V
    .registers 4
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
    const/4 v1, 0x1

    .line 6
    if-ge v0, v1, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 15
    .line 16
    invoke-interface {p1}, Lax/c3/b;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    xor-int/2addr v0, v1

    .line 21
    invoke-direct {p0, p1, v0}, Lax/d3/E;->L7(Lcom/voxdon/xplorer/file/n;Z)V

    .line 22
    .line 23
    .line 24
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

.method static synthetic n5(Lax/d3/E;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->Y1:Z

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

.method static synthetic n6(Lax/d3/E;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->u9(Ljava/lang/String;)V

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

.method static synthetic o5(Lax/d3/E;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->n1:Ljava/lang/String;

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

.method static synthetic o6(Lax/d3/E;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/E;->l1:Ljava/lang/String;

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

.method private o7(Ljava/util/List;Z)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_9

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

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
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-direct {p0, v0, v1, v2}, Lax/d3/E;->F6(Lcom/voxdon/xplorer/file/n;J)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lax/Q2/a$e;->a(Ljava/util/List;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz p2, :cond_1f

    .line 28
    .line 29
    const-string v2, "cut"

    .line 30
    .line 31
    goto :goto_21

    .line 32
    :cond_1f
    const-string v2, "copy"

    .line 33
    .line 34
    :goto_21
    const-string v3, "menu_folder"

    .line 35
    .line 36
    invoke-virtual {v1, v3, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "loc"

    .line 49
    .line 50
    invoke-virtual {v1, v3, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "type"

    .line 55
    .line 56
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v2, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2, p1, p2}, Lax/W2/c;->m(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lax/d3/n;->J3()V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    invoke-virtual {p0, p1}, Lax/d3/n;->e4(Z)V

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
.end method

.method private o8(Lax/c3/k;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lax/d3/E$w;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lax/d3/E$w;-><init>(Lax/d3/E;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p1, v1}, Lax/d3/n;->w4(Lcom/voxdon/xplorer/file/o;Lax/c3/k;Lax/a3/a$c;)V

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

.method private oa()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->g2:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_b

    .line 6
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    :goto_b
    return-void

    .line 13
    :cond_c
    iget-object v0, p0, Lax/d3/E;->g2:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 14
    .line 15
    iget-object v1, p0, Lax/d3/E;->m2:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->m(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lax/d3/E;->g2:Landroid/support/v4/media/session/MediaControllerCompat;

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

.method static synthetic p5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->ha(Lcom/voxdon/xplorer/file/n;)V

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

.method static synthetic p6(Lax/d3/E;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->l1:Ljava/lang/String;

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

.method private p7(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
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
    goto :goto_14

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_c

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v1, 0x0

    .line 14
    :goto_d
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    or-int/2addr v1, v2

    .line 19
    if-eqz v1, :cond_15

    .line 20
    .line 21
    :goto_14
    return-void

    .line 22
    :cond_15
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lax/u3/u;->b(Ljava/util/List;Lcom/voxdon/xplorer/file/n;)Landroid/content/ClipData;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p1}, Lax/u3/u;->c(Landroid/content/Context;Landroid/content/ClipData;)V

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
.end method

.method private pa()V
    .registers 13

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v6, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    if-nez v6, :cond_8

    .line 6
    .line 7
    goto/16 :goto_1a3

    .line 8
    .line 9
    :cond_8
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, v6}, Lax/o3/e;->d(Lcom/voxdon/xplorer/file/n;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    cmp-long v5, v2, v7

    .line 24
    .line 25
    if-eqz v5, :cond_1a3

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1a3

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v10

    .line 41
    cmp-long v5, v2, v10

    .line 42
    .line 43
    if-lez v5, :cond_34

    .line 44
    .line 45
    cmp-long v5, v8, v2

    .line 46
    .line 47
    if-eqz v5, :cond_32

    .line 48
    .line 49
    :goto_30
    const/4 v2, 0x1

    .line 50
    goto :goto_39

    .line 51
    :cond_32
    const/4 v2, 0x0

    .line 52
    goto :goto_39

    .line 53
    :cond_34
    cmp-long v5, v8, v2

    .line 54
    .line 55
    if-lez v5, :cond_32

    .line 56
    .line 57
    goto :goto_30

    .line 58
    :goto_39
    iget-wide v10, p0, Lax/d3/E;->k1:J

    .line 59
    .line 60
    cmp-long v3, v10, v8

    .line 61
    .line 62
    if-nez v3, :cond_41

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    goto :goto_42

    .line 66
    :cond_41
    const/4 v3, 0x0

    .line 67
    :goto_42
    if-eqz v2, :cond_1a3

    .line 68
    .line 69
    if-nez v3, :cond_17c

    .line 70
    .line 71
    :try_start_46
    invoke-static {v4}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {}, Lax/W2/B;->l()Lax/W2/B;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    new-instance v7, Lax/d3/E$M;

    .line 84
    .line 85
    invoke-direct {v7, p0, v6, v4}, Lax/d3/E$M;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {v2 .. v7}, Lax/W2/B;->k(Lcom/voxdon/xplorer/file/o;Ljava/io/File;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/W2/h$a;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v2, v0}, Lax/d3/E;->l(Lax/W2/h;Z)V

    .line 92
    .line 93
    .line 94
    iput-wide v8, p0, Lax/d3/E;->k1:J
    :try_end_5f
    .catch Lax/b3/c; {:try_start_46 .. :try_end_5f} :catch_60

    .line 95
    .line 96
    return-void

    .line 97
    :catch_60
    nop

    .line 98
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-eqz v2, :cond_166

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    instance-of v3, v2, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    if-eqz v3, :cond_73

    .line 112
    .line 113
    move-object v8, v5

    .line 114
    const/4 v7, 0x1

    .line 115
    goto :goto_c9

    .line 116
    :cond_73
    invoke-static {}, Lax/X2/Q;->x1()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_c7

    .line 121
    .line 122
    const-string v3, "activity"

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Landroid/app/ActivityManager;

    .line 129
    .line 130
    if-eqz v3, :cond_c7

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    move-object v8, v5

    .line 141
    const/4 v7, 0x0

    .line 142
    :cond_8d
    :goto_8d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_c9

    .line 147
    .line 148
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    check-cast v9, Landroid/app/ActivityManager$AppTask;

    .line 153
    .line 154
    invoke-virtual {v9}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    iget v9, v9, Landroid/app/ActivityManager$RecentTaskInfo;->id:I

    .line 159
    .line 160
    invoke-virtual {v2}, Landroid/app/Activity;->getTaskId()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-ne v9, v10, :cond_8d

    .line 165
    .line 166
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, Landroid/app/ActivityManager$AppTask;

    .line 171
    .line 172
    invoke-virtual {v8}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-static {v8}, Lax/d3/A;->a(Landroid/app/ActivityManager$RecentTaskInfo;)Landroid/content/ComponentName;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    if-eqz v8, :cond_8d

    .line 181
    .line 182
    const-class v9, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-virtual {v8}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_8d

    .line 197
    .line 198
    const/4 v7, 0x1

    .line 199
    goto :goto_8d

    .line 200
    :cond_c7
    move-object v8, v5

    .line 201
    const/4 v7, 0x0

    .line 202
    :cond_c9
    :goto_c9
    const-string v3, "activity:"

    .line 203
    .line 204
    if-eqz v7, :cond_12d

    .line 205
    .line 206
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    new-array v7, v0, [Ljava/lang/Object;

    .line 215
    .line 216
    aput-object v4, v7, v1

    .line 217
    .line 218
    const v1, 0x7f1300af

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v1, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v4}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v4, v1, v5}, Lax/s3/u;->i(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/Notification;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-static {v4}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    const/16 v5, 0x78

    .line 246
    .line 247
    invoke-virtual {v4, v5, v1}, Lax/s3/u;->l(ILandroid/app/Notification;)V

    .line 248
    .line 249
    .line 250
    iput-boolean v0, p0, Lax/d3/E;->N1:Z

    .line 251
    .line 252
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const-string v1, "UPLOAD COMMAND NOT STARTED NOTI SENT"

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    new-instance v1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_1a3

    .line 301
    .line 302
    :cond_12d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v1, ",base:"

    .line 322
    .line 323
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v1}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    const-string v2, "UPLOAD NOTI PROBLEM"

    .line 346
    .line 347
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {v1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 356
    .line 357
    .line 358
    goto :goto_1a3

    .line 359
    :cond_166
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    const-string v1, "UPLOAD NOTI PROBLEM NULL ACTIVITY"

    .line 372
    .line 373
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 378
    .line 379
    .line 380
    goto :goto_1a3

    .line 381
    :cond_17c
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    if-eqz v1, :cond_1a3

    .line 386
    .line 387
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const/4 v3, 0x5

    .line 392
    invoke-virtual {v1, v2, v3}, Lcom/voxdon/xplorer/service/CommandService;->p(Lax/c3/K;I)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    :goto_18f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-eqz v3, :cond_1a3

    .line 405
    .line 406
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    check-cast v3, Lax/W2/j;

    .line 411
    .line 412
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-virtual {v1, v4, v3, v0}, Lcom/voxdon/xplorer/service/CommandService;->I(Lax/R2/a;Lax/W2/j;Z)V

    .line 417
    .line 418
    .line 419
    goto :goto_18f

    .line 420
    :cond_1a3
    :goto_1a3
    return-void
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

.method static synthetic q5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/E;->L7(Lcom/voxdon/xplorer/file/n;Z)V

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

.method static synthetic q6(Lax/d3/E;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->J1:Z

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

.method private q7()I
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->h0()Lax/x3/A;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/x3/A;->C()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method private q9()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/E;->X1:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/E;->q2:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/E;->X1:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v1, p0, Lax/d3/E;->q2:Ljava/lang/Runnable;

    .line 11
    .line 12
    const-wide/16 v2, 0x12c

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private qa(Lcom/voxdon/xplorer/file/n;J)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    iput-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lax/o3/e;->j(Lcom/voxdon/xplorer/file/n;J)V

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

.method static synthetic r5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->Q7(Lcom/voxdon/xplorer/file/n;)V

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

.method static synthetic r6(Lax/d3/E;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/d3/E;->m1:J

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
    .line 22
.end method

.method private r7(Ljava/util/List;)Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
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
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_5b

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
    invoke-interface {v1}, Lax/c3/b;->isDirectory()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1f

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_9

    .line 32
    :cond_1f
    new-instance v2, Ljava/util/Stack;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_27
    :goto_27
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-lez v1, :cond_9

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 51
    .line 52
    :try_start_33
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3, v1}, Lcom/voxdon/xplorer/file/o;->f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :goto_3f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_27

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 75
    .line 76
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_57

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_3f

    .line 86
    :catch_55
    nop

    .line 87
    goto :goto_27

    .line 88
    :cond_57
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5a
    .catch Lax/b3/j; {:try_start_33 .. :try_end_5a} :catch_55

    .line 89
    .line 90
    .line 91
    goto :goto_3f

    .line 92
    :cond_5b
    return-object v0
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

.method private r9()V
    .registers 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/d3/E;->P1:I

    .line 3
    .line 4
    iput v0, p0, Lax/d3/E;->Q1:I

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
.end method

.method private ra()V
    .registers 3

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
    goto :goto_39

    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->z1:Landroid/view/MenuItem;

    .line 9
    .line 10
    if-eqz v0, :cond_39

    .line 11
    .line 12
    iget-boolean v1, p0, Lax/d3/E;->Y1:Z

    .line 13
    .line 14
    if-eqz v1, :cond_21

    .line 15
    .line 16
    iget-object v1, p0, Lax/d3/E;->B1:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/d3/E;->z1:Landroid/view/MenuItem;

    .line 22
    .line 23
    const v1, 0x7f1301ef

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 31
    .line 32
    .line 33
    goto :goto_32

    .line 34
    :cond_21
    iget-object v1, p0, Lax/d3/E;->A1:Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lax/d3/E;->z1:Landroid/view/MenuItem;

    .line 40
    .line 41
    const v1, 0x7f1301f2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 49
    .line 50
    .line 51
    :goto_32
    iget-object v0, p0, Lax/d3/E;->z1:Landroid/view/MenuItem;

    .line 52
    .line 53
    iget-boolean v1, p0, Lax/d3/E;->Z1:Z

    .line 54
    .line 55
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 56
    .line 57
    .line 58
    :cond_39
    :goto_39
    return-void
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

.method static synthetic s5(Lax/d3/E;Landroid/content/Intent;IZLjava/lang/String;)Z
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

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

.method static synthetic s6(Lax/d3/E;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/d3/E;->m1:J

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

.method private s8(Lax/c3/k;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .registers 12

    .line 1
    invoke-static {p1}, Lax/a3/Q;->E3(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lax/d3/E;->C8(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

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

.method private sa(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lcom/voxdon/xplorer/file/n;

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
.end method

.method static synthetic t5(Lax/d3/E;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;->r9()V

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

.method static synthetic t6(Lax/d3/E;Lcom/voxdon/xplorer/file/n;J)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/d3/E;->qa(Lcom/voxdon/xplorer/file/n;J)V

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

.method private t8(Lcom/voxdon/xplorer/file/n;II)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/E;->S6()V

    .line 16
    .line 17
    .line 18
    :cond_11
    iput-object p1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-boolean p1, p0, Lax/d3/E;->o1:Z

    .line 28
    .line 29
    invoke-virtual {p0, p2, p3}, Lax/d3/E;->b8(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lax/d3/n;->e4(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lax/d3/n;->N4()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lax/d3/E;->V6()V

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

.method private t9(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_folder"

    .line 6
    .line 7
    const-string v2, "restore"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

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
    invoke-static {}, Lax/W2/x;->l()Lax/W2/x;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lax/d3/E$F;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Lax/d3/E$F;-><init>(Lax/d3/E;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, p1, v2}, Lax/W2/x;->k(Lcom/voxdon/xplorer/file/o;Ljava/util/List;Lax/W2/h$a;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    :try_start_2e
    invoke-virtual {p0, v0, p1}, Lax/d3/E;->l(Lax/W2/h;Z)V
    :try_end_31
    .catch Lax/b3/c; {:try_start_2e .. :try_end_31} :catch_32

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_32
    const v0, 0x7f130137

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0, p1}, Lax/d3/n;->J4(II)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic u5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/d3/E;->E8(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V

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

.method static synthetic u6(Lax/d3/E;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->N6(Z)V

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

.method private u7(Z)Ljava/util/List;
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
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

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

.method private u9(Ljava/lang/String;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->k0(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/a;->k0(Ljava/lang/String;)V

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
.end method

.method static synthetic v5(Lax/d3/E;Lcom/voxdon/xplorer/file/i;Ljava/lang/String;Z)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/d3/E;->v8(Lcom/voxdon/xplorer/file/i;Ljava/lang/String;Z)V

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

.method static synthetic v6(Lax/d3/E;Ljava/lang/Throwable;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/E;->S9(Ljava/lang/Throwable;Z)V

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

.method private v8(Lcom/voxdon/xplorer/file/i;Ljava/lang/String;Z)V
    .registers 12

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_dc

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_dc

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_14

    .line 18
    .line 19
    goto/16 :goto_dc

    .line 20
    .line 21
    :cond_14
    invoke-direct {p0, p1}, Lax/d3/E;->D9(Lcom/voxdon/xplorer/file/n;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lax/t3/j;->C(Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_31

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-static {p1, v0}, Lax/c3/A;->B(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_31

    .line 41
    .line 42
    if-nez p2, :cond_31

    .line 43
    .line 44
    invoke-direct {p0, p1}, Lax/d3/E;->Z6(Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    goto/16 :goto_c2

    .line 49
    .line 50
    :cond_31
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lax/t3/j;->F(Landroid/content/Context;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_54

    .line 59
    .line 60
    invoke-static {p1}, Lax/c3/A;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_54

    .line 65
    .line 66
    if-nez p2, :cond_54

    .line 67
    .line 68
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v2, Lax/Z2/c$a;->c0:Lax/Z2/c$a;

    .line 73
    .line 74
    invoke-static {v0, v2, p1, v1}, Lax/a3/Q;->K3(Landroid/content/Context;Lax/Z2/c$a;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_54

    .line 79
    .line 80
    invoke-direct {p0, p1}, Lax/d3/E;->R8(Lcom/voxdon/xplorer/file/n;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_c1

    .line 84
    .line 85
    :cond_54
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lax/t3/j;->D(Landroid/content/Context;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_74

    .line 94
    .line 95
    invoke-static {p1}, Lax/c3/A;->C(Lcom/voxdon/xplorer/file/n;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_74

    .line 100
    .line 101
    if-nez p2, :cond_74

    .line 102
    .line 103
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0, p1, v1}, Lax/a3/Q;->J3(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_74

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lax/d3/E;->G8(Lcom/voxdon/xplorer/file/n;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_c1

    .line 117
    :cond_74
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lax/t3/j;->E(Landroid/content/Context;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_a0

    .line 126
    .line 127
    invoke-static {p1}, Lax/c3/A;->D(Lcom/voxdon/xplorer/file/n;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_86

    .line 132
    .line 133
    if-eqz p2, :cond_92

    .line 134
    .line 135
    :cond_86
    sget-object v0, Lax/c3/V;->c0:Lax/c3/V;

    .line 136
    .line 137
    invoke-virtual {v0}, Lax/c3/V;->h()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_a0

    .line 146
    .line 147
    :cond_92
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-static {p2, p1}, Lax/c3/w;->f(Landroid/content/Context;Lcom/voxdon/xplorer/file/i;)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    const/16 p3, 0x3ea

    .line 156
    .line 157
    const/4 p3, 0x0

    .line 158
    const/16 v1, 0x3ea

    .line 159
    .line 160
    goto :goto_c2

    .line 161
    :cond_a0
    invoke-static {p1}, Lax/c3/A;->p(Lcom/voxdon/xplorer/file/n;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_b0

    .line 166
    .line 167
    if-nez p2, :cond_b0

    .line 168
    .line 169
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-direct {p0, p2}, Lax/d3/E;->k7(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    goto :goto_c1

    .line 177
    :cond_b0
    invoke-static {}, Lax/X2/Q;->H1()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_cc

    .line 182
    .line 183
    invoke-static {p1}, Lax/c3/A;->K(Lcom/voxdon/xplorer/file/n;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_cc

    .line 188
    .line 189
    if-nez p2, :cond_cc

    .line 190
    .line 191
    invoke-direct {p0, p1}, Lax/d3/E;->o8(Lax/c3/k;)V

    .line 192
    .line 193
    .line 194
    :goto_c1
    const/4 p2, 0x0

    .line 195
    :goto_c2
    if-eqz p2, :cond_dc

    .line 196
    .line 197
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-direct {p0, p2, v1, p3, p1}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_cc
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/i;->s()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    if-eqz p2, :cond_d4

    .line 210
    .line 211
    move-object v5, p2

    .line 212
    goto :goto_d5

    .line 213
    :cond_d4
    move-object v5, v4

    .line 214
    :goto_d5
    const/4 v7, 0x1

    .line 215
    move-object v2, p0

    .line 216
    move-object v3, p1

    .line 217
    move v6, p3

    .line 218
    invoke-direct/range {v2 .. v7}, Lax/d3/E;->s8(Lax/c3/k;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 219
    .line 220
    .line 221
    :cond_dc
    :goto_dc
    return-void
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

.method static synthetic w5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->F8(Lcom/voxdon/xplorer/file/n;)V

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

.method static synthetic w6(Lax/d3/E;Lcom/voxdon/xplorer/file/y;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->Q8(Lcom/voxdon/xplorer/file/y;)V

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

.method private w8(Lcom/voxdon/xplorer/file/i;)V
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    :cond_c
    move-object v1, p0

    .line 14
    goto :goto_2f

    .line 15
    :cond_e
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/i;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {p0, p1}, Lax/d3/E;->D9(Lcom/voxdon/xplorer/file/n;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {v0, p1, v3, v1}, Lax/c3/w;->a(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_29

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x1

    .line 35
    move-object v4, v3

    .line 36
    move-object v1, p0

    .line 37
    move-object v2, p1

    .line 38
    invoke-direct/range {v1 .. v6}, Lax/d3/E;->s8(Lax/c3/k;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    move-object v1, p0

    .line 43
    move-object v2, p1

    .line 44
    const/4 p1, 0x1

    .line 45
    invoke-direct {p0, v2, p1}, Lax/d3/E;->ba(Lcom/voxdon/xplorer/file/n;Z)V

    .line 46
    .line 47
    .line 48
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

.method static synthetic x5(Lax/d3/E;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/d3/E;->k1:J

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

.method static synthetic x6(Lax/d3/E;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->E1:Z

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

.method private x8(Lcom/voxdon/xplorer/file/n;)V
    .registers 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    invoke-direct {p0, v2, v0, v1}, Lax/d3/E;->F6(Lcom/voxdon/xplorer/file/n;J)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v2, 0x1

    .line 11
    .line 12
    add-long/2addr v0, v2

    .line 13
    invoke-direct {p0, p1, v0, v1}, Lax/d3/E;->F6(Lcom/voxdon/xplorer/file/n;J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lax/d3/E;->V6()V

    .line 17
    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    invoke-direct {p0, p1, v0, v1}, Lax/d3/E;->C9(Lcom/voxdon/xplorer/file/n;J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1}, Lax/a3/Q;->A3(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v1, p1, Lax/c3/E;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_32

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    check-cast v1, Lax/c3/E;

    .line 39
    .line 40
    invoke-virtual {v1}, Lax/c3/E;->j0()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_32

    .line 45
    .line 46
    invoke-direct {p0, v1}, Lax/d3/E;->z8(Lax/c3/E;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_cf

    .line 50
    .line 51
    :cond_32
    if-eqz v0, :cond_6b

    .line 52
    .line 53
    invoke-static {v0}, Lax/c3/u;->S(Landroid/content/Intent;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3f

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lax/d3/E;->A8(Lcom/voxdon/xplorer/file/n;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_cf

    .line 63
    .line 64
    :cond_3f
    invoke-static {v0}, Lax/c3/u;->T(Landroid/content/Intent;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4a

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lax/d3/E;->G8(Lcom/voxdon/xplorer/file/n;)Z

    .line 71
    .line 72
    .line 73
    goto/16 :goto_cf

    .line 74
    .line 75
    :cond_4a
    invoke-static {v0}, Lax/c3/u;->U(Landroid/content/Intent;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_55

    .line 80
    .line 81
    invoke-direct {p0, p1}, Lax/d3/E;->R8(Lcom/voxdon/xplorer/file/n;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_cf

    .line 85
    .line 86
    :cond_55
    invoke-static {p1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_67

    .line 91
    .line 92
    invoke-direct {p0, p1}, Lax/d3/E;->D9(Lcom/voxdon/xplorer/file/n;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {p0, v0, v2, v2, v1}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    goto/16 :goto_cf

    .line 103
    .line 104
    :cond_67
    invoke-direct {p0, p1, v2, v0}, Lax/d3/E;->g7(Lcom/voxdon/xplorer/file/n;ZLandroid/content/Intent;)V

    .line 105
    .line 106
    .line 107
    goto :goto_cf

    .line 108
    :cond_6b
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0, p1}, Lax/d3/E;->X7(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_96

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sget-object v1, Lax/c3/z;->r0:Lax/c3/z;

    .line 123
    .line 124
    const v3, 0x7f130341

    .line 125
    .line 126
    .line 127
    const/4 v4, 0x1

    .line 128
    if-ne v1, v0, :cond_85

    .line 129
    .line 130
    invoke-virtual {p0, v3, v4}, Lax/d3/n;->E4(II)V

    .line 131
    .line 132
    .line 133
    goto :goto_cf

    .line 134
    :cond_85
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_92

    .line 143
    .line 144
    invoke-virtual {p0, v3, v4}, Lax/d3/n;->E4(II)V

    .line 145
    .line 146
    .line 147
    :cond_92
    invoke-direct {p0, p1, v4}, Lax/d3/E;->ba(Lcom/voxdon/xplorer/file/n;Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_cf

    .line 151
    :cond_96
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    const/4 v1, 0x0

    .line 156
    if-eqz v0, :cond_a1

    .line 157
    .line 158
    invoke-direct {p0, p1, v1, v2}, Lax/d3/E;->E8(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    goto :goto_cf

    .line 162
    :cond_a1
    invoke-static {p1}, Lax/c3/B;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_ae

    .line 167
    .line 168
    move-object v0, p1

    .line 169
    check-cast v0, Lcom/voxdon/xplorer/file/i;

    .line 170
    .line 171
    invoke-direct {p0, v0, v1, v2}, Lax/d3/E;->v8(Lcom/voxdon/xplorer/file/i;Ljava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    goto :goto_cf

    .line 175
    :cond_ae
    invoke-static {p1, v2}, Lax/c3/A;->B(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_c2

    .line 180
    .line 181
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Lax/t3/j;->C(Landroid/content/Context;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_c2

    .line 190
    .line 191
    invoke-direct {p0, p1}, Lax/d3/E;->A8(Lcom/voxdon/xplorer/file/n;)V

    .line 192
    .line 193
    .line 194
    goto :goto_cf

    .line 195
    :cond_c2
    invoke-static {p1}, Lax/c3/A;->G(Lcom/voxdon/xplorer/file/n;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_cc

    .line 200
    .line 201
    invoke-direct {p0, p1, v2}, Lax/d3/E;->I8(Lcom/voxdon/xplorer/file/n;Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_cf

    .line 205
    :cond_cc
    invoke-direct {p0, p1, v2, v1}, Lax/d3/E;->g7(Lcom/voxdon/xplorer/file/n;ZLandroid/content/Intent;)V

    .line 206
    .line 207
    .line 208
    :goto_cf
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_e8

    .line 213
    .line 214
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v0, v1, v3, p1, v2}, Lcom/voxdon/xplorer/activity/b;->w0(Lax/Q2/f;ILjava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    :cond_e8
    return-void
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

.method static synthetic y5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;J)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/d3/E;->C9(Lcom/voxdon/xplorer/file/n;J)V

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

.method static synthetic y6(Lax/d3/E;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->N9(Ljava/lang/String;)V

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

.method private y7()I
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Q2/f;->P()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    return v0

    .line 13
    :cond_c
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v4, p0, Lax/d3/E;->H1:Z

    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->d(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
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

.method private y8(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .registers 12

    .line 1
    invoke-static {p1}, Lax/c3/u;->w(Ljava/io/File;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lax/d3/E;->C8(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

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

.method private y9(I)V
    .registers 9

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
    goto :goto_5a

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/d3/E;->z7()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0}, Lax/d3/E;->y7()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x4

    .line 18
    if-eq v0, v2, :cond_5b

    .line 19
    .line 20
    const/16 v2, 0x10

    .line 21
    .line 22
    const/16 v4, 0xc

    .line 23
    .line 24
    if-eq v0, v4, :cond_1c

    .line 25
    .line 26
    if-eq v0, v2, :cond_1c

    .line 27
    .line 28
    goto :goto_5a

    .line 29
    :cond_1c
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G0()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget v5, v5, Landroid/content/res/Configuration;->orientation:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-ne v5, v6, :cond_38

    .line 41
    .line 42
    const/16 v5, 0x1e0

    .line 43
    .line 44
    if-gt p1, v5, :cond_2f

    .line 45
    .line 46
    const/4 p1, 0x3

    .line 47
    goto :goto_46

    .line 48
    :cond_2f
    const/16 v5, 0x258

    .line 49
    .line 50
    if-gt p1, v5, :cond_35

    .line 51
    .line 52
    const/4 p1, 0x4

    .line 53
    goto :goto_46

    .line 54
    :cond_35
    div-int/lit16 p1, p1, 0x96

    .line 55
    .line 56
    goto :goto_46

    .line 57
    :cond_38
    const/16 v5, 0x280

    .line 58
    .line 59
    if-gt p1, v5, :cond_3e

    .line 60
    .line 61
    const/4 p1, 0x5

    .line 62
    goto :goto_46

    .line 63
    :cond_3e
    const/16 v5, 0x3c0

    .line 64
    .line 65
    if-gt p1, v5, :cond_44

    .line 66
    .line 67
    const/4 p1, 0x6

    .line 68
    goto :goto_46

    .line 69
    :cond_44
    div-int/lit16 p1, p1, 0x91

    .line 70
    .line 71
    :goto_46
    if-ne v1, v3, :cond_4a

    .line 72
    .line 73
    add-int/lit8 p1, p1, -0x1

    .line 74
    .line 75
    :cond_4a
    if-ne v0, v4, :cond_52

    .line 76
    .line 77
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_52
    if-ne v0, v2, :cond_5a

    .line 84
    .line 85
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 86
    .line 87
    add-int/2addr p1, v6

    .line 88
    invoke-virtual {v0, p1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 89
    .line 90
    .line 91
    :cond_5a
    :goto_5a
    return-void

    .line 92
    :cond_5b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0, p1}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ne v1, v3, :cond_71

    .line 101
    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G0()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const v1, 0x7f0700dc

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    goto :goto_7c

    .line 114
    :cond_71
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G0()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const v1, 0x7f0700dd

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    :goto_7c
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G0()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const v3, 0x7f0700e5

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    mul-int/lit8 v1, v1, 0x2

    .line 137
    .line 138
    sub-int/2addr p1, v1

    .line 139
    div-int/2addr p1, v0

    .line 140
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 143
    .line 144
    .line 145
    return-void
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
.end method

.method static synthetic z5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/E;->ja(Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

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

.method static synthetic z6(Lax/d3/E;Z)Ljava/util/List;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/E;->u7(Z)Ljava/util/List;

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

.method private z8(Lax/c3/E;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Lax/c3/E;->f0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_e

    .line 6
    .line 7
    const p1, 0x7f130137

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->E4(II)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    new-instance v1, Landroid/content/Intent;

    .line 16
    .line 17
    const-string v2, "android.intent.action.VIEW"

    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    const/high16 v0, 0x10000000

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, v1, v0, v0, p1}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    return-void
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

.method private z9(Lax/c3/K;Ljava/lang/String;)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lax/c3/K;->b()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v1, p1, p2, v2}, Lax/t3/e;->c(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object p2, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 19
    .line 20
    if-eqz p2, :cond_18

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lcom/voxdon/xplorer/widget/a;->j0(Z)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object p2, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 26
    .line 27
    if-eqz p2, :cond_1f

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lcom/voxdon/xplorer/widget/a;->j0(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1f
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
.end method


# virtual methods
.method protected A7()Landroid/widget/AdapterView$OnItemClickListener;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->k2:Landroid/widget/AdapterView$OnItemClickListener;

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

.method public B()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

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

.method protected abstract B7()Ljava/lang/String;
.end method

.method B9(Z)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 9
    .line 10
    new-instance v1, Lax/d3/E$O;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lax/d3/E$O;-><init>(Lax/d3/E;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public C3()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

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

.method protected C7()Z
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

.method public D1()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->L1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/d3/E;->M1:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lax/d3/E;->L1:Z

    .line 10
    .line 11
    :cond_a
    invoke-super {p0}, Lax/d3/n;->D1()V

    .line 12
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

.method protected D7()I
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Q2/f;->P()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/t3/e;->b(Lax/Q2/f;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_13
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v0, :cond_4b

    .line 23
    .line 24
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_4b

    .line 33
    .line 34
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "current path == null in getSavedListViewType"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "location:"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 74
    .line 75
    .line 76
    :cond_4b
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iget-object v3, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 89
    .line 90
    iget-boolean v4, p0, Lax/d3/E;->H1:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->k(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    return v0
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

.method protected E7()Landroid/widget/AdapterView$OnItemClickListener;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->l2:Landroid/widget/AdapterView$OnItemClickListener;

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

.method public E9(Lax/Q2/f;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->G1:Lax/Q2/f;

    .line 2
    .line 3
    iget-object p1, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 4
    .line 5
    if-eqz p1, :cond_9

    .line 6
    .line 7
    invoke-direct {p0}, Lax/d3/E;->F9()V

    .line 8
    .line 9
    .line 10
    :cond_9
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

.method public F1(Landroid/view/Menu;)V
    .registers 5

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
    goto :goto_68

    .line 11
    :cond_a
    invoke-virtual {p0, p1}, Lax/d3/E;->Y8(Landroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const v0, 0x7f0a02ea

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lax/d3/E;->i7(Landroid/view/Menu;I)V

    .line 18
    .line 19
    .line 20
    const v0, 0x7f0a02e2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lax/d3/E;->i7(Landroid/view/Menu;I)V

    .line 24
    .line 25
    .line 26
    const v0, 0x7f0a02f7

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Lax/d3/E;->i7(Landroid/view/Menu;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lax/n/c;

    .line 37
    .line 38
    invoke-virtual {v1}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_40

    .line 47
    .line 48
    if-eqz v1, :cond_40

    .line 49
    .line 50
    invoke-virtual {v1}, Lax/n/a;->m()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, Lax/d3/E;->D7()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-static {v1, v2}, Lax/u3/z;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 63
    .line 64
    .line 65
    :cond_40
    const/4 v0, 0x0

    .line 66
    invoke-direct {p0, p1, v0}, Lax/d3/E;->G6(Landroid/view/Menu;Z)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lax/d3/E;->d2:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz p1, :cond_68

    .line 72
    .line 73
    iget-object p1, p0, Lax/d3/E;->y1:Landroid/view/MenuItem;

    .line 74
    .line 75
    if-eqz p1, :cond_68

    .line 76
    .line 77
    iget-object v0, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 78
    .line 79
    if-eqz v0, :cond_68

    .line 80
    .line 81
    invoke-interface {p1}, Landroid/view/MenuItem;->expandActionView()Z

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 85
    .line 86
    iget-object v0, p0, Lax/d3/E;->d2:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 92
    .line 93
    iget-object v0, p0, Lax/d3/E;->d2:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    iput-object p1, p0, Lax/d3/E;->d2:Ljava/lang/String;

    .line 104
    .line 105
    :cond_68
    :goto_68
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
.end method

.method protected G7(Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-boolean v3, p0, Lax/d3/E;->H1:Z

    .line 14
    .line 15
    invoke-static {v0, v1, v2, p1, v3}, Lax/d3/E;->F7(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method

.method protected G8(Lcom/voxdon/xplorer/file/n;)Z
    .registers 11

    .line 1
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    const-string v2, "file_open"

    .line 6
    .line 7
    const-string v3, "command"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "ext"

    .line 11
    .line 12
    const-string v6, "loc"

    .line 13
    .line 14
    if-eqz v0, :cond_a5

    .line 15
    .line 16
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 17
    .line 18
    if-nez v0, :cond_15

    .line 19
    .line 20
    goto/16 :goto_a5

    .line 21
    .line 22
    :cond_15
    invoke-static {}, Lax/X2/Q;->h0()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_22

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->y(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 36
    .line 37
    .line 38
    sget-object v0, Lax/Q2/f;->l0:Lax/Q2/f;

    .line 39
    .line 40
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->N()Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    iget-object v8, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v7, v8}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {p0, p1, v7, v0, v4}, Lax/d3/E;->H8(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/util/List;I)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v4, v3, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v6, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v2, v5, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v3, "success"

    .line 89
    .line 90
    invoke-virtual {v2, v1, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Lax/Q2/a$b;->e()V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "music_player"

    .line 102
    .line 103
    const-string v3, "open_player"

    .line 104
    .line 105
    invoke-virtual {v1, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v6, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v1, v5, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lax/Q2/a$b;->e()V

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "music_player_open"

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Lax/Q2/a;->o(Ljava/lang/String;)Lax/Q2/a$d;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v1, v6, v2}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {v1, v5, p1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Lax/Q2/a$d;->c()V

    .line 163
    .line 164
    .line 165
    return v0

    .line 166
    :cond_a5
    :goto_a5
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0, v3, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, v6, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v0, v5, p1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v0, "failure"

    .line 195
    .line 196
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 201
    .line 202
    .line 203
    return v4
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

.method protected G9(Z)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Lax/d3/E;->s1:Z

    .line 2
    .line 3
    iget-object v0, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/PathBar;->setIsTwoDepth(Z)V

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
.end method

.method public H1()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/d3/n;->H1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lax/d3/E;->M1:Z

    .line 5
    .line 6
    if-nez v0, :cond_d

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/d3/n;->P3()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1d

    .line 13
    .line 14
    :cond_d
    sget-object v0, Lax/d3/E;->r2:Ljava/util/logging/Logger;

    .line 15
    .line 16
    const-string v1, "refresh on resume"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lax/d3/E;->Y6()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, v0}, Lax/d3/E;->N6(Z)V

    .line 26
    .line 27
    .line 28
    iput-boolean v0, p0, Lax/d3/E;->M1:Z

    .line 29
    .line 30
    :cond_1d
    iget-boolean v0, p0, Lax/d3/E;->N1:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2e

    .line 33
    .line 34
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/16 v1, 0x78

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lax/s3/u;->a(I)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    return-void
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

.method public H6()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->H1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_5e

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lax/Q2/f;->U(Lax/Q2/f;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_56

    .line 15
    .line 16
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "INVALID ANALYZE CURRENT PATH!!!!"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "location:"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v1, "Invalid Analyze Location : "

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_56
    const/4 v0, 0x1

    .line 88
    invoke-virtual {p0, v0}, Lax/d3/E;->I9(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v1}, Lax/d3/E;->c4(Z)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_5e
    iget-object v0, p0, Lax/d3/E;->G1:Lax/Q2/f;

    .line 96
    .line 97
    if-nez v0, :cond_68

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Lax/d3/E;->I9(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lax/d3/E;->c4(Z)V

    .line 103
    .line 104
    .line 105
    :cond_68
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

.method protected H7()Landroid/widget/AdapterView$OnItemClickListener;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->j2:Landroid/widget/AdapterView$OnItemClickListener;

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

.method public H8(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/util/List;I)Z
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;I)Z"
        }
    .end annotation

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
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lcom/voxdon/xplorer/activity/b;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    move-object v4, p3

    .line 20
    move v6, p4

    .line 21
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/b;->y0(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/util/List;ZI)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
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

.method public I1(Landroid/os/Bundle;)V
    .registers 7

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->I1(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "path"

    .line 5
    .line 6
    iget-object v1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lax/d3/E;->J1:Z

    .line 12
    .line 13
    if-eqz v0, :cond_3c

    .line 14
    .line 15
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    if-eqz v0, :cond_3c

    .line 18
    .line 19
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lax/o3/e;->d(Lcom/voxdon/xplorer/file/n;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmp-long v4, v0, v2

    .line 32
    .line 33
    if-eqz v4, :cond_3c

    .line 34
    .line 35
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "file_open_path"

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lax/o3/e;->d(Lcom/voxdon/xplorer/file/n;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    const-string v2, "file_open_last_modified"

    .line 57
    .line 58
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    return-void
.end method

.method public I9(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->H1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    if-nez p1, :cond_11

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/T2/h;->G0()V

    .line 16
    .line 17
    .line 18
    :cond_11
    iget-boolean v0, p0, Lax/d3/E;->H1:Z

    .line 19
    .line 20
    if-nez v0, :cond_22

    .line 21
    .line 22
    if-eqz p1, :cond_22

    .line 23
    .line 24
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lax/T2/h;->J0()V

    .line 33
    .line 34
    .line 35
    :cond_22
    iput-boolean p1, p0, Lax/d3/E;->H1:Z

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

.method public J1()V
    .registers 4

    .line 1
    invoke-super {p0}, Lax/d3/n;->J1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/E;->Y6()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Lax/d3/E;->N6(Z)V

    .line 9
    .line 10
    .line 11
    iput-boolean v0, p0, Lax/d3/E;->M1:Z

    .line 12
    .line 13
    invoke-direct {p0}, Lax/d3/E;->i9()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED"

    .line 21
    .line 22
    iget-object v2, p0, Lax/d3/E;->f2:Landroid/content/BroadcastReceiver;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

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

.method protected J7(IZZ)Z
    .registers 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p3, :cond_17

    .line 4
    .line 5
    iget-object p3, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/view/View;->hasFocus()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_17

    .line 12
    .line 13
    iget-object p3, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 14
    .line 15
    invoke-virtual {p3}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    const/4 v2, -0x1

    .line 20
    if-eq p3, v2, :cond_17

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 p3, 0x0

    .line 25
    :goto_18
    invoke-virtual {p0}, Lax/d3/n;->K3()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_3d

    .line 30
    .line 31
    if-nez p3, :cond_3d

    .line 32
    .line 33
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 34
    .line 35
    invoke-virtual {p1}, Lax/x3/d;->k()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_3c

    .line 40
    .line 41
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "HCM: NOTRECHABLE"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lax/d3/n;->m3()Lax/d3/n$o;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Lax/d3/E;->W3(Lax/d3/n$o;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    return v1

    .line 62
    :cond_3d
    invoke-direct {p0}, Lax/d3/E;->P6()V

    .line 63
    .line 64
    .line 65
    const v2, 0x7f0a00cf

    .line 66
    .line 67
    .line 68
    if-eq p1, v2, :cond_58

    .line 69
    .line 70
    invoke-direct {p0, p1}, Lax/d3/E;->Z7(I)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_58

    .line 75
    .line 76
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Lax/W2/c;->v()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_58

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Lax/d3/n;->X2(Z)V

    .line 87
    .line 88
    .line 89
    :cond_58
    invoke-direct {p0, p3}, Lax/d3/E;->u7(Z)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_e5

    .line 98
    .line 99
    if-eqz p3, :cond_a3

    .line 100
    .line 101
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string p2, "NOSEL KEY:"

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance p2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string p3, "count:"

    .line 125
    .line 126
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object p3, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 130
    .line 131
    invoke-interface {p3}, Landroid/widget/Adapter;->getCount()I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p3, ",pos:"

    .line 139
    .line 140
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    iget-object p3, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 144
    .line 145
    invoke-virtual {p3}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 146
    .line 147
    .line 148
    move-result p3

    .line 149
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 161
    .line 162
    .line 163
    goto :goto_e1

    .line 164
    :cond_a3
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    const-string p2, "NOSEL:"

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-instance p2, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lax/d3/n;->K3()Z

    .line 188
    .line 189
    .line 190
    move-result p3

    .line 191
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p3, ":"

    .line 195
    .line 196
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    if-nez p3, :cond_cd

    .line 204
    .line 205
    const/4 v1, 0x1

    .line 206
    :cond_cd
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 218
    .line 219
    .line 220
    const p1, 0x7f130137

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->E4(II)V

    .line 224
    .line 225
    .line 226
    :goto_e1
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 227
    .line 228
    .line 229
    return v0

    .line 230
    :cond_e5
    invoke-virtual {p0, p1, v2, p2}, Lax/d3/E;->K7(ILjava/util/List;Z)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    return p1
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

.method public J9(Landroid/content/Context;Z)V
    .registers 16

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->U(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_2f

    .line 12
    :cond_b
    invoke-virtual {p0, p2}, Lax/d3/E;->I9(Z)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_2f

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x1

    .line 27
    const/4 v4, 0x0

    .line 28
    move-object v1, p1

    .line 29
    invoke-static/range {v1 .. v6}, Lax/t3/e;->q(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZI)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/4 v11, 0x1

    .line 41
    const-string v12, "SizeDown"

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    move-object v7, v1

    .line 45
    invoke-static/range {v7 .. v12}, Lax/t3/e;->p(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZLjava/lang/String;)V

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

.method public K1()V
    .registers 3

    .line 1
    sget-object v0, Lax/d3/E;->r2:Ljava/util/logging/Logger;

    .line 2
    .line 3
    const-string v1, "onStop"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lax/d3/n;->K1()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lax/d3/E;->oa()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lax/d3/E;->f2:Landroid/content/BroadcastReceiver;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lax/Q2/f;->n0(Lax/Q2/f;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_25

    .line 32
    .line 33
    iget-object v0, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/r3/d;->f()V

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

.method protected K6()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

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

.method protected K7(ILjava/util/List;Z)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {p3}, Lax/Q2/f;->A0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-eqz p3, :cond_13

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p3, p2}, Lcom/voxdon/xplorer/file/x;->R0(Landroid/content/Context;Ljava/util/List;)Lcom/voxdon/xplorer/file/j;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 p3, 0x0

    .line 21
    :goto_14
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x1

    .line 23
    sparse-switch p1, :sswitch_data_14a

    .line 24
    .line 25
    .line 26
    goto :goto_25

    .line 27
    :sswitch_1a
    if-eqz p3, :cond_25

    .line 28
    .line 29
    iget-object p1, p3, Lcom/voxdon/xplorer/file/j;->a:Lax/c3/K;

    .line 30
    .line 31
    iget-object p2, p3, Lcom/voxdon/xplorer/file/j;->b:Ljava/lang/String;

    .line 32
    .line 33
    const/4 p3, 0x3

    .line 34
    invoke-virtual {p0, p3, p1, p2, v0}, Lax/d3/E;->o9(ILax/c3/K;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    return v1

    .line 38
    :cond_25
    :goto_25
    const-string p3, "menu_folder"

    .line 39
    .line 40
    sparse-switch p1, :sswitch_data_164

    .line 41
    .line 42
    .line 43
    return v0

    .line 44
    :sswitch_2b
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 49
    .line 50
    iget-object p2, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lax/d3/n;->T2(Lcom/voxdon/xplorer/file/n;Lax/r3/d;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 56
    .line 57
    .line 58
    return v1

    .line 59
    :sswitch_3a
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, p1, p2}, Lax/d3/n;->t4(Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 67
    .line 68
    .line 69
    return v1

    .line 70
    :sswitch_45
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "selection_settings"

    .line 75
    .line 76
    invoke-virtual {p1, p3, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Lax/a3/T;->i3(Lax/d3/n;)Lax/a3/T;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, Lax/d3/C;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Lax/d3/C;-><init>(Lax/d3/E;)V

    .line 90
    .line 91
    .line 92
    const-string p3, "selection_settings_popup_request"

    .line 93
    .line 94
    invoke-static {p0, p3, p2}, Lax/d3/J;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/util/function/Consumer;)V

    .line 95
    .line 96
    .line 97
    const-string p2, "settings"

    .line 98
    .line 99
    invoke-virtual {p0, p1, p2, v1}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    return v1

    .line 103
    :sswitch_66
    iget-object p1, p0, Lax/d3/E;->b1:Lax/d3/n$r;

    .line 104
    .line 105
    iget-object p2, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lax/d3/n$r;->e(Landroid/widget/AbsListView;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lax/d3/n;->I3()V

    .line 111
    .line 112
    .line 113
    return v1

    .line 114
    :sswitch_71
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iget-object p2, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 119
    .line 120
    invoke-interface {p2}, Landroid/widget/Adapter;->getCount()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    const-string v0, "loc"

    .line 125
    .line 126
    if-ne p1, p2, :cond_9c

    .line 127
    .line 128
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    const-string p2, "deselect"

    .line 133
    .line 134
    invoke-virtual {p1, p3, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p1, v0, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 154
    .line 155
    .line 156
    return v1

    .line 157
    :cond_9c
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    const-string p2, "select_all"

    .line 162
    .line 163
    invoke-virtual {p1, p3, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p1, v0, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lax/d3/E;->b1:Lax/d3/n$r;

    .line 183
    .line 184
    iget-object p2, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Lax/d3/n$r;->d(Landroid/widget/AbsListView;)V

    .line 187
    .line 188
    .line 189
    return v1

    .line 190
    :sswitch_bd
    invoke-direct {p0, p2}, Lax/d3/E;->sa(Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 194
    .line 195
    .line 196
    return v1

    .line 197
    :sswitch_c4
    invoke-direct {p0, p2}, Lax/d3/E;->f9(Ljava/util/List;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 201
    .line 202
    .line 203
    return v1

    .line 204
    :sswitch_cb
    invoke-direct {p0, p2}, Lax/d3/E;->S8(Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 208
    .line 209
    .line 210
    return v1

    .line 211
    :sswitch_d2
    invoke-direct {p0, p2}, Lax/d3/E;->J8(Ljava/util/List;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 215
    .line 216
    .line 217
    return v1

    .line 218
    :sswitch_d9
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 223
    .line 224
    invoke-direct {p0, p1, v1}, Lax/d3/E;->ba(Lcom/voxdon/xplorer/file/n;Z)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 228
    .line 229
    .line 230
    return v1

    .line 231
    :sswitch_e6
    invoke-direct {p0, p2}, Lax/d3/E;->ma(Ljava/util/List;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 235
    .line 236
    .line 237
    return v1

    .line 238
    :sswitch_ed
    invoke-direct {p0, p2}, Lax/d3/E;->k7(Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 242
    .line 243
    .line 244
    return v1

    .line 245
    :sswitch_f4
    invoke-direct {p0, p2}, Lax/d3/E;->W6(Ljava/util/List;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 249
    .line 250
    .line 251
    return v1

    .line 252
    :sswitch_fb
    invoke-direct {p0, p2}, Lax/d3/E;->E6(Ljava/util/List;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 256
    .line 257
    .line 258
    return v1

    .line 259
    :sswitch_102
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 260
    .line 261
    .line 262
    return v1

    .line 263
    :sswitch_106
    invoke-direct {p0, p2}, Lax/d3/E;->t9(Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 267
    .line 268
    .line 269
    return v1

    .line 270
    :sswitch_10d
    invoke-direct {p0, p2}, Lax/d3/E;->m9(Ljava/util/List;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 274
    .line 275
    .line 276
    return v1

    .line 277
    :sswitch_114
    const/4 p1, 0x2

    .line 278
    invoke-direct {p0, p2, p1}, Lax/d3/E;->b7(Ljava/util/List;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 282
    .line 283
    .line 284
    return v1

    .line 285
    :sswitch_11c
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p0, p1, p2}, Lax/d3/n;->B4(Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 293
    .line 294
    .line 295
    return v1

    .line 296
    :sswitch_127
    invoke-direct {p0, p2, v1}, Lax/d3/E;->b7(Ljava/util/List;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 300
    .line 301
    .line 302
    return v1

    .line 303
    :sswitch_12e
    invoke-direct {p0, p2, v0}, Lax/d3/E;->b7(Ljava/util/List;I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 307
    .line 308
    .line 309
    return v1

    .line 310
    :sswitch_135
    invoke-direct {p0, p2, v1}, Lax/d3/E;->o7(Ljava/util/List;Z)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 314
    .line 315
    .line 316
    return v1

    .line 317
    :sswitch_13c
    invoke-direct {p0, p2}, Lax/d3/E;->p7(Ljava/util/List;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 321
    .line 322
    .line 323
    return v1

    .line 324
    :sswitch_143
    invoke-direct {p0, p2, v0}, Lax/d3/E;->o7(Ljava/util/List;Z)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 328
    .line 329
    .line 330
    return v1

    .line 331
    :sswitch_data_14a
    .sparse-switch
        0x7f0a008a -> :sswitch_1a
        0x7f0a008b -> :sswitch_1a
        0x7f0a0093 -> :sswitch_1a
        0x7f0a0095 -> :sswitch_1a
        0x7f0a0097 -> :sswitch_1a
        0x7f0a0098 -> :sswitch_1a
    .end sparse-switch

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
    :sswitch_data_164
    .sparse-switch
        0x7f0a0088 -> :sswitch_143
        0x7f0a0089 -> :sswitch_13c
        0x7f0a008a -> :sswitch_135
        0x7f0a008b -> :sswitch_12e
        0x7f0a0093 -> :sswitch_127
        0x7f0a0094 -> :sswitch_11c
        0x7f0a0095 -> :sswitch_114
        0x7f0a0097 -> :sswitch_10d
        0x7f0a0098 -> :sswitch_106
        0x7f0a00cf -> :sswitch_102
        0x7f0a02c8 -> :sswitch_fb
        0x7f0a02c9 -> :sswitch_f4
        0x7f0a02d0 -> :sswitch_ed
        0x7f0a02d3 -> :sswitch_e6
        0x7f0a02d9 -> :sswitch_d9
        0x7f0a02db -> :sswitch_d2
        0x7f0a02dc -> :sswitch_cb
        0x7f0a02e0 -> :sswitch_11c
        0x7f0a02e1 -> :sswitch_c4
        0x7f0a02e6 -> :sswitch_bd
        0x7f0a02ec -> :sswitch_71
        0x7f0a02ed -> :sswitch_66
        0x7f0a02ee -> :sswitch_45
        0x7f0a02f1 -> :sswitch_3a
        0x7f0a02f2 -> :sswitch_2b
    .end sparse-switch
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

.method protected K8()Z
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

.method public L()V
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

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 20
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-super/range {p0 .. p2}, Lax/d3/n;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    const v3, 0x7f0a0299

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 18
    .line 19
    iput-object v3, v0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 20
    .line 21
    new-instance v4, Lax/x3/g;

    .line 22
    .line 23
    invoke-direct {v4}, Lax/x3/g;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnChildScrollUpCallback(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$i;)V

    .line 27
    .line 28
    .line 29
    const v3, 0x7f0a0233

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 37
    .line 38
    iput-object v3, v0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 39
    .line 40
    new-instance v4, Lax/x3/g;

    .line 41
    .line 42
    invoke-direct {v4}, Lax/x3/g;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnChildScrollUpCallback(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$i;)V

    .line 46
    .line 47
    .line 48
    const v3, 0x7f0a02fb

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 56
    .line 57
    iput-object v3, v0, Lax/d3/E;->C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 58
    .line 59
    const v3, 0x7f0a0249

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    iput-object v3, v0, Lax/d3/E;->G0:Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const/4 v6, 0x1

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-direct {v4, v5, v6, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 82
    .line 83
    .line 84
    const v3, 0x7f0a0248

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iput-object v3, v0, Lax/d3/E;->H0:Landroid/view/View;

    .line 92
    .line 93
    const v3, 0x7f0a0294

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Landroid/widget/ListView;

    .line 101
    .line 102
    iput-object v3, v0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 103
    .line 104
    const v3, 0x7f0a022e

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Landroid/widget/GridView;

    .line 112
    .line 113
    iput-object v3, v0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 114
    .line 115
    const v3, 0x7f0a02f8

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iput-object v3, v0, Lax/d3/E;->Q0:Landroid/view/View;

    .line 123
    .line 124
    const v3, 0x7f0a02a5

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Landroid/widget/TextView;

    .line 132
    .line 133
    iput-object v3, v0, Lax/d3/E;->R0:Landroid/widget/TextView;

    .line 134
    .line 135
    const v3, 0x7f0a045b

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Landroid/widget/TextView;

    .line 143
    .line 144
    iput-object v3, v0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 145
    .line 146
    const v3, 0x7f0a00fa

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Landroid/widget/TextView;

    .line 154
    .line 155
    iput-object v3, v0, Lax/d3/E;->T0:Landroid/widget/TextView;

    .line 156
    .line 157
    const v3, 0x7f0a0420

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 165
    .line 166
    iput-object v3, v0, Lax/d3/E;->U0:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 167
    .line 168
    const v3, 0x7f0a00a0

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iput-object v3, v0, Lax/d3/E;->V0:Landroid/view/View;

    .line 176
    .line 177
    const v3, 0x7f0a0378

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Lcom/voxdon/xplorer/widget/PathBar;

    .line 185
    .line 186
    iput-object v3, v0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 187
    .line 188
    invoke-direct {v0}, Lax/d3/E;->F9()V

    .line 189
    .line 190
    .line 191
    iget-object v3, v0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 192
    .line 193
    invoke-virtual {v0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v3, v4}, Lcom/voxdon/xplorer/widget/PathBar;->setLocationUnit(Lax/c3/K;)V

    .line 198
    .line 199
    .line 200
    iget-object v3, v0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 201
    .line 202
    invoke-virtual {v0}, Lax/d3/E;->B7()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v3, v4}, Lcom/voxdon/xplorer/widget/PathBar;->setRootInfo(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object v3, v0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 210
    .line 211
    new-instance v4, Lax/d3/E$v;

    .line 212
    .line 213
    invoke-direct {v4, v0}, Lax/d3/E$v;-><init>(Lax/d3/E;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v4}, Lcom/voxdon/xplorer/widget/PathBar;->setPathBarListener(Lcom/voxdon/xplorer/widget/PathBar$h;)V

    .line 217
    .line 218
    .line 219
    new-instance v3, Lax/x3/d;

    .line 220
    .line 221
    invoke-virtual {v0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    const v5, 0x7f0a008e

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    const v8, 0x7f0a0099

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v3, v4, v5, v1}, Lax/x3/d;-><init>(Lax/n/c;Landroid/view/View;Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    iput-object v3, v0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 243
    .line 244
    invoke-virtual {v0}, Lax/d3/E;->L9()V

    .line 245
    .line 246
    .line 247
    iget-object v1, v0, Lax/d3/E;->H0:Landroid/view/View;

    .line 248
    .line 249
    new-instance v3, Lax/d3/E$G;

    .line 250
    .line 251
    invoke-direct {v3, v0}, Lax/d3/E$G;-><init>(Lax/d3/E;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    .line 256
    .line 257
    iget-object v1, v0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 258
    .line 259
    const/4 v3, 0x3

    .line 260
    invoke-virtual {v1, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 261
    .line 262
    .line 263
    iget-object v1, v0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 264
    .line 265
    invoke-virtual {v1, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 266
    .line 267
    .line 268
    new-instance v10, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-static {v1}, Lax/Q2/p;->a(Landroid/content/Context;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-nez v1, :cond_12e

    .line 282
    .line 283
    iget-object v1, v0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 284
    .line 285
    new-instance v3, Lax/d3/E$m0;

    .line 286
    .line 287
    invoke-direct {v3, v1}, Lax/d3/E$m0;-><init>(Landroid/widget/AbsListView;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v3}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 291
    .line 292
    .line 293
    iget-object v1, v0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 294
    .line 295
    new-instance v3, Lax/d3/E$m0;

    .line 296
    .line 297
    invoke-direct {v3, v1}, Lax/d3/E$m0;-><init>(Landroid/widget/AbsListView;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v3}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 301
    .line 302
    .line 303
    :cond_12e
    new-instance v1, Lax/d3/E$R;

    .line 304
    .line 305
    invoke-direct {v1, v0}, Lax/d3/E$R;-><init>(Lax/d3/E;)V

    .line 306
    .line 307
    .line 308
    iget-object v3, v0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 309
    .line 310
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 311
    .line 312
    .line 313
    iget-object v3, v0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 314
    .line 315
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 316
    .line 317
    .line 318
    new-instance v14, Lax/d3/E$c0;

    .line 319
    .line 320
    invoke-direct {v14, v0}, Lax/d3/E$c0;-><init>(Lax/d3/E;)V

    .line 321
    .line 322
    .line 323
    iget-object v1, v0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 324
    .line 325
    if-nez v1, :cond_15e

    .line 326
    .line 327
    new-instance v8, Lcom/voxdon/xplorer/widget/a;

    .line 328
    .line 329
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    invoke-virtual {v0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    iget-object v12, v0, Lax/d3/E;->g1:Lax/r3/d;

    .line 338
    .line 339
    invoke-virtual {v0}, Lax/d3/E;->fa()Z

    .line 340
    .line 341
    .line 342
    move-result v15

    .line 343
    const/16 v16, 0x1

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    invoke-direct/range {v8 .. v16}, Lcom/voxdon/xplorer/widget/a;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/r3/d;ILax/x3/z;ZZ)V

    .line 347
    .line 348
    .line 349
    iput-object v8, v0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 350
    .line 351
    :cond_15e
    iget-object v1, v0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 352
    .line 353
    iget-object v3, v0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 354
    .line 355
    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 356
    .line 357
    .line 358
    iget-object v1, v0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 359
    .line 360
    if-nez v1, :cond_17e

    .line 361
    .line 362
    new-instance v8, Lcom/voxdon/xplorer/widget/a;

    .line 363
    .line 364
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    invoke-virtual {v0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    iget-object v12, v0, Lax/d3/E;->g1:Lax/r3/d;

    .line 373
    .line 374
    const/4 v15, 0x0

    .line 375
    const/16 v16, 0x0

    .line 376
    .line 377
    const/4 v13, 0x2

    .line 378
    invoke-direct/range {v8 .. v16}, Lcom/voxdon/xplorer/widget/a;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/r3/d;ILax/x3/z;ZZ)V

    .line 379
    .line 380
    .line 381
    iput-object v8, v0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 382
    .line 383
    :cond_17e
    iget-object v1, v0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 384
    .line 385
    iget-object v3, v0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 386
    .line 387
    invoke-virtual {v1, v3}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 388
    .line 389
    .line 390
    iget-object v1, v0, Lax/d3/E;->D0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 391
    .line 392
    new-instance v3, Lax/d3/E$g0;

    .line 393
    .line 394
    invoke-direct {v3, v0}, Lax/d3/E$g0;-><init>(Lax/d3/E;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 398
    .line 399
    .line 400
    iget-object v1, v0, Lax/d3/E;->E0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 401
    .line 402
    new-instance v3, Lax/d3/E$h0;

    .line 403
    .line 404
    invoke-direct {v3, v0}, Lax/d3/E$h0;-><init>(Lax/d3/E;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 408
    .line 409
    .line 410
    iget-object v1, v0, Lax/d3/E;->C0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 411
    .line 412
    new-instance v3, Lax/d3/E$i0;

    .line 413
    .line 414
    invoke-direct {v3, v0}, Lax/d3/E$i0;-><init>(Lax/d3/E;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Lax/d3/E;->s9()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Lax/d3/E;->z7()I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    invoke-direct {v0, v1}, Lax/d3/E;->la(I)V

    .line 428
    .line 429
    .line 430
    iget-object v1, v0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 431
    .line 432
    invoke-direct {v0}, Lax/d3/E;->y7()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    invoke-virtual {v1, v3}, Lcom/voxdon/xplorer/widget/a;->m0(I)V

    .line 437
    .line 438
    .line 439
    iget-object v1, v0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 440
    .line 441
    invoke-virtual {v1}, Lcom/voxdon/xplorer/widget/a;->A0()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->x2(Z)V

    .line 445
    .line 446
    .line 447
    new-instance v1, Lax/t3/i;

    .line 448
    .line 449
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    const-string v4, "file"

    .line 454
    .line 455
    invoke-direct {v1, v3, v4}, Lax/t3/i;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    iput-object v1, v0, Lax/d3/E;->I0:Lax/t3/i;

    .line 459
    .line 460
    new-instance v3, Lax/d3/E$j0;

    .line 461
    .line 462
    const-wide/16 v4, 0x190

    .line 463
    .line 464
    invoke-direct {v3, v0, v4, v5}, Lax/d3/E$j0;-><init>(Lax/d3/E;J)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v3}, Lax/t3/i;->i(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 468
    .line 469
    .line 470
    if-eqz v2, :cond_1f7

    .line 471
    .line 472
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-nez v1, :cond_1f7

    .line 477
    .line 478
    const-string v1, "path"

    .line 479
    .line 480
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    iput-object v1, v0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 485
    .line 486
    iput-boolean v7, v0, Lax/d3/E;->o1:Z

    .line 487
    .line 488
    const-string v1, "file_open_path"

    .line 489
    .line 490
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    iput-object v1, v0, Lax/d3/E;->l1:Ljava/lang/String;

    .line 495
    .line 496
    const-string v1, "file_open_last_modified"

    .line 497
    .line 498
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 499
    .line 500
    .line 501
    move-result-wide v1

    .line 502
    iput-wide v1, v0, Lax/d3/E;->m1:J

    .line 503
    .line 504
    :cond_1f7
    return-void
.end method

.method protected L9()V
    .registers 7

    .line 1
    new-instance v0, Lax/d3/E$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/d3/E$f;-><init>(Lax/d3/E;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lax/d3/E;->C1:Landroid/view/View$OnClickListener;

    .line 7
    .line 8
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 9
    .line 10
    const v2, 0x7f13027b

    .line 11
    .line 12
    .line 13
    const v3, 0x7f08018b

    .line 14
    .line 15
    .line 16
    const v4, 0x7f0a0088

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lax/d3/E$g;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lax/d3/E$g;-><init>(Lax/d3/E;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 32
    .line 33
    const v2, 0x7f0801a7

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lax/d3/E;->C1:Landroid/view/View$OnClickListener;

    .line 37
    .line 38
    const v4, 0x7f0a008a

    .line 39
    .line 40
    .line 41
    const v5, 0x7f130292

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v4, v5, v2, v3}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 48
    .line 49
    const v2, 0x7f0801e2

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Lax/d3/E;->C1:Landroid/view/View$OnClickListener;

    .line 53
    .line 54
    const v4, 0x7f0a0097

    .line 55
    .line 56
    .line 57
    const v5, 0x7f1302a2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v4, v5, v2, v3}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 64
    .line 65
    const v2, 0x7f080194

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Lax/d3/E;->C1:Landroid/view/View$OnClickListener;

    .line 69
    .line 70
    const v4, 0x7f0a008b

    .line 71
    .line 72
    .line 73
    const v5, 0x7f13027f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v4, v5, v2, v3}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 81
    .line 82
    invoke-virtual {v2}, Lax/x3/d;->e()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    new-instance v2, Lax/d3/E$h;

    .line 86
    .line 87
    invoke-direct {v2, p0}, Lax/d3/E$h;-><init>(Lax/d3/E;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 94
    .line 95
    new-instance v3, Lax/d3/E$i;

    .line 96
    .line 97
    invoke-direct {v3, p0}, Lax/d3/E$i;-><init>(Lax/d3/E;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3}, Lax/x3/d;->n(Lax/x3/d$f;)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Lax/s/c;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const v4, 0x7f14012a

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, v3, v4}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lax/u/w;

    .line 116
    .line 117
    invoke-direct {v3, v2, v1}, Lax/u/w;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    iput-object v3, p0, Lax/d3/E;->Z0:Lax/u/w;

    .line 121
    .line 122
    const v1, 0x7f0f0012

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v1}, Lax/u/w;->d(I)V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lax/d3/E;->Z0:Lax/u/w;

    .line 129
    .line 130
    new-instance v3, Lax/d3/E$j;

    .line 131
    .line 132
    invoke-direct {v3, p0}, Lax/d3/E$j;-><init>(Lax/d3/E;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v3}, Lax/u/w;->f(Lax/u/w$d;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lax/d3/E;->Z0:Lax/u/w;

    .line 139
    .line 140
    invoke-virtual {v1}, Lax/u/w;->b()Landroid/view/Menu;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    instance-of v3, v1, Landroidx/appcompat/view/menu/e;

    .line 145
    .line 146
    const/4 v4, 0x1

    .line 147
    if-eqz v3, :cond_99

    .line 148
    .line 149
    check-cast v1, Landroidx/appcompat/view/menu/e;

    .line 150
    .line 151
    invoke-virtual {v1, v4}, Landroidx/appcompat/view/menu/e;->b0(Z)V

    .line 152
    .line 153
    .line 154
    :cond_99
    new-instance v1, Lax/u/w;

    .line 155
    .line 156
    invoke-direct {v1, v2, v0}, Lax/u/w;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    iput-object v1, p0, Lax/d3/E;->a1:Lax/u/w;

    .line 160
    .line 161
    const v0, 0x7f0f0011

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v0}, Lax/u/w;->d(I)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lax/d3/E;->a1:Lax/u/w;

    .line 168
    .line 169
    new-instance v1, Lax/d3/E$l;

    .line 170
    .line 171
    invoke-direct {v1, p0}, Lax/d3/E$l;-><init>(Lax/d3/E;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Lax/u/w;->f(Lax/u/w$d;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lax/d3/E;->a1:Lax/u/w;

    .line 178
    .line 179
    invoke-virtual {v0}, Lax/u/w;->b()Landroid/view/Menu;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    instance-of v1, v0, Landroidx/appcompat/view/menu/e;

    .line 184
    .line 185
    if-eqz v1, :cond_bf

    .line 186
    .line 187
    check-cast v0, Landroidx/appcompat/view/menu/e;

    .line 188
    .line 189
    invoke-virtual {v0, v4}, Landroidx/appcompat/view/menu/e;->b0(Z)V

    .line 190
    .line 191
    .line 192
    :cond_bf
    return-void
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

.method public M4()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_45

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/d3/E;->o1:Z

    .line 6
    .line 7
    if-eqz v0, :cond_20

    .line 8
    .line 9
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/W2/c;->t()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    const v0, 0x7f1302de

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

    .line 24
    .line 25
    .line 26
    goto :goto_20

    .line 27
    :cond_1a
    const v0, 0x7f1302c8

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

    .line 31
    .line 32
    .line 33
    :cond_20
    :goto_20
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "Paste to CURRENT PATH INFO == NULL"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "loaded:"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-boolean v2, p0, Lax/d3/E;->o1:Z

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/x;->E1(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_59

    .line 82
    .line 83
    const/4 v0, 0x3

    .line 84
    iget-object v1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 85
    .line 86
    invoke-virtual {p0, v0, v1}, Lax/d3/E;->p9(ILcom/voxdon/xplorer/file/n;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_59
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v3, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 99
    .line 100
    new-instance v4, Lax/d3/E$U;

    .line 101
    .line 102
    invoke-direct {v4, p0}, Lax/d3/E$U;-><init>(Lax/d3/E;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v3, v4}, Lax/W2/c;->o(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/W2/h$a;)V

    .line 106
    .line 107
    .line 108
    :try_start_6b
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0, v2}, Lax/d3/E;->l(Lax/W2/h;Z)V
    :try_end_72
    .catch Lax/b3/c; {:try_start_6b .. :try_end_72} :catch_73

    .line 113
    .line 114
    .line 115
    goto :goto_79

    .line 116
    :catch_73
    const v0, 0x7f130137

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0, v2}, Lax/d3/n;->J4(II)V

    .line 120
    .line 121
    .line 122
    :goto_79
    invoke-virtual {p0}, Lax/d3/n;->J3()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2}, Lax/d3/n;->e4(Z)V

    .line 126
    .line 127
    .line 128
    return-void
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

.method public N3()Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->v7()Lcom/voxdon/xplorer/file/n;

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
    return v1

    .line 9
    :cond_8
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    invoke-static {}, Lax/W2/c;->q()Lax/W2/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lax/d3/E;->v7()Lcom/voxdon/xplorer/file/n;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Lax/W2/c;->k(Lcom/voxdon/xplorer/file/n;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1e

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    const/4 v0, 0x1

    .line 32
    return v0
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

.method public N8()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2e

    .line 4
    .line 5
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Open settings with no path"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "location:"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0}, Lax/d3/E;->V9()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p0, v0, v1}, Lax/a3/d;->i3(Lax/d3/n;Ljava/lang/String;Z)Lax/a3/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "settings"

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {p0, v0, v1, v2}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    new-instance v0, Lax/d3/D;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Lax/d3/D;-><init>(Lax/d3/E;)V

    .line 66
    .line 67
    .line 68
    const-string v1, "view_settings_request"

    .line 69
    .line 70
    invoke-static {p0, v1, v0}, Lax/d3/J;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/util/function/Consumer;)V

    .line 71
    .line 72
    .line 73
    return-void
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

.method protected O6(Ljava/util/List;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_48

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    invoke-static {v0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 28
    .line 29
    if-eq v1, v2, :cond_30

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 36
    .line 37
    if-eq v1, v2, :cond_30

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    :cond_30
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "/DCIM"

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_46

    .line 62
    .line 63
    const-string v1, "/DCIM/Camera"

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    :cond_46
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_48
    const/4 p1, 0x0

    .line 74
    return p1
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

.method public O7(Landroid/view/Menu;)V
    .registers 4

    .line 1
    const v0, 0x7f0a02ea

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/d3/E;->y1:Landroid/view/MenuItem;

    .line 9
    .line 10
    if-nez v0, :cond_d

    .line 11
    .line 12
    goto/16 :goto_8a

    .line 13
    .line 14
    :cond_d
    iget-boolean v0, p0, Lax/d3/E;->J0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1a

    .line 17
    .line 18
    const-string v0, "init search is called when searching"

    .line 19
    .line 20
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0}, Lax/d3/E;->A9(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Lax/d3/E;->y1:Landroid/view/MenuItem;

    .line 28
    .line 29
    invoke-static {v0}, Lax/c0/A;->a(Landroid/view/MenuItem;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const v1, 0x7f0a0178

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/widget/EditText;

    .line 41
    .line 42
    iput-object v0, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 43
    .line 44
    new-instance v1, Lax/d3/E$n;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lax/d3/E$n;-><init>(Lax/d3/E;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lax/d3/E;->y1:Landroid/view/MenuItem;

    .line 59
    .line 60
    new-instance v1, Lax/d3/E$o;

    .line 61
    .line 62
    invoke-direct {v1, p0, p1}, Lax/d3/E$o;-><init>(Lax/d3/E;Landroid/view/Menu;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lax/c0/A;->h(Landroid/view/MenuItem;Lax/c0/A$c;)Landroid/view/MenuItem;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

    .line 69
    .line 70
    new-instance v1, Lax/d3/E$p;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lax/d3/E$p;-><init>(Lax/d3/E;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 76
    .line 77
    .line 78
    const v0, 0x7f0a02eb

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lax/d3/E;->z1:Landroid/view/MenuItem;

    .line 86
    .line 87
    if-eqz p1, :cond_8a

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_8a

    .line 94
    .line 95
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/b;->e0()Lax/x3/h;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lax/x3/h;->e()Landroidx/appcompat/widget/Toolbar;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const v0, 0x7f08015c

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0}, Lax/o/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, Lax/d3/E;->B1:Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    const v0, 0x7f080152

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v0}, Lax/o/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Lax/d3/E;->A1:Landroid/graphics/drawable/Drawable;

    .line 128
    .line 129
    iget-object p1, p0, Lax/d3/E;->z1:Landroid/view/MenuItem;

    .line 130
    .line 131
    new-instance v0, Lax/d3/E$q;

    .line 132
    .line 133
    invoke-direct {v0, p0}, Lax/d3/E$q;-><init>(Lax/d3/E;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 137
    .line 138
    .line 139
    :cond_8a
    :goto_8a
    return-void
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public O8()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lax/T2/h;->B(Lax/c3/K;)Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->n(Landroid/content/Context;Lax/c3/K;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    const-string v4, "pathbar_analysis"

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3, v1, v4}, Lcom/voxdon/xplorer/activity/MainActivity;->d2(Lax/c3/K;ZLcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;)V

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

.method public O9()V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/d3/E;->a1:Lax/u/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/u/w;->g()V
    :try_end_5
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_5} :catch_6

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BADTOKEN 3"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "activestate:"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lax/d3/n;->L3()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lax/Ha/b;->h()V

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

.method protected P8(Landroid/net/Uri;)V
    .registers 9

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
    instance-of v0, v0, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 13
    .line 14
    if-eqz v0, :cond_2a

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->c(Landroid/content/Context;Landroid/net/Uri;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    move-object v1, p1

    .line 29
    check-cast v1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 30
    .line 31
    new-instance v6, Lax/d3/E$L;

    .line 32
    .line 33
    invoke-direct {v6, p0}, Lax/d3/E$L;-><init>(Lax/d3/E;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    invoke-static {}, Lax/u3/b;->f()V

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
.end method

.method protected P9(Lax/W2/m;Z)V
    .registers 6

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_9

    .line 6
    .line 7
    const-string v1, "new_folder"

    .line 8
    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const-string v1, "new_file"

    .line 11
    .line 12
    :goto_b
    const-string v2, "menu_folder"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "loc"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lax/d3/E$s;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1}, Lax/d3/E$s;-><init>(Lax/d3/E;Lax/W2/m;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2, v0}, Lax/a3/p;->l3(ZLax/a3/p$d;)Lax/a3/p;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "createFileName"

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-virtual {p0, p1, p2, v0}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
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

.method public Q9()V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/d3/E;->Z0:Lax/u/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/u/w;->g()V
    :try_end_5
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_5} :catch_6

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BADTOKEN 2"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "activestate:"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lax/d3/n;->L3()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lax/Ha/b;->h()V

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

.method public R7()Z
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

.method protected R9()Z
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

.method S6()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/d3/E;->e2:Ljava/util/Set;

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

.method S7()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

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
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public T(ZLjava/lang/Object;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    sget-object v1, Lax/d3/E$k0;->d0:Lax/d3/E$k0;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lax/d3/E;->v9(Lax/d3/E$k0;)V

    .line 7
    .line 8
    .line 9
    goto :goto_11

    .line 10
    :cond_9
    invoke-virtual {p0, v0}, Lax/d3/E;->B9(Z)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lax/d3/E$k0;->q:Lax/d3/E$k0;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lax/d3/E;->v9(Lax/d3/E$k0;)V

    .line 16
    .line 17
    .line 18
    :goto_11
    invoke-virtual {p0, p1, p2}, Lax/d3/E;->m8(ZLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2, v0}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_1f

    .line 29
    .line 30
    iput-boolean v0, p0, Lax/d3/E;->E1:Z

    .line 31
    .line 32
    :cond_1f
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
.end method

.method T7()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/E;->K1:Lax/d3/E$k0;

    .line 8
    .line 9
    sget-object v1, Lax/d3/E$k0;->d0:Lax/d3/E$k0;

    .line 10
    .line 11
    if-ne v0, v1, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_f
    :goto_f
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected T9(II)V
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/d3/E;->ka(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/d3/E;->R0:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 8
    .line 9
    .line 10
    if-eqz p2, :cond_10

    .line 11
    .line 12
    iget-object p1, p0, Lax/d3/E;->S0:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 15
    .line 16
    .line 17
    :cond_10
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

.method public U6()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/d3/E;->o1:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/V2/c;->a()V

    .line 9
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

.method public U8(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->c2:Ljava/lang/String;

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

.method public V()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public V2()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->K3()Z

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
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_b
    iget-object v0, p0, Lax/d3/E;->X0:Landroid/widget/EditText;

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
    iget-object v0, p0, Lax/d3/E;->y1:Landroid/view/MenuItem;

    .line 23
    .line 24
    invoke-interface {v0}, Landroid/view/MenuItem;->collapseActionView()Z

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :cond_1b
    invoke-direct {p0}, Lax/d3/E;->M7()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
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
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

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

.method public V8(Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/d3/E;->b2:Ljava/lang/String;

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

.method public V9()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->H1:Z

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

.method public W(ILandroid/content/Intent;)V
    .registers 9

    .line 1
    if-eqz p2, :cond_c1

    .line 2
    .line 3
    const-string v0, "custom_internal"

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_22

    .line 11
    .line 12
    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1e

    .line 18
    .line 19
    const-string p1, "show_chooser"

    .line 20
    .line 21
    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object p2, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    invoke-direct {p0, p2, p1}, Lax/d3/E;->ba(Lcom/voxdon/xplorer/file/n;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    invoke-static {}, Lax/u3/b;->f()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    if-eqz v0, :cond_3b

    .line 38
    .line 39
    invoke-static {p2}, Lax/c3/u;->S(Landroid/content/Intent;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3b

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p2, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 50
    .line 51
    invoke-static {p1, p2}, Lax/c3/w;->b(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)Z

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 55
    .line 56
    invoke-direct {p0, p1}, Lax/d3/E;->A8(Lcom/voxdon/xplorer/file/n;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    invoke-static {p2}, Lax/c3/u;->T(Landroid/content/Intent;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_a4

    .line 65
    .line 66
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_91

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "http"

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_91

    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Lax/o3/c;->z(Ljava/lang/String;)Lax/Z2/k;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_91

    .line 101
    .line 102
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eqz v0, :cond_91

    .line 107
    .line 108
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->N()Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    :cond_75
    if-ge v2, v1, :cond_91

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 127
    .line 128
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_75

    .line 141
    .line 142
    invoke-virtual {p0, v3}, Lax/d3/E;->G8(Lcom/voxdon/xplorer/file/n;)Z

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_91
    iget-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 147
    .line 148
    if-eqz p1, :cond_c1

    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p2, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 155
    .line 156
    invoke-static {p1, p2}, Lax/c3/w;->b(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)Z

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lax/d3/E;->G8(Lcom/voxdon/xplorer/file/n;)Z

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_a4
    iget-object v0, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 166
    .line 167
    if-eqz v0, :cond_bd

    .line 168
    .line 169
    invoke-static {p2}, Lax/c3/u;->U(Landroid/content/Intent;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_bd

    .line 174
    .line 175
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object p2, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 180
    .line 181
    invoke-static {p1, p2}, Lax/c3/w;->b(Landroid/net/Uri;Lcom/voxdon/xplorer/file/n;)Z

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lax/d3/E;->j1:Lcom/voxdon/xplorer/file/n;

    .line 185
    .line 186
    invoke-direct {p0, p1}, Lax/d3/E;->R8(Lcom/voxdon/xplorer/file/n;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_bd
    const/4 v0, 0x0

    .line 191
    invoke-direct {p0, p2, p1, v2, v0}, Lax/d3/E;->B8(Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    :cond_c1
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
    iget-object p1, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 12
    .line 13
    const v0, 0x7f08008c

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/widget/PathBar;->s(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lax/d3/E;->d7()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lax/d3/E;->g9()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_27

    .line 36
    .line 37
    invoke-direct {p0, v0}, Lax/d3/E;->h7(Z)V

    .line 38
    .line 39
    .line 40
    :cond_27
    iget-object p1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/widget/a;->g0(Z)V

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
.end method

.method public W8()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/d3/E;->M1:Z

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

.method protected W9(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E;->M0:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_19

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R0()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0a0224

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/view/ViewStub;

    .line 17
    .line 18
    if-eqz v0, :cond_19

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lax/d3/E;->M0:Landroid/view/View;

    .line 25
    .line 26
    :cond_19
    iget-object v0, p0, Lax/d3/E;->M0:Landroid/view/View;

    .line 27
    .line 28
    if-eqz v0, :cond_29

    .line 29
    .line 30
    if-eqz p1, :cond_24

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    const/16 p1, 0x8

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    :cond_29
    return-void
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
    .registers 4

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
    iget-object p1, p0, Lax/d3/E;->b1:Lax/d3/n$r;

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/d3/n$r;->c()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {p0, p1}, Lax/d3/E;->h7(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, 0x7f060478

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/widget/PathBar;->s(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/widget/a;->g0(Z)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method protected X6()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3c

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/E;->K1:Lax/d3/E$k0;

    .line 8
    .line 9
    sget-object v1, Lax/d3/E$k0;->c0:Lax/d3/E$k0;

    .line 10
    .line 11
    if-ne v0, v1, :cond_21

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lax/Q2/f;->X(Lax/Q2/f;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_20

    .line 22
    .line 23
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lax/Q2/f;->p0(Lax/Q2/f;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_21

    .line 32
    .line 33
    :cond_20
    return-void

    .line 34
    :cond_21
    iget-object v0, p0, Lax/d3/E;->K1:Lax/d3/E$k0;

    .line 35
    .line 36
    sget-object v2, Lax/d3/E$k0;->d0:Lax/d3/E$k0;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    if-ne v0, v2, :cond_2a

    .line 40
    .line 41
    iput-boolean v3, p0, Lax/d3/E;->E1:Z

    .line 42
    .line 43
    :cond_2a
    invoke-virtual {p0, v1}, Lax/d3/E;->v9(Lax/d3/E$k0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Lax/d3/E;->B9(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1, p0, p0}, Lcom/voxdon/xplorer/file/o;->K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3c
    sget-object v0, Lax/d3/E$k0;->d0:Lax/d3/E$k0;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lax/d3/E;->v9(Lax/d3/E$k0;)V

    .line 64
    .line 65
    .line 66
    return-void
    .line 67
    .line 68
.end method

.method public Y3(ILandroid/view/KeyEvent;)Z
    .registers 6

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_b0

    .line 7
    .line 8
    const/16 v0, 0x1d

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq p1, v0, :cond_93

    .line 12
    .line 13
    const/16 v0, 0x1f

    .line 14
    .line 15
    if-eq p1, v0, :cond_86

    .line 16
    .line 17
    const/16 v0, 0x2a

    .line 18
    .line 19
    if-eq p1, v0, :cond_76

    .line 20
    .line 21
    const/16 v0, 0x32

    .line 22
    .line 23
    if-eq p1, v0, :cond_6c

    .line 24
    .line 25
    const/16 v0, 0x34

    .line 26
    .line 27
    if-eq p1, v0, :cond_5f

    .line 28
    .line 29
    const/16 v0, 0x84

    .line 30
    .line 31
    if-eq p1, v0, :cond_4e

    .line 32
    .line 33
    const/16 v0, 0x6f

    .line 34
    .line 35
    if-eq p1, v0, :cond_3e

    .line 36
    .line 37
    const/16 v0, 0x70

    .line 38
    .line 39
    if-eq p1, v0, :cond_2a

    .line 40
    .line 41
    goto/16 :goto_a3

    .line 42
    .line 43
    :cond_2a
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_37

    .line 48
    .line 49
    const p1, 0x7f0a0093

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v1, v2}, Lax/d3/E;->J7(IZZ)Z

    .line 53
    .line 54
    .line 55
    goto :goto_3d

    .line 56
    :cond_37
    const p1, 0x7f0a008b

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v1, v2}, Lax/d3/E;->J7(IZZ)Z

    .line 60
    .line 61
    .line 62
    :goto_3d
    return v2

    .line 63
    :cond_3e
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_76

    .line 68
    .line 69
    invoke-virtual {p0}, Lax/d3/n;->K3()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_76

    .line 74
    .line 75
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 76
    .line 77
    .line 78
    return v2

    .line 79
    :cond_4e
    iget-object p1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 80
    .line 81
    if-eqz p1, :cond_5e

    .line 82
    .line 83
    invoke-direct {p0}, Lax/d3/E;->V7()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_5e

    .line 88
    .line 89
    const p1, 0x7f0a0097

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, v1, v2}, Lax/d3/E;->J7(IZZ)Z

    .line 93
    .line 94
    .line 95
    :cond_5e
    return v2

    .line 96
    :cond_5f
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_a3

    .line 101
    .line 102
    const p1, 0x7f0a008a

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, v1, v2}, Lax/d3/E;->J7(IZZ)Z

    .line 106
    .line 107
    .line 108
    return v2

    .line 109
    :cond_6c
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_a3

    .line 114
    .line 115
    invoke-virtual {p0}, Lax/d3/n;->a4()V

    .line 116
    .line 117
    .line 118
    return v2

    .line 119
    :cond_76
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_a3

    .line 124
    .line 125
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_a3

    .line 130
    .line 131
    invoke-virtual {p0, v2}, Lax/d3/E;->a7(Z)V

    .line 132
    .line 133
    .line 134
    return v2

    .line 135
    :cond_86
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_a3

    .line 140
    .line 141
    const p1, 0x7f0a0088

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1, v1, v2}, Lax/d3/E;->J7(IZZ)Z

    .line 145
    .line 146
    .line 147
    return v2

    .line 148
    :cond_93
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_a3

    .line 153
    .line 154
    iget-object p1, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

    .line 155
    .line 156
    if-eqz p1, :cond_a2

    .line 157
    .line 158
    iget-object p2, p0, Lax/d3/E;->b1:Lax/d3/n$r;

    .line 159
    .line 160
    invoke-virtual {p2, p1}, Lax/d3/n$r;->d(Landroid/widget/AbsListView;)V

    .line 161
    .line 162
    .line 163
    :cond_a2
    return v2

    .line 164
    :cond_a3
    :goto_a3
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    const/16 p2, 0x20

    .line 169
    .line 170
    if-lt p1, p2, :cond_b0

    .line 171
    .line 172
    invoke-direct {p0, p1}, Lax/d3/E;->a9(I)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    return p1

    .line 177
    :cond_b0
    return v1
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

.method public Y7()Z
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

.method Y8(Landroid/view/Menu;)V
    .registers 3

    .line 1
    const v0, 0x7f0a02d5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lax/d3/E;->i7(Landroid/view/Menu;I)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_16

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/d3/E;->K6()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_16

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 21
    .line 22
    .line 23
    :cond_16
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
.end method

.method protected Y9(Ljava/lang/String;)Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-boolean v3, p0, Lax/d3/E;->H1:Z

    .line 14
    .line 15
    invoke-static {v0, v1, v2, p1, v3}, Lax/t3/e;->h(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method

.method public Z3(Ljava/lang/String;)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-direct {p0}, Lax/d3/E;->N7()V

    .line 6
    .line 7
    .line 8
    :cond_7
    if-nez p1, :cond_b

    .line 9
    .line 10
    goto/16 :goto_d4

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v0, :cond_11

    .line 15
    .line 16
    goto/16 :goto_d4

    .line 17
    .line 18
    :cond_11
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Lax/d3/E;->c2:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, p0, Lax/d3/E;->d2:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-nez v0, :cond_b0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_7b

    .line 35
    .line 36
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_7b

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lax/Q2/f;->D0(Lax/Q2/f;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_7b

    .line 51
    .line 52
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lax/V2/c;->b(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_7b

    .line 59
    .line 60
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, "!! ADDED BUT NOT CONNECT OPEN !!"

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v3, "location: "

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v3, ","

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e1()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lax/d3/n;->S3()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 122
    .line 123
    .line 124
    :cond_7b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_ab

    .line 129
    .line 130
    invoke-virtual {p0}, Lax/d3/n;->S3()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_ab

    .line 135
    .line 136
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_98

    .line 141
    .line 142
    invoke-direct {p0}, Lax/d3/E;->L6()V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lax/d3/E;->p1:Ljava/lang/String;

    .line 146
    .line 147
    iput-boolean v1, p0, Lax/d3/E;->D1:Z

    .line 148
    .line 149
    invoke-virtual {p0}, Lax/d3/E;->X6()V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_98
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 154
    .line 155
    invoke-virtual {v0, p1}, Lax/V2/c;->b(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_a4

    .line 160
    .line 161
    invoke-direct {p0, v0}, Lax/d3/E;->D8(Lcom/voxdon/xplorer/file/n;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_a4
    invoke-direct {p0}, Lax/d3/E;->L6()V

    .line 166
    .line 167
    .line 168
    invoke-direct {p0, p1}, Lax/d3/E;->j7(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_ab
    iput-object p1, p0, Lax/d3/E;->p1:Ljava/lang/String;

    .line 173
    .line 174
    iput-boolean v1, p0, Lax/d3/E;->D1:Z

    .line 175
    .line 176
    return-void

    .line 177
    :cond_b0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_bf

    .line 182
    .line 183
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_bf

    .line 188
    .line 189
    invoke-virtual {p0}, Lax/d3/E;->j9()V

    .line 190
    .line 191
    .line 192
    :cond_bf
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-eqz v0, :cond_d4

    .line 197
    .line 198
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-virtual {v0, v2, v3, p1, v1}, Lcom/voxdon/xplorer/activity/b;->w0(Lax/Q2/f;ILjava/lang/String;Z)V

    .line 211
    .line 212
    .line 213
    :cond_d4
    :goto_d4
    return-void
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

.method Z8(ZLjava/lang/Object;)V
    .registers 6

    .line 1
    const/4 p2, 0x1

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    invoke-virtual {p0}, Lax/d3/E;->h9()V

    .line 5
    .line 6
    .line 7
    const-string p1, "success"

    .line 8
    .line 9
    goto :goto_2b

    .line 10
    :cond_9
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const v0, 0x7f1302c5

    .line 23
    .line 24
    .line 25
    new-array v1, p2, [Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    aput-object p1, v1, v2

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1, p2}, Lax/d3/n;->K4(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    const-string p1, "on_connect_result"

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lax/d3/n;->i3(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p1, "failure"

    .line 43
    .line 44
    :goto_2b
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string v0, "network"

    .line 49
    .line 50
    const-string v1, "connect_cloud"

    .line 51
    .line 52
    invoke-virtual {p2, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "loc"

    .line 65
    .line 66
    invoke-virtual {p2, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const-string v0, "result"

    .line 71
    .line 72
    invoke-virtual {p2, v0, p1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 77
    .line 78
    .line 79
    return-void
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

.method protected a7(Z)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 9
    .line 10
    if-eqz v0, :cond_1f

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/x;->E1(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1f

    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Lax/d3/E;->p9(ILcom/voxdon/xplorer/file/n;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    invoke-static {}, Lax/W2/m;->n()Lax/W2/m;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v3, Lax/d3/E$r;

    .line 43
    .line 44
    invoke-direct {v3, p0}, Lax/d3/E$r;-><init>(Lax/d3/E;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, p1, v3}, Lax/W2/m;->k(Lcom/voxdon/xplorer/file/o;Ljava/lang/String;ZLax/W2/h$a;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, p1}, Lax/d3/E;->P9(Lax/W2/m;Z)V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public a8()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    invoke-static {}, Lax/u3/b;->f()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_b
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lax/d3/E;->v7()Lcom/voxdon/xplorer/file/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->e0(Lcom/voxdon/xplorer/file/n;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
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

.method protected aa()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_23

    .line 6
    .line 7
    const v0, 0x7f1302cf

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f130139

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v3, "/DCIM/Camera"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object v3, Lax/W2/h$b;->d0:Lax/W2/h$b;

    .line 32
    .line 33
    invoke-virtual {p0, v3, v0, v1, v2}, Lax/d3/n;->y4(Lax/W2/h$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected b4(I)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "loc"

    .line 3
    .line 4
    const-string v2, "menu_folder"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    sparse-switch p1, :sswitch_data_4e

    .line 8
    .line 9
    .line 10
    return v0

    .line 11
    :sswitch_a
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "view_settings"

    .line 16
    .line 17
    invoke-virtual {p1, v2, v0}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lax/d3/E;->N8()V

    .line 37
    .line 38
    .line 39
    return v3

    .line 40
    :sswitch_27
    const v1, 0x7f0a02d7

    .line 41
    .line 42
    .line 43
    if-ne p1, v1, :cond_2d

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    :cond_2d
    invoke-virtual {p0, v0}, Lax/d3/E;->a7(Z)V

    .line 47
    .line 48
    .line 49
    return v3

    .line 50
    :sswitch_31
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v0, "analyze_path"

    .line 55
    .line 56
    invoke-virtual {p1, v2, v0}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lax/d3/E;->H6()V

    .line 76
    .line 77
    .line 78
    return v3

    .line 79
    :sswitch_data_4e
    .sparse-switch
        0x7f0a02c6 -> :sswitch_31
        0x7f0a02d6 -> :sswitch_27
        0x7f0a02d7 -> :sswitch_27
        0x7f0a02f7 -> :sswitch_a
    .end sparse-switch
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

.method public b8(II)V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lax/d3/E;->c8(IIZ)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_1b

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/voxdon/xplorer/activity/b;->w0(Lax/Q2/f;ILjava/lang/String;Z)V

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

.method b9()V
    .registers 4

    .line 1
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/W2/w;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2d

    .line 10
    .line 11
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/W2/w;->d()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lax/W2/w;->e()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v0, v2, :cond_2d

    .line 32
    .line 33
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v0, :cond_2d

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2d

    .line 42
    .line 43
    invoke-virtual {p0}, Lax/d3/E;->w9()V

    .line 44
    .line 45
    .line 46
    :cond_2d
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
.end method

.method public c4(Z)V
    .registers 2

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->g()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lax/d3/E;->S6()V

    .line 11
    .line 12
    .line 13
    :cond_c
    invoke-direct {p0}, Lax/d3/E;->l9()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, Lax/d3/E;->k9(Z)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method protected c7(Ljava/util/List;I)V
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
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->l(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    invoke-virtual {p0, p1}, Lax/d3/E;->O6(Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_12

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/E;->aa()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v7, Lax/d3/E$E;

    .line 24
    .line 25
    invoke-direct {v7, p0}, Lax/d3/E$E;-><init>(Lax/d3/E;)V

    .line 26
    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    move-object v5, p0

    .line 31
    move-object v2, p1

    .line 32
    move v3, p2

    .line 33
    invoke-static/range {v1 .. v8}, Lax/W2/o;->m(Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZLax/d3/s;ZLax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public c8(IIZ)V
    .registers 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    goto/16 :goto_b0

    .line 14
    .line 15
    :cond_e
    :try_start_e
    invoke-virtual {p0}, Lax/d3/E;->T7()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_68

    .line 20
    .line 21
    iget-object v0, p0, Lax/d3/E;->F0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_26

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->m()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_23

    .line 30
    .line 31
    const-string v0, "true"

    .line 32
    .line 33
    goto :goto_28

    .line 34
    :catch_21
    nop

    .line 35
    goto :goto_68

    .line 36
    :cond_23
    const-string v0, "false"

    .line 37
    .line 38
    goto :goto_28

    .line 39
    :cond_26
    const-string v0, "null"

    .line 40
    .line 41
    :goto_28
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "!! NOT CONNECT SCANTASK!!!!"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v3, ",refreshing:"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ",connectionstatus:"

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lax/d3/E;->K1:Lax/d3/E$k0;

    .line 89
    .line 90
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lax/Ha/b;->h()V
    :try_end_67
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_67} :catch_21

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_68
    :goto_68
    invoke-direct {p0}, Lax/d3/E;->M6()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lax/d3/E;->z7()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget v1, p0, Lax/d3/E;->O0:I

    .line 113
    .line 114
    if-eq v0, v1, :cond_76

    .line 115
    .line 116
    invoke-direct {p0, v0}, Lax/d3/E;->la(I)V

    .line 117
    .line 118
    .line 119
    :cond_76
    invoke-direct {p0}, Lax/d3/E;->y7()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iget-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/voxdon/xplorer/widget/a;->S()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eq v1, v0, :cond_94

    .line 130
    .line 131
    iget-object v1, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->m0(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->i0()Landroid/graphics/Point;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget v0, v0, Landroid/graphics/Point;->x:I

    .line 145
    .line 146
    invoke-direct {p0, v0}, Lax/d3/E;->y9(I)V

    .line 147
    .line 148
    .line 149
    :cond_94
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/voxdon/xplorer/widget/a;->A0()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lax/d3/E;->b9()V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 158
    .line 159
    iget-object v1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/PathBar;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lax/d3/E$r0;

    .line 165
    .line 166
    invoke-direct {v0, p0, p1, p2, p3}, Lax/d3/E$r0;-><init>(Lax/d3/E;IIZ)V

    .line 167
    .line 168
    .line 169
    iput-object v0, p0, Lax/d3/E;->u1:Lax/d3/E$r0;

    .line 170
    .line 171
    const/4 p1, 0x0

    .line 172
    new-array p1, p1, [Ljava/lang/Void;

    .line 173
    .line 174
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 175
    .line 176
    .line 177
    :cond_b0
    :goto_b0
    return-void
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

.method c9(ZLjava/lang/Object;Ljava/lang/String;)V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_22

    .line 4
    .line 5
    if-eqz p2, :cond_d

    .line 6
    .line 7
    instance-of p1, p2, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p1, :cond_d

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 p2, 0x0

    .line 15
    :goto_e
    if-eqz p2, :cond_1c

    .line 16
    .line 17
    iget-boolean p1, p0, Lax/d3/E;->D1:Z

    .line 18
    .line 19
    if-nez p1, :cond_1c

    .line 20
    .line 21
    iget-boolean p1, p0, Lax/d3/E;->E1:Z

    .line 22
    .line 23
    if-nez p1, :cond_1c

    .line 24
    .line 25
    invoke-virtual {p0, p2, v1, v1}, Lax/d3/E;->u8(Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    goto :goto_1f

    .line 29
    :cond_1c
    invoke-virtual {p0}, Lax/d3/E;->h9()V

    .line 30
    .line 31
    .line 32
    :goto_1f
    const-string p1, "success"

    .line 33
    .line 34
    goto :goto_8a

    .line 35
    :cond_22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_83

    .line 40
    .line 41
    const p1, 0x7f1302c5

    .line 42
    .line 43
    .line 44
    new-array v2, v0, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object p3, v2, v1

    .line 47
    .line 48
    invoke-virtual {p0, p1, v2}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-static {p3}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eqz p3, :cond_7a

    .line 61
    .line 62
    instance-of p3, p2, Ljava/lang/String;

    .line 63
    .line 64
    const-string v2, " : "

    .line 65
    .line 66
    if-eqz p3, :cond_57

    .line 67
    .line 68
    new-instance p3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_55
    const/4 v1, 0x1

    .line 87
    goto :goto_7a

    .line 88
    :cond_57
    instance-of p3, p2, Ljava/lang/Exception;

    .line 89
    .line 90
    if-eqz p3, :cond_7a

    .line 91
    .line 92
    check-cast p2, Ljava/lang/Exception;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    if-eqz p3, :cond_7a

    .line 99
    .line 100
    new-instance p3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    goto :goto_55

    .line 123
    :cond_7a
    :goto_7a
    if-eqz v1, :cond_80

    .line 124
    .line 125
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->I4(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    goto :goto_83

    .line 129
    :cond_80
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->K4(Ljava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    :cond_83
    :goto_83
    const-string p1, "on_connect_result"

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Lax/d3/n;->i3(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string p1, "failure"

    .line 138
    .line 139
    :goto_8a
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    const-string p3, "network"

    .line 144
    .line 145
    const-string v0, "connect_remote"

    .line 146
    .line 147
    invoke-virtual {p2, p3, v0}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-virtual {p3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    const-string v0, "loc"

    .line 160
    .line 161
    invoke-virtual {p2, v0, p3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    const-string p3, "result"

    .line 166
    .line 167
    invoke-virtual {p2, p3, p1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 172
    .line 173
    .line 174
    return-void
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

.method protected ca()Z
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

.method protected d7()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/d;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/d3/E;->Z0:Lax/u/w;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/u/w;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/E;->a1:Lax/u/w;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/u/w;->a()V

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

.method protected da(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 6
    .line 7
    if-eq v0, v1, :cond_1d

    .line 8
    .line 9
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 10
    .line 11
    if-ne v0, v1, :cond_d

    .line 12
    .line 13
    goto :goto_1d

    .line 14
    :cond_d
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->c0(Lcom/voxdon/xplorer/file/n;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1b

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->u0(Lcom/voxdon/xplorer/file/n;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1b

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_1b
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1d
    :goto_1d
    const-string p1, "/DCIM/Camera"

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->W()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
    .line 41
.end method

.method protected e7()Z
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

.method public e9(Ljava/lang/String;Ljava/lang/String;Lax/Z2/p;Ljava/lang/String;II)V
    .registers 16

    .line 1
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-object v5, p3

    .line 10
    move-object v6, p4

    .line 11
    move v7, p5

    .line 12
    move v8, p6

    .line 13
    invoke-virtual/range {v0 .. v8}, Lax/V2/c;->g(Ljava/lang/String;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/lang/String;Lax/Z2/p;Ljava/lang/String;II)V

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
.end method

.method public f()V
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
    const v0, 0x7f130340

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->E4(II)V

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

.method f8(Ljava/util/List;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->F0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_22

    .line 10
    .line 11
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
    move-result v0

    .line 19
    if-eqz v0, :cond_22

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_e

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_22
    const/4 p1, 0x0

    .line 36
    return p1
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

.method protected fa()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/t3/k;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_d

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/d3/E;->H1:Z

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public h3()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/d3/E;->r9()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lax/d3/n;->h3()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/x3/d;->k()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    if-eq v0, v1, :cond_26

    .line 16
    .line 17
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "BOTTOM MENU VISIBILITY NOT GONE!!!!"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lax/x3/d;->y(I)V

    .line 37
    .line 38
    .line 39
    :cond_26
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
.end method

.method protected h8(Lax/W2/h$b;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->j9()V

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

.method protected h9()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/d3/E;->D1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_d

    .line 5
    .line 6
    iget-object v0, p0, Lax/d3/E;->p1:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lax/d3/E;->j7(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-boolean v1, p0, Lax/d3/E;->D1:Z

    .line 12
    .line 13
    goto :goto_18

    .line 14
    :cond_d
    iget-boolean v0, p0, Lax/d3/E;->o1:Z

    .line 15
    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-virtual {p0}, Lax/d3/E;->j9()V

    .line 19
    .line 20
    .line 21
    goto :goto_18

    .line 22
    :cond_15
    invoke-virtual {p0, v1, v1}, Lax/d3/E;->b8(II)V

    .line 23
    .line 24
    .line 25
    :goto_18
    invoke-virtual {p0, v1}, Lax/d3/n;->e4(Z)V

    .line 26
    .line 27
    .line 28
    iput-boolean v1, p0, Lax/d3/E;->E1:Z

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public i1(IILandroid/content/Intent;)V
    .registers 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->i1(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x3ea

    .line 5
    .line 6
    if-ne p1, p2, :cond_b

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-direct {p0, p1}, Lax/d3/E;->N6(Z)V

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

.method public i4()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/d3/n;->i4()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 5
    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/d3/E;->s9()V

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
.end method

.method i7(Landroid/view/Menu;I)V
    .registers 3

    .line 1
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1a

    .line 6
    .line 7
    iget-object p2, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 8
    .line 9
    if-eqz p2, :cond_16

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/d3/E;->T7()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_11

    .line 16
    .line 17
    goto :goto_16

    .line 18
    :cond_11
    const/4 p2, 0x1

    .line 19
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    :goto_16
    const/4 p2, 0x0

    .line 24
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 25
    .line 26
    .line 27
    :cond_1a
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

.method protected i8(Z)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_17

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/voxdon/xplorer/activity/b;->t0(Lax/Q2/f;ILjava/lang/String;Z)V

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

.method protected ia(Landroid/view/Menu;)V
    .registers 3

    .line 1
    const v0, 0x7f0a02ea

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

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

.method public j1(Landroid/app/Activity;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v0, "parent_location"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lax/Q2/f;

    .line 15
    .line 16
    iput-object p1, p0, Lax/d3/E;->G1:Lax/Q2/f;

    .line 17
    .line 18
    iget-object p1, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 19
    .line 20
    if-eqz p1, :cond_28

    .line 21
    .line 22
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "ATTACHED AGAIN!!!!!"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, ""

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 39
    .line 40
    .line 41
    :cond_28
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->i0()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4a

    .line 61
    .line 62
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/service/b;->e(Lcom/voxdon/xplorer/file/o;)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    invoke-direct {p0}, Lax/d3/E;->N7()V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 79
    .line 80
    if-nez p1, :cond_60

    .line 81
    .line 82
    new-instance p1, Lax/r3/d;

    .line 83
    .line 84
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-direct {p1, v0, v1}, Lax/r3/d;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/o;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 96
    .line 97
    :cond_60
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string v0, "check_file_update"

    .line 102
    .line 103
    iget-object v1, p0, Lax/d3/E;->p2:Landroid/content/BroadcastReceiver;

    .line 104
    .line 105
    invoke-virtual {p1, v0, v1}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v0, "local.intent.action.SHOW_CODEC_DOWNLOAD"

    .line 113
    .line 114
    iget-object v1, p0, Lax/d3/E;->o2:Landroid/content/BroadcastReceiver;

    .line 115
    .line 116
    invoke-virtual {p1, v0, v1}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 117
    .line 118
    .line 119
    return-void
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

.method public j3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

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
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, v1}, Lax/d3/E;->u7(Z)Ljava/util/List;

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

.method protected j8(Z)V
    .registers 2

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-direct {p0}, Lax/d3/E;->i9()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    invoke-direct {p0}, Lax/d3/E;->oa()V

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

.method public j9()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_13

    .line 10
    .line 11
    iget-boolean v0, p0, Lax/d3/E;->o1:Z

    .line 12
    .line 13
    if-eqz v0, :cond_13

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Lax/d3/E;->k9(Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lax/d3/E;->k9(Z)V

    .line 22
    .line 23
    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected k8(Ljava/util/List;)V
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
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a008b

    .line 6
    .line 7
    .line 8
    const v2, 0x7f0a0097

    .line 9
    .line 10
    .line 11
    const v3, 0x7f0a008a

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    if-nez v0, :cond_21

    .line 17
    .line 18
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 19
    .line 20
    invoke-virtual {v0, v3, v5}, Lax/x3/d;->o(IZ)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 24
    .line 25
    invoke-virtual {v0, v2, v5}, Lax/x3/d;->o(IZ)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->o(IZ)V

    .line 31
    .line 32
    .line 33
    goto :goto_30

    .line 34
    :cond_21
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 35
    .line 36
    invoke-virtual {v0, v3, v4}, Lax/x3/d;->o(IZ)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 40
    .line 41
    invoke-virtual {v0, v2, v4}, Lax/x3/d;->o(IZ)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->o(IZ)V

    .line 47
    .line 48
    .line 49
    :goto_30
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 50
    .line 51
    const v1, 0x7f0f0021

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lax/x3/d;->l(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lax/c3/B;->B(Ljava/util/List;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_46

    .line 62
    .line 63
    iget-object v1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 64
    .line 65
    const v2, 0x7f0a02f1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2, v5}, Lax/x3/d;->t(IZ)V

    .line 69
    .line 70
    .line 71
    :cond_46
    const v1, 0x7f0a02e1

    .line 72
    .line 73
    .line 74
    if-eqz v0, :cond_6b

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_6b

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lcom/voxdon/xplorer/sharing/QuickShareProvider;->a(Landroid/content/Context;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_6b

    .line 91
    .line 92
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6b

    .line 101
    .line 102
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 103
    .line 104
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 105
    .line 106
    .line 107
    goto :goto_70

    .line 108
    :cond_6b
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 109
    .line 110
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 111
    .line 112
    .line 113
    :goto_70
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const v1, 0x7f0a02c9

    .line 122
    .line 123
    .line 124
    if-eqz v0, :cond_8f

    .line 125
    .line 126
    invoke-static {p1}, Lax/c3/A;->t(Ljava/util/List;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_89

    .line 131
    .line 132
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 133
    .line 134
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 135
    .line 136
    .line 137
    goto :goto_94

    .line 138
    :cond_89
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 139
    .line 140
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 141
    .line 142
    .line 143
    goto :goto_94

    .line 144
    :cond_8f
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 145
    .line 146
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 147
    .line 148
    .line 149
    :goto_94
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    const v1, 0x7f0a02d0

    .line 158
    .line 159
    .line 160
    if-eqz v0, :cond_b3

    .line 161
    .line 162
    invoke-static {p1}, Lax/c3/A;->A(Ljava/util/List;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_ad

    .line 167
    .line 168
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 169
    .line 170
    invoke-virtual {p1, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_ad
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 175
    .line 176
    invoke-virtual {p1, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_b3
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 181
    .line 182
    invoke-virtual {p1, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 183
    .line 184
    .line 185
    return-void
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
.end method

.method public k9(Z)V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, v0, v0, p1}, Lax/d3/E;->c8(IIZ)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    const/4 p1, -0x1

    .line 10
    invoke-virtual {p0, p1, p1, v0}, Lax/d3/E;->c8(IIZ)V

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

.method public l(Lax/W2/h;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/c;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/n;->l(Lax/W2/h;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-direct {p0, p1, v0, v1}, Lax/d3/E;->F6(Lcom/voxdon/xplorer/file/n;J)V

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

.method protected l7(Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/lang/String;Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/W2/t$a;",
            "Ljava/lang/String;",
            "Landroid/os/ParcelFileDescriptor;",
            "Lcom/voxdon/xplorer/file/n;",
            "Lax/c3/k;",
            "Ljava/lang/String;",
            "Lcom/voxdon/xplorer/file/o;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p7 .. p7}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lax/d3/E;->X9(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_2e

    .line 12
    :cond_b
    invoke-static {}, Lax/W2/t;->n()Lax/W2/t;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v10, Lax/d3/E$I;

    .line 17
    .line 18
    invoke-direct {v10, p0}, Lax/d3/E$I;-><init>(Lax/d3/E;)V

    .line 19
    .line 20
    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v4, p3

    .line 24
    move-object v5, p4

    .line 25
    move-object/from16 v6, p5

    .line 26
    .line 27
    move-object/from16 v8, p6

    .line 28
    .line 29
    move-object/from16 v7, p7

    .line 30
    .line 31
    move-object/from16 v9, p8

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v10}, Lax/W2/t;->l(Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;Lax/W2/h$a;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    :try_start_24
    invoke-virtual {p0, v1, p1}, Lax/d3/E;->l(Lax/W2/h;Z)V
    :try_end_27
    .catch Lax/b3/c; {:try_start_24 .. :try_end_27} :catch_28

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_28
    const p2, 0x7f130137

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2, p1}, Lax/d3/n;->J4(II)V

    .line 45
    .line 46
    .line 47
    :goto_2e
    return-void
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
.end method

.method protected l8(Lcom/voxdon/xplorer/file/n;)V
    .registers 8

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7f0a008b

    .line 9
    .line 10
    .line 11
    const v2, 0x7f0a0097

    .line 12
    .line 13
    .line 14
    const v3, 0x7f0a008a

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    if-nez v0, :cond_24

    .line 20
    .line 21
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 22
    .line 23
    invoke-virtual {v0, v3, v5}, Lax/x3/d;->o(IZ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v5}, Lax/x3/d;->o(IZ)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->o(IZ)V

    .line 34
    .line 35
    .line 36
    goto :goto_33

    .line 37
    :cond_24
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Lax/x3/d;->o(IZ)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 43
    .line 44
    invoke-virtual {v0, v2, v4}, Lax/x3/d;->o(IZ)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->o(IZ)V

    .line 50
    .line 51
    .line 52
    :goto_33
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 53
    .line 54
    const v1, 0x7f0f0023

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lax/x3/d;->l(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const v1, 0x7f0a02c9

    .line 69
    .line 70
    .line 71
    if-eqz v0, :cond_5a

    .line 72
    .line 73
    invoke-static {p1}, Lax/c3/A;->s(Lcom/voxdon/xplorer/file/n;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_54

    .line 78
    .line 79
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 80
    .line 81
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 82
    .line 83
    .line 84
    goto :goto_5f

    .line 85
    :cond_54
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 88
    .line 89
    .line 90
    goto :goto_5f

    .line 91
    :cond_5a
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 92
    .line 93
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 94
    .line 95
    .line 96
    :goto_5f
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const v1, 0x7f0a02e1

    .line 101
    .line 102
    .line 103
    if-eqz v0, :cond_8e

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lcom/voxdon/xplorer/sharing/QuickShareProvider;->a(Landroid/content/Context;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_8e

    .line 114
    .line 115
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_8e

    .line 124
    .line 125
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_88

    .line 130
    .line 131
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 132
    .line 133
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 134
    .line 135
    .line 136
    goto :goto_93

    .line 137
    :cond_88
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 138
    .line 139
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 140
    .line 141
    .line 142
    goto :goto_93

    .line 143
    :cond_8e
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 144
    .line 145
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 146
    .line 147
    .line 148
    :goto_93
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lax/Q2/f;->l0(Lax/Q2/f;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    const v1, 0x7f0a02d0

    .line 157
    .line 158
    .line 159
    if-eqz v0, :cond_b2

    .line 160
    .line 161
    invoke-static {p1}, Lax/c3/A;->z(Lcom/voxdon/xplorer/file/n;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_ac

    .line 166
    .line 167
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 168
    .line 169
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 170
    .line 171
    .line 172
    goto :goto_b7

    .line 173
    :cond_ac
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 174
    .line 175
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 176
    .line 177
    .line 178
    goto :goto_b7

    .line 179
    :cond_b2
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 180
    .line 181
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 182
    .line 183
    .line 184
    :goto_b7
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lax/t3/j;->y(Landroid/content/Context;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_11a

    .line 193
    .line 194
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_11a

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Lax/Q2/f;->j(Lax/Q2/f;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_11a

    .line 209
    .line 210
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_11a

    .line 215
    .line 216
    invoke-interface {p1}, Lax/c3/b;->h()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    const v1, 0x7f0a02d3

    .line 221
    .line 222
    .line 223
    if-eqz v0, :cond_105

    .line 224
    .line 225
    move-object v0, p1

    .line 226
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->H0()Lcom/voxdon/xplorer/file/y$b;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    sget-object v2, Lcom/voxdon/xplorer/file/y$b;->d0:Lcom/voxdon/xplorer/file/y$b;

    .line 233
    .line 234
    if-eq v0, v2, :cond_ef

    .line 235
    .line 236
    sget-object v2, Lcom/voxdon/xplorer/file/y$b;->e0:Lcom/voxdon/xplorer/file/y$b;

    .line 237
    .line 238
    if-ne v0, v2, :cond_11a

    .line 239
    .line 240
    :cond_ef
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 241
    .line 242
    const v2, 0x7f1302b6

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->r(II)V

    .line 246
    .line 247
    .line 248
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 249
    .line 250
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 251
    .line 252
    .line 253
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 254
    .line 255
    const v2, 0x7f08016c

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->p(II)V

    .line 259
    .line 260
    .line 261
    goto :goto_11a

    .line 262
    :cond_105
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 263
    .line 264
    const v2, 0x7f13028b

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->r(II)V

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 271
    .line 272
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 273
    .line 274
    .line 275
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 276
    .line 277
    const v2, 0x7f08015b

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->p(II)V

    .line 281
    .line 282
    .line 283
    :cond_11a
    :goto_11a
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 284
    .line 285
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    xor-int/2addr v1, v4

    .line 290
    const v2, 0x7f0a02f1

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v2, v1}, Lax/x3/d;->t(IZ)V

    .line 294
    .line 295
    .line 296
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 297
    .line 298
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    xor-int/2addr v1, v4

    .line 303
    const v2, 0x7f0a02dc

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v2, v1}, Lax/x3/d;->t(IZ)V

    .line 307
    .line 308
    .line 309
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 310
    .line 311
    const v1, 0x7f0a02c8

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0}, Lax/t3/j;->x(Landroid/content/Context;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    const v1, 0x7f0a02f2

    .line 326
    .line 327
    .line 328
    if-eqz v0, :cond_155

    .line 329
    .line 330
    invoke-virtual {p0}, Lax/d3/E;->R7()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_155

    .line 335
    .line 336
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 337
    .line 338
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 339
    .line 340
    .line 341
    goto :goto_15a

    .line 342
    :cond_155
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 343
    .line 344
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 345
    .line 346
    .line 347
    :goto_15a
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, Lax/t3/j;->z(Landroid/content/Context;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    const v1, 0x7f0a02d9

    .line 356
    .line 357
    .line 358
    if-eqz v0, :cond_172

    .line 359
    .line 360
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 361
    .line 362
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    xor-int/2addr p1, v4

    .line 367
    invoke-virtual {v0, v1, p1}, Lax/x3/d;->t(IZ)V

    .line 368
    .line 369
    .line 370
    goto :goto_177

    .line 371
    :cond_172
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 372
    .line 373
    invoke-virtual {p1, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 374
    .line 375
    .line 376
    :goto_177
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    sget-object v0, Lax/Q2/f;->F0:Lax/Q2/f;

    .line 381
    .line 382
    const v1, 0x7f0a02db

    .line 383
    .line 384
    .line 385
    if-ne p1, v0, :cond_188

    .line 386
    .line 387
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 388
    .line 389
    invoke-virtual {p1, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :cond_188
    iget-object p1, p0, Lax/d3/E;->Y0:Lax/x3/d;

    .line 394
    .line 395
    invoke-virtual {p1, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 396
    .line 397
    .line 398
    return-void
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

.method protected m7(Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/a3/x$b;Ljava/lang/String;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lcom/voxdon/xplorer/file/o;",
            "Lax/a3/x$b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lax/d3/E;->X9(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_26

    .line 12
    :cond_b
    invoke-static {}, Lax/W2/t;->n()Lax/W2/t;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v6, Lax/d3/E$H;

    .line 17
    .line 18
    invoke-direct {v6, p0}, Lax/d3/E$H;-><init>(Lax/d3/E;)V

    .line 19
    .line 20
    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v4, p3

    .line 24
    move-object v5, p4

    .line 25
    invoke-virtual/range {v1 .. v6}, Lax/W2/t;->m(Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/a3/x$b;Ljava/lang/String;Lax/W2/h$a;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    :try_start_1c
    invoke-virtual {p0, v1, p1}, Lax/d3/E;->l(Lax/W2/h;Z)V
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
    :goto_26
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

.method protected m8(ZLjava/lang/Object;)V
    .registers 3

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
.end method

.method public n1(Landroid/os/Bundle;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->n1(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_5d

    .line 5
    .line 6
    sget-object p1, Lax/d3/E;->r2:Ljava/util/logging/Logger;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "Fragment onCreate SavedInstance : tag="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O0()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ",hidden="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lax/d3/E;->e7()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_5d

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_5d

    .line 55
    .line 56
    :try_start_37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1, p0}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroidx/fragment/app/t;->j()I
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_4a} :catch_4b

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catch_4b
    move-exception p1

    .line 77
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v1, "remove saved instance error"

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 92
    .line 93
    .line 94
    :cond_5d
    return-void
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

.method public n7(Lax/a3/x$b;)V
    .registers 12

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-nez v2, :cond_8

    .line 6
    .line 7
    goto/16 :goto_12a

    .line 8
    .line 9
    :cond_8
    iget-object v2, p0, Lax/d3/E;->q1:Ljava/util/List;

    .line 10
    .line 11
    if-nez v2, :cond_33

    .line 12
    .line 13
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "EXTRACTTO!!!:NULL"

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v4, "type:"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v2, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    iget-object v3, p0, Lax/d3/E;->r1:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    iput-object v4, p0, Lax/d3/E;->q1:Ljava/util/List;

    .line 56
    .line 57
    iput-object v4, p0, Lax/d3/E;->r1:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/4 v5, 0x3

    .line 64
    const/4 v6, 0x2

    .line 65
    const/4 v7, 0x1

    .line 66
    if-ne v4, v7, :cond_11c

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    move-object v4, v2

    .line 74
    check-cast v4, Lcom/voxdon/xplorer/file/n;

    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, Lax/W2/t;->k(Ljava/lang/String;)Lax/W2/t$a;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v4}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_5d

    .line 89
    .line 90
    move-object v3, v4

    .line 91
    check-cast v3, Lax/c3/k;

    .line 92
    .line 93
    goto :goto_7c

    .line 94
    :cond_5d
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const v8, 0x7f130137

    .line 103
    .line 104
    .line 105
    if-eqz v3, :cond_d7

    .line 106
    .line 107
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v3}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    :try_start_72
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v9, v3}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lcom/voxdon/xplorer/file/y;
    :try_end_7c
    .catch Lax/b3/j; {:try_start_72 .. :try_end_7c} :catch_d3

    .line 124
    .line 125
    :goto_7c
    sget-object v8, Lax/d3/E$f0;->a:[I

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    aget v1, v8, v1

    .line 132
    .line 133
    move-object v8, v4

    .line 134
    const/4 v4, 0x0

    .line 135
    if-eq v1, v7, :cond_bd

    .line 136
    .line 137
    if-eq v1, v6, :cond_9f

    .line 138
    .line 139
    if-eq v1, v5, :cond_8e

    .line 140
    .line 141
    goto/16 :goto_12a

    .line 142
    .line 143
    :cond_8e
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    move-object v5, v3

    .line 148
    invoke-virtual {v8}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const/4 v7, 0x0

    .line 153
    move-object v0, p0

    .line 154
    move-object v6, v5

    .line 155
    move-object v5, v8

    .line 156
    invoke-virtual/range {v0 .. v7}, Lax/d3/E;->q8(Lax/c3/K;Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_9f
    move-object v1, v2

    .line 161
    move-object v5, v3

    .line 162
    move-object v3, v4

    .line 163
    move-object v4, v8

    .line 164
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v0, v2}, Lax/c3/d0;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    const/4 v8, 0x0

    .line 185
    move-object v0, p0

    .line 186
    invoke-virtual/range {v0 .. v8}, Lax/d3/E;->l7(Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/lang/String;Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_bd
    move-object v1, v2

    .line 191
    move-object v5, v3

    .line 192
    move-object v3, v4

    .line 193
    move-object v4, v8

    .line 194
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    const/4 v8, 0x0

    .line 207
    move-object v0, p0

    .line 208
    invoke-virtual/range {v0 .. v8}, Lax/d3/E;->l7(Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/lang/String;Lcom/voxdon/xplorer/file/o;Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :catch_d3
    invoke-virtual {p0, v8, v7}, Lax/d3/n;->E4(II)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_d7
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-string v2, "INVALID EXTRACT SOURCE FILE INFO"

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    new-instance v2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v3, "loc:"

    .line 236
    .line 237
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v3, ",info:"

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v1, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v8, v7}, Lax/d3/n;->E4(II)V

    .line 279
    .line 280
    .line 281
    invoke-static {}, Lax/u3/b;->f()V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_11c
    sget-object v4, Lax/d3/E$f0;->a:[I

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    aget v4, v4, v8

    .line 292
    .line 293
    if-eq v4, v7, :cond_138

    .line 294
    .line 295
    if-eq v4, v6, :cond_138

    .line 296
    .line 297
    if-eq v4, v5, :cond_12b

    .line 298
    .line 299
    :goto_12a
    return-void

    .line 300
    :cond_12b
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    new-instance v4, Lax/d3/E$y;

    .line 305
    .line 306
    invoke-direct {v4, p0, v2, p1}, Lax/d3/E$y;-><init>(Lax/d3/E;Ljava/util/List;Lax/a3/x$b;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v3, v4}, Lax/d3/E;->r8(Lax/c3/K;Lax/a3/f$j;)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_138
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-virtual {p0, v2, v4, p1, v3}, Lax/d3/E;->m7(Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/a3/x$b;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-void
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

.method public n8()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->m0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6a

    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_34

    .line 14
    .line 15
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "no current path onSettingsChanged"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "location:"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 51
    .line 52
    .line 53
    :cond_34
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iget-object v3, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 66
    .line 67
    iget-boolean v4, p0, Lax/d3/E;->H1:Z

    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->j(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, p0, Lax/d3/E;->P0:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_6a

    .line 80
    .line 81
    iget-object v0, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 82
    .line 83
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Lax/Q2/f;->t()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Lax/r3/d;->D(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 95
    .line 96
    if-eqz v0, :cond_6a

    .line 97
    .line 98
    invoke-static {v0}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6a

    .line 103
    .line 104
    invoke-direct {p0}, Lax/d3/E;->T6()V

    .line 105
    .line 106
    .line 107
    :cond_6a
    invoke-virtual {p0}, Lax/d3/E;->h9()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_76

    .line 115
    .line 116
    invoke-virtual {p0}, Lax/d3/n;->J3()V

    .line 117
    .line 118
    .line 119
    :cond_76
    return-void
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

.method protected n9(Lax/c3/K;Z)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, v1, p2}, Lax/d3/E;->o9(ILax/c3/K;Ljava/lang/String;Z)V

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

.method public na(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_44

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/c3/d0;->D(Lax/c3/K;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_44

    .line 18
    :cond_11
    invoke-virtual {p0}, Lax/d3/E;->S7()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1b

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lax/d3/n;->i3(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    invoke-direct {p0}, Lax/d3/E;->L8()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "navigation"

    .line 36
    .line 37
    const-string v1, "open_folder_back"

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "loc"

    .line 52
    .line 53
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "by"

    .line 58
    .line 59
    const-string v1, "toolbar_back"

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_44
    :goto_44
    invoke-virtual {p0, p1}, Lax/d3/n;->i3(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
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

.method public o9(ILax/c3/K;Ljava/lang/String;Z)V
    .registers 11

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x0

    .line 6
    move v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move v5, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/a;->R(ILax/c3/K;Ljava/lang/String;ZZ)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lax/d3/E;->T8()V

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

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 9

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
    if-eqz v0, :cond_5e

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
    goto :goto_5e

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    if-nez p2, :cond_4b

    .line 19
    .line 20
    iget-object v1, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    iget v5, p1, Lax/T/b;->d:I

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v3, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget-object v4, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iget v5, p1, Lax/T/b;->d:I

    .line 72
    .line 73
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 74
    .line 75
    .line 76
    :cond_4b
    iget-object v1, p0, Lax/d3/E;->V0:Landroid/view/View;

    .line 77
    .line 78
    if-eqz v1, :cond_5e

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 85
    .line 86
    if-nez p2, :cond_5c

    .line 87
    .line 88
    iget p1, p1, Lax/T/b;->d:I

    .line 89
    .line 90
    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 91
    .line 92
    return-void

    .line 93
    :cond_5c
    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 94
    .line 95
    :cond_5e
    :goto_5e
    return-void
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

.method public p8(Lax/c3/V;Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/d3/E;->t1:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "OPEN AS FILEINFO == null"

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-static {v0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_20

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/c3/V;->h()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, v0, p1, p2}, Lax/d3/E;->E8(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    invoke-static {v0}, Lax/c3/B;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_30

    .line 38
    .line 39
    check-cast v0, Lcom/voxdon/xplorer/file/i;

    .line 40
    .line 41
    invoke-virtual {p1}, Lax/c3/V;->h()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, v0, p1, p2}, Lax/d3/E;->v8(Lcom/voxdon/xplorer/file/i;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, Lax/d3/E$J;

    .line 62
    .line 63
    invoke-direct {v3, p0, v0, p1, p2}, Lax/d3/E$J;-><init>(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Lax/c3/V;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2, v1, v3}, Lax/d3/n;->f3(Lcom/voxdon/xplorer/file/o;Ljava/util/List;Lax/d3/n$p;)V

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

.method public p9(ILcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    invoke-static {p2}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    check-cast p2, Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_16

    .line 18
    :cond_11
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 p2, 0x0

    .line 23
    :goto_16
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2c

    .line 32
    .line 33
    if-eqz p2, :cond_2c

    .line 34
    .line 35
    invoke-static {v0, p2}, Lcom/voxdon/xplorer/file/y;->U0(Lax/c3/K;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2c

    .line 40
    .line 41
    invoke-direct {p0}, Lax/d3/E;->M9()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    const/4 v1, 0x0

    .line 46
    invoke-virtual {p0, p1, v0, p2, v1}, Lax/d3/E;->o9(ILax/c3/K;Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public q()V
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

.method public q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 4

    .line 1
    const v0, 0x7f0f0015

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lax/d3/n;->G3(Landroid/view/MenuInflater;Landroid/view/Menu;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lax/d3/E;->O7(Landroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lax/d3/E;->ia(Landroid/view/Menu;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Lax/Q2/f;->P()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_1c

    .line 22
    .line 23
    const p2, 0x7f0a02f7

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p2}, Landroid/view/Menu;->removeItem(I)V

    .line 27
    .line 28
    .line 29
    :cond_1c
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
.end method

.method protected q8(Lax/c3/K;Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/util/List;)V
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c3/K;",
            "Lax/W2/t$a;",
            "Ljava/lang/String;",
            "Landroid/os/ParcelFileDescriptor;",
            "Lcom/voxdon/xplorer/file/n;",
            "Lax/c3/k;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lax/a3/f;->F3(Lax/d3/E;Lax/c3/K;)Lax/a3/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lax/d3/E$z;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move-object v6, p6

    .line 13
    move-object v7, p7

    .line 14
    invoke-direct/range {v0 .. v7}, Lax/d3/E$z;-><init>(Lax/d3/E;Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lax/a3/f;->P3(Lax/a3/f$j;)V

    .line 18
    .line 19
    .line 20
    const-string p2, "directory"

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-virtual {p0, p1, p2, p3}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

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
.end method

.method public r1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    .line 1
    const p2, 0x7f0d009a

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

.method protected r8(Lax/c3/K;Lax/a3/f$j;)V
    .registers 4

    .line 1
    invoke-static {p0, p1}, Lax/a3/f;->F3(Lax/d3/E;Lax/c3/K;)Lax/a3/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lax/a3/f;->P3(Lax/a3/f$j;)V

    .line 6
    .line 7
    .line 8
    const-string p2, "directory"

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 12
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
    .registers 1

    .line 1
    invoke-super {p0}, Lax/d3/n;->s1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/E;->V6()V

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

.method protected s7()Lax/x3/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->Y0:Lax/x3/d;

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

.method protected s9()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->g0()Lax/Q2/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/Q2/j;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_41

    .line 14
    .line 15
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 16
    .line 17
    iget-object v1, p0, Lax/d3/E;->i2:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 23
    .line 24
    iget-object v1, p0, Lax/d3/E;->i2:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/d3/E;->E7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 39
    .line 40
    invoke-virtual {p0}, Lax/d3/E;->E7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 48
    .line 49
    invoke-virtual {p0}, Lax/d3/E;->E7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/a;->p0(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 57
    .line 58
    invoke-virtual {p0}, Lax/d3/E;->E7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/a;->p0(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 67
    .line 68
    iget-object v1, p0, Lax/d3/E;->h2:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 74
    .line 75
    iget-object v1, p0, Lax/d3/E;->h2:Landroid/widget/AbsListView$MultiChoiceModeListener;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setMultiChoiceModeListener(Landroid/widget/AbsListView$MultiChoiceModeListener;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lax/d3/E;->K0:Landroid/widget/ListView;

    .line 81
    .line 82
    invoke-virtual {p0}, Lax/d3/E;->A7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lax/d3/E;->L0:Landroid/widget/GridView;

    .line 90
    .line 91
    invoke-virtual {p0}, Lax/d3/E;->A7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lax/d3/E;->d1:Lcom/voxdon/xplorer/widget/a;

    .line 99
    .line 100
    invoke-virtual {p0}, Lax/d3/E;->A7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/a;->p0(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lax/d3/E;->e1:Lcom/voxdon/xplorer/widget/a;

    .line 108
    .line 109
    invoke-virtual {p0}, Lax/d3/E;->A7()Landroid/widget/AdapterView$OnItemClickListener;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/widget/a;->p0(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 114
    .line 115
    .line 116
    return-void
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

.method public t(II)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/n;->t(II)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lax/d3/E;->y9(I)V

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

.method protected t7()Landroid/widget/AbsListView;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->N0:Landroid/widget/AbsListView;

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

.method public u1()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->u1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/E;->g1:Lax/r3/d;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/r3/d;->f()V

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

.method protected u8(Ljava/lang/String;II)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lax/d3/E;->o1:Z

    .line 8
    .line 9
    invoke-virtual {p0, p2, p3}, Lax/d3/E;->b8(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lax/d3/n;->e4(Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lax/d3/E;->V6()V

    .line 16
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
.end method

.method public v1()V
    .registers 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->v1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/E;->f1:Lax/V2/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/V2/c;->a()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lax/d3/E;->L6()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 13
    .line 14
    if-eqz v0, :cond_54

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->U()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sget-object v1, Lax/d3/E;->r2:Ljava/util/logging/Logger;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, " retain count : "

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->i0()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_49

    .line 60
    .line 61
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/service/b;->o(Lcom/voxdon/xplorer/file/o;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lax/d3/E$k0;->e0:Lax/d3/E$k0;

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lax/d3/E;->v9(Lax/d3/E$k0;)V

    .line 83
    .line 84
    .line 85
    :cond_54
    iget-boolean v0, p0, Lax/d3/E;->H1:Z

    .line 86
    .line 87
    if-eqz v0, :cond_63

    .line 88
    .line 89
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lax/T2/h;->G0()V

    .line 98
    .line 99
    .line 100
    :cond_63
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lax/d3/E;->p2:Landroid/content/BroadcastReceiver;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v1, p0, Lax/d3/E;->n2:Landroid/content/BroadcastReceiver;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v1, p0, Lax/d3/E;->o2:Landroid/content/BroadcastReceiver;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 125
    .line 126
    .line 127
    return-void
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

.method protected v7()Lcom/voxdon/xplorer/file/n;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

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

.method protected v9(Lax/d3/E$k0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E;->K1:Lax/d3/E$k0;

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

.method public w7()Lcom/voxdon/xplorer/file/o;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->U()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_92

    .line 8
    .line 9
    iget-boolean v1, p0, Lax/d3/E;->I1:Z

    .line 10
    .line 11
    if-eqz v1, :cond_92

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lax/d3/E;->I1:Z

    .line 15
    .line 16
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "FGFO"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d1()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, ":"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v3, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 72
    .line 73
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/o;->R()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 89
    .line 90
    .line 91
    sget-object v1, Lax/d3/E;->r2:Ljava/util/logging/Logger;

    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v3, "Invalid operator retain count: "

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, " location:"

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string v0, "------stack trace------"

    .line 130
    .line 131
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    new-instance v0, Ljava/lang/RuntimeException;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    const-string v0, "-----------------------"

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_92
    iget-object v0, p0, Lax/d3/E;->h1:Lcom/voxdon/xplorer/file/o;

    .line 148
    .line 149
    return-object v0
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

.method w9()V
    .registers 2

    .line 1
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/W2/w;->b()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/d3/E;->e2:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/W2/w;->a()V

    .line 16
    .line 17
    .line 18
    return-void
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
    if-nez p1, :cond_9

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/d3/E;->X6()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-direct {p0}, Lax/d3/E;->V6()V

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

.method public x3()I
    .registers 3

    .line 1
    iget v0, p0, Lax/d3/E;->F1:I

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
    iput v0, p0, Lax/d3/E;->F1:I

    .line 16
    .line 17
    :cond_10
    iget v0, p0, Lax/d3/E;->F1:I

    .line 18
    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public x7()Lax/V2/c;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/V2/c;->d(Lax/c3/K;)Lax/V2/c;

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

.method protected x9(Landroid/view/View$OnClickListener;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E;->Q0:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

.method public abstract z3()Lax/Q2/f;
.end method

.method protected z7()I
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->D7()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lax/Q2/f;->P()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_f

    .line 14
    .line 15
    goto :goto_3b

    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lax/Q2/f;->m0(Lax/Q2/f;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3b

    .line 25
    .line 26
    iget-object v1, p0, Lax/d3/E;->i1:Lcom/voxdon/xplorer/file/n;

    .line 27
    .line 28
    if-nez v1, :cond_20

    .line 29
    .line 30
    iget-object v1, p0, Lax/d3/E;->n1:Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_24

    .line 33
    :cond_20
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_24
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2, v1}, Lax/c3/d0;->D(Lax/c3/K;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x2

    .line 46
    if-eqz v1, :cond_37

    .line 47
    .line 48
    if-ne v0, v2, :cond_34

    .line 49
    .line 50
    const/16 v0, 0xc

    .line 51
    .line 52
    return v0

    .line 53
    :cond_34
    const/16 v0, 0xa

    .line 54
    .line 55
    return v0

    .line 56
    :cond_37
    if-ne v0, v2, :cond_3b

    .line 57
    .line 58
    const/16 v0, 0x10

    .line 59
    .line 60
    :cond_3b
    :goto_3b
    return v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
