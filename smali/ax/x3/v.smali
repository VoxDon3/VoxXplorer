.class public Lax/x3/v;
.super Landroidx/appcompat/view/menu/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

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


# virtual methods
.method public g0(Ljava/lang/CharSequence;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->Z(Ljava/lang/CharSequence;)Landroidx/appcompat/view/menu/e;

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

.method public h0(Landroid/view/View;II)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->u()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    new-instance v1, Landroidx/appcompat/view/menu/i;

    .line 6
    .line 7
    invoke-direct {v1, v0, p0}, Landroidx/appcompat/view/menu/i;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Landroidx/appcompat/view/menu/i;->f(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2, p3}, Landroidx/appcompat/view/menu/i;->l(II)V
    :try_end_f
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_f} :catch_10

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_10
    :try_start_10
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->clearHeader()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Landroidx/appcompat/view/menu/i;

    .line 21
    .line 22
    invoke-direct {v1, v0, p0}, Landroidx/appcompat/view/menu/i;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroidx/appcompat/view/menu/i;->f(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2, p3}, Landroidx/appcompat/view/menu/i;->l(II)V
    :try_end_1e
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_1e} :catch_1f

    .line 29
    .line 30
    .line 31
    goto :goto_40

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string p3, "MENU_POPUP_HELPER"

    .line 42
    .line 43
    invoke-virtual {p2, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 52
    .line 53
    .line 54
    const p1, 0x7f130137

    .line 55
    .line 56
    .line 57
    const/4 p2, 0x1

    .line 58
    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 63
    .line 64
    .line 65
    :goto_40
    return-void
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
