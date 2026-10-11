.class public Lax/R3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/R3/j$b;
    }
.end annotation


# instance fields
.field private final a:Lax/k4/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/k4/e<",
            "Lax/M3/h;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Lax/R3/j$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/k4/e;

    .line 5
    .line 6
    const/16 v1, 0x3e8

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lax/k4/e;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/R3/j;->a:Lax/k4/e;

    .line 12
    .line 13
    new-instance v0, Lax/R3/j$a;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lax/R3/j$a;-><init>(Lax/R3/j;)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-static {v1, v0}, Lax/l4/a;->e(ILax/l4/a$d;)Lax/b0/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lax/R3/j;->b:Lax/b0/d;

    .line 25
    .line 26
    return-void
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

.method private a(Lax/M3/h;)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/R3/j;->b:Lax/b0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b0/d;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/R3/j$b;

    .line 8
    .line 9
    :try_start_8
    iget-object v1, v0, Lax/R3/j$b;->q:Ljava/security/MessageDigest;

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lax/M3/h;->a(Ljava/security/MessageDigest;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lax/R3/j$b;->q:Ljava/security/MessageDigest;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lax/k4/i;->s([B)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_17
    .catchall {:try_start_8 .. :try_end_17} :catchall_1d

    .line 24
    iget-object v1, p0, Lax/R3/j;->b:Lax/b0/d;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :catchall_1d
    move-exception p1

    .line 31
    iget-object v1, p0, Lax/R3/j;->b:Lax/b0/d;

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    throw p1
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
.end method


# virtual methods
.method public b(Lax/M3/h;)Ljava/lang/String;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/R3/j;->a:Lax/k4/e;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/R3/j;->a:Lax/k4/e;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lax/k4/e;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_1f

    .line 13
    if-nez v1, :cond_12

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lax/R3/j;->a(Lax/M3/h;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_12
    iget-object v2, p0, Lax/R3/j;->a:Lax/k4/e;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_15
    iget-object v0, p0, Lax/R3/j;->a:Lax/k4/e;

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lax/k4/e;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    monitor-exit v2

    .line 28
    return-object v1

    .line 29
    :catchall_1c
    move-exception p1

    .line 30
    monitor-exit v2
    :try_end_1e
    .catchall {:try_start_15 .. :try_end_1e} :catchall_1c

    .line 31
    throw p1

    .line 32
    :catchall_1f
    move-exception p1

    .line 33
    :try_start_20
    monitor-exit v0
    :try_end_21
    .catchall {:try_start_20 .. :try_end_21} :catchall_1f

    .line 34
    throw p1
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
.end method
