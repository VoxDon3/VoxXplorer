.class public Lcom/voxdon/xplorer/activity/FileProgressActivity;
.super Lax/R2/c;
.source "SourceFile"

# interfaces
.implements Lax/R2/a;


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Landroid/widget/TextView;

.field private c:Lax/x3/s;

.field private d:Lcom/voxdon/xplorer/service/CommandService;

.field private e:J

.field private f:Z

.field private g:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/R2/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;-><init>(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->g:Landroid/content/ServiceConnection;

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

.method static synthetic F(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Lcom/voxdon/xplorer/service/CommandService;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

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

.method static synthetic H(Lcom/voxdon/xplorer/activity/FileProgressActivity;Lcom/voxdon/xplorer/service/CommandService;)Lcom/voxdon/xplorer/service/CommandService;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

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

.method static synthetic I(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->R()V

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

.method static synthetic J(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Lax/x3/s;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->c:Lax/x3/s;

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

.method static synthetic L(Lcom/voxdon/xplorer/activity/FileProgressActivity;Lax/x3/s;)Lax/x3/s;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->c:Lax/x3/s;

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

.method static synthetic M(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Landroid/widget/ListView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

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

.method static synthetic N(Lcom/voxdon/xplorer/activity/FileProgressActivity;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->T(I)V

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

.method private O()V
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->f:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {p0, v1}, Lcom/voxdon/xplorer/service/CommandService;->j(Landroid/content/Context;Z)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->g:Landroid/content/ServiceConnection;

    .line 10
    .line 11
    invoke-virtual {p0, v1, v2, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

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

.method private R()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/service/CommandService;->G(Lax/R2/a;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0x66

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/s3/u;->a(I)V

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

.method private S()V
    .registers 3

    .line 1
    const v0, 0x7f0a01ee

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/widget/ListView;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 11
    .line 12
    const v0, 0x7f0a01f2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/widget/TextView;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 29
    .line 30
    new-instance v1, Lcom/voxdon/xplorer/activity/FileProgressActivity$b;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity$b;-><init>(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

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

.method private T(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_24

    .line 6
    :cond_5
    if-ltz p1, :cond_24

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/CommandService;->n()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lt p1, v0, :cond_12

    .line 17
    .line 18
    goto :goto_24

    .line 19
    :cond_12
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/CommandService;->n()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lax/W2/j;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, p0, p1, v1}, Lcom/voxdon/xplorer/service/CommandService;->I(Lax/R2/a;Lax/W2/j;Z)V

    .line 35
    .line 36
    .line 37
    :cond_24
    :goto_24
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

.method private W()V
    .registers 8

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const v2, 0x43aa0000    # 340.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v1, 0x11

    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const v1, 0x3f000000    # 0.5f

    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public Q()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->d:Lcom/voxdon/xplorer/service/CommandService;

    .line 9
    .line 10
    if-eqz v0, :cond_13

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/service/CommandService;->H(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->g:Landroid/content/ServiceConnection;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method public U()V
    .registers 2

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/activity/FileProgressActivity$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity$d;-><init>(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

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

.method public V(Lax/W2/j;IZ)V
    .registers 10

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-nez p3, :cond_12

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->e:J

    .line 8
    .line 9
    sub-long v2, v0, v2

    .line 10
    .line 11
    const-wide/16 v4, 0x64

    .line 12
    .line 13
    cmp-long p3, v2, v4

    .line 14
    .line 15
    if-lez p3, :cond_11

    .line 16
    .line 17
    goto :goto_12

    .line 18
    :cond_11
    return-void

    .line 19
    :cond_12
    :goto_12
    iput-wide v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->e:J

    .line 20
    .line 21
    new-instance p3, Lcom/voxdon/xplorer/activity/FileProgressActivity$c;

    .line 22
    .line 23
    invoke-direct {p3, p0, p2, p1}, Lcom/voxdon/xplorer/activity/FileProgressActivity$c;-><init>(Lcom/voxdon/xplorer/activity/FileProgressActivity;ILax/W2/j;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

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

.method public isContentClipToPadding(Z)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public n()Z
    .registers 2

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

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 6

    .line 1
    if-nez p2, :cond_1f

    .line 2
    .line 3
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity;->a:Landroid/widget/ListView;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget p1, p1, Lax/T/b;->d:I

    .line 28
    .line 29
    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

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

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 8

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x7f0d001e

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lax/n/c;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v0, 0x80

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x43aa0000    # 340.0f

    mul-float v2, v3, v2

    float-to-int v4, v2

    invoke-virtual {v1, v4, v4}, Landroid/view/Window;->setLayout(II)V

    const v4, 0x11

    invoke-virtual {v1, v4}, Landroid/view/Window;->setGravity(I)V

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v2, -0xf60000

    or-int/lit16 v2, v2, 0xf14

    invoke-direct {p1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, p1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->S()V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Lax/R2/c;->onSetContentView(Z)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->O()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->W()V

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
.end method

.method protected onDestroy()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->Q()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lax/n/c;->onDestroy()V

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

.method protected onResume()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/f;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->R()V

    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->W()V

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

.method public s()Lax/n/c;
    .registers 1

    .line 1
    return-object p0
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
