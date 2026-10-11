.class Lcom/voxdon/xplorer/file/Y$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/j3/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/Y$c;->a(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/file/Y$c;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/Y$c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

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
.method public a()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/voxdon/xplorer/file/Y$c;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-interface {v0, v1, v2}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public b(Landroid/os/Bundle;)V
    .registers 11

    .line 1
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 6
    .line 7
    .line 8
    const-string v0, "access_token"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "expires_in"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/Y;->u0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz p1, :cond_61

    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/voxdon/xplorer/file/Y$c;->f:Lcom/voxdon/xplorer/file/Y;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lcom/voxdon/xplorer/file/Y;->t0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/Y$e;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v2, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 40
    .line 41
    iget v2, v2, Lcom/voxdon/xplorer/file/Y$c;->c:I

    .line 42
    .line 43
    const-string v3, ""

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0, v3}, Lcom/voxdon/xplorer/file/Y$e;->n(ILjava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/voxdon/xplorer/file/Y$c;->f:Lcom/voxdon/xplorer/file/Y;

    .line 51
    .line 52
    new-instance v2, Lcom/voxdon/xplorer/file/Y$d;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/voxdon/xplorer/file/Y$c;->f:Lcom/voxdon/xplorer/file/Y;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 63
    .line 64
    iget-object v4, v0, Lcom/voxdon/xplorer/file/Y$c;->a:Landroid/app/Activity;

    .line 65
    .line 66
    iget-object v5, v0, Lcom/voxdon/xplorer/file/Y$c;->d:Landroidx/fragment/app/Fragment;

    .line 67
    .line 68
    iget-object v6, v0, Lcom/voxdon/xplorer/file/Y$c;->f:Lcom/voxdon/xplorer/file/Y;

    .line 69
    .line 70
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 75
    .line 76
    iget-object v8, v0, Lcom/voxdon/xplorer/file/Y$c;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 77
    .line 78
    invoke-direct/range {v2 .. v8}, Lcom/voxdon/xplorer/file/Y$d;-><init>(Landroid/content/Context;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/Y;ILcom/voxdon/xplorer/file/c$a;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v2}, Lcom/voxdon/xplorer/file/Y;->m0(Lcom/voxdon/xplorer/file/Y;Lax/u3/q;)Lax/u3/q;

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/voxdon/xplorer/file/Y$c;->f:Lcom/voxdon/xplorer/file/Y;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/voxdon/xplorer/file/Y;->l0(Lcom/voxdon/xplorer/file/Y;)Lax/u3/q;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-array v0, v1, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_61
    invoke-static {}, Lcom/voxdon/xplorer/file/Y;->k0()Ljava/util/logging/Logger;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "OAUTH : FAILED TO RECEIVE ACCESS TOKEN 2"

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 108
    .line 109
    iget-object p1, p1, Lcom/voxdon/xplorer/file/Y$c;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-interface {p1, v1, v0}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-void
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

.method public c(Lax/j3/c;)V
    .registers 5

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/file/Y;->k0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "OAUTH ERROR 2:"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$c$a;->a:Lcom/voxdon/xplorer/file/Y$c;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/voxdon/xplorer/file/Y$c;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-interface {p1, v0, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
.end method
