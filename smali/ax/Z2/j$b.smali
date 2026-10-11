.class Lax/Z2/j$b;
.super Lax/X2/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/Z2/j;->T0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lax/Z2/j;


# direct methods
.method constructor <init>(Lax/Z2/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/Z2/j$b;->b:Lax/Z2/j;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/X2/p;-><init>()V

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
.method public a(Lax/X2/O;IIZ)V
    .registers 8

    .line 1
    if-ne p3, p2, :cond_3

    .line 2
    .line 3
    goto :goto_60

    .line 4
    :cond_3
    const/4 p2, 0x2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p3, p2, :cond_61

    .line 7
    .line 8
    const/4 p2, 0x3

    .line 9
    if-ne p3, p2, :cond_b

    .line 10
    .line 11
    goto :goto_61

    .line 12
    :cond_b
    const/4 p2, 0x5

    .line 13
    const-string v1, "desc"

    .line 14
    .line 15
    const-string v2, "uuid"

    .line 16
    .line 17
    if-ne p3, p2, :cond_31

    .line 18
    .line 19
    new-instance p2, Landroid/content/Intent;

    .line 20
    .line 21
    const-string p3, "local.intent.action.USB_IS_EJECTING"

    .line 22
    .line 23
    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_29

    .line 27
    .line 28
    invoke-virtual {p1}, Lax/X2/O;->f()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p2, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lax/X2/O;->d()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    :cond_29
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, p2}, Lax/u3/g;->e(Landroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    if-ne p3, v0, :cond_60

    .line 51
    .line 52
    if-eqz p4, :cond_3d

    .line 53
    .line 54
    invoke-static {}, Lax/Q2/e;->T()V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lax/Z2/j$b;->b:Lax/Z2/j;

    .line 58
    .line 59
    invoke-static {p2, v0}, Lax/Z2/j;->a(Lax/Z2/j;Z)Z

    .line 60
    .line 61
    .line 62
    :cond_3d
    new-instance p2, Landroid/content/Intent;

    .line 63
    .line 64
    const-string p3, "local.intent.action.USB_IS_EJECTED"

    .line 65
    .line 66
    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    if-eqz p1, :cond_54

    .line 70
    .line 71
    invoke-virtual {p1}, Lax/X2/O;->f()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p2, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lax/X2/O;->d()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    :cond_54
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1, p2}, Lax/u3/g;->e(Landroid/content/Intent;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lax/Z2/j$b;->b:Lax/Z2/j;

    .line 93
    .line 94
    invoke-virtual {p1}, Lax/Z2/j;->K0()V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    return-void

    .line 98
    :cond_61
    :goto_61
    if-eqz p4, :cond_6b

    .line 99
    .line 100
    invoke-static {}, Lax/Q2/e;->T()V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lax/Z2/j$b;->b:Lax/Z2/j;

    .line 104
    .line 105
    invoke-static {p1, v0}, Lax/Z2/j;->a(Lax/Z2/j;Z)Z

    .line 106
    .line 107
    .line 108
    :cond_6b
    iget-object p1, p0, Lax/Z2/j$b;->b:Lax/Z2/j;

    .line 109
    .line 110
    invoke-virtual {p1}, Lax/Z2/j;->K0()V

    .line 111
    .line 112
    .line 113
    return-void
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
