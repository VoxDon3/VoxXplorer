.class Lax/d3/Q$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/Q;


# direct methods
.method constructor <init>(Lax/d3/Q;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/Q$a;->a:Lax/d3/Q;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 6

    .line 1
    iget-object p1, p0, Lax/d3/Q$a;->a:Lax/d3/Q;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/Q;->z3()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lax/Q2/f;->v0:Lax/Q2/f;

    .line 8
    .line 9
    if-ne p1, p2, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_e

    .line 13
    :cond_c
    const/16 p1, 0x3e8

    .line 14
    .line 15
    :goto_e
    if-lez p1, :cond_23

    .line 16
    .line 17
    new-instance p2, Landroid/os/Handler;

    .line 18
    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lax/d3/Q$a$a;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lax/d3/Q$a$a;-><init>(Lax/d3/Q$a;)V

    .line 29
    .line 30
    .line 31
    int-to-long v1, p1

    .line 32
    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    iget-object p1, p0, Lax/d3/Q$a;->a:Lax/d3/Q;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/d3/Q;->ta()V

    .line 39
    .line 40
    .line 41
    return-void
.end method
