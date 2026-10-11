.class Landroidx/appcompat/view/menu/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/view/menu/l;


# direct methods
.method constructor <init>(Landroidx/appcompat/view/menu/l;)V
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/l$a;->a:Landroidx/appcompat/view/menu/l;

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
.method public onGlobalLayout()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/l$a;->a:Landroidx/appcompat/view/menu/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/l;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2c

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/view/menu/l$a;->a:Landroidx/appcompat/view/menu/l;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/appcompat/view/menu/l;->i:Lax/u/v;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/u/t;->B()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2c

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/appcompat/view/menu/l$a;->a:Landroidx/appcompat/view/menu/l;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/appcompat/view/menu/l;->n:Landroid/view/View;

    .line 22
    .line 23
    if-eqz v0, :cond_27

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1f

    .line 30
    .line 31
    goto :goto_27

    .line 32
    :cond_1f
    iget-object v0, p0, Landroidx/appcompat/view/menu/l$a;->a:Landroidx/appcompat/view/menu/l;

    .line 33
    .line 34
    iget-object v0, v0, Landroidx/appcompat/view/menu/l;->i:Lax/u/v;

    .line 35
    .line 36
    invoke-virtual {v0}, Lax/u/t;->c()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    :goto_27
    iget-object v0, p0, Landroidx/appcompat/view/menu/l$a;->a:Landroidx/appcompat/view/menu/l;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/l;->dismiss()V

    .line 43
    .line 44
    .line 45
    :cond_2c
    return-void
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
