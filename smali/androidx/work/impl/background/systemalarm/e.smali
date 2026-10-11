.class public Landroidx/work/impl/background/systemalarm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/C2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/background/systemalarm/e$c;,
        Landroidx/work/impl/background/systemalarm/e$b;,
        Landroidx/work/impl/background/systemalarm/e$d;
    }
.end annotation


# static fields
.field static final k:Ljava/lang/String;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lax/N2/c;

.field private final c:Lax/L2/E;

.field private final d:Lax/C2/r;

.field private final e:Lax/C2/D;

.field final f:Landroidx/work/impl/background/systemalarm/b;

.field final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field h:Landroid/content/Intent;

.field private i:Landroidx/work/impl/background/systemalarm/e$c;

.field private j:Lax/C2/w;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "SystemAlarmDispatcher"

    .line 2
    .line 3
    invoke-static {v0}, Lax/B2/i;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/work/impl/background/systemalarm/e;->k:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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
.end method

.method constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0}, Landroidx/work/impl/background/systemalarm/e;-><init>(Landroid/content/Context;Lax/C2/r;Lax/C2/D;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lax/C2/r;Lax/C2/D;)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->a:Landroid/content/Context;

    .line 4
    new-instance v1, Lax/C2/w;

    invoke-direct {v1}, Lax/C2/w;-><init>()V

    iput-object v1, p0, Landroidx/work/impl/background/systemalarm/e;->j:Lax/C2/w;

    .line 5
    new-instance v1, Landroidx/work/impl/background/systemalarm/b;

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->j:Lax/C2/w;

    invoke-direct {v1, v0, v2}, Landroidx/work/impl/background/systemalarm/b;-><init>(Landroid/content/Context;Lax/C2/w;)V

    iput-object v1, p0, Landroidx/work/impl/background/systemalarm/e;->f:Landroidx/work/impl/background/systemalarm/b;

    if-eqz p3, :cond_1c

    goto :goto_20

    .line 6
    :cond_1c
    invoke-static {p1}, Lax/C2/D;->j(Landroid/content/Context;)Lax/C2/D;

    move-result-object p3

    :goto_20
    iput-object p3, p0, Landroidx/work/impl/background/systemalarm/e;->e:Lax/C2/D;

    .line 7
    new-instance p1, Lax/L2/E;

    invoke-virtual {p3}, Lax/C2/D;->h()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->k()Lax/B2/p;

    move-result-object v0

    invoke-direct {p1, v0}, Lax/L2/E;-><init>(Lax/B2/p;)V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/e;->c:Lax/L2/E;

    if-eqz p2, :cond_34

    goto :goto_38

    .line 8
    :cond_34
    invoke-virtual {p3}, Lax/C2/D;->l()Lax/C2/r;

    move-result-object p2

    :goto_38
    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/e;->d:Lax/C2/r;

    .line 9
    invoke-virtual {p3}, Lax/C2/D;->p()Lax/N2/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/e;->b:Lax/N2/c;

    .line 10
    invoke-virtual {p2, p0}, Lax/C2/r;->g(Lax/C2/e;)V

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/e;->h:Landroid/content/Intent;

    return-void
.end method

.method private b()V
    .registers 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_f

    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "Needs to be invoked on the main thread."

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
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
.end method

.method private i(Ljava/lang/String;)Z
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/e;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_6
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_27

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/content/Intent;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_c

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    monitor-exit v0

    .line 37
    return p1

    .line 38
    :catchall_25
    move-exception p1

    .line 39
    goto :goto_2a

    .line 40
    :cond_27
    const/4 p1, 0x0

    .line 41
    monitor-exit v0

    .line 42
    return p1

    .line 43
    :goto_2a
    monitor-exit v0
    :try_end_2b
    .catchall {:try_start_6 .. :try_end_2b} :catchall_25

    .line 44
    throw p1
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
.end method

.method private k()V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/e;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "ProcessCommand"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lax/L2/y;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_b
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/e;->e:Lax/C2/D;

    .line 16
    .line 17
    invoke-virtual {v1}, Lax/C2/D;->p()Lax/N2/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Landroidx/work/impl/background/systemalarm/e$a;

    .line 22
    .line 23
    invoke-direct {v2, p0}, Landroidx/work/impl/background/systemalarm/e$a;-><init>(Landroidx/work/impl/background/systemalarm/e;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v2}, Lax/N2/c;->c(Ljava/lang/Runnable;)V
    :try_end_1c
    .catchall {:try_start_b .. :try_end_1c} :catchall_20

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_20
    move-exception v1

    .line 34
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 35
    .line 36
    .line 37
    throw v1
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
.end method


