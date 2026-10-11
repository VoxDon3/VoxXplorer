.class Lax/a3/v$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/v;->T2(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/a3/v;


# direct methods
.method constructor <init>(Lax/a3/v;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/v$l;->a:Lax/a3/v;

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
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 4

    .line 1
    if-eqz p2, :cond_c

    .line 2
    .line 3
    iget-object p1, p0, Lax/a3/v$l;->a:Lax/a3/v;

    .line 4
    .line 5
    invoke-static {p1}, Lax/a3/v;->p3(Lax/a3/v;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iget-object p1, p0, Lax/a3/v$l;->a:Lax/a3/v;

    .line 14
    .line 15
    xor-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p1, p2}, Lax/a3/v;->r3(Lax/a3/v;Z)Z

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lax/a3/v$l;->a:Lax/a3/v;

    .line 21
    .line 22
    invoke-static {p1}, Lax/a3/v;->q3(Lax/a3/v;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_30

    .line 27
    .line 28
    iget-object p1, p0, Lax/a3/v$l;->a:Lax/a3/v;

    .line 29
    .line 30
    invoke-static {p1}, Lax/a3/v;->t3(Lax/a3/v;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/16 p2, 0x1bb

    .line 35
    .line 36
    if-ne p1, p2, :cond_30

    .line 37
    .line 38
    iget-object p1, p0, Lax/a3/v$l;->a:Lax/a3/v;

    .line 39
    .line 40
    invoke-static {p1}, Lax/a3/v;->u3(Lax/a3/v;)Landroid/widget/EditText;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "80"

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    :cond_30
    return-void
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
.end method
