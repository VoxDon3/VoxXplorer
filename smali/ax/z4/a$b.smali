.class public Lax/z4/a$b;
.super Lax/v4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/z4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/f<",
        "Lax/z4/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/z4/a$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/z4/a$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/z4/a$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/z4/a$b;->b:Lax/z4/a$b;

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

.method public constructor <init>()V
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
    invoke-virtual {p0, p1}, Lax/z4/a$b;->s(Lax/T4/j;)Lax/z4/a;

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
    check-cast p1, Lax/z4/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/z4/a$b;->t(Lax/z4/a;Lax/T4/g;)V

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

.method public s(Lax/T4/j;)Lax/z4/a;
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
    if-eqz v0, :cond_52

    .line 27
    .line 28
    const-string v2, "invalid_account_type"

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
    sget-object v0, Lax/z4/d$b;->b:Lax/z4/d$b;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lax/z4/d$b;->s(Lax/T4/j;)Lax/z4/d;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lax/z4/a;->c(Lax/z4/d;)Lax/z4/a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_49

    .line 50
    :cond_31
    const-string v2, "paper_access_denied"

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_47

    .line 57
    .line 58
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lax/z4/e$b;->b:Lax/z4/e$b;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lax/z4/e$b;->s(Lax/T4/j;)Lax/z4/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lax/z4/a;->d(Lax/z4/e;)Lax/z4/a;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_49

    .line 72
    :cond_47
    sget-object v0, Lax/z4/a;->d:Lax/z4/a;

    .line 73
    .line 74
    :goto_49
    if-nez v1, :cond_51

    .line 75
    .line 76
    invoke-static {p1}, Lax/v4/c;->n(Lax/T4/j;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 80
    .line 81
    .line 82
    :cond_51
    return-object v0

    .line 83
    :cond_52
    new-instance v0, Lax/T4/i;

    .line 84
    .line 85
    const-string v1, "Required field missing: .tag"

    .line 86
    .line 87
    invoke-direct {v0, p1, v1}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
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

.method public t(Lax/z4/a;Lax/T4/g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/z4/a$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/z4/a;->e()Lax/z4/a$c;

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
    if-eq v0, v1, :cond_30

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_18

    .line 18
    .line 19
    const-string p1, "other"

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 26
    .line 27
    .line 28
    const-string v0, "paper_access_denied"

    .line 29
    .line 30
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lax/z4/e$b;->b:Lax/z4/e$b;

    .line 37
    .line 38
    invoke-static {p1}, Lax/z4/a;->b(Lax/z4/a;)Lax/z4/e;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1, p2}, Lax/z4/e$b;->t(Lax/z4/e;Lax/T4/g;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 50
    .line 51
    .line 52
    const-string v0, "invalid_account_type"

    .line 53
    .line 54
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lax/z4/d$b;->b:Lax/z4/d$b;

    .line 61
    .line 62
    invoke-static {p1}, Lax/z4/a;->a(Lax/z4/a;)Lax/z4/d;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p1, p2}, Lax/z4/d$b;->t(Lax/z4/d;Lax/T4/g;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 70
    .line 71
    .line 72
    return-void
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
.end method
