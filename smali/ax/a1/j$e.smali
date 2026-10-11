.class final Lax/a1/j$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lax/a1/j;


# direct methods
.method private constructor <init>(Lax/a1/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/j$e;->a:Lax/a1/j;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/a1/j;Lax/a1/j$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/a1/j$e;-><init>(Lax/a1/j;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_19

    .line 6
    .line 7
    iget-object v0, p0, Lax/a1/j$e;->a:Lax/a1/j;

    .line 8
    .line 9
    invoke-static {v0}, Lax/a1/j;->a(Lax/a1/j;)Lax/P0/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/a1/j$e;->a:Lax/a1/j;

    .line 14
    .line 15
    invoke-static {v2}, Lax/a1/j;->b(Lax/a1/j;)Lax/a1/k;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p1, p2, v1, v2}, Lax/a1/e;->e(Landroid/content/Context;Landroid/content/Intent;Lax/P0/c;Lax/a1/k;)Lax/a1/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v0, p1}, Lax/a1/j;->d(Lax/a1/j;Lax/a1/e;)V

    .line 24
    .line 25
    .line 26
    :cond_19
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
.end method
