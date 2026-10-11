.class Lax/x3/H$a$b;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/H$a;-><init>(Lax/x3/H;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/x3/H;

.field final synthetic d:Lax/x3/H$a;


# direct methods
.method constructor <init>(Lax/x3/H$a;Lax/x3/H;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/H$a$b;->c:Lax/x3/H;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/x3/H$a;->A:Lax/x3/H;

    .line 4
    .line 5
    invoke-static {v0}, Lax/x3/H;->O(Lax/x3/H;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_26

    .line 10
    .line 11
    iget-object p1, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 12
    .line 13
    iget-object p1, p1, Lax/x3/H$a;->A:Lax/x3/H;

    .line 14
    .line 15
    invoke-static {p1}, Lax/x3/H;->P(Lax/x3/H;)Lax/x3/y;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_4c

    .line 20
    .line 21
    iget-object p1, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 22
    .line 23
    iget-object p1, p1, Lax/x3/H$a;->A:Lax/x3/H;

    .line 24
    .line 25
    invoke-static {p1}, Lax/x3/H;->P(Lax/x3/H;)Lax/x3/y;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->l()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-interface {p1, v0, v1}, Lax/x3/y;->a(J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iget-object v0, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 40
    .line 41
    iget-object v0, v0, Lax/x3/H$a;->A:Lax/x3/H;

    .line 42
    .line 43
    invoke-static {v0}, Lax/x3/H;->Q(Lax/x3/H;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_4c

    .line 48
    .line 49
    iget-object v0, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->k()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-gez v4, :cond_39

    .line 56
    .line 57
    goto :goto_4c

    .line 58
    :cond_39
    iget-object v0, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 59
    .line 60
    iget-object v0, v0, Lax/x3/H$a;->A:Lax/x3/H;

    .line 61
    .line 62
    invoke-static {v0}, Lax/x3/H;->Q(Lax/x3/H;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v0, p0, Lax/x3/H$a$b;->d:Lax/x3/H$a;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->l()J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    const/4 v2, 0x0

    .line 73
    move-object v3, p1

    .line 74
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 75
    .line 76
    .line 77
    :cond_4c
    :goto_4c
    return-void
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
.end method
