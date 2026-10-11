.class public final Lax/K3/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/K3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:Lax/K3/a$d;

.field private final b:[Z

.field private c:Z

.field final synthetic d:Lax/K3/a;


# direct methods
.method private constructor <init>(Lax/K3/a;Lax/K3/a$d;)V
    .registers 3

    .line 2
    iput-object p1, p0, Lax/K3/a$c;->d:Lax/K3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lax/K3/a$c;->a:Lax/K3/a$d;

    .line 4
    invoke-static {p2}, Lax/K3/a$d;->e(Lax/K3/a$d;)Z

    move-result p2

    if-eqz p2, :cond_f

    const/4 p1, 0x0

    goto :goto_15

    :cond_f
    invoke-static {p1}, Lax/K3/a;->b(Lax/K3/a;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_15
    iput-object p1, p0, Lax/K3/a$c;->b:[Z

    return-void
.end method

.method synthetic constructor <init>(Lax/K3/a;Lax/K3/a$d;Lax/K3/a$a;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lax/K3/a$c;-><init>(Lax/K3/a;Lax/K3/a$d;)V

    return-void
.end method

.method static synthetic c(Lax/K3/a$c;)Lax/K3/a$d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/K3/a$c;->a:Lax/K3/a$d;

    .line 2
    .line 3
    return-object p0
    .line 4
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
    .line 22
.end method

.method static synthetic d(Lax/K3/a$c;)[Z
    .registers 1

    .line 1
    iget-object p0, p0, Lax/K3/a$c;->b:[Z

    .line 2
    .line 3
    return-object p0
    .line 4
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
    .line 22
.end method


# virtual methods
.method public a()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/a$c;->d:Lax/K3/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p0, v1}, Lax/K3/a;->e(Lax/K3/a;Lax/K3/a$c;Z)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public b()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/K3/a$c;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {p0}, Lax/K3/a$c;->a()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_7} :catch_7

    .line 6
    .line 7
    .line 8
    :catch_7
    :cond_7
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

.method public e()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/a$c;->d:Lax/K3/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p0, v1}, Lax/K3/a;->e(Lax/K3/a;Lax/K3/a$c;Z)V

    .line 5
    .line 6
    .line 7
    iput-boolean v1, p0, Lax/K3/a$c;->c:Z

    .line 8
    .line 9
    return-void
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

.method public f(I)Ljava/io/File;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/a$c;->d:Lax/K3/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/K3/a$c;->a:Lax/K3/a$d;

    .line 5
    .line 6
    invoke-static {v1}, Lax/K3/a$d;->g(Lax/K3/a$d;)Lax/K3/a$c;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-ne v1, p0, :cond_38

    .line 11
    .line 12
    iget-object v1, p0, Lax/K3/a$c;->a:Lax/K3/a$d;

    .line 13
    .line 14
    invoke-static {v1}, Lax/K3/a$d;->e(Lax/K3/a$d;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1b

    .line 19
    .line 20
    iget-object v1, p0, Lax/K3/a$c;->b:[Z

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aput-boolean v2, v1, p1

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :catchall_19
    move-exception p1

    .line 27
    goto :goto_3e

    .line 28
    :cond_1b
    :goto_1b
    iget-object v1, p0, Lax/K3/a$c;->a:Lax/K3/a$d;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lax/K3/a$d;->k(I)Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v1, p0, Lax/K3/a$c;->d:Lax/K3/a;

    .line 35
    .line 36
    invoke-static {v1}, Lax/K3/a;->d(Lax/K3/a;)Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_36

    .line 45
    .line 46
    iget-object v1, p0, Lax/K3/a$c;->d:Lax/K3/a;

    .line 47
    .line 48
    invoke-static {v1}, Lax/K3/a;->d(Lax/K3/a;)Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 53
    .line 54
    .line 55
    :cond_36
    monitor-exit v0

    .line 56
    return-object p1

    .line 57
    :cond_38
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :goto_3e
    monitor-exit v0
    :try_end_3f
    .catchall {:try_start_3 .. :try_end_3f} :catchall_19

    .line 64
    throw p1
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
