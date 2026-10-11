.class Lax/d3/b$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/b;->L5(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lax/T2/h;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/d3/b;


# direct methods
.method constructor <init>(Lax/d3/b;J)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/d3/b$a;->c:Lax/d3/b;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lax/g3/c;-><init>(J)V

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
    .registers 6

    .line 1
    iget-object p1, p0, Lax/d3/b$a;->c:Lax/d3/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    goto :goto_50

    .line 10
    :cond_9
    const/4 p1, 0x1

    .line 11
    :try_start_a
    invoke-static {}, Lax/u3/o;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_22

    .line 16
    .line 17
    new-instance v0, Landroid/content/Intent;

    .line 18
    .line 19
    const-string v1, "android.os.storage.action.CLEAR_APP_CACHE"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lax/d3/b$a;->c:Lax/d3/b;

    .line 25
    .line 26
    const v2, 0x9471

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Lax/c3/u;->r0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_20
    move-exception v0

    .line 34
    goto :goto_45

    .line 35
    :cond_22
    const v0, 0x104000a

    .line 36
    .line 37
    .line 38
    const/high16 v1, 0x1040000

    .line 39
    .line 40
    const v2, 0x7f13040d

    .line 41
    .line 42
    .line 43
    const v3, 0x7f1303a0

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3, v0, v1}, Lax/a3/n;->k3(IIII)Lax/a3/n;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Lax/d3/b$a$a;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Lax/d3/b$a$a;-><init>(Lax/d3/b$a;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lax/a3/n;->n3(Lax/a3/n$c;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lax/d3/b$a;->c:Lax/d3/b;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->A0()Landroidx/fragment/app/FragmentManager;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "allfilesconfirm"

    .line 65
    .line 66
    invoke-static {v1, v0, v2, p1}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_44} :catch_20

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :goto_45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lax/d3/b$a;->c:Lax/d3/b;

    .line 74
    .line 75
    const v1, 0x7f130137

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, p1}, Lax/d3/n;->E4(II)V

    .line 79
    .line 80
    .line 81
    :goto_50
    return-void
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
