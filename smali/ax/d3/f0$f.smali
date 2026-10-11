.class public Lax/d3/f0$f;
.super Lax/K0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/K0/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field o:Lax/T2/h;

.field p:Lax/d3/f0$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/T2/h;Lax/d3/f0$e;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Lax/K0/a;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/d3/f0$f;->o:Lax/T2/h;

    .line 5
    .line 6
    iput-object p3, p0, Lax/d3/f0$f;->p:Lax/d3/f0$e;

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


# virtual methods
.method public bridge synthetic I()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/f0$f;->L()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public L()Ljava/lang/Boolean;
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/K0/c;->j()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_8
    iget-object v0, p0, Lax/d3/f0$f;->o:Lax/T2/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/T2/h;->k0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_17

    .line 16
    .line 17
    iget-object v0, p0, Lax/d3/f0$f;->o:Lax/T2/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/T2/h;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v0, 0x1

    .line 25
    :goto_18
    iget-object v1, p0, Lax/d3/f0$f;->p:Lax/d3/f0$e;

    .line 26
    .line 27
    iget-boolean v2, v1, Lax/d3/f0$e;->a:Z

    .line 28
    .line 29
    if-eqz v2, :cond_2c

    .line 30
    .line 31
    :try_start_1e
    iget-object v1, v1, Lax/d3/f0$e;->b:Ljava/util/concurrent/CountDownLatch;

    .line 32
    .line 33
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    const-wide/16 v3, 0x5dc

    .line 36
    .line 37
    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_27
    .catch Ljava/lang/InterruptedException; {:try_start_1e .. :try_end_27} :catch_27

    .line 38
    .line 39
    .line 40
    :catch_27
    iget-object v1, p0, Lax/d3/f0$f;->p:Lax/d3/f0$e;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    iput-boolean v2, v1, Lax/d3/f0$e;->a:Z

    .line 44
    .line 45
    :cond_2c
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
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

.method protected t()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/K0/c;->a()V

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
