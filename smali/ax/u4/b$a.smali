.class Lax/u4/b$a;
.super Lax/t4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/u4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/t4/b<",
        "Lax/u4/b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/t4/b;-><init>()V

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


# virtual methods
.method public bridge synthetic d(Lax/T4/j;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/t4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/u4/b$a;->m(Lax/T4/j;)Lax/u4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 22
.end method

.method public final m(Lax/T4/j;)Lax/u4/b;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/t4/a;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/t4/b;->b(Lax/T4/j;)Lax/T4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v2, v1

    .line 7
    :goto_6
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, Lax/T4/m;->p0:Lax/T4/m;

    .line 12
    .line 13
    if-ne v3, v4, :cond_42

    .line 14
    .line 15
    invoke-virtual {p1}, Lax/T4/j;->g()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 20
    .line 21
    .line 22
    :try_start_15
    const-string v4, "error"

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_28

    .line 29
    .line 30
    sget-object v4, Lax/t4/b;->h:Lax/t4/b;

    .line 31
    .line 32
    invoke-virtual {v4, p1, v3, v1}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_6

    .line 39
    :catch_26
    move-exception p1

    .line 40
    goto :goto_3d

    .line 41
    :cond_28
    const-string v4, "error_description"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_39

    .line 48
    .line 49
    sget-object v4, Lax/t4/b;->h:Lax/t4/b;

    .line 50
    .line 51
    invoke-virtual {v4, p1, v3, v2}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    goto :goto_6

    .line 58
    :cond_39
    invoke-static {p1}, Lax/t4/b;->k(Lax/T4/j;)V
    :try_end_3c
    .catch Lax/t4/a; {:try_start_15 .. :try_end_3c} :catch_26

    .line 59
    .line 60
    .line 61
    goto :goto_6

    .line 62
    :goto_3d
    invoke-virtual {p1, v3}, Lax/t4/a;->a(Ljava/lang/String;)Lax/t4/a;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    throw p1

    .line 67
    :cond_42
    invoke-static {p1}, Lax/t4/b;->a(Lax/T4/j;)V

    .line 68
    .line 69
    .line 70
    if-eqz v1, :cond_4d

    .line 71
    .line 72
    new-instance p1, Lax/u4/b;

    .line 73
    .line 74
    invoke-direct {p1, v1, v2}, Lax/u4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4d
    new-instance p1, Lax/t4/a;

    .line 79
    .line 80
    const-string v1, "missing field \"error\""

    .line 81
    .line 82
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 83
    .line 84
    .line 85
    throw p1
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
