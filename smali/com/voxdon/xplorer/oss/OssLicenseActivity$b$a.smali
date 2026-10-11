.class Lcom/voxdon/xplorer/oss/OssLicenseActivity$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;->g3()Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b$a;->a:Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b$a;->a:Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    goto :goto_34

    .line 10
    :cond_9
    :try_start_9
    new-instance p1, Landroid/content/Intent;

    .line 11
    .line 12
    const-string v0, "android.intent.action.VIEW"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b$a;->a:Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;->i3(Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b$a;->a:Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;

    .line 31
    .line 32
    invoke-static {v0, p1}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_22
    .catch Landroid/content/ActivityNotFoundException; {:try_start_9 .. :try_end_22} :catch_23
    .catch Ljava/lang/SecurityException; {:try_start_9 .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_23
    iget-object p1, p0, Lcom/voxdon/xplorer/oss/OssLicenseActivity$b$a;->a:Lcom/voxdon/xplorer/oss/OssLicenseActivity$b;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const v0, 0x7f130137

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    .line 53
    :goto_34
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
