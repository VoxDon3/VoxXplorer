.class Lcom/voxdon/xplorer/file/b$f;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/voxdon/xplorer/file/b$e;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Lax/b0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/a<",
            "Lcom/voxdon/xplorer/file/b$e;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic j:Lcom/voxdon/xplorer/file/b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/b;Ljava/lang/String;Lax/b0/a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lax/b0/a<",
            "Lcom/voxdon/xplorer/file/b$e;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/b$f;->j:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->d0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/voxdon/xplorer/file/b$f;->h:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/voxdon/xplorer/file/b$f;->i:Lax/b0/a;

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
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/b$f;->w([Ljava/lang/String;)Lcom/voxdon/xplorer/file/b$e;

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
    check-cast p1, Lcom/voxdon/xplorer/file/b$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/b$f;->x(Lcom/voxdon/xplorer/file/b$e;)V

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

.method protected varargs w([Ljava/lang/String;)Lcom/voxdon/xplorer/file/b$e;
    .registers 6

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$f;->j:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->t0(Lcom/voxdon/xplorer/file/b;)Lax/Dc/T;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lax/Dc/S;->f()Ljava/util/Enumeration;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_a
    :goto_a
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4d

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/Dc/I;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/Dc/I;->o()Lax/Dc/j;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lax/Dc/j;->l()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_a

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    :try_start_21
    iget-object v2, p0, Lcom/voxdon/xplorer/file/b$f;->j:Lcom/voxdon/xplorer/file/b;

    .line 35
    .line 36
    invoke-static {v2}, Lcom/voxdon/xplorer/file/b;->t0(Lcom/voxdon/xplorer/file/b;)Lax/Dc/T;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, p0, Lcom/voxdon/xplorer/file/b$f;->h:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, v0, v3}, Lcom/voxdon/xplorer/file/b;->Q0(Lax/Dc/T;Lax/Dc/I;Ljava/lang/String;)Ljava/io/InputStream;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sget-object p1, Lcom/voxdon/xplorer/file/b$e;->q:Lcom/voxdon/xplorer/file/b$e;
    :try_end_2f
    .catch Lax/oc/a; {:try_start_21 .. :try_end_2f} :catch_35
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_2f} :catch_37
    .catch Lax/b3/j; {:try_start_21 .. :try_end_2f} :catch_37
    .catchall {:try_start_21 .. :try_end_2f} :catchall_33

    .line 47
    .line 48
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :catchall_33
    move-exception p1

    .line 53
    goto :goto_49

    .line 54
    :catch_35
    move-exception v0

    .line 55
    goto :goto_3b

    .line 56
    :catch_37
    :cond_37
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_a

    .line 60
    :goto_3b
    :try_start_3b
    invoke-virtual {v0}, Lax/oc/a;->a()Lax/oc/a$a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v2, Lax/oc/a$a;->q:Lax/oc/a$a;

    .line 65
    .line 66
    if-ne v0, v2, :cond_37

    .line 67
    .line 68
    sget-object p1, Lcom/voxdon/xplorer/file/b$e;->c0:Lcom/voxdon/xplorer/file/b$e;
    :try_end_45
    .catchall {:try_start_3b .. :try_end_45} :catchall_33

    .line 69
    .line 70
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :goto_49
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_4d
    sget-object p1, Lcom/voxdon/xplorer/file/b$e;->c0:Lcom/voxdon/xplorer/file/b$e;

    .line 79
    .line 80
    return-object p1
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

.method protected x(Lcom/voxdon/xplorer/file/b$e;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$f;->i:Lax/b0/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/b0/a;->accept(Ljava/lang/Object;)V

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
