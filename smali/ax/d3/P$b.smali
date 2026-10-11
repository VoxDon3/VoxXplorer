.class Lax/d3/P$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/p$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/P;->P9(Lax/W2/m;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/W2/m;

.field final synthetic b:Z

.field final synthetic c:Lax/d3/P;


# direct methods
.method constructor <init>(Lax/d3/P;Lax/W2/m;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/P$b;->a:Lax/W2/m;

    .line 4
    .line 5
    iput-boolean p3, p0, Lax/d3/P$b;->b:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a(Ljava/lang/String;)Lax/a3/l;
    .registers 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/d3/P$b;->a:Lax/W2/m;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/W2/m;->m()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 21
    .line 22
    invoke-virtual {v1}, Lax/d3/E;->C3()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_28

    .line 27
    .line 28
    iget-object v1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 29
    .line 30
    iget-object v1, v1, Lax/d3/E;->c1:Lcom/voxdon/xplorer/widget/a;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/widget/a;->X(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_28

    .line 37
    .line 38
    sget-object p1, Lax/a3/l;->c0:Lax/a3/l;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_28
    :try_start_28
    iget-object v1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 42
    .line 43
    invoke-virtual {v1}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_32
    .catch Lax/b3/j; {:try_start_28 .. :try_end_32} :catch_33

    .line 51
    goto :goto_34

    .line 52
    :catch_33
    const/4 v0, 0x0

    .line 53
    :goto_34
    if-eqz v0, :cond_5c

    .line 54
    .line 55
    invoke-interface {v0}, Lax/c3/b;->n()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_5c

    .line 60
    .line 61
    iget-boolean v1, p0, Lax/d3/P$b;->b:Z

    .line 62
    .line 63
    if-eqz v1, :cond_5c

    .line 64
    .line 65
    iget-object p1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 66
    .line 67
    invoke-virtual {p1}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/voxdon/xplorer/file/u;

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/u;->U1(Lcom/voxdon/xplorer/file/n;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 81
    .line 82
    invoke-static {p1, v0}, Lax/d3/P;->ta(Lax/d3/P;Lcom/voxdon/xplorer/file/n;)Z

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 86
    .line 87
    invoke-virtual {p1}, Lax/d3/E;->j9()V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lax/a3/l;->q:Lax/a3/l;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_5c
    iget-object v0, p0, Lax/d3/P$b;->a:Lax/W2/m;

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Lax/W2/m;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :try_start_61
    iget-object p1, p0, Lax/d3/P$b;->c:Lax/d3/P;

    .line 99
    .line 100
    iget-object v0, p0, Lax/d3/P$b;->a:Lax/W2/m;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-virtual {p1, v0, v1}, Lax/d3/E;->l(Lax/W2/h;Z)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lax/a3/l;->q:Lax/a3/l;
    :try_end_6b
    .catch Lax/b3/c; {:try_start_61 .. :try_end_6b} :catch_6c

    .line 107
    .line 108
    return-object p1

    .line 109
    :catch_6c
    sget-object p1, Lax/a3/l;->d0:Lax/a3/l;

    .line 110
    .line 111
    return-object p1
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
