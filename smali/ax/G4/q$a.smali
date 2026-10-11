.class Lax/G4/q$a;
.super Lax/v4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/e<",
        "Lax/G4/q;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/q$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/q$a;->b:Lax/G4/q$a;

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
.end method

.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/v4/e;-><init>()V

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
.method public bridge synthetic s(Lax/T4/j;Z)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/G4/q$a;->u(Lax/T4/j;Z)Lax/G4/q;

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
.end method

.method public bridge synthetic t(Ljava/lang/Object;Lax/T4/g;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    check-cast p1, Lax/G4/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lax/G4/q$a;->v(Lax/G4/q;Lax/T4/g;Z)V

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

.method public u(Lax/T4/j;Z)Lax/G4/q;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_b

    .line 3
    .line 4
    invoke-static {p1}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    move-object v1, v0

    .line 13
    :goto_c
    if-nez v1, :cond_66

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    :goto_f
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Lax/T4/m;->p0:Lax/T4/m;

    .line 21
    .line 22
    if-ne v2, v3, :cond_54

    .line 23
    .line 24
    invoke-virtual {p1}, Lax/T4/j;->g()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 29
    .line 30
    .line 31
    const-string v3, "export_as"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_35

    .line 38
    .line 39
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p1}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_f

    .line 54
    :cond_35
    const-string v3, "export_options"

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_50

    .line 61
    .line 62
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1, p1}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Ljava/util/List;

    .line 79
    .line 80
    goto :goto_f

    .line 81
    :cond_50
    invoke-static {p1}, Lax/v4/c;->o(Lax/T4/j;)V

    .line 82
    .line 83
    .line 84
    goto :goto_f

    .line 85
    :cond_54
    new-instance v2, Lax/G4/q;

    .line 86
    .line 87
    invoke-direct {v2, v0, v1}, Lax/G4/q;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    if-nez p2, :cond_5e

    .line 91
    .line 92
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 93
    .line 94
    .line 95
    :cond_5e
    invoke-virtual {v2}, Lax/G4/q;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {v2, p1}, Lax/v4/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_66
    new-instance p2, Lax/T4/i;

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v2, "No subtype found that matches tag: \""

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v1, "\""

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {p2, p1, v0}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p2
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public v(Lax/G4/q;Lax/T4/g;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    if-nez p3, :cond_5

    .line 2
    .line 3
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 4
    .line 5
    .line 6
    :cond_5
    iget-object v0, p1, Lax/G4/q;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1b

    .line 9
    .line 10
    const-string v0, "export_as"

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p1, Lax/G4/q;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iget-object v0, p1, Lax/G4/q;->b:Ljava/util/List;

    .line 29
    .line 30
    if-eqz v0, :cond_35

    .line 31
    .line 32
    const-string v0, "export_options"

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object p1, p1, Lax/G4/q;->b:Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 52
    .line 53
    .line 54
    :cond_35
    if-nez p3, :cond_3a

    .line 55
    .line 56
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return-void
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
