.class Lax/a3/h$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/h;->J1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/a3/h;


# direct methods
.method constructor <init>(Lax/a3/h;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/h$a;->c:Lax/a3/h;

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
    .registers 3

    .line 1
    iget-object p1, p0, Lax/a3/h$a;->c:Lax/a3/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of p1, p1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 8
    .line 9
    if-eqz p1, :cond_37

    .line 10
    .line 11
    iget-object p1, p0, Lax/a3/h$a;->c:Lax/a3/h;

    .line 12
    .line 13
    invoke-static {p1}, Lax/a3/h;->d3(Lax/a3/h;)Lax/a3/h$e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_27

    .line 18
    .line 19
    iget-object p1, p0, Lax/a3/h$a;->c:Lax/a3/h;

    .line 20
    .line 21
    invoke-static {p1}, Lax/a3/h;->d3(Lax/a3/h;)Lax/a3/h$e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lax/u3/q;->isCancelled()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_27

    .line 30
    .line 31
    iget-object p1, p0, Lax/a3/h$a;->c:Lax/a3/h;

    .line 32
    .line 33
    invoke-static {p1}, Lax/a3/h;->d3(Lax/a3/h;)Lax/a3/h$e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lax/u3/q;->e()Z

    .line 38
    .line 39
    .line 40
    :cond_27
    iget-object p1, p0, Lax/a3/h$a;->c:Lax/a3/h;

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
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->w1()Lax/a3/h$c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-interface {p1, v0}, Lax/a3/h$c;->a(Lax/a3/h$d;)V

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
