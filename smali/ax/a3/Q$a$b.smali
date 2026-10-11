.class Lax/a3/Q$a$b;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/Q$a;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/a3/Q$a;


# direct methods
.method constructor <init>(Lax/a3/Q$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 5

    .line 1
    iget-object p1, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 2
    .line 3
    iget-object p1, p1, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object p1, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 13
    .line 14
    iget-object p1, p1, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 15
    .line 16
    invoke-static {p1}, Lax/a3/Q;->j3(Lax/a3/Q;)Landroid/widget/ListView;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCheckedItemPosition()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-ltz p1, :cond_56

    .line 25
    .line 26
    iget-object v0, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 27
    .line 28
    iget-object v0, v0, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 29
    .line 30
    iget-object v0, v0, Lax/a3/Q;->F0:Lax/a3/Q$g;

    .line 31
    .line 32
    invoke-virtual {v0}, Lax/a3/Q$g;->getCount()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-lt p1, v0, :cond_26

    .line 37
    .line 38
    goto :goto_56

    .line 39
    :cond_26
    iget-object v0, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 40
    .line 41
    iget-object v0, v0, Lax/a3/Q$a;->b:Landroid/content/Context;

    .line 42
    .line 43
    invoke-static {v0}, Lax/t3/h;->i(Landroid/content/Context;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v1, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 48
    .line 49
    iget-object v1, v1, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 50
    .line 51
    iget-object v2, v1, Lax/a3/Q;->F0:Lax/a3/Q$g;

    .line 52
    .line 53
    invoke-virtual {v2, p1}, Lax/a3/Q$g;->a(I)Lax/Z2/h$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-static {v1, p1, v2, v2, v0}, Lax/a3/Q;->k3(Lax/a3/Q;Lax/Z2/h$a;ZZZ)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_4e

    .line 63
    .line 64
    iget-object v0, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 65
    .line 66
    iget-object v0, v0, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 67
    .line 68
    invoke-static {v0, p1}, Lax/a3/Q;->l3(Lax/a3/Q;Landroid/content/Intent;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 72
    .line 73
    iget-object p1, p1, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/fragment/app/e;->O2()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    iget-object p1, p0, Lax/a3/Q$a$b;->c:Lax/a3/Q$a;

    .line 80
    .line 81
    iget-object p1, p1, Lax/a3/Q$a;->c:Lax/a3/Q;

    .line 82
    .line 83
    invoke-static {p1}, Lax/a3/Q;->m3(Lax/a3/Q;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_56
    :goto_56
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "RESOLVE DIALOG INEXT OUT OF BOUND 2"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v2, "pos:"

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 123
    .line 124
    .line 125
    return-void
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
