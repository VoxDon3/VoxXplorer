.class Lax/W2/z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/c$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/W2/z;->p(Lax/d3/s;Lax/W2/z;Lax/W2/z$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lax/W2/z$c;

.field final synthetic c:Lax/W2/z;

.field final synthetic d:Lax/d3/s;


# direct methods
.method constructor <init>(Ljava/util/List;Lax/W2/z$c;Lax/W2/z;Lax/d3/s;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/W2/z$a;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lax/W2/z$a;->b:Lax/W2/z$c;

    .line 4
    .line 5
    iput-object p3, p0, Lax/W2/z$a;->c:Lax/W2/z;

    .line 6
    .line 7
    iput-object p4, p0, Lax/W2/z$a;->d:Lax/d3/s;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
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


# virtual methods
.method public a(Ljava/util/List;)Lax/a3/l;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lax/a3/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/W2/z$a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eq v0, v1, :cond_12

    .line 12
    .line 13
    invoke-static {}, Lax/u3/b;->f()V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lax/a3/l;->d0:Lax/a3/l;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    :goto_13
    iget-object v1, p0, Lax/W2/z$a;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ge v0, v1, :cond_49

    .line 27
    .line 28
    iget-object v1, p0, Lax/W2/z$a;->a:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 35
    .line 36
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1, v2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v4, p0, Lax/W2/z$a;->b:Lax/W2/z$c;

    .line 55
    .line 56
    invoke-interface {v4, v1}, Lax/W2/z$c;->a(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_46

    .line 61
    .line 62
    invoke-static {v3, v2}, Lax/c3/d0;->F(Ljava/lang/String;Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_46

    .line 67
    .line 68
    sget-object p1, Lax/a3/l;->c0:Lax/a3/l;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_46
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_13

    .line 74
    :cond_49
    iget-object v0, p0, Lax/W2/z$a;->c:Lax/W2/z;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Lax/W2/z;->r(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    :try_start_4e
    iget-object p1, p0, Lax/W2/z$a;->d:Lax/d3/s;

    .line 80
    .line 81
    iget-object v0, p0, Lax/W2/z$a;->c:Lax/W2/z;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-interface {p1, v0, v1}, Lax/d3/s;->l(Lax/W2/h;Z)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lax/a3/l;->q:Lax/a3/l;
    :try_end_58
    .catch Lax/b3/c; {:try_start_4e .. :try_end_58} :catch_59

    .line 88
    .line 89
    return-object p1

    .line 90
    :catch_59
    sget-object p1, Lax/a3/l;->d0:Lax/a3/l;

    .line 91
    .line 92
    return-object p1
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
