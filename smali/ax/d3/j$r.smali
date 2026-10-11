.class Lax/d3/j$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c0/A$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/j;->q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/Menu;

.field final synthetic b:Lax/d3/j;


# direct methods
.method constructor <init>(Lax/d3/j;Landroid/view/Menu;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/j$r;->a:Landroid/view/Menu;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/widget/TextView;->clearComposingText()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 11
    .line 12
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, ""

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 22
    .line 23
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v0}, Lax/d3/j;->Y4(Lax/d3/j;Z)Z

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 37
    .line 38
    invoke-static {p1, v0}, Lax/d3/j;->U4(Lax/d3/j;Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 42
    .line 43
    invoke-static {p1}, Lax/d3/j;->Z4(Lax/d3/j;)Landroid/os/Handler;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lax/d3/j$r$a;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Lax/d3/j$r$a;-><init>(Lax/d3/j$r;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "menu_app"

    .line 6
    .line 7
    const-string v1, "search"

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "loc"

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 33
    .line 34
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-static {p1, v0}, Lax/d3/j;->U4(Lax/d3/j;Z)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 48
    .line 49
    iget-object v1, p0, Lax/d3/j$r;->a:Landroid/view/Menu;

    .line 50
    .line 51
    invoke-static {p1, v1, v0}, Lax/d3/j;->X4(Lax/d3/j;Landroid/view/Menu;Z)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lax/d3/j$r;->b:Lax/d3/j;

    .line 55
    .line 56
    invoke-static {p1, v0}, Lax/d3/j;->Y4(Lax/d3/j;Z)Z

    .line 57
    .line 58
    .line 59
    return v0
    .line 60
    .line 61
.end method
