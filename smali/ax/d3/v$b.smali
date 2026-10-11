.class Lax/d3/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/v;->V5(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/v;


# direct methods
.method constructor <init>(Lax/d3/v;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/v$b;->a:Lax/d3/v;

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
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/d3/v$b;->a:Lax/d3/v;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/v;->F5(Lax/d3/v;)Lax/x3/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1, p3}, Lax/x3/l;->a(I)Lax/Z2/s;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lax/Z2/s;->e()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    sget-object p4, Lax/Q2/f;->W0:Lax/Q2/f;

    .line 20
    .line 21
    if-eq p3, p4, :cond_3b

    .line 22
    .line 23
    invoke-virtual {p2}, Lax/c3/K;->d()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    sget-object p4, Lax/Q2/f;->Y0:Lax/Q2/f;

    .line 28
    .line 29
    if-ne p3, p4, :cond_1f

    .line 30
    .line 31
    goto :goto_3b

    .line 32
    :cond_1f
    iget-object p2, p0, Lax/d3/v$b;->a:Lax/d3/v;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    instance-of p2, p2, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 39
    .line 40
    if-eqz p2, :cond_3a

    .line 41
    .line 42
    iget-object p2, p0, Lax/d3/v$b;->a:Lax/d3/v;

    .line 43
    .line 44
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 49
    .line 50
    const-string p3, "home"

    .line 51
    .line 52
    invoke-virtual {p2, p3}, Lcom/voxdon/xplorer/activity/MainActivity;->E1(Ljava/lang/String;)Lax/g3/l;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-interface {p2, p1}, Lax/g3/l;->e(Lax/Z2/s;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return-void

    .line 60
    :cond_3b
    :goto_3b
    iget-object p1, p0, Lax/d3/v$b;->a:Lax/d3/v;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Lax/d3/x;->d5(Lax/c3/K;)V

    .line 63
    .line 64
    .line 65
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