# virtual methods
.method public a(Landroid/content/Intent;I)Z
    .registers 7

    .line 1
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/work/impl/background/systemalarm/e;->k:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "Adding command "

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v3, " ("

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, ")"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/e;->b()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    if-eqz v2, :cond_3f

    .line 53
    .line 54
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "Unknown command. Ignoring"

    .line 59
    .line 60
    invoke-virtual {p1, v1, p2}, Lax/B2/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v3

    .line 64
    :cond_3f
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_50

    .line 71
    .line 72
    const-string v0, "ACTION_CONSTRAINTS_CHANGED"

    .line 73
    .line 74
    invoke-direct {p0, v0}, Landroidx/work/impl/background/systemalarm/e;->i(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_50

    .line 79
    .line 80
    return v3

    .line 81
    :cond_50
    const-string v0, "KEY_START_ID"

    .line 82
    .line 83
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 87
    .line 88
    monitor-enter p2

    .line 89
    :try_start_58
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    const/4 v1, 0x1

    .line 96
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    if-eqz v0, :cond_6c

    .line 102
    .line 103
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/e;->k()V

    .line 104
    .line 105
    .line 106
    goto :goto_6c

    .line 107
    :catchall_6a
    move-exception p1

    .line 108
    goto :goto_6e

    .line 109
    :cond_6c
    :goto_6c
    monitor-exit p2

    .line 110
    return v1

    .line 111
    :goto_6e
    monitor-exit p2
    :try_end_6f
    .catchall {:try_start_58 .. :try_end_6f} :catchall_6a

    .line 112
    throw p1
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method c()V
    .registers 6

    .line 1
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/work/impl/background/systemalarm/e;->k:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "Checking if commands are complete."

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/e;->b()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_11
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->h:Landroid/content/Intent;

    .line 19
    .line 20
    if-eqz v2, :cond_4e

    .line 21
    .line 22
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "Removing command "

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v4, p0, Landroidx/work/impl/background/systemalarm/e;->h:Landroid/content/Intent;

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v1, v3}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Landroid/content/Intent;

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/e;->h:Landroid/content/Intent;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_46

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    iput-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->h:Landroid/content/Intent;

    .line 67
    .line 68
    goto :goto_4e

    .line 69
    :catchall_44
    move-exception v1

    .line 70
    goto :goto_88

    .line 71
    :cond_46
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "Dequeue-d command is not the first."

    .line 74
    .line 75
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :cond_4e
    :goto_4e
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->b:Lax/N2/c;

    .line 80
    .line 81
    invoke-interface {v2}, Lax/N2/c;->b()Lax/N2/a;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/e;->f:Landroidx/work/impl/background/systemalarm/b;

    .line 86
    .line 87
    invoke-virtual {v3}, Landroidx/work/impl/background/systemalarm/b;->p()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_7b

    .line 92
    .line 93
    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_7b

    .line 100
    .line 101
    invoke-interface {v2}, Lax/N2/a;->u()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_7b

    .line 106
    .line 107
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v3, "No more commands & intents."

    .line 112
    .line 113
    invoke-virtual {v2, v1, v3}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/e;->i:Landroidx/work/impl/background/systemalarm/e$c;

    .line 117
    .line 118
    if-eqz v1, :cond_86

    .line 119
    .line 120
    invoke-interface {v1}, Landroidx/work/impl/background/systemalarm/e$c;->a()V

    .line 121
    .line 122
    .line 123
    goto :goto_86

    .line 124
    :cond_7b
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/e;->g:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_86

    .line 131
    .line 132
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/e;->k()V

    .line 133
    .line 134
    .line 135
    :cond_86
    :goto_86
    monitor-exit v0

    .line 136
    return-void

    .line 137
    :goto_88
    monitor-exit v0
    :try_end_89
    .catchall {:try_start_11 .. :try_end_89} :catchall_44

    .line 138
    throw v1
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method d()Lax/C2/r;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->d:Lax/C2/r;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public e(Lax/K2/m;Z)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->b:Lax/N2/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/N2/c;->a()Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroidx/work/impl/background/systemalarm/e$b;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/e;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v2, p1, p2}, Landroidx/work/impl/background/systemalarm/b;->c(Landroid/content/Context;Lax/K2/m;Z)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {v1, p0, p1, p2}, Landroidx/work/impl/background/systemalarm/e$b;-><init>(Landroidx/work/impl/background/systemalarm/e;Landroid/content/Intent;I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
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

.method f()Lax/N2/c;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->b:Lax/N2/c;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method g()Lax/C2/D;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->e:Lax/C2/D;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method h()Lax/L2/E;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->c:Lax/L2/E;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method j()V
    .registers 4

    .line 1
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/work/impl/background/systemalarm/e;->k:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "Destroying SystemAlarmDispatcher"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->d:Lax/C2/r;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lax/C2/r;->l(Lax/C2/e;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->i:Landroidx/work/impl/background/systemalarm/e$c;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method l(Landroidx/work/impl/background/systemalarm/e$c;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/e;->i:Landroidx/work/impl/background/systemalarm/e$c;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Landroidx/work/impl/background/systemalarm/e;->k:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "A completion listener for SystemAlarmDispatcher already exists."

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Lax/B2/i;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/e;->i:Landroidx/work/impl/background/systemalarm/e$c;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method
