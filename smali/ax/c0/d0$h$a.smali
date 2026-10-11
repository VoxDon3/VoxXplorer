.class Lax/c0/d0$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/c0/d0$h;->u(Landroid/view/View;Lax/c0/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Lax/c0/F0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lax/c0/I;


# direct methods
.method constructor <init>(Landroid/view/View;Lax/c0/I;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/c0/d0$h$a;->b:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Lax/c0/d0$h$a;->c:Lax/c0/I;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lax/c0/d0$h$a;->a:Lax/c0/F0;

    .line 10
    .line 11
    return-void
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
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 7

    .line 1
    invoke-static {p2, p1}, Lax/c0/F0;->w(Landroid/view/WindowInsets;Landroid/view/View;)Lax/c0/F0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x1e

    .line 8
    .line 9
    if-ge v1, v2, :cond_22

    .line 10
    .line 11
    iget-object v3, p0, Lax/c0/d0$h$a;->b:Landroid/view/View;

    .line 12
    .line 13
    invoke-static {p2, v3}, Lax/c0/d0$h;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lax/c0/d0$h$a;->a:Lax/c0/F0;

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Lax/c0/F0;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_22

    .line 23
    .line 24
    iget-object p2, p0, Lax/c0/d0$h$a;->c:Lax/c0/I;

    .line 25
    .line 26
    invoke-interface {p2, p1, v0}, Lax/c0/I;->a(Landroid/view/View;Lax/c0/F0;)Lax/c0/F0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lax/c0/F0;->u()Landroid/view/WindowInsets;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_22
    iput-object v0, p0, Lax/c0/d0$h$a;->a:Lax/c0/F0;

    .line 36
    .line 37
    iget-object p2, p0, Lax/c0/d0$h$a;->c:Lax/c0/I;

    .line 38
    .line 39
    invoke-interface {p2, p1, v0}, Lax/c0/I;->a(Landroid/view/View;Lax/c0/F0;)Lax/c0/F0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-lt v1, v2, :cond_31

    .line 44
    .line 45
    invoke-virtual {p2}, Lax/c0/F0;->u()Landroid/view/WindowInsets;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_31
    invoke-static {p1}, Lax/c0/d0;->i0(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lax/c0/F0;->u()Landroid/view/WindowInsets;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
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
