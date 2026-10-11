.class Lax/a3/L$b$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/L$b;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/a3/L$b;


# direct methods
.method constructor <init>(Lax/a3/L$b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 2
    .line 3
    iget-object p1, p1, Lax/a3/L$b;->b:Lax/a3/L;

    .line 4
    .line 5
    invoke-static {p1}, Lax/a3/L;->k3(Lax/a3/L;)Landroid/widget/EditText;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_31

    .line 26
    .line 27
    iget-object p1, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 28
    .line 29
    iget-object p1, p1, Lax/a3/L$b;->b:Lax/a3/L;

    .line 30
    .line 31
    invoke-static {p1}, Lax/a3/L;->l3(Lax/a3/L;)Lcom/google/android/material/textfield/TextInputLayout;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 36
    .line 37
    iget-object v0, v0, Lax/a3/L$b;->b:Lax/a3/L;

    .line 38
    .line 39
    const v1, 0x7f130152

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    iget-object v0, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 51
    .line 52
    iget-object v0, v0, Lax/a3/L$b;->b:Lax/a3/L;

    .line 53
    .line 54
    invoke-static {v0}, Lax/a3/L;->m3(Lax/a3/L;)Lax/a3/L$c;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_47

    .line 59
    .line 60
    iget-object v0, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 61
    .line 62
    iget-object v0, v0, Lax/a3/L$b;->b:Lax/a3/L;

    .line 63
    .line 64
    invoke-static {v0}, Lax/a3/L;->m3(Lax/a3/L;)Lax/a3/L$c;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0, p1}, Lax/a3/L$c;->X(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_60

    .line 72
    :cond_47
    iget-object v0, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 73
    .line 74
    iget-object v0, v0, Lax/a3/L$b;->b:Lax/a3/L;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->P0()Landroidx/fragment/app/Fragment;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    instance-of v0, v0, Lax/a3/L$c;

    .line 81
    .line 82
    if-eqz v0, :cond_60

    .line 83
    .line 84
    iget-object v0, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 85
    .line 86
    iget-object v0, v0, Lax/a3/L$b;->b:Lax/a3/L;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->P0()Landroidx/fragment/app/Fragment;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lax/a3/L$c;

    .line 93
    .line 94
    invoke-interface {v0, p1}, Lax/a3/L$c;->X(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    iget-object p1, p0, Lax/a3/L$b$a;->c:Lax/a3/L$b;

    .line 98
    .line 99
    iget-object p1, p1, Lax/a3/L$b;->b:Lax/a3/L;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroidx/fragment/app/e;->O2()V

    .line 102
    .line 103
    .line 104
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
