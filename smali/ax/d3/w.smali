.class public Lax/d3/w;
.super Lax/d3/x;
.source "SourceFile"

# interfaces
.implements Lax/J0/a$a;
.implements Lax/g3/g;
.implements Lax/P/b$f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/d3/x;",
        "Lax/J0/a$a<",
        "Ljava/lang/Void;",
        ">;",
        "Lax/g3/g;",
        "Lax/P/b$f;"
    }
.end annotation


# static fields
.field private static final a1:Ljava/util/logging/Logger;


# instance fields
.field private P0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field private Q0:Landroid/widget/GridView;

.field private R0:Lax/x3/m;

.field private S0:Lax/Z2/d;

.field private T0:Lcom/voxdon/xplorer/file/w;

.field private U0:Lcom/voxdon/xplorer/widget/RefreshProgressBar;

.field private V0:Z

.field private W0:Landroid/content/BroadcastReceiver;

.field private X0:Z

.field private Y0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private Z0:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/d3/w;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/d3/w;->a1:Ljava/util/logging/Logger;

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
    invoke-direct {p0}, Lax/d3/x;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/d3/w;->Y0:Ljava/util/Set;

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

.method static synthetic A5(Lax/d3/w;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/d3/w;->Z0:J

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

.method static synthetic B5(Lax/d3/w;Ljava/util/ArrayList;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/w;->M5(Ljava/util/ArrayList;)V

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

.method static synthetic C5(Lax/d3/w;)Lax/x3/m;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/w;->R0:Lax/x3/m;

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

.method static synthetic D5(Lax/d3/w;)Lcom/voxdon/xplorer/widget/RefreshProgressBar;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/w;->U0:Lcom/voxdon/xplorer/widget/RefreshProgressBar;

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

.method static synthetic E5(Lax/d3/w;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/w;->P0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

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

.method static synthetic F5(Lax/d3/w;)Lax/Z2/d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/w;->S0:Lax/Z2/d;

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

.method static synthetic G5(Lax/d3/w;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/w;->V0:Z

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

.method static synthetic H5(Lax/d3/w;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/w;->P5(I)V

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

.method static synthetic I5(Lax/d3/w;)Ljava/util/Set;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/w;->Y0:Ljava/util/Set;

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

.method private L5()V
    .registers 3

    .line 1
    invoke-static {}, Lax/t3/k;->k()I

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G0()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v1, 0x7f0700a6

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setColumnWidth(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 28
    .line 29
    invoke-virtual {v0}, Lax/x3/m;->c()V

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

.method private M5(Ljava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    goto :goto_9

    .line 4
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    :goto_9
    return-void

    .line 11
    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :cond_f
    :goto_f
    if-ge v1, v0, :cond_38

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2}, Lax/c3/K;->h(Ljava/lang/String;)Lax/c3/K;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_f

    .line 31
    .line 32
    iget-object v3, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lax/Z2/d;->w(Lax/c3/K;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Lax/Z2/d;->j(Lax/c3/K;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-ltz v2, :cond_f

    .line 44
    .line 45
    iget-object v3, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Lax/Z2/d;->z(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_f

    .line 52
    .line 53
    invoke-direct {p0, v2}, Lax/d3/w;->P5(I)V

    .line 54
    .line 55
    .line 56
    goto :goto_f

    .line 57
    :cond_38
    invoke-virtual {p0}, Lax/d3/w;->J5()V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method

.method private N5()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/w;->L5()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 5
    .line 6
    iget-object v1, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

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

.method private O5(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/w;->U0:Lcom/voxdon/xplorer/widget/RefreshProgressBar;

    .line 2
    .line 3
    new-instance v1, Lax/d3/w$e;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lax/d3/w$e;-><init>(Lax/d3/w;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    if-nez p1, :cond_1e

    .line 12
    .line 13
    iget-object p1, p0, Lax/d3/w;->P0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->m()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1e

    .line 20
    .line 21
    iget-object p1, p0, Lax/d3/w;->P0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 22
    .line 23
    new-instance v0, Lax/d3/w$f;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lax/d3/w$f;-><init>(Lax/d3/w;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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

.method private P5(I)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w0()Lax/J0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/J0/a;->d(I)Lax/K0/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_13

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w0()Lax/J0/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1, v1, p0}, Lax/J0/a;->e(ILandroid/os/Bundle;Lax/J0/a$a;)Lax/K0/c;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w0()Lax/J0/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1, v1, p0}, Lax/J0/a;->g(ILandroid/os/Bundle;Lax/J0/a$a;)Lax/K0/c;

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
.end method

.method static synthetic x5(Lax/d3/w;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/w;->O5(Z)V

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

.method static synthetic y5(Lax/d3/w;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/w;->L5()V

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

.method static synthetic z5(Lax/d3/w;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/d3/w;->Z0:J

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


# virtual methods
.method public B1(Landroid/view/MenuItem;)Z
    .registers 7

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a02c6

    .line 6
    .line 7
    .line 8
    const-string v2, "menu_desktop"

    .line 9
    .line 10
    const-string v3, "desktop_menu"

    .line 11
    .line 12
    if-eq v0, v1, :cond_58

    .line 13
    .line 14
    const v1, 0x7f0a02df

    .line 15
    .line 16
    .line 17
    const-string v4, "from"

    .line 18
    .line 19
    if-eq v0, v1, :cond_38

    .line 20
    .line 21
    const v1, 0x7f0a02e5

    .line 22
    .line 23
    .line 24
    if-eq v0, v1, :cond_1a

    .line 25
    .line 26
    goto :goto_70

    .line 27
    :cond_1a
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "rewarded_ad"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v4, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_70

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    const-string v1, "toolbar"

    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->C4(ZLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_70

    .line 57
    :cond_38
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "go_premium"

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, v4, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/content/Intent;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-class v2, Lcom/voxdon/xplorer/activity/PaymentActivity;

    .line 81
    .line 82
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->F2(Landroid/content/Intent;)V

    .line 86
    .line 87
    .line 88
    goto :goto_70

    .line 89
    :cond_58
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "analyze"

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "by"

    .line 100
    .line 101
    invoke-virtual {v0, v1, v3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 106
    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {p0, v0, v1, v3}, Lax/d3/x;->s5(Lax/c3/K;ZLjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_70
    :goto_70
    invoke-super {p0, p1}, Lax/d3/n;->B1(Landroid/view/MenuItem;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    return p1
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

.method public H1()V
    .registers 1

    .line 1
    invoke-super {p0}, Lax/d3/n;->H1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/w;->L5()V

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

.method public J(Ljava/lang/String;)V
    .registers 13

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_37

    .line 6
    .line 7
    iget-object p1, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 8
    .line 9
    if-eqz p1, :cond_37

    .line 10
    .line 11
    iget-object p1, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 12
    .line 13
    if-eqz p1, :cond_37

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lax/Q2/f;->V0:Lax/Q2/f;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {p1, v0, v2, v1, v2}, Lax/t3/e;->h(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v3, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 28
    .line 29
    invoke-static {v0, v2}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Lax/U2/d;->G(Z)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const-wide/16 v6, 0x0

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-virtual/range {v3 .. v10}, Lax/Z2/d;->x(Lax/c3/K;IJFLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lax/d3/w;->J5()V

    .line 54
    .line 55
    .line 56
    :cond_37
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected J5()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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

.method public K5(Lax/K0/c;Ljava/lang/Void;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/K0/c<",
            "Ljava/lang/Void;",
            ">;",
            "Ljava/lang/Void;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lax/d3/w;->Y0:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/K0/c;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lax/d3/w;->Y0:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p2, :cond_35

    .line 22
    .line 23
    iget-boolean p2, p0, Lax/d3/w;->V0:Z

    .line 24
    .line 25
    if-nez p2, :cond_35

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lax/d3/x;->j5(Z)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v0}, Lax/d3/w;->O5(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_2d

    .line 38
    .line 39
    invoke-virtual {p0}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2}, Lax/u3/z;->c(Lax/n/c;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    iget-object p2, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 47
    .line 48
    invoke-virtual {p2}, Lax/x3/m;->d()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lax/d3/x;->a5()V

    .line 52
    .line 53
    .line 54
    :cond_35
    check-cast p1, Lax/d3/x$n;

    .line 55
    .line 56
    iget-object v1, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 57
    .line 58
    invoke-virtual {p1}, Lax/d3/x$n;->R()Lax/c3/K;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p1}, Lax/d3/x$n;->N()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p1}, Lax/d3/x$n;->T()J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    invoke-virtual {p1}, Lax/d3/x$n;->V()F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {p1}, Lax/d3/x$n;->P()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {p1}, Lax/d3/x$n;->S()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual/range {v1 .. v8}, Lax/Z2/d;->x(Lax/c3/K;IJFLjava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lax/d3/w;->J5()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lax/d3/x$n;->Q()Lax/Q2/f;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    sget-object v1, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 93
    .line 94
    if-eq p2, v1, :cond_67

    .line 95
    .line 96
    invoke-virtual {p1}, Lax/d3/x$n;->Q()Lax/Q2/f;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    sget-object v2, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 101
    .line 102
    if-ne p2, v2, :cond_9b

    .line 103
    .line 104
    :cond_67
    invoke-virtual {p1}, Lax/d3/x$n;->W()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_9b

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_f7

    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-nez p2, :cond_f7

    .line 121
    .line 122
    invoke-virtual {p1}, Lax/d3/x$n;->Q()Lax/Q2/f;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    sget-object v0, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 127
    .line 128
    if-ne p2, v0, :cond_86

    .line 129
    .line 130
    iget-boolean p2, p0, Lax/d3/w;->X0:Z

    .line 131
    .line 132
    if-eqz p2, :cond_86

    .line 133
    .line 134
    return-void

    .line 135
    :cond_86
    invoke-virtual {p1}, Lax/d3/x$n;->Q()Lax/Q2/f;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-ne p2, v1, :cond_8f

    .line 140
    .line 141
    const/4 p2, 0x1

    .line 142
    iput-boolean p2, p0, Lax/d3/w;->X0:Z

    .line 143
    .line 144
    :cond_8f
    invoke-virtual {p1}, Lax/d3/x$n;->R()Lax/c3/K;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p1}, Lax/d3/x$n;->V()F

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-virtual {p0, p2, p1}, Lax/d3/x;->k5(Lax/c3/K;F)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_9b
    invoke-virtual {p1}, Lax/d3/x$n;->Q()Lax/Q2/f;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    sget-object v1, Lax/Q2/f;->p1:Lax/Q2/f;

    .line 161
    .line 162
    if-ne p2, v1, :cond_f7

    .line 163
    .line 164
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_f7

    .line 169
    .line 170
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-nez p2, :cond_f7

    .line 175
    .line 176
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {p2}, Lax/Z2/j;->p0()Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2}, Lax/Z2/j;->Q()J

    .line 189
    .line 190
    .line 191
    move-result-wide v2

    .line 192
    invoke-virtual {p1}, Lax/d3/x$n;->T()J

    .line 193
    .line 194
    .line 195
    move-result-wide v4

    .line 196
    invoke-virtual {p1}, Lax/d3/x$n;->O()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    invoke-static {v4, v5, v6, v7}, Lax/Q2/e;->L(JJ)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_d5

    .line 205
    .line 206
    invoke-virtual {p1}, Lax/d3/x$n;->T()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    invoke-virtual {p0, v2, v3}, Lax/d3/x;->p5(J)V

    .line 211
    .line 212
    .line 213
    goto :goto_de

    .line 214
    :cond_d5
    invoke-static {v2, v3}, Lax/Q2/e;->M(J)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-eqz p1, :cond_de

    .line 219
    .line 220
    invoke-virtual {p0, v2, v3}, Lax/d3/x;->o5(J)V

    .line 221
    .line 222
    .line 223
    :cond_de
    :goto_de
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p1}, Lax/Z2/j;->p0()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    iget-object v2, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 232
    .line 233
    invoke-static {v1, v0}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v2, v0}, Lax/x3/m;->b(Lax/c3/K;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-ne p2, p1, :cond_f4

    .line 242
    .line 243
    if-ne v0, p1, :cond_f7

    .line 244
    .line 245
    :cond_f4
    invoke-direct {p0}, Lax/d3/w;->L5()V

    .line 246
    .line 247
    .line 248
    :cond_f7
    return-void
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

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/x;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lax/Z2/d;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p2, v0}, Lax/Z2/d;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 14
    .line 15
    const p2, 0x7f0a03a0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, Lcom/voxdon/xplorer/widget/RefreshProgressBar;

    .line 23
    .line 24
    iput-object p2, p0, Lax/d3/w;->U0:Lcom/voxdon/xplorer/widget/RefreshProgressBar;

    .line 25
    .line 26
    const p2, 0x7f0a0233

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 34
    .line 35
    iput-object p2, p0, Lax/d3/w;->P0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 36
    .line 37
    new-instance v0, Lax/x3/g;

    .line 38
    .line 39
    invoke-direct {v0}, Lax/x3/g;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnChildScrollUpCallback(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$i;)V

    .line 43
    .line 44
    .line 45
    const p2, 0x7f0a022e

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Landroid/widget/GridView;

    .line 53
    .line 54
    iput-object p1, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 55
    .line 56
    new-instance p1, Lax/x3/m;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget-object v0, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 63
    .line 64
    invoke-direct {p1, p2, v0}, Lax/x3/m;-><init>(Landroid/content/Context;Lax/Z2/d;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lax/d3/w;->R0:Lax/x3/m;

    .line 68
    .line 69
    iget-object p1, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 70
    .line 71
    new-instance p2, Lax/d3/w$b;

    .line 72
    .line 73
    invoke-direct {p2, p0}, Lax/d3/w$b;-><init>(Lax/d3/w;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 80
    .line 81
    new-instance p2, Lax/d3/w$c;

    .line 82
    .line 83
    invoke-direct {p2, p0}, Lax/d3/w$c;-><init>(Lax/d3/w;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0}, Lax/d3/w;->N5()V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lax/d3/w;->P0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 93
    .line 94
    new-instance p2, Lax/d3/w$d;

    .line 95
    .line 96
    invoke-direct {p2, p0}, Lax/d3/w$d;-><init>(Lax/d3/w;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x1

    .line 103
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->x2(Z)V

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lax/t3/k;->v()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_77

    .line 111
    .line 112
    invoke-virtual {p0}, Lax/d3/n;->B3()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_76

    .line 117
    .line 118
    goto :goto_77

    .line 119
    :cond_76
    return-void

    .line 120
    :cond_77
    :goto_77
    invoke-virtual {p0}, Lax/d3/x;->l5()V

    .line 121
    .line 122
    .line 123
    return-void
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

.method public c4(Z)V
    .registers 6

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/Z2/j;->K0()V

    .line 8
    .line 9
    .line 10
    :cond_9
    iget-object v0, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/Z2/d;->u()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lax/d3/w;->J5()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lax/c3/K;->c()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_31

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lax/c3/K;

    .line 37
    .line 38
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, v1, v3}, Lax/Z2/b;->s(Lax/c3/K;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_19

    .line 50
    :cond_31
    sget-object v0, Lax/Q2/f;->F0:Lax/Q2/f;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-static {v0, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v0, v2}, Lax/Z2/b;->s(Lax/c3/K;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_5d

    .line 73
    .line 74
    if-eqz p1, :cond_5d

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Lcom/voxdon/xplorer/file/w;->W(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lax/U2/d;->Z()V

    .line 92
    .line 93
    .line 94
    :cond_5d
    const/4 p1, 0x1

    .line 95
    invoke-virtual {p0, p1}, Lax/d3/w;->g5(Z)V

    .line 96
    .line 97
    .line 98
    return-void
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

.method protected g5(Z)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/d3/w;->X0:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    goto :goto_54

    .line 11
    :cond_a
    iget-object v1, p0, Lax/d3/w;->Y0:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v1}, Lax/d3/x;->j5(Z)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lax/d3/w;->O5(Z)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/Z2/d;->h()V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/Z2/d;->m()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_22
    if-ge v2, p1, :cond_32

    .line 36
    .line 37
    iget-object v3, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Lax/Z2/d;->z(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2f

    .line 44
    .line 45
    invoke-direct {p0, v2}, Lax/d3/w;->P5(I)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_22

    .line 51
    :cond_32
    iget-object p1, p0, Lax/d3/w;->T0:Lcom/voxdon/xplorer/file/w;

    .line 52
    .line 53
    if-eqz p1, :cond_3f

    .line 54
    .line 55
    invoke-virtual {p1}, Lax/u3/q;->m()Lax/u3/q$f;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v2, Lax/u3/q$f;->d0:Lax/u3/q$f;

    .line 60
    .line 61
    if-eq p1, v2, :cond_3f

    .line 62
    .line 63
    goto :goto_54

    .line 64
    :cond_3f
    iput-boolean v1, p0, Lax/d3/w;->V0:Z

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v1, Lax/d3/w$g;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lax/d3/w$g;-><init>(Lax/d3/w;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/w;->C(Landroid/content/Context;Lcom/voxdon/xplorer/file/w$d;)Lcom/voxdon/xplorer/file/w;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lax/d3/w;->T0:Lcom/voxdon/xplorer/file/w;

    .line 80
    .line 81
    if-nez p1, :cond_54

    .line 82
    .line 83
    iput-boolean v0, p0, Lax/d3/w;->V0:Z

    .line 84
    .line 85
    :cond_54
    :goto_54
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
.end method

.method public h1(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/x;->h1(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lax/d3/w;->g5(Z)V

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

.method public j1(Landroid/app/Activity;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/d3/x;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lax/d3/w$a;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lax/d3/w$a;-><init>(Lax/d3/w;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/d3/w;->W0:Landroid/content/BroadcastReceiver;

    .line 10
    .line 11
    new-instance p1, Landroid/content/IntentFilter;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v0, "local.intent.action.LOCAL_STORAGE_STATUS_CHANGED"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "local.intent.action.USB_DETECTING_STARTED"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "local.intent.action.USB_DETECTING_ENDED"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "local.intent.action.LICENSE_STATUS_CHANGED"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "local.intent.action.FILE_SIZE_UNIT_CHANGED"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lax/d3/w;->W0:Landroid/content/BroadcastReceiver;

    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, Lax/u3/g;->c(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, p0}, Lax/Q2/b;->e(Lax/g3/g;)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public j3()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_7} :catch_7

    .line 6
    .line 7
    .line 8
    :catch_7
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
    iget-object p2, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lax/d3/w;->Q0:Landroid/widget/GridView;

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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/n;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/w;->N5()V

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

.method public p(Lax/K0/c;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/K0/c<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

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

.method public q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 7

    .line 1
    const v0, 0x7f0f0018

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lax/d3/n;->G3(Landroid/view/MenuInflater;Landroid/view/Menu;I)V

    .line 5
    .line 6
    .line 7
    const p2, 0x7f0a02c6

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v0, 0x1

    .line 15
    if-eqz p2, :cond_1d

    .line 16
    .line 17
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lax/t3/c;->f()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v1, v0, :cond_1d

    .line 26
    .line 27
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    const p2, 0x7f0a02df

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_2f

    .line 38
    .line 39
    invoke-static {}, Lax/t3/g;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2f

    .line 44
    .line 45
    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 46
    .line 47
    .line 48
    :cond_2f
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lax/t3/c;->B()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const v2, 0x7f0a02e5

    .line 57
    .line 58
    .line 59
    if-eqz v1, :cond_59

    .line 60
    .line 61
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lax/t3/c;->C()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_59

    .line 70
    .line 71
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_95

    .line 76
    .line 77
    invoke-static {}, Lax/t3/g;->c()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_95

    .line 82
    .line 83
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_59
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/4 v1, 0x2

    .line 95
    if-eqz p2, :cond_73

    .line 96
    .line 97
    invoke-static {}, Lax/t3/g;->c()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_73

    .line 102
    .line 103
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Lax/t3/c;->r()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ne v3, v1, :cond_73

    .line 112
    .line 113
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 114
    .line 115
    .line 116
    :cond_73
    invoke-virtual {p0}, Lax/d3/n;->Q3()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_95

    .line 121
    .line 122
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p2}, Lax/t3/c;->p()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-ne p2, v1, :cond_95

    .line 131
    .line 132
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_95

    .line 137
    .line 138
    invoke-static {}, Lax/t3/g;->c()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-nez p2, :cond_95

    .line 143
    .line 144
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 145
    .line 146
    .line 147
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 148
    .line 149
    .line 150
    :cond_95
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

.method public r1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    .line 1
    const p2, 0x7f0d0097

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

.method public bridge synthetic v(Lax/K0/c;Ljava/lang/Object;)V
    .registers 3

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/d3/w;->K5(Lax/K0/c;Ljava/lang/Void;)V

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

.method public v1()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/d3/x;->v1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/w;->W0:Landroid/content/BroadcastReceiver;

    .line 5
    .line 6
    if-eqz v0, :cond_13

    .line 7
    .line 8
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lax/d3/w;->W0:Landroid/content/BroadcastReceiver;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lax/d3/w;->W0:Landroid/content/BroadcastReceiver;

    .line 19
    .line 20
    :cond_13
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p0}, Lax/Q2/b;->r(Lax/g3/g;)V

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

.method public w(ILandroid/os/Bundle;)Lax/K0/c;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Lax/K0/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 p2, 0x2710

    .line 2
    .line 3
    if-ne p1, p2, :cond_19

    .line 4
    .line 5
    new-instance p1, Lax/d3/x$n;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object v0, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 12
    .line 13
    sget-object v1, Lax/Q2/f;->F0:Lax/Q2/f;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v2}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lax/d3/w;->Y0:Ljava/util/Set;

    .line 21
    .line 22
    invoke-direct {p1, p2, v0, v1, v2}, Lax/d3/x$n;-><init>(Landroid/content/Context;Lax/Z2/d;Lax/c3/K;Ljava/util/Set;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_19
    new-instance p2, Lax/d3/x$n;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lax/d3/w;->S0:Lax/Z2/d;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lax/Z2/d;->o(I)Lax/c3/K;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v2, p0, Lax/d3/w;->Y0:Ljava/util/Set;

    .line 39
    .line 40
    invoke-direct {p2, v0, v1, p1, v2}, Lax/d3/x$n;-><init>(Landroid/content/Context;Lax/Z2/d;Lax/c3/K;Ljava/util/Set;)V

    .line 41
    .line 42
    .line 43
    return-object p2
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

.method public x1(Z)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/x;->x1(Z)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_8

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/d3/x;->e5()V

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
