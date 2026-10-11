.class Lcom/voxdon/xplorer/file/U$a;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Landroid/content/Context;

.field i:Lcom/voxdon/xplorer/file/c$a;

.field j:Lcom/voxdon/xplorer/file/U;

.field k:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/U;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 5

    .line 1
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/voxdon/xplorer/file/U$a;->i:Lcom/voxdon/xplorer/file/c$a;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/voxdon/xplorer/file/U$a;->j:Lcom/voxdon/xplorer/file/U;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/U$a;->w([Ljava/lang/String;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/U$a;->x(Ljava/lang/Boolean;)V

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

.method protected varargs w([Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 5

    .line 1
    :try_start_0
    invoke-static {}, Lax/Q2/o;->i()Lax/Q2/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/U$a;->h:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lax/Q2/o;->e(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lax/Q2/o;->i()Lax/Q2/o;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lax/Q2/o;->k()Lax/h5/e;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/file/U$a;->j:Lcom/voxdon/xplorer/file/U;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/U;->n0(Lax/h5/e;)V

    .line 21
    .line 22
    .line 23
    if-nez p1, :cond_1d

    .line 24
    .line 25
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_1b
    move-exception p1

    .line 29
    goto :goto_23

    .line 30
    :cond_1d
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1f
    .catch Lax/b3/C; {:try_start_0 .. :try_end_1f} :catch_47
    .catch Lax/b3/G; {:try_start_0 .. :try_end_1f} :catch_1b
    .catch Lax/b3/j; {:try_start_0 .. :try_end_1f} :catch_20

    .line 31
    .line 32
    return-object p1

    .line 33
    :catch_20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 34
    .line 35
    return-object p1

    .line 36
    :goto_23
    invoke-virtual {p1}, Lax/b3/G;->a()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const/4 v0, 0x7

    .line 41
    if-ne p1, v0, :cond_41

    .line 42
    .line 43
    iget-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->h:Landroid/content/Context;

    .line 44
    .line 45
    const v0, 0x7f13034f

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x1

    .line 53
    new-array v1, v1, [Ljava/lang/Object;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    aput-object v0, v1, v2

    .line 57
    .line 58
    const v0, 0x7f130348

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_42

    .line 66
    :cond_41
    const/4 p1, 0x0

    .line 67
    :goto_42
    iput-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->k:Ljava/lang/String;

    .line 68
    .line 69
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 70
    .line 71
    return-object p1

    .line 72
    :catch_47
    iget-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->h:Landroid/content/Context;

    .line 73
    .line 74
    const v0, 0x7f1303f6

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->k:Ljava/lang/String;

    .line 82
    .line 83
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    return-object p1
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

.method protected x(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/U$a;->i:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_1a

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_12

    .line 10
    .line 11
    iget-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->i:Lcom/voxdon/xplorer/file/c$a;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1, v0, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object p1, p0, Lcom/voxdon/xplorer/file/U$a;->i:Lcom/voxdon/xplorer/file/c$a;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iget-object v1, p0, Lcom/voxdon/xplorer/file/U$a;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-interface {p1, v0, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    return-void
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
