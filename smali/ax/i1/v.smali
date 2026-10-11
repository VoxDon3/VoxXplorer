.class public final Lax/i1/v;
.super Lax/i1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i1/v$b;
    }
.end annotation


# instance fields
.field private final h:Lax/i1/t;

.field private final i:J

.field private j:Lax/P0/y;


# direct methods
.method private constructor <init>(Lax/P0/y;JLax/i1/t;)V
    .registers 5

    .line 2
    invoke-direct {p0}, Lax/i1/a;-><init>()V

    .line 3
    iput-object p1, p0, Lax/i1/v;->j:Lax/P0/y;

    .line 4
    iput-wide p2, p0, Lax/i1/v;->i:J

    .line 5
    iput-object p4, p0, Lax/i1/v;->h:Lax/i1/t;

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y;JLax/i1/t;Lax/i1/v$a;)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/i1/v;-><init>(Lax/P0/y;JLax/i1/t;)V

    return-void
.end method


# virtual methods
.method protected A(Lax/U0/z;)V
    .registers 10

    .line 1
    new-instance v0, Lax/i1/h0;

    .line 2
    .line 3
    iget-wide v1, p0, Lax/i1/v;->i:J

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-virtual {p0}, Lax/i1/v;->j()Lax/P0/y;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct/range {v0 .. v7}, Lax/i1/h0;-><init>(JZZZLjava/lang/Object;Lax/P0/y;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lax/i1/a;->B(Lax/P0/N;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method protected C()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public declared-synchronized a(Lax/P0/y;)V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-object p1, p0, Lax/i1/v;->j:Lax/P0/y;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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

.method public e(Lax/i1/C;)V
    .registers 2

    .line 1
    check-cast p1, Lax/i1/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/i1/u;->k()V

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
.end method

.method public i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/i1/v;->j()Lax/P0/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 6
    .line 7
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p2, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 11
    .line 12
    iget-object p2, p2, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 13
    .line 14
    const-string p3, "Externally loaded mediaItems require a MIME type."

    .line 15
    .line 16
    invoke-static {p2, p3}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    new-instance p2, Lax/i1/u;

    .line 20
    .line 21
    iget-object p1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 22
    .line 23
    iget-object p3, p1, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object p1, p1, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object p4, p0, Lax/i1/v;->h:Lax/i1/t;

    .line 28
    .line 29
    invoke-direct {p2, p3, p1, p4}, Lax/i1/u;-><init>(Landroid/net/Uri;Ljava/lang/String;Lax/i1/t;)V

    .line 30
    .line 31
    .line 32
    return-object p2
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

.method public declared-synchronized j()Lax/P0/y;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/i1/v;->j:Lax/P0/y;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_5
    move-exception v0

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw v0
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

.method public k()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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
.end method
