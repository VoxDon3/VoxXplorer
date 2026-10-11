.class Lax/G4/G0$b;
.super Lax/v4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/G0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/f<",
        "Lax/G4/G0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/G0$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/G0$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/G0$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/G0$b;->b:Lax/G4/G0$b;

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
    invoke-virtual {p0, p1}, Lax/G4/G0$b;->s(Lax/T4/j;)Lax/G4/G0;

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
    check-cast p1, Lax/G4/G0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/G4/G0$b;->t(Lax/G4/G0;Lax/T4/g;)V

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

.method public s(Lax/T4/j;)Lax/G4/G0;
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
    if-eqz v0, :cond_87

    .line 28
    .line 29
    const-string v3, "not_found"

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_27

    .line 36
    .line 37
    sget-object v0, Lax/G4/G0;->c:Lax/G4/G0;

    .line 38
    .line 39
    goto :goto_7e

    .line 40
    :cond_27
    const-string v3, "incorrect_offset"

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3a

    .line 47
    .line 48
    sget-object v0, Lax/G4/H0$a;->b:Lax/G4/H0$a;

    .line 49
    .line 50
    invoke-virtual {v0, p1, v2}, Lax/G4/H0$a;->u(Lax/T4/j;Z)Lax/G4/H0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lax/G4/G0;->c(Lax/G4/H0;)Lax/G4/G0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_7e

    .line 59
    :cond_3a
    const-string v2, "closed"

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_45

    .line 66
    .line 67
    sget-object v0, Lax/G4/G0;->d:Lax/G4/G0;

    .line 68
    .line 69
    goto :goto_7e

    .line 70
    :cond_45
    const-string v2, "not_closed"

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
    sget-object v0, Lax/G4/G0;->e:Lax/G4/G0;

    .line 79
    .line 80
    goto :goto_7e

    .line 81
    :cond_50
    const-string v2, "too_large"

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5b

    .line 88
    .line 89
    sget-object v0, Lax/G4/G0;->f:Lax/G4/G0;

    .line 90
    .line 91
    goto :goto_7e

    .line 92
    :cond_5b
    const-string v2, "concurrent_session_invalid_offset"

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_66

    .line 99
    .line 100
    sget-object v0, Lax/G4/G0;->g:Lax/G4/G0;

    .line 101
    .line 102
    goto :goto_7e

    .line 103
    :cond_66
    const-string v2, "concurrent_session_invalid_data_size"

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_71

    .line 110
    .line 111
    sget-object v0, Lax/G4/G0;->h:Lax/G4/G0;

    .line 112
    .line 113
    goto :goto_7e

    .line 114
    :cond_71
    const-string v2, "payload_too_large"

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7c

    .line 121
    .line 122
    sget-object v0, Lax/G4/G0;->i:Lax/G4/G0;

    .line 123
    .line 124
    goto :goto_7e

    .line 125
    :cond_7c
    sget-object v0, Lax/G4/G0;->j:Lax/G4/G0;

    .line 126
    .line 127
    :goto_7e
    if-nez v1, :cond_86

    .line 128
    .line 129
    invoke-static {p1}, Lax/v4/c;->n(Lax/T4/j;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 133
    .line 134
    .line 135
    :cond_86
    return-object v0

    .line 136
    :cond_87
    new-instance v0, Lax/T4/i;

    .line 137
    .line 138
    const-string v1, "Required field missing: .tag"

    .line 139
    .line 140
    invoke-direct {v0, p1, v1}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0
.end method

.method public t(Lax/G4/G0;Lax/T4/g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/G4/G0$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/G4/G0;->e()Lax/G4/G0$c;

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
    packed-switch v0, :pswitch_data_56

    .line 14
    .line 15
    .line 16
    const-string p1, "other"

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_15
    const-string p1, "payload_too_large"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1b
    const-string p1, "concurrent_session_invalid_data_size"

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_21
    const-string p1, "concurrent_session_invalid_offset"

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_27
    const-string p1, "too_large"

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2d
    const-string p1, "not_closed"

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_33
    const-string p1, "closed"

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_39
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 59
    .line 60
    .line 61
    const-string v0, "incorrect_offset"

    .line 62
    .line 63
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lax/G4/H0$a;->b:Lax/G4/H0$a;

    .line 67
    .line 68
    invoke-static {p1}, Lax/G4/G0;->a(Lax/G4/G0;)Lax/G4/H0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/4 v1, 0x1

    .line 73
    invoke-virtual {v0, p1, p2, v1}, Lax/G4/H0$a;->v(Lax/G4/H0;Lax/T4/g;Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_4f
    const-string p1, "not_found"

    .line 81
    .line 82
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_56
    .packed-switch 0x1
        :pswitch_4f
        :pswitch_39
        :pswitch_33
        :pswitch_2d
        :pswitch_27
        :pswitch_21
        :pswitch_1b
        :pswitch_15
    .end packed-switch
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
