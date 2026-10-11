.class Lax/d4/e$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d4/e;


# direct methods
.method constructor <init>(Lax/d4/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d4/e$a;->a:Lax/d4/e;

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
    .registers 4

    .line 1
    iget-object p2, p0, Lax/d4/e$a;->a:Lax/d4/e;

    .line 2
    .line 3
    iget-boolean v0, p2, Lax/d4/e;->d0:Z

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lax/d4/e;->h(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput-boolean p1, p2, Lax/d4/e;->d0:Z

    .line 10
    .line 11
    iget-object p1, p0, Lax/d4/e$a;->a:Lax/d4/e;

    .line 12
    .line 13
    iget-boolean p2, p1, Lax/d4/e;->d0:Z

    .line 14
    .line 15
    if-eq v0, p2, :cond_15

    .line 16
    .line 17
    iget-object p1, p1, Lax/d4/e;->c0:Lax/d4/c$a;

    .line 18
    .line 19
    invoke-interface {p1, p2}, Lax/d4/c$a;->a(Z)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
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
