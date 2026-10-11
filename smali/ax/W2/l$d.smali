.class Lax/W2/l$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/l;


# direct methods
.method public constructor <init>(Lax/W2/l;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/l$d;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/l$d;->x(Ljava/lang/Boolean;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/l$d;->y(Ljava/lang/Boolean;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 4

    .line 1
    :try_start_0
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 2
    .line 3
    invoke-static {p1}, Lax/W2/l;->B0(Lax/W2/l;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1e

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 22
    .line 23
    iget-object v1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 24
    .line 25
    invoke-static {v1, v0, p0}, Lax/W2/l;->C0(Lax/W2/l;Lcom/voxdon/xplorer/file/n;Lax/u3/c;)V

    .line 26
    .line 27
    .line 28
    goto :goto_a

    .line 29
    :catch_1c
    move-exception p1

    .line 30
    goto :goto_21

    .line 31
    :cond_1e
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_20
    .catch Lax/b3/a; {:try_start_0 .. :try_end_20} :catch_24
    .catch Lax/b3/j; {:try_start_0 .. :try_end_20} :catch_1c

    .line 32
    .line 33
    return-object p1

    .line 34
    :goto_21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    :catch_24
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    return-object p1
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

.method protected x(Ljava/lang/Boolean;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->g0()V

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

.method protected y(Ljava/lang/Boolean;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 2
    .line 3
    invoke-static {v0}, Lax/W2/l;->w0(Lax/W2/l;)Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_3c

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_3c

    .line 14
    .line 15
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/W2/j;->k0()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 21
    .line 22
    invoke-static {p1}, Lax/W2/l;->w0(Lax/W2/l;)Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_25

    .line 31
    .line 32
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 33
    .line 34
    invoke-static {p1}, Lax/W2/l;->D0(Lax/W2/l;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 39
    .line 40
    new-instance v0, Lax/W2/l$c;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lax/W2/l$c;-><init>(Lax/W2/l;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, Lax/W2/l;->A0(Lax/W2/l;Lax/W2/l$c;)Lax/W2/l$c;

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 49
    .line 50
    invoke-static {p1}, Lax/W2/l;->z0(Lax/W2/l;)Lax/W2/l$c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/4 v0, 0x0

    .line 55
    new-array v0, v0, [Ljava/lang/Void;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3c
    iget-object p1, p0, Lax/W2/l$d;->h:Lax/W2/l;

    .line 62
    .line 63
    invoke-virtual {p1}, Lax/W2/j;->o()V

    .line 64
    .line 65
    .line 66
    return-void
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
