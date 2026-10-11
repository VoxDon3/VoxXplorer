.class Lax/c0/F0$j;
.super Lax/c0/F0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c0/F0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
.end annotation


# instance fields
.field private n:Lax/T/b;

.field private o:Lax/T/b;

.field private p:Lax/T/b;


# direct methods
.method constructor <init>(Lax/c0/F0;Landroid/view/WindowInsets;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/c0/F0$i;-><init>(Lax/c0/F0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lax/c0/F0$j;->n:Lax/T/b;

    .line 3
    iput-object p1, p0, Lax/c0/F0$j;->o:Lax/T/b;

    .line 4
    iput-object p1, p0, Lax/c0/F0$j;->p:Lax/T/b;

    return-void
.end method

.method constructor <init>(Lax/c0/F0;Lax/c0/F0$j;)V
    .registers 3

    .line 5
    invoke-direct {p0, p1, p2}, Lax/c0/F0$i;-><init>(Lax/c0/F0;Lax/c0/F0$i;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lax/c0/F0$j;->n:Lax/T/b;

    .line 7
    iput-object p1, p0, Lax/c0/F0$j;->o:Lax/T/b;

    .line 8
    iput-object p1, p0, Lax/c0/F0$j;->p:Lax/T/b;

    return-void
.end method


# virtual methods
.method h()Lax/T/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/F0$j;->o:Lax/T/b;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lax/c0/F0$g;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lax/c0/T0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/T/b;->d(Landroid/graphics/Insets;)Lax/T/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/c0/F0$j;->o:Lax/T/b;

    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/c0/F0$j;->o:Lax/T/b;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method j()Lax/T/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/F0$j;->n:Lax/T/b;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lax/c0/F0$g;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lax/c0/U0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/T/b;->d(Landroid/graphics/Insets;)Lax/T/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/c0/F0$j;->n:Lax/T/b;

    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/c0/F0$j;->n:Lax/T/b;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method l()Lax/T/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/F0$j;->p:Lax/T/b;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lax/c0/F0$g;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lax/c0/R0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/T/b;->d(Landroid/graphics/Insets;)Lax/T/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/c0/F0$j;->p:Lax/T/b;

    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/c0/F0$j;->p:Lax/T/b;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method m(IIII)Lax/c0/F0;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c0/F0$g;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Lax/c0/S0;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lax/c0/F0;->v(Landroid/view/WindowInsets;)Lax/c0/F0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public s(Lax/T/b;)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
