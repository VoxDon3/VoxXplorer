.class Lax/d3/E$d;
.super Lax/g3/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;J)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/d3/E$d;->c:Lax/d3/E;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lax/g3/d;-><init>(J)V

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
.method public a(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    if-ltz p3, :cond_57

    .line 2
    .line 3
    iget-object p1, p0, Lax/d3/E$d;->c:Lax/d3/E;

    .line 4
    .line 5
    iget-object p1, p1, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 6
    .line 7
    invoke-interface {p1}, Landroid/widget/Adapter;->getCount()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-lt p3, p1, :cond_d

    .line 12
    .line 13
    goto :goto_57

    .line 14
    :cond_d
    iget-object p1, p0, Lax/d3/E$d;->c:Lax/d3/E;

    .line 15
    .line 16
    iget-object p1, p1, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 17
    .line 18
    invoke-interface {p1, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    iget-object p2, p0, Lax/d3/E$d;->c:Lax/d3/E;

    .line 25
    .line 26
    invoke-static {p2, p1}, Lax/d3/E;->m6(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_57

    .line 34
    .line 35
    invoke-static {p1}, Lax/c3/B;->q(Lcom/voxdon/xplorer/file/n;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_57

    .line 40
    .line 41
    iget-object p2, p0, Lax/d3/E$d;->c:Lax/d3/E;

    .line 42
    .line 43
    invoke-virtual {p2}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lax/Q2/f;->k0(Lax/Q2/f;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_57

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lax/c3/C;->e(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-nez p2, :cond_57

    .line 66
    .line 67
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const-string p3, "general"

    .line 72
    .line 73
    const-string p4, "first_dir"

    .line 74
    .line 75
    invoke-virtual {p2, p3, p4}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const-string p3, "info"

    .line 80
    .line 81
    invoke-virtual {p2, p3, p1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 86
    .line 87
    .line 88
    :cond_57
    :goto_57
    return-void
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
