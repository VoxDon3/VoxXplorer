.class Lax/n/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/n/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field private a:Landroidx/appcompat/view/a$a;

.field final synthetic b:Lax/n/h;


# direct methods
.method public constructor <init>(Lax/n/h;Landroidx/appcompat/view/a$a;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/n/h$i;->a:Landroidx/appcompat/view/a$a;

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
.method public a(Landroidx/appcompat/view/a;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h$i;->a:Landroidx/appcompat/view/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/appcompat/view/a$a;->a(Landroidx/appcompat/view/a;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 7
    .line 8
    iget-object v0, p1, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 9
    .line 10
    if-eqz v0, :cond_18

    .line 11
    .line 12
    iget-object p1, p1, Lax/n/h;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 19
    .line 20
    iget-object v0, v0, Lax/n/h;->x:Ljava/lang/Runnable;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 26
    .line 27
    iget-object v0, p1, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 28
    .line 29
    if-eqz v0, :cond_3c

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/n/h;->m0()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 35
    .line 36
    iget-object v0, p1, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 37
    .line 38
    invoke-static {v0}, Lax/c0/d0;->e(Landroid/view/View;)Lax/c0/n0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Lax/c0/n0;->b(F)Lax/c0/n0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p1, Lax/n/h;->y:Lax/c0/n0;

    .line 48
    .line 49
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 50
    .line 51
    iget-object p1, p1, Lax/n/h;->y:Lax/c0/n0;

    .line 52
    .line 53
    new-instance v0, Lax/n/h$i$a;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lax/n/h$i$a;-><init>(Lax/n/h$i;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lax/c0/n0;->g(Lax/c0/o0;)Lax/c0/n0;

    .line 59
    .line 60
    .line 61
    :cond_3c
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 62
    .line 63
    iget-object v0, p1, Lax/n/h;->n:Lax/n/d;

    .line 64
    .line 65
    if-eqz v0, :cond_47

    .line 66
    .line 67
    iget-object p1, p1, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 68
    .line 69
    invoke-interface {v0, p1}, Lax/n/d;->onSupportActionModeFinished(Landroidx/appcompat/view/a;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    iput-object v0, p1, Lax/n/h;->u:Landroidx/appcompat/view/a;

    .line 76
    .line 77
    iget-object p1, p1, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 78
    .line 79
    invoke-static {p1}, Lax/c0/d0;->i0(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 83
    .line 84
    invoke-virtual {p1}, Lax/n/h;->f1()V

    .line 85
    .line 86
    .line 87
    return-void
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public b(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h$i;->a:Landroidx/appcompat/view/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/a$a;->b(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public c(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h$i;->b:Lax/n/h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-static {v0}, Lax/c0/d0;->i0(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/n/h$i;->a:Landroidx/appcompat/view/a$a;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/a$a;->c(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public d(Landroidx/appcompat/view/a;Landroid/view/MenuItem;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n/h$i;->a:Landroidx/appcompat/view/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/a$a;->d(Landroidx/appcompat/view/a;Landroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
