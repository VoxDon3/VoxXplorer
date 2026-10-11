.class Lcom/voxdon/xplorer/activity/MainActivity$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/activity/MainActivity;->M2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

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
    .registers 12
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
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->Z0(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/c3/K;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/voxdon/xplorer/activity/MainActivity;->a1(Lcom/voxdon/xplorer/activity/MainActivity;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p1, :cond_1f

    .line 14
    .line 15
    if-eqz p2, :cond_1f

    .line 16
    .line 17
    iget-object p4, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 18
    .line 19
    invoke-static {p4, p1, p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->i(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/voxdon/xplorer/activity/MainActivity;->C1()Lax/V2/d;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, p1}, Lax/V2/d;->a(Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->b1(Lcom/voxdon/xplorer/activity/MainActivity;)Lax/V2/f;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, p3}, Lax/V2/f;->getItem(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    move-object v1, p1

    .line 43
    check-cast v1, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 44
    .line 45
    if-eqz v1, :cond_62

    .line 46
    .line 47
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "menu_drawer"

    .line 52
    .line 53
    const-string p3, "open_in_drawer"

    .line 54
    .line 55
    invoke-virtual {p1, p2, p3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string p2, "by"

    .line 60
    .line 61
    const-string p3, "top_window"

    .line 62
    .line 63
    invoke-virtual {p1, p2, p3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-string p3, "tgt"

    .line 76
    .line 77
    invoke-virtual {p1, p3, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->R1()V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity$u;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const-string v2, "history"

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/activity/MainActivity;->c2(Lcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;Lax/Z2/f;Lcom/voxdon/xplorer/activity/MainActivity$H;Lcom/voxdon/xplorer/activity/MainActivity$G;)V

    .line 97
    .line 98
    .line 99
    :cond_62
    return-void
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
