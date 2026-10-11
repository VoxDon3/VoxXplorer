.class final Lax/r0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/r0/i0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/r0/J$b;
    }
.end annotation


# static fields
.field private static final b:Lax/r0/Q;


# instance fields
.field private final a:Lax/r0/Q;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/r0/J$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/r0/J$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/r0/J;->b:Lax/r0/Q;

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
    .registers 2

    .line 1
    invoke-static {}, Lax/r0/J;->b()Lax/r0/Q;

    move-result-object v0

    invoke-direct {p0, v0}, Lax/r0/J;-><init>(Lax/r0/Q;)V

    return-void
.end method

.method private constructor <init>(Lax/r0/Q;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lax/r0/A;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/r0/Q;

    iput-object p1, p0, Lax/r0/J;->a:Lax/r0/Q;

    return-void
.end method

.method private static b()Lax/r0/Q;
    .registers 5

    .line 1
    new-instance v0, Lax/r0/J$b;

    .line 2
    .line 3
    invoke-static {}, Lax/r0/x;->c()Lax/r0/x;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lax/r0/J;->c()Lax/r0/Q;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [Lax/r0/Q;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v1, v3, v4

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object v2, v3, v1

    .line 19
    .line 20
    invoke-direct {v0, v3}, Lax/r0/J$b;-><init>([Lax/r0/Q;)V

    .line 21
    .line 22
    .line 23
    return-object v0
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
.end method

.method private static c()Lax/r0/Q;
    .registers 3

    .line 1
    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getInstance"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lax/r0/Q;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_13} :catch_14

    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_14
    sget-object v0, Lax/r0/J;->b:Lax/r0/Q;

    .line 22
    .line 23
    return-object v0
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
.end method

.method private static d(Lax/r0/P;)Z
    .registers 2

    .line 1
    invoke-interface {p0}, Lax/r0/P;->c()Lax/r0/c0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lax/r0/c0;->q:Lax/r0/c0;

    .line 6
    .line 7
    if-ne p0, v0, :cond_a

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_a
    const/4 p0, 0x0

    .line 12
    return p0
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

.method private static e(Ljava/lang/Class;Lax/r0/P;)Lax/r0/h0;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lax/r0/P;",
            ")",
            "Lax/r0/h0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lax/r0/y;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_41

    .line 8
    .line 9
    invoke-static {p1}, Lax/r0/J;->d(Lax/r0/P;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_29

    .line 14
    .line 15
    invoke-static {}, Lax/r0/Z;->b()Lax/r0/X;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {}, Lax/r0/H;->b()Lax/r0/H;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lax/r0/j0;->M()Lax/r0/o0;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {}, Lax/r0/s;->b()Lax/r0/q;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {}, Lax/r0/O;->b()Lax/r0/M;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    move-object v1, p0

    .line 36
    move-object v2, p1

    .line 37
    invoke-static/range {v1 .. v7}, Lax/r0/V;->N(Ljava/lang/Class;Lax/r0/P;Lax/r0/X;Lax/r0/H;Lax/r0/o0;Lax/r0/q;Lax/r0/M;)Lax/r0/V;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_29
    move-object v0, p0

    .line 43
    move-object v1, p1

    .line 44
    invoke-static {}, Lax/r0/Z;->b()Lax/r0/X;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {}, Lax/r0/H;->b()Lax/r0/H;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {}, Lax/r0/j0;->M()Lax/r0/o0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static {}, Lax/r0/O;->b()Lax/r0/M;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static/range {v0 .. v6}, Lax/r0/V;->N(Ljava/lang/Class;Lax/r0/P;Lax/r0/X;Lax/r0/H;Lax/r0/o0;Lax/r0/q;Lax/r0/M;)Lax/r0/V;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_41
    move-object v0, p0

    .line 67
    move-object v1, p1

    .line 68
    invoke-static {v1}, Lax/r0/J;->d(Lax/r0/P;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_62

    .line 73
    .line 74
    invoke-static {}, Lax/r0/Z;->a()Lax/r0/X;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {}, Lax/r0/H;->a()Lax/r0/H;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {}, Lax/r0/j0;->H()Lax/r0/o0;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {}, Lax/r0/s;->a()Lax/r0/q;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {}, Lax/r0/O;->a()Lax/r0/M;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static/range {v0 .. v6}, Lax/r0/V;->N(Ljava/lang/Class;Lax/r0/P;Lax/r0/X;Lax/r0/H;Lax/r0/o0;Lax/r0/q;Lax/r0/M;)Lax/r0/V;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_62
    invoke-static {}, Lax/r0/Z;->a()Lax/r0/X;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {}, Lax/r0/H;->a()Lax/r0/H;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {}, Lax/r0/j0;->I()Lax/r0/o0;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/4 v5, 0x0

    .line 112
    invoke-static {}, Lax/r0/O;->a()Lax/r0/M;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static/range {v0 .. v6}, Lax/r0/V;->N(Ljava/lang/Class;Lax/r0/P;Lax/r0/X;Lax/r0/H;Lax/r0/o0;Lax/r0/q;Lax/r0/M;)Lax/r0/V;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
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


# virtual methods
.method public a(Ljava/lang/Class;)Lax/r0/h0;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lax/r0/h0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/r0/j0;->J(Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/r0/J;->a:Lax/r0/Q;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lax/r0/Q;->a(Ljava/lang/Class;)Lax/r0/P;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lax/r0/P;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_39

    .line 15
    .line 16
    const-class v1, Lax/r0/y;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_28

    .line 23
    .line 24
    invoke-static {}, Lax/r0/j0;->M()Lax/r0/o0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Lax/r0/s;->b()Lax/r0/q;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0}, Lax/r0/P;->b()Lax/r0/S;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p1, v1, v0}, Lax/r0/W;->l(Lax/r0/o0;Lax/r0/q;Lax/r0/S;)Lax/r0/W;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_28
    invoke-static {}, Lax/r0/j0;->H()Lax/r0/o0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {}, Lax/r0/s;->a()Lax/r0/q;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0}, Lax/r0/P;->b()Lax/r0/S;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1, v1, v0}, Lax/r0/W;->l(Lax/r0/o0;Lax/r0/q;Lax/r0/S;)Lax/r0/W;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_39
    invoke-static {p1, v0}, Lax/r0/J;->e(Ljava/lang/Class;Lax/r0/P;)Lax/r0/h0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
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
