.class final Lax/S0/z$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/S0/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lax/S0/z;


# direct methods
.method private constructor <init>(Lax/S0/z;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/S0/z$e;->a:Lax/S0/z;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/S0/z;Lax/S0/z$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/S0/z$e;-><init>(Lax/S0/z;)V

    return-void
.end method

.method public static synthetic a(Lax/S0/z$e;Landroid/content/Context;)V
    .registers 2

    .line 1
    iget-object p0, p0, Lax/S0/z$e;->a:Lax/S0/z;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lax/S0/z;->c(Lax/S0/z;Landroid/content/Context;)V

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
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 4

    .line 1
    iget-object p2, p0, Lax/S0/z$e;->a:Lax/S0/z;

    .line 2
    .line 3
    invoke-static {p2}, Lax/S0/z;->b(Lax/S0/z;)Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lax/S0/E;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lax/S0/E;-><init>(Lax/S0/z$e;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

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
