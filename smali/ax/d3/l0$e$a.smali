.class Lax/d3/l0$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/l0$e;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/d3/l0$e;


# direct methods
.method constructor <init>(Lax/d3/l0$e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 2
    .line 3
    iget-object v0, v0, Lax/d3/l0$e;->a:Lax/d3/l0;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3d

    .line 10
    .line 11
    iget-object v0, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 12
    .line 13
    iget-object v0, v0, Lax/d3/l0$e;->a:Lax/d3/l0;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3d

    .line 20
    .line 21
    iget-object v0, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 22
    .line 23
    iget-object v0, v0, Lax/d3/l0$e;->a:Lax/d3/l0;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->Z0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_3d

    .line 32
    :cond_1f
    iget-object v0, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 33
    .line 34
    iget-object v0, v0, Lax/d3/l0$e;->a:Lax/d3/l0;

    .line 35
    .line 36
    invoke-static {v0}, Lax/d3/l0;->l5(Lax/d3/l0;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x3

    .line 41
    if-eq v0, v1, :cond_3d

    .line 42
    .line 43
    iget-object v0, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 44
    .line 45
    iget-object v0, v0, Lax/d3/l0$e;->a:Lax/d3/l0;

    .line 46
    .line 47
    invoke-static {v0}, Lax/d3/l0;->l5(Lax/d3/l0;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x1

    .line 52
    if-ne v0, v1, :cond_36

    .line 53
    .line 54
    goto :goto_3d

    .line 55
    :cond_36
    iget-object v0, p0, Lax/d3/l0$e$a;->q:Lax/d3/l0$e;

    .line 56
    .line 57
    iget-object v0, v0, Lax/d3/l0$e;->a:Lax/d3/l0;

    .line 58
    .line 59
    invoke-static {v0}, Lax/d3/l0;->m5(Lax/d3/l0;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    :goto_3d
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
