.class Landroidx/work/impl/foreground/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/foreground/a;->j(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Landroidx/work/impl/foreground/a;

.field final synthetic q:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/work/impl/foreground/a;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/foreground/a$a;->c0:Landroidx/work/impl/foreground/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/foreground/a$a;->q:Ljava/lang/String;

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
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/work/impl/foreground/a$a;->c0:Landroidx/work/impl/foreground/a;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/impl/foreground/a;->a(Landroidx/work/impl/foreground/a;)Lax/C2/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/C2/D;->l()Lax/C2/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Landroidx/work/impl/foreground/a$a;->q:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/C2/r;->h(Ljava/lang/String;)Lax/K2/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_3d

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/K2/v;->f()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3d

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/work/impl/foreground/a$a;->c0:Landroidx/work/impl/foreground/a;

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/work/impl/foreground/a;->d:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_1d
    iget-object v2, p0, Landroidx/work/impl/foreground/a$a;->c0:Landroidx/work/impl/foreground/a;

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/work/impl/foreground/a;->g:Ljava/util/Map;

    .line 33
    .line 34
    invoke-static {v0}, Lax/K2/y;->a(Lax/K2/v;)Lax/K2/m;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Landroidx/work/impl/foreground/a$a;->c0:Landroidx/work/impl/foreground/a;

    .line 42
    .line 43
    iget-object v2, v2, Landroidx/work/impl/foreground/a;->h:Ljava/util/Set;

    .line 44
    .line 45
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/work/impl/foreground/a$a;->c0:Landroidx/work/impl/foreground/a;

    .line 49
    .line 50
    iget-object v2, v0, Landroidx/work/impl/foreground/a;->i:Lax/G2/d;

    .line 51
    .line 52
    iget-object v0, v0, Landroidx/work/impl/foreground/a;->h:Ljava/util/Set;

    .line 53
    .line 54
    invoke-interface {v2, v0}, Lax/G2/d;->b(Ljava/lang/Iterable;)V

    .line 55
    .line 56
    .line 57
    monitor-exit v1

    .line 58
    return-void

    .line 59
    :catchall_3a
    move-exception v0

    .line 60
    monitor-exit v1
    :try_end_3c
    .catchall {:try_start_1d .. :try_end_3c} :catchall_3a

    .line 61
    throw v0

    .line 62
    :cond_3d
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
