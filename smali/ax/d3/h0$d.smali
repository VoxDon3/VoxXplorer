.class Lax/d3/h0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/h0;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/h0;


# direct methods
.method constructor <init>(Lax/d3/h0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

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
.method public a(Landroidx/appcompat/view/a;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/n;->a3()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 7
    .line 8
    sget-object v0, Lax/d3/n$o;->e0:Lax/d3/n$o;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lax/d3/h0;->W3(Lax/d3/n$o;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public b(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 2
    .line 3
    const/high16 v1, 0x7f0f0000

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, v1}, Lax/d3/n;->d3(Landroidx/appcompat/view/a;Landroid/view/Menu;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 9
    .line 10
    sget-object p2, Lax/d3/n$o;->e0:Lax/d3/n$o;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lax/d3/h0;->X3(Lax/d3/n$o;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1
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

.method public c(Landroidx/appcompat/view/a;Landroid/view/Menu;)Z
    .registers 10

    .line 1
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/h0;->Q4(Lax/d3/h0;)Lax/x3/I;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lax/x3/I;->c()Lax/i2/I;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lax/i2/I;->j()Lax/i2/D;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lax/i2/D;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const v0, 0x7f0a008f

    .line 20
    .line 21
    .line 22
    const v1, 0x7f0a0097

    .line 23
    .line 24
    .line 25
    const v2, 0x7f0a008c

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    if-ne p2, v4, :cond_60

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/i2/D;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 p2, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    :goto_25
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_34

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Ljava/lang/Long;

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_25

    .line 53
    :cond_34
    if-eq v5, v4, :cond_3c

    .line 54
    .line 55
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 56
    .line 57
    invoke-virtual {p1}, Lax/d3/n;->h3()V

    .line 58
    .line 59
    .line 60
    return v3

    .line 61
    :cond_3c
    if-nez p2, :cond_44

    .line 62
    .line 63
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 64
    .line 65
    invoke-virtual {p1}, Lax/d3/n;->h3()V

    .line 66
    .line 67
    .line 68
    return v3

    .line 69
    :cond_44
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 70
    .line 71
    invoke-static {p1}, Lax/d3/h0;->R4(Lax/d3/h0;)Lax/x3/d;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v2, v4}, Lax/x3/d;->o(IZ)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 79
    .line 80
    invoke-static {p1}, Lax/d3/h0;->R4(Lax/d3/h0;)Lax/x3/d;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, v1, v4}, Lax/x3/d;->o(IZ)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 88
    .line 89
    invoke-static {p1}, Lax/d3/h0;->R4(Lax/d3/h0;)Lax/x3/d;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1, v0, v4}, Lax/x3/d;->o(IZ)V

    .line 94
    .line 95
    .line 96
    goto :goto_7b

    .line 97
    :cond_60
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 98
    .line 99
    invoke-static {p1}, Lax/d3/h0;->R4(Lax/d3/h0;)Lax/x3/d;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v2, v3}, Lax/x3/d;->o(IZ)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 107
    .line 108
    invoke-static {p1}, Lax/d3/h0;->R4(Lax/d3/h0;)Lax/x3/d;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1, v1, v3}, Lax/x3/d;->o(IZ)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 116
    .line 117
    invoke-static {p1}, Lax/d3/h0;->R4(Lax/d3/h0;)Lax/x3/d;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1, v0, v3}, Lax/x3/d;->o(IZ)V

    .line 122
    .line 123
    .line 124
    :goto_7b
    return v3
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

.method public d(Landroidx/appcompat/view/a;Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/h0$d;->a:Lax/d3/h0;

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p1, p2}, Lax/d3/h0;->S4(Lax/d3/h0;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_e
    const/4 p1, 0x0

    .line 16
    return p1
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
