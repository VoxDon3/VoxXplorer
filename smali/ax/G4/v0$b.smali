.class Lax/G4/v0$b;
.super Lax/v4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/f<",
        "Lax/G4/v0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/v0$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/v0$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/v0$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/v0$b;->b:Lax/G4/v0$b;

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
    invoke-direct {p0}, Lax/v4/f;-><init>()V

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
.method public bridge synthetic a(Lax/T4/j;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/G4/v0$b;->s(Lax/T4/j;)Lax/G4/v0;

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

.method public bridge synthetic k(Ljava/lang/Object;Lax/T4/g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    check-cast p1, Lax/G4/v0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/G4/v0$b;->t(Lax/G4/v0;Lax/T4/g;)V

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
.end method

.method public s(Lax/T4/j;)Lax/G4/v0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/T4/m;->r0:Lax/T4/m;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v1, :cond_12

    .line 9
    .line 10
    invoke-static {p1}, Lax/v4/c;->i(Lax/T4/j;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_1a

    .line 19
    :cond_12
    invoke-static {p1}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_1a
    if-eqz v0, :cond_66

    .line 28
    .line 29
    const-string v3, "path"

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2f

    .line 36
    .line 37
    sget-object v0, Lax/G4/P0$a;->b:Lax/G4/P0$a;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v2}, Lax/G4/P0$a;->u(Lax/T4/j;Z)Lax/G4/P0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lax/G4/v0;->e(Lax/G4/P0;)Lax/G4/v0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_5d

    .line 48
    :cond_2f
    const-string v2, "properties_error"

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_45

    .line 55
    .line 56
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lax/E4/b$b;->b:Lax/E4/b$b;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lax/E4/b$b;->s(Lax/T4/j;)Lax/E4/b;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lax/G4/v0;->f(Lax/E4/b;)Lax/G4/v0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_5d

    .line 70
    :cond_45
    const-string v2, "payload_too_large"

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_50

    .line 77
    .line 78
    sget-object v0, Lax/G4/v0;->d:Lax/G4/v0;

    .line 79
    .line 80
    goto :goto_5d

    .line 81
    :cond_50
    const-string v2, "content_hash_mismatch"

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_5b

    .line 88
    .line 89
    sget-object v0, Lax/G4/v0;->e:Lax/G4/v0;

    .line 90
    .line 91
    goto :goto_5d

    .line 92
    :cond_5b
    sget-object v0, Lax/G4/v0;->f:Lax/G4/v0;

    .line 93
    .line 94
    :goto_5d
    if-nez v1, :cond_65

    .line 95
    .line 96
    invoke-static {p1}, Lax/v4/c;->n(Lax/T4/j;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 100
    .line 101
    .line 102
    :cond_65
    return-object v0

    .line 103
    :cond_66
    new-instance v0, Lax/T4/i;

    .line 104
    .line 105
    const-string v1, "Required field missing: .tag"

    .line 106
    .line 107
    invoke-direct {v0, p1, v1}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v0
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

.method public t(Lax/G4/v0;Lax/T4/g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/G4/v0$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/G4/v0;->g()Lax/G4/v0$c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_42

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_2a

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    if-eq v0, p1, :cond_24

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    if-eq v0, p1, :cond_1e

    .line 24
    .line 25
    const-string p1, "other"

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    const-string p1, "content_hash_mismatch"

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    const-string p1, "payload_too_large"

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 44
    .line 45
    .line 46
    const-string v0, "properties_error"

    .line 47
    .line 48
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lax/E4/b$b;->b:Lax/E4/b$b;

    .line 55
    .line 56
    invoke-static {p1}, Lax/G4/v0;->b(Lax/G4/v0;)Lax/E4/b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1, p2}, Lax/E4/b$b;->t(Lax/E4/b;Lax/T4/g;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_42
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 68
    .line 69
    .line 70
    const-string v0, "path"

    .line 71
    .line 72
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lax/G4/P0$a;->b:Lax/G4/P0$a;

    .line 76
    .line 77
    invoke-static {p1}, Lax/G4/v0;->a(Lax/G4/v0;)Lax/G4/P0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1, p2, v1}, Lax/G4/P0$a;->v(Lax/G4/P0;Lax/T4/g;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 85
    .line 86
    .line 87
    return-void
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
.end method
