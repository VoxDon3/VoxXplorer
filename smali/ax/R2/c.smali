.class public abstract Lax/R2/c;
.super Lax/n/c;
.source "SourceFile"

# interfaces
.implements Lax/d3/x0$a;


# instance fields
.field private mWindowInsetsHelper:Lax/d3/x0;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/n/c;-><init>()V

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
.end method


# virtual methods
.method public onIMEVisibilityChanged(Z)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method protected onSetContentView(Z)V
    .registers 4

    .line 1
    new-instance v0, Lax/d3/x0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p0}, Lax/d3/x0;-><init>(Lax/n/c;Lax/d3/x0$a;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lax/R2/c;->mWindowInsetsHelper:Lax/d3/x0;

    .line 7
    .line 8
    const v1, 0x7f0a03ba

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lax/d3/x0;->d(Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lax/X2/Q;->N1()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_28

    .line 25
    .line 26
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_28

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/high16 v1, -0x1000000

    .line 37
    .line 38
    invoke-static {v0, v1}, Lax/X2/v;->r(Landroid/view/Window;I)V

    .line 39
    .line 40
    .line 41
    :cond_28
    if-eqz p1, :cond_48

    .line 42
    .line 43
    const p1, 0x7f0a04a5

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 51
    .line 52
    if-eqz p1, :cond_48

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lax/n/c;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {v0, v1}, Lax/n/a;->x(Z)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lax/R2/c$a;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lax/R2/c$a;-><init>(Lax/R2/c;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    invoke-static {}, Lax/X2/Q;->W1()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_6f

    .line 78
    .line 79
    const p1, 0x1010031

    .line 80
    .line 81
    .line 82
    invoke-static {p0, p1}, Lax/u3/z;->o(Landroid/content/Context;I)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const v0, 0x7f060021

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v0}, Lax/R2/b;->a(Lax/R2/c;I)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget-object v1, p0, Lax/R2/c;->mWindowInsetsHelper:Lax/d3/x0;

    .line 94
    .line 95
    invoke-virtual {v1, p1}, Lax/d3/x0;->h(I)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lax/R2/c;->mWindowInsetsHelper:Lax/d3/x0;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lax/d3/x0;->i(I)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lax/X2/Q;->b1()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_6f

    .line 108
    .line 109
    invoke-static {p0, v0}, Lax/u3/z;->B(Landroid/app/Activity;I)V

    .line 110
    .line 111
    .line 112
    :cond_6f
    return-void
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
