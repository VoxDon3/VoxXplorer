.class Lax/d3/E$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c0/A$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->O7(Landroid/view/Menu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/Menu;

.field final synthetic b:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;Landroid/view/Menu;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/E$o;->a:Landroid/view/Menu;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/E;->U4(Lax/d3/E;)Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/widget/TextView;->clearComposingText()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 11
    .line 12
    invoke-static {p1}, Lax/d3/E;->U4(Lax/d3/E;)Landroid/widget/EditText;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, ""

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 22
    .line 23
    invoke-static {p1}, Lax/d3/E;->U4(Lax/d3/E;)Landroid/widget/EditText;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v0}, Lax/d3/E;->f5(Lax/d3/E;Z)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 37
    .line 38
    invoke-static {p1}, Lax/d3/E;->k5(Lax/d3/E;)Landroid/os/Handler;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Lax/d3/E$o$a;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lax/d3/E$o$a;-><init>(Lax/d3/E$o;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1
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
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "menu_folder"

    .line 6
    .line 7
    const-string v1, "search"

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/d3/E;->z3()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "loc"

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 33
    .line 34
    invoke-static {p1}, Lax/d3/E;->U4(Lax/d3/E;)Landroid/widget/EditText;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-static {p1, v0}, Lax/d3/E;->f5(Lax/d3/E;Z)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 48
    .line 49
    iget-object v1, p0, Lax/d3/E$o;->a:Landroid/view/Menu;

    .line 50
    .line 51
    invoke-static {p1, v1, v0}, Lax/d3/E;->g5(Lax/d3/E;Landroid/view/Menu;Z)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 55
    .line 56
    invoke-static {p1}, Lax/d3/E;->i5(Lax/d3/E;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lax/d3/E$o;->b:Lax/d3/E;

    .line 60
    .line 61
    invoke-static {p1}, Lax/d3/E;->j5(Lax/d3/E;)V

    .line 62
    .line 63
    .line 64
    return v0
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
.end method
