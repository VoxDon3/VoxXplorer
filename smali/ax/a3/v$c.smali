.class Lax/a3/v$c;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/v;->U3(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/view/View;

.field final synthetic d:Lax/a3/v;


# direct methods
.method constructor <init>(Lax/a3/v;Landroid/view/View;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/a3/v$c;->d:Lax/a3/v;

    .line 2
    .line 3
    iput-object p2, p0, Lax/a3/v$c;->c:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lax/a3/v$c;->d:Lax/a3/v;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->s0()Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object p1, p0, Lax/a3/v$c;->d:Lax/a3/v;

    .line 11
    .line 12
    invoke-static {p1}, Lax/a3/v;->h3(Lax/a3/v;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_13

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
    invoke-static {p1}, Lax/a3/f;->G3(Z)Lax/a3/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lax/a3/v$c$a;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lax/a3/v$c$a;-><init>(Lax/a3/v$c;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lax/a3/f;->P3(Lax/a3/f$j;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lax/a3/v$c;->d:Lax/a3/v;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->s0()Landroidx/fragment/app/FragmentManager;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "choose_key"

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

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
