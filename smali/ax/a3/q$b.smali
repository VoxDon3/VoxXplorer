.class Lax/a3/q$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Landroid/app/ProgressDialog;

.field private i:I

.field private j:Landroid/content/Context;

.field final synthetic k:Lax/a3/q;


# direct methods
.method public constructor <init>(Lax/a3/q;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 2
    .line 3
    sget-object v0, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lax/a3/q$b;->i:I

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lax/a3/q$b;->j:Landroid/content/Context;

    .line 20
    .line 21
    new-instance v0, Landroid/app/ProgressDialog;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lax/a3/q$b;->h:Landroid/app/ProgressDialog;

    .line 31
    .line 32
    return-void
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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/q$b;->x([Ljava/lang/Void;)Ljava/lang/Void;

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
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/q$b;->y(Ljava/lang/Void;)V

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
    .registers 4

    .line 1
    invoke-super {p0}, Lax/u3/q;->r()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/X2/P;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_18

    .line 9
    .line 10
    iget-object v0, p0, Lax/a3/q$b;->h:Landroid/app/ProgressDialog;

    .line 11
    .line 12
    iget-object v1, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 13
    .line 14
    const v2, 0x7f1300bc

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    goto :goto_26

    .line 25
    :cond_18
    iget-object v0, p0, Lax/a3/q$b;->h:Landroid/app/ProgressDialog;

    .line 26
    .line 27
    iget-object v1, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 28
    .line 29
    const v2, 0x7f130397

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :goto_26
    iget-object v0, p0, Lax/a3/q$b;->h:Landroid/app/ProgressDialog;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lax/a3/q$b;->h:Landroid/app/ProgressDialog;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 48
    .line 49
    .line 50
    return-void
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
.end method

.method w(Lax/Q2/f;I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/q;->k3(Lax/a3/q;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lax/a3/q$b$a;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Lax/a3/q$b$a;-><init>(Lax/a3/q$b;Lax/Q2/f;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
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

.method protected varargs x([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 6

    .line 1
    const/4 p1, 0x0

    .line 2
    :goto_1
    iget-object v0, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 3
    .line 4
    invoke-static {v0}, Lax/a3/q;->i3(Lax/a3/q;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ge p1, v0, :cond_47

    .line 13
    .line 14
    iget-object v0, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 15
    .line 16
    invoke-static {v0}, Lax/a3/q;->i3(Lax/a3/q;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lax/Q2/f;

    .line 25
    .line 26
    iget-object v1, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 27
    .line 28
    invoke-static {v1}, Lax/a3/q;->j3(Lax/a3/q;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget-object v2, p0, Lax/a3/q$b;->j:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {v2, v0}, Lcom/voxdon/xplorer/file/T;->b(Landroid/content/Context;Lax/Q2/f;)Lcom/voxdon/xplorer/file/T;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, v1}, Lcom/voxdon/xplorer/file/T;->a(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lax/a3/q$b;->j:Landroid/content/Context;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v2, v3}, Lax/V2/b;->g(Landroid/content/Context;Lax/c3/K;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0, v1}, Lax/a3/q$b;->w(Lax/Q2/f;I)V

    .line 61
    .line 62
    .line 63
    iget v0, p0, Lax/a3/q$b;->i:I

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    iput v0, p0, Lax/a3/q$b;->i:I

    .line 68
    .line 69
    add-int/lit8 p1, p1, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_47
    const/4 p1, 0x0

    .line 73
    return-object p1
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
.end method

.method protected y(Ljava/lang/Void;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a3/q$b;->h:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->P0()Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v0, v0, Lax/g3/m;

    .line 13
    .line 14
    if-eqz v0, :cond_1c

    .line 15
    .line 16
    iget-object v0, p0, Lax/a3/q$b;->k:Lax/a3/q;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->P0()Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lax/g3/m;

    .line 23
    .line 24
    iget v1, p0, Lax/a3/q$b;->i:I

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lax/g3/m;->u(I)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    invoke-super {p0, p1}, Lax/u3/q;->q(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
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
.end method
