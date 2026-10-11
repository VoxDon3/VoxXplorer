.class Lax/d3/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/r;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/r;


# direct methods
.method constructor <init>(Lax/d3/r;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

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
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/n;->a3()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 7
    .line 8
    sget-object v0, Lax/d3/n$o;->e0:Lax/d3/n$o;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lax/d3/r;->W3(Lax/d3/n$o;)V

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
    iget-object v0, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 2
    .line 3
    const/high16 v1, 0x7f0f0000

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, v1}, Lax/d3/n;->d3(Landroidx/appcompat/view/a;Landroid/view/Menu;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 9
    .line 10
    sget-object p2, Lax/d3/n$o;->e0:Lax/d3/n$o;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lax/d3/r;->X3(Lax/d3/n$o;)V

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
    .registers 9

    .line 1
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/r;->Q4(Lax/d3/r;)Lax/x3/I;

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
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-ne p2, v3, :cond_54

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/i2/D;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 p2, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    :goto_22
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_31

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, Ljava/lang/Long;

    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_22

    .line 50
    :cond_31
    if-eq v4, v3, :cond_39

    .line 51
    .line 52
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 53
    .line 54
    invoke-virtual {p1}, Lax/d3/n;->h3()V

    .line 55
    .line 56
    .line 57
    return v2

    .line 58
    :cond_39
    if-nez p2, :cond_41

    .line 59
    .line 60
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 61
    .line 62
    invoke-virtual {p1}, Lax/d3/n;->h3()V

    .line 63
    .line 64
    .line 65
    return v2

    .line 66
    :cond_41
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 67
    .line 68
    invoke-static {p1}, Lax/d3/r;->R4(Lax/d3/r;)Lax/x3/d;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, v1, v3}, Lax/x3/d;->o(IZ)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 76
    .line 77
    invoke-static {p1}, Lax/d3/r;->R4(Lax/d3/r;)Lax/x3/d;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, v0, v3}, Lax/x3/d;->o(IZ)V

    .line 82
    .line 83
    .line 84
    goto :goto_66

    .line 85
    :cond_54
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 86
    .line 87
    invoke-static {p1}, Lax/d3/r;->R4(Lax/d3/r;)Lax/x3/d;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, v1, v2}, Lax/x3/d;->o(IZ)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 95
    .line 96
    invoke-static {p1}, Lax/d3/r;->R4(Lax/d3/r;)Lax/x3/d;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, v0, v2}, Lax/x3/d;->o(IZ)V

    .line 101
    .line 102
    .line 103
    :goto_66
    return v2
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

.method public d(Landroidx/appcompat/view/a;Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/r$c;->a:Lax/d3/r;

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p1, p2}, Lax/d3/r;->S4(Lax/d3/r;I)Z

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
