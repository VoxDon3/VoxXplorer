.class Lcom/voxdon/xplorer/widget/PathBar$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/PathBar;->k(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/widget/PathBar;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/PathBar;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$c;->a:Lcom/voxdon/xplorer/widget/PathBar;

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
.method public onClick(Landroid/view/View;)V
    .registers 5

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$c;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/PathBar;->c(Lcom/voxdon/xplorer/widget/PathBar;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/widget/PathBar;->d(Lcom/voxdon/xplorer/widget/PathBar;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const-string v0, "pathbar_up"

    .line 12
    .line 13
    if-eqz p1, :cond_1e

    .line 14
    .line 15
    invoke-static {}, Lax/t3/k;->K()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1e

    .line 20
    .line 21
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$c;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/PathBar;->b(Lcom/voxdon/xplorer/widget/PathBar;)Lcom/voxdon/xplorer/widget/PathBar$h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1, v0}, Lcom/voxdon/xplorer/widget/PathBar$h;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$c;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/PathBar;->b(Lcom/voxdon/xplorer/widget/PathBar;)Lcom/voxdon/xplorer/widget/PathBar$h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/PathBar$c;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/voxdon/xplorer/widget/PathBar;->e(Lcom/voxdon/xplorer/widget/PathBar;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p1, v1}, Lcom/voxdon/xplorer/widget/PathBar$h;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v1, "navigation"

    .line 51
    .line 52
    const-string v2, "open_folder_back"

    .line 53
    .line 54
    invoke-virtual {p1, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/PathBar$c;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 59
    .line 60
    invoke-static {v1}, Lcom/voxdon/xplorer/widget/PathBar;->a(Lcom/voxdon/xplorer/widget/PathBar;)Lax/c3/K;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "loc"

    .line 73
    .line 74
    invoke-virtual {p1, v2, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v1, "by"

    .line 79
    .line 80
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 85
    .line 86
    .line 87
    return-void
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
