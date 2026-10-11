.class Lax/n/H$a;
.super Lax/c0/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/n/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/n/H;


# direct methods
.method constructor <init>(Lax/n/H;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/c0/p0;-><init>()V

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
.method public b(Landroid/view/View;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 2
    .line 3
    iget-boolean v0, p1, Lax/n/H;->t:Z

    .line 4
    .line 5
    if-eqz v0, :cond_15

    .line 6
    .line 7
    iget-object p1, p1, Lax/n/H;->h:Landroid/view/View;

    .line 8
    .line 9
    if-eqz p1, :cond_15

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 16
    .line 17
    iget-object p1, p1, Lax/n/H;->e:Landroidx/appcompat/widget/ActionBarContainer;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 20
    .line 21
    .line 22
    :cond_15
    iget-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 23
    .line 24
    iget-object p1, p1, Lax/n/H;->e:Landroidx/appcompat/widget/ActionBarContainer;

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 32
    .line 33
    iget-object p1, p1, Lax/n/H;->e:Landroidx/appcompat/widget/ActionBarContainer;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p1, Lax/n/H;->y:Lax/s/e;

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/n/H;->N()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lax/n/H$a;->a:Lax/n/H;

    .line 48
    .line 49
    iget-object p1, p1, Lax/n/H;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 50
    .line 51
    if-eqz p1, :cond_37

    .line 52
    .line 53
    invoke-static {p1}, Lax/c0/d0;->i0(Landroid/view/View;)V

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
