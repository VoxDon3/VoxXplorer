.class Lax/a3/Q$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field a:I

.field b:Landroid/content/pm/ResolveInfo;

.field c:Landroid/widget/ImageView;

.field d:Landroid/widget/TextView;

.field e:Landroid/view/View;

.field f:Landroid/view/View;

.field g:Landroid/widget/CheckBox;

.field h:Lax/a3/Q$e;

.field final synthetic i:Lax/a3/Q;


# direct methods
.method constructor <init>(Lax/a3/Q;Landroid/view/View;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/a3/Q$i;->i:Lax/a3/Q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f0a024f

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/widget/ImageView;

    .line 14
    .line 15
    iput-object v0, p0, Lax/a3/Q$i;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    const v0, 0x1020014

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object v0, p0, Lax/a3/Q$i;->d:Landroid/widget/TextView;

    .line 27
    .line 28
    const v0, 0x7f0a032d

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lax/a3/Q$i;->e:Landroid/view/View;

    .line 36
    .line 37
    const v0, 0x7f0a00f2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lax/a3/Q$i;->f:Landroid/view/View;

    .line 45
    .line 46
    const v0, 0x7f0a04ca

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Landroid/widget/CheckBox;

    .line 54
    .line 55
    iput-object p2, p0, Lax/a3/Q$i;->g:Landroid/widget/CheckBox;

    .line 56
    .line 57
    const v0, 0x7f0800bd

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lax/a3/Q$i;->e:Landroid/view/View;

    .line 64
    .line 65
    new-instance v0, Lax/a3/Q$i$a;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Lax/a3/Q$i$a;-><init>(Lax/a3/Q$i;Lax/a3/Q;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, Lax/a3/Q$i;->f:Landroid/view/View;

    .line 74
    .line 75
    new-instance v0, Lax/a3/Q$i$b;

    .line 76
    .line 77
    invoke-direct {v0, p0, p1}, Lax/a3/Q$i$b;-><init>(Lax/a3/Q$i;Lax/a3/Q;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    return-void
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
