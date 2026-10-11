.class Lax/L2/b$b;
.super Lax/L2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/L2/b;->c(Ljava/lang/String;Lax/C2/D;Z)Lax/L2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/C2/D;

.field final synthetic d0:Ljava/lang/String;

.field final synthetic e0:Z


# direct methods
.method constructor <init>(Lax/C2/D;Ljava/lang/String;Z)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/L2/b$b;->c0:Lax/C2/D;

    .line 2
    .line 3
    iput-object p2, p0, Lax/L2/b$b;->d0:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, Lax/L2/b$b;->e0:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lax/L2/b;-><init>()V

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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method g()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/L2/b$b;->c0:Lax/C2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/C2/D;->o()Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/k2/u;->e()V

    .line 8
    .line 9
    .line 10
    :try_start_9
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()Lax/K2/w;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lax/L2/b$b;->d0:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v1, v2}, Lax/K2/w;->l(Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2b

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v3, p0, Lax/L2/b$b;->c0:Lax/C2/D;

    .line 37
    .line 38
    invoke-virtual {p0, v3, v2}, Lax/L2/b;->a(Lax/C2/D;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_17

    .line 42
    :catchall_29
    move-exception v1

    .line 43
    goto :goto_3b

    .line 44
    :cond_2b
    invoke-virtual {v0}, Lax/k2/u;->A()V
    :try_end_2e
    .catchall {:try_start_9 .. :try_end_2e} :catchall_29

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lax/k2/u;->i()V

    .line 48
    .line 49
    .line 50
    iget-boolean v0, p0, Lax/L2/b$b;->e0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_3a

    .line 53
    .line 54
    iget-object v0, p0, Lax/L2/b$b;->c0:Lax/C2/D;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lax/L2/b;->f(Lax/C2/D;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return-void

    .line 60
    :goto_3b
    invoke-virtual {v0}, Lax/k2/u;->i()V

    .line 61
    .line 62
    .line 63
    throw v1
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
