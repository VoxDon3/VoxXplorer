.class Lax/p4/g$a;
.super Lax/t4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/t4/b<",
        "Lax/p4/g;",
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
    invoke-virtual {p0, p1}, Lax/p4/g$a;->m(Lax/T4/j;)Lax/p4/g;

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

.method public final m(Lax/T4/j;)Lax/p4/g;
    .registers 8
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
    move-object v3, v2

    .line 8
    :goto_7
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    sget-object v5, Lax/T4/m;->p0:Lax/T4/m;

    .line 13
    .line 14
    if-ne v4, v5, :cond_54

    .line 15
    .line 16
    invoke-virtual {p1}, Lax/T4/j;->g()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 21
    .line 22
    .line 23
    :try_start_16
    const-string v5, "key"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_29

    .line 30
    .line 31
    sget-object v5, Lax/p4/g;->e:Lax/t4/b;

    .line 32
    .line 33
    invoke-virtual {v5, p1, v4, v1}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_7

    .line 40
    :catch_27
    move-exception p1

    .line 41
    goto :goto_4f

    .line 42
    :cond_29
    const-string v5, "secret"

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_3a

    .line 49
    .line 50
    sget-object v5, Lax/p4/g;->f:Lax/t4/b;

    .line 51
    .line 52
    invoke-virtual {v5, p1, v4, v3}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_7

    .line 59
    :cond_3a
    const-string v5, "host"

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_4b

    .line 66
    .line 67
    sget-object v5, Lax/p4/k;->f:Lax/t4/b;

    .line 68
    .line 69
    invoke-virtual {v5, p1, v4, v2}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lax/p4/k;

    .line 74
    .line 75
    goto :goto_7

    .line 76
    :cond_4b
    invoke-static {p1}, Lax/t4/b;->k(Lax/T4/j;)V
    :try_end_4e
    .catch Lax/t4/a; {:try_start_16 .. :try_end_4e} :catch_27

    .line 77
    .line 78
    .line 79
    goto :goto_7

    .line 80
    :goto_4f
    invoke-virtual {p1, v4}, Lax/t4/a;->a(Ljava/lang/String;)Lax/t4/a;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    throw p1

    .line 85
    :cond_54
    invoke-static {p1}, Lax/t4/b;->a(Lax/T4/j;)V

    .line 86
    .line 87
    .line 88
    if-eqz v1, :cond_63

    .line 89
    .line 90
    if-nez v2, :cond_5d

    .line 91
    .line 92
    sget-object v2, Lax/p4/k;->e:Lax/p4/k;

    .line 93
    .line 94
    :cond_5d
    new-instance p1, Lax/p4/g;

    .line 95
    .line 96
    invoke-direct {p1, v1, v3, v2}, Lax/p4/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/k;)V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_63
    new-instance p1, Lax/t4/a;

    .line 101
    .line 102
    const-string v1, "missing field \"key\""

    .line 103
    .line 104
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 105
    .line 106
    .line 107
    throw p1
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
