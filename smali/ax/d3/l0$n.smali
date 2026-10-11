.class Lax/d3/l0$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x3/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/l0;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/l0;


# direct methods
.method constructor <init>(Lax/d3/l0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

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
.method public a(Landroid/view/View;I)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    goto :goto_3f

    .line 10
    :cond_9
    if-ltz p2, :cond_3f

    .line 11
    .line 12
    iget-object p1, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

    .line 13
    .line 14
    invoke-static {p1}, Lax/d3/l0;->W4(Lax/d3/l0;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-lt p2, p1, :cond_18

    .line 23
    .line 24
    goto :goto_3f

    .line 25
    :cond_18
    iget-object p1, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

    .line 26
    .line 27
    invoke-static {p1}, Lax/d3/l0;->W4(Lax/d3/l0;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lax/o3/o;

    .line 36
    .line 37
    iget-object p2, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2}, Lcom/voxdon/xplorer/file/q;->z0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/q$g;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2, p1}, Lcom/voxdon/xplorer/file/q$g;->q(Lax/o3/o;)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_3a

    .line 52
    .line 53
    iget-object p1, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

    .line 54
    .line 55
    invoke-static {p1, p2}, Lax/d3/l0;->X4(Lax/d3/l0;I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object p2, p0, Lax/d3/l0$n;->a:Lax/d3/l0;

    .line 60
    .line 61
    invoke-static {p2, p1}, Lax/d3/l0;->Y4(Lax/d3/l0;Lax/o3/o;)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    :goto_3f
    return-void
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
.end method
