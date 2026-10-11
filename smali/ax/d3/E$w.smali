.class Lax/d3/E$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->o8(Lax/c3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E$w;->a:Lax/d3/E;

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
.method public a(Lax/c3/k;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/E$w;->a:Lax/d3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_60

    .line 10
    :cond_9
    invoke-static {p1}, Lax/c3/A;->Q(Lcom/voxdon/xplorer/file/n;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_15

    .line 15
    .line 16
    iget-object v0, p0, Lax/d3/E$w;->a:Lax/d3/E;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lax/d3/E;->r5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    invoke-static {p1}, Lax/c3/u;->g(Lax/c3/k;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v1, v2, v3}, Lax/c3/u;->n(Landroid/net/Uri;Ljava/lang/String;ZZ)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lax/d3/E$w;->a:Lax/d3/E;

    .line 37
    .line 38
    invoke-virtual {v1}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "com.google.android.packageinstaller"

    .line 43
    .line 44
    invoke-static {v1, v2}, Lax/u3/B;->L(Landroid/content/Context;Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3e

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lax/d3/E$w;->a:Lax/d3/E;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {v1, v0, v3, v3, p1}, Lax/d3/E;->s5(Lax/d3/E;Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3e
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4e

    .line 68
    .line 69
    iget-object v0, p0, Lax/d3/E$w;->a:Lax/d3/E;

    .line 70
    .line 71
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v0, p1, v1, v3}, Lax/d3/E;->u5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    invoke-static {p1}, Lax/c3/B;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_60

    .line 84
    .line 85
    iget-object v0, p0, Lax/d3/E$w;->a:Lax/d3/E;

    .line 86
    .line 87
    move-object v1, p1

    .line 88
    check-cast v1, Lcom/voxdon/xplorer/file/i;

    .line 89
    .line 90
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v0, v1, p1, v3}, Lax/d3/E;->v5(Lax/d3/E;Lcom/voxdon/xplorer/file/i;Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    return-void
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
