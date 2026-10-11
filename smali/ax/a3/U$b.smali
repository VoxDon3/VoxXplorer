.class Lax/a3/U$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lax/a3/U$d;",
        ">;"
    }
.end annotation


# instance fields
.field h:Landroid/content/Context;

.field i:Ljava/lang/String;

.field j:Landroid/widget/Button;

.field final synthetic k:Lax/a3/U;


# direct methods
.method constructor <init>(Lax/a3/U;Landroid/content/Context;Ljava/lang/String;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 2
    .line 3
    sget-object v0, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lax/a3/U$b;->h:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p3, p0, Lax/a3/U$b;->i:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/fragment/app/e;->Q2()Landroid/app/Dialog;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_1e

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/e;->Q2()Landroid/app/Dialog;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Landroidx/appcompat/app/a;

    .line 23
    .line 24
    const/4 p2, -0x1

    .line 25
    invoke-virtual {p1, p2}, Landroidx/appcompat/app/a;->i(I)Landroid/widget/Button;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lax/a3/U$b;->j:Landroid/widget/Button;

    .line 30
    .line 31
    :cond_1e
    return-void
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
    .line 42
    .line 43
    .line 44
    .line 45
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


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/U$b;->w([Ljava/lang/Void;)Lax/a3/U$d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/a3/U$d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/U$b;->x(Lax/a3/U$d;)V

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

.method protected r()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/u3/q;->r()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/a3/U$b;->j:Landroid/widget/Button;

    .line 5
    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 10
    .line 11
    .line 12
    :cond_b
    return-void
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

.method protected varargs w([Ljava/lang/Void;)Lax/a3/U$d;
    .registers 4

    .line 1
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/U;->i3(Lax/a3/U;)Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lax/Q2/f;->T0:Lax/Q2/f;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne p1, v0, :cond_14

    .line 11
    .line 12
    iget-object p1, p0, Lax/a3/U$b;->h:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v0, p0, Lax/a3/U$b;->i:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Lcom/voxdon/xplorer/file/D;->X0(Landroid/content/Context;Ljava/lang/String;Z)Lax/a3/U$d;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_14
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 22
    .line 23
    invoke-static {p1}, Lax/a3/U;->i3(Lax/a3/U;)Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object v0, Lax/Q2/f;->U0:Lax/Q2/f;

    .line 28
    .line 29
    if-ne p1, v0, :cond_25

    .line 30
    .line 31
    iget-object p1, p0, Lax/a3/U$b;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/H;->T0(Ljava/lang/String;Z)Lax/a3/U$d;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_25
    invoke-static {}, Lax/u3/b;->f()V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lax/a3/U$d;->d0:Lax/a3/U$d;

    .line 42
    .line 43
    return-object p1
    .line 44
    .line 45
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
.end method

.method protected x(Lax/a3/U$d;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/a3/U$b;->j:Landroid/widget/Button;

    .line 11
    .line 12
    if-eqz v0, :cond_11

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_11
    sget-object v0, Lax/a3/U$d;->q:Lax/a3/U$d;

    .line 19
    .line 20
    if-ne p1, v0, :cond_34

    .line 21
    .line 22
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 23
    .line 24
    invoke-static {p1}, Lax/a3/U;->j3(Lax/a3/U;)Lax/a3/U$c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_2e

    .line 29
    .line 30
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 31
    .line 32
    invoke-static {p1}, Lax/a3/U;->j3(Lax/a3/U;)Lax/a3/U$c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 37
    .line 38
    invoke-static {v0}, Lax/a3/U;->i3(Lax/a3/U;)Lax/Q2/f;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lax/a3/U$b;->i:Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {p1, v0, v1}, Lax/a3/U$c;->c(Lax/Q2/f;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/fragment/app/e;->O2()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    sget-object v0, Lax/a3/U$d;->c0:Lax/a3/U$d;

    .line 54
    .line 55
    if-ne p1, v0, :cond_45

    .line 56
    .line 57
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 58
    .line 59
    invoke-static {p1}, Lax/a3/U;->k3(Lax/a3/U;)Landroid/widget/TextView;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const v0, 0x7f13014c

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    sget-object v0, Lax/a3/U$d;->e0:Lax/a3/U$d;

    .line 71
    .line 72
    if-ne p1, v0, :cond_56

    .line 73
    .line 74
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 75
    .line 76
    invoke-static {p1}, Lax/a3/U;->k3(Lax/a3/U;)Landroid/widget/TextView;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const v0, 0x7f130139

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_56
    iget-object p1, p0, Lax/a3/U$b;->k:Lax/a3/U;

    .line 88
    .line 89
    invoke-static {p1}, Lax/a3/U;->k3(Lax/a3/U;)Landroid/widget/TextView;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const v0, 0x7f130146

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 97
    .line 98
    .line 99
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
.end method
