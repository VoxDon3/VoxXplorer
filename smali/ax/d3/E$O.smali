.class Lax/d3/E$O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->B9(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/d3/E;

.field final synthetic q:Z


# direct methods
.method constructor <init>(Lax/d3/E;Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/E$O;->c0:Lax/d3/E;

    .line 2
    .line 3
    iput-boolean p2, p0, Lax/d3/E$O;->q:Z

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
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E$O;->c0:Lax/d3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_3b

    .line 10
    :cond_9
    iget-object v0, p0, Lax/d3/E$O;->c0:Lax/d3/E;

    .line 11
    .line 12
    invoke-static {v0}, Lax/d3/E;->A5(Lax/d3/E;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->m()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-boolean v1, p0, Lax/d3/E$O;->q:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_22

    .line 23
    .line 24
    iget-object v0, p0, Lax/d3/E$O;->c0:Lax/d3/E;

    .line 25
    .line 26
    invoke-static {v0}, Lax/d3/E;->A5(Lax/d3/E;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-boolean v1, p0, Lax/d3/E$O;->q:Z

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/d3/E$O;->c0:Lax/d3/E;

    .line 36
    .line 37
    invoke-static {v0}, Lax/d3/E;->B5(Lax/d3/E;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->m()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-boolean v1, p0, Lax/d3/E$O;->q:Z

    .line 46
    .line 47
    if-eq v0, v1, :cond_3b

    .line 48
    .line 49
    iget-object v0, p0, Lax/d3/E$O;->c0:Lax/d3/E;

    .line 50
    .line 51
    invoke-static {v0}, Lax/d3/E;->B5(Lax/d3/E;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-boolean v1, p0, Lax/d3/E$O;->q:Z

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    :goto_3b
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
