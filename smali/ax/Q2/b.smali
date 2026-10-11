.class public Lax/Q2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Q2/b$d;
    }
.end annotation


# static fields
.field static e:Z

.field static f:Lax/Q2/b;

.field static final g:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/g3/g;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/Q2/b;->g:Ljava/lang/Object;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/Q2/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/Q2/b;->c:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 24
    .line 25
    return-void
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
.end method

.method static synthetic a(Lax/Q2/b;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic b(Lax/Q2/b;Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/Q2/b;->q(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic c(Lax/Q2/b;)Ljava/util/concurrent/atomic/AtomicInteger;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/Q2/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic d(Lax/Q2/b;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/Q2/b;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method public static f(Landroid/content/Context;Z)V
    .registers 5

    .line 1
    invoke-static {}, Lax/Q2/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_71

    .line 6
    .line 7
    invoke-static {p0}, Lcom/voxdon/xplorer/ApplicationReporter;->init(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    if-eqz p0, :cond_5c

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_13

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    :goto_14
    if-eqz v0, :cond_25

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {p0}, Lax/Q2/b;->k(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lax/Q2/b;->o()V

    .line 35
    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    const-string v1, "none"

    .line 39
    .line 40
    :goto_27
    if-eqz p1, :cond_71

    .line 41
    .line 42
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "!!Application onCreate was not called"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v2, "getApplicationContext:"

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, ", className:"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_5c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const-string p1, "!Check application null context"

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 112
    .line 113
    .line 114
    :cond_71
    return-void
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

.method public static h()Lax/Q2/b;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/b;->f:Lax/Q2/b;

    .line 2
    .line 3
    if-nez v0, :cond_19

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Lcom/voxdon/xplorer/ApplicationReporter;->init(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "ApplicationHolder not initialized"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 24
    .line 25
    .line 26
    :cond_19
    sget-object v0, Lax/Q2/b;->f:Lax/Q2/b;

    .line 27
    .line 28
    return-object v0
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

.method public static i()Z
    .registers 1

    .line 1
    sget-boolean v0, Lax/Q2/b;->e:Z

    .line 2
    .line 3
    return v0
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

.method private j(Landroid/content/Context;)V
    .registers 3

    .line 1
    :try_start_0
    invoke-static {}, Lax/J5/h;->o()Lax/J5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/J5/h;->g(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    :goto_d
    iput-boolean v0, p0, Lax/Q2/b;->d:Z

    .line 15
    .line 16
    if-eqz v0, :cond_14

    .line 17
    .line 18
    invoke-static {p1}, Lax/x7/f;->q(Landroid/content/Context;)Lax/x7/f;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_14} :catch_14

    .line 19
    .line 20
    .line 21
    :catch_14
    :cond_14
    return-void
    .line 22
.end method

.method public static k(Landroid/content/Context;)V
    .registers 3

    .line 1
    sget-object v0, Lax/Q2/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-object v1, Lax/Q2/b;->f:Lax/Q2/b;

    .line 5
    .line 6
    if-nez v1, :cond_17

    .line 7
    .line 8
    invoke-static {p0}, Lcom/voxdon/xplorer/ApplicationReporter;->init(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lax/Q2/b;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lax/Q2/b;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lax/Q2/b;->f:Lax/Q2/b;

    .line 17
    .line 18
    invoke-direct {v1}, Lax/Q2/b;->l()V

    .line 19
    .line 20
    .line 21
    goto :goto_17

    .line 22
    :catchall_15
    move-exception p0

    .line 23
    goto :goto_19

    .line 24
    :cond_17
    :goto_17
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_19
    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_3 .. :try_end_1a} :catchall_15

    .line 27
    throw p0
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
.end method

.method private l()V
    .registers 5

    .line 1
    invoke-static {}, Lax/Q2/g;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/Q2/b;->j(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0}, Lax/Q2/d;->a(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {v0}, Lax/n/f;->J(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Lax/u3/g;->b(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v1}, Lax/f3/a;->d(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v1}, Lax/t3/k;->t(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lax/u3/s;->a()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lax/t3/c;->n()Lax/t3/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 41
    .line 42
    iget-boolean v3, p0, Lax/Q2/b;->d:Z

    .line 43
    .line 44
    invoke-virtual {v1, v2, v3}, Lax/t3/c;->t(Landroid/content/Context;Z)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {v1}, Lax/t3/j;->i(Landroid/content/Context;)I

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lax/n/f;->N(I)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 56
    .line 57
    invoke-static {v0}, Lax/Z2/j;->d0(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {v0}, Lcom/alphainventor/filemanager/shizuku/c;->z(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lax/Z2/g;->h()Lax/Z2/g;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lax/Z2/g;->i(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v1, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lax/Q2/a;->j(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lax/Q2/b;->a:Landroid/content/Context;

    .line 84
    .line 85
    check-cast v0, Landroid/app/Application;

    .line 86
    .line 87
    invoke-direct {p0, v0}, Lax/Q2/b;->p(Landroid/app/Application;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Landroid/os/Handler;

    .line 91
    .line 92
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lax/Q2/b$a;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lax/Q2/b$a;-><init>(Lax/Q2/b;)V

    .line 98
    .line 99
    .line 100
    const-wide/16 v2, 0x3e8

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 103
    .line 104
    .line 105
    return-void
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
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

.method public static n()Z
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-object v1, Lax/Q2/b;->f:Lax/Q2/b;

    .line 5
    .line 6
    if-eqz v1, :cond_9

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v1, 0x0

    .line 11
    :goto_a
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_c
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_c

    .line 15
    throw v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static o()V
    .registers 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lax/Q2/b;->e:Z

    .line 3
    .line 4
    return-void
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

.method private p(Landroid/app/Application;)V
    .registers 3

    .line 1
    new-instance v0, Lax/Q2/b$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/Q2/b$b;-><init>(Lax/Q2/b;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 7
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
    .line 22
.end method

.method private q(Landroid/content/Context;)V
    .registers 5

    .line 1
    new-instance v0, Lax/Q2/b$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/Q2/b$c;-><init>(Lax/Q2/b;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/content/IntentFilter;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "android.intent.action.PACKAGE_ADDED"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "android.intent.action.PACKAGE_CHANGED"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "android.intent.action.PACKAGE_REMOVED"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "package"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :try_start_1e
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_21
    .catch Ljava/lang/SecurityException; {:try_start_1e .. :try_end_21} :catch_22

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_22
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method


# virtual methods
.method public e(Lax/g3/g;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q2/b;->c:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/Q2/b;->c:Ljava/util/List;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/Q2/b;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public g()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q2/b;->a:Landroid/content/Context;

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

.method public m()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q2/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public r(Lax/g3/g;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q2/b;->c:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    :cond_7
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
.end method
