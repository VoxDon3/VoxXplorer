.class Lcom/voxdon/xplorer/widget/PathBar$a;
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
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$a;->a:Lcom/voxdon/xplorer/widget/PathBar;

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
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "navigation"

    .line 6
    .line 7
    const-string v1, "open_folder_back"

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PathBar$a;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/PathBar;->a(Lcom/voxdon/xplorer/widget/PathBar;)Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "loc"

    .line 28
    .line 29
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "by"

    .line 34
    .line 35
    const-string v1, "pathbar_root"

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$a;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/PathBar;->b(Lcom/voxdon/xplorer/widget/PathBar;)Lcom/voxdon/xplorer/widget/PathBar$h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PathBar$a;->a:Lcom/voxdon/xplorer/widget/PathBar;

    .line 51
    .line 52
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/PathBar;->a(Lcom/voxdon/xplorer/widget/PathBar;)Lax/c3/K;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {p1, v0}, Lcom/voxdon/xplorer/widget/PathBar$h;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
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
.end method
