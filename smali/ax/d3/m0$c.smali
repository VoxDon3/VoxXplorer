.class Lax/d3/m0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/preference/Preference$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/m0;->T2(Landroid/os/Bundle;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/m0;


# direct methods
.method constructor <init>(Lax/d3/m0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/m0$c;->a:Lax/d3/m0;

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
.method public a(Landroidx/preference/Preference;)Z
    .registers 4

    .line 1
    iget-object p1, p0, Lax/d3/m0$c;->a:Lax/d3/m0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_2f

    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/m0$c;->a:Lax/d3/m0;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->s0()Landroidx/fragment/app/FragmentManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_11

    .line 16
    .line 17
    goto :goto_2f

    .line 18
    :cond_11
    const/4 p1, 0x1

    .line 19
    :try_start_12
    const-string v0, "https://www.voxdon.com/vox-xplorer-privacy-policy"

    .line 20
    .line 21
    invoke-static {v0}, Lax/u3/B;->C(Ljava/lang/String;)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lax/d3/m0$c;->a:Lax/d3/m0;

    .line 26
    .line 27
    invoke-static {v1, v0}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_1d
    .catch Landroid/content/ActivityNotFoundException; {:try_start_12 .. :try_end_1d} :catch_1e
    .catch Ljava/lang/SecurityException; {:try_start_12 .. :try_end_1d} :catch_1e

    .line 28
    .line 29
    .line 30
    goto :goto_2e

    .line 31
    :catch_1e
    iget-object v0, p0, Lax/d3/m0$c;->a:Lax/d3/m0;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const v1, 0x7f130137

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 45
    .line 46
    .line 47
    :goto_2e
    return p1

    .line 48
    :cond_2f
    :goto_2f
    const/4 p1, 0x0

    .line 49
    return p1
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
