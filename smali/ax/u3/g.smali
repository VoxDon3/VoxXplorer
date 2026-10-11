.class public Lax/u3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lax/u3/g;


# instance fields
.field a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 9
    .line 10
    return-void
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

.method public static a()Lax/u3/g;
    .registers 2

    .line 1
    sget-object v0, Lax/u3/g;->b:Lax/u3/g;

    .line 2
    .line 3
    if-nez v0, :cond_15

    .line 4
    .line 5
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "LocalBroadcast not initialized"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 20
    .line 21
    .line 22
    :cond_15
    sget-object v0, Lax/u3/g;->b:Lax/u3/g;

    .line 23
    .line 24
    return-object v0
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

.method public static b(Landroid/content/Context;)V
    .registers 2

    .line 1
    new-instance v0, Lax/u3/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/u3/g;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/u3/g;->b:Lax/u3/g;

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
.end method


# virtual methods
.method public c(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2, p1}, Lax/L0/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V
    .registers 4

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p1}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2, v0}, Lax/L0/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public e(Landroid/content/Intent;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/L0/a;->d(Landroid/content/Intent;)Z

    .line 8
    .line 9
    .line 10
    return-void
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

.method public f(Ljava/lang/String;)V
    .registers 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p1}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, v0}, Lax/L0/a;->d(Landroid/content/Intent;)Z

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public g(Landroid/content/Intent;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/L0/a;->e(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public h(Landroid/content/BroadcastReceiver;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/L0/a;->f(Landroid/content/BroadcastReceiver;)V

    .line 8
    .line 9
    .line 10
    return-void
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
