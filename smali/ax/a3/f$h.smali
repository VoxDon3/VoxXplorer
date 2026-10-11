.class Lax/a3/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/p$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/f;->S3(Lax/W2/m;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/W2/m;

.field final synthetic b:Lax/d3/n;

.field final synthetic c:Lax/a3/f;


# direct methods
.method constructor <init>(Lax/a3/f;Lax/W2/m;Lax/d3/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/a3/f$h;->c:Lax/a3/f;

    .line 2
    .line 3
    iput-object p2, p0, Lax/a3/f$h;->a:Lax/W2/m;

    .line 4
    .line 5
    iput-object p3, p0, Lax/a3/f$h;->b:Lax/d3/n;

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
    .registers 5

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
    iget-object v0, p0, Lax/a3/f$h;->c:Lax/a3/f;

    .line 11
    .line 12
    invoke-static {v0}, Lax/a3/f;->A3(Lax/a3/f;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_3e

    .line 17
    .line 18
    iget-object v0, p0, Lax/a3/f$h;->a:Lax/W2/m;

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/W2/m;->m()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lax/a3/f$h;->c:Lax/a3/f;

    .line 29
    .line 30
    invoke-static {v1}, Lax/a3/f;->A3(Lax/a3/f;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3e

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_25

    .line 59
    .line 60
    sget-object p1, Lax/a3/l;->c0:Lax/a3/l;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3e
    iget-object v0, p0, Lax/a3/f$h;->a:Lax/W2/m;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lax/W2/m;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :try_start_43
    iget-object p1, p0, Lax/a3/f$h;->b:Lax/d3/n;

    .line 69
    .line 70
    iget-object v0, p0, Lax/a3/f$h;->a:Lax/W2/m;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {p1, v0, v1}, Lax/d3/n;->l(Lax/W2/h;Z)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lax/a3/l;->q:Lax/a3/l;
    :try_end_4d
    .catch Lax/b3/c; {:try_start_43 .. :try_end_4d} :catch_4e

    .line 77
    .line 78
    return-object p1

    .line 79
    :catch_4e
    sget-object p1, Lax/a3/l;->d0:Lax/a3/l;

    .line 80
    .line 81
    return-object p1
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
