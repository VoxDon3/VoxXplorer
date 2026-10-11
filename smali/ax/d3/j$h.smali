.class Lax/d3/j$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/u3/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/j;->E5()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/j;


# direct methods
.method constructor <init>(Lax/d3/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/j$h;->a:Lax/d3/j;

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
.method public a()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/j$h;->a:Lax/d3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_32

    .line 9
    .line 10
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "USAGE STAT MON 2"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/d3/j$h;->a:Lax/d3/j;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0, v1, v1}, Lax/c3/u;->E(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lax/d3/j$h;->a:Lax/d3/j;

    .line 42
    .line 43
    invoke-virtual {v1}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_32
    iget-object v0, p0, Lax/d3/j$h;->a:Lax/d3/j;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0, v1, v1}, Lax/c3/u;->E(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, Lax/d3/j$h;->a:Lax/d3/j;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->F2(Landroid/content/Intent;)V

    .line 64
    .line 65
    .line 66
    return-void
    .line 67
    .line 68
.end method
