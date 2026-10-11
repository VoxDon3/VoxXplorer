.class Lax/n/h$i$a;
.super Lax/c0/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/n/h$i;->a(Landroidx/appcompat/view/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/n/h$i;


# direct methods
.method constructor <init>(Lax/n/h$i;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

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
    iget-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

    .line 2
    .line 3
    iget-object p1, p1, Lax/n/h$i;->b:Lax/n/h;

    .line 4
    .line 5
    iget-object p1, p1, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

    .line 13
    .line 14
    iget-object p1, p1, Lax/n/h$i;->b:Lax/n/h;

    .line 15
    .line 16
    iget-object v0, p1, Lax/n/h;->w:Landroid/widget/PopupWindow;

    .line 17
    .line 18
    if-eqz v0, :cond_17

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 21
    .line 22
    .line 23
    goto :goto_30

    .line 24
    :cond_17
    iget-object p1, p1, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    instance-of p1, p1, Landroid/view/View;

    .line 31
    .line 32
    if-eqz p1, :cond_30

    .line 33
    .line 34
    iget-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

    .line 35
    .line 36
    iget-object p1, p1, Lax/n/h$i;->b:Lax/n/h;

    .line 37
    .line 38
    iget-object p1, p1, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Landroid/view/View;

    .line 45
    .line 46
    invoke-static {p1}, Lax/c0/d0;->i0(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_30
    :goto_30
    iget-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

    .line 50
    .line 51
    iget-object p1, p1, Lax/n/h$i;->b:Lax/n/h;

    .line 52
    .line 53
    iget-object p1, p1, Lax/n/h;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

    .line 59
    .line 60
    iget-object p1, p1, Lax/n/h$i;->b:Lax/n/h;

    .line 61
    .line 62
    iget-object p1, p1, Lax/n/h;->y:Lax/c0/n0;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1, v0}, Lax/c0/n0;->g(Lax/c0/o0;)Lax/c0/n0;

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/n/h$i$a;->a:Lax/n/h$i;

    .line 69
    .line 70
    iget-object p1, p1, Lax/n/h$i;->b:Lax/n/h;

    .line 71
    .line 72
    iput-object v0, p1, Lax/n/h;->y:Lax/c0/n0;

    .line 73
    .line 74
    iget-object p1, p1, Lax/n/h;->B:Landroid/view/ViewGroup;

    .line 75
    .line 76
    invoke-static {p1}, Lax/c0/d0;->i0(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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
