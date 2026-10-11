.class public Lcom/voxdon/xplorer/oss/OssLicenseActivity;
.super Lax/R2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/oss/OssLicenseActivity$c;,
        Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/R2/c;-><init>()V

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

.method static synthetic F(Lcom/voxdon/xplorer/oss/OssLicenseActivity;Lax/k3/a;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/oss/OssLicenseActivity;->I(Lax/k3/a;)V

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

.method private H()V
    .registers 3

    .line 1
    const v0, 0x7f0a0294

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
    iput-object v0, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity;->a:Landroid/widget/ListView;

    .line 11
    .line 12
    new-instance v1, Lcom/voxdon/xplorer/oss/OssLicenseActivity$a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/oss/OssLicenseActivity$a;-><init>(Lcom/voxdon/xplorer/oss/OssLicenseActivity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/voxdon/xplorer/oss/OssLicenseActivity$c;

    .line 21
    .line 22
    invoke-static {}, Lax/Q2/h;->a()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, p0, v1}, Lcom/voxdon/xplorer/oss/OssLicenseActivity$c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity;->a:Landroid/widget/ListView;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

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

.method private I(Lax/k3/a;)V
    .registers 5

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;->j3(Lax/k3/a;)Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "OSS"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v0, p1, v1, v2}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V

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


# virtual methods
.method public isContentClipToPadding(Z)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 4

    .line 1
    if-nez p2, :cond_f

    .line 2
    .line 3
    iget-object p2, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity;->a:Landroid/widget/ListView;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity;->a:Landroid/widget/ListView;

    .line 10
    .line 11
    iget p1, p1, Lax/T/b;->d:I

    .line 12
    .line 13
    invoke-virtual {p2, v0, v0, v0, p1}, Landroid/view/View;->setPadding(IIII)V

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

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x7f0d0021

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lax/n/c;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    const p1, 0x7f130353

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/voxdon/xplorer/oss/OssLicenseActivity;->H()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lax/R2/c;->onSetContentView(Z)V

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
.end method
