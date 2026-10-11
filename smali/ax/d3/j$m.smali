.class Lax/d3/j$m;
.super Lax/g3/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/j;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/d3/j;


# direct methods
.method constructor <init>(Lax/d3/j;J)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/d3/j$m;->c:Lax/d3/j;

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
    iget-object p1, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_55

    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 10
    .line 11
    invoke-static {p1}, Lax/d3/j;->o5(Lax/d3/j;)Lax/t3/i;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p3}, Lax/t3/i;->e(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p3, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 20
    .line 21
    invoke-static {p3}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object p3, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 29
    .line 30
    invoke-static {p3}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    invoke-virtual {p3, p4}, Landroid/widget/EditText;->setSelection(I)V

    .line 39
    .line 40
    .line 41
    iget-object p3, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 42
    .line 43
    invoke-static {p3}, Lax/d3/j;->o5(Lax/d3/j;)Lax/t3/i;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p3, p1}, Lax/t3/i;->d(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-static {p1, p3}, Lax/d3/j;->U4(Lax/d3/j;Z)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_55

    .line 63
    .line 64
    iget-object p1, p0, Lax/d3/j$m;->c:Lax/d3/j;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p3, "input_method"

    .line 71
    .line 72
    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const/4 p3, 0x2

    .line 83
    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 84
    .line 85
    .line 86
    :cond_55
    return-void
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
