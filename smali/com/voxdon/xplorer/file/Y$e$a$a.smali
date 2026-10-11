.class Lcom/voxdon/xplorer/file/Y$e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/j3/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/Y$e$a;->a(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/file/Y$e$a;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/Y$e$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Y$e$a$a;->a:Lcom/voxdon/xplorer/file/Y$e$a;

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
    .registers 1

    .line 1
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .registers 8

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
    if-eqz p1, :cond_36

    .line 25
    .line 26
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$e$a$a;->a:Lcom/voxdon/xplorer/file/Y$e$a;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/voxdon/xplorer/file/Y$e$a;->c:Lcom/voxdon/xplorer/file/Y$e;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/Y$e;->l()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Y$e$a$a;->a:Lcom/voxdon/xplorer/file/Y$e$a;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/voxdon/xplorer/file/Y$e$a;->c:Lcom/voxdon/xplorer/file/Y$e;

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    invoke-virtual {v1, p1, v0, v2}, Lcom/voxdon/xplorer/file/Y$e;->n(ILjava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Y$e$a$a;->a:Lcom/voxdon/xplorer/file/Y$e$a;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/voxdon/xplorer/file/Y$e$a;->b:Lax/g3/k;

    .line 46
    .line 47
    if-eqz v0, :cond_50

    .line 48
    .line 49
    sget-object v1, Lax/Q2/f;->Q0:Lax/Q2/f;

    .line 50
    .line 51
    invoke-interface {v0, v1, p1}, Lax/g3/k;->c(Lax/Q2/f;I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    invoke-static {}, Lcom/voxdon/xplorer/file/Y;->k0()Ljava/util/logging/Logger;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "OAUTH : FAILED TO RECEIVE ACCESS TOKEN"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$e$a$a;->a:Lcom/voxdon/xplorer/file/Y$e$a;

    .line 65
    .line 66
    iget-object v0, p1, Lcom/voxdon/xplorer/file/Y$e$a;->b:Lax/g3/k;

    .line 67
    .line 68
    if-eqz v0, :cond_50

    .line 69
    .line 70
    sget-object v1, Lax/Q2/f;->Q0:Lax/Q2/f;

    .line 71
    .line 72
    const-string v4, ""

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    const-string v2, ""

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-interface/range {v0 .. v5}, Lax/g3/k;->a(Lax/Q2/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_50
    return-void
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

.method public c(Lax/j3/c;)V
    .registers 8

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
    const-string v2, "OAUTH ERROR :"

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
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Y$e$a$a;->a:Lcom/voxdon/xplorer/file/Y$e$a;

    .line 30
    .line 31
    iget-object v0, p1, Lcom/voxdon/xplorer/file/Y$e$a;->b:Lax/g3/k;

    .line 32
    .line 33
    if-eqz v0, :cond_2d

    .line 34
    .line 35
    sget-object v1, Lax/Q2/f;->Q0:Lax/Q2/f;

    .line 36
    .line 37
    const-string v4, ""

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const-string v2, ""

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-interface/range {v0 .. v5}, Lax/g3/k;->a(Lax/Q2/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    return-void
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
