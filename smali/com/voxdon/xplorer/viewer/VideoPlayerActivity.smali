.class public Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;
.super Lax/n/c;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/ui/d$m;
.implements Lcom/voxdon/xplorer/viewer/g$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$v;,
        Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;,
        Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;,
        Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;,
        Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;
    }
.end annotation


# static fields
.field private static final S1:Ljava/util/logging/Logger;

.field private static T1:Z

.field private static U1:Z


# instance fields
.field private A:Landroid/widget/TextView;

.field private A0:Z

.field private A1:Z

.field private B:Landroid/view/View;

.field private B0:Landroid/media/AudioManager;

.field private B1:Landroid/os/Handler;

.field private C:Landroid/widget/ImageView;

.field private C0:Z

.field private C1:I

.field private D:Landroid/widget/ProgressBar;

.field private D0:I

.field private D1:I

.field private E:Landroid/widget/TextView;

.field private E0:I

.field private E1:Lcom/voxdon/xplorer/viewer/g;

.field private F:Landroidx/media3/ui/AspectRatioFrameLayout;

.field private F0:Z

.field F1:I

.field private G:Lcom/google/android/material/snackbar/Snackbar;

.field private G0:F

.field G1:I

.field private H:Landroid/view/View;

.field private H0:Z

.field H1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;

.field private I:Landroidx/appcompat/widget/Toolbar;

.field private I0:I

.field I1:Z

.field private J:Landroid/view/ViewGroup;

.field private J0:Z

.field J1:Lax/i/r;

.field private K:Landroid/view/ViewGroup;

.field private K0:Z

.field K1:Ljava/lang/Runnable;

.field private L:Landroid/view/View;

.field private L0:J

.field L1:Landroidx/media3/ui/G$a;

.field private M:Landroid/view/View;

.field private M0:J

.field M1:Ljava/lang/Runnable;

.field private N:Landroid/view/View;

.field private N0:Lax/l1/n;

.field private N1:Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;

.field private O:Z

.field private O0:Lax/l1/n$e;

.field private O1:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private P:Z

.field private P0:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/P0/V$a;",
            ">;"
        }
    .end annotation
.end field

.field private P1:Landroid/view/View$OnClickListener;

.field private Q:Ljava/lang/String;

.field private Q0:Landroid/graphics/drawable/Drawable;

.field Q1:Lcom/voxdon/xplorer/viewer/g$h;

.field private R:Ljava/lang/String;

.field private R0:Landroid/graphics/drawable/Drawable;

.field private R1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

.field private S:Landroidx/media3/ui/b;

.field private S0:Landroid/graphics/drawable/Drawable;

.field private T:Landroid/widget/TextView;

.field private T0:Landroid/graphics/drawable/Drawable;

.field private U:Lax/U0/g$a;

.field private U0:Landroid/graphics/drawable/Drawable;

.field private V:Lax/i1/O;

.field private V0:Landroid/graphics/drawable/Drawable;

.field private W:Landroidx/media3/exoplayer/ExoPlayer;

.field private W0:Landroid/graphics/drawable/Drawable;

.field private X:Lax/b1/O;

.field private X0:Landroid/graphics/drawable/Drawable;

.field private Y:Lax/P0/y;

.field private Y0:Landroid/graphics/drawable/Drawable;

