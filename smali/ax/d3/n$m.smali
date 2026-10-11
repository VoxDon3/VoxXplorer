.class Lax/d3/n$m;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/n;->z4(Ljava/lang/CharSequence;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/d3/n;


# direct methods
.method constructor <init>(Lax/d3/n;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/n$m;->c:Lax/d3/n;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "menu_folder"

    .line 6
    .line 7
    const-string v1, "open_recycle_bin"

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "by"

    .line 14
    .line 15
    const-string v1, "command_result_snackbar"

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lax/d3/n$m;->c:Lax/d3/n;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/d3/n;->z3()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "loc"

    .line 32
    .line 33
    invoke-virtual {p1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lax/d3/n$m;->c:Lax/d3/n;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 47
    .line 48
    iget-object v0, p0, Lax/d3/n$m;->c:Lax/d3/n;

    .line 49
    .line 50
    invoke-virtual {v0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->H2(Lax/c3/K;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method
