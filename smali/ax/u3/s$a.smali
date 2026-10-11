.class Lax/u3/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/u3/s;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/u3/s;

.field final synthetic q:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lax/u3/s;Ljava/lang/Runnable;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/u3/s$a;->c0:Lax/u3/s;

    .line 2
    .line 3
    iput-object p2, p0, Lax/u3/s$a;->q:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public run()V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/u3/s$a;->q:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_5} :catch_d
    .catchall {:try_start_0 .. :try_end_5} :catchall_b

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/u3/s$a;->c0:Lax/u3/s;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/u3/s;->b()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_b
    move-exception v0

    .line 13
    goto :goto_29

    .line 14
    :catch_d
    move-exception v0

    .line 15
    :try_start_e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "AsyncTask RuntimeException!!!!"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lax/Ha/b;->h()V
    :try_end_23
    .catchall {:try_start_e .. :try_end_23} :catchall_b

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lax/u3/s$a;->c0:Lax/u3/s;

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/u3/s;->b()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_29
    iget-object v1, p0, Lax/u3/s$a;->c0:Lax/u3/s;

    .line 43
    .line 44
    invoke-virtual {v1}, Lax/u3/s;->b()V

    .line 45
    .line 46
    .line 47
    throw v0
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
