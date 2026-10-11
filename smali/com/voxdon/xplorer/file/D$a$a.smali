.class Lcom/voxdon/xplorer/file/D$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/j3/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/D$a;->a(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/file/D$a;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/D$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

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
    iget-object v0, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/voxdon/xplorer/file/D$a;->e:Lcom/voxdon/xplorer/file/c$a;

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
    .registers 10

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
    const-string v0, "user"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const-string v0, "password"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-string v0, "invalid_cert"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-eqz v5, :cond_27

    .line 27
    .line 28
    const-string p1, "@"

    .line 29
    .line 30
    invoke-virtual {v5, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_27

    .line 35
    .line 36
    const-string p1, ""

    .line 37
    .line 38
    move-object v6, p1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    move-object v6, v5

    .line 41
    :goto_28
    iget-object p1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/voxdon/xplorer/file/D$a;->f:Lcom/voxdon/xplorer/file/D;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lcom/voxdon/xplorer/file/D;->a1(Landroid/content/Context;)Lcom/voxdon/xplorer/file/D$c;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object p1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 54
    .line 55
    iget v2, p1, Lcom/voxdon/xplorer/file/D$a;->c:I

    .line 56
    .line 57
    iget-object v3, p1, Lcom/voxdon/xplorer/file/D$a;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual/range {v1 .. v7}, Lcom/voxdon/xplorer/file/D$c;->m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 63
    .line 64
    iget-object p1, p1, Lcom/voxdon/xplorer/file/D$a;->d:Landroidx/fragment/app/Fragment;

    .line 65
    .line 66
    instance-of v0, p1, Lax/d3/W;

    .line 67
    .line 68
    if-eqz v0, :cond_4a

    .line 69
    .line 70
    check-cast p1, Lax/d3/W;

    .line 71
    .line 72
    invoke-virtual {p1}, Lax/d3/a;->ua()V

    .line 73
    .line 74
    .line 75
    :cond_4a
    iget-object p1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 76
    .line 77
    iget-object v0, p1, Lcom/voxdon/xplorer/file/D$a;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 78
    .line 79
    if-eqz v0, :cond_7f

    .line 80
    .line 81
    iget-object p1, p1, Lcom/voxdon/xplorer/file/D$a;->f:Lcom/voxdon/xplorer/file/D;

    .line 82
    .line 83
    new-instance v0, Lcom/voxdon/xplorer/file/D$b;

    .line 84
    .line 85
    iget-object v1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 86
    .line 87
    iget-object v1, v1, Lcom/voxdon/xplorer/file/D$a;->f:Lcom/voxdon/xplorer/file/D;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v2, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 94
    .line 95
    move-object v3, v2

    .line 96
    iget-object v2, v3, Lcom/voxdon/xplorer/file/D$a;->a:Landroid/app/Activity;

    .line 97
    .line 98
    move-object v4, v3

    .line 99
    iget-object v3, v4, Lcom/voxdon/xplorer/file/D$a;->d:Landroidx/fragment/app/Fragment;

    .line 100
    .line 101
    iget-object v4, v4, Lcom/voxdon/xplorer/file/D$a;->f:Lcom/voxdon/xplorer/file/D;

    .line 102
    .line 103
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    iget-object v6, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 108
    .line 109
    iget-object v6, v6, Lcom/voxdon/xplorer/file/D$a;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 110
    .line 111
    invoke-direct/range {v0 .. v6}, Lcom/voxdon/xplorer/file/D$b;-><init>(Landroid/content/Context;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/D;ILcom/voxdon/xplorer/file/c$a;)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p1, Lcom/voxdon/xplorer/file/W;->o:Lax/u3/q;

    .line 115
    .line 116
    iget-object p1, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 117
    .line 118
    iget-object p1, p1, Lcom/voxdon/xplorer/file/D$a;->f:Lcom/voxdon/xplorer/file/D;

    .line 119
    .line 120
    iget-object p1, p1, Lcom/voxdon/xplorer/file/W;->o:Lax/u3/q;

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    new-array v0, v0, [Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 126
    .line 127
    .line 128
    :cond_7f
    return-void
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
    invoke-static {}, Lcom/voxdon/xplorer/file/D;->T0()Ljava/util/logging/Logger;

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
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/voxdon/xplorer/file/D$a$a;->a:Lcom/voxdon/xplorer/file/D$a;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/voxdon/xplorer/file/D$a;->e:Lcom/voxdon/xplorer/file/c$a;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-interface {v0, v1, p1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
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
