.class public final Lax/r4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lax/r4/e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/r4/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/r4/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/r4/e;->a:Lax/r4/e;

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

.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final a(Lax/p4/z;Ljava/lang/String;Lax/p4/q;Ljava/lang/String;)Ljava/lang/String;
    .registers 12

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    const-string v4, "pkceManagerCodeChallenge"

    .line 7
    .line 8
    invoke-static {p4, v4}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_95

    .line 12
    .line 13
    sget-object v4, Lax/Gb/y;->a:Lax/Gb/y;

    .line 14
    .line 15
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/p4/z;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-array v5, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string v6, "code_challenge"

    .line 24
    .line 25
    aput-object v6, v5, v2

    .line 26
    .line 27
    aput-object p4, v5, v1

    .line 28
    .line 29
    const-string p4, "code_challenge_method"

    .line 30
    .line 31
    aput-object p4, v5, v3

    .line 32
    .line 33
    const-string p4, "S256"

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    aput-object p4, v5, v6

    .line 37
    .line 38
    const-string p4, "token_access_type"

    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    aput-object p4, v5, v6

    .line 42
    .line 43
    const/4 p4, 0x5

    .line 44
    aput-object p1, v5, p4

    .line 45
    .line 46
    const-string p1, "response_type"

    .line 47
    .line 48
    const/4 p4, 0x6

    .line 49
    aput-object p1, v5, p4

    .line 50
    .line 51
    const-string p1, "code"

    .line 52
    .line 53
    const/4 p4, 0x7

    .line 54
    aput-object p1, v5, p4

    .line 55
    .line 56
    invoke-static {v5, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p4, "%s=%s&%s=%s&%s=%s&%s=%s"

    .line 61
    .line 62
    invoke-static {v4, p4, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string p4, "format(...)"

    .line 67
    .line 68
    invoke-static {p1, p4}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "&%s=%s"

    .line 72
    .line 73
    if-eqz p2, :cond_6c

    .line 74
    .line 75
    new-array v5, v3, [Ljava/lang/Object;

    .line 76
    .line 77
    const-string v6, "scope"

    .line 78
    .line 79
    aput-object v6, v5, v2

    .line 80
    .line 81
    aput-object p2, v5, v1

    .line 82
    .line 83
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {v4, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2, p4}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :cond_6c
    if-eqz p3, :cond_94

    .line 110
    .line 111
    invoke-virtual {p3}, Lax/p4/q;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    new-array p3, v3, [Ljava/lang/Object;

    .line 116
    .line 117
    const-string v5, "include_granted_scopes"

    .line 118
    .line 119
    aput-object v5, p3, v2

    .line 120
    .line 121
    aput-object p2, p3, v1

    .line 122
    .line 123
    invoke-static {p3, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-static {v4, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-static {p2, p4}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    new-instance p3, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :cond_94
    return-object p1

    .line 150
    :cond_95
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    const-string p2, "Extra Query Param should only be used in short live token flow."

    .line 153
    .line 154
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
