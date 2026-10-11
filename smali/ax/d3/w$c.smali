.class Lax/d3/w$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/w;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/w;


# direct methods
.method constructor <init>(Lax/d3/w;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/w$c;->a:Lax/d3/w;

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
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/d3/w$c;->a:Lax/d3/w;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p4, 0x0

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return p4

    .line 11
    :cond_a
    new-instance p1, Lax/s/c;

    .line 12
    .line 13
    iget-object p5, p0, Lax/d3/w$c;->a:Lax/d3/w;

    .line 14
    .line 15
    invoke-virtual {p5}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p5

    .line 19
    const v0, 0x7f14012f

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p5, v0}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    new-instance p5, Lax/x3/v;

    .line 26
    .line 27
    invoke-direct {p5, p1}, Lax/x3/v;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/d3/w$c;->a:Lax/d3/w;

    .line 31
    .line 32
    invoke-static {p1}, Lax/d3/w;->C5(Lax/d3/w;)Lax/x3/m;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p3}, Lax/x3/m;->a(I)Lax/c3/K;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p3, p0, Lax/d3/w$c;->a:Lax/d3/w;

    .line 41
    .line 42
    invoke-virtual {p3, p5, p1}, Lax/d3/x;->X4(Lax/x3/v;Lax/c3/K;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p5}, Landroidx/appcompat/view/menu/e;->hasVisibleItems()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_45

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    div-int/lit8 p1, p1, 0x2

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    mul-int/lit8 p3, p3, -0x1

    .line 62
    .line 63
    div-int/lit8 p3, p3, 0x2

    .line 64
    .line 65
    invoke-virtual {p5, p2, p1, p3}, Lax/x3/v;->h0(Landroid/view/View;II)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    :cond_45
    return p4
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
