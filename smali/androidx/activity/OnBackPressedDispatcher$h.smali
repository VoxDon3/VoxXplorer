.class final Landroidx/activity/OnBackPressedDispatcher$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/OnBackPressedDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "h"
.end annotation


# instance fields
.field final synthetic c0:Landroidx/activity/OnBackPressedDispatcher;

.field private final q:Lax/i/r;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;Lax/i/r;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i/r;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onBackPressedCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$h;->c0:Landroidx/activity/OnBackPressedDispatcher;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 12
    .line 13
    return-void
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
.method public cancel()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->c0:Landroidx/activity/OnBackPressedDispatcher;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher;->b(Landroidx/activity/OnBackPressedDispatcher;)Lax/tb/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/tb/h;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->c0:Landroidx/activity/OnBackPressedDispatcher;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher;->a(Landroidx/activity/OnBackPressedDispatcher;)Lax/i/r;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_24

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 28
    .line 29
    invoke-virtual {v0}, Lax/i/r;->c()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->c0:Landroidx/activity/OnBackPressedDispatcher;

    .line 33
    .line 34
    invoke-static {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;->f(Landroidx/activity/OnBackPressedDispatcher;Lax/i/r;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lax/i/r;->i(Lax/i/c;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/i/r;->b()Lax/Fb/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_34

    .line 49
    .line 50
    invoke-interface {v0}, Lax/Fb/a;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_34
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$h;->q:Lax/i/r;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lax/i/r;->k(Lax/Fb/a;)V

    .line 56
    .line 57
    .line 58
    return-void
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
