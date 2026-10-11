.class Lax/G4/a0$b;
.super Lax/v4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/f<",
        "Lax/G4/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/a0$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/a0$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/a0$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/a0$b;->b:Lax/G4/a0$b;

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
    invoke-virtual {p0, p1}, Lax/G4/a0$b;->s(Lax/T4/j;)Lax/G4/a0;

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
    check-cast p1, Lax/G4/a0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/G4/a0$b;->t(Lax/G4/a0;Lax/T4/g;)V

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

.method public s(Lax/T4/j;)Lax/G4/a0;
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
    if-ne v0, v1, :cond_11

    .line 8
    .line 9
    invoke-static {p1}, Lax/v4/c;->i(Lax/T4/j;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_19

    .line 18
    :cond_11
    invoke-static {p1}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_19
    if-eqz v0, :cond_76

    .line 27
    .line 28
    const-string v2, "path"

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_31

    .line 35
    .line 36
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lax/G4/M$b;->b:Lax/G4/M$b;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lax/G4/M$b;->s(Lax/T4/j;)Lax/G4/M;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lax/G4/a0;->e(Lax/G4/M;)Lax/G4/a0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_6d

    .line 50
    :cond_31
    const-string v2, "invalid_argument"

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_60

    .line 57
    .line 58
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v3, Lax/T4/m;->m0:Lax/T4/m;

    .line 63
    .line 64
    if-eq v0, v3, :cond_53

    .line 65
    .line 66
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, p1}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_54

    .line 84
    :cond_53
    const/4 v0, 0x0

    .line 85
    :goto_54
    if-nez v0, :cond_5b

    .line 86
    .line 87
    invoke-static {}, Lax/G4/a0;->c()Lax/G4/a0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_6d

    .line 92
    :cond_5b
    invoke-static {v0}, Lax/G4/a0;->d(Ljava/lang/String;)Lax/G4/a0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_6d

    .line 97
    :cond_60
    const-string v2, "internal_error"

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6b

    .line 104
    .line 105
    sget-object v0, Lax/G4/a0;->d:Lax/G4/a0;

    .line 106
    .line 107
    goto :goto_6d

    .line 108
    :cond_6b
    sget-object v0, Lax/G4/a0;->e:Lax/G4/a0;

    .line 109
    .line 110
    :goto_6d
    if-nez v1, :cond_75

    .line 111
    .line 112
    invoke-static {p1}, Lax/v4/c;->n(Lax/T4/j;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 116
    .line 117
    .line 118
    :cond_75
    return-object v0

    .line 119
    :cond_76
    new-instance v0, Lax/T4/i;

    .line 120
    .line 121
    const-string v1, "Required field missing: .tag"

    .line 122
    .line 123
    invoke-direct {v0, p1, v1}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0
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

.method public t(Lax/G4/a0;Lax/T4/g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/G4/a0$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/G4/a0;->f()Lax/G4/a0$c;

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
    if-eq v0, v1, :cond_3f

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_21

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    if-eq v0, p1, :cond_1b

    .line 21
    .line 22
    const-string p1, "other"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    const-string p1, "internal_error"

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 35
    .line 36
    .line 37
    const-string v0, "invalid_argument"

    .line 38
    .line 39
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1}, Lax/G4/a0;->b(Lax/G4/a0;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0, p1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3f
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 65
    .line 66
    .line 67
    const-string v0, "path"

    .line 68
    .line 69
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lax/G4/M$b;->b:Lax/G4/M$b;

    .line 76
    .line 77
    invoke-static {p1}, Lax/G4/a0;->a(Lax/G4/a0;)Lax/G4/M;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1, p2}, Lax/G4/M$b;->t(Lax/G4/M;Lax/T4/g;)V

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
