.class public Lax/z4/b$b;
.super Lax/v4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/z4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/f<",
        "Lax/z4/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/z4/b$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/z4/b$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/z4/b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/z4/b$b;->b:Lax/z4/b$b;

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
    invoke-virtual {p0, p1}, Lax/z4/b$b;->s(Lax/T4/j;)Lax/z4/b;

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
    check-cast p1, Lax/z4/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/z4/b$b;->t(Lax/z4/b;Lax/T4/g;)V

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

.method public s(Lax/T4/j;)Lax/z4/b;
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
    if-eqz v0, :cond_7c

    .line 28
    .line 29
    const-string v3, "invalid_access_token"

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
    sget-object v0, Lax/z4/b;->c:Lax/z4/b;

    .line 38
    .line 39
    goto :goto_73

    .line 40
    :cond_27
    const-string v3, "invalid_select_user"

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_32

    .line 47
    .line 48
    sget-object v0, Lax/z4/b;->d:Lax/z4/b;

    .line 49
    .line 50
    goto :goto_73

    .line 51
    :cond_32
    const-string v3, "invalid_select_admin"

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3d

    .line 58
    .line 59
    sget-object v0, Lax/z4/b;->e:Lax/z4/b;

    .line 60
    .line 61
    goto :goto_73

    .line 62
    :cond_3d
    const-string v3, "user_suspended"

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_48

    .line 69
    .line 70
    sget-object v0, Lax/z4/b;->f:Lax/z4/b;

    .line 71
    .line 72
    goto :goto_73

    .line 73
    :cond_48
    const-string v3, "expired_access_token"

    .line 74
    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_53

    .line 80
    .line 81
    sget-object v0, Lax/z4/b;->g:Lax/z4/b;

    .line 82
    .line 83
    goto :goto_73

    .line 84
    :cond_53
    const-string v3, "missing_scope"

    .line 85
    .line 86
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_66

    .line 91
    .line 92
    sget-object v0, Lax/z4/f$a;->b:Lax/z4/f$a;

    .line 93
    .line 94
    invoke-virtual {v0, p1, v2}, Lax/z4/f$a;->u(Lax/T4/j;Z)Lax/z4/f;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Lax/z4/b;->b(Lax/z4/f;)Lax/z4/b;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    goto :goto_73

    .line 103
    :cond_66
    const-string v2, "route_access_denied"

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_71

    .line 110
    .line 111
    sget-object v0, Lax/z4/b;->h:Lax/z4/b;

    .line 112
    .line 113
    goto :goto_73

    .line 114
    :cond_71
    sget-object v0, Lax/z4/b;->i:Lax/z4/b;

    .line 115
    .line 116
    :goto_73
    if-nez v1, :cond_7b

    .line 117
    .line 118
    invoke-static {p1}, Lax/v4/c;->n(Lax/T4/j;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 122
    .line 123
    .line 124
    :cond_7b
    return-object v0

    .line 125
    :cond_7c
    new-instance v0, Lax/T4/i;

    .line 126
    .line 127
    const-string v1, "Required field missing: .tag"

    .line 128
    .line 129
    invoke-direct {v0, p1, v1}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
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

.method public t(Lax/z4/b;Lax/T4/g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/z4/b$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/z4/b;->c()Lax/z4/b$c;

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
    packed-switch v0, :pswitch_data_50

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
    const-string p1, "route_access_denied"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1b
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 29
    .line 30
    .line 31
    const-string v0, "missing_scope"

    .line 32
    .line 33
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lax/z4/f$a;->b:Lax/z4/f$a;

    .line 37
    .line 38
    invoke-static {p1}, Lax/z4/b;->a(Lax/z4/b;)Lax/z4/f;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, p1, p2, v1}, Lax/z4/f$a;->v(Lax/z4/f;Lax/T4/g;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_31
    const-string p1, "expired_access_token"

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_37
    const-string p1, "user_suspended"

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3d
    const-string p1, "invalid_select_admin"

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_43
    const-string p1, "invalid_select_user"

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_49
    const-string p1, "invalid_access_token"

    .line 75
    .line 76
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_50
    .packed-switch 0x1
        :pswitch_49
        :pswitch_43
        :pswitch_3d
        :pswitch_37
        :pswitch_31
        :pswitch_1b
        :pswitch_15
    .end packed-switch
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
