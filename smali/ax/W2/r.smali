.class public Lax/W2/r;
.super Lax/W2/h;
.source "SourceFile"


# instance fields
.field private d:Lcom/voxdon/xplorer/file/o;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/h;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public static l()Lax/W2/r;
    .registers 1

    .line 1
    new-instance v0, Lax/W2/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/W2/r;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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
.end method


# virtual methods
.method protected b()Lax/W2/j;
    .registers 6

    .line 1
    new-instance v0, Lax/W2/s;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/W2/h;->f()Lax/W2/h$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lax/W2/r;->d:Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    iget-object v3, p0, Lax/W2/r;->e:Ljava/util/List;

    .line 10
    .line 11
    iget-boolean v4, p0, Lax/W2/r;->f:Z

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Lax/W2/s;-><init>(Lax/W2/h$a;Lcom/voxdon/xplorer/file/o;Ljava/util/List;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public k(Lcom/voxdon/xplorer/file/o;Ljava/util/List;ZLax/W2/h$a;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z",
            "Lax/W2/h$a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/W2/r;->d:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {p0, p4}, Lax/W2/h;->i(Lax/W2/h$a;)V

    .line 4
    .line 5
    .line 6
    new-instance p4, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p4, p0, Lax/W2/r;->e:Ljava/util/List;

    .line 12
    .line 13
    iput-boolean p3, p0, Lax/W2/r;->f:Z

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :goto_12
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_65

    .line 24
    .line 25
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    check-cast p4, Lcom/voxdon/xplorer/file/n;

    .line 30
    .line 31
    if-eqz p4, :cond_26

    .line 32
    .line 33
    iget-object v0, p0, Lax/W2/r;->e:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_12

    .line 39
    :cond_26
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    invoke-virtual {p4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    const-string v0, "FileInfo == null"

    .line 48
    .line 49
    invoke-virtual {p4, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    invoke-virtual {p4}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v1, "Location:"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ",size:"

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p4, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    invoke-virtual {p4}, Lax/Ha/b;->h()V

    .line 99
    .line 100
    .line 101
    goto :goto_12

    .line 102
    :cond_65
    sget-object p1, Lax/W2/h$c;->c0:Lax/W2/h$c;

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lax/W2/h;->j(Lax/W2/h$c;)V

    .line 105
    .line 106
    .line 107
    return-void
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
