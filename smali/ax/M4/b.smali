.class public Lax/M4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/x4/d;


# direct methods
.method public constructor <init>(Lax/x4/d;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/M4/b;->a:Lax/x4/d;

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


# virtual methods
.method public a()Lax/M4/c;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/f;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/M4/b;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/users/get_current_account"

    .line 12
    .line 13
    invoke-static {}, Lax/v4/d;->j()Lax/v4/c;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    sget-object v6, Lax/M4/c$a;->b:Lax/M4/c$a;

    .line 18
    .line 19
    invoke-static {}, Lax/v4/d;->j()Lax/v4/c;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lax/M4/c;
    :try_end_1e
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1e} :catch_1f

    .line 30
    .line 31
    return-object v0

    .line 32
    :catch_1f
    move-exception v0

    .line 33
    new-instance v1, Lax/p4/f;

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/p4/p;->e()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0}, Lax/p4/p;->f()Lax/p4/s;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v5, "Unexpected error response for \"get_current_account\":"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {v1, v2, v3, v0}, Lax/p4/f;-><init>(Ljava/lang/String;Lax/p4/s;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1
    .line 68
.end method

.method public b()Lax/M4/h;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/f;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/M4/b;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->g()Lax/p4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lax/p4/k;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "2/users/get_space_usage"

    .line 12
    .line 13
    invoke-static {}, Lax/v4/d;->j()Lax/v4/c;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    sget-object v6, Lax/M4/h$a;->b:Lax/M4/h$a;

    .line 18
    .line 19
    invoke-static {}, Lax/v4/d;->j()Lax/v4/c;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual/range {v0 .. v7}, Lax/x4/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLax/v4/c;Lax/v4/c;Lax/v4/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lax/M4/h;
    :try_end_1e
    .catch Lax/p4/p; {:try_start_0 .. :try_end_1e} :catch_1f

    .line 30
    .line 31
    return-object v0

    .line 32
    :catch_1f
    move-exception v0

    .line 33
    new-instance v1, Lax/p4/f;

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/p4/p;->e()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0}, Lax/p4/p;->f()Lax/p4/s;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v5, "Unexpected error response for \"get_space_usage\":"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {v1, v2, v3, v0}, Lax/p4/f;-><init>(Ljava/lang/String;Lax/p4/s;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1
    .line 68
.end method
