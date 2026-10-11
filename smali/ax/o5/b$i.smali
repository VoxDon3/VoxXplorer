.class final Lax/o5/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/U7/d<",
        "Lax/o5/u;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lax/o5/b$i;

.field private static final b:Lax/U7/c;

.field private static final c:Lax/U7/c;

.field private static final d:Lax/U7/c;

.field private static final e:Lax/U7/c;

.field private static final f:Lax/U7/c;

.field private static final g:Lax/U7/c;

.field private static final h:Lax/U7/c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/o5/b$i;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o5/b$i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/o5/b$i;->a:Lax/o5/b$i;

    .line 7
    .line 8
    const-string v0, "requestTimeMs"

    .line 9
    .line 10
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lax/o5/b$i;->b:Lax/U7/c;

    .line 15
    .line 16
    const-string v0, "requestUptimeMs"

    .line 17
    .line 18
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lax/o5/b$i;->c:Lax/U7/c;

    .line 23
    .line 24
    const-string v0, "clientInfo"

    .line 25
    .line 26
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lax/o5/b$i;->d:Lax/U7/c;

    .line 31
    .line 32
    const-string v0, "logSource"

    .line 33
    .line 34
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lax/o5/b$i;->e:Lax/U7/c;

    .line 39
    .line 40
    const-string v0, "logSourceName"

    .line 41
    .line 42
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lax/o5/b$i;->f:Lax/U7/c;

    .line 47
    .line 48
    const-string v0, "logEvent"

    .line 49
    .line 50
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lax/o5/b$i;->g:Lax/U7/c;

    .line 55
    .line 56
    const-string v0, "qosTier"

    .line 57
    .line 58
    invoke-static {v0}, Lax/U7/c;->d(Ljava/lang/String;)Lax/U7/c;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lax/o5/b$i;->h:Lax/U7/c;

    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
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
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lax/o5/u;

    .line 2
    .line 3
    check-cast p2, Lax/U7/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/o5/b$i;->b(Lax/o5/u;Lax/U7/e;)V

    .line 6
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

.method public b(Lax/o5/u;Lax/U7/e;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/o5/b$i;->b:Lax/U7/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/o5/u;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-interface {p2, v0, v1, v2}, Lax/U7/e;->c(Lax/U7/c;J)Lax/U7/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lax/o5/b$i;->c:Lax/U7/c;

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/o5/u;->h()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-interface {p2, v0, v1, v2}, Lax/U7/e;->c(Lax/U7/c;J)Lax/U7/e;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lax/o5/b$i;->d:Lax/U7/c;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/o5/u;->b()Lax/o5/o;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p2, v0, v1}, Lax/U7/e;->e(Lax/U7/c;Ljava/lang/Object;)Lax/U7/e;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lax/o5/b$i;->e:Lax/U7/c;

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/o5/u;->d()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {p2, v0, v1}, Lax/U7/e;->e(Lax/U7/c;Ljava/lang/Object;)Lax/U7/e;

    .line 35
    .line 36
    .line 37
    sget-object v0, Lax/o5/b$i;->f:Lax/U7/c;

    .line 38
    .line 39
    invoke-virtual {p1}, Lax/o5/u;->e()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p2, v0, v1}, Lax/U7/e;->e(Lax/U7/c;Ljava/lang/Object;)Lax/U7/e;

    .line 44
    .line 45
    .line 46
    sget-object v0, Lax/o5/b$i;->g:Lax/U7/c;

    .line 47
    .line 48
    invoke-virtual {p1}, Lax/o5/u;->c()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {p2, v0, v1}, Lax/U7/e;->e(Lax/U7/c;Ljava/lang/Object;)Lax/U7/e;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lax/o5/b$i;->h:Lax/U7/c;

    .line 56
    .line 57
    invoke-virtual {p1}, Lax/o5/u;->f()Lax/o5/x;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p2, v0, p1}, Lax/U7/e;->e(Lax/U7/c;Ljava/lang/Object;)Lax/U7/e;

    .line 62
    .line 63
    .line 64
    return-void
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
.end method