.field private Z:[Landroid/net/Uri;

.field private Z0:Landroid/graphics/drawable/Drawable;

.field private a:Landroid/view/View;

.field private a0:[Landroid/net/Uri;

.field private a1:Ljava/lang/String;

.field private b:Landroidx/media3/ui/PlayerView;

.field private b0:[Landroid/net/Uri;

.field private b1:Ljava/lang/String;

.field private c:Z

.field private c0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c1:Ljava/lang/String;

.field private d:Ljava/lang/Runnable;

.field private d0:Z

.field private d1:Ljava/lang/String;

.field private e:Landroidx/media3/ui/d;

.field private e0:Z

.field private e1:Ljava/lang/String;

.field private f:Landroid/view/ViewGroup;

.field private f0:[Z

.field private f1:Ljava/lang/String;

.field private g:Landroid/view/View;

.field private g0:I

.field private g1:Ljava/lang/String;

.field private h:Landroid/view/View;

.field private h0:I

.field private h1:Ljava/lang/String;

.field private i:Landroid/view/View;

.field private i0:I

.field private i1:Ljava/lang/String;

.field private j:Landroid/view/View;

.field private j0:Z

.field private j1:Ljava/lang/String;

.field private k:Landroid/widget/ImageButton;

.field private k0:Z

.field private k1:F

.field private l:Landroid/view/View;

.field private l0:I

.field private l1:F

.field private m:Landroid/view/View;

.field private m0:I

.field private m1:Z

.field private n:Landroid/view/View;

.field private n0:Z

.field private n1:I

.field private o:Landroid/view/View;

.field private o0:I

.field private o1:J

.field private p:Landroid/view/View;

.field private p0:F

.field private p1:Ljava/lang/String;

.field private q:Landroid/view/View;

.field private q0:Z

.field private q1:I

.field private r:Landroid/widget/ImageButton;

.field private r0:Z

.field private r1:Z

.field private s:Landroid/view/View;

.field private s0:Z

.field private s1:Z

.field private t:Landroid/widget/ImageView;

.field private t0:J

.field private t1:Lax/c3/K;

.field private u:Landroid/widget/ImageButton;

.field private u0:J

.field private u1:Z

.field private v:Landroid/widget/ImageButton;

.field private v0:Z

.field private v1:Landroid/net/Uri;

.field private w:Landroid/widget/ImageButton;

.field private w0:I

.field private w1:J

.field private x:Landroid/widget/ImageButton;

.field private x0:I

.field private x1:Z

.field private y:Landroidx/appcompat/widget/MySpinner;

.field private y0:F

.field private y1:I

.field private z:Landroid/view/View;

.field private z0:Z

.field private z1:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.VideoPlayer"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T1:Z

    .line 11
    .line 12
    sput-boolean v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U1:Z

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

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/n/c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0:Z

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 10
    .line 11
    const-wide/16 v0, 0x96

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w1:J

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B1:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$p;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$p;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J1:Lax/i/r;

    .line 29
    .line 30
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$b;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$b;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K1:Ljava/lang/Runnable;

    .line 36
    .line 37
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$c;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$c;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L1:Landroidx/media3/ui/G$a;

    .line 43
    .line 44
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$d;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$d;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M1:Ljava/lang/Runnable;

    .line 50
    .line 51
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$e;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N1:Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;

    .line 57
    .line 58
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$f;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$f;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O1:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 64
    .line 65
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$g;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$g;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 71
    .line 72
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$h;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$h;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q1:Lcom/voxdon/xplorer/viewer/g$h;

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

.method static synthetic A0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u1:Z

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

.method static synthetic A1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c4()V

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

.method private A2(Lax/r7/z;Ljava/lang/String;)Ljava/lang/String;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/r7/z<",
            "Lax/P0/V$a;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_6
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ge v2, v3, :cond_30

    .line 12
    .line 13
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lax/P0/V$a;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_13
    iget v5, v3, Lax/P0/V$a;->a:I

    .line 21
    .line 22
    if-ge v4, v5, :cond_2d

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Lax/P0/V$a;->b(I)Lax/P0/v;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_2a

    .line 29
    .line 30
    iget-object v6, v5, Lax/P0/v;->o:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v6, :cond_2a

    .line 33
    .line 34
    invoke-virtual {v6, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_2a

    .line 39
    .line 40
    iget-object p1, v5, Lax/P0/v;->o:Ljava/lang/String;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_2a
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_13

    .line 46
    :cond_2d
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_6

    .line 49
    :cond_30
    return-object v0
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

.method private A3()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e2()V

    .line 6
    .line 7
    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J0:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O2()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_36

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q2()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_28

    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K:Landroid/view/ViewGroup;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$i;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$i;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v0}, Lax/S2/b;->j(Landroid/app/Activity;Lax/S2/b$a;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K:Landroid/view/ViewGroup;

    .line 42
    .line 43
    const/4 v1, -0x1

    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$j;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$j;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v0}, Lax/S2/b;->k(Landroid/app/Activity;Lax/S2/b$c;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
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

.method private A4()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 2
    .line 3
    if-nez v0, :cond_11

    .line 4
    .line 5
    const-string v0, "audio"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/media/AudioManager;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 14
    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D0:I

    .line 26
    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E0:I

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C0:Z

    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B:Landroid/view/View;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C:Landroid/widget/ImageView;

    .line 45
    .line 46
    const v1, 0x7f0801e0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 53
    .line 54
    const v1, 0x7f08033b

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v1}, Lax/o/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 65
    .line 66
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D0:I

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 69
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

.method static synthetic B0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h2()V

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

.method static synthetic B1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a4()V

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

.method private B2()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

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
    array-length v0, v0

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

.method private B3()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B1:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

    .line 13
    .line 14
    :cond_d
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->d()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private B4()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A0:Z

    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f2()V

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

.method static synthetic C0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/net/Uri;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v1:Landroid/net/Uri;

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

.method static synthetic C1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c3()Z

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

.method private C3(I)V
    .registers 5

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    mul-int/lit16 p1, p1, 0xff

    .line 4
    .line 5
    div-int/lit16 p1, p1, 0x168

    .line 6
    .line 7
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G0:F

    .line 8
    .line 9
    const/high16 v2, 0x437f0000    # 255.0f

    .line 10
    .line 11
    mul-float v1, v1, v2

    .line 12
    .line 13
    float-to-int v1, v1

    .line 14
    add-int/2addr v1, p1

    .line 15
    if-le v1, v0, :cond_11

    .line 16
    .line 17
    goto :goto_16

    .line 18
    :cond_11
    if-gez v1, :cond_15

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_16

    .line 22
    :cond_15
    move v0, v1

    .line 23
    :goto_16
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    int-to-float v1, v0

    .line 32
    div-float/2addr v1, v2

    .line 33
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

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

.method private C4(FFFFF)V
    .registers 10

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f2()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 12
    .line 13
    mul-float v0, v0, p1

    .line 14
    .line 15
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 16
    .line 17
    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    cmpg-float v2, v0, v1

    .line 20
    .line 21
    if-gez v2, :cond_19

    .line 22
    .line 23
    iput v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 24
    .line 25
    goto :goto_21

    .line 26
    :cond_19
    const/high16 v2, 0x40400000    # 3.0f

    .line 27
    .line 28
    cmpl-float v0, v0, v2

    .line 29
    .line 30
    if-lez v0, :cond_21

    .line 31
    .line 32
    iput v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 33
    .line 34
    :cond_21
    :goto_21
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2f

    .line 41
    .line 42
    iput v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f2()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 49
    .line 50
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 56
    .line 57
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-float v0, v0

    .line 69
    const/high16 v1, 0x40000000    # 2.0f

    .line 70
    .line 71
    div-float/2addr v0, v1

    .line 72
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-float v2, v2

    .line 79
    div-float/2addr v2, v1

    .line 80
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-direct {p0, v1, v0, p2, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a2(FFFF)F

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-direct {p0, v3, v2, p3, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a2(FFFF)F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget p3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

    .line 101
    .line 102
    add-float/2addr p2, p4

    .line 103
    add-float/2addr p1, p5

    .line 104
    invoke-direct {p0, p3, p2, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p3(FFF)Z

    .line 105
    .line 106
    .line 107
    return-void
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

.method static synthetic D0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Landroid/net/Uri;)Landroid/net/Uri;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v1:Landroid/net/Uri;

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

.method static synthetic D1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;FFF)Z
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p3(FFF)Z

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
.end method

.method private D2()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J0:Z

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

.method private D3(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 2
    .line 3
    if-nez v0, :cond_11

    .line 4
    .line 5
    const-string v0, "audio"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/media/AudioManager;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 14
    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_35

    .line 18
    :cond_11
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D0:I

    .line 19
    .line 20
    mul-int p1, p1, v0

    .line 21
    .line 22
    div-int/lit16 p1, p1, 0x168

    .line 23
    .line 24
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E0:I

    .line 25
    .line 26
    add-int/2addr v1, p1

    .line 27
    const/4 p1, 0x0

    .line 28
    if-le v1, v0, :cond_1e

    .line 29
    .line 30
    goto :goto_23

    .line 31
    :cond_1e
    if-gez v1, :cond_22

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    goto :goto_23

    .line 35
    :cond_22
    move v0, v1

    .line 36
    :goto_23
    :try_start_23
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B0:Landroid/media/AudioManager;

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-virtual {v1, v2, v0, p1}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_2e
    .catch Ljava/lang/SecurityException; {:try_start_23 .. :try_end_2e} :catch_2f

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_2f
    move-exception p1

    .line 49
    const-string v0, "video set volume exception"

    .line 50
    .line 51
    invoke-static {v0, p1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_35
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private D4()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A0:Z

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

.method static synthetic E0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w4()V

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

.method static synthetic E1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x0:I

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

.method private static E2([Landroid/net/Uri;)Z
    .registers 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_3
    if-ge v2, v0, :cond_29

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-static {v4}, Lax/c3/B;->L(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_26

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x1

    .line 23
    if-nez v4, :cond_19

    .line 24
    .line 25
    return v5

    .line 26
    :cond_19
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "."

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_26

    .line 37
    .line 38
    return v5

    .line 39
    :cond_26
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_29
    return v1
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

.method private E3(ZLandroid/view/View;)V
    .registers 3

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    iget p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k1:F

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    iget p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l1:F

    .line 13
    .line 14
    :goto_d
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

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

.method static synthetic F(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c:Z

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

.method static synthetic F0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y2()Z

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

.method static synthetic F1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

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

.method private F2()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

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
    invoke-virtual {v0}, Lax/n/a;->n()V

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

.method private F3(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n0:Z

    .line 2
    .line 3
    invoke-static {p0, p1}, Lax/t3/l;->j(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n4()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lax/n/c;->invalidateOptionsMenu()V

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

.method static synthetic G0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w1:J

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

.method static synthetic G1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C1:I

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

.method private G2()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/n/a;->H(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lax/n/a;->x(Z)V

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

.method private G3()V
    .registers 3

    .line 1
    invoke-static {p0}, Lax/t3/l;->b(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 6
    .line 7
    mul-int/lit16 v0, v0, 0x3e8

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerView;->setControllerShowTimeoutMs(I)V

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

.method static synthetic H(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c:Z

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

.method static synthetic H0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/ui/b;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S:Landroidx/media3/ui/b;

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

.method static synthetic H1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D1:I

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

.method private H2()V
    .registers 2

    .line 1
    invoke-static {p0}, Lax/t3/l;->p(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    invoke-static {p0}, Lax/P2/a;->r(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    invoke-static {p0}, Lax/P2/a;->m(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_12

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    :goto_12
    if-nez v0, :cond_17

    .line 20
    .line 21
    invoke-static {p0}, Lax/P2/a;->n(Landroid/content/Context;)Z

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private H3(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i0:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o4()V

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

.method static synthetic I(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Ljava/lang/Runnable;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d:Ljava/lang/Runnable;

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

.method static synthetic I0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l2()V

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

.method static synthetic I1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V1()V

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

.method private I2()V
    .registers 3

    .line 1
    invoke-static {p0}, Lax/t3/l;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n0:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n4()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lax/t3/l;->d(Landroid/content/Context;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M3(I)V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    cmpl-float v1, v0, v1

    .line 21
    .line 22
    if-eqz v1, :cond_26

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L3(FZ)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y:Landroidx/appcompat/widget/MySpinner;

    .line 29
    .line 30
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 31
    .line 32
    invoke-static {v1}, Lcom/voxdon/xplorer/viewer/d;->c(F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 37
    .line 38
    .line 39
    :cond_26
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u4()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private I3()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_1a

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y2()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1a

    .line 10
    .line 11
    new-instance v0, Landroid/content/Intent;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x2()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

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

.method static synthetic J(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g4()V

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

.method static synthetic J0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n4()V

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

.method static synthetic J1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/ui/PlayerView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

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

.method private J2()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0801e6

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q0:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    const v1, 0x7f0801e8

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R0:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    const v1, 0x7f0801e7

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S0:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    const v1, 0x7f080202

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W0:Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    const v1, 0x7f080203

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X0:Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    const v1, 0x7f08012b

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T0:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    const v1, 0x7f08012c

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U0:Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    const v1, 0x7f08012a

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V0:Landroid/graphics/drawable/Drawable;

    .line 76
    .line 77
    const v1, 0x7f080130

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z0:Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    const v1, 0x7f08012f

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y0:Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    const v1, 0x7f1303ad

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a1:Ljava/lang/String;

    .line 103
    .line 104
    const v1, 0x7f1303af

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b1:Ljava/lang/String;

    .line 112
    .line 113
    const v1, 0x7f1303ae

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c1:Ljava/lang/String;

    .line 121
    .line 122
    const v1, 0x7f130173

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d1:Ljava/lang/String;

    .line 130
    .line 131
    const v1, 0x7f130174

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e1:Ljava/lang/String;

    .line 139
    .line 140
    const v1, 0x7f130172

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f1:Ljava/lang/String;

    .line 148
    .line 149
    const v1, 0x7f130165

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g1:Ljava/lang/String;

    .line 157
    .line 158
    const v1, 0x7f130164

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h1:Ljava/lang/String;

    .line 166
    .line 167
    const v1, 0x7f13017a

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i1:Ljava/lang/String;

    .line 175
    .line 176
    const v1, 0x7f130179

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j1:Ljava/lang/String;

    .line 184
    .line 185
    const v1, 0x7f0b0009

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    int-to-float v1, v1

    .line 193
    const/high16 v2, 0x42c80000    # 100.0f

    .line 194
    .line 195
    div-float/2addr v1, v2

    .line 196
    iput v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k1:F

    .line 197
    .line 198
    const v1, 0x7f0b0008

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    int-to-float v0, v0

    .line 206
    div-float/2addr v0, v2

    .line 207
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l1:F

    .line 208
    .line 209
    return-void
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

.method static synthetic K0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l4()V

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

.method static synthetic K1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A4()V

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

.method private K2()V
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 4
    .line 5
    if-eqz v2, :cond_8

    .line 6
    .line 7
    goto/16 :goto_1a6

    .line 8
    .line 9
    :cond_8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, -0x1

    .line 18
    iput v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g0:I

    .line 19
    .line 20
    iput v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h0:I

    .line 21
    .line 22
    const-string v5, "android.intent.action.VIEW"

    .line 23
    .line 24
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const v5, 0x7f130137

    .line 29
    .line 30
    .line 31
    if-eqz v3, :cond_1b1

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_1b1

    .line 38
    .line 39
    invoke-static {}, Lcom/voxdon/xplorer/viewer/e;->b()Lcom/voxdon/xplorer/viewer/e;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Lcom/voxdon/xplorer/viewer/e;->c()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_c7

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    new-array v6, v6, [Landroid/net/Uri;

    .line 54
    .line 55
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    new-array v6, v6, [Landroid/net/Uri;

    .line 62
    .line 63
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    new-array v6, v6, [Landroid/net/Uri;

    .line 70
    .line 71
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b0:[Landroid/net/Uri;

    .line 72
    .line 73
    new-instance v6, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    :goto_50
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-ge v6, v7, :cond_61

    .line 86
    .line 87
    iget-object v7, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    add-int/2addr v6, v1

    .line 97
    goto :goto_50

    .line 98
    :cond_61
    iget-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v6}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    :goto_67
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-ge v6, v7, :cond_8f

    .line 109
    .line 110
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Lcom/voxdon/xplorer/viewer/e$a;

    .line 115
    .line 116
    iget-object v8, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 117
    .line 118
    iget-object v9, v7, Lcom/voxdon/xplorer/viewer/e$a;->a:Landroid/net/Uri;

    .line 119
    .line 120
    aput-object v9, v8, v6

    .line 121
    .line 122
    iget-object v8, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 123
    .line 124
    invoke-direct {p0, v9}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i2(Landroid/net/Uri;)Landroid/net/Uri;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    aput-object v9, v8, v6

    .line 129
    .line 130
    iget-object v7, v7, Lcom/voxdon/xplorer/viewer/e$a;->b:Landroid/net/Uri;

    .line 131
    .line 132
    if-eqz v7, :cond_8d

    .line 133
    .line 134
    iget-object v8, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b0:[Landroid/net/Uri;

    .line 135
    .line 136
    invoke-direct {p0, v7}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i2(Landroid/net/Uri;)Landroid/net/Uri;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    aput-object v7, v8, v6

    .line 141
    .line 142
    :cond_8d
    add-int/2addr v6, v1

    .line 143
    goto :goto_67

    .line 144
    :cond_8f
    const/4 v3, 0x0

    .line 145
    :goto_90
    iget-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 146
    .line 147
    array-length v6, v6

    .line 148
    if-ge v3, v6, :cond_10b

    .line 149
    .line 150
    iget-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    iget-object v7, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 163
    .line 164
    aget-object v7, v7, v3

    .line 165
    .line 166
    if-eqz v7, :cond_b3

    .line 167
    .line 168
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v7, v8}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-eqz v7, :cond_b3

    .line 177
    .line 178
    iput v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g0:I

    .line 179
    .line 180
    :cond_b3
    iget-object v7, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 181
    .line 182
    aget-object v6, v7, v6

    .line 183
    .line 184
    if-eqz v6, :cond_c5

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v6, v7}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_c5

    .line 195
    .line 196
    iput v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h0:I

    .line 197
    .line 198
    :cond_c5
    add-int/2addr v3, v1

    .line 199
    goto :goto_90

    .line 200
    :cond_c7
    sget-object v3, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

    .line 201
    .line 202
    new-instance v6, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    const-string v7, "Video play : "

    .line 208
    .line 209
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v3, v6}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    new-array v6, v1, [Landroid/net/Uri;

    .line 231
    .line 232
    aput-object v3, v6, v0

    .line 233
    .line 234
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 235
    .line 236
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-direct {p0, v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i2(Landroid/net/Uri;)Landroid/net/Uri;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    new-array v6, v1, [Landroid/net/Uri;

    .line 245
    .line 246
    aput-object v3, v6, v0

    .line 247
    .line 248
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 249
    .line 250
    new-instance v3, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    iput-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 256
    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    new-array v3, v1, [Landroid/net/Uri;

    .line 265
    .line 266
    iput-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b0:[Landroid/net/Uri;

    .line 267
    .line 268
    :cond_10b
    const-string v3, "detect_subtitle"

    .line 269
    .line 270
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    iput-boolean v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e0:Z

    .line 275
    .line 276
    if-eqz v2, :cond_11c

    .line 277
    .line 278
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 279
    .line 280
    array-length v2, v2

    .line 281
    new-array v2, v2, [Z

    .line 282
    .line 283
    iput-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f0:[Z

    .line 284
    .line 285
    :cond_11c
    iget-boolean v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 286
    .line 287
    if-eqz v2, :cond_12c

    .line 288
    .line 289
    iget v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h0:I

    .line 290
    .line 291
    if-ne v2, v4, :cond_128

    .line 292
    .line 293
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 294
    .line 295
    .line 296
    goto :goto_137

    .line 297
    :cond_128
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 298
    .line 299
    .line 300
    goto :goto_137

    .line 301
    :cond_12c
    iget v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g0:I

    .line 302
    .line 303
    if-ne v2, v4, :cond_134

    .line 304
    .line 305
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 306
    .line 307
    .line 308
    goto :goto_137

    .line 309
    :cond_134
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 310
    .line 311
    .line 312
    :goto_137
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 313
    .line 314
    array-length v3, v2

    .line 315
    const/4 v4, 0x0

    .line 316
    :goto_13b
    if-ge v4, v3, :cond_168

    .line 317
    .line 318
    aget-object v6, v2, v4

    .line 319
    .line 320
    invoke-static {p0, v6}, Lcom/voxdon/xplorer/service/b;->k(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 321
    .line 322
    .line 323
    move-result v7

    .line 324
    if-eqz v7, :cond_15a

    .line 325
    .line 326
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x1:Z

    .line 327
    .line 328
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s1:Z

    .line 329
    .line 330
    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    invoke-static {v6}, Lax/o3/c;->z(Ljava/lang/String;)Lax/Z2/k;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    if-eqz v6, :cond_166

    .line 339
    .line 340
    invoke-virtual {v6}, Lax/Z2/k;->d()Lax/c3/K;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    iput-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1:Lax/c3/K;

    .line 345
    .line 346
    goto :goto_166

    .line 347
    :cond_15a
    invoke-virtual {v6}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-static {v6}, Lax/c3/B;->L(Ljava/lang/String;)Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_166

    .line 356
    .line 357
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x1:Z

    .line 358
    .line 359
    :cond_166
    :goto_166
    add-int/2addr v4, v1

    .line 360
    goto :goto_13b

    .line 361
    :cond_168
    iget-boolean v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s1:Z

    .line 362
    .line 363
    if-eqz v2, :cond_179

    .line 364
    .line 365
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1:Lax/c3/K;

    .line 366
    .line 367
    if-eqz v2, :cond_179

    .line 368
    .line 369
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1:Lax/c3/K;

    .line 374
    .line 375
    invoke-virtual {v2, v1, v3}, Lcom/voxdon/xplorer/service/b;->l(ZLax/c3/K;)V

    .line 376
    .line 377
    .line 378
    :cond_179
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 379
    .line 380
    array-length v2, v2

    .line 381
    new-array v2, v2, [Lax/P0/y;

    .line 382
    .line 383
    :goto_17e
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 384
    .line 385
    array-length v4, v3

    .line 386
    if-ge v0, v4, :cond_18d

    .line 387
    .line 388
    aget-object v3, v3, v0

    .line 389
    .line 390
    invoke-static {v3}, Lax/P0/y;->b(Landroid/net/Uri;)Lax/P0/y;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    aput-object v3, v2, v0

    .line 395
    .line 396
    add-int/2addr v0, v1

    .line 397
    goto :goto_17e

    .line 398
    :cond_18d
    invoke-static {v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E2([Landroid/net/Uri;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-nez v0, :cond_1ad

    .line 403
    .line 404
    invoke-static {v2}, Lax/S0/d0;->m([Lax/P0/y;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_19a

    .line 409
    .line 410
    goto :goto_1ad

    .line 411
    :cond_19a
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_1a7

    .line 416
    .line 417
    invoke-static {}, Lax/u3/o;->c()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_1a7

    .line 422
    .line 423
    :goto_1a6
    return-void

    .line 424
    :cond_1a7
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 425
    .line 426
    invoke-static {p0, v0}, Lax/S0/d0;->X0(Landroid/app/Activity;[Landroid/net/Uri;)Z

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :cond_1ad
    :goto_1ad
    invoke-direct {p0, v5}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W3(I)V

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :cond_1b1
    invoke-direct {p0, v5}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W3(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->finish()V

    .line 438
    .line 439
    .line 440
    return-void
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

.method private K3(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

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

.method static synthetic L(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d2()V

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

.method static synthetic L0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o4()V

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

.method static synthetic L1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w0:I

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

.method private L2()V
    .registers 7

    .line 1
    invoke-static {p0}, Lax/t3/l;->f(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N3(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K2()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_df

    .line 15
    .line 16
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 17
    .line 18
    if-nez v0, :cond_df

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H2()V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lax/X2/J;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x2

    .line 28
    if-eqz v0, :cond_20

    .line 29
    .line 30
    invoke-static {v2}, Landroidx/media3/decoder/ffmpeg/b;->I0(I)V

    .line 31
    .line 32
    .line 33
    :cond_20
    new-instance v0, Lax/l1/a$b;

    .line 34
    .line 35
    invoke-direct {v0}, Lax/l1/a$b;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lax/Y0/d;

    .line 39
    .line 40
    invoke-direct {v3, p0}, Lax/Y0/d;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1}, Lax/Y0/d;->p(I)Lax/Y0/d;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lax/t3/l;->i(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_48

    .line 51
    .line 52
    invoke-static {p0}, Lax/t3/l;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_45

    .line 61
    .line 62
    const-string v5, "default"

    .line 63
    .line 64
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_4a

    .line 69
    .line 70
    :cond_45
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q:Ljava/lang/String;

    .line 71
    .line 72
    goto :goto_4a

    .line 73
    :cond_48
    const-string v4, ""

    .line 74
    .line 75
    :cond_4a
    :goto_4a
    iput-object v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v5, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;

    .line 78
    .line 79
    invoke-direct {v5, p0, v0, v4}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;-><init>(Landroid/content/Context;Lax/l1/D$b;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0:Lax/l1/n;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

    .line 85
    .line 86
    invoke-virtual {v5, v0}, Lax/l1/n;->m(Lax/P0/T;)V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P0:Lax/r7/z;

    .line 91
    .line 92
    new-instance v4, Landroidx/media3/exoplayer/j;

    .line 93
    .line 94
    invoke-direct {v4}, Landroidx/media3/exoplayer/j;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v5, Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 98
    .line 99
    invoke-direct {v5, p0, v3}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;Lax/Y0/X;)V

    .line 100
    .line 101
    .line 102
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0:Lax/l1/n;

    .line 103
    .line 104
    invoke-virtual {v5, v3}, Landroidx/media3/exoplayer/ExoPlayer$b;->m(Lax/l1/J;)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v4}, Landroidx/media3/exoplayer/ExoPlayer$b;->i(Landroidx/media3/exoplayer/o0;)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 108
    .line 109
    .line 110
    const-wide/16 v3, 0x2710

    .line 111
    .line 112
    invoke-virtual {v5, v3, v4}, Landroidx/media3/exoplayer/ExoPlayer$b;->k(J)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v3, v4}, Landroidx/media3/exoplayer/ExoPlayer$b;->l(J)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Landroidx/media3/exoplayer/ExoPlayer$b;->h()Landroidx/media3/exoplayer/ExoPlayer;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iput-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 123
    .line 124
    sget-object v4, Lax/Y0/Z;->g:Lax/Y0/Z;

    .line 125
    .line 126
    invoke-interface {v3, v4}, Landroidx/media3/exoplayer/ExoPlayer;->c(Lax/Y0/Z;)V

    .line 127
    .line 128
    .line 129
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 130
    .line 131
    new-instance v4, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;

    .line 132
    .line 133
    invoke-direct {v4, p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v3, v4}, Lax/P0/H;->N(Lax/P0/H$d;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 140
    .line 141
    iget-boolean v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m1:Z

    .line 142
    .line 143
    invoke-interface {v0, v3}, Lax/P0/H;->S(Z)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 147
    .line 148
    new-instance v3, Lax/n1/a;

    .line 149
    .line 150
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0:Lax/l1/n;

    .line 151
    .line 152
    invoke-direct {v3, v4}, Lax/n1/a;-><init>(Lax/l1/G;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v0, v3}, Landroidx/media3/exoplayer/ExoPlayer;->r0(Lax/Z0/c;)V

    .line 156
    .line 157
    .line 158
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x1:Z

    .line 159
    .line 160
    if-eqz v0, :cond_a7

    .line 161
    .line 162
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 163
    .line 164
    invoke-interface {v0, v2}, Landroidx/media3/exoplayer/ExoPlayer;->a(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_ac

    .line 168
    :cond_a7
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 169
    .line 170
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer;->a(I)V

    .line 171
    .line 172
    .line 173
    :goto_ac
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 174
    .line 175
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 176
    .line 177
    invoke-virtual {v0, v2}, Landroidx/media3/ui/PlayerView;->setPlayer(Lax/P0/H;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 181
    .line 182
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->G()V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q4()V

    .line 186
    .line 187
    .line 188
    new-instance v0, Lcom/voxdon/xplorer/viewer/a;

    .line 189
    .line 190
    new-instance v2, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$r;

    .line 191
    .line 192
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$r;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 193
    .line 194
    .line 195
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 196
    .line 197
    invoke-direct {v0, p0, v3, v2}, Lcom/voxdon/xplorer/viewer/a;-><init>(Landroid/content/Context;FLcom/voxdon/xplorer/viewer/a$b;)V

    .line 198
    .line 199
    .line 200
    new-instance v2, Landroid/view/ScaleGestureDetector;

    .line 201
    .line 202
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N1:Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;

    .line 203
    .line 204
    invoke-direct {v2, p0, v3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 205
    .line 206
    .line 207
    new-instance v3, Landroid/view/GestureDetector;

    .line 208
    .line 209
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O1:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 210
    .line 211
    invoke-direct {v3, p0, v4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 212
    .line 213
    .line 214
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 215
    .line 216
    new-instance v5, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$s;

    .line 217
    .line 218
    invoke-direct {v5, p0, v2, v3, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$s;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Landroid/view/ScaleGestureDetector;Landroid/view/GestureDetector;Lcom/voxdon/xplorer/viewer/a;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 222
    .line 223
    .line 224
    :cond_df
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 225
    .line 226
    if-eqz v0, :cond_103

    .line 227
    .line 228
    iget v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1:I

    .line 229
    .line 230
    const/4 v3, -0x1

    .line 231
    if-eq v2, v3, :cond_ea

    .line 232
    .line 233
    const/4 v3, 0x1

    .line 234
    goto :goto_eb

    .line 235
    :cond_ea
    const/4 v3, 0x0

    .line 236
    :goto_eb
    if-eqz v3, :cond_f2

    .line 237
    .line 238
    iget-wide v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o1:J

    .line 239
    .line 240
    invoke-interface {v0, v2, v4, v5}, Lax/P0/H;->s(IJ)V

    .line 241
    .line 242
    .line 243
    :cond_f2
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I2()V

    .line 244
    .line 245
    .line 246
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l4()V

    .line 247
    .line 248
    .line 249
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o4()V

    .line 250
    .line 251
    .line 252
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    xor-int/2addr v1, v3

    .line 257
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r3(IZ)V

    .line 258
    .line 259
    .line 260
    :cond_103
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

.method private L3(FZ)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_1b

    .line 6
    :cond_5
    if-eqz p2, :cond_9

    .line 7
    .line 8
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 9
    .line 10
    :cond_9
    invoke-interface {v0}, Lax/P0/H;->h()Lax/P0/G;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-eqz p2, :cond_1c

    .line 15
    .line 16
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 17
    .line 18
    invoke-interface {p2}, Lax/P0/H;->h()Lax/P0/G;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, Lax/P0/G;->a:F

    .line 23
    .line 24
    cmpl-float p2, p2, p1

    .line 25
    .line 26
    if-nez p2, :cond_1c

    .line 27
    .line 28
    :goto_1b
    return-void

    .line 29
    :cond_1c
    const/high16 p2, 0x3f800000    # 1.0f

    .line 30
    .line 31
    cmpl-float p2, p1, p2

    .line 32
    .line 33
    if-nez p2, :cond_2a

    .line 34
    .line 35
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 36
    .line 37
    sget-object p2, Lax/P0/G;->d:Lax/P0/G;

    .line 38
    .line 39
    invoke-interface {p1, p2}, Lax/P0/H;->e(Lax/P0/G;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 44
    .line 45
    new-instance v0, Lax/P0/G;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Lax/P0/G;-><init>(F)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, v0}, Lax/P0/H;->e(Lax/P0/G;)V

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

.method static synthetic M(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d:Ljava/lang/Runnable;

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

.method static synthetic M0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m4()V

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

.method static synthetic M1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D3(I)V

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

.method private M2(F)V
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_bf

    .line 4
    .line 5
    invoke-interface {v0}, Lax/P0/H;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_bf

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H0:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 21
    .line 22
    invoke-interface {v0}, Lax/P0/H;->M()Lax/S0/I;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/high16 v2, 0x3f000000    # 0.5f

    .line 27
    .line 28
    cmpl-float v2, p1, v2

    .line 29
    .line 30
    if-nez v2, :cond_27

    .line 31
    .line 32
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 33
    .line 34
    const-string v3, "0.5X\u25b6\u25b6"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    goto :goto_4e

    .line 40
    :cond_27
    const/high16 v2, 0x40000000    # 2.0f

    .line 41
    .line 42
    cmpl-float v2, p1, v2

    .line 43
    .line 44
    if-nez v2, :cond_35

    .line 45
    .line 46
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 47
    .line 48
    const-string v3, "2X\u25b6\u25b6"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4e

    .line 54
    :cond_35
    invoke-static {}, Lax/u3/b;->f()V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 58
    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v4, "X\u25b6\u25b6"

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    :goto_4e
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const/4 v3, -0x1

    .line 84
    if-eq v2, v3, :cond_86

    .line 85
    .line 86
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_86

    .line 93
    .line 94
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-le v2, v3, :cond_86

    .line 105
    .line 106
    const/16 v2, 0xa

    .line 107
    .line 108
    invoke-static {p0, v2}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 113
    .line 114
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sub-int/2addr v3, v0

    .line 123
    div-int/lit8 v3, v3, 0x2

    .line 124
    .line 125
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    sub-int/2addr v3, v0

    .line 132
    sub-int/2addr v3, v2

    .line 133
    if-gez v3, :cond_87

    .line 134
    .line 135
    :cond_86
    const/4 v3, 0x0

    .line 136
    :cond_87
    if-nez v3, :cond_ac

    .line 137
    .line 138
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_9a

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/n/a;->p()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_9a

    .line 149
    .line 150
    invoke-virtual {v0}, Lax/n/a;->l()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    goto :goto_9b

    .line 155
    :cond_9a
    const/4 v0, 0x0

    .line 156
    :goto_9b
    if-lez v0, :cond_a6

    .line 157
    .line 158
    const/16 v2, 0x19

    .line 159
    .line 160
    invoke-static {p0, v2}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    :goto_a3
    add-int v3, v2, v0

    .line 165
    .line 166
    goto :goto_ac

    .line 167
    :cond_a6
    const/4 v2, 0x5

    .line 168
    invoke-static {p0, v2}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    goto :goto_a3

    .line 173
    :cond_ac
    :goto_ac
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 180
    .line 181
    invoke-virtual {v0, v1, v3, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 182
    .line 183
    .line 184
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 185
    .line 186
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    .line 188
    .line 189
    invoke-direct {p0, p1, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L3(FZ)V

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

.method private M3(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o0:I

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lax/P0/H;->j(I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r4()V

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
.end method

.method static synthetic N(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B3()V

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

.method static synthetic N0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i4()V

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

.method static synthetic N1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C3(I)V

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

.method private N2()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K0:Z

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

.method private N3(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s4()V

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

.method static synthetic O(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b4()V

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

.method static synthetic O0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K3(Z)V

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

.method static synthetic O1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l3()V

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

.method private O2()Z
    .registers 2

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I0:I

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

.method private O3(IZ)V
    .registers 11

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getSubtitleView()Landroidx/media3/ui/SubtitleView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    if-eqz p2, :cond_f

    .line 11
    .line 12
    sget-object p2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 13
    .line 14
    :goto_d
    move-object v7, p2

    .line 15
    goto :goto_12

    .line 16
    :cond_f
    sget-object p2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    goto :goto_d

    .line 19
    :goto_12
    const-string p2, "captioning"

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Landroid/view/accessibility/CaptioningManager;

    .line 26
    .line 27
    if-eqz p2, :cond_2b

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2b

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, Lax/a2/a;->a(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)Lax/a2/a;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    goto :goto_37

    .line 44
    :cond_2b
    new-instance v1, Lax/a2/a;

    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    const/high16 v6, -0x1000000

    .line 48
    .line 49
    const/4 v2, -0x1

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct/range {v1 .. v7}, Lax/a2/a;-><init>(IIIIILandroid/graphics/Typeface;)V

    .line 53
    .line 54
    .line 55
    move-object p2, v1

    .line 56
    :goto_37
    invoke-virtual {v0, p2}, Landroidx/media3/ui/SubtitleView;->setStyle(Lax/a2/a;)V

    .line 57
    .line 58
    .line 59
    const/4 p2, 0x2

    .line 60
    int-to-float p1, p1

    .line 61
    invoke-virtual {v0, p2, p1}, Landroidx/media3/ui/SubtitleView;->b(IF)V

    .line 62
    .line 63
    .line 64
    return-void
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

.method static synthetic P0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c2()V

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

.method static synthetic P1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F3(Z)V

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

.method private P2()Z
    .registers 6

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M0:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_18

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M0:J

    .line 14
    .line 15
    sub-long/2addr v0, v2

    .line 16
    const-wide/32 v2, 0x15f90

    .line 17
    .line 18
    .line 19
    cmp-long v4, v0, v2

    .line 20
    .line 21
    if-lez v4, :cond_18

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 v0, 0x0

    .line 26
    :goto_19
    if-eqz v0, :cond_22

    .line 27
    .line 28
    sget-object v1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

    .line 29
    .line 30
    const-string v2, "ad is expired"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_22
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

.method private P3(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lax/n/a;->H(Ljava/lang/CharSequence;)V

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

.method static synthetic Q(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f4()V

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

.method static synthetic Q0(Lax/P0/F;)Z
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R2(Lax/P0/F;)Z

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

.method static synthetic Q1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d4()V

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

.method private Q2()Z
    .registers 5

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I0:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eq v0, v1, :cond_18

    .line 8
    .line 9
    const/16 v1, 0x22

    .line 10
    .line 11
    if-ne v0, v1, :cond_d

    .line 12
    .line 13
    goto :goto_18

    .line 14
    :cond_d
    const/16 v1, 0x11

    .line 15
    .line 16
    if-eq v0, v1, :cond_17

    .line 17
    .line 18
    const/16 v1, 0x12

    .line 19
    .line 20
    if-ne v0, v1, :cond_16

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :cond_16
    return v3

    .line 24
    :cond_17
    :goto_17
    return v2

    .line 25
    :cond_18
    :goto_18
    new-instance v0, Ljava/util/Random;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/Random;->nextBoolean()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_24

    .line 35
    .line 36
    return v2

    .line 37
    :cond_24
    return v3
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

.method private Q3()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

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
    invoke-virtual {v0}, Lax/n/a;->J()V

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

.method static synthetic R()Z
    .registers 1

    .line 1
    sget-boolean v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U1:Z

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

.method static synthetic R0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g2()V

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

.method static synthetic R1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n3()V

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

.method private static R2(Lax/P0/F;)Z
    .registers 4

    .line 1
    instance-of v0, p0, Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1d

    .line 6
    .line 7
    check-cast p0, Landroidx/media3/exoplayer/s;

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/exoplayer/s;->k0:I

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return v2

    .line 14
    :cond_d
    invoke-virtual {p0}, Landroidx/media3/exoplayer/s;->i()Ljava/io/IOException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_11
    if-eqz p0, :cond_2f

    .line 19
    .line 20
    instance-of v0, p0, Lax/i1/b;

    .line 21
    .line 22
    if-eqz v0, :cond_18

    .line 23
    .line 24
    return v1

    .line 25
    :cond_18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_11

    .line 30
    :cond_1d
    if-eqz p0, :cond_2f

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_23
    if-eqz p0, :cond_2f

    .line 37
    .line 38
    instance-of v0, p0, Lax/i1/b;

    .line 39
    .line 40
    if-eqz v0, :cond_2a

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2a
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    goto :goto_23

    .line 48
    :cond_2f
    return v2
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

.method private R3(Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-static {p0, p1}, Lax/w3/h;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1}, Lax/w3/d;->w(Landroid/content/Context;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1f

    .line 10
    .line 11
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 12
    .line 13
    const/4 v1, -0x2

    .line 14
    invoke-static {p1, v0, v1}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 21
    .line 22
    .line 23
    const v1, 0x7f13012b

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Lcom/google/android/material/snackbar/Snackbar;->q0(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G:Lcom/google/android/material/snackbar/Snackbar;

    .line 30
    .line 31
    goto :goto_26

    .line 32
    :cond_1f
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {p1, v0, v1}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_26
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->a0()V

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

.method static synthetic S(Z)Z
    .registers 1

    .line 1
    sput-boolean p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U1:Z

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

.method static synthetic S0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L2()V

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

.method static synthetic S1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u3()V

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

.method private S2()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F0:Z

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

.method private S3()V
    .registers 1

    .line 1
    return-void
.end method

.method static synthetic T()Z
    .registers 1

    .line 1
    sget-boolean v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T1:Z

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

.method static synthetic T0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j3(Z)V

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

.method static synthetic T1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e4()V

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

.method public static final T2(I)Z
    .registers 2

    .line 1
    const/16 v0, 0x17

    if-eq p0, v0, :cond_e

    const/16 v0, 0x42

    if-eq p0, v0, :cond_e

    const/16 v0, 0xa0

    if-eq p0, v0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method private T3(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z:Landroid/view/View;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    goto :goto_10

    .line 10
    :cond_9
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z:Landroid/view/View;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :goto_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k4()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method static synthetic U(Z)Z
    .registers 1

    .line 1
    sput-boolean p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T1:Z

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

.method static synthetic U0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lcom/voxdon/xplorer/viewer/g;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

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

.method private U1()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B:Landroid/view/View;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

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

.method private U2()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0:Z

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

.method private U3(Z)V
    .registers 5

    .line 1
    const v0, 0x7f0a0257

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/widget/ImageView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_16

    .line 15
    .line 16
    const p1, 0x7f08018f

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_1c

    .line 23
    :cond_16
    const p1, 0x7f08018e

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 27
    .line 28
    .line 29
    :goto_1c
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-direct {p1, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v1, 0x2ee

    .line 41
    .line 42
    invoke-virtual {p1, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 46
    .line 47
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$q;

    .line 57
    .line 58
    invoke-direct {v1, p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$q;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Landroid/widget/ImageView;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 62
    .line 63
    .line 64
    return-void
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

.method static synthetic V(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h3()Z

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

.method static synthetic V0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/r7/z;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P0:Lax/r7/z;

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

.method private V1()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpl-float v1, v0, v1

    .line 13
    .line 14
    if-ltz v1, :cond_18

    .line 15
    .line 16
    const/high16 v1, 0x3f800000    # 1.0f

    .line 17
    .line 18
    cmpg-float v1, v0, v1

    .line 19
    .line 20
    if-gtz v1, :cond_18

    .line 21
    .line 22
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G0:F

    .line 23
    .line 24
    goto :goto_1c

    .line 25
    :cond_18
    const/high16 v0, 0x3f000000    # 0.5f

    .line 26
    .line 27
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G0:F

    .line 28
    .line 29
    :goto_1c
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 30
    .line 31
    const/16 v1, 0xff

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F0:Z

    .line 38
    .line 39
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B:Landroid/view/View;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 46
    .line 47
    const v1, 0x7f08033c

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1}, Lax/o/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C:Landroid/widget/ImageView;

    .line 58
    .line 59
    const v1, 0x7f0801df

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    .line 64
    .line 65
    return-void
    .line 66
    .line 67
    .line 68
.end method

.method private V2()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_15

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g3()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_15

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S2()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    goto :goto_15

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_15
    :goto_15
    const/4 v0, 0x1

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

.method private V3(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Lax/u3/B;->S(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->a0()V

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

.method static synthetic W(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m3()V

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

.method static synthetic W0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/r7/z;)Lax/r7/z;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P0:Lax/r7/z;

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

.method private W1()Lax/U0/g$a;
    .registers 4

    .line 1
    new-instance v0, Lax/m1/j$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/m1/j$b;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/U0/m;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C2()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Lax/m1/j$b;->a()Lax/m1/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {v1, p0, v2, v0}, Lax/U0/m;-><init>(Landroid/content/Context;Ljava/lang/String;Lax/U0/z;)V

    .line 17
    .line 18
    .line 19
    return-object v1
    .line 20
    .line 21
.end method

.method private W2()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_a

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

.method private W3(I)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X3(Ljava/lang/String;)V

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

.method static synthetic X(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

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

.method static synthetic X0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0:Z

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

.method private X1(I)Lax/P0/y;
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z2(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_23

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f0:[Z

    .line 10
    .line 11
    aget-boolean v0, v0, p1

    .line 12
    .line 13
    if-nez v0, :cond_23

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b0:[Landroid/net/Uri;

    .line 16
    .line 17
    aget-object v1, v0, p1

    .line 18
    .line 19
    if-nez v1, :cond_23

    .line 20
    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 22
    .line 23
    aget-object v1, v1, p1

    .line 24
    .line 25
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t2(Landroid/net/Uri;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    aput-object v1, v0, p1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f0:[Z

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    aput-boolean v1, v0, p1

    .line 35
    .line 36
    :cond_23
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 37
    .line 38
    aget-object v0, v0, p1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b0:[Landroid/net/Uri;

    .line 41
    .line 42
    aget-object p1, v1, p1

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {p0, v0, p1, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y1(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;)Lax/P0/y;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
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

.method private X2()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A1:Z

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

.method private X3(Ljava/lang/String;)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

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
    .line 22
.end method

.method static synthetic Y(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)F
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0:F

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

.method static synthetic Y0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l0:I

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

.method private Y1(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;)Lax/P0/y;
    .registers 5

    .line 1
    new-instance p3, Lax/P0/y$c;

    .line 2
    .line 3
    invoke-direct {p3}, Lax/P0/y$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, p1}, Lax/P0/y$c;->f(Landroid/net/Uri;)Lax/P0/y$c;

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_f

    .line 10
    .line 11
    invoke-virtual {p3}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_f
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lax/c3/d0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lax/c3/A;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Lax/P0/y$k$a;

    .line 29
    .line 30
    invoke-direct {v0, p2}, Lax/P0/y$k$a;-><init>(Landroid/net/Uri;)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-virtual {v0, p2}, Lax/P0/y$k$a;->l(I)Lax/P0/y$k$a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lax/P0/y$k$a;->k(Ljava/lang/String;)Lax/P0/y$k$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lax/P0/y$k$a;->i()Lax/P0/y$k;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p3, p1}, Lax/P0/y$c;->d(Ljava/util/List;)Lax/P0/y$c;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
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

.method private Y2()Z
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y2()Landroid/net/Uri;

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
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y2()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "file"

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_22

    .line 24
    .line 25
    const-string v2, "content"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_21

    .line 32
    .line 33
    goto :goto_22

    .line 34
    :cond_21
    return v1

    .line 35
    :cond_22
    :goto_22
    const/4 v0, 0x1

    .line 36
    return v0
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

.method private Y3()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->Q0()Z

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
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1e

    .line 16
    .line 17
    invoke-interface {v0}, Lax/P0/H;->n()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1e

    .line 22
    .line 23
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I1:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/P0/H;->f()V

    .line 28
    .line 29
    .line 30
    goto :goto_21

    .line 31
    :cond_1e
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I1:Z

    .line 33
    .line 34
    :goto_21
    invoke-static {}, Lax/a3/W;->i3()Lax/a3/W;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "settings"

    .line 43
    .line 44
    invoke-static {v2, v0, v3, v1}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method static synthetic Z0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l0:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l0:I

    .line 6
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
    .line 22
.end method

.method private Z1(FIFF)F
    .registers 8

    .line 1
    sub-float/2addr p3, p4

    int-to-float p2, p2

    const/high16 p4, 0x40000000    # 2.0f

    div-float v0, p2, p4

    div-float/2addr p1, p4

    add-float p4, p3, v0

    sub-float v1, p4, p1

    add-float/2addr p4, p1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_13

    sub-float/2addr p1, v0

    return p1

    :cond_13
    cmpg-float p2, p4, p2

    if-gez p2, :cond_19

    sub-float/2addr v0, p1

    return v0

    :cond_19
    return p3
.end method

.method private Z2()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H0:Z

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

.method static synthetic a0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B4()V

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

.method static synthetic a1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q1:I

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

.method private a2(FFFF)F
    .registers 6

    .line 1
    add-float v0, p1, p2

    sub-float v0, p3, v0

    mul-float p4, p4, v0

    sub-float/2addr p3, p4

    sub-float/2addr p1, p3

    add-float/2addr p1, p2

    return p1
.end method

.method private a3()Z
    .registers 2

    .line 1
    invoke-static {p0}, Lax/u3/z;->u(Landroid/content/Context;)Z

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

.method private a4()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->I()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->G()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->V()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c2()V

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

.method static synthetic b0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U2()Z

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

.method static synthetic b1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m0:I

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

.method private b2()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z1:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B1:Landroid/os/Handler;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K1:Ljava/lang/Runnable;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private b3()Z
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I0:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_10

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    if-eq v0, v1, :cond_10

    .line 9
    .line 10
    const/16 v1, 0x22

    .line 11
    .line 12
    if-ne v0, v1, :cond_e

    .line 13
    .line 14
    goto :goto_10

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_10
    :goto_10
    const/4 v0, 0x1

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method private b4()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n0:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F3(Z)V

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

.method static synthetic c0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o2()V

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

.method static synthetic c1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m0:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m0:I

    .line 6
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
    .line 22
.end method

.method private c2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getControllerAutoShow()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_14

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U2()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_14

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 19
    .line 20
    .line 21
    :cond_14
    return-void
.end method

.method private c3()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z0:Z

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

.method private c4()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_17

    .line 6
    :cond_5
    invoke-interface {v0}, Lax/P0/H;->v()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    xor-int/lit8 v1, v0, 0x1

    .line 11
    .line 12
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    invoke-interface {v2, v1}, Lax/P0/H;->S(Z)V

    .line 15
    .line 16
    .line 17
    if-nez v0, :cond_17

    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->G()V

    .line 22
    .line 23
    .line 24
    :cond_17
    :goto_17
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

.method static synthetic d0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g3()Z

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

.method static synthetic d1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/l1/n;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0:Lax/l1/n;

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

.method private d2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/viewer/g;->n(Landroid/view/View;)V

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

.method private d3()Z
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

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
    invoke-interface {v0}, Lax/P0/H;->M()Lax/S0/I;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    if-eq v2, v3, :cond_21

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/S0/I;->b()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eq v0, v3, :cond_21

    .line 23
    .line 24
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_21

    .line 31
    .line 32
    const/4 v0, 0x1

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

.method private d4()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-interface {v0}, Lax/P0/H;->o()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-static {v1, v2}, Lax/S0/H;->a(II)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {v0, v1}, Lax/P0/H;->j(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r4()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static synthetic e0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z4()V

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

.method static synthetic e1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/r7/z;Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A2(Lax/r7/z;Ljava/lang/String;)Ljava/lang/String;

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

.method private e2()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-static {v0, p0}, Lax/S2/b;->a(Ljava/lang/Object;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J0:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K:Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private e3()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P:Z

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

.method private e4()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getResizeMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    if-eqz v0, :cond_23

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    if-eq v0, v1, :cond_1c

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eq v0, v2, :cond_17

    .line 15
    .line 16
    invoke-static {}, Lax/u3/b;->f()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q0:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a1:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_27

    .line 24
    :cond_17
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q0:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a1:Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_27

    .line 29
    :cond_1c
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S0:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c1:Ljava/lang/String;

    .line 32
    .line 33
    move-object v2, v1

    .line 34
    const/4 v1, 0x4

    .line 35
    goto :goto_27

    .line 36
    :cond_23
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R0:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b1:Ljava/lang/String;

    .line 39
    .line 40
    :goto_27
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Landroidx/media3/ui/PlayerView;->setResizeMode(I)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r:Landroid/widget/ImageButton;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r:Landroid/widget/ImageButton;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M1:Ljava/lang/Runnable;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M1:Ljava/lang/Runnable;

    .line 70
    .line 71
    const-wide/16 v2, 0x3e8

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

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

.method static synthetic f0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S2()Z

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

.method static synthetic f1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k2()Ljava/lang/String;

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

.method private f2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

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

.method private f3()Z
    .registers 2

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y1:I

    .line 2
    .line 3
    if-ltz v0, :cond_6

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

.method private f4()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2b

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_f
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v1, v2, :cond_3a

    .line 23
    .line 24
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ne v0, v2, :cond_28

    .line 37
    .line 38
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 39
    .line 40
    .line 41
    :cond_28
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_f

    .line 44
    :cond_2b
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 60
    .line 61
    invoke-static {p0, v0}, Lax/t3/l;->l(Landroid/content/Context;Z)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s4()V

    .line 65
    .line 66
    .line 67
    return-void
    .line 68
.end method

.method static synthetic g0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U1()V

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

.method static synthetic g1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R3(Ljava/lang/String;)V

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

.method private g2()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m1:Z

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1:I

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o1:J

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

.method private g3()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C0:Z

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

.method private g4()V
    .registers 4

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1c

    .line 5
    .line 6
    sput-boolean v1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U1:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_13

    .line 11
    .line 12
    sput-boolean v1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T1:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/g;->l()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    sput-boolean v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T1:Z

    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/g;->k()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q1:Lcom/voxdon/xplorer/viewer/g$h;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/voxdon/xplorer/viewer/g;->o(Landroid/view/View;Lcom/voxdon/xplorer/viewer/g$h;)V

    .line 36
    .line 37
    .line 38
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

.method static synthetic h0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z2()Z

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

.method static synthetic h1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0:Z

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

.method private h2()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K0:Z

    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0:J

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e2()V

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
.end method

.method private h3()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A0:Z

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

.method private h4()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/d;->n0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_c

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F2()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W2()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_16

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q3()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1e

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F2()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q3()V

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

.method static synthetic i0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k3()V

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

.method static synthetic i1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v4()V

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

.method private i2(Landroid/net/Uri;)Landroid/net/Uri;
    .registers 6

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->C(Landroid/net/Uri;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    goto :goto_44

    .line 8
    :cond_7
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->B(Landroid/net/Uri;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3e

    .line 13
    .line 14
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->e(Landroid/net/Uri;)Lax/Z2/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Ljava/io/File;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lax/Z2/k;->d()Lax/c3/K;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-static {v0, v1, v3}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_39

    .line 38
    .line 39
    const-string v1, "/Android"

    .line 40
    .line 41
    invoke-static {v1, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_39

    .line 46
    .line 47
    invoke-static {v2}, Lcom/voxdon/xplorer/file/x;->O0(Ljava/io/File;)Lcom/voxdon/xplorer/file/y;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_39

    .line 56
    .line 57
    goto :goto_44

    .line 58
    :cond_39
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_3e
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->A(Landroid/net/Uri;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_45

    .line 68
    .line 69
    :goto_44
    return-object p1

    .line 70
    :cond_45
    invoke-static {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->E(Landroid/net/Uri;)Z

    .line 71
    .line 72
    .line 73
    return-object p1
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

.method private i3(Z)V
    .registers 4

    .line 1
    invoke-static {}, Lax/X2/Q;->u0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_13

    .line 7
    .line 8
    if-eqz p1, :cond_f

    .line 9
    .line 10
    const/16 p1, 0xe

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    if-eqz p1, :cond_1d

    .line 21
    .line 22
    invoke-static {p0}, Lax/u3/z;->l(Landroid/app/Activity;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

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

.method private i4()V
    .registers 8

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N2()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1b

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-wide v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0:J

    .line 18
    .line 19
    sub-long/2addr v2, v4

    .line 20
    const-wide/16 v4, 0x7530

    .line 21
    .line 22
    cmp-long v0, v2, v4

    .line 23
    .line 24
    if-lez v0, :cond_1b

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K0:Z

    .line 27
    .line 28
    :cond_1b
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b3()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_36

    .line 34
    .line 35
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 36
    .line 37
    invoke-interface {v0}, Lax/P0/H;->v()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3d

    .line 42
    .line 43
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 44
    .line 45
    invoke-interface {v0}, Lax/P0/H;->i()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v3, 0x4

    .line 50
    if-ne v0, v3, :cond_34

    .line 51
    .line 52
    goto :goto_3d

    .line 53
    :cond_34
    const/4 v2, 0x0

    .line 54
    goto :goto_3d

    .line 55
    :cond_36
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 56
    .line 57
    invoke-interface {v0}, Lax/P0/H;->v()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    xor-int/2addr v2, v0

    .line 62
    :cond_3d
    :goto_3d
    const/16 v0, 0x8

    .line 63
    .line 64
    if-eqz v2, :cond_d1

    .line 65
    .line 66
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N2()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_d1

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U2()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_d1

    .line 77
    .line 78
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O2()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_d1

    .line 83
    .line 84
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a3()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_5b

    .line 89
    .line 90
    goto/16 :goto_d1

    .line 91
    .line 92
    :cond_5b
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J:Landroid/view/ViewGroup;

    .line 93
    .line 94
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D2()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_6c

    .line 102
    .line 103
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P2()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6f

    .line 108
    .line 109
    :cond_6c
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A3()V

    .line 110
    .line 111
    .line 112
    :cond_6f
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e3()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_c6

    .line 117
    .line 118
    iget-wide v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M0:J

    .line 119
    .line 120
    const-wide/16 v4, 0x0

    .line 121
    .line 122
    cmp-long v6, v2, v4

    .line 123
    .line 124
    if-nez v6, :cond_83

    .line 125
    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    iput-wide v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M0:J

    .line 131
    .line 132
    :cond_83
    iget-boolean v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O:Z

    .line 133
    .line 134
    if-eqz v2, :cond_bb

    .line 135
    .line 136
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 137
    .line 138
    const v3, 0x7f0a02c3

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eqz v2, :cond_bb

    .line 146
    .line 147
    invoke-virtual {p0}, Lax/n/c;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 156
    .line 157
    invoke-static {p0, v3}, Lax/u3/B;->f(Landroid/content/Context;I)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    const/16 v4, 0x96

    .line 162
    .line 163
    const/16 v5, 0x168

    .line 164
    .line 165
    if-gt v3, v5, :cond_ae

    .line 166
    .line 167
    sub-int/2addr v5, v3

    .line 168
    sub-int/2addr v4, v5

    .line 169
    const/16 v3, 0x3c

    .line 170
    .line 171
    if-ge v4, v3, :cond_ae

    .line 172
    .line 173
    const/16 v4, 0x3c

    .line 174
    .line 175
    :cond_ae
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {p0, v4}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 184
    .line 185
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    .line 187
    .line 188
    :cond_bb
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M:Landroid/view/View;

    .line 189
    .line 190
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L:Landroid/view/View;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_c6
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M:Landroid/view/View;

    .line 200
    .line 201
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L:Landroid/view/View;

    .line 205
    .line 206
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_d1
    :goto_d1
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J:Landroid/view/ViewGroup;

    .line 211
    .line 212
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 213
    .line 214
    .line 215
    return-void
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method static synthetic j0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H:Landroid/view/View;

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

.method static synthetic j1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j4()V

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

.method private j3(Z)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

    .line 2
    .line 3
    if-eqz p1, :cond_c

    .line 4
    .line 5
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 6
    .line 7
    const/16 v0, 0xbb8

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/media3/ui/PlayerView;->setControllerShowTimeoutMs(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_f

    .line 13
    :cond_c
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G3()V

    .line 14
    .line 15
    .line 16
    :goto_f
    iget-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i3(Z)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n4()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q4()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k4()V

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

.method private j4()V
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-le v0, v1, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u:Landroid/widget/ImageButton;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u:Landroid/widget/ImageButton;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method static synthetic k0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V3(I)V

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

.method static synthetic k1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o0:I

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

.method private k2()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y2()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_9

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y2()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lax/c3/v;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
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

.method private k3()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H0:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 11
    .line 12
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L3(FZ)V

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

.method private k4()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W2()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    :goto_d
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J1:Lax/i/r;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lax/i/r;->j(Z)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method static synthetic l0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/P0/y;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y:Lax/P0/y;

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

.method static synthetic l1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o0:I

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

.method private l2()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y:Landroidx/appcompat/widget/MySpinner;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {v0}, Landroidx/appcompat/widget/MySpinner;->c()V

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

.method private l3()V
    .registers 2

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M2(F)V

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
.end method

.method private l4()V
    .registers 1

    .line 1
    return-void
.end method

.method static synthetic m0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/P0/y;)Lax/P0/y;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y:Lax/P0/y;

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

.method static synthetic m1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o3()V

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

.method private m2(Z)V
    .registers 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 4
    .line 5
    if-nez v1, :cond_7

    .line 6
    .line 7
    goto :goto_3c

    .line 8
    :cond_7
    invoke-interface {v1}, Lax/P0/H;->s0()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v0}, Lax/t3/l;->c(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    int-to-long v3, v3

    .line 17
    const-wide/16 v5, 0x3e8

    .line 18
    .line 19
    mul-long v3, v3, v5

    .line 20
    .line 21
    if-eqz p1, :cond_19

    .line 22
    .line 23
    add-long v7, v1, v3

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    sub-long v7, v1, v3

    .line 27
    .line 28
    :goto_1b
    iget-object v9, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 29
    .line 30
    invoke-interface {v9}, Lax/P0/H;->g0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v9

    .line 34
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const-wide/16 v13, 0x0

    .line 40
    .line 41
    cmp-long v15, v9, v11

    .line 42
    .line 43
    if-nez v15, :cond_2d

    .line 44
    .line 45
    move-wide v9, v13

    .line 46
    :cond_2d
    cmp-long v11, v7, v13

    .line 47
    .line 48
    if-gez v11, :cond_33

    .line 49
    .line 50
    move-wide v7, v13

    .line 51
    goto :goto_38

    .line 52
    :cond_33
    cmp-long v11, v7, v9

    .line 53
    .line 54
    if-lez v11, :cond_38

    .line 55
    .line 56
    move-wide v7, v9

    .line 57
    :cond_38
    :goto_38
    cmp-long v9, v1, v7

    .line 58
    .line 59
    if-nez v9, :cond_3d

    .line 60
    .line 61
    :goto_3c
    return-void

    .line 62
    :cond_3d
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 63
    .line 64
    sget-object v2, Lax/Y0/Z;->c:Lax/Y0/Z;

    .line 65
    .line 66
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/ExoPlayer;->c(Lax/Y0/Z;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 70
    .line 71
    invoke-interface {v1, v7, v8}, Lax/P0/H;->t(J)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 75
    .line 76
    sget-object v2, Lax/Y0/Z;->g:Lax/Y0/Z;

    .line 77
    .line 78
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/ExoPlayer;->c(Lax/Y0/Z;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 82
    .line 83
    iget-object v2, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M1:Ljava/lang/Runnable;

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    if-eqz p1, :cond_74

    .line 89
    .line 90
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v7, "+"

    .line 98
    .line 99
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v4}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    goto :goto_8e

    .line 117
    :cond_74
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 118
    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v7, "-"

    .line 125
    .line 126
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-static {v3, v4}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    :goto_8e
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 144
    .line 145
    iget-object v2, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M1:Ljava/lang/Runnable;

    .line 146
    .line 147
    invoke-virtual {v1, v2, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 148
    .line 149
    .line 150
    return-void
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

.method private m3()V
    .registers 2

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M2(F)V

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
.end method

.method private m4()V
    .registers 1

    .line 1
    return-void
.end method

.method static synthetic n0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)Lax/P0/y;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X1(I)Lax/P0/y;

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

.method static synthetic n1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/exoplayer/ExoPlayer;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

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

.method private n2(JZZ)V
    .registers 7

    .line 1
    if-eqz p4, :cond_b

    .line 2
    .line 3
    iget-object p4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iput-wide p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0:J

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0:Z

    .line 15
    .line 16
    if-eq p1, p3, :cond_13

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 p1, 0x0

    .line 21
    :goto_14
    iput-boolean p3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0:Z

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    if-nez p1, :cond_26

    .line 28
    .line 29
    iget-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t0:J

    .line 30
    .line 31
    sub-long/2addr p2, v0

    .line 32
    iget-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w1:J

    .line 33
    .line 34
    cmp-long p4, p2, v0

    .line 35
    .line 36
    if-gez p4, :cond_26

    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p4(Z)V

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

.method private n3()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_14

    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    if-ge v0, v1, :cond_14

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s3()V

    .line 19
    .line 20
    .line 21
    :cond_14
    :goto_14
    return-void
.end method

.method private n4()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    if-eqz v0, :cond_42

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i:Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r:Landroid/widget/ImageButton;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f:Landroid/view/ViewGroup;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s:Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_fc

    .line 66
    .line 67
    :cond_42
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

    .line 68
    .line 69
    if-eqz v0, :cond_61

    .line 70
    .line 71
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g:Landroid/view/View;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h:Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i:Landroid/view/View;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f:Landroid/view/ViewGroup;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_fc

    .line 97
    .line 98
    :cond_61
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n0:Z

    .line 99
    .line 100
    if-eqz v0, :cond_b1

    .line 101
    .line 102
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g:Landroid/view/View;

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h:Landroid/view/View;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i:Landroid/view/View;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j:Landroid/view/View;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p:Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r:Landroid/widget/ImageButton;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l:Landroid/view/View;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m:Landroid/view/View;

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f:Landroid/view/ViewGroup;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 153
    .line 154
    const v2, 0x7f080188

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 161
    .line 162
    const v2, 0x7f130279

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s:Landroid/view/View;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    .line 176
    .line 177
    goto :goto_fc

    .line 178
    :cond_b1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g:Landroid/view/View;

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h:Landroid/view/View;

    .line 184
    .line 185
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i:Landroid/view/View;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j:Landroid/view/View;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p:Landroid/view/View;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r:Landroid/widget/ImageButton;

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l:Landroid/view/View;

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m:Landroid/view/View;

    .line 214
    .line 215
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 216
    .line 217
    .line 218
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f:Landroid/view/ViewGroup;

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 229
    .line 230
    const v2, 0x7f08019f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 237
    .line 238
    const v2, 0x7f130287

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s:Landroid/view/View;

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    :goto_fc
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h4()V

    .line 254
    .line 255
    .line 256
    return-void
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

.method static synthetic o0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/net/Uri;
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y2()Landroid/net/Uri;

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

.method static synthetic o1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r4()V

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

.method private o2()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 5
    .line 6
    const-string v2, ""

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q0:Z

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-nez v1, :cond_14

    .line 15
    .line 16
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r0:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1f

    .line 24
    .line 25
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 26
    .line 27
    if-eqz v1, :cond_1f

    .line 28
    .line 29
    invoke-interface {v1, v2}, Lax/P0/H;->S(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p4(Z)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t0:J

    .line 38
    .line 39
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0:J

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n4()V

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

.method private o3()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    if-ge v0, v1, :cond_15

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s3()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q3()V

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

.method private o4()V
    .registers 6

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v0, :cond_a

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v3, 0x0

    .line 12
    :goto_b
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    sub-int/2addr v0, v2

    .line 17
    if-ge v4, v0, :cond_13

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    :cond_13
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o:Landroid/view/View;

    .line 21
    .line 22
    invoke-direct {p0, v3, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E3(ZLandroid/view/View;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n:Landroid/view/View;

    .line 26
    .line 27
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E3(ZLandroid/view/View;)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method static synthetic p0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;FZ)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L3(FZ)V

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

.method static synthetic p1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p2()V

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

.method private p2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_2c

    .line 6
    :cond_5
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->I()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q0:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_1d

    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 31
    .line 32
    invoke-interface {v0}, Lax/P0/H;->n()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r0:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2c

    .line 39
    .line 40
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Lax/P0/H;->S(Z)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    :goto_2c
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

.method private p3(FFF)Z
    .registers 12

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_b

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f2()V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_b
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    invoke-interface {v0}, Lax/P0/H;->M()Lax/S0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    int-to-float v4, v4

    .line 35
    mul-float v4, v4, p1

    .line 36
    .line 37
    float-to-int v4, v4

    .line 38
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x1

    .line 45
    if-gt v4, v5, :cond_2f

    .line 46
    .line 47
    goto :goto_45

    .line 48
    :cond_2f
    int-to-float v4, v4

    .line 49
    iget-object v7, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 50
    .line 51
    invoke-virtual {v7}, Landroid/view/View;->getTranslationY()F

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-direct {p0, v4, v5, v7, p3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z1(FIFF)F

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    cmpl-float v3, v3, p3

    .line 60
    .line 61
    if-eqz v3, :cond_45

    .line 62
    .line 63
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 64
    .line 65
    invoke-virtual {v3, p3}, Landroid/view/View;->setTranslationY(F)V

    .line 66
    .line 67
    .line 68
    const/4 p3, 0x1

    .line 69
    goto :goto_46

    .line 70
    :cond_45
    :goto_45
    const/4 p3, 0x0

    .line 71
    :goto_46
    invoke-virtual {v0}, Lax/S0/I;->b()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    int-to-float v0, v0

    .line 76
    mul-float v0, v0, p1

    .line 77
    .line 78
    float-to-int p1, v0

    .line 79
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-gt p1, v0, :cond_57

    .line 86
    .line 87
    goto :goto_6c

    .line 88
    :cond_57
    int-to-float p1, p1

    .line 89
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/view/View;->getTranslationX()F

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-direct {p0, p1, v0, v3, p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z1(FIFF)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    cmpl-float p2, v2, p1

    .line 100
    .line 101
    if-eqz p2, :cond_6c

    .line 102
    .line 103
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 104
    .line 105
    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 106
    .line 107
    .line 108
    goto :goto_6e

    .line 109
    :cond_6c
    :goto_6c
    if-eqz p3, :cond_6f

    .line 110
    .line 111
    :goto_6e
    return v6

    .line 112
    :cond_6f
    return v1
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

.method private p4(Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_22

    .line 6
    :cond_5
    invoke-interface {v0}, Lax/P0/H;->s0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    if-nez p1, :cond_16

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0:J

    .line 13
    .line 14
    cmp-long v4, v0, v2

    .line 15
    .line 16
    if-gez v4, :cond_16

    .line 17
    .line 18
    iget-boolean v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0:Z

    .line 19
    .line 20
    if-eqz v2, :cond_16

    .line 21
    .line 22
    goto :goto_22

    .line 23
    :cond_16
    if-nez p1, :cond_23

    .line 24
    .line 25
    iget-wide v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0:J

    .line 26
    .line 27
    cmp-long p1, v0, v2

    .line 28
    .line 29
    if-lez p1, :cond_23

    .line 30
    .line 31
    iget-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0:Z

    .line 32
    .line 33
    if-nez p1, :cond_23

    .line 34
    .line 35
    :goto_22
    return-void

    .line 36
    :cond_23
    iget-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2f

    .line 39
    .line 40
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 41
    .line 42
    sget-object v0, Lax/Y0/Z;->e:Lax/Y0/Z;

    .line 43
    .line 44
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/ExoPlayer;->c(Lax/Y0/Z;)V

    .line 45
    .line 46
    .line 47
    goto :goto_36

    .line 48
    :cond_2f
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 49
    .line 50
    sget-object v0, Lax/Y0/Z;->f:Lax/Y0/Z;

    .line 51
    .line 52
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/ExoPlayer;->c(Lax/Y0/Z;)V

    .line 53
    .line 54
    .line 55
    :goto_36
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 56
    .line 57
    iget-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0:J

    .line 58
    .line 59
    invoke-interface {p1, v0, v1}, Lax/P0/H;->t(J)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 63
    .line 64
    sget-object v0, Lax/Y0/Z;->g:Lax/Y0/Z;

    .line 65
    .line 66
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/ExoPlayer;->c(Lax/Y0/Z;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t0:J

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

.method static synthetic q0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z1:Z

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

.method static synthetic q1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;JZZ)V
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n2(JZZ)V

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

.method private q2()Landroid/view/View;
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I:Landroidx/appcompat/widget/Toolbar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTouchscreenBlocksFocus(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Landroidx/appcompat/widget/p;

    .line 14
    .line 15
    const-string v2, "not work anymore"

    .line 16
    .line 17
    if-eqz v1, :cond_35

    .line 18
    .line 19
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I:Landroidx/appcompat/widget/Toolbar;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_31

    .line 26
    .line 27
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I:Landroidx/appcompat/widget/Toolbar;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_31

    .line 42
    .line 43
    const v1, 0x102002c

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_31
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_35
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v0
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

.method private q3()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B4()V

    .line 8
    .line 9
    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r3(IZ)V

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

.method private q4()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/d;->n0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_d

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J3(Z)V

    .line 11
    .line 12
    .line 13
    goto :goto_23

    .line 14
    :cond_d
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W2()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_18

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J3(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_23

    .line 25
    :cond_18
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r1:Z

    .line 26
    .line 27
    if-eqz v0, :cond_20

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J3(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_23

    .line 33
    :cond_20
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J3(Z)V

    .line 34
    .line 35
    .line 36
    :goto_23
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h4()V

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
.end method

.method static synthetic r0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r2()V

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

.method static synthetic r1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0:J

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

.method private r2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B1:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K1:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->finish()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private r3(IZ)V
    .registers 4

    .line 1
    if-ltz p1, :cond_33

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_9

    .line 8
    .line 9
    goto :goto_33

    .line 10
    :cond_9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 11
    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;

    .line 16
    .line 17
    if-eqz v0, :cond_25

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/u3/q;->isCancelled()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_25

    .line 24
    .line 25
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;

    .line 26
    .line 27
    invoke-static {v0}, Lax/u3/q;->n(Lax/u3/q;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_25

    .line 32
    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/u3/q;->e()Z

    .line 36
    .line 37
    .line 38
    :cond_25
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1, p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;IZ)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H1:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    new-array p1, p1, [Ljava/lang/Void;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    :goto_33
    invoke-static {}, Lax/u3/b;->f()V

    .line 53
    .line 54
    .line 55
    return-void
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

.method private r4()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T0:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d1:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    invoke-interface {v0}, Lax/P0/H;->o()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3e

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-eq v0, v1, :cond_2f

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    if-eq v0, v1, :cond_20

    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V0:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f1:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U0:Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e1:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3e
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 64
    .line 65
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T0:Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d1:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

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

.method static synthetic s0()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

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

.method static synthetic s1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

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

.method private s2(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_2e

    .line 7
    .line 8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string v0, "Invalid media path 3"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "path:"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2e
    if-nez p2, :cond_31

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_31
    invoke-static {p1}, Lax/c3/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {}, Lax/c3/A;->o()[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    array-length v2, v0

    .line 59
    const/4 v3, 0x0

    .line 60
    :goto_3b
    if-ge v3, v2, :cond_75

    .line 61
    .line 62
    aget-object v4, v0, v3

    .line 63
    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v6, "."

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    :cond_57
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_72

    .line 93
    .line 94
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Lcom/voxdon/xplorer/file/n;

    .line 99
    .line 100
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_57

    .line 109
    .line 110
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_72
    add-int/lit8 v3, v3, 0x1

    .line 116
    .line 117
    goto :goto_3b

    .line 118
    :cond_75
    return-object v1
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

.method private s3()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lt v0, v1, :cond_10

    .line 10
    .line 11
    const-string v0, "bad index"

    .line 12
    .line 13
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h3()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_19

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B4()V

    .line 24
    .line 25
    .line 26
    :cond_19
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x1

    .line 31
    add-int/2addr v0, v1

    .line 32
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r3(IZ)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private s4()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x:Landroid/widget/ImageButton;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z0:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x:Landroid/widget/ImageButton;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i1:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x:Landroid/widget/ImageButton;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y0:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x:Landroid/widget/ImageButton;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j1:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

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

.method static synthetic t0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X2()Z

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

.method static synthetic t1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V2()Z

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

.method private t2(Landroid/net/Uri;)Landroid/net/Uri;
    .registers 8

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "file"

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_19

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v2(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_19
    const-string v1, "content://media"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_2e

    .line 34
    .line 35
    invoke-static {p0, p1}, Lax/c3/N;->a(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_2d

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v2(Ljava/lang/String;)Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2d
    return-object v1

    .line 47
    :cond_2e
    const-string v0, "content"

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const-string v2, "subtitle uri : "

    .line 58
    .line 59
    if-eqz v0, :cond_55

    .line 60
    .line 61
    invoke-direct {p0, p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u2(Landroid/content/Context;Landroid/net/Uri;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_55
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/service/b;->k(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_bc

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lax/o3/c;->z(Ljava/lang/String;)Lax/Z2/k;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v3}, Lax/o3/c;->z(Ljava/lang/String;)Lax/Z2/k;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-eqz v4, :cond_bc

    .line 113
    .line 114
    if-eqz v0, :cond_bc

    .line 115
    .line 116
    invoke-virtual {v4}, Lax/Z2/k;->d()Lax/c3/K;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v5}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_bc

    .line 129
    .line 130
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v4}, Lax/Z2/k;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v5, v4}, Lax/Z2/b;->h(Ljava/lang/String;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_bc

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-direct {p0, v0, v4}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s2(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_bc

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v3, v0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    sget-object v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

    .line 170
    .line 171
    new-instance v3, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v0, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_bc
    sget-object v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S1:Ljava/util/logging/Logger;

    .line 190
    .line 191
    new-instance v2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v3, "media uri : "

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-object v1
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

.method private t3()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

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
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h3()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B4()V

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    sub-int/2addr v0, v1

    .line 23
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H3(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r3(IZ)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private t4()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_20

    .line 4
    .line 5
    invoke-interface {v0}, Lax/P0/H;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m1:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/P0/H;->P()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1:I

    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 20
    .line 21
    invoke-interface {v0}, Lax/P0/H;->V()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o1:J

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

.method static synthetic u0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T3(Z)V

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

.method static synthetic u1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;FFFFF)V
    .registers 6

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C4(FFFFF)V

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

.method private u2(Landroid/content/Context;Landroid/net/Uri;)Landroid/net/Uri;
    .registers 11

    .line 1
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_32

    .line 11
    .line 12
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "Invalid media path 2"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "path:"

    .line 32
    .line 33
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_32
    invoke-static {v0}, Lax/c3/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {}, Lax/c3/A;->o()[Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    array-length v3, v1

    .line 64
    const/4 v4, 0x0

    .line 65
    :goto_40
    if-ge v4, v3, :cond_71

    .line 66
    .line 67
    aget-object v5, v1, v4

    .line 68
    .line 69
    new-instance v6, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v7, "."

    .line 78
    .line 79
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {p2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v6, v5}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    :try_start_64
    const-string v6, "r"

    .line 102
    .line 103
    invoke-virtual {p1, v5, v6}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 104
    .line 105
    .line 106
    move-result-object v6
    :try_end_6a
    .catch Ljava/lang/Exception; {:try_start_64 .. :try_end_6a} :catch_6e

    .line 107
    :try_start_6a
    invoke-virtual {v6}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_6d
    .catch Ljava/io/IOException; {:try_start_6a .. :try_end_6d} :catch_6d
    .catch Ljava/lang/Exception; {:try_start_6a .. :try_end_6d} :catch_6e

    .line 108
    .line 109
    .line 110
    :catch_6d
    return-object v5

    .line 111
    :catch_6e
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    goto :goto_40

    .line 114
    :cond_71
    return-object v2
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

.method private u3()V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_28

    .line 6
    :cond_5
    invoke-interface {v0}, Lax/P0/H;->i()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 11
    .line 12
    invoke-interface {v1}, Lax/P0/H;->s0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_29

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    if-eq v0, v3, :cond_1f

    .line 24
    .line 25
    const-wide/16 v3, 0xbb8

    .line 26
    .line 27
    cmp-long v0, v1, v3

    .line 28
    .line 29
    if-lez v0, :cond_1f

    .line 30
    .line 31
    goto :goto_29

    .line 32
    :cond_1f
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-lez v0, :cond_28

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t3()V

    .line 39
    .line 40
    .line 41
    :cond_28
    :goto_28
    return-void

    .line 42
    :cond_29
    :goto_29
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 43
    .line 44
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    invoke-interface {v0, v1, v2}, Lax/P0/H;->t(J)V

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
.end method

.method static synthetic v0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S3()V

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

.method static synthetic v1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z0:Z

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

.method private v2(Ljava/lang/String;)Landroid/net/Uri;
    .registers 9

    .line 1
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_2e

    .line 7
    .line 8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "Invalid media path 1"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "path:"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2e
    invoke-static {p1}, Lax/c3/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {}, Lax/c3/A;->o()[Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    array-length v2, v0

    .line 56
    const/4 v3, 0x0

    .line 57
    :goto_38
    if-ge v3, v2, :cond_63

    .line 58
    .line 59
    aget-object v4, v0, v3

    .line 60
    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v6, "."

    .line 70
    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    new-instance v5, Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_60

    .line 91
    .line 92
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_60
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_38

    .line 100
    :cond_63
    return-object v1
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

.method private v4()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E3(ZLandroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0:Z

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eqz v0, :cond_4c

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0:Z

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_2f

    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X0:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g1:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getSubtitleView()Landroidx/media3/ui/SubtitleView;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W0:Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h1:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getSubtitleView()Landroidx/media3/ui/SubtitleView;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 78
    .line 79
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W0:Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 85
    .line 86
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h1:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getSubtitleView()Landroidx/media3/ui/SubtitleView;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 103
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

.method static synthetic w0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f3()Z

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

.method static synthetic w1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D4()V

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

.method private w2()I
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i0:I

    .line 2
    .line 3
    if-gez v0, :cond_9

    .line 4
    .line 5
    invoke-static {}, Lax/u3/b;->f()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    :cond_9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lt v0, v1, :cond_19

    .line 15
    .line 16
    invoke-static {}, Lax/u3/b;->f()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B2()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    return v0

    .line 26
    :cond_19
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i0:I

    .line 27
    .line 28
    return v0
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

.method private w3()V
    .registers 1

    .line 1
    return-void
.end method

.method private w4()V
    .registers 5

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x2()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_c

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P3(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    const-string v2, "file"

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_3f

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lax/c3/B;->L(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_3f

    .line 34
    .line 35
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->D(Landroid/net/Uri;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_29

    .line 40
    .line 41
    goto :goto_3f

    .line 42
    :cond_29
    const-string v1, "content"

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3e

    .line 53
    .line 54
    invoke-static {p0, v0}, Lax/c3/B;->w(Landroid/content/Context;Landroid/net/Uri;)Lax/c3/W;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v0, v0, Lax/c3/W;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P3(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_3e
    return-void

    .line 64
    :cond_3f
    :goto_3f
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-eqz v2, :cond_51

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P3(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_51
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P3(Ljava/lang/String;)V

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

.method static synthetic x0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y1:I

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

.method static synthetic x1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b2()V

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

.method private x2()Landroid/net/Uri;
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_9

    .line 5
    .line 6
    invoke-static {}, Lax/u3/b;->f()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z2(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ltz v0, :cond_1c

    .line 19
    .line 20
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z:[Landroid/net/Uri;

    .line 21
    .line 22
    array-length v3, v2

    .line 23
    if-lt v0, v3, :cond_19

    .line 24
    .line 25
    goto :goto_1c

    .line 26
    :cond_19
    aget-object v0, v2, v0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1c
    :goto_1c
    const-string v0, "what case is this"

    .line 30
    .line 31
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v1
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

.method private x3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X:Lax/b1/O;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b1/O;->d()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X:Lax/b1/O;

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

.method private x4()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0:Lax/l1/n;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/l1/n;->K()Lax/l1/n$e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

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

.method static synthetic y0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B1:Landroid/os/Handler;

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

.method static synthetic y1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G3()V

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

.method private y2()Landroid/net/Uri;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    invoke-static {}, Lax/u3/b;->f()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0

    .line 10
    :cond_9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z2(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a0:[Landroid/net/Uri;

    .line 19
    .line 20
    aget-object v0, v1, v0

    .line 21
    .line 22
    return-object v0
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

.method private y3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_16

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x4()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t4()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->d()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y:Lax/P0/y;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0:Lax/l1/n;

    .line 22
    .line 23
    :cond_16
    invoke-static {}, Lax/X2/Q;->g1()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1f

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x3()V

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

.method private y4(Landroid/content/Intent;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B1:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K1:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "slide_interval"

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y1:I

    .line 16
    .line 17
    const-string v0, "finish_after_play"

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A1:Z

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z1:Z

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
.end method

.method static synthetic z0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u1:Z

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

.method static synthetic z1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m2(Z)V

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

.method private z2(I)I
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c0:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_10
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private z4()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B:Landroid/view/View;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

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


# virtual methods
.method public C2()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p1:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    const-string v0, "VoxXplorer"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lax/S0/d0;->w0(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p1:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p1:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public J3(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    const/16 p1, 0xf06

    .line 4
    .line 5
    goto :goto_7

    .line 6
    :cond_5
    const/16 p1, 0x700

    .line 7
    .line 8
    :goto_7
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q1:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

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
    .line 22
.end method

.method public K(I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q4()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    if-ne p1, v0, :cond_f

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l2()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/g;->d()V

    .line 14
    .line 15
    .line 16
    :cond_f
    if-nez p1, :cond_1b

    .line 17
    .line 18
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G:Lcom/google/android/material/snackbar/Snackbar;

    .line 19
    .line 20
    if-eqz p1, :cond_1b

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->x()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G:Lcom/google/android/material/snackbar/Snackbar;

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
.end method

.method public Z3()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v3()V

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

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 9

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v1, :cond_19

    .line 16
    .line 17
    if-ne v1, v4, :cond_17

    .line 18
    .line 19
    iget v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F1:I

    .line 20
    .line 21
    if-nez v5, :cond_17

    .line 22
    .line 23
    goto :goto_19

    .line 24
    :cond_17
    const/4 v5, 0x0

    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    :goto_19
    const/4 v5, 0x1

    .line 27
    :goto_1a
    if-nez v1, :cond_1f

    .line 28
    .line 29
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F1:I

    .line 30
    .line 31
    goto :goto_23

    .line 32
    :cond_1f
    if-ne v1, v4, :cond_23

    .line 33
    .line 34
    iput v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F1:I

    .line 35
    .line 36
    :cond_23
    :goto_23
    iget v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G1:I

    .line 37
    .line 38
    if-ne v6, v0, :cond_2c

    .line 39
    .line 40
    if-ne v1, v4, :cond_2c

    .line 41
    .line 42
    iput v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G1:I

    .line 43
    .line 44
    return v4

    .line 45
    :cond_2c
    if-eqz v5, :cond_10d

    .line 46
    .line 47
    const/16 v5, 0x14

    .line 48
    .line 49
    if-ne v0, v5, :cond_5c

    .line 50
    .line 51
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 52
    .line 53
    if-ne v2, v5, :cond_45

    .line 54
    .line 55
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/media3/ui/d;->n0()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_108

    .line 62
    .line 63
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroidx/media3/ui/d;->v0()V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_108

    .line 69
    .line 70
    :cond_45
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I:Landroidx/appcompat/widget/Toolbar;

    .line 71
    .line 72
    invoke-static {v5, v2}, Lax/u3/z;->s(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_10d

    .line 77
    .line 78
    if-nez v1, :cond_10d

    .line 79
    .line 80
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/media3/ui/d;->n0()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_108

    .line 87
    .line 88
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a4()V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_108

    .line 92
    .line 93
    :cond_5c
    const/16 v5, 0x13

    .line 94
    .line 95
    if-ne v0, v5, :cond_91

    .line 96
    .line 97
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 98
    .line 99
    if-ne v2, v5, :cond_7a

    .line 100
    .line 101
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 102
    .line 103
    invoke-virtual {p1}, Landroidx/media3/ui/d;->n0()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_108

    .line 108
    .line 109
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q2()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 114
    .line 115
    invoke-virtual {v2}, Landroidx/media3/ui/d;->v0()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 119
    .line 120
    .line 121
    goto/16 :goto_108

    .line 122
    .line 123
    :cond_7a
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f:Landroid/view/ViewGroup;

    .line 124
    .line 125
    invoke-static {v5, v2}, Lax/u3/z;->s(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_10d

    .line 130
    .line 131
    if-nez v1, :cond_10d

    .line 132
    .line 133
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 134
    .line 135
    invoke-virtual {p1}, Landroidx/media3/ui/d;->n0()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_108

    .line 140
    .line 141
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a4()V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_108

    .line 145
    .line 146
    :cond_91
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T2(I)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_9f

    .line 151
    .line 152
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 153
    .line 154
    if-ne v2, v5, :cond_10d

    .line 155
    .line 156
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c4()V

    .line 157
    .line 158
    .line 159
    goto :goto_108

    .line 160
    :cond_9f
    const/16 v5, 0x55

    .line 161
    .line 162
    if-eq v0, v5, :cond_ee

    .line 163
    .line 164
    const/16 v5, 0x3e

    .line 165
    .line 166
    if-ne v0, v5, :cond_a8

    .line 167
    .line 168
    goto :goto_ee

    .line 169
    :cond_a8
    const/16 v5, 0x7e

    .line 170
    .line 171
    if-ne v0, v5, :cond_cb

    .line 172
    .line 173
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 174
    .line 175
    if-ne v2, v5, :cond_10d

    .line 176
    .line 177
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 178
    .line 179
    invoke-static {v2}, Lax/S0/d0;->v1(Lax/P0/H;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_10d

    .line 184
    .line 185
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 186
    .line 187
    invoke-virtual {p1, v3}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 188
    .line 189
    .line 190
    invoke-direct {p0, v4}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U3(Z)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 194
    .line 195
    invoke-static {p1}, Lax/S0/d0;->z0(Lax/P0/H;)Z

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 199
    .line 200
    invoke-virtual {p1, v4}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 201
    .line 202
    .line 203
    goto :goto_108

    .line 204
    :cond_cb
    const/16 v5, 0x7f

    .line 205
    .line 206
    if-ne v0, v5, :cond_10d

    .line 207
    .line 208
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 209
    .line 210
    if-ne v2, v5, :cond_10d

    .line 211
    .line 212
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 213
    .line 214
    invoke-static {v2}, Lax/S0/d0;->v1(Lax/P0/H;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-nez v2, :cond_10d

    .line 219
    .line 220
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 221
    .line 222
    invoke-virtual {p1, v3}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 223
    .line 224
    .line 225
    invoke-direct {p0, v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U3(Z)V

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 229
    .line 230
    invoke-static {p1}, Lax/S0/d0;->y0(Lax/P0/H;)Z

    .line 231
    .line 232
    .line 233
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 234
    .line 235
    invoke-virtual {p1, v4}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_108

    .line 239
    :cond_ee
    :goto_ee
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 240
    .line 241
    if-ne v2, v5, :cond_10d

    .line 242
    .line 243
    invoke-virtual {v5, v3}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 247
    .line 248
    invoke-static {p1}, Lax/S0/d0;->v1(Lax/P0/H;)Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U3(Z)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 256
    .line 257
    invoke-static {p1}, Lax/S0/d0;->A0(Lax/P0/H;)Z

    .line 258
    .line 259
    .line 260
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 261
    .line 262
    invoke-virtual {p1, v4}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    .line 263
    .line 264
    .line 265
    :cond_108
    :goto_108
    if-nez v1, :cond_10c

    .line 266
    .line 267
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G1:I

    .line 268
    .line 269
    :cond_10c
    return v4

    .line 270
    :cond_10d
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 271
    .line 272
    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-nez v0, :cond_11d

    .line 277
    .line 278
    invoke-super {p0, p1}, Lax/n/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_11c

    .line 283
    .line 284
    goto :goto_11d

    .line 285
    :cond_11c
    return v3

    .line 286
    :cond_11d
    :goto_11d
    return v4
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

.method public finish()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_14

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z1:Z

    .line 8
    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_17

    .line 16
    :cond_f
    const/4 v0, -0x1

    .line 17
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_17

    .line 21
    :cond_14
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I3()V

    .line 22
    .line 23
    .line 24
    :goto_17
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X2()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3d

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z1:Z

    .line 34
    .line 35
    if-nez v0, :cond_3d

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f3()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_34

    .line 42
    .line 43
    const v0, 0x7f010031

    .line 44
    .line 45
    .line 46
    const v1, 0x7f010032

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    const v0, 0x7f01001e

    .line 54
    .line 55
    .line 56
    const v1, 0x7f01001f

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

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
.end method

.method public h()Lax/P0/H;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

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

.method j2()Lax/l1/n$e;
    .registers 3

    .line 1
    new-instance v0, Lax/l1/n$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/l1/n$f;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/l1/n$f;->c0(Ljava/lang/String;)Lax/l1/n$f;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/l1/n$f;->a0(Ljava/lang/String;)Lax/l1/n$f;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Lax/l1/n$f;->f0(Z)Lax/l1/n$f;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lax/l1/n$f;->V()Lax/l1/n$e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

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

.method public k()Landroidx/media3/ui/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/n/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i4()V

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

.method public onCreate(Landroid/os/Bundle;)V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lax/Q2/b;->f(Landroid/content/Context;Z)V

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lax/X2/Q;->N0()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const v2, 0x7f130137

    .line 13
    .line 14
    .line 15
    if-nez v1, :cond_2c

    .line 16
    .line 17
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "VIDEO PLAYER NOT SUPPORTED"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->finish()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y4(Landroid/content/Intent;)V

    .line 50
    .line 51
    .line 52
    const/high16 v1, 0x10a0000

    .line 53
    .line 54
    const v3, 0x10a0001

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 58
    .line 59
    .line 60
    :try_start_3b
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W1()Lax/U0/g$a;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U:Lax/U0/g$a;
    :try_end_41
    .catch Ljava/lang/SecurityException; {:try_start_3b .. :try_end_41} :catch_337

    .line 65
    .line 66
    new-instance v2, Lax/i1/Z$b;

    .line 67
    .line 68
    invoke-direct {v2, v1}, Lax/i1/Z$b;-><init>(Lax/U0/g$a;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V:Lax/i1/O;

    .line 72
    .line 73
    const v1, 0x7f0d0028

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lax/n/c;->setContentView(I)V

    .line 77
    .line 78
    .line 79
    const v1, 0x7f0a03ba

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 87
    .line 88
    const v1, 0x7f0a0133

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Landroid/widget/TextView;

    .line 96
    .line 97
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T:Landroid/widget/TextView;

    .line 98
    .line 99
    const v1, 0x7f0a04a5

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 107
    .line 108
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I:Landroidx/appcompat/widget/Toolbar;

    .line 109
    .line 110
    invoke-virtual {p0, v1}, Lax/n/c;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lax/n/c;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 122
    .line 123
    if-eqz v1, :cond_83

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q:Ljava/lang/String;

    .line 130
    .line 131
    goto :goto_8d

    .line 132
    :cond_83
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q:Ljava/lang/String;

    .line 141
    .line 142
    :goto_8d
    new-instance v1, Lcom/voxdon/xplorer/viewer/g;

    .line 143
    .line 144
    invoke-direct {v1, p0, p0}, Lcom/voxdon/xplorer/viewer/g;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/viewer/g$c;)V

    .line 145
    .line 146
    .line 147
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E1:Lcom/voxdon/xplorer/viewer/g;

    .line 148
    .line 149
    const v1, 0x7f0a038d

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Landroidx/media3/ui/PlayerView;

    .line 157
    .line 158
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 159
    .line 160
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerView;->getVideoSurfaceView()Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    instance-of v1, v1, Landroid/view/SurfaceView;

    .line 165
    .line 166
    if-eqz v1, :cond_bb

    .line 167
    .line 168
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerView;->getVideoSurfaceView()Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Landroid/view/SurfaceView;

    .line 175
    .line 176
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    new-instance v2, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;

    .line 181
    .line 182
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 186
    .line 187
    .line 188
    :cond_bb
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 189
    .line 190
    invoke-virtual {v1, p0}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Landroidx/media3/ui/d$m;)V

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 194
    .line 195
    new-instance v2, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$v;

    .line 196
    .line 197
    const/4 v3, 0x0

    .line 198
    invoke-direct {v2, p0, v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$v;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v2}, Landroidx/media3/ui/PlayerView;->setErrorMessageProvider(Lax/P0/p;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 207
    .line 208
    .line 209
    const v1, 0x7f0a0398

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H:Landroid/view/View;

    .line 217
    .line 218
    const v1, 0x7f0a01a0

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 226
    .line 227
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 228
    .line 229
    const v1, 0x7f0a01a1

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, Landroidx/media3/ui/d;

    .line 237
    .line 238
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 239
    .line 240
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G3()V

    .line 241
    .line 242
    .line 243
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 244
    .line 245
    const/4 v2, 0x0

    .line 246
    invoke-virtual {v1, v2}, Landroidx/media3/ui/PlayerView;->setControllerAnimationEnabled(Z)V

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e:Landroidx/media3/ui/d;

    .line 250
    .line 251
    invoke-virtual {v1, v0}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 252
    .line 253
    .line 254
    const v0, 0x7f0a016e

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Landroid/widget/TextView;

    .line 262
    .line 263
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A:Landroid/widget/TextView;

    .line 264
    .line 265
    const v0, 0x7f0a016c

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->B:Landroid/view/View;

    .line 273
    .line 274
    const v0, 0x7f0a04d6

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Landroid/widget/ImageView;

    .line 282
    .line 283
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C:Landroid/widget/ImageView;

    .line 284
    .line 285
    const v0, 0x7f0a04d5

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Landroid/widget/ProgressBar;

    .line 293
    .line 294
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D:Landroid/widget/ProgressBar;

    .line 295
    .line 296
    const v0, 0x7f0a00ea

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Landroid/widget/TextView;

    .line 304
    .line 305
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E:Landroid/widget/TextView;

    .line 306
    .line 307
    const v0, 0x7f0a00c6

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, Landroid/view/ViewGroup;

    .line 315
    .line 316
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f:Landroid/view/ViewGroup;

    .line 317
    .line 318
    const v0, 0x7f0a0110

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g:Landroid/view/View;

    .line 326
    .line 327
    const v0, 0x7f0a0111

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h:Landroid/view/View;

    .line 335
    .line 336
    const v0, 0x7f0a0112

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i:Landroid/view/View;

    .line 344
    .line 345
    const v0, 0x7f0a0114

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j:Landroid/view/View;

    .line 353
    .line 354
    const v0, 0x7f0a0120

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m:Landroid/view/View;

    .line 362
    .line 363
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 364
    .line 365
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 366
    .line 367
    .line 368
    const v0, 0x7f0a0122

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l:Landroid/view/View;

    .line 376
    .line 377
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 378
    .line 379
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 380
    .line 381
    .line 382
    const v0, 0x7f0a0125

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Landroid/widget/ImageButton;

    .line 390
    .line 391
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k:Landroid/widget/ImageButton;

    .line 392
    .line 393
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    .line 397
    .line 398
    const v0, 0x7f0a0123

    .line 399
    .line 400
    .line 401
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n:Landroid/view/View;

    .line 406
    .line 407
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 408
    .line 409
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    .line 411
    .line 412
    const v0, 0x7f0a0124

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o:Landroid/view/View;

    .line 420
    .line 421
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 422
    .line 423
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 424
    .line 425
    .line 426
    const v0, 0x7f0a0121

    .line 427
    .line 428
    .line 429
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p:Landroid/view/View;

    .line 434
    .line 435
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 436
    .line 437
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 438
    .line 439
    .line 440
    const v0, 0x7f0a012c

    .line 441
    .line 442
    .line 443
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q:Landroid/view/View;

    .line 448
    .line 449
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 450
    .line 451
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    .line 453
    .line 454
    const v0, 0x7f0a0127

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s:Landroid/view/View;

    .line 462
    .line 463
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 464
    .line 465
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 466
    .line 467
    .line 468
    const v0, 0x7f0a0126

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, Landroid/widget/ImageButton;

    .line 476
    .line 477
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r:Landroid/widget/ImageButton;

    .line 478
    .line 479
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 480
    .line 481
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 482
    .line 483
    .line 484
    const v0, 0x7f0a012b

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, Landroid/widget/ImageView;

    .line 492
    .line 493
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t:Landroid/widget/ImageView;

    .line 494
    .line 495
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 496
    .line 497
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 498
    .line 499
    .line 500
    const v0, 0x7f0a0129

    .line 501
    .line 502
    .line 503
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    check-cast v0, Landroidx/appcompat/widget/MySpinner;

    .line 508
    .line 509
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y:Landroidx/appcompat/widget/MySpinner;

    .line 510
    .line 511
    const v1, 0x7f130376

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setPromptId(I)V

    .line 515
    .line 516
    .line 517
    new-instance v0, Lcom/voxdon/xplorer/viewer/d;

    .line 518
    .line 519
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/d;-><init>(Landroid/content/Context;)V

    .line 520
    .line 521
    .line 522
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y:Landroidx/appcompat/widget/MySpinner;

    .line 523
    .line 524
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/u;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 525
    .line 526
    .line 527
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y:Landroidx/appcompat/widget/MySpinner;

    .line 528
    .line 529
    new-instance v2, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$l;

    .line 530
    .line 531
    invoke-direct {v2, p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$l;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lcom/voxdon/xplorer/viewer/d;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 535
    .line 536
    .line 537
    const v0, 0x7f0a011f

    .line 538
    .line 539
    .line 540
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, Landroid/widget/ImageButton;

    .line 545
    .line 546
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u:Landroid/widget/ImageButton;

    .line 547
    .line 548
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 549
    .line 550
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 551
    .line 552
    .line 553
    const v0, 0x7f0a012a

    .line 554
    .line 555
    .line 556
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, Landroid/widget/ImageButton;

    .line 561
    .line 562
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v:Landroid/widget/ImageButton;

    .line 563
    .line 564
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 565
    .line 566
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 567
    .line 568
    .line 569
    const v0, 0x7f0a0128

    .line 570
    .line 571
    .line 572
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    check-cast v0, Landroid/widget/ImageButton;

    .line 577
    .line 578
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x:Landroid/widget/ImageButton;

    .line 579
    .line 580
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P1:Landroid/view/View$OnClickListener;

    .line 581
    .line 582
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 583
    .line 584
    .line 585
    const v0, 0x7f0a01b6

    .line 586
    .line 587
    .line 588
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    check-cast v0, Landroid/widget/ImageButton;

    .line 593
    .line 594
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w:Landroid/widget/ImageButton;

    .line 595
    .line 596
    const v0, 0x7f0a0189

    .line 597
    .line 598
    .line 599
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z:Landroid/view/View;

    .line 604
    .line 605
    const v0, 0x7f0a0052

    .line 606
    .line 607
    .line 608
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, Landroid/view/ViewGroup;

    .line 613
    .line 614
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J:Landroid/view/ViewGroup;

    .line 615
    .line 616
    const v0, 0x7f0a0051

    .line 617
    .line 618
    .line 619
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    check-cast v0, Landroid/view/ViewGroup;

    .line 624
    .line 625
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K:Landroid/view/ViewGroup;

    .line 626
    .line 627
    const v0, 0x7f0a0050

    .line 628
    .line 629
    .line 630
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L:Landroid/view/View;

    .line 635
    .line 636
    const v0, 0x7f0a0053

    .line 637
    .line 638
    .line 639
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M:Landroid/view/View;

    .line 644
    .line 645
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L:Landroid/view/View;

    .line 646
    .line 647
    new-instance v1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$m;

    .line 648
    .line 649
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$m;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 653
    .line 654
    .line 655
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 656
    .line 657
    const v1, 0x7f0a01ba

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    check-cast v0, Landroidx/media3/ui/b;

    .line 665
    .line 666
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S:Landroidx/media3/ui/b;

    .line 667
    .line 668
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L1:Landroidx/media3/ui/G$a;

    .line 669
    .line 670
    invoke-virtual {v0, v1}, Landroidx/media3/ui/b;->a(Landroidx/media3/ui/G$a;)V

    .line 671
    .line 672
    .line 673
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a:Landroid/view/View;

    .line 674
    .line 675
    new-instance v1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$n;

    .line 676
    .line 677
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$n;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 681
    .line 682
    .line 683
    const/16 v0, 0x1e

    .line 684
    .line 685
    invoke-static {p0, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w0:I

    .line 690
    .line 691
    const/16 v0, 0x23

    .line 692
    .line 693
    invoke-static {p0, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x0:I

    .line 698
    .line 699
    invoke-static {}, Lax/t3/a;->b()I

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I0:I

    .line 704
    .line 705
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J2()V

    .line 706
    .line 707
    .line 708
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G2()V

    .line 709
    .line 710
    .line 711
    if-eqz p1, :cond_306

    .line 712
    .line 713
    const-string v0, "track_selector_parameters"

    .line 714
    .line 715
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    if-eqz v0, :cond_2d6

    .line 720
    .line 721
    invoke-static {v0}, Lax/l1/n$e;->Q(Landroid/os/Bundle;)Lax/l1/n$e;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

    .line 726
    .line 727
    :cond_2d6
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

    .line 728
    .line 729
    if-nez v0, :cond_2e0

    .line 730
    .line 731
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j2()Lax/l1/n$e;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

    .line 736
    .line 737
    :cond_2e0
    const-string v0, "auto_play"

    .line 738
    .line 739
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    iput-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m1:Z

    .line 744
    .line 745
    const-string v0, "window"

    .line 746
    .line 747
    const/4 v1, -0x1

    .line 748
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    iput v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1:I

    .line 753
    .line 754
    const-string v0, "position"

    .line 755
    .line 756
    const-wide/16 v1, -0x1

    .line 757
    .line 758
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 759
    .line 760
    .line 761
    move-result-wide v0

    .line 762
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o1:J

    .line 763
    .line 764
    const-string v0, "speed"

    .line 765
    .line 766
    const/high16 v1, 0x3f800000    # 1.0f

    .line 767
    .line 768
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 769
    .line 770
    .line 771
    move-result p1

    .line 772
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 773
    .line 774
    goto :goto_30f

    .line 775
    :cond_306
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j2()Lax/l1/n$e;

    .line 776
    .line 777
    .line 778
    move-result-object p1

    .line 779
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

    .line 780
    .line 781
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g2()V

    .line 782
    .line 783
    .line 784
    :goto_30f
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J1:Lax/i/r;

    .line 789
    .line 790
    invoke-virtual {p1, p0, v0}, Landroidx/activity/OnBackPressedDispatcher;->h(Lax/G0/h;Lax/i/r;)V

    .line 791
    .line 792
    .line 793
    const/16 p1, 0x28

    .line 794
    .line 795
    invoke-static {p0, p1}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 796
    .line 797
    .line 798
    move-result p1

    .line 799
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C1:I

    .line 800
    .line 801
    const/16 p1, 0x34

    .line 802
    .line 803
    invoke-static {p0, p1}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 804
    .line 805
    .line 806
    move-result p1

    .line 807
    iput p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D1:I

    .line 808
    .line 809
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 810
    .line 811
    .line 812
    move-result-object p1

    .line 813
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$o;

    .line 814
    .line 815
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$o;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 816
    .line 817
    .line 818
    const-string v1, "dialog_dismiss_request"

    .line 819
    .line 820
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->m1(Ljava/lang/String;Lax/G0/h;Lax/A0/l;)V

    .line 821
    .line 822
    .line 823
    return-void

    .line 824
    :catch_337
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 825
    .line 826
    .line 827
    move-result-object p1

    .line 828
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 829
    .line 830
    .line 831
    move-result-object p1

    .line 832
    const-string v1, "VIDEO PLAYER BUILD SOURCE"

    .line 833
    .line 834
    invoke-virtual {p1, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 835
    .line 836
    .line 837
    move-result-object p1

    .line 838
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 839
    .line 840
    .line 841
    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 842
    .line 843
    .line 844
    move-result-object p1

    .line 845
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 846
    .line 847
    .line 848
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->finish()V

    .line 849
    .line 850
    .line 851
    return-void
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
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getMenuInflater()Landroid/view/MenuInflater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0f0026

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
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

.method public onDestroy()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w3()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s1:Z

    .line 5
    .line 6
    if-eqz v0, :cond_15

    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1:Lax/c3/K;

    .line 9
    .line 10
    if-eqz v0, :cond_15

    .line 11
    .line 12
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t1:Lax/c3/K;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/voxdon/xplorer/service/b;->l(ZLax/c3/K;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 23
    .line 24
    if-eqz v0, :cond_1c

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e2()V

    .line 27
    .line 28
    .line 29
    :cond_1c
    invoke-super {p0}, Lax/n/c;->onDestroy()V

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
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y3()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w3()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g2()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y4(Landroid/content/Intent;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 4

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x102002c

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p1, v0, :cond_1e

    .line 10
    .line 11
    const v0, 0x7f0a02f0

    .line 12
    .line 13
    .line 14
    if-eq p1, v0, :cond_1a

    .line 15
    .line 16
    const v0, 0x7f0a02f5

    .line 17
    .line 18
    .line 19
    if-eq p1, v0, :cond_16

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_16
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b4()V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y3()V

    .line 28
    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->finish()V

    .line 32
    .line 33
    .line 34
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
.end method

.method public onPause()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/f;->onPause()V

    .line 2
    .line 3
    .line 4
    sget v0, Lax/S0/d0;->a:I

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    if-gt v0, v1, :cond_13

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 11
    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->P()V

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y3()V

    .line 18
    .line 19
    .line 20
    :cond_13
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 21
    .line 22
    if-eqz v0, :cond_1e

    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O:Z

    .line 25
    .line 26
    if-nez v1, :cond_1e

    .line 27
    .line 28
    invoke-static {v0, p0}, Lax/S2/b;->c(Ljava/lang/Object;Landroid/content/Context;)V

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

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .registers 4

    .line 1
    const v0, 0x7f0a02f5

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_d

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 12
    .line 13
    .line 14
    :cond_d
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/f;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    array-length p1, p3

    .line 5
    if-nez p1, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 p1, 0x0

    .line 9
    aget p1, p3, p1

    .line 10
    .line 11
    if-nez p1, :cond_10

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L2()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    const p1, 0x7f130139

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W3(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->finish()V

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
.end method

.method public onResume()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/f;->onResume()V

    .line 2
    .line 3
    .line 4
    sget v0, Lax/S0/d0;->a:I

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    if-le v0, v1, :cond_d

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W:Landroidx/media3/exoplayer/ExoPlayer;

    .line 11
    .line 12
    if-nez v0, :cond_17

    .line 13
    .line 14
    :cond_d
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L2()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->Q()V

    .line 22
    .line 23
    .line 24
    :cond_17
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_22

    .line 27
    .line 28
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O:Z

    .line 29
    .line 30
    if-nez v1, :cond_22

    .line 31
    .line 32
    invoke-static {v0, p0}, Lax/S2/b;->l(Ljava/lang/Object;Landroid/content/Context;)V

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
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 5

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x4()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t4()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0:Lax/l1/n$e;

    .line 11
    .line 12
    if-eqz v0, :cond_16

    .line 13
    .line 14
    const-string v1, "track_selector_parameters"

    .line 15
    .line 16
    invoke-virtual {v0}, Lax/l1/n$e;->J()Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    const-string v0, "auto_play"

    .line 24
    .line 25
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m1:Z

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    const-string v0, "window"

    .line 31
    .line 32
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1:I

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    const-string v0, "position"

    .line 38
    .line 39
    iget-wide v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o1:J

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    const-string v0, "speed"

    .line 45
    .line 46
    iget v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->p0:F

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

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

.method public onStart()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/n/c;->onStart()V

    .line 2
    .line 3
    .line 4
    sget v0, Lax/S0/d0;->a:I

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    if-le v0, v1, :cond_13

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L2()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 14
    .line 15
    if-eqz v0, :cond_13

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->Q()V

    .line 18
    .line 19
    .line 20
    :cond_13
    invoke-static {}, Lax/X2/Q;->N1()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_29

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/high16 v1, -0x45000000    # -0.001953125f

    .line 31
    .line 32
    invoke-static {v0, v1}, Lax/X2/v;->s(Landroid/view/Window;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, v1}, Lax/X2/v;->r(Landroid/view/Window;I)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public onStop()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/n/c;->onStop()V

    .line 2
    .line 3
    .line 4
    sget v0, Lax/S0/d0;->a:I

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    if-le v0, v1, :cond_13

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 11
    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->P()V

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y3()V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method public u4()V
    .registers 3

    .line 1
    invoke-static {p0}, Lax/t3/l;->h(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O3(IZ)V

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

.method public v3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->P()V

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y3()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L2()V

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

.method public z3()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w2()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r3(IZ)V

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
