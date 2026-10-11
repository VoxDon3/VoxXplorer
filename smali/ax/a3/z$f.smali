.class public Lax/a3/z$f;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lax/U2/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/a3/z;


# direct methods
.method constructor <init>(Lax/a3/z;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/z$f;->w([Ljava/lang/Void;)Lax/U2/a;

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
    check-cast p1, Lax/U2/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/z$f;->x(Lax/U2/a;)V

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

.method protected varargs w([Ljava/lang/Void;)Lax/U2/a;
    .registers 3

    .line 1
    iget-object p1, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/z;->o3(Lax/a3/z;)Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of p1, p1, Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    if-nez p1, :cond_f

    .line 10
    .line 11
    invoke-static {}, Lax/u3/b;->f()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_f
    iget-object p1, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 17
    .line 18
    invoke-static {p1}, Lax/a3/z;->k3(Lax/a3/z;)Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 23
    .line 24
    invoke-static {v0}, Lax/a3/z;->o3(Lax/a3/z;)Lcom/voxdon/xplorer/file/n;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lax/U2/d;->q(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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

.method protected x(Lax/U2/a;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_67

    .line 10
    :cond_9
    iget-object v0, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lax/a3/z;->j3(Lax/a3/z;Lax/U2/a;)Lax/U2/a;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 16
    .line 17
    invoke-static {p1}, Lax/a3/z;->i3(Lax/a3/z;)Lax/U2/a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_67

    .line 22
    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 29
    .line 30
    invoke-static {v0}, Lax/a3/z;->i3(Lax/a3/z;)Lax/U2/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, Lax/U2/a;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, "\n"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 45
    .line 46
    invoke-static {v0}, Lax/a3/z;->i3(Lax/a3/z;)Lax/U2/a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, Lax/U2/a;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 60
    .line 61
    invoke-static {v0}, Lax/a3/z;->p3(Lax/a3/z;)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const v1, 0x7f0a01d3

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/fragment/app/e;->Q2()Landroid/app/Dialog;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_67

    .line 84
    .line 85
    iget-object p1, p0, Lax/a3/z$f;->h:Lax/a3/z;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/fragment/app/e;->Q2()Landroid/app/Dialog;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Landroidx/appcompat/app/a;

    .line 92
    .line 93
    const/4 v0, -0x3

    .line 94
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->i(I)Landroid/widget/Button;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_67

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    :cond_67
    :goto_67
    return-void
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
